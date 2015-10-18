// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class VoipOptions$Miscellaneous
{
    private static final String[] z;
    public final Integer androidAudioEngine;
    public final Integer androidAudioModeInCall;
    public final Integer androidAudioPlaybackBufferSize;
    public final Integer androidAudioRecordBufferSize;
    public final Integer androidAudioSource;
    public final Integer androidRecordPreset;
    public final Integer audioCallbackThreshold;
    public final Integer callerTimeout;
    public final Boolean enableComfortNoiseGeneration;
    public final Boolean enableHighPassFiltering;
    public final Boolean enableSilenceDetection;
    public final Integer jitterBufferAlgo;
    public final Integer ringbackMode;
    public final Integer ringbackTone;
    public final Integer udpReceiveSocketBufferSize;
    
    static {
        final String[] z2 = new String[42];
        String s = "y\u0019\u0000\u0002N'V\b\bk ]\b\u0003g:]\u0004%D\u0016X\r\u0000\u0017";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1082:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = 'U';
                        break;
                    }
                    case 1: {
                        c2 = '9';
                        break;
                    }
                    case 2: {
                        c2 = 'a';
                        break;
                    }
                    case 3: {
                        c2 = 'l';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "y\u0019\u0000\u0002N'V\b\bk ]\b\u0003y:L\u0013\u000fOh";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "y\u0019\u0004\u0002K7U\u0004$C2Q1\rY&\u007f\b\u0000^0K\b\u0002Mh";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "y\u0019\u000b\u0005^!\\\u0013._3_\u0004\u001ek9^\u000eQ";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "y\u0019\u0002\rF9\\\u00138C8\\\u000e\u0019^h";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "y\u0019\u0013\u0005D2[\u0000\u000fA\u0018V\u0005\t\u0017";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "y\u0019\u0014\bZ\u0007\\\u0002\tC#\\2\u0003I>\\\u0015._3_\u0004\u001ey<C\u0004Q";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "y\u0019\u0000\u0002N'V\b\bk ]\b\u0003x0Z\u000e\u001eN\u0017L\u0007\nO'j\b\u0016Oh";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "y\u0019\u0000\u0002N'V\b\bk ]\b\u0003o;^\b\u0002Oh";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "y\u0019\u0000\u0002N'V\b\bx0Z\u000e\u001eN\u0005K\u0004\u001fO!\u0004";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "y\u0019\u0000\u0019N<V\"\rF9[\u0000\u000fA\u0001Q\u0013\tY=V\r\b\u0017";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0018P\u0012\u000fO9U\u0000\u0002O:L\u0012\u0017O;X\u0003\u0000O\u0016V\f\nE'M/\u0003C&\\&\tD0K\u0000\u0018C:W\\";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "y\u0019\u0013\u0005D2[\u0000\u000fA\u0001V\u000f\t\u0017";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "y\u0019\u0000\u0002N'V\b\bk ]\b\u0003z9X\u0018\u000eK6R#\u0019L3\\\u0013?C/\\\\";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "y\u0019\u0004\u0002K7U\u0004?C9\\\u000f\u000fO\u0011\\\u0015\tI!P\u000e\u0002\u0017";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "4W\u0005\u001eE<]>\u001cF4@\u0003\rI>f\u0003\u0019L3\\\u00133Y<C\u0004";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "4W\u0005\u001eE<]>\u001eO6V\u0013\bu%K\u0004\u001fO!";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "&P\r\tD!f\u0005\t^0Z\u0015\u0005E;";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "4W\u0005\u001eE<]>\u001eO6V\u0013\bu%K\u0004\u001fO!";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "?[>\rF2V";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "'P\u000f\u000bH4Z\n3G:]\u0004";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "'P\u000f\u000bH4Z\n3G:]\u0004";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "4W\u0005\u001eE<]>\r_1P\u000e3O;^\b\u0002O";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "6X\r\u0000O'f\u0015\u0005G0V\u0014\u0018";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "4W\u0005\u001eE<]>\u001eO6V\u0013\bu7L\u0007\nO'f\u0012\u0005P0";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "4W\u0005\u001eE<]>\r_1P\u000e3Y:L\u0013\u000fO";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "4W\u0005\u001eE<]>\r_1P\u000e3G:]\u00043C;f\u0002\rF9";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "4W\u0005\u001eE<]>\u001eO6V\u0013\bu7L\u0007\nO'f\u0012\u0005P0";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "4W\u0005\u001eE<]>\u001cF4@\u0003\rI>f\u0003\u0019L3\\\u00133Y<C\u0004";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "=I\u0007";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "4W\u0005\u001eE<]>\r_1P\u000e3Y:L\u0013\u000fO";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "6W\u0006";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "4W\u0005\u001eE<]>\r_1P\u000e3O;^\b\u0002O";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "&V\u0003\u0019L\nK\u0002\u001au&P\u001b\t";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "6X\r\u0000O'f\u0015\u0005G0V\u0014\u0018";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "4L\u0005\u0005E\nZ\u00033^=K\u0004\u001fB:U\u0005";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "&V\u0003\u0019L\nK\u0002\u001au&P\u001b\t";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "4W\u0005\u001eE<]>\r_1P\u000e3G:]\u00043C;f\u0002\rF9";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "'P\u000f\u000bH4Z\n3^:W\u0004";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "4L\u0005\u0005E\nZ\u00033^=K\u0004\u001fB:U\u0005";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "'P\u000f\u000bH4Z\n3^:W\u0004";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "?[>\rF2V";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    break Label_1082;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public VoipOptions$Miscellaneous(final Boolean enableComfortNoiseGeneration, final Boolean enableHighPassFiltering, final Boolean enableSilenceDetection, final Integer callerTimeout, final Integer jitterBufferAlgo, final Integer audioCallbackThreshold, final Integer ringbackMode, final Integer ringbackTone, final Integer androidAudioEngine, final Integer androidAudioModeInCall, final Integer androidAudioSource, final Integer androidRecordPreset, final Integer androidAudioRecordBufferSize, final Integer androidAudioPlaybackBufferSize, final Integer udpReceiveSocketBufferSize) {
        this.enableComfortNoiseGeneration = enableComfortNoiseGeneration;
        this.enableHighPassFiltering = enableHighPassFiltering;
        this.enableSilenceDetection = enableSilenceDetection;
        this.callerTimeout = callerTimeout;
        this.jitterBufferAlgo = jitterBufferAlgo;
        this.audioCallbackThreshold = audioCallbackThreshold;
        this.ringbackMode = ringbackMode;
        this.ringbackTone = ringbackTone;
        this.androidAudioEngine = androidAudioEngine;
        this.androidAudioModeInCall = androidAudioModeInCall;
        this.androidAudioSource = androidAudioSource;
        this.androidRecordPreset = androidRecordPreset;
        this.androidAudioRecordBufferSize = androidAudioRecordBufferSize;
        this.androidAudioPlaybackBufferSize = androidAudioPlaybackBufferSize;
        this.udpReceiveSocketBufferSize = udpReceiveSocketBufferSize;
    }
    
    public static VoipOptions$Miscellaneous fromProtocolTreeNode(final c0 c0) {
        if (c0 == null) {
            return null;
        }
        return new VoipOptions$Miscellaneous(VoipOptions.access$200(c0.c(VoipOptions$Miscellaneous.z[31])), VoipOptions.access$200(c0.c(VoipOptions$Miscellaneous.z[29])), VoipOptions.access$200(c0.c(VoipOptions$Miscellaneous.z[17])), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[23]), VoipOptions$Miscellaneous.z[34]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[19]), VoipOptions$Miscellaneous.z[41]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[39]), VoipOptions$Miscellaneous.z[35]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[20]), VoipOptions$Miscellaneous.z[21]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[38]), VoipOptions$Miscellaneous.z[40]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[22]), VoipOptions$Miscellaneous.z[32]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[26]), VoipOptions$Miscellaneous.z[37]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[25]), VoipOptions$Miscellaneous.z[30]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[18]), VoipOptions$Miscellaneous.z[16]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[24]), VoipOptions$Miscellaneous.z[27]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[28]), VoipOptions$Miscellaneous.z[15]), VoipOptions.access$000(c0.c(VoipOptions$Miscellaneous.z[36]), VoipOptions$Miscellaneous.z[33]));
    }
    
    @Override
    public String toString() {
        return VoipOptions$Miscellaneous.z[11] + this.enableComfortNoiseGeneration + VoipOptions$Miscellaneous.z[2] + this.enableHighPassFiltering + VoipOptions$Miscellaneous.z[14] + this.enableSilenceDetection + VoipOptions$Miscellaneous.z[4] + this.callerTimeout + VoipOptions$Miscellaneous.z[3] + this.jitterBufferAlgo + VoipOptions$Miscellaneous.z[10] + this.audioCallbackThreshold + VoipOptions$Miscellaneous.z[5] + this.ringbackMode + VoipOptions$Miscellaneous.z[12] + this.ringbackTone + VoipOptions$Miscellaneous.z[8] + this.androidAudioEngine + VoipOptions$Miscellaneous.z[0] + this.androidAudioModeInCall + VoipOptions$Miscellaneous.z[1] + this.androidAudioSource + VoipOptions$Miscellaneous.z[9] + this.androidRecordPreset + VoipOptions$Miscellaneous.z[7] + this.androidAudioRecordBufferSize + VoipOptions$Miscellaneous.z[13] + this.androidAudioPlaybackBufferSize + VoipOptions$Miscellaneous.z[6] + this.udpReceiveSocketBufferSize + '}';
    }
}
