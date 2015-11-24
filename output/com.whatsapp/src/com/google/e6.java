// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.List;
import java.util.regex.Matcher;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Logger;
import java.util.Map;
import java.util.regex.Pattern;

public class e6
{
    private static e6 A;
    private static final Pattern B;
    private static final Pattern C;
    static final Pattern E;
    private static final String F;
    private static final Map G;
    private static final Pattern I;
    private static final String[] J;
    public static int a;
    private static final Pattern b;
    private static final String c;
    private static final Pattern e;
    private static final Pattern g;
    static final Pattern h;
    private static final Map i;
    private static final String j;
    static final Pattern k;
    private static final Pattern m;
    private static final Pattern n;
    private static final Pattern o;
    private static final Pattern p;
    private static final Pattern q;
    private static final Map r;
    private static final Pattern v;
    private static final Logger w;
    private static final Map x;
    static final Pattern y;
    static final String z;
    private final Set D;
    private final Map H;
    private c6 d;
    private String f;
    private final Set l;
    private final Map s;
    private final Set t;
    private Map u;
    
    static {
        int n2 = -1;
        final String[] l = new String[50];
        int n3 = 0;
        String[] array = l;
        String s = "z8B";
        int n4 = n2;
        String z2 = null;
    Label_1258:
        while (true) {
            z2 = z(z(s));
            switch (n4) {
                default: {
                    array[n3] = z2;
                    s = ">m\u001f5";
                    n3 = 1;
                    array = l;
                    n4 = 0;
                    continue;
                }
                case 0: {
                    array[n3] = z2;
                    n3 = 2;
                    array = l;
                    s = "\u001e`\u0016/f>z\u001aarj{\u0006\u007fe&a\u0016k5#{S{z%(\u0000gz8|S{zjj\u0016/tjx\u001b`{/(\u001dzx(m\u0001!";
                    n4 = 1;
                    continue;
                }
                case 1: {
                    array[n3] = z2;
                    n3 = 3;
                    s = "\u001e`\u0016/f>z\u001aarj{\u0006\u007fe&a\u0016k5#{S{z%(\u0000gz8|S{zjj\u0016/tjx\u001b`{/(\u001dzx(m\u0001!";
                    n4 = 2;
                    array = l;
                    continue;
                }
                case 2: {
                    array[n3] = z2;
                    n3 = 4;
                    s = "\tg\u0006cqjf\u001c{5#f\u0007jg:z\u0016{5$}\u001emp8{Sns>m\u0001/e&}\u0000\"f#o\u001d!";
                    n4 = 3;
                    array = l;
                    continue;
                }
                case 3: {
                    array[n3] = z2;
                    n3 = 5;
                    s = "\u001e`\u0016/f>z\u001aarj{\u0006\u007fe&a\u0016k5#{S{z%(\u001f`{-(\u0007`5(mSn5:`\u001capjf\u0006bw/z]";
                    n4 = 4;
                    array = l;
                    continue;
                }
                case 4: {
                    array[n3] = z2;
                    n3 = 6;
                    s = "\u001e`\u0016/e\"g\u001dj5$}\u001emp8(\u0000ze:d\u001ajqj\u007f\u0012|5$}\u001fc;";
                    n4 = 5;
                    array = l;
                    continue;
                }
                case 5: {
                    array[n3] = z2;
                    n3 = 7;
                    s = "\u001e`\u0016/f>z\u001aarj{\u0006\u007fe&a\u0016k5=i\u0000/a%gScz$oS{zjx\u0012}f/&";
                    n4 = 6;
                    array = l;
                    continue;
                }
                case 6: {
                    array[n3] = z2;
                    n3 = 8;
                    s = "\u001e`\u0016/f>z\u001aarj{\u0006\u007fe&a\u0016k5.a\u0017/{%|S|p/eS{zjj\u0016/tjx\u001b`{/(\u001dzx(m\u0001!";
                    n4 = 7;
                    array = l;
                    continue;
                }
                case 7: {
                    array[n3] = z2;
                    n3 = 9;
                    s = "\u0007a\u0000||$oS`gja\u001dyt&a\u0017/q/n\u0012zy>(\u0001jr#g\u001d!";
                    n4 = 8;
                    array = l;
                    continue;
                }
                case 8: {
                    array[n3] = z2;
                    n3 = 10;
                    s = "\u0007a\u0000||$o\\f{<i\u001ffqjk\u001cz{>z\nPv%l\u0016/=";
                    n4 = 9;
                    array = l;
                    continue;
                }
                case 9: {
                    array[n3] = z2;
                    n3 = 11;
                    s = "c(\u0015`gjf\u0006bw/zS";
                    n4 = 10;
                    array = l;
                    continue;
                }
                case 10: {
                    array[n3] = z2;
                    n3 = 12;
                    s = "\u001a`\u001capjf\u0006bw/zSgt.(\u0012a5\u0003L7#5(}\u0007/t,|\u0016}5>`\u001a|5=i\u0000/{%|Scz$oSj{%}\u0014g5>gSmpjiSy|+j\u001fj5:`\u001capjf\u0006bw/z]";
                    n4 = 11;
                    array = l;
                    continue;
                }
                case 11: {
                    array[n3] = z2;
                    n3 = 13;
                    s = "\u0004g\u001dBt>k\u001b";
                    n4 = 12;
                    array = l;
                    continue;
                }
                case 12: {
                    array[n3] = z2;
                    n3 = 14;
                    s = "\tg\u0006aa8qSlt&d\u001aarjk\u001ckpj{\u0006\u007fe&a\u0016k5=i\u0000/{%|S}p)g\u0014a|9m\u0017!";
                    n4 = 13;
                    array = l;
                    continue;
                }
                case 13: {
                    array[n3] = z2;
                    n3 = 15;
                    s = "\u0011%SR>b";
                    n4 = 14;
                    array = l;
                    continue;
                }
                case 14: {
                    array[n3] = z2;
                    n3 = 16;
                    s = "19_:hc+";
                    n4 = 15;
                    array = l;
                    continue;
                }
                case 15: {
                    array[n3] = z2;
                    n3 = 17;
                    s = "\u0016x\bAq7";
                    n4 = 16;
                    array = l;
                    continue;
                }
                case 16: {
                    array[n3] = z2;
                    n3 = 18;
                    s = "i7\u000f";
                    n4 = 17;
                    array = l;
                    continue;
                }
                case 17: {
                    array[n3] = z2;
                    n3 = 19;
                    s = "\u0017t\u001aaa6i\u001djm%t\uff3a\uff41\uff41c";
                    n4 = 18;
                    array = l;
                    continue;
                }
                case 18: {
                    array[n3] = z2;
                    n3 = 20;
                    s = "\u00112/!\uff1b\u00177(/µ\u0016|_\"H`";
                    n4 = 19;
                    array = l;
                    continue;
                }
                case 19: {
                    array[n3] = z2;
                    n3 = 21;
                    s = "qm\u000b{(bT\u0003t[.u\b>9}uZsNj¨/{9\u0017\"[0//7\u000b{=u2\u0016af# L5z\u034b7\u000f\u00fc<c7\u001d0i\uff0f7\uff2b\uff5b\uff5but(";
                    n4 = 20;
                    array = l;
                    continue;
                }
                case 20: {
                    array[n3] = z2;
                    n3 = 22;
                    s = "bT\u0003t[.u\b>9}uZ";
                    n4 = 21;
                    array = l;
                    continue;
                }
                case 21: {
                    array[n3] = z2;
                    n3 = 23;
                    s = "qx\u001b`{/%\u0010`{>m\u000b{(";
                    n4 = 22;
                    array = l;
                    continue;
                }
                case 22: {
                    array[n3] = z2;
                    n3 = 24;
                    s = ">m\u001f5";
                    n4 = 23;
                    array = l;
                    continue;
                }
                case 23: {
                    array[n3] = z2;
                    n3 = 25;
                    s = ">m\u001f5";
                    n4 = 24;
                    array = l;
                    continue;
                }
                case 24: {
                    array[n3] = z2;
                    n3 = 26;
                    s = "qa\u0000zww";
                    n4 = 25;
                    array = l;
                    continue;
                }
                case 25: {
                    array[n3] = z2;
                    n3 = 27;
                    s = "qx\u001b`{/%\u0010`{>m\u000b{(";
                    n4 = 26;
                    array = l;
                    continue;
                }
                case 26: {
                    array[n3] = z2;
                    n3 = 28;
                    s = "\t`\u0016l~#f\u0014/|,(\u001dzx(m\u0001/|9(\u0003`f9a\u0011cpj\u007f\u001a{}ja\u001dlz'x\u001fja/(\u001eja+l\u0012{td";
                    n4 = 27;
                    array = l;
                    continue;
                }
                case 27: {
                    array[n3] = z2;
                    n3 = 29;
                    s = "z8B";
                    n4 = 28;
                    array = l;
                    continue;
                }
                case 28: {
                    array[n3] = z2;
                    n3 = 30;
                    s = "z8B";
                    n4 = 29;
                    array = l;
                    continue;
                }
                case 29: {
                    array[n3] = z2;
                    n3 = 31;
                    s = "z8B";
                    n4 = 30;
                    array = l;
                    continue;
                }
                case 30: {
                    array[n3] = z2;
                    s = "#f\u0005ny#lSbp>i\u0017na+([lz?f\u0007}ljk\u0012cy#f\u0014/v%l\u0016/b+{Sbt:x\u0016k5>gS{}/(\u001d`{go\u0016`5/f\u0007fa3(\u0012|5=m\u001fc5+{S|e/k\u001ai|)(\u0001jr#g\u001d'fc!";
                    n4 = 31;
                    n3 = 32;
                    array = l;
                    continue;
                }
                case 31: {
                    array[n3] = z2;
                    n3 = 33;
                    array = l;
                    s = "z8B";
                    n4 = 32;
                    continue;
                }
                case 32: {
                    array[n3] = z2;
                    n3 = 34;
                    s = "/e\u0003{lje\u0016{t.i\u0007n/j";
                    n4 = 33;
                    array = l;
                    continue;
                }
                case 33: {
                    array[n3] = z2;
                    n3 = 35;
                    s = "/e\u0003{lje\u0016{t.i\u0007n/j";
                    n4 = 34;
                    array = l;
                    continue;
                }
                case 34: {
                    array[n3] = z2;
                    n3 = 36;
                    s = "\u0004'2";
                    n4 = 35;
                    array = l;
                    continue;
                }
                case 35: {
                    array[n3] = z2;
                    n3 = 37;
                    s = "\u0003f\u0005ny#lS}p-a\u001ca5)g\u0017j/j";
                    n4 = 36;
                    array = l;
                    continue;
                }
                case 36: {
                    array[n3] = z2;
                    n3 = 38;
                    s = "\u0019|\u0001fe:m\u0017/a8i\u001ac|$oSl}+z\u0012la/z\u000055";
                    n4 = 37;
                    array = l;
                    continue;
                }
                case 37: {
                    array[n3] = z2;
                    n3 = 39;
                    s = "\u0003f\u0005ny#lS`gje\u001a|f#f\u0014/g/o\u001a`{jk\u001ckpj ";
                    n4 = 38;
                    array = l;
                    continue;
                }
                case 38: {
                    array[n3] = z2;
                    n3 = 40;
                    s = "$}\u001fc";
                    n4 = 39;
                    array = l;
                    continue;
                }
                case 39: {
                    array[n3] = z2;
                    n3 = 41;
                    s = "c(\u0003}z<a\u0017jqd";
                    n4 = 40;
                    array = l;
                    continue;
                }
                case 40: {
                    array[n3] = z2;
                    n3 = 42;
                    s = "ek\u001cb:-g\u001chy/'\u001a>-$'\u0003gz$m\u001dzx(m\u0001|:.i\u0007n:\u001a`\u001cap\u0004}\u001emp8E\u0016{t.i\u0007nE8g\u0007`";
                    n4 = 41;
                    array = l;
                    continue;
                }
                case 41: {
                    array[n3] = z2;
                    n3 = 43;
                    s = "ek\u001cb:-g\u001chy/'\u001a>-$'\u0003gz$m\u001dzx(m\u0001|:.i\u0007n:\u001a`\u001cap\u0004}\u001emp8E\u0016{t.i\u0007nE8g\u0007`";
                    n4 = 42;
                    array = l;
                    continue;
                }
                case 42: {
                    array[n3] = z2;
                    n3 = 44;
                    s = "z8B";
                    n4 = 43;
                    array = l;
                    continue;
                }
                case 43: {
                    array[n3] = z2;
                    s = "qm\u000b{(";
                    n4 = 44;
                    n3 = 45;
                    array = l;
                    continue;
                }
                case 44: {
                    array[n3] = z2;
                    n3 = 46;
                    array = l;
                    s = "jm\u000b{;j";
                    n4 = 45;
                    continue;
                }
                case 45: {
                    array[n3] = z2;
                    n3 = 47;
                    s = "\u0010R";
                    n4 = 46;
                    array = l;
                    continue;
                }
                case 46: {
                    array[n3] = z2;
                    n3 = 48;
                    s = "\u0010R";
                    n4 = 47;
                    array = l;
                    continue;
                }
                case 47: {
                    array[n3] = z2;
                    n3 = 49;
                    s = "\u0010R";
                    n4 = 48;
                    array = l;
                    continue;
                }
                case 48: {
                    break Label_1258;
                }
            }
        }
        array[n3] = z2;
        J = l;
        w = Logger.getLogger(e6.class.getName());
        final HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        hashMap.put('0', '0');
        hashMap.put('1', '1');
        hashMap.put('2', '2');
        hashMap.put('3', '3');
        hashMap.put('4', '4');
        hashMap.put('5', '5');
        hashMap.put('6', '6');
        hashMap.put('7', '7');
        hashMap.put('8', '8');
        hashMap.put('9', '9');
        final HashMap<Character, Character> hashMap2 = new HashMap<Character, Character>(40);
        hashMap2.put('A', '2');
        hashMap2.put('B', '2');
        hashMap2.put('C', '2');
        hashMap2.put('D', '3');
        hashMap2.put('E', '3');
        hashMap2.put('F', '3');
        hashMap2.put('G', '4');
        hashMap2.put('H', '4');
        hashMap2.put('I', '4');
        hashMap2.put('J', '5');
        hashMap2.put('K', '5');
        hashMap2.put('L', '5');
        hashMap2.put('M', '6');
        hashMap2.put('N', '6');
        hashMap2.put('O', '6');
        hashMap2.put('P', '7');
        hashMap2.put('Q', '7');
        hashMap2.put('R', '7');
        hashMap2.put('S', '7');
        hashMap2.put('T', '8');
        hashMap2.put('U', '8');
        hashMap2.put('V', '8');
        hashMap2.put('W', '9');
        hashMap2.put('X', '9');
        hashMap2.put('Y', '9');
        hashMap2.put('Z', '9');
        x = Collections.unmodifiableMap((Map<?, ?>)hashMap2);
        final HashMap<Object, Object> hashMap3 = new HashMap<Object, Object>(100);
        hashMap3.putAll(e6.x);
        hashMap3.putAll(hashMap);
        r = Collections.unmodifiableMap((Map<?, ?>)hashMap3);
        final HashMap<Character, Character> hashMap4 = new HashMap<Character, Character>();
        hashMap4.putAll(hashMap);
        hashMap4.put('+', '+');
        hashMap4.put('*', '*');
        i = Collections.unmodifiableMap((Map<?, ?>)hashMap4);
        final HashMap<Character, Character> hashMap5 = new HashMap<Character, Character>();
        for (final char charValue : e6.x.keySet()) {
            hashMap5.put(Character.toLowerCase(charValue), charValue);
            hashMap5.put(charValue, charValue);
        }
        hashMap5.putAll(hashMap);
        hashMap5.put('-', '-');
        hashMap5.put('\uff0d', '-');
        hashMap5.put('\u2010', '-');
        hashMap5.put('\u2011', '-');
        hashMap5.put('\u2012', '-');
        hashMap5.put('\u2013', '-');
        hashMap5.put('\u2014', '-');
        hashMap5.put('\u2015', '-');
        hashMap5.put('\u2212', '-');
        hashMap5.put('/', '/');
        hashMap5.put('\uff0f', '/');
        hashMap5.put(' ', ' ');
        hashMap5.put('\u3000', ' ');
        hashMap5.put('\u2060', ' ');
        hashMap5.put('.', '.');
        hashMap5.put('\uff0e', '.');
        G = Collections.unmodifiableMap((Map<?, ?>)hashMap5);
        String s2 = "\u0011T\u0017R>b7ITk\u2019\u2234\uff2dRN\u0016l.$<u";
        int n5 = n2;
        String z3 = null;
    Label_2603:
        while (true) {
            z3 = z(z(s2));
            switch (n5) {
                default: {
                    g = Pattern.compile(z3);
                    final StringBuilder sb = new StringBuilder();
                    final String string = Arrays.toString(e6.x.keySet().toArray());
                    StringBuilder sb2 = sb;
                    String s3 = string;
                    String s4 = "\u0011$SSN\u0016U.";
                    int n6 = n2;
                    String z4 = null;
                Label_2801:
                    while (true) {
                        z4 = z(z(s4));
                        switch (n6) {
                            default: {
                                final StringBuilder append = sb2.append(s3.replaceAll(z4, ""));
                                final String lowerCase = Arrays.toString(e6.x.keySet().toArray()).toLowerCase();
                                sb2 = append;
                                s3 = lowerCase;
                                s4 = "\u0011$SSN\u0016U.";
                                n6 = 0;
                                continue;
                            }
                            case 0: {
                                break Label_2801;
                            }
                        }
                    }
                    c = sb2.append(s3.replaceAll(z4, "")).toString();
                    s2 = "\u0011#\uff78R>";
                    n5 = 0;
                    continue;
                }
                case 7: {
                    break Label_2603;
                }
                case 6: {
                    b = Pattern.compile(z3);
                    StringBuilder sb3 = new StringBuilder();
                    String s5 = "\u0016x\bAq7sAri\u0011#\uff78R?a L5Ngp\u2063\"\u2000\u2258\u30f4\uff7e\"\uff1aj¨\u00de\u2004\u2075\u304a Z\uff07\uff1c\uff71\uff35]SN\u0016U\\q\u2046\u2276\uff56YR?\u0016x\bAq7!\b<97S^w\u2005g\u201d\u2261\u30f3\uff18g\uff07S¯¸\u2041\u2068\u3073'<\uff42\uff01\uff48\uff32;\u0016S/R:4\u205b\u224f\uff51?";
                    int n7 = n2;
                    String z5 = null;
                Label_2967:
                    while (true) {
                        z5 = z(z(s5));
                        switch (n7) {
                            default: {
                                sb3 = sb3.append(z5).append(e6.c);
                                s5 = "\u0016x\bAq7";
                                n7 = 0;
                                continue;
                            }
                            case 0: {
                                sb3 = sb3.append(z5);
                                s5 = "\u0017\"";
                                n7 = 1;
                                continue;
                            }
                            case 1: {
                                break Label_2967;
                            }
                        }
                    }
                    F = sb3.append(z5).toString();
                    s2 = "2\uff50P\uff0ck\uff14";
                    n5 = 7;
                    continue;
                }
                case 0: {
                    y = Pattern.compile(z3);
                    s2 = "\u0011%\u000b\u201f8\u205f\u221a\u308f\uff028\uff45(\u00d3¢\u201e\u202a\u3008[&\uff1d\uff43\uff33\uff4e!I\u0011T. k\u2019\u2234\uff2dR>";
                    n5 = 1;
                    continue;
                }
                case 1: {
                    p = Pattern.compile(z3);
                    s2 = "bT\u0003t[.uZ";
                    n5 = 2;
                    continue;
                }
                case 2: {
                    m = Pattern.compile(z3);
                    s2 = "\u0011#\uff78Se1F\u0017rH";
                    n5 = 3;
                    continue;
                }
                case 3: {
                    o = Pattern.compile(z3);
                    s2 = "\u0011T/ Hj\"\u000b";
                    n5 = 4;
                    continue;
                }
                case 4: {
                    h = Pattern.compile(z3);
                    s2 = "\u0011S/_n\u0004uU)I\u001as?rHl.(Q6\u0017UX+";
                    n5 = 5;
                    continue;
                }
                case 5: {
                    k = Pattern.compile(z3);
                    s2 = "b7I!?uS2\"O+%\tR<1;\u000e!?";
                    n5 = 6;
                    continue;
                }
            }
        }
        j = f("," + z3);
        z = f(z3);
        StringBuilder sb4 = new StringBuilder();
        String s6 = "b7I";
        int n8 = n2;
        String z6 = null;
    Label_3062:
        while (true) {
            z6 = z(z(s6));
            switch (n8) {
                default: {
                    sb4 = sb4.append(z6).append(e6.j);
                    s6 = "c,";
                    n8 = 0;
                    continue;
                }
                case 0: {
                    v = Pattern.compile(sb4.append(z6).toString(), 66);
                    sb4 = new StringBuilder().append(e6.F);
                    s6 = "b7I";
                    n8 = 1;
                    continue;
                }
                case 1: {
                    sb4 = sb4.append(z6).append(e6.j);
                    s6 = "c7";
                    n8 = 2;
                    continue;
                }
                case 2: {
                    break Label_3062;
                }
            }
        }
        C = Pattern.compile(sb4.append(z6).toString(), 66);
        String s7 = "bT7$<";
        String z7 = null;
    Label_3160:
        while (true) {
            z7 = z(z(s7));
            switch (n2) {
                default: {
                    E = Pattern.compile(z7);
                    s7 = "bTWSqc";
                    n2 = 0;
                    continue;
                }
                case 0: {
                    B = Pattern.compile(z7);
                    s7 = "\u0016,=_";
                    n2 = 1;
                    continue;
                }
                case 1: {
                    e = Pattern.compile(z7);
                    s7 = "\u0016,5H";
                    n2 = 2;
                    continue;
                }
                case 2: {
                    I = Pattern.compile(z7);
                    s7 = "\u0016,0L";
                    n2 = 3;
                    continue;
                }
                case 3: {
                    n = Pattern.compile(z7);
                    s7 = "\u0016 LS1{TZ0";
                    n2 = 4;
                    continue;
                }
                case 4: {
                    break Label_3160;
                }
            }
        }
        q = Pattern.compile(z7);
        e6.A = null;
    }
    
    private e6() {
        this.f = e6.J[42];
        this.u = null;
        this.l = new HashSet(320);
        this.D = new HashSet(35);
        this.s = Collections.synchronizedMap(new HashMap<Object, Object>());
        this.H = Collections.synchronizedMap(new HashMap<Object, Object>());
        this.t = new HashSet();
        this.d = new c6(100);
    }
    
    private c0 a(final int n, final String s) {
        try {
            if (e6.J[29].equals(s)) {
                return this.c(n);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return this.l(s);
    }
    
    public static e6 a() {
        while (true) {
            synchronized (e6.class) {
                try {
                    if (e6.A == null) {
                        return a(e6.J[43], c9.a());
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            return e6.A;
        }
    }
    
    static e6 a(final String s, final Map u) {
        synchronized (e6.class) {
            try {
                if (e6.A == null) {
                    e6.A = new e6();
                    e6.A.u = u;
                    e6.A.h(s);
                }
                return e6.A;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
    }
    
    private g_ a(final String p0, final c0 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: invokevirtual   com/google/c0.ac:()Lcom/google/h2;
        //     4: astore_3       
        //     5: aload_3        
        //     6: invokevirtual   com/google/h2.c:()Z
        //     9: istore          6
        //    11: iload           6
        //    13: ifeq            25
        //    16: aload_0        
        //    17: aload_1        
        //    18: aload_3        
        //    19: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //    22: ifne            39
        //    25: getstatic       com/google/g_.UNKNOWN:Lcom/google/g_;
        //    28: areturn        
        //    29: astore          4
        //    31: aload           4
        //    33: athrow         
        //    34: astore          5
        //    36: aload           5
        //    38: athrow         
        //    39: aload_0        
        //    40: aload_1        
        //    41: aload_2        
        //    42: invokevirtual   com/google/c0.g:()Lcom/google/h2;
        //    45: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //    48: ifeq            64
        //    51: getstatic       com/google/g_.PREMIUM_RATE:Lcom/google/g_;
        //    54: astore          29
        //    56: aload           29
        //    58: areturn        
        //    59: astore          7
        //    61: aload           7
        //    63: athrow         
        //    64: aload_0        
        //    65: aload_1        
        //    66: aload_2        
        //    67: invokevirtual   com/google/c0.l:()Lcom/google/h2;
        //    70: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //    73: ifeq            89
        //    76: getstatic       com/google/g_.TOLL_FREE:Lcom/google/g_;
        //    79: astore          28
        //    81: aload           28
        //    83: areturn        
        //    84: astore          8
        //    86: aload           8
        //    88: athrow         
        //    89: aload_0        
        //    90: aload_1        
        //    91: aload_2        
        //    92: invokevirtual   com/google/c0.T:()Lcom/google/h2;
        //    95: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //    98: ifeq            114
        //   101: getstatic       com/google/g_.SHARED_COST:Lcom/google/g_;
        //   104: astore          27
        //   106: aload           27
        //   108: areturn        
        //   109: astore          9
        //   111: aload           9
        //   113: athrow         
        //   114: aload_0        
        //   115: aload_1        
        //   116: aload_2        
        //   117: invokevirtual   com/google/c0.h:()Lcom/google/h2;
        //   120: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //   123: ifeq            139
        //   126: getstatic       com/google/g_.VOIP:Lcom/google/g_;
        //   129: astore          26
        //   131: aload           26
        //   133: areturn        
        //   134: astore          10
        //   136: aload           10
        //   138: athrow         
        //   139: aload_0        
        //   140: aload_1        
        //   141: aload_2        
        //   142: invokevirtual   com/google/c0.U:()Lcom/google/h2;
        //   145: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //   148: ifeq            164
        //   151: getstatic       com/google/g_.PERSONAL_NUMBER:Lcom/google/g_;
        //   154: astore          25
        //   156: aload           25
        //   158: areturn        
        //   159: astore          11
        //   161: aload           11
        //   163: athrow         
        //   164: aload_0        
        //   165: aload_1        
        //   166: aload_2        
        //   167: invokevirtual   com/google/c0.J:()Lcom/google/h2;
        //   170: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //   173: ifeq            189
        //   176: getstatic       com/google/g_.PAGER:Lcom/google/g_;
        //   179: astore          24
        //   181: aload           24
        //   183: areturn        
        //   184: astore          12
        //   186: aload           12
        //   188: athrow         
        //   189: aload_0        
        //   190: aload_1        
        //   191: aload_2        
        //   192: invokevirtual   com/google/c0.R:()Lcom/google/h2;
        //   195: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //   198: ifeq            214
        //   201: getstatic       com/google/g_.UAN:Lcom/google/g_;
        //   204: astore          23
        //   206: aload           23
        //   208: areturn        
        //   209: astore          13
        //   211: aload           13
        //   213: athrow         
        //   214: aload_0        
        //   215: aload_1        
        //   216: aload_2        
        //   217: invokevirtual   com/google/c0.m:()Lcom/google/h2;
        //   220: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //   223: ifeq            239
        //   226: getstatic       com/google/g_.VOICEMAIL:Lcom/google/g_;
        //   229: astore          22
        //   231: aload           22
        //   233: areturn        
        //   234: astore          14
        //   236: aload           14
        //   238: athrow         
        //   239: aload_0        
        //   240: aload_1        
        //   241: aload_2        
        //   242: invokevirtual   com/google/c0.v:()Lcom/google/h2;
        //   245: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //   248: ifeq            300
        //   251: aload_2        
        //   252: invokevirtual   com/google/c0.F:()Z
        //   255: ifeq            271
        //   258: getstatic       com/google/g_.FIXED_LINE_OR_MOBILE:Lcom/google/g_;
        //   261: astore          21
        //   263: aload           21
        //   265: areturn        
        //   266: astore          18
        //   268: aload           18
        //   270: athrow         
        //   271: aload_0        
        //   272: aload_1        
        //   273: aload_2        
        //   274: invokevirtual   com/google/c0.P:()Lcom/google/h2;
        //   277: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //   280: ifeq            296
        //   283: getstatic       com/google/g_.FIXED_LINE_OR_MOBILE:Lcom/google/g_;
        //   286: astore          20
        //   288: aload           20
        //   290: areturn        
        //   291: astore          19
        //   293: aload           19
        //   295: athrow         
        //   296: getstatic       com/google/g_.FIXED_LINE:Lcom/google/g_;
        //   299: areturn        
        //   300: aload_2        
        //   301: invokevirtual   com/google/c0.F:()Z
        //   304: istore          17
        //   306: iload           17
        //   308: ifne            337
        //   311: aload_0        
        //   312: aload_1        
        //   313: aload_2        
        //   314: invokevirtual   com/google/c0.P:()Lcom/google/h2;
        //   317: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/h2;)Z
        //   320: ifeq            337
        //   323: getstatic       com/google/g_.MOBILE:Lcom/google/g_;
        //   326: areturn        
        //   327: astore          15
        //   329: aload           15
        //   331: athrow         
        //   332: astore          16
        //   334: aload           16
        //   336: athrow         
        //   337: getstatic       com/google/g_.UNKNOWN:Lcom/google/g_;
        //   340: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  5      11     29     34     Ljava/lang/RuntimeException;
        //  16     25     34     39     Ljava/lang/RuntimeException;
        //  25     29     34     39     Ljava/lang/RuntimeException;
        //  31     34     34     39     Ljava/lang/RuntimeException;
        //  39     56     59     64     Ljava/lang/RuntimeException;
        //  64     81     84     89     Ljava/lang/RuntimeException;
        //  89     106    109    114    Ljava/lang/RuntimeException;
        //  114    131    134    139    Ljava/lang/RuntimeException;
        //  139    156    159    164    Ljava/lang/RuntimeException;
        //  164    181    184    189    Ljava/lang/RuntimeException;
        //  189    206    209    214    Ljava/lang/RuntimeException;
        //  214    231    234    239    Ljava/lang/RuntimeException;
        //  251    263    266    271    Ljava/lang/RuntimeException;
        //  271    288    291    296    Ljava/lang/RuntimeException;
        //  300    306    327    332    Ljava/lang/RuntimeException;
        //  311    327    332    337    Ljava/lang/RuntimeException;
        //  329    332    332    337    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    private h0 a(final Pattern pattern, final String s) {
        final Matcher matcher = pattern.matcher(s);
        try {
            if (matcher.matches()) {
                return h0.IS_POSSIBLE;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            if (matcher.lookingAt()) {
                return h0.TOO_LONG;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return h0.TOO_SHORT;
    }
    
    private String a(final c_ c_, final List list) {
        final int a = e6.a;
        final String a2 = this.a(c_);
        final Iterator<String> iterator = list.iterator();
        String s = null;
        while (true) {
            Label_0123: {
                if (!iterator.hasNext()) {
                    break Label_0123;
                }
                s = iterator.next();
                final c0 l = this.l(s);
                Label_0119: {
                    try {
                        if (!l.a()) {
                            break Label_0119;
                        }
                        final e6 e6 = this;
                        final c6 c6 = e6.d;
                        final c0 c7 = l;
                        final String s2 = c7.w();
                        final Pattern pattern = c6.a(s2);
                        final String s3 = a2;
                        final Matcher matcher = pattern.matcher(s3);
                        final boolean b = matcher.lookingAt();
                        if (b) {
                            return s;
                        }
                        break Label_0119;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final e6 e6 = this;
                        final c6 c6 = e6.d;
                        final c0 c7 = l;
                        final String s2 = c7.w();
                        final Pattern pattern = c6.a(s2);
                        final String s3 = a2;
                        final Matcher matcher = pattern.matcher(s3);
                        final boolean b = matcher.lookingAt();
                        if (b) {
                            return s;
                        }
                        break Label_0119;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    try {
                        if (this.a(a2, l) == g_.UNKNOWN) {
                            if (a != 0) {
                                return null;
                            }
                            continue;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
            }
            break;
        }
        return s;
    }
    
    private String a(final String s, final c0 c0, final f9 f9) {
        return this.a(s, c0, f9, null);
    }
    
    private String a(final String p0, final c0 p1, final f9 p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: invokevirtual   com/google/c0.r:()Ljava/util/List;
        //     4: astore          5
        //     6: aload           5
        //     8: invokeinterface java/util/List.size:()I
        //    13: istore          8
        //    15: iload           8
        //    17: ifeq            27
        //    20: aload_3        
        //    21: getstatic       com/google/f9.NATIONAL:Lcom/google/f9;
        //    24: if_acmpne       63
        //    27: aload_2        
        //    28: invokevirtual   com/google/c0.x:()Ljava/util/List;
        //    31: astore          9
        //    33: aload           9
        //    35: astore          10
        //    37: aload_0        
        //    38: aload           10
        //    40: aload_1        
        //    41: invokevirtual   com/google/e6.a:(Ljava/util/List;Ljava/lang/String;)Lcom/google/fw;
        //    44: astore          11
        //    46: aload           11
        //    48: ifnonnull       72
        //    51: aload_1        
        //    52: areturn        
        //    53: astore          6
        //    55: aload           6
        //    57: athrow         
        //    58: astore          7
        //    60: aload           7
        //    62: athrow         
        //    63: aload_2        
        //    64: invokevirtual   com/google/c0.r:()Ljava/util/List;
        //    67: astore          10
        //    69: goto            37
        //    72: aload_0        
        //    73: aload_1        
        //    74: aload           11
        //    76: aload_3        
        //    77: aload           4
        //    79: invokespecial   com/google/e6.a:(Ljava/lang/String;Lcom/google/fw;Lcom/google/f9;Ljava/lang/String;)Ljava/lang/String;
        //    82: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  6      15     53     58     Ljava/lang/RuntimeException;
        //  20     27     58     63     Ljava/lang/RuntimeException;
        //  27     33     58     63     Ljava/lang/RuntimeException;
        //  55     58     58     63     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    private String a(final String p0, final fw p1, final f9 p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore          5
        //     5: aload_2        
        //     6: invokevirtual   com/google/fw.c:()Ljava/lang/String;
        //     9: astore          6
        //    11: aload_0        
        //    12: getfield        com/google/e6.d:Lcom/google/c6;
        //    15: aload_2        
        //    16: invokevirtual   com/google/fw.l:()Ljava/lang/String;
        //    19: invokevirtual   com/google/c6.a:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    22: aload_1        
        //    23: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    26: astore          7
        //    28: getstatic       com/google/f9.NATIONAL:Lcom/google/f9;
        //    31: astore          11
        //    33: aload_3        
        //    34: aload           11
        //    36: if_acmpne       116
        //    39: aload           4
        //    41: ifnull          116
        //    44: aload           4
        //    46: invokevirtual   java/lang/String.length:()I
        //    49: ifle            116
        //    52: aload_2        
        //    53: invokevirtual   com/google/fw.d:()Ljava/lang/String;
        //    56: invokevirtual   java/lang/String.length:()I
        //    59: istore          20
        //    61: iload           20
        //    63: ifle            116
        //    66: aload_2        
        //    67: invokevirtual   com/google/fw.d:()Ljava/lang/String;
        //    70: astore          21
        //    72: getstatic       com/google/e6.n:Ljava/util/regex/Pattern;
        //    75: aload           21
        //    77: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    80: aload           4
        //    82: invokevirtual   java/util/regex/Matcher.replaceFirst:(Ljava/lang/String;)Ljava/lang/String;
        //    85: astore          22
        //    87: getstatic       com/google/e6.B:Ljava/util/regex/Pattern;
        //    90: aload           6
        //    92: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    95: aload           22
        //    97: invokevirtual   java/util/regex/Matcher.replaceFirst:(Ljava/lang/String;)Ljava/lang/String;
        //   100: astore          6
        //   102: aload           7
        //   104: aload           6
        //   106: invokevirtual   java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
        //   109: astore          19
        //   111: iload           5
        //   113: ifeq            261
        //   116: aload_2        
        //   117: invokevirtual   com/google/fw.b:()Ljava/lang/String;
        //   120: astore          12
        //   122: getstatic       com/google/f9.NATIONAL:Lcom/google/f9;
        //   125: astore          15
        //   127: aload_3        
        //   128: aload           15
        //   130: if_acmpne       175
        //   133: aload           12
        //   135: ifnull          175
        //   138: aload           12
        //   140: invokevirtual   java/lang/String.length:()I
        //   143: istore          18
        //   145: iload           18
        //   147: ifle            175
        //   150: aload           7
        //   152: getstatic       com/google/e6.B:Ljava/util/regex/Pattern;
        //   155: aload           6
        //   157: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   160: aload           12
        //   162: invokevirtual   java/util/regex/Matcher.replaceFirst:(Ljava/lang/String;)Ljava/lang/String;
        //   165: invokevirtual   java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
        //   168: astore          19
        //   170: iload           5
        //   172: ifeq            261
        //   175: aload           7
        //   177: aload           6
        //   179: invokevirtual   java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
        //   182: astore          16
        //   184: aload_3        
        //   185: getstatic       com/google/f9.RFC3966:Lcom/google/f9;
        //   188: if_acmpne       233
        //   191: getstatic       com/google/e6.p:Ljava/util/regex/Pattern;
        //   194: aload           16
        //   196: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   199: astore          17
        //   201: aload           17
        //   203: invokevirtual   java/util/regex/Matcher.lookingAt:()Z
        //   206: ifeq            218
        //   209: aload           17
        //   211: ldc             ""
        //   213: invokevirtual   java/util/regex/Matcher.replaceFirst:(Ljava/lang/String;)Ljava/lang/String;
        //   216: astore          16
        //   218: aload           17
        //   220: aload           16
        //   222: invokevirtual   java/util/regex/Matcher.reset:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   225: ldc_w           "-"
        //   228: invokevirtual   java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
        //   231: astore          16
        //   233: aload           16
        //   235: areturn        
        //   236: astore          8
        //   238: aload           8
        //   240: athrow         
        //   241: astore          9
        //   243: aload           9
        //   245: athrow         
        //   246: astore          10
        //   248: aload           10
        //   250: athrow         
        //   251: astore          13
        //   253: aload           13
        //   255: athrow         
        //   256: astore          14
        //   258: aload           14
        //   260: athrow         
        //   261: aload           19
        //   263: astore          16
        //   265: goto            184
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  28     33     236    246    Ljava/lang/RuntimeException;
        //  44     61     246    251    Ljava/lang/RuntimeException;
        //  122    127    251    256    Ljava/lang/RuntimeException;
        //  138    145    256    261    Ljava/lang/RuntimeException;
        //  238    241    241    246    Ljava/lang/RuntimeException;
        //  243    246    246    251    Ljava/lang/RuntimeException;
        //  253    256    256    261    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 119, Size: 119
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
    
    private static String a(final String p0, final Map p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore_3       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: aload_0        
        //     9: invokevirtual   java/lang/String.length:()I
        //    12: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    15: astore          4
        //    17: iconst_0       
        //    18: istore          5
        //    20: iload           5
        //    22: aload_0        
        //    23: invokevirtual   java/lang/String.length:()I
        //    26: if_icmpge       95
        //    29: aload_0        
        //    30: iload           5
        //    32: invokevirtual   java/lang/String.charAt:(I)C
        //    35: istore          6
        //    37: aload_1        
        //    38: iload           6
        //    40: invokestatic    java/lang/Character.toUpperCase:(C)C
        //    43: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    46: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    51: checkcast       Ljava/lang/Character;
        //    54: astore          7
        //    56: aload           7
        //    58: ifnull          73
        //    61: aload           4
        //    63: aload           7
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    68: pop            
        //    69: iload_3        
        //    70: ifeq            85
        //    73: iload_2        
        //    74: ifne            85
        //    77: aload           4
        //    79: iload           6
        //    81: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    84: pop            
        //    85: iload           5
        //    87: iconst_1       
        //    88: iadd           
        //    89: istore          8
        //    91: iload_3        
        //    92: ifeq            111
        //    95: aload           4
        //    97: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   100: areturn        
        //   101: astore          11
        //   103: aload           11
        //   105: athrow         
        //   106: astore          9
        //   108: aload           9
        //   110: athrow         
        //   111: iload           8
        //   113: istore          5
        //   115: goto            20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  61     69     101    106    Ljava/lang/RuntimeException;
        //  77     85     106    111    Ljava/lang/RuntimeException;
        //  103    106    106    111    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0085:
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
    
    static StringBuilder a(final String s, final boolean b) {
        final int a = e6.a;
        final StringBuilder sb = new StringBuilder(s.length());
        final char[] charArray = s.toCharArray();
        final int length = charArray.length;
        int i = 0;
        while (i < length) {
            final char c = charArray[i];
            final int digit = Character.digit(c, 10);
            Label_0094: {
                Label_0070: {
                    if (digit == -1) {
                        break Label_0070;
                    }
                    try {
                        sb.append(digit);
                        if (a == 0) {
                            break Label_0094;
                        }
                        if (b) {
                            final StringBuilder sb2 = sb;
                            final char c2 = c;
                            sb2.append(c2);
                        }
                        break Label_0094;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                try {
                    final StringBuilder sb2 = sb;
                    final char c2 = c;
                    sb2.append(c2);
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return sb;
    }
    
    private void a(final int n, final f9 f9, final StringBuilder sb) {
        Label_0076: {
            try {
                switch (a_.b[f9.ordinal()]) {
                    case 1: {
                        sb.insert(0, n).insert(0, '+');
                        return;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        break Label_0076;
                    }
                    default: {
                        return;
                    }
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            sb.insert(0, " ").insert(0, n).insert(0, '+');
            return;
        }
        sb.insert(0, "-").insert(0, n).insert(0, '+').insert(0, e6.J[1]);
    }
    
    private void a(final c_ p0, final c0 p1, final f9 p2, final StringBuilder p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore          5
        //     5: aload_1        
        //     6: invokevirtual   com/google/c_.h:()Z
        //     9: istore          12
        //    11: iload           12
        //    13: ifeq            117
        //    16: aload_1        
        //    17: invokevirtual   com/google/c_.c:()Ljava/lang/String;
        //    20: invokevirtual   java/lang/String.length:()I
        //    23: istore          13
        //    25: iload           13
        //    27: ifle            117
        //    30: getstatic       com/google/f9.RFC3966:Lcom/google/f9;
        //    33: astore          14
        //    35: aload_3        
        //    36: aload           14
        //    38: if_acmpne       65
        //    41: aload           4
        //    43: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    46: bipush          45
        //    48: aaload         
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: aload_1        
        //    53: invokevirtual   com/google/c_.c:()Ljava/lang/String;
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: iload           5
        //    62: ifeq            117
        //    65: aload_2        
        //    66: invokevirtual   com/google/c0.I:()Z
        //    69: istore          15
        //    71: iload           15
        //    73: ifeq            98
        //    76: aload           4
        //    78: aload_2        
        //    79: invokevirtual   com/google/c0.X:()Ljava/lang/String;
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: aload_1        
        //    86: invokevirtual   com/google/c_.c:()Ljava/lang/String;
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: pop            
        //    93: iload           5
        //    95: ifeq            117
        //    98: aload           4
        //   100: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   103: bipush          46
        //   105: aaload         
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: aload_1        
        //   110: invokevirtual   com/google/c_.c:()Ljava/lang/String;
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: pop            
        //   117: return         
        //   118: astore          6
        //   120: aload           6
        //   122: athrow         
        //   123: astore          7
        //   125: aload           7
        //   127: athrow         
        //   128: astore          8
        //   130: aload           8
        //   132: athrow         
        //   133: astore          9
        //   135: aload           9
        //   137: athrow         
        //   138: astore          10
        //   140: aload           10
        //   142: athrow         
        //   143: astore          11
        //   145: aload           11
        //   147: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  5      11     118    123    Ljava/lang/RuntimeException;
        //  16     25     123    128    Ljava/lang/RuntimeException;
        //  30     35     128    133    Ljava/lang/RuntimeException;
        //  41     60     133    138    Ljava/lang/RuntimeException;
        //  65     71     138    143    Ljava/lang/RuntimeException;
        //  76     93     143    148    Ljava/lang/RuntimeException;
        //  98     117    143    148    Ljava/lang/RuntimeException;
        //  120    123    123    128    Ljava/lang/RuntimeException;
        //  125    128    128    133    Ljava/lang/RuntimeException;
        //  130    133    133    138    Ljava/lang/RuntimeException;
        //  135    138    138    143    Ljava/lang/RuntimeException;
        //  140    143    143    148    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 72, Size: 72
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
    
    private void a(final String p0, final String p1, final boolean p2, final boolean p3, final c_ p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore          6
        //     5: aload_1        
        //     6: ifnonnull       31
        //     9: new             Lcom/google/m;
        //    12: dup            
        //    13: getstatic       com/google/g2.NOT_A_NUMBER:Lcom/google/g2;
        //    16: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    19: bipush          6
        //    21: aaload         
        //    22: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //    25: athrow         
        //    26: astore          47
        //    28: aload           47
        //    30: athrow         
        //    31: aload_1        
        //    32: invokevirtual   java/lang/String.length:()I
        //    35: sipush          250
        //    38: if_icmple       63
        //    41: new             Lcom/google/m;
        //    44: dup            
        //    45: getstatic       com/google/g2.TOO_LONG:Lcom/google/g2;
        //    48: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    51: bipush          7
        //    53: aaload         
        //    54: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //    57: athrow         
        //    58: astore          7
        //    60: aload           7
        //    62: athrow         
        //    63: new             Ljava/lang/StringBuilder;
        //    66: dup            
        //    67: invokespecial   java/lang/StringBuilder.<init>:()V
        //    70: astore          8
        //    72: aload_0        
        //    73: aload_1        
        //    74: aload           8
        //    76: invokespecial   com/google/e6.a:(Ljava/lang/String;Ljava/lang/StringBuilder;)V
        //    79: aload           8
        //    81: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    84: invokestatic    com/google/e6.d:(Ljava/lang/String;)Z
        //    87: ifne            112
        //    90: new             Lcom/google/m;
        //    93: dup            
        //    94: getstatic       com/google/g2.NOT_A_NUMBER:Lcom/google/g2;
        //    97: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   100: bipush          8
        //   102: aaload         
        //   103: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //   106: athrow         
        //   107: astore          9
        //   109: aload           9
        //   111: athrow         
        //   112: iload           4
        //   114: ifeq            161
        //   117: aload_0        
        //   118: aload           8
        //   120: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   123: aload_2        
        //   124: invokespecial   com/google/e6.c:(Ljava/lang/String;Ljava/lang/String;)Z
        //   127: istore          46
        //   129: iload           46
        //   131: ifne            161
        //   134: new             Lcom/google/m;
        //   137: dup            
        //   138: getstatic       com/google/g2.INVALID_COUNTRY_CODE:Lcom/google/g2;
        //   141: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   144: bipush          9
        //   146: aaload         
        //   147: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //   150: athrow         
        //   151: astore          45
        //   153: aload           45
        //   155: athrow         
        //   156: astore          44
        //   158: aload           44
        //   160: athrow         
        //   161: iload_3        
        //   162: ifeq            172
        //   165: aload           5
        //   167: aload_1        
        //   168: invokevirtual   com/google/c_.a:(Ljava/lang/String;)Lcom/google/c_;
        //   171: pop            
        //   172: aload_0        
        //   173: aload           8
        //   175: invokevirtual   com/google/e6.b:(Ljava/lang/StringBuilder;)Ljava/lang/String;
        //   178: astore          10
        //   180: aload           10
        //   182: invokevirtual   java/lang/String.length:()I
        //   185: ifle            196
        //   188: aload           5
        //   190: aload           10
        //   192: invokevirtual   com/google/c_.c:(Ljava/lang/String;)Lcom/google/c_;
        //   195: pop            
        //   196: aload_0        
        //   197: aload_2        
        //   198: invokevirtual   com/google/e6.l:(Ljava/lang/String;)Lcom/google/c0;
        //   201: astore          12
        //   203: new             Ljava/lang/StringBuilder;
        //   206: dup            
        //   207: invokespecial   java/lang/StringBuilder.<init>:()V
        //   210: astore          13
        //   212: aload_0        
        //   213: aload           8
        //   215: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   218: aload           12
        //   220: aload           13
        //   222: iload_3        
        //   223: aload           5
        //   225: invokevirtual   com/google/e6.a:(Ljava/lang/String;Lcom/google/c0;Ljava/lang/StringBuilder;ZLcom/google/c_;)I
        //   228: istore          40
        //   230: iload           40
        //   232: istore          18
        //   234: iload           18
        //   236: ifeq            635
        //   239: aload_0        
        //   240: iload           18
        //   242: invokevirtual   com/google/e6.b:(I)Ljava/lang/String;
        //   245: astore          39
        //   247: aload           39
        //   249: aload_2        
        //   250: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   253: ifne            628
        //   256: aload_0        
        //   257: iload           18
        //   259: aload           39
        //   261: invokespecial   com/google/e6.a:(ILjava/lang/String;)Lcom/google/c0;
        //   264: astore          20
        //   266: iload           6
        //   268: ifeq            318
        //   271: aload           8
        //   273: invokestatic    com/google/e6.a:(Ljava/lang/StringBuilder;)V
        //   276: aload           13
        //   278: aload           8
        //   280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
        //   283: pop            
        //   284: aload_2        
        //   285: ifnull          308
        //   288: aload           20
        //   290: invokevirtual   com/google/c0.K:()I
        //   293: istore          36
        //   295: aload           5
        //   297: iload           36
        //   299: invokevirtual   com/google/c_.a:(I)Lcom/google/c_;
        //   302: pop            
        //   303: iload           6
        //   305: ifeq            318
        //   308: iload_3        
        //   309: ifeq            318
        //   312: aload           5
        //   314: invokevirtual   com/google/c_.m:()Lcom/google/c_;
        //   317: pop            
        //   318: aload           13
        //   320: invokevirtual   java/lang/StringBuilder.length:()I
        //   323: iconst_2       
        //   324: if_icmpge       483
        //   327: new             Lcom/google/m;
        //   330: dup            
        //   331: getstatic       com/google/g2.TOO_SHORT_NSN:Lcom/google/g2;
        //   334: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   337: iconst_2       
        //   338: aaload         
        //   339: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //   342: athrow         
        //   343: astore          23
        //   345: aload           23
        //   347: athrow         
        //   348: astore          42
        //   350: aload           42
        //   352: athrow         
        //   353: astore          11
        //   355: aload           11
        //   357: athrow         
        //   358: astore          14
        //   360: getstatic       com/google/e6.y:Ljava/util/regex/Pattern;
        //   363: aload           8
        //   365: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   368: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   371: astore          15
        //   373: aload           14
        //   375: invokevirtual   com/google/m.a:()Lcom/google/g2;
        //   378: getstatic       com/google/g2.INVALID_COUNTRY_CODE:Lcom/google/g2;
        //   381: if_acmpne       450
        //   384: aload           15
        //   386: invokevirtual   java/util/regex/Matcher.lookingAt:()Z
        //   389: istore          17
        //   391: iload           17
        //   393: ifeq            450
        //   396: aload_0        
        //   397: aload           8
        //   399: aload           15
        //   401: invokevirtual   java/util/regex/Matcher.end:()I
        //   404: invokevirtual   java/lang/StringBuilder.substring:(I)Ljava/lang/String;
        //   407: aload           12
        //   409: aload           13
        //   411: iload_3        
        //   412: aload           5
        //   414: invokevirtual   com/google/e6.a:(Ljava/lang/String;Lcom/google/c0;Ljava/lang/StringBuilder;ZLcom/google/c_;)I
        //   417: istore          18
        //   419: iload           18
        //   421: ifne            234
        //   424: new             Lcom/google/m;
        //   427: dup            
        //   428: getstatic       com/google/g2.INVALID_COUNTRY_CODE:Lcom/google/g2;
        //   431: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   434: iconst_4       
        //   435: aaload         
        //   436: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //   439: athrow         
        //   440: astore          19
        //   442: aload           19
        //   444: athrow         
        //   445: astore          16
        //   447: aload           16
        //   449: athrow         
        //   450: new             Lcom/google/m;
        //   453: dup            
        //   454: aload           14
        //   456: invokevirtual   com/google/m.a:()Lcom/google/g2;
        //   459: aload           14
        //   461: invokevirtual   com/google/m.getMessage:()Ljava/lang/String;
        //   464: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //   467: athrow         
        //   468: astore          21
        //   470: aload           21
        //   472: athrow         
        //   473: astore          37
        //   475: aload           37
        //   477: athrow         
        //   478: astore          34
        //   480: aload           34
        //   482: athrow         
        //   483: aload           20
        //   485: ifnull          523
        //   488: new             Ljava/lang/StringBuilder;
        //   491: dup            
        //   492: invokespecial   java/lang/StringBuilder.<init>:()V
        //   495: astore          24
        //   497: aload_0        
        //   498: aload           13
        //   500: aload           20
        //   502: aload           24
        //   504: invokevirtual   com/google/e6.a:(Ljava/lang/StringBuilder;Lcom/google/c0;Ljava/lang/StringBuilder;)Z
        //   507: pop            
        //   508: iload_3        
        //   509: ifeq            523
        //   512: aload           5
        //   514: aload           24
        //   516: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   519: invokevirtual   com/google/c_.b:(Ljava/lang/String;)Lcom/google/c_;
        //   522: pop            
        //   523: aload           13
        //   525: invokevirtual   java/lang/StringBuilder.length:()I
        //   528: istore          28
        //   530: iload           28
        //   532: iconst_2       
        //   533: if_icmpge       562
        //   536: new             Lcom/google/m;
        //   539: dup            
        //   540: getstatic       com/google/g2.TOO_SHORT_NSN:Lcom/google/g2;
        //   543: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   546: iconst_3       
        //   547: aaload         
        //   548: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //   551: athrow         
        //   552: astore          33
        //   554: aload           33
        //   556: athrow         
        //   557: astore          25
        //   559: aload           25
        //   561: athrow         
        //   562: iload           28
        //   564: bipush          16
        //   566: if_icmple       590
        //   569: new             Lcom/google/m;
        //   572: dup            
        //   573: getstatic       com/google/g2.TOO_LONG:Lcom/google/g2;
        //   576: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   579: iconst_5       
        //   580: aaload         
        //   581: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //   584: athrow         
        //   585: astore          32
        //   587: aload           32
        //   589: athrow         
        //   590: aload           13
        //   592: iconst_0       
        //   593: invokevirtual   java/lang/StringBuilder.charAt:(I)C
        //   596: bipush          48
        //   598: if_icmpne       608
        //   601: aload           5
        //   603: iconst_1       
        //   604: invokevirtual   com/google/c_.a:(Z)Lcom/google/c_;
        //   607: pop            
        //   608: aload           5
        //   610: aload           13
        //   612: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   615: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   618: invokevirtual   com/google/c_.a:(J)Lcom/google/c_;
        //   621: pop            
        //   622: return         
        //   623: astore          29
        //   625: aload           29
        //   627: athrow         
        //   628: aload           12
        //   630: astore          20
        //   632: goto            266
        //   635: aload           12
        //   637: astore          20
        //   639: goto            271
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type          
        //  -----  -----  -----  -----  --------------
        //  9      26     26     31     Lcom/google/m;
        //  31     58     58     63     Lcom/google/m;
        //  72     107    107    112    Lcom/google/m;
        //  117    129    156    161    Lcom/google/m;
        //  134    151    151    156    Lcom/google/m;
        //  158    161    151    156    Lcom/google/m;
        //  165    172    348    353    Lcom/google/m;
        //  180    196    353    358    Lcom/google/m;
        //  212    230    358    468    Lcom/google/m;
        //  271    284    468    473    Lcom/google/m;
        //  295    303    473    478    Lcom/google/m;
        //  312    318    478    483    Lcom/google/m;
        //  318    343    343    348    Lcom/google/m;
        //  373    391    445    450    Lcom/google/m;
        //  424    440    440    445    Lcom/google/m;
        //  475    478    478    483    Lcom/google/m;
        //  497    508    557    562    Lcom/google/m;
        //  512    523    557    562    Lcom/google/m;
        //  536    552    552    557    Lcom/google/m;
        //  569    585    585    590    Lcom/google/m;
        //  590    608    623    628    Lcom/google/m;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 310, Size: 310
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
    
    private void a(final String p0, final StringBuilder p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore_3       
        //     4: aload_1        
        //     5: getstatic       com/google/e6.J:[Ljava/lang/String;
        //     8: bipush          27
        //    10: aaload         
        //    11: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    14: istore          4
        //    16: iload           4
        //    18: ifle            124
        //    21: iload           4
        //    23: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    26: bipush          23
        //    28: aaload         
        //    29: invokevirtual   java/lang/String.length:()I
        //    32: iadd           
        //    33: istore          10
        //    35: aload_1        
        //    36: iload           10
        //    38: invokevirtual   java/lang/String.charAt:(I)C
        //    41: bipush          43
        //    43: if_icmpne       89
        //    46: aload_1        
        //    47: bipush          59
        //    49: iload           10
        //    51: invokevirtual   java/lang/String.indexOf:(II)I
        //    54: istore          12
        //    56: iload           12
        //    58: ifle            78
        //    61: aload_2        
        //    62: aload_1        
        //    63: iload           10
        //    65: iload           12
        //    67: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: pop            
        //    74: iload_3        
        //    75: ifeq            89
        //    78: aload_2        
        //    79: aload_1        
        //    80: iload           10
        //    82: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: pop            
        //    89: aload_2        
        //    90: aload_1        
        //    91: aload_1        
        //    92: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    95: bipush          25
        //    97: aaload         
        //    98: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   101: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   104: bipush          24
        //   106: aaload         
        //   107: invokevirtual   java/lang/String.length:()I
        //   110: iadd           
        //   111: iload           4
        //   113: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: pop            
        //   120: iload_3        
        //   121: ifeq            133
        //   124: aload_2        
        //   125: aload_1        
        //   126: invokestatic    com/google/e6.g:(Ljava/lang/String;)Ljava/lang/String;
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: pop            
        //   133: aload_2        
        //   134: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   137: bipush          26
        //   139: aaload         
        //   140: invokevirtual   java/lang/StringBuilder.indexOf:(Ljava/lang/String;)I
        //   143: istore          7
        //   145: iload           7
        //   147: ifle            161
        //   150: aload_2        
        //   151: iload           7
        //   153: aload_2        
        //   154: invokevirtual   java/lang/StringBuilder.length:()I
        //   157: invokevirtual   java/lang/StringBuilder.delete:(II)Ljava/lang/StringBuilder;
        //   160: pop            
        //   161: return         
        //   162: astore          13
        //   164: aload           13
        //   166: athrow         
        //   167: astore          5
        //   169: aload           5
        //   171: athrow         
        //   172: astore          8
        //   174: aload           8
        //   176: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  61     74     162    167    Ljava/lang/RuntimeException;
        //  78     89     162    167    Ljava/lang/RuntimeException;
        //  89     120    167    172    Ljava/lang/RuntimeException;
        //  124    133    167    172    Ljava/lang/RuntimeException;
        //  150    161    172    177    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 91, Size: 91
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
    
    static void a(final StringBuilder sb) {
        sb.replace(0, sb.length(), c(sb.toString()));
    }
    
    private boolean a(final int n) {
        return this.u.containsKey(n);
    }
    
    private boolean a(final c_ c_, final c_ c_2) {
        final String value = String.valueOf(c_.e());
        final String value2 = String.valueOf(c_2.e());
        try {
            if (value.endsWith(value2)) {
                return true;
            }
            final String s = value2;
            final String s2 = value;
            final boolean b = s.endsWith(s2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            final String s = value2;
            final String s2 = value;
            final boolean b = s.endsWith(s2);
            if (b) {
                return true;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return false;
    }
    
    private boolean a(final String s, final h2 h2) {
        final Matcher matcher = this.d.a(h2.e()).matcher(s);
        final Matcher matcher2 = this.d.a(h2.d()).matcher(s);
        try {
            if (!matcher.matches()) {
                return false;
            }
            final Matcher matcher3 = matcher2;
            final boolean b = matcher3.matches();
            if (b) {
                return true;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            final Matcher matcher3 = matcher2;
            final boolean b = matcher3.matches();
            if (b) {
                return true;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return false;
    }
    
    private boolean a(final Pattern pattern, final StringBuilder sb) {
        final Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        final int end = matcher.end();
        final Matcher matcher2 = e6.m.matcher(sb.substring(end));
        Label_0074: {
            if (!matcher2.find()) {
                break Label_0074;
            }
            final String k = k(matcher2.group(1));
            try {
                if (k.equals("0")) {
                    return false;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        sb.delete(0, end);
        return true;
    }
    
    private boolean b(final String s) {
        if (s != null) {
            try {
                if (this.l.contains(s)) {
                    return true;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    static String c(final String s) {
        final Matcher matcher = e6.b.matcher(s);
        try {
            if (matcher.matches()) {
                return a(s, e6.r, true);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return k(s);
    }
    
    private boolean c(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_2        
        //     2: invokespecial   com/google/e6.b:(Ljava/lang/String;)Z
        //     5: istore          7
        //     7: iload           7
        //     9: ifne            64
        //    12: aload_1        
        //    13: ifnull          44
        //    16: aload_1        
        //    17: invokevirtual   java/lang/String.length:()I
        //    20: istore          8
        //    22: iload           8
        //    24: ifeq            44
        //    27: getstatic       com/google/e6.y:Ljava/util/regex/Pattern;
        //    30: aload_1        
        //    31: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    34: invokevirtual   java/util/regex/Matcher.lookingAt:()Z
        //    37: istore          9
        //    39: iload           9
        //    41: ifne            64
        //    44: iconst_0       
        //    45: ireturn        
        //    46: astore_3       
        //    47: aload_3        
        //    48: athrow         
        //    49: astore          4
        //    51: aload           4
        //    53: athrow         
        //    54: astore          5
        //    56: aload           5
        //    58: athrow         
        //    59: astore          6
        //    61: aload           6
        //    63: athrow         
        //    64: iconst_1       
        //    65: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      7      46     54     Ljava/lang/RuntimeException;
        //  16     22     54     59     Ljava/lang/RuntimeException;
        //  27     39     59     64     Ljava/lang/RuntimeException;
        //  47     49     49     54     Ljava/lang/RuntimeException;
        //  51     54     54     59     Ljava/lang/RuntimeException;
        //  56     59     59     64     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 36, Size: 36
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
    
    static boolean d(final String s) {
        try {
            if (s.length() < 2) {
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return e6.C.matcher(s).matches();
    }
    
    static boolean e(final String s) {
        return e6.q.matcher(s).matches();
    }
    
    private static String f(final String s) {
        return e6.J[21] + s + e6.J[19] + e6.J[20] + e6.J[22] + e6.J[18] + e6.J[15] + e6.J[17] + e6.J[16];
    }
    
    static String g(final String s) {
        final Matcher matcher = e6.o.matcher(s);
        if (matcher.find()) {
            String s2 = s.substring(matcher.start());
            final Matcher matcher2 = e6.k.matcher(s2);
            if (matcher2.find()) {
                s2 = s2.substring(0, matcher2.start());
                e6.w.log(Level.FINER, e6.J[38] + s2);
            }
            final Matcher matcher3 = e6.h.matcher(s2);
            if (matcher3.find()) {
                s2 = s2.substring(0, matcher3.start());
            }
            return s2;
        }
        return "";
    }
    
    private void h(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        com/google/e6.f:Ljava/lang/String;
        //     9: aload_0        
        //    10: getfield        com/google/e6.u:Ljava/util/Map;
        //    13: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    18: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    23: astore_3       
        //    24: aload_3        
        //    25: invokeinterface java/util/Iterator.hasNext:()Z
        //    30: ifeq            132
        //    33: aload_3        
        //    34: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    39: checkcast       Ljava/util/Map$Entry;
        //    42: astore          6
        //    44: aload           6
        //    46: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    51: checkcast       Ljava/util/List;
        //    54: astore          7
        //    56: aload           7
        //    58: invokeinterface java/util/List.size:()I
        //    63: istore          11
        //    65: iload           11
        //    67: iconst_1       
        //    68: if_icmpne       116
        //    71: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    74: bipush          30
        //    76: aaload         
        //    77: aload           7
        //    79: iconst_0       
        //    80: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    85: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    88: istore          13
        //    90: iload           13
        //    92: ifeq            116
        //    95: aload_0        
        //    96: getfield        com/google/e6.t:Ljava/util/Set;
        //    99: aload           6
        //   101: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   106: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   111: pop            
        //   112: iload_2        
        //   113: ifeq            128
        //   116: aload_0        
        //   117: getfield        com/google/e6.l:Ljava/util/Set;
        //   120: aload           7
        //   122: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
        //   127: pop            
        //   128: iload_2        
        //   129: ifeq            24
        //   132: aload_0        
        //   133: getfield        com/google/e6.l:Ljava/util/Set;
        //   136: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   139: bipush          31
        //   141: aaload         
        //   142: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   147: ifeq            165
        //   150: getstatic       com/google/e6.w:Ljava/util/logging/Logger;
        //   153: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
        //   156: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   159: bipush          32
        //   161: aaload         
        //   162: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;)V
        //   165: aload_0        
        //   166: getfield        com/google/e6.D:Ljava/util/Set;
        //   169: aload_0        
        //   170: getfield        com/google/e6.u:Ljava/util/Map;
        //   173: iconst_1       
        //   174: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   177: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   182: checkcast       Ljava/util/Collection;
        //   185: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
        //   190: pop            
        //   191: return         
        //   192: astore          8
        //   194: aload           8
        //   196: athrow         
        //   197: astore          9
        //   199: aload           9
        //   201: athrow         
        //   202: astore          10
        //   204: aload           10
        //   206: athrow         
        //   207: astore          4
        //   209: aload           4
        //   211: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  56     65     192    197    Ljava/lang/RuntimeException;
        //  71     90     197    202    Ljava/lang/RuntimeException;
        //  95     112    202    207    Ljava/lang/RuntimeException;
        //  116    128    202    207    Ljava/lang/RuntimeException;
        //  132    165    207    212    Ljava/lang/RuntimeException;
        //  194    197    197    202    Ljava/lang/RuntimeException;
        //  199    202    202    207    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 88, Size: 88
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
    
    private int j(final String s) {
        final c0 l = this.l(s);
        if (l == null) {
            try {
                throw new IllegalArgumentException(e6.J[37] + s);
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        return l.K();
    }
    
    public static String k(final String s) {
        return a(s, false).toString();
    }
    
    private static String z(final char[] array) {
        for (int i = array.length, n = 0; i > n; ++n) {
            final char c = array[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0015';
                    break;
                }
                case 0: {
                    c2 = 'J';
                    break;
                }
                case 1: {
                    c2 = '\b';
                    break;
                }
                case 2: {
                    c2 = 's';
                    break;
                }
                case 3: {
                    c2 = '\u000f';
                    break;
                }
            }
            array[n] = (char)(c2 ^ c);
        }
        return new String(array).intern();
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length < 2) {
            charArray[0] ^= '\u0015';
        }
        return charArray;
    }
    
    public int a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   com/google/e6.b:(Ljava/lang/String;)Z
        //     5: istore          4
        //     7: iload           4
        //     9: ifne            84
        //    12: getstatic       com/google/e6.w:Ljava/util/logging/Logger;
        //    15: astore          5
        //    17: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
        //    20: astore          6
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    32: bipush          39
        //    34: aaload         
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: astore          7
        //    40: aload_1        
        //    41: ifnonnull       51
        //    44: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    47: bipush          40
        //    49: aaload         
        //    50: astore_1       
        //    51: aload           5
        //    53: aload           6
        //    55: aload           7
        //    57: aload_1        
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    64: bipush          41
        //    66: aaload         
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    73: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;)V
        //    76: iconst_0       
        //    77: ireturn        
        //    78: astore_2       
        //    79: aload_2        
        //    80: athrow         
        //    81: astore_3       
        //    82: aload_3        
        //    83: athrow         
        //    84: aload_0        
        //    85: aload_1        
        //    86: invokespecial   com/google/e6.j:(Ljava/lang/String;)I
        //    89: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      7      78     81     Ljava/lang/RuntimeException;
        //  12     40     81     84     Ljava/lang/RuntimeException;
        //  44     51     81     84     Ljava/lang/RuntimeException;
        //  79     81     81     84     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    int a(final String p0, final c0 p1, final StringBuilder p2, final boolean p3, final c_ p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/String.length:()I
        //     4: istore          7
        //     6: iload           7
        //     8: ifne            18
        //    11: iconst_0       
        //    12: ireturn        
        //    13: astore          6
        //    15: aload           6
        //    17: athrow         
        //    18: new             Ljava/lang/StringBuilder;
        //    21: dup            
        //    22: aload_1        
        //    23: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    26: astore          8
        //    28: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    31: bipush          13
        //    33: aaload         
        //    34: astore          9
        //    36: aload_2        
        //    37: ifnull          46
        //    40: aload_2        
        //    41: invokevirtual   com/google/c0.q:()Ljava/lang/String;
        //    44: astore          9
        //    46: aload_0        
        //    47: aload           8
        //    49: aload           9
        //    51: invokevirtual   com/google/e6.a:(Ljava/lang/StringBuilder;Ljava/lang/String;)Lcom/google/b6;
        //    54: astore          10
        //    56: iload           4
        //    58: ifeq            69
        //    61: aload           5
        //    63: aload           10
        //    65: invokevirtual   com/google/c_.a:(Lcom/google/b6;)Lcom/google/c_;
        //    68: pop            
        //    69: getstatic       com/google/b6.FROM_DEFAULT_COUNTRY:Lcom/google/b6;
        //    72: astore          13
        //    74: aload           10
        //    76: aload           13
        //    78: if_acmpeq       169
        //    81: aload           8
        //    83: invokevirtual   java/lang/StringBuilder.length:()I
        //    86: iconst_2       
        //    87: if_icmpgt       122
        //    90: new             Lcom/google/m;
        //    93: dup            
        //    94: getstatic       com/google/g2.TOO_SHORT_AFTER_IDD:Lcom/google/g2;
        //    97: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   100: bipush          12
        //   102: aaload         
        //   103: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //   106: athrow         
        //   107: astore          12
        //   109: aload           12
        //   111: athrow         
        //   112: astore          37
        //   114: aload           37
        //   116: athrow         
        //   117: astore          11
        //   119: aload           11
        //   121: athrow         
        //   122: aload_0        
        //   123: aload           8
        //   125: aload_3        
        //   126: invokevirtual   com/google/e6.a:(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)I
        //   129: istore          34
        //   131: iload           34
        //   133: ifeq            152
        //   136: aload           5
        //   138: iload           34
        //   140: invokevirtual   com/google/c_.a:(I)Lcom/google/c_;
        //   143: pop            
        //   144: iload           34
        //   146: ireturn        
        //   147: astore          35
        //   149: aload           35
        //   151: athrow         
        //   152: new             Lcom/google/m;
        //   155: dup            
        //   156: getstatic       com/google/g2.INVALID_COUNTRY_CODE:Lcom/google/g2;
        //   159: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   162: bipush          14
        //   164: aaload         
        //   165: invokespecial   com/google/m.<init>:(Lcom/google/g2;Ljava/lang/String;)V
        //   168: athrow         
        //   169: aload_2        
        //   170: ifnull          376
        //   173: aload_2        
        //   174: invokevirtual   com/google/c0.K:()I
        //   177: istore          15
        //   179: iload           15
        //   181: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   184: astore          16
        //   186: aload           8
        //   188: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   191: astore          17
        //   193: aload           17
        //   195: aload           16
        //   197: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   200: ifeq            376
        //   203: new             Ljava/lang/StringBuilder;
        //   206: dup            
        //   207: aload           17
        //   209: aload           16
        //   211: invokevirtual   java/lang/String.length:()I
        //   214: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   217: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   220: astore          18
        //   222: aload_2        
        //   223: invokevirtual   com/google/c0.ac:()Lcom/google/h2;
        //   226: astore          19
        //   228: aload_0        
        //   229: getfield        com/google/e6.d:Lcom/google/c6;
        //   232: aload           19
        //   234: invokevirtual   com/google/h2.d:()Ljava/lang/String;
        //   237: invokevirtual   com/google/c6.a:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   240: astore          20
        //   242: aload_0        
        //   243: aload           18
        //   245: aload_2        
        //   246: aconst_null    
        //   247: invokevirtual   com/google/e6.a:(Ljava/lang/StringBuilder;Lcom/google/c0;Ljava/lang/StringBuilder;)Z
        //   250: pop            
        //   251: aload_0        
        //   252: getfield        com/google/e6.d:Lcom/google/c6;
        //   255: aload           19
        //   257: invokevirtual   com/google/h2.e:()Ljava/lang/String;
        //   260: invokevirtual   com/google/c6.a:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   263: astore          22
        //   265: aload           20
        //   267: aload           8
        //   269: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   272: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   275: istore          27
        //   277: iload           27
        //   279: ifne            299
        //   282: aload           20
        //   284: aload           18
        //   286: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   289: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   292: istore          33
        //   294: iload           33
        //   296: ifne            324
        //   299: aload_0        
        //   300: aload           22
        //   302: aload           8
        //   304: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   307: invokespecial   com/google/e6.a:(Ljava/util/regex/Pattern;Ljava/lang/String;)Lcom/google/h0;
        //   310: astore          28
        //   312: getstatic       com/google/h0.TOO_LONG:Lcom/google/h0;
        //   315: astore          29
        //   317: aload           28
        //   319: aload           29
        //   321: if_acmpne       376
        //   324: aload_3        
        //   325: aload           18
        //   327: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
        //   330: pop            
        //   331: iload           4
        //   333: ifeq            345
        //   336: aload           5
        //   338: getstatic       com/google/b6.FROM_NUMBER_WITHOUT_PLUS_SIGN:Lcom/google/b6;
        //   341: invokevirtual   com/google/c_.a:(Lcom/google/b6;)Lcom/google/c_;
        //   344: pop            
        //   345: aload           5
        //   347: iload           15
        //   349: invokevirtual   com/google/c_.a:(I)Lcom/google/c_;
        //   352: pop            
        //   353: iload           15
        //   355: ireturn        
        //   356: astore          23
        //   358: aload           23
        //   360: athrow         
        //   361: astore          24
        //   363: aload           24
        //   365: athrow         
        //   366: astore          25
        //   368: aload           25
        //   370: athrow         
        //   371: astore          26
        //   373: aload           26
        //   375: athrow         
        //   376: aload           5
        //   378: iconst_0       
        //   379: invokevirtual   com/google/c_.a:(I)Lcom/google/c_;
        //   382: pop            
        //   383: iconst_0       
        //   384: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      6      13     18     Ljava/lang/RuntimeException;
        //  61     69     112    117    Ljava/lang/RuntimeException;
        //  69     74     117    122    Ljava/lang/RuntimeException;
        //  81     107    107    112    Ljava/lang/RuntimeException;
        //  119    122    107    112    Ljava/lang/RuntimeException;
        //  136    144    147    152    Ljava/lang/RuntimeException;
        //  265    277    356    361    Ljava/lang/RuntimeException;
        //  282    294    361    366    Ljava/lang/RuntimeException;
        //  299    317    366    371    Ljava/lang/RuntimeException;
        //  324    331    371    376    Ljava/lang/RuntimeException;
        //  336    345    371    376    Ljava/lang/RuntimeException;
        //  358    361    361    366    Ljava/lang/RuntimeException;
        //  363    366    366    371    Ljava/lang/RuntimeException;
        //  368    371    371    376    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 188, Size: 188
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
    
    int a(final StringBuilder sb, final StringBuilder sb2) {
        final int a = e6.a;
        Label_0038: {
            try {
                if (sb.length() == 0) {
                    return 0;
                }
                final StringBuilder sb3 = sb;
                final int n = 0;
                final char c = sb3.charAt(n);
                final char c2 = '0';
                if (c == c2) {
                    return 0;
                }
                break Label_0038;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final StringBuilder sb3 = sb;
                final int n = 0;
                final char c = sb3.charAt(n);
                final char c2 = '0';
                if (c == c2) {
                    return 0;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        int n3;
        for (int length = sb.length(), n2 = 1; n2 <= 3 && n2 <= length; n2 = n3) {
            final int int1 = Integer.parseInt(sb.substring(0, n2));
            try {
                if (this.u.containsKey(int1)) {
                    sb2.append(sb.substring(n2));
                    return int1;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            n3 = n2 + 1;
            if (a != 0) {
                break;
            }
        }
        return 0;
    }
    
    b6 a(final StringBuilder sb, final String s) {
        try {
            if (sb.length() == 0) {
                return b6.FROM_DEFAULT_COUNTRY;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final Matcher matcher = e6.y.matcher(sb);
        try {
            if (matcher.lookingAt()) {
                sb.delete(0, matcher.end());
                a(sb);
                return b6.FROM_NUMBER_WITH_PLUS_SIGN;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        final Pattern a = this.d.a(s);
        try {
            a(sb);
            if (this.a(a, sb)) {
                return b6.FROM_NUMBER_WITH_IDD;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return b6.FROM_DEFAULT_COUNTRY;
    }
    
    public c_ a(final String s, final String s2) {
        final c_ c_ = new c_();
        this.b(s, s2, c_);
        return c_;
    }
    
    fw a(final List list, final String s) {
        final int a = e6.a;
        for (final fw fw : list) {
            final int g = fw.g();
            Label_0119: {
                Matcher matcher = null;
                Label_0076: {
                    if (g == 0) {
                        break Label_0076;
                    }
                    try {
                        if (!this.d.a(fw.a(g - 1)).matcher(s).lookingAt()) {
                            break Label_0119;
                        }
                        final Matcher matcher2;
                        matcher = (matcher2 = this.d.a(fw.l()).matcher(s));
                        final boolean matches = matcher2.matches();
                        final boolean matches2 = matches;
                        if (matches2) {
                            return fw;
                        }
                        break Label_0119;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                try {
                    final Matcher matcher2 = matcher;
                    final boolean matches2;
                    final boolean matches = matches2 = matcher2.matches();
                    if (matches2) {
                        return fw;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            if (a != 0) {
                break;
            }
        }
        return null;
    }
    
    public u a(final c_ c_, final String s) {
        try {
            return this.b(c_, this.b(s, e6.J[49]));
        }
        catch (m m) {
            if (m.a() == g2.INVALID_COUNTRY_CODE) {
                final String b = this.b(c_.n());
                try {
                    if (b.equals(e6.J[48])) {
                        final c_ c_2 = new c_();
                        this.a(s, null, false, false, c_2);
                        return this.b(c_, c_2);
                    }
                    final u u = this.b(c_, this.b(s, b));
                    if (u == com.google.u.EXACT_MATCH) {
                        return com.google.u.NSN_MATCH;
                    }
                    return u;
                }
                catch (m i) {}
            }
            return com.google.u.NOT_A_NUMBER;
        }
    }
    
    public String a(final c_ c_) {
        while (true) {
            while (true) {
                try {
                    if (c_.d()) {
                        final String s = "0";
                        final StringBuilder sb = new StringBuilder(s);
                        sb.append(c_.e());
                        return sb.toString();
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                final String s = "";
                continue;
            }
        }
    }
    
    public String a(final c_ c_, final f9 f9) {
        Label_0049: {
            String s;
            try {
                if (c_.e() != 0L || !c_.f()) {
                    break Label_0049;
                }
                final String u;
                s = (u = c_.u());
                final int length = u.length();
                final int length2 = length;
                if (length2 > 0) {
                    return s;
                }
                break Label_0049;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final String u = s;
                final int length2;
                final int length = length2 = u.length();
                if (length2 > 0) {
                    return s;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final StringBuilder sb = new StringBuilder(20);
        this.a(c_, f9, sb);
        return sb.toString();
    }
    
    String a(final String s, final fw fw, final f9 f9) {
        return this.a(s, fw, f9, null);
    }
    
    public void a(final c_ c_, final f9 f9, final StringBuilder sb) {
        sb.setLength(0);
        final int n = c_.n();
        final String a = this.a(c_);
        try {
            if (f9 == f9.E164) {
                sb.append(a);
                this.a(n, f9.E164, sb);
                return;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            if (!this.a(n)) {
                sb.append(a);
                return;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        final c0 a2 = this.a(n, this.b(n));
        sb.append(this.a(a, a2, f9));
        this.a(c_, a2, f9, sb);
        this.a(n, f9, sb);
    }
    
    void a(final String p0, final String p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: getstatic       com/google/e6.J:[Ljava/lang/String;
        //     8: bipush          33
        //    10: aaload         
        //    11: aload_2        
        //    12: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    15: istore          5
        //    17: aload_2        
        //    18: invokestatic    com/whatsapp/vi.a:(Ljava/lang/String;)Lcom/whatsapp/a2d;
        //    21: astore          7
        //    23: aload           7
        //    25: ifnonnull       97
        //    28: new             Ljava/lang/RuntimeException;
        //    31: dup            
        //    32: new             Ljava/lang/StringBuilder;
        //    35: dup            
        //    36: invokespecial   java/lang/StringBuilder.<init>:()V
        //    39: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    42: bipush          35
        //    44: aaload         
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: aload_2        
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    55: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    58: athrow         
        //    59: astore          31
        //    61: aload           31
        //    63: athrow         
        //    64: astore          6
        //    66: new             Ljava/lang/RuntimeException;
        //    69: dup            
        //    70: new             Ljava/lang/StringBuilder;
        //    73: dup            
        //    74: invokespecial   java/lang/StringBuilder.<init>:()V
        //    77: getstatic       com/google/e6.J:[Ljava/lang/String;
        //    80: bipush          34
        //    82: aaload         
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: aload_2        
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    93: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    96: athrow         
        //    97: new             Lcom/google/c0;
        //   100: dup            
        //   101: invokespecial   com/google/c0.<init>:()V
        //   104: astore          8
        //   106: aload           8
        //   108: aload           7
        //   110: getfield        com/whatsapp/a2d.l:Ljava/lang/String;
        //   113: invokevirtual   com/google/c0.h:(Ljava/lang/String;)Lcom/google/c0;
        //   116: pop            
        //   117: aload           8
        //   119: aload           7
        //   121: getfield        com/whatsapp/a2d.j:I
        //   124: invokevirtual   com/google/c0.c:(I)Lcom/google/c0;
        //   127: pop            
        //   128: aload           8
        //   130: aload           7
        //   132: getfield        com/whatsapp/a2d.a:Ljava/lang/String;
        //   135: invokevirtual   com/google/c0.e:(Ljava/lang/String;)Lcom/google/c0;
        //   138: pop            
        //   139: aload           7
        //   141: getfield        com/whatsapp/a2d.i:[Ljava/lang/String;
        //   144: ifnull          334
        //   147: iconst_0       
        //   148: istore          15
        //   150: iload           15
        //   152: aload           7
        //   154: getfield        com/whatsapp/a2d.i:[Ljava/lang/String;
        //   157: arraylength    
        //   158: if_icmpge       334
        //   161: new             Lcom/google/fw;
        //   164: dup            
        //   165: invokespecial   com/google/fw.<init>:()V
        //   168: astore          16
        //   170: aload           16
        //   172: aload           7
        //   174: getfield        com/whatsapp/a2d.i:[Ljava/lang/String;
        //   177: iload           15
        //   179: aaload         
        //   180: invokevirtual   com/google/fw.e:(Ljava/lang/String;)Lcom/google/fw;
        //   183: pop            
        //   184: aload           16
        //   186: aload           7
        //   188: getfield        com/whatsapp/a2d.d:[Ljava/lang/String;
        //   191: iload           15
        //   193: aaload         
        //   194: invokevirtual   com/google/fw.c:(Ljava/lang/String;)Lcom/google/fw;
        //   197: pop            
        //   198: aload           7
        //   200: getfield        com/whatsapp/a2d.h:[Ljava/lang/String;
        //   203: astore          22
        //   205: aload           22
        //   207: ifnull          310
        //   210: aload           7
        //   212: getfield        com/whatsapp/a2d.h:[Ljava/lang/String;
        //   215: arraylength    
        //   216: istore          25
        //   218: iload           15
        //   220: iload           25
        //   222: if_icmpge       310
        //   225: aload           7
        //   227: getfield        com/whatsapp/a2d.h:[Ljava/lang/String;
        //   230: iload           15
        //   232: aaload         
        //   233: ifnull          310
        //   236: aload           7
        //   238: getfield        com/whatsapp/a2d.h:[Ljava/lang/String;
        //   241: iload           15
        //   243: aaload         
        //   244: getstatic       com/google/e6.J:[Ljava/lang/String;
        //   247: bipush          36
        //   249: aaload         
        //   250: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   253: istore          26
        //   255: iload           26
        //   257: ifne            310
        //   260: aload           7
        //   262: getfield        com/whatsapp/a2d.h:[Ljava/lang/String;
        //   265: iload           15
        //   267: aaload         
        //   268: ldc_w           "#"
        //   271: invokestatic    android/text/TextUtils.split:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //   274: astore          27
        //   276: aload           27
        //   278: arraylength    
        //   279: istore          28
        //   281: iconst_0       
        //   282: istore          29
        //   284: iload           29
        //   286: iload           28
        //   288: if_icmpge       310
        //   291: aload           16
        //   293: aload           27
        //   295: iload           29
        //   297: aaload         
        //   298: invokevirtual   com/google/fw.b:(Ljava/lang/String;)Lcom/google/fw;
        //   301: pop            
        //   302: iinc            29, 1
        //   305: iload           4
        //   307: ifeq            284
        //   310: aload           8
        //   312: aload           16
        //   314: invokevirtual   com/google/c0.a:(Lcom/google/fw;)Lcom/google/c0;
        //   317: pop            
        //   318: aload           8
        //   320: aload           16
        //   322: invokevirtual   com/google/c0.b:(Lcom/google/fw;)Lcom/google/c0;
        //   325: pop            
        //   326: iinc            15, 1
        //   329: iload           4
        //   331: ifeq            150
        //   334: iload           5
        //   336: ifeq            360
        //   339: aload_0        
        //   340: getfield        com/google/e6.H:Ljava/util/Map;
        //   343: iload_3        
        //   344: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   347: aload           8
        //   349: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   354: pop            
        //   355: iload           4
        //   357: ifeq            373
        //   360: aload_0        
        //   361: getfield        com/google/e6.s:Ljava/util/Map;
        //   364: aload_2        
        //   365: aload           8
        //   367: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   372: pop            
        //   373: return         
        //   374: astore          17
        //   376: aload           17
        //   378: athrow         
        //   379: astore          18
        //   381: aload           18
        //   383: athrow         
        //   384: astore          19
        //   386: aload           19
        //   388: athrow         
        //   389: astore          12
        //   391: aload           12
        //   393: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     23     64     97     Ljava/io/IOException;
        //  28     59     59     64     Ljava/io/IOException;
        //  170    205    374    379    Ljava/io/IOException;
        //  210    218    379    384    Ljava/io/IOException;
        //  225    255    384    389    Ljava/io/IOException;
        //  339    355    389    394    Ljava/io/IOException;
        //  360    373    389    394    Ljava/io/IOException;
        //  376    379    379    384    Ljava/io/IOException;
        //  381    384    384    389    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 185, Size: 185
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
    
    public void a(final String s, final String s2, final c_ c_) {
        this.a(s, s2, false, true, c_);
    }
    
    boolean a(final StringBuilder p0, final c0 p1, final StringBuilder p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/StringBuilder.length:()I
        //     4: istore          4
        //     6: aload_2        
        //     7: invokevirtual   com/google/c0.i:()Ljava/lang/String;
        //    10: astore          5
        //    12: iload           4
        //    14: ifeq            29
        //    17: aload           5
        //    19: invokevirtual   java/lang/String.length:()I
        //    22: istore          7
        //    24: iload           7
        //    26: ifne            36
        //    29: iconst_0       
        //    30: ireturn        
        //    31: astore          6
        //    33: aload           6
        //    35: athrow         
        //    36: aload_0        
        //    37: getfield        com/google/e6.d:Lcom/google/c6;
        //    40: aload           5
        //    42: invokevirtual   com/google/c6.a:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    45: aload_1        
        //    46: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    49: astore          8
        //    51: aload           8
        //    53: invokevirtual   java/util/regex/Matcher.lookingAt:()Z
        //    56: ifeq            29
        //    59: aload_0        
        //    60: getfield        com/google/e6.d:Lcom/google/c6;
        //    63: aload_2        
        //    64: invokevirtual   com/google/c0.ac:()Lcom/google/h2;
        //    67: invokevirtual   com/google/h2.d:()Ljava/lang/String;
        //    70: invokevirtual   com/google/c6.a:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    73: astore          9
        //    75: aload           9
        //    77: aload_1        
        //    78: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    81: invokevirtual   java/util/regex/Matcher.matches:()Z
        //    84: istore          10
        //    86: aload           8
        //    88: invokevirtual   java/util/regex/Matcher.groupCount:()I
        //    91: istore          11
        //    93: aload_2        
        //    94: invokevirtual   com/google/c0.V:()Ljava/lang/String;
        //    97: astore          12
        //    99: aload           12
        //   101: ifnull          130
        //   104: aload           12
        //   106: invokevirtual   java/lang/String.length:()I
        //   109: istore          21
        //   111: iload           21
        //   113: ifeq            130
        //   116: aload           8
        //   118: iload           11
        //   120: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   123: astore          22
        //   125: aload           22
        //   127: ifnonnull       227
        //   130: iload           10
        //   132: ifeq            159
        //   135: aload           9
        //   137: aload_1        
        //   138: aload           8
        //   140: invokevirtual   java/util/regex/Matcher.end:()I
        //   143: invokevirtual   java/lang/StringBuilder.substring:(I)Ljava/lang/String;
        //   146: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   149: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   152: istore          17
        //   154: iload           17
        //   156: ifeq            29
        //   159: aload_3        
        //   160: ifnull          189
        //   163: iload           11
        //   165: ifle            189
        //   168: aload           8
        //   170: iload           11
        //   172: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   175: ifnull          189
        //   178: aload_3        
        //   179: aload           8
        //   181: iconst_1       
        //   182: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: pop            
        //   189: aload_1        
        //   190: iconst_0       
        //   191: aload           8
        //   193: invokevirtual   java/util/regex/Matcher.end:()I
        //   196: invokevirtual   java/lang/StringBuilder.delete:(II)Ljava/lang/StringBuilder;
        //   199: pop            
        //   200: iconst_1       
        //   201: ireturn        
        //   202: astore          18
        //   204: aload           18
        //   206: athrow         
        //   207: astore          19
        //   209: aload           19
        //   211: athrow         
        //   212: astore          20
        //   214: aload           20
        //   216: athrow         
        //   217: astore          16
        //   219: aload           16
        //   221: athrow         
        //   222: astore          14
        //   224: aload           14
        //   226: athrow         
        //   227: new             Ljava/lang/StringBuilder;
        //   230: dup            
        //   231: aload_1        
        //   232: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/CharSequence;)V
        //   235: astore          23
        //   237: aload           23
        //   239: iconst_0       
        //   240: iload           4
        //   242: aload           8
        //   244: aload           12
        //   246: invokevirtual   java/util/regex/Matcher.replaceFirst:(Ljava/lang/String;)Ljava/lang/String;
        //   249: invokevirtual   java/lang/StringBuilder.replace:(IILjava/lang/String;)Ljava/lang/StringBuilder;
        //   252: pop            
        //   253: iload           10
        //   255: ifeq            278
        //   258: aload           9
        //   260: aload           23
        //   262: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   265: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   268: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   271: istore          30
        //   273: iload           30
        //   275: ifeq            29
        //   278: aload_3        
        //   279: ifnull          299
        //   282: iload           11
        //   284: iconst_1       
        //   285: if_icmple       299
        //   288: aload_3        
        //   289: aload           8
        //   291: iconst_1       
        //   292: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: pop            
        //   299: aload_1        
        //   300: iconst_0       
        //   301: aload_1        
        //   302: invokevirtual   java/lang/StringBuilder.length:()I
        //   305: aload           23
        //   307: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   310: invokevirtual   java/lang/StringBuilder.replace:(IILjava/lang/String;)Ljava/lang/StringBuilder;
        //   313: pop            
        //   314: iconst_1       
        //   315: ireturn        
        //   316: astore          24
        //   318: aload           24
        //   320: athrow         
        //   321: astore          25
        //   323: aload           25
        //   325: athrow         
        //   326: astore          28
        //   328: aload           28
        //   330: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  17     24     31     36     Ljava/lang/RuntimeException;
        //  104    111    202    207    Ljava/lang/RuntimeException;
        //  116    125    207    217    Ljava/lang/RuntimeException;
        //  135    154    217    222    Ljava/lang/RuntimeException;
        //  168    189    222    227    Ljava/lang/RuntimeException;
        //  204    207    207    217    Ljava/lang/RuntimeException;
        //  209    212    212    217    Ljava/lang/RuntimeException;
        //  214    217    217    222    Ljava/lang/RuntimeException;
        //  237    253    316    321    Ljava/lang/RuntimeException;
        //  258    273    321    326    Ljava/lang/RuntimeException;
        //  288    299    326    331    Ljava/lang/RuntimeException;
        //  318    321    321    326    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 161, Size: 161
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
    
    public c_ b(final String s, final String s2) {
        final c_ c_ = new c_();
        this.a(s, s2, c_);
        return c_;
    }
    
    public u b(final c_ p0, final c_ p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/google/c_;
        //     3: dup            
        //     4: invokespecial   com/google/c_.<init>:()V
        //     7: astore_3       
        //     8: aload_3        
        //     9: aload_1        
        //    10: invokevirtual   com/google/c_.a:(Lcom/google/c_;)Lcom/google/c_;
        //    13: pop            
        //    14: new             Lcom/google/c_;
        //    17: dup            
        //    18: invokespecial   com/google/c_.<init>:()V
        //    21: astore          5
        //    23: aload           5
        //    25: aload_2        
        //    26: invokevirtual   com/google/c_.a:(Lcom/google/c_;)Lcom/google/c_;
        //    29: pop            
        //    30: aload_3        
        //    31: invokevirtual   com/google/c_.v:()Lcom/google/c_;
        //    34: pop            
        //    35: aload_3        
        //    36: invokevirtual   com/google/c_.m:()Lcom/google/c_;
        //    39: pop            
        //    40: aload_3        
        //    41: invokevirtual   com/google/c_.b:()Lcom/google/c_;
        //    44: pop            
        //    45: aload           5
        //    47: invokevirtual   com/google/c_.v:()Lcom/google/c_;
        //    50: pop            
        //    51: aload           5
        //    53: invokevirtual   com/google/c_.m:()Lcom/google/c_;
        //    56: pop            
        //    57: aload           5
        //    59: invokevirtual   com/google/c_.b:()Lcom/google/c_;
        //    62: pop            
        //    63: aload_3        
        //    64: invokevirtual   com/google/c_.h:()Z
        //    67: istore          15
        //    69: iload           15
        //    71: ifeq            89
        //    74: aload_3        
        //    75: invokevirtual   com/google/c_.c:()Ljava/lang/String;
        //    78: invokevirtual   java/lang/String.length:()I
        //    81: ifne            89
        //    84: aload_3        
        //    85: invokevirtual   com/google/c_.a:()Lcom/google/c_;
        //    88: pop            
        //    89: aload           5
        //    91: invokevirtual   com/google/c_.h:()Z
        //    94: istore          18
        //    96: iload           18
        //    98: ifeq            118
        //   101: aload           5
        //   103: invokevirtual   com/google/c_.c:()Ljava/lang/String;
        //   106: invokevirtual   java/lang/String.length:()I
        //   109: ifne            118
        //   112: aload           5
        //   114: invokevirtual   com/google/c_.a:()Lcom/google/c_;
        //   117: pop            
        //   118: aload_3        
        //   119: invokevirtual   com/google/c_.h:()Z
        //   122: istore          22
        //   124: iload           22
        //   126: ifeq            199
        //   129: aload           5
        //   131: invokevirtual   com/google/c_.h:()Z
        //   134: istore          34
        //   136: iload           34
        //   138: ifeq            199
        //   141: aload_3        
        //   142: invokevirtual   com/google/c_.c:()Ljava/lang/String;
        //   145: aload           5
        //   147: invokevirtual   com/google/c_.c:()Ljava/lang/String;
        //   150: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   153: ifne            199
        //   156: getstatic       com/google/u.NO_MATCH:Lcom/google/u;
        //   159: astore          35
        //   161: aload           35
        //   163: areturn        
        //   164: astore          6
        //   166: aload           6
        //   168: athrow         
        //   169: astore          7
        //   171: aload           7
        //   173: athrow         
        //   174: astore          16
        //   176: aload           16
        //   178: athrow         
        //   179: astore          17
        //   181: aload           17
        //   183: athrow         
        //   184: astore          19
        //   186: aload           19
        //   188: athrow         
        //   189: astore          20
        //   191: aload           20
        //   193: athrow         
        //   194: astore          21
        //   196: aload           21
        //   198: athrow         
        //   199: aload_3        
        //   200: invokevirtual   com/google/c_.n:()I
        //   203: istore          23
        //   205: aload           5
        //   207: invokevirtual   com/google/c_.n:()I
        //   210: istore          24
        //   212: iload           23
        //   214: ifeq            278
        //   217: iload           24
        //   219: ifeq            278
        //   222: aload_3        
        //   223: aload           5
        //   225: invokevirtual   com/google/c_.b:(Lcom/google/c_;)Z
        //   228: ifeq            244
        //   231: getstatic       com/google/u.EXACT_MATCH:Lcom/google/u;
        //   234: astore          33
        //   236: aload           33
        //   238: areturn        
        //   239: astore          30
        //   241: aload           30
        //   243: athrow         
        //   244: iload           23
        //   246: iload           24
        //   248: if_icmpne       274
        //   251: aload_0        
        //   252: aload_3        
        //   253: aload           5
        //   255: invokespecial   com/google/e6.a:(Lcom/google/c_;Lcom/google/c_;)Z
        //   258: ifeq            274
        //   261: getstatic       com/google/u.SHORT_NSN_MATCH:Lcom/google/u;
        //   264: astore          32
        //   266: aload           32
        //   268: areturn        
        //   269: astore          31
        //   271: aload           31
        //   273: athrow         
        //   274: getstatic       com/google/u.NO_MATCH:Lcom/google/u;
        //   277: areturn        
        //   278: aload_3        
        //   279: iload           24
        //   281: invokevirtual   com/google/c_.a:(I)Lcom/google/c_;
        //   284: pop            
        //   285: aload_3        
        //   286: aload           5
        //   288: invokevirtual   com/google/c_.b:(Lcom/google/c_;)Z
        //   291: ifeq            307
        //   294: getstatic       com/google/u.NSN_MATCH:Lcom/google/u;
        //   297: astore          29
        //   299: aload           29
        //   301: areturn        
        //   302: astore          25
        //   304: aload           25
        //   306: athrow         
        //   307: aload_0        
        //   308: aload_3        
        //   309: aload           5
        //   311: invokespecial   com/google/e6.a:(Lcom/google/c_;Lcom/google/c_;)Z
        //   314: ifeq            330
        //   317: getstatic       com/google/u.SHORT_NSN_MATCH:Lcom/google/u;
        //   320: astore          28
        //   322: aload           28
        //   324: areturn        
        //   325: astore          27
        //   327: aload           27
        //   329: athrow         
        //   330: getstatic       com/google/u.NO_MATCH:Lcom/google/u;
        //   333: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  23     69     164    169    Ljava/lang/RuntimeException;
        //  74     89     169    174    Ljava/lang/RuntimeException;
        //  89     96     174    179    Ljava/lang/RuntimeException;
        //  101    118    179    184    Ljava/lang/RuntimeException;
        //  118    124    184    189    Ljava/lang/RuntimeException;
        //  129    136    189    194    Ljava/lang/RuntimeException;
        //  141    161    194    199    Ljava/lang/RuntimeException;
        //  166    169    169    174    Ljava/lang/RuntimeException;
        //  176    179    179    184    Ljava/lang/RuntimeException;
        //  186    189    189    194    Ljava/lang/RuntimeException;
        //  191    194    194    199    Ljava/lang/RuntimeException;
        //  222    236    239    244    Ljava/lang/RuntimeException;
        //  251    266    269    274    Ljava/lang/RuntimeException;
        //  278    299    302    307    Ljava/lang/RuntimeException;
        //  307    322    325    330    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 166, Size: 166
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
    
    public String b(final int n) {
        final List<String> list = this.u.get(n);
        if (list == null) {
            try {
                return e6.J[47];
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        return list.get(0);
    }
    
    String b(final StringBuilder sb) {
        while (true) {
            final int a = e6.a;
            final Matcher matcher = e6.v.matcher(sb);
            while (true) {
                int n;
                try {
                    if (!matcher.find() || !d(sb.substring(0, matcher.start()))) {
                        break;
                    }
                    n = 1;
                    final int groupCount = matcher.groupCount();
                    if (n > groupCount) {
                        break;
                    }
                    if (matcher.group(n) != null) {
                        final String group = matcher.group(n);
                        sb.delete(matcher.start(), sb.length());
                        return group;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                ++n;
                if (a != 0) {
                    break;
                }
                continue;
            }
        }
        return "";
    }
    
    public void b(final String s, final String s2, final c_ c_) {
        this.a(s, s2, true, true, c_);
    }
    
    public boolean b(final c_ c_) {
        return this.b(c_, this.e(c_));
    }
    
    public boolean b(final c_ c_, final String s) {
        boolean b = true;
        final int n = c_.n();
        final c0 a = this.a(n, s);
        if (a != null) {
            Label_0062: {
                try {
                    if (e6.J[44].equals(s)) {
                        break Label_0062;
                    }
                    final int n2 = n;
                    final e6 e6 = this;
                    final String s2 = s;
                    final int n3 = e6.j(s2);
                    if (n2 != n3) {
                        return false;
                    }
                    break Label_0062;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int n2 = n;
                    final e6 e6 = this;
                    final String s2 = s;
                    final int n3 = e6.j(s2);
                    if (n2 != n3) {
                        return false;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            final h2 ac = a.ac();
            final String a2 = this.a(c_);
            if (!ac.c()) {
                final int length = a2.length();
                if (length <= 2 || length > 16) {
                    return false;
                }
                return b;
            }
            else {
                try {
                    if (this.a(a2, a) == g_.UNKNOWN) {
                        return false;
                    }
                    return b;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
        }
        b = false;
        return b;
    }
    
    c0 c(final int n) {
        synchronized (this.H) {
            if (!this.u.containsKey(n)) {
                return null;
            }
            try {
                if (!this.H.containsKey(n)) {
                    this.a(this.f, e6.J[0], n);
                }
                // monitorexit(this.H)
                return this.H.get(n);
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
    }
    
    public h0 c(final c_ c_) {
        final String a = this.a(c_);
        final int n = c_.n();
        try {
            if (!this.a(n)) {
                return h0.INVALID_COUNTRY_CODE;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final h2 ac = this.a(n, this.b(n)).ac();
        if (!ac.c()) {
            e6.w.log(Level.FINER, e6.J[28]);
            final int length = a.length();
            if (length < 2) {
                try {
                    return h0.TOO_SHORT;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            if (length > 16) {
                try {
                    return h0.TOO_LONG;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            return h0.IS_POSSIBLE;
        }
        return this.a(this.d.a(ac.e()), a);
    }
    
    public boolean d(final c_ c_) {
        try {
            if (this.c(c_) == h0.IS_POSSIBLE) {
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return false;
    }
    
    public String e(final c_ c_) {
        final int n = c_.n();
        final List<String> list = this.u.get(n);
        if (list == null) {
            e6.w.log(Level.WARNING, e6.J[10] + n + e6.J[11] + this.a(c_));
            return null;
        }
        try {
            if (list.size() == 1) {
                return list.get(0);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return this.a(c_, list);
    }
    
    public a9 i(final String s) {
        return new a9(s);
    }
    
    c0 l(final String s) {
        try {
            if (!this.b(s)) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        synchronized (this.s) {
            if (!this.s.containsKey(s)) {
                this.a(this.f, s, 0);
            }
            // monitorexit(this.s)
            return this.s.get(s);
        }
    }
}
