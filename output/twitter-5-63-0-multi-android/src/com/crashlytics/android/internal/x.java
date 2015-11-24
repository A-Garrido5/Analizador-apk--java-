// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

final class x implements Runnable
{
    private final j a;
    private final t b;
    
    public x(final j a, final t b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            bd.c("Performing time based analytics file roll over.");
            if (!this.a.a()) {
                this.b.c();
            }
        }
        catch (Exception ex) {
            bd.d("Crashlytics failed to roll over session analytics file");
        }
    }
}
