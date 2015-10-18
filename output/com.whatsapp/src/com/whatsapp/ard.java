// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ard implements Runnable
{
    final String a;
    final int b;
    final ig c;
    final String d;
    
    ard(final ig c, final int b, final String a, final String d) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    @Override
    public void run() {
        ConversationsFragment.a(this.c.c).setProgress(this.b);
        ConversationsFragment.o(this.c.c).setText((CharSequence)this.a);
        ConversationsFragment.e(this.c.c).setText((CharSequence)this.d);
    }
}
