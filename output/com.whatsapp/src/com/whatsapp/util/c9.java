// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import com.whatsapp.protocol.bi;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.vc;

public class c9 implements ar
{
    @Override
    public int a() {
        return (int)(88.0f * vc.b().b);
    }
    
    @Override
    public void a(final ImageView imageView, final Bitmap imageBitmap, final bi bi) {
        if (imageBitmap != null) {
            imageView.setImageBitmap(imageBitmap);
        }
    }
}
