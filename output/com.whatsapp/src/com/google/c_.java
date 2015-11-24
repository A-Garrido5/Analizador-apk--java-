// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.Serializable;

public class c_ implements Serializable
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    private String a;
    private boolean b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private String g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private String m;
    private b6 n;
    
    static {
        final String[] z2 = new String[6];
        String s = "hFR-1&pC6:r#";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'T';
                        break;
                    }
                    case 0: {
                        c2 = 'H';
                        break;
                    }
                    case 1: {
                        c2 = '\u0003';
                        break;
                    }
                    case 2: {
                        c2 = '*';
                        break;
                    }
                    case 3: {
                        c2 = 'Y';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "hSX<2-qX<0hGE41;wC:t\u000bbX+=-q\n\u001a;,f\u0010y";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "hMK-='mK5t\u0006vG;1:9\n";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "hOO80!mMy\u000e-qEct<q_<";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "h@E,:<qSy\u0017'gOy\u0007'vX:1r#";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000bl_7 :z\n\u001a;,f\u0010y";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public c_() {
        this.c = 0;
        this.i = 0L;
        this.g = "";
        this.d = false;
        this.m = "";
        this.a = "";
        this.n = b6.FROM_NUMBER_WITH_PLUS_SIGN;
    }
    
    public c_ a() {
        this.f = false;
        this.g = "";
        return this;
    }
    
    public c_ a(final int c) {
        this.l = true;
        this.c = c;
        return this;
    }
    
    public c_ a(final long i) {
        this.e = true;
        this.i = i;
        return this;
    }
    
    public c_ a(final b6 n) {
        if (n == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.k = true;
        this.n = n;
        return this;
    }
    
    public c_ a(final c_ p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   com/google/c_.g:()Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: aload_1        
        //     9: invokevirtual   com/google/c_.n:()I
        //    12: invokevirtual   com/google/c_.a:(I)Lcom/google/c_;
        //    15: pop            
        //    16: aload_1        
        //    17: invokevirtual   com/google/c_.q:()Z
        //    20: ifeq            32
        //    23: aload_0        
        //    24: aload_1        
        //    25: invokevirtual   com/google/c_.e:()J
        //    28: invokevirtual   com/google/c_.a:(J)Lcom/google/c_;
        //    31: pop            
        //    32: aload_1        
        //    33: invokevirtual   com/google/c_.h:()Z
        //    36: ifeq            48
        //    39: aload_0        
        //    40: aload_1        
        //    41: invokevirtual   com/google/c_.c:()Ljava/lang/String;
        //    44: invokevirtual   com/google/c_.c:(Ljava/lang/String;)Lcom/google/c_;
        //    47: pop            
        //    48: aload_1        
        //    49: invokevirtual   com/google/c_.j:()Z
        //    52: ifeq            64
        //    55: aload_0        
        //    56: aload_1        
        //    57: invokevirtual   com/google/c_.d:()Z
        //    60: invokevirtual   com/google/c_.a:(Z)Lcom/google/c_;
        //    63: pop            
        //    64: aload_1        
        //    65: invokevirtual   com/google/c_.f:()Z
        //    68: ifeq            80
        //    71: aload_0        
        //    72: aload_1        
        //    73: invokevirtual   com/google/c_.u:()Ljava/lang/String;
        //    76: invokevirtual   com/google/c_.a:(Ljava/lang/String;)Lcom/google/c_;
        //    79: pop            
        //    80: aload_1        
        //    81: invokevirtual   com/google/c_.o:()Z
        //    84: ifeq            96
        //    87: aload_0        
        //    88: aload_1        
        //    89: invokevirtual   com/google/c_.r:()Lcom/google/b6;
        //    92: invokevirtual   com/google/c_.a:(Lcom/google/b6;)Lcom/google/c_;
        //    95: pop            
        //    96: aload_1        
        //    97: invokevirtual   com/google/c_.t:()Z
        //   100: ifeq            112
        //   103: aload_0        
        //   104: aload_1        
        //   105: invokevirtual   com/google/c_.l:()Ljava/lang/String;
        //   108: invokevirtual   com/google/c_.b:(Ljava/lang/String;)Lcom/google/c_;
        //   111: pop            
        //   112: aload_0        
        //   113: areturn        
        //   114: astore_2       
        //   115: aload_2        
        //   116: athrow         
        //   117: astore_3       
        //   118: aload_3        
        //   119: athrow         
        //   120: astore          4
        //   122: aload           4
        //   124: athrow         
        //   125: astore          5
        //   127: aload           5
        //   129: athrow         
        //   130: astore          6
        //   132: aload           6
        //   134: athrow         
        //   135: astore          7
        //   137: aload           7
        //   139: athrow         
        //   140: astore          8
        //   142: aload           8
        //   144: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      16     114    117    Ljava/lang/NullPointerException;
        //  16     32     117    120    Ljava/lang/NullPointerException;
        //  32     48     120    125    Ljava/lang/NullPointerException;
        //  48     64     125    130    Ljava/lang/NullPointerException;
        //  64     80     130    135    Ljava/lang/NullPointerException;
        //  80     96     135    140    Ljava/lang/NullPointerException;
        //  96     112    140    145    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 79, Size: 79
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
    
    public c_ a(final String m) {
        if (m == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.h = true;
        this.m = m;
        return this;
    }
    
    public c_ a(final boolean d) {
        this.b = true;
        this.d = d;
        return this;
    }
    
    public c_ b() {
        this.j = false;
        this.a = "";
        return this;
    }
    
    public c_ b(final String a) {
        if (a == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.j = true;
        this.a = a;
        return this;
    }
    
    public boolean b(final c_ p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_1        
        //     3: ifnonnull       10
        //     6: iconst_0       
        //     7: istore_2       
        //     8: iload_2        
        //     9: ireturn        
        //    10: aload_0        
        //    11: aload_1        
        //    12: if_acmpeq       8
        //    15: aload_0        
        //    16: getfield        com/google/c_.c:I
        //    19: istore          11
        //    21: aload_1        
        //    22: getfield        com/google/c_.c:I
        //    25: istore          12
        //    27: iload           11
        //    29: iload           12
        //    31: if_icmpne       165
        //    34: aload_0        
        //    35: getfield        com/google/c_.i:J
        //    38: lstore          13
        //    40: aload_1        
        //    41: getfield        com/google/c_.i:J
        //    44: lstore          15
        //    46: lload           13
        //    48: lload           15
        //    50: lcmp           
        //    51: ifne            165
        //    54: aload_0        
        //    55: getfield        com/google/c_.g:Ljava/lang/String;
        //    58: aload_1        
        //    59: getfield        com/google/c_.g:Ljava/lang/String;
        //    62: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    65: istore          17
        //    67: iload           17
        //    69: ifeq            165
        //    72: aload_0        
        //    73: getfield        com/google/c_.d:Z
        //    76: istore          18
        //    78: aload_1        
        //    79: getfield        com/google/c_.d:Z
        //    82: istore          19
        //    84: iload           18
        //    86: iload           19
        //    88: if_icmpne       165
        //    91: aload_0        
        //    92: getfield        com/google/c_.m:Ljava/lang/String;
        //    95: aload_1        
        //    96: getfield        com/google/c_.m:Ljava/lang/String;
        //    99: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   102: istore          20
        //   104: iload           20
        //   106: ifeq            165
        //   109: aload_0        
        //   110: getfield        com/google/c_.n:Lcom/google/b6;
        //   113: astore          21
        //   115: aload_1        
        //   116: getfield        com/google/c_.n:Lcom/google/b6;
        //   119: astore          22
        //   121: aload           21
        //   123: aload           22
        //   125: if_acmpne       165
        //   128: aload_0        
        //   129: getfield        com/google/c_.a:Ljava/lang/String;
        //   132: aload_1        
        //   133: getfield        com/google/c_.a:Ljava/lang/String;
        //   136: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   139: istore          23
        //   141: iload           23
        //   143: ifeq            165
        //   146: aload_0        
        //   147: invokevirtual   com/google/c_.t:()Z
        //   150: istore          24
        //   152: aload_1        
        //   153: invokevirtual   com/google/c_.t:()Z
        //   156: istore          25
        //   158: iload           24
        //   160: iload           25
        //   162: if_icmpeq       8
        //   165: iconst_0       
        //   166: ireturn        
        //   167: astore_3       
        //   168: aload_3        
        //   169: athrow         
        //   170: astore          4
        //   172: aload           4
        //   174: athrow         
        //   175: astore          5
        //   177: aload           5
        //   179: athrow         
        //   180: astore          6
        //   182: aload           6
        //   184: athrow         
        //   185: astore          7
        //   187: aload           7
        //   189: athrow         
        //   190: astore          8
        //   192: aload           8
        //   194: athrow         
        //   195: astore          9
        //   197: aload           9
        //   199: athrow         
        //   200: astore          10
        //   202: aload           10
        //   204: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  15     27     167    170    Ljava/lang/NullPointerException;
        //  34     46     170    175    Ljava/lang/NullPointerException;
        //  54     67     175    180    Ljava/lang/NullPointerException;
        //  72     84     180    185    Ljava/lang/NullPointerException;
        //  91     104    185    190    Ljava/lang/NullPointerException;
        //  109    121    190    195    Ljava/lang/NullPointerException;
        //  128    141    195    200    Ljava/lang/NullPointerException;
        //  146    158    200    205    Ljava/lang/NullPointerException;
        //  168    170    170    175    Ljava/lang/NullPointerException;
        //  172    175    175    180    Ljava/lang/NullPointerException;
        //  177    180    180    185    Ljava/lang/NullPointerException;
        //  182    185    185    190    Ljava/lang/NullPointerException;
        //  187    190    190    195    Ljava/lang/NullPointerException;
        //  192    195    195    200    Ljava/lang/NullPointerException;
        //  197    200    200    205    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 107, Size: 107
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
    
    public c_ c(final String g) {
        if (g == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.f = true;
        this.g = g;
        return this;
    }
    
    public String c() {
        return this.g;
    }
    
    public boolean d() {
        return this.d;
    }
    
    public long e() {
        return this.i;
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            if (!(o instanceof c_)) {
                return false;
            }
            final c_ c_ = this;
            final Object o2 = o;
            final c_ c_2 = (c_)o2;
            final boolean b = c_.b(c_2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final c_ c_ = this;
            final Object o2 = o;
            final c_ c_2 = (c_)o2;
            final boolean b = c_.b(c_2);
            if (b) {
                return true;
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean f() {
        return this.h;
    }
    
    public boolean g() {
        return this.l;
    }
    
    public boolean h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: sipush          1231
        //     3: istore_1       
        //     4: bipush          53
        //     6: bipush          53
        //     8: bipush          53
        //    10: sipush          2173
        //    13: aload_0        
        //    14: invokevirtual   com/google/c_.n:()I
        //    17: iadd           
        //    18: imul           
        //    19: aload_0        
        //    20: invokevirtual   com/google/c_.e:()J
        //    23: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    26: invokevirtual   java/lang/Long.hashCode:()I
        //    29: iadd           
        //    30: imul           
        //    31: aload_0        
        //    32: invokevirtual   com/google/c_.c:()Ljava/lang/String;
        //    35: invokevirtual   java/lang/String.hashCode:()I
        //    38: iadd           
        //    39: imul           
        //    40: istore_2       
        //    41: aload_0        
        //    42: invokevirtual   com/google/c_.d:()Z
        //    45: istore          4
        //    47: iload           4
        //    49: ifeq            116
        //    52: iload_1        
        //    53: istore          5
        //    55: bipush          53
        //    57: bipush          53
        //    59: bipush          53
        //    61: bipush          53
        //    63: iload           5
        //    65: iload_2        
        //    66: iadd           
        //    67: imul           
        //    68: aload_0        
        //    69: invokevirtual   com/google/c_.u:()Ljava/lang/String;
        //    72: invokevirtual   java/lang/String.hashCode:()I
        //    75: iadd           
        //    76: imul           
        //    77: aload_0        
        //    78: invokevirtual   com/google/c_.r:()Lcom/google/b6;
        //    81: invokevirtual   com/google/b6.hashCode:()I
        //    84: iadd           
        //    85: imul           
        //    86: aload_0        
        //    87: invokevirtual   com/google/c_.l:()Ljava/lang/String;
        //    90: invokevirtual   java/lang/String.hashCode:()I
        //    93: iadd           
        //    94: imul           
        //    95: istore          6
        //    97: aload_0        
        //    98: invokevirtual   com/google/c_.t:()Z
        //   101: istore          8
        //   103: iload           8
        //   105: ifeq            129
        //   108: iload           6
        //   110: iload_1        
        //   111: iadd           
        //   112: ireturn        
        //   113: astore_3       
        //   114: aload_3        
        //   115: athrow         
        //   116: sipush          1237
        //   119: istore          5
        //   121: goto            55
        //   124: astore          7
        //   126: aload           7
        //   128: athrow         
        //   129: sipush          1237
        //   132: istore_1       
        //   133: goto            108
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  41     47     113    116    Ljava/lang/NullPointerException;
        //  97     103    124    129    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0108:
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
    
    public c_ i() {
        this.e = false;
        this.i = 0L;
        return this;
    }
    
    public boolean j() {
        return this.b;
    }
    
    public c_ k() {
        this.l = false;
        this.c = 0;
        return this;
    }
    
    public String l() {
        return this.a;
    }
    
    public c_ m() {
        this.k = false;
        this.n = b6.FROM_NUMBER_WITH_PLUS_SIGN;
        return this;
    }
    
    public int n() {
        return this.c;
    }
    
    public boolean o() {
        return this.k;
    }
    
    public final c_ p() {
        this.k();
        this.i();
        this.a();
        this.s();
        this.v();
        this.m();
        this.b();
        return this;
    }
    
    public boolean q() {
        return this.e;
    }
    
    public b6 r() {
        return this.n;
    }
    
    public c_ s() {
        this.b = false;
        this.d = false;
        return this;
    }
    
    public boolean t() {
        return this.j;
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: astore_1       
        //     8: aload_1        
        //     9: getstatic       com/google/c_.z:[Ljava/lang/String;
        //    12: iconst_5       
        //    13: aaload         
        //    14: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    17: aload_0        
        //    18: getfield        com/google/c_.c:I
        //    21: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    24: pop            
        //    25: aload_1        
        //    26: getstatic       com/google/c_.z:[Ljava/lang/String;
        //    29: iconst_2       
        //    30: aaload         
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: aload_0        
        //    35: getfield        com/google/c_.i:J
        //    38: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    41: pop            
        //    42: aload_0        
        //    43: invokevirtual   com/google/c_.j:()Z
        //    46: istore          6
        //    48: iload           6
        //    50: ifeq            70
        //    53: aload_0        
        //    54: invokevirtual   com/google/c_.d:()Z
        //    57: ifeq            70
        //    60: aload_1        
        //    61: getstatic       com/google/c_.z:[Ljava/lang/String;
        //    64: iconst_3       
        //    65: aaload         
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: pop            
        //    70: aload_0        
        //    71: invokevirtual   com/google/c_.h:()Z
        //    74: ifeq            94
        //    77: aload_1        
        //    78: getstatic       com/google/c_.z:[Ljava/lang/String;
        //    81: iconst_0       
        //    82: aaload         
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: aload_0        
        //    87: getfield        com/google/c_.g:Ljava/lang/String;
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: aload_0        
        //    95: invokevirtual   com/google/c_.o:()Z
        //    98: ifeq            118
        //   101: aload_1        
        //   102: getstatic       com/google/c_.z:[Ljava/lang/String;
        //   105: iconst_4       
        //   106: aaload         
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: aload_0        
        //   111: getfield        com/google/c_.n:Lcom/google/b6;
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   117: pop            
        //   118: aload_0        
        //   119: invokevirtual   com/google/c_.t:()Z
        //   122: ifeq            142
        //   125: aload_1        
        //   126: getstatic       com/google/c_.z:[Ljava/lang/String;
        //   129: iconst_1       
        //   130: aaload         
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: aload_0        
        //   135: getfield        com/google/c_.a:Ljava/lang/String;
        //   138: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   141: pop            
        //   142: aload_1        
        //   143: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   146: areturn        
        //   147: astore_2       
        //   148: aload_2        
        //   149: athrow         
        //   150: astore_3       
        //   151: aload_3        
        //   152: athrow         
        //   153: astore          7
        //   155: aload           7
        //   157: athrow         
        //   158: astore          8
        //   160: aload           8
        //   162: athrow         
        //   163: astore          9
        //   165: aload           9
        //   167: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  8      48     147    150    Ljava/lang/NullPointerException;
        //  53     70     150    153    Ljava/lang/NullPointerException;
        //  70     94     153    158    Ljava/lang/NullPointerException;
        //  94     118    158    163    Ljava/lang/NullPointerException;
        //  118    142    163    168    Ljava/lang/NullPointerException;
        //  148    150    150    153    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 90, Size: 90
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
    
    public String u() {
        return this.m;
    }
    
    public c_ v() {
        this.h = false;
        this.m = "";
        return this;
    }
}
