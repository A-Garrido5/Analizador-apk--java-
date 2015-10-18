// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.event.m;
import android.content.ContentValues;
import android.database.Cursor;
import java.io.IOException;
import com.whatsapp.util.Log;
import org.whispersystems.aT;
import org.whispersystems.aq;
import org.whispersystems.d;

public final class ni implements d
{
    private static final String[] z;
    private final rt a;
    
    static {
        final String[] z2 = new String[11];
        String s = "Tv\u0001d\u001eio\b0\u0013|u\u0004s\u00129p\u0018`\u0007vq\u00190\u0019vwMy\u001aio\b}\u0012ww\bt";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'w';
                        break;
                    }
                    case 0: {
                        c2 = '\u0019';
                        break;
                    }
                    case 1: {
                        c2 = '\u0003';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "~q\u0002e\u0007Fj\t-H9B#TWjf\u0003t\u0012k\\\u0004tJ&";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "jf\u0003t\u0012k\\\u0006u\u000ej";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "jf\u0003t\u0012k\\\u0006u\u000ej";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "~q\u0002e\u0007Fj\t";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "kf\u000e\u007f\u0005}";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "jf\u0003t\u0012k\\\u0004t";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "~q\u0002e\u0007Fj\t0J9<MQ9]#\u001eu\u0019}f\u001fO\u001e}#P0H";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "x{\u0002|\u0018moMy\u0018|{\u000eu\u0007mj\u0002~Wnk\u0004|\u00129q\bq\u0013pm\n0\u0004|m\tu\u00059h\biWkf\u000e\u007f\u0005}";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "jf\u0003t\u0012k\\\u0006u\u000ej";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "kf\u000e\u007f\u0005}";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ni(final rt a) {
        this.a = a;
    }
    
    private void a(final aq aq) {
        if (aq == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        try {
            if (aq.b().a() != 0) {
                throw new IllegalArgumentException(ni.z[0]);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    @Override
    public aT a(final aq aq) {
        this.a(aq);
        final Cursor query = this.a.getWritableDatabase().query(ni.z[9], new String[] { ni.z[10] }, ni.z[7], new String[] { aq.a(), aq.b().b() }, (String)null, (String)null, (String)null);
        try {
            if (!query.moveToNext()) {
                return new aT();
            }
            return new aT(query.getBlob(0));
        }
        catch (IOException ex) {
            Log.c(ni.z[8], ex);
            return new aT();
        }
        finally {
            query.close();
        }
    }
    
    @Override
    public void a(final aq aq, final aT at) {
        this.a(aq);
        final SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        final ContentValues contentValues = new ContentValues();
        contentValues.put(ni.z[4], aq.a());
        contentValues.put(ni.z[6], aq.b().b());
        contentValues.put(ni.z[5], at.c());
        writableDatabase.replaceOrThrow(ni.z[3], (String)null, contentValues);
        m.b().b(new a6k(aq.a()));
    }
    
    public void b(final aq aq) {
        this.a(aq);
        this.a.getWritableDatabase().delete(ni.z[2], ni.z[1], new String[] { aq.a(), aq.b().b() });
        m.b().b(new a6k(aq.a()));
    }
}
