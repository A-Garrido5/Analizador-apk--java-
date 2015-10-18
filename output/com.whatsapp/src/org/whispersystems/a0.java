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

public final class a0 extends fp implements aw
{
    private int e;
    private hv f;
    private int g;
    
    private a0() {
        this.f = hv.b;
        this.f();
    }
    
    private a0(final dg dg) {
        super(dg);
        this.f = hv.b;
        this.f();
    }
    
    a0(final dg dg, final j j) {
        this(dg);
    }
    
    private static a0 b() {
        return new a0();
    }
    
    private void f() {
        if (aa.c()) {}
    }
    
    static a0 g() {
        return b();
    }
    
    public a0 a(final int e) {
        this.g |= 0x1;
        this.e = e;
        this.c();
        return this;
    }
    
    public a0 a(final cL cl, final fu fu) {
        while (true) {
            try {
                aa aa3;
                Throwable t;
                try {
                    final aa aa = (aa)org.whispersystems.aa.PARSER.parsePartialFrom(cl, fu);
                    if (aa == null) {
                        return this;
                    }
                    try {
                        this.a(aa);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final aa aa2 = (aa)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        aa3 = aa2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (aa3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(aa3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final aa aa3 = null;
                continue;
            }
            break;
        }
    }
    
    public a0 a(final fm fm) {
        try {
            if (fm instanceof aa) {
                return this.a((aa)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public a0 a(final hv f) {
        if (f == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x2;
        this.f = f;
        this.c();
        return this;
    }
    
    public a0 a(final aa p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/aa.i:()Lorg/whispersystems/aa;
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
        //    15: invokevirtual   org/whispersystems/aa.f:()Z
        //    18: ifeq            30
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   org/whispersystems/aa.b:()I
        //    26: invokevirtual   org/whispersystems/a0.a:(I)Lorg/whispersystems/a0;
        //    29: pop            
        //    30: aload_1        
        //    31: invokevirtual   org/whispersystems/aa.l:()Z
        //    34: ifeq            46
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokevirtual   org/whispersystems/aa.k:()Lcom/google/hv;
        //    42: invokevirtual   org/whispersystems/a0.a:(Lcom/google/hv;)Lorg/whispersystems/a0;
        //    45: pop            
        //    46: aload_0        
        //    47: aload_1        
        //    48: invokevirtual   org/whispersystems/aa.getUnknownFields:()Lcom/google/ce;
        //    51: invokevirtual   org/whispersystems/a0.b:(Lcom/google/ce;)Lcom/google/fp;
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
    
    public aa a() {
        int n = 1;
        final aa aa = new aa(this, null);
        final int g = this.g;
        if ((g & 0x1) != n) {
            n = 0;
        }
        org.whispersystems.aa.a(aa, this.e);
        if ((g & 0x2) == 0x2) {
            n |= 0x2;
        }
        org.whispersystems.aa.a(aa, this.f);
        org.whispersystems.aa.b(aa, n);
        this.b();
        return aa;
    }
    
    @Override
    public ci build() {
        return this.d();
    }
    
    @Override
    public fm build() {
        return this.d();
    }
    
    @Override
    public ci buildPartial() {
        return this.a();
    }
    
    @Override
    public fm buildPartial() {
        return this.a();
    }
    
    public a0 c() {
        super.clear();
        this.e = 0;
        this.g &= 0xFFFFFFFE;
        this.f = hv.b;
        this.g &= 0xFFFFFFFD;
        return this;
    }
    
    @Override
    public fp clear() {
        return this.c();
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
    
    public aa d() {
        final aa a = this.a();
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
    public ci getDefaultInstanceForType() {
        return this.h();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.h();
    }
    
    @Override
    public bl getDescriptorForType() {
        return bO.b();
    }
    
    public aa h() {
        return aa.i();
    }
    
    public a0 i() {
        return b().a(this.a());
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.o().a(aa.class, a0.class);
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
