// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class jv implements Runnable
{
    final QuickContactActivity a;
    
    jv(final QuickContactActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        QuickContactActivity.d(this.a).f();
        QuickContactActivity.d(this.a).a(new sm(this));
    }
}
