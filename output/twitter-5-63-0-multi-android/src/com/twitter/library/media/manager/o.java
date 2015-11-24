// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.util.l;
import android.graphics.Bitmap;
import com.twitter.library.client.az;
import com.twitter.library.featureswitch.d;
import java.util.concurrent.Future;
import android.content.Context;

public class o implements m
{
    private final Context a;
    private final boolean b;
    private j c;
    private al d;
    private Future e;
    private String f;
    private ue g;
    
    public o(final Context a) {
        this.a = a;
        this.b = com.twitter.library.featureswitch.d.f("photo_wait_time_enabled");
    }
    
    private void e() {
        if (this.b && (this.g == null || !this.g.l())) {
            (this.g = new ue()).e("navigate");
            this.g.c(this.f);
            this.g.i();
            this.g.b(az.a(this.a).b().g());
        }
    }
    
    private void f() {
        if (this.g != null) {
            this.g.j();
        }
    }
    
    public j a() {
        return this.c;
    }
    
    public void a(final p p) {
        this.e = null;
        final Bitmap bitmap = (Bitmap)p.c();
        if (this.g != null) {
            this.g.d(p.d().name());
            final ue g = this.g;
            String s;
            if (bitmap != null) {
                s = "success";
            }
            else {
                s = "failure";
            }
            g.e(s);
            if (bitmap != null) {
                this.g.b("width", Integer.toString(bitmap.getWidth()));
                this.g.b("height", Integer.toString(bitmap.getHeight()));
            }
            if (p.a() != null && p.a().file != null) {
                this.g.b("bytes", Long.toString(p.a().file.length()));
            }
        }
        if (this.d != null) {
            this.d.a(p);
            if (bitmap != null) {
                this.f();
            }
        }
    }
    
    public void a(final String f) {
        if (this.g != null) {
            this.g.c(f);
        }
        this.f = f;
    }
    
    public void a(final boolean b) {
        if (this.c != null && !this.b()) {
            if (b) {
                this.e();
            }
            final Future a = q.a(this.a).a(this.c);
            if (a != null && !a.isDone()) {
                this.e = a;
            }
        }
    }
    
    public boolean a(final j c) {
        final j c2 = this.c;
        if (c2 != c) {
            if ((this.c = c) != null) {
                this.d = c.v();
                c.a(this);
            }
            else {
                this.d = null;
            }
            if (!l.a(c2, c)) {
                this.c();
                return true;
            }
        }
        return false;
    }
    
    public boolean b() {
        return this.e != null;
    }
    
    public boolean c() {
        final Future e = this.e;
        boolean b = false;
        if (e != null) {
            this.e.cancel(false);
            this.e = null;
            b = true;
        }
        return b;
    }
    
    public void d() {
        this.f();
    }
}
