// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;

class sw extends AsyncTask
{
    final CallLogActivity a;
    
    sw(final CallLogActivity a) {
        this.a = a;
    }
    
    public Void a(final Void[] array) {
        final int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(2131361937);
        Bitmap bitmap = CallLogActivity.b(this.a).a(dimensionPixelSize, this.a.getResources().getDimension(2131361812), false);
        if (bitmap == null) {
            bitmap = CallLogActivity.b(this.a).x();
            if (bitmap != null) {
                bitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true);
            }
        }
        if (bitmap != null && !this.isCancelled()) {
            this.a.runOnUiThread((Runnable)new qi(this, bitmap));
        }
        return null;
    }
    
    public Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
}
