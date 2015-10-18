// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class VoipOptions$Decode
{
    private static final String[] z;
    public final Boolean forwardErrorCorrection;
    public final Short gain;
    public final Short plc;
    
    static {
        final String[] z2 = new String[8];
        String s = "\u0004?\u000bm";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'O';
                        break;
                    }
                    case 0: {
                        c2 = 'c';
                        break;
                    }
                    case 1: {
                        c2 = '^';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = '\u0003';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0004?\u000bm";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0005;\u0001";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u00132\u0001";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u00132\u0001";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "';\u0001l+\u0006%\u0005b&\rc";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u00051\u0010t.\u0011:'q=\f,!l=\u0011;\u0001w&\f0_";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u00132\u0001>";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public VoipOptions$Decode(final Short gain, final Boolean forwardErrorCorrection, final Short plc) {
        this.gain = gain;
        this.forwardErrorCorrection = forwardErrorCorrection;
        this.plc = plc;
    }
    
    public static VoipOptions$Decode fromProtocolTreeNode(final c0 c0) {
        if (c0 == null) {
            return null;
        }
        return new VoipOptions$Decode(VoipOptions.access$500(c0.c(VoipOptions$Decode.z[0]), VoipOptions$Decode.z[1]), VoipOptions.access$200(c0.c(VoipOptions$Decode.z[2])), VoipOptions.access$500(c0.c(VoipOptions$Decode.z[3]), VoipOptions$Decode.z[4]));
    }
    
    @Override
    public String toString() {
        return VoipOptions$Decode.z[5] + this.gain + VoipOptions$Decode.z[6] + this.forwardErrorCorrection + VoipOptions$Decode.z[7] + this.plc + '}';
    }
}
