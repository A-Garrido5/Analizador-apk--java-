// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public abstract class gm extends fE
{
    private static final String z;
    
    static {
        final char[] charArray = "*\u000e\u0019\"\u0003\u0017\u0015P\"V\u000e\u0016\u001f\"F\u001aF\u0004>\u0003\u001c\u0003P>U\u001b\u0014\u00028G\u001a\u0003\u001eqA\u0007F\u0003$A\u001d\n\u0011\"P\u001b\u0015^".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '#';
                    break;
                }
                case 0: {
                    c2 = '~';
                    break;
                }
                case 1: {
                    c2 = 'f';
                    break;
                }
                case 2: {
                    c2 = 'p';
                    break;
                }
                case 3: {
                    c2 = 'Q';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public gm a() {
        throw new UnsupportedOperationException(gm.z);
    }
    
    public abstract gm a(final dD p0);
    
    public abstract dD b();
    
    @Override
    public fE clone() {
        return this.a();
    }
    
    @Override
    public Object clone() {
        return this.a();
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.b();
    }
}
