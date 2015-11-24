// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class VoipOptions$Agc
{
    private static final String[] z;
    public final Boolean builtinEnabled;
    public final Short compressionGain;
    public final Boolean enableLimiter;
    public final Short mode;
    public final Short targetLevel;
    
    static {
        final String[] z2 = new String[13];
        String s = "sZ4\u0010usW#\u0001uk";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0010';
                        break;
                    }
                    case 0: {
                        c2 = '\u0007';
                        break;
                    }
                    case 1: {
                        c2 = ';';
                        break;
                    }
                    case 2: {
                        c2 = 'F';
                        break;
                    }
                    case 3: {
                        c2 = 'w';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "eN/\u001bdnU";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "jT\"\u0012";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "jT\"\u0012";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "sZ4\u0010us\u001b*\u0012fbW";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "dT+\u0007bbH5\u001e\u007fi\u001b!\u0016yi";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "dT+\u0007bbH5\u001e\u007fi\\'\u001e~";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    s = "kR+\u001edbI#\u0019qeW#";
                    n = 6;
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    array = z2;
                    s = "F\\%\fdfI!\u0012dK^0\u0012|:";
                    n = 7;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "+\u001b#\u0019qeW#;yjR2\u0012b:";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "+\u001b+\u0018tb\u0006";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "+\u001b$\u0002ykO/\u0019UiZ$\u001buc\u0006";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "+\u001b%\u0018}wI#\u0004cnT(0qnU{";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public VoipOptions$Agc(final Short targetLevel, final Short compressionGain, final Boolean enableLimiter, final Short mode, final Boolean builtinEnabled) {
        this.targetLevel = targetLevel;
        this.compressionGain = compressionGain;
        this.enableLimiter = enableLimiter;
        this.mode = mode;
        this.builtinEnabled = builtinEnabled;
    }
    
    public static VoipOptions$Agc fromProtocolTreeNode(final c0 c0) {
        if (c0 == null) {
            return null;
        }
        return new VoipOptions$Agc(VoipOptions.access$100(c0.c(VoipOptions$Agc.z[0]), VoipOptions$Agc.z[4], 0, 31), VoipOptions.access$100(c0.c(VoipOptions$Agc.z[6]), VoipOptions$Agc.z[5], 0, 90), VoipOptions.access$200(c0.c(VoipOptions$Agc.z[7])), VoipOptions.access$100(c0.c(VoipOptions$Agc.z[2]), VoipOptions$Agc.z[3], 0, 2), VoipOptions.access$200(c0.c(VoipOptions$Agc.z[1])));
    }
    
    @Override
    public String toString() {
        return VoipOptions$Agc.z[8] + this.targetLevel + VoipOptions$Agc.z[12] + this.compressionGain + VoipOptions$Agc.z[9] + this.enableLimiter + VoipOptions$Agc.z[10] + this.mode + VoipOptions$Agc.z[11] + this.builtinEnabled + '}';
    }
}
