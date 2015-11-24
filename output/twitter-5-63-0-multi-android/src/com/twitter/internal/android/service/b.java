// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

class b implements Runnable
{
    final /* synthetic */ Object a;
    final /* synthetic */ a b;
    
    b(final a b, final Object a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.c(this.a);
    }
}
