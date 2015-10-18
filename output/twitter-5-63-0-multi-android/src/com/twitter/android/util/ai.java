// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.internal.android.service.a;
import com.twitter.library.client.t;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import android.content.Context;

public class ai implements ah
{
    private long a;
    private long b;
    private long c;
    private int d;
    private long e;
    private String f;
    private boolean g;
    private Context h;
    private az i;
    private final as j;
    
    public ai(final Context context, final int n, final long n2, final String s) {
        this.h = context.getApplicationContext();
        this.i = az.a(this.h);
        this.j = as.a(this.h);
        this.a(n, n2, s);
    }
    
    public static int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 23: {
                return 2;
            }
            case 24: {
                return 3;
            }
            case 25: {
                return 4;
            }
        }
    }
    
    private void b(final long n) {
        if (this.f != null) {
            t.b(this.h, this.f, n);
        }
    }
    
    private void c(final long a) {
        this.b(this.a = a);
        this.j.a(new lx(this.h, this.i.b(this.e), a, this.g, this.d));
    }
    
    private void d() {
        this.c = this.b;
        this.j.a((a)new mb(this.h, this.i.b(this.e), Math.min(this.c, System.currentTimeMillis())));
    }
    
    private long e() {
        if (this.f == null) {
            return 0L;
        }
        return t.a(this.h, this.f);
    }
    
    @Override
    public long a() {
        return this.a;
    }
    
    public void a(final int d, final long e, final String f) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.c = 0L;
        this.g = false;
        if (e > 0L && f != null) {
            final long e2 = this.e();
            long currentTimeMillis = System.currentTimeMillis();
            if (e2 > currentTimeMillis) {
                t.a(this.h, this.f, currentTimeMillis);
            }
            else {
                currentTimeMillis = e2;
            }
            this.a = currentTimeMillis;
            this.b = currentTimeMillis;
        }
    }
    
    @Override
    public void a(final long n) {
        this.b = Math.max(this.b, n);
    }
    
    public void a(final long n, final long c) {
        if (n == this.e) {
            this.c = c;
            if (c > this.a) {
                this.a(c);
                this.c(c);
            }
        }
    }
    
    public void b() {
        this.g = true;
    }
    
    public void c() {
        this.c(this.b);
        if (this.b != this.c) {
            this.d();
        }
    }
}
