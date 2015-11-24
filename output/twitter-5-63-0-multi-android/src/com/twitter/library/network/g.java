// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import java.io.UnsupportedEncodingException;
import org.apache.http.entity.StringEntity;
import java.util.List;
import com.twitter.internal.network.i;
import java.net.URISyntaxException;
import com.twitter.internal.network.HttpOperation;
import android.util.Log;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import com.twitter.library.client.ad;
import com.twitter.library.util.bn;
import com.twitter.library.client.App;
import com.twitter.internal.network.d;
import com.twitter.internal.network.j;
import org.apache.http.HttpEntity;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.net.URI;
import android.content.Context;
import com.twitter.internal.network.h;
import java.util.Map;

public final class g
{
    public static final boolean a;
    private static Map b;
    private static h c;
    private static boolean d;
    private static Class e;
    private static boolean f;
    private final Context g;
    private URI h;
    private HttpOperation$RequestMethod i;
    private boolean j;
    private boolean k;
    private HttpEntity l;
    private j m;
    private a n;
    private d o;
    private com.twitter.internal.android.service.d p;
    private int q;
    private boolean r;
    
    static {
        a = App.l();
        g.b = null;
        g.d = false;
        g.f = false;
    }
    
    public g(final Context context, final CharSequence charSequence) {
        this(context, bn.a(charSequence.toString()));
    }
    
    public g(final Context context, final URI h) {
        boolean j = true;
        this.i = HttpOperation$RequestMethod.a;
        this.k = j;
        this.l = null;
        this.m = null;
        this.n = null;
        this.r = j;
        this.g = context.getApplicationContext();
        this.h = h;
        if (com.twitter.library.network.g.d) {
            if (ad.a().b()) {
                j = false;
            }
            this.j = j;
            return;
        }
        this.j = false;
    }
    
    private static Object a(final String s, final Context context, final Class clazz, final Object o) {
        try {
            final Class e = e();
            Object invoke = null;
            if (e != null) {
                invoke = e.getMethod(s, Context.class, clazz).invoke(null, context, o);
            }
            return invoke;
        }
        catch (NoSuchMethodException ex) {}
        catch (IllegalAccessException ex2) {
            goto Label_0059;
        }
        catch (InvocationTargetException ex2) {
            goto Label_0059;
        }
    }
    
    public static String a(final Context context, final boolean b) {
        if (!App.a()) {
            final boolean b2 = App.b();
            final String s = null;
            if (!b2) {
                return s;
            }
        }
        return (String)a("exportSnapshot", context, Boolean.class, b);
    }
    
    private static URI a(final URI uri) {
        final String a = App.o().a();
        if (TextUtils.isEmpty((CharSequence)a) || com.twitter.library.featureswitch.d.f("android_disable_flavor_appid")) {
            return uri;
        }
        final StringBuilder sb = new StringBuilder(uri.toString());
        ae.a(sb, "application_id", a);
        return bn.a(sb.toString());
    }
    
    public static void a(final h c) {
        synchronized (g.class) {
            b(g.c);
            g.c = c;
            if (g.a) {
                String name = null;
                if (c != null) {
                    name = c.getClass().getName();
                }
                Log.d("HttpOperation", "Default HttpOperationClientFactory set to " + name);
            }
        }
    }
    
    static void a(final String s, final String s2) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            throw new IllegalArgumentException(s2);
        }
    }
    
    public static void a(final Map b) {
        g.b = b;
    }
    
    private URI b(URI a) {
        if (com.twitter.library.network.g.b != null) {
            final String s = com.twitter.library.network.g.b.get(a.getHost());
            if (s != null) {
                a = bn.a(a, s);
            }
        }
        return a;
    }
    
    private static void b(final h h) {
        // monitorenter(g.class)
        if (h == null) {
            return;
        }
        try {
            new com.twitter.library.network.h(h).execute((Object[])new Void[0]);
        }
        finally {
        }
        // monitorexit(g.class)
    }
    
    public static void b(final boolean d) {
        synchronized (g.class) {
            g.d = d;
        }
    }
    
    public static boolean b() {
        return App.f() && e() != null;
    }
    
    public static boolean c() {
        synchronized (g.class) {
            return g.d;
        }
    }
    
    private HttpOperation d() {
        final h g = g();
        if (this.h()) {
            this.h = a(this.h);
        }
        try {
            this.h = this.b(this.h);
            final HttpOperation a = g.a(this.i, this.h).a(this.i, this.h, this.m);
            if (this.q > 0) {
                a.a(this.q);
            }
            return a;
        }
        catch (URISyntaxException ex) {
            if (com.twitter.library.network.g.a) {
                Log.d("HttpOperation", "[" + this.h + "] Failed to rewrite host", (Throwable)ex);
            }
            return g.a(this.i, this.h, this.m).a(ex);
        }
    }
    
    private static Class e() {
        // monitorenter("km")
        try {
            Label_0045: {
                if (g.f) {
                    break Label_0045;
                }
                try {
                    final Class<?> forName = Class.forName("km");
                    forName.getConstructor(com.twitter.internal.android.service.d.class);
                    g.e = forName;
                    g.f = true;
                    return g.e;
                }
                catch (NoSuchMethodException ex) {
                    g.f = true;
                }
                catch (ClassNotFoundException ex2) {}
                finally {
                    g.f = true;
                }
            }
        }
        finally {}
    }
    
    private d f() {
        try {
            final Class e = e();
            if (e != null) {
                return e.getConstructor(com.twitter.internal.android.service.d.class).newInstance(this.p);
            }
            goto Label_0069;
        }
        catch (NoSuchMethodException ex) {}
        catch (InstantiationException ex2) {
            goto Label_0058;
        }
        catch (InvocationTargetException ex3) {
            goto Label_0058;
        }
        catch (IllegalAccessException ex4) {
            goto Label_0058;
        }
    }
    
    private static h g() {
        synchronized (g.class) {
            if (g.c == null) {
                throw new IllegalStateException("A default HttpOperationClientFactory must be set before building a HttpOperation");
            }
        }
        // monitorexit(g.class)
        return g.c;
    }
    
    private boolean h() {
        return this.n != null;
    }
    
    public HttpOperation a() {
        final HttpOperation d = this.d();
        if (this.k) {
            final ae a = ae.a(this.g);
            if (this.j) {
                a.c(d);
            }
            else {
                a.b(d);
            }
        }
        if (this.l != null) {
            if (!this.i.a()) {
                throw new IllegalArgumentException("The RequestMethod " + this.i + " does not allow a request entity.");
            }
            d.a(this.l);
        }
        if (com.twitter.library.network.g.a) {
            d.a(new i());
        }
        if (this.h()) {
            d.a(new x(this.n));
        }
        if (b()) {
            final d f = this.f();
            if (f != null) {
                d.a(f);
                d.a(this.r);
            }
        }
        if (this.o != null) {
            d.a(this.o);
            return d;
        }
        d.a(new f(this.g));
        return d;
    }
    
    public g a(final int q) {
        this.q = q;
        return this;
    }
    
    public g a(final long n) {
        this.o = new f(this.g, n);
        return this;
    }
    
    public g a(final com.twitter.internal.android.service.d p) {
        this.p = p;
        return this;
    }
    
    public g a(final HttpOperation$RequestMethod i) {
        this.i = i;
        return this;
    }
    
    public g a(final j m) {
        this.m = m;
        return this;
    }
    
    public g a(final a n) {
        this.n = n;
        return this;
    }
    
    public g a(final String s) {
        if (App.a()) {
            a(s, "Cannot force polling without a reason");
        }
        this.j = true;
        return this;
    }
    
    public g a(final List list) {
        if (list == null || list.isEmpty()) {
            return this;
        }
        try {
            final String a = bn.a(list);
            if (a != null) {
                this.l = (HttpEntity)new StringEntity(a, "UTF-8");
                ((StringEntity)this.l).setContentType("application/x-www-form-urlencoded");
            }
            return this;
        }
        catch (UnsupportedEncodingException ex) {
            return this;
        }
    }
    
    public g a(final HttpEntity l) {
        this.l = l;
        return this;
    }
    
    public g a(final boolean r) {
        this.r = r;
        return this;
    }
    
    public g b(final a n) {
        if (n != null && n.a() != null) {
            this.n = n;
        }
        return this;
    }
    
    public g b(final String s) {
        if (App.a()) {
            a(s, "Cannot force non-polling without a reason");
        }
        this.j = false;
        return this;
    }
    
    public g c(final boolean k) {
        this.k = k;
        return this;
    }
}
