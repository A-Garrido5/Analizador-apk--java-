// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;

abstract class ModernAsyncTask
{
    public static final Executor THREAD_POOL_EXECUTOR;
    private static volatile Executor sDefaultExecutor;
    private static final ModernAsyncTask$InternalHandler sHandler;
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private final FutureTask mFuture;
    private volatile ModernAsyncTask$Status mStatus;
    private final AtomicBoolean mTaskInvoked;
    private final ModernAsyncTask$WorkerRunnable mWorker;
    
    static {
        sThreadFactory = new ModernAsyncTask$1();
        sPoolWorkQueue = new LinkedBlockingQueue(10);
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, ModernAsyncTask.sPoolWorkQueue, ModernAsyncTask.sThreadFactory);
        sHandler = new ModernAsyncTask$InternalHandler(null);
        ModernAsyncTask.sDefaultExecutor = ModernAsyncTask.THREAD_POOL_EXECUTOR;
    }
    
    public ModernAsyncTask() {
        this.mStatus = ModernAsyncTask$Status.PENDING;
        this.mTaskInvoked = new AtomicBoolean();
        this.mWorker = new ModernAsyncTask$2(this);
        this.mFuture = new ModernAsyncTask$3(this, this.mWorker);
    }
    
    static AtomicBoolean access$200(final ModernAsyncTask modernAsyncTask) {
        return modernAsyncTask.mTaskInvoked;
    }
    
    static Object access$300(final ModernAsyncTask modernAsyncTask, final Object o) {
        return modernAsyncTask.postResult(o);
    }
    
    static void access$400(final ModernAsyncTask modernAsyncTask, final Object o) {
        modernAsyncTask.postResultIfNotInvoked(o);
    }
    
    static void access$500(final ModernAsyncTask modernAsyncTask, final Object o) {
        modernAsyncTask.finish(o);
    }
    
    private void finish(final Object o) {
        Label_0023: {
            if (this.isCancelled()) {
                this.onCancelled(o);
                if (!ContextCompat.a) {
                    break Label_0023;
                }
            }
            this.onPostExecute(o);
        }
        this.mStatus = ModernAsyncTask$Status.FINISHED;
    }
    
    private Object postResult(final Object o) {
        ModernAsyncTask.sHandler.obtainMessage(1, (Object)new ModernAsyncTask$AsyncTaskResult(this, new Object[] { o })).sendToTarget();
        return o;
    }
    
    private void postResultIfNotInvoked(final Object o) {
        if (!this.mTaskInvoked.get()) {
            this.postResult(o);
        }
    }
    
    protected abstract Object doInBackground(final Object[] p0);
    
    public final boolean isCancelled() {
        return this.mFuture.isCancelled();
    }
    
    protected void onCancelled() {
    }
    
    protected void onCancelled(final Object o) {
        this.onCancelled();
    }
    
    protected void onPostExecute(final Object o) {
    }
    
    protected void onProgressUpdate(final Object[] array) {
    }
}
