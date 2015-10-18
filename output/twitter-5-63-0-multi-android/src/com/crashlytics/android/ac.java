// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import com.crashlytics.android.internal.cl;
import com.crashlytics.android.internal.bd;
import android.content.Context;

final class ac
{
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    
    private ac(final String a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static ac a(final Context context, final String s) {
        if (s != null) {
            try {
                final int h = bd.h(context);
                cl.a().b().a("Crashlytics", "App icon resource ID is " + h);
                final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                bitmapFactory$Options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), h, bitmapFactory$Options);
                return new ac(s, h, bitmapFactory$Options.outWidth, bitmapFactory$Options.outHeight);
            }
            catch (Exception ex) {
                cl.a().b().a("Crashlytics", "Failed to load icon", ex);
            }
        }
        return null;
    }
}
