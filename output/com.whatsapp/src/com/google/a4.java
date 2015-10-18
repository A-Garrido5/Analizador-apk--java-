// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class a4 extends RuntimeException
{
    private static final long serialVersionUID = 5469741279507848266L;
    private static final String z;
    
    static {
        final char[] charArray = ">c2Hd8{8x%\u0006g9Z'\u0001+,Z7Jj7I!\u000bo\"\u001b'\u000bg7^ Jj5_d\tj5U+\u001e+9^d\tj7W!\u000e+6N(\u001eb+W!J\u007f2V!\u0019%".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'D';
                    break;
                }
                case 0: {
                    c2 = 'j';
                    break;
                }
                case 1: {
                    c2 = '\u000b';
                    break;
                }
                case 2: {
                    c2 = '[';
                    break;
                }
                case 3: {
                    c2 = ';';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public a4() {
        super(a4.z);
    }
}
