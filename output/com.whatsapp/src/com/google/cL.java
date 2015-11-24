// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.InputStream;

public final class cL
{
    private static final String[] z;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private final InputStream k;
    
    static {
        final String[] z2 = new String[5];
        final char[] charArray = "Rf*~\u0005LA9q\u000fEqd>ICb {\fD#;\u007f\fN#.b\u000fFf>7\u001eAp\"0\u001d\u0000f!g\u001dY-".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'i';
                    break;
                }
                case 0: {
                    c2 = ' ';
                    break;
                }
                case 1: {
                    c2 = '\u0003';
                    break;
                }
                case 2: {
                    c2 = 'L';
                    break;
                }
                case 3: {
                    c2 = '\u0017';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "*W$rIim<b\u001dsw>r\bM#%z\u0019Lf!r\u0007Tb8~\u0006N#%dIBv+p\u0010\u000e".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'i';
                    break;
                }
                case 0: {
                    c4 = ' ';
                    break;
                }
                case 1: {
                    c4 = '\u0003';
                    break;
                }
                case 2: {
                    c4 = 'L';
                    break;
                }
                case 3: {
                    c4 = '\u0017';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "im<b\u001dsw>r\bM >r\bD+.n\u001dEX\u0011>IRf8b\u001bNf(7\u0000Nu-{\u0000D#>r\u001aUo8-I".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'i';
                    break;
                }
                case 0: {
                    c6 = ' ';
                    break;
                }
                case 1: {
                    c6 = '\u0003';
                    break;
                }
                case 2: {
                    c6 = 'L';
                    break;
                }
                case 3: {
                    c6 = '\u0017';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "uW\n:Q".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'i';
                    break;
                }
                case 0: {
                    c8 = ' ';
                    break;
                }
                case 1: {
                    c8 = '\u0003';
                    break;
                }
                case 2: {
                    c8 = 'L';
                    break;
                }
                case 3: {
                    c8 = '\u0017';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "uW\n:Q".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'i';
                    break;
                }
                case 0: {
                    c10 = ' ';
                    break;
                }
                case 1: {
                    c10 = '\u0003';
                    break;
                }
                case 2: {
                    c10 = 'L';
                    break;
                }
                case 3: {
                    c10 = '\u0017';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        z = z2;
    }
    
    private cL(final InputStream k) {
        this.a = Integer.MAX_VALUE;
        this.c = 64;
        this.j = 67108864;
        this.f = new byte[4096];
        this.d = 0;
        this.b = 0;
        this.i = 0;
        this.k = k;
    }
    
    private cL(final byte[] f, final int b, final int n) {
        this.a = Integer.MAX_VALUE;
        this.c = 64;
        this.j = 67108864;
        this.f = f;
        this.d = b + n;
        this.b = b;
        this.i = -b;
        this.k = null;
    }
    
    public static int a(int n, final InputStream inputStream) {
        final boolean b = dt.b;
        if ((n & 0x80) != 0x0) {
            n &= 0x7F;
            int i = 7;
            while (i < 32) {
                final int read = inputStream.read();
                if (read == -1) {
                    try {
                        throw bg.a();
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                }
                n |= (read & 0x7F) << i;
                if ((read & 0x80) == 0x0) {
                    return n;
                }
                i += 7;
                if (b) {
                    break;
                }
            }
            while (i < 64) {
                final int read2 = inputStream.read();
                if (read2 == -1) {
                    try {
                        throw bg.a();
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
                if ((read2 & 0x80) == 0x0) {
                    return n;
                }
                i += 7;
                if (b) {
                    break;
                }
            }
            throw bg.e();
        }
        return n;
    }
    
    public static long a(final long n) {
        return n >>> 1 ^ -(0x1L & n);
    }
    
    public static cL a(final InputStream inputStream) {
        return new cL(inputStream);
    }
    
    public static cL a(final byte[] array) {
        return a(array, 0, array.length);
    }
    
    public static cL a(final byte[] array, final int n, final int n2) {
        final cL cl = new cL(array, n, n2);
        try {
            cl.c(n2);
            return cl;
        }
        catch (bg bg) {
            throw new IllegalArgumentException(bg);
        }
    }
    
    private boolean a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/cL.b:I
        //     4: aload_0        
        //     5: getfield        com/google/cL.d:I
        //     8: if_icmpge       27
        //    11: new             Ljava/lang/IllegalStateException;
        //    14: dup            
        //    15: getstatic       com/google/cL.z:[Ljava/lang/String;
        //    18: iconst_0       
        //    19: aaload         
        //    20: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    23: athrow         
        //    24: astore_2       
        //    25: aload_2        
        //    26: athrow         
        //    27: aload_0        
        //    28: getfield        com/google/cL.i:I
        //    31: aload_0        
        //    32: getfield        com/google/cL.d:I
        //    35: iadd           
        //    36: istore          5
        //    38: aload_0        
        //    39: getfield        com/google/cL.a:I
        //    42: istore          6
        //    44: iload           5
        //    46: iload           6
        //    48: if_icmpne       70
        //    51: iconst_0       
        //    52: istore          7
        //    54: iload_1        
        //    55: ifeq            292
        //    58: invokestatic    com/google/bg.a:()Lcom/google/bg;
        //    61: athrow         
        //    62: astore          4
        //    64: aload           4
        //    66: athrow         
        //    67: astore_3       
        //    68: aload_3        
        //    69: athrow         
        //    70: aload_0        
        //    71: aload_0        
        //    72: getfield        com/google/cL.i:I
        //    75: aload_0        
        //    76: getfield        com/google/cL.d:I
        //    79: iadd           
        //    80: putfield        com/google/cL.i:I
        //    83: aload_0        
        //    84: iconst_0       
        //    85: putfield        com/google/cL.b:I
        //    88: aload_0        
        //    89: getfield        com/google/cL.k:Ljava/io/InputStream;
        //    92: astore          9
        //    94: aload           9
        //    96: ifnonnull       178
        //    99: iconst_m1      
        //   100: istore          10
        //   102: aload_0        
        //   103: iload           10
        //   105: putfield        com/google/cL.d:I
        //   108: aload_0        
        //   109: getfield        com/google/cL.d:I
        //   112: istore          13
        //   114: iload           13
        //   116: ifeq            127
        //   119: aload_0        
        //   120: getfield        com/google/cL.d:I
        //   123: iconst_m1      
        //   124: if_icmpge       199
        //   127: new             Ljava/lang/IllegalStateException;
        //   130: dup            
        //   131: new             Ljava/lang/StringBuilder;
        //   134: dup            
        //   135: invokespecial   java/lang/StringBuilder.<init>:()V
        //   138: getstatic       com/google/cL.z:[Ljava/lang/String;
        //   141: iconst_2       
        //   142: aaload         
        //   143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   146: aload_0        
        //   147: getfield        com/google/cL.d:I
        //   150: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   153: getstatic       com/google/cL.z:[Ljava/lang/String;
        //   156: iconst_1       
        //   157: aaload         
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   164: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   167: athrow         
        //   168: astore          12
        //   170: aload           12
        //   172: athrow         
        //   173: astore          8
        //   175: aload           8
        //   177: athrow         
        //   178: aload_0        
        //   179: getfield        com/google/cL.k:Ljava/io/InputStream;
        //   182: aload_0        
        //   183: getfield        com/google/cL.f:[B
        //   186: invokevirtual   java/io/InputStream.read:([B)I
        //   189: istore          10
        //   191: goto            102
        //   194: astore          11
        //   196: aload           11
        //   198: athrow         
        //   199: aload_0        
        //   200: getfield        com/google/cL.d:I
        //   203: istore          16
        //   205: iload           16
        //   207: iconst_m1      
        //   208: if_icmpne       237
        //   211: aload_0        
        //   212: iconst_0       
        //   213: putfield        com/google/cL.d:I
        //   216: iconst_0       
        //   217: istore          7
        //   219: iload_1        
        //   220: ifeq            292
        //   223: invokestatic    com/google/bg.a:()Lcom/google/bg;
        //   226: athrow         
        //   227: astore          15
        //   229: aload           15
        //   231: athrow         
        //   232: astore          14
        //   234: aload           14
        //   236: athrow         
        //   237: aload_0        
        //   238: invokespecial   com/google/cL.o:()V
        //   241: aload_0        
        //   242: getfield        com/google/cL.i:I
        //   245: aload_0        
        //   246: getfield        com/google/cL.d:I
        //   249: iadd           
        //   250: aload_0        
        //   251: getfield        com/google/cL.e:I
        //   254: iadd           
        //   255: istore          17
        //   257: aload_0        
        //   258: getfield        com/google/cL.j:I
        //   261: istore          20
        //   263: iload           17
        //   265: iload           20
        //   267: if_icmpgt       275
        //   270: iload           17
        //   272: ifge            289
        //   275: invokestatic    com/google/bg.c:()Lcom/google/bg;
        //   278: athrow         
        //   279: astore          19
        //   281: aload           19
        //   283: athrow         
        //   284: astore          18
        //   286: aload           18
        //   288: athrow         
        //   289: iconst_1       
        //   290: istore          7
        //   292: iload           7
        //   294: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      24     24     27     Ljava/lang/IllegalArgumentException;
        //  27     44     67     70     Ljava/lang/IllegalArgumentException;
        //  58     62     62     67     Ljava/lang/IllegalArgumentException;
        //  68     70     62     67     Ljava/lang/IllegalArgumentException;
        //  70     94     173    178    Ljava/lang/IllegalArgumentException;
        //  102    114    194    199    Ljava/lang/IllegalArgumentException;
        //  119    127    168    173    Ljava/lang/IllegalArgumentException;
        //  127    168    168    173    Ljava/lang/IllegalArgumentException;
        //  196    199    168    173    Ljava/lang/IllegalArgumentException;
        //  199    205    232    237    Ljava/lang/IllegalArgumentException;
        //  211    216    227    232    Ljava/lang/IllegalArgumentException;
        //  223    227    227    232    Ljava/lang/IllegalArgumentException;
        //  234    237    227    232    Ljava/lang/IllegalArgumentException;
        //  257    263    284    289    Ljava/lang/IllegalArgumentException;
        //  275    279    279    284    Ljava/lang/IllegalArgumentException;
        //  286    289    279    284    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0102:
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
    
    public static int e(final int n) {
        return n >>> 1 ^ -(n & 0x1);
    }
    
    private void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_0        
        //     2: getfield        com/google/cL.d:I
        //     5: aload_0        
        //     6: getfield        com/google/cL.e:I
        //     9: iadd           
        //    10: putfield        com/google/cL.d:I
        //    13: aload_0        
        //    14: getfield        com/google/cL.i:I
        //    17: aload_0        
        //    18: getfield        com/google/cL.d:I
        //    21: iadd           
        //    22: istore_1       
        //    23: aload_0        
        //    24: getfield        com/google/cL.a:I
        //    27: istore          4
        //    29: iload_1        
        //    30: iload           4
        //    32: if_icmple       64
        //    35: aload_0        
        //    36: iload_1        
        //    37: aload_0        
        //    38: getfield        com/google/cL.a:I
        //    41: isub           
        //    42: putfield        com/google/cL.e:I
        //    45: aload_0        
        //    46: aload_0        
        //    47: getfield        com/google/cL.d:I
        //    50: aload_0        
        //    51: getfield        com/google/cL.e:I
        //    54: isub           
        //    55: putfield        com/google/cL.d:I
        //    58: getstatic       com/google/dt.b:Z
        //    61: ifeq            76
        //    64: aload_0        
        //    65: iconst_0       
        //    66: putfield        com/google/cL.e:I
        //    69: return         
        //    70: astore_2       
        //    71: aload_2        
        //    72: athrow         
        //    73: astore_3       
        //    74: aload_3        
        //    75: athrow         
        //    76: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  23     29     70     73     Ljava/lang/IllegalArgumentException;
        //  35     64     73     76     Ljava/lang/IllegalArgumentException;
        //  64     69     73     76     Ljava/lang/IllegalArgumentException;
        //  71     73     73     76     Ljava/lang/IllegalArgumentException;
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
    
    public int a() {
        try {
            if (this.b()) {
                return this.h = 0;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            this.h = this.i();
            if (cp.b(this.h) == 0) {
                throw bg.h();
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return this.h;
    }
    
    public ci a(final du du, final fu fu) {
        final int i = this.i();
        try {
            if (this.g >= this.c) {
                throw bg.d();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final int c = this.c(i);
        ++this.g;
        final ci ci = (ci)du.parsePartialFrom(this, fu);
        this.g(0);
        --this.g;
        this.a(c);
        return ci;
    }
    
    public void a(final int a) {
        this.a = a;
        this.o();
    }
    
    public void a(final int n, final aJ aj, final fu fu) {
        try {
            if (this.g >= this.c) {
                throw bg.d();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        ++this.g;
        aj.mergeFrom(this, fu);
        this.g(cp.a(n, 4));
        --this.g;
    }
    
    public void a(final aJ aj, final fu fu) {
        final int i = this.i();
        try {
            if (this.g >= this.c) {
                throw bg.d();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final int c = this.c(i);
        ++this.g;
        aj.mergeFrom(this, fu);
        this.g(0);
        --this.g;
        this.a(c);
    }
    
    public void b(final int n) {
        final boolean b = dt.b;
        if (n < 0) {
            try {
                throw bg.f();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            if (n + (this.i + this.b) > this.a) {
                this.b(this.a - this.i - this.b);
                throw bg.a();
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            if (n <= this.d - this.b) {
                this.b += n;
                if (!b) {
                    return;
                }
            }
            int n2 = this.d - this.b;
            this.b = this.d;
            this.a(true);
            while (n - n2 > this.d) {
                n2 += this.d;
                this.b = this.d;
                this.a(true);
                if (b) {
                    break;
                }
            }
            this.b = n - n2;
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
    }
    
    public boolean b() {
        try {
            if (this.b != this.d) {
                return false;
            }
            final cL cl = this;
            final boolean b = false;
            final boolean b2 = cl.a(b);
            if (!b2) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final cL cl = this;
            final boolean b = false;
            final boolean b2 = cl.a(b);
            if (!b2) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public byte c() {
        try {
            if (this.b == this.d) {
                this.a(true);
            }
            return this.f[this.b++];
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public int c(final int n) {
        if (n < 0) {
            try {
                throw bg.f();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        final int a = n + (this.i + this.b);
        final int a2 = this.a;
        if (a > a2) {
            try {
                throw bg.a();
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        this.a = a;
        this.o();
        return a2;
    }
    
    public long d() {
        return a(this.m());
    }
    
    public boolean d(final int n) {
        Label_0095: {
            Label_0075: {
                Label_0065: {
                    try {
                        switch (cp.a(n)) {
                            default: {
                                throw bg.i();
                            }
                            case 0: {
                                this.j();
                                return true;
                            }
                            case 1: {
                                break;
                            }
                            case 2: {
                                break Label_0065;
                            }
                            case 3: {
                                break Label_0075;
                            }
                            case 4: {
                                return false;
                            }
                            case 5: {
                                break Label_0095;
                            }
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                    this.f();
                    return true;
                }
                this.b(this.i());
                return true;
            }
            this.r();
            this.g(cp.a(cp.b(n), 4));
            return true;
        }
        this.q();
        return true;
    }
    
    public hv e() {
        final int i = this.i();
        if (i == 0) {
            try {
                return hv.b;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            if (i <= this.d - this.b && i > 0) {
                final hv a = hv.a(this.f, this.b, i);
                this.b += i;
                return a;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return hv.a(this.f(i));
    }
    
    public long f() {
        return (0xFFL & this.c()) | (0xFFL & this.c()) << 8 | (0xFFL & this.c()) << 16 | (0xFFL & this.c()) << 24 | (0xFFL & this.c()) << 32 | (0xFFL & this.c()) << 40 | (0xFFL & this.c()) << 48 | (0xFFL & this.c()) << 56;
    }
    
    public byte[] f(final int n) {
        final boolean b = dt.b;
        if (n < 0) {
            try {
                throw bg.f();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            if (n + (this.i + this.b) > this.a) {
                this.b(this.a - this.i - this.b);
                throw bg.a();
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        if (n <= this.d - this.b) {
            final byte[] array = new byte[n];
            System.arraycopy(this.f, this.b, array, 0, n);
            this.b += n;
            return array;
        }
        if (n < 4096) {
            final byte[] array2 = new byte[n];
            int n2 = this.d - this.b;
            System.arraycopy(this.f, this.b, array2, 0, n2);
            this.b = this.d;
            this.a(true);
            while (n - n2 > this.d) {
                System.arraycopy(this.f, 0, array2, n2, this.d);
                n2 += this.d;
                this.b = this.d;
                this.a(true);
                if (b) {
                    break;
                }
            }
            System.arraycopy(this.f, 0, array2, n2, n - n2);
            this.b = n - n2;
            return array2;
        }
        final int b2 = this.b;
        final int d = this.d;
        this.i += this.d;
        this.b = 0;
        this.d = 0;
        final int n3 = n - (d - b2);
        final ArrayList<byte[]> list = new ArrayList<byte[]>();
        int n4;
        for (int i = n3; i > 0; i = n4) {
            final byte[] array3 = new byte[Math.min(i, 4096)];
            int j = 0;
            while (j < array3.length) {
                int read;
                while (true) {
                    while (true) {
                        try {
                            if (this.k == null) {
                                read = -1;
                                if (read != -1) {
                                    break;
                                }
                                try {
                                    throw bg.a();
                                }
                                catch (IllegalArgumentException ex3) {
                                    throw ex3;
                                }
                            }
                        }
                        catch (IllegalArgumentException ex4) {
                            throw ex4;
                        }
                        read = this.k.read(array3, j, array3.length - j);
                        continue;
                    }
                }
                this.i += read;
                j += read;
                if (b) {
                    break;
                }
            }
            n4 = i - array3.length;
            list.add(array3);
            if (b) {
                break;
            }
        }
        final byte[] array4 = new byte[n];
        final int n5 = d - b2;
        System.arraycopy(this.f, b2, array4, 0, n5);
        final Iterator<Object> iterator = list.iterator();
        int n6 = n5;
        while (iterator.hasNext()) {
            final byte[] array5 = iterator.next();
            System.arraycopy(array5, 0, array4, n6, array5.length);
            final int n7 = n6 + array5.length;
            if (b) {
                break;
            }
            n6 = n7;
        }
        return array4;
    }
    
    public int g() {
        return this.i();
    }
    
    public void g(final int n) {
        try {
            if (this.h != n) {
                throw bg.g();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public String h() {
        final int i = this.i();
        try {
            if (i <= this.d - this.b && i > 0) {
                final String s = new String(this.f, this.b, i, cL.z[4]);
                this.b += i;
                return s;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return new String(this.f(i), cL.z[3]);
    }
    
    public int i() {
        final boolean b = dt.b;
        int c = this.c();
        if (c < 0) {
            c &= 0x7F;
            final byte c2 = this.c();
            if (c2 >= 0) {
                c |= c2 << 7;
                if (!b) {
                    return c;
                }
            }
            c |= (c2 & 0x7F) << 7;
            final byte c3 = this.c();
            if (c3 >= 0) {
                c |= c3 << 14;
                if (!b) {
                    return c;
                }
            }
            c |= (c3 & 0x7F) << 14;
            final byte c4 = this.c();
            if (c4 >= 0) {
                c |= c4 << 21;
                if (!b) {
                    return c;
                }
            }
            final int n = c | (c4 & 0x7F) << 21;
            final byte c5 = this.c();
            c = (n | c5 << 28);
            if (c5 < 0) {
                int n2 = 0;
                while (true) {
                    Label_0166: {
                        if (n2 >= 5) {
                            break Label_0166;
                        }
                        try {
                            if (this.c() >= 0) {
                                break;
                            }
                            ++n2;
                            if (b) {
                                throw bg.e();
                            }
                            continue;
                        }
                        catch (IllegalArgumentException ex) {
                            throw ex;
                        }
                    }
                }
            }
        }
        return c;
    }
    
    public int j() {
        return this.i();
    }
    
    public long k() {
        return this.m();
    }
    
    public int l() {
        return this.i();
    }
    
    public long m() {
        final boolean b = dt.b;
        int i = 0;
        long n = 0L;
        while (i < 64) {
            final byte c = this.c();
            n |= (c & 0x7F) << i;
            if ((c & 0x80) == 0x0) {
                return n;
            }
            i += 7;
            if (b) {
                break;
            }
        }
        throw bg.e();
    }
    
    public long n() {
        return this.f();
    }
    
    public int p() {
        return this.q();
    }
    
    public int q() {
        return (this.c() & 0xFF) | (this.c() & 0xFF) << 8 | (this.c() & 0xFF) << 16 | (this.c() & 0xFF) << 24;
    }
    
    public void r() {
        while (true) {
            final int a = this.a();
            if (a == 0) {
                return;
            }
            try {
                if (!this.d(a)) {
                    return;
                }
                continue;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    public int s() {
        try {
            if (this.a == Integer.MAX_VALUE) {
                return -1;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.a - (this.i + this.b);
    }
    
    public long t() {
        return this.m();
    }
    
    public double u() {
        return Double.longBitsToDouble(this.f());
    }
    
    public int v() {
        return e(this.i());
    }
    
    public int w() {
        return this.q();
    }
    
    public boolean x() {
        try {
            if (this.i() != 0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public float y() {
        return Float.intBitsToFloat(this.q());
    }
    
    public long z() {
        return this.f();
    }
}
