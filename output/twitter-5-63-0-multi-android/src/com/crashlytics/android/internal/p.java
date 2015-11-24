// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

final class p implements Runnable
{
    private /* synthetic */ u a;
    private /* synthetic */ boolean b;
    private /* synthetic */ n c;
    
    p(final n c, final u a, final boolean b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            this.c.a.a(this.a);
            if (this.b) {
                this.c.a.d();
            }
        }
        catch (Exception ex) {
            bd.d("Crashlytics failed to record session event.");
        }
    }
}
