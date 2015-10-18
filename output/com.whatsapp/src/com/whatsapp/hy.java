// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class hy implements Runnable
{
    final ig a;
    
    hy(final ig a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        ConversationsFragment.a(this.a.c).setVisibility(0);
        ConversationsFragment.a(this.a.c).setIndeterminate(true);
    }
}
