// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum Voip$CallState
{
    private static final Voip$CallState[] $VALUES;
    public static final Voip$CallState ACCEPT_RECEIVED;
    public static final Voip$CallState ACCEPT_SENT;
    public static final Voip$CallState ACTIVE;
    public static final Voip$CallState CALLING;
    public static final Voip$CallState NONE;
    public static final Voip$CallState RECEIVED_CALL;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "*_q>";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\b';
                        break;
                    }
                    case 0: {
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = '{';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "%Sk2^!";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "'Qs7A*W";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "%S|>X0Ol>F0";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "6U|>A2U{$K%\\s";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "%S|>X0Om>K!Yi>L";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        NONE = new Voip$CallState(Voip$CallState.z[0], 0);
        CALLING = new Voip$CallState(Voip$CallState.z[2], 1);
        RECEIVED_CALL = new Voip$CallState(Voip$CallState.z[4], 2);
        ACCEPT_SENT = new Voip$CallState(Voip$CallState.z[3], 3);
        ACCEPT_RECEIVED = new Voip$CallState(Voip$CallState.z[5], 4);
        ACTIVE = new Voip$CallState(Voip$CallState.z[1], 5);
        $VALUES = new Voip$CallState[] { Voip$CallState.NONE, Voip$CallState.CALLING, Voip$CallState.RECEIVED_CALL, Voip$CallState.ACCEPT_SENT, Voip$CallState.ACCEPT_RECEIVED, Voip$CallState.ACTIVE };
    }
    
    private Voip$CallState(final String s, final int n) {
    }
}
