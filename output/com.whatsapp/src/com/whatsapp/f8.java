// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum f8
{
    public static final f8 CRASH;
    public static final f8 VOICE;
    private static final f8[] b;
    private static final String[] z;
    private final String a;
    
    static {
        final String[] z2 = new String[4];
        String s = "0O\r}G";
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
                        c2 = '\"';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = ' ';
                        break;
                    }
                    case 2: {
                        c2 = 'd';
                        break;
                    }
                    case 3: {
                        c2 = '\u001e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0005r%Mj";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "%R\u0005mJ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0010o-]g";
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
        CRASH = new f8(f8.z[1], 0, f8.z[2]);
        VOICE = new f8(f8.z[3], 1, f8.z[0]);
        b = new f8[] { f8.CRASH, f8.VOICE };
    }
    
    private f8(final String s, final int n, final String a) {
        this.a = a;
    }
    
    public String getType() {
        return this.a;
    }
}
