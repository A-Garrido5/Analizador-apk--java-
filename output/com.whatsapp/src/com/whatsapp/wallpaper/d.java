// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Debug;
import com.whatsapp.util.Log;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory$Options;
import android.os.AsyncTask;

class d extends AsyncTask
{
    private static final String[] z;
    BitmapFactory$Options a;
    final WallpaperPicker b;
    
    static {
        final String[] z2 = new String[6];
        String s = "?/\u001f4<+4%6";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'U';
                        break;
                    }
                    case 0: {
                        c2 = 'H';
                        break;
                    }
                    case 1: {
                        c2 = '_';
                        break;
                    }
                    case 2: {
                        c2 = '@';
                        break;
                    }
                    case 3: {
                        c2 = 'D';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "?/\u001f4<+4%6\n'0-i;)+)20h7%%%h,)>0h";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "h4\u0002";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "?/\u001f4<+4%6";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "+0-j\" >4748/n34$30%%--";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "+0-j\" >4748/n34$30%%--";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    d(final WallpaperPicker b) {
        this.b = b;
        this.a = new BitmapFactory$Options();
        this.a.inDither = false;
        this.a.inPreferredConfig = Bitmap$Config.ARGB_8888;
        this.a.inSampleSize = 2;
    }
    
    protected Bitmap a(final Integer[] array) {
        try {
            if (this.isCancelled()) {
                return null;
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            throw outOfMemoryError;
        }
        try {
            return BitmapFactory.decodeResource(this.b.i.getResourcesForApplication(d.z[4]), (int)WallpaperPicker.d(this.b).get(array[0]), this.a);
        }
        catch (OutOfMemoryError outOfMemoryError2) {
            this.a.inSampleSize = 3;
            Log.e(d.z[0] + outOfMemoryError2.toString());
            try {
                return BitmapFactory.decodeResource(this.b.i.getResourcesForApplication(d.z[5]), (int)WallpaperPicker.d(this.b).get(array[0]), this.a);
            }
            catch (OutOfMemoryError outOfMemoryError3) {
                Log.e(d.z[1] + Debug.getNativeHeapAllocatedSize() / 1024L + d.z[2]);
            }
            catch (PackageManager$NameNotFoundException ex) {}
        }
        catch (PackageManager$NameNotFoundException ex2) {}
    }
    
    void a() {
        this.a.requestCancelDecode();
        super.cancel(true);
    }
    
    protected void a(final Bitmap imageBitmap) {
        if (imageBitmap != null) {
            if (!this.isCancelled() && !this.a.mCancel) {
                if (WallpaperPicker.c(this.b) != null) {
                    WallpaperPicker.c(this.b).recycle();
                }
                final ImageView b = WallpaperPicker.b(this.b);
                b.setImageBitmap(imageBitmap);
                WallpaperPicker.a(this.b, imageBitmap);
                final Drawable drawable = b.getDrawable();
                drawable.setFilterBitmap(true);
                drawable.setDither(true);
                b.postInvalidate();
                WallpaperPicker.a(this.b, (d)null);
                if (!ImageViewTouchBase.h) {
                    return;
                }
            }
            imageBitmap.recycle();
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Integer[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Bitmap)o);
    }
}
