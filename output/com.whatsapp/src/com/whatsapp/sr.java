// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.content.ContentValues;

class sr implements Runnable
{
    private static final String[] z;
    final vy a;
    final long b;
    final String c;
    
    static {
        final String[] z2 = new String[5];
        String s = "`~ bIo\u007f2b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0016';
                        break;
                    }
                    case 0: {
                        c2 = '\u0003';
                        break;
                    }
                    case 1: {
                        c2 = '\u0016';
                        break;
                    }
                    case 2: {
                        c2 = 'A';
                        break;
                    }
                    case 3: {
                        c2 = '\u0016';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "hs8Idf{.bs\\|(r+<";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "`~ bIo\u007f2b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "ow2bIqs rIns2ewds\u001ebwaz$I\u007fg";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "hs8Idf{.bs\\|(r";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    sr(final vy a, final String c, final long b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void run() {
        final a2x a = vy.a(this.a);
        // monitorenter(a)
        while (true) {
            try {
                Label_0136: {
                    if (vy.c(this.a).get(this.c) == null) {
                        break Label_0136;
                    }
                    final SQLiteDatabase writableDatabase = vy.a(this.a).getWritableDatabase();
                    final ContentValues contentValues = new ContentValues();
                    contentValues.put(sr.z[3], this.b);
                    if (writableDatabase.update(sr.z[0], contentValues, sr.z[1], new String[] { this.c }) != 0) {
                        break Label_0136;
                    }
                    try {
                        contentValues.put(sr.z[4], this.c);
                        writableDatabase.insert(sr.z[2], (String)null, contentValues);
                        // monitorexit(a)
                        vy.g(this.a).a(this.c, this.a.l(this.c));
                    }
                    catch (SQLiteDatabaseCorruptException ex) {
                        throw ex;
                    }
                }
            }
            catch (SQLiteDatabaseCorruptException ex2) {
                try {
                    Log.b((Throwable)ex2);
                    this.a.i();
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
