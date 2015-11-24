// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class alg implements View$OnClickListener
{
    final sf a;
    final int b;
    
    alg(final sf a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        final a_9 a_9 = (a_9)view.getTag();
        if (a_9 != null) {
            Label_0068: {
                if (a_9.u.equals(sf.a(this.a))) {
                    sf.a(this.a, (String)null);
                    sf.a(this.a, (View)null);
                    if (!i) {
                        break Label_0068;
                    }
                }
                sf.a(this.a, a_9.u);
            }
            Label_0180: {
                if (sf.a(this.a) != null) {
                    Label_0131: {
                        if (MessageDetailsActivity.a(this.a.c).get(this.b).a() != 5) {
                            sf.a(this.a, this.b, view, true);
                            if (!i) {
                                break Label_0131;
                            }
                        }
                        sf.a(this.a, (String)null);
                    }
                    if (sf.b(this.a) == null) {
                        break Label_0180;
                    }
                    sf.a(this.a, sf.c(this.a), sf.b(this.a), false);
                    if (!i) {
                        break Label_0180;
                    }
                }
                sf.a(this.a, this.b, view, false);
            }
            if (sf.a(this.a) != null) {
                sf.a(this.a, view);
                sf.a(this.a, this.b);
                if (!i) {
                    return;
                }
            }
            sf.a(this.a, (View)null);
            sf.a(this.a, 0);
        }
    }
}
