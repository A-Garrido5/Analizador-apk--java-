// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util.error;

import java.util.Iterator;
import java.util.Map;
import com.twitter.errorreporter.b;
import com.twitter.library.featureswitch.n;
import com.crashlytics.android.d;
import java.util.ArrayList;
import com.crashlytics.android.t;
import android.content.Context;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.List;
import com.twitter.errorreporter.c;

public class CrashlyticsErrorLogger implements c
{
    private static final boolean a;
    private final List b;
    private final Thread.UncaughtExceptionHandler c;
    private boolean d;
    private boolean e;
    private int f;
    
    static {
        a = (App.l() && Log.isLoggable("CrashlyticsErrorLogger", 3));
    }
    
    public CrashlyticsErrorLogger(final Context context, final t t) {
        this.b = new ArrayList();
        if (t != null) {
            com.crashlytics.android.d.a(t);
            com.crashlytics.android.d.a(context);
        }
        this.c = Thread.getDefaultUncaughtExceptionHandler();
        com.twitter.library.featureswitch.d.a(new a(this));
    }
    
    private void a(final b b, final boolean b2) {
        final Throwable b3 = b.b();
        for (final Map.Entry<Object, V> entry : b.a().entrySet()) {
            final String string = entry.getKey().toString();
            final String string2 = entry.getValue().toString();
            final String string3 = string + ": " + string2;
            if (b2) {
                com.crashlytics.android.d.a(string, string2);
            }
            else {
                com.crashlytics.android.d.c(string3);
            }
            if (CrashlyticsErrorLogger.a) {
                Log.d("CrashlyticsErrorLogger", string3);
            }
        }
        if (CrashlyticsErrorLogger.a) {
            Log.d("CrashlyticsErrorLogger", Log.getStackTraceString(b3));
        }
    }
    
    @Override
    public void a(final b b) {
        while (true) {
            Label_0064: {
                synchronized (this) {
                    if (this.e) {
                        this.a(b, false);
                        com.crashlytics.android.d.a(b.b());
                    }
                    else if (!this.d) {
                        if (this.b.size() < 100) {
                            break Label_0064;
                        }
                        ++this.f;
                    }
                    return;
                }
            }
            this.b.add(b);
        }
    }
    
    @Override
    public void b(final b b) {
        synchronized (this) {
            this.a(b, true);
            this.c.uncaughtException(Thread.currentThread(), b.b());
        }
    }
}
