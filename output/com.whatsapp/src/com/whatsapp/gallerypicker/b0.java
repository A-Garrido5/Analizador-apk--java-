// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.provider.MediaStore$Images$Media;
import java.util.HashMap;
import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;

public class b0 extends ba implements aa
{
    static final String[] i;
    private static final String[] j;
    private static final String[] z;
    
    static {
        final String[] array = new String[6];
        String s = "i\u001f\u0005V";
        int n = -1;
        String[] array2 = array;
        String[] k = array;
        int n2 = 0;
        String intern = null;
    Label_0585:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int l = charArray.length, n3 = 0; l > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = '\u001d';
                        break;
                    }
                    case 1: {
                        c2 = 'm';
                        break;
                    }
                    case 2: {
                        c2 = 'p';
                        break;
                    }
                    case 3: {
                        c2 = '3';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "\u007f\u0018\u0013X%i2\u0014Z3m\u0001\u0011J\u001fs\f\u001dV";
                    n2 = 1;
                    array2 = k;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "y\u0004\u0003G)s\u000e\u0004";
                    n2 = 2;
                    array2 = k;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "\u007f\u0018\u0013X%i2\u0019W";
                    n2 = 3;
                    array2 = k;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    s = "5\u0000\u0019^%B\u0019\tC%=\u0004\u001e\u0013h\"AP\fl=RY\u001a";
                    n2 = 4;
                    array2 = k;
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    array2 = k;
                    s = "5\u0000\u0019^%B\u0019\tC%=\u0004\u001e\u0013h\"AP\fl=RY\u001a`\\#4\u0013\"h\u000e\u001bV4B\u0004\u0014\u0013}=R";
                    n = 4;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    z = k;
                    final String[] array3 = new String[3];
                    s = "t\u0000\u0011T%2\u0007\u0000V'";
                    n = 5;
                    array2 = array3;
                    k = array3;
                    n2 = 0;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    s = "t\u0000\u0011T%2\u001d\u001eT";
                    n = 6;
                    n2 = 1;
                    array2 = k;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    s = "t\u0000\u0011T%2\n\u0019U";
                    n = 7;
                    n2 = 2;
                    array2 = k;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    j = k;
                    final String[] array4 = new String[8];
                    s = "B\u0004\u0014";
                    n = 8;
                    array2 = array4;
                    k = array4;
                    n2 = 0;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    s = "B\t\u0011G!";
                    n = 9;
                    n2 = 1;
                    array2 = k;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    s = "y\f\u0004V4|\u0006\u0015]";
                    n = 10;
                    n2 = 2;
                    array2 = k;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    s = "p\u0004\u001eZ\u001fi\u0005\u0005^\"B\u0000\u0011T)~";
                    n = 11;
                    n2 = 3;
                    array2 = k;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    s = "r\u001f\u0019V.i\f\u0004Z/s";
                    n = 12;
                    n2 = 4;
                    array2 = k;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "i\u0004\u0004_%";
                    n = 13;
                    array2 = k;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "p\u0004\u001dV\u001fi\u0014\u0000V";
                    n = 14;
                    array2 = k;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "y\f\u0004V\u001fp\u0002\u0014Z&t\b\u0014";
                    n = 15;
                    array2 = k;
                    continue;
                }
                case 15: {
                    break Label_0585;
                }
            }
        }
        array2[n2] = intern;
        i = k;
    }
    
    public b0(final ContentResolver contentResolver, final Uri uri, final int n, final String s) {
        super(contentResolver, uri, n, s);
    }
    
    @Override
    protected bj a(final Cursor cursor) {
        return this.a(cursor);
    }
    
    @Override
    protected k a(final Cursor cursor) {
        final long long1 = cursor.getLong(0);
        final String string = cursor.getString(1);
        long long2 = cursor.getLong(2);
        if (long2 == 0L) {
            long2 = 1000L * cursor.getLong(7);
        }
        final int int1 = cursor.getInt(4);
        String string2 = cursor.getString(5);
        final String string3 = cursor.getString(6);
        if (string2 == null || string2.length() == 0) {
            string2 = string;
        }
        return new l(this, this.e, long1, cursor.getPosition(), this.a(long1), string, string3, long2, string2, int1);
    }
    
    protected String[] a() {
        if (this.b != null) {
            final int length = b0.j.length;
            final String[] array = new String[length + 1];
            System.arraycopy(b0.j, 0, array, 0, length);
            array[length] = this.b;
            return array;
        }
        return b0.j;
    }
    
    protected String b() {
        if (this.b == null) {
            return b0.z[4];
        }
        return b0.z[5];
    }
    
    @Override
    public HashMap b() {
        final int v = MediaGalleryBase.v;
        final Cursor query = MediaStore$Images$Media.query(this.e, this.c.buildUpon().appendQueryParameter(b0.z[2], b0.z[0]).build(), new String[] { b0.z[1], b0.z[3] }, this.b(), this.a(), (String)null);
        try {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            while (query.moveToNext()) {
                String string = query.getString(0);
                final String string2 = query.getString(1);
                if (string == null) {
                    string = "";
                }
                hashMap.put(string2, string);
                if (v != 0) {
                    break;
                }
            }
            return hashMap;
        }
        finally {
            query.close();
        }
    }
    
    @Override
    protected Cursor c() {
        return MediaStore$Images$Media.query(this.e, this.c, b0.i, this.b(), this.a(), this.a());
    }
}
