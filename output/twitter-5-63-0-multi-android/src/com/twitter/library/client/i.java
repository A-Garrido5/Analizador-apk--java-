// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

class i implements Runnable
{
    final /* synthetic */ boolean a;
    final /* synthetic */ g b;
    
    i(final g b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.a.setChecked(this.a);
    }
}
