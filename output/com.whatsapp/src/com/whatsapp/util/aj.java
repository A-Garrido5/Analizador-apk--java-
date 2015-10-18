// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import com.whatsapp.vc;
import android.content.Context;
import android.graphics.drawable.Drawable;

final class aj implements l
{
    @Override
    public Drawable a(final Drawable drawable, final Context context) {
        drawable.setBounds(0, 0, (int)vc.b().c(drawable.getIntrinsicWidth()), (int)vc.b().c(drawable.getIntrinsicWidth()));
        return drawable;
    }
}
