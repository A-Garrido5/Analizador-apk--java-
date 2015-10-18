// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.o;

class uc implements Runnable
{
    final _o a;
    final String b;
    
    uc(final _o a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        _o.b(this.a).a2.b(ha.g(this.b).b(), null);
        _o.b(this.a).a5().post((Runnable)new a_3(this, App.ak.v(this.b)));
    }
}
