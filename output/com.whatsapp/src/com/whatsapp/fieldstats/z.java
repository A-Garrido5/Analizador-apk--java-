// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum z
{
    public static final z EMAIL;
    public static final z SELF;
    public static final z SMS;
    public static final z VOICE;
    private static final z[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[4];
        String s = "\\2j;";
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
                        c2 = 'E';
                        break;
                    }
                    case 0: {
                        c2 = '\u000f';
                        break;
                    }
                    case 1: {
                        c2 = 'w';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\\:u";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Y8o>\u0000";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "J:g4\t";
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
        SMS = new z(com.whatsapp.fieldstats.z.z[1], 0, 1);
        VOICE = new z(com.whatsapp.fieldstats.z.z[2], 1, 2);
        EMAIL = new z(com.whatsapp.fieldstats.z.z[3], 2, 3);
        SELF = new z(com.whatsapp.fieldstats.z.z[0], 3, 4);
        a = new z[] { com.whatsapp.fieldstats.z.SMS, com.whatsapp.fieldstats.z.VOICE, com.whatsapp.fieldstats.z.EMAIL, com.whatsapp.fieldstats.z.SELF };
    }
    
    private z(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
