// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.co;

class a00 extends co
{
    final ConversationRowLocation b;
    
    private a00(final ConversationRowLocation b) {
        this.b = b;
    }
    
    a00(final ConversationRowLocation conversationRowLocation, final at3 at3) {
        this(conversationRowLocation);
    }
    
    @Override
    public void a(final View view) {
        App.a(this.b.getContext(), this.b.t);
    }
}
