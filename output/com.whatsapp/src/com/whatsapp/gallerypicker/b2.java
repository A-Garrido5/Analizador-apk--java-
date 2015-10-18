// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.provider.MediaStore$Images$Media;
import java.util.HashMap;
import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;

public class b2 extends ba
{
    private static final String[] i;
    private static final String[] z;
    
    static {
        final String[] array = new String[5];
        String s = "Vzd\n;@Pn\u0005~\t/ ";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_0443:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int j = charArray.length, n3 = 0; j > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '^';
                        break;
                    }
                    case 0: {
                        c2 = '4';
                        break;
                    }
                    case 1: {
                        c2 = '\u000f';
                        break;
                    }
                    case 2: {
                        c2 = '\u0007';
                        break;
                    }
                    case 3: {
                        c2 = 'a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "Vzd\n;@Pc\b-Dcf\u0018\u0001Znj\u0004";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "Pft\u00157Zls";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "@}r\u0004";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    s = "Vzd\n;@Pn\u0005";
                    n2 = 4;
                    array2 = array3;
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    z = array3;
                    array2 = (array3 = new String[7]);
                    s = "kfc";
                    n = 4;
                    n2 = 0;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    s = "kkf\u0015?";
                    n = 5;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    s = "Pns\u0004*Udb\u000f";
                    n = 6;
                    n2 = 2;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    s = "@fs\r;";
                    n = 7;
                    n2 = 3;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    s = "Yfi\b\u0001@gr\f<kbf\u00067W";
                    n = 8;
                    n2 = 4;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "Yfj\u0004\u0001@vw\u0004";
                    n = 9;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "Pns\u0004\u0001Y`c\b8]jc";
                    n = 10;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    break Label_0443;
                }
            }
        }
        array2[n2] = intern;
        i = array3;
    }
    
    public b2(final ContentResolver contentResolver, final Uri uri, final int n, final String s) {
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
            long2 = 1000L * cursor.getLong(6);
        }
        String string2 = cursor.getString(3);
        final String string3 = cursor.getString(5);
        if (string2 == null || string2.length() == 0) {
            string2 = string;
        }
        return new m(this, this.e, long1, cursor.getPosition(), this.a(long1), string, string3, long2, string2);
    }
    
    protected String[] a() {
        return null;
    }
    
    protected String b() {
        if (this.b != null) {
            return b2.z[0] + this.b + "'";
        }
        return null;
    }
    
    @Override
    public HashMap b() {
        final int v = MediaGalleryBase.v;
        final Cursor query = MediaStore$Images$Media.query(this.e, this.c.buildUpon().appendQueryParameter(b2.z[2], b2.z[3]).build(), new String[] { b2.z[1], b2.z[4] }, this.b(), this.a(), this.a());
        try {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            while (query.moveToNext()) {
                hashMap.put(query.getString(1), query.getString(0));
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
        return MediaStore$Images$Media.query(this.e, this.c, b2.i, this.b(), this.a(), this.a());
    }
}
