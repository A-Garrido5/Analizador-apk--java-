// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum i8
{
    public static final i8 AUDIO_ENGINE_JNI;
    public static final i8 AUDIO_ENGINE_NONE;
    public static final i8 AUDIO_ENGINE_OPENSL;
    private static final i8[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "4_,7\u0015*O&9\u0013;O70\u0015;O";
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
                        c2 = 'Z';
                        break;
                    }
                    case 0: {
                        c2 = 'u';
                        break;
                    }
                    case 1: {
                        c2 = '\n';
                        break;
                    }
                    case 2: {
                        c2 = 'h';
                        break;
                    }
                    case 3: {
                        c2 = '~';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "4_,7\u0015*O&9\u0013;O71\n0D;2";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "4_,7\u0015*O&9\u0013;O74\u0014<";
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
        AUDIO_ENGINE_NONE = new i8(i8.z[0], 0);
        AUDIO_ENGINE_JNI = new i8(i8.z[2], 1);
        AUDIO_ENGINE_OPENSL = new i8(i8.z[1], 2);
        a = new i8[] { i8.AUDIO_ENGINE_NONE, i8.AUDIO_ENGINE_JNI, i8.AUDIO_ENGINE_OPENSL };
    }
    
    private i8(final String s, final int n) {
    }
}
