// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;

public abstract class LoaderManager
{
    public static void enableDebugLogging(final boolean debug) {
        LoaderManagerImpl.DEBUG = debug;
    }
    
    public abstract void destroyLoader(final int p0);
    
    public abstract Loader getLoader(final int p0);
    
    public abstract Loader initLoader(final int p0, final Bundle p1, final LoaderManager$LoaderCallbacks p2);
    
    public abstract Loader restartLoader(final int p0, final Bundle p1, final LoaderManager$LoaderCallbacks p2);
}
