// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum ap
{
    public static final ap MESSAGE;
    public static final ap PREKEY_MESSAGE;
    public static final ap SENDER_KEY_MESSAGE;
    private static final ap[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[3];
        String s = "J(~i[C%vgMI;|g";
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
                        c2 = '\u001e';
                        break;
                    }
                    case 0: {
                        c2 = '\u001a';
                        break;
                    }
                    case 1: {
                        c2 = 'z';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = '\"';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "W?hq_]?";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "I?uf[H%pgGE7~qM[=~";
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
        MESSAGE = new ap(ap.z[1], 0, 0);
        PREKEY_MESSAGE = new ap(ap.z[0], 1, 1);
        SENDER_KEY_MESSAGE = new ap(ap.z[2], 2, 2);
        a = new ap[] { ap.MESSAGE, ap.PREKEY_MESSAGE, ap.SENDER_KEY_MESSAGE };
    }
    
    private ap(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
