// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.util.Comparator;

class bs implements Comparator
{
    private bs() {
    }
    
    bs(final a4 a4) {
        this();
    }
    
    public int a(final a1 a1, final a1 a2) {
        if (a1.a == a2.a) {
            return a1.b - a2.b;
        }
        if (a1.a < a2.a) {
            return -1;
        }
        return 1;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((a1)o, (a1)o2);
    }
}
