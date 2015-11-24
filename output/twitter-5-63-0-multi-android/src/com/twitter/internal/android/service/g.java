// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

class g implements Runnable
{
    final /* synthetic */ i a;
    final /* synthetic */ e b;
    
    g(final e b, final i a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.d.a(this.a);
    }
}
