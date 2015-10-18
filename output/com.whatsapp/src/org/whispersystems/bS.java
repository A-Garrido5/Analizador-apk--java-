// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.aJ;
import com.google.a8;
import com.google.ch;
import com.google.bl;
import com.google.fE;
import com.google.fx;
import com.google.ci;
import com.google.fm;
import com.google.bg;
import com.google.fu;
import com.google.cL;
import com.google.dg;
import com.google.hv;
import com.google.fp;

public final class bS extends fp implements N
{
    private int e;
    private int f;
    private int g;
    private hv h;
    
    private bS() {
        this.h = hv.b;
        this.f();
    }
    
    private bS(final dg dg) {
        super(dg);
        this.h = hv.b;
        this.f();
    }
    
    bS(final dg dg, final j j) {
        this(dg);
    }
    
    static bS a() {
        return h();
    }
    
    private void f() {
        if (av.d()) {}
    }
    
    private static bS h() {
        return new bS();
    }
    
    public bS a(final int f) {
        this.g |= 0x1;
        this.f = f;
        this.c();
        return this;
    }
    
    public bS a(final cL cl, final fu fu) {
        while (true) {
            try {
                av av3;
                Throwable t;
                try {
                    final av av = (av)org.whispersystems.av.PARSER.parsePartialFrom(cl, fu);
                    if (av == null) {
                        return this;
                    }
                    try {
                        this.a(av);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final av av2 = (av)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        av3 = av2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (av3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(av3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final av av3 = null;
                continue;
            }
            break;
        }
    }
    
    public bS a(final fm fm) {
        try {
            if (fm instanceof av) {
                return this.a((av)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public bS a(final hv h) {
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
    
    public bS a(final av p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/av.c:()Lorg/whispersystems/av;
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
        //    15: invokevirtual   org/whispersystems/av.m:()Z
        //    18: ifeq            30
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   org/whispersystems/av.l:()I
        //    26: invokevirtual   org/whispersystems/bS.a:(I)Lorg/whispersystems/bS;
        //    29: pop            
        //    30: aload_1        
        //    31: invokevirtual   org/whispersystems/av.j:()Z
        //    34: ifeq            46
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokevirtual   org/whispersystems/av.i:()I
        //    42: invokevirtual   org/whispersystems/bS.b:(I)Lorg/whispersystems/bS;
        //    45: pop            
        //    46: aload_1        
        //    47: invokevirtual   org/whispersystems/av.h:()Z
        //    50: ifeq            62
        //    53: aload_0        
        //    54: aload_1        
        //    55: invokevirtual   org/whispersystems/av.f:()Lcom/google/hv;
        //    58: invokevirtual   org/whispersystems/bS.a:(Lcom/google/hv;)Lorg/whispersystems/bS;
        //    61: pop            
        //    62: aload_0        
        //    63: aload_1        
        //    64: invokevirtual   org/whispersystems/av.getUnknownFields:()Lcom/google/ce;
        //    67: invokevirtual   org/whispersystems/bS.b:(Lcom/google/ce;)Lcom/google/fp;
        //    70: pop            
        //    71: aload_0        
        //    72: areturn        
        //    73: astore          4
        //    75: aload           4
        //    77: athrow         
        //    78: astore          5
        //    80: aload           5
        //    82: athrow         
        //    83: astore          6
        //    85: aload           6
        //    87: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      11     14     Ljava/lang/NullPointerException;
        //  14     30     73     78     Ljava/lang/NullPointerException;
        //  30     46     78     83     Ljava/lang/NullPointerException;
        //  46     62     83     88     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 50, Size: 50
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
    
    public av b() {
        return av.c();
    }
    
    public bS b(final int e) {
        this.g |= 0x2;
        this.e = e;
        this.c();
        return this;
    }
    
    @Override
    public ci build() {
        return this.c();
    }
    
    @Override
    public fm build() {
        return this.c();
    }
    
    @Override
    public ci buildPartial() {
        return this.g();
    }
    
    @Override
    public fm buildPartial() {
        return this.g();
    }
    
    public av c() {
        final av g = this.g();
        try {
            if (!g.isInitialized()) {
                throw fx.a(g);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return g;
    }
    
    @Override
    public fp clear() {
        return this.i();
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
    
    public bS d() {
        return h().a(this.g());
    }
    
    public av g() {
        int n = 1;
        final av av = new av(this, null);
        final int g = this.g;
        if ((g & 0x1) != n) {
            n = 0;
        }
        org.whispersystems.av.a(av, this.f);
        if ((g & 0x2) == 0x2) {
            n |= 0x2;
        }
        org.whispersystems.av.c(av, this.e);
        if ((g & 0x4) == 0x4) {
            n |= 0x4;
        }
        org.whispersystems.av.a(av, this.h);
        org.whispersystems.av.b(av, n);
        this.b();
        return av;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.b();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.b();
    }
    
    @Override
    public bl getDescriptorForType() {
        return bO.D();
    }
    
    public bS i() {
        super.clear();
        this.f = 0;
        this.g &= 0xFFFFFFFE;
        this.e = 0;
        this.g &= 0xFFFFFFFD;
        this.h = hv.b;
        this.g &= 0xFFFFFFFB;
        return this;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.q().a(av.class, bS.class);
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
