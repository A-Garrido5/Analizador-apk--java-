// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Environment;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.o;
import java.util.Iterator;
import java.util.HashSet;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.FileChannel;
import java.util.Date;
import com.whatsapp.util.Log;
import android.content.Intent;
import java.util.Collection;
import com.whatsapp.util.ba;
import java.util.ArrayList;
import java.util.HashMap;
import android.content.Context;
import java.io.File;

public class t1
{
    private static final File a;
    private static final File b;
    private static final File c;
    private static final File e;
    private static final File h;
    private static final File i;
    private static final File j;
    private static final File k;
    private static final File l;
    private static final File m;
    private static final String[] z;
    private awf d;
    private final Context f;
    private HashMap g;
    
    static {
        final String[] z2 = new String[104];
        String s = "U-F?h\u000f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_2632:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int length = charArray.length, n3 = 0; length > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\u0018';
                        break;
                    }
                    case 0: {
                        c3 = '{';
                        break;
                    }
                    case 1: {
                        c3 = 'N';
                        break;
                    }
                    case 2: {
                        c3 = '4';
                        break;
                    }
                    case 3: {
                        c3 = 'F';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "U-F?h\u000fz";
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    s = "U-F?h\u000fv";
                    n = 1;
                    array = z2;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "U-F?h\u000f|";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "U-F?h\u000fx";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "U-F?h\u000f{";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "U-F?h\u000f";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "U-F?h\u000f|";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "U-F?h\u000f}";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "U-F?h\u000f{";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "U-F?h\u000fy";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "U-F?h\u000f}";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "U-F?h\u000fy";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "U-F?h\u000fv";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "U-F?h\u000fz";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "U-F?h\u000fx";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3hT,U5}\u001d'X#G\u001f+X#l\u001en";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3hT%Q?7\u001e<F)j";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3hT-F#y\u000f+P/j";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3hT:[f";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3hT!A25\u0014(\u00195h\u001a-Q";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3h";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3h[2\u00142q\u0016+\u00145h\u001e @|8";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3hT=_/h[ [fu\u001e*]'8\u0014<\u00144}\u001a*\u0019)v\u00177\u0014+}\u001f'U";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3h";
                    n = 23;
                    n2 = 24;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    array = z2;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3hT:[f";
                    n = 24;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3hT=]<}[";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001ea])}\t<[48";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001eaQ({\t7D2}\u001f\u0011R/t\u001e\u0011Z)l$=A6h\u0014<@#|[fG-q\u000bg";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001ea])}\t<[48";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "U-F?h\u000f}";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "U-F?h\u000fx";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "U-F?h\u000fz";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001ea](7\u0012!Q4j\u0014<\u0014";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001eaQ4j\u0014<";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001ea_#a[";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "=/]*}\u001fn@)8\b+@fH)\u000br\u0019U:\u0007z\u0012Y2\u0000k\u0002Z$\u0007z\u0012]<\u001c}\u0012A[:[fl\t;Qj8\u001f/]*a[,U%s\u000e>Gfo\u0012\"Xfv\u0014:\u0014!w[:\\4w\u000e)\\f|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qf0\u000f!\u0014+y\u0012 @'q\u0015n](l\u001e)F/l\u0002g\u0018fk\u0014b\u00142p\u001e7\u0014+q\u001c&@fy\u0018-A+m\u0017/@#8\u0012 @#\u007f\t'@?8\u0012=G3}\bn[0}\tn@/u\u001eb\u00142p\u0012=\u0014/k[ [28\u001d/@'tU";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001ea](7\u0012!Q4j\u0014<\u0014";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001eaW)h\u0002n";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "U-F?h\u000fy";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001eaD'j\u001a#Giv\u000e\"X";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001ea])}\t<[48";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001ea](7\u0012!Q4j\u0014<\u0014";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "U-F?h\u000f|";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "U-F?h\u000fv";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "U-F?h\u000f";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001ea])}\t<[48";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "U-F?h\u000f{";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001eaQ4j\u0014<Gi{\u0014;Z28";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\u0016/](l\u001a'Z\u0019|\u0019\u0011](l\u001e)F/l\u0002";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001ea](7\u0012!Q4j\u0014<\u0014";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "\u0018!Yho\u0013/@5y\u000b>k6j\u001e(Q4}\u0015-Q5";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3hT:[)G\u0014\"Pf";
                    n = 51;
                    n2 = 52;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    array = z2;
                    s = "\u0016=S5l\u0014<Qiz\u001a-_3hT*Q*}\u000f+\u0014";
                    n = 52;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qiv\u001e9\u0014(m\u0016,Q48\u0014(\u0014+}\b=U!}\bn\u0016";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "Yn]58";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qfk\u00124Qfw\u001dnR/t\u001en\u0016";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "\u0017'V5i\u0017'@#8\u0012=\u0014(w\u000fnD4}\b+Z28\u0014 \u0014\"}\r'W#4[-U(v\u0014:\u00146}\t([4u[*A+h[/Z\"8\t+G2w\t+\u001a";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "\b?X/l\u001e";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "><F)j[9\\/t\u001enF#k\u000f!F/v\u001cnP$^\u0012\"Qf";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qfj\u001e=@)j\u001enR'q\u0017+Ph";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qf{\u001a\"X/v\u001cnF#k\u000f!F#0";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "Yn]58";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "Wn";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qiw\t'Sfv\u000e#V#j[!Rfu\u001e=G'\u007f\u001e=\u0014d";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "\u000f#D\u0019|\u0019\u0011P3u\u000b";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qfj\u001e=@)j\u001enG3{\u0018+Q\"}\u001f`";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "Yn]58";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qf|\u000e#Df~\u001a'X#|U";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "$ Q1";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    s = "Wn";
                    n = 69;
                    n2 = 70;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    array = z2;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qf|\u000e#Dfk\u000e-W#}\u001f+Ph";
                    n = 70;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qfw\t'S/v\u001a\"\u0014\"y\u000f/V'k\u001enP)}\bnZ)l[+L/k\u000f`";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qf{\u001a\"X/v\u001cnP3u\u000bf";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "\u0016=S5l\u0014<Qi|\u000e#D\u0007v\u001f\u001cQ5l\u0014<Qij\u001a:])8";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "\u0016=S5l\u0014<Qiz\u0017!W-L\u0012\"X\u000fv\u000f+F(y\u0017\u001d@)j\u001a)Q\u000fk:8U/t\u001a,X#";
                    n = 74;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "\b>U%}5+Q\"}\u001f\u0007Z\u0004a\u000f+G";
                    n = 75;
                    array = z2;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001eaZ)l\u0013'Z!5\t+G2w\t+P";
                    n = 76;
                    array = z2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    s = "[f";
                    n = 77;
                    n2 = 78;
                    array = z2;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    array = z2;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001eaV'{\u0010;D q\u0017+Gf";
                    n = 78;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001eaG3{\u0018+G58";
                    n = 79;
                    array = z2;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    n2 = 81;
                    s = "\u0016=S5l\u0014<Qij\u001e=@)j\u001eaV'{\u0010;D q\u0017+Gf(";
                    n = 80;
                    array = z2;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    s = "\u0016=S5l\u0014<Qit\u001a=@$y\u0018%A6~\u0012\"Q2q\u0016+\u001b+}\u001f'U\u0019m\u0015/B'q\u0017/V*}[";
                    n = 81;
                    array = z2;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    n2 = 83;
                    s = "\u0016!A(l\u001e*";
                    n = 82;
                    array = z2;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    s = "\u0016=S5l\u0014<Qit\u001a=@$y\u0018%A6~\u0012\"Q2q\u0016+\u001b q\u0017+\u0014";
                    n = 83;
                    array = z2;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "[=]<}F";
                    n = 84;
                    array = z2;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    n2 = 86;
                    s = "\u0016!A(l\u001e*k4w";
                    n = 85;
                    array = z2;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    s = "U-F?h\u000fx";
                    n = 86;
                    array = z2;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "U-F?h\u000fv";
                    n = 87;
                    array = z2;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "\u0016=S5l\u0014<Qi\u007f\u001e:_#a\baG/b\u001en";
                    n = 88;
                    array = z2;
                    continue;
                }
                case 88: {
                    array[n2] = intern;
                    n2 = 90;
                    s = "U-F?h\u000fx";
                    n = 89;
                    array = z2;
                    continue;
                }
                case 89: {
                    array[n2] = intern;
                    n2 = 91;
                    s = "U-F?h\u000fy";
                    n = 90;
                    array = z2;
                    continue;
                }
                case 90: {
                    array[n2] = intern;
                    n2 = 92;
                    s = "\u0016=S5l\u0014<Qi\u007f\u001e:_#a\b([4z\u001a-_3h\baZ)5\u0018'D.}\taG-q\u000b";
                    n = 91;
                    array = z2;
                    continue;
                }
                case 91: {
                    array[n2] = intern;
                    n2 = 93;
                    s = "[fV'{\u0010;D5%";
                    n = 92;
                    array = z2;
                    continue;
                }
                case 92: {
                    array[n2] = intern;
                    n2 = 94;
                    s = "\u0016=S5l\u0014<Qh|\u0019`W4a\u000b:\f";
                    n = 93;
                    array = z2;
                    continue;
                }
                case 93: {
                    array[n2] = intern;
                    n2 = 95;
                    s = "?/@'z\u001a=Q5";
                    n = 94;
                    array = z2;
                    continue;
                }
                case 94: {
                    array[n2] = intern;
                    n2 = 96;
                    s = "\u0016=S5l\u0014<Qh|\u0019`W4a\u000b:";
                    n = 95;
                    array = z2;
                    continue;
                }
                case 95: {
                    array[n2] = intern;
                    n2 = 97;
                    s = "\u0016=S5l\u0014<Qh|\u0019`W4a\u000b:\u0000";
                    n = 96;
                    array = z2;
                    continue;
                }
                case 96: {
                    array[n2] = intern;
                    n2 = 98;
                    s = "\u0016=S5l\u0014<Qh|\u0019`W4a\u000b:\u0003";
                    n = 97;
                    array = z2;
                    continue;
                }
                case 97: {
                    array[n2] = intern;
                    n2 = 99;
                    s = "\u0016=S5l\u0014<Qh|\u0019`W4a\u000b:\u0001";
                    n = 98;
                    array = z2;
                    continue;
                }
                case 98: {
                    array[n2] = intern;
                    n2 = 100;
                    s = "\u0016=S5l\u0014<Qh|\u0019`W4a\u000b:\u0002";
                    n = 99;
                    array = z2;
                    continue;
                }
                case 99: {
                    array[n2] = intern;
                    n2 = 101;
                    s = "\u0016=S5l\u0014<Qh|\u0019";
                    n = 100;
                    array = z2;
                    continue;
                }
                case 100: {
                    array[n2] = intern;
                    n2 = 102;
                    s = "\u0016=S5l\u0014<Qh|\u0019`W4a\u000b:\u0007";
                    n = 101;
                    array = z2;
                    continue;
                }
                case 101: {
                    array[n2] = intern;
                    n2 = 103;
                    s = "\u0016=S5l\u0014<Qh|\u0019`W4a\u000b:\u0006";
                    n = 102;
                    array = z2;
                    continue;
                }
                case 102: {
                    break Label_2632;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        j = new File(App.M, t1.z[95]);
        l = new File(t1.j, t1.z[96]);
        b = new File(t1.j, t1.z[103]);
        i = new File(t1.j, t1.z[102]);
        h = new File(t1.j, t1.z[97]);
        a = new File(t1.j, t1.z[99]);
        k = new File(t1.j, t1.z[100]);
        c = new File(t1.j, t1.z[98]);
        m = new File(t1.j, t1.z[94]);
        e = new File(t1.j, t1.z[101]);
    }
    
    public t1(final Context f) {
        this.f = f;
        this.g = new HashMap();
    }
    
    public static File a() {
        return t1.m;
    }
    
    private ArrayList a(final boolean b) {
        if (b) {
            final ArrayList a = ba.a(t1.e, -1, new String[] { t1.z[10], t1.z[13] });
            a.addAll(ba.a(t1.e, 7, new String[] { t1.z[0], t1.z[7], t1.z[8], t1.z[1], t1.z[9], t1.z[4] }));
            return ba.a(a);
        }
        return ba.a(t1.e, 7, new String[] { t1.z[6], t1.z[3], t1.z[11], t1.z[14], t1.z[5], t1.z[15], t1.z[12], t1.z[2] });
    }
    
    static HashMap a(final t1 t1) {
        return t1.g;
    }
    
    private void a(final long n) {
        final boolean k = a_9.k;
        try {
            if (App.u() < n) {
                this.f.startActivity(new Intent(this.f, (Class)InsufficientStorageSpaceActivity.class).setFlags(268435456).putExtra(t1.z[76], n));
            }
            while (App.u() < n) {
                try {
                    Thread.sleep(200L);
                    continue;
                }
                catch (InterruptedException ex) {
                    Log.b(t1.z[75], ex);
                    if (!k) {
                        continue;
                    }
                }
                break;
            }
        }
        catch (InterruptedException ex2) {
            throw ex2;
        }
    }
    
    private void a(final File file) {
        if (file.exists()) {
            if (System.currentTimeMillis() - file.lastModified() >= 604800000L) {
                Log.i(t1.z[52] + new Date(file.lastModified()));
                Log.i(t1.z[53] + file.getName() + " " + file.delete());
                if (!a_9.k) {
                    return;
                }
            }
            ba.a(file, "");
        }
    }
    
    private void a(final FileChannel fileChannel, final WritableByteChannel writableByteChannel, final int n, final int n2) {
        final boolean k = a_9.k;
        long n3 = 0L;
        long n4 = 0L;
        while (n3 < fileChannel.size()) {
            final long n5 = n4 + fileChannel.transferTo(n3, Math.min(131072L, fileChannel.size() - n3), writableByteChannel);
            if (this.d != null && n2 > 0) {
                this.d.a(n5, fileChannel.size(), n, n2);
            }
            n3 += 131072L;
            if (k) {
                break;
            }
            n4 = n5;
        }
    }
    
    private boolean a(final vy p0, final File p1, final int p2, final int p3, final boolean p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore          6
        //     5: iconst_0       
        //     6: istore          7
        //     8: aload_2        
        //     9: invokevirtual   java/io/File.exists:()Z
        //    12: ifeq            1279
        //    15: aload_2        
        //    16: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    19: astore          8
        //    21: new             Ljava/lang/StringBuilder;
        //    24: dup            
        //    25: invokespecial   java/lang/StringBuilder.<init>:()V
        //    28: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    31: bipush          38
        //    33: aaload         
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    37: aload           8
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    42: ldc_w           " "
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: aload_2        
        //    49: invokevirtual   java/io/File.length:()J
        //    52: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    55: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    58: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    61: aload           8
        //    63: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    66: bipush          45
        //    68: aaload         
        //    69: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    72: istore          22
        //    74: aload           8
        //    76: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    79: bipush          43
        //    81: aaload         
        //    82: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    85: istore          23
        //    87: aload           8
        //    89: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    92: bipush          30
        //    94: aaload         
        //    95: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    98: istore          24
        //   100: aload           8
        //   102: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   105: bipush          32
        //   107: aaload         
        //   108: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   111: istore          25
        //   113: aload           8
        //   115: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   118: bipush          47
        //   120: aaload         
        //   121: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   124: istore          26
        //   126: aload           8
        //   128: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   131: bipush          31
        //   133: aaload         
        //   134: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   137: istore          27
        //   139: aload           8
        //   141: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   144: bipush          39
        //   146: aaload         
        //   147: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   150: istore          28
        //   152: aload           8
        //   154: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   157: bipush          44
        //   159: aaload         
        //   160: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   163: istore          29
        //   165: iload           29
        //   167: ifeq            403
        //   170: iload           22
        //   172: ifne            210
        //   175: iload           23
        //   177: ifne            210
        //   180: iload           24
        //   182: ifne            210
        //   185: iload           25
        //   187: ifne            210
        //   190: iload           26
        //   192: ifne            210
        //   195: iload           27
        //   197: ifne            210
        //   200: iload           28
        //   202: ifne            210
        //   205: iload           29
        //   207: ifeq            941
        //   210: invokestatic    com/whatsapp/util/ae.b:()Lcom/whatsapp/util/ae;
        //   213: invokevirtual   com/whatsapp/util/ae.a:()Z
        //   216: istore          31
        //   218: iload           31
        //   220: ifeq            927
        //   223: new             Lcom/whatsapp/util/c;
        //   226: dup            
        //   227: getstatic       com/whatsapp/App.T:Lcom/whatsapp/util/p;
        //   230: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   233: invokespecial   com/whatsapp/util/c.<init>:(Lcom/whatsapp/util/p;Ljava/io/File;)V
        //   236: astore          10
        //   238: new             Ljava/io/FileInputStream;
        //   241: dup            
        //   242: aload_2        
        //   243: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   246: astore          11
        //   248: iload           22
        //   250: ifeq            263
        //   253: getstatic       com/whatsapp/util/c6.CRYPT1:Lcom/whatsapp/util/c6;
        //   256: astore          34
        //   258: iload           6
        //   260: ifeq            1264
        //   263: iload           23
        //   265: ifeq            278
        //   268: getstatic       com/whatsapp/util/c6.CRYPT2:Lcom/whatsapp/util/c6;
        //   271: astore          34
        //   273: iload           6
        //   275: ifeq            1264
        //   278: iload           24
        //   280: ifeq            293
        //   283: getstatic       com/whatsapp/util/c6.CRYPT3:Lcom/whatsapp/util/c6;
        //   286: astore          34
        //   288: iload           6
        //   290: ifeq            1264
        //   293: iload           25
        //   295: ifeq            308
        //   298: getstatic       com/whatsapp/util/c6.CRYPT4:Lcom/whatsapp/util/c6;
        //   301: astore          34
        //   303: iload           6
        //   305: ifeq            1264
        //   308: iload           26
        //   310: ifeq            323
        //   313: getstatic       com/whatsapp/util/c6.CRYPT5:Lcom/whatsapp/util/c6;
        //   316: astore          34
        //   318: iload           6
        //   320: ifeq            1264
        //   323: aload           11
        //   325: invokestatic    com/whatsapp/al5.a:(Ljava/io/InputStream;)Lcom/whatsapp/s6;
        //   328: astore          41
        //   330: new             Lcom/whatsapp/aoa;
        //   333: dup            
        //   334: aload           41
        //   336: getfield        com/whatsapp/s6.e:Ljava/lang/String;
        //   339: aload           41
        //   341: getfield        com/whatsapp/s6.a:[B
        //   344: invokespecial   com/whatsapp/aoa.<init>:(Ljava/lang/String;[B)V
        //   347: astore          42
        //   349: aload_0        
        //   350: getfield        com/whatsapp/t1.g:Ljava/util/HashMap;
        //   353: aload           42
        //   355: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   358: checkcast       Lcom/whatsapp/aw3;
        //   361: astore          43
        //   363: aload           43
        //   365: ifnonnull       741
        //   368: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   371: bipush          40
        //   373: aaload         
        //   374: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   377: aload           11
        //   379: ifnull          387
        //   382: aload           11
        //   384: invokevirtual   java/io/FileInputStream.close:()V
        //   387: iconst_0       
        //   388: istore          15
        //   390: aload           10
        //   392: ifnull          400
        //   395: aload           10
        //   397: invokevirtual   java/io/OutputStream.close:()V
        //   400: iload           15
        //   402: ireturn        
        //   403: aload_0        
        //   404: aload_2        
        //   405: invokevirtual   java/io/File.length:()J
        //   408: invokespecial   com/whatsapp/t1.a:(J)V
        //   411: goto            170
        //   414: astore          14
        //   416: aconst_null    
        //   417: astore          10
        //   419: aconst_null    
        //   420: astore          11
        //   422: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   425: bipush          34
        //   427: aaload         
        //   428: aload           14
        //   430: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   433: aload           11
        //   435: ifnull          443
        //   438: aload           11
        //   440: invokevirtual   java/io/FileInputStream.close:()V
        //   443: aload           10
        //   445: ifnull          1245
        //   448: aload           10
        //   450: invokevirtual   java/io/OutputStream.close:()V
        //   453: iload           7
        //   455: istore          15
        //   457: iload           15
        //   459: ifeq            400
        //   462: iload           15
        //   464: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   467: invokestatic    com/whatsapp/vy.d:(Ljava/io/File;)Z
        //   470: iand           
        //   471: istore          15
        //   473: iload           15
        //   475: ifeq            549
        //   478: iload           5
        //   480: ifeq            549
        //   483: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   486: invokestatic    com/whatsapp/vy.b:(Ljava/io/File;)I
        //   489: istore          19
        //   491: new             Ljava/lang/StringBuilder;
        //   494: dup            
        //   495: invokespecial   java/lang/StringBuilder.<init>:()V
        //   498: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   501: bipush          48
        //   503: aaload         
        //   504: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   507: iload           19
        //   509: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   512: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   515: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   518: iload           19
        //   520: ifle            549
        //   523: iload           15
        //   525: aload_0        
        //   526: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   529: invokevirtual   com/whatsapp/t1.b:(Ljava/io/File;)Z
        //   532: iand           
        //   533: istore          15
        //   535: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   538: getstatic       com/whatsapp/fieldstats/o.DATABASE_DUMP_AND_RESTORE_RESULT:Lcom/whatsapp/fieldstats/o;
        //   541: iload           15
        //   543: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   546: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //   549: iload           15
        //   551: ifeq            563
        //   554: iload           15
        //   556: aload_1        
        //   557: invokevirtual   com/whatsapp/vy.j:()Z
        //   560: iand           
        //   561: istore          15
        //   563: iload           15
        //   565: ifeq            400
        //   568: iload           5
        //   570: ifeq            400
        //   573: aload_0        
        //   574: getfield        com/whatsapp/t1.f:Landroid/content/Context;
        //   577: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   580: bipush          51
        //   582: aaload         
        //   583: iconst_0       
        //   584: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   587: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   592: astore          16
        //   594: aload           16
        //   596: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   599: bipush          49
        //   601: aaload         
        //   602: iconst_1       
        //   603: invokeinterface android/content/SharedPreferences$Editor.putBoolean:(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
        //   608: pop            
        //   609: aload           16
        //   611: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   616: ifne            400
        //   619: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   622: bipush          36
        //   624: aaload         
        //   625: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   628: iload           15
        //   630: ireturn        
        //   631: astore          17
        //   633: aload           17
        //   635: athrow         
        //   636: astore          30
        //   638: aload           30
        //   640: athrow         
        //   641: astore          9
        //   643: aconst_null    
        //   644: astore          10
        //   646: aconst_null    
        //   647: astore          11
        //   649: aload           11
        //   651: ifnull          659
        //   654: aload           11
        //   656: invokevirtual   java/io/FileInputStream.close:()V
        //   659: aload           10
        //   661: ifnull          669
        //   664: aload           10
        //   666: invokevirtual   java/io/OutputStream.close:()V
        //   669: aload           9
        //   671: athrow         
        //   672: astore          45
        //   674: new             Ljava/lang/StringBuilder;
        //   677: dup            
        //   678: invokespecial   java/lang/StringBuilder.<init>:()V
        //   681: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   684: bipush          50
        //   686: aaload         
        //   687: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   690: aload           45
        //   692: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   695: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   698: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   701: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   704: goto            387
        //   707: astore          44
        //   709: new             Ljava/lang/StringBuilder;
        //   712: dup            
        //   713: invokespecial   java/lang/StringBuilder.<init>:()V
        //   716: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   719: bipush          29
        //   721: aaload         
        //   722: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   725: aload           44
        //   727: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   730: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   733: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   736: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   739: iconst_0       
        //   740: ireturn        
        //   741: iload           27
        //   743: ifeq            756
        //   746: getstatic       com/whatsapp/util/c6.CRYPT6:Lcom/whatsapp/util/c6;
        //   749: astore          34
        //   751: iload           6
        //   753: ifeq            776
        //   756: iload           28
        //   758: ifeq            771
        //   761: getstatic       com/whatsapp/util/c6.CRYPT7:Lcom/whatsapp/util/c6;
        //   764: astore          34
        //   766: iload           6
        //   768: ifeq            776
        //   771: getstatic       com/whatsapp/util/c6.CRYPT8:Lcom/whatsapp/util/c6;
        //   774: astore          34
        //   776: aload           43
        //   778: getfield        com/whatsapp/aw3.b:[B
        //   781: astore          36
        //   783: aload           41
        //   785: getfield        com/whatsapp/s6.d:[B
        //   788: astore          37
        //   790: aload           43
        //   792: astore          38
        //   794: aload           41
        //   796: astore          35
        //   798: new             Ljava/lang/StringBuilder;
        //   801: dup            
        //   802: invokespecial   java/lang/StringBuilder.<init>:()V
        //   805: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   808: bipush          35
        //   810: aaload         
        //   811: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   814: aload           34
        //   816: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   819: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   822: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   825: invokestatic    com/whatsapp/util/ae.b:()Lcom/whatsapp/util/ae;
        //   828: aload           11
        //   830: aload           10
        //   832: iload_3        
        //   833: iload           4
        //   835: aload_2        
        //   836: invokevirtual   java/io/File.length:()J
        //   839: aload_0        
        //   840: getfield        com/whatsapp/t1.d:Lcom/whatsapp/awf;
        //   843: aload           34
        //   845: aload           36
        //   847: aload           37
        //   849: invokevirtual   com/whatsapp/util/ae.a:(Ljava/io/InputStream;Ljava/io/OutputStream;IIJLcom/whatsapp/awf;Lcom/whatsapp/util/c6;[B[B)V
        //   852: iload           28
        //   854: ifne            862
        //   857: iload           29
        //   859: ifeq            897
        //   862: aload           35
        //   864: getfield        com/whatsapp/s6.e:Ljava/lang/String;
        //   867: aload           35
        //   869: getfield        com/whatsapp/s6.a:[B
        //   872: aload           36
        //   874: aload           38
        //   876: getfield        com/whatsapp/aw3.c:[B
        //   879: aload           35
        //   881: getfield        com/whatsapp/s6.c:[B
        //   884: aload           35
        //   886: getfield        com/whatsapp/s6.d:[B
        //   889: invokestatic    com/whatsapp/al5.a:(Ljava/lang/String;[B[B[B[B[B)Z
        //   892: pop            
        //   893: invokestatic    com/whatsapp/al5.n:()Lcom/whatsapp/f3;
        //   896: pop            
        //   897: iconst_1       
        //   898: istore          7
        //   900: aload           11
        //   902: ifnull          910
        //   905: aload           11
        //   907: invokevirtual   java/io/FileInputStream.close:()V
        //   910: aload           10
        //   912: ifnull          1245
        //   915: aload           10
        //   917: invokevirtual   java/io/OutputStream.close:()V
        //   920: iload           7
        //   922: istore          15
        //   924: goto            457
        //   927: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   930: bipush          28
        //   932: aaload         
        //   933: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   936: iload           6
        //   938: ifeq            1252
        //   941: new             Lcom/whatsapp/util/c;
        //   944: dup            
        //   945: getstatic       com/whatsapp/App.T:Lcom/whatsapp/util/p;
        //   948: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   951: invokespecial   com/whatsapp/util/c.<init>:(Lcom/whatsapp/util/p;Ljava/io/File;)V
        //   954: astore          10
        //   956: new             Ljava/io/FileInputStream;
        //   959: dup            
        //   960: aload_2        
        //   961: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   964: astore          11
        //   966: aload_0        
        //   967: aload           11
        //   969: invokevirtual   java/io/FileInputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //   972: aload           10
        //   974: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //   977: iload_3        
        //   978: iload           4
        //   980: invokespecial   com/whatsapp/t1.a:(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;II)V
        //   983: iconst_1       
        //   984: istore          7
        //   986: goto            900
        //   989: astore          33
        //   991: new             Ljava/lang/StringBuilder;
        //   994: dup            
        //   995: invokespecial   java/lang/StringBuilder.<init>:()V
        //   998: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //  1001: bipush          37
        //  1003: aaload         
        //  1004: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1007: aload           33
        //  1009: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //  1012: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1015: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1018: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1021: goto            910
        //  1024: astore          32
        //  1026: new             Ljava/lang/StringBuilder;
        //  1029: dup            
        //  1030: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1033: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //  1036: bipush          46
        //  1038: aaload         
        //  1039: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1042: aload           32
        //  1044: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  1047: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1050: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1053: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1056: iconst_0       
        //  1057: istore          15
        //  1059: goto            457
        //  1062: astore          21
        //  1064: new             Ljava/lang/StringBuilder;
        //  1067: dup            
        //  1068: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1071: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //  1074: bipush          42
        //  1076: aaload         
        //  1077: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1080: aload           21
        //  1082: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //  1085: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1088: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1091: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1094: goto            443
        //  1097: astore          20
        //  1099: new             Ljava/lang/StringBuilder;
        //  1102: dup            
        //  1103: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1106: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //  1109: bipush          27
        //  1111: aaload         
        //  1112: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1115: aload           20
        //  1117: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  1120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1123: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1126: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1129: iconst_0       
        //  1130: istore          15
        //  1132: goto            457
        //  1135: astore          13
        //  1137: new             Ljava/lang/StringBuilder;
        //  1140: dup            
        //  1141: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1144: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //  1147: bipush          33
        //  1149: aaload         
        //  1150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1153: aload           13
        //  1155: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //  1158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1161: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1164: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1167: goto            659
        //  1170: astore          12
        //  1172: new             Ljava/lang/StringBuilder;
        //  1175: dup            
        //  1176: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1179: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //  1182: bipush          41
        //  1184: aaload         
        //  1185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1188: aload           12
        //  1190: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  1193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1199: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1202: goto            669
        //  1205: astore          9
        //  1207: aconst_null    
        //  1208: astore          11
        //  1210: goto            649
        //  1213: astore          9
        //  1215: goto            649
        //  1218: astore          14
        //  1220: aconst_null    
        //  1221: astore          11
        //  1223: iconst_0       
        //  1224: istore          7
        //  1226: goto            422
        //  1229: astore          14
        //  1231: iconst_0       
        //  1232: istore          7
        //  1234: goto            422
        //  1237: astore          14
        //  1239: iconst_1       
        //  1240: istore          7
        //  1242: goto            422
        //  1245: iload           7
        //  1247: istore          15
        //  1249: goto            457
        //  1252: aconst_null    
        //  1253: astore          11
        //  1255: aconst_null    
        //  1256: astore          10
        //  1258: iconst_0       
        //  1259: istore          7
        //  1261: goto            900
        //  1264: aconst_null    
        //  1265: astore          35
        //  1267: aconst_null    
        //  1268: astore          36
        //  1270: aconst_null    
        //  1271: astore          37
        //  1273: aconst_null    
        //  1274: astore          38
        //  1276: goto            798
        //  1279: iconst_0       
        //  1280: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  61     165    414    422    Ljava/lang/Exception;
        //  61     165    641    649    Any
        //  210    218    636    641    Ljava/lang/Exception;
        //  210    218    641    649    Any
        //  223    238    414    422    Ljava/lang/Exception;
        //  223    238    641    649    Any
        //  238    248    1218   1229   Ljava/lang/Exception;
        //  238    248    1205   1213   Any
        //  253    258    1229   1237   Ljava/lang/Exception;
        //  253    258    1213   1218   Any
        //  268    273    1229   1237   Ljava/lang/Exception;
        //  268    273    1213   1218   Any
        //  283    288    1229   1237   Ljava/lang/Exception;
        //  283    288    1213   1218   Any
        //  298    303    1229   1237   Ljava/lang/Exception;
        //  298    303    1213   1218   Any
        //  313    318    1229   1237   Ljava/lang/Exception;
        //  313    318    1213   1218   Any
        //  323    363    1229   1237   Ljava/lang/Exception;
        //  323    363    1213   1218   Any
        //  368    377    1229   1237   Ljava/lang/Exception;
        //  368    377    1213   1218   Any
        //  382    387    672    707    Ljava/lang/Exception;
        //  395    400    707    741    Ljava/io/IOException;
        //  403    411    414    422    Ljava/lang/Exception;
        //  403    411    641    649    Any
        //  422    433    1213   1218   Any
        //  438    443    1062   1097   Ljava/lang/Exception;
        //  448    453    1097   1135   Ljava/io/IOException;
        //  594    628    631    636    Ljava/lang/Exception;
        //  638    641    414    422    Ljava/lang/Exception;
        //  638    641    641    649    Any
        //  654    659    1135   1170   Ljava/lang/Exception;
        //  664    669    1170   1205   Ljava/io/IOException;
        //  746    751    1229   1237   Ljava/lang/Exception;
        //  746    751    1213   1218   Any
        //  761    766    1229   1237   Ljava/lang/Exception;
        //  761    766    1213   1218   Any
        //  771    776    1229   1237   Ljava/lang/Exception;
        //  771    776    1213   1218   Any
        //  776    790    1229   1237   Ljava/lang/Exception;
        //  776    790    1213   1218   Any
        //  798    852    1229   1237   Ljava/lang/Exception;
        //  798    852    1213   1218   Any
        //  862    897    1237   1245   Ljava/lang/Exception;
        //  862    897    1213   1218   Any
        //  905    910    989    1024   Ljava/lang/Exception;
        //  915    920    1024   1062   Ljava/io/IOException;
        //  927    936    414    422    Ljava/lang/Exception;
        //  927    936    641    649    Any
        //  941    956    414    422    Ljava/lang/Exception;
        //  941    956    641    649    Any
        //  956    966    1218   1229   Ljava/lang/Exception;
        //  956    966    1205   1213   Any
        //  966    983    1229   1237   Ljava/lang/Exception;
        //  966    983    1213   1218   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 559, Size: 559
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
    
    private ArrayList d() {
        return this.a(false);
    }
    
    public int a(final Runnable runnable) {
        final boolean k = a_9.k;
        final ArrayList a = ba.a(t1.e, 7, new String[] { t1.z[90] });
        a.addAll(ba.a(t1.e, -1, new String[] { t1.z[91] }));
        a.addAll(ba.a(t1.e, -1, new String[] { t1.z[88] }));
        final HashSet<i> set = new HashSet<i>();
        for (final File file : a) {
            final s6 b = al5.b(file);
            Label_0225: {
                if (b != null) {
                    set.add(new i(b.e, b.a, al5.a(b.c, b.b, file.getName().endsWith(t1.z[87]))));
                    if (!k) {
                        break Label_0225;
                    }
                }
                Log.i(t1.z[92]);
            }
            if (k) {
                break;
            }
        }
        final int size = set.size();
        Log.i(t1.z[89] + size + t1.z[93] + a.size() + ")");
        this.g.clear();
        for (final i i : set) {
            App.a(com.whatsapp.i.a(i), com.whatsapp.i.c(i), com.whatsapp.i.b(i), new vl(this, size, runnable));
            if (k) {
                break;
            }
        }
        return size;
    }
    
    public ai a(final boolean p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_3       
        //     2: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //     5: bipush          21
        //     7: aaload         
        //     8: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    11: getstatic       com/whatsapp/App.G:Z
        //    14: ifne            27
        //    17: getstatic       com/whatsapp/App.o:Z
        //    20: istore          6
        //    22: iload           6
        //    24: ifeq            50
        //    27: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    30: bipush          23
        //    32: aaload         
        //    33: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    36: getstatic       com/whatsapp/ai.FAILED_GENERIC:Lcom/whatsapp/ai;
        //    39: areturn        
        //    40: astore          4
        //    42: aload           4
        //    44: athrow         
        //    45: astore          5
        //    47: aload           5
        //    49: athrow         
        //    50: new             Lcom/whatsapp/util/b0;
        //    53: dup            
        //    54: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    57: bipush          24
        //    59: aaload         
        //    60: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //    63: astore          7
        //    65: getstatic       com/whatsapp/t1.m:Ljava/io/File;
        //    68: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    71: astore          8
        //    73: aload           8
        //    75: invokevirtual   java/io/File.exists:()Z
        //    78: ifne            102
        //    81: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    84: bipush          18
        //    86: aaload         
        //    87: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    90: aload           8
        //    92: invokevirtual   java/io/File.mkdirs:()Z
        //    95: pop            
        //    96: aload           8
        //    98: invokevirtual   java/io/File.mkdir:()Z
        //   101: pop            
        //   102: aload_0        
        //   103: getstatic       com/whatsapp/t1.l:Ljava/io/File;
        //   106: invokespecial   com/whatsapp/t1.a:(Ljava/io/File;)V
        //   109: aload_0        
        //   110: getstatic       com/whatsapp/t1.b:Ljava/io/File;
        //   113: invokespecial   com/whatsapp/t1.a:(Ljava/io/File;)V
        //   116: aload_0        
        //   117: getstatic       com/whatsapp/t1.i:Ljava/io/File;
        //   120: invokespecial   com/whatsapp/t1.a:(Ljava/io/File;)V
        //   123: aload_0        
        //   124: getstatic       com/whatsapp/t1.h:Ljava/io/File;
        //   127: invokespecial   com/whatsapp/t1.a:(Ljava/io/File;)V
        //   130: aload_0        
        //   131: getstatic       com/whatsapp/t1.a:Ljava/io/File;
        //   134: invokespecial   com/whatsapp/t1.a:(Ljava/io/File;)V
        //   137: aload_0        
        //   138: getstatic       com/whatsapp/t1.k:Ljava/io/File;
        //   141: invokespecial   com/whatsapp/t1.a:(Ljava/io/File;)V
        //   144: aload_0        
        //   145: getstatic       com/whatsapp/t1.c:Ljava/io/File;
        //   148: invokespecial   com/whatsapp/t1.a:(Ljava/io/File;)V
        //   151: aload_0        
        //   152: getstatic       com/whatsapp/t1.m:Ljava/io/File;
        //   155: invokespecial   com/whatsapp/t1.a:(Ljava/io/File;)V
        //   158: aload_2        
        //   159: monitorenter   
        //   160: new             Ljava/lang/StringBuilder;
        //   163: dup            
        //   164: invokespecial   java/lang/StringBuilder.<init>:()V
        //   167: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   170: bipush          26
        //   172: aaload         
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   179: invokevirtual   java/io/File.length:()J
        //   182: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   185: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   188: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   191: iload_1        
        //   192: ifeq            656
        //   195: invokestatic    com/whatsapp/util/ae.b:()Lcom/whatsapp/util/ae;
        //   198: invokevirtual   com/whatsapp/util/ae.a:()Z
        //   201: istore          22
        //   203: iload           22
        //   205: ifeq            656
        //   208: new             Ljava/lang/StringBuilder;
        //   211: dup            
        //   212: invokespecial   java/lang/StringBuilder.<init>:()V
        //   215: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   218: bipush          25
        //   220: aaload         
        //   221: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   224: getstatic       com/whatsapp/t1.m:Ljava/io/File;
        //   227: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   236: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   239: new             Lcom/whatsapp/util/c;
        //   242: dup            
        //   243: getstatic       com/whatsapp/App.n:Lcom/whatsapp/util/p;
        //   246: getstatic       com/whatsapp/t1.m:Ljava/io/File;
        //   249: invokespecial   com/whatsapp/util/c.<init>:(Lcom/whatsapp/util/p;Ljava/io/File;)V
        //   252: astore          11
        //   254: new             Ljava/io/FileInputStream;
        //   257: dup            
        //   258: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   261: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   264: astore          17
        //   266: invokestatic    com/whatsapp/al5.n:()Lcom/whatsapp/f3;
        //   269: astore          34
        //   271: aload           11
        //   273: aload           34
        //   275: invokestatic    com/whatsapp/al5.a:(Ljava/io/OutputStream;Lcom/whatsapp/f3;)V
        //   278: invokestatic    com/whatsapp/util/ae.b:()Lcom/whatsapp/util/ae;
        //   281: aload           17
        //   283: aload           11
        //   285: getstatic       com/whatsapp/util/c6.CRYPT8:Lcom/whatsapp/util/c6;
        //   288: aload           34
        //   290: getfield        com/whatsapp/f3.a:[B
        //   293: aload           34
        //   295: getfield        com/whatsapp/f3.c:Lcom/whatsapp/s6;
        //   298: getfield        com/whatsapp/s6.d:[B
        //   301: invokevirtual   com/whatsapp/util/ae.a:(Ljava/io/InputStream;Ljava/io/OutputStream;Lcom/whatsapp/util/c6;[B[B)V
        //   304: aload           17
        //   306: ifnull          314
        //   309: aload           17
        //   311: invokevirtual   java/io/FileInputStream.close:()V
        //   314: aload           11
        //   316: ifnull          324
        //   319: aload           11
        //   321: invokevirtual   java/io/OutputStream.close:()V
        //   324: aload_2        
        //   325: monitorexit    
        //   326: getstatic       com/whatsapp/t1.l:Ljava/io/File;
        //   329: bipush          7
        //   331: ldc_w           ""
        //   334: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;ILjava/lang/String;)V
        //   337: getstatic       com/whatsapp/t1.b:Ljava/io/File;
        //   340: bipush          7
        //   342: ldc_w           ""
        //   345: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;ILjava/lang/String;)V
        //   348: getstatic       com/whatsapp/t1.i:Ljava/io/File;
        //   351: bipush          7
        //   353: ldc_w           ""
        //   356: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;ILjava/lang/String;)V
        //   359: getstatic       com/whatsapp/t1.h:Ljava/io/File;
        //   362: bipush          7
        //   364: ldc_w           ""
        //   367: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;ILjava/lang/String;)V
        //   370: getstatic       com/whatsapp/t1.a:Ljava/io/File;
        //   373: bipush          7
        //   375: ldc_w           ""
        //   378: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;ILjava/lang/String;)V
        //   381: getstatic       com/whatsapp/t1.k:Ljava/io/File;
        //   384: bipush          7
        //   386: ldc_w           ""
        //   389: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;ILjava/lang/String;)V
        //   392: getstatic       com/whatsapp/t1.c:Ljava/io/File;
        //   395: bipush          7
        //   397: ldc_w           ""
        //   400: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;ILjava/lang/String;)V
        //   403: getstatic       com/whatsapp/t1.m:Ljava/io/File;
        //   406: bipush          7
        //   408: ldc_w           ""
        //   411: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;ILjava/lang/String;)V
        //   414: getstatic       com/whatsapp/t1.e:Ljava/io/File;
        //   417: bipush          7
        //   419: ldc_w           ""
        //   422: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;ILjava/lang/String;)V
        //   425: invokestatic    com/whatsapp/util/ae.b:()Lcom/whatsapp/util/ae;
        //   428: invokevirtual   com/whatsapp/util/ae.a:()Z
        //   431: istore          26
        //   433: iload           26
        //   435: ifeq            499
        //   438: getstatic       com/whatsapp/t1.e:Ljava/io/File;
        //   441: invokevirtual   java/io/File.exists:()Z
        //   444: istore          27
        //   446: iload           27
        //   448: ifeq            499
        //   451: invokestatic    java/lang/System.currentTimeMillis:()J
        //   454: getstatic       com/whatsapp/t1.e:Ljava/io/File;
        //   457: invokevirtual   java/io/File.lastModified:()J
        //   460: lsub           
        //   461: ldc2_w          604800000
        //   464: lcmp           
        //   465: ifle            499
        //   468: new             Ljava/lang/StringBuilder;
        //   471: dup            
        //   472: invokespecial   java/lang/StringBuilder.<init>:()V
        //   475: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   478: bipush          16
        //   480: aaload         
        //   481: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   484: getstatic       com/whatsapp/t1.e:Ljava/io/File;
        //   487: invokevirtual   java/io/File.delete:()Z
        //   490: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   493: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   496: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   499: new             Ljava/lang/StringBuilder;
        //   502: dup            
        //   503: invokespecial   java/lang/StringBuilder.<init>:()V
        //   506: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   509: bipush          22
        //   511: aaload         
        //   512: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   515: aload           7
        //   517: invokevirtual   com/whatsapp/util/b0.c:()J
        //   520: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   523: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   526: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   529: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   532: getstatic       com/whatsapp/ai.SUCCESS:Lcom/whatsapp/ai;
        //   535: areturn        
        //   536: astore          9
        //   538: aload           9
        //   540: athrow         
        //   541: astore          21
        //   543: aload           21
        //   545: athrow         
        //   546: astore          16
        //   548: aconst_null    
        //   549: astore          17
        //   551: invokestatic    com/whatsapp/App.C:()J
        //   554: lconst_0       
        //   555: lcmp           
        //   556: ifne            758
        //   559: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   562: bipush          20
        //   564: aaload         
        //   565: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   568: getstatic       com/whatsapp/ai.FAILED_OUT_OF_SPACE:Lcom/whatsapp/ai;
        //   571: astore          18
        //   573: aload           17
        //   575: ifnull          583
        //   578: aload           17
        //   580: invokevirtual   java/io/FileInputStream.close:()V
        //   583: aload_3        
        //   584: ifnull          591
        //   587: aload_3        
        //   588: invokevirtual   java/io/OutputStream.close:()V
        //   591: aload_2        
        //   592: monitorexit    
        //   593: aload           18
        //   595: areturn        
        //   596: astore          13
        //   598: aload_2        
        //   599: monitorexit    
        //   600: aload           13
        //   602: athrow         
        //   603: astore          30
        //   605: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   608: bipush          17
        //   610: aaload         
        //   611: aload           30
        //   613: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   616: getstatic       com/whatsapp/ai.FAILED_GENERIC:Lcom/whatsapp/ai;
        //   619: astore          31
        //   621: aload           17
        //   623: ifnull          631
        //   626: aload           17
        //   628: invokevirtual   java/io/FileInputStream.close:()V
        //   631: aload           11
        //   633: ifnull          641
        //   636: aload           11
        //   638: invokevirtual   java/io/OutputStream.close:()V
        //   641: aload_2        
        //   642: monitorexit    
        //   643: aload           31
        //   645: areturn        
        //   646: astore          33
        //   648: aload           33
        //   650: athrow         
        //   651: astore          32
        //   653: aload           32
        //   655: athrow         
        //   656: new             Ljava/lang/StringBuilder;
        //   659: dup            
        //   660: invokespecial   java/lang/StringBuilder.<init>:()V
        //   663: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   666: bipush          19
        //   668: aaload         
        //   669: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   672: getstatic       com/whatsapp/t1.e:Ljava/io/File;
        //   675: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   678: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   681: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   684: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   687: new             Lcom/whatsapp/util/c;
        //   690: dup            
        //   691: getstatic       com/whatsapp/App.n:Lcom/whatsapp/util/p;
        //   694: getstatic       com/whatsapp/t1.e:Ljava/io/File;
        //   697: invokespecial   com/whatsapp/util/c.<init>:(Lcom/whatsapp/util/p;Ljava/io/File;)V
        //   700: astore          11
        //   702: new             Ljava/io/FileInputStream;
        //   705: dup            
        //   706: getstatic       com/whatsapp/vy.J:Ljava/io/File;
        //   709: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   712: astore          17
        //   714: aload           17
        //   716: invokevirtual   java/io/FileInputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //   719: aload           11
        //   721: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //   724: invokestatic    com/whatsapp/util/ba.a:(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
        //   727: goto            304
        //   730: astore          16
        //   732: aload           11
        //   734: astore_3       
        //   735: goto            551
        //   738: astore          29
        //   740: aload           29
        //   742: athrow         
        //   743: astore          28
        //   745: aload           28
        //   747: athrow         
        //   748: astore          20
        //   750: aload           20
        //   752: athrow         
        //   753: astore          19
        //   755: aload           19
        //   757: athrow         
        //   758: aload           16
        //   760: athrow         
        //   761: astore          10
        //   763: aload_3        
        //   764: astore          11
        //   766: aload           17
        //   768: astore          12
        //   770: aload           12
        //   772: ifnull          780
        //   775: aload           12
        //   777: invokevirtual   java/io/FileInputStream.close:()V
        //   780: aload           11
        //   782: ifnull          790
        //   785: aload           11
        //   787: invokevirtual   java/io/OutputStream.close:()V
        //   790: aload           10
        //   792: athrow         
        //   793: astore          15
        //   795: aload           15
        //   797: athrow         
        //   798: astore          14
        //   800: aload           14
        //   802: athrow         
        //   803: astore          23
        //   805: aload           23
        //   807: athrow         
        //   808: astore          24
        //   810: aload           24
        //   812: athrow         
        //   813: astore          25
        //   815: aload           25
        //   817: athrow         
        //   818: astore          10
        //   820: aconst_null    
        //   821: astore          11
        //   823: aconst_null    
        //   824: astore          12
        //   826: goto            770
        //   829: astore          10
        //   831: aconst_null    
        //   832: astore          12
        //   834: goto            770
        //   837: astore          10
        //   839: aload           17
        //   841: astore          12
        //   843: goto            770
        //   846: astore          10
        //   848: aload           17
        //   850: astore          12
        //   852: goto            770
        //   855: astore          16
        //   857: aload           11
        //   859: astore_3       
        //   860: aconst_null    
        //   861: astore          17
        //   863: goto            551
        //   866: astore          16
        //   868: aload           11
        //   870: astore_3       
        //   871: goto            551
        //   874: astore          16
        //   876: aload           11
        //   878: astore_3       
        //   879: aconst_null    
        //   880: astore          17
        //   882: goto            551
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      22     40     45     Ljava/lang/Exception;
        //  27     40     45     50     Ljava/lang/Exception;
        //  42     45     45     50     Ljava/lang/Exception;
        //  73     102    536    541    Ljava/lang/Exception;
        //  160    191    541    546    Ljava/lang/Exception;
        //  160    191    546    551    Ljava/io/IOException;
        //  160    191    818    829    Any
        //  195    203    541    546    Ljava/lang/Exception;
        //  195    203    546    551    Ljava/io/IOException;
        //  195    203    818    829    Any
        //  208    254    546    551    Ljava/io/IOException;
        //  208    254    818    829    Any
        //  254    266    855    866    Ljava/io/IOException;
        //  254    266    829    837    Any
        //  266    271    603    656    Ljava/lang/Exception;
        //  266    271    866    874    Ljava/io/IOException;
        //  266    271    837    846    Any
        //  271    304    866    874    Ljava/io/IOException;
        //  271    304    837    846    Any
        //  309    314    738    743    Ljava/lang/Exception;
        //  309    314    596    603    Any
        //  319    324    743    748    Ljava/lang/Exception;
        //  319    324    596    603    Any
        //  324    326    596    603    Any
        //  326    433    803    808    Ljava/lang/Exception;
        //  438    446    808    813    Ljava/lang/Exception;
        //  451    499    813    818    Ljava/lang/Exception;
        //  543    546    546    551    Ljava/io/IOException;
        //  543    546    818    829    Any
        //  551    573    761    770    Any
        //  578    583    748    753    Ljava/lang/Exception;
        //  578    583    596    603    Any
        //  587    591    753    758    Ljava/lang/Exception;
        //  587    591    596    603    Any
        //  591    593    596    603    Any
        //  598    600    596    603    Any
        //  605    621    866    874    Ljava/io/IOException;
        //  605    621    837    846    Any
        //  626    631    646    651    Ljava/lang/Exception;
        //  626    631    596    603    Any
        //  636    641    651    656    Ljava/lang/Exception;
        //  636    641    596    603    Any
        //  641    643    596    603    Any
        //  648    651    596    603    Any
        //  653    656    596    603    Any
        //  656    702    546    551    Ljava/io/IOException;
        //  656    702    818    829    Any
        //  702    714    874    885    Ljava/io/IOException;
        //  702    714    829    837    Any
        //  714    727    730    738    Ljava/io/IOException;
        //  714    727    846    855    Any
        //  740    743    596    603    Any
        //  745    748    596    603    Any
        //  750    753    596    603    Any
        //  755    758    596    603    Any
        //  758    761    761    770    Any
        //  775    780    793    798    Ljava/lang/Exception;
        //  775    780    596    603    Any
        //  785    790    798    803    Ljava/lang/Exception;
        //  785    790    596    603    Any
        //  790    793    596    603    Any
        //  795    798    596    603    Any
        //  800    803    596    603    Any
        //  805    808    808    813    Ljava/lang/Exception;
        //  810    813    813    818    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public Runnable a(final Runnable runnable, final Runnable runnable2) {
        return new art(this, runnable2, runnable);
    }
    
    public void a(final int n, final byte[] array, final String s, final byte[] array2, final byte[] array3) {
        this.g.put(new aoa(s, array2), new aw3(n, array, array3));
    }
    
    public void a(final awf d) {
        this.d = d;
    }
    
    public boolean a(final vy vy, final int n) {
        final boolean k = a_9.k;
        final ArrayList a = this.a(true);
        int n4 = 0;
        boolean b = false;
        Label_0367: {
            if (a.size() > 0) {
                for (final File file : a) {
                    Log.i(t1.z[79] + file.getName() + t1.z[78] + file.length() + ")");
                    if (k) {
                        break;
                    }
                }
                final File j = vy.J;
                final File parentFile = j.getParentFile();
                Label_0141: {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                        if (!k) {
                            break Label_0141;
                        }
                    }
                    j.delete();
                }
                int n2 = 0;
                final int n3 = n / a.size();
                final boolean[] array = { true, false };
                final int length = array.length;
                int i = 0;
                n4 = -1;
                b = false;
            Label_0326_Outer:
                while (i < length) {
                    final boolean b2 = array[i];
                    int n5 = -1 + a.size();
                    int n6 = n4;
                    boolean b3 = b;
                Label_0326:
                    while (true) {
                        while (n5 >= 0 && !b3) {
                            final File file2 = a.get(n5);
                            if (this.a(vy, file2, n2, n3, b2)) {
                                Log.i(t1.z[80] + file2.getName());
                                if (!k) {
                                    b = true;
                                    n4 = n5;
                                    break Label_0326;
                                }
                                b = true;
                                n4 = n5;
                            }
                            else {
                                n4 = n6;
                                b = b3;
                            }
                            final int n7 = n2 + n3;
                            this.d.a(0L, 1L, n7, 0);
                            --n5;
                            if (!k) {
                                n2 = n7;
                                n6 = n4;
                                b3 = b;
                                continue Label_0326_Outer;
                            }
                            n2 = n7;
                            final int n8 = i + 1;
                            if (k) {
                                break Label_0326_Outer;
                            }
                            i = n8;
                            continue Label_0326_Outer;
                        }
                        n4 = n6;
                        b = b3;
                        continue Label_0326;
                    }
                }
                if (!b) {
                    Log.i(t1.z[77]);
                    vy.i();
                }
                if (!k) {
                    break Label_0367;
                }
            }
            else {
                n4 = -1;
                b = false;
            }
            Log.i(t1.z[81]);
        }
        a5.a((Context)App.aq, o.DATABASE_RESTORE_SUCCEEDED_EVENTUALLY, Boolean.valueOf(b));
        a5.a((Context)App.aq, o.ANDROID_IS_SD_CARD_REMOVABLE, Boolean.valueOf(App.aw()));
        a5.a((Context)App.aq, o.DATABASE_RESTORE_SUCCEEDED_ON_FIRST_BACKUP_FILE, Boolean.valueOf(b && n4 == -1 + a.size()));
        return b;
    }
    
    public long b() {
        final boolean k = a_9.k;
        final String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals(t1.z[83]) || externalStorageState.equals(t1.z[86])) {
            final ArrayList d = this.d();
            int i = -1 + d.size();
            long n = -1L;
        Label_0180:
            while (true) {
                while (i >= 0) {
                    final File file = d.get(i);
                    long lastModified;
                    if (file.length() > 0L) {
                        Log.i(t1.z[84] + file.getName() + t1.z[85] + file.length());
                        lastModified = file.lastModified();
                        if (!k) {
                            break Label_0180;
                        }
                    }
                    else {
                        lastModified = n;
                    }
                    final int n2 = i - 1;
                    if (!k) {
                        i = n2;
                        n = lastModified;
                        continue;
                    }
                    if (lastModified == -1L) {
                        return 0L;
                    }
                    return lastModified;
                }
                long lastModified = n;
                continue Label_0180;
            }
        }
        Log.i(t1.z[82] + externalStorageState);
        return -1L;
    }
    
    public boolean b(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //     3: bipush          58
        //     5: aaload         
        //     6: invokestatic    java/lang/System.loadLibrary:(Ljava/lang/String;)V
        //     9: new             Ljava/io/File;
        //    12: dup            
        //    13: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    16: invokevirtual   com/whatsapp/App.getFilesDir:()Ljava/io/File;
        //    19: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    22: bipush          65
        //    24: aaload         
        //    25: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    28: astore_3       
        //    29: aload_1        
        //    30: invokevirtual   java/io/File.exists:()Z
        //    33: ifne            64
        //    36: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    39: bipush          72
        //    41: aaload         
        //    42: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    45: iconst_0       
        //    46: ireturn        
        //    47: astore_2       
        //    48: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    51: bipush          57
        //    53: aaload         
        //    54: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    57: iconst_0       
        //    58: ireturn        
        //    59: astore          5
        //    61: aload           5
        //    63: athrow         
        //    64: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    67: bipush          9
        //    69: if_icmplt       84
        //    72: aload_0        
        //    73: ldc2_w          2
        //    76: aload_1        
        //    77: invokevirtual   java/io/File.length:()J
        //    80: lmul           
        //    81: invokespecial   com/whatsapp/t1.a:(J)V
        //    84: aload_3        
        //    85: invokevirtual   java/io/File.delete:()Z
        //    88: pop            
        //    89: new             Ljava/lang/StringBuilder;
        //    92: dup            
        //    93: invokespecial   java/lang/StringBuilder.<init>:()V
        //    96: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //    99: bipush          73
        //   101: aaload         
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: aload_1        
        //   106: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   115: bipush          70
        //   117: aaload         
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   121: aload_3        
        //   122: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: ldc_w           ")"
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   137: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   140: aload_1        
        //   141: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   144: aload_3        
        //   145: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   148: invokestatic    com/whatsapp/SqliteShell.dump:(Ljava/lang/String;Ljava/lang/String;)I
        //   151: ifeq            205
        //   154: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   157: bipush          68
        //   159: aaload         
        //   160: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   163: iconst_0       
        //   164: ireturn        
        //   165: astore          4
        //   167: new             Ljava/lang/StringBuilder;
        //   170: dup            
        //   171: invokespecial   java/lang/StringBuilder.<init>:()V
        //   174: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   177: bipush          59
        //   179: aaload         
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: aload_1        
        //   184: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   190: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   193: aload           4
        //   195: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   198: iconst_0       
        //   199: ireturn        
        //   200: astore          6
        //   202: aload           6
        //   204: athrow         
        //   205: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   208: bipush          71
        //   210: aaload         
        //   211: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   214: new             Ljava/io/File;
        //   217: dup            
        //   218: new             Ljava/lang/StringBuilder;
        //   221: dup            
        //   222: invokespecial   java/lang/StringBuilder.<init>:()V
        //   225: aload_1        
        //   226: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   235: bipush          69
        //   237: aaload         
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   244: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   247: astore          8
        //   249: aload           8
        //   251: invokevirtual   java/io/File.delete:()Z
        //   254: pop            
        //   255: new             Ljava/lang/StringBuilder;
        //   258: dup            
        //   259: invokespecial   java/lang/StringBuilder.<init>:()V
        //   262: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   265: bipush          61
        //   267: aaload         
        //   268: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   271: aload           8
        //   273: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   276: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   279: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   282: bipush          63
        //   284: aaload         
        //   285: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   288: aload_3        
        //   289: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   292: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   295: ldc_w           ")"
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   304: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   307: aload           8
        //   309: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   312: aload_3        
        //   313: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   316: invokestatic    com/whatsapp/SqliteShell.restore:(Ljava/lang/String;Ljava/lang/String;)I
        //   319: istore          10
        //   321: aload_3        
        //   322: invokevirtual   java/io/File.length:()J
        //   325: lstore          11
        //   327: aload_3        
        //   328: invokevirtual   java/io/File.delete:()Z
        //   331: pop            
        //   332: iload           10
        //   334: ifeq            348
        //   337: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   340: bipush          60
        //   342: aaload         
        //   343: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   346: iconst_0       
        //   347: ireturn        
        //   348: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   351: bipush          66
        //   353: aaload         
        //   354: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   357: aload           8
        //   359: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   362: aconst_null    
        //   363: bipush          16
        //   365: invokestatic    android/database/sqlite/SQLiteDatabase.openDatabase:(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
        //   368: astore          14
        //   370: aload           14
        //   372: iconst_1       
        //   373: invokevirtual   android/database/sqlite/SQLiteDatabase.setVersion:(I)V
        //   376: aload           14
        //   378: invokevirtual   android/database/sqlite/SQLiteDatabase.close:()V
        //   381: aload_1        
        //   382: invokestatic    com/whatsapp/vy.a:(Ljava/io/File;)I
        //   385: i2l            
        //   386: lstore          15
        //   388: aload           8
        //   390: invokestatic    com/whatsapp/vy.a:(Ljava/io/File;)I
        //   393: istore          17
        //   395: iload           17
        //   397: i2l            
        //   398: lstore          18
        //   400: new             Ljava/lang/StringBuilder;
        //   403: dup            
        //   404: invokespecial   java/lang/StringBuilder.<init>:()V
        //   407: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   410: bipush          64
        //   412: aaload         
        //   413: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   416: aload_1        
        //   417: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   420: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   423: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   426: bipush          67
        //   428: aaload         
        //   429: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   432: lload           15
        //   434: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   437: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   440: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   443: new             Ljava/lang/StringBuilder;
        //   446: dup            
        //   447: invokespecial   java/lang/StringBuilder.<init>:()V
        //   450: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   453: bipush          56
        //   455: aaload         
        //   456: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   459: aload_3        
        //   460: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   463: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   466: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   469: bipush          62
        //   471: aaload         
        //   472: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   475: lload           11
        //   477: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   480: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   483: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   486: new             Ljava/lang/StringBuilder;
        //   489: dup            
        //   490: invokespecial   java/lang/StringBuilder.<init>:()V
        //   493: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   496: bipush          54
        //   498: aaload         
        //   499: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   502: aload           8
        //   504: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   507: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   510: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   513: bipush          55
        //   515: aaload         
        //   516: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   519: lload           18
        //   521: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   524: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   527: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   530: new             Ljava/lang/StringBuilder;
        //   533: dup            
        //   534: invokespecial   java/lang/StringBuilder.<init>:()V
        //   537: getstatic       com/whatsapp/t1.z:[Ljava/lang/String;
        //   540: bipush          74
        //   542: aaload         
        //   543: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   546: ldc2_w          100.0
        //   549: lload           15
        //   551: l2d            
        //   552: dmul           
        //   553: lload           18
        //   555: l2d            
        //   556: ddiv           
        //   557: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   560: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   563: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   566: lload           15
        //   568: lconst_0       
        //   569: lcmp           
        //   570: iflt            45
        //   573: lload           18
        //   575: lconst_0       
        //   576: lcmp           
        //   577: iflt            45
        //   580: lload           15
        //   582: lconst_0       
        //   583: lcmp           
        //   584: ifeq            601
        //   587: lload           18
        //   589: l2d            
        //   590: lload           15
        //   592: l2d            
        //   593: ddiv           
        //   594: ldc2_w          0.3
        //   597: dcmpl          
        //   598: iflt            45
        //   601: aload           8
        //   603: aload_1        
        //   604: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   607: ireturn        
        //   608: astore          20
        //   610: aload           20
        //   612: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      9      47     59     Ljava/lang/UnsatisfiedLinkError;
        //  29     45     165    200    Ljava/lang/Exception;
        //  29     45     59     64     Ljava/lang/UnsatisfiedLinkError;
        //  64     84     200    205    Ljava/lang/UnsatisfiedLinkError;
        //  64     84     165    200    Ljava/lang/Exception;
        //  84     163    165    200    Ljava/lang/Exception;
        //  202    205    165    200    Ljava/lang/Exception;
        //  205    332    165    200    Ljava/lang/Exception;
        //  337    346    165    200    Ljava/lang/Exception;
        //  348    395    165    200    Ljava/lang/Exception;
        //  400    566    608    613    Ljava/lang/UnsatisfiedLinkError;
        //  400    566    165    200    Ljava/lang/Exception;
        //  601    608    165    200    Ljava/lang/Exception;
        //  610    613    165    200    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 282, Size: 282
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
    
    public int c() {
        return this.a(true).size();
    }
    
    public void e() {
        ba.a(t1.l, -1, "");
        ba.a(t1.b, -1, "");
        ba.a(t1.i, -1, "");
        ba.a(t1.h, -1, "");
        ba.a(t1.a, -1, "");
        ba.a(t1.k, -1, "");
        ba.a(t1.c, -1, "");
        ba.a(t1.m, -1, "");
        ba.a(t1.e, -1, "");
    }
}
