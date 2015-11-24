// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.bi;
import java.util.HashMap;
import java.util.Collection;

class j7 implements Runnable
{
    final Collection a;
    final vy b;
    
    j7(final vy b, final Collection a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean k = a_9.k;
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (final bi bi : this.a) {
            hashMap.put(bi.a.a, vy.a(this.b, bi, false));
            if (k) {
                break;
            }
        }
        vy.h(this.b).post((Runnable)new at4(this, hashMap));
    }
}
