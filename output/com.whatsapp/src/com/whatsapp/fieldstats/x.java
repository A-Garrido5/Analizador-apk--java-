// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum x
{
    public static final x BINDED;
    public static final x UNBOUND;
    private static final x[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0006\u0006r\u0019\u0010\u001d\f";
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
                        c2 = 'E';
                        break;
                    }
                    case 0: {
                        c2 = 'S';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = '0';
                        break;
                    }
                    case 3: {
                        c2 = 'V';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0011\u0001~\u0012\u0000\u0017";
                    n2 = 1;
                    array = z2;
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
        UNBOUND = new x(x.z[0], 0, 1);
        BINDED = new x(x.z[1], 1, 2);
        b = new x[] { x.UNBOUND, x.BINDED };
    }
    
    private x(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
