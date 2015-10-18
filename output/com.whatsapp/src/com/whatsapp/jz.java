// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bt;
import java.util.Comparator;

class jz implements Comparator
{
    final b6 a;
    final double b;
    final double c;
    
    jz(final b6 a, final double b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int a(final bt bt, final bt bt2) {
        return Double.compare((bt.f - this.b) * (bt.f - this.b) + (bt.c - this.c) * (bt.c - this.c), (bt2.f - this.b) * (bt2.f - this.b) + (bt2.c - this.c) * (bt2.c - this.c));
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((bt)o, (bt)o2);
    }
}
