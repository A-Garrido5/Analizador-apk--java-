// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.co;

class a02 extends co
{
    final ConversationRowLocation b;
    
    private a02(final ConversationRowLocation b) {
        this.b = b;
    }
    
    a02(final ConversationRowLocation conversationRowLocation, final at3 at3) {
        this(conversationRowLocation);
    }
    
    @Override
    public void a(final View view) {
        final boolean i = App.I;
        String s = null;
        Label_0128: {
            if (this.b.t.a.b) {
                s = App.aq.getString(2131231980);
                if (!i) {
                    break Label_0128;
                }
            }
            if (this.b.t.a.a.contains("-") && this.b.t.t != null) {
                s = App.S.e(this.b.t.t).a(this.b.getContext());
                if (!i) {
                    break Label_0128;
                }
            }
            s = App.S.e(this.b.t.a.a).a(this.b.getContext());
        }
        ConversationRowLocation.a(this.b.getContext(), this.b.t.p, this.b.t.G, s);
    }
}
