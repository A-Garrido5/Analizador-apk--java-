// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import com.twitter.library.av.model.b;
import com.twitter.library.provider.Tweet;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import java.util.Set;
import java.util.List;
import java.util.Map;
import com.twitter.library.service.z;

public class f extends z
{
    private static f a;
    private final t b;
    private final Map c;
    private final List d;
    private final Map e;
    private final Set f;
    private final com.twitter.library.av.c g;
    private final Context h;
    private final s i;
    
    f(final Context context) {
        this(context, new ConcurrentHashMap(), new ConcurrentHashMap(), new HashSet(), new i(null), new s());
    }
    
    f(final Context context, final Map map, final Map map2, final Set set, final com.twitter.library.av.c c, final s s) {
        this(context, map, map2, set, new v(), c, s);
    }
    
    f(final Context context, final Map c, final Map e, final Set f, final v v, final com.twitter.library.av.c g, final s i) {
        this.d = new LinkedList();
        this.c = c;
        this.e = e;
        this.f = f;
        this.b = v.a(context, a(this, c, e), g);
        this.g = g;
        this.h = context.getApplicationContext();
        this.i = i;
    }
    
    public static f a(final Context context) {
        synchronized (f.class) {
            if (f.a == null) {
                f.a = new f(context);
            }
            return f.a;
        }
    }
    
    protected static u a(final f f, final Map map, final Map map2) {
        return new g(map2, map, f);
    }
    
    public String a(final Tweet tweet) {
        final mc b = this.b(tweet);
        if (b != null) {
            return b.a;
        }
        return null;
    }
    
    public List a() {
        return this.b.a();
    }
    
    public void a(final Tweet tweet, final b b) {
        if (tweet.M()) {
            if (b != null) {
                this.i.a(tweet, b, this, com.twitter.library.av.model.c.a(b), this.h, this.g, this.b);
            }
            this.c.clear();
            final Iterator<WeakReference<h>> iterator = this.d.iterator();
            while (iterator.hasNext()) {
                final h h = iterator.next().get();
                if (h != null) {
                    h.aA_();
                }
            }
            synchronized (this) {
                this.b.a(new ArrayList(this.f));
            }
        }
    }
    
    public void a(final List list) {
        synchronized (this) {
            if (list.size() > 0) {
                this.f.clear();
                this.f.addAll(list);
                this.b.a(new ArrayList(this.f));
            }
        }
    }
    
    void a(final Map map, final long n, final mc mc) {
        final Iterator<WeakReference<h>> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            final h h = iterator.next().get();
            if (h != null) {
                h.a(n, mc);
            }
        }
    }
    
    public boolean a(final h h) {
        final Iterator<WeakReference<h>> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            if (h == iterator.next().get()) {
                return false;
            }
        }
        this.d.add(new WeakReference<h>(h));
        return true;
    }
    
    public mc b(final Tweet tweet) {
        final long d = tweet.D;
        mc mc = this.e.get(d);
        if (mc == null) {
            mc = this.c.get(d);
        }
        return mc;
    }
    
    public boolean b(final h h) {
        final Iterator<WeakReference<h>> iterator = (Iterator<WeakReference<h>>)this.d.iterator();
        while (iterator.hasNext()) {
            if (h == iterator.next().get()) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
