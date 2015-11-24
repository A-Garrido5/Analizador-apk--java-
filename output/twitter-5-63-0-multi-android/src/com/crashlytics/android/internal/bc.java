// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.os.Process;

public abstract class bc implements Runnable
{
    protected abstract void a();
    
    @Override
    public final void run() {
        Process.setThreadPriority(10);
        this.a();
    }
}
