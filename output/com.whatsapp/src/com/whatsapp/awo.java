// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class awo implements View$OnClickListener
{
    final k1 a;
    final bi b;
    
    awo(final bi b, final k1 a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        Label_0045: {
            if (App.ak()) {
                bi.a(k1.c(this.a));
                if (!App.I) {
                    break Label_0045;
                }
            }
            bi.a(-1 + bi.j(this.b).length - k1.c(this.a));
        }
        bi.i(this.b).setCurrentItem(bi.b(), true);
        bi.a(this.b, bi.b());
    }
}
