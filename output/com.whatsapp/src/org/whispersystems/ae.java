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
import com.google.b8;
import java.util.List;
import com.google.aA;
import com.google.fp;

public final class ae extends fp implements u
{
    private aA e;
    private List f;
    private aZ g;
    private b8 h;
    private int i;
    
    private ae() {
        this.g = aZ.i();
        this.f = Collections.emptyList();
        this.k();
    }
    
    private ae(final dg dg) {
        super(dg);
        this.g = aZ.i();
        this.f = Collections.emptyList();
        this.k();
    }
    
    ae(final dg dg, final j j) {
        this(dg);
    }
    
    private static ae c() {
        return new ae();
    }
    
    private b8 d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       60
        //     9: aload_0        
        //    10: getfield        org/whispersystems/ae.f:Ljava/util/List;
        //    13: astore          4
        //    15: aload_0        
        //    16: getfield        org/whispersystems/ae.i:I
        //    19: istore          5
        //    21: iload           5
        //    23: iconst_2       
        //    24: iand           
        //    25: iconst_2       
        //    26: if_icmpne       71
        //    29: iconst_1       
        //    30: istore          6
        //    32: aload_0        
        //    33: new             Lcom/google/b8;
        //    36: dup            
        //    37: aload           4
        //    39: iload           6
        //    41: aload_0        
        //    42: invokevirtual   org/whispersystems/ae.a:()Lcom/google/dg;
        //    45: aload_0        
        //    46: invokevirtual   org/whispersystems/ae.f:()Z
        //    49: invokespecial   com/google/b8.<init>:(Ljava/util/List;ZLcom/google/dg;Z)V
        //    52: putfield        org/whispersystems/ae.h:Lcom/google/b8;
        //    55: aload_0        
        //    56: aconst_null    
        //    57: putfield        org/whispersystems/ae.f:Ljava/util/List;
        //    60: aload_0        
        //    61: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //    64: areturn        
        //    65: astore_1       
        //    66: aload_1        
        //    67: athrow         
        //    68: astore_2       
        //    69: aload_2        
        //    70: athrow         
        //    71: iconst_0       
        //    72: istore          6
        //    74: goto            32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      65     68     Ljava/lang/NullPointerException;
        //  9      21     68     71     Ljava/lang/NullPointerException;
        //  66     68     68     71     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    private void f() {
        try {
            if ((0x2 & this.i) != 0x2) {
                this.f = new ArrayList(this.f);
                this.i |= 0x2;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private aA g() {
        try {
            if (this.e == null) {
                this.e = new aA(this.g, this.a(), this.f());
                this.g = null;
            }
            return this.e;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    static ae j() {
        return c();
    }
    
    private void k() {
        try {
            if (ay.d()) {
                this.g();
                this.d();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public ae a() {
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
        //    10: getfield        org/whispersystems/ae.e:Lcom/google/aA;
        //    13: astore          5
        //    15: aload           5
        //    17: ifnonnull       31
        //    20: aload_0        
        //    21: invokestatic    org/whispersystems/aZ.i:()Lorg/whispersystems/aZ;
        //    24: putfield        org/whispersystems/ae.g:Lorg/whispersystems/aZ;
        //    27: iload_1        
        //    28: ifeq            39
        //    31: aload_0        
        //    32: getfield        org/whispersystems/ae.e:Lcom/google/aA;
        //    35: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //    38: pop            
        //    39: aload_0        
        //    40: bipush          -2
        //    42: aload_0        
        //    43: getfield        org/whispersystems/ae.i:I
        //    46: iand           
        //    47: putfield        org/whispersystems/ae.i:I
        //    50: aload_0        
        //    51: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //    54: astore          9
        //    56: aload           9
        //    58: ifnonnull       83
        //    61: aload_0        
        //    62: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    65: putfield        org/whispersystems/ae.f:Ljava/util/List;
        //    68: aload_0        
        //    69: bipush          -3
        //    71: aload_0        
        //    72: getfield        org/whispersystems/ae.i:I
        //    75: iand           
        //    76: putfield        org/whispersystems/ae.i:I
        //    79: iload_1        
        //    80: ifeq            90
        //    83: aload_0        
        //    84: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //    87: invokevirtual   com/google/b8.c:()V
        //    90: aload_0        
        //    91: areturn        
        //    92: astore_2       
        //    93: aload_2        
        //    94: athrow         
        //    95: astore_3       
        //    96: aload_3        
        //    97: athrow         
        //    98: astore          7
        //   100: aload           7
        //   102: athrow         
        //   103: astore          8
        //   105: aload           8
        //   107: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      15     92     95     Ljava/lang/NullPointerException;
        //  20     27     95     98     Ljava/lang/NullPointerException;
        //  31     39     95     98     Ljava/lang/NullPointerException;
        //  39     56     98     103    Ljava/lang/NullPointerException;
        //  61     79     103    108    Ljava/lang/NullPointerException;
        //  83     90     103    108    Ljava/lang/NullPointerException;
        //  93     95     95     98     Ljava/lang/NullPointerException;
        //  100    103    103    108    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 58, Size: 58
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
    
    public ae a(final cL cl, final fu fu) {
        while (true) {
            try {
                ay ay3;
                Throwable t;
                try {
                    final ay ay = (ay)org.whispersystems.ay.i.parsePartialFrom(cl, fu);
                    if (ay == null) {
                        return this;
                    }
                    try {
                        this.a(ay);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final ay ay2 = (ay)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        ay3 = ay2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (ay3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(ay3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final ay ay3 = null;
                continue;
            }
            break;
        }
    }
    
    public ae a(final fm fm) {
        try {
            if (fm instanceof ay) {
                return this.a((ay)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public ae a(final Iterable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnonnull       33
        //    11: aload_0        
        //    12: invokespecial   org/whispersystems/ae.f:()V
        //    15: aload_1        
        //    16: aload_0        
        //    17: getfield        org/whispersystems/ae.f:Ljava/util/List;
        //    20: invokestatic    com/google/fp.a:(Ljava/lang/Iterable;Ljava/util/Collection;)V
        //    23: aload_0        
        //    24: invokevirtual   org/whispersystems/ae.c:()V
        //    27: getstatic       org/whispersystems/aZ.o:Z
        //    30: ifeq            50
        //    33: aload_0        
        //    34: getfield        org/whispersystems/ae.h:Lcom/google/b8;
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
    
    public ae a(final aZ g) {
        Label_0044: {
            try {
                if (this.e != null) {
                    break Label_0044;
                }
                if (g == null) {
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
                this.g = g;
                this.c();
                if (aZ.o) {
                    this.e.b(g);
                }
                this.i |= 0x1;
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
    
    public ae a(final ay p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: invokestatic    org/whispersystems/ay.e:()Lorg/whispersystems/ay;
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
        //    21: invokevirtual   org/whispersystems/ay.i:()Z
        //    24: ifeq            36
        //    27: aload_0        
        //    28: aload_1        
        //    29: invokevirtual   org/whispersystems/ay.l:()Lorg/whispersystems/aZ;
        //    32: invokevirtual   org/whispersystems/ae.b:(Lorg/whispersystems/aZ;)Lorg/whispersystems/ae;
        //    35: pop            
        //    36: aload_0        
        //    37: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //    40: astore          10
        //    42: aload           10
        //    44: ifnonnull       128
        //    47: aload_1        
        //    48: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;)Ljava/util/List;
        //    51: invokeinterface java/util/List.isEmpty:()Z
        //    56: istore          22
        //    58: iload           22
        //    60: ifne            234
        //    63: aload_0        
        //    64: getfield        org/whispersystems/ae.f:Ljava/util/List;
        //    67: invokeinterface java/util/List.isEmpty:()Z
        //    72: istore          23
        //    74: iload           23
        //    76: ifeq            102
        //    79: aload_0        
        //    80: aload_1        
        //    81: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;)Ljava/util/List;
        //    84: putfield        org/whispersystems/ae.f:Ljava/util/List;
        //    87: aload_0        
        //    88: bipush          -3
        //    90: aload_0        
        //    91: getfield        org/whispersystems/ae.i:I
        //    94: iand           
        //    95: putfield        org/whispersystems/ae.i:I
        //    98: iload_2        
        //    99: ifeq            120
        //   102: aload_0        
        //   103: invokespecial   org/whispersystems/ae.f:()V
        //   106: aload_0        
        //   107: getfield        org/whispersystems/ae.f:Ljava/util/List;
        //   110: aload_1        
        //   111: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;)Ljava/util/List;
        //   114: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   119: pop            
        //   120: aload_0        
        //   121: invokevirtual   org/whispersystems/ae.c:()V
        //   124: iload_2        
        //   125: ifeq            234
        //   128: aload_1        
        //   129: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;)Ljava/util/List;
        //   132: invokeinterface java/util/List.isEmpty:()Z
        //   137: istore          14
        //   139: iload           14
        //   141: ifne            234
        //   144: aload_0        
        //   145: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //   148: invokevirtual   com/google/b8.d:()Z
        //   151: istore          16
        //   153: iload           16
        //   155: ifeq            222
        //   158: aload_0        
        //   159: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //   162: invokevirtual   com/google/b8.f:()V
        //   165: aload_0        
        //   166: aconst_null    
        //   167: putfield        org/whispersystems/ae.h:Lcom/google/b8;
        //   170: aload_0        
        //   171: aload_1        
        //   172: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;)Ljava/util/List;
        //   175: putfield        org/whispersystems/ae.f:Ljava/util/List;
        //   178: aload_0        
        //   179: bipush          -3
        //   181: aload_0        
        //   182: getfield        org/whispersystems/ae.i:I
        //   185: iand           
        //   186: putfield        org/whispersystems/ae.i:I
        //   189: invokestatic    org/whispersystems/ay.c:()Z
        //   192: istore          19
        //   194: aconst_null    
        //   195: astore          20
        //   197: iload           19
        //   199: ifeq            212
        //   202: aload_0        
        //   203: invokespecial   org/whispersystems/ae.d:()Lcom/google/b8;
        //   206: astore          21
        //   208: aload           21
        //   210: astore          20
        //   212: aload_0        
        //   213: aload           20
        //   215: putfield        org/whispersystems/ae.h:Lcom/google/b8;
        //   218: iload_2        
        //   219: ifeq            234
        //   222: aload_0        
        //   223: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //   226: aload_1        
        //   227: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;)Ljava/util/List;
        //   230: invokevirtual   com/google/b8.a:(Ljava/lang/Iterable;)Lcom/google/b8;
        //   233: pop            
        //   234: aload_0        
        //   235: aload_1        
        //   236: invokevirtual   org/whispersystems/ay.getUnknownFields:()Lcom/google/ce;
        //   239: invokevirtual   org/whispersystems/ae.b:(Lcom/google/ce;)Lcom/google/fp;
        //   242: pop            
        //   243: aload_0        
        //   244: areturn        
        //   245: astore          5
        //   247: aload           5
        //   249: athrow         
        //   250: astore          6
        //   252: aload           6
        //   254: athrow         
        //   255: astore          7
        //   257: aload           7
        //   259: athrow         
        //   260: astore          8
        //   262: aload           8
        //   264: athrow         
        //   265: astore          9
        //   267: aload           9
        //   269: athrow         
        //   270: astore          25
        //   272: aload           25
        //   274: athrow         
        //   275: astore          11
        //   277: aload           11
        //   279: athrow         
        //   280: astore          12
        //   282: aload           12
        //   284: athrow         
        //   285: astore          13
        //   287: aload           13
        //   289: athrow         
        //   290: astore          17
        //   292: aload           17
        //   294: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      17     20     Ljava/lang/NullPointerException;
        //  20     36     245    250    Ljava/lang/NullPointerException;
        //  36     42     250    255    Ljava/lang/NullPointerException;
        //  47     58     255    260    Ljava/lang/NullPointerException;
        //  63     74     260    265    Ljava/lang/NullPointerException;
        //  79     98     265    270    Ljava/lang/NullPointerException;
        //  102    120    265    270    Ljava/lang/NullPointerException;
        //  120    124    270    275    Ljava/lang/NullPointerException;
        //  128    139    275    280    Ljava/lang/NullPointerException;
        //  144    153    280    285    Ljava/lang/NullPointerException;
        //  158    194    285    290    Ljava/lang/NullPointerException;
        //  202    208    285    290    Ljava/lang/NullPointerException;
        //  212    218    290    295    Ljava/lang/NullPointerException;
        //  222    234    290    295    Ljava/lang/NullPointerException;
        //  252    255    255    260    Ljava/lang/NullPointerException;
        //  257    260    260    265    Ljava/lang/NullPointerException;
        //  262    265    265    270    Ljava/lang/NullPointerException;
        //  272    275    275    280    Ljava/lang/NullPointerException;
        //  277    280    280    285    Ljava/lang/NullPointerException;
        //  282    285    285    290    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 148, Size: 148
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
    
    public ae b(final aZ p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        org/whispersystems/ae.e:Lcom/google/aA;
        //     8: astore          7
        //    10: aload           7
        //    12: ifnonnull       82
        //    15: aload_0        
        //    16: getfield        org/whispersystems/ae.i:I
        //    19: istore          10
        //    21: iload           10
        //    23: iconst_1       
        //    24: iand           
        //    25: iconst_1       
        //    26: if_icmpne       69
        //    29: aload_0        
        //    30: getfield        org/whispersystems/ae.g:Lorg/whispersystems/aZ;
        //    33: astore          11
        //    35: invokestatic    org/whispersystems/aZ.i:()Lorg/whispersystems/aZ;
        //    38: astore          12
        //    40: aload           11
        //    42: aload           12
        //    44: if_acmpeq       69
        //    47: aload_0        
        //    48: aload_0        
        //    49: getfield        org/whispersystems/ae.g:Lorg/whispersystems/aZ;
        //    52: invokestatic    org/whispersystems/aZ.a:(Lorg/whispersystems/aZ;)Lorg/whispersystems/a2;
        //    55: aload_1        
        //    56: invokevirtual   org/whispersystems/a2.a:(Lorg/whispersystems/aZ;)Lorg/whispersystems/a2;
        //    59: invokevirtual   org/whispersystems/a2.l:()Lorg/whispersystems/aZ;
        //    62: putfield        org/whispersystems/ae.g:Lorg/whispersystems/aZ;
        //    65: iload_2        
        //    66: ifeq            74
        //    69: aload_0        
        //    70: aload_1        
        //    71: putfield        org/whispersystems/ae.g:Lorg/whispersystems/aZ;
        //    74: aload_0        
        //    75: invokevirtual   org/whispersystems/ae.c:()V
        //    78: iload_2        
        //    79: ifeq            91
        //    82: aload_0        
        //    83: getfield        org/whispersystems/ae.e:Lcom/google/aA;
        //    86: aload_1        
        //    87: invokevirtual   com/google/aA.a:(Lcom/google/dS;)Lcom/google/aA;
        //    90: pop            
        //    91: aload_0        
        //    92: iconst_1       
        //    93: aload_0        
        //    94: getfield        org/whispersystems/ae.i:I
        //    97: ior            
        //    98: putfield        org/whispersystems/ae.i:I
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
    
    public ay b() {
        final ay e = this.e();
        try {
            if (!e.isInitialized()) {
                throw fx.a(e);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return e;
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
        return this.e();
    }
    
    @Override
    public fm buildPartial() {
        return this.e();
    }
    
    @Override
    public fp clear() {
        return this.a();
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
    
    public ay e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_1       
        //     4: new             Lorg/whispersystems/ay;
        //     7: dup            
        //     8: aload_0        
        //     9: aconst_null    
        //    10: invokespecial   org/whispersystems/ay.<init>:(Lcom/google/fp;Lorg/whispersystems/j;)V
        //    13: astore_2       
        //    14: iconst_1       
        //    15: aload_0        
        //    16: getfield        org/whispersystems/ae.i:I
        //    19: iand           
        //    20: istore_3       
        //    21: iconst_0       
        //    22: istore          4
        //    24: iload_3        
        //    25: iconst_1       
        //    26: if_icmpne       32
        //    29: iconst_1       
        //    30: istore          4
        //    32: aload_0        
        //    33: getfield        org/whispersystems/ae.e:Lcom/google/aA;
        //    36: astore          7
        //    38: aload           7
        //    40: ifnonnull       56
        //    43: aload_2        
        //    44: aload_0        
        //    45: getfield        org/whispersystems/ae.g:Lorg/whispersystems/aZ;
        //    48: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;Lorg/whispersystems/aZ;)Lorg/whispersystems/aZ;
        //    51: pop            
        //    52: iload_1        
        //    53: ifeq            71
        //    56: aload_2        
        //    57: aload_0        
        //    58: getfield        org/whispersystems/ae.e:Lcom/google/aA;
        //    61: invokevirtual   com/google/aA.a:()Lcom/google/dS;
        //    64: checkcast       Lorg/whispersystems/aZ;
        //    67: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;Lorg/whispersystems/aZ;)Lorg/whispersystems/aZ;
        //    70: pop            
        //    71: aload_0        
        //    72: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //    75: astore          11
        //    77: aload           11
        //    79: ifnonnull       127
        //    82: iconst_2       
        //    83: aload_0        
        //    84: getfield        org/whispersystems/ae.i:I
        //    87: iand           
        //    88: iconst_2       
        //    89: if_icmpne       114
        //    92: aload_0        
        //    93: aload_0        
        //    94: getfield        org/whispersystems/ae.f:Ljava/util/List;
        //    97: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   100: putfield        org/whispersystems/ae.f:Ljava/util/List;
        //   103: aload_0        
        //   104: bipush          -3
        //   106: aload_0        
        //   107: getfield        org/whispersystems/ae.i:I
        //   110: iand           
        //   111: putfield        org/whispersystems/ae.i:I
        //   114: aload_2        
        //   115: aload_0        
        //   116: getfield        org/whispersystems/ae.f:Ljava/util/List;
        //   119: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;Ljava/util/List;)Ljava/util/List;
        //   122: pop            
        //   123: iload_1        
        //   124: ifeq            139
        //   127: aload_2        
        //   128: aload_0        
        //   129: getfield        org/whispersystems/ae.h:Lcom/google/b8;
        //   132: invokevirtual   com/google/b8.b:()Ljava/util/List;
        //   135: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;Ljava/util/List;)Ljava/util/List;
        //   138: pop            
        //   139: aload_2        
        //   140: iload           4
        //   142: invokestatic    org/whispersystems/ay.a:(Lorg/whispersystems/ay;I)I
        //   145: pop            
        //   146: aload_0        
        //   147: invokevirtual   org/whispersystems/ae.b:()V
        //   150: aload_2        
        //   151: areturn        
        //   152: astore          5
        //   154: aload           5
        //   156: athrow         
        //   157: astore          6
        //   159: aload           6
        //   161: athrow         
        //   162: astore          9
        //   164: aload           9
        //   166: athrow         
        //   167: astore          10
        //   169: aload           10
        //   171: athrow         
        //   172: astore          12
        //   174: aload           12
        //   176: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  32     38     152    157    Ljava/lang/NullPointerException;
        //  43     52     157    162    Ljava/lang/NullPointerException;
        //  56     71     157    162    Ljava/lang/NullPointerException;
        //  71     77     162    167    Ljava/lang/NullPointerException;
        //  82     114    167    172    Ljava/lang/NullPointerException;
        //  114    123    172    177    Ljava/lang/NullPointerException;
        //  127    139    172    177    Ljava/lang/NullPointerException;
        //  154    157    157    162    Ljava/lang/NullPointerException;
        //  164    167    167    172    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 97, Size: 97
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
    public ci getDefaultInstanceForType() {
        return this.h();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.h();
    }
    
    @Override
    public bl getDescriptorForType() {
        return bO.f();
    }
    
    public ay h() {
        return ay.e();
    }
    
    public ae i() {
        return c().a(this.e());
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.B().a(ay.class, ae.class);
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
