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
import com.google.dg;
import com.google.hv;
import com.google.fp;

public final class a1 extends fp implements bc
{
    private hv e;
    private int f;
    private hv g;
    
    private a1() {
        this.g = hv.b;
        this.e = hv.b;
        this.d();
    }
    
    private a1(final dg dg) {
        super(dg);
        this.g = hv.b;
        this.e = hv.b;
        this.d();
    }
    
    a1(final dg dg, final j j) {
        this(dg);
    }
    
    private void d() {
        if (aR.f()) {}
    }
    
    static a1 g() {
        return h();
    }
    
    private static a1 h() {
        return new a1();
    }
    
    public a1 a(final cL cl, final fu fu) {
        while (true) {
            try {
                aR ar3;
                Throwable t;
                try {
                    final aR ar = (aR)aR.m.parsePartialFrom(cl, fu);
                    if (ar == null) {
                        return this;
                    }
                    try {
                        this.a(ar);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final aR ar2 = (aR)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        ar3 = ar2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (ar3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(ar3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final aR ar3 = null;
                continue;
            }
            break;
        }
    }
    
    public a1 a(final fm fm) {
        try {
            if (fm instanceof aR) {
                return this.a((aR)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public a1 a(final hv e) {
        if (e == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.f |= 0x2;
        this.e = e;
        this.c();
        return this;
    }
    
    public a1 a(final aR p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/aR.c:()Lorg/whispersystems/aR;
        //     3: astore_3       
        //     4: aload_1        
        //     5: aload_3        
        //     6: if_acmpne       14
        //     9: aload_0        
        //    10: areturn        
        //    11: astore_2       
        //    12: aload_2        
        //    13: athrow         
        //    14: aload_1        
        //    15: invokevirtual   org/whispersystems/aR.g:()Z
        //    18: ifeq            30
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   org/whispersystems/aR.j:()Lcom/google/hv;
        //    26: invokevirtual   org/whispersystems/a1.b:(Lcom/google/hv;)Lorg/whispersystems/a1;
        //    29: pop            
        //    30: aload_1        
        //    31: invokevirtual   org/whispersystems/aR.h:()Z
        //    34: ifeq            46
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokevirtual   org/whispersystems/aR.d:()Lcom/google/hv;
        //    42: invokevirtual   org/whispersystems/a1.a:(Lcom/google/hv;)Lorg/whispersystems/a1;
        //    45: pop            
        //    46: aload_0        
        //    47: aload_1        
        //    48: invokevirtual   org/whispersystems/aR.getUnknownFields:()Lcom/google/ce;
        //    51: invokevirtual   org/whispersystems/a1.b:(Lcom/google/ce;)Lcom/google/fp;
        //    54: pop            
        //    55: aload_0        
        //    56: areturn        
        //    57: astore          4
        //    59: aload           4
        //    61: athrow         
        //    62: astore          5
        //    64: aload           5
        //    66: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      11     14     Ljava/lang/NullPointerException;
        //  14     30     57     62     Ljava/lang/NullPointerException;
        //  30     46     62     67     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    public aR a() {
        int n = 1;
        final aR ar = new aR(this, null);
        final int f = this.f;
        if ((f & 0x1) != n) {
            n = 0;
        }
        aR.b(ar, this.g);
        if ((f & 0x2) == 0x2) {
            n |= 0x2;
        }
        aR.a(ar, this.e);
        aR.a(ar, n);
        this.b();
        return ar;
    }
    
    public a1 b() {
        return h().a(this.a());
    }
    
    public a1 b(final hv g) {
        if (g == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.f |= 0x1;
        this.g = g;
        this.c();
        return this;
    }
    
    @Override
    public ci build() {
        return this.i();
    }
    
    @Override
    public fm build() {
        return this.i();
    }
    
    @Override
    public ci buildPartial() {
        return this.a();
    }
    
    @Override
    public fm buildPartial() {
        return this.a();
    }
    
    @Override
    public fp clear() {
        return this.f();
    }
    
    @Override
    public fE clone() {
        return this.b();
    }
    
    @Override
    public fp clone() {
        return this.b();
    }
    
    @Override
    public fx clone() {
        return this.b();
    }
    
    @Override
    public Object clone() {
        return this.b();
    }
    
    public aR e() {
        return aR.c();
    }
    
    public a1 f() {
        super.clear();
        this.g = hv.b;
        this.f &= 0xFFFFFFFE;
        this.e = hv.b;
        this.f &= 0xFFFFFFFD;
        return this;
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
        return bO.n();
    }
    
    public aR i() {
        final aR a = this.a();
        try {
            if (!a.isInitialized()) {
                throw fx.a(a);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return a;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.g().a(aR.class, a1.class);
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
