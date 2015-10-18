// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import com.whatsapp.vc;
import android.content.Context;
import android.graphics.drawable.Drawable;

final class e implements l
{
    @Override
    public Drawable a(final Drawable drawable, final Context context) {
        drawable.setBounds(0, 0, (int)vc.b().a(drawable.getIntrinsicWidth()), (int)vc.b().a(drawable.getIntrinsicWidth()));
        return drawable;
    }
}
