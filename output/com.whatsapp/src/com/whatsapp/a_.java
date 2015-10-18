// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a_ extends a6
{
    final aty e;
    
    a_(final aty e, final String s, final long n) {
        this.e = e;
        super(s, n);
    }
    
    @Override
    public void a() {
        super.a();
        GroupChatInfo.v(this.e.a);
    }
    
    @Override
    public void a(final int n) {
        super.a(n);
        GroupChatInfo.v(this.e.a);
    }
    
    @Override
    public void run() {
        super.run();
        dt.c.a(GroupChatInfo.l(this.e.a), 0L);
        GroupChatInfo.v(this.e.a);
    }
}
