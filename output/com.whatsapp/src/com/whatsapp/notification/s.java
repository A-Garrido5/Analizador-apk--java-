// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.widget.TextView;
import com.whatsapp.alm;
import com.whatsapp.ps;
import android.content.Context;
import com.whatsapp.util.cq;
import com.whatsapp.App;
import android.text.Editable;
import android.text.TextWatcher;

class s implements TextWatcher
{
    final PopupNotification a;
    
    s(final PopupNotification a) {
        this.a = a;
    }
    
    public void afterTextChanged(final Editable editable) {
        final boolean a = PopupNotification.A;
        App.av();
        final String string = editable.toString();
        if (string.length() > 0) {
            PopupNotification.s(this.a).setVisibility(0);
        }
        Label_0078: {
            if (PopupNotification.d(this.a) != null) {
                if (string.length() != 0) {
                    App.d(PopupNotification.d(this.a).u, 0);
                    if (!a) {
                        break Label_0078;
                    }
                }
                App.k(PopupNotification.d(this.a).u);
            }
        }
        cq.a(editable, (Context)this.a);
        final boolean enabled = string.trim().length() > 0;
        PopupNotification.s(this.a).setEnabled(enabled);
        if (PopupNotification.j(this.a).getVisibility() == 8 && !enabled) {
            PopupNotification.j(this.a).startAnimation(ps.a(true));
            PopupNotification.j(this.a).setVisibility(0);
            PopupNotification.s(this.a).startAnimation(ps.a(false));
            PopupNotification.s(this.a).setVisibility(8);
            if (!a) {
                return;
            }
        }
        if (PopupNotification.j(this.a).getVisibility() == 0 && enabled) {
            PopupNotification.j(this.a).startAnimation(ps.a(false));
            PopupNotification.j(this.a).setVisibility(8);
            PopupNotification.s(this.a).startAnimation(ps.a(true));
            PopupNotification.s(this.a).setVisibility(0);
        }
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)PopupNotification.i(this.a), charSequence);
    }
}
