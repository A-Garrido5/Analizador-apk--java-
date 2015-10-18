// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.ci;
import com.crashlytics.android.internal.cj;
import java.io.File;
import java.util.LinkedList;
import com.crashlytics.android.internal.cl;
import java.util.List;
import java.util.Collections;
import java.io.FilenameFilter;
import java.util.Map;

final class af
{
    static final Map a;
    private static final FilenameFilter b;
    private static final short[] c;
    private final Object d;
    private final z e;
    private Thread f;
    
    static {
        b = new ag();
        a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
        c = new short[] { 10, 20, 30, 60, 120, 300 };
    }
    
    public af(final z e) {
        this.d = new Object();
        if (e == null) {
            throw new IllegalArgumentException("createReportCall must not be null.");
        }
        this.e = e;
    }
    
    final List a() {
        cl.a().b().a("Crashlytics", "Checking for crash reports...");
        final LinkedList<ad> list;
        synchronized (this.d) {
            final File[] listFiles = cl.a().i().listFiles(af.b);
            // monitorexit(this.d)
            list = new LinkedList<ad>();
            for (final File file : listFiles) {
                cl.a().b().a("Crashlytics", "Found crash report " + file.getPath());
                list.add(new ad(file));
            }
        }
        if (list.size() == 0) {
            cl.a().b().a("Crashlytics", "No reports found.");
        }
        return list;
    }
    
    public final void a(final float n) {
        synchronized (this) {
            if (this.f == null) {
                (this.f = new Thread(new ah(this, n), "Crashlytics Report Uploader")).start();
            }
        }
    }
    
    final boolean a(final ad ad) {
        synchronized (this.d) {
            try {
                final boolean a = this.e.a(new y(cj.a(cl.a().w(), cl.a().g()), ad));
                final ci b = cl.a().b();
                final StringBuilder sb = new StringBuilder("Crashlytics report upload ");
                String s;
                if (a) {
                    s = "complete: ";
                }
                else {
                    s = "FAILED: ";
                }
                b.b("Crashlytics", sb.append(s).append(ad.b()).toString());
                boolean b2 = false;
                if (a) {
                    ad.a();
                    b2 = true;
                }
                return b2;
            }
            catch (Exception ex) {
                cl.a().b().a("Crashlytics", "Error occurred sending report " + ad, ex);
                return false;
            }
        }
    }
}
