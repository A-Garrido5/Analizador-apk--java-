// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class at2 implements Runnable
{
    final CallsFragment a;
    
    at2(final CallsFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        CallsFragment.c(this.a).notifyDataSetChanged();
        CallsFragment.f(this.a);
    }
}
