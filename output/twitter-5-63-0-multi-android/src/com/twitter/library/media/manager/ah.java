// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.errorreporter.ErrorReporter;
import java.io.File;
import android.os.Process;
import android.util.Pair;
import java.lang.ref.WeakReference;
import com.twitter.internal.android.service.a;

abstract class ah extends a
{
    private final WeakReference a;
    private final r e;
    private final aj f;
    
    public ah(final t t, final aj f) {
        super(ah.class.getName());
        this.f = f;
        this.a = new WeakReference((T)t);
        (this.e = new r("process_blocking")).i();
        this.b(4);
    }
    
    protected Pair a() {
        this.e.j();
        this.e.f();
        final r r = new r("process_runtime");
        r.i();
        Process.setThreadPriority(11);
        final aj f = this.f;
        ResourceResponse$ResourceSource a = ResourceResponse$ResourceSource.a;
        final t t = (t)this.a.get();
    Label_0088:
        while (true) {
            if (t == null) {
                final Object o = null;
                break Label_0088;
            }
            while (true) {
                Object o;
                Object o2;
                ResourceResponse$ResourceSource b;
                Pair d;
                File file;
                Throwable t2;
                Label_0085:Label_0224_Outer:
                while (true) {
                    while (true) {
                        try {
                            o2 = t.c(f);
                            Label_0107: {
                                if (o2 == null) {
                                    break Label_0107;
                                }
                                while (true) {
                                    try {
                                        b = ResourceResponse$ResourceSource.b;
                                        o = o2;
                                        a = b;
                                        r.j();
                                        r.f();
                                        return new Pair((Object)a, o);
                                        while (true) {
                                            file = (File)d.second;
                                            b = (ResourceResponse$ResourceSource)d.first;
                                            synchronized (file) {
                                                if (b == ResourceResponse$ResourceSource.c) {
                                                    o2 = t.a(f, file);
                                                }
                                                else {
                                                    o2 = t.b(f, file);
                                                }
                                                // monitorexit(file)
                                                if (o2 != null) {
                                                    if (b != ResourceResponse$ResourceSource.c) {
                                                        t.a(f, o2);
                                                    }
                                                    o = o2;
                                                    continue Label_0085;
                                                }
                                                break;
                                            }
                                            d = t.d(f);
                                            continue Label_0224_Outer;
                                        }
                                    }
                                    // iftrue(Label_0244:, d == null)
                                    catch (Throwable t3) {
                                        t2 = t3;
                                        o = o2;
                                    }
                                    ErrorReporter.a(t2);
                                    continue Label_0088;
                                }
                            }
                        }
                        catch (Throwable t4) {
                            t2 = t4;
                            o = null;
                            continue;
                        }
                        break;
                    }
                    Label_0244: {
                        o = o2;
                    }
                    b = a;
                    continue Label_0085;
                }
            }
            break;
        }
    }
    
    protected Pair b() {
        return null;
    }
}
