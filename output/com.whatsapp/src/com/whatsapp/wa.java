// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Comparator;

final class wa implements Comparator
{
    public int a(final n4 n4, final n4 n5) {
        final long b = n4.b;
        final long b2 = n5.b;
        if (b == b2) {
            return n4.a.compareTo(n5.a);
        }
        if (b < b2) {
            return 1;
        }
        return -1;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((n4)o, (n4)o2);
    }
}
