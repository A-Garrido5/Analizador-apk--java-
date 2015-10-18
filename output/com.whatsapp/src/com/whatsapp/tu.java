// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;

class tu implements Runnable
{
    final u_ a;
    final Bitmap b;
    
    tu(final u_ a, final Bitmap b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (!VideoPreviewActivity.c(this.a.b).isPlaying()) {
            VideoPreviewActivity.c(this.a.b).setBackgroundDrawable((Drawable)new BitmapDrawable(this.a.b.getResources(), this.b));
        }
    }
}
