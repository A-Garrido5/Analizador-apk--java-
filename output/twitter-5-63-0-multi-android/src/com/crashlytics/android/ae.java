// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.cj;
import java.io.InputStream;
import java.io.Closeable;
import android.content.res.Resources$NotFoundException;
import com.crashlytics.android.internal.cl;
import com.crashlytics.android.internal.bd;
import com.crashlytics.android.internal.bw;
import com.crashlytics.android.internal.ax;
import com.crashlytics.android.internal.bu;
import com.crashlytics.android.internal.y;

abstract class ae extends y
{
    public ae(final String s, final String s2, final bu bu, final ax ax) {
        super(s, s2, bu, ax);
    }
    
    private static bw a(final bw bw, final ak ak) {
        final bw b = bw.b("app[identifier]", ak.b).b("app[name]", ak.f).b("app[display_version]", ak.c).b("app[build_version]", ak.d).a("app[source]", ak.g).b("app[minimum_sdk_version]", ak.h).b("app[built_sdk_version]", ak.i);
        if (!bd.e(ak.e)) {
            b.b("app[instance_identifier]", ak.e);
        }
        if (ak.j == null) {
            return b;
        }
        InputStream openRawResource = null;
        try {
            openRawResource = cl.a().w().getResources().openRawResource(ak.j.b);
            b.b("app[icon][hash]", ak.j.a).a("app[icon][data]", "icon.png", "application/octet-stream", openRawResource).a("app[icon][width]", ak.j.c).a("app[icon][height]", ak.j.d);
            return b;
        }
        catch (Resources$NotFoundException ex) {
            cl.a().b().a("Crashlytics", "Failed to find app icon with resource ID: " + ak.j.b, (Throwable)ex);
            return b;
        }
        finally {
            bd.a(openRawResource, "Failed to close app icon InputStream.");
        }
    }
    
    public final boolean a(final ak ak) {
        final bw a = a(this.b().a("X-CRASHLYTICS-API-KEY", ak.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", cl.a().f()), ak);
        cl.a().b().a("Crashlytics", "Sending app info to " + this.a());
        if (ak.j != null) {
            cl.a().b().a("Crashlytics", "App icon hash is " + ak.j.a);
            cl.a().b().a("Crashlytics", "App icon size is " + ak.j.c + "x" + ak.j.d);
        }
        final int b = a.b();
        String s;
        if ("POST".equals(a.d())) {
            s = "Create";
        }
        else {
            s = "Update";
        }
        cl.a().b().a("Crashlytics", s + " app request ID: " + a.a("X-REQUEST-ID"));
        cl.a().b().a("Crashlytics", "Result was " + b);
        return cj.a(b) == 0;
    }
}
