// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

class ok implements Runnable
{
    final /* synthetic */ ProfileActivity a;
    
    ok(final ProfileActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.x.a();
    }
}
