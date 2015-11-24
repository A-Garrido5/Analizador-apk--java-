// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class pb implements Runnable
{
    final boolean a;
    final ig b;
    
    pb(final ig b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a) {
            ConversationsFragment.j(this.b.c).getAnimation().startNow();
            if (!App.I) {
                return;
            }
        }
        ConversationsFragment.j(this.b.c).getAnimation().cancel();
    }
}
