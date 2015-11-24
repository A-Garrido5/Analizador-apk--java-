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

public final class bt extends fp implements e
{
    private int e;
    private int f;
    private hv g;
    private hv h;
    private hv i;
    
    private bt() {
        this.g = hv.b;
        this.i = hv.b;
        this.h = hv.b;
        this.a();
    }
    
    private bt(final dg dg) {
        super(dg);
        this.g = hv.b;
        this.i = hv.b;
        this.h = hv.b;
        this.a();
    }
    
    bt(final dg dg, final j j) {
        this(dg);
    }
    
    private void a() {
        if (ah.i()) {}
    }
    
    private static bt d() {
        return new bt();
    }
    
    static bt g() {
        return d();
    }
    
    public bt a(final int e) {
        this.f |= 0x1;
        this.e = e;
        this.c();
        return this;
    }
    
    public bt a(final cL cl, final fu fu) {
        while (true) {
            try {
                ah ah3;
                Throwable t;
                try {
                    final ah ah = (ah)org.whispersystems.ah.PARSER.parsePartialFrom(cl, fu);
                    if (ah == null) {
                        return this;
                    }
                    try {
                        this.a(ah);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final ah ah2 = (ah)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        ah3 = ah2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (ah3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(ah3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final ah ah3 = null;
                continue;
            }
            break;
        }
    }
    
    public bt a(final fm fm) {
        try {
            if (fm instanceof ah) {
                return this.a((ah)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public bt a(final hv i) {
        if (i == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.f |= 0x4;
        this.i = i;
        this.c();
        return this;
    }
    
    public bt a(final ah p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/ah.l:()Lorg/whispersystems/ah;
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
        //    15: invokevirtual   org/whispersystems/ah.q:()Z
        //    18: ifeq            30
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   org/whispersystems/ah.k:()I
        //    26: invokevirtual   org/whispersystems/bt.a:(I)Lorg/whispersystems/bt;
        //    29: pop            
        //    30: aload_1        
        //    31: invokevirtual   org/whispersystems/ah.f:()Z
        //    34: ifeq            46
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokevirtual   org/whispersystems/ah.h:()Lcom/google/hv;
        //    42: invokevirtual   org/whispersystems/bt.c:(Lcom/google/hv;)Lorg/whispersystems/bt;
        //    45: pop            
        //    46: aload_1        
        //    47: invokevirtual   org/whispersystems/ah.g:()Z
        //    50: ifeq            62
        //    53: aload_0        
        //    54: aload_1        
        //    55: invokevirtual   org/whispersystems/ah.c:()Lcom/google/hv;
        //    58: invokevirtual   org/whispersystems/bt.a:(Lcom/google/hv;)Lorg/whispersystems/bt;
        //    61: pop            
        //    62: aload_1        
        //    63: invokevirtual   org/whispersystems/ah.p:()Z
        //    66: ifeq            78
        //    69: aload_0        
        //    70: aload_1        
        //    71: invokevirtual   org/whispersystems/ah.e:()Lcom/google/hv;
        //    74: invokevirtual   org/whispersystems/bt.b:(Lcom/google/hv;)Lorg/whispersystems/bt;
        //    77: pop            
        //    78: aload_0        
        //    79: aload_1        
        //    80: invokevirtual   org/whispersystems/ah.getUnknownFields:()Lcom/google/ce;
        //    83: invokevirtual   org/whispersystems/bt.b:(Lcom/google/ce;)Lcom/google/fp;
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
    
    public bt b() {
        return d().a(this.c());
    }
    
    public bt b(final hv h) {
        if (h == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.f |= 0x8;
        this.h = h;
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
    
    public ah c() {
        int n = 1;
        final ah ah = new ah(this, null);
        final int f = this.f;
        if ((f & 0x1) != n) {
            n = 0;
        }
        org.whispersystems.ah.a(ah, this.e);
        if ((f & 0x2) == 0x2) {
            n |= 0x2;
        }
        org.whispersystems.ah.b(ah, this.g);
        if ((f & 0x4) == 0x4) {
            n |= 0x4;
        }
        org.whispersystems.ah.c(ah, this.i);
        if ((f & 0x8) == 0x8) {
            n |= 0x8;
        }
        org.whispersystems.ah.a(ah, this.h);
        org.whispersystems.ah.b(ah, n);
        this.b();
        return ah;
    }
    
    public bt c(final hv g) {
        if (g == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.f |= 0x2;
        this.g = g;
        this.c();
        return this;
    }
    
    @Override
    public fp clear() {
        return this.e();
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
    
    public bt e() {
        super.clear();
        this.e = 0;
        this.f &= 0xFFFFFFFE;
        this.g = hv.b;
        this.f &= 0xFFFFFFFD;
        this.i = hv.b;
        this.f &= 0xFFFFFFFB;
        this.h = hv.b;
        this.f &= 0xFFFFFFF7;
        return this;
    }
    
    public ah f() {
        return ah.l();
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.f();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.f();
    }
    
    @Override
    public bl getDescriptorForType() {
        return bO.E();
    }
    
    public ah h() {
        final ah c = this.c();
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
        return bO.i().a(ah.class, bt.class);
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
