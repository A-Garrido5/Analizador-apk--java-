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
import com.google.fm;
import com.google.bg;
import com.google.fu;
import com.google.cL;
import com.google.dS;
import java.util.Collection;
import java.util.ArrayList;
import com.google.dg;
import java.util.Collections;
import com.google.aA;
import java.util.List;
import com.google.hv;
import com.google.b8;
import com.google.fp;

public final class bT extends fp implements a
{
    private b8 e;
    private hv f;
    private int g;
    private List h;
    private aA i;
    private aN j;
    private hv k;
    
    private bT() {
        this.f = hv.b;
        this.k = hv.b;
        this.j = aN.i();
        this.h = Collections.emptyList();
        this.d();
    }
    
    private bT(final dg dg) {
        super(dg);
        this.f = hv.b;
        this.k = hv.b;
        this.j = aN.i();
        this.h = Collections.emptyList();
        this.d();
    }
    
    bT(final dg dg, final j j) {
        this(dg);
    }
    
    private void a() {
        try {
            if ((0x8 & this.g) != 0x8) {
                this.h = new ArrayList(this.h);
                this.g |= 0x8;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private void d() {
        try {
            if (a_.r()) {
                this.n();
                this.m();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    static bT f() {
        return g();
    }
    
    private static bT g() {
        return new bT();
    }
    
    private b8 m() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       62
        //     9: aload_0        
        //    10: getfield        org/whispersystems/bT.h:Ljava/util/List;
        //    13: astore          4
        //    15: aload_0        
        //    16: getfield        org/whispersystems/bT.g:I
        //    19: istore          5
        //    21: iload           5
        //    23: bipush          8
        //    25: iand           
        //    26: bipush          8
        //    28: if_icmpne       73
        //    31: iconst_1       
        //    32: istore          6
        //    34: aload_0        
        //    35: new             Lcom/google/b8;
        //    38: dup            
        //    39: aload           4
        //    41: iload           6
        //    43: aload_0        
        //    44: invokevirtual   org/whispersystems/bT.a:()Lcom/google/dg;
        //    47: aload_0        
        //    48: invokevirtual   org/whispersystems/bT.f:()Z
        //    51: invokespecial   com/google/b8.<init>:(Ljava/util/List;ZLcom/google/dg;Z)V
        //    54: putfield        org/whispersystems/bT.e:Lcom/google/b8;
        //    57: aload_0        
        //    58: aconst_null    
        //    59: putfield        org/whispersystems/bT.h:Ljava/util/List;
        //    62: aload_0        
        //    63: getfield        org/whispersystems/bT.e:Lcom/google/b8;
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
    
    private aA n() {
        try {
            if (this.i == null) {
                this.i = new aA(this.j, this.a(), this.f());
                this.j = null;
            }
            return this.i;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public bT a(final cL cl, final fu fu) {
        while (true) {
            try {
                a_ a_3;
                Throwable t;
                try {
                    final a_ a_ = (a_)org.whispersystems.a_.g.parsePartialFrom(cl, fu);
                    if (a_ == null) {
                        return this;
                    }
                    try {
                        this.a(a_);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final a_ a_2 = (a_)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        a_3 = a_2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (a_3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(a_3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final a_ a_3 = null;
                continue;
            }
            break;
        }
    }
    
    public bT a(final fm fm) {
        try {
            if (fm instanceof a_) {
                return this.a((a_)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public bT a(final hv k) {
        if (k == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x2;
        this.k = k;
        this.c();
        return this;
    }
    
    public bT a(final Iterable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnonnull       33
        //    11: aload_0        
        //    12: invokespecial   org/whispersystems/bT.a:()V
        //    15: aload_1        
        //    16: aload_0        
        //    17: getfield        org/whispersystems/bT.h:Ljava/util/List;
        //    20: invokestatic    com/google/fp.a:(Ljava/lang/Iterable;Ljava/util/Collection;)V
        //    23: aload_0        
        //    24: invokevirtual   org/whispersystems/bT.c:()V
        //    27: getstatic       org/whispersystems/aZ.o:Z
        //    30: ifeq            50
        //    33: aload_0        
        //    34: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //    37: aload_1        
        //    38: invokevirtual   com/google/b8.a:(Ljava/lang/Iterable;)Lcom/google/b8;
        //    41: pop            
        //    42: aload_0        
        //    43: areturn        
        //    44: astore_2       
        //    45: aload_2        
        //    46: athrow         
        //    47: astore_3       
        //    48: aload_3        
        //    49: athrow         
        //    50: aload_0        
        //    51: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      6      44     47     Ljava/lang/NullPointerException;
        //  11     33     47     50     Ljava/lang/NullPointerException;
        //  33     42     47     50     Ljava/lang/NullPointerException;
        //  45     47     47     50     Ljava/lang/NullPointerException;
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
    
    public bT a(final aN p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        org/whispersystems/bT.i:Lcom/google/aA;
        //     8: astore          7
        //    10: aload           7
        //    12: ifnonnull       82
        //    15: aload_0        
        //    16: getfield        org/whispersystems/bT.g:I
        //    19: istore          10
        //    21: iload           10
        //    23: iconst_4       
        //    24: iand           
        //    25: iconst_4       
        //    26: if_icmpne       69
        //    29: aload_0        
        //    30: getfield        org/whispersystems/bT.j:Lorg/whispersystems/aN;
        //    33: astore          11
        //    35: invokestatic    org/whispersystems/aN.i:()Lorg/whispersystems/aN;
        //    38: astore          12
        //    40: aload           11
        //    42: aload           12
        //    44: if_acmpeq       69
        //    47: aload_0        
        //    48: aload_0        
        //    49: getfield        org/whispersystems/bT.j:Lorg/whispersystems/aN;
        //    52: invokestatic    org/whispersystems/aN.a:(Lorg/whispersystems/aN;)Lorg/whispersystems/bi;
        //    55: aload_1        
        //    56: invokevirtual   org/whispersystems/bi.a:(Lorg/whispersystems/aN;)Lorg/whispersystems/bi;
        //    59: invokevirtual   org/whispersystems/bi.i:()Lorg/whispersystems/aN;
        //    62: putfield        org/whispersystems/bT.j:Lorg/whispersystems/aN;
        //    65: iload_2        
        //    66: ifeq            74
        //    69: aload_0        
        //    70: aload_1        
        //    71: putfield        org/whispersystems/bT.j:Lorg/whispersystems/aN;
        //    74: aload_0        
        //    75: invokevirtual   org/whispersystems/bT.c:()V
        //    78: iload_2        
        //    79: ifeq            91
        //    82: aload_0        
        //    83: getfield        org/whispersystems/bT.i:Lcom/google/aA;
        //    86: aload_1        
        //    87: invokevirtual   com/google/aA.a:(Lcom/google/dS;)Lcom/google/aA;
        //    90: pop            
        //    91: aload_0        
        //    92: iconst_4       
        //    93: aload_0        
        //    94: getfield        org/whispersystems/bT.g:I
        //    97: ior            
        //    98: putfield        org/whispersystems/bT.g:I
        //   101: aload_0        
        //   102: areturn        
        //   103: astore_3       
        //   104: aload_3        
        //   105: athrow         
        //   106: astore          4
        //   108: aload           4
        //   110: athrow         
        //   111: astore          5
        //   113: aload           5
        //   115: athrow         
        //   116: astore          6
        //   118: aload           6
        //   120: athrow         
        //   121: astore          8
        //   123: aload           8
        //   125: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      10     103    106    Ljava/lang/NullPointerException;
        //  15     21     106    111    Ljava/lang/NullPointerException;
        //  29     40     111    116    Ljava/lang/NullPointerException;
        //  47     65     116    121    Ljava/lang/NullPointerException;
        //  69     74     116    121    Ljava/lang/NullPointerException;
        //  74     78     121    126    Ljava/lang/NullPointerException;
        //  82     91     121    126    Ljava/lang/NullPointerException;
        //  104    106    106    111    Ljava/lang/NullPointerException;
        //  108    111    111    116    Ljava/lang/NullPointerException;
        //  113    116    116    121    Ljava/lang/NullPointerException;
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
    
    public bT a(final a_ p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: invokestatic    org/whispersystems/a_.m:()Lorg/whispersystems/a_;
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
        //    21: invokevirtual   org/whispersystems/a_.n:()Z
        //    24: ifeq            36
        //    27: aload_0        
        //    28: aload_1        
        //    29: invokevirtual   org/whispersystems/a_.f:()Lcom/google/hv;
        //    32: invokevirtual   org/whispersystems/bT.b:(Lcom/google/hv;)Lorg/whispersystems/bT;
        //    35: pop            
        //    36: aload_1        
        //    37: invokevirtual   org/whispersystems/a_.k:()Z
        //    40: ifeq            52
        //    43: aload_0        
        //    44: aload_1        
        //    45: invokevirtual   org/whispersystems/a_.j:()Lcom/google/hv;
        //    48: invokevirtual   org/whispersystems/bT.a:(Lcom/google/hv;)Lorg/whispersystems/bT;
        //    51: pop            
        //    52: aload_1        
        //    53: invokevirtual   org/whispersystems/a_.c:()Z
        //    56: ifeq            68
        //    59: aload_0        
        //    60: aload_1        
        //    61: invokevirtual   org/whispersystems/a_.e:()Lorg/whispersystems/aN;
        //    64: invokevirtual   org/whispersystems/bT.a:(Lorg/whispersystems/aN;)Lorg/whispersystems/bT;
        //    67: pop            
        //    68: aload_0        
        //    69: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //    72: astore          12
        //    74: aload           12
        //    76: ifnonnull       160
        //    79: aload_1        
        //    80: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;)Ljava/util/List;
        //    83: invokeinterface java/util/List.isEmpty:()Z
        //    88: istore          24
        //    90: iload           24
        //    92: ifne            266
        //    95: aload_0        
        //    96: getfield        org/whispersystems/bT.h:Ljava/util/List;
        //    99: invokeinterface java/util/List.isEmpty:()Z
        //   104: istore          25
        //   106: iload           25
        //   108: ifeq            134
        //   111: aload_0        
        //   112: aload_1        
        //   113: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;)Ljava/util/List;
        //   116: putfield        org/whispersystems/bT.h:Ljava/util/List;
        //   119: aload_0        
        //   120: bipush          -9
        //   122: aload_0        
        //   123: getfield        org/whispersystems/bT.g:I
        //   126: iand           
        //   127: putfield        org/whispersystems/bT.g:I
        //   130: iload_2        
        //   131: ifeq            152
        //   134: aload_0        
        //   135: invokespecial   org/whispersystems/bT.a:()V
        //   138: aload_0        
        //   139: getfield        org/whispersystems/bT.h:Ljava/util/List;
        //   142: aload_1        
        //   143: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;)Ljava/util/List;
        //   146: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   151: pop            
        //   152: aload_0        
        //   153: invokevirtual   org/whispersystems/bT.c:()V
        //   156: iload_2        
        //   157: ifeq            266
        //   160: aload_1        
        //   161: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;)Ljava/util/List;
        //   164: invokeinterface java/util/List.isEmpty:()Z
        //   169: istore          16
        //   171: iload           16
        //   173: ifne            266
        //   176: aload_0        
        //   177: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //   180: invokevirtual   com/google/b8.d:()Z
        //   183: istore          18
        //   185: iload           18
        //   187: ifeq            254
        //   190: aload_0        
        //   191: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //   194: invokevirtual   com/google/b8.f:()V
        //   197: aload_0        
        //   198: aconst_null    
        //   199: putfield        org/whispersystems/bT.e:Lcom/google/b8;
        //   202: aload_0        
        //   203: aload_1        
        //   204: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;)Ljava/util/List;
        //   207: putfield        org/whispersystems/bT.h:Ljava/util/List;
        //   210: aload_0        
        //   211: bipush          -9
        //   213: aload_0        
        //   214: getfield        org/whispersystems/bT.g:I
        //   217: iand           
        //   218: putfield        org/whispersystems/bT.g:I
        //   221: invokestatic    org/whispersystems/a_.a:()Z
        //   224: istore          21
        //   226: aconst_null    
        //   227: astore          22
        //   229: iload           21
        //   231: ifeq            244
        //   234: aload_0        
        //   235: invokespecial   org/whispersystems/bT.m:()Lcom/google/b8;
        //   238: astore          23
        //   240: aload           23
        //   242: astore          22
        //   244: aload_0        
        //   245: aload           22
        //   247: putfield        org/whispersystems/bT.e:Lcom/google/b8;
        //   250: iload_2        
        //   251: ifeq            266
        //   254: aload_0        
        //   255: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //   258: aload_1        
        //   259: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;)Ljava/util/List;
        //   262: invokevirtual   com/google/b8.a:(Ljava/lang/Iterable;)Lcom/google/b8;
        //   265: pop            
        //   266: aload_0        
        //   267: aload_1        
        //   268: invokevirtual   org/whispersystems/a_.getUnknownFields:()Lcom/google/ce;
        //   271: invokevirtual   org/whispersystems/bT.b:(Lcom/google/ce;)Lcom/google/fp;
        //   274: pop            
        //   275: aload_0        
        //   276: areturn        
        //   277: astore          5
        //   279: aload           5
        //   281: athrow         
        //   282: astore          6
        //   284: aload           6
        //   286: athrow         
        //   287: astore          7
        //   289: aload           7
        //   291: athrow         
        //   292: astore          8
        //   294: aload           8
        //   296: athrow         
        //   297: astore          9
        //   299: aload           9
        //   301: athrow         
        //   302: astore          10
        //   304: aload           10
        //   306: athrow         
        //   307: astore          11
        //   309: aload           11
        //   311: athrow         
        //   312: astore          27
        //   314: aload           27
        //   316: athrow         
        //   317: astore          13
        //   319: aload           13
        //   321: athrow         
        //   322: astore          14
        //   324: aload           14
        //   326: athrow         
        //   327: astore          15
        //   329: aload           15
        //   331: athrow         
        //   332: astore          19
        //   334: aload           19
        //   336: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      17     20     Ljava/lang/NullPointerException;
        //  20     36     277    282    Ljava/lang/NullPointerException;
        //  36     52     282    287    Ljava/lang/NullPointerException;
        //  52     68     287    292    Ljava/lang/NullPointerException;
        //  68     74     292    297    Ljava/lang/NullPointerException;
        //  79     90     297    302    Ljava/lang/NullPointerException;
        //  95     106    302    307    Ljava/lang/NullPointerException;
        //  111    130    307    312    Ljava/lang/NullPointerException;
        //  134    152    307    312    Ljava/lang/NullPointerException;
        //  152    156    312    317    Ljava/lang/NullPointerException;
        //  160    171    317    322    Ljava/lang/NullPointerException;
        //  176    185    322    327    Ljava/lang/NullPointerException;
        //  190    226    327    332    Ljava/lang/NullPointerException;
        //  234    240    327    332    Ljava/lang/NullPointerException;
        //  244    250    332    337    Ljava/lang/NullPointerException;
        //  254    266    332    337    Ljava/lang/NullPointerException;
        //  294    297    297    302    Ljava/lang/NullPointerException;
        //  299    302    302    307    Ljava/lang/NullPointerException;
        //  304    307    307    312    Ljava/lang/NullPointerException;
        //  314    317    317    322    Ljava/lang/NullPointerException;
        //  319    322    322    327    Ljava/lang/NullPointerException;
        //  324    327    327    332    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 170, Size: 170
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
    
    public bT a(final ah ah) {
        Label_0054: {
            try {
                if (this.e != null) {
                    break Label_0054;
                }
                if (ah == null) {
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
                this.h.add(ah);
                this.c();
                if (aZ.o) {
                    this.e.a(ah);
                }
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    public bT b(final hv f) {
        if (f == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x1;
        this.f = f;
        this.c();
        return this;
    }
    
    public bT b(final aN j) {
        Label_0044: {
            try {
                if (this.i != null) {
                    break Label_0044;
                }
                if (j == null) {
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
                this.j = j;
                this.c();
                if (aZ.o) {
                    this.i.b(j);
                }
                this.g |= 0x4;
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    @Override
    public ci build() {
        return this.l();
    }
    
    @Override
    public fm build() {
        return this.l();
    }
    
    @Override
    public ci buildPartial() {
        return this.h();
    }
    
    @Override
    public fm buildPartial() {
        return this.h();
    }
    
    @Override
    public fp clear() {
        return this.j();
    }
    
    @Override
    public fE clone() {
        return this.i();
    }
    
    @Override
    public fp clone() {
        return this.i();
    }
    
    @Override
    public fx clone() {
        return this.i();
    }
    
    @Override
    public Object clone() {
        return this.i();
    }
    
    public bT e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       37
        //     9: aload_0        
        //    10: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    13: putfield        org/whispersystems/bT.h:Ljava/util/List;
        //    16: aload_0        
        //    17: bipush          -9
        //    19: aload_0        
        //    20: getfield        org/whispersystems/bT.g:I
        //    23: iand           
        //    24: putfield        org/whispersystems/bT.g:I
        //    27: aload_0        
        //    28: invokevirtual   org/whispersystems/bT.c:()V
        //    31: getstatic       org/whispersystems/aZ.o:Z
        //    34: ifeq            52
        //    37: aload_0        
        //    38: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //    41: invokevirtual   com/google/b8.c:()V
        //    44: aload_0        
        //    45: areturn        
        //    46: astore_1       
        //    47: aload_1        
        //    48: athrow         
        //    49: astore_2       
        //    50: aload_2        
        //    51: athrow         
        //    52: aload_0        
        //    53: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      46     49     Ljava/lang/NullPointerException;
        //  9      37     49     52     Ljava/lang/NullPointerException;
        //  37     44     49     52     Ljava/lang/NullPointerException;
        //  47     49     49     52     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.k();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.k();
    }
    
    @Override
    public bl getDescriptorForType() {
        return bO.a();
    }
    
    public a_ h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       org/whispersystems/aZ.o:Z
        //     5: istore_2       
        //     6: new             Lorg/whispersystems/a_;
        //     9: dup            
        //    10: aload_0        
        //    11: aconst_null    
        //    12: invokespecial   org/whispersystems/a_.<init>:(Lcom/google/fp;Lorg/whispersystems/j;)V
        //    15: astore_3       
        //    16: aload_0        
        //    17: getfield        org/whispersystems/bT.g:I
        //    20: istore          4
        //    22: iload           4
        //    24: iconst_1       
        //    25: iand           
        //    26: iload_1        
        //    27: if_icmpne       226
        //    30: aload_3        
        //    31: aload_0        
        //    32: getfield        org/whispersystems/bT.f:Lcom/google/hv;
        //    35: invokestatic    org/whispersystems/a_.b:(Lorg/whispersystems/a_;Lcom/google/hv;)Lcom/google/hv;
        //    38: pop            
        //    39: iload           4
        //    41: iconst_2       
        //    42: iand           
        //    43: iconst_2       
        //    44: if_icmpne       51
        //    47: iload_1        
        //    48: iconst_2       
        //    49: ior            
        //    50: istore_1       
        //    51: aload_3        
        //    52: aload_0        
        //    53: getfield        org/whispersystems/bT.k:Lcom/google/hv;
        //    56: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;Lcom/google/hv;)Lcom/google/hv;
        //    59: pop            
        //    60: iload           4
        //    62: iconst_4       
        //    63: iand           
        //    64: iconst_4       
        //    65: if_icmpne       220
        //    68: iload_1        
        //    69: iconst_4       
        //    70: ior            
        //    71: istore          7
        //    73: aload_0        
        //    74: getfield        org/whispersystems/bT.i:Lcom/google/aA;
        //    77: astore          10
        //    79: aload           10
        //    81: ifnonnull       97
        //    84: aload_3        
        //    85: aload_0        
        //    86: getfield        org/whispersystems/bT.j:Lorg/whispersystems/aN;
        //    89: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;Lorg/whispersystems/aN;)Lorg/whispersystems/aN;
        //    92: pop            
        //    93: iload_2        
        //    94: ifeq            112
        //    97: aload_3        
        //    98: aload_0        
        //    99: getfield        org/whispersystems/bT.i:Lcom/google/aA;
        //   102: invokevirtual   com/google/aA.a:()Lcom/google/dS;
        //   105: checkcast       Lorg/whispersystems/aN;
        //   108: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;Lorg/whispersystems/aN;)Lorg/whispersystems/aN;
        //   111: pop            
        //   112: aload_0        
        //   113: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //   116: astore          14
        //   118: aload           14
        //   120: ifnonnull       170
        //   123: bipush          8
        //   125: aload_0        
        //   126: getfield        org/whispersystems/bT.g:I
        //   129: iand           
        //   130: bipush          8
        //   132: if_icmpne       157
        //   135: aload_0        
        //   136: aload_0        
        //   137: getfield        org/whispersystems/bT.h:Ljava/util/List;
        //   140: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   143: putfield        org/whispersystems/bT.h:Ljava/util/List;
        //   146: aload_0        
        //   147: bipush          -9
        //   149: aload_0        
        //   150: getfield        org/whispersystems/bT.g:I
        //   153: iand           
        //   154: putfield        org/whispersystems/bT.g:I
        //   157: aload_3        
        //   158: aload_0        
        //   159: getfield        org/whispersystems/bT.h:Ljava/util/List;
        //   162: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;Ljava/util/List;)Ljava/util/List;
        //   165: pop            
        //   166: iload_2        
        //   167: ifeq            182
        //   170: aload_3        
        //   171: aload_0        
        //   172: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //   175: invokevirtual   com/google/b8.b:()Ljava/util/List;
        //   178: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;Ljava/util/List;)Ljava/util/List;
        //   181: pop            
        //   182: aload_3        
        //   183: iload           7
        //   185: invokestatic    org/whispersystems/a_.a:(Lorg/whispersystems/a_;I)I
        //   188: pop            
        //   189: aload_0        
        //   190: invokevirtual   org/whispersystems/bT.b:()V
        //   193: aload_3        
        //   194: areturn        
        //   195: astore          8
        //   197: aload           8
        //   199: athrow         
        //   200: astore          9
        //   202: aload           9
        //   204: athrow         
        //   205: astore          12
        //   207: aload           12
        //   209: athrow         
        //   210: astore          13
        //   212: aload           13
        //   214: athrow         
        //   215: astore          15
        //   217: aload           15
        //   219: athrow         
        //   220: iload_1        
        //   221: istore          7
        //   223: goto            73
        //   226: iconst_0       
        //   227: istore_1       
        //   228: goto            30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  73     79     195    200    Ljava/lang/NullPointerException;
        //  84     93     200    205    Ljava/lang/NullPointerException;
        //  97     112    200    205    Ljava/lang/NullPointerException;
        //  112    118    205    210    Ljava/lang/NullPointerException;
        //  123    157    210    215    Ljava/lang/NullPointerException;
        //  157    166    215    220    Ljava/lang/NullPointerException;
        //  170    182    215    220    Ljava/lang/NullPointerException;
        //  197    200    200    205    Ljava/lang/NullPointerException;
        //  207    210    210    215    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 129, Size: 129
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
    
    public bT i() {
        return g().a(this.h());
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.r().a(a_.class, bT.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return true;
    }
    
    public bT j() {
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
        //    10: getstatic       com/google/hv.b:Lcom/google/hv;
        //    13: putfield        org/whispersystems/bT.f:Lcom/google/hv;
        //    16: aload_0        
        //    17: bipush          -2
        //    19: aload_0        
        //    20: getfield        org/whispersystems/bT.g:I
        //    23: iand           
        //    24: putfield        org/whispersystems/bT.g:I
        //    27: aload_0        
        //    28: getstatic       com/google/hv.b:Lcom/google/hv;
        //    31: putfield        org/whispersystems/bT.k:Lcom/google/hv;
        //    34: aload_0        
        //    35: bipush          -3
        //    37: aload_0        
        //    38: getfield        org/whispersystems/bT.g:I
        //    41: iand           
        //    42: putfield        org/whispersystems/bT.g:I
        //    45: aload_0        
        //    46: getfield        org/whispersystems/bT.i:Lcom/google/aA;
        //    49: astore          5
        //    51: aload           5
        //    53: ifnonnull       67
        //    56: aload_0        
        //    57: invokestatic    org/whispersystems/aN.i:()Lorg/whispersystems/aN;
        //    60: putfield        org/whispersystems/bT.j:Lorg/whispersystems/aN;
        //    63: iload_1        
        //    64: ifeq            75
        //    67: aload_0        
        //    68: getfield        org/whispersystems/bT.i:Lcom/google/aA;
        //    71: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //    74: pop            
        //    75: aload_0        
        //    76: bipush          -5
        //    78: aload_0        
        //    79: getfield        org/whispersystems/bT.g:I
        //    82: iand           
        //    83: putfield        org/whispersystems/bT.g:I
        //    86: aload_0        
        //    87: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //    90: astore          9
        //    92: aload           9
        //    94: ifnonnull       119
        //    97: aload_0        
        //    98: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   101: putfield        org/whispersystems/bT.h:Ljava/util/List;
        //   104: aload_0        
        //   105: bipush          -9
        //   107: aload_0        
        //   108: getfield        org/whispersystems/bT.g:I
        //   111: iand           
        //   112: putfield        org/whispersystems/bT.g:I
        //   115: iload_1        
        //   116: ifeq            126
        //   119: aload_0        
        //   120: getfield        org/whispersystems/bT.e:Lcom/google/b8;
        //   123: invokevirtual   com/google/b8.c:()V
        //   126: aload_0        
        //   127: areturn        
        //   128: astore_2       
        //   129: aload_2        
        //   130: athrow         
        //   131: astore_3       
        //   132: aload_3        
        //   133: athrow         
        //   134: astore          7
        //   136: aload           7
        //   138: athrow         
        //   139: astore          8
        //   141: aload           8
        //   143: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      51     128    131    Ljava/lang/NullPointerException;
        //  56     63     131    134    Ljava/lang/NullPointerException;
        //  67     75     131    134    Ljava/lang/NullPointerException;
        //  75     92     134    139    Ljava/lang/NullPointerException;
        //  97     115    139    144    Ljava/lang/NullPointerException;
        //  119    126    139    144    Ljava/lang/NullPointerException;
        //  129    131    131    134    Ljava/lang/NullPointerException;
        //  136    139    139    144    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 76, Size: 76
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
    
    public a_ k() {
        return a_.m();
    }
    
    public a_ l() {
        final a_ h = this.h();
        try {
            if (!h.isInitialized()) {
                throw fx.a(h);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return h;
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
