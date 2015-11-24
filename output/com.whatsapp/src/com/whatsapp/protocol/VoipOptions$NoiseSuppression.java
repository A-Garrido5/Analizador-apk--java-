// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class VoipOptions$NoiseSuppression
{
    private static final String[] z;
    public final Boolean builtinEnabled;
    public final Short mode;
    
    static {
        final String[] z2 = new String[5];
        String s = "0w@#";
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
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = ']';
                        break;
                    }
                    case 1: {
                        c2 = '\u0018';
                        break;
                    }
                    case 2: {
                        c2 = '$';
                        break;
                    }
                    case 3: {
                        c2 = 'F';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "0w@#";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "?mM*l4v";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0013wM5}\u000emT6j8kW/w3cI)|8%";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "q8F3q1lM(]3yF*}9%";
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
    }
    
    public VoipOptions$NoiseSuppression(final Short mode, final Boolean builtinEnabled) {
        this.mode = mode;
        this.builtinEnabled = builtinEnabled;
    }
    
    public static VoipOptions$NoiseSuppression fromProtocolTreeNode(final c0 c0) {
        if (c0 == null) {
            return null;
        }
        return new VoipOptions$NoiseSuppression(VoipOptions.access$100(c0.c(VoipOptions$NoiseSuppression.z[0]), VoipOptions$NoiseSuppression.z[1], 0, 3), VoipOptions.access$200(c0.c(VoipOptions$NoiseSuppression.z[2])));
    }
    
    @Override
    public String toString() {
        return VoipOptions$NoiseSuppression.z[3] + this.mode + VoipOptions$NoiseSuppression.z[4] + this.builtinEnabled + '}';
    }
}
