// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.cl;
import java.util.concurrent.Callable;

final class l implements Callable
{
    private /* synthetic */ Callable a;
    
    l(final bc bc, final Callable a) {
        this.a = a;
    }
    
    @Override
    public final Object call() {
        try {
            return this.a.call();
        }
        catch (Exception ex) {
            cl.a().b().a("Crashlytics", "Failed to execute task.", ex);
            return null;
        }
    }
}
