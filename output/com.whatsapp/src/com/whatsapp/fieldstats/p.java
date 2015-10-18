// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum p
{
    public static final p CANCELLED;
    public static final p SENT;
    public static final p TOO_SHORT;
    private static final p[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[3];
        String s = "v|za";
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
                        c2 = '\u000e';
                        break;
                    }
                    case 0: {
                        c2 = '%';
                        break;
                    }
                    case 1: {
                        c2 = '9';
                        break;
                    }
                    case 2: {
                        c2 = '4';
                        break;
                    }
                    case 3: {
                        c2 = '5';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "fxzvKiuqq";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "qv{j]mvfa";
                    n2 = 2;
                    array = z2;
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
        SENT = new p(p.z[0], 0, 1);
        CANCELLED = new p(p.z[1], 1, 2);
        TOO_SHORT = new p(p.z[2], 2, 3);
        b = new p[] { p.SENT, p.CANCELLED, p.TOO_SHORT };
    }
    
    private p(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
