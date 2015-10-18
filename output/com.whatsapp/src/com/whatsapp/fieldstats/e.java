// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum e
{
    public static final e INVALID_MESSAGE;
    public static final e INVALID_PADDING;
    public static final e INVALID_PROTOCOL_BUFFER;
    public static final e INVALID_VERSION;
    public static final e LEGACY_MESSAGE;
    public static final e NO_SESSION_AVAILABLE;
    public static final e PLAINTEXT_BYTE_MISMATCH;
    public static final e PRE_KEY_MESSAGE_INVALID_KEY;
    public static final e PRE_KEY_MESSAGE_MISSING_PRE_KEY;
    public static final e UNKNOWN_CIPHERTEXT_TYPE;
    public static final e UNKNOWN_CIPHERTEXT_VERSION;
    public static final e UNTRUSTED_IDENTITY;
    private static final e[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[12];
        String s = "\t\f1^I\u0014\u0010'BB\u0018\u00028LE\u000b\u0002,AI";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\f';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = 'C';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
                        break;
                    }
                    case 3: {
                        c2 = '\r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000e\r8L@\u000e\u00071]^\b\u0017!NC\u000b\u001c,XJ\u0001\u0006<";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000e\r8L@\u000e\u00071[I\u0015\u0010'BB";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0012\r:_Y\u0014\u0017+IS\u000e\u0007+CX\u000e\u00177";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0017\u000f/DB\u0013\u00066YS\u0005\u001a:HS\n\n=@M\u0013\u0000&";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000e\r8L@\u000e\u00071]M\u0003\u0007'CK";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0017\u0011+RG\u0002\u001a1@I\u0014\u0010/JI\u0018\n [M\u000b\n*RG\u0002\u001a";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0012\r%CC\u0010\r1NE\u0017\u000b+_X\u0002\u001b:RZ\u0002\u0011=DC\t";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u000e\r8L@\u000e\u00071@I\u0014\u0010/JI";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0017\u0011+RG\u0002\u001a1@I\u0014\u0010/JI\u0018\u000e'^_\u000e\r)R\\\u0015\u00061FI\u001e";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0012\r%CC\u0010\r1NE\u0017\u000b+_X\u0002\u001b:RX\u001e\u0013+";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u000b\u0006)LO\u001e\u001c#H_\u0014\u0002)H";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        INVALID_MESSAGE = new e(e.z[8], 0, 0);
        LEGACY_MESSAGE = new e(e.z[11], 1, 1);
        INVALID_VERSION = new e(e.z[2], 2, 2);
        PRE_KEY_MESSAGE_MISSING_PRE_KEY = new e(e.z[9], 3, 3);
        PRE_KEY_MESSAGE_INVALID_KEY = new e(e.z[6], 4, 4);
        UNTRUSTED_IDENTITY = new e(e.z[3], 5, 5);
        NO_SESSION_AVAILABLE = new e(e.z[0], 6, 6);
        PLAINTEXT_BYTE_MISMATCH = new e(e.z[4], 7, 7);
        UNKNOWN_CIPHERTEXT_TYPE = new e(e.z[10], 8, 8);
        UNKNOWN_CIPHERTEXT_VERSION = new e(e.z[7], 9, 9);
        INVALID_PADDING = new e(e.z[5], 10, 10);
        INVALID_PROTOCOL_BUFFER = new e(e.z[1], 11, 11);
        b = new e[] { e.INVALID_MESSAGE, e.LEGACY_MESSAGE, e.INVALID_VERSION, e.PRE_KEY_MESSAGE_MISSING_PRE_KEY, e.PRE_KEY_MESSAGE_INVALID_KEY, e.UNTRUSTED_IDENTITY, e.NO_SESSION_AVAILABLE, e.PLAINTEXT_BYTE_MISMATCH, e.UNKNOWN_CIPHERTEXT_TYPE, e.UNKNOWN_CIPHERTEXT_VERSION, e.INVALID_PADDING, e.INVALID_PROTOCOL_BUFFER };
    }
    
    private e(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
