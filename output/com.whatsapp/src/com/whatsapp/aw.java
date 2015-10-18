// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class aw extends aq
{
    final aty d;
    
    aw(final aty d, final String s) {
        this.d = d;
        super(s);
    }
    
    @Override
    public void a() {
        super.a();
        GroupChatInfo.v(this.d.a);
    }
    
    @Override
    public void a(final int n) {
        super.a(n);
        GroupChatInfo.v(this.d.a);
    }
    
    @Override
    public void run() {
        super.run();
        dt.c.c(GroupChatInfo.l(this.d.a));
        GroupChatInfo.v(this.d.a);
    }
}
