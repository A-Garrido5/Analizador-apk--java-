// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class VoipOptions$Encode
{
    private static final String[] z;
    public final Short complexity;
    public final Boolean enableConstantBitrate;
    public final Boolean enableDiscontinuousTransmission;
    public final Boolean forwardErrorCorrection;
    public final Integer targetBitrate;
    
    static {
        final String[] z2 = new String[13];
        String s = "6g\u0012F70p\u0016B\"";
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
                        c2 = '[';
                        break;
                    }
                    case 0: {
                        c2 = 'U';
                        break;
                    }
                    case 1: {
                        c2 = '\b';
                        break;
                    }
                    case 2: {
                        c2 = '\u007f';
                        break;
                    }
                    case 3: {
                        c2 = '6';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "1|\u0007";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "7a\u000bD:!m";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "7a\u000bD:!m";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "6g\u0012F70p\u0016B\"";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "3m\u001c";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "6j\r";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "4}\u000bY";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "y(\u001aX:7d\u001au4;{\u000bW5!J\u0016B)4|\u001a\u000b";
                    n = 7;
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "y(\u0019Y)\"i\rR\u001e'z\u0010D\u0018:z\rS8!a\u0010Xf";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0010f\u001cY?0s\u001cY6%d\u001aN2!qB";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "y(\u000bW)2m\u000bt2!z\u001eB>h";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "y(\u001aX:7d\u001ar2&k\u0010X/<f\nY.&\\\rW5&e\u0016E(<g\u0011\u000b";
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
    
    public VoipOptions$Encode(final Short complexity, final Boolean enableConstantBitrate, final Boolean enableDiscontinuousTransmission, final Integer targetBitrate, final Boolean forwardErrorCorrection) {
        this.complexity = complexity;
        this.enableConstantBitrate = enableConstantBitrate;
        this.enableDiscontinuousTransmission = enableDiscontinuousTransmission;
        this.targetBitrate = targetBitrate;
        this.forwardErrorCorrection = forwardErrorCorrection;
    }
    
    public static VoipOptions$Encode fromProtocolTreeNode(final c0 c0) {
        if (c0 == null) {
            return null;
        }
        final String c2 = c0.c(VoipOptions$Encode.z[0]);
        final String c3 = c0.c(VoipOptions$Encode.z[6]);
        final String c4 = c0.c(VoipOptions$Encode.z[1]);
        final String c5 = c0.c(VoipOptions$Encode.z[3]);
        final String c6 = c0.c(VoipOptions$Encode.z[5]);
        final Short access$100 = VoipOptions.access$100(c2, VoipOptions$Encode.z[4], 1, 10);
        final Boolean access$101 = VoipOptions.access$200(c3);
        final Boolean access$102 = VoipOptions.access$200(c4);
        final boolean equals = VoipOptions$Encode.z[7].equals(c5);
        Integer access$103 = null;
        if (!equals) {
            access$103 = VoipOptions.access$300(c5, VoipOptions$Encode.z[2], 6000, 51000);
        }
        return new VoipOptions$Encode(access$100, access$101, access$102, access$103, VoipOptions.access$200(c6));
    }
    
    @Override
    public String toString() {
        return VoipOptions$Encode.z[10] + this.complexity + VoipOptions$Encode.z[8] + this.enableConstantBitrate + VoipOptions$Encode.z[12] + this.enableDiscontinuousTransmission + VoipOptions$Encode.z[11] + this.targetBitrate + VoipOptions$Encode.z[9] + this.forwardErrorCorrection + '}';
    }
}
