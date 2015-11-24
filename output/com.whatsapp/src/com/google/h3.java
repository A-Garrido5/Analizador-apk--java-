// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class h3 implements Comparator, Serializable
{
    private h3() {
    }
    
    h3(final T t) {
        this();
    }
    
    public int a(final cN cn, final cN cn2) {
        final int c = fv.c;
        final float n = cn2.c() - cn.c();
        int n2;
        if (n < 0.0) {
            n2 = -1;
        }
        else if (n > 0.0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (c != 0) {
            ++fN.a;
        }
        return n2;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((cN)o, (cN)o2);
    }
}
