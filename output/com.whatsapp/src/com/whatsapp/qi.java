// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;

class qi implements Runnable
{
    final sw a;
    final Bitmap b;
    
    qi(final sw a, final Bitmap b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        CallLogActivity.c(this.a.a).setImageBitmap(this.b);
    }
}
