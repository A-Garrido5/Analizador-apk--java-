// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.util.an;
import android.os.Build$VERSION;
import android.annotation.TargetApi;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Element;
import android.renderscript.Allocation;
import android.graphics.Bitmap;
import android.content.Context;
import android.renderscript.RenderScript;

public class bc
{
    private static RenderScript a;
    
    @TargetApi(17)
    public static Bitmap a(final Context context, final Bitmap bitmap, final float radius) {
        synchronized (bc.class) {
            final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            if (bc.a == null) {
                bc.a = RenderScript.create(context.getApplicationContext());
            }
            final RenderScript a = bc.a;
            final Allocation fromBitmap = Allocation.createFromBitmap(a, bitmap);
            final Allocation fromBitmap2 = Allocation.createFromBitmap(a, bitmap2);
            final ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(a, Element.U8_4(a));
            create.setInput(fromBitmap);
            create.setRadius(radius);
            create.forEach(fromBitmap2);
            fromBitmap2.copyTo(bitmap2);
            return bitmap2;
        }
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 17 && !an.c();
    }
}
