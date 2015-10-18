// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network.forecaster;

import com.twitter.util.units.Unit;
import com.twitter.util.units.bitrate.KilobitsPerSecond;
import com.twitter.util.units.data.Data;
import com.twitter.util.platform.l;
import com.twitter.util.n;
import com.twitter.util.platform.TwRadioType;
import com.twitter.internal.network.r;
import com.twitter.internal.network.e;
import com.twitter.util.platform.i;
import com.twitter.library.client.y;
import com.twitter.util.units.duration.Minutes;
import com.twitter.util.units.duration.Duration;
import com.twitter.util.units.duration.Milliseconds;
import com.twitter.util.units.data.Kibibytes;
import com.twitter.util.m;

class c extends m
{
    private static final Kibibytes a;
    private static final Kibibytes b;
    private static final Milliseconds c;
    private static final Duration d;
    private NetworkQuality e;
    private ys f;
    private ys g;
    private yu h;
    private boolean i;
    private boolean j;
    
    static {
        a = new Kibibytes(20.0);
        b = new Kibibytes(1.0);
        c = new Milliseconds(300.0);
        d = new Minutes(4.5);
    }
    
    c() {
        this(y.a(), com.twitter.util.platform.i.a(), com.twitter.internal.network.e.a(), r.a());
    }
    
    c(final m m, final m i, final e e, final r r) {
        this.e = NetworkQuality.e;
        this.f = new ys(10);
        this.g = new ys(10);
        this.h = new yu(10);
        this.i = true;
        this.j = true;
        this.a(TwRadioType.b);
        this.j = r.b();
        m.a(new d(this, m));
        i.a(new com.twitter.library.network.forecaster.e(this));
        e.a(new f(this));
        r.a(new g(this));
    }
    
    private void a(final NetworkQuality e) {
        synchronized (this) {
            if (e != this.e) {
                this.a(new h(this.e, e));
                this.e = e;
            }
        }
    }
    
    private void a(final TwRadioType twRadioType) {
        synchronized (this) {
            KilobitsPerSecond kilobitsPerSecond;
            if (this.d()) {
                kilobitsPerSecond = com.twitter.library.network.forecaster.i.b(twRadioType);
            }
            else {
                kilobitsPerSecond = KilobitsPerSecond.a;
            }
            KilobitsPerSecond kilobitsPerSecond2;
            if (this.d()) {
                kilobitsPerSecond2 = com.twitter.library.network.forecaster.i.a(twRadioType);
            }
            else {
                kilobitsPerSecond2 = KilobitsPerSecond.a;
            }
            this.f = new ys(com.twitter.library.network.forecaster.c.b, kilobitsPerSecond);
            this.g = new ys(com.twitter.library.network.forecaster.c.b, kilobitsPerSecond2);
            this.h = new yu(com.twitter.library.network.forecaster.c.c);
        }
    }
    
    private void a(final l l) {
        synchronized (this) {
            this.i = (l.a() != TwRadioType.a);
            this.a(l.a());
            this.a(this.a());
        }
    }
    
    private void a(final Data data, final Duration duration, final ys ys) {
        int n = 1;
        synchronized (this) {
            int n2;
            if (data.a(com.twitter.library.network.forecaster.c.a) <= 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (duration.a(Milliseconds.a) > 0) {
                n = 0;
            }
            if (n2 == 0 && n == 0) {
                ys.a(new Kibibytes(data), new KilobitsPerSecond(data, duration));
                this.a(this.a());
            }
        }
    }
    
    private void a(final Duration duration) {
        synchronized (this) {
            int n;
            if (duration.a(Milliseconds.a) <= 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                this.h.add(new Milliseconds(duration));
            }
        }
    }
    
    private void a(final boolean j) {
        synchronized (this) {
            this.j = j;
            this.a(this.a());
        }
    }
    
    private boolean d() {
        return this.i && this.j;
    }
    
    public NetworkQuality a() {
        synchronized (this) {
            return NetworkQuality.a(NetworkQuality.a(this.d(), this.c(), this.e), NetworkQuality.b(this.d(), this.b(), this.e));
        }
    }
    
    public KilobitsPerSecond b() {
        synchronized (this) {
            return new KilobitsPerSecond(this.g.c());
        }
    }
    
    public KilobitsPerSecond c() {
        synchronized (this) {
            return new KilobitsPerSecond(this.f.c());
        }
    }
}
