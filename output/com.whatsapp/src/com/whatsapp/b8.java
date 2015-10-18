// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;

public class b8
{
    private static final Object a;
    private static b8 b;
    private static final String[] z;
    private ar9 c;
    
    static {
        final String[] z2 = new String[36];
        String s = "U\u000eI\u001e(R\u000ey\u0000?\u0017A\u0006V";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0932:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '[';
                        break;
                    }
                    case 0: {
                        c2 = '7';
                        break;
                    }
                    case 1: {
                        c2 = '|';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = 'i';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "D\u0019U\u001a2X\u0012U";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "G\u0010G\n>h\u0012G\u0004>";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "V\u001fE\u001c)V\u001f_";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "[\u0013H";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "[\u001dR";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "U\u000eI\u001e(R\u000ey\u0000?";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "C\u0013M\f5";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "[\u001dU\u001d\u0004V\u001fR\u0000-R";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "R\u0004V\u0000)V\bO\u00065";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "X\u000f";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "D\u0019E\u001b>C";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "C\u0015K\f4B\b";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "D\u0019U\u001a2X\u0012U";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "U\u000eI\u001e(R\u000ey\u001d\"G\u0019";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "D\u0019U\u001a2X\u0012U";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "R\u0004V\u0000)V\bO\u00065";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "U\u000eI\u001e(R\u000ey\u0000?\u0017A\u0006V";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "G\u0010G\n>h\u0012G\u0004>";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "U\u000eI\u001e(R\u000ey\u0000?\u0017A\u0006V";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "V\u001fE\u001c)V\u001f_";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "[\u0013H";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "D\u0019U\u001a2X\u0012U";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "[\u001dR";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "D\u0019U\u001a2X\u0012U";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "U\u000eI\u001e(R\u000ey\u0000?\u0017A\u0006V";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "[\u001dU\u001d\u0004V\u001fR\u0000-R";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "D\u0019U\u001a2X\u0012U";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "X\u000f";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "U\u000eI\u001e(R\u000ey\u0000?";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "U\u000eI\u001e(R\u000ey\u001d\"G\u0019";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "[\u001dU\u001d\u0004V\u001fR\u0000-R";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "C\u0015K\f4B\b";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "D\u0019E\u001b>C";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "D\u0019U\u001a2X\u0012U";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "C\u0013M\f5";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    break Label_0932;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a = new Object();
    }
    
    private b8(final Context context) {
        this.c = new ar9(context);
    }
    
    public static b8 a(final Context context) {
        Label_0031: {
            if (b8.b != null) {
                break Label_0031;
            }
            synchronized (b8.a) {
                if (b8.b == null) {
                    b8.b = new b8(context);
                }
                return b8.b;
            }
        }
    }
    
    public List a() {
        final boolean i = App.I;
        final ArrayList<nl> list = new ArrayList<nl>();
        final Cursor query = this.c.getReadableDatabase().query(b8.z[13], new String[] { b8.z[6], b8.z[11], b8.z[7], b8.z[10], b8.z[14], b8.z[5], b8.z[4], b8.z[3], b8.z[2], b8.z[8], b8.z[12], b8.z[9] }, (String)null, (String[])null, (String)null, (String)null, (String)null);
        while (true) {
            if (query == null) {
                return list;
            }
            try {
                if (query.moveToNext()) {
                    final nl nl = new nl();
                    nl.f = query.getString(0);
                    nl.k = query.getString(1);
                    nl.b = query.getString(2);
                    nl.c = query.getString(3);
                    nl.h = query.getString(4);
                    nl.a = query.getDouble(5);
                    nl.i = query.getDouble(6);
                    nl.j = query.getDouble(7);
                    nl.l = query.getString(8);
                    nl.e = query.getLong(9);
                    nl.g = (query.getInt(10) > 0);
                    nl.d = query.getLong(11);
                    list.add(nl);
                    if (!i) {
                        continue;
                    }
                }
                return list;
            }
            finally {
                if (query != null) {
                    query.close();
                }
            }
        }
    }
    
    public void a(final String s) {
        this.c.getWritableDatabase().delete(b8.z[1], b8.z[0], new String[] { s });
    }
    
    public void a(final String s, final double n, final double n2, final double n3, final String s2) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put(b8.z[23], n);
        contentValues.put(b8.z[21], n2);
        contentValues.put(b8.z[20], n3);
        contentValues.put(b8.z[18], s2);
        this.c.getWritableDatabase().update(b8.z[22], contentValues, b8.z[19], new String[] { s });
    }
    
    public void a(final String s, final long n) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put(b8.z[16], n);
        this.c.getWritableDatabase().update(b8.z[15], contentValues, b8.z[17], new String[] { s });
    }
    
    public void a(final String s, final String s2, final String s3, final String s4, final String s5, final boolean b) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put(b8.z[29], s);
        contentValues.put(b8.z[33], s2);
        contentValues.put(b8.z[35], s3);
        contentValues.put(b8.z[28], s4);
        contentValues.put(b8.z[30], s5);
        contentValues.put(b8.z[31], System.currentTimeMillis());
        contentValues.put(b8.z[32], b);
        this.c.getWritableDatabase().replaceOrThrow(b8.z[34], (String)null, contentValues);
    }
    
    public void b() {
        this.c.getWritableDatabase().delete(b8.z[24], (String)null, (String[])null);
    }
    
    public void b(final String s, final long n) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put(b8.z[26], n);
        this.c.getWritableDatabase().update(b8.z[27], contentValues, b8.z[25], new String[] { s });
    }
}
