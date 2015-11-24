// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum Voip$DebugTapType
{
    private static final Voip$DebugTapType[] $VALUES;
    public static final Voip$DebugTapType CAPTURED_AND_POST_PROCESSED;
    public static final Voip$DebugTapType OUTGOING_ENCODED;
    public static final Voip$DebugTapType RAW_CAPTURED;
    public static final Voip$DebugTapType RAW_PLAYBACK;
    public static final Voip$DebugTapType RECEIVED_AND_DECODED;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "09^HA6\"MPK1/EKK;";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000e';
                        break;
                    }
                    case 0: {
                        c2 = '\u007f';
                        break;
                    }
                    case 1: {
                        c2 = 'l';
                        break;
                    }
                    case 2: {
                        c2 = '\n';
                        break;
                    }
                    case 3: {
                        c2 = '\u000f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "--]PM><^Z\\:(";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "-)IJG))NPO1(UKK<#NJJ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "--]P^3-SMO<'";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "<-Z[[-)NPO1(U_A,8U_\\0/O\\]:(";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        RECEIVED_AND_DECODED = new Voip$DebugTapType(Voip$DebugTapType.z[2], 0);
        CAPTURED_AND_POST_PROCESSED = new Voip$DebugTapType(Voip$DebugTapType.z[4], 1);
        OUTGOING_ENCODED = new Voip$DebugTapType(Voip$DebugTapType.z[0], 2);
        RAW_CAPTURED = new Voip$DebugTapType(Voip$DebugTapType.z[1], 3);
        RAW_PLAYBACK = new Voip$DebugTapType(Voip$DebugTapType.z[3], 4);
        $VALUES = new Voip$DebugTapType[] { Voip$DebugTapType.RECEIVED_AND_DECODED, Voip$DebugTapType.CAPTURED_AND_POST_PROCESSED, Voip$DebugTapType.OUTGOING_ENCODED, Voip$DebugTapType.RAW_CAPTURED, Voip$DebugTapType.RAW_PLAYBACK };
    }
    
    private Voip$DebugTapType(final String s, final int n) {
    }
}
