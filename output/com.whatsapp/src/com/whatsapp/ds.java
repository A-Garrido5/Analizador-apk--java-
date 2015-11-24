// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.net.MalformedURLException;
import android.text.TextUtils;
import com.whatsapp.util.br;
import com.whatsapp.protocol.c6;
import com.whatsapp.fieldstats.bh;
import java.util.ArrayList;
import java.util.List;
import android.net.Uri$Builder;
import android.net.Uri;
import com.whatsapp.util.Log;
import android.app.Activity;
import com.whatsapp.protocol.bi;
import java.net.URL;
import java.io.File;
import java.util.HashMap;
import android.os.AsyncTask;

public final class ds extends AsyncTask
{
    private static final HashMap b;
    private static final HashMap h;
    private static final String[] z;
    private final File a;
    private final MediaData c;
    private final URL d;
    private final bi e;
    private Activity f;
    private final boolean g;
    
    static {
        final String[] z2 = new String[148];
        String s = "+Nl\u0002*\tpK\u0002?\u001ef\\W.\u00038\u001fO?\u0015p^E?HhZ[g";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_3771:
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
                        c2 = 'f';
                        break;
                    }
                    case 1: {
                        c2 = '\u0003';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = '\"';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "FvMNg";
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    s = "H`[Lt\u0011k^V)\u0007sO\f4\u0003w";
                    n = 1;
                    array = z2;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "FpKC.\u0013p\u0002";
                    n = 2;
                    n2 = 3;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "+Nl\u00027\u0003gVCz\u0002lHL6\tb[\u00023\bjKK;\njEG>]#RG)\u0015bXGt\rfF\u001f";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "FbJV5\"lHL6\tb[\u001f";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "FvMNg";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Fb\\V3\u0010jK[t\bjS\u001dg";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "+Nl\u00027\u0003gVCz\u0002lHL6\tb[\u00029\u0007m\\G6\u0003g\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "FvMNg";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "FqZA?\u000fuZF\u0012\u0007pW\u001f";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA;\n`JN;\u0012f\u001fJ;\u0015k\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "FvMNg";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "FgPU4\nl^F\u001c\u000foZ\u001f";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "FgPU4\nl^F\u001c\u000foZ\f?\u001ejLV)Y>";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "FoPA;\nK^Q2[";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0002vZ\u0002.\t#WC)\u000e#RK)\u000bbKA2]#RG)\u0015bXGt\rfF\u001f";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "FvMNg";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "+Nl\u00029\u0007m\\G6\u0003g\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "FvMNg";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "+Nl\u0002<\u000foZ\u0002?\u001ejLV)FePPz\u000ebLJaFnZQ)\u0007dZ\f1\u0003z\u0002";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "+Nl\u0002\u0013)FGA?\u0016wVM4FgJP3\bd\u001fG\"\u000fpKK4\u0001#YK6\u0003#\\M*\u001f8\u001fO?\u0015p^E?HhZ[g";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "FeVN?[";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "+Nl\u0002<\u0007jSG>FwP\u0002>\u0003oZV?FgPU4\nl^Fz\u0000jSGz\u0007eKG(Fe^K6\u0013qZ\u0019z\u000bfLQ;\u0001f\u0011I?\u001f>";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0002vZ\u0002.\t#ZZ*\u000fq^V3\tm\u001fM<FnZF3\u00078\u001fO?\u0015p^E?HhZ[g";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "FvMNg";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fP?\u0012qFK4\u0001#HK.\u000e#QG-FVmnaFnZQ)\u0007dZ\f1\u0003z\u0002";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "Fk^Q2[";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "Fk^Q2[";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "FeVN?[";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "FeVN?[";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u000blJL.\u0003g`P5";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "FvMNg";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0002vZ\u0002.\t#PW.\u0016vK\u0002)\u0012qZC7Fe^K6\u0013qZ\u00025\u0012kZPz\u0012k^Lz5G\u001fA;\u0014g\u001fQ.\u0007wZ\u0019z\u000bfLQ;\u0001f\u0011I?\u001f>";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    s = "\u000blJL.\u0003g";
                    n = 33;
                    n2 = 34;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    array = z2;
                    s = "\u000bf[K;\u0002lHL6\tb[\r4\twVD#\u0014fLW6\u0012,YC3\nf[\u000f5\u0013wOW.IfGVw\u0015w^V?F";
                    n = 34;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\u0007sOG4\u0002jQEz\u0011j[V2FbQFz\u000efVE2\u0012#KMz\u000bf[K;FwMC4\u0015`PF?FvMNaFtVF.\u000e>";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u0011j[V2";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "FkZK=\u000ew\u0002";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u0011jQF5\u0011";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u000efVE2\u0012";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\u0007sO\r>\ttQN5\u0007gRG>\u000fb\u0010L59vMN";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "HwRR";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fC6\u0014f^F#FjQ\u0002*\u0014lXP?\u0015p\u001f\n;\u0005`PP>\u000fmX\u0002.\t#\\W(\u0014fQVz\u0002lHL6\tb[QsF";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "+Nl\u0002/\bb]N?FwP\u0002>\ttQN5\u0007g\u001fF/\u0003#KMz\u000bjLQ3\bd\u001fO?\u0002j^\u0002>\u0007w^\u0019z\u000bfLQ;\u0001f\u0011I?\u001f>";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fC6\u0014f^F#FjQ\u0002*\u0014lXP?\u0015p\u001f\n4\u0003t\u001fO?\u0015p^E?FqZA?\u000fuZFs]#RG)\u0015bXGt\rfF\u001f";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "FrJG/\u0003-LK \u0003>";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fC6\u0014f^F#FjQ\u0002*\u0014lXP?\u0015p\u001f\n;\u0005`PP>\u000fmX\u0002.\t#RG>\u000fb\u001fF;\u0012b\u0016\u0019z\u000bfLQ;\u0001f\u0011I?\u001f>";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fC6\u0014f^F#F`PO*\nfKG>]#RG)\u0015bXGt\rfF\u001f";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "FvMNg";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "FvMNg";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "FvMNg";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "3pZPw'dZL.";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "FvMNg";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "FvMNg";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "FvMNg";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFaFnZQ)\u0007dZ\f1\u0003z\u0002";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "]#JP6[";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    s = "FvMNg";
                    n = 62;
                    n2 = 63;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    array = z2;
                    s = "FvMNg";
                    n = 63;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0002vZ\u0002.\t#VL)\u0013eYK9\u000ffQVz\u0015s^A?]#RG)\u0015bXGt\rfF\u001f";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "FvMNg";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "FvMNg";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "FvMNg";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "FvMNg";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "FvMNg";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "FvMNg";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "FvMNg";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "FvMNg";
                    n = 74;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 75;
                    array = z2;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "FvMNg";
                    n = 76;
                    array = z2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "FvMNg";
                    n = 77;
                    array = z2;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 78;
                    array = z2;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "\u000fgZL.\u000fwF";
                    n = 79;
                    array = z2;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    n2 = 81;
                    s = "4bQE?";
                    n = 80;
                    array = z2;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    s = "FgPU4\nl^F\u001c\u000foZ\u001f";
                    n = 81;
                    array = z2;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    n2 = 83;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 82;
                    array = z2;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 83;
                    array = z2;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "FvMNg";
                    n = 84;
                    array = z2;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    n2 = 86;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 85;
                    array = z2;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    s = "FvMNg";
                    n = 86;
                    array = z2;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "FvMNg";
                    n = 87;
                    array = z2;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "FvMNg";
                    n = 88;
                    array = z2;
                    continue;
                }
                case 88: {
                    array[n2] = intern;
                    s = "FvMNg";
                    n = 89;
                    n2 = 90;
                    array = z2;
                    continue;
                }
                case 89: {
                    array[n2] = intern;
                    n2 = 91;
                    array = z2;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0011jKJz/LzZ9\u0003sKK5\b#HJ3\nf\u001fP?\u0012qVG,\u000fmX\u0002(\u0003pOM4\u0015f\u001fA5\u0002f\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 90;
                    continue;
                }
                case 90: {
                    array[n2] = intern;
                    n2 = 92;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 91;
                    array = z2;
                    continue;
                }
                case 91: {
                    array[n2] = intern;
                    n2 = 93;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fM*\u0003m\u001fM/\u0012sJVz\u0000jSGaFnZQ)\u0007dZ\f1\u0003z\u0002";
                    n = 92;
                    array = z2;
                    continue;
                }
                case 92: {
                    array[n2] = intern;
                    n2 = 94;
                    s = "FvMNg";
                    n = 93;
                    array = z2;
                    continue;
                }
                case 93: {
                    array[n2] = intern;
                    n2 = 95;
                    s = "FgPU4\nl^F\u001c\to[G([";
                    n = 94;
                    array = z2;
                    continue;
                }
                case 94: {
                    array[n2] = intern;
                    n2 = 96;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fM*\u0003m\u001fJ.\u0012sL\u0002/\u0014o\u001fA5\bmZA.\u000flQ\u0019z\u000bfLQ;\u0001f\u0011I?\u001f>";
                    n = 95;
                    array = z2;
                    continue;
                }
                case 95: {
                    array[n2] = intern;
                    n2 = 97;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 96;
                    array = z2;
                    continue;
                }
                case 96: {
                    array[n2] = intern;
                    n2 = 98;
                    s = "FvMNg";
                    n = 97;
                    array = z2;
                    continue;
                }
                case 97: {
                    array[n2] = intern;
                    n2 = 99;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fR;\u0014pZ\u00025\u0000#|M4\u0012fQVw4bQE?FqZQ*\tmLGz\u000ef^F?\u0014#YC3\nf[\u0019z\u000bfLQ;\u0001f\u0011I?\u001f>";
                    n = 98;
                    array = z2;
                    continue;
                }
                case 98: {
                    array[n2] = intern;
                    n2 = 100;
                    s = "FvMNg";
                    n = 99;
                    array = z2;
                    continue;
                }
                case 99: {
                    array[n2] = intern;
                    n2 = 101;
                    s = "FvMNg";
                    n = 100;
                    array = z2;
                    continue;
                }
                case 100: {
                    array[n2] = intern;
                    n2 = 102;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 101;
                    array = z2;
                    continue;
                }
                case 101: {
                    array[n2] = intern;
                    n2 = 103;
                    s = "L,";
                    n = 102;
                    array = z2;
                    continue;
                }
                case 102: {
                    array[n2] = intern;
                    n2 = 104;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 103;
                    array = z2;
                    continue;
                }
                case 103: {
                    array[n2] = intern;
                    n2 = 105;
                    s = "]#MG)\u0016lQQ?%lQV?\bwmC4\u0001f\u0002";
                    n = 104;
                    array = z2;
                    continue;
                }
                case 104: {
                    array[n2] = intern;
                    n2 = 106;
                    s = "FvMNg";
                    n = 105;
                    array = z2;
                    continue;
                }
                case 105: {
                    array[n2] = intern;
                    n2 = 107;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 106;
                    array = z2;
                    continue;
                }
                case 106: {
                    array[n2] = intern;
                    n2 = 108;
                    s = "FvMNg";
                    n = 107;
                    array = z2;
                    continue;
                }
                case 107: {
                    array[n2] = intern;
                    n2 = 109;
                    s = "FoZL=\u0012k\u0002";
                    n = 108;
                    array = z2;
                    continue;
                }
                case 108: {
                    array[n2] = intern;
                    n2 = 110;
                    s = "FgMUg";
                    n = 109;
                    array = z2;
                    continue;
                }
                case 109: {
                    array[n2] = intern;
                    n2 = 111;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 110;
                    array = z2;
                    continue;
                }
                case 110: {
                    array[n2] = intern;
                    n2 = 112;
                    s = "FvMNg";
                    n = 111;
                    array = z2;
                    continue;
                }
                case 111: {
                    array[n2] = intern;
                    n2 = 113;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fM*\u0003m\u001fA5\bmZA.\u000flQ\u0019z\u000bfLQ;\u0001f\u0011I?\u001f>";
                    n = 112;
                    array = z2;
                    continue;
                }
                case 112: {
                    array[n2] = intern;
                    n2 = 114;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 113;
                    array = z2;
                    continue;
                }
                case 113: {
                    array[n2] = intern;
                    n2 = 115;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 114;
                    array = z2;
                    continue;
                }
                case 114: {
                    array[n2] = intern;
                    n2 = 116;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 115;
                    array = z2;
                    continue;
                }
                case 115: {
                    array[n2] = intern;
                    n2 = 117;
                    s = "FvMNg";
                    n = 116;
                    array = z2;
                    continue;
                }
                case 116: {
                    array[n2] = intern;
                    n2 = 118;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 117;
                    array = z2;
                    continue;
                }
                case 117: {
                    array[n2] = intern;
                    n2 = 119;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 118;
                    array = z2;
                    continue;
                }
                case 118: {
                    array[n2] = intern;
                    n2 = 120;
                    s = "'`\\G*\u0012.zL9\tgVL=";
                    n = 119;
                    array = z2;
                    continue;
                }
                case 119: {
                    array[n2] = intern;
                    n2 = 121;
                    s = "%lQV?\bw\u0012p;\bdZ";
                    n = 120;
                    array = z2;
                    continue;
                }
                case 120: {
                    array[n2] = intern;
                    n2 = 122;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fQ?\bgVL=FqZQ/\u000bf\u001fJ?\u0007gZPaFnZQ)\u0007dZ\f1\u0003z\u0002";
                    n = 121;
                    array = z2;
                    continue;
                }
                case 121: {
                    array[n2] = intern;
                    n2 = 123;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 122;
                    array = z2;
                    continue;
                }
                case 122: {
                    array[n2] = intern;
                    n2 = 124;
                    s = "FvMNg";
                    n = 123;
                    array = z2;
                    continue;
                }
                case 123: {
                    array[n2] = intern;
                    n2 = 125;
                    s = "FvMNg";
                    n = 124;
                    array = z2;
                    continue;
                }
                case 124: {
                    array[n2] = intern;
                    n2 = 126;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 125;
                    array = z2;
                    continue;
                }
                case 125: {
                    array[n2] = intern;
                    n2 = 127;
                    s = "FvMNg";
                    n = 126;
                    array = z2;
                    continue;
                }
                case 126: {
                    array[n2] = intern;
                    n2 = 128;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 127;
                    array = z2;
                    continue;
                }
                case 127: {
                    array[n2] = intern;
                    n2 = 129;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0011jKJz/LzZ9\u0003sKK5\b8\u001fO?\u0015p^E?HhZ[g";
                    n = 128;
                    array = z2;
                    continue;
                }
                case 128: {
                    array[n2] = intern;
                    n2 = 130;
                    s = "FvMNg";
                    n = 129;
                    array = z2;
                    continue;
                }
                case 129: {
                    array[n2] = intern;
                    n2 = 131;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00025\u0013wOW.FpKP?\u0007n\u0004\u00027\u0003pLC=\u0003-TG#[";
                    n = 130;
                    array = z2;
                    continue;
                }
                case 130: {
                    array[n2] = intern;
                    n2 = 132;
                    s = "FvMNg";
                    n = 131;
                    array = z2;
                    continue;
                }
                case 131: {
                    array[n2] = intern;
                    n2 = 133;
                    s = "FqZQ*\tmLG\u0019\tgZ\u001f";
                    n = 132;
                    array = z2;
                    continue;
                }
                case 132: {
                    array[n2] = intern;
                    n2 = 134;
                    s = "FvMNg";
                    n = 133;
                    array = z2;
                    continue;
                }
                case 133: {
                    array[n2] = intern;
                    n2 = 135;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 134;
                    array = z2;
                    continue;
                }
                case 134: {
                    array[n2] = intern;
                    n2 = 136;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fM*\u0003m\u001fW(\n#\\M4\bf\\V3\tm\u001fK4\u0016vK\u0002)\u0012qZC7]#RG)\u0015bXGt\rfF\u001f";
                    n = 135;
                    array = z2;
                    continue;
                }
                case 135: {
                    array[n2] = intern;
                    n2 = 137;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 136;
                    array = z2;
                    continue;
                }
                case 136: {
                    array[n2] = intern;
                    n2 = 138;
                    s = "FvMNg";
                    n = 137;
                    array = z2;
                    continue;
                }
                case 137: {
                    array[n2] = intern;
                    n2 = 139;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA6\tpZ\u00023\bsJVz\u0015wMG;\u000b8\u001fO?\u0015p^E?HhZ[g";
                    n = 138;
                    array = z2;
                    continue;
                }
                case 138: {
                    array[n2] = intern;
                    n2 = 140;
                    s = "\u0004zKG)[";
                    n = 139;
                    array = z2;
                    continue;
                }
                case 139: {
                    array[n2] = intern;
                    n2 = 141;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fD;\u000foZFz\u0012l\u001fA5\u0016z\u001fD3\nf\u001fV5FgJR6\u000f`^V?FgPU4\nl^FaFlMK=\u000fm^N\u0017\u0003pLC=\u0003-TG#[";
                    n = 140;
                    array = z2;
                    continue;
                }
                case 140: {
                    array[n2] = intern;
                    n2 = 142;
                    s = "FgJR6\u000f`^V?+fLQ;\u0001f\u0011I?\u001f>";
                    n = 141;
                    array = z2;
                    continue;
                }
                case 141: {
                    array[n2] = intern;
                    n2 = 143;
                    s = "+Nl\u0002>\ttQN5\u0007g\u001fO3\u0015pVL=FgJR6\u000f`^V?FgPU4\nl^F)FoVQ.";
                    n = 142;
                    array = z2;
                    continue;
                }
                case 142: {
                    array[n2] = intern;
                    n2 = 144;
                    s = "FvMNg";
                    n = 143;
                    array = z2;
                    continue;
                }
                case 143: {
                    array[n2] = intern;
                    n2 = 145;
                    s = "FvMNg";
                    n = 144;
                    array = z2;
                    continue;
                }
                case 144: {
                    array[n2] = intern;
                    n2 = 146;
                    s = "+Nl\u0002/\u0014o\u001fC.\u0012b\\J?\u0002#KMz\u000bfLQ;\u0001f\u001fJ;\u0015#QMz\u000elLVaFnZQ)\u0007dZ\f1\u0003z\u0002";
                    n = 145;
                    array = z2;
                    continue;
                }
                case 145: {
                    array[n2] = intern;
                    n2 = 147;
                    s = "+Nl\u0002/\u0014o\u001fC.\u0012b\\J?\u0002#KMz\u000bfLQ;\u0001f\u001fK)Fn^N<\tqRG>]#RG)\u0015bXGt\rfF\u001f";
                    n = 146;
                    array = z2;
                    continue;
                }
                case 146: {
                    break Label_3771;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        b = new HashMap();
        h = new HashMap();
    }
    
    private ds(final bi e, final boolean g, final Activity f) {
        this.a = b(e);
        this.e = e;
        this.g = g;
        this.c = (MediaData)e.N;
        this.d = c(e);
        this.f = f;
        Log.i(ds.z[4] + e.a + ds.z[6] + a(this.d) + ds.z[5] + g + ds.z[7] + (f == null));
    }
    
    private static Uri a(final bi bi) {
        final Uri parse = Uri.parse(bi.d);
        final Uri$Builder buildUpon = parse.buildUpon();
        try {
            buildUpon.appendQueryParameter("x", "2");
            if (bi.I == 3) {
                a(buildUpon);
            }
            App.a(parse, buildUpon);
            return buildUpon.build();
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    public static ds a(final bi bi, final boolean b, final Activity activity) {
        synchronized (ds.b) {
            final MediaData mediaData = (MediaData)bi.N;
            if (mediaData == null) {
                Log.e(ds.z[44] + bi.a);
                return null;
            }
            if (mediaData.transferred) {
                Log.e(ds.z[48] + bi.a);
                return null;
            }
            if (mediaData.transferring) {
                Log.e(ds.z[47] + bi.a);
                return null;
            }
            ds ds = null;
            Label_0319: {
                if (!com.whatsapp.ds.b.containsKey(bi.a)) {
                    com.whatsapp.ds.b.put(bi.a, bi);
                    final ds downloader = new ds(bi, b, activity);
                    mediaData.downloader = downloader;
                    mediaData.transferring = true;
                    mediaData.progress = 0L;
                    mediaData.autodownloadRetryEnabled = true;
                    final List<bi> list = com.whatsapp.ds.h.get(bi.P);
                    List<bi> list2;
                    if (list != null) {
                        Log.i(com.whatsapp.ds.z[45] + bi.a + com.whatsapp.ds.z[46] + list.size());
                        list2 = list;
                        ds = null;
                    }
                    else {
                        final ArrayList<bi> list3 = new ArrayList<bi>();
                        com.whatsapp.ds.h.put(bi.P, list3);
                        ds = downloader;
                        list2 = list3;
                    }
                    list2.add(bi);
                    if (!App.I) {
                        break Label_0319;
                    }
                }
                Log.w(com.whatsapp.ds.z[43] + bi.a);
                ds = null;
            }
            // monitorexit(ds.b)
            App.ak.a(bi, false, -1);
            return ds;
        }
    }
    
    private static bh a(final kp p0, final MediaData p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/aal.a:[I
        //     3: aload_0        
        //     4: invokevirtual   com/whatsapp/kp.ordinal:()I
        //     7: iaload         
        //     8: istore          4
        //    10: iload           4
        //    12: tableswitch {
        //                2: 64
        //                3: 85
        //                4: 89
        //                5: 93
        //                6: 97
        //                7: 101
        //                8: 105
        //                9: 109
        //          default: 60
        //        }
        //    60: getstatic       com/whatsapp/fieldstats/bh.ERROR_UNKNOWN:Lcom/whatsapp/fieldstats/bh;
        //    63: areturn        
        //    64: aload_1        
        //    65: getfield        com/whatsapp/MediaData.dedupeDownload:Z
        //    68: ifeq            81
        //    71: getstatic       com/whatsapp/fieldstats/bh.DEDUPED:Lcom/whatsapp/fieldstats/bh;
        //    74: areturn        
        //    75: astore_2       
        //    76: aload_2        
        //    77: athrow         
        //    78: astore_3       
        //    79: aload_3        
        //    80: athrow         
        //    81: getstatic       com/whatsapp/fieldstats/bh.OK:Lcom/whatsapp/fieldstats/bh;
        //    84: areturn        
        //    85: getstatic       com/whatsapp/fieldstats/bh.ERROR_INSUFFICIENT_SPACE:Lcom/whatsapp/fieldstats/bh;
        //    88: areturn        
        //    89: getstatic       com/whatsapp/fieldstats/bh.ERROR_TOO_OLD:Lcom/whatsapp/fieldstats/bh;
        //    92: areturn        
        //    93: getstatic       com/whatsapp/fieldstats/bh.ERROR_CANNOT_RESUME:Lcom/whatsapp/fieldstats/bh;
        //    96: areturn        
        //    97: getstatic       com/whatsapp/fieldstats/bh.ERROR_HASH_MISMATCH:Lcom/whatsapp/fieldstats/bh;
        //   100: areturn        
        //   101: getstatic       com/whatsapp/fieldstats/bh.ERROR_INVALID_URL:Lcom/whatsapp/fieldstats/bh;
        //   104: areturn        
        //   105: getstatic       com/whatsapp/fieldstats/bh.ERROR_OUTPUT_STREAM:Lcom/whatsapp/fieldstats/bh;
        //   108: areturn        
        //   109: getstatic       com/whatsapp/fieldstats/bh.ERROR_CANCEL:Lcom/whatsapp/fieldstats/bh;
        //   112: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      10     75     78     Ljava/lang/NumberFormatException;
        //  64     75     78     81     Ljava/lang/NumberFormatException;
        //  76     78     78     81     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static bi a(final c6 c6) {
        synchronized (ds.b) {
            return ds.b.get(c6);
        }
    }
    
    private static u5 a(final ds p0, final bi p1, final boolean p2, final File p3, final URL p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //     8: lstore          6
        //    10: aload           4
        //    12: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    15: astore          24
        //    17: aload           24
        //    19: instanceof      Ljavax/net/ssl/HttpsURLConnection;
        //    22: ifeq            366
        //    25: aload           24
        //    27: checkcast       Ljavax/net/ssl/HttpsURLConnection;
        //    30: astore          30
        //    32: aload           30
        //    34: invokestatic    com/whatsapp/messaging/a6.b:()Lcom/whatsapp/messaging/a6;
        //    37: invokevirtual   javax/net/ssl/HttpsURLConnection.setSSLSocketFactory:(Ljavax/net/ssl/SSLSocketFactory;)V
        //    40: aload           30
        //    42: sipush          15000
        //    45: invokevirtual   javax/net/ssl/HttpsURLConnection.setConnectTimeout:(I)V
        //    48: aload_1        
        //    49: getfield        com/whatsapp/protocol/bi.I:B
        //    52: istore          33
        //    54: iload           33
        //    56: iconst_3       
        //    57: if_icmpne       842
        //    60: ldc_w           60000
        //    63: istore          34
        //    65: aload           30
        //    67: iload           34
        //    69: invokevirtual   javax/net/ssl/HttpsURLConnection.setReadTimeout:(I)V
        //    72: aload           30
        //    74: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    77: bipush          55
        //    79: aaload         
        //    80: invokestatic    com/whatsapp/m3.a:()Ljava/lang/String;
        //    83: invokevirtual   javax/net/ssl/HttpsURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //    86: aload           30
        //    88: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    91: bipush          120
        //    93: aaload         
        //    94: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    97: bipush          80
        //    99: aaload         
        //   100: invokevirtual   javax/net/ssl/HttpsURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   103: aload_3        
        //   104: invokevirtual   java/io/File.length:()J
        //   107: lstore          35
        //   109: lload           35
        //   111: lstore          37
        //   113: lload           37
        //   115: lconst_0       
        //   116: lcmp           
        //   117: ifle            204
        //   120: new             Ljava/lang/StringBuilder;
        //   123: dup            
        //   124: invokespecial   java/lang/StringBuilder.<init>:()V
        //   127: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   130: bipush          122
        //   132: aaload         
        //   133: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   136: aload_1        
        //   137: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   143: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   146: bipush          109
        //   148: aaload         
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: lload           37
        //   154: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   157: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   160: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   163: aload           30
        //   165: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   168: bipush          81
        //   170: aaload         
        //   171: new             Ljava/lang/StringBuilder;
        //   174: dup            
        //   175: invokespecial   java/lang/StringBuilder.<init>:()V
        //   178: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   181: sipush          140
        //   184: aaload         
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: lload           37
        //   190: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   193: bipush          45
        //   195: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   198: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   201: invokevirtual   javax/net/ssl/HttpsURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   204: aload           30
        //   206: invokevirtual   javax/net/ssl/HttpsURLConnection.getResponseCode:()I
        //   209: istore          46
        //   211: new             Lcom/whatsapp/ow;
        //   214: dup            
        //   215: aload           30
        //   217: invokespecial   com/whatsapp/ow.<init>:(Ljavax/net/ssl/HttpsURLConnection;)V
        //   220: invokevirtual   com/whatsapp/ow.c:()Lcom/whatsapp/ow;
        //   223: astore          47
        //   225: iload           46
        //   227: sipush          200
        //   230: if_icmpeq       1828
        //   233: iload           46
        //   235: sipush          206
        //   238: if_icmpeq       1828
        //   241: new             Ljava/lang/StringBuilder;
        //   244: dup            
        //   245: invokespecial   java/lang/StringBuilder.<init>:()V
        //   248: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   251: bipush          61
        //   253: aaload         
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: aload_1        
        //   258: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   264: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   267: bipush          59
        //   269: aaload         
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: aload           4
        //   275: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   281: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   284: sipush          133
        //   287: aaload         
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: iload           46
        //   293: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   296: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   299: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   302: iload           46
        //   304: sipush          404
        //   307: if_icmpeq       318
        //   310: iload           46
        //   312: sipush          410
        //   315: if_icmpne       1203
        //   318: new             Lcom/whatsapp/u5;
        //   321: dup            
        //   322: getstatic       com/whatsapp/kp.FAILED_TOO_OLD:Lcom/whatsapp/kp;
        //   325: aconst_null    
        //   326: lload           6
        //   328: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //   331: astore          121
        //   333: aload           30
        //   335: ifnull          343
        //   338: aload           30
        //   340: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //   343: iconst_0       
        //   344: ifeq            351
        //   347: aconst_null    
        //   348: invokevirtual   java/io/InputStream.close:()V
        //   351: iconst_0       
        //   352: ifeq            359
        //   355: aconst_null    
        //   356: invokevirtual   java/io/OutputStream.close:()V
        //   359: aload           121
        //   361: astore          18
        //   363: aload           18
        //   365: areturn        
        //   366: new             Ljava/lang/StringBuilder;
        //   369: dup            
        //   370: invokespecial   java/lang/StringBuilder.<init>:()V
        //   373: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   376: bipush          96
        //   378: aaload         
        //   379: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   382: aload_1        
        //   383: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   386: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   389: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   392: bipush          64
        //   394: aaload         
        //   395: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   398: aload           4
        //   400: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   403: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   406: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   409: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   412: new             Lcom/whatsapp/u5;
        //   415: dup            
        //   416: getstatic       com/whatsapp/kp.FAILED_GENERIC:Lcom/whatsapp/kp;
        //   419: aconst_null    
        //   420: lload           6
        //   422: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //   425: astore          18
        //   427: iconst_0       
        //   428: ifeq            435
        //   431: aconst_null    
        //   432: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //   435: iconst_0       
        //   436: ifeq            443
        //   439: aconst_null    
        //   440: invokevirtual   java/io/InputStream.close:()V
        //   443: iconst_0       
        //   444: ifeq            363
        //   447: aconst_null    
        //   448: invokevirtual   java/io/OutputStream.close:()V
        //   451: aload           18
        //   453: areturn        
        //   454: astore          26
        //   456: new             Ljava/lang/StringBuilder;
        //   459: dup            
        //   460: invokespecial   java/lang/StringBuilder.<init>:()V
        //   463: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   466: bipush          57
        //   468: aaload         
        //   469: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   472: aload_1        
        //   473: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   476: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   479: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   482: bipush          60
        //   484: aaload         
        //   485: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   488: aload           4
        //   490: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   493: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   496: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   499: aload           26
        //   501: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   504: aload           18
        //   506: areturn        
        //   507: astore          29
        //   509: aload           29
        //   511: athrow         
        //   512: astore          28
        //   514: aload           28
        //   516: athrow         
        //   517: astore          27
        //   519: new             Ljava/lang/StringBuilder;
        //   522: dup            
        //   523: invokespecial   java/lang/StringBuilder.<init>:()V
        //   526: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   529: bipush          111
        //   531: aaload         
        //   532: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   535: aload_1        
        //   536: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   539: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   542: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   545: bipush          69
        //   547: aaload         
        //   548: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   551: aload           4
        //   553: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   556: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   559: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   562: aload           27
        //   564: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   567: goto            443
        //   570: astore          25
        //   572: aload           25
        //   574: athrow         
        //   575: astore          17
        //   577: new             Ljava/lang/StringBuilder;
        //   580: dup            
        //   581: invokespecial   java/lang/StringBuilder.<init>:()V
        //   584: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   587: bipush          113
        //   589: aaload         
        //   590: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   593: aload_1        
        //   594: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   597: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   600: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   603: bipush          98
        //   605: aaload         
        //   606: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   609: aload           4
        //   611: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   614: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   617: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   620: aload           17
        //   622: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   625: new             Lcom/whatsapp/u5;
        //   628: dup            
        //   629: getstatic       com/whatsapp/kp.FAILED_GENERIC:Lcom/whatsapp/kp;
        //   632: aconst_null    
        //   633: lload           6
        //   635: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //   638: astore          18
        //   640: iconst_0       
        //   641: ifeq            648
        //   644: aconst_null    
        //   645: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //   648: iconst_0       
        //   649: ifeq            656
        //   652: aconst_null    
        //   653: invokevirtual   java/io/InputStream.close:()V
        //   656: iconst_0       
        //   657: ifeq            363
        //   660: aconst_null    
        //   661: invokevirtual   java/io/OutputStream.close:()V
        //   664: aload           18
        //   666: areturn        
        //   667: astore          20
        //   669: new             Ljava/lang/StringBuilder;
        //   672: dup            
        //   673: invokespecial   java/lang/StringBuilder.<init>:()V
        //   676: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   679: bipush          102
        //   681: aaload         
        //   682: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   685: aload_1        
        //   686: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   689: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   692: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   695: bipush          108
        //   697: aaload         
        //   698: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   701: aload           4
        //   703: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   706: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   709: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   712: aload           20
        //   714: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   717: aload           18
        //   719: areturn        
        //   720: astore          23
        //   722: aload           23
        //   724: athrow         
        //   725: astore          22
        //   727: aload           22
        //   729: athrow         
        //   730: astore          21
        //   732: new             Ljava/lang/StringBuilder;
        //   735: dup            
        //   736: invokespecial   java/lang/StringBuilder.<init>:()V
        //   739: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   742: bipush          68
        //   744: aaload         
        //   745: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   748: aload_1        
        //   749: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   752: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   755: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   758: bipush          70
        //   760: aaload         
        //   761: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   764: aload           4
        //   766: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   769: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   772: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   775: aload           21
        //   777: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   780: goto            656
        //   783: astore          19
        //   785: aload           19
        //   787: athrow         
        //   788: astore          32
        //   790: aload           32
        //   792: athrow         
        //   793: astore          31
        //   795: aconst_null    
        //   796: astore          10
        //   798: aconst_null    
        //   799: astore          11
        //   801: aload           30
        //   803: astore          9
        //   805: aload           31
        //   807: astore          8
        //   809: aload           9
        //   811: ifnull          819
        //   814: aload           9
        //   816: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //   819: aload           10
        //   821: ifnull          829
        //   824: aload           10
        //   826: invokevirtual   java/io/InputStream.close:()V
        //   829: aload           11
        //   831: ifnull          839
        //   834: aload           11
        //   836: invokevirtual   java/io/OutputStream.close:()V
        //   839: aload           8
        //   841: athrow         
        //   842: sipush          30000
        //   845: istore          34
        //   847: goto            65
        //   850: astore          149
        //   852: aload           149
        //   854: athrow         
        //   855: astore          39
        //   857: new             Ljava/lang/StringBuilder;
        //   860: dup            
        //   861: invokespecial   java/lang/StringBuilder.<init>:()V
        //   864: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   867: bipush          91
        //   869: aaload         
        //   870: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   873: aload_1        
        //   874: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   877: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   880: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   883: sipush          134
        //   886: aaload         
        //   887: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   890: aload           4
        //   892: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   895: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   898: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   901: aload           39
        //   903: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   906: new             Lcom/whatsapp/u5;
        //   909: dup            
        //   910: getstatic       com/whatsapp/kp.FAILED_GENERIC:Lcom/whatsapp/kp;
        //   913: aconst_null    
        //   914: lload           6
        //   916: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //   919: astore          40
        //   921: aload           30
        //   923: ifnull          931
        //   926: aload           30
        //   928: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //   931: iconst_0       
        //   932: ifeq            939
        //   935: aconst_null    
        //   936: invokevirtual   java/io/InputStream.close:()V
        //   939: iconst_0       
        //   940: ifeq            947
        //   943: aconst_null    
        //   944: invokevirtual   java/io/OutputStream.close:()V
        //   947: aload           40
        //   949: areturn        
        //   950: astore          45
        //   952: aload           45
        //   954: athrow         
        //   955: astore          44
        //   957: aload           44
        //   959: athrow         
        //   960: astore          43
        //   962: new             Ljava/lang/StringBuilder;
        //   965: dup            
        //   966: invokespecial   java/lang/StringBuilder.<init>:()V
        //   969: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   972: bipush          97
        //   974: aaload         
        //   975: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   978: aload_1        
        //   979: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   982: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   985: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   988: bipush          58
        //   990: aaload         
        //   991: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   994: aload           4
        //   996: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   999: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1002: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1005: aload           43
        //  1007: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1010: goto            939
        //  1013: astore          42
        //  1015: aload           42
        //  1017: athrow         
        //  1018: astore          41
        //  1020: new             Ljava/lang/StringBuilder;
        //  1023: dup            
        //  1024: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1027: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1030: bipush          119
        //  1032: aaload         
        //  1033: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1036: aload_1        
        //  1037: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1040: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1043: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1046: bipush          101
        //  1048: aaload         
        //  1049: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1052: aload           4
        //  1054: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1057: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1060: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1063: aload           41
        //  1065: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1068: goto            947
        //  1071: astore          119
        //  1073: aload           119
        //  1075: athrow         
        //  1076: astore          120
        //  1078: aload           120
        //  1080: athrow         
        //  1081: astore          126
        //  1083: aload           126
        //  1085: athrow         
        //  1086: astore          125
        //  1088: aload           125
        //  1090: athrow         
        //  1091: astore          124
        //  1093: new             Ljava/lang/StringBuilder;
        //  1096: dup            
        //  1097: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1100: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1103: bipush          56
        //  1105: aaload         
        //  1106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1109: aload_1        
        //  1110: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1116: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1119: bipush          125
        //  1121: aaload         
        //  1122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1125: aload           4
        //  1127: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1133: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1136: aload           124
        //  1138: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1141: goto            351
        //  1144: astore          123
        //  1146: aload           123
        //  1148: athrow         
        //  1149: astore          122
        //  1151: new             Ljava/lang/StringBuilder;
        //  1154: dup            
        //  1155: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1158: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1161: sipush          128
        //  1164: aaload         
        //  1165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1168: aload_1        
        //  1169: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1175: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1178: bipush          77
        //  1180: aaload         
        //  1181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1184: aload           4
        //  1186: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1192: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1195: aload           122
        //  1197: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1200: goto            359
        //  1203: iload           46
        //  1205: sipush          416
        //  1208: if_icmpne       1662
        //  1211: aload           30
        //  1213: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1216: bipush          121
        //  1218: aaload         
        //  1219: invokevirtual   javax/net/ssl/HttpsURLConnection.getHeaderField:(Ljava/lang/String;)Ljava/lang/String;
        //  1222: astore          133
        //  1224: aload           133
        //  1226: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1229: ifne            1497
        //  1232: aload           133
        //  1234: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1237: bipush          103
        //  1239: aaload         
        //  1240: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  1243: istore          141
        //  1245: iload           141
        //  1247: ifeq            1497
        //  1250: aload           133
        //  1252: iconst_2       
        //  1253: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1256: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1259: lload           37
        //  1261: lcmp           
        //  1262: ifne            1497
        //  1265: aload_1        
        //  1266: aload_3        
        //  1267: aload           4
        //  1269: lload           6
        //  1271: aload           47
        //  1273: invokestatic    com/whatsapp/ds.a:(Lcom/whatsapp/protocol/bi;Ljava/io/File;Ljava/net/URL;JLcom/whatsapp/ow;)Lcom/whatsapp/u5;
        //  1276: astore          143
        //  1278: aload           30
        //  1280: ifnull          1288
        //  1283: aload           30
        //  1285: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //  1288: iconst_0       
        //  1289: ifeq            1296
        //  1292: aconst_null    
        //  1293: invokevirtual   java/io/InputStream.close:()V
        //  1296: iconst_0       
        //  1297: ifeq            1304
        //  1300: aconst_null    
        //  1301: invokevirtual   java/io/OutputStream.close:()V
        //  1304: aload           143
        //  1306: areturn        
        //  1307: astore          134
        //  1309: aload           134
        //  1311: athrow         
        //  1312: astore          148
        //  1314: aload           148
        //  1316: athrow         
        //  1317: astore          147
        //  1319: aload           147
        //  1321: athrow         
        //  1322: astore          146
        //  1324: new             Ljava/lang/StringBuilder;
        //  1327: dup            
        //  1328: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1331: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1334: bipush          114
        //  1336: aaload         
        //  1337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1340: aload_1        
        //  1341: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1344: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1347: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1350: bipush          87
        //  1352: aaload         
        //  1353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1356: aload           4
        //  1358: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1361: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1364: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1367: aload           146
        //  1369: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1372: goto            1296
        //  1375: astore          145
        //  1377: aload           145
        //  1379: athrow         
        //  1380: astore          144
        //  1382: new             Ljava/lang/StringBuilder;
        //  1385: dup            
        //  1386: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1389: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1392: bipush          84
        //  1394: aaload         
        //  1395: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1398: aload_1        
        //  1399: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1402: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1405: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1408: bipush          73
        //  1410: aaload         
        //  1411: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1414: aload           4
        //  1416: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1419: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1422: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1425: aload           144
        //  1427: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1430: goto            1304
        //  1433: astore          142
        //  1435: new             Ljava/lang/StringBuilder;
        //  1438: dup            
        //  1439: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1442: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1445: bipush          99
        //  1447: aaload         
        //  1448: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1451: aload_1        
        //  1452: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1455: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1458: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1461: bipush          62
        //  1463: aaload         
        //  1464: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1467: aload           4
        //  1469: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1472: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1475: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1478: bipush          105
        //  1480: aaload         
        //  1481: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1484: aload           133
        //  1486: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1489: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1492: aload           142
        //  1494: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1497: new             Lcom/whatsapp/u5;
        //  1500: dup            
        //  1501: getstatic       com/whatsapp/kp.FAILED_CANNOT_RESUME:Lcom/whatsapp/kp;
        //  1504: aconst_null    
        //  1505: lload           6
        //  1507: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //  1510: astore          135
        //  1512: aload           30
        //  1514: ifnull          1522
        //  1517: aload           30
        //  1519: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //  1522: iconst_0       
        //  1523: ifeq            1530
        //  1526: aconst_null    
        //  1527: invokevirtual   java/io/InputStream.close:()V
        //  1530: iconst_0       
        //  1531: ifeq            1538
        //  1534: aconst_null    
        //  1535: invokevirtual   java/io/OutputStream.close:()V
        //  1538: aload           135
        //  1540: areturn        
        //  1541: astore          140
        //  1543: aload           140
        //  1545: athrow         
        //  1546: astore          139
        //  1548: aload           139
        //  1550: athrow         
        //  1551: astore          138
        //  1553: new             Ljava/lang/StringBuilder;
        //  1556: dup            
        //  1557: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1560: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1563: bipush          83
        //  1565: aaload         
        //  1566: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1569: aload_1        
        //  1570: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1573: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1576: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1579: bipush          100
        //  1581: aaload         
        //  1582: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1585: aload           4
        //  1587: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1590: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1593: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1596: aload           138
        //  1598: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1601: goto            1530
        //  1604: astore          137
        //  1606: aload           137
        //  1608: athrow         
        //  1609: astore          136
        //  1611: new             Ljava/lang/StringBuilder;
        //  1614: dup            
        //  1615: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1618: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1621: bipush          116
        //  1623: aaload         
        //  1624: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1627: aload_1        
        //  1628: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1631: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1634: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1637: bipush          78
        //  1639: aaload         
        //  1640: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1643: aload           4
        //  1645: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1648: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1651: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1654: aload           136
        //  1656: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1659: goto            1538
        //  1662: new             Lcom/whatsapp/u5;
        //  1665: dup            
        //  1666: getstatic       com/whatsapp/kp.FAILED_GENERIC:Lcom/whatsapp/kp;
        //  1669: aconst_null    
        //  1670: lload           6
        //  1672: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //  1675: astore          127
        //  1677: aload           30
        //  1679: ifnull          1687
        //  1682: aload           30
        //  1684: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //  1687: iconst_0       
        //  1688: ifeq            1695
        //  1691: aconst_null    
        //  1692: invokevirtual   java/io/InputStream.close:()V
        //  1695: iconst_0       
        //  1696: ifeq            1703
        //  1699: aconst_null    
        //  1700: invokevirtual   java/io/OutputStream.close:()V
        //  1703: aload           127
        //  1705: areturn        
        //  1706: astore          132
        //  1708: aload           132
        //  1710: athrow         
        //  1711: astore          131
        //  1713: aload           131
        //  1715: athrow         
        //  1716: astore          130
        //  1718: new             Ljava/lang/StringBuilder;
        //  1721: dup            
        //  1722: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1725: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1728: sipush          137
        //  1731: aaload         
        //  1732: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1735: aload_1        
        //  1736: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1739: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1742: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1745: bipush          51
        //  1747: aaload         
        //  1748: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1751: aload           4
        //  1753: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1756: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1759: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1762: aload           130
        //  1764: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1767: goto            1695
        //  1770: astore          129
        //  1772: aload           129
        //  1774: athrow         
        //  1775: astore          128
        //  1777: new             Ljava/lang/StringBuilder;
        //  1780: dup            
        //  1781: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1784: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1787: bipush          86
        //  1789: aaload         
        //  1790: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1793: aload_1        
        //  1794: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1797: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1800: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1803: bipush          85
        //  1805: aaload         
        //  1806: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1809: aload           4
        //  1811: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1814: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1817: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1820: aload           128
        //  1822: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1825: goto            1703
        //  1828: lload           37
        //  1830: aload           30
        //  1832: invokevirtual   javax/net/ssl/HttpsURLConnection.getContentLength:()I
        //  1835: i2l            
        //  1836: ladd           
        //  1837: lstore          48
        //  1839: invokestatic    com/whatsapp/App.C:()J
        //  1842: lload           48
        //  1844: lcmp           
        //  1845: ifge            2061
        //  1848: new             Ljava/lang/StringBuilder;
        //  1851: dup            
        //  1852: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1855: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1858: bipush          65
        //  1860: aaload         
        //  1861: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1864: aload_1        
        //  1865: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1868: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1871: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1874: bipush          127
        //  1876: aaload         
        //  1877: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1880: aload           4
        //  1882: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1885: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1888: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1891: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1894: new             Lcom/whatsapp/u5;
        //  1897: dup            
        //  1898: getstatic       com/whatsapp/kp.FAILED_INSUFFICIENT_SPACE:Lcom/whatsapp/kp;
        //  1901: aconst_null    
        //  1902: lload           6
        //  1904: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //  1907: astore          113
        //  1909: aload           30
        //  1911: ifnull          1919
        //  1914: aload           30
        //  1916: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //  1919: iconst_0       
        //  1920: ifeq            1927
        //  1923: aconst_null    
        //  1924: invokevirtual   java/io/InputStream.close:()V
        //  1927: iconst_0       
        //  1928: ifeq            1935
        //  1931: aconst_null    
        //  1932: invokevirtual   java/io/OutputStream.close:()V
        //  1935: aload           113
        //  1937: areturn        
        //  1938: astore          118
        //  1940: aload           118
        //  1942: athrow         
        //  1943: astore          117
        //  1945: aload           117
        //  1947: athrow         
        //  1948: astore          116
        //  1950: new             Ljava/lang/StringBuilder;
        //  1953: dup            
        //  1954: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1957: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1960: sipush          135
        //  1963: aaload         
        //  1964: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1967: aload_1        
        //  1968: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1971: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1974: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  1977: sipush          138
        //  1980: aaload         
        //  1981: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1984: aload           4
        //  1986: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  1989: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1992: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1995: aload           116
        //  1997: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2000: goto            1927
        //  2003: astore          115
        //  2005: aload           115
        //  2007: athrow         
        //  2008: astore          114
        //  2010: new             Ljava/lang/StringBuilder;
        //  2013: dup            
        //  2014: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2017: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2020: bipush          79
        //  2022: aaload         
        //  2023: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2026: aload_1        
        //  2027: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  2030: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2033: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2036: bipush          89
        //  2038: aaload         
        //  2039: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2042: aload           4
        //  2044: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  2047: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2050: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2053: aload           114
        //  2055: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2058: goto            1935
        //  2061: iload_2        
        //  2062: ifeq            2076
        //  2065: aload_1        
        //  2066: invokestatic    com/whatsapp/App.e:(Lcom/whatsapp/protocol/bi;)Z
        //  2069: istore          112
        //  2071: iload           112
        //  2073: ifeq            2087
        //  2076: aload_0        
        //  2077: invokevirtual   com/whatsapp/ds.isCancelled:()Z
        //  2080: istore          51
        //  2082: iload           51
        //  2084: ifeq            2262
        //  2087: new             Lcom/whatsapp/u5;
        //  2090: dup            
        //  2091: getstatic       com/whatsapp/kp.CANCEL:Lcom/whatsapp/kp;
        //  2094: aconst_null    
        //  2095: lload           6
        //  2097: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //  2100: astore          105
        //  2102: aload           30
        //  2104: ifnull          2112
        //  2107: aload           30
        //  2109: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //  2112: iconst_0       
        //  2113: ifeq            2120
        //  2116: aconst_null    
        //  2117: invokevirtual   java/io/InputStream.close:()V
        //  2120: iconst_0       
        //  2121: ifeq            2128
        //  2124: aconst_null    
        //  2125: invokevirtual   java/io/OutputStream.close:()V
        //  2128: aload           105
        //  2130: areturn        
        //  2131: astore          111
        //  2133: aload           111
        //  2135: athrow         
        //  2136: astore          50
        //  2138: aload           50
        //  2140: athrow         
        //  2141: astore          110
        //  2143: aload           110
        //  2145: athrow         
        //  2146: astore          109
        //  2148: aload           109
        //  2150: athrow         
        //  2151: astore          108
        //  2153: new             Ljava/lang/StringBuilder;
        //  2156: dup            
        //  2157: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2160: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2163: bipush          118
        //  2165: aaload         
        //  2166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2169: aload_1        
        //  2170: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  2173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2176: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2179: bipush          90
        //  2181: aaload         
        //  2182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2185: aload           4
        //  2187: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  2190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2193: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2196: aload           108
        //  2198: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2201: goto            2120
        //  2204: astore          107
        //  2206: aload           107
        //  2208: athrow         
        //  2209: astore          106
        //  2211: new             Ljava/lang/StringBuilder;
        //  2214: dup            
        //  2215: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2218: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2221: bipush          92
        //  2223: aaload         
        //  2224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2227: aload_1        
        //  2228: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  2231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2234: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2237: bipush          71
        //  2239: aaload         
        //  2240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2243: aload           4
        //  2245: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  2248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2251: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2254: aload           106
        //  2256: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2259: goto            2128
        //  2262: new             Ljava/io/FileOutputStream;
        //  2265: dup            
        //  2266: aload_3        
        //  2267: iconst_1       
        //  2268: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;Z)V
        //  2271: astore          52
        //  2273: lload           37
        //  2275: lconst_0       
        //  2276: lcmp           
        //  2277: ifle            2308
        //  2280: iconst_1       
        //  2281: anewarray       Ljava/lang/Long;
        //  2284: astore          87
        //  2286: aload           87
        //  2288: iconst_0       
        //  2289: ldc2_w          100
        //  2292: lload           37
        //  2294: lmul           
        //  2295: lload           48
        //  2297: ldiv           
        //  2298: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2301: aastore        
        //  2302: aload_0        
        //  2303: aload           87
        //  2305: invokevirtual   com/whatsapp/ds.publishProgress:([Ljava/lang/Object;)V
        //  2308: new             Lcom/whatsapp/a2p;
        //  2311: dup            
        //  2312: aload           30
        //  2314: invokevirtual   javax/net/ssl/HttpsURLConnection.getInputStream:()Ljava/io/InputStream;
        //  2317: iconst_0       
        //  2318: invokespecial   com/whatsapp/a2p.<init>:(Ljava/io/InputStream;I)V
        //  2321: astore          53
        //  2323: sipush          8192
        //  2326: newarray        B
        //  2328: astore          62
        //  2330: aload           53
        //  2332: aload           62
        //  2334: iconst_0       
        //  2335: aload           62
        //  2337: arraylength    
        //  2338: invokevirtual   java/io/InputStream.read:([BII)I
        //  2341: istore          63
        //  2343: iload           63
        //  2345: iflt            3168
        //  2348: aload           52
        //  2350: aload           62
        //  2352: iconst_0       
        //  2353: iload           63
        //  2355: invokevirtual   java/io/OutputStream.write:([BII)V
        //  2358: lload           37
        //  2360: iload           63
        //  2362: i2l            
        //  2363: ladd           
        //  2364: lstore          37
        //  2366: aload_0        
        //  2367: invokevirtual   com/whatsapp/ds.isCancelled:()Z
        //  2370: ifeq            3118
        //  2373: new             Lcom/whatsapp/u5;
        //  2376: dup            
        //  2377: getstatic       com/whatsapp/kp.CANCEL:Lcom/whatsapp/kp;
        //  2380: aconst_null    
        //  2381: lload           6
        //  2383: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //  2386: astore          64
        //  2388: aload           30
        //  2390: ifnull          2398
        //  2393: aload           30
        //  2395: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //  2398: aload           53
        //  2400: ifnull          2408
        //  2403: aload           53
        //  2405: invokevirtual   java/io/InputStream.close:()V
        //  2408: aload           52
        //  2410: ifnull          2418
        //  2413: aload           52
        //  2415: invokevirtual   java/io/OutputStream.close:()V
        //  2418: aload           64
        //  2420: areturn        
        //  2421: astore          88
        //  2423: aload_3        
        //  2424: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //  2427: astore          89
        //  2429: new             Ljava/lang/StringBuilder;
        //  2432: dup            
        //  2433: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2436: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2439: bipush          93
        //  2441: aaload         
        //  2442: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2445: aload_1        
        //  2446: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  2449: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2452: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2455: bipush          94
        //  2457: aaload         
        //  2458: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2461: aload           4
        //  2463: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  2466: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2469: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2472: bipush          82
        //  2474: aaload         
        //  2475: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2478: aload_3        
        //  2479: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2482: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2485: bipush          95
        //  2487: aaload         
        //  2488: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2491: aload           89
        //  2493: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //  2496: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2499: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2502: bipush          110
        //  2504: aaload         
        //  2505: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2508: astore          91
        //  2510: aload           89
        //  2512: invokevirtual   java/io/File.isDirectory:()Z
        //  2515: ifeq            3711
        //  2518: ldc_w           "1"
        //  2521: astore          92
        //  2523: aload           91
        //  2525: aload           92
        //  2527: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2530: astore          94
        //  2532: aload           89
        //  2534: invokevirtual   java/io/File.canRead:()Z
        //  2537: ifeq            3719
        //  2540: ldc_w           "1"
        //  2543: astore          95
        //  2545: aload           94
        //  2547: aload           95
        //  2549: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2552: astore          97
        //  2554: aload           89
        //  2556: invokevirtual   java/io/File.canWrite:()Z
        //  2559: ifeq            2641
        //  2562: ldc_w           "1"
        //  2565: astore          98
        //  2567: aload           97
        //  2569: aload           98
        //  2571: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2574: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2577: aload           88
        //  2579: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2582: new             Lcom/whatsapp/u5;
        //  2585: dup            
        //  2586: getstatic       com/whatsapp/kp.FAILED_OUTPUT_STREAM:Lcom/whatsapp/kp;
        //  2589: aconst_null    
        //  2590: lload           6
        //  2592: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //  2595: astore          99
        //  2597: aload           30
        //  2599: ifnull          2607
        //  2602: aload           30
        //  2604: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //  2607: iconst_0       
        //  2608: ifeq            2615
        //  2611: aconst_null    
        //  2612: invokevirtual   java/io/InputStream.close:()V
        //  2615: iconst_0       
        //  2616: ifeq            2623
        //  2619: aconst_null    
        //  2620: invokevirtual   java/io/OutputStream.close:()V
        //  2623: aload           99
        //  2625: areturn        
        //  2626: astore          90
        //  2628: aload           90
        //  2630: athrow         
        //  2631: astore          93
        //  2633: aload           93
        //  2635: athrow         
        //  2636: astore          96
        //  2638: aload           96
        //  2640: athrow         
        //  2641: ldc_w           "0"
        //  2644: astore          98
        //  2646: goto            2567
        //  2649: astore          104
        //  2651: aload           104
        //  2653: athrow         
        //  2654: astore          103
        //  2656: aload           103
        //  2658: athrow         
        //  2659: astore          102
        //  2661: new             Ljava/lang/StringBuilder;
        //  2664: dup            
        //  2665: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2668: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2671: sipush          139
        //  2674: aaload         
        //  2675: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2678: aload_1        
        //  2679: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  2682: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2685: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2688: bipush          67
        //  2690: aaload         
        //  2691: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2694: aload           4
        //  2696: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  2699: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2702: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2705: aload           102
        //  2707: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2710: goto            2615
        //  2713: astore          101
        //  2715: aload           101
        //  2717: athrow         
        //  2718: astore          100
        //  2720: new             Ljava/lang/StringBuilder;
        //  2723: dup            
        //  2724: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2727: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2730: sipush          131
        //  2733: aaload         
        //  2734: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2737: aload_1        
        //  2738: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  2741: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2744: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2747: sipush          130
        //  2750: aaload         
        //  2751: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2754: aload           4
        //  2756: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  2759: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2762: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2765: aload           100
        //  2767: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2770: goto            2623
        //  2773: astore          86
        //  2775: aload           86
        //  2777: athrow         
        //  2778: astore          78
        //  2780: new             Ljava/lang/StringBuilder;
        //  2783: dup            
        //  2784: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2787: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2790: sipush          136
        //  2793: aaload         
        //  2794: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2797: aload_1        
        //  2798: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  2801: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2804: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2807: bipush          63
        //  2809: aaload         
        //  2810: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2813: aload           4
        //  2815: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  2818: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2821: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2824: aload           78
        //  2826: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2829: new             Lcom/whatsapp/u5;
        //  2832: dup            
        //  2833: getstatic       com/whatsapp/kp.FAILED_GENERIC:Lcom/whatsapp/kp;
        //  2836: aconst_null    
        //  2837: lload           6
        //  2839: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //  2842: astore          79
        //  2844: aload           30
        //  2846: ifnull          2854
        //  2849: aload           30
        //  2851: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //  2854: iconst_0       
        //  2855: ifeq            2862
        //  2858: aconst_null    
        //  2859: invokevirtual   java/io/InputStream.close:()V
        //  2862: aload           52
        //  2864: ifnull          2872
        //  2867: aload           52
        //  2869: invokevirtual   java/io/OutputStream.close:()V
        //  2872: aload           79
        //  2874: areturn        
        //  2875: astore          84
        //  2877: aload           84
        //  2879: athrow         
        //  2880: astore          83
        //  2882: aload           83
        //  2884: athrow         
        //  2885: astore          82
        //  2887: new             Ljava/lang/StringBuilder;
        //  2890: dup            
        //  2891: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2894: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2897: bipush          123
        //  2899: aaload         
        //  2900: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2903: aload_1        
        //  2904: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  2907: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2910: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2913: sipush          132
        //  2916: aaload         
        //  2917: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2920: aload           4
        //  2922: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  2925: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2928: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2931: aload           82
        //  2933: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2936: goto            2862
        //  2939: astore          81
        //  2941: aload           81
        //  2943: athrow         
        //  2944: astore          80
        //  2946: new             Ljava/lang/StringBuilder;
        //  2949: dup            
        //  2950: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2953: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2956: bipush          126
        //  2958: aaload         
        //  2959: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2962: aload_1        
        //  2963: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  2966: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2969: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  2972: bipush          72
        //  2974: aaload         
        //  2975: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2978: aload           4
        //  2980: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  2983: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2986: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2989: aload           80
        //  2991: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2994: goto            2872
        //  2997: astore          69
        //  2999: aload           69
        //  3001: athrow         
        //  3002: astore          68
        //  3004: aload           68
        //  3006: athrow         
        //  3007: astore          67
        //  3009: new             Ljava/lang/StringBuilder;
        //  3012: dup            
        //  3013: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3016: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3019: bipush          76
        //  3021: aaload         
        //  3022: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3025: aload_1        
        //  3026: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  3029: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3032: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3035: bipush          88
        //  3037: aaload         
        //  3038: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3041: aload           4
        //  3043: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  3046: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3049: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3052: aload           67
        //  3054: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3057: goto            2408
        //  3060: astore          66
        //  3062: aload           66
        //  3064: athrow         
        //  3065: astore          65
        //  3067: new             Ljava/lang/StringBuilder;
        //  3070: dup            
        //  3071: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3074: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3077: bipush          104
        //  3079: aaload         
        //  3080: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3083: aload_1        
        //  3084: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  3087: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3090: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3093: bipush          106
        //  3095: aaload         
        //  3096: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3099: aload           4
        //  3101: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  3104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3107: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3110: aload           65
        //  3112: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3115: goto            2418
        //  3118: iconst_1       
        //  3119: anewarray       Ljava/lang/Long;
        //  3122: astore          70
        //  3124: aload           70
        //  3126: iconst_0       
        //  3127: ldc2_w          100
        //  3130: lload           37
        //  3132: lmul           
        //  3133: lload           48
        //  3135: ldiv           
        //  3136: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3139: aastore        
        //  3140: aload_0        
        //  3141: aload           70
        //  3143: invokevirtual   com/whatsapp/ds.publishProgress:([Ljava/lang/Object;)V
        //  3146: aload           53
        //  3148: aload           62
        //  3150: iconst_0       
        //  3151: aload           62
        //  3153: arraylength    
        //  3154: invokevirtual   java/io/InputStream.read:([BII)I
        //  3157: istore          71
        //  3159: iload           71
        //  3161: istore          63
        //  3163: iload           5
        //  3165: ifeq            2343
        //  3168: aload_1        
        //  3169: aload_3        
        //  3170: aload           4
        //  3172: lload           6
        //  3174: aload           47
        //  3176: invokestatic    com/whatsapp/ds.a:(Lcom/whatsapp/protocol/bi;Ljava/io/File;Ljava/net/URL;JLcom/whatsapp/ow;)Lcom/whatsapp/u5;
        //  3179: astore          72
        //  3181: aload           30
        //  3183: ifnull          3191
        //  3186: aload           30
        //  3188: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //  3191: aload           53
        //  3193: ifnull          3201
        //  3196: aload           53
        //  3198: invokevirtual   java/io/InputStream.close:()V
        //  3201: aload           52
        //  3203: ifnull          3211
        //  3206: aload           52
        //  3208: invokevirtual   java/io/OutputStream.close:()V
        //  3211: aload           72
        //  3213: areturn        
        //  3214: astore          55
        //  3216: new             Ljava/lang/StringBuilder;
        //  3219: dup            
        //  3220: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3223: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3226: sipush          129
        //  3229: aaload         
        //  3230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3233: aload_1        
        //  3234: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  3237: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3240: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3243: bipush          124
        //  3245: aaload         
        //  3246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3249: aload           4
        //  3251: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  3254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3257: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3260: aload           55
        //  3262: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3265: new             Lcom/whatsapp/u5;
        //  3268: dup            
        //  3269: getstatic       com/whatsapp/kp.FAILED_GENERIC:Lcom/whatsapp/kp;
        //  3272: aconst_null    
        //  3273: lload           6
        //  3275: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;Ljava/lang/String;J)V
        //  3278: astore          56
        //  3280: aload           30
        //  3282: ifnull          3290
        //  3285: aload           30
        //  3287: invokevirtual   javax/net/ssl/HttpsURLConnection.disconnect:()V
        //  3290: aload           53
        //  3292: ifnull          3300
        //  3295: aload           53
        //  3297: invokevirtual   java/io/InputStream.close:()V
        //  3300: aload           52
        //  3302: ifnull          3310
        //  3305: aload           52
        //  3307: invokevirtual   java/io/OutputStream.close:()V
        //  3310: aload           56
        //  3312: areturn        
        //  3313: astore          61
        //  3315: aload           61
        //  3317: athrow         
        //  3318: astore          60
        //  3320: aload           60
        //  3322: athrow         
        //  3323: astore          59
        //  3325: new             Ljava/lang/StringBuilder;
        //  3328: dup            
        //  3329: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3332: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3335: bipush          74
        //  3337: aaload         
        //  3338: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3341: aload_1        
        //  3342: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  3345: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3348: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3351: bipush          53
        //  3353: aaload         
        //  3354: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3357: aload           4
        //  3359: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  3362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3365: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3368: aload           59
        //  3370: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3373: goto            3300
        //  3376: astore          58
        //  3378: aload           58
        //  3380: athrow         
        //  3381: astore          57
        //  3383: new             Ljava/lang/StringBuilder;
        //  3386: dup            
        //  3387: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3390: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3393: bipush          115
        //  3395: aaload         
        //  3396: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3399: aload_1        
        //  3400: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  3403: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3406: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3409: bipush          112
        //  3411: aaload         
        //  3412: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3415: aload           4
        //  3417: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  3420: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3423: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3426: aload           57
        //  3428: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3431: goto            3310
        //  3434: astore          77
        //  3436: aload           77
        //  3438: athrow         
        //  3439: astore          76
        //  3441: aload           76
        //  3443: athrow         
        //  3444: astore          75
        //  3446: new             Ljava/lang/StringBuilder;
        //  3449: dup            
        //  3450: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3453: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3456: bipush          50
        //  3458: aaload         
        //  3459: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3462: aload_1        
        //  3463: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  3466: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3469: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3472: bipush          75
        //  3474: aaload         
        //  3475: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3478: aload           4
        //  3480: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  3483: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3486: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3489: aload           75
        //  3491: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3494: goto            3201
        //  3497: astore          74
        //  3499: aload           74
        //  3501: athrow         
        //  3502: astore          73
        //  3504: new             Ljava/lang/StringBuilder;
        //  3507: dup            
        //  3508: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3511: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3514: bipush          107
        //  3516: aaload         
        //  3517: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3520: aload_1        
        //  3521: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  3524: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3527: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3530: bipush          66
        //  3532: aaload         
        //  3533: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3536: aload           4
        //  3538: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  3541: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3544: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3547: aload           73
        //  3549: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3552: goto            3211
        //  3555: astore          16
        //  3557: aload           16
        //  3559: athrow         
        //  3560: astore          15
        //  3562: aload           15
        //  3564: athrow         
        //  3565: astore          14
        //  3567: new             Ljava/lang/StringBuilder;
        //  3570: dup            
        //  3571: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3574: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3577: bipush          54
        //  3579: aaload         
        //  3580: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3583: aload_1        
        //  3584: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  3587: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3590: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3593: bipush          117
        //  3595: aaload         
        //  3596: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3599: aload           4
        //  3601: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  3604: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3607: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3610: aload           14
        //  3612: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3615: goto            829
        //  3618: astore          13
        //  3620: aload           13
        //  3622: athrow         
        //  3623: astore          12
        //  3625: new             Ljava/lang/StringBuilder;
        //  3628: dup            
        //  3629: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3632: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3635: bipush          49
        //  3637: aaload         
        //  3638: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3641: aload_1        
        //  3642: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  3645: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3648: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //  3651: bipush          52
        //  3653: aaload         
        //  3654: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3657: aload           4
        //  3659: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //  3662: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3665: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3668: aload           12
        //  3670: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3673: goto            839
        //  3676: astore          8
        //  3678: aconst_null    
        //  3679: astore          9
        //  3681: aconst_null    
        //  3682: astore          10
        //  3684: aconst_null    
        //  3685: astore          11
        //  3687: goto            809
        //  3690: astore          54
        //  3692: aload           53
        //  3694: astore          10
        //  3696: aload           52
        //  3698: astore          11
        //  3700: aload           30
        //  3702: astore          9
        //  3704: aload           54
        //  3706: astore          8
        //  3708: goto            809
        //  3711: ldc_w           "0"
        //  3714: astore          92
        //  3716: goto            2523
        //  3719: ldc_w           "0"
        //  3722: astore          95
        //  3724: goto            2545
        //  3727: astore          85
        //  3729: aload           52
        //  3731: astore          11
        //  3733: aload           30
        //  3735: astore          9
        //  3737: aload           85
        //  3739: astore          8
        //  3741: aconst_null    
        //  3742: astore          10
        //  3744: goto            809
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  10     32     575    788    Ljava/io/IOException;
        //  10     32     3676   3690   Any
        //  32     54     788    793    Ljava/io/IOException;
        //  32     54     793    809    Any
        //  65     109    793    809    Any
        //  120    204    850    855    Ljava/io/IOException;
        //  120    204    793    809    Any
        //  204    211    855    1071   Ljava/io/IOException;
        //  204    211    793    809    Any
        //  211    225    793    809    Any
        //  241    302    1071   1081   Ljava/io/IOException;
        //  241    302    793    809    Any
        //  318    333    793    809    Any
        //  338    343    1081   1086   Ljava/io/IOException;
        //  347    351    1091   1144   Ljava/io/IOException;
        //  347    351    1086   1091   Ljava/lang/NumberFormatException;
        //  355    359    1149   1203   Ljava/io/IOException;
        //  355    359    1144   1149   Ljava/lang/NumberFormatException;
        //  366    427    575    788    Ljava/io/IOException;
        //  366    427    3676   3690   Any
        //  431    435    507    512    Ljava/io/IOException;
        //  439    443    517    570    Ljava/io/IOException;
        //  439    443    512    517    Ljava/lang/NumberFormatException;
        //  447    451    454    507    Ljava/io/IOException;
        //  447    451    570    575    Ljava/lang/NumberFormatException;
        //  577    640    3676   3690   Any
        //  644    648    720    725    Ljava/io/IOException;
        //  652    656    730    783    Ljava/io/IOException;
        //  652    656    725    730    Ljava/lang/NumberFormatException;
        //  660    664    667    720    Ljava/io/IOException;
        //  660    664    783    788    Ljava/lang/NumberFormatException;
        //  790    793    793    809    Any
        //  814    819    3555   3560   Ljava/io/IOException;
        //  824    829    3565   3618   Ljava/io/IOException;
        //  824    829    3560   3565   Ljava/lang/NumberFormatException;
        //  834    839    3623   3676   Ljava/io/IOException;
        //  834    839    3618   3623   Ljava/lang/NumberFormatException;
        //  852    855    793    809    Any
        //  857    921    793    809    Any
        //  926    931    950    955    Ljava/io/IOException;
        //  935    939    960    1013   Ljava/io/IOException;
        //  935    939    955    960    Ljava/lang/NumberFormatException;
        //  943    947    1018   1071   Ljava/io/IOException;
        //  943    947    1013   1018   Ljava/lang/NumberFormatException;
        //  1073   1076   1076   1081   Ljava/io/IOException;
        //  1073   1076   793    809    Any
        //  1078   1081   793    809    Any
        //  1211   1224   793    809    Any
        //  1224   1245   1307   1312   Ljava/io/IOException;
        //  1224   1245   793    809    Any
        //  1250   1278   1433   1497   Ljava/lang/NumberFormatException;
        //  1250   1278   793    809    Any
        //  1283   1288   1312   1317   Ljava/io/IOException;
        //  1292   1296   1322   1375   Ljava/io/IOException;
        //  1292   1296   1317   1322   Ljava/lang/NumberFormatException;
        //  1300   1304   1380   1433   Ljava/io/IOException;
        //  1300   1304   1375   1380   Ljava/lang/NumberFormatException;
        //  1309   1312   793    809    Any
        //  1435   1497   793    809    Any
        //  1497   1512   793    809    Any
        //  1517   1522   1541   1546   Ljava/io/IOException;
        //  1526   1530   1551   1604   Ljava/io/IOException;
        //  1526   1530   1546   1551   Ljava/lang/NumberFormatException;
        //  1534   1538   1609   1662   Ljava/io/IOException;
        //  1534   1538   1604   1609   Ljava/lang/NumberFormatException;
        //  1662   1677   793    809    Any
        //  1682   1687   1706   1711   Ljava/io/IOException;
        //  1691   1695   1716   1770   Ljava/io/IOException;
        //  1691   1695   1711   1716   Ljava/lang/NumberFormatException;
        //  1699   1703   1775   1828   Ljava/io/IOException;
        //  1699   1703   1770   1775   Ljava/lang/NumberFormatException;
        //  1828   1909   793    809    Any
        //  1914   1919   1938   1943   Ljava/io/IOException;
        //  1923   1927   1948   2003   Ljava/io/IOException;
        //  1923   1927   1943   1948   Ljava/lang/NumberFormatException;
        //  1931   1935   2008   2061   Ljava/io/IOException;
        //  1931   1935   2003   2008   Ljava/lang/NumberFormatException;
        //  2065   2071   2131   2136   Ljava/io/IOException;
        //  2065   2071   793    809    Any
        //  2076   2082   2136   2141   Ljava/io/IOException;
        //  2076   2082   793    809    Any
        //  2087   2102   793    809    Any
        //  2107   2112   2141   2146   Ljava/io/IOException;
        //  2116   2120   2151   2204   Ljava/io/IOException;
        //  2116   2120   2146   2151   Ljava/lang/NumberFormatException;
        //  2124   2128   2209   2262   Ljava/io/IOException;
        //  2124   2128   2204   2209   Ljava/lang/NumberFormatException;
        //  2133   2136   2136   2141   Ljava/io/IOException;
        //  2133   2136   793    809    Any
        //  2138   2141   793    809    Any
        //  2262   2273   2421   3727   Ljava/io/FileNotFoundException;
        //  2262   2273   793    809    Any
        //  2280   2308   2773   2778   Ljava/io/IOException;
        //  2280   2308   3727   3747   Any
        //  2308   2323   2778   2997   Ljava/io/IOException;
        //  2308   2323   3727   3747   Any
        //  2323   2343   3214   3434   Ljava/io/IOException;
        //  2323   2343   3690   3711   Any
        //  2348   2358   3214   3434   Ljava/io/IOException;
        //  2348   2358   3690   3711   Any
        //  2366   2388   3214   3434   Ljava/io/IOException;
        //  2366   2388   3690   3711   Any
        //  2393   2398   2997   3002   Ljava/io/IOException;
        //  2403   2408   3007   3060   Ljava/io/IOException;
        //  2403   2408   3002   3007   Ljava/lang/NumberFormatException;
        //  2413   2418   3065   3118   Ljava/io/IOException;
        //  2413   2418   3060   3065   Ljava/lang/NumberFormatException;
        //  2423   2429   793    809    Any
        //  2429   2518   2626   2631   Ljava/io/IOException;
        //  2429   2518   793    809    Any
        //  2523   2540   2631   2636   Ljava/io/IOException;
        //  2523   2540   793    809    Any
        //  2545   2562   2636   2641   Ljava/io/IOException;
        //  2545   2562   793    809    Any
        //  2567   2597   793    809    Any
        //  2602   2607   2649   2654   Ljava/io/IOException;
        //  2611   2615   2659   2713   Ljava/io/IOException;
        //  2611   2615   2654   2659   Ljava/lang/NumberFormatException;
        //  2619   2623   2718   2773   Ljava/io/IOException;
        //  2619   2623   2713   2718   Ljava/lang/NumberFormatException;
        //  2628   2631   793    809    Any
        //  2633   2636   793    809    Any
        //  2638   2641   793    809    Any
        //  2775   2778   3727   3747   Any
        //  2780   2844   3727   3747   Any
        //  2849   2854   2875   2880   Ljava/io/IOException;
        //  2858   2862   2885   2939   Ljava/io/IOException;
        //  2858   2862   2880   2885   Ljava/lang/NumberFormatException;
        //  2867   2872   2944   2997   Ljava/io/IOException;
        //  2867   2872   2939   2944   Ljava/lang/NumberFormatException;
        //  3118   3159   3214   3434   Ljava/io/IOException;
        //  3118   3159   3690   3711   Any
        //  3168   3181   3690   3711   Any
        //  3186   3191   3434   3439   Ljava/io/IOException;
        //  3196   3201   3444   3497   Ljava/io/IOException;
        //  3196   3201   3439   3444   Ljava/lang/NumberFormatException;
        //  3206   3211   3502   3555   Ljava/io/IOException;
        //  3206   3211   3497   3502   Ljava/lang/NumberFormatException;
        //  3216   3280   3690   3711   Any
        //  3285   3290   3313   3318   Ljava/io/IOException;
        //  3295   3300   3323   3376   Ljava/io/IOException;
        //  3295   3300   3318   3323   Ljava/lang/NumberFormatException;
        //  3305   3310   3381   3434   Ljava/io/IOException;
        //  3305   3310   3376   3381   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1672, Size: 1672
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static u5 a(final bi bi, final File file, final URL url, final long n, final ow ow) {
        final String b = br.b(file);
        if (b == null) {
            try {
                Log.w(ds.z[11] + bi.a + ds.z[12] + a(url) + ds.z[13] + file.getAbsolutePath() + ds.z[14] + file.exists());
                file.delete();
                return new u5(kp.FAILED_GENERIC, null, n);
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
        try {
            if (!b.equals(ow.b())) {
                Log.w(ds.z[16] + bi.a + ds.z[17] + a(url) + ds.z[10] + ow.b() + ds.z[15] + b);
                return new u5(kp.FAILED_HASH_MISMATCH, null, n);
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return new u5(kp.SUCCESS, ow.a(), n);
    }
    
    private static String a(final URL url) {
        return br.a(url);
    }
    
    private static void a(final Uri$Builder p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: sipush          640
        //     7: istore_2       
        //     8: sipush          480
        //    11: istore_3       
        //    12: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    15: bipush          8
        //    17: if_icmplt       265
        //    20: iconst_1       
        //    21: invokestatic    android/media/CamcorderProfile.get:(I)Landroid/media/CamcorderProfile;
        //    24: astore          16
        //    26: aload           16
        //    28: ifnull          59
        //    31: iload_2        
        //    32: aload           16
        //    34: getfield        android/media/CamcorderProfile.videoFrameWidth:I
        //    37: invokestatic    java/lang/Math.max:(II)I
        //    40: istore_2       
        //    41: iload_3        
        //    42: aload           16
        //    44: getfield        android/media/CamcorderProfile.videoFrameHeight:I
        //    47: invokestatic    java/lang/Math.max:(II)I
        //    50: istore          17
        //    52: iload           17
        //    54: istore_3       
        //    55: iload_1        
        //    56: ifeq            309
        //    59: iload_2        
        //    60: istore          4
        //    62: iload_3        
        //    63: istore          5
        //    65: iconst_0       
        //    66: istore          18
        //    68: iload           18
        //    70: istore          6
        //    72: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    75: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    78: bipush          39
        //    80: aaload         
        //    81: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    84: checkcast       Landroid/view/WindowManager;
        //    87: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //    92: astore          7
        //    94: aload           7
        //    96: invokevirtual   android/view/Display.getWidth:()I
        //    99: istore          8
        //   101: aload           7
        //   103: invokevirtual   android/view/Display.getHeight:()I
        //   106: istore          9
        //   108: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   111: bipush          14
        //   113: if_icmplt       146
        //   116: new             Landroid/graphics/Point;
        //   119: dup            
        //   120: invokespecial   android/graphics/Point.<init>:()V
        //   123: astore          13
        //   125: aload           7
        //   127: aload           13
        //   129: invokevirtual   android/view/Display.getRealSize:(Landroid/graphics/Point;)V
        //   132: aload           13
        //   134: getfield        android/graphics/Point.x:I
        //   137: istore          8
        //   139: aload           13
        //   141: getfield        android/graphics/Point.y:I
        //   144: istore          9
        //   146: iload           8
        //   148: iload           9
        //   150: if_icmpge       282
        //   153: iload           6
        //   155: ifeq            172
        //   158: iload           4
        //   160: iload           9
        //   162: if_icmple       180
        //   165: iload           5
        //   167: iload           8
        //   169: if_icmple       180
        //   172: iload           8
        //   174: istore          5
        //   176: iload           9
        //   178: istore          4
        //   180: aload_0        
        //   181: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   184: bipush          37
        //   186: aaload         
        //   187: iload           4
        //   189: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   192: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   195: pop            
        //   196: aload_0        
        //   197: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   200: bipush          40
        //   202: aaload         
        //   203: iload           5
        //   205: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   208: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   211: pop            
        //   212: new             Ljava/lang/StringBuilder;
        //   215: dup            
        //   216: invokespecial   java/lang/StringBuilder.<init>:()V
        //   219: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   222: bipush          36
        //   224: aaload         
        //   225: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   228: iload           4
        //   230: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   233: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   236: bipush          38
        //   238: aaload         
        //   239: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   242: iload           5
        //   244: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   247: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   250: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   253: return         
        //   254: astore          15
        //   256: aload           15
        //   258: invokestatic    com/whatsapp/util/Log.d:(Ljava/lang/Throwable;)V
        //   261: iload_1        
        //   262: ifeq            297
        //   265: iload_2        
        //   266: istore          4
        //   268: iload_3        
        //   269: istore          5
        //   271: iconst_0       
        //   272: istore          6
        //   274: goto            72
        //   277: astore          14
        //   279: goto            146
        //   282: iload           9
        //   284: istore          10
        //   286: iload           8
        //   288: istore          9
        //   290: iload           10
        //   292: istore          8
        //   294: goto            153
        //   297: iload_2        
        //   298: istore          4
        //   300: iload_3        
        //   301: istore          5
        //   303: iconst_0       
        //   304: istore          6
        //   306: goto            72
        //   309: iload_2        
        //   310: istore          4
        //   312: iload_3        
        //   313: istore          5
        //   315: iconst_1       
        //   316: istore          18
        //   318: goto            68
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  20     26     254    265    Ljava/lang/RuntimeException;
        //  31     52     254    265    Ljava/lang/RuntimeException;
        //  116    146    277    282    Ljava/lang/NoSuchMethodError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0146:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void a(final u5 p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/ds.b:Ljava/util/HashMap;
        //     7: astore          4
        //     9: aload           4
        //    11: monitorenter   
        //    12: getstatic       com/whatsapp/ds.h:Ljava/util/HashMap;
        //    15: aload_0        
        //    16: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //    19: getfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //    22: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    25: checkcast       Ljava/util/List;
        //    28: astore          6
        //    30: aload           6
        //    32: ifnull          252
        //    35: aload           6
        //    37: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    42: astore          7
        //    44: aload           7
        //    46: invokeinterface java/util/Iterator.hasNext:()Z
        //    51: ifeq            248
        //    54: aload           7
        //    56: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    61: checkcast       Lcom/whatsapp/protocol/bi;
        //    64: astore          9
        //    66: aload           9
        //    68: aload_0        
        //    69: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //    72: if_acmpeq       244
        //    75: aload           9
        //    77: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    80: checkcast       Lcom/whatsapp/MediaData;
        //    83: astore          10
        //    85: aload           10
        //    87: iconst_0       
        //    88: putfield        com/whatsapp/MediaData.transferring:Z
        //    91: aload           10
        //    93: aload_0        
        //    94: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //    97: getfield        com/whatsapp/MediaData.transferred:Z
        //   100: putfield        com/whatsapp/MediaData.transferred:Z
        //   103: aload           10
        //   105: aload_0        
        //   106: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   109: getfield        com/whatsapp/MediaData.dedupeDownload:Z
        //   112: putfield        com/whatsapp/MediaData.dedupeDownload:Z
        //   115: aload_1        
        //   116: invokevirtual   com/whatsapp/u5.b:()Z
        //   119: ifeq            234
        //   122: aload           10
        //   124: aload_0        
        //   125: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   128: getfield        com/whatsapp/MediaData.fileSize:J
        //   131: putfield        com/whatsapp/MediaData.fileSize:J
        //   134: aload           9
        //   136: getfield        com/whatsapp/protocol/bi.I:B
        //   139: istore          14
        //   141: iload           14
        //   143: iconst_3       
        //   144: if_icmpne       177
        //   147: aload           9
        //   149: invokevirtual   com/whatsapp/protocol/bi.a:()Z
        //   152: istore          16
        //   154: iload           16
        //   156: ifne            177
        //   159: aload           9
        //   161: aload_0        
        //   162: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   165: invokevirtual   com/whatsapp/protocol/bi.d:()[B
        //   168: invokevirtual   com/whatsapp/protocol/bi.a:([B)V
        //   171: aload           9
        //   173: iconst_1       
        //   174: putfield        com/whatsapp/protocol/bi.n:I
        //   177: aload           10
        //   179: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   182: new             Ljava/lang/StringBuilder;
        //   185: dup            
        //   186: invokespecial   java/lang/StringBuilder.<init>:()V
        //   189: ldc_w           "."
        //   192: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   195: aload_2        
        //   196: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   199: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   202: aload           9
        //   204: getfield        com/whatsapp/protocol/bi.I:B
        //   207: aload           9
        //   209: getfield        com/whatsapp/protocol/bi.E:I
        //   212: iconst_0       
        //   213: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Ljava/lang/String;BIZ)Ljava/io/File;
        //   216: putfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   219: aload_0        
        //   220: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   223: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   226: aload           10
        //   228: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   231: invokestatic    com/whatsapp/util/br.a:(Ljava/io/File;Ljava/io/File;)V
        //   234: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   237: aload           9
        //   239: iconst_1       
        //   240: iconst_3       
        //   241: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;ZI)V
        //   244: iload_3        
        //   245: ifeq            44
        //   248: iload_3        
        //   249: ifeq            262
        //   252: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   255: sipush          143
        //   258: aaload         
        //   259: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   262: aload           4
        //   264: monitorexit    
        //   265: return         
        //   266: astore          11
        //   268: aload           11
        //   270: athrow         
        //   271: astore          12
        //   273: aload           12
        //   275: athrow         
        //   276: astore          13
        //   278: aload           13
        //   280: athrow         
        //   281: astore          5
        //   283: aload           4
        //   285: monitorexit    
        //   286: aload           5
        //   288: athrow         
        //   289: astore          15
        //   291: aload           10
        //   293: iconst_0       
        //   294: putfield        com/whatsapp/MediaData.transferred:Z
        //   297: new             Ljava/lang/StringBuilder;
        //   300: dup            
        //   301: invokespecial   java/lang/StringBuilder.<init>:()V
        //   304: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   307: sipush          141
        //   310: aaload         
        //   311: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   314: aload_0        
        //   315: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   318: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   321: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   324: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   327: sipush          142
        //   330: aaload         
        //   331: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   334: aload           9
        //   336: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   339: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   342: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   345: aload           15
        //   347: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   350: goto            234
        //   353: astore          8
        //   355: aload           8
        //   357: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  12     30     281    289    Any
        //  35     44     281    289    Any
        //  44     85     281    289    Any
        //  85     141    266    271    Ljava/io/IOException;
        //  85     141    281    289    Any
        //  147    154    271    276    Ljava/io/IOException;
        //  147    154    281    289    Any
        //  159    177    276    281    Ljava/io/IOException;
        //  159    177    281    289    Any
        //  177    219    281    289    Any
        //  219    234    289    353    Ljava/io/IOException;
        //  219    234    281    289    Any
        //  234    244    281    289    Any
        //  252    262    353    358    Ljava/io/IOException;
        //  252    262    281    289    Any
        //  262    265    281    289    Any
        //  268    271    271    276    Ljava/io/IOException;
        //  268    271    281    289    Any
        //  273    276    276    281    Ljava/io/IOException;
        //  273    276    281    289    Any
        //  278    281    281    289    Any
        //  283    286    281    289    Any
        //  291    350    281    289    Any
        //  355    358    281    289    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 155, Size: 155
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static File b(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //     8: ifnull          50
        //    11: new             Ljava/lang/StringBuilder;
        //    14: dup            
        //    15: invokespecial   java/lang/StringBuilder.<init>:()V
        //    18: aload_0        
        //    19: getfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //    22: bipush          47
        //    24: bipush          45
        //    26: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    35: bipush          42
        //    37: aaload         
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    41: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    44: astore          5
        //    46: iload_1        
        //    47: ifeq            98
        //    50: aload_0        
        //    51: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //    54: astore_3       
        //    55: aload_3        
        //    56: ifnull          79
        //    59: new             Ljava/io/File;
        //    62: dup            
        //    63: aload_0        
        //    64: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //    67: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    70: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    73: astore          5
        //    75: iload_1        
        //    76: ifeq            98
        //    79: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    82: bipush          41
        //    84: aaload         
        //    85: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    88: aconst_null    
        //    89: areturn        
        //    90: astore_2       
        //    91: aload_2        
        //    92: athrow         
        //    93: astore          4
        //    95: aload           4
        //    97: athrow         
        //    98: aload           5
        //   100: invokestatic    com/whatsapp/App.D:(Ljava/lang/String;)Ljava/io/File;
        //   103: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  50     55     90     93     Ljava/lang/NumberFormatException;
        //  79     88     93     98     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0079:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void b(final u5 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ds.f:Landroid/app/Activity;
        //     8: checkcast       Lcom/whatsapp/gu;
        //    11: astore_3       
        //    12: aload_1        
        //    13: getfield        com/whatsapp/u5.a:Lcom/whatsapp/kp;
        //    16: astore          6
        //    18: getstatic       com/whatsapp/kp.FAILED_GENERIC:Lcom/whatsapp/kp;
        //    21: astore          7
        //    23: aload           6
        //    25: aload           7
        //    27: if_acmpne       50
        //    30: aload_3        
        //    31: ldc_w           2131231039
        //    34: ldc_w           2131231860
        //    37: iconst_0       
        //    38: anewarray       Ljava/lang/String;
        //    41: invokeinterface com/whatsapp/gu.a:(II[Ljava/lang/String;)V
        //    46: iload_2        
        //    47: ifeq            465
        //    50: aload_1        
        //    51: getfield        com/whatsapp/u5.a:Lcom/whatsapp/kp;
        //    54: astore          8
        //    56: getstatic       com/whatsapp/kp.FAILED_OUTPUT_STREAM:Lcom/whatsapp/kp;
        //    59: astore          9
        //    61: aload           8
        //    63: aload           9
        //    65: if_acmpne       275
        //    68: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //    71: astore          26
        //    73: new             Ljava/lang/StringBuilder;
        //    76: dup            
        //    77: invokespecial   java/lang/StringBuilder.<init>:()V
        //    80: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    83: bipush          35
        //    85: aaload         
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    89: aload           26
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    97: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   100: aload           26
        //   102: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   105: bipush          31
        //   107: aaload         
        //   108: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   111: istore          29
        //   113: iload           29
        //   115: ifeq            152
        //   118: invokestatic    com/whatsapp/App.aw:()Z
        //   121: istore          36
        //   123: iload           36
        //   125: ifeq            486
        //   128: ldc_w           2131230960
        //   131: istore          37
        //   133: aload_3        
        //   134: ldc_w           2131231039
        //   137: iload           37
        //   139: iconst_0       
        //   140: anewarray       Ljava/lang/String;
        //   143: invokeinterface com/whatsapp/gu.a:(II[Ljava/lang/String;)V
        //   148: iload_2        
        //   149: ifeq            271
        //   152: aload           26
        //   154: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   157: bipush          34
        //   159: aaload         
        //   160: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   163: istore          32
        //   165: iload           32
        //   167: ifne            204
        //   170: invokestatic    com/whatsapp/App.aw:()Z
        //   173: istore          34
        //   175: iload           34
        //   177: ifeq            509
        //   180: ldc_w           2131230958
        //   183: istore          35
        //   185: aload_3        
        //   186: ldc_w           2131231039
        //   189: iload           35
        //   191: iconst_0       
        //   192: anewarray       Ljava/lang/String;
        //   195: invokeinterface com/whatsapp/gu.a:(II[Ljava/lang/String;)V
        //   200: iload_2        
        //   201: ifeq            271
        //   204: new             Ljava/lang/StringBuilder;
        //   207: dup            
        //   208: invokespecial   java/lang/StringBuilder.<init>:()V
        //   211: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   214: bipush          33
        //   216: aaload         
        //   217: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   220: aload_0        
        //   221: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   224: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   227: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   230: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   233: bipush          32
        //   235: aaload         
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: aload_0        
        //   240: getfield        com/whatsapp/ds.d:Ljava/net/URL;
        //   243: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   252: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   255: aload_3        
        //   256: ldc_w           2131231039
        //   259: ldc_w           2131231860
        //   262: iconst_0       
        //   263: anewarray       Ljava/lang/String;
        //   266: invokeinterface com/whatsapp/gu.a:(II[Ljava/lang/String;)V
        //   271: iload_2        
        //   272: ifeq            465
        //   275: aload_1        
        //   276: getfield        com/whatsapp/u5.a:Lcom/whatsapp/kp;
        //   279: astore          12
        //   281: getstatic       com/whatsapp/kp.FAILED_INSUFFICIENT_SPACE:Lcom/whatsapp/kp;
        //   284: astore          13
        //   286: aload           12
        //   288: aload           13
        //   290: if_acmpne       327
        //   293: invokestatic    com/whatsapp/App.aw:()Z
        //   296: istore          23
        //   298: iload           23
        //   300: ifeq            532
        //   303: ldc_w           2131231254
        //   306: istore          24
        //   308: aload_3        
        //   309: ldc_w           2131231039
        //   312: iload           24
        //   314: iconst_0       
        //   315: anewarray       Ljava/lang/String;
        //   318: invokeinterface com/whatsapp/gu.a:(II[Ljava/lang/String;)V
        //   323: iload_2        
        //   324: ifeq            465
        //   327: aload_1        
        //   328: getfield        com/whatsapp/u5.a:Lcom/whatsapp/kp;
        //   331: astore          16
        //   333: getstatic       com/whatsapp/kp.FAILED_TOO_OLD:Lcom/whatsapp/kp;
        //   336: astore          17
        //   338: aload           16
        //   340: aload           17
        //   342: if_acmpne       439
        //   345: aload_0        
        //   346: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   349: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   352: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   355: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //   358: ifeq            555
        //   361: aload_0        
        //   362: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   365: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   368: astore          19
        //   370: aload           19
        //   372: ifnull          419
        //   375: aload           19
        //   377: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   380: astore          21
        //   382: iconst_1       
        //   383: anewarray       Ljava/lang/String;
        //   386: astore          22
        //   388: aload           22
        //   390: iconst_0       
        //   391: aload           21
        //   393: aload_0        
        //   394: getfield        com/whatsapp/ds.f:Landroid/app/Activity;
        //   397: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   400: aastore        
        //   401: aload_3        
        //   402: ldc_w           2131231039
        //   405: ldc_w           2131231857
        //   408: aload           22
        //   410: invokeinterface com/whatsapp/gu.a:(II[Ljava/lang/String;)V
        //   415: iload_2        
        //   416: ifeq            435
        //   419: aload_3        
        //   420: ldc_w           2131231039
        //   423: ldc_w           2131231259
        //   426: iconst_0       
        //   427: anewarray       Ljava/lang/String;
        //   430: invokeinterface com/whatsapp/gu.a:(II[Ljava/lang/String;)V
        //   435: iload_2        
        //   436: ifeq            465
        //   439: aload_1        
        //   440: getfield        com/whatsapp/u5.a:Lcom/whatsapp/kp;
        //   443: getstatic       com/whatsapp/kp.FAILED_INVALID_URL:Lcom/whatsapp/kp;
        //   446: if_acmpne       465
        //   449: aload_3        
        //   450: ldc_w           2131231039
        //   453: ldc_w           2131231259
        //   456: iconst_0       
        //   457: anewarray       Ljava/lang/String;
        //   460: invokeinterface com/whatsapp/gu.a:(II[Ljava/lang/String;)V
        //   465: return         
        //   466: astore          4
        //   468: aload           4
        //   470: athrow         
        //   471: astore          5
        //   473: aload           5
        //   475: athrow         
        //   476: astore          27
        //   478: aload           27
        //   480: athrow         
        //   481: astore          28
        //   483: aload           28
        //   485: athrow         
        //   486: ldc_w           2131230961
        //   489: istore          37
        //   491: goto            133
        //   494: astore          38
        //   496: aload           38
        //   498: athrow         
        //   499: astore          30
        //   501: aload           30
        //   503: athrow         
        //   504: astore          31
        //   506: aload           31
        //   508: athrow         
        //   509: ldc_w           2131230959
        //   512: istore          35
        //   514: goto            185
        //   517: astore          33
        //   519: aload           33
        //   521: athrow         
        //   522: astore          10
        //   524: aload           10
        //   526: athrow         
        //   527: astore          11
        //   529: aload           11
        //   531: athrow         
        //   532: ldc_w           2131231255
        //   535: istore          24
        //   537: goto            308
        //   540: astore          25
        //   542: aload           25
        //   544: athrow         
        //   545: astore          14
        //   547: aload           14
        //   549: athrow         
        //   550: astore          15
        //   552: aload           15
        //   554: athrow         
        //   555: aload_0        
        //   556: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   559: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   562: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   565: astore          19
        //   567: goto            370
        //   570: astore          20
        //   572: aload           20
        //   574: athrow         
        //   575: astore          18
        //   577: aload           18
        //   579: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  12     23     466    471    Ljava/lang/NumberFormatException;
        //  30     46     471    476    Ljava/lang/NumberFormatException;
        //  50     61     471    476    Ljava/lang/NumberFormatException;
        //  73     113    476    481    Ljava/lang/NumberFormatException;
        //  118    123    481    486    Ljava/lang/NumberFormatException;
        //  133    148    494    499    Ljava/lang/NumberFormatException;
        //  152    165    499    504    Ljava/lang/NumberFormatException;
        //  170    175    504    509    Ljava/lang/NumberFormatException;
        //  185    200    517    522    Ljava/lang/NumberFormatException;
        //  204    271    517    522    Ljava/lang/NumberFormatException;
        //  275    286    522    527    Ljava/lang/NumberFormatException;
        //  293    298    527    532    Ljava/lang/NumberFormatException;
        //  308    323    540    545    Ljava/lang/NumberFormatException;
        //  327    338    545    550    Ljava/lang/NumberFormatException;
        //  345    370    550    555    Ljava/lang/NumberFormatException;
        //  382    415    570    575    Ljava/lang/NumberFormatException;
        //  419    435    570    575    Ljava/lang/NumberFormatException;
        //  439    465    575    580    Ljava/lang/NumberFormatException;
        //  468    471    471    476    Ljava/lang/NumberFormatException;
        //  478    481    481    486    Ljava/lang/NumberFormatException;
        //  496    499    499    504    Ljava/lang/NumberFormatException;
        //  501    504    504    509    Ljava/lang/NumberFormatException;
        //  524    527    527    532    Ljava/lang/NumberFormatException;
        //  542    545    545    550    Ljava/lang/NumberFormatException;
        //  547    550    550    555    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 257, Size: 257
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static URL c(final bi bi) {
        final Uri a = a(bi);
        if (TextUtils.isEmpty((CharSequence)a.getHost())) {
            Log.w(ds.z[146] + bi.a + ds.z[144] + bi.d);
            final boolean i = App.I;
            final URL url = null;
            if (!i) {
                return url;
            }
        }
        try {
            return new URL(a.toString());
        }
        catch (MalformedURLException ex) {
            Log.c(ds.z[147] + bi.a + ds.z[145] + bi.d, ex);
            return null;
        }
    }
    
    protected u5 a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/ds.d:Ljava/net/URL;
        //    10: ifnonnull       33
        //    13: new             Lcom/whatsapp/u5;
        //    16: dup            
        //    17: getstatic       com/whatsapp/kp.FAILED_INVALID_URL:Lcom/whatsapp/kp;
        //    20: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;)V
        //    23: astore          5
        //    25: aload           5
        //    27: areturn        
        //    28: astore          4
        //    30: aload           4
        //    32: athrow         
        //    33: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    36: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;)V
        //    39: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    42: aload_0        
        //    43: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //    46: getfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //    49: invokevirtual   com/whatsapp/vy.B:(Ljava/lang/String;)Ljava/io/File;
        //    52: astore          6
        //    54: aload           6
        //    56: ifnull          229
        //    59: new             Ljava/lang/StringBuilder;
        //    62: dup            
        //    63: invokespecial   java/lang/StringBuilder.<init>:()V
        //    66: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    69: bipush          20
        //    71: aaload         
        //    72: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    75: aload_0        
        //    76: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //    79: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    85: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    88: bipush          27
        //    90: aaload         
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: aload_0        
        //    95: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //    98: getfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   107: bipush          22
        //   109: aaload         
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: aload           6
        //   115: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   121: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   124: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   127: aload           6
        //   129: aload_0        
        //   130: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   133: invokestatic    com/whatsapp/util/br.a:(Ljava/io/File;Ljava/io/File;)V
        //   136: aload_0        
        //   137: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   140: iconst_1       
        //   141: putfield        com/whatsapp/MediaData.dedupeDownload:Z
        //   144: new             Lcom/whatsapp/u5;
        //   147: dup            
        //   148: getstatic       com/whatsapp/kp.SUCCESS:Lcom/whatsapp/kp;
        //   151: invokespecial   com/whatsapp/u5.<init>:(Lcom/whatsapp/kp;)V
        //   154: astore          41
        //   156: aload           41
        //   158: areturn        
        //   159: astore          40
        //   161: new             Ljava/lang/StringBuilder;
        //   164: dup            
        //   165: invokespecial   java/lang/StringBuilder.<init>:()V
        //   168: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   171: bipush          21
        //   173: aaload         
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: aload_0        
        //   178: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   181: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   187: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   190: bipush          28
        //   192: aaload         
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: aload_0        
        //   197: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   200: getfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   209: bipush          30
        //   211: aaload         
        //   212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   215: aload           6
        //   217: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   220: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   223: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   226: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   229: aload_0        
        //   230: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   233: invokevirtual   java/io/File.length:()J
        //   236: lstore          8
        //   238: lload           8
        //   240: lconst_0       
        //   241: lcmp           
        //   242: ifle            723
        //   245: iconst_1       
        //   246: istore          10
        //   248: aload_0        
        //   249: aload_0        
        //   250: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   253: aload_0        
        //   254: getfield        com/whatsapp/ds.g:Z
        //   257: aload_0        
        //   258: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   261: aload_0        
        //   262: getfield        com/whatsapp/ds.d:Ljava/net/URL;
        //   265: invokestatic    com/whatsapp/ds.a:(Lcom/whatsapp/ds;Lcom/whatsapp/protocol/bi;ZLjava/io/File;Ljava/net/URL;)Lcom/whatsapp/u5;
        //   268: astore          11
        //   270: aload           11
        //   272: getfield        com/whatsapp/u5.a:Lcom/whatsapp/kp;
        //   275: getstatic       com/whatsapp/kp.FAILED_CANNOT_RESUME:Lcom/whatsapp/kp;
        //   278: if_acmpeq       300
        //   281: aload           11
        //   283: getfield        com/whatsapp/u5.a:Lcom/whatsapp/kp;
        //   286: astore          37
        //   288: getstatic       com/whatsapp/kp.FAILED_HASH_MISMATCH:Lcom/whatsapp/kp;
        //   291: astore          38
        //   293: aload           37
        //   295: aload           38
        //   297: if_acmpne       796
        //   300: aload_0        
        //   301: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   304: invokevirtual   java/io/File.delete:()Z
        //   307: istore          15
        //   309: iload           15
        //   311: ifne            365
        //   314: new             Ljava/lang/StringBuilder;
        //   317: dup            
        //   318: invokespecial   java/lang/StringBuilder.<init>:()V
        //   321: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   324: bipush          23
        //   326: aaload         
        //   327: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   330: aload_0        
        //   331: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   334: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   340: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   343: bipush          29
        //   345: aaload         
        //   346: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   349: aload_0        
        //   350: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   353: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   362: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   365: iload           10
        //   367: ifeq            789
        //   370: aload_0        
        //   371: aload_0        
        //   372: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   375: aload_0        
        //   376: getfield        com/whatsapp/ds.g:Z
        //   379: aload_0        
        //   380: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   383: aload_0        
        //   384: getfield        com/whatsapp/ds.d:Ljava/net/URL;
        //   387: invokestatic    com/whatsapp/ds.a:(Lcom/whatsapp/ds;Lcom/whatsapp/protocol/bi;ZLjava/io/File;Ljava/net/URL;)Lcom/whatsapp/u5;
        //   390: astore          16
        //   392: iload_3        
        //   393: ifeq            620
        //   396: aload           16
        //   398: getfield        com/whatsapp/u5.a:Lcom/whatsapp/kp;
        //   401: astore          28
        //   403: getstatic       com/whatsapp/kp.FAILED_TOO_OLD:Lcom/whatsapp/kp;
        //   406: astore          29
        //   408: aload           28
        //   410: aload           29
        //   412: if_acmpne       620
        //   415: aload_0        
        //   416: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   419: getfield        com/whatsapp/protocol/bi.c:I
        //   422: istore          30
        //   424: iload           30
        //   426: bipush          12
        //   428: if_icmpeq       620
        //   431: new             Ljava/lang/StringBuilder;
        //   434: dup            
        //   435: invokespecial   java/lang/StringBuilder.<init>:()V
        //   438: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   441: bipush          24
        //   443: aaload         
        //   444: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   447: aload_0        
        //   448: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   451: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   454: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   457: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   460: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   463: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   466: aload_0        
        //   467: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   470: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   473: bipush          11
        //   475: invokevirtual   com/whatsapp/vy.b:(Lcom/whatsapp/protocol/c6;I)Z
        //   478: pop            
        //   479: aload_0        
        //   480: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   483: invokestatic    com/whatsapp/App.d:(Lcom/whatsapp/protocol/bi;)V
        //   486: aload_0        
        //   487: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   490: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   493: astore          32
        //   495: iload_2        
        //   496: bipush          12
        //   498: if_icmpgt       620
        //   501: ldc2_w          1000
        //   504: invokestatic    java/lang/Thread.sleep:(J)V
        //   507: aload           32
        //   509: aload_0        
        //   510: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   513: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   516: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   519: istore          35
        //   521: iload           35
        //   523: ifne            613
        //   526: aload_0        
        //   527: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   530: invokestatic    com/whatsapp/ds.c:(Lcom/whatsapp/protocol/bi;)Ljava/net/URL;
        //   533: astore          36
        //   535: aload           36
        //   537: ifnull          620
        //   540: new             Ljava/lang/StringBuilder;
        //   543: dup            
        //   544: invokespecial   java/lang/StringBuilder.<init>:()V
        //   547: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   550: bipush          26
        //   552: aaload         
        //   553: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   556: aload_0        
        //   557: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   560: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   563: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   566: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   569: bipush          25
        //   571: aaload         
        //   572: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   575: aload           36
        //   577: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //   580: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   583: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   586: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   589: aload_0        
        //   590: aload_0        
        //   591: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   594: aload_0        
        //   595: getfield        com/whatsapp/ds.g:Z
        //   598: aload_0        
        //   599: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   602: aload           36
        //   604: invokestatic    com/whatsapp/ds.a:(Lcom/whatsapp/ds;Lcom/whatsapp/protocol/bi;ZLjava/io/File;Ljava/net/URL;)Lcom/whatsapp/u5;
        //   607: astore          16
        //   609: iload_3        
        //   610: ifeq            620
        //   613: iinc            2, 1
        //   616: iload_3        
        //   617: ifeq            495
        //   620: aload_0        
        //   621: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   624: getfield        com/whatsapp/protocol/bi.I:B
        //   627: iconst_1       
        //   628: if_icmpne       677
        //   631: aload           16
        //   633: invokevirtual   com/whatsapp/u5.b:()Z
        //   636: istore          21
        //   638: iload           21
        //   640: ifeq            677
        //   643: aload_0        
        //   644: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   647: invokestatic    com/whatsapp/util/b.a:(Lcom/whatsapp/protocol/bi;)Landroid/graphics/Bitmap;
        //   650: astore          23
        //   652: aload           23
        //   654: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   657: aload           23
        //   659: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   662: if_icmple       677
        //   665: aload_0        
        //   666: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   669: aload_0        
        //   670: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   673: invokestatic    com/whatsapp/util/br.a:(Ljava/io/File;Lcom/whatsapp/MediaData;)Z
        //   676: pop            
        //   677: getstatic       com/whatsapp/ds.b:Ljava/util/HashMap;
        //   680: astore          18
        //   682: aload           18
        //   684: monitorenter   
        //   685: getstatic       com/whatsapp/ds.b:Ljava/util/HashMap;
        //   688: aload_0        
        //   689: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   692: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   695: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   698: pop            
        //   699: aload           18
        //   701: monitorexit    
        //   702: aload           16
        //   704: areturn        
        //   705: astore          19
        //   707: aload           18
        //   709: monitorexit    
        //   710: aload           19
        //   712: athrow         
        //   713: astore          39
        //   715: aload           39
        //   717: athrow         
        //   718: astore          7
        //   720: aload           7
        //   722: athrow         
        //   723: iconst_0       
        //   724: istore          10
        //   726: goto            248
        //   729: astore          12
        //   731: aload           12
        //   733: athrow         
        //   734: astore          13
        //   736: aload           13
        //   738: athrow         
        //   739: astore          14
        //   741: aload           14
        //   743: athrow         
        //   744: astore          26
        //   746: aload           26
        //   748: athrow         
        //   749: astore          27
        //   751: aload           27
        //   753: athrow         
        //   754: astore          33
        //   756: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   759: invokevirtual   java/lang/Thread.interrupt:()V
        //   762: iload_3        
        //   763: ifeq            620
        //   766: goto            507
        //   769: astore          34
        //   771: aload           34
        //   773: athrow         
        //   774: astore          17
        //   776: aload           17
        //   778: athrow         
        //   779: astore          24
        //   781: aload           24
        //   783: athrow         
        //   784: astore          22
        //   786: goto            677
        //   789: aload           11
        //   791: astore          16
        //   793: goto            620
        //   796: aload           11
        //   798: astore          16
        //   800: goto            396
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  6      25     28     33     Ljava/io/IOException;
        //  59     127    713    718    Ljava/lang/InterruptedException;
        //  127    156    159    229    Ljava/io/IOException;
        //  127    156    713    718    Ljava/lang/InterruptedException;
        //  229    238    718    723    Ljava/io/IOException;
        //  270    293    729    734    Ljava/io/IOException;
        //  300    309    734    739    Ljava/io/IOException;
        //  314    365    739    744    Ljava/io/IOException;
        //  396    408    744    749    Ljava/io/IOException;
        //  415    424    749    754    Ljava/io/IOException;
        //  501    507    754    769    Ljava/lang/InterruptedException;
        //  507    521    769    774    Ljava/io/IOException;
        //  620    638    774    779    Ljava/io/IOException;
        //  643    652    784    789    Ljava/lang/Exception;
        //  652    677    779    784    Ljava/io/IOException;
        //  652    677    784    789    Ljava/lang/Exception;
        //  685    702    705    713    Any
        //  707    710    705    713    Any
        //  731    734    734    739    Ljava/io/IOException;
        //  736    739    739    744    Ljava/io/IOException;
        //  746    749    749    754    Ljava/io/IOException;
        //  756    762    769    774    Ljava/io/IOException;
        //  781    784    784    789    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 361, Size: 361
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/ds.b:Ljava/util/HashMap;
        //     7: astore_2       
        //     8: aload_2        
        //     9: monitorenter   
        //    10: new             Ljava/lang/StringBuilder;
        //    13: dup            
        //    14: invokespecial   java/lang/StringBuilder.<init>:()V
        //    17: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    20: bipush          8
        //    22: aaload         
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: aload_0        
        //    27: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //    30: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    36: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    39: bipush          9
        //    41: aaload         
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: aload_0        
        //    46: getfield        com/whatsapp/ds.d:Ljava/net/URL;
        //    49: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    58: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    61: getstatic       com/whatsapp/ds.h:Ljava/util/HashMap;
        //    64: aload_0        
        //    65: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //    68: getfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //    71: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    74: checkcast       Ljava/util/List;
        //    77: astore          4
        //    79: aload           4
        //    81: ifnull          110
        //    84: aload           4
        //    86: iconst_0       
        //    87: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    92: checkcast       Lcom/whatsapp/protocol/bi;
        //    95: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    98: checkcast       Lcom/whatsapp/MediaData;
        //   101: getfield        com/whatsapp/MediaData.downloader:Lcom/whatsapp/ds;
        //   104: astore          5
        //   106: iload_1        
        //   107: ifeq            113
        //   110: aconst_null    
        //   111: astore          5
        //   113: aload           5
        //   115: ifnull          133
        //   118: aload           5
        //   120: aload_0        
        //   121: if_acmpeq       133
        //   124: aload           5
        //   126: invokevirtual   com/whatsapp/ds.a:()V
        //   129: iload_1        
        //   130: ifeq            357
        //   133: aload_0        
        //   134: iconst_1       
        //   135: invokevirtual   com/whatsapp/ds.cancel:(Z)Z
        //   138: pop            
        //   139: invokestatic    com/whatsapp/arz.a:()Lcom/whatsapp/arz;
        //   142: aload_0        
        //   143: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   146: invokevirtual   com/whatsapp/arz.a:(Lcom/whatsapp/protocol/bi;)V
        //   149: getstatic       com/whatsapp/ds.b:Ljava/util/HashMap;
        //   152: aload_0        
        //   153: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   156: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   159: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   162: pop            
        //   163: aload_0        
        //   164: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   167: getfield        com/whatsapp/MediaData.transferred:Z
        //   170: istore          10
        //   172: iload           10
        //   174: ifne            211
        //   177: aload_0        
        //   178: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   181: iconst_0       
        //   182: putfield        com/whatsapp/MediaData.transferring:Z
        //   185: aload_0        
        //   186: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   189: iconst_0       
        //   190: putfield        com/whatsapp/MediaData.transferred:Z
        //   193: aload_0        
        //   194: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   197: iconst_0       
        //   198: putfield        com/whatsapp/MediaData.autodownloadRetryEnabled:Z
        //   201: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   204: aload_0        
        //   205: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   208: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;)V
        //   211: getstatic       com/whatsapp/ds.h:Ljava/util/HashMap;
        //   214: aload_0        
        //   215: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   218: getfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //   221: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   224: pop            
        //   225: aload           4
        //   227: ifnull          352
        //   230: aload           4
        //   232: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   237: astore          12
        //   239: aload           12
        //   241: invokeinterface java/util/Iterator.hasNext:()Z
        //   246: ifeq            352
        //   249: aload           12
        //   251: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   256: checkcast       Lcom/whatsapp/protocol/bi;
        //   259: astore          13
        //   261: aload           13
        //   263: aload_0        
        //   264: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   267: if_acmpeq       385
        //   270: invokestatic    com/whatsapp/arz.a:()Lcom/whatsapp/arz;
        //   273: aload           13
        //   275: invokevirtual   com/whatsapp/arz.a:(Lcom/whatsapp/protocol/bi;)V
        //   278: aload           13
        //   280: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   283: checkcast       Lcom/whatsapp/MediaData;
        //   286: astore          14
        //   288: aload           14
        //   290: iconst_0       
        //   291: putfield        com/whatsapp/MediaData.transferring:Z
        //   294: aload           14
        //   296: aload_0        
        //   297: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   300: getfield        com/whatsapp/MediaData.transferred:Z
        //   303: putfield        com/whatsapp/MediaData.transferred:Z
        //   306: aload           14
        //   308: iconst_0       
        //   309: putfield        com/whatsapp/MediaData.autodownloadRetryEnabled:Z
        //   312: aload           14
        //   314: getfield        com/whatsapp/MediaData.downloader:Lcom/whatsapp/ds;
        //   317: ifnull          329
        //   320: aload           14
        //   322: getfield        com/whatsapp/MediaData.downloader:Lcom/whatsapp/ds;
        //   325: aconst_null    
        //   326: putfield        com/whatsapp/ds.f:Landroid/app/Activity;
        //   329: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   332: aload           13
        //   334: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;)V
        //   337: getstatic       com/whatsapp/ds.b:Ljava/util/HashMap;
        //   340: aload           13
        //   342: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   345: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   348: pop            
        //   349: goto            385
        //   352: aload_0        
        //   353: aconst_null    
        //   354: putfield        com/whatsapp/ds.f:Landroid/app/Activity;
        //   357: aload_2        
        //   358: monitorexit    
        //   359: return         
        //   360: astore          17
        //   362: aload           17
        //   364: athrow         
        //   365: astore          6
        //   367: aload           6
        //   369: athrow         
        //   370: astore          7
        //   372: aload           7
        //   374: athrow         
        //   375: astore_3       
        //   376: aload_2        
        //   377: monitorexit    
        //   378: aload_3        
        //   379: athrow         
        //   380: astore          15
        //   382: aload           15
        //   384: athrow         
        //   385: iload_1        
        //   386: ifeq            239
        //   389: goto            352
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  10     79     375    380    Any
        //  84     106    375    380    Any
        //  124    129    360    365    Ljava/lang/NumberFormatException;
        //  124    129    375    380    Any
        //  133    172    365    370    Ljava/lang/NumberFormatException;
        //  133    172    375    380    Any
        //  177    211    370    375    Ljava/lang/NumberFormatException;
        //  177    211    375    380    Any
        //  211    225    375    380    Any
        //  230    239    375    380    Any
        //  239    288    375    380    Any
        //  288    329    380    385    Ljava/lang/NumberFormatException;
        //  288    329    375    380    Any
        //  329    349    375    380    Any
        //  352    357    375    380    Any
        //  357    359    375    380    Any
        //  362    365    365    370    Ljava/lang/NumberFormatException;
        //  362    365    375    380    Any
        //  367    370    370    375    Ljava/lang/NumberFormatException;
        //  367    370    375    380    Any
        //  372    375    375    380    Any
        //  376    378    375    380    Any
        //  382    385    375    380    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 175, Size: 175
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected void a(final u5 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: invokespecial   java/lang/StringBuilder.<init>:()V
        //    13: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    16: iconst_0       
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_0        
        //    22: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //    25: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    31: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    34: iload_2        
        //    35: aaload         
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    39: aload_0        
        //    40: getfield        com/whatsapp/ds.d:Ljava/net/URL;
        //    43: invokestatic    com/whatsapp/ds.a:(Ljava/net/URL;)Ljava/lang/String;
        //    46: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    49: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //    52: iconst_3       
        //    53: aaload         
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: aload_1        
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    61: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    64: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    67: aload_0        
        //    68: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //    71: iconst_0       
        //    72: putfield        com/whatsapp/MediaData.transferring:Z
        //    75: aload_0        
        //    76: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //    79: aload_1        
        //    80: invokevirtual   com/whatsapp/u5.b:()Z
        //    83: putfield        com/whatsapp/MediaData.transferred:Z
        //    86: ldc_w           ""
        //    89: astore          4
        //    91: aload_1        
        //    92: invokevirtual   com/whatsapp/u5.b:()Z
        //    95: ifeq            338
        //    98: aload_0        
        //    99: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   102: aload_0        
        //   103: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   106: putfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   109: aload_0        
        //   110: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   113: aload_0        
        //   114: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   117: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   120: invokevirtual   java/io/File.length:()J
        //   123: putfield        com/whatsapp/MediaData.fileSize:J
        //   126: aload_1        
        //   127: getfield        com/whatsapp/u5.b:Ljava/lang/String;
        //   130: astore          21
        //   132: aload           21
        //   134: ifnull          147
        //   137: aload_1        
        //   138: getfield        com/whatsapp/u5.b:Ljava/lang/String;
        //   141: astore          4
        //   143: iload_3        
        //   144: ifeq            205
        //   147: aload_0        
        //   148: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   151: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   154: astore          23
        //   156: aload           23
        //   158: ifnull          205
        //   161: new             Ljava/io/File;
        //   164: dup            
        //   165: aload_0        
        //   166: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   169: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   172: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   175: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   178: astore          31
        //   180: aload           31
        //   182: bipush          46
        //   184: invokevirtual   java/lang/String.lastIndexOf:(I)I
        //   187: istore          32
        //   189: iload           32
        //   191: ifle            205
        //   194: aload           31
        //   196: iload           32
        //   198: iconst_1       
        //   199: iadd           
        //   200: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   203: astore          4
        //   205: aload_0        
        //   206: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   209: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   212: new             Ljava/lang/StringBuilder;
        //   215: dup            
        //   216: invokespecial   java/lang/StringBuilder.<init>:()V
        //   219: ldc_w           "."
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: aload           4
        //   227: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   230: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   233: aload_0        
        //   234: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   237: getfield        com/whatsapp/protocol/bi.I:B
        //   240: aload_0        
        //   241: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   244: getfield        com/whatsapp/protocol/bi.E:I
        //   247: iconst_0       
        //   248: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Ljava/lang/String;BIZ)Ljava/io/File;
        //   251: putfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   254: aload_0        
        //   255: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   258: aload_0        
        //   259: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   262: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   265: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   268: pop            
        //   269: aload_0        
        //   270: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   273: invokevirtual   java/io/File.delete:()Z
        //   276: pop            
        //   277: aload_0        
        //   278: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   281: getfield        com/whatsapp/protocol/bi.I:B
        //   284: istore          29
        //   286: iload           29
        //   288: iconst_3       
        //   289: if_icmpne       358
        //   292: aload_0        
        //   293: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   296: invokevirtual   com/whatsapp/protocol/bi.a:()Z
        //   299: istore          30
        //   301: iload           30
        //   303: ifne            358
        //   306: aload_0        
        //   307: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   310: aload_0        
        //   311: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   314: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   317: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   320: invokestatic    com/whatsapp/util/br.a:(Ljava/lang/String;)[B
        //   323: invokevirtual   com/whatsapp/protocol/bi.a:([B)V
        //   326: aload_0        
        //   327: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   330: iconst_1       
        //   331: putfield        com/whatsapp/protocol/bi.n:I
        //   334: iload_3        
        //   335: ifeq            358
        //   338: aload_0        
        //   339: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   342: invokevirtual   java/io/File.length:()J
        //   345: lconst_0       
        //   346: lcmp           
        //   347: ifne            358
        //   350: aload_0        
        //   351: getfield        com/whatsapp/ds.a:Ljava/io/File;
        //   354: invokevirtual   java/io/File.delete:()Z
        //   357: pop            
        //   358: aload_0        
        //   359: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   362: invokestatic    com/whatsapp/util/b.c:(Lcom/whatsapp/protocol/bi;)V
        //   365: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   368: aload_0        
        //   369: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   372: iconst_1       
        //   373: iconst_3       
        //   374: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;ZI)V
        //   377: aload_0        
        //   378: aload_1        
        //   379: aload           4
        //   381: invokespecial   com/whatsapp/ds.a:(Lcom/whatsapp/u5;Ljava/lang/String;)V
        //   384: aload_0        
        //   385: getfield        com/whatsapp/ds.f:Landroid/app/Activity;
        //   388: astore          12
        //   390: aload           12
        //   392: ifnull          448
        //   395: aload_0        
        //   396: getfield        com/whatsapp/ds.f:Landroid/app/Activity;
        //   399: invokevirtual   android/app/Activity.isFinishing:()Z
        //   402: istore          17
        //   404: iload           17
        //   406: ifne            448
        //   409: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   412: istore          18
        //   414: iload           18
        //   416: bipush          17
        //   418: if_icmplt       443
        //   421: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   424: istore          19
        //   426: iload           19
        //   428: bipush          17
        //   430: if_icmplt       448
        //   433: aload_0        
        //   434: getfield        com/whatsapp/ds.f:Landroid/app/Activity;
        //   437: invokevirtual   android/app/Activity.isDestroyed:()Z
        //   440: ifne            448
        //   443: aload_0        
        //   444: aload_1        
        //   445: invokespecial   com/whatsapp/ds.b:(Lcom/whatsapp/u5;)V
        //   448: aload_0        
        //   449: getfield        com/whatsapp/ds.d:Ljava/net/URL;
        //   452: astore          15
        //   454: aload           15
        //   456: ifnull          585
        //   459: aload_0        
        //   460: getfield        com/whatsapp/ds.d:Ljava/net/URL;
        //   463: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //   466: getstatic       com/whatsapp/ds.z:[Ljava/lang/String;
        //   469: iconst_2       
        //   470: aaload         
        //   471: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   474: istore          16
        //   476: iload           16
        //   478: ifeq            585
        //   481: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   484: aload_0        
        //   485: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   488: aload_1        
        //   489: getfield        com/whatsapp/u5.a:Lcom/whatsapp/kp;
        //   492: aload_0        
        //   493: getfield        com/whatsapp/ds.c:Lcom/whatsapp/MediaData;
        //   496: invokestatic    com/whatsapp/ds.a:(Lcom/whatsapp/kp;Lcom/whatsapp/MediaData;)Lcom/whatsapp/fieldstats/bh;
        //   499: aload_0        
        //   500: getfield        com/whatsapp/ds.e:Lcom/whatsapp/protocol/bi;
        //   503: getfield        com/whatsapp/protocol/bi.L:J
        //   506: aload_1        
        //   507: invokevirtual   com/whatsapp/u5.a:()J
        //   510: iload_2        
        //   511: invokestatic    com/whatsapp/aam.a:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;Lcom/whatsapp/fieldstats/bh;JJZ)V
        //   514: aload_0        
        //   515: aconst_null    
        //   516: putfield        com/whatsapp/ds.f:Landroid/app/Activity;
        //   519: return         
        //   520: astore          5
        //   522: aload           5
        //   524: athrow         
        //   525: astore          22
        //   527: aload           22
        //   529: athrow         
        //   530: astore          24
        //   532: aload           24
        //   534: athrow         
        //   535: astore          25
        //   537: aload           25
        //   539: athrow         
        //   540: astore          26
        //   542: aload           26
        //   544: athrow         
        //   545: astore          6
        //   547: aload           6
        //   549: athrow         
        //   550: astore          7
        //   552: aload           7
        //   554: athrow         
        //   555: astore          8
        //   557: aload           8
        //   559: athrow         
        //   560: astore          9
        //   562: aload           9
        //   564: athrow         
        //   565: astore          10
        //   567: aload           10
        //   569: athrow         
        //   570: astore          11
        //   572: aload           11
        //   574: athrow         
        //   575: astore          13
        //   577: aload           13
        //   579: athrow         
        //   580: astore          14
        //   582: aload           14
        //   584: athrow         
        //   585: iconst_0       
        //   586: istore_2       
        //   587: goto            481
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  91     132    520    525    Ljava/lang/NumberFormatException;
        //  147    156    525    530    Ljava/lang/NumberFormatException;
        //  205    286    530    535    Ljava/lang/NumberFormatException;
        //  292    301    535    540    Ljava/lang/NumberFormatException;
        //  306    334    540    545    Ljava/lang/NumberFormatException;
        //  338    358    545    550    Ljava/lang/NumberFormatException;
        //  358    390    550    555    Ljava/lang/NumberFormatException;
        //  395    404    555    560    Ljava/lang/NumberFormatException;
        //  409    414    560    565    Ljava/lang/NumberFormatException;
        //  421    426    565    570    Ljava/lang/NumberFormatException;
        //  433    443    570    575    Ljava/lang/NumberFormatException;
        //  443    448    570    575    Ljava/lang/NumberFormatException;
        //  448    454    575    580    Ljava/lang/NumberFormatException;
        //  459    476    580    585    Ljava/lang/NumberFormatException;
        //  532    535    535    540    Ljava/lang/NumberFormatException;
        //  537    540    540    545    Ljava/lang/NumberFormatException;
        //  542    545    545    550    Ljava/lang/NumberFormatException;
        //  552    555    555    560    Ljava/lang/NumberFormatException;
        //  557    560    560    565    Ljava/lang/NumberFormatException;
        //  562    565    565    570    Ljava/lang/NumberFormatException;
        //  567    570    570    575    Ljava/lang/NumberFormatException;
        //  577    580    580    585    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 278, Size: 278
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected void a(final Long[] array) {
        this.c.progress = array[0];
        App.ak.a(this.e, false, -1);
    }
    
    public boolean b() {
        return this.g;
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onCancelled() {
        Log.i(ds.z[18] + this.e.a + ds.z[19] + a(this.d));
    }
    
    protected void onPostExecute(final Object o) {
        this.a((u5)o);
    }
    
    protected void onProgressUpdate(final Object[] array) {
        this.a((Long[])array);
    }
}
