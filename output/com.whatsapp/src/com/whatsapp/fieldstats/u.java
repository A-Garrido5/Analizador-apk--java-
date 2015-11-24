// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum u
{
    public static final u PLAYBACK;
    public static final u TO_FILE;
    private static final u[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[2];
        String s = "G,rTK_&";
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
                        c2 = '\u0002';
                        break;
                    }
                    case 0: {
                        c2 = '\u0013';
                        break;
                    }
                    case 1: {
                        c2 = 'c';
                        break;
                    }
                    case 2: {
                        c2 = '-';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "C/lK@R f";
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
        PLAYBACK = new u(u.z[1], 0, 1);
        TO_FILE = new u(u.z[0], 1, 2);
        a = new u[] { u.PLAYBACK, u.TO_FILE };
    }
    
    private u(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
