// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ad9 implements Runnable
{
    final WebImagePicker a;
    
    ad9(final WebImagePicker a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        WebImagePicker.k(this.a);
    }
}
