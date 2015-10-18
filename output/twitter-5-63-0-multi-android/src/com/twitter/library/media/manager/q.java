// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import android.content.res.Configuration;
import java.util.Map;
import java.util.Iterator;
import com.twitter.util.d;
import android.graphics.Bitmap;
import java.io.File;
import java.util.concurrent.Future;
import android.content.res.Resources;
import com.twitter.library.util.ak;
import com.twitter.library.media.model.MediaFile;
import com.twitter.internal.android.util.Size;
import com.twitter.library.util.x;
import com.twitter.library.media.util.m;
import com.twitter.util.g;
import com.twitter.util.c;
import com.twitter.util.t;
import com.twitter.library.util.ReferenceMap;
import android.content.Context;
import android.content.ComponentCallbacks;

public class q implements ComponentCallbacks
{
    private static final Object a;
    private static volatile q b;
    private final Context c;
    private final ReferenceMap d;
    private final a e;
    private final h f;
    private final h g;
    private final ao h;
    private final h i;
    
    static {
        a = new Object();
    }
    
    private q(final Context c) {
        this.d = ReferenceMap.a();
        this.c = c;
        final Size a = t.a(c).a(1.5f);
        final int a2 = com.twitter.util.g.a(com.twitter.util.c.a(c) / 16, 2097152, 16777216);
        final x x = new x(0, m.a);
        this.e = new a(c, "photos", 2, 104857600, 10485760);
        this.f = new h("photo", c, a, a2, x, this.e, null);
        this.d.a("photo", this.f);
        this.g = new h("user", c, Size.a, 0, new x(2097152, m.a), this.e, new a(this.c, "users", 1, 10485760, 2097152));
        this.d.a("user", this.g);
        this.h = new ao("video", c, new x(0, MediaFile.a), new a(c, "videos", 1, 104857600, 52428800));
        this.i = new h("hashflags", c, Size.a, 0, new x(409600, m.a), new a(c, "hashflags", 1, 819200, 819200), null);
        this.d.a("hashflags", this.i);
        this.h();
    }
    
    public static q a() {
        return q.b;
    }
    
    public static q a(final Context context) {
        Label_0034: {
            if (q.b != null) {
                break Label_0034;
            }
            synchronized (q.a) {
                if (q.b == null) {
                    q.b = new q(context.getApplicationContext());
                }
                return q.b;
            }
        }
    }
    
    private void h() {
        final Resources resources = this.c.getResources();
        UserImageRequest.a(resources.getDimensionPixelSize(ky.mini_user_image_size), resources.getDimensionPixelSize(ky.medium_user_image_size), resources.getDimensionPixelSize(ky.user_image_size));
    }
    
    private h i() {
        return this.a("thumbnail", Size.a(this.c.getResources().getDimensionPixelSize(ky.media_thumbnail_size)), 1048576, 2097152);
    }
    
    public h a(final String s) {
        if (s == null || s.equals("photo")) {
            return this.f;
        }
        if (s.equals("user")) {
            return this.g;
        }
        if (s.equals("thumbnail")) {
            synchronized (this.d) {
                h i = (h)this.d.a(s);
                if (i == null) {
                    i = this.i();
                }
                return i;
            }
        }
        while (true) {
            synchronized (this.d) {
                final h f = (h)this.d.a(s);
                if (f != null) {
                    return f;
                }
            }
            return this.f;
        }
    }
    
    public h a(final String s, final Size size, final int n, final int n2) {
        synchronized (this.d) {
            h f = (h)this.d.a(s);
            if (f == null) {
                if (n2 >= 0) {
                    f = new h(s, this.c, size, n, new x(n2, m.a), this.e, null);
                    this.d.a(s, f);
                }
                else {
                    f = this.f;
                }
            }
            return f;
        }
    }
    
    public Future a(final j j) {
        return this.a(j.l()).a(j);
    }
    
    public Future a(final k k) {
        return this.a(k.a());
    }
    
    @Deprecated
    public void a(final j j, final File file) {
        this.g.c(j, file);
    }
    
    public Bitmap b(final j j) {
        return (Bitmap)this.a(j.l()).c(j);
    }
    
    public Bitmap b(final k k) {
        return this.b(k.a());
    }
    
    public h b() {
        return this.f;
    }
    
    public h c() {
        return this.g;
    }
    
    public File c(final j j) {
        com.twitter.util.d.c();
        return this.a(j.l()).b(j);
    }
    
    public File c(final k k) {
        return this.c(k.a());
    }
    
    public h d() {
        return this.i;
    }
    
    public ao e() {
        return this.h;
    }
    
    public void f() {
        final ak a = this.h.a();
        if (a != null) {
            a.a();
        }
        synchronized (this.d) {
            final Iterator<h> iterator = this.d.h().iterator();
            while (iterator.hasNext()) {
                final ak a2 = iterator.next().a();
                if (a2 != null) {
                    a2.a();
                }
            }
        }
    }
    // monitorexit(referenceMap)
    
    public Map g() {
        return this.d.f();
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.h();
    }
    
    public void onLowMemory() {
        this.f();
    }
}
