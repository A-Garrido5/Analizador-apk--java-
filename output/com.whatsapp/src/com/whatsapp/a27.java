// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a27 implements Runnable
{
    final LocationPicker a;
    
    a27(final LocationPicker a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        LocationPicker.g(this.a).a(LocationPicker.n(this.a).getMyLocation());
    }
}
