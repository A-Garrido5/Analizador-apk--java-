// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

final class r implements Runnable
{
    private /* synthetic */ n a;
    
    r(final n a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            this.a.a.a();
        }
        catch (Exception ex) {
            bd.d("Crashlytics failed to send analytics files.");
        }
    }
}
