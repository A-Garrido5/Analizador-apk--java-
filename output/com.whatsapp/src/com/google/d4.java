// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.util.Iterator;

public final class d4 extends dt
{
    private static final String z;
    private final bB d;
    private final ce e;
    private final bl f;
    private int g;
    
    static {
        final char[] charArray = "`IOWabEYXwOP^Tw\u0006DE^v\u0006NEO%KA^Xm\u0006MOHvGGO\u001bq_PO\u0015".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0005';
                    break;
                }
                case 0: {
                    c2 = '&';
                    break;
                }
                case 1: {
                    c2 = ' ';
                    break;
                }
                case 2: {
                    c2 = '*';
                    break;
                }
                case 3: {
                    c2 = ';';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private d4(final bl f, final bB d, final ce e) {
        this.g = -1;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    d4(final bl bl, final bB bb, final ce ce, final hs hs) {
        this(bl, bb, ce);
    }
    
    static bB a(final d4 d4) {
        return d4.d;
    }
    
    public static f1 a(final bl bl) {
        return new f1(bl, null);
    }
    
    private void a(final hg hg) {
        try {
            if (hg.m() != this.f) {
                throw new IllegalArgumentException(d4.z);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    static boolean a(final bl bl, final bB bb) {
        return b(bl, bb);
    }
    
    static ce b(final d4 d4) {
        return d4.e;
    }
    
    public static d4 b(final bl bl) {
        return new d4(bl, bB.d(), ce.d());
    }
    
    private static boolean b(final bl bl, final bB bb) {
        final boolean b = dt.b;
        for (final hg hg : bl.f()) {
            Label_0067: {
                try {
                    if (!hg.o()) {
                        break Label_0067;
                    }
                    final bB bb2 = bb;
                    final hg hg2 = hg;
                    final boolean b2 = bb2.a(hg2);
                    if (!b2) {
                        return false;
                    }
                    break Label_0067;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                try {
                    final bB bb2 = bb;
                    final hg hg2 = hg;
                    final boolean b2 = bb2.a(hg2);
                    if (!b2) {
                        return false;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            if (b) {
                break;
            }
        }
        return bb.e();
    }
    
    static bl c(final d4 d4) {
        return d4.f;
    }
    
    public f1 a() {
        return this.b().a(this);
    }
    
    @Override
    public Object a(final hg p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   com/google/d4.a:(Lcom/google/hg;)V
        //     9: aload_0        
        //    10: getfield        com/google/d4.d:Lcom/google/bB;
        //    13: aload_1        
        //    14: invokevirtual   com/google/bB.c:(Lcom/google/aK;)Ljava/lang/Object;
        //    17: astore_3       
        //    18: aload_3        
        //    19: ifnonnull       76
        //    22: aload_1        
        //    23: invokevirtual   com/google/hg.b:()Z
        //    26: istore          5
        //    28: iload           5
        //    30: ifeq            41
        //    33: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    36: astore_3       
        //    37: iload_2        
        //    38: ifeq            76
        //    41: aload_1        
        //    42: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //    45: astore          7
        //    47: getstatic       com/google/hD.MESSAGE:Lcom/google/hD;
        //    50: astore          8
        //    52: aload           7
        //    54: aload           8
        //    56: if_acmpne       71
        //    59: aload_1        
        //    60: invokevirtual   com/google/hg.f:()Lcom/google/bl;
        //    63: invokestatic    com/google/d4.b:(Lcom/google/bl;)Lcom/google/d4;
        //    66: astore_3       
        //    67: iload_2        
        //    68: ifeq            76
        //    71: aload_1        
        //    72: invokevirtual   com/google/hg.l:()Ljava/lang/Object;
        //    75: astore_3       
        //    76: aload_3        
        //    77: areturn        
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    83: astore          6
        //    85: aload           6
        //    87: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  22     28     78     83     Ljava/lang/IllegalArgumentException;
        //  41     52     83     88     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
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
    public Map a() {
        return this.d.a();
    }
    
    public f1 b() {
        return new f1(this.f, null);
    }
    
    @Override
    public boolean b(final hg hg) {
        this.a(hg);
        return this.d.a(hg);
    }
    
    public d4 c() {
        return b(this.f);
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.c();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.c();
    }
    
    @Override
    public bl getDescriptorForType() {
        return this.f;
    }
    
    @Override
    public du getParserForType() {
        return new hs(this);
    }
    
    @Override
    public int getSerializedSize() {
        final int g = this.g;
        if (g != -1) {
            return g;
        }
        if (this.f.e().a()) {
            final int n = this.d.c() + this.e.a();
            if (!dt.b) {
                return this.g = n;
            }
        }
        final int n = this.d.f() + this.e.getSerializedSize();
        return this.g = n;
    }
    
    @Override
    public ce getUnknownFields() {
        return this.e;
    }
    
    @Override
    public boolean isInitialized() {
        return b(this.f, this.d);
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.b();
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.b();
    }
    
    @Override
    public a8 toBuilder() {
        return this.a();
    }
    
    @Override
    public aJ toBuilder() {
        return this.a();
    }
    
    @Override
    public void writeTo(final ep p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/d4.f:Lcom/google/bl;
        //     4: invokevirtual   com/google/bl.e:()Lcom/google/d_;
        //     7: invokevirtual   com/google/d_.a:()Z
        //    10: istore          4
        //    12: iload           4
        //    14: ifeq            39
        //    17: aload_0        
        //    18: getfield        com/google/d4.d:Lcom/google/bB;
        //    21: aload_1        
        //    22: invokevirtual   com/google/bB.a:(Lcom/google/ep;)V
        //    25: aload_0        
        //    26: getfield        com/google/d4.e:Lcom/google/ce;
        //    29: aload_1        
        //    30: invokevirtual   com/google/ce.a:(Lcom/google/ep;)V
        //    33: getstatic       com/google/dt.b:Z
        //    36: ifeq            62
        //    39: aload_0        
        //    40: getfield        com/google/d4.d:Lcom/google/bB;
        //    43: aload_1        
        //    44: invokevirtual   com/google/bB.b:(Lcom/google/ep;)V
        //    47: aload_0        
        //    48: getfield        com/google/d4.e:Lcom/google/ce;
        //    51: aload_1        
        //    52: invokevirtual   com/google/ce.writeTo:(Lcom/google/ep;)V
        //    55: return         
        //    56: astore_2       
        //    57: aload_2        
        //    58: athrow         
        //    59: astore_3       
        //    60: aload_3        
        //    61: athrow         
        //    62: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      12     56     59     Ljava/lang/IllegalArgumentException;
        //  17     39     59     62     Ljava/lang/IllegalArgumentException;
        //  39     55     59     62     Ljava/lang/IllegalArgumentException;
        //  57     59     59     62     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
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
}
