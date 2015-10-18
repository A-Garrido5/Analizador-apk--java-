// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.aJ;
import com.google.a8;
import com.google.ch;
import com.google.bl;
import com.google.fE;
import com.google.ci;
import com.google.fx;
import com.google.fm;
import com.google.bg;
import com.google.fu;
import com.google.cL;
import com.google.dS;
import java.util.Collection;
import java.util.ArrayList;
import com.google.dg;
import java.util.Collections;
import java.util.List;
import com.google.b8;
import com.google.hv;
import com.google.aA;
import com.google.fp;

public final class a2 extends fp implements bK
{
    private int e;
    private boolean f;
    private aA g;
    private hv h;
    private aD i;
    private int j;
    private av k;
    private b8 l;
    private aA m;
    private hv n;
    private hv o;
    private a_ p;
    private hv q;
    private List r;
    private aA s;
    private int t;
    private int u;
    private int v;
    
    private a2() {
        this.h = hv.b;
        this.q = hv.b;
        this.n = hv.b;
        this.p = a_.m();
        this.r = Collections.emptyList();
        this.i = aD.d();
        this.k = av.c();
        this.o = hv.b;
        this.m();
    }
    
    private a2(final dg dg) {
        super(dg);
        this.h = hv.b;
        this.q = hv.b;
        this.n = hv.b;
        this.p = a_.m();
        this.r = Collections.emptyList();
        this.i = aD.d();
        this.k = av.c();
        this.o = hv.b;
        this.m();
    }
    
    a2(final dg dg, final j j) {
        this(dg);
    }
    
    private void a() {
        try {
            if ((0x40 & this.v) != 0x40) {
                this.r = new ArrayList(this.r);
                this.v |= 0x40;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private b8 c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       62
        //     9: aload_0        
        //    10: getfield        org/whispersystems/a2.r:Ljava/util/List;
        //    13: astore          4
        //    15: aload_0        
        //    16: getfield        org/whispersystems/a2.v:I
        //    19: istore          5
        //    21: iload           5
        //    23: bipush          64
        //    25: iand           
        //    26: bipush          64
        //    28: if_icmpne       73
        //    31: iconst_1       
        //    32: istore          6
        //    34: aload_0        
        //    35: new             Lcom/google/b8;
        //    38: dup            
        //    39: aload           4
        //    41: iload           6
        //    43: aload_0        
        //    44: invokevirtual   org/whispersystems/a2.a:()Lcom/google/dg;
        //    47: aload_0        
        //    48: invokevirtual   org/whispersystems/a2.f:()Z
        //    51: invokespecial   com/google/b8.<init>:(Ljava/util/List;ZLcom/google/dg;Z)V
        //    54: putfield        org/whispersystems/a2.l:Lcom/google/b8;
        //    57: aload_0        
        //    58: aconst_null    
        //    59: putfield        org/whispersystems/a2.r:Ljava/util/List;
        //    62: aload_0        
        //    63: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //    66: areturn        
        //    67: astore_1       
        //    68: aload_1        
        //    69: athrow         
        //    70: astore_2       
        //    71: aload_2        
        //    72: athrow         
        //    73: iconst_0       
        //    74: istore          6
        //    76: goto            34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      67     70     Ljava/lang/NullPointerException;
        //  9      21     70     73     Ljava/lang/NullPointerException;
        //  68     70     70     73     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0034:
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
    
    static a2 d() {
        return n();
    }
    
    private aA f() {
        try {
            if (this.g == null) {
                this.g = new aA(this.i, this.a(), this.f());
                this.i = null;
            }
            return this.g;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private aA h() {
        try {
            if (this.m == null) {
                this.m = new aA(this.p, this.a(), this.f());
                this.p = null;
            }
            return this.m;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private aA i() {
        try {
            if (this.s == null) {
                this.s = new aA(this.k, this.a(), this.f());
                this.k = null;
            }
            return this.s;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private void m() {
        try {
            if (aZ.L()) {
                this.h();
                this.c();
                this.f();
                this.i();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private static a2 n() {
        return new a2();
    }
    
    public a2 a(final int t) {
        this.v |= 0x400;
        this.t = t;
        this.c();
        return this;
    }
    
    public a2 a(final int n, final a_ a_) {
        Label_0057: {
            try {
                if (this.l != null) {
                    break Label_0057;
                }
                if (a_ == null) {
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
                this.a();
                this.r.set(n, a_);
                this.c();
                if (aZ.o) {
                    this.l.a(n, a_);
                }
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    public a2 a(final cL cl, final fu fu) {
        while (true) {
            try {
                aZ az3;
                Throwable t;
                try {
                    final aZ az = (aZ)aZ.E.parsePartialFrom(cl, fu);
                    if (az == null) {
                        return this;
                    }
                    try {
                        this.a(az);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final aZ az2 = (aZ)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        az3 = az2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (az3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(az3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final aZ az3 = null;
                continue;
            }
            break;
        }
    }
    
    public a2 a(final fm fm) {
        try {
            if (fm instanceof aZ) {
                return this.a((aZ)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public a2 a(final hv h) {
        if (h == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.v |= 0x2;
        this.h = h;
        this.c();
        return this;
    }
    
    public a2 a(final aD p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        org/whispersystems/a2.g:Lcom/google/aA;
        //     8: astore          7
        //    10: aload           7
        //    12: ifnonnull       86
        //    15: aload_0        
        //    16: getfield        org/whispersystems/a2.v:I
        //    19: istore          10
        //    21: iload           10
        //    23: sipush          128
        //    26: iand           
        //    27: sipush          128
        //    30: if_icmpne       73
        //    33: aload_0        
        //    34: getfield        org/whispersystems/a2.i:Lorg/whispersystems/aD;
        //    37: astore          11
        //    39: invokestatic    org/whispersystems/aD.d:()Lorg/whispersystems/aD;
        //    42: astore          12
        //    44: aload           11
        //    46: aload           12
        //    48: if_acmpeq       73
        //    51: aload_0        
        //    52: aload_0        
        //    53: getfield        org/whispersystems/a2.i:Lorg/whispersystems/aD;
        //    56: invokestatic    org/whispersystems/aD.a:(Lorg/whispersystems/aD;)Lorg/whispersystems/b4;
        //    59: aload_1        
        //    60: invokevirtual   org/whispersystems/b4.a:(Lorg/whispersystems/aD;)Lorg/whispersystems/b4;
        //    63: invokevirtual   org/whispersystems/b4.f:()Lorg/whispersystems/aD;
        //    66: putfield        org/whispersystems/a2.i:Lorg/whispersystems/aD;
        //    69: iload_2        
        //    70: ifeq            78
        //    73: aload_0        
        //    74: aload_1        
        //    75: putfield        org/whispersystems/a2.i:Lorg/whispersystems/aD;
        //    78: aload_0        
        //    79: invokevirtual   org/whispersystems/a2.c:()V
        //    82: iload_2        
        //    83: ifeq            95
        //    86: aload_0        
        //    87: getfield        org/whispersystems/a2.g:Lcom/google/aA;
        //    90: aload_1        
        //    91: invokevirtual   com/google/aA.a:(Lcom/google/dS;)Lcom/google/aA;
        //    94: pop            
        //    95: aload_0        
        //    96: sipush          128
        //    99: aload_0        
        //   100: getfield        org/whispersystems/a2.v:I
        //   103: ior            
        //   104: putfield        org/whispersystems/a2.v:I
        //   107: aload_0        
        //   108: areturn        
        //   109: astore_3       
        //   110: aload_3        
        //   111: athrow         
        //   112: astore          4
        //   114: aload           4
        //   116: athrow         
        //   117: astore          5
        //   119: aload           5
        //   121: athrow         
        //   122: astore          6
        //   124: aload           6
        //   126: athrow         
        //   127: astore          8
        //   129: aload           8
        //   131: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      10     109    112    Ljava/lang/NullPointerException;
        //  15     21     112    117    Ljava/lang/NullPointerException;
        //  33     44     117    122    Ljava/lang/NullPointerException;
        //  51     69     122    127    Ljava/lang/NullPointerException;
        //  73     78     122    127    Ljava/lang/NullPointerException;
        //  78     82     127    132    Ljava/lang/NullPointerException;
        //  86     95     127    132    Ljava/lang/NullPointerException;
        //  110    112    112    117    Ljava/lang/NullPointerException;
        //  114    117    117    122    Ljava/lang/NullPointerException;
        //  119    122    122    127    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 68, Size: 68
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
    
    public a2 a(final aZ p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: invokestatic    org/whispersystems/aZ.i:()Lorg/whispersystems/aZ;
        //     7: astore          4
        //     9: aload_1        
        //    10: aload           4
        //    12: if_acmpne       20
        //    15: aload_0        
        //    16: areturn        
        //    17: astore_3       
        //    18: aload_3        
        //    19: athrow         
        //    20: aload_1        
        //    21: invokevirtual   org/whispersystems/aZ.E:()Z
        //    24: ifeq            36
        //    27: aload_0        
        //    28: aload_1        
        //    29: invokevirtual   org/whispersystems/aZ.F:()I
        //    32: invokevirtual   org/whispersystems/a2.d:(I)Lorg/whispersystems/a2;
        //    35: pop            
        //    36: aload_1        
        //    37: invokevirtual   org/whispersystems/aZ.t:()Z
        //    40: ifeq            52
        //    43: aload_0        
        //    44: aload_1        
        //    45: invokevirtual   org/whispersystems/aZ.n:()Lcom/google/hv;
        //    48: invokevirtual   org/whispersystems/a2.a:(Lcom/google/hv;)Lorg/whispersystems/a2;
        //    51: pop            
        //    52: aload_1        
        //    53: invokevirtual   org/whispersystems/aZ.l:()Z
        //    56: ifeq            68
        //    59: aload_0        
        //    60: aload_1        
        //    61: invokevirtual   org/whispersystems/aZ.w:()Lcom/google/hv;
        //    64: invokevirtual   org/whispersystems/a2.d:(Lcom/google/hv;)Lorg/whispersystems/a2;
        //    67: pop            
        //    68: aload_1        
        //    69: invokevirtual   org/whispersystems/aZ.v:()Z
        //    72: ifeq            84
        //    75: aload_0        
        //    76: aload_1        
        //    77: invokevirtual   org/whispersystems/aZ.c:()Lcom/google/hv;
        //    80: invokevirtual   org/whispersystems/a2.c:(Lcom/google/hv;)Lorg/whispersystems/a2;
        //    83: pop            
        //    84: aload_1        
        //    85: invokevirtual   org/whispersystems/aZ.g:()Z
        //    88: ifeq            100
        //    91: aload_0        
        //    92: aload_1        
        //    93: invokevirtual   org/whispersystems/aZ.C:()I
        //    96: invokevirtual   org/whispersystems/a2.c:(I)Lorg/whispersystems/a2;
        //    99: pop            
        //   100: aload_1        
        //   101: invokevirtual   org/whispersystems/aZ.b:()Z
        //   104: ifeq            116
        //   107: aload_0        
        //   108: aload_1        
        //   109: invokevirtual   org/whispersystems/aZ.q:()Lorg/whispersystems/a_;
        //   112: invokevirtual   org/whispersystems/a2.b:(Lorg/whispersystems/a_;)Lorg/whispersystems/a2;
        //   115: pop            
        //   116: aload_0        
        //   117: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //   120: astore          15
        //   122: aload           15
        //   124: ifnonnull       208
        //   127: aload_1        
        //   128: invokestatic    org/whispersystems/aZ.b:(Lorg/whispersystems/aZ;)Ljava/util/List;
        //   131: invokeinterface java/util/List.isEmpty:()Z
        //   136: istore          39
        //   138: iload           39
        //   140: ifne            314
        //   143: aload_0        
        //   144: getfield        org/whispersystems/a2.r:Ljava/util/List;
        //   147: invokeinterface java/util/List.isEmpty:()Z
        //   152: istore          40
        //   154: iload           40
        //   156: ifeq            182
        //   159: aload_0        
        //   160: aload_1        
        //   161: invokestatic    org/whispersystems/aZ.b:(Lorg/whispersystems/aZ;)Ljava/util/List;
        //   164: putfield        org/whispersystems/a2.r:Ljava/util/List;
        //   167: aload_0        
        //   168: bipush          -65
        //   170: aload_0        
        //   171: getfield        org/whispersystems/a2.v:I
        //   174: iand           
        //   175: putfield        org/whispersystems/a2.v:I
        //   178: iload_2        
        //   179: ifeq            200
        //   182: aload_0        
        //   183: invokespecial   org/whispersystems/a2.a:()V
        //   186: aload_0        
        //   187: getfield        org/whispersystems/a2.r:Ljava/util/List;
        //   190: aload_1        
        //   191: invokestatic    org/whispersystems/aZ.b:(Lorg/whispersystems/aZ;)Ljava/util/List;
        //   194: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   199: pop            
        //   200: aload_0        
        //   201: invokevirtual   org/whispersystems/a2.c:()V
        //   204: iload_2        
        //   205: ifeq            314
        //   208: aload_1        
        //   209: invokestatic    org/whispersystems/aZ.b:(Lorg/whispersystems/aZ;)Ljava/util/List;
        //   212: invokeinterface java/util/List.isEmpty:()Z
        //   217: istore          19
        //   219: iload           19
        //   221: ifne            314
        //   224: aload_0        
        //   225: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //   228: invokevirtual   com/google/b8.d:()Z
        //   231: istore          33
        //   233: iload           33
        //   235: ifeq            302
        //   238: aload_0        
        //   239: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //   242: invokevirtual   com/google/b8.f:()V
        //   245: aload_0        
        //   246: aconst_null    
        //   247: putfield        org/whispersystems/a2.l:Lcom/google/b8;
        //   250: aload_0        
        //   251: aload_1        
        //   252: invokestatic    org/whispersystems/aZ.b:(Lorg/whispersystems/aZ;)Ljava/util/List;
        //   255: putfield        org/whispersystems/a2.r:Ljava/util/List;
        //   258: aload_0        
        //   259: bipush          -65
        //   261: aload_0        
        //   262: getfield        org/whispersystems/a2.v:I
        //   265: iand           
        //   266: putfield        org/whispersystems/a2.v:I
        //   269: invokestatic    org/whispersystems/aZ.M:()Z
        //   272: istore          36
        //   274: aconst_null    
        //   275: astore          37
        //   277: iload           36
        //   279: ifeq            292
        //   282: aload_0        
        //   283: invokespecial   org/whispersystems/a2.c:()Lcom/google/b8;
        //   286: astore          38
        //   288: aload           38
        //   290: astore          37
        //   292: aload_0        
        //   293: aload           37
        //   295: putfield        org/whispersystems/a2.l:Lcom/google/b8;
        //   298: iload_2        
        //   299: ifeq            314
        //   302: aload_0        
        //   303: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //   306: aload_1        
        //   307: invokestatic    org/whispersystems/aZ.b:(Lorg/whispersystems/aZ;)Ljava/util/List;
        //   310: invokevirtual   com/google/b8.a:(Ljava/lang/Iterable;)Lcom/google/b8;
        //   313: pop            
        //   314: aload_1        
        //   315: invokevirtual   org/whispersystems/aZ.x:()Z
        //   318: ifeq            330
        //   321: aload_0        
        //   322: aload_1        
        //   323: invokevirtual   org/whispersystems/aZ.u:()Lorg/whispersystems/aD;
        //   326: invokevirtual   org/whispersystems/a2.a:(Lorg/whispersystems/aD;)Lorg/whispersystems/a2;
        //   329: pop            
        //   330: aload_1        
        //   331: invokevirtual   org/whispersystems/aZ.h:()Z
        //   334: ifeq            346
        //   337: aload_0        
        //   338: aload_1        
        //   339: invokevirtual   org/whispersystems/aZ.p:()Lorg/whispersystems/av;
        //   342: invokevirtual   org/whispersystems/a2.b:(Lorg/whispersystems/av;)Lorg/whispersystems/a2;
        //   345: pop            
        //   346: aload_1        
        //   347: invokevirtual   org/whispersystems/aZ.K:()Z
        //   350: ifeq            362
        //   353: aload_0        
        //   354: aload_1        
        //   355: invokevirtual   org/whispersystems/aZ.z:()I
        //   358: invokevirtual   org/whispersystems/a2.b:(I)Lorg/whispersystems/a2;
        //   361: pop            
        //   362: aload_1        
        //   363: invokevirtual   org/whispersystems/aZ.y:()Z
        //   366: ifeq            378
        //   369: aload_0        
        //   370: aload_1        
        //   371: invokevirtual   org/whispersystems/aZ.d:()I
        //   374: invokevirtual   org/whispersystems/a2.a:(I)Lorg/whispersystems/a2;
        //   377: pop            
        //   378: aload_1        
        //   379: invokevirtual   org/whispersystems/aZ.B:()Z
        //   382: ifeq            394
        //   385: aload_0        
        //   386: aload_1        
        //   387: invokevirtual   org/whispersystems/aZ.A:()Z
        //   390: invokevirtual   org/whispersystems/a2.a:(Z)Lorg/whispersystems/a2;
        //   393: pop            
        //   394: aload_1        
        //   395: invokevirtual   org/whispersystems/aZ.s:()Z
        //   398: ifeq            410
        //   401: aload_0        
        //   402: aload_1        
        //   403: invokevirtual   org/whispersystems/aZ.j:()Lcom/google/hv;
        //   406: invokevirtual   org/whispersystems/a2.b:(Lcom/google/hv;)Lorg/whispersystems/a2;
        //   409: pop            
        //   410: aload_0        
        //   411: aload_1        
        //   412: invokevirtual   org/whispersystems/aZ.getUnknownFields:()Lcom/google/ce;
        //   415: invokevirtual   org/whispersystems/a2.b:(Lcom/google/ce;)Lcom/google/fp;
        //   418: pop            
        //   419: aload_0        
        //   420: areturn        
        //   421: astore          5
        //   423: aload           5
        //   425: athrow         
        //   426: astore          6
        //   428: aload           6
        //   430: athrow         
        //   431: astore          7
        //   433: aload           7
        //   435: athrow         
        //   436: astore          8
        //   438: aload           8
        //   440: athrow         
        //   441: astore          9
        //   443: aload           9
        //   445: athrow         
        //   446: astore          10
        //   448: aload           10
        //   450: athrow         
        //   451: astore          11
        //   453: aload           11
        //   455: athrow         
        //   456: astore          12
        //   458: aload           12
        //   460: athrow         
        //   461: astore          13
        //   463: aload           13
        //   465: athrow         
        //   466: astore          14
        //   468: aload           14
        //   470: athrow         
        //   471: astore          42
        //   473: aload           42
        //   475: athrow         
        //   476: astore          16
        //   478: aload           16
        //   480: athrow         
        //   481: astore          17
        //   483: aload           17
        //   485: athrow         
        //   486: astore          18
        //   488: aload           18
        //   490: athrow         
        //   491: astore          34
        //   493: aload           34
        //   495: athrow         
        //   496: astore          20
        //   498: aload           20
        //   500: athrow         
        //   501: astore          21
        //   503: aload           21
        //   505: athrow         
        //   506: astore          22
        //   508: aload           22
        //   510: athrow         
        //   511: astore          23
        //   513: aload           23
        //   515: athrow         
        //   516: astore          24
        //   518: aload           24
        //   520: athrow         
        //   521: astore          25
        //   523: aload           25
        //   525: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      17     20     Ljava/lang/NullPointerException;
        //  20     36     421    426    Ljava/lang/NullPointerException;
        //  36     52     426    431    Ljava/lang/NullPointerException;
        //  52     68     431    436    Ljava/lang/NullPointerException;
        //  68     84     436    441    Ljava/lang/NullPointerException;
        //  84     100    441    446    Ljava/lang/NullPointerException;
        //  100    116    446    451    Ljava/lang/NullPointerException;
        //  116    122    451    456    Ljava/lang/NullPointerException;
        //  127    138    456    461    Ljava/lang/NullPointerException;
        //  143    154    461    466    Ljava/lang/NullPointerException;
        //  159    178    466    471    Ljava/lang/NullPointerException;
        //  182    200    466    471    Ljava/lang/NullPointerException;
        //  200    204    471    476    Ljava/lang/NullPointerException;
        //  208    219    476    481    Ljava/lang/NullPointerException;
        //  224    233    481    486    Ljava/lang/NullPointerException;
        //  238    274    486    491    Ljava/lang/NullPointerException;
        //  282    288    486    491    Ljava/lang/NullPointerException;
        //  292    298    491    496    Ljava/lang/NullPointerException;
        //  302    314    491    496    Ljava/lang/NullPointerException;
        //  314    330    496    501    Ljava/lang/NullPointerException;
        //  330    346    501    506    Ljava/lang/NullPointerException;
        //  346    362    506    511    Ljava/lang/NullPointerException;
        //  362    378    511    516    Ljava/lang/NullPointerException;
        //  378    394    516    521    Ljava/lang/NullPointerException;
        //  394    410    521    526    Ljava/lang/NullPointerException;
        //  453    456    456    461    Ljava/lang/NullPointerException;
        //  458    461    461    466    Ljava/lang/NullPointerException;
        //  463    466    466    471    Ljava/lang/NullPointerException;
        //  473    476    476    481    Ljava/lang/NullPointerException;
        //  478    481    481    486    Ljava/lang/NullPointerException;
        //  483    486    486    491    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 269, Size: 269
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
    
    public a2 a(final a_ p) {
        Label_0044: {
            try {
                if (this.m != null) {
                    break Label_0044;
                }
                if (p == null) {
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
                this.p = p;
                this.c();
                if (aZ.o) {
                    this.m.b(p);
                }
                this.v |= 0x20;
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    public a2 a(final av k) {
        Label_0044: {
            try {
                if (this.s != null) {
                    break Label_0044;
                }
                if (k == null) {
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
                this.k = k;
                this.c();
                if (aZ.o) {
                    this.s.b(k);
                }
                this.v |= 0x100;
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    public a2 a(final boolean f) {
        this.v |= 0x800;
        this.f = f;
        this.c();
        return this;
    }
    
    public a2 b(final int u) {
        this.v |= 0x200;
        this.u = u;
        this.c();
        return this;
    }
    
    public a2 b(final hv o) {
        if (o == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.v |= 0x1000;
        this.o = o;
        this.c();
        return this;
    }
    
    public a2 b(final a_ p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        org/whispersystems/a2.m:Lcom/google/aA;
        //     8: astore          7
        //    10: aload           7
        //    12: ifnonnull       84
        //    15: aload_0        
        //    16: getfield        org/whispersystems/a2.v:I
        //    19: istore          10
        //    21: iload           10
        //    23: bipush          32
        //    25: iand           
        //    26: bipush          32
        //    28: if_icmpne       71
        //    31: aload_0        
        //    32: getfield        org/whispersystems/a2.p:Lorg/whispersystems/a_;
        //    35: astore          11
        //    37: invokestatic    org/whispersystems/a_.m:()Lorg/whispersystems/a_;
        //    40: astore          12
        //    42: aload           11
        //    44: aload           12
        //    46: if_acmpeq       71
        //    49: aload_0        
        //    50: aload_0        
        //    51: getfield        org/whispersystems/a2.p:Lorg/whispersystems/a_;
        //    54: invokestatic    org/whispersystems/a_.b:(Lorg/whispersystems/a_;)Lorg/whispersystems/bT;
        //    57: aload_1        
        //    58: invokevirtual   org/whispersystems/bT.a:(Lorg/whispersystems/a_;)Lorg/whispersystems/bT;
        //    61: invokevirtual   org/whispersystems/bT.h:()Lorg/whispersystems/a_;
        //    64: putfield        org/whispersystems/a2.p:Lorg/whispersystems/a_;
        //    67: iload_2        
        //    68: ifeq            76
        //    71: aload_0        
        //    72: aload_1        
        //    73: putfield        org/whispersystems/a2.p:Lorg/whispersystems/a_;
        //    76: aload_0        
        //    77: invokevirtual   org/whispersystems/a2.c:()V
        //    80: iload_2        
        //    81: ifeq            93
        //    84: aload_0        
        //    85: getfield        org/whispersystems/a2.m:Lcom/google/aA;
        //    88: aload_1        
        //    89: invokevirtual   com/google/aA.a:(Lcom/google/dS;)Lcom/google/aA;
        //    92: pop            
        //    93: aload_0        
        //    94: bipush          32
        //    96: aload_0        
        //    97: getfield        org/whispersystems/a2.v:I
        //   100: ior            
        //   101: putfield        org/whispersystems/a2.v:I
        //   104: aload_0        
        //   105: areturn        
        //   106: astore_3       
        //   107: aload_3        
        //   108: athrow         
        //   109: astore          4
        //   111: aload           4
        //   113: athrow         
        //   114: astore          5
        //   116: aload           5
        //   118: athrow         
        //   119: astore          6
        //   121: aload           6
        //   123: athrow         
        //   124: astore          8
        //   126: aload           8
        //   128: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      10     106    109    Ljava/lang/NullPointerException;
        //  15     21     109    114    Ljava/lang/NullPointerException;
        //  31     42     114    119    Ljava/lang/NullPointerException;
        //  49     67     119    124    Ljava/lang/NullPointerException;
        //  71     76     119    124    Ljava/lang/NullPointerException;
        //  76     80     124    129    Ljava/lang/NullPointerException;
        //  84     93     124    129    Ljava/lang/NullPointerException;
        //  107    109    109    114    Ljava/lang/NullPointerException;
        //  111    114    114    119    Ljava/lang/NullPointerException;
        //  116    119    119    124    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 68, Size: 68
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
    
    public a2 b(final av p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        org/whispersystems/a2.s:Lcom/google/aA;
        //     8: astore          7
        //    10: aload           7
        //    12: ifnonnull       86
        //    15: aload_0        
        //    16: getfield        org/whispersystems/a2.v:I
        //    19: istore          10
        //    21: iload           10
        //    23: sipush          256
        //    26: iand           
        //    27: sipush          256
        //    30: if_icmpne       73
        //    33: aload_0        
        //    34: getfield        org/whispersystems/a2.k:Lorg/whispersystems/av;
        //    37: astore          11
        //    39: invokestatic    org/whispersystems/av.c:()Lorg/whispersystems/av;
        //    42: astore          12
        //    44: aload           11
        //    46: aload           12
        //    48: if_acmpeq       73
        //    51: aload_0        
        //    52: aload_0        
        //    53: getfield        org/whispersystems/a2.k:Lorg/whispersystems/av;
        //    56: invokestatic    org/whispersystems/av.a:(Lorg/whispersystems/av;)Lorg/whispersystems/bS;
        //    59: aload_1        
        //    60: invokevirtual   org/whispersystems/bS.a:(Lorg/whispersystems/av;)Lorg/whispersystems/bS;
        //    63: invokevirtual   org/whispersystems/bS.g:()Lorg/whispersystems/av;
        //    66: putfield        org/whispersystems/a2.k:Lorg/whispersystems/av;
        //    69: iload_2        
        //    70: ifeq            78
        //    73: aload_0        
        //    74: aload_1        
        //    75: putfield        org/whispersystems/a2.k:Lorg/whispersystems/av;
        //    78: aload_0        
        //    79: invokevirtual   org/whispersystems/a2.c:()V
        //    82: iload_2        
        //    83: ifeq            95
        //    86: aload_0        
        //    87: getfield        org/whispersystems/a2.s:Lcom/google/aA;
        //    90: aload_1        
        //    91: invokevirtual   com/google/aA.a:(Lcom/google/dS;)Lcom/google/aA;
        //    94: pop            
        //    95: aload_0        
        //    96: sipush          256
        //    99: aload_0        
        //   100: getfield        org/whispersystems/a2.v:I
        //   103: ior            
        //   104: putfield        org/whispersystems/a2.v:I
        //   107: aload_0        
        //   108: areturn        
        //   109: astore_3       
        //   110: aload_3        
        //   111: athrow         
        //   112: astore          4
        //   114: aload           4
        //   116: athrow         
        //   117: astore          5
        //   119: aload           5
        //   121: athrow         
        //   122: astore          6
        //   124: aload           6
        //   126: athrow         
        //   127: astore          8
        //   129: aload           8
        //   131: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      10     109    112    Ljava/lang/NullPointerException;
        //  15     21     112    117    Ljava/lang/NullPointerException;
        //  33     44     117    122    Ljava/lang/NullPointerException;
        //  51     69     122    127    Ljava/lang/NullPointerException;
        //  73     78     122    127    Ljava/lang/NullPointerException;
        //  78     82     127    132    Ljava/lang/NullPointerException;
        //  86     95     127    132    Ljava/lang/NullPointerException;
        //  110    112    112    117    Ljava/lang/NullPointerException;
        //  114    117    117    122    Ljava/lang/NullPointerException;
        //  119    122    122    127    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 68, Size: 68
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
    
    public aZ b() {
        final aZ l = this.l();
        try {
            if (!l.isInitialized()) {
                throw fx.a(l);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return l;
    }
    
    @Override
    public ci build() {
        return this.b();
    }
    
    @Override
    public fm build() {
        return this.b();
    }
    
    @Override
    public ci buildPartial() {
        return this.l();
    }
    
    @Override
    public fm buildPartial() {
        return this.l();
    }
    
    public a2 c(final int e) {
        this.v |= 0x10;
        this.e = e;
        this.c();
        return this;
    }
    
    public a2 c(final hv n) {
        if (n == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.v |= 0x8;
        this.n = n;
        this.c();
        return this;
    }
    
    public a2 c(final a_ a_) {
        Label_0054: {
            try {
                if (this.l != null) {
                    break Label_0054;
                }
                if (a_ == null) {
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
                this.a();
                this.r.add(a_);
                this.c();
                if (aZ.o) {
                    this.l.a(a_);
                }
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    @Override
    public fp clear() {
        return this.e();
    }
    
    @Override
    public fE clone() {
        return this.k();
    }
    
    @Override
    public fp clone() {
        return this.k();
    }
    
    @Override
    public fx clone() {
        return this.k();
    }
    
    @Override
    public Object clone() {
        return this.k();
    }
    
    public a2 d(final int j) {
        this.v |= 0x1;
        this.j = j;
        this.c();
        return this;
    }
    
    public a2 d(final hv q) {
        if (q == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.v |= 0x4;
        this.q = q;
        this.c();
        return this;
    }
    
    public a2 e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokespecial   com/google/fp.clear:()Lcom/google/fp;
        //     8: pop            
        //     9: aload_0        
        //    10: iconst_0       
        //    11: putfield        org/whispersystems/a2.j:I
        //    14: aload_0        
        //    15: bipush          -2
        //    17: aload_0        
        //    18: getfield        org/whispersystems/a2.v:I
        //    21: iand           
        //    22: putfield        org/whispersystems/a2.v:I
        //    25: aload_0        
        //    26: getstatic       com/google/hv.b:Lcom/google/hv;
        //    29: putfield        org/whispersystems/a2.h:Lcom/google/hv;
        //    32: aload_0        
        //    33: bipush          -3
        //    35: aload_0        
        //    36: getfield        org/whispersystems/a2.v:I
        //    39: iand           
        //    40: putfield        org/whispersystems/a2.v:I
        //    43: aload_0        
        //    44: getstatic       com/google/hv.b:Lcom/google/hv;
        //    47: putfield        org/whispersystems/a2.q:Lcom/google/hv;
        //    50: aload_0        
        //    51: bipush          -5
        //    53: aload_0        
        //    54: getfield        org/whispersystems/a2.v:I
        //    57: iand           
        //    58: putfield        org/whispersystems/a2.v:I
        //    61: aload_0        
        //    62: getstatic       com/google/hv.b:Lcom/google/hv;
        //    65: putfield        org/whispersystems/a2.n:Lcom/google/hv;
        //    68: aload_0        
        //    69: bipush          -9
        //    71: aload_0        
        //    72: getfield        org/whispersystems/a2.v:I
        //    75: iand           
        //    76: putfield        org/whispersystems/a2.v:I
        //    79: aload_0        
        //    80: iconst_0       
        //    81: putfield        org/whispersystems/a2.e:I
        //    84: aload_0        
        //    85: bipush          -17
        //    87: aload_0        
        //    88: getfield        org/whispersystems/a2.v:I
        //    91: iand           
        //    92: putfield        org/whispersystems/a2.v:I
        //    95: aload_0        
        //    96: getfield        org/whispersystems/a2.m:Lcom/google/aA;
        //    99: astore          5
        //   101: aload           5
        //   103: ifnonnull       117
        //   106: aload_0        
        //   107: invokestatic    org/whispersystems/a_.m:()Lorg/whispersystems/a_;
        //   110: putfield        org/whispersystems/a2.p:Lorg/whispersystems/a_;
        //   113: iload_1        
        //   114: ifeq            125
        //   117: aload_0        
        //   118: getfield        org/whispersystems/a2.m:Lcom/google/aA;
        //   121: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //   124: pop            
        //   125: aload_0        
        //   126: bipush          -33
        //   128: aload_0        
        //   129: getfield        org/whispersystems/a2.v:I
        //   132: iand           
        //   133: putfield        org/whispersystems/a2.v:I
        //   136: aload_0        
        //   137: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //   140: astore          9
        //   142: aload           9
        //   144: ifnonnull       169
        //   147: aload_0        
        //   148: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   151: putfield        org/whispersystems/a2.r:Ljava/util/List;
        //   154: aload_0        
        //   155: bipush          -65
        //   157: aload_0        
        //   158: getfield        org/whispersystems/a2.v:I
        //   161: iand           
        //   162: putfield        org/whispersystems/a2.v:I
        //   165: iload_1        
        //   166: ifeq            176
        //   169: aload_0        
        //   170: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //   173: invokevirtual   com/google/b8.c:()V
        //   176: aload_0        
        //   177: getfield        org/whispersystems/a2.g:Lcom/google/aA;
        //   180: astore          12
        //   182: aload           12
        //   184: ifnonnull       198
        //   187: aload_0        
        //   188: invokestatic    org/whispersystems/aD.d:()Lorg/whispersystems/aD;
        //   191: putfield        org/whispersystems/a2.i:Lorg/whispersystems/aD;
        //   194: iload_1        
        //   195: ifeq            206
        //   198: aload_0        
        //   199: getfield        org/whispersystems/a2.g:Lcom/google/aA;
        //   202: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //   205: pop            
        //   206: aload_0        
        //   207: sipush          -129
        //   210: aload_0        
        //   211: getfield        org/whispersystems/a2.v:I
        //   214: iand           
        //   215: putfield        org/whispersystems/a2.v:I
        //   218: aload_0        
        //   219: getfield        org/whispersystems/a2.s:Lcom/google/aA;
        //   222: astore          16
        //   224: aload           16
        //   226: ifnonnull       240
        //   229: aload_0        
        //   230: invokestatic    org/whispersystems/av.c:()Lorg/whispersystems/av;
        //   233: putfield        org/whispersystems/a2.k:Lorg/whispersystems/av;
        //   236: iload_1        
        //   237: ifeq            248
        //   240: aload_0        
        //   241: getfield        org/whispersystems/a2.s:Lcom/google/aA;
        //   244: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //   247: pop            
        //   248: aload_0        
        //   249: sipush          -257
        //   252: aload_0        
        //   253: getfield        org/whispersystems/a2.v:I
        //   256: iand           
        //   257: putfield        org/whispersystems/a2.v:I
        //   260: aload_0        
        //   261: iconst_0       
        //   262: putfield        org/whispersystems/a2.u:I
        //   265: aload_0        
        //   266: sipush          -513
        //   269: aload_0        
        //   270: getfield        org/whispersystems/a2.v:I
        //   273: iand           
        //   274: putfield        org/whispersystems/a2.v:I
        //   277: aload_0        
        //   278: iconst_0       
        //   279: putfield        org/whispersystems/a2.t:I
        //   282: aload_0        
        //   283: sipush          -1025
        //   286: aload_0        
        //   287: getfield        org/whispersystems/a2.v:I
        //   290: iand           
        //   291: putfield        org/whispersystems/a2.v:I
        //   294: aload_0        
        //   295: iconst_0       
        //   296: putfield        org/whispersystems/a2.f:Z
        //   299: aload_0        
        //   300: sipush          -2049
        //   303: aload_0        
        //   304: getfield        org/whispersystems/a2.v:I
        //   307: iand           
        //   308: putfield        org/whispersystems/a2.v:I
        //   311: aload_0        
        //   312: getstatic       com/google/hv.b:Lcom/google/hv;
        //   315: putfield        org/whispersystems/a2.o:Lcom/google/hv;
        //   318: aload_0        
        //   319: sipush          -4097
        //   322: aload_0        
        //   323: getfield        org/whispersystems/a2.v:I
        //   326: iand           
        //   327: putfield        org/whispersystems/a2.v:I
        //   330: aload_0        
        //   331: areturn        
        //   332: astore_2       
        //   333: aload_2        
        //   334: athrow         
        //   335: astore_3       
        //   336: aload_3        
        //   337: athrow         
        //   338: astore          7
        //   340: aload           7
        //   342: athrow         
        //   343: astore          8
        //   345: aload           8
        //   347: athrow         
        //   348: astore          10
        //   350: aload           10
        //   352: athrow         
        //   353: astore          11
        //   355: aload           11
        //   357: athrow         
        //   358: astore          14
        //   360: aload           14
        //   362: athrow         
        //   363: astore          15
        //   365: aload           15
        //   367: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      101    332    335    Ljava/lang/NullPointerException;
        //  106    113    335    338    Ljava/lang/NullPointerException;
        //  117    125    335    338    Ljava/lang/NullPointerException;
        //  125    142    338    343    Ljava/lang/NullPointerException;
        //  147    165    343    348    Ljava/lang/NullPointerException;
        //  169    176    343    348    Ljava/lang/NullPointerException;
        //  176    182    348    353    Ljava/lang/NullPointerException;
        //  187    194    353    358    Ljava/lang/NullPointerException;
        //  198    206    353    358    Ljava/lang/NullPointerException;
        //  206    224    358    363    Ljava/lang/NullPointerException;
        //  229    236    363    368    Ljava/lang/NullPointerException;
        //  240    248    363    368    Ljava/lang/NullPointerException;
        //  333    335    335    338    Ljava/lang/NullPointerException;
        //  340    343    343    348    Ljava/lang/NullPointerException;
        //  350    353    353    358    Ljava/lang/NullPointerException;
        //  360    363    363    368    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 191, Size: 191
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
    
    public a2 e(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnonnull       36
        //    11: aload_0        
        //    12: invokespecial   org/whispersystems/a2.a:()V
        //    15: aload_0        
        //    16: getfield        org/whispersystems/a2.r:Ljava/util/List;
        //    19: iload_1        
        //    20: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
        //    25: pop            
        //    26: aload_0        
        //    27: invokevirtual   org/whispersystems/a2.c:()V
        //    30: getstatic       org/whispersystems/aZ.o:Z
        //    33: ifeq            52
        //    36: aload_0        
        //    37: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //    40: iload_1        
        //    41: invokevirtual   com/google/b8.d:(I)V
        //    44: aload_0        
        //    45: areturn        
        //    46: astore_2       
        //    47: aload_2        
        //    48: athrow         
        //    49: astore_3       
        //    50: aload_3        
        //    51: athrow         
        //    52: aload_0        
        //    53: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      6      46     49     Ljava/lang/NullPointerException;
        //  11     36     49     52     Ljava/lang/NullPointerException;
        //  36     44     49     52     Ljava/lang/NullPointerException;
        //  47     49     49     52     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
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
    
    public aZ g() {
        return aZ.i();
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.g();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.g();
    }
    
    @Override
    public bl getDescriptorForType() {
        return bO.x();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.s().a(aZ.class, a2.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return true;
    }
    
    public a2 j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/a2.s:Lcom/google/aA;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       26
        //     9: aload_0        
        //    10: invokestatic    org/whispersystems/av.c:()Lorg/whispersystems/av;
        //    13: putfield        org/whispersystems/a2.k:Lorg/whispersystems/av;
        //    16: aload_0        
        //    17: invokevirtual   org/whispersystems/a2.c:()V
        //    20: getstatic       org/whispersystems/aZ.o:Z
        //    23: ifeq            34
        //    26: aload_0        
        //    27: getfield        org/whispersystems/a2.s:Lcom/google/aA;
        //    30: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //    33: pop            
        //    34: aload_0        
        //    35: sipush          -257
        //    38: aload_0        
        //    39: getfield        org/whispersystems/a2.v:I
        //    42: iand           
        //    43: putfield        org/whispersystems/a2.v:I
        //    46: aload_0        
        //    47: areturn        
        //    48: astore_1       
        //    49: aload_1        
        //    50: athrow         
        //    51: astore_2       
        //    52: aload_2        
        //    53: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      48     51     Ljava/lang/NullPointerException;
        //  9      26     51     54     Ljava/lang/NullPointerException;
        //  26     34     51     54     Ljava/lang/NullPointerException;
        //  49     51     51     54     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    public a2 k() {
        return n().a(this.l());
    }
    
    public aZ l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_1       
        //     4: new             Lorg/whispersystems/aZ;
        //     7: dup            
        //     8: aload_0        
        //     9: aconst_null    
        //    10: invokespecial   org/whispersystems/aZ.<init>:(Lcom/google/fp;Lorg/whispersystems/j;)V
        //    13: astore_2       
        //    14: aload_0        
        //    15: getfield        org/whispersystems/a2.v:I
        //    18: istore_3       
        //    19: iload_3        
        //    20: iconst_1       
        //    21: iand           
        //    22: iconst_1       
        //    23: if_icmpne       594
        //    26: iconst_1       
        //    27: istore          4
        //    29: aload_2        
        //    30: aload_0        
        //    31: getfield        org/whispersystems/a2.j:I
        //    34: invokestatic    org/whispersystems/aZ.c:(Lorg/whispersystems/aZ;I)I
        //    37: pop            
        //    38: iload_3        
        //    39: iconst_2       
        //    40: iand           
        //    41: iconst_2       
        //    42: if_icmpne       51
        //    45: iload           4
        //    47: iconst_2       
        //    48: ior            
        //    49: istore          4
        //    51: aload_2        
        //    52: aload_0        
        //    53: getfield        org/whispersystems/a2.h:Lcom/google/hv;
        //    56: invokestatic    org/whispersystems/aZ.d:(Lorg/whispersystems/aZ;Lcom/google/hv;)Lcom/google/hv;
        //    59: pop            
        //    60: iload_3        
        //    61: iconst_4       
        //    62: iand           
        //    63: iconst_4       
        //    64: if_icmpne       73
        //    67: iload           4
        //    69: iconst_4       
        //    70: ior            
        //    71: istore          4
        //    73: aload_2        
        //    74: aload_0        
        //    75: getfield        org/whispersystems/a2.q:Lcom/google/hv;
        //    78: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;Lcom/google/hv;)Lcom/google/hv;
        //    81: pop            
        //    82: iload_3        
        //    83: bipush          8
        //    85: iand           
        //    86: bipush          8
        //    88: if_icmpne       98
        //    91: iload           4
        //    93: bipush          8
        //    95: ior            
        //    96: istore          4
        //    98: aload_2        
        //    99: aload_0        
        //   100: getfield        org/whispersystems/a2.n:Lcom/google/hv;
        //   103: invokestatic    org/whispersystems/aZ.c:(Lorg/whispersystems/aZ;Lcom/google/hv;)Lcom/google/hv;
        //   106: pop            
        //   107: iload_3        
        //   108: bipush          16
        //   110: iand           
        //   111: bipush          16
        //   113: if_icmpne       123
        //   116: iload           4
        //   118: bipush          16
        //   120: ior            
        //   121: istore          4
        //   123: aload_2        
        //   124: aload_0        
        //   125: getfield        org/whispersystems/a2.e:I
        //   128: invokestatic    org/whispersystems/aZ.b:(Lorg/whispersystems/aZ;I)I
        //   131: pop            
        //   132: iload_3        
        //   133: bipush          32
        //   135: iand           
        //   136: bipush          32
        //   138: if_icmpne       587
        //   141: iload           4
        //   143: bipush          32
        //   145: ior            
        //   146: istore          10
        //   148: aload_0        
        //   149: getfield        org/whispersystems/a2.m:Lcom/google/aA;
        //   152: astore          13
        //   154: aload           13
        //   156: ifnonnull       172
        //   159: aload_2        
        //   160: aload_0        
        //   161: getfield        org/whispersystems/a2.p:Lorg/whispersystems/a_;
        //   164: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;Lorg/whispersystems/a_;)Lorg/whispersystems/a_;
        //   167: pop            
        //   168: iload_1        
        //   169: ifeq            187
        //   172: aload_2        
        //   173: aload_0        
        //   174: getfield        org/whispersystems/a2.m:Lcom/google/aA;
        //   177: invokevirtual   com/google/aA.a:()Lcom/google/dS;
        //   180: checkcast       Lorg/whispersystems/a_;
        //   183: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;Lorg/whispersystems/a_;)Lorg/whispersystems/a_;
        //   186: pop            
        //   187: aload_0        
        //   188: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //   191: astore          17
        //   193: aload           17
        //   195: ifnonnull       245
        //   198: bipush          64
        //   200: aload_0        
        //   201: getfield        org/whispersystems/a2.v:I
        //   204: iand           
        //   205: bipush          64
        //   207: if_icmpne       232
        //   210: aload_0        
        //   211: aload_0        
        //   212: getfield        org/whispersystems/a2.r:Ljava/util/List;
        //   215: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   218: putfield        org/whispersystems/a2.r:Ljava/util/List;
        //   221: aload_0        
        //   222: bipush          -65
        //   224: aload_0        
        //   225: getfield        org/whispersystems/a2.v:I
        //   228: iand           
        //   229: putfield        org/whispersystems/a2.v:I
        //   232: aload_2        
        //   233: aload_0        
        //   234: getfield        org/whispersystems/a2.r:Ljava/util/List;
        //   237: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;Ljava/util/List;)Ljava/util/List;
        //   240: pop            
        //   241: iload_1        
        //   242: ifeq            257
        //   245: aload_2        
        //   246: aload_0        
        //   247: getfield        org/whispersystems/a2.l:Lcom/google/b8;
        //   250: invokevirtual   com/google/b8.b:()Ljava/util/List;
        //   253: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;Ljava/util/List;)Ljava/util/List;
        //   256: pop            
        //   257: iload_3        
        //   258: sipush          128
        //   261: iand           
        //   262: sipush          128
        //   265: if_icmpne       275
        //   268: iload           10
        //   270: bipush          64
        //   272: ior            
        //   273: istore          10
        //   275: aload_0        
        //   276: getfield        org/whispersystems/a2.g:Lcom/google/aA;
        //   279: astore          22
        //   281: aload           22
        //   283: ifnonnull       299
        //   286: aload_2        
        //   287: aload_0        
        //   288: getfield        org/whispersystems/a2.i:Lorg/whispersystems/aD;
        //   291: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;Lorg/whispersystems/aD;)Lorg/whispersystems/aD;
        //   294: pop            
        //   295: iload_1        
        //   296: ifeq            314
        //   299: aload_2        
        //   300: aload_0        
        //   301: getfield        org/whispersystems/a2.g:Lcom/google/aA;
        //   304: invokevirtual   com/google/aA.a:()Lcom/google/dS;
        //   307: checkcast       Lorg/whispersystems/aD;
        //   310: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;Lorg/whispersystems/aD;)Lorg/whispersystems/aD;
        //   313: pop            
        //   314: iload_3        
        //   315: sipush          256
        //   318: iand           
        //   319: sipush          256
        //   322: if_icmpne       333
        //   325: iload           10
        //   327: sipush          128
        //   330: ior            
        //   331: istore          10
        //   333: aload_0        
        //   334: getfield        org/whispersystems/a2.s:Lcom/google/aA;
        //   337: astore          26
        //   339: aload           26
        //   341: ifnonnull       357
        //   344: aload_2        
        //   345: aload_0        
        //   346: getfield        org/whispersystems/a2.k:Lorg/whispersystems/av;
        //   349: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;Lorg/whispersystems/av;)Lorg/whispersystems/av;
        //   352: pop            
        //   353: iload_1        
        //   354: ifeq            372
        //   357: aload_2        
        //   358: aload_0        
        //   359: getfield        org/whispersystems/a2.s:Lcom/google/aA;
        //   362: invokevirtual   com/google/aA.a:()Lcom/google/dS;
        //   365: checkcast       Lorg/whispersystems/av;
        //   368: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;Lorg/whispersystems/av;)Lorg/whispersystems/av;
        //   371: pop            
        //   372: iload_3        
        //   373: sipush          512
        //   376: iand           
        //   377: sipush          512
        //   380: if_icmpne       580
        //   383: iload           10
        //   385: sipush          256
        //   388: ior            
        //   389: istore          28
        //   391: aload_2        
        //   392: aload_0        
        //   393: getfield        org/whispersystems/a2.u:I
        //   396: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;I)I
        //   399: pop            
        //   400: iload_3        
        //   401: sipush          1024
        //   404: iand           
        //   405: sipush          1024
        //   408: if_icmpne       419
        //   411: iload           28
        //   413: sipush          512
        //   416: ior            
        //   417: istore          28
        //   419: aload_2        
        //   420: aload_0        
        //   421: getfield        org/whispersystems/a2.t:I
        //   424: invokestatic    org/whispersystems/aZ.e:(Lorg/whispersystems/aZ;I)I
        //   427: pop            
        //   428: iload_3        
        //   429: sipush          2048
        //   432: iand           
        //   433: sipush          2048
        //   436: if_icmpne       447
        //   439: iload           28
        //   441: sipush          1024
        //   444: ior            
        //   445: istore          28
        //   447: aload_2        
        //   448: aload_0        
        //   449: getfield        org/whispersystems/a2.f:Z
        //   452: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;Z)Z
        //   455: pop            
        //   456: iload_3        
        //   457: sipush          4096
        //   460: iand           
        //   461: sipush          4096
        //   464: if_icmpne       475
        //   467: iload           28
        //   469: sipush          2048
        //   472: ior            
        //   473: istore          28
        //   475: aload_2        
        //   476: aload_0        
        //   477: getfield        org/whispersystems/a2.o:Lcom/google/hv;
        //   480: invokestatic    org/whispersystems/aZ.b:(Lorg/whispersystems/aZ;Lcom/google/hv;)Lcom/google/hv;
        //   483: pop            
        //   484: aload_2        
        //   485: iload           28
        //   487: invokestatic    org/whispersystems/aZ.d:(Lorg/whispersystems/aZ;I)I
        //   490: pop            
        //   491: aload_0        
        //   492: invokevirtual   org/whispersystems/a2.b:()V
        //   495: getstatic       org/whispersystems/bO.s:I
        //   498: istore          36
        //   500: iload           36
        //   502: ifeq            517
        //   505: iconst_0       
        //   506: istore          37
        //   508: iload_1        
        //   509: ifeq            574
        //   512: iload           37
        //   514: putstatic       org/whispersystems/aZ.o:Z
        //   517: aload_2        
        //   518: areturn        
        //   519: astore          11
        //   521: aload           11
        //   523: athrow         
        //   524: astore          12
        //   526: aload           12
        //   528: athrow         
        //   529: astore          15
        //   531: aload           15
        //   533: athrow         
        //   534: astore          16
        //   536: aload           16
        //   538: athrow         
        //   539: astore          18
        //   541: aload           18
        //   543: athrow         
        //   544: astore          20
        //   546: aload           20
        //   548: athrow         
        //   549: astore          21
        //   551: aload           21
        //   553: athrow         
        //   554: astore          24
        //   556: aload           24
        //   558: athrow         
        //   559: astore          25
        //   561: aload           25
        //   563: athrow         
        //   564: astore          32
        //   566: aload           32
        //   568: athrow         
        //   569: astore          33
        //   571: aload           33
        //   573: athrow         
        //   574: iconst_1       
        //   575: istore          37
        //   577: goto            512
        //   580: iload           10
        //   582: istore          28
        //   584: goto            391
        //   587: iload           4
        //   589: istore          10
        //   591: goto            148
        //   594: iconst_0       
        //   595: istore          4
        //   597: goto            29
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  148    154    519    524    Ljava/lang/NullPointerException;
        //  159    168    524    529    Ljava/lang/NullPointerException;
        //  172    187    524    529    Ljava/lang/NullPointerException;
        //  187    193    529    534    Ljava/lang/NullPointerException;
        //  198    232    534    539    Ljava/lang/NullPointerException;
        //  232    241    539    544    Ljava/lang/NullPointerException;
        //  245    257    539    544    Ljava/lang/NullPointerException;
        //  275    281    544    549    Ljava/lang/NullPointerException;
        //  286    295    549    554    Ljava/lang/NullPointerException;
        //  299    314    549    554    Ljava/lang/NullPointerException;
        //  333    339    554    559    Ljava/lang/NullPointerException;
        //  344    353    559    564    Ljava/lang/NullPointerException;
        //  357    372    559    564    Ljava/lang/NullPointerException;
        //  475    500    564    574    Ljava/lang/NullPointerException;
        //  521    524    524    529    Ljava/lang/NullPointerException;
        //  531    534    534    539    Ljava/lang/NullPointerException;
        //  546    549    549    554    Ljava/lang/NullPointerException;
        //  556    559    559    564    Ljava/lang/NullPointerException;
        //  566    569    569    574    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 317, Size: 317
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
