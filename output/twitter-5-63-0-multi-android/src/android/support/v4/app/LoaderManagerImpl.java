// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.support.v4.util.DebugUtils;
import android.support.v4.content.Loader;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.Log;
import android.os.Bundle;
import android.support.v4.util.SparseArrayCompat;

class LoaderManagerImpl extends LoaderManager
{
    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    FragmentActivity mActivity;
    boolean mCreatingLoader;
    final SparseArrayCompat mInactiveLoaders;
    final SparseArrayCompat mLoaders;
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final String mWho;
    
    static {
        LoaderManagerImpl.DEBUG = false;
    }
    
    LoaderManagerImpl(final String mWho, final FragmentActivity mActivity, final boolean mStarted) {
        this.mLoaders = new SparseArrayCompat();
        this.mInactiveLoaders = new SparseArrayCompat();
        this.mWho = mWho;
        this.mActivity = mActivity;
        this.mStarted = mStarted;
    }
    
    private LoaderManagerImpl$LoaderInfo createAndInstallLoader(final int n, final Bundle bundle, final LoaderManager$LoaderCallbacks loaderManager$LoaderCallbacks) {
        try {
            this.mCreatingLoader = true;
            final LoaderManagerImpl$LoaderInfo loader = this.createLoader(n, bundle, loaderManager$LoaderCallbacks);
            this.installLoader(loader);
            return loader;
        }
        finally {
            this.mCreatingLoader = false;
        }
    }
    
    private LoaderManagerImpl$LoaderInfo createLoader(final int n, final Bundle bundle, final LoaderManager$LoaderCallbacks loaderManager$LoaderCallbacks) {
        final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo = new LoaderManagerImpl$LoaderInfo(this, n, bundle, loaderManager$LoaderCallbacks);
        loaderManagerImpl$LoaderInfo.mLoader = loaderManager$LoaderCallbacks.onCreateLoader(n, bundle);
        return loaderManagerImpl$LoaderInfo;
    }
    
    @Override
    public void destroyLoader(final int n) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + n);
        }
        final int indexOfKey = this.mLoaders.indexOfKey(n);
        if (indexOfKey >= 0) {
            final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo = (LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(indexOfKey);
            this.mLoaders.removeAt(indexOfKey);
            loaderManagerImpl$LoaderInfo.destroy();
        }
        final int indexOfKey2 = this.mInactiveLoaders.indexOfKey(n);
        if (indexOfKey2 >= 0) {
            final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo2 = (LoaderManagerImpl$LoaderInfo)this.mInactiveLoaders.valueAt(indexOfKey2);
            this.mInactiveLoaders.removeAt(indexOfKey2);
            loaderManagerImpl$LoaderInfo2.destroy();
        }
        if (this.mActivity != null && !this.hasRunningLoaders()) {
            this.mActivity.mFragments.startPendingDeferredFragments();
        }
    }
    
    void doDestroy() {
        if (!this.mRetaining) {
            if (LoaderManagerImpl.DEBUG) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int i = -1 + this.mLoaders.size(); i >= 0; --i) {
                ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).destroy();
            }
            this.mLoaders.clear();
        }
        if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int j = -1 + this.mInactiveLoaders.size(); j >= 0; --j) {
            ((LoaderManagerImpl$LoaderInfo)this.mInactiveLoaders.valueAt(j)).destroy();
        }
        this.mInactiveLoaders.clear();
    }
    
    void doReportNextStart() {
        for (int i = -1 + this.mLoaders.size(); i >= 0; --i) {
            ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).mReportNextStart = true;
        }
    }
    
    void doReportStart() {
        for (int i = -1 + this.mLoaders.size(); i >= 0; --i) {
            ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).reportStart();
        }
    }
    
    void doRetain() {
        if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.mStarted) {
            final RuntimeException ex = new RuntimeException("here");
            ex.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, (Throwable)ex);
        }
        else {
            this.mRetaining = true;
            this.mStarted = false;
            for (int i = -1 + this.mLoaders.size(); i >= 0; --i) {
                ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).retain();
            }
        }
    }
    
    void doStart() {
        if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.mStarted) {
            final RuntimeException ex = new RuntimeException("here");
            ex.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, (Throwable)ex);
        }
        else {
            this.mStarted = true;
            for (int i = -1 + this.mLoaders.size(); i >= 0; --i) {
                ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).start();
            }
        }
    }
    
    void doStop() {
        if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.mStarted) {
            final RuntimeException ex = new RuntimeException("here");
            ex.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, (Throwable)ex);
            return;
        }
        for (int i = -1 + this.mLoaders.size(); i >= 0; --i) {
            ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).stop();
        }
        this.mStarted = false;
    }
    
    @Override
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        int i = 0;
        if (this.mLoaders.size() > 0) {
            printWriter.print(s);
            printWriter.println("Active Loaders:");
            final String string = s + "    ";
            for (int j = 0; j < this.mLoaders.size(); ++j) {
                final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo = (LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(j);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(this.mLoaders.keyAt(j));
                printWriter.print(": ");
                printWriter.println(loaderManagerImpl$LoaderInfo.toString());
                loaderManagerImpl$LoaderInfo.dump(string, fileDescriptor, printWriter, array);
            }
        }
        if (this.mInactiveLoaders.size() > 0) {
            printWriter.print(s);
            printWriter.println("Inactive Loaders:");
            final String string2 = s + "    ";
            while (i < this.mInactiveLoaders.size()) {
                final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo2 = (LoaderManagerImpl$LoaderInfo)this.mInactiveLoaders.valueAt(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(this.mInactiveLoaders.keyAt(i));
                printWriter.print(": ");
                printWriter.println(loaderManagerImpl$LoaderInfo2.toString());
                loaderManagerImpl$LoaderInfo2.dump(string2, fileDescriptor, printWriter, array);
                ++i;
            }
        }
    }
    
    void finishRetain() {
        if (this.mRetaining) {
            if (LoaderManagerImpl.DEBUG) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.mRetaining = false;
            for (int i = -1 + this.mLoaders.size(); i >= 0; --i) {
                ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).finishRetain();
            }
        }
    }
    
    @Override
    public Loader getLoader(final int n) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo = (LoaderManagerImpl$LoaderInfo)this.mLoaders.get(n);
        if (loaderManagerImpl$LoaderInfo == null) {
            return null;
        }
        if (loaderManagerImpl$LoaderInfo.mPendingLoader != null) {
            return loaderManagerImpl$LoaderInfo.mPendingLoader.mLoader;
        }
        return loaderManagerImpl$LoaderInfo.mLoader;
    }
    
    @Override
    public boolean hasRunningLoaders() {
        final int size = this.mLoaders.size();
        int i = 0;
        boolean b = false;
        while (i < size) {
            final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo = (LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i);
            b |= (loaderManagerImpl$LoaderInfo.mStarted && !loaderManagerImpl$LoaderInfo.mDeliveredData);
            ++i;
        }
        return b;
    }
    
    @Override
    public Loader initLoader(final int n, final Bundle bundle, final LoaderManager$LoaderCallbacks mCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderManagerImpl$LoaderInfo andInstallLoader = (LoaderManagerImpl$LoaderInfo)this.mLoaders.get(n);
        if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (andInstallLoader == null) {
            andInstallLoader = this.createAndInstallLoader(n, bundle, mCallbacks);
            if (LoaderManagerImpl.DEBUG) {
                Log.v("LoaderManager", "  Created new loader " + andInstallLoader);
            }
        }
        else {
            if (LoaderManagerImpl.DEBUG) {
                Log.v("LoaderManager", "  Re-using existing loader " + andInstallLoader);
            }
            andInstallLoader.mCallbacks = mCallbacks;
        }
        if (andInstallLoader.mHaveData && this.mStarted) {
            andInstallLoader.callOnLoadFinished(andInstallLoader.mLoader, andInstallLoader.mData);
        }
        return andInstallLoader.mLoader;
    }
    
    void installLoader(final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo) {
        this.mLoaders.put(loaderManagerImpl$LoaderInfo.mId, loaderManagerImpl$LoaderInfo);
        if (this.mStarted) {
            loaderManagerImpl$LoaderInfo.start();
        }
    }
    
    @Override
    public Loader restartLoader(final int n, final Bundle bundle, final LoaderManager$LoaderCallbacks loaderManager$LoaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo = (LoaderManagerImpl$LoaderInfo)this.mLoaders.get(n);
        if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "restartLoader in " + this + ": args=" + bundle);
        }
        if (loaderManagerImpl$LoaderInfo != null) {
            final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo2 = (LoaderManagerImpl$LoaderInfo)this.mInactiveLoaders.get(n);
            if (loaderManagerImpl$LoaderInfo2 != null) {
                if (loaderManagerImpl$LoaderInfo.mHaveData) {
                    if (LoaderManagerImpl.DEBUG) {
                        Log.v("LoaderManager", "  Removing last inactive loader: " + loaderManagerImpl$LoaderInfo);
                    }
                    loaderManagerImpl$LoaderInfo2.mDeliveredData = false;
                    loaderManagerImpl$LoaderInfo2.destroy();
                    loaderManagerImpl$LoaderInfo.mLoader.abandon();
                    this.mInactiveLoaders.put(n, loaderManagerImpl$LoaderInfo);
                }
                else {
                    if (loaderManagerImpl$LoaderInfo.mStarted) {
                        if (loaderManagerImpl$LoaderInfo.mPendingLoader != null) {
                            if (LoaderManagerImpl.DEBUG) {
                                Log.v("LoaderManager", "  Removing pending loader: " + loaderManagerImpl$LoaderInfo.mPendingLoader);
                            }
                            loaderManagerImpl$LoaderInfo.mPendingLoader.destroy();
                            loaderManagerImpl$LoaderInfo.mPendingLoader = null;
                        }
                        if (LoaderManagerImpl.DEBUG) {
                            Log.v("LoaderManager", "  Enqueuing as new pending loader");
                        }
                        loaderManagerImpl$LoaderInfo.mPendingLoader = this.createLoader(n, bundle, loaderManager$LoaderCallbacks);
                        return loaderManagerImpl$LoaderInfo.mPendingLoader.mLoader;
                    }
                    if (LoaderManagerImpl.DEBUG) {
                        Log.v("LoaderManager", "  Current loader is stopped; replacing");
                    }
                    this.mLoaders.put(n, null);
                    loaderManagerImpl$LoaderInfo.destroy();
                }
            }
            else {
                if (LoaderManagerImpl.DEBUG) {
                    Log.v("LoaderManager", "  Making last loader inactive: " + loaderManagerImpl$LoaderInfo);
                }
                loaderManagerImpl$LoaderInfo.mLoader.abandon();
                this.mInactiveLoaders.put(n, loaderManagerImpl$LoaderInfo);
            }
        }
        return this.createAndInstallLoader(n, bundle, loaderManager$LoaderCallbacks).mLoader;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.buildShortClassTag(this.mActivity, sb);
        sb.append("}}");
        return sb.toString();
    }
    
    void updateActivity(final FragmentActivity mActivity) {
        this.mActivity = mActivity;
    }
}
