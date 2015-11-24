// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum k
{
    public static final k JNI;
    public static final k OPENSLES;
    private static final k[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[2];
        String s = "/H'";
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
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
                        break;
                    }
                    case 3: {
                        c2 = 'y';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "*V+7U)C=";
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
        JNI = new k(k.z[0], 0, 1);
        OPENSLES = new k(k.z[1], 1, 2);
        a = new k[] { k.JNI, k.OPENSLES };
    }
    
    private k(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
