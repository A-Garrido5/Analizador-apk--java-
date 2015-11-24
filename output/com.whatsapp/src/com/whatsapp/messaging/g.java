// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.b9;

public final class g
{
    private static final String[] z;
    public final b9 a;
    public final Runnable b;
    public final c2 c;
    public final byte[] d;
    
    static {
        final String[] z2 = new String[5];
        String s = ":b\u000bP%y0-C;z \u000fA<+";
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
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = '\u0016';
                        break;
                    }
                    case 1: {
                        c2 = 'B';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
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
                    s = "6 \u0017V2e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ":b\u001cG6r\u0007\u001cP8d\u0001\u000fN;t#\rIj";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ":b\u001dW4u'\u001dQ\u0014w.\u0002@6u)S";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "E'\u0000F\u0011\u007f'\u0002F\u0004b#\u001aQ,p+\u000bN3E6\u000fV$T.\u0001@j";
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
    
    public g(final byte[] d, final Runnable b, final c2 c, final b9 a) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder().append(g.z[4]);
        int length;
        if (this.d != null) {
            length = this.d.length;
        }
        else {
            length = 0;
        }
        return append.append(length).append(g.z[1]).append(g.z[3]).append(this.b).append(g.z[0]).append(this.c).append(g.z[2]).append(this.a).append('}').toString();
    }
}
