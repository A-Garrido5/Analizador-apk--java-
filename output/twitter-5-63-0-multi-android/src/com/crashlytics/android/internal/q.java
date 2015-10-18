// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

final class q implements Runnable
{
    private /* synthetic */ ak a;
    private /* synthetic */ String b;
    private /* synthetic */ n c;
    
    q(final n c, final ak a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            this.c.a.a(this.a, this.b);
        }
        catch (Exception ex) {
            bd.d("Crashlytics failed to set analytics settings data.");
        }
    }
}
