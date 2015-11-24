// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.content.Context;
import com.whatsapp.util.cq;
import android.text.Editable;
import android.text.TextWatcher;

class ao9 implements TextWatcher
{
    final Conversation a;
    
    ao9(final Conversation a) {
        this.a = a;
    }
    
    public void afterTextChanged(final Editable editable) {
        final boolean i = App.I;
        final String string = editable.toString();
        final boolean enabled = string.trim().length() > 0;
        Conversation.O(this.a).setEnabled(enabled);
        Label_0241: {
            if (Conversation.af(this.a).getVisibility() == 8 && !enabled) {
                Conversation.af(this.a).startAnimation(ps.a(true));
                Conversation.af(this.a).setVisibility(0);
                if (App.ab()) {
                    Conversation.K(this.a).startAnimation(Conversation.b(true));
                    Conversation.K(this.a).setVisibility(0);
                }
                Conversation.O(this.a).startAnimation(ps.a(false));
                Conversation.O(this.a).setVisibility(8);
                if (!i) {
                    break Label_0241;
                }
            }
            if (Conversation.af(this.a).getVisibility() == 0 && enabled) {
                Conversation.af(this.a).startAnimation(ps.a(false));
                Conversation.af(this.a).setVisibility(8);
                if (App.ab()) {
                    Conversation.K(this.a).startAnimation(Conversation.b(false));
                    Conversation.K(this.a).setVisibility(8);
                }
                Conversation.O(this.a).startAnimation(ps.a(true));
                Conversation.O(this.a).setVisibility(0);
            }
        }
        Label_0289: {
            if (!Conversation.H(this.a)) {
                if (string.length() != 0) {
                    App.d(this.a.s.u, 0);
                    if (!i) {
                        break Label_0289;
                    }
                }
                App.k(this.a.s.u);
            }
        }
        cq.a(editable, (Context)this.a);
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)Conversation.m(this.a), charSequence);
    }
}
