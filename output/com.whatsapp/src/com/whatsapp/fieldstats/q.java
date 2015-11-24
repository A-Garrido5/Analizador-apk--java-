// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum q
{
    public static final q MAIN;
    public static final q SHARE_EXT;
    private static final q[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0001hG=";
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
                        c2 = 'P';
                        break;
                    }
                    case 0: {
                        c2 = 'L';
                        break;
                    }
                    case 1: {
                        c2 = ')';
                        break;
                    }
                    case 2: {
                        c2 = '\u000e';
                        break;
                    }
                    case 3: {
                        c2 = 's';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001faO!\u0015\u0013lV'";
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
        MAIN = new q(q.z[0], 0, 1);
        SHARE_EXT = new q(q.z[1], 1, 2);
        a = new q[] { q.MAIN, q.SHARE_EXT };
    }
    
    private q(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
