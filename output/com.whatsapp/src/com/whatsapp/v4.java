// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum v4
{
    public static final v4 VOICE;
    private static final v4[] a;
    private static final String[] z;
    private final String b;
    
    static {
        final String[] z2 = new String[2];
        String s = "U\u0015\u0013[\u0005";
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
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = '\u0003';
                        break;
                    }
                    case 1: {
                        c2 = 'Z';
                        break;
                    }
                    case 2: {
                        c2 = 'Z';
                        break;
                    }
                    case 3: {
                        c2 = '\u0018';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u53{%";
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
        VOICE = new v4(v4.z[0], 0, v4.z[1]);
        a = new v4[] { v4.VOICE };
    }
    
    private v4(final String s, final int n, final String b) {
        this.b = b;
    }
    
    public String getType() {
        return this.b;
    }
}
