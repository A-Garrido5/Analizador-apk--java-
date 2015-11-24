// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.aJ;
import com.google.a8;
import com.google.ch;
import com.google.bl;
import com.google.fx;
import com.google.fE;
import com.google.ci;
import com.google.dS;
import com.google.fm;
import com.google.bg;
import com.google.fu;
import com.google.cL;
import java.util.Collection;
import java.util.ArrayList;
import com.google.dg;
import java.util.Collections;
import com.google.b8;
import java.util.List;
import com.google.fp;

public final class aX extends fp implements v
{
    private List e;
    private int f;
    private b8 g;
    
    private aX() {
        this.e = Collections.emptyList();
        this.a();
    }
    
    private aX(final dg dg) {
        super(dg);
        this.e = Collections.emptyList();
        this.a();
    }
    
    aX(final dg dg, final j j) {
        this(dg);
    }
    
    private void a() {
        try {
            if (an.h()) {
                this.f();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private static aX b() {
        return new aX();
    }
    
    static aX d() {
        return b();
    }
    
    private b8 f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: aload_0        
        //     3: getfield        org/whispersystems/aX.g:Lcom/google/b8;
        //     6: astore          4
        //     8: aload           4
        //    10: ifnonnull       60
        //    13: aload_0        
        //    14: getfield        org/whispersystems/aX.e:Ljava/util/List;
        //    17: astore          5
        //    19: aload_0        
        //    20: getfield        org/whispersystems/aX.f:I
        //    23: istore          6
        //    25: iload           6
        //    27: iconst_1       
        //    28: iand           
        //    29: iload_1        
        //    30: if_icmpne       71
        //    33: aload_0        
        //    34: new             Lcom/google/b8;
        //    37: dup            
        //    38: aload           5
        //    40: iload_1        
        //    41: aload_0        
        //    42: invokevirtual   org/whispersystems/aX.a:()Lcom/google/dg;
        //    45: aload_0        
        //    46: invokevirtual   org/whispersystems/aX.f:()Z
        //    49: invokespecial   com/google/b8.<init>:(Ljava/util/List;ZLcom/google/dg;Z)V
        //    52: putfield        org/whispersystems/aX.g:Lcom/google/b8;
        //    55: aload_0        
        //    56: aconst_null    
        //    57: putfield        org/whispersystems/aX.e:Ljava/util/List;
        //    60: aload_0        
        //    61: getfield        org/whispersystems/aX.g:Lcom/google/b8;
        //    64: areturn        
        //    65: astore_2       
        //    66: aload_2        
        //    67: athrow         
        //    68: astore_3       
        //    69: aload_3        
        //    70: athrow         
        //    71: iconst_0       
        //    72: istore_1       
        //    73: goto            33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      8      65     68     Ljava/lang/NullPointerException;
        //  13     25     68     71     Ljava/lang/NullPointerException;
        //  66     68     68     71     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
    
    private void j() {
        try {
            if ((0x1 & this.f) != 0x1) {
                this.e = new ArrayList(this.e);
                this.f |= 0x1;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public aX a(final cL cl, final fu fu) {
        while (true) {
            try {
                an an3;
                Throwable t;
                try {
                    final an an = (an)org.whispersystems.an.f.parsePartialFrom(cl, fu);
                    if (an == null) {
                        return this;
                    }
                    try {
                        this.a(an);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final an an2 = (an)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        an3 = an2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (an3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(an3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final an an3 = null;
                continue;
            }
            break;
        }
    }
    
    public aX a(final fm fm) {
        try {
            if (fm instanceof an) {
                return this.a((an)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public aX a(final af af) {
        Label_0054: {
            try {
                if (this.g != null) {
                    break Label_0054;
                }
                if (af == null) {
                    try {
                        throw new NullPointerException();
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
            try {
                this.j();
                this.e.add(af);
                this.c();
                if (aZ.o) {
                    this.g.a(af);
                }
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    public aX a(final an p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: invokestatic    org/whispersystems/an.a:()Lorg/whispersystems/an;
        //     7: astore          4
        //     9: aload_1        
        //    10: aload           4
        //    12: if_acmpne       20
        //    15: aload_0        
        //    16: areturn        
        //    17: astore_3       
        //    18: aload_3        
        //    19: athrow         
        //    20: aload_0        
        //    21: getfield        org/whispersystems/aX.g:Lcom/google/b8;
        //    24: astore          9
        //    26: aload           9
        //    28: ifnonnull       112
        //    31: aload_1        
        //    32: invokestatic    org/whispersystems/an.b:(Lorg/whispersystems/an;)Ljava/util/List;
        //    35: invokeinterface java/util/List.isEmpty:()Z
        //    40: istore          21
        //    42: iload           21
        //    44: ifne            218
        //    47: aload_0        
        //    48: getfield        org/whispersystems/aX.e:Ljava/util/List;
        //    51: invokeinterface java/util/List.isEmpty:()Z
        //    56: istore          22
        //    58: iload           22
        //    60: ifeq            86
        //    63: aload_0        
        //    64: aload_1        
        //    65: invokestatic    org/whispersystems/an.b:(Lorg/whispersystems/an;)Ljava/util/List;
        //    68: putfield        org/whispersystems/aX.e:Ljava/util/List;
        //    71: aload_0        
        //    72: bipush          -2
        //    74: aload_0        
        //    75: getfield        org/whispersystems/aX.f:I
        //    78: iand           
        //    79: putfield        org/whispersystems/aX.f:I
        //    82: iload_2        
        //    83: ifeq            104
        //    86: aload_0        
        //    87: invokespecial   org/whispersystems/aX.j:()V
        //    90: aload_0        
        //    91: getfield        org/whispersystems/aX.e:Ljava/util/List;
        //    94: aload_1        
        //    95: invokestatic    org/whispersystems/an.b:(Lorg/whispersystems/an;)Ljava/util/List;
        //    98: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   103: pop            
        //   104: aload_0        
        //   105: invokevirtual   org/whispersystems/aX.c:()V
        //   108: iload_2        
        //   109: ifeq            218
        //   112: aload_1        
        //   113: invokestatic    org/whispersystems/an.b:(Lorg/whispersystems/an;)Ljava/util/List;
        //   116: invokeinterface java/util/List.isEmpty:()Z
        //   121: istore          13
        //   123: iload           13
        //   125: ifne            218
        //   128: aload_0        
        //   129: getfield        org/whispersystems/aX.g:Lcom/google/b8;
        //   132: invokevirtual   com/google/b8.d:()Z
        //   135: istore          15
        //   137: iload           15
        //   139: ifeq            206
        //   142: aload_0        
        //   143: getfield        org/whispersystems/aX.g:Lcom/google/b8;
        //   146: invokevirtual   com/google/b8.f:()V
        //   149: aload_0        
        //   150: aconst_null    
        //   151: putfield        org/whispersystems/aX.g:Lcom/google/b8;
        //   154: aload_0        
        //   155: aload_1        
        //   156: invokestatic    org/whispersystems/an.b:(Lorg/whispersystems/an;)Ljava/util/List;
        //   159: putfield        org/whispersystems/aX.e:Ljava/util/List;
        //   162: aload_0        
        //   163: bipush          -2
        //   165: aload_0        
        //   166: getfield        org/whispersystems/aX.f:I
        //   169: iand           
        //   170: putfield        org/whispersystems/aX.f:I
        //   173: invokestatic    org/whispersystems/an.c:()Z
        //   176: istore          18
        //   178: aconst_null    
        //   179: astore          19
        //   181: iload           18
        //   183: ifeq            196
        //   186: aload_0        
        //   187: invokespecial   org/whispersystems/aX.f:()Lcom/google/b8;
        //   190: astore          20
        //   192: aload           20
        //   194: astore          19
        //   196: aload_0        
        //   197: aload           19
        //   199: putfield        org/whispersystems/aX.g:Lcom/google/b8;
        //   202: iload_2        
        //   203: ifeq            218
        //   206: aload_0        
        //   207: getfield        org/whispersystems/aX.g:Lcom/google/b8;
        //   210: aload_1        
        //   211: invokestatic    org/whispersystems/an.b:(Lorg/whispersystems/an;)Ljava/util/List;
        //   214: invokevirtual   com/google/b8.a:(Ljava/lang/Iterable;)Lcom/google/b8;
        //   217: pop            
        //   218: aload_0        
        //   219: aload_1        
        //   220: invokevirtual   org/whispersystems/an.getUnknownFields:()Lcom/google/ce;
        //   223: invokevirtual   org/whispersystems/aX.b:(Lcom/google/ce;)Lcom/google/fp;
        //   226: pop            
        //   227: aload_0        
        //   228: areturn        
        //   229: astore          5
        //   231: aload           5
        //   233: athrow         
        //   234: astore          6
        //   236: aload           6
        //   238: athrow         
        //   239: astore          7
        //   241: aload           7
        //   243: athrow         
        //   244: astore          8
        //   246: aload           8
        //   248: athrow         
        //   249: astore          24
        //   251: aload           24
        //   253: athrow         
        //   254: astore          10
        //   256: aload           10
        //   258: athrow         
        //   259: astore          11
        //   261: aload           11
        //   263: athrow         
        //   264: astore          12
        //   266: aload           12
        //   268: athrow         
        //   269: astore          16
        //   271: aload           16
        //   273: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      17     20     Ljava/lang/NullPointerException;
        //  20     26     229    234    Ljava/lang/NullPointerException;
        //  31     42     234    239    Ljava/lang/NullPointerException;
        //  47     58     239    244    Ljava/lang/NullPointerException;
        //  63     82     244    249    Ljava/lang/NullPointerException;
        //  86     104    244    249    Ljava/lang/NullPointerException;
        //  104    108    249    254    Ljava/lang/NullPointerException;
        //  112    123    254    259    Ljava/lang/NullPointerException;
        //  128    137    259    264    Ljava/lang/NullPointerException;
        //  142    178    264    269    Ljava/lang/NullPointerException;
        //  186    192    264    269    Ljava/lang/NullPointerException;
        //  196    202    269    274    Ljava/lang/NullPointerException;
        //  206    218    269    274    Ljava/lang/NullPointerException;
        //  231    234    234    239    Ljava/lang/NullPointerException;
        //  236    239    239    244    Ljava/lang/NullPointerException;
        //  241    244    244    249    Ljava/lang/NullPointerException;
        //  251    254    254    259    Ljava/lang/NullPointerException;
        //  256    259    259    264    Ljava/lang/NullPointerException;
        //  261    264    264    269    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 137, Size: 137
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
    public ci build() {
        return this.g();
    }
    
    @Override
    public fm build() {
        return this.g();
    }
    
    @Override
    public ci buildPartial() {
        return this.c();
    }
    
    @Override
    public fm buildPartial() {
        return this.c();
    }
    
    public an c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lorg/whispersystems/an;
        //     3: dup            
        //     4: aload_0        
        //     5: aconst_null    
        //     6: invokespecial   org/whispersystems/an.<init>:(Lcom/google/fp;Lorg/whispersystems/j;)V
        //     9: astore_1       
        //    10: aload_0        
        //    11: getfield        org/whispersystems/aX.f:I
        //    14: pop            
        //    15: aload_0        
        //    16: getfield        org/whispersystems/aX.g:Lcom/google/b8;
        //    19: astore          5
        //    21: aload           5
        //    23: ifnonnull       73
        //    26: iconst_1       
        //    27: aload_0        
        //    28: getfield        org/whispersystems/aX.f:I
        //    31: iand           
        //    32: iconst_1       
        //    33: if_icmpne       58
        //    36: aload_0        
        //    37: aload_0        
        //    38: getfield        org/whispersystems/aX.e:Ljava/util/List;
        //    41: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //    44: putfield        org/whispersystems/aX.e:Ljava/util/List;
        //    47: aload_0        
        //    48: bipush          -2
        //    50: aload_0        
        //    51: getfield        org/whispersystems/aX.f:I
        //    54: iand           
        //    55: putfield        org/whispersystems/aX.f:I
        //    58: aload_1        
        //    59: aload_0        
        //    60: getfield        org/whispersystems/aX.e:Ljava/util/List;
        //    63: invokestatic    org/whispersystems/an.a:(Lorg/whispersystems/an;Ljava/util/List;)Ljava/util/List;
        //    66: pop            
        //    67: getstatic       org/whispersystems/aZ.o:Z
        //    70: ifeq            85
        //    73: aload_1        
        //    74: aload_0        
        //    75: getfield        org/whispersystems/aX.g:Lcom/google/b8;
        //    78: invokevirtual   com/google/b8.b:()Ljava/util/List;
        //    81: invokestatic    org/whispersystems/an.a:(Lorg/whispersystems/an;Ljava/util/List;)Ljava/util/List;
        //    84: pop            
        //    85: aload_0        
        //    86: invokevirtual   org/whispersystems/aX.b:()V
        //    89: aload_1        
        //    90: areturn        
        //    91: astore_3       
        //    92: aload_3        
        //    93: athrow         
        //    94: astore          4
        //    96: aload           4
        //    98: athrow         
        //    99: astore          6
        //   101: aload           6
        //   103: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  15     21     91     94     Ljava/lang/NullPointerException;
        //  26     58     94     99     Ljava/lang/NullPointerException;
        //  58     73     99     104    Ljava/lang/NullPointerException;
        //  73     85     99     104    Ljava/lang/NullPointerException;
        //  92     94     94     99     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 57, Size: 57
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
    public fp clear() {
        return this.h();
    }
    
    @Override
    public fE clone() {
        return this.e();
    }
    
    @Override
    public fp clone() {
        return this.e();
    }
    
    @Override
    public fx clone() {
        return this.e();
    }
    
    @Override
    public Object clone() {
        return this.e();
    }
    
    public aX e() {
        return b().a(this.c());
    }
    
    public an g() {
        final an c = this.c();
        try {
            if (!c.isInitialized()) {
                throw fx.a(c);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return c;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.i();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.i();
    }
    
    @Override
    public bl getDescriptorForType() {
        return bO.p();
    }
    
    public aX h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/google/fp.clear:()Lcom/google/fp;
        //     4: pop            
        //     5: aload_0        
        //     6: getfield        org/whispersystems/aX.g:Lcom/google/b8;
        //     9: astore          4
        //    11: aload           4
        //    13: ifnonnull       40
        //    16: aload_0        
        //    17: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    20: putfield        org/whispersystems/aX.e:Ljava/util/List;
        //    23: aload_0        
        //    24: bipush          -2
        //    26: aload_0        
        //    27: getfield        org/whispersystems/aX.f:I
        //    30: iand           
        //    31: putfield        org/whispersystems/aX.f:I
        //    34: getstatic       org/whispersystems/aZ.o:Z
        //    37: ifeq            55
        //    40: aload_0        
        //    41: getfield        org/whispersystems/aX.g:Lcom/google/b8;
        //    44: invokevirtual   com/google/b8.c:()V
        //    47: aload_0        
        //    48: areturn        
        //    49: astore_1       
        //    50: aload_1        
        //    51: athrow         
        //    52: astore_2       
        //    53: aload_2        
        //    54: athrow         
        //    55: aload_0        
        //    56: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      11     49     52     Ljava/lang/NullPointerException;
        //  16     40     52     55     Ljava/lang/NullPointerException;
        //  40     47     52     55     Ljava/lang/NullPointerException;
        //  50     52     52     55     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    public an i() {
        return an.a();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.h().a(an.class, aX.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return true;
    }
    
    @Override
    public a8 mergeFrom(final fm fm) {
        return this.a(fm);
    }
    
    @Override
    public aJ mergeFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
    
    @Override
    public fE mergeFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final fm fm) {
        return this.a(fm);
    }
}
