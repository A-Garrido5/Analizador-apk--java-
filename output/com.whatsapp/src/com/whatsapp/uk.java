// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class uk implements Runnable
{
    final String a;
    final ig b;
    final String c;
    
    uk(final ig b, final String a, final String c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        ConversationsFragment.o(this.b.c).setText((CharSequence)this.a);
        ConversationsFragment.e(this.b.c).setText((CharSequence)this.c);
    }
}
