// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Map;
import java.util.HashMap;

class at4 implements Runnable
{
    final HashMap a;
    final j7 b;
    
    at4(final j7 b, final HashMap a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        vy.f(this.b.b).a(this.b.a, this.a);
        App.ar();
    }
}
