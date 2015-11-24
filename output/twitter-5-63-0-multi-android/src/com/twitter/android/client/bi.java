// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

class bi implements n
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ bh b;
    
    bi(final bh b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.run();
    }
    
    @Override
    public int b() {
        return 1;
    }
}
