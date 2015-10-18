// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum ah
{
    public static final ah BUSY;
    public static final ah NOT_ALLOWED;
    public static final ah NO_MESSAGES;
    public static final ah SUCCESS;
    private static final ah[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0006\u0004b5r\u001b\u0018|?r\u001b";
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
                        c2 = '7';
                        break;
                    }
                    case 0: {
                        c2 = 'H';
                        break;
                    }
                    case 1: {
                        c2 = 'K';
                        break;
                    }
                    case 2: {
                        c2 = '=';
                        break;
                    }
                    case 3: {
                        c2 = 'x';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0006\u0004i'v\u0004\u0007r/r\f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001b\u001e~;r\u001b\u0018";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\n\u001en!";
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
        SUCCESS = new ah(ah.z[2], 0, 1);
        NO_MESSAGES = new ah(ah.z[0], 1, 2);
        BUSY = new ah(ah.z[3], 2, 3);
        NOT_ALLOWED = new ah(ah.z[1], 3, 4);
        a = new ah[] { ah.SUCCESS, ah.NO_MESSAGES, ah.BUSY, ah.NOT_ALLOWED };
    }
    
    private ah(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
