// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;

class _n implements Runnable
{
    final a9 a;
    final t8 b;
    
    _n(final a9 a, final t8 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        Label_0128: {
            switch (hp.a[this.b.ordinal()]) {
                case 1: {
                    App.a((Context)App.aq, 2131231735, 0);
                    if (i) {
                        break Label_0128;
                    }
                    break;
                }
                case 2: {
                    App.b((Context)App.aq, 2131231078, 0);
                    if (i) {
                        break Label_0128;
                    }
                    break;
                }
                case 3: {
                    if (this.a.h.I == 1) {
                        App.b((Context)App.aq, 2131231071, 0);
                        if (!i) {
                            break;
                        }
                    }
                    App.b((Context)App.aq, 2131231068, 0);
                    if (i) {
                        break Label_0128;
                    }
                    break;
                }
                case 4: {
                    App.b((Context)App.aq, 2131231082, 0);
                    if (i) {
                        break Label_0128;
                    }
                    break;
                }
                case 5: {
                    App.b((Context)App.aq, 2131231412, 0);
                }
            }
        }
    }
}
