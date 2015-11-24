// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import java.io.Serializable;
import android.os.Bundle;

public abstract class c
{
    public static int b;
    private static final String[] z;
    protected final i a;
    
    static {
        final String[] z2 = new String[10];
        String s = "R=1L9S=qY$T7k\u0005.@=q_)C+1N9D7mO\"W4pLe[=lX*Q=";
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
                        c2 = 'K';
                        break;
                    }
                    case 0: {
                        c2 = '6';
                        break;
                    }
                    case 1: {
                        c2 = 'X';
                        break;
                    }
                    case 2: {
                        c2 = '\u001f';
                        break;
                    }
                    case 3: {
                        c2 = '+';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "R=1L9S=qY$T7k\u0005.@=q_)C+1N9D7mO\"W4pLeP1qB8^\u0007~M?S*@O\"W4pL";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "R=1L9S=qY$T7k\u0005.@=q_)C+1N9D7mO\"W4pLeP1qB8^\u0007~M?S*@O\"W4pL";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "R=1L9S=qY$T7k\u0005.@=q_)C+1N9D7mO\"W4pLeB1kG.";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "R=1L9S=qY$T7k\u0005.@=q_)C+1N9D7mO\"W4pLeB1kG.";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "R=1L9S=qY$T7k\u0005.@=q_)C+1N9D7mO\"W4pLeS.zE?i,f[.i7qt(Z7lN";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "R=1L9S=qY$T7k\u0005.@=q_)C+1N9D7mO\"W4pLe_;pE\u0014_<";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "R=1L9S=qY$T7k\u0005.@=q_)C+1N9D7mO\"W4pLe[=lX*Q=";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "R=1L9S=qY$T7k\u0005.@=q_)C+1N9D7mO\"W4pLe_;pE\u0014_<";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "R=1L9S=qY$T7k\u0005.@=q_)C+1N9D7mO\"W4pLeS.zE?i,f[.i7qt(Z7lN";
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
    
    protected c(final i a) {
        this.a = a;
    }
    
    protected Object a(final k k, final boolean b, final Bundle bundle) {
        if (k.b()) {
            return null;
        }
        Bundle bundle2 = null;
        Label_0037: {
            if (bundle != null) {
                bundle2 = (Bundle)bundle.clone();
                if (c.b == 0) {
                    break Label_0037;
                }
            }
            bundle2 = new Bundle();
        }
        if (!bundle2.containsKey(c.z[3])) {
            bundle2.putString(c.z[4], this.b(k, bundle2));
        }
        if (!bundle2.containsKey(c.z[0])) {
            bundle2.putString(c.z[7], this.a(k, bundle2));
        }
        if (!bundle2.containsKey(c.z[1])) {
            bundle2.putBoolean(c.z[2], b);
        }
        if (!bundle2.containsKey(c.z[5]) && this.a.f != null) {
            bundle2.putSerializable(c.z[9], (Serializable)this.a.f);
        }
        if (!bundle2.containsKey(c.z[8]) && this.a.h != 0) {
            bundle2.putInt(c.z[6], this.a.h);
        }
        return this.c(k, bundle2);
    }
    
    protected String a(final k k, final Bundle bundle) {
        return this.a.d.getString(this.a.a(k.a));
    }
    
    protected String b(final k k, final Bundle bundle) {
        return this.a.d.getString(this.a.b);
    }
    
    protected abstract Object c(final k p0, final Bundle p1);
}
