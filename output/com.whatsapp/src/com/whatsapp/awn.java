// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.method.TextKeyListener;
import com.whatsapp.util.cq;
import android.view.View;
import android.view.View$OnClickListener;

class awn implements View$OnClickListener
{
    final ah6 a;
    
    awn(final ah6 a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final String a = cq.a(ah6.e(this.a).getText().toString());
        Label_0102: {
            if (a.trim().length() > 0 || ah6.b(this.a) == 0) {
                ah6.d(this.a).a(a.trim());
                ah6.a(this.a, false);
                ah6.a(this.a, null);
                this.a.dismiss();
                if (!App.I) {
                    break Label_0102;
                }
            }
            App.a(this.a.getContext(), ah6.b(this.a), 0);
        }
        ah6.g(this.a).removeDialog(50);
        TextKeyListener.clear(ah6.e(this.a).getText());
    }
}
