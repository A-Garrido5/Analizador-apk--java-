// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.util.Iterator;
import com.crashlytics.android.internal.bw;
import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.cl;
import java.util.Map;
import com.crashlytics.android.internal.ax;
import com.crashlytics.android.internal.bu;
import com.crashlytics.android.internal.y;

final class aa extends y implements z
{
    public aa(final String s, final String s2, final bu bu) {
        super(s, s2, bu, ax.b);
    }
    
    @Override
    public final boolean a(final com.crashlytics.android.y y) {
        final bw a = this.b().a("X-CRASHLYTICS-API-KEY", y.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", com.crashlytics.android.d.a().f());
        final Iterator iterator = y.b.e().entrySet().iterator();
        bw a2 = a;
        while (iterator.hasNext()) {
            a2 = a2.a((Map.Entry)iterator.next());
        }
        final ad b = y.b;
        final bw b2 = a2.a("report[file]", b.b(), "application/octet-stream", b.d()).b("report[identifier]", b.c());
        cl.a().b().a("Crashlytics", "Sending report to: " + this.a());
        final int b3 = b2.b();
        cl.a().b().a("Crashlytics", "Create report request ID: " + b2.a("X-REQUEST-ID"));
        cl.a().b().a("Crashlytics", "Result was: " + b3);
        return cj.a(b3) == 0;
    }
}
