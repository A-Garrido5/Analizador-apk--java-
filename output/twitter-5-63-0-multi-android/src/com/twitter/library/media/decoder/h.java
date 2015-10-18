// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.decoder;

import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import android.graphics.Canvas;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$Config;
import com.twitter.internal.android.util.Size;
import android.graphics.Bitmap;
import android.util.Log;
import com.twitter.library.client.App;
import com.twitter.library.media.manager.l;

public class h implements l
{
    private static final boolean a;
    private final int b;
    
    static {
        a = (App.l() && Log.isLoggable("TintTransformation", 3));
    }
    
    public h(final int b) {
        this.b = b;
    }
    
    @Override
    public Bitmap a(Bitmap bitmap) {
        final Bitmap a = m.a(Size.a(bitmap), Bitmap$Config.ARGB_8888);
        if (a != null) {
            final Canvas canvas = new Canvas(a);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint)null);
            canvas.drawColor(this.b, PorterDuff$Mode.SRC_ATOP);
            bitmap = a;
        }
        else if (h.a) {
            Log.w("TintTransformation", "Out of memory. Not tinting media.");
            return bitmap;
        }
        return bitmap;
    }
    
    @Override
    public String a() {
        return "TintTransformation?color=" + Integer.toHexString(this.b);
    }
}
