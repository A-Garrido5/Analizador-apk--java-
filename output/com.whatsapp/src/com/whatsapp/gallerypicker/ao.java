// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

class ao implements Runnable
{
    final n a;
    final GalleryPickerFragment b;
    
    ao(final GalleryPickerFragment b, final n a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        GalleryPickerFragment.a(this.b, this.a);
    }
}
