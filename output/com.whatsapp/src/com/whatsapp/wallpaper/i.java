// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.view.View;
import android.view.View$OnClickListener;

class i implements View$OnClickListener
{
    final CropImage a;
    
    i(final CropImage a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        CropImage.a(this.a);
        this.a.finish();
    }
}
