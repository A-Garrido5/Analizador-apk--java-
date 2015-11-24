// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Iterator;

final class cw implements Iterator
{
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern h;
    private static final Pattern j;
    private static final Pattern l;
    private static final Pattern o;
    private static final String z;
    private final CharSequence e;
    private final String f;
    private long g;
    private final e6 i;
    private int k;
    private a7 m;
    private aq n;
    private final a0 p;
    
    static {
        String s = "u~";
        int n = -1;
        String z2 = null;
    Label_0320:
        while (true) {
            z2 = z(z(s));
            switch (n) {
                default: {
                    z = z2;
                    s = "\r+\\A$d2\n[T54\u0016\\=,\u0013T\u000b8}{Z, \r+\\A$e2";
                    n = 0;
                    continue;
                }
                case 4: {
                    break Label_0320;
                }
                case 0: {
                    d = Pattern.compile(z2);
                    s = "yp\u001dX7k\u0014\u0017];\fp{\u0014'\n\u007f\u0016-7\r+\u000e\f nu|@9\fp{\u0014'\n\u007f\nCUn\u0013CY!~g\u0018JS`}z,lxp{\u0014sc2";
                    n = 1;
                    continue;
                }
                case 1: {
                    a = Pattern.compile(z2);
                    s = "\n~\u0015-T54\u0014\rS|`zOSa~z,l\nb\b-7\n\u007f\nCU\r+\u0007+8|}z,lu";
                    n = 2;
                    continue;
                }
                case 2: {
                    l = Pattern.compile(z2);
                    s = "k\u0014\u0017]=\f\u0013C";
                    n = 3;
                    continue;
                }
                case 3: {
                    b = Pattern.compile(z2);
                    s = "y\u0013|\uff78\uff33";
                    n = 4;
                    continue;
                }
            }
        }
        final String z3 = z(z("x\u0013z\uff79\uff35"));
        final String string = z(z("\n\u0011")) + z2 + z3 + "]";
        final String a2 = a(0, 3);
        StringBuilder sb = new StringBuilder();
        String s2 = "yp\u001d+";
        int n2 = -1;
        String z4 = null;
    Label_0060:
        while (true) {
            z4 = z(z(s2));
            switch (n2) {
                case 5: {
                    break Label_0060;
                }
                default: {
                    sb = sb.append(z4).append(z2);
                    s2 = "\ff\u0018";
                    n2 = 0;
                    continue;
                }
                case 0: {
                    sb = sb.append(z4);
                    s2 = "yp\u001d";
                    n2 = 1;
                    continue;
                }
                case 1: {
                    sb = sb.append(z4).append(string).append("+").append("[").append(z3);
                    s2 = "\ff\u0018";
                    n2 = 2;
                    continue;
                }
                case 2: {
                    sb = sb.append(z4).append(string).append("+");
                    s2 = "yp\u001d+";
                    n2 = 3;
                    continue;
                }
                case 3: {
                    sb = sb.append(z4).append(z2).append("]").append(string);
                    s2 = "z\u0014";
                    n2 = 4;
                    continue;
                }
                case 4: {
                    sb = sb.append(z4).append(z3);
                    s2 = "\ff";
                    n2 = 5;
                    continue;
                }
            }
        }
        h = Pattern.compile(sb.append(z4).append(a2).append(string).append("*").toString());
        final String a3 = a(0, 2);
        final String a4 = a(0, 4);
        final String a5 = a(0, 19);
        final String string2 = z(z("\nb_\u2060%\u2044\u225d\u30db\uff7d%\uff5eo\u0087\u00dd\u2003\u2031\u304f\u000fY\uff00\uff58\uff74\uff1a^T\n\u0013z_v\u2002\u2273\uff79-")) + a4;
        final String string3 = z(z("\r?\\>l,")) + a(1, 19);
        final String string4 = z2 + z(z("z\uff44"));
        final String string5 = "[" + string4 + "]";
        c = Pattern.compile(string5);
        StringBuilder sb2 = new StringBuilder();
        String s3 = "\r?\\*u\n\u0011";
        int n3 = -1;
        String z5 = null;
    Label_0808:
        while (true) {
            z5 = z(z(s3));
            switch (n3) {
                default: {
                    sb2 = sb2.append(z5).append(string4);
                    s3 = "\r?\\>l,\u0012\r";
                    n3 = 0;
                    continue;
                }
                case 0: {
                    j = Pattern.compile(sb2.append(z5).toString());
                    sb2 = new StringBuilder();
                    s3 = "yp\u001d";
                    n3 = 1;
                    continue;
                }
                case 1: {
                    sb2 = sb2.append(z5).append(string5).append(string2).append(")").append(a3).append(string3);
                    s3 = "yp\u001d";
                    n3 = 2;
                    continue;
                }
                case 2: {
                    sb2 = sb2.append(z5).append(string2).append(string3).append(")").append(a5);
                    s3 = "yp\u001d";
                    n3 = 3;
                    continue;
                }
                case 3: {
                    sb2 = sb2.append(z5).append(e6.z);
                    s3 = "xp";
                    n3 = 4;
                    continue;
                }
                case 4: {
                    break Label_0808;
                }
            }
        }
        o = Pattern.compile(sb2.append(z5).toString(), 66);
    }
    
    cw(final e6 i, CharSequence e, final String f, final a0 p5, final long g) {
        this.n = aq.NOT_READY;
        this.m = null;
        this.k = 0;
        Label_0043: {
            if (i != null) {
                if (p5 != null) {
                    break Label_0043;
                }
            }
            try {
                throw new NullPointerException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        if (g < 0L) {
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        while (true) {
            while (true) {
                try {
                    this.i = i;
                    if (e != null) {
                        this.e = e;
                        this.f = f;
                        this.p = p5;
                        this.g = g;
                        return;
                    }
                }
                catch (IllegalArgumentException ex3) {
                    throw ex3;
                }
                e = "";
                continue;
            }
        }
    }
    
    private a7 a(int n) {
        final int a = e6.a;
        final Matcher matcher = cw.o.matcher(this.e);
        while (this.g > 0L && matcher.find(n)) {
            final int start = matcher.start();
            final CharSequence a2 = a(e6.h, this.e.subSequence(start, matcher.end()));
            final a7 a3 = this.a(a2, start);
            if (a3 != null) {
                return a3;
            }
            n = start + a2.length();
            --this.g;
            if (a != 0) {
                break;
            }
        }
        return null;
    }
    
    private a7 a(final CharSequence charSequence, final int n) {
        a7 b = null;
        Label_0043: {
            try {
                final boolean find = cw.d.matcher(charSequence).find();
                b = null;
                if (find) {
                    return b;
                }
                final Pattern pattern = cw.a;
                final CharSequence charSequence2 = charSequence;
                final Matcher matcher = pattern.matcher(charSequence2);
                final boolean b2 = matcher.find();
                if (b2) {
                    return null;
                }
                break Label_0043;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final Pattern pattern = cw.a;
                final CharSequence charSequence2 = charSequence;
                final Matcher matcher = pattern.matcher(charSequence2);
                final boolean b2 = matcher.find();
                if (b2) {
                    return null;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        Label_0099: {
            if (!cw.l.matcher(charSequence).find()) {
                break Label_0099;
            }
            final String substring = this.e.toString().substring(n + charSequence.length());
            try {
                final boolean looking = cw.b.matcher(substring).lookingAt();
                b = null;
                if (!looking) {
                    final String string = charSequence.toString();
                    b = this.b(string, n);
                    if (b == null) {
                        return this.a(string, n);
                    }
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        return b;
    }
    
    private a7 a(final String s, final int n) {
        final int a = e6.a;
        final Matcher matcher = cw.j.matcher(s);
        if (matcher.find()) {
            final CharSequence a2 = a(e6.k, s.substring(0, matcher.start()));
            a7 a3 = this.b(a2.toString(), n);
            if (a3 == null) {
                --this.g;
                int n2 = matcher.end();
                final a7 b = this.b(a(e6.k, s.substring(n2)).toString(), n + n2);
                if (b != null) {
                    return b;
                }
                --this.g;
                if (this.g <= 0L) {
                    return null;
                }
                while (matcher.find()) {
                    n2 = matcher.start();
                    if (a != 0) {
                        break;
                    }
                }
                final CharSequence a4 = a(e6.k, s.substring(0, n2));
                try {
                    if (a4.equals(a2)) {
                        return null;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                a3 = this.b(a4.toString(), n);
                if (a3 == null) {
                    --this.g;
                    return null;
                }
            }
            return a3;
        }
        return null;
    }
    
    private static CharSequence a(final Pattern pattern, CharSequence subSequence) {
        final Matcher matcher = pattern.matcher(subSequence);
        if (matcher.find()) {
            subSequence = subSequence.subSequence(0, matcher.start());
        }
        return subSequence;
    }
    
    private static String a(final int n, final int n2) {
        if (n >= 0 && n2 > 0) {
            if (n2 >= n) {
                return "{" + n + "," + n2 + "}";
            }
        }
        try {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return "{" + n + "," + n2 + "}";
    }
    
    static boolean a(final char p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_0        
        //     1: invokestatic    java/lang/Character.isLetter:(C)Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifne            26
        //     9: iload_0        
        //    10: invokestatic    java/lang/Character.getType:(C)I
        //    13: bipush          6
        //    15: if_icmpeq       26
        //    18: iconst_0       
        //    19: ireturn        
        //    20: astore_1       
        //    21: aload_1        
        //    22: athrow         
        //    23: astore_2       
        //    24: aload_2        
        //    25: athrow         
        //    26: iload_0        
        //    27: invokestatic    java/lang/Character$UnicodeBlock.of:(C)Ljava/lang/Character$UnicodeBlock;
        //    30: astore          4
        //    32: aload           4
        //    34: getstatic       java/lang/Character$UnicodeBlock.BASIC_LATIN:Ljava/lang/Character$UnicodeBlock;
        //    37: invokevirtual   java/lang/Character$UnicodeBlock.equals:(Ljava/lang/Object;)Z
        //    40: istore          11
        //    42: iload           11
        //    44: ifne            122
        //    47: aload           4
        //    49: getstatic       java/lang/Character$UnicodeBlock.LATIN_1_SUPPLEMENT:Ljava/lang/Character$UnicodeBlock;
        //    52: invokevirtual   java/lang/Character$UnicodeBlock.equals:(Ljava/lang/Object;)Z
        //    55: istore          12
        //    57: iload           12
        //    59: ifne            122
        //    62: aload           4
        //    64: getstatic       java/lang/Character$UnicodeBlock.LATIN_EXTENDED_A:Ljava/lang/Character$UnicodeBlock;
        //    67: invokevirtual   java/lang/Character$UnicodeBlock.equals:(Ljava/lang/Object;)Z
        //    70: istore          13
        //    72: iload           13
        //    74: ifne            122
        //    77: aload           4
        //    79: getstatic       java/lang/Character$UnicodeBlock.LATIN_EXTENDED_ADDITIONAL:Ljava/lang/Character$UnicodeBlock;
        //    82: invokevirtual   java/lang/Character$UnicodeBlock.equals:(Ljava/lang/Object;)Z
        //    85: istore          14
        //    87: iload           14
        //    89: ifne            122
        //    92: aload           4
        //    94: getstatic       java/lang/Character$UnicodeBlock.LATIN_EXTENDED_B:Ljava/lang/Character$UnicodeBlock;
        //    97: invokevirtual   java/lang/Character$UnicodeBlock.equals:(Ljava/lang/Object;)Z
        //   100: istore          15
        //   102: iload           15
        //   104: ifne            122
        //   107: aload           4
        //   109: getstatic       java/lang/Character$UnicodeBlock.COMBINING_DIACRITICAL_MARKS:Ljava/lang/Character$UnicodeBlock;
        //   112: invokevirtual   java/lang/Character$UnicodeBlock.equals:(Ljava/lang/Object;)Z
        //   115: istore          16
        //   117: iload           16
        //   119: ifeq            154
        //   122: iconst_1       
        //   123: ireturn        
        //   124: astore          5
        //   126: aload           5
        //   128: athrow         
        //   129: astore          6
        //   131: aload           6
        //   133: athrow         
        //   134: astore          7
        //   136: aload           7
        //   138: athrow         
        //   139: astore          8
        //   141: aload           8
        //   143: athrow         
        //   144: astore          9
        //   146: aload           9
        //   148: athrow         
        //   149: astore          10
        //   151: aload           10
        //   153: athrow         
        //   154: iconst_0       
        //   155: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      20     23     Ljava/lang/IllegalArgumentException;
        //  9      18     23     26     Ljava/lang/IllegalArgumentException;
        //  21     23     23     26     Ljava/lang/IllegalArgumentException;
        //  32     42     124    129    Ljava/lang/IllegalArgumentException;
        //  47     57     129    134    Ljava/lang/IllegalArgumentException;
        //  62     72     134    139    Ljava/lang/IllegalArgumentException;
        //  77     87     139    144    Ljava/lang/IllegalArgumentException;
        //  92     102    144    149    Ljava/lang/IllegalArgumentException;
        //  107    117    149    154    Ljava/lang/IllegalArgumentException;
        //  126    129    129    134    Ljava/lang/IllegalArgumentException;
        //  131    134    134    139    Ljava/lang/IllegalArgumentException;
        //  136    139    139    144    Ljava/lang/IllegalArgumentException;
        //  141    144    144    149    Ljava/lang/IllegalArgumentException;
        //  146    149    149    154    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 78, Size: 78
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
    
    static boolean a(final c_ p0, final e6 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/google/c_.r:()Lcom/google/b6;
        //     4: astore_3       
        //     5: getstatic       com/google/b6.FROM_DEFAULT_COUNTRY:Lcom/google/b6;
        //     8: astore          4
        //    10: aload_3        
        //    11: aload           4
        //    13: if_acmpeq       21
        //    16: iconst_1       
        //    17: ireturn        
        //    18: astore_2       
        //    19: aload_2        
        //    20: athrow         
        //    21: aload_1        
        //    22: aload_1        
        //    23: aload_0        
        //    24: invokevirtual   com/google/c_.n:()I
        //    27: invokevirtual   com/google/e6.b:(I)Ljava/lang/String;
        //    30: invokevirtual   com/google/e6.l:(Ljava/lang/String;)Lcom/google/c0;
        //    33: astore          5
        //    35: aload           5
        //    37: ifnull          16
        //    40: aload_1        
        //    41: aload_0        
        //    42: invokevirtual   com/google/e6.a:(Lcom/google/c_;)Ljava/lang/String;
        //    45: astore          6
        //    47: aload_1        
        //    48: aload           5
        //    50: invokevirtual   com/google/c0.x:()Ljava/util/List;
        //    53: aload           6
        //    55: invokevirtual   com/google/e6.a:(Ljava/util/List;Ljava/lang/String;)Lcom/google/fw;
        //    58: astore          7
        //    60: aload           7
        //    62: ifnull          16
        //    65: aload           7
        //    67: invokevirtual   com/google/fw.b:()Ljava/lang/String;
        //    70: invokevirtual   java/lang/String.length:()I
        //    73: istore          10
        //    75: iload           10
        //    77: ifle            16
        //    80: aload           7
        //    82: invokevirtual   com/google/fw.k:()Z
        //    85: istore          11
        //    87: iload           11
        //    89: ifne            16
        //    92: aload           7
        //    94: invokevirtual   com/google/fw.b:()Ljava/lang/String;
        //    97: astore          12
        //    99: aload           12
        //   101: iconst_0       
        //   102: aload           12
        //   104: getstatic       com/google/cw.z:Ljava/lang/String;
        //   107: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   110: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   113: invokestatic    com/google/e6.k:(Ljava/lang/String;)Ljava/lang/String;
        //   116: astore          13
        //   118: aload           13
        //   120: invokevirtual   java/lang/String.length:()I
        //   123: istore          15
        //   125: iload           15
        //   127: ifeq            16
        //   130: aload_1        
        //   131: new             Ljava/lang/StringBuilder;
        //   134: dup            
        //   135: aload_0        
        //   136: invokevirtual   com/google/c_.u:()Ljava/lang/String;
        //   139: invokestatic    com/google/e6.k:(Ljava/lang/String;)Ljava/lang/String;
        //   142: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   145: aload           5
        //   147: aconst_null    
        //   148: invokevirtual   com/google/e6.a:(Ljava/lang/StringBuilder;Lcom/google/c0;Ljava/lang/StringBuilder;)Z
        //   151: ireturn        
        //   152: astore          8
        //   154: aload           8
        //   156: athrow         
        //   157: astore          9
        //   159: aload           9
        //   161: athrow         
        //   162: astore          14
        //   164: aload           14
        //   166: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      10     18     21     Ljava/lang/IllegalArgumentException;
        //  65     75     152    157    Ljava/lang/IllegalArgumentException;
        //  80     87     157    162    Ljava/lang/IllegalArgumentException;
        //  118    125    162    167    Ljava/lang/IllegalArgumentException;
        //  154    157    157    162    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 81, Size: 81
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
    
    static boolean a(final c_ c_, final String s, final e6 e6) {
        final int a = e6.a;
        int n = 0;
        while (true) {
            if (n >= -1 + s.length()) {
                return true;
            }
            final char char1 = s.charAt(n);
            Label_0122: {
                if (char1 != 'x' && char1 != 'X') {
                    break Label_0122;
                }
                final char char2 = s.charAt(n + 1);
                Label_0099: {
                    if (char2 != 'x' && char2 != 'X') {
                        break Label_0099;
                    }
                    ++n;
                    try {
                        if (e6.a(c_, s.substring(n)) != u.NSN_MATCH) {
                            return false;
                        }
                        break Label_0122;
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                    try {
                        if (!e6.k(s.substring(n)).equals(c_.c())) {
                            return false;
                        }
                        ++n;
                        if (a != 0) {
                            return true;
                        }
                        continue;
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
        }
    }
    
    static boolean a(final c_ c_, final String s, final e6 e6, final g6 g6) {
        final int a = e6.a;
        final StringBuilder a2 = e6.a(s, true);
        final String[] a3 = a(e6, c_, null);
        try {
            if (g6.a(e6, c_, a2, a3)) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final c0 b = b2.b(c_.n());
        if (b != null) {
            final Iterator iterator = b.x().iterator();
            while (iterator.hasNext()) {
                final String[] a4 = a(e6, c_, iterator.next());
                try {
                    if (g6.a(e6, c_, a2, a4)) {
                        return true;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                if (a != 0) {
                    break;
                }
            }
        }
        return false;
    }
    
    static boolean a(final e6 p0, final c_ p1, final StringBuilder p2, final String[] p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore          4
        //     5: getstatic       com/google/e6.E:Ljava/util/regex/Pattern;
        //     8: aload_2        
        //     9: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    12: invokevirtual   java/util/regex/Pattern.split:(Ljava/lang/CharSequence;)[Ljava/lang/String;
        //    15: astore          5
        //    17: aload_1        
        //    18: invokevirtual   com/google/c_.h:()Z
        //    21: ifeq            77
        //    24: aload           5
        //    26: arraylength    
        //    27: istore          19
        //    29: iload           19
        //    31: iconst_2       
        //    32: isub           
        //    33: istore          7
        //    35: aload           5
        //    37: arraylength    
        //    38: istore          10
        //    40: iload           10
        //    42: iconst_1       
        //    43: if_icmpeq       66
        //    46: aload           5
        //    48: iload           7
        //    50: aaload         
        //    51: aload_0        
        //    52: aload_1        
        //    53: invokevirtual   com/google/e6.a:(Lcom/google/c_;)Ljava/lang/String;
        //    56: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    59: istore          12
        //    61: iload           12
        //    63: ifeq            97
        //    66: iconst_1       
        //    67: istore          11
        //    69: iload           11
        //    71: ireturn        
        //    72: astore          6
        //    74: aload           6
        //    76: athrow         
        //    77: iconst_m1      
        //    78: aload           5
        //    80: arraylength    
        //    81: iadd           
        //    82: istore          7
        //    84: goto            35
        //    87: astore          8
        //    89: aload           8
        //    91: athrow         
        //    92: astore          9
        //    94: aload           9
        //    96: athrow         
        //    97: iconst_m1      
        //    98: aload_3        
        //    99: arraylength    
        //   100: iadd           
        //   101: istore          13
        //   103: iload           13
        //   105: ifle            146
        //   108: iload           7
        //   110: iflt            146
        //   113: aload           5
        //   115: iload           7
        //   117: aaload         
        //   118: aload_3        
        //   119: iload           13
        //   121: aaload         
        //   122: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   125: istore          18
        //   127: iconst_0       
        //   128: istore          11
        //   130: iload           18
        //   132: ifeq            69
        //   135: iinc            13, -1
        //   138: iinc            7, -1
        //   141: iload           4
        //   143: ifeq            103
        //   146: iload           7
        //   148: iflt            185
        //   151: aload           5
        //   153: iload           7
        //   155: aaload         
        //   156: aload_3        
        //   157: iconst_0       
        //   158: aaload         
        //   159: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   162: istore          16
        //   164: iload           16
        //   166: ifeq            185
        //   169: iconst_1       
        //   170: istore          14
        //   172: iload           14
        //   174: ireturn        
        //   175: astore          17
        //   177: aload           17
        //   179: athrow         
        //   180: astore          15
        //   182: aload           15
        //   184: athrow         
        //   185: iconst_0       
        //   186: istore          14
        //   188: goto            172
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  17     29     72     77     Ljava/lang/IllegalArgumentException;
        //  35     40     87     92     Ljava/lang/IllegalArgumentException;
        //  46     61     92     97     Ljava/lang/IllegalArgumentException;
        //  89     92     92     97     Ljava/lang/IllegalArgumentException;
        //  113    127    175    180    Ljava/lang/IllegalArgumentException;
        //  151    164    180    185    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 102, Size: 102
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
    
    static boolean a(final String s) {
        final int index = s.indexOf(47);
        if (index > 0) {
            final int n = index + 1;
            try {
                if (s.substring(n).contains("/")) {
                    return true;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    private static String[] a(final e6 e6, final c_ c_, final fw fw) {
        if (fw == null) {
            final String a = e6.a(c_, f9.RFC3966);
            int n = a.indexOf(59);
            if (n < 0) {
                n = a.length();
            }
            return a.substring(1 + a.indexOf(45), n).split("-");
        }
        return e6.a(e6.a(c_), fw, f9.RFC3966).split("-");
    }
    
    private a7 b(final String p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/cw.h:Ljava/util/regex/Pattern;
        //     3: aload_1        
        //     4: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //     7: invokevirtual   java/util/regex/Matcher.matches:()Z
        //    10: istore          5
        //    12: iload           5
        //    14: ifne            24
        //    17: aconst_null    
        //    18: areturn        
        //    19: astore          4
        //    21: aload           4
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        com/google/cw.p:Lcom/google/a0;
        //    28: getstatic       com/google/a0.VALID:Lcom/google/a0;
        //    31: invokevirtual   com/google/a0.compareTo:(Ljava/lang/Enum;)I
        //    34: istore          8
        //    36: iload           8
        //    38: iflt            151
        //    41: iload_2        
        //    42: ifle            96
        //    45: getstatic       com/google/cw.c:Ljava/util/regex/Pattern;
        //    48: aload_1        
        //    49: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    52: invokevirtual   java/util/regex/Matcher.lookingAt:()Z
        //    55: istore          18
        //    57: iload           18
        //    59: ifne            96
        //    62: aload_0        
        //    63: getfield        com/google/cw.e:Ljava/lang/CharSequence;
        //    66: iload_2        
        //    67: iconst_1       
        //    68: isub           
        //    69: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    74: istore          19
        //    76: iload           19
        //    78: invokestatic    com/google/cw.b:(C)Z
        //    81: ifne            17
        //    84: iload           19
        //    86: invokestatic    com/google/cw.a:(C)Z
        //    89: istore          21
        //    91: iload           21
        //    93: ifne            17
        //    96: iload_2        
        //    97: aload_1        
        //    98: invokevirtual   java/lang/String.length:()I
        //   101: iadd           
        //   102: istore          14
        //   104: iload           14
        //   106: aload_0        
        //   107: getfield        com/google/cw.e:Ljava/lang/CharSequence;
        //   110: invokeinterface java/lang/CharSequence.length:()I
        //   115: if_icmpge       151
        //   118: aload_0        
        //   119: getfield        com/google/cw.e:Ljava/lang/CharSequence;
        //   122: iload           14
        //   124: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   129: istore          15
        //   131: iload           15
        //   133: invokestatic    com/google/cw.b:(C)Z
        //   136: ifne            17
        //   139: iload           15
        //   141: invokestatic    com/google/cw.a:(C)Z
        //   144: istore          17
        //   146: iload           17
        //   148: ifne            17
        //   151: aload_0        
        //   152: getfield        com/google/cw.i:Lcom/google/e6;
        //   155: aload_1        
        //   156: aload_0        
        //   157: getfield        com/google/cw.f:Ljava/lang/String;
        //   160: invokevirtual   com/google/e6.a:(Ljava/lang/String;Ljava/lang/String;)Lcom/google/c_;
        //   163: astore          9
        //   165: aload_0        
        //   166: getfield        com/google/cw.p:Lcom/google/a0;
        //   169: aload           9
        //   171: aload_1        
        //   172: aload_0        
        //   173: getfield        com/google/cw.i:Lcom/google/e6;
        //   176: invokevirtual   com/google/a0.a:(Lcom/google/c_;Ljava/lang/String;Lcom/google/e6;)Z
        //   179: ifeq            17
        //   182: aload           9
        //   184: invokevirtual   com/google/c_.m:()Lcom/google/c_;
        //   187: pop            
        //   188: aload           9
        //   190: invokevirtual   com/google/c_.v:()Lcom/google/c_;
        //   193: pop            
        //   194: aload           9
        //   196: invokevirtual   com/google/c_.b:()Lcom/google/c_;
        //   199: pop            
        //   200: new             Lcom/google/a7;
        //   203: dup            
        //   204: iload_2        
        //   205: aload_1        
        //   206: aload           9
        //   208: invokespecial   com/google/a7.<init>:(ILjava/lang/String;Lcom/google/c_;)V
        //   211: astore          13
        //   213: aload           13
        //   215: areturn        
        //   216: astore          6
        //   218: aload           6
        //   220: athrow         
        //   221: astore          7
        //   223: aload           7
        //   225: athrow         
        //   226: astore          20
        //   228: aload           20
        //   230: athrow         
        //   231: astore          16
        //   233: aload           16
        //   235: athrow         
        //   236: astore_3       
        //   237: aconst_null    
        //   238: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      12     236    239    Lcom/google/m;
        //  0      12     19     24     Ljava/lang/IllegalArgumentException;
        //  24     36     216    221    Lcom/google/m;
        //  45     57     221    226    Lcom/google/m;
        //  62     76     236    239    Lcom/google/m;
        //  76     91     226    231    Lcom/google/m;
        //  96     131    236    239    Lcom/google/m;
        //  131    146    231    236    Lcom/google/m;
        //  151    213    236    239    Lcom/google/m;
        //  218    221    221    226    Lcom/google/m;
        //  223    226    236    239    Lcom/google/m;
        //  228    231    236    239    Lcom/google/m;
        //  233    236    236    239    Lcom/google/m;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 114, Size: 114
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
    
    private static boolean b(final char c) {
        if (c != '%') {
            try {
                if (Character.getType(c) == 26) {
                    return true;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            return false;
        }
        return true;
    }
    
    static boolean b(final e6 e6, final c_ c_, final StringBuilder sb, final String[] array) {
        final int a = e6.a;
        int i = 0;
        int n = 0;
        while (i < array.length) {
            final int index = sb.indexOf(array[i], n);
            if (index < 0) {
                return false;
            }
            n = index + array[i].length();
            if (i == 0) {
                try {
                    if (n < sb.length() && Character.isDigit(sb.charAt(n))) {
                        return sb.substring(n - array[i].length()).startsWith(e6.a(c_));
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return sb.substring(n).contains(c_.c());
    }
    
    private static String z(final char[] array) {
        for (int i = array.length, n = 0; i > n; ++n) {
            final char c = array[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\b';
                    break;
                }
                case 0: {
                    c2 = 'Q';
                    break;
                }
                case 1: {
                    c2 = 'O';
                    break;
                }
                case 2: {
                    c2 = '\'';
                    break;
                }
                case 3: {
                    c2 = 'p';
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
            charArray[0] ^= '\b';
        }
        return charArray;
    }
    
    public a7 a() {
        try {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final a7 m = this.m;
        this.m = null;
        this.n = aq.NOT_READY;
        return m;
    }
    
    @Override
    public boolean hasNext() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/cw.n:Lcom/google/aq;
        //     4: astore          4
        //     6: getstatic       com/google/aq.NOT_READY:Lcom/google/aq;
        //     9: astore          5
        //    11: aload           4
        //    13: aload           5
        //    15: if_acmpne       72
        //    18: aload_0        
        //    19: aload_0        
        //    20: aload_0        
        //    21: getfield        com/google/cw.k:I
        //    24: invokespecial   com/google/cw.a:(I)Lcom/google/a7;
        //    27: putfield        com/google/cw.m:Lcom/google/a7;
        //    30: aload_0        
        //    31: getfield        com/google/cw.m:Lcom/google/a7;
        //    34: astore          9
        //    36: aload           9
        //    38: ifnonnull       54
        //    41: aload_0        
        //    42: getstatic       com/google/aq.DONE:Lcom/google/aq;
        //    45: putfield        com/google/cw.n:Lcom/google/aq;
        //    48: getstatic       com/google/e6.a:I
        //    51: ifeq            72
        //    54: aload_0        
        //    55: aload_0        
        //    56: getfield        com/google/cw.m:Lcom/google/a7;
        //    59: invokevirtual   com/google/a7.a:()I
        //    62: putfield        com/google/cw.k:I
        //    65: aload_0        
        //    66: getstatic       com/google/aq.READY:Lcom/google/aq;
        //    69: putfield        com/google/cw.n:Lcom/google/aq;
        //    72: aload_0        
        //    73: getfield        com/google/cw.n:Lcom/google/aq;
        //    76: astore          7
        //    78: getstatic       com/google/aq.READY:Lcom/google/aq;
        //    81: astore          8
        //    83: aload           7
        //    85: aload           8
        //    87: if_acmpne       106
        //    90: iconst_1       
        //    91: ireturn        
        //    92: astore_1       
        //    93: aload_1        
        //    94: athrow         
        //    95: astore_2       
        //    96: aload_2        
        //    97: athrow         
        //    98: astore_3       
        //    99: aload_3        
        //   100: athrow         
        //   101: astore          6
        //   103: aload           6
        //   105: athrow         
        //   106: iconst_0       
        //   107: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      11     92     95     Ljava/lang/IllegalArgumentException;
        //  18     36     95     98     Ljava/lang/IllegalArgumentException;
        //  41     54     98     101    Ljava/lang/IllegalArgumentException;
        //  54     72     98     101    Ljava/lang/IllegalArgumentException;
        //  72     83     101    106    Ljava/lang/IllegalArgumentException;
        //  93     95     95     98     Ljava/lang/IllegalArgumentException;
        //  96     98     98     101    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 56, Size: 56
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
    
    @Override
    public Object next() {
        return this.a();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
