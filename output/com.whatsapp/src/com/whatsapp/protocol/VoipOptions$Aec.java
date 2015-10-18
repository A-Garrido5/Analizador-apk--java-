// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class VoipOptions$Aec
{
    private static final String[] z;
    public final String algorithm;
    public final Boolean builtinEnabled;
    public final Boolean disableSwEcWhenBuiltinAvailable;
    public final Integer ecThreshold;
    public final Integer histEcThreshold;
    public final Integer length;
    public final Short mode;
    public final Integer offset;
    public final Boolean toneDetectorEnabled;
    
    static {
        final String[] z2 = new String[23];
        String s = "fm@Y\u007f/p";
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
                        c2 = '\u001b';
                        break;
                    }
                    case 0: {
                        c2 = 'J';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = '-';
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
                    s = "fmYYu/\tHB~)9BD^$,OZ~.p";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "fmHUO\"?HEs%!I\u000b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "fmASu-9E\u000b";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000b(NMz&*BDr>%@\u000b<";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "fmOCr&9DX^$,OZ~.p";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "fmBP}9(Y\u000b";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "fmE_h>\bNbs8(^^t&)\u0010";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "fmI_h+/ASH=\bNas/#oCr&9DXZ<,DZz(!H\u000b";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "%+KE~>";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "/.rBs8(^^t&)";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\"$^BD/.rBs8(^^t&)";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\"$^BD/.rBs8(^^t&)";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "'\"IS";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "&(CQo\"";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = ">\"CS\u007f/9HUo%?";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "&(CQo\"";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "'\"IS";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "/.rBs8(^^t&)";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "(8DZo##";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "+!JYi#9E[";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "%+KE~>";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = ".$^Wy&(rEl\u0015(Nil\"(Ciy?$ABr$\u0012L@z#!LTw/";
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
    
    public VoipOptions$Aec(final String algorithm, final Integer offset, final Integer length, final Short mode, final Integer ecThreshold, final Integer histEcThreshold, final Boolean builtinEnabled, final Boolean disableSwEcWhenBuiltinAvailable, final Boolean toneDetectorEnabled) {
        this.algorithm = algorithm;
        this.offset = offset;
        this.length = length;
        this.mode = mode;
        this.ecThreshold = ecThreshold;
        this.histEcThreshold = histEcThreshold;
        this.builtinEnabled = builtinEnabled;
        this.disableSwEcWhenBuiltinAvailable = disableSwEcWhenBuiltinAvailable;
        this.toneDetectorEnabled = toneDetectorEnabled;
    }
    
    public static VoipOptions$Aec fromProtocolTreeNode(final c0 c0) {
        if (c0 == null) {
            return null;
        }
        return new VoipOptions$Aec(c0.c(VoipOptions$Aec.z[20]), VoipOptions.access$000(c0.c(VoipOptions$Aec.z[21]), VoipOptions$Aec.z[9]), VoipOptions.access$000(c0.c(VoipOptions$Aec.z[14]), VoipOptions$Aec.z[16]), VoipOptions.access$100(c0.c(VoipOptions$Aec.z[17]), VoipOptions$Aec.z[13], 0, 2), VoipOptions.access$000(c0.c(VoipOptions$Aec.z[18]), VoipOptions$Aec.z[10]), VoipOptions.access$000(c0.c(VoipOptions$Aec.z[11]), VoipOptions$Aec.z[12]), VoipOptions.access$200(c0.c(VoipOptions$Aec.z[19])), VoipOptions.access$200(c0.c(VoipOptions$Aec.z[22])), VoipOptions.access$200(c0.c(VoipOptions$Aec.z[15])));
    }
    
    @Override
    public String toString() {
        return VoipOptions$Aec.z[4] + this.algorithm + '\'' + VoipOptions$Aec.z[6] + this.offset + VoipOptions$Aec.z[3] + this.length + VoipOptions$Aec.z[0] + this.mode + VoipOptions$Aec.z[2] + this.ecThreshold + VoipOptions$Aec.z[7] + this.histEcThreshold + VoipOptions$Aec.z[5] + this.builtinEnabled + VoipOptions$Aec.z[8] + this.disableSwEcWhenBuiltinAvailable + VoipOptions$Aec.z[1] + this.toneDetectorEnabled + '}';
    }
}
