// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import android.util.Pair;
import com.twitter.util.concurrent.ObservablePromise;
import com.twitter.util.concurrent.i;
import java.io.OutputStream;
import java.io.IOException;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.as;
import java.util.concurrent.Future;
import java.util.Collection;
import com.twitter.util.d;
import java.io.File;
import com.twitter.internal.network.l;
import java.util.HashMap;
import java.util.Map;
import com.twitter.library.util.ak;
import android.content.Context;
import android.os.HandlerThread;
import java.io.Closeable;

public abstract class t implements Closeable
{
    protected static final HandlerThread a;
    protected final Context b;
    protected final ak c;
    protected final a d;
    protected final a e;
    protected v f;
    protected final Map g;
    
    static {
        (a = new HandlerThread("CoordinationThread", 10)).start();
    }
    
    t(final String s, final Context context, final ak c, final a d, final a e) {
        this.b = context.getApplicationContext();
        this.c = c;
        this.d = d;
        this.e = e;
        final ResourceResponse$ResourceSource[] values = ResourceResponse$ResourceSource.values();
        this.g = new HashMap(values.length);
        final ir b = ir.b();
        for (final ResourceResponse$ResourceSource resourceResponse$ResourceSource : values) {
            final ic a = ic.a("media:fetcher:source:" + s + ":" + resourceResponse$ResourceSource.name().toLowerCase(), b, 0L, ih.n, 3);
            a.i();
            this.g.put(resourceResponse$ResourceSource, a);
        }
    }
    
    private v b() {
        synchronized (this) {
            if (this.f == null) {
                this.f = new v(this.b, t.a.getLooper(), this);
            }
            return this.f;
        }
    }
    
    protected abstract ResourceResponse a(final aj p0, final Object p1, final ResourceResponse$ResourceSource p2, final l p3);
    
    public ak a() {
        return this.c;
    }
    
    public File a(final aj aj) {
        com.twitter.util.d.c();
        return this.d.a(aj.a());
    }
    
    protected Object a(final aj aj, final File file) {
        return null;
    }
    
    Object a(final String s, final Object o) {
        if (this.c != null && s != null && o != null) {
            return this.c.a(s, o);
        }
        return null;
    }
    
    public Future a(final Collection collection) {
        if (collection != null) {
            final ag ag = new ag(this, collection);
            as.a(this.b).a(ag);
            return ag;
        }
        return null;
    }
    
    void a(final ResourceResponse$ResourceSource resourceResponse$ResourceSource) {
        this.g.get(resourceResponse$ResourceSource).f();
    }
    
    public void a(final String s, final File file) {
        com.twitter.util.d.c();
        try {
            this.d.a(s, file);
        }
        catch (IOException ex) {
            ErrorReporter.a(ex);
        }
    }
    
    boolean a(final aj aj, final Object o) {
        com.twitter.util.d.c();
        if (this.e != null) {
            try {
                return this.e.a(aj.n(), o, new u(this, aj));
            }
            catch (IOException ex) {
                ErrorReporter.a(ex);
            }
        }
        return false;
    }
    
    protected boolean a(final aj aj, final Object o, final OutputStream outputStream) {
        return false;
    }
    
    protected abstract boolean a(final Object p0);
    
    public i b(final aj aj) {
        if (aj != null) {
            return this.b().a(aj);
        }
        return ObservablePromise.a((Object)null);
    }
    
    protected Object b(final aj aj, final File file) {
        com.twitter.util.d.c();
        return this.a(aj, file);
    }
    
    public Object c(final aj aj) {
        if (this.c != null && aj != null && aj.o()) {
            final String n = aj.n();
            final Object b = this.c.b(n);
            if (b != null) {
                if (this.a(b)) {
                    return b;
                }
                this.c.a(n);
                ErrorReporter.a(new com.twitter.errorreporter.a().a("Resource Request Key", n).a(new IllegalStateException("Cached resource was unexpectedly invalidated by external code. For bitmaps, do not call Bitmap.recycle() on images returned by MediaManager.")));
            }
        }
        return null;
    }
    
    public Future c(final aj aj, final File file) {
        if (aj != null && aj.o() && file != null) {
            final ai ai = new ai(this, aj, file);
            as.a(this.b).a(ai);
            return ai;
        }
        return null;
    }
    
    @Override
    public void close() {
        if (this.f != null) {
            this.f.a();
        }
        this.d.close();
        if (this.e != null) {
            this.e.close();
        }
    }
    
    Pair d(final aj aj) {
        com.twitter.util.d.c();
        final File e = this.e(aj);
        if (e != null) {
            return Pair.create((Object)ResourceResponse$ResourceSource.c, (Object)e);
        }
        final File a = this.a(aj);
        if (a != null) {
            return Pair.create((Object)ResourceResponse$ResourceSource.d, (Object)a);
        }
        final File a2 = aj.a(this.b);
        if (a2 != null) {
            return Pair.create((Object)ResourceResponse$ResourceSource.e, (Object)a2);
        }
        return null;
    }
    
    public File e(final aj aj) {
        com.twitter.util.d.c();
        if (this.e != null) {
            return this.e.a(aj.n());
        }
        return null;
    }
}
