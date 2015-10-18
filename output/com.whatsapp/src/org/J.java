// 
// Decompiled by Procyon v0.5.30
// 

package org;

public class J extends Exception
{
    public static boolean c = false;
    private static final long serialVersionUID = -2516777155928793597L;
    private static final String z;
    private final String a;
    private final int b;
    
    static {
        final char[] charArray = "9`".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001a';
                    break;
                }
                case 0: {
                    c2 = '\u0003';
                    break;
                }
                case 1: {
                    c2 = '@';
                    break;
                }
                case 2: {
                    c2 = '\u001e';
                    break;
                }
                case 3: {
                    c2 = 'h';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public J(final String a, final int b) {
        final boolean c = J.c;
        this.b = b;
        this.a = a;
        if (l.a != 0) {
            J.c = !c;
        }
    }
    
    @Override
    public String getMessage() {
        final boolean c = J.c;
        final String string = this.a + J.z + this.b;
        if (c) {
            ++l.a;
        }
        return string;
    }
}
