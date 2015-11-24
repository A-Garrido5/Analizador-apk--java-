// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.concurrent;

class f implements Runnable
{
    final /* synthetic */ d a;
    final /* synthetic */ Object b;
    final /* synthetic */ e c;
    
    f(final e c, final d a, final Object b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.a(this.b);
    }
}
