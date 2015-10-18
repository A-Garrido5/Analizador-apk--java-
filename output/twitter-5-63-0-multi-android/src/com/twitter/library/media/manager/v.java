// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.library.util.UrlNetworkStats;
import android.os.Message;
import com.twitter.util.concurrent.k;
import com.twitter.util.c;
import com.twitter.util.concurrent.ObservablePromise;
import com.twitter.util.concurrent.i;
import com.twitter.internal.android.service.a;
import java.util.concurrent.Future;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import com.twitter.library.util.bn;
import com.twitter.library.util.bk;
import com.twitter.internal.network.l;
import java.util.Iterator;
import com.twitter.util.e;
import java.util.LinkedHashMap;
import java.util.HashMap;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.os.Handler;

public class v extends Handler
{
    private final Context a;
    private final Handler b;
    private final WeakReference c;
    private final AtomicBoolean d;
    private final Map e;
    private final Map f;
    private final Map g;
    
    public v(final Context a, final Looper looper, final t t) {
        super(looper);
        this.b = new Handler(Looper.getMainLooper());
        this.d = new AtomicBoolean();
        this.e = new HashMap(20);
        this.f = new HashMap(20);
        this.g = new LinkedHashMap(20);
        this.a = a;
        this.c = new WeakReference((T)t);
    }
    
    private void a(final ab ab) {
        com.twitter.util.e.a((Thread)t.a);
        final Iterator<af> iterator = ab.a.iterator();
        while (iterator.hasNext()) {
            final r d = iterator.next().d;
            d.j();
            d.f();
        }
    }
    
    private void a(final ab ab, final Object o, final l l) {
        com.twitter.util.e.a((Thread)t.a);
        this.a(ab);
        final t t = (t)this.c.get();
        if (t != null) {
            final Iterator<af> iterator = ab.a.iterator();
            while (iterator.hasNext()) {
                t.a(iterator.next().c);
            }
        }
        this.b.post((Runnable)new aa(this, t, ab, o, l));
    }
    
    private void a(final ab ab, final String s, final l l) {
        com.twitter.util.e.a((Thread)t.a);
        if (l != null && l.a != 0 && !this.g.containsKey(s)) {
            this.g.put(s, new ac(60000L + bk.a(), l));
        }
        this.a(ab, (Object)null, l);
    }
    
    private void a(final ab ab, final String s, final Object o) {
        com.twitter.util.e.a((Thread)t.a);
        Label_0090: {
            if (o != null) {
                final Iterator iterator = ab.a.iterator();
                while (true) {
                    do {
                        final boolean hasNext = iterator.hasNext();
                        final boolean b = false;
                        if (hasNext) {
                            continue;
                        }
                        final t t = (t)this.c.get();
                        if (t != null && b) {
                            t.a(s, o);
                        }
                        break Label_0090;
                    } while (iterator.next().a.s());
                    final boolean b = true;
                    continue;
                }
            }
        }
        this.a(ab, o, null);
    }
    
    private void a(final af af) {
        com.twitter.util.e.a((Thread)t.a);
        final aj a = af.a;
        final String a2 = a.a();
        final ab ab = this.e.remove(a2);
        ab ab2;
        if (ab == null) {
            this.b();
            final t t = (t)this.c.get();
            final r r = new r("fetch_blocking");
            final r r2 = new r("fetch_runtime");
            z z;
            if (t != null && !this.g.containsKey(a2) && a.r() && bn.e(a2)) {
                r.i();
                z = new z(this, this.a, az.a(this.a).b(), a2, a.p(), t.d, a.t(), r, r2, a2);
                as.a(this.a).a(z, (com.twitter.library.service.z)null);
            }
            else {
                z = null;
            }
            ab2 = new ab(z);
        }
        else {
            ab2 = ab;
        }
        ab2.a(af);
        if (ab2.a()) {
            this.e.put(a2, ab2);
            return;
        }
        final ac ac = this.g.get(a2);
        l b = null;
        if (ac != null) {
            b = ac.b;
        }
        this.a(ab2, a2, b);
    }
    
    private void a(final af af, final boolean b) {
        com.twitter.util.e.a((Thread)t.a);
        final aj a = af.a;
        final String n = a.n();
        ab ab = this.f.remove(n);
        if (ab == null) {
            final t t = (t)this.c.get();
            com.twitter.library.media.manager.y y;
            if (t != null) {
                y = new com.twitter.library.media.manager.y(this, t, a, n, b);
                as.a(this.a).a(y);
            }
            else {
                y = null;
            }
            ab = new ab(y);
        }
        ab.a(af);
        if (ab.a()) {
            this.f.put(n, ab);
            return;
        }
        this.a(ab, n, (Object)null);
    }
    
    private void b() {
        com.twitter.util.e.a((Thread)t.a);
        final long a = bk.a();
        final Iterator<Map.Entry<K, ac>> iterator = this.g.entrySet().iterator();
        while (iterator.hasNext() && iterator.next().getValue().a < a) {
            iterator.remove();
        }
    }
    
    private void b(final af af) {
        com.twitter.util.e.a((Thread)t.a);
        final String a = af.a.a();
        final ab ab = this.e.get(a);
        if (ab != null && ab.b(af)) {
            if (!ab.a()) {
                this.e.remove(a);
            }
        }
        else {
            final String n = af.a.n();
            final ab ab2 = this.f.get(n);
            if (ab2 != null && ab2.b(af) && !ab2.a()) {
                this.f.remove(n);
            }
        }
    }
    
    public i a(final aj aj) {
        final t t = (t)this.c.get();
        if (this.d.get() || t == null) {
            return ObservablePromise.b();
        }
        final Object c = t.c(aj);
        if (!aj.o() || c != null || aj.q()) {
            ResourceResponse$ResourceSource resourceResponse$ResourceSource;
            if (c != null) {
                resourceResponse$ResourceSource = ResourceResponse$ResourceSource.b;
            }
            else {
                resourceResponse$ResourceSource = ResourceResponse$ResourceSource.a;
            }
            final ResourceResponse a = t.a(aj, c, resourceResponse$ResourceSource, null);
            final al v = aj.v();
            final ObservablePromise a2 = ObservablePromise.a(a);
            t.a(resourceResponse$ResourceSource);
            if (v != null) {
                if (com.twitter.util.c.a()) {
                    v.a(a);
                }
                else {
                    this.b.post((Runnable)new w(this, v, a));
                }
            }
            return a2;
        }
        final af af = new af(aj);
        final x b = new x(this, af);
        af.b = b;
        this.obtainMessage(1, (Object)af).sendToTarget();
        return b;
    }
    
    public Future a() {
        if (this.d.compareAndSet(false, true)) {
            final k k = new k();
            this.obtainMessage(5, (Object)k).sendToTarget();
            return k;
        }
        return k.c();
    }
    
    public void handleMessage(final Message message) {
        com.twitter.util.e.a((Thread)t.a);
        switch (message.what) {
            default: {
                throw new IllegalArgumentException("Unknown message!");
            }
            case 1: {
                final af af = (af)message.obj;
                final t t = (t)this.c.get();
                if (t == null) {
                    break;
                }
                final aj a = af.a;
                final Object c = t.c(a);
                if (c != null) {
                    af.c = ResourceResponse$ResourceSource.b;
                    this.a(new ab(af), c, null);
                    break;
                }
                if (t.d(a) != null) {
                    this.a(af, true);
                    return;
                }
                this.a(af);
            }
            case 3: {
                final ad ad = (ad)message.obj;
                final String a2 = ad.a;
                final l b = ad.b;
                if (b != null) {
                    UrlNetworkStats.a(b.k, (int)b.e);
                }
                final ab ab = this.e.remove(a2);
                if (ab == null) {
                    break;
                }
                if (b != null && b.a == 200) {
                    ab.a(ResourceResponse$ResourceSource.f);
                    final Iterator iterator = ab.a.iterator();
                    while (iterator.hasNext()) {
                        this.a(iterator.next(), false);
                    }
                    break;
                }
                this.a(ab, a2, b);
            }
            case 2: {
                final ae ae = (ae)message.obj;
                final String a3 = ae.a;
                final ab ab2 = this.f.remove(a3);
                if (ab2 == null) {
                    break;
                }
                if (ae.c != null || !ae.d) {
                    ab2.a(ae.b);
                    this.a(ab2, a3, ae.c);
                    return;
                }
                final Iterator iterator2 = ab2.a.iterator();
                while (iterator2.hasNext()) {
                    this.a(iterator2.next());
                }
                break;
            }
            case 4: {
                this.b((af)message.obj);
            }
            case 5: {
                final k k = (k)message.obj;
                final Iterator<ab> iterator3 = this.f.values().iterator();
                while (iterator3.hasNext()) {
                    iterator3.next().c();
                }
                this.f.clear();
                final Iterator<ab> iterator4 = this.e.values().iterator();
                while (iterator4.hasNext()) {
                    iterator4.next().c();
                }
                this.e.clear();
                k.set(null);
            }
        }
    }
}
