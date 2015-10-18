// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.cl;

final class j implements Runnable
{
    private /* synthetic */ Runnable a;
    
    j(final bc bc, final Runnable a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            this.a.run();
        }
        catch (Exception ex) {
            cl.a().b().a("Crashlytics", "Failed to execute task.", ex);
        }
    }
}
