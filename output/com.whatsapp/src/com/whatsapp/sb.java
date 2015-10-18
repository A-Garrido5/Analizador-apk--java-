// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.bi;
import java.util.Map;
import java.util.Collection;

class sb extends sj
{
    final ContactInfo a;
    
    sb(final ContactInfo a) {
        this.a = a;
    }
    
    @Override
    public void a(final Collection collection, final Map map) {
        final boolean i = App.I;
        for (final bi bi : collection) {
            if (bi.a.a.equals(ContactInfo.c(this.a).u) && (bi.I == 1 || bi.I == 3 || bi.I == 2)) {
                ContactInfo.e(this.a);
                if (!i) {
                    break;
                }
            }
            if (i) {
                break;
            }
        }
    }
    
    @Override
    public void b(final bi bi, final int n) {
        if (bi != null && bi.a.a.equals(ContactInfo.c(this.a).u) && !bi.a.b && (bi.I == 1 || bi.I == 3 || bi.I == 2) && n == 3) {
            ContactInfo.e(this.a);
        }
    }
}
