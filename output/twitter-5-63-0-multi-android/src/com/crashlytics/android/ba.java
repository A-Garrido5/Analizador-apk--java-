// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.at;
import com.crashlytics.android.internal.cj;
import java.util.Collections;
import java.util.Map;
import com.crashlytics.android.internal.bg;
import android.app.Activity;
import com.crashlytics.android.internal.bh;
import com.crashlytics.android.internal.af;
import com.crashlytics.android.internal.c;
import com.crashlytics.android.internal.ci;
import com.crashlytics.android.internal.a;
import com.crashlytics.android.internal.ai;
import com.crashlytics.android.internal.bd;
import com.crashlytics.android.internal.bo;
import java.util.concurrent.ConcurrentHashMap;
import com.crashlytics.android.internal.bu;
import android.content.ContextWrapper;
import com.crashlytics.android.internal.ck;
import com.crashlytics.android.internal.cl;
import java.util.concurrent.CountDownLatch;
import android.content.Context;
import com.crashlytics.android.internal.bc;

final class ba extends bc
{
    private /* synthetic */ Context a;
    private /* synthetic */ float b;
    private /* synthetic */ CountDownLatch c;
    private /* synthetic */ d d;
    
    ba(final d d, final Context a, final float b, final CountDownLatch c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        try {
            if (this.d.b(this.a, this.b)) {
                this.d.d.e();
            }
        }
        catch (Exception ex) {
            cl.a().b().a("Crashlytics", "Problem encountered during Crashlytics initialization.", ex);
        }
        finally {
            this.c.countDown();
        }
    }
}
