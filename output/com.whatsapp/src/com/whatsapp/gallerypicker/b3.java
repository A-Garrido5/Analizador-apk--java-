// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.View$OnClickListener;

class b3 implements View$OnClickListener
{
    final ImagePreview$ThumbImageView a;
    final ImagePreview b;
    
    b3(final ImagePreview$ThumbImageView a, final ImagePreview b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        ImagePreview.b(this.a.A).setCurrentItem(ImagePreview.q(this.a.A).indexOf(ImagePreview$ThumbImageView.a(this.a)));
    }
}
