// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.internal.network.l;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.network.forecaster.h;
import com.twitter.library.network.forecaster.NetworkQuality;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.u;
import com.twitter.library.featureswitch.d;
import com.twitter.util.platform.k;
import com.twitter.util.platform.p;
import com.twitter.internal.android.service.y;

public abstract class g extends y
{
    private long a;
    protected int b;
    private int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;
    private final p i;
    
    public g(final int n, final int n2, final int n3) {
        this(n, n2, n3, Integer.MAX_VALUE);
    }
    
    public g(final int d, final int e, final int f, final int g) {
        this.b = -1;
        this.a = -1L;
        this.c = 0;
        if (d <= 0 || e <= 0 || f <= 0 || g <= 0) {
            throw new IllegalArgumentException();
        }
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.i = k.f().c();
        this.h = com.twitter.library.featureswitch.d.a("android_disable_offline_retries", false);
    }
    
    protected abstract int a();
    
    @Override
    public boolean a(final u u, final x x) {
        final boolean b = u instanceof s;
        boolean a = false;
        if (b) {
            a = false;
            if (x != null) {
                final h a2 = ((s)u).a;
                final NetworkQuality a3 = a2.a;
                final NetworkQuality a4 = NetworkQuality.a;
                a = false;
                if (a3 == a4) {
                    final NetworkQuality b2 = a2.b;
                    final NetworkQuality a5 = NetworkQuality.a;
                    a = false;
                    if (b2 != a5) {
                        a = this.a((aa)x.b());
                    }
                }
            }
        }
        return a;
    }
    
    @Override
    public final boolean a(final x x) {
        if (this.a((aa)x.b())) {
            if (this.b < 0) {
                this.b = this.d;
                this.a = this.i.b();
            }
            else {
                this.b = Math.min(this.e, this.a());
            }
            final boolean b = this.c < this.g && this.b() > 0L;
            if (b) {
                ++this.c;
            }
            return b;
        }
        return false;
    }
    
    protected boolean a(final aa aa) {
        if (aa != null && !aa.a()) {
            final HttpOperation e = aa.e();
            if (e != null) {
                final l l = e.l();
                if (l != null && l.d) {
                    return true;
                }
            }
        }
        return false;
    }
    
    protected long b() {
        if (this.a > 0L) {
            return this.f - (this.i.b() - this.a);
        }
        return this.f;
    }
    
    @Override
    public final long b(final x x) {
        int n;
        if (this.h && !TelephonyUtil.d()) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            return (int)this.b();
        }
        return this.b;
    }
}
