// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.sqlite.SQLiteDatabase;

class x4 implements Runnable
{
    private static final String[] z;
    final String a;
    final vy b;
    final String c;
    
    static {
        final String[] z2 = new String[2];
        String s = ";b&C\u001c\u0003`(D\u00185s F\r2d:";
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
                        c2 = 'l';
                        break;
                    }
                    case 0: {
                        c2 = '\\';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = '6';
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
                    s = ";z RQc0(X\b|z RQc";
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
    }
    
    x4(final vy b, final String a, final String c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        synchronized (vy.a(this.b)) {
            final SQLiteDatabase writableDatabase = vy.a(this.b).getWritableDatabase();
            final String[] array = { this.a, null };
            String c;
            if (App.S.f(this.c)) {
                c = "";
            }
            else {
                c = this.c;
            }
            array[1] = c;
            writableDatabase.delete(x4.z[0], x4.z[1], array);
        }
    }
}
