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

public final class aG extends fp implements bC
{
    private int e;
    private hv f;
    private int g;
    private hv h;
    private hv i;
    private hv j;
    
    private aG() {
        this.i = hv.b;
        this.h = hv.b;
        this.j = hv.b;
        this.f = hv.b;
        this.d();
    }
    
    private aG(final dg dg) {
        super(dg);
        this.i = hv.b;
        this.h = hv.b;
        this.j = hv.b;
        this.f = hv.b;
        this.d();
    }
    
    aG(final dg dg, final U u) {
        this(dg);
    }
    
    private static aG a() {
        return new aG();
    }
    
    private void d() {
        if (aC.a()) {}
    }
    
    static aG h() {
        return a();
    }
    
    public aG a(final int e) {
        this.g |= 0x1;
        this.e = e;
        this.c();
        return this;
    }
    
    public aG a(final cL cl, final fu fu) {
        while (true) {
            try {
                aC ac3;
                Throwable t;
                try {
                    final aC ac = (aC)aC.o.parsePartialFrom(cl, fu);
                    if (ac == null) {
                        return this;
                    }
                    try {
                        this.a(ac);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final aC ac2 = (aC)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        ac3 = ac2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (ac3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(ac3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final aC ac3 = null;
                continue;
            }
            break;
        }
    }
    
    public aG a(final fm fm) {
        try {
            if (fm instanceof aC) {
                return this.a((aC)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public aG a(final hv f) {
        if (f == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x10;
        this.f = f;
        this.c();
        return this;
    }
    
    public aG a(final aC p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/aC.f:()Lorg/whispersystems/aC;
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
        //    15: invokevirtual   org/whispersystems/aC.c:()Z
        //    18: ifeq            30
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   org/whispersystems/aC.g:()I
        //    26: invokevirtual   org/whispersystems/aG.a:(I)Lorg/whispersystems/aG;
        //    29: pop            
        //    30: aload_1        
        //    31: invokevirtual   org/whispersystems/aC.k:()Z
        //    34: ifeq            46
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokevirtual   org/whispersystems/aC.j:()Lcom/google/hv;
        //    42: invokevirtual   org/whispersystems/aG.d:(Lcom/google/hv;)Lorg/whispersystems/aG;
        //    45: pop            
        //    46: aload_1        
        //    47: invokevirtual   org/whispersystems/aC.l:()Z
        //    50: ifeq            62
        //    53: aload_0        
        //    54: aload_1        
        //    55: invokevirtual   org/whispersystems/aC.p:()Lcom/google/hv;
        //    58: invokevirtual   org/whispersystems/aG.b:(Lcom/google/hv;)Lorg/whispersystems/aG;
        //    61: pop            
        //    62: aload_1        
        //    63: invokevirtual   org/whispersystems/aC.q:()Z
        //    66: ifeq            78
        //    69: aload_0        
        //    70: aload_1        
        //    71: invokevirtual   org/whispersystems/aC.d:()Lcom/google/hv;
        //    74: invokevirtual   org/whispersystems/aG.c:(Lcom/google/hv;)Lorg/whispersystems/aG;
        //    77: pop            
        //    78: aload_1        
        //    79: invokevirtual   org/whispersystems/aC.r:()Z
        //    82: ifeq            94
        //    85: aload_0        
        //    86: aload_1        
        //    87: invokevirtual   org/whispersystems/aC.m:()Lcom/google/hv;
        //    90: invokevirtual   org/whispersystems/aG.a:(Lcom/google/hv;)Lorg/whispersystems/aG;
        //    93: pop            
        //    94: aload_0        
        //    95: aload_1        
        //    96: invokevirtual   org/whispersystems/aC.getUnknownFields:()Lcom/google/ce;
        //    99: invokevirtual   org/whispersystems/aG.b:(Lcom/google/ce;)Lcom/google/fp;
        //   102: pop            
        //   103: aload_0        
        //   104: areturn        
        //   105: astore          4
        //   107: aload           4
        //   109: athrow         
        //   110: astore          5
        //   112: aload           5
        //   114: athrow         
        //   115: astore          6
        //   117: aload           6
        //   119: athrow         
        //   120: astore          7
        //   122: aload           7
        //   124: athrow         
        //   125: astore          8
        //   127: aload           8
        //   129: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      11     14     Ljava/lang/NullPointerException;
        //  14     30     105    110    Ljava/lang/NullPointerException;
        //  30     46     110    115    Ljava/lang/NullPointerException;
        //  46     62     115    120    Ljava/lang/NullPointerException;
        //  62     78     120    125    Ljava/lang/NullPointerException;
        //  78     94     125    130    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 72, Size: 72
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
    
    public aC b() {
        int n = 1;
        final aC ac = new aC(this, null);
        final int g = this.g;
        if ((g & 0x1) != n) {
            n = 0;
        }
        aC.a(ac, this.e);
        if ((g & 0x2) == 0x2) {
            n |= 0x2;
        }
        aC.c(ac, this.i);
        if ((g & 0x4) == 0x4) {
            n |= 0x4;
        }
        aC.b(ac, this.h);
        if ((g & 0x8) == 0x8) {
            n |= 0x8;
        }
        aC.a(ac, this.j);
        if ((g & 0x10) == 0x10) {
            n |= 0x10;
        }
        aC.d(ac, this.f);
        aC.b(ac, n);
        this.b();
        return ac;
    }
    
    public aG b(final hv h) {
        if (h == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x4;
        this.h = h;
        this.c();
        return this;
    }
    
    @Override
    public ci build() {
        return this.g();
    }
    
    @Override
    public fm build() {
        return this.g();
    }
    
    @Override
    public ci buildPartial() {
        return this.b();
    }
    
    @Override
    public fm buildPartial() {
        return this.b();
    }
    
    public aG c(final hv j) {
        if (j == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x8;
        this.j = j;
        this.c();
        return this;
    }
    
    @Override
    public fp clear() {
        return this.f();
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
    
    public aG d(final hv i) {
        if (i == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x2;
        this.i = i;
        this.c();
        return this;
    }
    
    public aC e() {
        return aC.f();
    }
    
    public aG f() {
        super.clear();
        this.e = 0;
        this.g &= 0xFFFFFFFE;
        this.i = hv.b;
        this.g &= 0xFFFFFFFD;
        this.h = hv.b;
        this.g &= 0xFFFFFFFB;
        this.j = hv.b;
        this.g &= 0xFFFFFFF7;
        this.f = hv.b;
        this.g &= 0xFFFFFFEF;
        return this;
    }
    
    public aC g() {
        final aC b = this.b();
        try {
            if (!b.isInitialized()) {
                throw fx.a(b);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return b;
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
        return bR.h();
    }
    
    public aG i() {
        return a().a(this.b());
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bR.a().a(aC.class, aG.class);
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
