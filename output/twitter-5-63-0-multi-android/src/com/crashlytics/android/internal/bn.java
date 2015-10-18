// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

final class bn extends bc
{
    private /* synthetic */ String a;
    private /* synthetic */ ExecutorService b;
    private /* synthetic */ long c;
    private /* synthetic */ TimeUnit d;
    
    bn(final String a, final ExecutorService b, final long c, final TimeUnit d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        try {
            cl.a().b().a("Crashlytics", "Executing shutdown hook for " + this.a);
            this.b.shutdown();
            if (!this.b.awaitTermination(this.c, this.d)) {
                cl.a().b().a("Crashlytics", this.a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.b.shutdownNow();
            }
        }
        catch (InterruptedException ex) {
            cl.a().b().a("Crashlytics", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.a));
            this.b.shutdownNow();
        }
    }
}
