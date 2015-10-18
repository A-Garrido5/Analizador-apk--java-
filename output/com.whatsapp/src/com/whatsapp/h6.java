// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum h6
{
    public static final h6 EXTENSION_REQUESTED;
    public static final h6 GIFT_RECEIVED;
    public static final h6 PAYMENT_COMPLETED;
    public static final h6 WHATSAPP_INITIATED;
    private static final h6[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "a0-b}w!6ilv-(rvw<<c";
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
                        c2 = '3';
                        break;
                    }
                    case 0: {
                        c2 = '$';
                        break;
                    }
                    case 1: {
                        c2 = 'h';
                        break;
                    }
                    case 2: {
                        c2 = 'y';
                        break;
                    }
                    case 3: {
                        c2 = '\'';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "t) jvj<&d|i85bga,";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "c!?slv-:bzr-=";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "s 8s`e8)xzj!-nrp-=";
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
        WHATSAPP_INITIATED = new h6(h6.z[3], 0);
        EXTENSION_REQUESTED = new h6(h6.z[0], 1);
        PAYMENT_COMPLETED = new h6(h6.z[1], 2);
        GIFT_RECEIVED = new h6(h6.z[2], 3);
        a = new h6[] { h6.WHATSAPP_INITIATED, h6.EXTENSION_REQUESTED, h6.PAYMENT_COMPLETED, h6.GIFT_RECEIVED };
    }
    
    private h6(final String s, final int n) {
    }
}
