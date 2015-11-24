// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;

class dg implements yk
{
    final ArrayList a;
    final MediaGallery b;
    
    dg(final MediaGallery b, final ArrayList a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a() {
        if (this.a.size() == MediaGallery.f(this.b).getCount()) {
            this.b.finish();
            if (!App.I) {
                return;
            }
        }
        MediaGallery.b(this.b).clear();
        if (MediaGallery.e(this.b) != null) {
            MediaGallery.e(this.b).finish();
        }
        MediaGallery.a(this.b, false, false);
    }
}
