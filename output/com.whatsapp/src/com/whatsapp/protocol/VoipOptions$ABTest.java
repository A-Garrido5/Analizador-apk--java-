// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class VoipOptions$ABTest
{
    private static final String[] z;
    public final String name;
    
    static {
        final String[] z2 = new String[2];
        String s = ";||OJ\u000eEFKT\u001f\u0003";
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
                        c2 = '9';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = '>';
                        break;
                    }
                    case 2: {
                        c2 = '(';
                        break;
                    }
                    case 3: {
                        c2 = '*';
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
                    s = "\u0014_EO";
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
    
    public VoipOptions$ABTest(final String name) {
        this.name = name;
    }
    
    public static VoipOptions$ABTest fromProtocolTreeNode(final c0 c0) {
        if (c0 == null) {
            return null;
        }
        return new VoipOptions$ABTest(c0.c(VoipOptions$ABTest.z[1]));
    }
    
    @Override
    public String toString() {
        return VoipOptions$ABTest.z[0] + this.name + "}";
    }
}
