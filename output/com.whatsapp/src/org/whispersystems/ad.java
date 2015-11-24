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

public final class ad extends fp implements h
{
    private int e;
    private int f;
    private hv g;
    private hv h;
    private int i;
    
    private ad() {
        this.g = hv.b;
        this.h = hv.b;
        this.f();
    }
    
    private ad(final dg dg) {
        super(dg);
        this.g = hv.b;
        this.h = hv.b;
        this.f();
    }
    
    ad(final dg dg, final U u) {
        this(dg);
    }
    
    private static ad b() {
        return new ad();
    }
    
    private void f() {
        if (aB.e()) {}
    }
    
    static ad g() {
        return b();
    }
    
    public ad a() {
        super.clear();
        this.g = hv.b;
        this.e &= 0xFFFFFFFE;
        this.f = 0;
        this.e &= 0xFFFFFFFD;
        this.i = 0;
        this.e &= 0xFFFFFFFB;
        this.h = hv.b;
        this.e &= 0xFFFFFFF7;
        return this;
    }
    
    public ad a(final int i) {
        this.e |= 0x4;
        this.i = i;
        this.c();
        return this;
    }
    
    public ad a(final cL cl, final fu fu) {
        while (true) {
            try {
                aB ab3;
                Throwable t;
                try {
                    final aB ab = (aB)aB.g.parsePartialFrom(cl, fu);
                    if (ab == null) {
                        return this;
                    }
                    try {
                        this.a(ab);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final aB ab2 = (aB)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        ab3 = ab2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (ab3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(ab3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final aB ab3 = null;
                continue;
            }
            break;
        }
    }
    
    public ad a(final fm fm) {
        try {
            if (fm instanceof aB) {
                return this.a((aB)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public ad a(final hv h) {
        if (h == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.e |= 0x8;
        this.h = h;
        this.c();
        return this;
    }
    
    public ad a(final aB p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/aB.h:()Lorg/whispersystems/aB;
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
        //    15: invokevirtual   org/whispersystems/aB.m:()Z
        //    18: ifeq            30
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   org/whispersystems/aB.f:()Lcom/google/hv;
        //    26: invokevirtual   org/whispersystems/ad.b:(Lcom/google/hv;)Lorg/whispersystems/ad;
        //    29: pop            
        //    30: aload_1        
        //    31: invokevirtual   org/whispersystems/aB.d:()Z
        //    34: ifeq            46
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokevirtual   org/whispersystems/aB.q:()I
        //    42: invokevirtual   org/whispersystems/ad.b:(I)Lorg/whispersystems/ad;
        //    45: pop            
        //    46: aload_1        
        //    47: invokevirtual   org/whispersystems/aB.a:()Z
        //    50: ifeq            62
        //    53: aload_0        
        //    54: aload_1        
        //    55: invokevirtual   org/whispersystems/aB.i:()I
        //    58: invokevirtual   org/whispersystems/ad.a:(I)Lorg/whispersystems/ad;
        //    61: pop            
        //    62: aload_1        
        //    63: invokevirtual   org/whispersystems/aB.n:()Z
        //    66: ifeq            78
        //    69: aload_0        
        //    70: aload_1        
        //    71: invokevirtual   org/whispersystems/aB.c:()Lcom/google/hv;
        //    74: invokevirtual   org/whispersystems/ad.a:(Lcom/google/hv;)Lorg/whispersystems/ad;
        //    77: pop            
        //    78: aload_0        
        //    79: aload_1        
        //    80: invokevirtual   org/whispersystems/aB.getUnknownFields:()Lcom/google/ce;
        //    83: invokevirtual   org/whispersystems/ad.b:(Lcom/google/ce;)Lcom/google/fp;
        //    86: pop            
        //    87: aload_0        
        //    88: areturn        
        //    89: astore          4
        //    91: aload           4
        //    93: athrow         
        //    94: astore          5
        //    96: aload           5
        //    98: athrow         
        //    99: astore          6
        //   101: aload           6
        //   103: athrow         
        //   104: astore          7
        //   106: aload           7
        //   108: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      11     14     Ljava/lang/NullPointerException;
        //  14     30     89     94     Ljava/lang/NullPointerException;
        //  30     46     94     99     Ljava/lang/NullPointerException;
        //  46     62     99     104    Ljava/lang/NullPointerException;
        //  62     78     104    109    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 61, Size: 61
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
    
    public ad b(final int f) {
        this.e |= 0x2;
        this.f = f;
        this.c();
        return this;
    }
    
    public ad b(final hv g) {
        if (g == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.e |= 0x1;
        this.g = g;
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
        return this.c();
    }
    
    @Override
    public fm buildPartial() {
        return this.c();
    }
    
    public aB c() {
        int n = 1;
        final aB ab = new aB(this, null);
        final int e = this.e;
        if ((e & 0x1) != n) {
            n = 0;
        }
        aB.b(ab, this.g);
        if ((e & 0x2) == 0x2) {
            n |= 0x2;
        }
        aB.a(ab, this.f);
        if ((e & 0x4) == 0x4) {
            n |= 0x4;
        }
        aB.b(ab, this.i);
        if ((e & 0x8) == 0x8) {
            n |= 0x8;
        }
        aB.a(ab, this.h);
        aB.c(ab, n);
        this.b();
        return ab;
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
    
    public ad d() {
        return b().a(this.c());
    }
    
    public aB e() {
        return aB.h();
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
        return bR.d();
    }
    
    public aB h() {
        final aB c = this.c();
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
    protected ch internalGetFieldAccessorTable() {
        return bR.b().a(aB.class, ad.class);
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
