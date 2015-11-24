// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public class c_
{
    private static final String z;
    public String a;
    public String b;
    
    static {
        final char[] charArray = "o#\u000b\u0006kbgJ\u0004qo(EGfg)E\bq&%NGks+G".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0005';
                    break;
                }
                case 0: {
                    c2 = '\u0006';
                    break;
                }
                case 1: {
                    c2 = 'G';
                    break;
                }
                case 2: {
                    c2 = '+';
                    break;
                }
                case 3: {
                    c2 = 'g';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public c_(final String a, final String b) {
        Label_0026: {
            if (a != null) {
                if (b != null) {
                    break Label_0026;
                }
            }
            try {
                throw new IllegalArgumentException(c_.z);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.a = a;
        this.b = b;
    }
}
