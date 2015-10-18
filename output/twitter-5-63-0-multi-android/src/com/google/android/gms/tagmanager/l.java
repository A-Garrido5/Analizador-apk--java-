// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import android.content.ComponentCallbacks;
import android.os.Build$VERSION;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import android.content.Context;

public class l
{
    private static l g;
    private final q a;
    private final Context b;
    private final d c;
    private final ay d;
    private final ConcurrentMap e;
    private final bm f;
    
    l(final Context context, final q a, final d c, final ay d) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.b = context.getApplicationContext();
        this.d = d;
        this.a = a;
        this.e = new ConcurrentHashMap();
        (this.c = c).a(new m(this));
        this.c.a(new be(this.b));
        this.f = new bm();
        this.b();
    }
    
    public static l a(final Context context) {
        Label_0068: {
            synchronized (l.class) {
                if (l.g != null) {
                    break Label_0068;
                }
                if (context == null) {
                    z.a("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
            }
            l.g = new l(context, new n(), new d(new bo(context)), az.b());
        }
        // monitorexit(l.class)
        return l.g;
    }
    
    private void a(final String s) {
        final Iterator iterator = this.e.keySet().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s);
        }
    }
    
    private void b() {
        if (Build$VERSION.SDK_INT >= 14) {
            this.b.registerComponentCallbacks((ComponentCallbacks)new o(this));
        }
    }
    
    public void a() {
        this.d.a();
    }
    
    boolean a(final Uri uri) {
    Label_0060_Outer:
        while (true) {
            while (true) {
                final ce a;
                final String d;
                Label_0138: {
                    synchronized (this) {
                        a = ce.a();
                        if (a.a(uri)) {
                            d = a.d();
                            switch (p.a[a.b().ordinal()]) {
                                case 1: {
                                    for (final bj bj : this.e.keySet()) {
                                        if (bj.d().equals(d)) {
                                            bj.b(null);
                                            bj.c();
                                        }
                                    }
                                    break;
                                }
                                case 2:
                                case 3: {
                                    break Label_0138;
                                }
                            }
                            return true;
                        }
                        return false;
                    }
                }
                for (final bj bj2 : this.e.keySet()) {
                    if (bj2.d().equals(d)) {
                        bj2.b(a.c());
                        bj2.c();
                    }
                    else {
                        if (bj2.e() == null) {
                            continue Label_0060_Outer;
                        }
                        bj2.b(null);
                        bj2.c();
                    }
                }
                continue;
            }
            return false;
        }
    }
    
    boolean a(final bj bj) {
        return this.e.remove(bj) != null;
    }
}
