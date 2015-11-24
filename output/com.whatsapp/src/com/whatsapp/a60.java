// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.b8;
import android.graphics.drawable.Drawable;
import com.whatsapp.protocol.bi;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.util.ar;

final class a60 implements ar
{
    @Override
    public int a() {
        return (int)(88.0f * vc.b().b);
    }
    
    @Override
    public void a(final ImageView imageView, final Bitmap bitmap, final bi bi) {
        if (bitmap != null) {
            imageView.setImageDrawable((Drawable)new alz(imageView.getContext(), bitmap, bi.a.b));
            if (!App.I) {
                return;
            }
        }
        imageView.setImageDrawable((Drawable)new alz(imageView.getContext(), b8.c(imageView.getContext()), bi.a.b));
    }
}
