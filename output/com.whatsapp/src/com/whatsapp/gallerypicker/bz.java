// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

class bz implements Runnable
{
    final GalleryPickerFragment a;
    
    bz(final GalleryPickerFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        GalleryPickerFragment.g(this.a);
    }
}
