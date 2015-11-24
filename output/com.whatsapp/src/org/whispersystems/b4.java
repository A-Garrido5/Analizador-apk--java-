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

public final class b4 extends fp implements ab
{
    private int e;
    private hv f;
    private hv g;
    private hv h;
    private int i;
    private hv j;
    private hv k;
    private hv l;
    
    private b4() {
        this.h = hv.b;
        this.l = hv.b;
        this.g = hv.b;
        this.k = hv.b;
        this.f = hv.b;
        this.j = hv.b;
        this.d();
    }
    
    private b4(final dg dg) {
        super(dg);
        this.h = hv.b;
        this.l = hv.b;
        this.g = hv.b;
        this.k = hv.b;
        this.f = hv.b;
        this.j = hv.b;
        this.d();
    }
    
    b4(final dg dg, final j j) {
        this(dg);
    }
    
    private static b4 a() {
        return new b4();
    }
    
    private void d() {
        if (aD.i()) {}
    }
    
    static b4 h() {
        return a();
    }
    
    public b4 a(final int e) {
        this.i |= 0x1;
        this.e = e;
        this.c();
        return this;
    }
    
    public b4 a(final cL cl, final fu fu) {
        while (true) {
            try {
                aD ad3;
                Throwable t;
                try {
                    final aD ad = (aD)aD.h.parsePartialFrom(cl, fu);
                    if (ad == null) {
                        return this;
                    }
                    try {
                        this.a(ad);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final aD ad2 = (aD)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        ad3 = ad2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (ad3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(ad3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final aD ad3 = null;
                continue;
            }
            break;
        }
    }
    
    public b4 a(final fm fm) {
        try {
            if (fm instanceof aD) {
                return this.a((aD)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public b4 a(final hv l) {
        if (l == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.i |= 0x4;
        this.l = l;
        this.c();
        return this;
    }
    
    public b4 a(final aD p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/aD.d:()Lorg/whispersystems/aD;
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
        //    15: invokevirtual   org/whispersystems/aD.n:()Z
        //    18: ifeq            30
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   org/whispersystems/aD.l:()I
        //    26: invokevirtual   org/whispersystems/b4.a:(I)Lorg/whispersystems/b4;
        //    29: pop            
        //    30: aload_1        
        //    31: invokevirtual   org/whispersystems/aD.t:()Z
        //    34: ifeq            46
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokevirtual   org/whispersystems/aD.q:()Lcom/google/hv;
        //    42: invokevirtual   org/whispersystems/b4.d:(Lcom/google/hv;)Lorg/whispersystems/b4;
        //    45: pop            
        //    46: aload_1        
        //    47: invokevirtual   org/whispersystems/aD.a:()Z
        //    50: ifeq            62
        //    53: aload_0        
        //    54: aload_1        
        //    55: invokevirtual   org/whispersystems/aD.f:()Lcom/google/hv;
        //    58: invokevirtual   org/whispersystems/b4.a:(Lcom/google/hv;)Lorg/whispersystems/b4;
        //    61: pop            
        //    62: aload_1        
        //    63: invokevirtual   org/whispersystems/aD.p:()Z
        //    66: ifeq            78
        //    69: aload_0        
        //    70: aload_1        
        //    71: invokevirtual   org/whispersystems/aD.g:()Lcom/google/hv;
        //    74: invokevirtual   org/whispersystems/b4.f:(Lcom/google/hv;)Lorg/whispersystems/b4;
        //    77: pop            
        //    78: aload_1        
        //    79: invokevirtual   org/whispersystems/aD.j:()Z
        //    82: ifeq            94
        //    85: aload_0        
        //    86: aload_1        
        //    87: invokevirtual   org/whispersystems/aD.v:()Lcom/google/hv;
        //    90: invokevirtual   org/whispersystems/b4.e:(Lcom/google/hv;)Lorg/whispersystems/b4;
        //    93: pop            
        //    94: aload_1        
        //    95: invokevirtual   org/whispersystems/aD.k:()Z
        //    98: ifeq            110
        //   101: aload_0        
        //   102: aload_1        
        //   103: invokevirtual   org/whispersystems/aD.o:()Lcom/google/hv;
        //   106: invokevirtual   org/whispersystems/b4.b:(Lcom/google/hv;)Lorg/whispersystems/b4;
        //   109: pop            
        //   110: aload_1        
        //   111: invokevirtual   org/whispersystems/aD.e:()Z
        //   114: ifeq            126
        //   117: aload_0        
        //   118: aload_1        
        //   119: invokevirtual   org/whispersystems/aD.c:()Lcom/google/hv;
        //   122: invokevirtual   org/whispersystems/b4.c:(Lcom/google/hv;)Lorg/whispersystems/b4;
        //   125: pop            
        //   126: aload_0        
        //   127: aload_1        
        //   128: invokevirtual   org/whispersystems/aD.getUnknownFields:()Lcom/google/ce;
        //   131: invokevirtual   org/whispersystems/b4.b:(Lcom/google/ce;)Lcom/google/fp;
        //   134: pop            
        //   135: aload_0        
        //   136: areturn        
        //   137: astore          4
        //   139: aload           4
        //   141: athrow         
        //   142: astore          5
        //   144: aload           5
        //   146: athrow         
        //   147: astore          6
        //   149: aload           6
        //   151: athrow         
        //   152: astore          7
        //   154: aload           7
        //   156: athrow         
        //   157: astore          8
        //   159: aload           8
        //   161: athrow         
        //   162: astore          9
        //   164: aload           9
        //   166: athrow         
        //   167: astore          10
        //   169: aload           10
        //   171: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      11     14     Ljava/lang/NullPointerException;
        //  14     30     137    142    Ljava/lang/NullPointerException;
        //  30     46     142    147    Ljava/lang/NullPointerException;
        //  46     62     147    152    Ljava/lang/NullPointerException;
        //  62     78     152    157    Ljava/lang/NullPointerException;
        //  78     94     157    162    Ljava/lang/NullPointerException;
        //  94     110    162    167    Ljava/lang/NullPointerException;
        //  110    126    167    172    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 94, Size: 94
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
    
    public b4 b(final hv f) {
        if (f == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.i |= 0x20;
        this.f = f;
        this.c();
        return this;
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
    
    public b4 c(final hv j) {
        if (j == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.i |= 0x40;
        this.j = j;
        this.c();
        return this;
    }
    
    @Override
    public fp clear() {
        return this.g();
    }
    
    @Override
    public fE clone() {
        return this.j();
    }
    
    @Override
    public fp clone() {
        return this.j();
    }
    
    @Override
    public fx clone() {
        return this.j();
    }
    
    @Override
    public Object clone() {
        return this.j();
    }
    
    public b4 d(final hv h) {
        if (h == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.i |= 0x2;
        this.h = h;
        this.c();
        return this;
    }
    
    public aD e() {
        final aD f = this.f();
        try {
            if (!f.isInitialized()) {
                throw fx.a(f);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return f;
    }
    
    public b4 e(final hv k) {
        if (k == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.i |= 0x10;
        this.k = k;
        this.c();
        return this;
    }
    
    public aD f() {
        int n = 1;
        final aD ad = new aD(this, null);
        final int i = this.i;
        if ((i & 0x1) != n) {
            n = 0;
        }
        aD.a(ad, this.e);
        if ((i & 0x2) == 0x2) {
            n |= 0x2;
        }
        aD.b(ad, this.h);
        if ((i & 0x4) == 0x4) {
            n |= 0x4;
        }
        aD.c(ad, this.l);
        if ((i & 0x8) == 0x8) {
            n |= 0x8;
        }
        aD.f(ad, this.g);
        if ((i & 0x10) == 0x10) {
            n |= 0x10;
        }
        aD.a(ad, this.k);
        if ((i & 0x20) == 0x20) {
            n |= 0x20;
        }
        aD.d(ad, this.f);
        if ((i & 0x40) == 0x40) {
            n |= 0x40;
        }
        aD.e(ad, this.j);
        aD.b(ad, n);
        this.b();
        return ad;
    }
    
    public b4 f(final hv g) {
        if (g == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.i |= 0x8;
        this.g = g;
        this.c();
        return this;
    }
    
    public b4 g() {
        super.clear();
        this.e = 0;
        this.i &= 0xFFFFFFFE;
        this.h = hv.b;
        this.i &= 0xFFFFFFFD;
        this.l = hv.b;
        this.i &= 0xFFFFFFFB;
        this.g = hv.b;
        this.i &= 0xFFFFFFF7;
        this.k = hv.b;
        this.i &= 0xFFFFFFEF;
        this.f = hv.b;
        this.i &= 0xFFFFFFDF;
        this.j = hv.b;
        this.i &= 0xFFFFFFBF;
        return this;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.i();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.i();
    }
    
    @Override
    public bl getDescriptorForType() {
        return bO.e();
    }
    
    public aD i() {
        return aD.d();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.z().a(aD.class, b4.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return true;
    }
    
    public b4 j() {
        return a().a(this.f());
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
