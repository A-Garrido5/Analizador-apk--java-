// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

class bt implements Runnable
{
    final GalleryPickerFragment a;
    final n b;
    
    bt(final GalleryPickerFragment a, final n b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        GalleryPickerFragment.a(this.a, this.b);
    }
}
