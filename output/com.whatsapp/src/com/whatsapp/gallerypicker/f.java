// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

class f implements Runnable
{
    final GalleryPickerFragment a;
    final boolean b;
    
    f(final GalleryPickerFragment a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        GalleryPickerFragment.b(this.a, this.b);
        GalleryPickerFragment.a(this.a, this.b);
    }
}
