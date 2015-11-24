// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a66 implements Runnable
{
    final a0p a;
    
    a66(final a0p a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.m == null) {
            App.b((gu)this.a.k);
            if (this.a.k.isFinishing()) {
                return;
            }
            final App aq = App.aq;
            int n;
            if (this.a.a) {
                n = 2131230844;
            }
            else {
                n = 2131231869;
            }
            App.a((gu)null, aq.getString(n));
            if (!App.I) {
                return;
            }
        }
        l7.a(this.a.m.a, 500);
    }
}
