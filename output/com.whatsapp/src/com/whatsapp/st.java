// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class st implements s0
{
    final Conversation a;
    
    st(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.u.notifyDataSetChanged();
    }
    
    @Override
    public void b() {
        if (Conversation.E(this.a) > 0) {
            Conversation.b(this.a, Conversation.E(this.a) + Conversation.t(this.a).size());
        }
        Conversation.t(this.a).clear();
        Conversation.R(this.a).clear();
        Conversation.h(this.a, true);
    }
}
