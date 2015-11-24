// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import java.util.concurrent.CountDownLatch;
import android.support.v4.util.TimeUtils;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.SystemClock;
import android.content.Context;
import android.os.Handler;

public abstract class AsyncTaskLoader extends Loader
{
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile AsyncTaskLoader$LoadTask mCancellingTask;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile AsyncTaskLoader$LoadTask mTask;
    long mUpdateThrottle;
    
    public AsyncTaskLoader(final Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }
    
    public boolean cancelLoad() {
        if (this.mTask != null) {
            if (this.mCancellingTask != null) {
                if (this.mTask.waiting) {
                    this.mTask.waiting = false;
                    this.mHandler.removeCallbacks((Runnable)this.mTask);
                }
                this.mTask = null;
            }
            else {
                if (this.mTask.waiting) {
                    this.mTask.waiting = false;
                    this.mHandler.removeCallbacks((Runnable)this.mTask);
                    this.mTask = null;
                    return false;
                }
                final boolean cancel = this.mTask.cancel(false);
                if (cancel) {
                    this.mCancellingTask = this.mTask;
                }
                this.mTask = null;
                return cancel;
            }
        }
        return false;
    }
    
    void dispatchOnCancelled(final AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask, final Object o) {
        this.onCanceled(o);
        if (this.mCancellingTask == asyncTaskLoader$LoadTask) {
            this.rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            this.executePendingTask();
        }
    }
    
    void dispatchOnLoadComplete(final AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask, final Object o) {
        if (this.mTask != asyncTaskLoader$LoadTask) {
            this.dispatchOnCancelled(asyncTaskLoader$LoadTask, o);
            return;
        }
        if (this.isAbandoned()) {
            this.onCanceled(o);
            return;
        }
        this.commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        this.deliverResult(o);
    }
    
    @Override
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        if (this.mTask != null) {
            printWriter.print(s);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.waiting);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(s);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.waiting);
        }
        if (this.mUpdateThrottle != 0L) {
            printWriter.print(s);
            printWriter.print("mUpdateThrottle=");
            TimeUtils.formatDuration(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            TimeUtils.formatDuration(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
    
    void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.waiting) {
                this.mTask.waiting = false;
                this.mHandler.removeCallbacks((Runnable)this.mTask);
            }
            if (this.mUpdateThrottle <= 0L || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                this.mTask.executeOnExecutor(ModernAsyncTask.THREAD_POOL_EXECUTOR, (Object[])null);
                return;
            }
            this.mTask.waiting = true;
            this.mHandler.postAtTime((Runnable)this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }
    
    public abstract Object loadInBackground();
    
    public void onCanceled(final Object o) {
    }
    
    @Override
    protected void onForceLoad() {
        super.onForceLoad();
        this.cancelLoad();
        this.mTask = new AsyncTaskLoader$LoadTask(this);
        this.executePendingTask();
    }
    
    protected Object onLoadInBackground() {
        return this.loadInBackground();
    }
    
    public void setUpdateThrottle(final long mUpdateThrottle) {
        this.mUpdateThrottle = mUpdateThrottle;
        if (mUpdateThrottle != 0L) {
            this.mHandler = new Handler();
        }
    }
    
    public void waitForLoader() {
        final AsyncTaskLoader$LoadTask mTask = this.mTask;
        if (mTask == null) {
            return;
        }
        try {
            mTask.done.await();
        }
        catch (InterruptedException ex) {}
    }
}
