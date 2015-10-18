// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

class at implements Runnable
{
    final AutofocusOverlay a;
    
    at(final AutofocusOverlay a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.setVisibility(8);
    }
}
