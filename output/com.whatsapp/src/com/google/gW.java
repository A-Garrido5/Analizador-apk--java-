// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gW extends gq implements ho
{
    private int f;
    private List g;
    private boolean h;
    private b8 i;
    
    private gW() {
        this.h = true;
        this.g = Collections.emptyList();
        this.d();
    }
    
    private gW(final dg dg) {
        super(dg);
        this.h = true;
        this.g = Collections.emptyList();
        this.d();
    }
    
    gW(final dg dg, final fM fm) {
        this(dg);
    }
    
    private void d() {
        if (dS.d) {
            this.k();
        }
    }
    
    private void i() {
        if ((0x2 & this.f) != 0x2) {
            this.g = new ArrayList(this.g);
            this.f |= 0x2;
        }
    }
    
    private b8 k() {
        if (this.i == null) {
            this.i = new b8(this.g, (0x2 & this.f) == 0x2, this.a(), this.f());
            this.g = null;
        }
        return this.i;
    }
    
    static gW l() {
        return m();
    }
    
    private static gW m() {
        return new gW();
    }
    
    public int a() {
        if (this.i == null) {
            return this.g.size();
        }
        return this.i.a();
    }
    
    public dy a(final int n) {
        if (this.i == null) {
            return this.g.get(n);
        }
        return (dy)this.i.a(n);
    }
    
    public gW a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/da.l:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/da;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gW.a:(Lcom/google/da;)Lcom/google/gW;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/da;
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
        //    61: invokevirtual   com/google/gW.a:(Lcom/google/da;)Lcom/google/gW;
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
    
    public gW a(final da da) {
        final boolean b = dt.b;
        if (da == da.j()) {
            return this;
        }
        if (da.b()) {
            this.a(da.a());
        }
        Label_0203: {
            if (this.i == null) {
                if (da.a(da).isEmpty()) {
                    break Label_0203;
                }
                Label_0101: {
                    if (this.g.isEmpty()) {
                        this.g = da.a(da);
                        this.f &= 0xFFFFFFFD;
                        if (!b) {
                            break Label_0101;
                        }
                    }
                    this.i();
                    this.g.addAll(da.a(da));
                }
                this.c();
                if (!b) {
                    break Label_0203;
                }
            }
            if (!da.a(da).isEmpty()) {
                if (this.i.d()) {
                    this.i.f();
                    this.i = null;
                    this.g = da.a(da);
                    this.f &= 0xFFFFFFFD;
                    final boolean d = dS.d;
                    b8 k = null;
                    if (d) {
                        k = this.k();
                    }
                    this.i = k;
                    if (!b) {
                        break Label_0203;
                    }
                }
                this.i.a(da.a(da));
            }
        }
        this.a(da);
        this.b(da.getUnknownFields());
        return this;
    }
    
    public gW a(final fm fm) {
        if (fm instanceof da) {
            return this.a((da)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public gW a(final boolean h) {
        this.f |= 0x1;
        this.h = h;
        this.c();
        return this;
    }
    
    @Override
    public gq b() {
        return this.g();
    }
    
    @Override
    public ci build() {
        return this.e();
    }
    
    @Override
    public fm build() {
        return this.e();
    }
    
    @Override
    public ci buildPartial() {
        return this.f();
    }
    
    @Override
    public fm buildPartial() {
        return this.f();
    }
    
    @Override
    public gq c() {
        return this.h();
    }
    
    @Override
    public fp clear() {
        return this.g();
    }
    
    @Override
    public fE clone() {
        return this.h();
    }
    
    @Override
    public fp clone() {
        return this.h();
    }
    
    @Override
    public fx clone() {
        return this.h();
    }
    
    @Override
    public Object clone() {
        return this.h();
    }
    
    public da e() {
        final da f = this.f();
        if (!f.isInitialized()) {
            throw fx.a(f);
        }
        return f;
    }
    
    public da f() {
        int n = 1;
        final da da = new da(this, null);
        if ((0x1 & this.f) != n) {
            n = 0;
        }
        com.google.da.a(da, this.h);
        Label_0097: {
            if (this.i == null) {
                if ((0x2 & this.f) == 0x2) {
                    this.g = Collections.unmodifiableList((List<?>)this.g);
                    this.f &= 0xFFFFFFFD;
                }
                com.google.da.a(da, this.g);
                if (!dt.b) {
                    break Label_0097;
                }
            }
            com.google.da.a(da, this.i.b());
        }
        com.google.da.a(da, n);
        this.b();
        return da;
    }
    
    public gW g() {
        super.b();
        this.h = true;
        this.f &= 0xFFFFFFFE;
        if (this.i == null) {
            this.g = Collections.emptyList();
            this.f &= 0xFFFFFFFD;
            if (!dt.b) {
                return this;
            }
        }
        this.i.c();
        return this;
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
        return hM.K();
    }
    
    public gW h() {
        return m().a(this.f());
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.q().a(da.class, gW.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.a()) {
            if (!this.a(i).isInitialized()) {
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        if (this.e()) {
            return true;
        }
        return false;
    }
    
    public da j() {
        return da.j();
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
