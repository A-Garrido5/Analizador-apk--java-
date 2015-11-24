// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

class oj implements Runnable
{
    final /* synthetic */ ProfileActivity a;
    
    oj(final ProfileActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.M().requestLayout();
    }
}
