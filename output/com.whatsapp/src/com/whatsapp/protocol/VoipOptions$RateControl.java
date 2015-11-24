// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class VoipOptions$RateControl
{
    private static final String[] z;
    public final Integer cellularBitrate;
    public final Boolean disableRateControl;
    public final Integer framesPerPacket;
    public final Integer initBitrate;
    public final Integer maxRTT;
    public final Integer minFramesPerPacket;
    public final Integer minRTT;
    public final Integer pktSizeThresholdBitrate;
    
    static {
        final String[] z2 = new String[23];
        String s = "xE\u0000BU&\u0011\u0019\u001e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0607:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '-';
                        break;
                    }
                    case 0: {
                        c2 = 'T';
                        break;
                    }
                    case 1: {
                        c2 = 'e';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = '#';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "xE\u001dHY\u0007\f\u0017Fy<\u0017\bPE;\t\taD \u0017\fWHi";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "xE\u0000JC\u0012\u0017\fNH'5\bQ}5\u0006\u0006FYi";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "xE\u000bQL9\u0000\u001esH&5\f@F1\u0011P";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "xE\u000eFA8\u0010\u0001B_\u0016\f\u0019QL \u0000P";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0006\u0004\u0019Fn;\u000b\u0019QB8\u001eA\u0003I=\u0016\fAA17\fWH\u0017\n\u0003W_;\tP";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "xE\u0004MD '\u0004W_5\u0011\b\u001e";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "xE\u0000JC&\u0011\u0019\u001e";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "9\f\u0003QY ";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "9\u0004\u0015QY ";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "2\u0015\u001d";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "7\u0000\u0001OX8\u0004\u001f|O=\u0011\u001fBY1";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "$\u000e\u0019|^=\u001f\b|Y<\u0017\bPE\u000b\u0007\u0004W_5\u0011\b";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "7\u0000\u0001OX8\u0004\u001f|O=\u0011\u001fBY1";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "9\u0004\u0015QY ";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "9\f\u0003QY ";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "2\u0015\u001d";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "$\u000e\u0019|^=\u001f\b|Y<\u0017\bPE\u000b\u0007\u0004W_5\u0011\b";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "=\u000b\u0004Wr6\f\u0019QL \u0000";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "=\u000b\u0004Wr6\f\u0019QL \u0000";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "9\f\u0003E]$";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "1\u000b\fAA1";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "9\f\u0003E]$";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    break Label_0607;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public VoipOptions$RateControl(final Boolean disableRateControl, final Integer framesPerPacket, final Integer minRTT, final Integer maxRTT, final Integer initBitrate, final Integer minFramesPerPacket, final Integer cellularBitrate, final Integer pktSizeThresholdBitrate) {
        this.disableRateControl = disableRateControl;
        this.framesPerPacket = framesPerPacket;
        this.minRTT = minRTT;
        this.maxRTT = maxRTT;
        this.initBitrate = initBitrate;
        this.minFramesPerPacket = minFramesPerPacket;
        this.cellularBitrate = cellularBitrate;
        this.pktSizeThresholdBitrate = pktSizeThresholdBitrate;
    }
    
    public static VoipOptions$RateControl fromProtocolTreeNode(final c0 c0) {
        if (c0 == null) {
            return null;
        }
        return new VoipOptions$RateControl(VoipOptions.access$400(VoipOptions.access$200(c0.c(VoipOptions$RateControl.z[21]))), VoipOptions.access$300(c0.c(VoipOptions$RateControl.z[16]), VoipOptions$RateControl.z[10], 0, 8), VoipOptions.access$000(c0.c(VoipOptions$RateControl.z[15]), VoipOptions$RateControl.z[8]), VoipOptions.access$000(c0.c(VoipOptions$RateControl.z[9]), VoipOptions$RateControl.z[14]), VoipOptions.access$000(c0.c(VoipOptions$RateControl.z[18]), VoipOptions$RateControl.z[19]), VoipOptions.access$300(c0.c(VoipOptions$RateControl.z[20]), VoipOptions$RateControl.z[22], 0, 8), VoipOptions.access$000(c0.c(VoipOptions$RateControl.z[13]), VoipOptions$RateControl.z[11]), VoipOptions.access$000(c0.c(VoipOptions$RateControl.z[17]), VoipOptions$RateControl.z[12]));
    }
    
    @Override
    public String toString() {
        return VoipOptions$RateControl.z[5] + this.disableRateControl + VoipOptions$RateControl.z[3] + this.framesPerPacket + VoipOptions$RateControl.z[7] + this.minRTT + VoipOptions$RateControl.z[0] + this.maxRTT + VoipOptions$RateControl.z[6] + this.initBitrate + VoipOptions$RateControl.z[4] + this.cellularBitrate + VoipOptions$RateControl.z[1] + this.pktSizeThresholdBitrate + VoipOptions$RateControl.z[2] + this.minFramesPerPacket + '}';
    }
}
