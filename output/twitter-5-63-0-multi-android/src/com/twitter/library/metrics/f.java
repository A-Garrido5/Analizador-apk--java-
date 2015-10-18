// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import android.os.Debug;
import com.twitter.library.client.App;
import com.twitter.library.featureswitch.d;

public class f
{
    private static f a;
    private boolean b;
    private ia c;
    private iu d;
    private ia e;
    private iu f;
    private ia g;
    private iu h;
    private ia i;
    private iu j;
    private ia k;
    private iu l;
    
    private f(final ir ir) {
        uf.a(ir, "app::::oome_count", ih.n, 3).i();
        this.b(ir);
    }
    
    public static f a() {
        if (f.a == null) {
            throw new IllegalStateException("MediaMetrics.initialize() must be called first");
        }
        return f.a;
    }
    
    public static void a(final ir ir) {
        if (f.a == null) {
            f.a = new f(ir);
        }
    }
    
    private void b(final ir ir) {
        jh.a(ih.m, ir).i();
        if (com.twitter.library.featureswitch.d.f("memory_metric_enabled") || App.a()) {
            this.b = true;
            final im n = ih.n;
            (this.c = ia.a("app::dalvik:heap:avg", n, ir, false, 2)).i();
            (this.d = iu.a("app::dalvik:heap:peak", n, ir, false, 2)).i();
            (this.e = ia.a("app::dalvik:heap_allocated:avg", n, ir, false, 2)).i();
            (this.f = iu.a("app::dalvik:heap_allocated:peak", n, ir, false, 2)).i();
            (this.g = ia.a("app::dalvik:heap_ratio:avg", n, ir, false, 2)).i();
            (this.h = iu.a("app::dalvik:heap_ratio:peak", n, ir, false, 2)).i();
            (this.i = ia.a("app::native:heap:avg", n, ir, false, 2)).i();
            (this.j = iu.a("app::native:heap:peak", n, ir, false, 2)).i();
            (this.k = ia.a("app::native:heap_allocated:avg", n, ir, false, 2)).i();
            (this.l = iu.a("app::native:heap_allocated:peak", n, ir, false, 2)).i();
        }
    }
    
    public void b() {
        jh.a(ih.l, ir.b()).f();
        if (com.twitter.library.featureswitch.d.f("memory_metric_enabled") || App.a()) {
            if (!this.b) {
                this.b(ir.b());
            }
            final Runtime runtime = Runtime.getRuntime();
            final long totalMemory = runtime.totalMemory();
            this.c.a(totalMemory);
            this.d.a(totalMemory);
            final long n = runtime.totalMemory() - runtime.freeMemory();
            this.e.a(n);
            this.f.a(n);
            final long n2 = totalMemory * 100L / runtime.maxMemory();
            this.g.a(n2);
            this.h.a(n2);
            final long nativeHeapSize = Debug.getNativeHeapSize();
            this.i.a(nativeHeapSize);
            this.j.a(nativeHeapSize);
            final long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            this.k.a(nativeHeapAllocatedSize);
            this.l.a(nativeHeapAllocatedSize);
        }
    }
}
