// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gS extends fp implements aB
{
    private List e;
    private Object f;
    private int g;
    private Object h;
    private List i;
    
    private gS() {
        this.i = Collections.emptyList();
        this.e = Collections.emptyList();
        this.f = "";
        this.h = "";
        this.d();
    }
    
    private gS(final dg dg) {
        super(dg);
        this.i = Collections.emptyList();
        this.e = Collections.emptyList();
        this.f = "";
        this.h = "";
        this.d();
    }
    
    gS(final dg dg, final fM fm) {
        this(dg);
    }
    
    static gS a() {
        return i();
    }
    
    private void d() {
        if (dS.d) {}
    }
    
    private void f() {
        if ((0x1 & this.g) != 0x1) {
            this.i = new ArrayList(this.i);
            this.g |= 0x1;
        }
    }
    
    private void h() {
        if ((0x2 & this.g) != 0x2) {
            this.e = new ArrayList(this.e);
            this.g |= 0x2;
        }
    }
    
    private static gS i() {
        return new gS();
    }
    
    public gS a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dm.q:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dm;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gS.a:(Lcom/google/dm;)Lcom/google/gS;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dm;
        //    39: astore          8
        //    41: aload           7
        //    43: athrow         
        //    44: astore          9
        //    46: aload           8
        //    48: astore          4
        //    50: aload           9
        //    52: astore_3       
        //    53: aload           4
        //    55: ifnull          65
        //    58: aload_0        
        //    59: aload           4
        //    61: invokevirtual   com/google/gS.a:(Lcom/google/dm;)Lcom/google/gS;
        //    64: pop            
        //    65: aload_3        
        //    66: athrow         
        //    67: astore          5
        //    69: aload           5
        //    71: athrow         
        //    72: astore          11
        //    74: aload           11
        //    76: athrow         
        //    77: astore_3       
        //    78: aconst_null    
        //    79: astore          4
        //    81: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  0      15     29     53     Lcom/google/bg;
        //  0      15     77     84     Any
        //  20     27     72     77     Lcom/google/bg;
        //  31     41     77     84     Any
        //  41     44     44     53     Any
        //  58     65     67     72     Lcom/google/bg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    public gS a(final dm dm) {
        final boolean b = dt.b;
        if (dm == dm.d()) {
            return this;
        }
        if (!dm.a(dm).isEmpty()) {
            Label_0078: {
                if (this.i.isEmpty()) {
                    this.i = dm.a(dm);
                    this.g &= 0xFFFFFFFE;
                    if (!b) {
                        break Label_0078;
                    }
                }
                this.f();
                this.i.addAll(dm.a(dm));
            }
            this.c();
        }
        if (!dm.d(dm).isEmpty()) {
            Label_0147: {
                if (this.e.isEmpty()) {
                    this.e = dm.d(dm);
                    this.g &= 0xFFFFFFFD;
                    if (!b) {
                        break Label_0147;
                    }
                }
                this.h();
                this.e.addAll(dm.d(dm));
            }
            this.c();
        }
        if (dm.i()) {
            this.g |= 0x4;
            this.f = dm.e(dm);
            this.c();
        }
        if (dm.g()) {
            this.g |= 0x8;
            this.h = dm.b(dm);
            this.c();
        }
        this.b(dm.getUnknownFields());
        return this;
    }
    
    public gS a(final fm fm) {
        if (fm instanceof dm) {
            return this.a((dm)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    @Override
    public ci build() {
        return this.k();
    }
    
    @Override
    public fm build() {
        return this.k();
    }
    
    @Override
    public ci buildPartial() {
        return this.g();
    }
    
    @Override
    public fm buildPartial() {
        return this.g();
    }
    
    @Override
    public fp clear() {
        return this.l();
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
    
    public gS e() {
        return i().a(this.g());
    }
    
    public dm g() {
        int n = 1;
        final dm dm = new dm(this, null);
        final int g = this.g;
        if ((0x1 & this.g) == n) {
            this.i = Collections.unmodifiableList((List<?>)this.i);
            this.g &= 0xFFFFFFFE;
        }
        com.google.dm.b(dm, this.i);
        if ((0x2 & this.g) == 0x2) {
            this.e = Collections.unmodifiableList((List<?>)this.e);
            this.g &= 0xFFFFFFFD;
        }
        com.google.dm.a(dm, this.e);
        if ((g & 0x4) != 0x4) {
            n = 0;
        }
        com.google.dm.a(dm, this.f);
        if ((g & 0x8) == 0x8) {
            n |= 0x2;
        }
        com.google.dm.b(dm, this.h);
        com.google.dm.a(dm, n);
        this.b();
        return dm;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.j();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.j();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.o();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.L().a(dm.class, gS.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return true;
    }
    
    public dm j() {
        return dm.d();
    }
    
    public dm k() {
        final dm g = this.g();
        if (!g.isInitialized()) {
            throw fx.a(g);
        }
        return g;
    }
    
    public gS l() {
        super.clear();
        this.i = Collections.emptyList();
        this.g &= 0xFFFFFFFE;
        this.e = Collections.emptyList();
        this.g &= 0xFFFFFFFD;
        this.f = "";
        this.g &= 0xFFFFFFFB;
        this.h = "";
        this.g &= 0xFFFFFFF7;
        return this;
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
