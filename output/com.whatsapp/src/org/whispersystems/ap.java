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

public final class ap extends fp implements k
{
    private int e;
    private hv f;
    private hv g;
    private int h;
    
    private ap() {
        this.f = hv.b;
        this.g = hv.b;
        this.a();
    }
    
    private ap(final dg dg) {
        super(dg);
        this.f = hv.b;
        this.g = hv.b;
        this.a();
    }
    
    ap(final dg dg, final j j) {
        this(dg);
    }
    
    private void a() {
        if (am.m()) {}
    }
    
    private static ap e() {
        return new ap();
    }
    
    static ap f() {
        return e();
    }
    
    public ap a(final int e) {
        this.h |= 0x1;
        this.e = e;
        this.c();
        return this;
    }
    
    public ap a(final cL cl, final fu fu) {
        while (true) {
            try {
                am am3;
                Throwable t;
                try {
                    final am am = (am)org.whispersystems.am.h.parsePartialFrom(cl, fu);
                    if (am == null) {
                        return this;
                    }
                    try {
                        this.a(am);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final am am2 = (am)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        am3 = am2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (am3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(am3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final am am3 = null;
                continue;
            }
            break;
        }
    }
    
    public ap a(final fm fm) {
        try {
            if (fm instanceof am) {
                return this.a((am)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public ap a(final hv f) {
        if (f == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.h |= 0x2;
        this.f = f;
        this.c();
        return this;
    }
    
    public ap a(final am p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/am.k:()Lorg/whispersystems/am;
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
        //    15: invokevirtual   org/whispersystems/am.n:()Z
        //    18: ifeq            30
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   org/whispersystems/am.j:()I
        //    26: invokevirtual   org/whispersystems/ap.a:(I)Lorg/whispersystems/ap;
        //    29: pop            
        //    30: aload_1        
        //    31: invokevirtual   org/whispersystems/am.b:()Z
        //    34: ifeq            46
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokevirtual   org/whispersystems/am.a:()Lcom/google/hv;
        //    42: invokevirtual   org/whispersystems/ap.a:(Lcom/google/hv;)Lorg/whispersystems/ap;
        //    45: pop            
        //    46: aload_1        
        //    47: invokevirtual   org/whispersystems/am.e:()Z
        //    50: ifeq            62
        //    53: aload_0        
        //    54: aload_1        
        //    55: invokevirtual   org/whispersystems/am.i:()Lcom/google/hv;
        //    58: invokevirtual   org/whispersystems/ap.b:(Lcom/google/hv;)Lorg/whispersystems/ap;
        //    61: pop            
        //    62: aload_0        
        //    63: aload_1        
        //    64: invokevirtual   org/whispersystems/am.getUnknownFields:()Lcom/google/ce;
        //    67: invokevirtual   org/whispersystems/ap.b:(Lcom/google/ce;)Lcom/google/fp;
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
    
    public ap b() {
        super.clear();
        this.e = 0;
        this.h &= 0xFFFFFFFE;
        this.f = hv.b;
        this.h &= 0xFFFFFFFD;
        this.g = hv.b;
        this.h &= 0xFFFFFFFB;
        return this;
    }
    
    public ap b(final hv g) {
        if (g == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.h |= 0x4;
        this.g = g;
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
        return this.d();
    }
    
    @Override
    public fm buildPartial() {
        return this.d();
    }
    
    public am c() {
        final am d = this.d();
        try {
            if (!d.isInitialized()) {
                throw fx.a(d);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return d;
    }
    
    @Override
    public fp clear() {
        return this.b();
    }
    
    @Override
    public fE clone() {
        return this.h();
    }
    
    @Override
    public fp clone() {
        return this.h();
    }
    
    @Override
    public fx clone() {
        return this.h();
    }
    
    @Override
    public Object clone() {
        return this.h();
    }
    
    public am d() {
        int n = 1;
        final am am = new am(this, null);
        final int h = this.h;
        if ((h & 0x1) != n) {
            n = 0;
        }
        org.whispersystems.am.b(am, this.e);
        if ((h & 0x2) == 0x2) {
            n |= 0x2;
        }
        org.whispersystems.am.a(am, this.f);
        if ((h & 0x4) == 0x4) {
            n |= 0x4;
        }
        org.whispersystems.am.b(am, this.g);
        org.whispersystems.am.a(am, n);
        this.b();
        return am;
    }
    
    public am g() {
        return am.k();
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
    public bl getDescriptorForType() {
        return bO.c();
    }
    
    public ap h() {
        return e().a(this.d());
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.m().a(am.class, ap.class);
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
