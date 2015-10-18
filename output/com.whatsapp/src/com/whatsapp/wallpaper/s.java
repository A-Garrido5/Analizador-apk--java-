// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

class s implements Runnable
{
    final CropImageView a;
    final g b;
    
    s(final CropImageView a, final g b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        CropImageView.a(this.a, this.b);
    }
}
