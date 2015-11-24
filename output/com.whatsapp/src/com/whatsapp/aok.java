// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.bi;
import java.util.HashMap;
import java.util.Collection;

class aok implements Runnable
{
    final Collection a;
    final boolean b;
    final vy c;
    
    aok(final vy c, final Collection a, final boolean b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final boolean k = a_9.k;
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (final bi bi : this.a) {
            hashMap.put(bi.a.a, vy.a(this.c, bi, this.b));
            if (k) {
                break;
            }
        }
        vy.h(this.c).post((Runnable)new a__(this, hashMap));
    }
}
