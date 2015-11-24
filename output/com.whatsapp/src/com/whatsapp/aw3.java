// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Arrays;

public class aw3
{
    private static final String[] z;
    public int a;
    public byte[] b;
    public byte[] c;
    
    static {
        final String[] z2 = new String[3];
        String s = "<\u001dJ[s\u000b\u0010[jQ\u001e\u0001l}i\u000e\u0014J8A\u0018\u0017Z}'";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001a';
                        break;
                    }
                    case 0: {
                        c2 = '{';
                        break;
                    }
                    case 1: {
                        c2 = 'x';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = '\u0018';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "WX_{y\u0014\rPlR\u001a\u000bV%";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "WXU}cF";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public aw3(final int a, final byte[] b, final byte[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String toString() {
        return aw3.z[0] + this.a + aw3.z[2] + Arrays.toString(this.b) + aw3.z[1] + Arrays.toString(this.c) + "]";
    }
}
