// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.a8;
import com.google.ch;
import com.google.bl;
import com.google.fE;
import com.google.ci;
import com.google.fx;
import com.google.fm;
import com.google.bg;
import com.google.fu;
import com.google.cL;
import com.google.dg;
import com.google.hv;
import com.google.fp;

public final class aJ extends fp implements Y
{
    private hv e;
    private int f;
    private int g;
    private int h;
    private int i;
    private hv j;
    private hv k;
    
    private aJ() {
        this.e = hv.b;
        this.j = hv.b;
        this.k = hv.b;
        this.d();
    }
    
    private aJ(final dg dg) {
        super(dg);
        this.e = hv.b;
        this.j = hv.b;
        this.k = hv.b;
        this.d();
    }
    
    aJ(final dg dg, final U u) {
        this(dg);
    }
    
    private void d() {
        if (aO.e()) {}
    }
    
    static aJ e() {
        return f();
    }
    
    private static aJ f() {
        return new aJ();
    }
    
    public aJ a(final int f) {
        this.g |= 0x1;
        this.f = f;
        this.c();
        return this;
    }
    
    public aJ a(final cL cl, final fu fu) {
        while (true) {
            try {
                aO ao3;
                Throwable t;
                try {
                    final aO ao = (aO)aO.s.parsePartialFrom(cl, fu);
                    if (ao == null) {
                        return this;
                    }
                    try {
                        this.a(ao);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final aO ao2 = (aO)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        ao3 = ao2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (ao3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(ao3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final aO ao3 = null;
                continue;
            }
            break;
        }
    }
    
    public aJ a(final fm fm) {
        try {
            if (fm instanceof aO) {
                return this.a((aO)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public aJ a(final hv k) {
        if (k == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x20;
        this.k = k;
        this.c();
        return this;
    }
    
    public aJ a(final aO p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/aO.c:()Lorg/whispersystems/aO;
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
        //    15: invokevirtual   org/whispersystems/aO.p:()Z
        //    18: ifeq            30
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   org/whispersystems/aO.m:()I
        //    26: invokevirtual   org/whispersystems/aJ.a:(I)Lorg/whispersystems/aJ;
        //    29: pop            
        //    30: aload_1        
        //    31: invokevirtual   org/whispersystems/aO.d:()Z
        //    34: ifeq            46
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokevirtual   org/whispersystems/aO.h:()I
        //    42: invokevirtual   org/whispersystems/aJ.b:(I)Lorg/whispersystems/aJ;
        //    45: pop            
        //    46: aload_1        
        //    47: invokevirtual   org/whispersystems/aO.q:()Z
        //    50: ifeq            62
        //    53: aload_0        
        //    54: aload_1        
        //    55: invokevirtual   org/whispersystems/aO.b:()I
        //    58: invokevirtual   org/whispersystems/aJ.c:(I)Lorg/whispersystems/aJ;
        //    61: pop            
        //    62: aload_1        
        //    63: invokevirtual   org/whispersystems/aO.t:()Z
        //    66: ifeq            78
        //    69: aload_0        
        //    70: aload_1        
        //    71: invokevirtual   org/whispersystems/aO.f:()Lcom/google/hv;
        //    74: invokevirtual   org/whispersystems/aJ.c:(Lcom/google/hv;)Lorg/whispersystems/aJ;
        //    77: pop            
        //    78: aload_1        
        //    79: invokevirtual   org/whispersystems/aO.i:()Z
        //    82: ifeq            94
        //    85: aload_0        
        //    86: aload_1        
        //    87: invokevirtual   org/whispersystems/aO.s:()Lcom/google/hv;
        //    90: invokevirtual   org/whispersystems/aJ.b:(Lcom/google/hv;)Lorg/whispersystems/aJ;
        //    93: pop            
        //    94: aload_1        
        //    95: invokevirtual   org/whispersystems/aO.j:()Z
        //    98: ifeq            110
        //   101: aload_0        
        //   102: aload_1        
        //   103: invokevirtual   org/whispersystems/aO.g:()Lcom/google/hv;
        //   106: invokevirtual   org/whispersystems/aJ.a:(Lcom/google/hv;)Lorg/whispersystems/aJ;
        //   109: pop            
        //   110: aload_0        
        //   111: aload_1        
        //   112: invokevirtual   org/whispersystems/aO.getUnknownFields:()Lcom/google/ce;
        //   115: invokevirtual   org/whispersystems/aJ.b:(Lcom/google/ce;)Lcom/google/fp;
        //   118: pop            
        //   119: aload_0        
        //   120: areturn        
        //   121: astore          4
        //   123: aload           4
        //   125: athrow         
        //   126: astore          5
        //   128: aload           5
        //   130: athrow         
        //   131: astore          6
        //   133: aload           6
        //   135: athrow         
        //   136: astore          7
        //   138: aload           7
        //   140: athrow         
        //   141: astore          8
        //   143: aload           8
        //   145: athrow         
        //   146: astore          9
        //   148: aload           9
        //   150: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      11     14     Ljava/lang/NullPointerException;
        //  14     30     121    126    Ljava/lang/NullPointerException;
        //  30     46     126    131    Ljava/lang/NullPointerException;
        //  46     62     131    136    Ljava/lang/NullPointerException;
        //  62     78     136    141    Ljava/lang/NullPointerException;
        //  78     94     141    146    Ljava/lang/NullPointerException;
        //  94     110    146    151    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 83, Size: 83
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
    
    public aO a() {
        return aO.c();
    }
    
    public aJ b(final int i) {
        this.g |= 0x2;
        this.i = i;
        this.c();
        return this;
    }
    
    public aJ b(final hv j) {
        if (j == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x10;
        this.j = j;
        this.c();
        return this;
    }
    
    public aO b() {
        final aO c = this.c();
        try {
            if (!c.isInitialized()) {
                throw fx.a(c);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return c;
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
        return this.c();
    }
    
    @Override
    public fm buildPartial() {
        return this.c();
    }
    
    public aJ c(final int h) {
        this.g |= 0x4;
        this.h = h;
        this.c();
        return this;
    }
    
    public aJ c(final hv e) {
        if (e == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x8;
        this.e = e;
        this.c();
        return this;
    }
    
    public aO c() {
        int n = 1;
        final aO ao = new aO(this, null);
        final int g = this.g;
        if ((g & 0x1) != n) {
            n = 0;
        }
        aO.a(ao, this.f);
        if ((g & 0x2) == 0x2) {
            n |= 0x2;
        }
        aO.d(ao, this.i);
        if ((g & 0x4) == 0x4) {
            n |= 0x4;
        }
        aO.b(ao, this.h);
        if ((g & 0x8) == 0x8) {
            n |= 0x8;
        }
        aO.b(ao, this.e);
        if ((g & 0x10) == 0x10) {
            n |= 0x10;
        }
        aO.a(ao, this.j);
        if ((g & 0x20) == 0x20) {
            n |= 0x20;
        }
        aO.c(ao, this.k);
        aO.c(ao, n);
        this.b();
        return ao;
    }
    
    @Override
    public fp clear() {
        return this.h();
    }
    
    @Override
    public fE clone() {
        return this.g();
    }
    
    @Override
    public fp clone() {
        return this.g();
    }
    
    @Override
    public fx clone() {
        return this.g();
    }
    
    @Override
    public Object clone() {
        return this.g();
    }
    
    public aJ g() {
        return f().a(this.c());
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.a();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.a();
    }
    
    @Override
    public bl getDescriptorForType() {
        return bR.c();
    }
    
    public aJ h() {
        super.clear();
        this.f = 0;
        this.g &= 0xFFFFFFFE;
        this.i = 0;
        this.g &= 0xFFFFFFFD;
        this.h = 0;
        this.g &= 0xFFFFFFFB;
        this.e = hv.b;
        this.g &= 0xFFFFFFF7;
        this.j = hv.b;
        this.g &= 0xFFFFFFEF;
        this.k = hv.b;
        this.g &= 0xFFFFFFDF;
        return this;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bR.e().a(aO.class, aJ.class);
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
    public com.google.aJ mergeFrom(final cL cl, final fu fu) {
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
