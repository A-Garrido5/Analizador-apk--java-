// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.u;
import android.content.ServiceConnection;
import android.content.Intent;
import com.twitter.internal.android.service.AsyncService;
import com.twitter.internal.android.service.a;
import com.twitter.internal.android.service.c;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.internal.android.service.v;

public class as
{
    private static as a;
    private final at b;
    private final ah c;
    private final v d;
    private final Context e;
    
    as(final Context context) {
        this.e = context.getApplicationContext();
        this.c = new ah(this.e);
        this.b = new at();
        this.d = new v(this.e);
    }
    
    public static as a(final Context context) {
        synchronized (as.class) {
            if (as.a == null) {
                as.a = new as(context);
            }
            return as.a;
        }
    }
    
    private void b(final y y, final z z) {
        y.a(this.c);
        if (z != null) {
            y.a(z);
        }
        y.a(this.b);
    }
    
    public String a(final a a) {
        final v d = this.d;
        if (!d.a()) {
            this.e.bindService(new Intent(this.e, (Class)AsyncService.class), (ServiceConnection)d, 1);
        }
        return d.a(a);
    }
    
    public String a(final y y) {
        this.b(y, null);
        return this.a((a)y);
    }
    
    public String a(final y y, final z z) {
        if (y == null) {
            throw new IllegalArgumentException("Request cannot be null");
        }
        this.b(y, z);
        return this.a((a)y);
    }
    
    public void a() {
        this.d.a(false);
    }
    
    public void a(final u u) {
        this.d.a(u);
    }
    
    public void a(final y y, final x x) {
        y.a(this.b);
        y.c(x);
        y.o();
    }
    
    public void a(final z z) {
        this.b.a(z);
    }
    
    public boolean a(final y y, final int n, final int n2, final au au) {
        if (y == null) {
            throw new IllegalArgumentException("Request cannot be null");
        }
        av av;
        if (au != null) {
            av = new av(n, au);
        }
        else {
            av = null;
        }
        y.h(n2);
        this.b(y, av);
        this.a((a)y);
        return true;
    }
    
    public boolean a(final String s) {
        return this.d.a(s);
    }
    
    public void b(final z z) {
        this.b.b(z);
    }
}
