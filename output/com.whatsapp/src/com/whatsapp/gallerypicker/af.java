// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.ViewTreeObserver$OnPreDrawListener;

class af implements ViewTreeObserver$OnPreDrawListener
{
    final u a;
    final MediaGalleryBase$MediaItemView b;
    
    af(final u a, final MediaGalleryBase$MediaItemView b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean onPreDraw() {
        this.b.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        this.a.d.supportStartPostponedEnterTransition();
        return true;
    }
}
