// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.m;
import com.whatsapp.protocol.b2;
import org.whispersystems.aW;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.whispersystems.x;
import org.whispersystems.a4;

public final class it implements a4
{
    private static final String[] z;
    private final rt a;
    
    static {
        final String[] z2 = new String[13];
        String s = "_\u0004\u0019\n/J\u0010V\u0014%J\u000e\u001f\u00036[\u0018V\n!J\u0019\u0005\u0012`M\u0015\u0011\b%Z\\\u0006\u0014%U\u0019\u000fF2[\u001f\u0019\u0014$\u001e\u000f\u0003\u0005#[\u000f\u0005\u00005R\u0010\u000f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = '|';
                        break;
                    }
                    case 2: {
                        c2 = 'v';
                        break;
                    }
                    case 3: {
                        c2 = 'f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "J\u0015\u001b\u00033J\u001d\u001b\u0016`z9%%";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "M\u0015\u0011\b%Z#\u0006\u0014%U\u0019\u000f\u0015";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "L\u0019\u0015\t2Z";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "X\u001d\u001f\n%Z\\\u0002\t`N\u001d\u0004\u0015%\u001e\b\u001e\u0003`R\u001d\u0002\u00033J\\\u0005\u000f'P\u0019\u0012F0L\u0019\u001d\u00039\u001e\u000e\u0013\u0005/L\u0018";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "_\u0004\u0019\n/J\u0010V\n/_\u0018\u0013\u0002`J\u0014\u0013F,_\b\u0013\u00154\u001e\u000f\u001f\u0001.[\u0018V\u00162[\\\u001d\u00039\u001e\u001a\u0019\u0014`M\u0019\u0018\u0002)P\u001b";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "P\u0013V\u0015)Y\u0012\u0013\u0002`N\u000e\u0013\r%G\\\u0017\u0010!W\u0010\u0017\u0004,[\\\u0001\u000f4V\\\u001f\u0002`";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "X\u001d\u001f\n%Z\\\u0002\t`N\u001d\u0004\u0015%\u001e\u000f\u001f\u0001.[\u0018V\u00162[\\\u001d\u00039\u001e\u000e\u0013\u0005/L\u0018V\u00025L\u0015\u0018\u0001`R\u0013\u0017\u0002`X\u0013\u0004F)Z\\";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "L\u0019\u0015\t2Z";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "W\u0012\u0000\u0007,W\u0018V\u00162[\u0017\u0013\u001f`L\u0019\u0015\t2Z\\\u0001\u000f4V\\\u001f\u0002`";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "M\u0015\u0011\b%Z#\u0006\u0014%U\u0019\u000f\u0015";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "N\u000e\u0013\r%G#\u001f\u0002`\u0003\\I";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "_\u0004\u0019\n/J\u0010V\n/_\u0018\u0013\u0002`_\\\u0005\u000f'P\u0019\u0012F0L\u0019V\r%G\\\u0001\u000f4V\\\u001f\u0002`";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    it(final rt a) {
        this.a = a;
    }
    
    private x a() {
        final Cursor query = this.a.getWritableDatabase().query(it.z[2], new String[] { it.z[3] }, (String)null, (String[])null, (String)null, (String)null, it.z[1], "1");
        try {
            if (!query.moveToNext()) {
                query.close();
                return null;
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        final byte[] blob = query.getBlob(0);
        query.close();
        try {
            final x x = new x(blob);
            Log.i(it.z[0]);
            return x;
        }
        catch (IOException ex2) {
            Log.b(it.z[4], ex2);
            return null;
        }
    }
    
    @Override
    public x a(final int n) {
        final Cursor query = this.a.getWritableDatabase().query(it.z[10], new String[] { it.z[8] }, it.z[11], new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
        try {
            if (!query.moveToNext()) {
                query.close();
                throw new aW(it.z[6] + n);
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        try {
            final x x = new x(query.getBlob(0));
            query.close();
            Log.i(it.z[12] + n);
            return x;
        }
        catch (IOException ex2) {
            Log.b(it.z[7] + n, ex2);
            throw new aW(it.z[9] + n);
        }
    }
    
    public b2 b() {
        final x a = this.a();
        final byte[] a2 = a.a().b().a();
        final byte[] array = new byte[-1 + a2.length];
        System.arraycopy(a2, 1, array, 0, array.length);
        final b2 b2 = new b2(m.b(a.d()), array, a.b());
        Log.i(it.z[5]);
        return b2;
    }
}
