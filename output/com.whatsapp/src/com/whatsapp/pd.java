// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class pd implements Runnable
{
    final n2 a;
    final int b;
    
    pd(final n2 a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        GroupChatInfo.a(this.a.j, this.b);
    }
}
