// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import android.content.ContentValues;

class a98 implements Runnable
{
    private static final String[] z;
    final boolean a;
    final String b;
    final vy c;
    
    static {
        final String[] z2 = new String[4];
        String s = "$\u001fW\r|+\u001eE\r";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = 'w';
                        break;
                    }
                    case 2: {
                        c2 = '6';
                        break;
                    }
                    case 3: {
                        c2 = 'y';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ",\u0012O&Q\"\u001aY\rF\u0018\u001d_\u001d\u001ex";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "*\u0004Q\nW(\u0005SVB5\u0014^\u0010U\"XR\u0010Gg\u0019Y\r\u00032\u0007R\u0018W\"W";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "&\u0005U\u0011J1\u0012R";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a98(final vy c, final boolean a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final a2x a = vy.a(this.c);
        // monitorenter(a)
        while (true) {
            try {
                final SQLiteDatabase writableDatabase = vy.a(this.c).getWritableDatabase();
                final ContentValues contentValues = new ContentValues();
                contentValues.put(a98.z[3], this.a);
                if (writableDatabase.update(a98.z[0], contentValues, a98.z[1], new String[] { this.b }) != 0) {
                    return;
                }
                try {
                    Log.e(a98.z[2] + this.b);
                }
                catch (SQLiteDatabaseCorruptException ex) {
                    throw ex;
                }
            }
            catch (SQLiteDatabaseCorruptException ex2) {
                try {
                    Log.b((Throwable)ex2);
                    this.c.i();
                    throw new AssertionError(ex2);
                }
                finally {
                }
                // monitorexit(a)
            }
            catch (RuntimeException ex3) {
                final Error error;
                Log.b(error);
                throw error;
            }
            catch (Error error) {
                continue;
            }
            break;
        }
    }
}
