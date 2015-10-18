// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.aJ;
import com.google.a8;
import com.google.ch;
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

public final class bQ extends fp implements bl
{
    private hv e;
    private int f;
    private int g;
    private long h;
    private hv i;
    private hv j;
    
    private bQ() {
        this.e = hv.b;
        this.j = hv.b;
        this.i = hv.b;
        this.f();
    }
    
    private bQ(final dg dg) {
        super(dg);
        this.e = hv.b;
        this.j = hv.b;
        this.i = hv.b;
        this.f();
    }
    
    bQ(final dg dg, final j j) {
        this(dg);
    }
    
    private static bQ a() {
        return new bQ();
    }
    
    static bQ c() {
        return a();
    }
    
    private void f() {
        if (aj.e()) {}
    }
    
    public bQ a(final int g) {
        this.f |= 0x1;
        this.g = g;
        this.c();
        return this;
    }
    
    public bQ a(final long h) {
        this.f |= 0x10;
        this.h = h;
        this.c();
        return this;
    }
    
    public bQ a(final cL cl, final fu fu) {
        while (true) {
            try {
                aj aj3;
                Throwable t;
                try {
                    final aj aj = (aj)org.whispersystems.aj.p.parsePartialFrom(cl, fu);
                    if (aj == null) {
                        return this;
                    }
                    try {
                        this.a(aj);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final aj aj2 = (aj)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        aj3 = aj2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (aj3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(aj3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final aj aj3 = null;
                continue;
            }
            break;
        }
    }
    
    public bQ a(final fm fm) {
        try {
            if (fm instanceof aj) {
                return this.a((aj)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public bQ a(final hv j) {
        if (j == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.f |= 0x4;
        this.j = j;
        this.c();
        return this;
    }
    
    public bQ a(final aj p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/aj.j:()Lorg/whispersystems/aj;
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
        //    15: invokevirtual   org/whispersystems/aj.p:()Z
        //    18: ifeq            30
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   org/whispersystems/aj.r:()I
        //    26: invokevirtual   org/whispersystems/bQ.a:(I)Lorg/whispersystems/bQ;
        //    29: pop            
        //    30: aload_1        
        //    31: invokevirtual   org/whispersystems/aj.k:()Z
        //    34: ifeq            46
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokevirtual   org/whispersystems/aj.h:()Lcom/google/hv;
        //    42: invokevirtual   org/whispersystems/bQ.c:(Lcom/google/hv;)Lorg/whispersystems/bQ;
        //    45: pop            
        //    46: aload_1        
        //    47: invokevirtual   org/whispersystems/aj.m:()Z
        //    50: ifeq            62
        //    53: aload_0        
        //    54: aload_1        
        //    55: invokevirtual   org/whispersystems/aj.d:()Lcom/google/hv;
        //    58: invokevirtual   org/whispersystems/bQ.a:(Lcom/google/hv;)Lorg/whispersystems/bQ;
        //    61: pop            
        //    62: aload_1        
        //    63: invokevirtual   org/whispersystems/aj.q:()Z
        //    66: ifeq            78
        //    69: aload_0        
        //    70: aload_1        
        //    71: invokevirtual   org/whispersystems/aj.c:()Lcom/google/hv;
        //    74: invokevirtual   org/whispersystems/bQ.b:(Lcom/google/hv;)Lorg/whispersystems/bQ;
        //    77: pop            
        //    78: aload_1        
        //    79: invokevirtual   org/whispersystems/aj.o:()Z
        //    82: ifeq            94
        //    85: aload_0        
        //    86: aload_1        
        //    87: invokevirtual   org/whispersystems/aj.f:()J
        //    90: invokevirtual   org/whispersystems/bQ.a:(J)Lorg/whispersystems/bQ;
        //    93: pop            
        //    94: aload_0        
        //    95: aload_1        
        //    96: invokevirtual   org/whispersystems/aj.getUnknownFields:()Lcom/google/ce;
        //    99: invokevirtual   org/whispersystems/bQ.b:(Lcom/google/ce;)Lcom/google/fp;
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
    
    public bQ b() {
        return a().a(this.i());
    }
    
    public bQ b(final hv i) {
        if (i == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.f |= 0x8;
        this.i = i;
        this.c();
        return this;
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
        return this.i();
    }
    
    @Override
    public fm buildPartial() {
        return this.i();
    }
    
    public bQ c(final hv e) {
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
    
    @Override
    public fp clear() {
        return this.d();
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
    
    public bQ d() {
        super.clear();
        this.g = 0;
        this.f &= 0xFFFFFFFE;
        this.e = hv.b;
        this.f &= 0xFFFFFFFD;
        this.j = hv.b;
        this.f &= 0xFFFFFFFB;
        this.i = hv.b;
        this.f &= 0xFFFFFFF7;
        this.h = 0L;
        this.f &= 0xFFFFFFEF;
        return this;
    }
    
    public aj g() {
        return aj.j();
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.g();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.g();
    }
    
    @Override
    public com.google.bl getDescriptorForType() {
        return bO.j();
    }
    
    public aj h() {
        final aj i = this.i();
        try {
            if (!i.isInitialized()) {
                throw fx.a(i);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return i;
    }
    
    public aj i() {
        int n = 1;
        final aj aj = new aj(this, null);
        final int f = this.f;
        if ((f & 0x1) != n) {
            n = 0;
        }
        org.whispersystems.aj.b(aj, this.g);
        if ((f & 0x2) == 0x2) {
            n |= 0x2;
        }
        org.whispersystems.aj.b(aj, this.e);
        if ((f & 0x4) == 0x4) {
            n |= 0x4;
        }
        org.whispersystems.aj.c(aj, this.j);
        if ((f & 0x8) == 0x8) {
            n |= 0x8;
        }
        org.whispersystems.aj.a(aj, this.i);
        if ((f & 0x10) == 0x10) {
            n |= 0x10;
        }
        org.whispersystems.aj.a(aj, this.h);
        org.whispersystems.aj.a(aj, n);
        this.b();
        return aj;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.v().a(aj.class, bQ.class);
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
