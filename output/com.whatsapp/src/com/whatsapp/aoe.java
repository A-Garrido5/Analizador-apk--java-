// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.content.ContentValues;

class aoe implements Runnable
{
    private static final String[] z;
    final String a;
    final long b;
    final vy c;
    
    static {
        final String[] z2 = new String[5];
        String s = "=\u000f'\u001cQ3\u000717F\t\u00007'\u001ei";
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
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = 'V';
                        break;
                    }
                    case 1: {
                        c2 = 'j';
                        break;
                    }
                    case 2: {
                        c2 = '^';
                        break;
                    }
                    case 3: {
                        c2 = 'C';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "5\u0002?7|:\u0003-7";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ":\u000b-7|$\u000f?'|$\u000f=&J&\u001e\u00010F8\u001e\u0001.F%\u0019?$F\t\u001e?!O357'";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "=\u000f'\u001cQ3\u000717F\t\u00007'";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "5\u0002?7|:\u0003-7";
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
    
    aoe(final vy c, final long b, final String a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final a2x a = vy.a(this.c);
        // monitorenter(a)
        while (true) {
            try {
                final SQLiteDatabase writableDatabase = vy.a(this.c).getWritableDatabase();
                final ContentValues contentValues = new ContentValues();
                contentValues.put(aoe.z[2], this.b);
                if (writableDatabase.update(aoe.z[4], contentValues, aoe.z[0], new String[] { this.a }) != 0) {
                    return;
                }
                try {
                    contentValues.put(aoe.z[3], this.a);
                    writableDatabase.insert(aoe.z[1], (String)null, contentValues);
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
