// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum ae
{
    public static final ae BALANCE_PERSONAL;
    public static final ae BALANCE_WORKSPACE;
    public static final ae PERSONAL;
    public static final ae WORKSPACE;
    private static final ae[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[4];
        String s = "v\fhL\"w\b{Z#f\u0006w]-w\b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'l';
                        break;
                    }
                    case 0: {
                        c2 = '4';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = '$';
                        break;
                    }
                    case 3: {
                        c2 = '\r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "c\u0002vF?d\fgH";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "v\fhL\"w\b{])f\u001ekC-x";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "d\bv^#z\fh";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        PERSONAL = new ae(ae.z[3], 0, 1);
        WORKSPACE = new ae(ae.z[1], 1, 2);
        BALANCE_PERSONAL = new ae(ae.z[2], 2, 3);
        BALANCE_WORKSPACE = new ae(ae.z[0], 3, 4);
        b = new ae[] { ae.PERSONAL, ae.WORKSPACE, ae.BALANCE_PERSONAL, ae.BALANCE_WORKSPACE };
    }
    
    private ae(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
