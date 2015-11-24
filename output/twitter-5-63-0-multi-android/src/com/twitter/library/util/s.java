// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.graphics.Bitmap;
import android.util.StateSet;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageView;
import android.content.Context;

public class s
{
    public static StateListDrawable a(final Context context, final ImageView imageView, final int n) {
        if (imageView.getDrawable() == null || !(imageView.getDrawable() instanceof BitmapDrawable)) {
            return null;
        }
        final Bitmap bitmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
        final BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        final BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), bitmap);
        final StateListDrawable imageDrawable = new StateListDrawable();
        ((Drawable)bitmapDrawable2).setColorFilter(n, PorterDuff$Mode.SRC_ATOP);
        imageDrawable.addState(new int[] { 16842919 }, (Drawable)bitmapDrawable2);
        imageDrawable.addState(StateSet.WILD_CARD, (Drawable)bitmapDrawable);
        imageView.setImageDrawable((Drawable)imageDrawable);
        return imageDrawable;
    }
}
