// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.m;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.b2;

final class dn implements Runnable
{
    private static final String[] z;
    private final b2[] a;
    private final byte[] b;
    private final int c;
    private final b2 d;
    final a9v e;
    private final boolean f;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u00049&z;\u0011-ie1\u000b% x3E3,b&\u001ca;s7\u0000(9boE,,e'\u0004&,8?\u00008t";
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
                        c2 = 'T';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = 'A';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
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
                    s = "^a%y7\u0004-\u001bs3\f2=d5\u0011(&x\u001d\u0001|";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u00049&z;\u0011-ix1\u0000%:6 \na:s:\u0001a;s \u00178id1\u0006$ f ^a$s'\u0016 .sz\u000e$0+";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u00049&z;\u0011-ie1\u000b% x3E-&u5\ta9d1E*,o'E5&6'\u00003?s&^a%y7\u0004-\u001bs3\f2=d5\u0011(&x\u001d\u0001|";
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
    
    dn(final a9v e, final ha ha) {
        this.e = e;
        this.f = ha.i();
        this.c = ha.b();
        this.b = ha.a();
        this.a = ha.e();
        this.d = ha.g().b();
    }
    
    @Override
    public void run() {
        if (a9v.a(this.e).e()) {
            Log.i(dn.z[2] + a9v.a(this.e).a);
            final byte[] a = m.a(this.c);
            Label_0130: {
                if (this.f) {
                    Log.i(dn.z[3] + this.c);
                    App.a(this.b, a, (byte)5, this.a, this.d);
                    if (!App.I) {
                        break Label_0130;
                    }
                }
                if (a9v.a(this.e).y > 1) {
                    App.aY();
                }
            }
            Log.i(dn.z[0] + a9v.a(this.e).a + dn.z[1] + this.c);
            App.a(a9v.a(this.e), 1 + a9v.a(this.e).y, a);
        }
    }
}
