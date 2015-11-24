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

public class bc extends ba
{
    public static final Uri i;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u00159w)t";
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
                        c2 = '\u001b';
                        break;
                    }
                    case 0: {
                        c2 = 'c';
                        break;
                    }
                    case 1: {
                        c2 = 'P';
                        break;
                    }
                    case 2: {
                        c2 = '\u0013';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0001%p'~\u0017\u0019w";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\n>p n\u00075";
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
        final char[] charArray2 = "\u0000?}8~\r$)c4\u0000?~bl\u000b1g?z\u0013 =<i\f&z(~\u0011~~)\u007f\n1<%o\u0006=`".toCharArray();
        for (int k = charArray2.length, n4 = 0; k > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = '\u001b';
                    break;
                }
                case 0: {
                    c4 = 'c';
                    break;
                }
                case 1: {
                    c4 = 'P';
                    break;
                }
                case 2: {
                    c4 = '\u0013';
                    break;
                }
                case 3: {
                    c4 = 'L';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        i = Uri.parse(new String(charArray2).intern());
    }
    
    public bc(final ContentResolver contentResolver, final int n, final String s) {
        super(contentResolver, bc.i, n, s);
    }
    
    @Override
    protected bj a(final Cursor cursor) {
        return new aq(this, this.e, cursor.getString(1), cursor.getLong(2), cursor.getLong(5));
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
        return this.e.query(this.c.buildUpon().appendQueryParameter(bc.z[1], this.b).appendQueryParameter(bc.z[2], bc.z[0]).build(), a8a.b, (String)null, (String[])null, this.a());
    }
    
    @Override
    public void c() {
        this.b();
    }
}
