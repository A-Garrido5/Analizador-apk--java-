// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.view.View;
import android.view.View$OnClickListener;

class f implements View$OnClickListener
{
    final CropImage a;
    
    f(final CropImage a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.setResult(0);
        this.a.finish();
    }
}
