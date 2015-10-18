// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.os.Bundle;
import android.content.Intent;
import com.twitter.library.util.bk;
import com.twitter.util.d;
import android.app.Activity;
import com.twitter.android.ac;
import java.util.ArrayList;
import java.util.List;

public class ad
{
    private static volatile ad a;
    private final List b;
    private volatile int c;
    private volatile long d;
    private volatile long e;
    private volatile long f;
    private long g;
    private long h;
    private boolean i;
    private Boolean j;
    
    private ad() {
        this.b = new ArrayList();
        this.j = null;
    }
    
    public static ad a() {
        Label_0041: {
            if (ad.a != null) {
                break Label_0041;
            }
            synchronized (ad.class) {
                if (ad.a == null) {
                    ad.a = new ad();
                    p.a().a(new ae());
                }
                return ad.a;
            }
        }
    }
    
    public void a(final Activity activity) {
        int i = 0;
        com.twitter.util.d.a();
        if (this.c == 0) {
            ++this.c;
            if (!this.i) {
                this.h = bk.a();
                synchronized (this) {
                    // monitorexit(this)
                    for (af[] array = this.b.toArray(new af[this.b.size()]); i < array.length; ++i) {
                        array[i].b(activity);
                    }
                    return;
                }
            }
            this.i = false;
            return;
        }
        ++this.c;
    }
    
    public void a(final Activity activity, final Intent intent) {
        this.e = bk.a();
    }
    
    public void a(final Activity activity, final Bundle bundle) {
        this.d = bk.a();
    }
    
    public void a(final af af) {
        synchronized (this) {
            if (!this.b.contains(af)) {
                this.b.add(af);
            }
        }
    }
    
    public void b(final Activity activity) {
        com.twitter.util.d.a();
        --this.c;
        if (this.c == 0) {
            if (activity.isChangingConfigurations()) {
                this.i = true;
                return;
            }
            synchronized (this) {
                final af[] array = this.b.toArray(new af[this.b.size()]);
                // monitorexit(this)
                for (int length = array.length, i = 0; i < length; ++i) {
                    array[i].a(activity);
                }
            }
            this.g += bk.a() - this.h;
            this.h = 0L;
        }
    }
    
    public boolean b() {
        final long a = bk.a();
        return this.c() || a - this.d <= 100L || a - this.e <= 100L || a - this.f <= 100L;
    }
    
    public boolean b(final af af) {
        synchronized (this) {
            return this.b.remove(af);
        }
    }
    
    public boolean c() {
        if (yw.a() && this.j != null) {
            return this.j;
        }
        return this.c > 0 || this.i;
    }
    
    public long d() {
        if (this.h != 0L) {
            return this.g + bk.a() - this.h;
        }
        return this.g;
    }
}
