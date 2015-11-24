// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class ge implements Comparator, Serializable
{
    private ge() {
    }
    
    ge(final bK bk) {
        this();
    }
    
    public int a(final I i, final I j) {
        return i.a() - j.a();
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((I)o, (I)o2);
    }
}
