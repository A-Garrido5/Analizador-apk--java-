// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.V;
import org.whispersystems.o;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.cr;
import com.whatsapp.protocol.c6;

class m2 implements Runnable
{
    private static final String[] z;
    final c6 a;
    final ie b;
    final cr c;
    
    static {
        final String[] z2 = new String[2];
        String s = "P\u001e\u0016\u0016]E\nY\u001eW]\u0003\r\u0013\\VF\n\u001fAB\u000f\u0016\u0014A\u0011\u0000\u0016\b\u0012";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '2';
                        break;
                    }
                    case 0: {
                        c2 = '1';
                        break;
                    }
                    case 1: {
                        c2 = 'f';
                        break;
                    }
                    case 2: {
                        c2 = 'y';
                        break;
                    }
                    case 3: {
                        c2 = 'z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u0011\u0002\f\u001f\u0012E\tY\tWC\u0010\u001c\b\u0012A\n\u0018\u0013\\E\u0003\u0001\u000e\u0012C\u0003\u001a\u001f[A\u0012Y\u001c]CF";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    m2(final ie b, final c6 a, final cr c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        final V g = ha.g(this.a.a);
        Log.i(m2.z[0] + g + m2.z[1] + this.a);
        ie.a(this.b).a2.b(g.b());
        ie.a(this.b).a2.b(g.b(), null);
        ie.a(this.b).a5().post((Runnable)new x0(this));
    }
}
