// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gc extends gq implements fg
{
    private int f;
    private boolean g;
    private boolean h;
    private b8 i;
    private List j;
    
    private gc() {
        this.j = Collections.emptyList();
        this.d();
    }
    
    private gc(final dg dg) {
        super(dg);
        this.j = Collections.emptyList();
        this.d();
    }
    
    gc(final dg dg, final fM fm) {
        this(dg);
    }
    
    private b8 a() {
        if (this.i == null) {
            this.i = new b8(this.j, (0x4 & this.f) == 0x4, this.a(), this.f());
            this.j = null;
        }
        return this.i;
    }
    
    static gc b() {
        return j();
    }
    
    private void d() {
        if (dS.d) {
            this.a();
        }
    }
    
    private void h() {
        if ((0x4 & this.f) != 0x4) {
            this.j = new ArrayList(this.j);
            this.f |= 0x4;
        }
    }
    
    private static gc j() {
        return new gc();
    }
    
    public dy a(final int n) {
        if (this.i == null) {
            return this.j.get(n);
        }
        return (dy)this.i.a(n);
    }
    
    public gc a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/d_.h:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/d_;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gc.a:(Lcom/google/d_;)Lcom/google/gc;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/d_;
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
        //    61: invokevirtual   com/google/gc.a:(Lcom/google/d_;)Lcom/google/gc;
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
    
    public gc a(final d_ d_) {
        final boolean b = dt.b;
        if (d_ == d_.h()) {
            return this;
        }
        if (d_.d()) {
            this.a(d_.a());
        }
        if (d_.c()) {
            this.b(d_.m());
        }
        Label_0219: {
            if (this.i == null) {
                if (d_.b(d_).isEmpty()) {
                    break Label_0219;
                }
                Label_0117: {
                    if (this.j.isEmpty()) {
                        this.j = d_.b(d_);
                        this.f &= 0xFFFFFFFB;
                        if (!b) {
                            break Label_0117;
                        }
                    }
                    this.h();
                    this.j.addAll(d_.b(d_));
                }
                this.c();
                if (!b) {
                    break Label_0219;
                }
            }
            if (!d_.b(d_).isEmpty()) {
                if (this.i.d()) {
                    this.i.f();
                    this.i = null;
                    this.j = d_.b(d_);
                    this.f &= 0xFFFFFFFB;
                    final boolean d = dS.d;
                    b8 a = null;
                    if (d) {
                        a = this.a();
                    }
                    this.i = a;
                    if (!b) {
                        break Label_0219;
                    }
                }
                this.i.a(d_.b(d_));
            }
        }
        this.a(d_);
        this.b(d_.getUnknownFields());
        return this;
    }
    
    public gc a(final fm fm) {
        if (fm instanceof d_) {
            return this.a((d_)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public gc a(final boolean h) {
        this.f |= 0x1;
        this.h = h;
        this.c();
        return this;
    }
    
    public gc b(final boolean g) {
        this.f |= 0x2;
        this.g = g;
        this.c();
        return this;
    }
    
    @Override
    public gq b() {
        return this.k();
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
        return this.g();
    }
    
    @Override
    public fm buildPartial() {
        return this.g();
    }
    
    @Override
    public gq c() {
        return this.f();
    }
    
    @Override
    public fp clear() {
        return this.k();
    }
    
    @Override
    public fE clone() {
        return this.f();
    }
    
    @Override
    public fp clone() {
        return this.f();
    }
    
    @Override
    public fx clone() {
        return this.f();
    }
    
    @Override
    public Object clone() {
        return this.f();
    }
    
    public d_ e() {
        return d_.h();
    }
    
    public gc f() {
        return j().a(this.g());
    }
    
    public d_ g() {
        int n = 1;
        final d_ d_ = new d_(this, null);
        final int f = this.f;
        if ((f & 0x1) != n) {
            n = 0;
        }
        com.google.d_.a(d_, this.h);
        if ((f & 0x2) == 0x2) {
            n |= 0x2;
        }
        com.google.d_.b(d_, this.g);
        Label_0119: {
            if (this.i == null) {
                if ((0x4 & this.f) == 0x4) {
                    this.j = Collections.unmodifiableList((List<?>)this.j);
                    this.f &= 0xFFFFFFFB;
                }
                com.google.d_.a(d_, this.j);
                if (!dt.b) {
                    break Label_0119;
                }
            }
            com.google.d_.a(d_, this.i.b());
        }
        com.google.d_.a(d_, n);
        this.b();
        return d_;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.e();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.e();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.j();
    }
    
    public int i() {
        if (this.i == null) {
            return this.j.size();
        }
        return this.i.a();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.G().a(d_.class, gc.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.i()) {
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
    
    public gc k() {
        super.b();
        this.h = false;
        this.f &= 0xFFFFFFFE;
        this.g = false;
        this.f &= 0xFFFFFFFD;
        if (this.i == null) {
            this.j = Collections.emptyList();
            this.f &= 0xFFFFFFFB;
            if (!dt.b) {
                return this;
            }
        }
        this.i.c();
        return this;
    }
    
    public d_ l() {
        final d_ g = this.g();
        if (!g.isInitialized()) {
            throw fx.a(g);
        }
        return g;
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
