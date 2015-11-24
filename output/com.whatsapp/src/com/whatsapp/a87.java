// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a87 implements Runnable
{
    final GroupChatInfo a;
    
    a87(final GroupChatInfo a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.c();
    }
}
