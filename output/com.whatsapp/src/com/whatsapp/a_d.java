// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.InputStream;
import java.io.File;
import android.content.SharedPreferences$Editor;
import com.whatsapp.util.Log;
import android.content.SharedPreferences;

public class a_d extends a_9
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[10];
        String s = "lF-\u0005\u0004pQ\u001d\u0013\u0005s@-<\u000biX.<\u0004x";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = '\u001c';
                        break;
                    }
                    case 1: {
                        c2 = '4';
                        break;
                    }
                    case 2: {
                        c2 = 'B';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u007f[/M\u001atU6\u0010\flD\u001d\u0013\u001fyR'\u0011\brW'\u0010";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "lF-\u0005\u0004pQ\u001d\u0013\u0005s@-<\u0019tA/\u00012uP";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\\Gl\u0014\u0005}@1\u0002\u001dl\u001a,\u0006\u0019";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "qQl\t\u001d{";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "qQ";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u007f[/M\u001atU6\u0010\flD\u001d\u0013\u001fyR'\u0011\brW'\u0010";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "lF-\u0005\u0004pQ\u001d\u0013\u0005s@-<\u000biX.<\u0004x";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u007f[,\u0017\f\u007f@/\u0002\u0003}S'\u0011BoQ6\u0013\u001fsR+\u000f\bl\\-\u0017\u0002uPm\u0005\fuX'\u0007";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "lF-\u0005\u0004pQ\u001d\u0013\u0005s@-<\u0019tA/\u00012uP";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public a_d() {
        super(App.au() + a_d.z[3]);
        final SharedPreferences sharedPreferences = App.aq.getSharedPreferences(a_d.z[1], 0);
        this.q = sharedPreferences.getInt(a_d.z[2], 0);
        this.v = sharedPreferences.getInt(a_d.z[0], 0);
    }
    
    @Override
    public void a(final int v, final int q) {
        this.v = v;
        this.q = q;
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(a_d.z[6], 0).edit();
        edit.putInt(a_d.z[9], q);
        edit.putInt(a_d.z[7], v);
        if (!edit.commit()) {
            Log.e(a_d.z[8]);
        }
    }
    
    @Override
    public File b() {
        return new File(App.aq.getFilesDir(), a_d.z[4]);
    }
    
    @Override
    public boolean b(final boolean b) {
        return false;
    }
    
    @Override
    protected InputStream c(final boolean b) {
        return null;
    }
    
    @Override
    public File y() {
        return a_9.g(a_d.z[5]);
    }
}
