// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.graphics.PorterDuff$Mode;
import android.util.SparseArray;
import android.content.Context;

public class b
{
    public static SparseArray a(final Context context) {
        final SparseArray sparseArray = new SparseArray(5);
        final Resources resources = context.getResources();
        final Drawable drawable = resources.getDrawable(2130839337);
        final Drawable drawable2 = resources.getDrawable(2130839337);
        final Drawable drawable3 = resources.getDrawable(2130839338);
        final Drawable drawable4 = resources.getDrawable(2130839335);
        final Drawable drawable5 = resources.getDrawable(2130839336);
        final int color = resources.getColor(2131689606);
        final int color2 = resources.getColor(2131689610);
        final int color3 = resources.getColor(2131689607);
        drawable.mutate().setColorFilter(color, PorterDuff$Mode.SRC_IN);
        drawable2.mutate().setColorFilter(color3, PorterDuff$Mode.SRC_IN);
        drawable3.mutate().setColorFilter(color3, PorterDuff$Mode.SRC_IN);
        drawable4.mutate().setColorFilter(color2, PorterDuff$Mode.SRC_IN);
        drawable5.mutate().setColorFilter(color2, PorterDuff$Mode.SRC_IN);
        sparseArray.put(0, (Object)drawable);
        sparseArray.put(1, (Object)drawable2);
        sparseArray.put(2, (Object)drawable3);
        sparseArray.put(3, (Object)drawable4);
        sparseArray.put(4, (Object)drawable5);
        return sparseArray;
    }
}
