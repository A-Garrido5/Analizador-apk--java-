// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.util.Log;
import android.graphics.Bitmap;
import java.io.FileNotFoundException;
import java.io.File;
import android.os.ParcelFileDescriptor;
import android.graphics.BitmapFactory$Options;
import android.net.Uri;
import android.content.ContentResolver;

class d implements bj
{
    private static final String[] z;
    private final ContentResolver a;
    private final aa b;
    private final Uri c;
    
    static {
        final String[] z2 = new String[3];
        String s = "AV}\\yuCq";
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
                        c2 = '\u0014';
                        break;
                    }
                    case 0: {
                        c2 = '\u0014';
                        break;
                    }
                    case 1: {
                        c2 = '$';
                        break;
                    }
                    case 2: {
                        c2 = '\u0014';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "sK`5qlGqe`}Kz5pqG{q}zC4w}`Iue4";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "rMxp";
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
    
    d(final aa b, final ContentResolver a, final Uri c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    private BitmapFactory$Options a() {
        final ParcelFileDescriptor b = this.b();
        if (b == null) {
            return null;
        }
        try {
            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
            bitmapFactory$Options.inJustDecodeBounds = true;
            a2.a().a(b.getFileDescriptor(), bitmapFactory$Options);
            return bitmapFactory$Options;
        }
        finally {
            bq.a(b);
        }
    }
    
    private ParcelFileDescriptor b() {
        try {
            if (this.c.getScheme().equals(d.z[2])) {
                return ParcelFileDescriptor.open(new File(this.c.getPath()), 268435456);
            }
            return this.a.openFileDescriptor(this.c, "r");
        }
        catch (FileNotFoundException ex) {
            return null;
        }
    }
    
    @Override
    public Bitmap a(final int n) {
        return this.a(n, 2 * (n * n));
    }
    
    public Bitmap a(final int n, final int n2) {
        try {
            return bq.a(n, n2, this.b());
        }
        catch (Exception ex) {
            Log.e(d.z[0], d.z[1], (Throwable)ex);
            return null;
        }
    }
    
    @Override
    public Uri a() {
        return this.c;
    }
    
    @Override
    public String b() {
        return this.c.getPath();
    }
    
    @Override
    public long c() {
        return 0L;
    }
    
    @Override
    public long d() {
        return 0L;
    }
    
    @Override
    public String e() {
        final BitmapFactory$Options a = this.a();
        if (a != null && a.outMimeType != null) {
            return a.outMimeType;
        }
        return "";
    }
}
