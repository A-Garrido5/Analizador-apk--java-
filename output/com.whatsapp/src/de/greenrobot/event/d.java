// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

final class d
{
    private static final List d;
    c a;
    d b;
    Object c;
    
    static {
        d = new ArrayList();
    }
    
    private d(final Object c, final c a) {
        this.c = c;
        this.a = a;
    }
    
    static d a(final c a, final Object c) {
        synchronized (de.greenrobot.event.d.d) {
            final int size = de.greenrobot.event.d.d.size();
            if (size > 0) {
                final d d = de.greenrobot.event.d.d.remove(size - 1);
                d.c = c;
                d.a = a;
                d.b = null;
                return d;
            }
            // monitorexit(d.d)
            return new d(c, a);
        }
    }
    
    static void a(final d d) {
        while (true) {
            final boolean b = a.b;
            d.c = null;
            d.a = null;
            d.b = null;
            while (true) {
                Label_0075: {
                    synchronized (d.d) {
                        if (d.d.size() < 10000) {
                            d.d.add(d);
                        }
                        // monitorexit(d.d)
                        if (m.q != 0) {
                            if (!b) {
                                break Label_0075;
                            }
                            final boolean b2 = false;
                            a.b = b2;
                        }
                        return;
                    }
                }
                final boolean b2 = true;
                continue;
            }
        }
    }
}
