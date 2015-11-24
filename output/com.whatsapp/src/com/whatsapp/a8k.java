// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.contact.k;

class a8k implements Runnable
{
    final ox a;
    final k b;
    
    a8k(final ox a, final k b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        this.a.a.setSupportProgressBarIndeterminateVisibility(false);
        ContactPicker.u(this.a.a);
        ContactPicker.w(this.a.a);
        Label_0173: {
            switch (as7.a[this.b.ordinal()]) {
                case 1: {
                    App.aL.c(true);
                    App.aq.a(System.currentTimeMillis());
                    App.a((Context)this.a.a, 2131230907, 0);
                    if (i) {
                        break Label_0173;
                    }
                    break;
                }
                case 2: {
                    this.a.a.a(2131230905);
                    if (i) {
                        break Label_0173;
                    }
                    break;
                }
                case 3:
                case 4: {
                    this.a.a.a(2131230904);
                    App.aL.b(true);
                    if (i) {
                        break Label_0173;
                    }
                    break;
                }
                case 5: {
                    this.a.a.a(2131230906);
                    if (i) {
                        break Label_0173;
                    }
                    break;
                }
                case 6: {
                    this.a.a.showDialog(4);
                    App.aL.b(true);
                }
            }
        }
    }
}
