// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.util.br;
import android.media.ThumbnailUtils;
import android.os.Build$VERSION;
import android.util.Log;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.net.Uri;
import android.content.ContentResolver;

public class m extends k implements bj
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "c\\g|XzWi|TA";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '7';
                        break;
                    }
                    case 0: {
                        c2 = '5';
                        break;
                    }
                    case 1: {
                        c2 = '5';
                        break;
                    }
                    case 2: {
                        c2 = '\u0003';
                        break;
                    }
                    case 3: {
                        c2 = '\u0019';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "c\\g|X";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "X\\mpc]@n{u\\AnxG\u0015Rlm\u0017PM`|GA\\lw";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    protected m(final ba ba, final ContentResolver contentResolver, final long n, final int n2, final Uri uri, final String s, final String s2, final long n3, final String s3) {
        super(ba, contentResolver, n, n2, uri, s, s2, n3, s3);
    }
    
    @Override
    public Bitmap a(final int n) {
        if (n < 144) {
            try {
                return a2.a().a(this.i, this.d, 3, null, true);
            }
            catch (Throwable t) {
                Log.e(m.z[1], m.z[2], t);
                return null;
            }
        }
        return this.a(n, 2 * (n * n));
    }
    
    @Override
    public Bitmap a(final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 8) {
            return ThumbnailUtils.createVideoThumbnail(this.k, 1);
        }
        return br.b(this.k);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof m && this.a().equals((Object)((m)o).a());
    }
    
    @Override
    public int hashCode() {
        return this.a().toString().hashCode();
    }
    
    @Override
    public String toString() {
        return m.z[0] + this.d;
    }
}
