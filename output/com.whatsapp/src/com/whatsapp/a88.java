// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a88 implements Runnable
{
    final ChangeNumber a;
    
    a88(final ChangeNumber a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.b(App.aX);
        al5.b(al5.f(App.aX.jabber_id), App.aX.jabber_id);
        al5.h();
    }
}
