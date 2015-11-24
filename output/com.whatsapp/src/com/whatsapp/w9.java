// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.method.TextKeyListener;
import android.view.View;
import android.view.View$OnClickListener;

class w9 implements View$OnClickListener
{
    final qh a;
    
    private w9(final qh a) {
        this.a = a;
    }
    
    w9(final qh qh, final be be) {
        this(qh);
    }
    
    public void onClick(final View view) {
        final String value = String.valueOf(this.a.b.getText());
        Label_0077: {
            if (value != null && value.length() > 0) {
                qh.b(this.a).a(value);
                TextKeyListener.clear(this.a.b.getText());
                this.a.dismiss();
                if (!App.I) {
                    break Label_0077;
                }
            }
            App.a(this.a.getContext(), 2131231416, 0);
        }
        qh.a(this.a);
    }
}
