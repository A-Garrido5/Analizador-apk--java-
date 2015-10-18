// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class q6 implements Runnable
{
    final so a;
    
    q6(final so a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        LocationPicker.g(this.a.a).a(LocationPicker.n(this.a.a).getMyLocation());
        LocationPicker.g(this.a.a).getController().setZoom(18);
    }
}
