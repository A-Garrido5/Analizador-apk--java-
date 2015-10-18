// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.HashMap;
import android.os.Looper;
import android.app.Activity;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Map;
import java.util.Collections;

final class o implements Runnable
{
    private /* synthetic */ String a;
    private /* synthetic */ n b;
    
    o(final n b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            this.b.a.a(u.a(this.b.b, this.b.i, this.b.c, this.b.d, this.b.e, this.b.f, this.b.g, this.b.h, W.i, Collections.singletonMap("sessionId", this.a)));
        }
        catch (Exception ex) {
            bd.d("Crashlytics failed to record crash event");
        }
    }
}
