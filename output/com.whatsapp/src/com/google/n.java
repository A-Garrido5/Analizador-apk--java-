// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Set;
import java.util.Arrays;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.io.Serializable;
import java.util.AbstractMap;

public final class n extends AbstractMap implements Serializable
{
    static final boolean b;
    public static int e;
    private static final Comparator h;
    private static final String[] z;
    int a;
    private fF c;
    private hL d;
    gz[] f;
    Comparator g;
    final gz i;
    int j;
    int k;
    
    static {
        int b2 = 1;
        final String[] z2 = new String[2];
        final char[] charArray = "]JrD]\u000b\u000fe\u0011\fZ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '`';
                    break;
                }
                case 0: {
                    c2 = '6';
                    break;
                }
                case 1: {
                    c2 = '/';
                    break;
                }
                case 2: {
                    c2 = '\u000b';
                    break;
                }
                case 3: {
                    c2 = 'd';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0016FxD\u000eY[+'\u000f[_j\u0016\u0001TCn".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '`';
                    break;
                }
                case 0: {
                    c4 = '6';
                    break;
                }
                case 1: {
                    c4 = '/';
                    break;
                }
                case 2: {
                    c4 = '\u000b';
                    break;
                }
                case 3: {
                    c4 = 'd';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        while (true) {
            z2[b2] = new String(charArray2).intern();
            z = z2;
            while (true) {
                try {
                    if (!n.class.desiredAssertionStatus()) {
                        b = (b2 != 0);
                        h = new bi();
                        return;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                b2 = 0;
                continue;
            }
        }
    }
    
    public n() {
        this(n.h);
    }
    
    public n(Comparator h) {
        this.a = 0;
        this.k = 0;
        if (h == null) {
            h = n.h;
        }
        this.g = h;
        this.i = new gz();
        this.f = new gz[16];
        this.j = this.f.length / 2 + this.f.length / 4;
    }
    
    private static int a(final int n) {
        final int n2 = n ^ (n >>> 20 ^ n >>> 12);
        return n2 ^ n2 >>> 7 ^ n2 >>> 4;
    }
    
    private void a() {
        this.f = a(this.f);
        this.j = this.f.length / 2 + this.f.length / 4;
    }
    
    private void a(final gz p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        com/google/gz.f:Lcom/google/gz;
        //     4: astore_2       
        //     5: aload_1        
        //     6: getfield        com/google/gz.b:Lcom/google/gz;
        //     9: astore_3       
        //    10: aload_2        
        //    11: getfield        com/google/gz.f:Lcom/google/gz;
        //    14: astore          4
        //    16: aload_2        
        //    17: getfield        com/google/gz.b:Lcom/google/gz;
        //    20: astore          5
        //    22: aload_1        
        //    23: aload           5
        //    25: putfield        com/google/gz.f:Lcom/google/gz;
        //    28: aload           5
        //    30: ifnull          39
        //    33: aload           5
        //    35: aload_1        
        //    36: putfield        com/google/gz.e:Lcom/google/gz;
        //    39: aload_0        
        //    40: aload_1        
        //    41: aload_2        
        //    42: invokespecial   com/google/n.a:(Lcom/google/gz;Lcom/google/gz;)V
        //    45: aload_2        
        //    46: aload_1        
        //    47: putfield        com/google/gz.b:Lcom/google/gz;
        //    50: aload_1        
        //    51: aload_2        
        //    52: putfield        com/google/gz.e:Lcom/google/gz;
        //    55: aload_3        
        //    56: ifnull          139
        //    59: aload_3        
        //    60: getfield        com/google/gz.d:I
        //    63: istore          8
        //    65: iload           8
        //    67: istore          9
        //    69: aload           5
        //    71: ifnull          150
        //    74: aload           5
        //    76: getfield        com/google/gz.d:I
        //    79: istore          10
        //    81: aload_1        
        //    82: iconst_1       
        //    83: iload           9
        //    85: iload           10
        //    87: invokestatic    java/lang/Math.max:(II)I
        //    90: iadd           
        //    91: putfield        com/google/gz.d:I
        //    94: aload_1        
        //    95: getfield        com/google/gz.d:I
        //    98: istore          12
        //   100: iconst_0       
        //   101: istore          13
        //   103: aload           4
        //   105: ifnull          115
        //   108: aload           4
        //   110: getfield        com/google/gz.d:I
        //   113: istore          13
        //   115: aload_2        
        //   116: iconst_1       
        //   117: iload           12
        //   119: iload           13
        //   121: invokestatic    java/lang/Math.max:(II)I
        //   124: iadd           
        //   125: putfield        com/google/gz.d:I
        //   128: return         
        //   129: astore          6
        //   131: aload           6
        //   133: athrow         
        //   134: astore          7
        //   136: aload           7
        //   138: athrow         
        //   139: iconst_0       
        //   140: istore          9
        //   142: goto            69
        //   145: astore          14
        //   147: aload           14
        //   149: athrow         
        //   150: iconst_0       
        //   151: istore          10
        //   153: goto            81
        //   156: astore          11
        //   158: aload           11
        //   160: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  22     28     129    134    Ljava/lang/NullPointerException;
        //  33     39     129    134    Ljava/lang/NullPointerException;
        //  39     55     134    139    Ljava/lang/NullPointerException;
        //  59     65     134    139    Ljava/lang/NullPointerException;
        //  74     81     145    150    Ljava/lang/NullPointerException;
        //  81     100    156    161    Ljava/lang/NullPointerException;
        //  108    115    156    161    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 85, Size: 85
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
    
    private void a(final gz p0, final gz p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/n.e:I
        //     3: istore_3       
        //     4: aload_1        
        //     5: getfield        com/google/gz.e:Lcom/google/gz;
        //     8: astore          4
        //    10: aload_1        
        //    11: aconst_null    
        //    12: putfield        com/google/gz.e:Lcom/google/gz;
        //    15: aload_2        
        //    16: ifnull          25
        //    19: aload_2        
        //    20: aload           4
        //    22: putfield        com/google/gz.e:Lcom/google/gz;
        //    25: aload           4
        //    27: ifnull          115
        //    30: aload           4
        //    32: getfield        com/google/gz.f:Lcom/google/gz;
        //    35: astore          11
        //    37: aload           11
        //    39: aload_1        
        //    40: if_acmpne       53
        //    43: aload           4
        //    45: aload_2        
        //    46: putfield        com/google/gz.f:Lcom/google/gz;
        //    49: iload_3        
        //    50: ifeq            137
        //    53: getstatic       com/google/n.b:Z
        //    56: istore          12
        //    58: iload           12
        //    60: ifne            105
        //    63: aload           4
        //    65: getfield        com/google/gz.b:Lcom/google/gz;
        //    68: aload_1        
        //    69: if_acmpeq       105
        //    72: new             Ljava/lang/AssertionError;
        //    75: dup            
        //    76: invokespecial   java/lang/AssertionError.<init>:()V
        //    79: athrow         
        //    80: astore          10
        //    82: aload           10
        //    84: athrow         
        //    85: astore          5
        //    87: aload           5
        //    89: athrow         
        //    90: astore          7
        //    92: aload           7
        //    94: athrow         
        //    95: astore          8
        //    97: aload           8
        //    99: athrow         
        //   100: astore          9
        //   102: aload           9
        //   104: athrow         
        //   105: aload           4
        //   107: aload_2        
        //   108: putfield        com/google/gz.b:Lcom/google/gz;
        //   111: iload_3        
        //   112: ifeq            137
        //   115: aload_1        
        //   116: getfield        com/google/gz.a:I
        //   119: iconst_m1      
        //   120: aload_0        
        //   121: getfield        com/google/n.f:[Lcom/google/gz;
        //   124: arraylength    
        //   125: iadd           
        //   126: iand           
        //   127: istore          6
        //   129: aload_0        
        //   130: getfield        com/google/n.f:[Lcom/google/gz;
        //   133: iload           6
        //   135: aload_2        
        //   136: aastore        
        //   137: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  10     15     85     90     Ljava/lang/NullPointerException;
        //  19     25     85     90     Ljava/lang/NullPointerException;
        //  30     37     90     95     Ljava/lang/NullPointerException;
        //  43     49     95     100    Ljava/lang/NullPointerException;
        //  53     58     100    105    Ljava/lang/NullPointerException;
        //  63     80     80     85     Ljava/lang/NullPointerException;
        //  92     95     95     100    Ljava/lang/NullPointerException;
        //  97     100    100    105    Ljava/lang/NullPointerException;
        //  102    105    80     85     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 73, Size: 73
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
    
    private boolean a(final Object o, final Object o2) {
        if (o == o2) {
            return true;
        }
        if (o == null) {
            return false;
        }
        try {
            if (o.equals(o2)) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    static gz[] a(final gz[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/n.e:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: arraylength    
        //     6: istore_2       
        //     7: iload_2        
        //     8: iconst_2       
        //     9: imul           
        //    10: anewarray       Lcom/google/gz;
        //    13: astore_3       
        //    14: new             Lcom/google/ac;
        //    17: dup            
        //    18: invokespecial   com/google/ac.<init>:()V
        //    21: astore          4
        //    23: new             Lcom/google/cj;
        //    26: dup            
        //    27: invokespecial   com/google/cj.<init>:()V
        //    30: astore          5
        //    32: new             Lcom/google/cj;
        //    35: dup            
        //    36: invokespecial   com/google/cj.<init>:()V
        //    39: astore          6
        //    41: iconst_0       
        //    42: istore          7
        //    44: iload           7
        //    46: iload_2        
        //    47: if_icmpge       243
        //    50: aload_0        
        //    51: iload           7
        //    53: aaload         
        //    54: astore          8
        //    56: aload           8
        //    58: ifnonnull       65
        //    61: iload_1        
        //    62: ifeq            233
        //    65: aload           4
        //    67: aload           8
        //    69: invokevirtual   com/google/ac.a:(Lcom/google/gz;)V
        //    72: iconst_0       
        //    73: istore          9
        //    75: iconst_0       
        //    76: istore          10
        //    78: aload           4
        //    80: invokevirtual   com/google/ac.a:()Lcom/google/gz;
        //    83: astore          11
        //    85: aload           11
        //    87: ifnull          118
        //    90: aload           11
        //    92: getfield        com/google/gz.a:I
        //    95: istore          23
        //    97: iload           23
        //    99: iload_2        
        //   100: iand           
        //   101: ifne            111
        //   104: iinc            10, 1
        //   107: iload_1        
        //   108: ifeq            78
        //   111: iinc            9, 1
        //   114: iload_1        
        //   115: ifeq            78
        //   118: aload           5
        //   120: iload           10
        //   122: invokevirtual   com/google/cj.a:(I)V
        //   125: aload           6
        //   127: iload           9
        //   129: invokevirtual   com/google/cj.a:(I)V
        //   132: aload           4
        //   134: aload           8
        //   136: invokevirtual   com/google/ac.a:(Lcom/google/gz;)V
        //   139: aload           4
        //   141: invokevirtual   com/google/ac.a:()Lcom/google/gz;
        //   144: astore          12
        //   146: aload           12
        //   148: ifnull          183
        //   151: iload_2        
        //   152: aload           12
        //   154: getfield        com/google/gz.a:I
        //   157: iand           
        //   158: ifne            172
        //   161: aload           5
        //   163: aload           12
        //   165: invokevirtual   com/google/cj.a:(Lcom/google/gz;)V
        //   168: iload_1        
        //   169: ifeq            139
        //   172: aload           6
        //   174: aload           12
        //   176: invokevirtual   com/google/cj.a:(Lcom/google/gz;)V
        //   179: iload_1        
        //   180: ifeq            139
        //   183: iload           10
        //   185: ifle            260
        //   188: aload           5
        //   190: invokevirtual   com/google/cj.a:()Lcom/google/gz;
        //   193: astore          20
        //   195: aload           20
        //   197: astore          13
        //   199: aload_3        
        //   200: iload           7
        //   202: aload           13
        //   204: aastore        
        //   205: iload           7
        //   207: iload_2        
        //   208: iadd           
        //   209: istore          15
        //   211: iload           9
        //   213: ifle            271
        //   216: aload           6
        //   218: invokevirtual   com/google/cj.a:()Lcom/google/gz;
        //   221: astore          16
        //   223: aload           16
        //   225: astore          17
        //   227: aload_3        
        //   228: iload           15
        //   230: aload           17
        //   232: aastore        
        //   233: iload           7
        //   235: iconst_1       
        //   236: iadd           
        //   237: istore          18
        //   239: iload_1        
        //   240: ifeq            277
        //   243: aload_3        
        //   244: areturn        
        //   245: astore          22
        //   247: aload           22
        //   249: athrow         
        //   250: astore          21
        //   252: aload           21
        //   254: athrow         
        //   255: astore          19
        //   257: aload           19
        //   259: athrow         
        //   260: aconst_null    
        //   261: astore          13
        //   263: goto            199
        //   266: astore          14
        //   268: aload           14
        //   270: athrow         
        //   271: aconst_null    
        //   272: astore          17
        //   274: goto            227
        //   277: iload           18
        //   279: istore          7
        //   281: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  90     97     245    250    Ljava/lang/NullPointerException;
        //  151    168    250    255    Ljava/lang/NullPointerException;
        //  188    195    255    260    Ljava/lang/NullPointerException;
        //  199    205    266    271    Ljava/lang/NullPointerException;
        //  216    223    266    271    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 144, Size: 144
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
    
    private void b(final gz p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        com/google/gz.f:Lcom/google/gz;
        //     4: astore_2       
        //     5: aload_1        
        //     6: getfield        com/google/gz.b:Lcom/google/gz;
        //     9: astore_3       
        //    10: aload_3        
        //    11: getfield        com/google/gz.f:Lcom/google/gz;
        //    14: astore          4
        //    16: aload_3        
        //    17: getfield        com/google/gz.b:Lcom/google/gz;
        //    20: astore          5
        //    22: aload_1        
        //    23: aload           4
        //    25: putfield        com/google/gz.b:Lcom/google/gz;
        //    28: aload           4
        //    30: ifnull          39
        //    33: aload           4
        //    35: aload_1        
        //    36: putfield        com/google/gz.e:Lcom/google/gz;
        //    39: aload_0        
        //    40: aload_1        
        //    41: aload_3        
        //    42: invokespecial   com/google/n.a:(Lcom/google/gz;Lcom/google/gz;)V
        //    45: aload_3        
        //    46: aload_1        
        //    47: putfield        com/google/gz.f:Lcom/google/gz;
        //    50: aload_1        
        //    51: aload_3        
        //    52: putfield        com/google/gz.e:Lcom/google/gz;
        //    55: aload_2        
        //    56: ifnull          139
        //    59: aload_2        
        //    60: getfield        com/google/gz.d:I
        //    63: istore          8
        //    65: iload           8
        //    67: istore          9
        //    69: aload           4
        //    71: ifnull          150
        //    74: aload           4
        //    76: getfield        com/google/gz.d:I
        //    79: istore          10
        //    81: aload_1        
        //    82: iconst_1       
        //    83: iload           9
        //    85: iload           10
        //    87: invokestatic    java/lang/Math.max:(II)I
        //    90: iadd           
        //    91: putfield        com/google/gz.d:I
        //    94: aload_1        
        //    95: getfield        com/google/gz.d:I
        //    98: istore          12
        //   100: iconst_0       
        //   101: istore          13
        //   103: aload           5
        //   105: ifnull          115
        //   108: aload           5
        //   110: getfield        com/google/gz.d:I
        //   113: istore          13
        //   115: aload_3        
        //   116: iconst_1       
        //   117: iload           12
        //   119: iload           13
        //   121: invokestatic    java/lang/Math.max:(II)I
        //   124: iadd           
        //   125: putfield        com/google/gz.d:I
        //   128: return         
        //   129: astore          6
        //   131: aload           6
        //   133: athrow         
        //   134: astore          7
        //   136: aload           7
        //   138: athrow         
        //   139: iconst_0       
        //   140: istore          9
        //   142: goto            69
        //   145: astore          14
        //   147: aload           14
        //   149: athrow         
        //   150: iconst_0       
        //   151: istore          10
        //   153: goto            81
        //   156: astore          11
        //   158: aload           11
        //   160: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  22     28     129    134    Ljava/lang/NullPointerException;
        //  33     39     129    134    Ljava/lang/NullPointerException;
        //  39     55     134    139    Ljava/lang/NullPointerException;
        //  59     65     134    139    Ljava/lang/NullPointerException;
        //  74     81     145    150    Ljava/lang/NullPointerException;
        //  81     100    156    161    Ljava/lang/NullPointerException;
        //  108    115    156    161    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 85, Size: 85
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
    
    private void b(final gz p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/n.e:I
        //     3: istore_3       
        //     4: aload_1        
        //     5: ifnull          506
        //     8: aload_1        
        //     9: getfield        com/google/gz.f:Lcom/google/gz;
        //    12: astore          4
        //    14: aload_1        
        //    15: getfield        com/google/gz.b:Lcom/google/gz;
        //    18: astore          5
        //    20: aload           4
        //    22: ifnull          165
        //    25: aload           4
        //    27: getfield        com/google/gz.d:I
        //    30: istore          6
        //    32: aload           5
        //    34: ifnull          176
        //    37: aload           5
        //    39: getfield        com/google/gz.d:I
        //    42: istore          40
        //    44: iload           40
        //    46: istore          7
        //    48: iload           6
        //    50: iload           7
        //    52: isub           
        //    53: istore          8
        //    55: iload           8
        //    57: bipush          -2
        //    59: if_icmpne       237
        //    62: aload           5
        //    64: getfield        com/google/gz.f:Lcom/google/gz;
        //    67: astore          28
        //    69: aload           5
        //    71: getfield        com/google/gz.b:Lcom/google/gz;
        //    74: astore          29
        //    76: aload           29
        //    78: ifnull          187
        //    81: aload           29
        //    83: getfield        com/google/gz.d:I
        //    86: istore          30
        //    88: aload           28
        //    90: ifnull          198
        //    93: aload           28
        //    95: getfield        com/google/gz.d:I
        //    98: istore          31
        //   100: iload           31
        //   102: iload           30
        //   104: isub           
        //   105: istore          32
        //   107: iload           32
        //   109: iconst_m1      
        //   110: if_icmpeq       122
        //   113: iload           32
        //   115: ifne            131
        //   118: iload_2        
        //   119: ifne            131
        //   122: aload_0        
        //   123: aload_1        
        //   124: invokespecial   com/google/n.b:(Lcom/google/gz;)V
        //   127: iload_3        
        //   128: ifeq            225
        //   131: getstatic       com/google/n.b:Z
        //   134: istore          36
        //   136: iload           36
        //   138: ifne            214
        //   141: iload           32
        //   143: iconst_1       
        //   144: if_icmpeq       214
        //   147: new             Ljava/lang/AssertionError;
        //   150: dup            
        //   151: invokespecial   java/lang/AssertionError.<init>:()V
        //   154: athrow         
        //   155: astore          35
        //   157: aload           35
        //   159: athrow         
        //   160: astore          41
        //   162: aload           41
        //   164: athrow         
        //   165: iconst_0       
        //   166: istore          6
        //   168: goto            32
        //   171: astore          39
        //   173: aload           39
        //   175: athrow         
        //   176: iconst_0       
        //   177: istore          7
        //   179: goto            48
        //   182: astore          38
        //   184: aload           38
        //   186: athrow         
        //   187: iconst_0       
        //   188: istore          30
        //   190: goto            88
        //   193: astore          37
        //   195: aload           37
        //   197: athrow         
        //   198: iconst_0       
        //   199: istore          31
        //   201: goto            100
        //   204: astore          33
        //   206: aload           33
        //   208: athrow         
        //   209: astore          34
        //   211: aload           34
        //   213: athrow         
        //   214: aload_0        
        //   215: aload           5
        //   217: invokespecial   com/google/n.a:(Lcom/google/gz;)V
        //   220: aload_0        
        //   221: aload_1        
        //   222: invokespecial   com/google/n.b:(Lcom/google/gz;)V
        //   225: iload_2        
        //   226: ifeq            233
        //   229: iload_3        
        //   230: ifeq            506
        //   233: iload_3        
        //   234: ifeq            497
        //   237: iload           8
        //   239: iconst_2       
        //   240: if_icmpne       396
        //   243: aload           4
        //   245: getfield        com/google/gz.f:Lcom/google/gz;
        //   248: astore          17
        //   250: aload           4
        //   252: getfield        com/google/gz.b:Lcom/google/gz;
        //   255: astore          18
        //   257: aload           18
        //   259: ifnull          346
        //   262: aload           18
        //   264: getfield        com/google/gz.d:I
        //   267: istore          19
        //   269: aload           17
        //   271: ifnull          357
        //   274: aload           17
        //   276: getfield        com/google/gz.d:I
        //   279: istore          20
        //   281: iload           20
        //   283: iload           19
        //   285: isub           
        //   286: istore          21
        //   288: iload           21
        //   290: iconst_1       
        //   291: if_icmpeq       303
        //   294: iload           21
        //   296: ifne            312
        //   299: iload_2        
        //   300: ifne            312
        //   303: aload_0        
        //   304: aload_1        
        //   305: invokespecial   com/google/n.a:(Lcom/google/gz;)V
        //   308: iload_3        
        //   309: ifeq            384
        //   312: getstatic       com/google/n.b:Z
        //   315: istore          25
        //   317: iload           25
        //   319: ifne            373
        //   322: iload           21
        //   324: iconst_m1      
        //   325: if_icmpeq       373
        //   328: new             Ljava/lang/AssertionError;
        //   331: dup            
        //   332: invokespecial   java/lang/AssertionError.<init>:()V
        //   335: athrow         
        //   336: astore          24
        //   338: aload           24
        //   340: athrow         
        //   341: astore          27
        //   343: aload           27
        //   345: athrow         
        //   346: iconst_0       
        //   347: istore          19
        //   349: goto            269
        //   352: astore          26
        //   354: aload           26
        //   356: athrow         
        //   357: iconst_0       
        //   358: istore          20
        //   360: goto            281
        //   363: astore          22
        //   365: aload           22
        //   367: athrow         
        //   368: astore          23
        //   370: aload           23
        //   372: athrow         
        //   373: aload_0        
        //   374: aload           4
        //   376: invokespecial   com/google/n.b:(Lcom/google/gz;)V
        //   379: aload_0        
        //   380: aload_1        
        //   381: invokespecial   com/google/n.a:(Lcom/google/gz;)V
        //   384: iload_2        
        //   385: ifeq            392
        //   388: iload_3        
        //   389: ifeq            506
        //   392: iload_3        
        //   393: ifeq            497
        //   396: iload           8
        //   398: ifne            421
        //   401: iload           6
        //   403: iconst_1       
        //   404: iadd           
        //   405: istore          14
        //   407: aload_1        
        //   408: iload           14
        //   410: putfield        com/google/gz.d:I
        //   413: iload_2        
        //   414: ifeq            497
        //   417: iload_3        
        //   418: ifeq            506
        //   421: getstatic       com/google/n.b:Z
        //   424: istore          12
        //   426: iload           12
        //   428: ifne            476
        //   431: iload           8
        //   433: iconst_m1      
        //   434: if_icmpeq       476
        //   437: iload           8
        //   439: iconst_1       
        //   440: if_icmpeq       476
        //   443: new             Ljava/lang/AssertionError;
        //   446: dup            
        //   447: invokespecial   java/lang/AssertionError.<init>:()V
        //   450: athrow         
        //   451: astore          11
        //   453: aload           11
        //   455: athrow         
        //   456: astore          15
        //   458: aload           15
        //   460: athrow         
        //   461: astore          16
        //   463: aload           16
        //   465: athrow         
        //   466: astore          9
        //   468: aload           9
        //   470: athrow         
        //   471: astore          10
        //   473: aload           10
        //   475: athrow         
        //   476: aload_1        
        //   477: iconst_1       
        //   478: iload           6
        //   480: iload           7
        //   482: invokestatic    java/lang/Math.max:(II)I
        //   485: iadd           
        //   486: putfield        com/google/gz.d:I
        //   489: iload_2        
        //   490: ifne            497
        //   493: iload_3        
        //   494: ifeq            506
        //   497: aload_1        
        //   498: getfield        com/google/gz.e:Lcom/google/gz;
        //   501: astore_1       
        //   502: iload_3        
        //   503: ifeq            4
        //   506: return         
        //   507: astore          13
        //   509: aload           13
        //   511: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  25     32     160    165    Ljava/lang/NullPointerException;
        //  37     44     171    176    Ljava/lang/NullPointerException;
        //  81     88     182    187    Ljava/lang/NullPointerException;
        //  93     100    193    198    Ljava/lang/NullPointerException;
        //  122    127    204    209    Ljava/lang/NullPointerException;
        //  131    136    209    214    Ljava/lang/NullPointerException;
        //  147    155    155    160    Ljava/lang/NullPointerException;
        //  206    209    209    214    Ljava/lang/NullPointerException;
        //  211    214    155    160    Ljava/lang/NullPointerException;
        //  262    269    341    346    Ljava/lang/NullPointerException;
        //  274    281    352    357    Ljava/lang/NullPointerException;
        //  303    308    363    368    Ljava/lang/NullPointerException;
        //  312    317    368    373    Ljava/lang/NullPointerException;
        //  328    336    336    341    Ljava/lang/NullPointerException;
        //  365    368    368    373    Ljava/lang/NullPointerException;
        //  370    373    336    341    Ljava/lang/NullPointerException;
        //  407    413    456    466    Ljava/lang/NullPointerException;
        //  421    426    466    476    Ljava/lang/NullPointerException;
        //  443    451    451    456    Ljava/lang/NullPointerException;
        //  458    461    461    466    Ljava/lang/NullPointerException;
        //  463    466    466    476    Ljava/lang/NullPointerException;
        //  468    471    471    476    Ljava/lang/NullPointerException;
        //  473    476    451    456    Ljava/lang/NullPointerException;
        //  476    489    507    512    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 258, Size: 258
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
    
    private Object writeReplace() {
        return new LinkedHashMap(this);
    }
    
    gz a(final Object o) {
        final gz b = this.b(o);
        if (b == null) {
            return b;
        }
        try {
            this.a(b, true);
            return b;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    gz a(final Object p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        com/google/n.g:Ljava/util/Comparator;
        //     8: astore          4
        //    10: aload_0        
        //    11: getfield        com/google/n.f:[Lcom/google/gz;
        //    14: astore          5
        //    16: aload_1        
        //    17: invokevirtual   java/lang/Object.hashCode:()I
        //    20: invokestatic    com/google/n.a:(I)I
        //    23: istore          6
        //    25: iload           6
        //    27: iconst_m1      
        //    28: aload           5
        //    30: arraylength    
        //    31: iadd           
        //    32: iand           
        //    33: istore          7
        //    35: aload           5
        //    37: iload           7
        //    39: aaload         
        //    40: astore          8
        //    42: iconst_0       
        //    43: istore          9
        //    45: aload           8
        //    47: ifnull          406
        //    50: aload           4
        //    52: getstatic       com/google/n.h:Ljava/util/Comparator;
        //    55: if_acmpne       100
        //    58: aload_1        
        //    59: checkcast       Ljava/lang/Comparable;
        //    62: astore          24
        //    64: aload           24
        //    66: ifnull          106
        //    69: aload           24
        //    71: aload           8
        //    73: getfield        com/google/gz.g:Ljava/lang/Object;
        //    76: invokeinterface java/lang/Comparable.compareTo:(Ljava/lang/Object;)I
        //    81: istore          9
        //    83: iload           9
        //    85: ifne            124
        //    88: aload           8
        //    90: astore          12
        //    92: aload           12
        //    94: areturn        
        //    95: astore          23
        //    97: aload           23
        //    99: athrow         
        //   100: aconst_null    
        //   101: astore          24
        //   103: goto            64
        //   106: aload           4
        //   108: aload_1        
        //   109: aload           8
        //   111: getfield        com/google/gz.g:Ljava/lang/Object;
        //   114: invokeinterface java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I
        //   119: istore          9
        //   121: goto            83
        //   124: iload           9
        //   126: ifge            240
        //   129: aload           8
        //   131: getfield        com/google/gz.f:Lcom/google/gz;
        //   134: astore          25
        //   136: aload           25
        //   138: ifnonnull       145
        //   141: iload_3        
        //   142: ifeq            406
        //   145: iload_3        
        //   146: ifeq            399
        //   149: iload           9
        //   151: istore          10
        //   153: aload           25
        //   155: astore          11
        //   157: aconst_null    
        //   158: astore          12
        //   160: iload_2        
        //   161: ifeq            92
        //   164: aload_0        
        //   165: getfield        com/google/n.i:Lcom/google/gz;
        //   168: astore          13
        //   170: aload           11
        //   172: ifnonnull       287
        //   175: getstatic       com/google/n.h:Ljava/util/Comparator;
        //   178: astore          21
        //   180: aload           4
        //   182: aload           21
        //   184: if_acmpne       255
        //   187: aload_1        
        //   188: instanceof      Ljava/lang/Comparable;
        //   191: ifne            255
        //   194: new             Ljava/lang/ClassCastException;
        //   197: dup            
        //   198: new             Ljava/lang/StringBuilder;
        //   201: dup            
        //   202: invokespecial   java/lang/StringBuilder.<init>:()V
        //   205: aload_1        
        //   206: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   209: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   215: getstatic       com/google/n.z:[Ljava/lang/String;
        //   218: iconst_1       
        //   219: aaload         
        //   220: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   223: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   226: invokespecial   java/lang/ClassCastException.<init>:(Ljava/lang/String;)V
        //   229: athrow         
        //   230: astore          20
        //   232: aload           20
        //   234: athrow         
        //   235: astore          26
        //   237: aload           26
        //   239: athrow         
        //   240: aload           8
        //   242: getfield        com/google/gz.b:Lcom/google/gz;
        //   245: astore          25
        //   247: goto            136
        //   250: astore          19
        //   252: aload           19
        //   254: athrow         
        //   255: new             Lcom/google/gz;
        //   258: dup            
        //   259: aload           11
        //   261: aload_1        
        //   262: iload           6
        //   264: aload           13
        //   266: aload           13
        //   268: getfield        com/google/gz.h:Lcom/google/gz;
        //   271: invokespecial   com/google/gz.<init>:(Lcom/google/gz;Ljava/lang/Object;ILcom/google/gz;Lcom/google/gz;)V
        //   274: astore          22
        //   276: aload           5
        //   278: iload           7
        //   280: aload           22
        //   282: aastore        
        //   283: iload_3        
        //   284: ifeq            392
        //   287: new             Lcom/google/gz;
        //   290: dup            
        //   291: aload           11
        //   293: aload_1        
        //   294: iload           6
        //   296: aload           13
        //   298: aload           13
        //   300: getfield        com/google/gz.h:Lcom/google/gz;
        //   303: invokespecial   com/google/gz.<init>:(Lcom/google/gz;Ljava/lang/Object;ILcom/google/gz;Lcom/google/gz;)V
        //   306: astore          14
        //   308: iload           10
        //   310: ifge            324
        //   313: aload           11
        //   315: aload           14
        //   317: putfield        com/google/gz.f:Lcom/google/gz;
        //   320: iload_3        
        //   321: ifeq            331
        //   324: aload           11
        //   326: aload           14
        //   328: putfield        com/google/gz.b:Lcom/google/gz;
        //   331: aload_0        
        //   332: aload           11
        //   334: iconst_1       
        //   335: invokespecial   com/google/n.b:(Lcom/google/gz;Z)V
        //   338: aload           14
        //   340: astore          16
        //   342: aload_0        
        //   343: getfield        com/google/n.a:I
        //   346: istore          18
        //   348: aload_0        
        //   349: iload           18
        //   351: iconst_1       
        //   352: iadd           
        //   353: putfield        com/google/n.a:I
        //   356: iload           18
        //   358: aload_0        
        //   359: getfield        com/google/n.j:I
        //   362: if_icmple       369
        //   365: aload_0        
        //   366: invokespecial   com/google/n.a:()V
        //   369: aload_0        
        //   370: iconst_1       
        //   371: aload_0        
        //   372: getfield        com/google/n.k:I
        //   375: iadd           
        //   376: putfield        com/google/n.k:I
        //   379: aload           16
        //   381: areturn        
        //   382: astore          15
        //   384: aload           15
        //   386: athrow         
        //   387: astore          17
        //   389: aload           17
        //   391: athrow         
        //   392: aload           22
        //   394: astore          16
        //   396: goto            342
        //   399: aload           25
        //   401: astore          8
        //   403: goto            64
        //   406: iload           9
        //   408: istore          10
        //   410: aload           8
        //   412: astore          11
        //   414: goto            157
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  50     64     95     100    Ljava/lang/NullPointerException;
        //  129    136    235    240    Ljava/lang/NullPointerException;
        //  175    180    250    255    Ljava/lang/NullPointerException;
        //  187    230    230    235    Ljava/lang/NullPointerException;
        //  252    255    230    235    Ljava/lang/NullPointerException;
        //  313    320    382    387    Ljava/lang/NullPointerException;
        //  324    331    382    387    Ljava/lang/NullPointerException;
        //  342    369    387    392    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0342:
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
    
    gz a(final Entry entry) {
        final gz b = this.b(entry.getKey());
        while (true) {
            Label_0049: {
                if (b == null) {
                    break Label_0049;
                }
                try {
                    if (this.a(b.c, entry.getValue())) {
                        final int n = 1;
                        if (n != 0) {
                            return b;
                        }
                        return null;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
            final int n = 0;
            continue;
        }
    }
    
    void a(final gz p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: iload_2        
        //     5: ifeq            40
        //     8: aload_1        
        //     9: getfield        com/google/gz.h:Lcom/google/gz;
        //    12: aload_1        
        //    13: getfield        com/google/gz.i:Lcom/google/gz;
        //    16: putfield        com/google/gz.i:Lcom/google/gz;
        //    19: aload_1        
        //    20: getfield        com/google/gz.i:Lcom/google/gz;
        //    23: aload_1        
        //    24: getfield        com/google/gz.h:Lcom/google/gz;
        //    27: putfield        com/google/gz.h:Lcom/google/gz;
        //    30: aload_1        
        //    31: aconst_null    
        //    32: putfield        com/google/gz.h:Lcom/google/gz;
        //    35: aload_1        
        //    36: aconst_null    
        //    37: putfield        com/google/gz.i:Lcom/google/gz;
        //    40: aload_1        
        //    41: getfield        com/google/gz.f:Lcom/google/gz;
        //    44: astore          4
        //    46: aload_1        
        //    47: getfield        com/google/gz.b:Lcom/google/gz;
        //    50: astore          5
        //    52: aload_1        
        //    53: getfield        com/google/gz.e:Lcom/google/gz;
        //    56: astore          6
        //    58: aload           4
        //    60: ifnull          218
        //    63: aload           5
        //    65: ifnull          218
        //    68: aload           4
        //    70: getfield        com/google/gz.d:I
        //    73: aload           5
        //    75: getfield        com/google/gz.d:I
        //    78: if_icmple       208
        //    81: aload           4
        //    83: invokevirtual   com/google/gz.a:()Lcom/google/gz;
        //    86: astore          17
        //    88: aload           17
        //    90: astore          12
        //    92: aload_0        
        //    93: aload           12
        //    95: iconst_0       
        //    96: invokevirtual   com/google/n.a:(Lcom/google/gz;Z)V
        //    99: aload_1        
        //   100: getfield        com/google/gz.f:Lcom/google/gz;
        //   103: astore          13
        //   105: aload           13
        //   107: ifnull          326
        //   110: aload           13
        //   112: getfield        com/google/gz.d:I
        //   115: istore          14
        //   117: aload           12
        //   119: aload           13
        //   121: putfield        com/google/gz.f:Lcom/google/gz;
        //   124: aload           13
        //   126: aload           12
        //   128: putfield        com/google/gz.e:Lcom/google/gz;
        //   131: aload_1        
        //   132: aconst_null    
        //   133: putfield        com/google/gz.f:Lcom/google/gz;
        //   136: aload_1        
        //   137: getfield        com/google/gz.b:Lcom/google/gz;
        //   140: astore          15
        //   142: iconst_0       
        //   143: istore          16
        //   145: aload           15
        //   147: ifnull          176
        //   150: aload           15
        //   152: getfield        com/google/gz.d:I
        //   155: istore          16
        //   157: aload           12
        //   159: aload           15
        //   161: putfield        com/google/gz.b:Lcom/google/gz;
        //   164: aload           15
        //   166: aload           12
        //   168: putfield        com/google/gz.e:Lcom/google/gz;
        //   171: aload_1        
        //   172: aconst_null    
        //   173: putfield        com/google/gz.b:Lcom/google/gz;
        //   176: aload           12
        //   178: iconst_1       
        //   179: iload           14
        //   181: iload           16
        //   183: invokestatic    java/lang/Math.max:(II)I
        //   186: iadd           
        //   187: putfield        com/google/gz.d:I
        //   190: aload_0        
        //   191: aload_1        
        //   192: aload           12
        //   194: invokespecial   com/google/n.a:(Lcom/google/gz;Lcom/google/gz;)V
        //   197: return         
        //   198: astore          18
        //   200: aload           18
        //   202: athrow         
        //   203: astore          11
        //   205: aload           11
        //   207: athrow         
        //   208: aload           5
        //   210: invokevirtual   com/google/gz.b:()Lcom/google/gz;
        //   213: astore          12
        //   215: goto            92
        //   218: aload           4
        //   220: ifnull          239
        //   223: aload_0        
        //   224: aload_1        
        //   225: aload           4
        //   227: invokespecial   com/google/n.a:(Lcom/google/gz;Lcom/google/gz;)V
        //   230: aload_1        
        //   231: aconst_null    
        //   232: putfield        com/google/gz.f:Lcom/google/gz;
        //   235: iload_3        
        //   236: ifeq            266
        //   239: aload           5
        //   241: ifnull          260
        //   244: aload_0        
        //   245: aload_1        
        //   246: aload           5
        //   248: invokespecial   com/google/n.a:(Lcom/google/gz;Lcom/google/gz;)V
        //   251: aload_1        
        //   252: aconst_null    
        //   253: putfield        com/google/gz.b:Lcom/google/gz;
        //   256: iload_3        
        //   257: ifeq            266
        //   260: aload_0        
        //   261: aload_1        
        //   262: aconst_null    
        //   263: invokespecial   com/google/n.a:(Lcom/google/gz;Lcom/google/gz;)V
        //   266: aload_0        
        //   267: aload           6
        //   269: iconst_0       
        //   270: invokespecial   com/google/n.b:(Lcom/google/gz;Z)V
        //   273: aload_0        
        //   274: iconst_m1      
        //   275: aload_0        
        //   276: getfield        com/google/n.a:I
        //   279: iadd           
        //   280: putfield        com/google/n.a:I
        //   283: aload_0        
        //   284: iconst_1       
        //   285: aload_0        
        //   286: getfield        com/google/n.k:I
        //   289: iadd           
        //   290: putfield        com/google/n.k:I
        //   293: getstatic       com/google/e_.a:Z
        //   296: ifeq            197
        //   299: iload_3        
        //   300: iconst_1       
        //   301: iadd           
        //   302: putstatic       com/google/n.e:I
        //   305: return         
        //   306: astore          8
        //   308: aload           8
        //   310: athrow         
        //   311: astore          9
        //   313: aload           9
        //   315: athrow         
        //   316: astore          10
        //   318: aload           10
        //   320: athrow         
        //   321: astore          7
        //   323: aload           7
        //   325: athrow         
        //   326: iconst_0       
        //   327: istore          14
        //   329: goto            136
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  8      40     198    203    Ljava/lang/NullPointerException;
        //  68     88     203    208    Ljava/lang/NullPointerException;
        //  223    235    311    321    Ljava/lang/NullPointerException;
        //  244    256    321    326    Ljava/lang/NullPointerException;
        //  260    266    321    326    Ljava/lang/NullPointerException;
        //  266    305    306    311    Ljava/lang/NullPointerException;
        //  313    316    316    321    Ljava/lang/NullPointerException;
        //  318    321    321    326    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0092:
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
    
    gz b(final Object o) {
        gz a = null;
        if (o == null) {
            return a;
        }
        try {
            a = this.a(o, false);
            return a;
        }
        catch (ClassCastException ex) {
            try {
                throw ex;
            }
            catch (ClassCastException ex2) {
                return null;
            }
        }
    }
    
    @Override
    public void clear() {
        final int e = n.e;
        Arrays.fill(this.f, null);
        this.a = 0;
        ++this.k;
        final gz i = this.i;
        gz k;
        for (gz j = i.i; j != i; j = k) {
            k = j.i;
            j.h = null;
            j.i = null;
            if (e != 0) {
                break;
            }
        }
        i.h = i;
        i.i = i;
    }
    
    @Override
    public boolean containsKey(final Object o) {
        try {
            if (this.b(o) != null) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public Set entrySet() {
        final fF c = this.c;
        if (c != null) {
            return c;
        }
        return this.c = new fF(this);
    }
    
    @Override
    public Object get(final Object o) {
        final gz b = this.b(o);
        if (b != null) {
            try {
                return b.c;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return null;
    }
    
    @Override
    public Set keySet() {
        final hL d = this.d;
        if (d != null) {
            return d;
        }
        return this.d = new hL(this);
    }
    
    @Override
    public Object put(final Object o, final Object c) {
        if (o == null) {
            try {
                throw new NullPointerException(n.z[0]);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        final gz a = this.a(o, true);
        final Object c2 = a.c;
        a.c = c;
        return c2;
    }
    
    @Override
    public Object remove(final Object o) {
        final gz a = this.a(o);
        if (a != null) {
            try {
                return a.c;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return null;
    }
    
    @Override
    public int size() {
        return this.a;
    }
}
