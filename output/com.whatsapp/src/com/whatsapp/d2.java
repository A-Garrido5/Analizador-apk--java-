// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class d2 implements Runnable
{
    final n2 a;
    
    d2(final n2 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        GroupChatInfo.n(this.a.j).setVisibility(8);
        GroupChatInfo.p(this.a.j).setVisibility(0);
    }
}
