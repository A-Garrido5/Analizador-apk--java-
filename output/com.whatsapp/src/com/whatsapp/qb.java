// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.ArrayList;
import android.content.SharedPreferences;
import android.os.AsyncTask;

final class qb extends AsyncTask
{
    private static final String[] z;
    final SharedPreferences a;
    final ArrayList b;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u0000l:";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000b';
                        break;
                    }
                    case 0: {
                        c2 = 'p';
                        break;
                    }
                    case 1: {
                        c2 = '\r';
                        break;
                    }
                    case 2: {
                        c2 = '\u0017';
                        break;
                    }
                    case 3: {
                        c2 = '\"';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0016}v\u000f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0017\u007fxW{\u001dje\rf\u0019jeC\u007f\u0015keMf\u0000\u007frDx_\u007frOd\u0006h7";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0017\u007fxW{\u001dje\rf\u0019jeC\u007f\u0015keMf\u0000\u007frDx_\u007frOd\u0006h7";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0000l:";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0016}v\u000f";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    qb(final ArrayList b, final SharedPreferences a) {
        this.b = b;
        this.a = a;
    }
    
    protected Void a(final Void[] array) {
        final boolean i = App.I;
        App.ak.b(this.b);
        final SharedPreferences$Editor edit = this.a.edit();
        for (final atf atf : this.b) {
            edit.remove(qb.z[4] + atf.a(atf));
            edit.remove(qb.z[5] + atf.a(atf));
            if (i) {
                break;
            }
        }
        for (final String s : this.a.getAll().keySet()) {
            if (s.startsWith(qb.z[0]) && s.contains("@")) {
                Log.i(qb.z[3] + s);
                edit.remove(s);
            }
            if (s.startsWith(qb.z[1]) && s.contains("@")) {
                Log.i(qb.z[2] + s);
                edit.remove(s);
            }
            if (i) {
                break;
            }
        }
        edit.commit();
        return null;
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
}
