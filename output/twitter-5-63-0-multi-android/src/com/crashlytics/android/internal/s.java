// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

final class s implements Runnable
{
    private /* synthetic */ n a;
    
    s(final n a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            final t a = this.a.a;
            this.a.a = new h();
            a.b();
        }
        catch (Exception ex) {
            bd.d("Crashlytics failed to disable analytics.");
        }
    }
}
