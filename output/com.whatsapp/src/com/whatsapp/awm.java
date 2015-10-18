// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class awm implements gt
{
    final GroupChatInfo a;
    
    awm(final GroupChatInfo a) {
        this.a = a;
    }
    
    @Override
    public void a(final String s) {
        if (s.equals(GroupChatInfo.l(this.a))) {
            GroupChatInfo.v(this.a);
        }
    }
}
