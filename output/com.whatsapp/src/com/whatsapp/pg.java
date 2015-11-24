// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;

class pg implements Runnable
{
    private static final String[] z;
    final boolean a;
    final vy b;
    
    static {
        final String[] z2 = new String[2];
        String s = ".fx<l!gj<";
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
                        c2 = '3';
                        break;
                    }
                    case 0: {
                        c2 = 'M';
                        break;
                    }
                    case 1: {
                        c2 = '\u000e';
                        break;
                    }
                    case 2: {
                        c2 = '\u0019';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
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
                    s = ",|z Z;k}";
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
    
    pg(final vy b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        synchronized (vy.a(this.b)) {
            final SQLiteDatabase writableDatabase = vy.a(this.b).getWritableDatabase();
            final ContentValues contentValues = new ContentValues(1);
            contentValues.put(pg.z[1], this.a);
            writableDatabase.update(pg.z[0], contentValues, (String)null, (String[])null);
        }
    }
}
