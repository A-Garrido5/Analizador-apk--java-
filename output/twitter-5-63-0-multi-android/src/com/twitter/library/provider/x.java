// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public final class x
{
    private static x a;
    private final List b;
    
    private x() {
        this.b = Collections.synchronizedList(new ArrayList<Object>(5));
    }
    
    private static x a() {
        synchronized (x.class) {
            if (x.a == null) {
                x.a = new x();
            }
            return x.a;
        }
    }
    
    public static void a(final long n) {
        final Iterator<y> iterator = a().b.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(n);
        }
    }
    
    public static void a(final y y) {
        a().b.remove(y);
    }
    
    public static boolean a(final long n, final Tweet tweet, final Runnable runnable) {
        final Iterator<y> iterator = a().b.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final boolean a = iterator.next().a(n, tweet, runnable);
            b = (b || a);
        }
        return b;
    }
    
    public static void b(final long n) {
        final Iterator<y> iterator = a().b.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(n);
        }
    }
    
    public static void b(final y y) {
        a().b.add(y);
    }
}
