// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ap implements Runnable
{
    final ao2 a;
    
    ap(final ao2 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final yw yw = new yw(this, ao2.a(this.a), false);
        ao2.d(this.a).removeCallbacks(ao2.f(this.a));
        ao2.d(this.a).postDelayed(ao2.f(this.a), ao2.g(this.a));
        App.a(yw);
        ao2.e(this.a);
    }
}
