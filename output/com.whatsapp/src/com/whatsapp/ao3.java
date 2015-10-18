// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;

class ao3 implements Runnable
{
    private static final String[] z;
    final vy a;
    final String b;
    final wh c;
    
    static {
        final String[] z2 = new String[7];
        String s = ":\\|8\u0002b\u0016t2[}\\|8\u0002b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '?';
                        break;
                    }
                    case 0: {
                        c2 = ']';
                        break;
                    }
                    case 1: {
                        c2 = '6';
                        break;
                    }
                    case 2: {
                        c2 = '\u0015';
                        break;
                    }
                    case 3: {
                        c2 = '\\';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ":\\|8";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "7_q";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "<Rx5Q";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "-S{8V3Q";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ":Dz)O\u0002Ft.K4U|,^3Bf";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = ":Dz)O\u0002Ft.K4U|,^3Bf";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ao3(final vy a, final String b, final wh c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
    Label_0127_Outer:
        while (true) {
            int n = 1;
            while (true) {
            Label_0226:
                while (true) {
                    synchronized (vy.a(this.a)) {
                        final SQLiteDatabase writableDatabase = vy.a(this.a).getWritableDatabase();
                        final ContentValues contentValues = new ContentValues(4);
                        contentValues.put(ao3.z[1], this.b);
                        final String s = ao3.z[2];
                        String c;
                        if (this.c.a()) {
                            c = "";
                        }
                        else {
                            c = this.c.c;
                        }
                        contentValues.put(s, c);
                        final String s2 = ao3.z[3];
                        if (this.c.b) {
                            final int n2 = n;
                            contentValues.put(s2, n2);
                            final String s3 = ao3.z[4];
                            if (this.c.e) {
                                contentValues.put(s3, n);
                                if (writableDatabase.update(ao3.z[6], contentValues, ao3.z[0], new String[] { this.b, this.c.c }) == 0) {
                                    writableDatabase.insert(ao3.z[5], (String)null, contentValues);
                                }
                                return;
                            }
                            break Label_0226;
                        }
                    }
                    final int n2 = 0;
                    continue Label_0127_Outer;
                }
                n = 0;
                continue;
            }
        }
    }
}
