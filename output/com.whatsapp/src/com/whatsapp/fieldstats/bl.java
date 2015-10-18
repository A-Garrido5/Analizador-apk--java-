// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum bl
{
    public static final bl MIXED;
    public static final bl P2P;
    public static final bl TCP_RELAY;
    public static final bl UDP_RELAY;
    private static final bl[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[4];
        String s = "J<\u001b\u00188[3\n\u001e";
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
                        c2 = 'j';
                        break;
                    }
                    case 0: {
                        c2 = '\u001e';
                        break;
                    }
                    case 1: {
                        c2 = '\u007f';
                        break;
                    }
                    case 2: {
                        c2 = 'K';
                        break;
                    }
                    case 3: {
                        c2 = 'G';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "K;\u001b\u00188[3\n\u001e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "S6\u0013\u0002.";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "NM\u001b";
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
        P2P = new bl(bl.z[3], 0, 1);
        UDP_RELAY = new bl(bl.z[1], 1, 2);
        TCP_RELAY = new bl(bl.z[0], 2, 3);
        MIXED = new bl(bl.z[2], 3, 4);
        b = new bl[] { bl.P2P, bl.UDP_RELAY, bl.TCP_RELAY, bl.MIXED };
    }
    
    private bl(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
