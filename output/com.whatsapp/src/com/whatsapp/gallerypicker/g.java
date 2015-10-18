// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

class g extends Thread
{
    final GalleryPickerFragment a;
    
    g(final GalleryPickerFragment a, final String s) {
        this.a = a;
        super(s);
    }
    
    @Override
    public void run() {
        GalleryPickerFragment.c(this.a);
    }
}
