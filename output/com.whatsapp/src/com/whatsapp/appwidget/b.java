// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.appwidget;

import com.whatsapp.protocol.bi;
import java.util.Comparator;

class b implements Comparator
{
    final a a;
    
    b(final a a) {
        this.a = a;
    }
    
    public int a(final bi bi, final bi bi2) {
        if (bi.u == bi2.u) {
            return 0;
        }
        if (bi.u < bi2.u) {
            return 1;
        }
        return -1;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((bi)o, (bi)o2);
    }
}
