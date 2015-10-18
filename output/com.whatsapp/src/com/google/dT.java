// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Comparator;

final class dT implements Comparator
{
    public int a(final Comparable comparable, final Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((Comparable)o, (Comparable)o2);
    }
}
