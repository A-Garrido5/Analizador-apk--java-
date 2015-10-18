// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

class a__ implements Runnable
{
    final HashMap a;
    final aok b;
    
    a__(final aok b, final HashMap a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean k = a_9.k;
        vy.f(this.b.c).a(this.b.a, this.a);
        for (final String s : this.a.keySet()) {
            vy.f(this.b.c).a(s);
            vy.g(this.b.c).a(s);
            if (k) {
                break;
            }
        }
    }
}
