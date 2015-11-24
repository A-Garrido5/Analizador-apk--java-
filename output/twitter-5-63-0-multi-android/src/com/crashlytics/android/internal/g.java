// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.Iterator;
import java.io.File;
import java.util.List;

final class g extends y implements m
{
    public g(final String s, final String s2, final bu bu) {
        super(s, s2, bu, ax.b);
    }
    
    @Override
    public final boolean a(final String s, final List list) {
        final bw a = this.b().a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", cl.a().f()).a("X-CRASHLYTICS-API-KEY", s);
        final Iterator<File> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final File file = iterator.next();
            bd.c("Adding analytics session file " + file.getName() + " to multipart POST");
            a.a("session_analytics_file_" + n, file.getName(), "application/vnd.crashlytics.android.events", file);
            ++n;
        }
        bd.c("Sending " + list.size() + " analytics files to " + this.a());
        final int b = a.b();
        bd.c("Response code for analytics file send is " + b);
        final int a2 = cj.a(b);
        boolean b2 = false;
        if (a2 == 0) {
            b2 = true;
        }
        return b2;
    }
}
