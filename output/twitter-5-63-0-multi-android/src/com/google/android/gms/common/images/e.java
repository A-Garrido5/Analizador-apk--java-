// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.images;

import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.internal.k;
import android.graphics.Bitmap;
import com.google.android.gms.internal.g;
import android.content.res.Resources;
import com.google.android.gms.internal.j;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.i;
import android.content.Context;

public abstract class e
{
    final f a;
    protected int b;
    protected a c;
    protected int d;
    
    private Drawable a(final Context context, final i i, final int n) {
        final Resources resources = context.getResources();
        if (this.d > 0) {
            final j j = new j(n, this.d);
            Drawable drawable = (Drawable)i.a(j);
            if (drawable == null) {
                drawable = resources.getDrawable(n);
                if ((0x1 & this.d) != 0x0) {
                    drawable = this.a(resources, drawable);
                }
                i.b(j, drawable);
            }
            return drawable;
        }
        return resources.getDrawable(n);
    }
    
    protected Drawable a(final Resources resources, final Drawable drawable) {
        return g.a(resources, drawable);
    }
    
    void a(final Context context, Bitmap a, final boolean b) {
        k.a(a);
        if ((0x1 & this.d) != 0x0) {
            a = g.a(a);
        }
        final BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), a);
        if (this.c != null) {
            this.c.a(this.a.a, (Drawable)bitmapDrawable, true);
        }
        this.a((Drawable)bitmapDrawable, b, false, true);
    }
    
    void a(final Context context, final i i, final boolean b) {
        final int b2 = this.b;
        Drawable a = null;
        if (b2 != 0) {
            a = this.a(context, i, this.b);
        }
        if (this.c != null) {
            this.c.a(this.a.a, a, false);
        }
        this.a(a, b, false, false);
    }
    
    protected abstract void a(final Drawable p0, final boolean p1, final boolean p2, final boolean p3);
}
