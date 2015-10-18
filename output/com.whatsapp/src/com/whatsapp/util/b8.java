// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import java.io.Closeable;
import android.os.Debug;
import android.graphics.Matrix;
import android.graphics.BitmapFactory;
import android.content.Context;
import com.whatsapp.DialogToastActivity;
import android.graphics.Color;
import android.os.Build$VERSION;
import android.graphics.Bitmap;

public class b8
{
    private static Bitmap a;
    private static Bitmap b;
    private static Bitmap c;
    private static Bitmap d;
    private static Bitmap e;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "_y|tPC`t\u007f\u001aYai>ZP9pvXYfd)";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = '6';
                        break;
                    }
                    case 1: {
                        c2 = '\u0014';
                        break;
                    }
                    case 2: {
                        c2 = '\u001d';
                        break;
                    }
                    case 3: {
                        c2 = '\u0013';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u0016\u007f_";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        b8.a = null;
        b8.e = null;
        b8.c = null;
        b8.d = null;
        b8.b = null;
    }
    
    public static int a(final Bitmap bitmap) {
        if (Build$VERSION.SDK_INT < 12) {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
        return bitmap.getByteCount();
    }
    
    public static int a(final float[] array) {
        final boolean l = Log.l;
        final float n = array[0];
        final float n2 = array[1];
        final float n3 = array[2];
        final float n4 = n2 * (1.0f - Math.abs(2.0f * n3 - 1.0f));
        final float n5 = n3 - 0.5f * n4;
        final float n6 = n4 * (1.0f - Math.abs(n / 60.0f % 2.0f - 1.0f));
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        Label_0379: {
            switch ((int)n / 60) {
                default: {
                    n7 = 0;
                    n8 = 0;
                    n9 = 0;
                    break;
                }
                case 0: {
                    n9 = Math.round(255.0f * (n4 + n5));
                    n8 = Math.round(255.0f * (n6 + n5));
                    n7 = Math.round(255.0f * n5);
                    if (l) {
                        break Label_0379;
                    }
                    break;
                }
                case 1: {
                    n9 = Math.round(255.0f * (n6 + n5));
                    n8 = Math.round(255.0f * (n4 + n5));
                    n7 = Math.round(255.0f * n5);
                    if (l) {
                        break Label_0379;
                    }
                    break;
                }
                case 2: {
                    n9 = Math.round(255.0f * n5);
                    n8 = Math.round(255.0f * (n4 + n5));
                    n7 = Math.round(255.0f * (n6 + n5));
                    if (l) {
                        break Label_0379;
                    }
                    break;
                }
                case 3: {
                    n9 = Math.round(255.0f * n5);
                    n8 = Math.round(255.0f * (n6 + n5));
                    n7 = Math.round(255.0f * (n4 + n5));
                    if (l) {
                        break Label_0379;
                    }
                    break;
                }
                case 4: {
                    n9 = Math.round(255.0f * (n6 + n5));
                    n8 = Math.round(255.0f * n5);
                    n7 = Math.round(255.0f * (n4 + n5));
                    if (l) {
                        break Label_0379;
                    }
                    break;
                }
                case 5:
                case 6: {
                    n9 = Math.round(255.0f * (n4 + n5));
                    n8 = Math.round(255.0f * n5);
                    n7 = Math.round(255.0f * (n6 + n5));
                    break;
                }
            }
        }
        final int rgb = Color.rgb(Math.max(0, Math.min(255, n9)), Math.max(0, Math.min(255, n8)), Math.max(0, Math.min(255, n7)));
        if (DialogToastActivity.h) {
            boolean i = false;
            if (!l) {
                i = true;
            }
            Log.l = i;
        }
        return rgb;
    }
    
    public static Bitmap a(final Context context) {
        if (b8.d == null) {
            b8.d = BitmapFactory.decodeResource(context.getResources(), 2130838903);
        }
        return b8.d;
    }
    
    public static Bitmap a(Bitmap bitmap, final int n) {
        if (n == 0 || bitmap == null) {
            return bitmap;
        }
        final Matrix matrix = new Matrix();
        matrix.setRotate((float)n, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        try {
            final Bitmap bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap != bitmap2) {
                bitmap.recycle();
                bitmap = bitmap2;
            }
            return bitmap;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            Log.e(b8.z[0] + Debug.getNativeHeapAllocatedSize() / 1024L + b8.z[1]);
            return bitmap;
        }
    }
    
    public static void a(final int n, final int n2, final int n3, final float[] array) {
        final boolean l = Log.l;
        final float n4 = n / 255.0f;
        final float n5 = n2 / 255.0f;
        final float n6 = n3 / 255.0f;
        final float max = Math.max(n4, Math.max(n5, n6));
        final float min = Math.min(n4, Math.min(n5, n6));
        final float n7 = max - min;
        final float n8 = (max + min) / 2.0f;
        float n11;
        float n12;
        if (max != min || l) {
            float n9 = 0.0f;
            Label_0147: {
                if (max == n4) {
                    n9 = (n5 - n6) / n7 % 6.0f;
                    if (!l) {
                        break Label_0147;
                    }
                }
                if (max == n5) {
                    n9 = 2.0f + (n6 - n4) / n7;
                    if (!l) {
                        break Label_0147;
                    }
                }
                n9 = 4.0f + (n4 - n5) / n7;
            }
            final float n10 = n7 / (1.0f - Math.abs(2.0f * n8 - 1.0f));
            n11 = n9;
            n12 = n10;
        }
        else {
            n12 = 0.0f;
            n11 = 0.0f;
        }
        array[0] = n11 * 60.0f % 360.0f;
        array[1] = n12;
        array[2] = n8;
    }
    
    public static void a(final int n, final float[] array) {
        a(Color.red(n), Color.green(n), Color.blue(n), array);
    }
    
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (Throwable t) {
            Log.e(t.toString());
        }
    }
    
    public static Bitmap b(final Context context) {
        if (b8.a == null) {
            b8.a = BitmapFactory.decodeResource(context.getResources(), 2130838905);
        }
        return b8.a;
    }
    
    public static Bitmap c(final Context context) {
        if (b8.e == null) {
            b8.e = BitmapFactory.decodeResource(context.getResources(), 2130838904);
        }
        return b8.e;
    }
    
    public static Bitmap d(final Context context) {
        if (b8.b != null) {
            return b8.b;
        }
        final Drawable drawable = context.getResources().getDrawable(2130837586);
        b8.b = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(b8.b);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return b8.b;
    }
    
    public static Bitmap e(final Context context) {
        if (b8.c == null) {
            b8.c = BitmapFactory.decodeResource(context.getResources(), 2130838911);
        }
        return b8.c;
    }
}
