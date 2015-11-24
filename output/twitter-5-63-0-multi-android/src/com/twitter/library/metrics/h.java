// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import com.twitter.library.client.af;
import com.twitter.library.client.ad;
import com.twitter.library.scribe.ScribeService;
import com.twitter.util.n;
import com.twitter.library.network.f;
import com.twitter.library.client.az;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.an;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import com.twitter.library.client.ay;
import java.util.List;
import java.util.HashSet;

public class h
{
    public static ih a;
    public static final HashSet b;
    private static final List c;
    private static h d;
    private boolean e;
    private final ay f;
    
    static {
        (b = new HashSet()).add("api:foreground:::rxbytes");
        h.b.add("api:background:::rxbytes");
        h.b.add("api::scribe::size");
        h.b.add("api::::txbytes");
        h.b.add("api::::rxbytes");
        h.b.addAll(com.twitter.library.metrics.b.b);
        (c = new ArrayList()).add("api:foreground:::rxbytes");
        h.c.add("api:background:::rxbytes");
        h.c.add("api::::txbytes");
        h.c.add("api::::rxbytes");
        h.c.addAll(com.twitter.library.metrics.b.a);
    }
    
    private h(final Context context) {
        this.f = new i(this);
        ir.a(context);
        final ir b = ir.b();
        if (an.b()) {
            b.b(true);
        }
        b.a(new m(context));
    }
    
    public static h a(final Context context) {
        Label_0029: {
            if (h.d != null) {
                break Label_0029;
            }
            synchronized (h.class) {
                if (h.d == null) {
                    h.d = new h(context);
                }
                return h.d;
            }
        }
    }
    
    public static je a(final Context context, String string, final im im, final in in, final boolean b, final int n) {
        if (com.twitter.library.featureswitch.d.f("home_timeline_scroll_framerate_enabled")) {
            if (!je.f()) {
                string = "sampling:" + string;
            }
            return je.b(string, im, ir.b(), b, n);
        }
        return new jf(context, string, im, in, n);
    }
    
    private void d() {
        final iq a = io.a();
        io.a(new iq(a.a, com.twitter.library.featureswitch.d.a("perftown_low_priority_sampling_rate", a.b), com.twitter.library.featureswitch.d.a("perftown_high_priority_sampling_rate", a.c), com.twitter.library.featureswitch.d.a("metrics_periodic_reporting_interval_short", a.d), com.twitter.library.featureswitch.d.a("metrics_periodic_reporting_interval_regular", a.e), com.twitter.library.featureswitch.d.a("metrics_periodic_reporting_interval_long", a.f)));
    }
    
    public void a() {
        while (true) {
            while (true) {
                final g a5;
                final g a6;
                synchronized (this) {
                    if (this.e) {
                        return;
                    }
                    this.e = true;
                    // monitorexit(this)
                    final ir b = ir.b();
                    final az a = az.a(b.f());
                    final long g = a.b().g();
                    final ic a2 = ic.a("api:background:::rxbytes", b, g, ih.n, 3);
                    a2.i();
                    final ic a3 = ic.a("api:foreground:::rxbytes", b, g, ih.n, 3);
                    a3.i();
                    final a a4 = com.twitter.library.metrics.a.a(b, ih.n, 3);
                    a4.i();
                    com.twitter.library.network.f.a(a2, a3, a4);
                    final b b2 = new b(b, g);
                    b2.a();
                    com.twitter.internal.network.b.a().a(b2);
                    a5 = com.twitter.library.metrics.g.a("api::::txbytes", b, ih.n, 3, true);
                    a5.b(g);
                    a6 = com.twitter.library.metrics.g.a("api::::rxbytes", b, ih.n, 3, false);
                    a6.b(g);
                    if (a5.f()) {
                        a5.i();
                        a6.i();
                        a.a(this.f);
                        final ic a7 = ic.a("api::scribe::size", b, 0L, ih.n, 3);
                        a7.i();
                        ScribeService.a(a7);
                        ix.a("fs:first_download_req", b, ih.m).i();
                        com.twitter.library.metrics.f.a(b);
                        ad.a().a(new j(this, b));
                        return;
                    }
                }
                a5.k();
                a6.k();
                continue;
            }
        }
    }
    
    public void b() {
        this.d();
        com.twitter.library.featureswitch.d.a(new k(this));
    }
}
