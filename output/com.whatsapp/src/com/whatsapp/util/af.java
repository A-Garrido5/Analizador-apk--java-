// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import com.whatsapp.vc;
import android.content.Context;
import android.graphics.drawable.Drawable;

final class af implements l
{
    @Override
    public Drawable a(final Drawable drawable, final Context context) {
        drawable.setBounds(0, 0, (int)vc.b().b(drawable.getIntrinsicWidth()), (int)vc.b().b(drawable.getIntrinsicWidth()));
        return drawable;
    }
}
