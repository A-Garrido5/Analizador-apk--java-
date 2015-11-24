// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.a8a;
import java.util.HashMap;
import android.database.ContentObserver;
import android.database.Cursor;
import android.content.ContentResolver;
import android.net.Uri;

public class br extends ba
{
    public static final Uri i;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "gR.\"!jY";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int j = charArray.length, n3 = 0; j > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'T';
                        break;
                    }
                    case 0: {
                        c2 = '\u000e';
                        break;
                    }
                    case 1: {
                        c2 = '<';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = 'N';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "gQ,)1}";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "lI.%1zu)";
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
        final char[] charArray2 = "mS#:1`Hwa{mS `#f]9=5~Lc>&aJ$*1|\u0012 +0g]b' kQ>".toCharArray();
        for (int k = charArray2.length, n4 = 0; k > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = 'T';
                    break;
                }
                case 0: {
                    c4 = '\u000e';
                    break;
                }
                case 1: {
                    c4 = '<';
                    break;
                }
                case 2: {
                    c4 = 'M';
                    break;
                }
                case 3: {
                    c4 = 'N';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        i = Uri.parse(new String(charArray2).intern());
    }
    
    public br(final ContentResolver contentResolver, final int n, final String s) {
        super(contentResolver, br.i, n, s);
    }
    
    @Override
    protected bj a(final Cursor cursor) {
        return new e(this, this.e, cursor.getString(1), cursor.getLong(2));
    }
    
    @Override
    public void a(final ContentObserver contentObserver) {
        if (this.d != null) {
            this.d.unregisterContentObserver(contentObserver);
        }
    }
    
    @Override
    public HashMap b() {
        return new HashMap();
    }
    
    @Override
    public void b(final ContentObserver contentObserver) {
        if (this.d != null) {
            this.d.registerContentObserver(contentObserver);
        }
    }
    
    @Override
    protected Cursor c() {
        return this.e.query(this.c.buildUpon().appendQueryParameter(br.z[2], this.b).appendQueryParameter(br.z[0], br.z[1]).build(), a8a.b, (String)null, (String[])null, this.a());
    }
    
    @Override
    public void c() {
        this.b();
    }
}
