// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class w1 implements Runnable
{
    final ProfileInfoActivity a;
    
    w1(final ProfileInfoActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (ProfileInfoActivity.c(this.a).q == 0 && ProfileInfoActivity.c(this.a).v == 0) {
            ProfileInfoActivity.a(this.a).setVisibility(4);
        }
    }
}
