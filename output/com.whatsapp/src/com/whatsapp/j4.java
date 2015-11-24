// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.ConditionVariable;
import java.util.List;

public class j4 extends j1
{
    private static final String[] z;
    String b;
    boolean c;
    List d;
    int e;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0010\"H=-\u000f(X,c\tmV:j\u000e";
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
                        c2 = '\r';
                        break;
                    }
                    case 0: {
                        c2 = '}';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = 'I';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0010>\\i|\b(I0-\u0014)\u0001i";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\f?d$~\u001a>\u001b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "]9B9hGm";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "]nV:j\u000ew\u001b";
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
    
    public j4(final String b, final List d, final int e, final boolean c) {
        this.b = b;
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    @Override
    public boolean a() {
        return this.c || super.a();
    }
    
    @Override
    public String b() {
        String string;
        if (this.b == null) {
            string = j4.z[0];
        }
        else {
            string = j4.z[1] + this.b;
        }
        return j4.z[2] + string + j4.z[3] + this.e + j4.z[4] + this.d.size();
    }
    
    @Override
    public void c() {
        App.a(this.b, this.d, this.e, false, this.c, null, null);
    }
}
