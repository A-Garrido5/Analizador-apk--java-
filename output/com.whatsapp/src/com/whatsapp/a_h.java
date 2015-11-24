// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Collection;
import java.util.ArrayList;

class a_h implements Runnable
{
    final a0p a;
    
    a_h(final a0p a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.m == null) {
            App.b((gu)this.a.k);
        }
        if (this.a.n) {
            final ArrayList<String> list = new ArrayList<String>();
            list.add(this.a.e);
            App.a((Collection)list);
            if (!App.I) {
                return;
            }
        }
        if (this.a.m == null) {
            final App aq = App.aq;
            int n;
            if (this.a.a) {
                n = 2131230844;
            }
            else {
                n = 2131231869;
            }
            App.a((gu)null, aq.getString(n));
        }
    }
}
