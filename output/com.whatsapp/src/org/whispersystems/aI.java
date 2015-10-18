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
import java.util.Collection;
import java.util.ArrayList;
import com.google.dS;
import com.google.dg;
import java.util.Collections;
import com.google.b8;
import com.google.aA;
import java.util.List;
import com.google.fp;

public final class aI extends fp implements bb
{
    private int e;
    private List f;
    private aA g;
    private aa h;
    private as i;
    private b8 j;
    private int k;
    private aA l;
    
    private aI() {
        this.h = aa.i();
        this.i = as.f();
        this.f = Collections.emptyList();
        this.f();
    }
    
    private aI(final dg dg) {
        super(dg);
        this.h = aa.i();
        this.i = as.f();
        this.f = Collections.emptyList();
        this.f();
    }
    
    aI(final dg dg, final j j) {
        this(dg);
    }
    
    static aI a() {
        return g();
    }
    
    private b8 b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       62
        //     9: aload_0        
        //    10: getfield        org/whispersystems/aI.f:Ljava/util/List;
        //    13: astore          4
        //    15: aload_0        
        //    16: getfield        org/whispersystems/aI.k:I
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
        //    44: invokevirtual   org/whispersystems/aI.a:()Lcom/google/dg;
        //    47: aload_0        
        //    48: invokevirtual   org/whispersystems/aI.f:()Z
        //    51: invokespecial   com/google/b8.<init>:(Ljava/util/List;ZLcom/google/dg;Z)V
        //    54: putfield        org/whispersystems/aI.j:Lcom/google/b8;
        //    57: aload_0        
        //    58: aconst_null    
        //    59: putfield        org/whispersystems/aI.f:Ljava/util/List;
        //    62: aload_0        
        //    63: getfield        org/whispersystems/aI.j:Lcom/google/b8;
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
    
    private aA c() {
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
    
    private aA d() {
        try {
            if (this.l == null) {
                this.l = new aA(this.h, this.a(), this.f());
                this.h = null;
            }
            return this.l;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private void f() {
        try {
            if (af.a()) {
                this.d();
                this.c();
                this.b();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private static aI g() {
        return new aI();
    }
    
    private void m() {
        try {
            if ((0x8 & this.k) != 0x8) {
                this.f = new ArrayList(this.f);
                this.k |= 0x8;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public aI a(final int e) {
        this.k |= 0x1;
        this.e = e;
        this.c();
        return this;
    }
    
    public aI a(final cL cl, final fu fu) {
        while (true) {
            try {
                af af3;
                Throwable t;
                try {
                    final af af = (af)org.whispersystems.af.k.parsePartialFrom(cl, fu);
                    if (af == null) {
                        return this;
                    }
                    try {
                        this.a(af);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final af af2 = (af)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        af3 = af2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (af3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(af3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final af af3 = null;
                continue;
            }
            break;
        }
    }
    
    public aI a(final fm fm) {
        try {
            if (fm instanceof af) {
                return this.a((af)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public aI a(final Iterable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnonnull       33
        //    11: aload_0        
        //    12: invokespecial   org/whispersystems/aI.m:()V
        //    15: aload_1        
        //    16: aload_0        
        //    17: getfield        org/whispersystems/aI.f:Ljava/util/List;
        //    20: invokestatic    com/google/fp.a:(Ljava/lang/Iterable;Ljava/util/Collection;)V
        //    23: aload_0        
        //    24: invokevirtual   org/whispersystems/aI.c:()V
        //    27: getstatic       org/whispersystems/aZ.o:Z
        //    30: ifeq            50
        //    33: aload_0        
        //    34: getfield        org/whispersystems/aI.j:Lcom/google/b8;
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
    
    public aI a(final a7 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/aI.g:Lcom/google/aA;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnonnull       29
        //    11: aload_0        
        //    12: aload_1        
        //    13: invokevirtual   org/whispersystems/a7.c:()Lorg/whispersystems/as;
        //    16: putfield        org/whispersystems/aI.i:Lorg/whispersystems/as;
        //    19: aload_0        
        //    20: invokevirtual   org/whispersystems/aI.c:()V
        //    23: getstatic       org/whispersystems/aZ.o:Z
        //    26: ifeq            41
        //    29: aload_0        
        //    30: getfield        org/whispersystems/aI.g:Lcom/google/aA;
        //    33: aload_1        
        //    34: invokevirtual   org/whispersystems/a7.c:()Lorg/whispersystems/as;
        //    37: invokevirtual   com/google/aA.b:(Lcom/google/dS;)Lcom/google/aA;
        //    40: pop            
        //    41: aload_0        
        //    42: iconst_4       
        //    43: aload_0        
        //    44: getfield        org/whispersystems/aI.k:I
        //    47: ior            
        //    48: putfield        org/whispersystems/aI.k:I
        //    51: aload_0        
        //    52: areturn        
        //    53: astore_2       
        //    54: aload_2        
        //    55: athrow         
        //    56: astore_3       
        //    57: aload_3        
        //    58: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      6      53     56     Ljava/lang/NullPointerException;
        //  11     29     56     59     Ljava/lang/NullPointerException;
        //  29     41     56     59     Ljava/lang/NullPointerException;
        //  54     56     56     59     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
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
    
    public aI a(final aF af) {
        Label_0054: {
            try {
                if (this.j != null) {
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
                this.m();
                this.f.add(af);
                this.c();
                if (aZ.o) {
                    this.j.a(af);
                }
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    public aI a(final aa p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        org/whispersystems/aI.l:Lcom/google/aA;
        //     8: astore          7
        //    10: aload           7
        //    12: ifnonnull       82
        //    15: aload_0        
        //    16: getfield        org/whispersystems/aI.k:I
        //    19: istore          10
        //    21: iload           10
        //    23: iconst_2       
        //    24: iand           
        //    25: iconst_2       
        //    26: if_icmpne       69
        //    29: aload_0        
        //    30: getfield        org/whispersystems/aI.h:Lorg/whispersystems/aa;
        //    33: astore          11
        //    35: invokestatic    org/whispersystems/aa.i:()Lorg/whispersystems/aa;
        //    38: astore          12
        //    40: aload           11
        //    42: aload           12
        //    44: if_acmpeq       69
        //    47: aload_0        
        //    48: aload_0        
        //    49: getfield        org/whispersystems/aI.h:Lorg/whispersystems/aa;
        //    52: invokestatic    org/whispersystems/aa.a:(Lorg/whispersystems/aa;)Lorg/whispersystems/a0;
        //    55: aload_1        
        //    56: invokevirtual   org/whispersystems/a0.a:(Lorg/whispersystems/aa;)Lorg/whispersystems/a0;
        //    59: invokevirtual   org/whispersystems/a0.a:()Lorg/whispersystems/aa;
        //    62: putfield        org/whispersystems/aI.h:Lorg/whispersystems/aa;
        //    65: iload_2        
        //    66: ifeq            74
        //    69: aload_0        
        //    70: aload_1        
        //    71: putfield        org/whispersystems/aI.h:Lorg/whispersystems/aa;
        //    74: aload_0        
        //    75: invokevirtual   org/whispersystems/aI.c:()V
        //    78: iload_2        
        //    79: ifeq            91
        //    82: aload_0        
        //    83: getfield        org/whispersystems/aI.l:Lcom/google/aA;
        //    86: aload_1        
        //    87: invokevirtual   com/google/aA.a:(Lcom/google/dS;)Lcom/google/aA;
        //    90: pop            
        //    91: aload_0        
        //    92: iconst_2       
        //    93: aload_0        
        //    94: getfield        org/whispersystems/aI.k:I
        //    97: ior            
        //    98: putfield        org/whispersystems/aI.k:I
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
    
    public aI a(final af p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: invokestatic    org/whispersystems/af.s:()Lorg/whispersystems/af;
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
        //    21: invokevirtual   org/whispersystems/af.l:()Z
        //    24: ifeq            36
        //    27: aload_0        
        //    28: aload_1        
        //    29: invokevirtual   org/whispersystems/af.b:()I
        //    32: invokevirtual   org/whispersystems/aI.a:(I)Lorg/whispersystems/aI;
        //    35: pop            
        //    36: aload_1        
        //    37: invokevirtual   org/whispersystems/af.m:()Z
        //    40: ifeq            52
        //    43: aload_0        
        //    44: aload_1        
        //    45: invokevirtual   org/whispersystems/af.t:()Lorg/whispersystems/aa;
        //    48: invokevirtual   org/whispersystems/aI.a:(Lorg/whispersystems/aa;)Lorg/whispersystems/aI;
        //    51: pop            
        //    52: aload_1        
        //    53: invokevirtual   org/whispersystems/af.e:()Z
        //    56: ifeq            68
        //    59: aload_0        
        //    60: aload_1        
        //    61: invokevirtual   org/whispersystems/af.k:()Lorg/whispersystems/as;
        //    64: invokevirtual   org/whispersystems/aI.a:(Lorg/whispersystems/as;)Lorg/whispersystems/aI;
        //    67: pop            
        //    68: aload_0        
        //    69: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //    72: astore          12
        //    74: aload           12
        //    76: ifnonnull       160
        //    79: aload_1        
        //    80: invokestatic    org/whispersystems/af.b:(Lorg/whispersystems/af;)Ljava/util/List;
        //    83: invokeinterface java/util/List.isEmpty:()Z
        //    88: istore          24
        //    90: iload           24
        //    92: ifne            266
        //    95: aload_0        
        //    96: getfield        org/whispersystems/aI.f:Ljava/util/List;
        //    99: invokeinterface java/util/List.isEmpty:()Z
        //   104: istore          25
        //   106: iload           25
        //   108: ifeq            134
        //   111: aload_0        
        //   112: aload_1        
        //   113: invokestatic    org/whispersystems/af.b:(Lorg/whispersystems/af;)Ljava/util/List;
        //   116: putfield        org/whispersystems/aI.f:Ljava/util/List;
        //   119: aload_0        
        //   120: bipush          -9
        //   122: aload_0        
        //   123: getfield        org/whispersystems/aI.k:I
        //   126: iand           
        //   127: putfield        org/whispersystems/aI.k:I
        //   130: iload_2        
        //   131: ifeq            152
        //   134: aload_0        
        //   135: invokespecial   org/whispersystems/aI.m:()V
        //   138: aload_0        
        //   139: getfield        org/whispersystems/aI.f:Ljava/util/List;
        //   142: aload_1        
        //   143: invokestatic    org/whispersystems/af.b:(Lorg/whispersystems/af;)Ljava/util/List;
        //   146: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   151: pop            
        //   152: aload_0        
        //   153: invokevirtual   org/whispersystems/aI.c:()V
        //   156: iload_2        
        //   157: ifeq            266
        //   160: aload_1        
        //   161: invokestatic    org/whispersystems/af.b:(Lorg/whispersystems/af;)Ljava/util/List;
        //   164: invokeinterface java/util/List.isEmpty:()Z
        //   169: istore          16
        //   171: iload           16
        //   173: ifne            266
        //   176: aload_0        
        //   177: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //   180: invokevirtual   com/google/b8.d:()Z
        //   183: istore          18
        //   185: iload           18
        //   187: ifeq            254
        //   190: aload_0        
        //   191: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //   194: invokevirtual   com/google/b8.f:()V
        //   197: aload_0        
        //   198: aconst_null    
        //   199: putfield        org/whispersystems/aI.j:Lcom/google/b8;
        //   202: aload_0        
        //   203: aload_1        
        //   204: invokestatic    org/whispersystems/af.b:(Lorg/whispersystems/af;)Ljava/util/List;
        //   207: putfield        org/whispersystems/aI.f:Ljava/util/List;
        //   210: aload_0        
        //   211: bipush          -9
        //   213: aload_0        
        //   214: getfield        org/whispersystems/aI.k:I
        //   217: iand           
        //   218: putfield        org/whispersystems/aI.k:I
        //   221: invokestatic    org/whispersystems/af.p:()Z
        //   224: istore          21
        //   226: aconst_null    
        //   227: astore          22
        //   229: iload           21
        //   231: ifeq            244
        //   234: aload_0        
        //   235: invokespecial   org/whispersystems/aI.b:()Lcom/google/b8;
        //   238: astore          23
        //   240: aload           23
        //   242: astore          22
        //   244: aload_0        
        //   245: aload           22
        //   247: putfield        org/whispersystems/aI.j:Lcom/google/b8;
        //   250: iload_2        
        //   251: ifeq            266
        //   254: aload_0        
        //   255: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //   258: aload_1        
        //   259: invokestatic    org/whispersystems/af.b:(Lorg/whispersystems/af;)Ljava/util/List;
        //   262: invokevirtual   com/google/b8.a:(Ljava/lang/Iterable;)Lcom/google/b8;
        //   265: pop            
        //   266: aload_0        
        //   267: aload_1        
        //   268: invokevirtual   org/whispersystems/af.getUnknownFields:()Lcom/google/ce;
        //   271: invokevirtual   org/whispersystems/aI.b:(Lcom/google/ce;)Lcom/google/fp;
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
    
    public aI a(final as p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        org/whispersystems/aI.g:Lcom/google/aA;
        //     8: astore          7
        //    10: aload           7
        //    12: ifnonnull       82
        //    15: aload_0        
        //    16: getfield        org/whispersystems/aI.k:I
        //    19: istore          10
        //    21: iload           10
        //    23: iconst_4       
        //    24: iand           
        //    25: iconst_4       
        //    26: if_icmpne       69
        //    29: aload_0        
        //    30: getfield        org/whispersystems/aI.i:Lorg/whispersystems/as;
        //    33: astore          11
        //    35: invokestatic    org/whispersystems/as.f:()Lorg/whispersystems/as;
        //    38: astore          12
        //    40: aload           11
        //    42: aload           12
        //    44: if_acmpeq       69
        //    47: aload_0        
        //    48: aload_0        
        //    49: getfield        org/whispersystems/aI.i:Lorg/whispersystems/as;
        //    52: invokestatic    org/whispersystems/as.a:(Lorg/whispersystems/as;)Lorg/whispersystems/a7;
        //    55: aload_1        
        //    56: invokevirtual   org/whispersystems/a7.a:(Lorg/whispersystems/as;)Lorg/whispersystems/a7;
        //    59: invokevirtual   org/whispersystems/a7.h:()Lorg/whispersystems/as;
        //    62: putfield        org/whispersystems/aI.i:Lorg/whispersystems/as;
        //    65: iload_2        
        //    66: ifeq            74
        //    69: aload_0        
        //    70: aload_1        
        //    71: putfield        org/whispersystems/aI.i:Lorg/whispersystems/as;
        //    74: aload_0        
        //    75: invokevirtual   org/whispersystems/aI.c:()V
        //    78: iload_2        
        //    79: ifeq            91
        //    82: aload_0        
        //    83: getfield        org/whispersystems/aI.g:Lcom/google/aA;
        //    86: aload_1        
        //    87: invokevirtual   com/google/aA.a:(Lcom/google/dS;)Lcom/google/aA;
        //    90: pop            
        //    91: aload_0        
        //    92: iconst_4       
        //    93: aload_0        
        //    94: getfield        org/whispersystems/aI.k:I
        //    97: ior            
        //    98: putfield        org/whispersystems/aI.k:I
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
    
    public aI b(final aa h) {
        Label_0044: {
            try {
                if (this.l != null) {
                    break Label_0044;
                }
                if (h == null) {
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
                this.h = h;
                this.c();
                if (aZ.o) {
                    this.l.b(h);
                }
                this.k |= 0x2;
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    @Override
    public ci build() {
        return this.h();
    }
    
    @Override
    public fm build() {
        return this.h();
    }
    
    @Override
    public ci buildPartial() {
        return this.k();
    }
    
    @Override
    public fm buildPartial() {
        return this.k();
    }
    
    @Override
    public fp clear() {
        return this.i();
    }
    
    @Override
    public fE clone() {
        return this.n();
    }
    
    @Override
    public fp clone() {
        return this.n();
    }
    
    @Override
    public fx clone() {
        return this.n();
    }
    
    @Override
    public Object clone() {
        return this.n();
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.l();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.l();
    }
    
    @Override
    public bl getDescriptorForType() {
        return bO.A();
    }
    
    public af h() {
        final af k = this.k();
        try {
            if (!k.isInitialized()) {
                throw fx.a(k);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return k;
    }
    
    public aI i() {
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
        //    11: putfield        org/whispersystems/aI.e:I
        //    14: aload_0        
        //    15: bipush          -2
        //    17: aload_0        
        //    18: getfield        org/whispersystems/aI.k:I
        //    21: iand           
        //    22: putfield        org/whispersystems/aI.k:I
        //    25: aload_0        
        //    26: getfield        org/whispersystems/aI.l:Lcom/google/aA;
        //    29: astore          5
        //    31: aload           5
        //    33: ifnonnull       47
        //    36: aload_0        
        //    37: invokestatic    org/whispersystems/aa.i:()Lorg/whispersystems/aa;
        //    40: putfield        org/whispersystems/aI.h:Lorg/whispersystems/aa;
        //    43: iload_1        
        //    44: ifeq            55
        //    47: aload_0        
        //    48: getfield        org/whispersystems/aI.l:Lcom/google/aA;
        //    51: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //    54: pop            
        //    55: aload_0        
        //    56: bipush          -3
        //    58: aload_0        
        //    59: getfield        org/whispersystems/aI.k:I
        //    62: iand           
        //    63: putfield        org/whispersystems/aI.k:I
        //    66: aload_0        
        //    67: getfield        org/whispersystems/aI.g:Lcom/google/aA;
        //    70: astore          9
        //    72: aload           9
        //    74: ifnonnull       88
        //    77: aload_0        
        //    78: invokestatic    org/whispersystems/as.f:()Lorg/whispersystems/as;
        //    81: putfield        org/whispersystems/aI.i:Lorg/whispersystems/as;
        //    84: iload_1        
        //    85: ifeq            96
        //    88: aload_0        
        //    89: getfield        org/whispersystems/aI.g:Lcom/google/aA;
        //    92: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //    95: pop            
        //    96: aload_0        
        //    97: bipush          -5
        //    99: aload_0        
        //   100: getfield        org/whispersystems/aI.k:I
        //   103: iand           
        //   104: putfield        org/whispersystems/aI.k:I
        //   107: aload_0        
        //   108: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //   111: astore          13
        //   113: aload           13
        //   115: ifnonnull       140
        //   118: aload_0        
        //   119: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   122: putfield        org/whispersystems/aI.f:Ljava/util/List;
        //   125: aload_0        
        //   126: bipush          -9
        //   128: aload_0        
        //   129: getfield        org/whispersystems/aI.k:I
        //   132: iand           
        //   133: putfield        org/whispersystems/aI.k:I
        //   136: iload_1        
        //   137: ifeq            147
        //   140: aload_0        
        //   141: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //   144: invokevirtual   com/google/b8.c:()V
        //   147: aload_0        
        //   148: areturn        
        //   149: astore_2       
        //   150: aload_2        
        //   151: athrow         
        //   152: astore_3       
        //   153: aload_3        
        //   154: athrow         
        //   155: astore          7
        //   157: aload           7
        //   159: athrow         
        //   160: astore          8
        //   162: aload           8
        //   164: athrow         
        //   165: astore          11
        //   167: aload           11
        //   169: athrow         
        //   170: astore          12
        //   172: aload           12
        //   174: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      31     149    152    Ljava/lang/NullPointerException;
        //  36     43     152    155    Ljava/lang/NullPointerException;
        //  47     55     152    155    Ljava/lang/NullPointerException;
        //  55     72     155    160    Ljava/lang/NullPointerException;
        //  77     84     160    165    Ljava/lang/NullPointerException;
        //  88     96     160    165    Ljava/lang/NullPointerException;
        //  96     113    165    170    Ljava/lang/NullPointerException;
        //  118    136    170    175    Ljava/lang/NullPointerException;
        //  140    147    170    175    Ljava/lang/NullPointerException;
        //  150    152    152    155    Ljava/lang/NullPointerException;
        //  157    160    160    165    Ljava/lang/NullPointerException;
        //  167    170    170    175    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 93, Size: 93
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
    protected ch internalGetFieldAccessorTable() {
        return bO.t().a(af.class, aI.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return true;
    }
    
    public aI j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       37
        //     9: aload_0        
        //    10: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    13: putfield        org/whispersystems/aI.f:Ljava/util/List;
        //    16: aload_0        
        //    17: bipush          -9
        //    19: aload_0        
        //    20: getfield        org/whispersystems/aI.k:I
        //    23: iand           
        //    24: putfield        org/whispersystems/aI.k:I
        //    27: aload_0        
        //    28: invokevirtual   org/whispersystems/aI.c:()V
        //    31: getstatic       org/whispersystems/aZ.o:Z
        //    34: ifeq            52
        //    37: aload_0        
        //    38: getfield        org/whispersystems/aI.j:Lcom/google/b8;
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
    
    public af k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       org/whispersystems/aZ.o:Z
        //     5: istore_2       
        //     6: new             Lorg/whispersystems/af;
        //     9: dup            
        //    10: aload_0        
        //    11: aconst_null    
        //    12: invokespecial   org/whispersystems/af.<init>:(Lcom/google/fp;Lorg/whispersystems/j;)V
        //    15: astore_3       
        //    16: aload_0        
        //    17: getfield        org/whispersystems/aI.k:I
        //    20: istore          4
        //    22: iload           4
        //    24: iconst_1       
        //    25: iand           
        //    26: iload_1        
        //    27: if_icmpne       268
        //    30: aload_3        
        //    31: aload_0        
        //    32: getfield        org/whispersystems/aI.e:I
        //    35: invokestatic    org/whispersystems/af.b:(Lorg/whispersystems/af;I)I
        //    38: pop            
        //    39: iload           4
        //    41: iconst_2       
        //    42: iand           
        //    43: iconst_2       
        //    44: if_icmpne       262
        //    47: iload_1        
        //    48: iconst_2       
        //    49: ior            
        //    50: istore          6
        //    52: aload_0        
        //    53: getfield        org/whispersystems/aI.l:Lcom/google/aA;
        //    56: astore          9
        //    58: aload           9
        //    60: ifnonnull       76
        //    63: aload_3        
        //    64: aload_0        
        //    65: getfield        org/whispersystems/aI.h:Lorg/whispersystems/aa;
        //    68: invokestatic    org/whispersystems/af.a:(Lorg/whispersystems/af;Lorg/whispersystems/aa;)Lorg/whispersystems/aa;
        //    71: pop            
        //    72: iload_2        
        //    73: ifeq            91
        //    76: aload_3        
        //    77: aload_0        
        //    78: getfield        org/whispersystems/aI.l:Lcom/google/aA;
        //    81: invokevirtual   com/google/aA.a:()Lcom/google/dS;
        //    84: checkcast       Lorg/whispersystems/aa;
        //    87: invokestatic    org/whispersystems/af.a:(Lorg/whispersystems/af;Lorg/whispersystems/aa;)Lorg/whispersystems/aa;
        //    90: pop            
        //    91: iload           4
        //    93: iconst_4       
        //    94: iand           
        //    95: iconst_4       
        //    96: if_icmpne       105
        //    99: iload           6
        //   101: iconst_4       
        //   102: ior            
        //   103: istore          6
        //   105: aload_0        
        //   106: getfield        org/whispersystems/aI.g:Lcom/google/aA;
        //   109: astore          13
        //   111: aload           13
        //   113: ifnonnull       129
        //   116: aload_3        
        //   117: aload_0        
        //   118: getfield        org/whispersystems/aI.i:Lorg/whispersystems/as;
        //   121: invokestatic    org/whispersystems/af.a:(Lorg/whispersystems/af;Lorg/whispersystems/as;)Lorg/whispersystems/as;
        //   124: pop            
        //   125: iload_2        
        //   126: ifeq            144
        //   129: aload_3        
        //   130: aload_0        
        //   131: getfield        org/whispersystems/aI.g:Lcom/google/aA;
        //   134: invokevirtual   com/google/aA.a:()Lcom/google/dS;
        //   137: checkcast       Lorg/whispersystems/as;
        //   140: invokestatic    org/whispersystems/af.a:(Lorg/whispersystems/af;Lorg/whispersystems/as;)Lorg/whispersystems/as;
        //   143: pop            
        //   144: aload_0        
        //   145: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //   148: astore          17
        //   150: aload           17
        //   152: ifnonnull       202
        //   155: bipush          8
        //   157: aload_0        
        //   158: getfield        org/whispersystems/aI.k:I
        //   161: iand           
        //   162: bipush          8
        //   164: if_icmpne       189
        //   167: aload_0        
        //   168: aload_0        
        //   169: getfield        org/whispersystems/aI.f:Ljava/util/List;
        //   172: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   175: putfield        org/whispersystems/aI.f:Ljava/util/List;
        //   178: aload_0        
        //   179: bipush          -9
        //   181: aload_0        
        //   182: getfield        org/whispersystems/aI.k:I
        //   185: iand           
        //   186: putfield        org/whispersystems/aI.k:I
        //   189: aload_3        
        //   190: aload_0        
        //   191: getfield        org/whispersystems/aI.f:Ljava/util/List;
        //   194: invokestatic    org/whispersystems/af.a:(Lorg/whispersystems/af;Ljava/util/List;)Ljava/util/List;
        //   197: pop            
        //   198: iload_2        
        //   199: ifeq            214
        //   202: aload_3        
        //   203: aload_0        
        //   204: getfield        org/whispersystems/aI.j:Lcom/google/b8;
        //   207: invokevirtual   com/google/b8.b:()Ljava/util/List;
        //   210: invokestatic    org/whispersystems/af.a:(Lorg/whispersystems/af;Ljava/util/List;)Ljava/util/List;
        //   213: pop            
        //   214: aload_3        
        //   215: iload           6
        //   217: invokestatic    org/whispersystems/af.a:(Lorg/whispersystems/af;I)I
        //   220: pop            
        //   221: aload_0        
        //   222: invokevirtual   org/whispersystems/aI.b:()V
        //   225: aload_3        
        //   226: areturn        
        //   227: astore          7
        //   229: aload           7
        //   231: athrow         
        //   232: astore          8
        //   234: aload           8
        //   236: athrow         
        //   237: astore          11
        //   239: aload           11
        //   241: athrow         
        //   242: astore          12
        //   244: aload           12
        //   246: athrow         
        //   247: astore          15
        //   249: aload           15
        //   251: athrow         
        //   252: astore          16
        //   254: aload           16
        //   256: athrow         
        //   257: astore          18
        //   259: aload           18
        //   261: athrow         
        //   262: iload_1        
        //   263: istore          6
        //   265: goto            52
        //   268: iconst_0       
        //   269: istore_1       
        //   270: goto            30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  52     58     227    232    Ljava/lang/NullPointerException;
        //  63     72     232    237    Ljava/lang/NullPointerException;
        //  76     91     232    237    Ljava/lang/NullPointerException;
        //  105    111    237    242    Ljava/lang/NullPointerException;
        //  116    125    242    247    Ljava/lang/NullPointerException;
        //  129    144    242    247    Ljava/lang/NullPointerException;
        //  144    150    247    252    Ljava/lang/NullPointerException;
        //  155    189    252    257    Ljava/lang/NullPointerException;
        //  189    198    257    262    Ljava/lang/NullPointerException;
        //  202    214    257    262    Ljava/lang/NullPointerException;
        //  229    232    232    237    Ljava/lang/NullPointerException;
        //  239    242    242    247    Ljava/lang/NullPointerException;
        //  249    252    252    257    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 149, Size: 149
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
    
    public af l() {
        return af.s();
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
    
    public aI n() {
        return g().a(this.k());
    }
}
