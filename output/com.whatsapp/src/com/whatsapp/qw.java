// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class qw implements Runnable
{
    final ContactInfo a;
    
    qw(final ContactInfo a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        ContactInfo.f(this.a);
        this.a.D.postDelayed((Runnable)this, ContactInfo.b(this.a));
    }
}
