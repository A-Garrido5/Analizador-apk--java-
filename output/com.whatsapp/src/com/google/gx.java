// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;

public class gx extends IOException
{
    private static final long serialVersionUID = -6947486886997889499L;
    private static final String z;
    
    static {
        final char[] charArray = "_\u0000EQ$S\u001aUD5h<UF%}\u0002\u0001C!oOVF)h\u0006OS`h\u0000\u0001U`z\u0003@@`~\u0016UQ`}\u001dSU9<\u000eOP`n\u000eO\u0014/i\u001b\u0001[&<\u001cQU#yA".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '@';
                    break;
                }
                case 0: {
                    c2 = '\u001c';
                    break;
                }
                case 1: {
                    c2 = 'o';
                    break;
                }
                case 2: {
                    c2 = '!';
                    break;
                }
                case 3: {
                    c2 = '4';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    gx() {
        super(gx.z);
    }
}
