// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class fm implements Runnable
{
    final _o a;
    
    fm(final _o a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        _o.b(this.a).a2.b();
        _o.b(this.a).a5().post((Runnable)new nx(this));
    }
}
