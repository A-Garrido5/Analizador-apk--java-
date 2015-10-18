// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gt extends fp implements cU
{
    private Object e;
    private dh f;
    private b8 g;
    private int h;
    private List i;
    private aA j;
    
    private gt() {
        this.e = "";
        this.i = Collections.emptyList();
        this.f = dh.g();
        this.f();
    }
    
    private gt(final dg dg) {
        super(dg);
        this.e = "";
        this.i = Collections.emptyList();
        this.f = dh.g();
        this.f();
    }
    
    gt(final dg dg, final fM fm) {
        this(dg);
    }
    
    private b8 c() {
        if (this.g == null) {
            this.g = new b8(this.i, (0x2 & this.h) == 0x2, this.a(), this.f());
            this.i = null;
        }
        return this.g;
    }
    
    private void f() {
        if (dS.d) {
            this.c();
            this.j();
        }
    }
    
    private static gt h() {
        return new gt();
    }
    
    private aA j() {
        if (this.j == null) {
            this.j = new aA(this.f, this.a(), this.f());
            this.f = null;
        }
        return this.j;
    }
    
    private void l() {
        if ((0x2 & this.h) != 0x2) {
            this.i = new ArrayList(this.i);
            this.h |= 0x2;
        }
    }
    
    static gt n() {
        return h();
    }
    
    public dc a(final int n) {
        if (this.g == null) {
            return this.i.get(n);
        }
        return (dc)this.g.a(n);
    }
    
    public gt a() {
        final boolean b = dt.b;
        super.clear();
        this.e = "";
        this.h &= 0xFFFFFFFE;
        Label_0062: {
            if (this.g == null) {
                this.i = Collections.emptyList();
                this.h &= 0xFFFFFFFD;
                if (!b) {
                    break Label_0062;
                }
            }
            this.g.c();
        }
        Label_0088: {
            if (this.j == null) {
                this.f = dh.g();
                if (!b) {
                    break Label_0088;
                }
            }
            this.j.c();
        }
        this.h &= 0xFFFFFFFB;
        return this;
    }
    
    public gt a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dB.n:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dB;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gt.a:(Lcom/google/dB;)Lcom/google/gt;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dB;
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
        //    61: invokevirtual   com/google/gt.a:(Lcom/google/dB;)Lcom/google/gt;
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
    
    public gt a(final dB db) {
        final boolean b = dt.b;
        if (db == dB.f()) {
            return this;
        }
        if (db.g()) {
            this.h |= 0x1;
            this.e = dB.c(db);
            this.c();
        }
        Label_0216: {
            if (this.g == null) {
                if (dB.a(db).isEmpty()) {
                    break Label_0216;
                }
                Label_0114: {
                    if (this.i.isEmpty()) {
                        this.i = dB.a(db);
                        this.h &= 0xFFFFFFFD;
                        if (!b) {
                            break Label_0114;
                        }
                    }
                    this.l();
                    this.i.addAll(dB.a(db));
                }
                this.c();
                if (!b) {
                    break Label_0216;
                }
            }
            if (!dB.a(db).isEmpty()) {
                if (this.g.d()) {
                    this.g.f();
                    this.g = null;
                    this.i = dB.a(db);
                    this.h &= 0xFFFFFFFD;
                    final boolean d = dS.d;
                    b8 c = null;
                    if (d) {
                        c = this.c();
                    }
                    this.g = c;
                    if (!b) {
                        break Label_0216;
                    }
                }
                this.g.a(dB.a(db));
            }
        }
        if (db.c()) {
            this.a(db.m());
        }
        this.b(db.getUnknownFields());
        return this;
    }
    
    public gt a(final dh f) {
        final boolean b = dt.b;
        Label_0075: {
            if (this.j == null) {
                Label_0058: {
                    if ((0x4 & this.h) == 0x4 && this.f != dh.g()) {
                        this.f = dh.a(this.f).a(f).a();
                        if (!b) {
                            break Label_0058;
                        }
                    }
                    this.f = f;
                }
                this.c();
                if (!b) {
                    break Label_0075;
                }
            }
            this.j.a(f);
        }
        this.h |= 0x4;
        return this;
    }
    
    public gt a(final fm fm) {
        if (fm instanceof dB) {
            return this.a((dB)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public dB b() {
        final dB e = this.e();
        if (!e.isInitialized()) {
            throw fx.a(e);
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
        return this.d();
    }
    
    @Override
    public fp clone() {
        return this.d();
    }
    
    @Override
    public fx clone() {
        return this.d();
    }
    
    @Override
    public Object clone() {
        return this.d();
    }
    
    public gt d() {
        return h().a(this.e());
    }
    
    public dB e() {
        int n = 1;
        final boolean b = dt.b;
        final dB db = new dB(this, null);
        final int h = this.h;
        if ((h & 0x1) != n) {
            n = 0;
        }
        dB.a(db, this.e);
        Label_0103: {
            if (this.g == null) {
                if ((0x2 & this.h) == 0x2) {
                    this.i = Collections.unmodifiableList((List<?>)this.i);
                    this.h &= 0xFFFFFFFD;
                }
                dB.a(db, this.i);
                if (!b) {
                    break Label_0103;
                }
            }
            dB.a(db, this.g.b());
        }
        int n2;
        if ((h & 0x4) == 0x4) {
            n2 = (n | 0x2);
        }
        else {
            n2 = n;
        }
        Label_0151: {
            if (this.j == null) {
                dB.a(db, this.f);
                if (!b) {
                    break Label_0151;
                }
            }
            dB.a(db, (dh)this.j.a());
        }
        dB.a(db, n2);
        this.b();
        return db;
    }
    
    public int g() {
        if (this.g == null) {
            return this.i.size();
        }
        return this.g.a();
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
        return hM.i();
    }
    
    public boolean i() {
        return (0x4 & this.h) == 0x4;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.b().a(dB.class, gt.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.g()) {
            if (!this.a(i).isInitialized()) {
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        if (!this.i() || this.m().isInitialized()) {
            return true;
        }
        return false;
    }
    
    public dB k() {
        return dB.f();
    }
    
    public dh m() {
        if (this.j == null) {
            return this.f;
        }
        return (dh)this.j.b();
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
