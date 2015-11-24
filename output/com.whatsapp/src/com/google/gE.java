// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class gE implements Comparator, Serializable
{
    private final float a;
    
    private gE(final float a) {
        this.a = a;
    }
    
    gE(final float n, final aV av) {
        this(n);
    }
    
    public int a(final cN cn, final cN cn2) {
        final float abs = Math.abs(cn2.c() - this.a);
        final float abs2 = Math.abs(cn.c() - this.a);
        if (abs < abs2) {
            return -1;
        }
        if (abs == abs2) {
            return 0;
        }
        return 1;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((cN)o, (cN)o2);
    }
}
