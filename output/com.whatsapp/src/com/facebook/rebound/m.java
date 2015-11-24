// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class m
{
    public static int i;
    private static int j;
    private static final String[] z;
    private final i a;
    private CopyOnWriteArraySet b;
    private double c;
    private double d;
    private boolean e;
    private final i f;
    private o g;
    private double h;
    private double k;
    private double l;
    private final p m;
    private final i n;
    private boolean o;
    private final String p;
    
    static {
        final String[] z2 = new String[4];
        String s = "@o\u0010o\u000bT%";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'e';
                        break;
                    }
                    case 0: {
                        c2 = '3';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = '\u0006';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "`o\u0010o\u000bT?\u0001g\u000b]p\u0016&\u0007V?\u0001t\u0000Rk\u0007bE\\j\u0016u\fWzBi\u0003\u0013~BD\u0004@z1v\u0017Zq\u0005U\u001c@k\u0007k";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "@o\u0010o\u000bT\\\rh\u0003ZxBo\u0016\u0013m\u0007w\u0010Zm\u0007b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "]z\u0015J\f@k\u0007h\u0000A?\u000buEAz\u0013s\fAz\u0006";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        m.j = 0;
    }
    
    m(final p p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: new             Lcom/facebook/rebound/i;
        //    12: dup            
        //    13: aconst_null    
        //    14: invokespecial   com/facebook/rebound/i.<init>:(Lcom/facebook/rebound/k;)V
        //    17: putfield        com/facebook/rebound/m.f:Lcom/facebook/rebound/i;
        //    20: aload_0        
        //    21: new             Lcom/facebook/rebound/i;
        //    24: dup            
        //    25: aconst_null    
        //    26: invokespecial   com/facebook/rebound/i.<init>:(Lcom/facebook/rebound/k;)V
        //    29: putfield        com/facebook/rebound/m.n:Lcom/facebook/rebound/i;
        //    32: aload_0        
        //    33: new             Lcom/facebook/rebound/i;
        //    36: dup            
        //    37: aconst_null    
        //    38: invokespecial   com/facebook/rebound/i.<init>:(Lcom/facebook/rebound/k;)V
        //    41: putfield        com/facebook/rebound/m.a:Lcom/facebook/rebound/i;
        //    44: aload_0        
        //    45: iconst_1       
        //    46: putfield        com/facebook/rebound/m.e:Z
        //    49: aload_0        
        //    50: ldc2_w          0.005
        //    53: putfield        com/facebook/rebound/m.d:D
        //    56: aload_0        
        //    57: ldc2_w          0.005
        //    60: putfield        com/facebook/rebound/m.l:D
        //    63: aload_0        
        //    64: new             Ljava/util/concurrent/CopyOnWriteArraySet;
        //    67: dup            
        //    68: invokespecial   java/util/concurrent/CopyOnWriteArraySet.<init>:()V
        //    71: putfield        com/facebook/rebound/m.b:Ljava/util/concurrent/CopyOnWriteArraySet;
        //    74: aload_0        
        //    75: dconst_0       
        //    76: putfield        com/facebook/rebound/m.c:D
        //    79: aload_1        
        //    80: ifnonnull       96
        //    83: new             Ljava/lang/IllegalArgumentException;
        //    86: dup            
        //    87: getstatic       com/facebook/rebound/m.z:[Ljava/lang/String;
        //    90: iconst_1       
        //    91: aaload         
        //    92: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    95: athrow         
        //    96: aload_0        
        //    97: aload_1        
        //    98: putfield        com/facebook/rebound/m.m:Lcom/facebook/rebound/p;
        //   101: new             Ljava/lang/StringBuilder;
        //   104: dup            
        //   105: invokespecial   java/lang/StringBuilder.<init>:()V
        //   108: getstatic       com/facebook/rebound/m.z:[Ljava/lang/String;
        //   111: iconst_0       
        //   112: aaload         
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: astore          5
        //   118: getstatic       com/facebook/rebound/m.j:I
        //   121: istore          6
        //   123: iload           6
        //   125: iconst_1       
        //   126: iadd           
        //   127: putstatic       com/facebook/rebound/m.j:I
        //   130: aload_0        
        //   131: aload           5
        //   133: iload           6
        //   135: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   138: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   141: putfield        com/facebook/rebound/m.p:Ljava/lang/String;
        //   144: aload_0        
        //   145: getstatic       com/facebook/rebound/o.b:Lcom/facebook/rebound/o;
        //   148: invokevirtual   com/facebook/rebound/m.a:(Lcom/facebook/rebound/o;)Lcom/facebook/rebound/m;
        //   151: pop            
        //   152: iload_2        
        //   153: ifeq            174
        //   156: getstatic       com/facebook/rebound/e.a:Z
        //   159: istore          8
        //   161: iconst_0       
        //   162: istore          9
        //   164: iload           8
        //   166: ifeq            183
        //   169: iload           9
        //   171: putstatic       com/facebook/rebound/e.a:Z
        //   174: return         
        //   175: astore_3       
        //   176: aload_3        
        //   177: athrow         
        //   178: astore          4
        //   180: aload           4
        //   182: athrow         
        //   183: iconst_1       
        //   184: istore          9
        //   186: goto            169
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  96     152    175    178    Ljava/lang/IllegalArgumentException;
        //  156    161    178    183    Ljava/lang/IllegalArgumentException;
        //  176    178    178    183    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0169:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    private double a(final i i) {
        return Math.abs(this.h - i.a);
    }
    
    private void c(final double n) {
        this.f.a = n * this.f.a + this.n.a * (1.0 - n);
        this.f.b = n * this.f.b + this.n.b * (1.0 - n);
    }
    
    public m a(final double b) {
        try {
            if (b == this.f.b) {
                return this;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        this.f.b = b;
        this.m.a(this.a());
        return this;
    }
    
    public m a(final double n, final boolean b) {
        final int i = com.facebook.rebound.m.i;
        this.k = n;
        this.f.a = n;
        this.m.a(this.a());
        final Iterator<j> iterator = (Iterator<j>)this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this);
            if (i != 0) {
                break;
            }
        }
        if (!b) {
            return this;
        }
        try {
            this.h();
            return this;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public m a(final j j) {
        if (j == null) {
            try {
                throw new IllegalArgumentException(com.facebook.rebound.m.z[3]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.b.add(j);
        return this;
    }
    
    public m a(final o g) {
        if (g == null) {
            try {
                throw new IllegalArgumentException(com.facebook.rebound.m.z[2]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.g = g;
        return this;
    }
    
    public String a() {
        return this.p;
    }
    
    public double b() {
        return this.h;
    }
    
    public m b(final double n) {
        return this.a(n, true);
    }
    
    public boolean c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/facebook/rebound/m.g:Lcom/facebook/rebound/o;
        //     4: getfield        com/facebook/rebound/o.c:D
        //     7: dstore          6
        //     9: dload           6
        //    11: dconst_0       
        //    12: dcmpl          
        //    13: ifle            117
        //    16: aload_0        
        //    17: getfield        com/facebook/rebound/m.k:D
        //    20: dstore          8
        //    22: aload_0        
        //    23: getfield        com/facebook/rebound/m.h:D
        //    26: dstore          10
        //    28: dload           8
        //    30: dload           10
        //    32: dcmpg          
        //    33: ifge            56
        //    36: aload_0        
        //    37: invokevirtual   com/facebook/rebound/m.e:()D
        //    40: dstore          20
        //    42: aload_0        
        //    43: getfield        com/facebook/rebound/m.h:D
        //    46: dstore          22
        //    48: dload           20
        //    50: dload           22
        //    52: dcmpl          
        //    53: ifgt            96
        //    56: aload_0        
        //    57: getfield        com/facebook/rebound/m.k:D
        //    60: dstore          12
        //    62: aload_0        
        //    63: getfield        com/facebook/rebound/m.h:D
        //    66: dstore          14
        //    68: dload           12
        //    70: dload           14
        //    72: dcmpl          
        //    73: ifle            117
        //    76: aload_0        
        //    77: invokevirtual   com/facebook/rebound/m.e:()D
        //    80: dstore          16
        //    82: aload_0        
        //    83: getfield        com/facebook/rebound/m.h:D
        //    86: dstore          18
        //    88: dload           16
        //    90: dload           18
        //    92: dcmpg          
        //    93: ifge            117
        //    96: iconst_1       
        //    97: ireturn        
        //    98: astore_1       
        //    99: aload_1        
        //   100: athrow         
        //   101: astore_2       
        //   102: aload_2        
        //   103: athrow         
        //   104: astore_3       
        //   105: aload_3        
        //   106: athrow         
        //   107: astore          4
        //   109: aload           4
        //   111: athrow         
        //   112: astore          5
        //   114: aload           5
        //   116: athrow         
        //   117: iconst_0       
        //   118: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      9      98     101    Ljava/lang/IllegalArgumentException;
        //  16     28     101    104    Ljava/lang/IllegalArgumentException;
        //  36     48     104    107    Ljava/lang/IllegalArgumentException;
        //  56     68     107    112    Ljava/lang/IllegalArgumentException;
        //  76     88     112    117    Ljava/lang/IllegalArgumentException;
        //  99     101    101    104    Ljava/lang/IllegalArgumentException;
        //  102    104    104    107    Ljava/lang/IllegalArgumentException;
        //  105    107    107    112    Ljava/lang/IllegalArgumentException;
        //  109    112    112    117    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 67, Size: 67
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
    
    public m d(final double h) {
        final int i = com.facebook.rebound.m.i;
        Label_0036: {
            try {
                if (this.h != h) {
                    break Label_0036;
                }
                final m m = this;
                final boolean b = m.g();
                if (b) {
                    return this;
                }
                break Label_0036;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final m m = this;
                final boolean b = m.g();
                if (b) {
                    return this;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        this.k = this.e();
        this.h = h;
        this.m.a(this.a());
        final Iterator<j> iterator = (Iterator<j>)this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().d(this);
            if (i != 0) {
                break;
            }
        }
        return this;
    }
    
    public boolean d() {
        try {
            if (!this.g()) {
                return true;
            }
            final m m = this;
            final boolean b = m.f();
            if (!b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final m m = this;
            final boolean b = m.f();
            if (!b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public double e() {
        return this.f.a;
    }
    
    void e(final double p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   com/facebook/rebound/m.g:()Z
        //     8: istore          4
        //    10: iload           4
        //    12: ifeq            32
        //    15: aload_0        
        //    16: getfield        com/facebook/rebound/m.e:Z
        //    19: istore          56
        //    21: iload           56
        //    23: ifeq            32
        //    26: return         
        //    27: astore          55
        //    29: aload           55
        //    31: athrow         
        //    32: dload_1        
        //    33: ldc2_w          0.064
        //    36: dcmpl          
        //    37: ifle            44
        //    40: ldc2_w          0.064
        //    43: dstore_1       
        //    44: aload_0        
        //    45: dload_1        
        //    46: aload_0        
        //    47: getfield        com/facebook/rebound/m.c:D
        //    50: dadd           
        //    51: putfield        com/facebook/rebound/m.c:D
        //    54: aload_0        
        //    55: getfield        com/facebook/rebound/m.g:Lcom/facebook/rebound/o;
        //    58: getfield        com/facebook/rebound/o.c:D
        //    61: dstore          5
        //    63: aload_0        
        //    64: getfield        com/facebook/rebound/m.g:Lcom/facebook/rebound/o;
        //    67: getfield        com/facebook/rebound/o.a:D
        //    70: dstore          7
        //    72: aload_0        
        //    73: getfield        com/facebook/rebound/m.f:Lcom/facebook/rebound/i;
        //    76: getfield        com/facebook/rebound/i.a:D
        //    79: dstore          9
        //    81: aload_0        
        //    82: getfield        com/facebook/rebound/m.f:Lcom/facebook/rebound/i;
        //    85: getfield        com/facebook/rebound/i.b:D
        //    88: dstore          11
        //    90: aload_0        
        //    91: getfield        com/facebook/rebound/m.a:Lcom/facebook/rebound/i;
        //    94: getfield        com/facebook/rebound/i.a:D
        //    97: dstore          13
        //    99: aload_0        
        //   100: getfield        com/facebook/rebound/m.a:Lcom/facebook/rebound/i;
        //   103: getfield        com/facebook/rebound/i.b:D
        //   106: dstore          15
        //   108: aload_0        
        //   109: getfield        com/facebook/rebound/m.c:D
        //   112: ldc2_w          0.001
        //   115: dcmpl          
        //   116: iflt            382
        //   119: aload_0        
        //   120: aload_0        
        //   121: getfield        com/facebook/rebound/m.c:D
        //   124: ldc2_w          0.001
        //   127: dsub           
        //   128: putfield        com/facebook/rebound/m.c:D
        //   131: aload_0        
        //   132: getfield        com/facebook/rebound/m.c:D
        //   135: ldc2_w          0.001
        //   138: dcmpg          
        //   139: ifge            160
        //   142: aload_0        
        //   143: getfield        com/facebook/rebound/m.n:Lcom/facebook/rebound/i;
        //   146: dload           9
        //   148: putfield        com/facebook/rebound/i.a:D
        //   151: aload_0        
        //   152: getfield        com/facebook/rebound/m.n:Lcom/facebook/rebound/i;
        //   155: dload           11
        //   157: putfield        com/facebook/rebound/i.b:D
        //   160: dload           5
        //   162: aload_0        
        //   163: getfield        com/facebook/rebound/m.h:D
        //   166: dload           13
        //   168: dsub           
        //   169: dmul           
        //   170: dload           7
        //   172: dload           11
        //   174: dmul           
        //   175: dsub           
        //   176: dstore          35
        //   178: dload           9
        //   180: ldc2_w          0.5
        //   183: ldc2_w          0.001
        //   186: dload           11
        //   188: dmul           
        //   189: dmul           
        //   190: dadd           
        //   191: dstore          37
        //   193: dload           11
        //   195: ldc2_w          0.5
        //   198: ldc2_w          0.001
        //   201: dload           35
        //   203: dmul           
        //   204: dmul           
        //   205: dadd           
        //   206: dstore          39
        //   208: dload           5
        //   210: aload_0        
        //   211: getfield        com/facebook/rebound/m.h:D
        //   214: dload           37
        //   216: dsub           
        //   217: dmul           
        //   218: dload           7
        //   220: dload           39
        //   222: dmul           
        //   223: dsub           
        //   224: dstore          41
        //   226: dload           9
        //   228: ldc2_w          0.5
        //   231: ldc2_w          0.001
        //   234: dload           39
        //   236: dmul           
        //   237: dmul           
        //   238: dadd           
        //   239: dstore          43
        //   241: dload           11
        //   243: ldc2_w          0.5
        //   246: ldc2_w          0.001
        //   249: dload           41
        //   251: dmul           
        //   252: dmul           
        //   253: dadd           
        //   254: dstore          45
        //   256: dload           5
        //   258: aload_0        
        //   259: getfield        com/facebook/rebound/m.h:D
        //   262: dload           43
        //   264: dsub           
        //   265: dmul           
        //   266: dload           7
        //   268: dload           45
        //   270: dmul           
        //   271: dsub           
        //   272: dstore          47
        //   274: dload           9
        //   276: ldc2_w          0.001
        //   279: dload           45
        //   281: dmul           
        //   282: dadd           
        //   283: dstore          13
        //   285: dload           11
        //   287: ldc2_w          0.001
        //   290: dload           47
        //   292: dmul           
        //   293: dadd           
        //   294: dstore          15
        //   296: dload           5
        //   298: aload_0        
        //   299: getfield        com/facebook/rebound/m.h:D
        //   302: dload           13
        //   304: dsub           
        //   305: dmul           
        //   306: dload           7
        //   308: dload           15
        //   310: dmul           
        //   311: dsub           
        //   312: dstore          49
        //   314: ldc2_w          0.16666666666666666
        //   317: dload           15
        //   319: dload           11
        //   321: ldc2_w          2.0
        //   324: dload           39
        //   326: dload           45
        //   328: dadd           
        //   329: dmul           
        //   330: dadd           
        //   331: dadd           
        //   332: dmul           
        //   333: dstore          51
        //   335: ldc2_w          0.16666666666666666
        //   338: dload           49
        //   340: dload           35
        //   342: ldc2_w          2.0
        //   345: dload           41
        //   347: dload           47
        //   349: dadd           
        //   350: dmul           
        //   351: dadd           
        //   352: dadd           
        //   353: dmul           
        //   354: dstore          53
        //   356: dload           9
        //   358: dload           51
        //   360: ldc2_w          0.001
        //   363: dmul           
        //   364: dadd           
        //   365: dstore          9
        //   367: dload           11
        //   369: dload           53
        //   371: ldc2_w          0.001
        //   374: dmul           
        //   375: dadd           
        //   376: dstore          11
        //   378: iload_3        
        //   379: ifeq            108
        //   382: aload_0        
        //   383: getfield        com/facebook/rebound/m.a:Lcom/facebook/rebound/i;
        //   386: dload           13
        //   388: putfield        com/facebook/rebound/i.a:D
        //   391: aload_0        
        //   392: getfield        com/facebook/rebound/m.a:Lcom/facebook/rebound/i;
        //   395: dload           15
        //   397: putfield        com/facebook/rebound/i.b:D
        //   400: aload_0        
        //   401: getfield        com/facebook/rebound/m.f:Lcom/facebook/rebound/i;
        //   404: dload           9
        //   406: putfield        com/facebook/rebound/i.a:D
        //   409: aload_0        
        //   410: getfield        com/facebook/rebound/m.f:Lcom/facebook/rebound/i;
        //   413: dload           11
        //   415: putfield        com/facebook/rebound/i.b:D
        //   418: aload_0        
        //   419: getfield        com/facebook/rebound/m.c:D
        //   422: dconst_0       
        //   423: dcmpl          
        //   424: ifle            439
        //   427: aload_0        
        //   428: aload_0        
        //   429: getfield        com/facebook/rebound/m.c:D
        //   432: ldc2_w          0.001
        //   435: ddiv           
        //   436: invokespecial   com/facebook/rebound/m.c:(D)V
        //   439: aload_0        
        //   440: invokevirtual   com/facebook/rebound/m.g:()Z
        //   443: istore          23
        //   445: iload           23
        //   447: ifne            472
        //   450: aload_0        
        //   451: getfield        com/facebook/rebound/m.o:Z
        //   454: istore          32
        //   456: iload           32
        //   458: ifeq            682
        //   461: aload_0        
        //   462: invokevirtual   com/facebook/rebound/m.c:()Z
        //   465: istore          33
        //   467: iload           33
        //   469: ifeq            682
        //   472: dload           5
        //   474: dconst_0       
        //   475: dcmpl          
        //   476: ifle            502
        //   479: aload_0        
        //   480: aload_0        
        //   481: getfield        com/facebook/rebound/m.h:D
        //   484: putfield        com/facebook/rebound/m.k:D
        //   487: aload_0        
        //   488: getfield        com/facebook/rebound/m.f:Lcom/facebook/rebound/i;
        //   491: aload_0        
        //   492: getfield        com/facebook/rebound/m.h:D
        //   495: putfield        com/facebook/rebound/i.a:D
        //   498: iload_3        
        //   499: ifeq            521
        //   502: aload_0        
        //   503: aload_0        
        //   504: getfield        com/facebook/rebound/m.f:Lcom/facebook/rebound/i;
        //   507: getfield        com/facebook/rebound/i.a:D
        //   510: putfield        com/facebook/rebound/m.h:D
        //   513: aload_0        
        //   514: aload_0        
        //   515: getfield        com/facebook/rebound/m.h:D
        //   518: putfield        com/facebook/rebound/m.k:D
        //   521: aload_0        
        //   522: dconst_0       
        //   523: invokevirtual   com/facebook/rebound/m.a:(D)Lcom/facebook/rebound/m;
        //   526: pop            
        //   527: iconst_1       
        //   528: istore          25
        //   530: aload_0        
        //   531: getfield        com/facebook/rebound/m.e:Z
        //   534: ifeq            676
        //   537: aload_0        
        //   538: iconst_0       
        //   539: putfield        com/facebook/rebound/m.e:Z
        //   542: iconst_1       
        //   543: istore          26
        //   545: iconst_0       
        //   546: istore          27
        //   548: iload           25
        //   550: ifeq            561
        //   553: aload_0        
        //   554: iconst_1       
        //   555: putfield        com/facebook/rebound/m.e:Z
        //   558: iconst_1       
        //   559: istore          27
        //   561: aload_0        
        //   562: getfield        com/facebook/rebound/m.b:Ljava/util/concurrent/CopyOnWriteArraySet;
        //   565: invokevirtual   java/util/concurrent/CopyOnWriteArraySet.iterator:()Ljava/util/Iterator;
        //   568: astore          28
        //   570: aload           28
        //   572: invokeinterface java/util/Iterator.hasNext:()Z
        //   577: ifeq            26
        //   580: aload           28
        //   582: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   587: checkcast       Lcom/facebook/rebound/j;
        //   590: astore          29
        //   592: iload           26
        //   594: ifeq            605
        //   597: aload           29
        //   599: aload_0        
        //   600: invokeinterface com/facebook/rebound/j.b:(Lcom/facebook/rebound/m;)V
        //   605: aload           29
        //   607: aload_0        
        //   608: invokeinterface com/facebook/rebound/j.a:(Lcom/facebook/rebound/m;)V
        //   613: iload           27
        //   615: ifeq            626
        //   618: aload           29
        //   620: aload_0        
        //   621: invokeinterface com/facebook/rebound/j.c:(Lcom/facebook/rebound/m;)V
        //   626: iload_3        
        //   627: ifeq            570
        //   630: return         
        //   631: astore          34
        //   633: aload           34
        //   635: athrow         
        //   636: astore          17
        //   638: aload           17
        //   640: athrow         
        //   641: astore          18
        //   643: aload           18
        //   645: athrow         
        //   646: astore          19
        //   648: aload           19
        //   650: athrow         
        //   651: astore          20
        //   653: aload           20
        //   655: athrow         
        //   656: astore          21
        //   658: aload           21
        //   660: athrow         
        //   661: astore          22
        //   663: aload           22
        //   665: athrow         
        //   666: astore          31
        //   668: aload           31
        //   670: athrow         
        //   671: astore          30
        //   673: aload           30
        //   675: athrow         
        //   676: iconst_0       
        //   677: istore          26
        //   679: goto            545
        //   682: iload           4
        //   684: istore          25
        //   686: goto            530
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  15     21     27     32     Ljava/lang/IllegalArgumentException;
        //  119    160    631    636    Ljava/lang/IllegalArgumentException;
        //  382    439    636    641    Ljava/lang/IllegalArgumentException;
        //  439    445    641    646    Ljava/lang/IllegalArgumentException;
        //  450    456    646    651    Ljava/lang/IllegalArgumentException;
        //  461    467    651    661    Ljava/lang/IllegalArgumentException;
        //  479    498    661    666    Ljava/lang/IllegalArgumentException;
        //  502    521    661    666    Ljava/lang/IllegalArgumentException;
        //  597    605    666    671    Ljava/lang/IllegalArgumentException;
        //  605    613    671    676    Ljava/lang/IllegalArgumentException;
        //  618    626    671    676    Ljava/lang/IllegalArgumentException;
        //  643    646    646    651    Ljava/lang/IllegalArgumentException;
        //  648    651    651    661    Ljava/lang/IllegalArgumentException;
        //  653    656    656    661    Ljava/lang/IllegalArgumentException;
        //  658    661    661    666    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 351, Size: 351
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
    
    public boolean f() {
        return this.e;
    }
    
    public boolean g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/facebook/rebound/m.f:Lcom/facebook/rebound/i;
        //     4: getfield        com/facebook/rebound/i.b:D
        //     7: invokestatic    java/lang/Math.abs:(D)D
        //    10: dstore          4
        //    12: aload_0        
        //    13: getfield        com/facebook/rebound/m.d:D
        //    16: dstore          6
        //    18: dload           4
        //    20: dload           6
        //    22: dcmpg          
        //    23: ifgt            77
        //    26: aload_0        
        //    27: aload_0        
        //    28: getfield        com/facebook/rebound/m.f:Lcom/facebook/rebound/i;
        //    31: invokespecial   com/facebook/rebound/m.a:(Lcom/facebook/rebound/i;)D
        //    34: dstore          8
        //    36: aload_0        
        //    37: getfield        com/facebook/rebound/m.l:D
        //    40: dstore          10
        //    42: dload           8
        //    44: dload           10
        //    46: dcmpg          
        //    47: ifle            66
        //    50: aload_0        
        //    51: getfield        com/facebook/rebound/m.g:Lcom/facebook/rebound/o;
        //    54: getfield        com/facebook/rebound/o.c:D
        //    57: dstore          12
        //    59: dload           12
        //    61: dconst_0       
        //    62: dcmpl          
        //    63: ifne            77
        //    66: iconst_1       
        //    67: ireturn        
        //    68: astore_1       
        //    69: aload_1        
        //    70: athrow         
        //    71: astore_2       
        //    72: aload_2        
        //    73: athrow         
        //    74: astore_3       
        //    75: aload_3        
        //    76: athrow         
        //    77: iconst_0       
        //    78: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      18     68     71     Ljava/lang/IllegalArgumentException;
        //  26     42     71     74     Ljava/lang/IllegalArgumentException;
        //  50     59     74     77     Ljava/lang/IllegalArgumentException;
        //  69     71     71     74     Ljava/lang/IllegalArgumentException;
        //  72     74     74     77     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 45, Size: 45
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
    
    public m h() {
        this.h = this.f.a;
        this.a.a = this.f.a;
        this.f.b = 0.0;
        return this;
    }
    
    public m i() {
        this.b.clear();
        return this;
    }
}
