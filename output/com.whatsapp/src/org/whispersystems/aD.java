// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.aJ;
import com.google.a8;
import com.google.ch;
import com.google.ep;
import com.google.fm;
import com.google.ci;
import com.google.dg;
import com.google.bl;
import java.io.InputStream;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import com.google.ce;
import com.google.hv;
import com.google.du;
import com.google.dS;

public final class aD extends dS implements ab
{
    public static final int e = 4;
    public static final int f = 2;
    public static du h;
    public static final int k = 8;
    public static final int o = 1;
    public static final int p = 7;
    public static final int r = 3;
    public static final int s = 5;
    private static final long serialVersionUID;
    private static final aD x;
    private hv g;
    private hv i;
    private hv j;
    private hv l;
    private final ce m;
    private int n;
    private byte q;
    private hv t;
    private hv u;
    private int v;
    private int w;
    
    static {
        aD.h = new bV();
        (x = new aD(true)).r();
    }
    
    private aD(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/google/dS.<init>:()V
        //     8: aload_0        
        //     9: iconst_m1      
        //    10: putfield        org/whispersystems/aD.q:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/aD.v:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/aD.r:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            298
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 312
        //                8: 140
        //               18: 162
        //               26: 184
        //               34: 206
        //               42: 229
        //               58: 252
        //               66: 275
        //          default: 116
        //        }
        //   116: aload_0        
        //   117: aload_1        
        //   118: aload           4
        //   120: aload_2        
        //   121: iload           9
        //   123: invokevirtual   org/whispersystems/aD.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   126: istore          11
        //   128: iload           11
        //   130: ifne            294
        //   133: iload_3        
        //   134: ifeq            408
        //   137: iconst_1       
        //   138: istore          5
        //   140: aload_0        
        //   141: iconst_1       
        //   142: aload_0        
        //   143: getfield        org/whispersystems/aD.w:I
        //   146: ior            
        //   147: putfield        org/whispersystems/aD.w:I
        //   150: aload_0        
        //   151: aload_1        
        //   152: invokevirtual   com/google/cL.l:()I
        //   155: putfield        org/whispersystems/aD.n:I
        //   158: iload_3        
        //   159: ifeq            294
        //   162: aload_0        
        //   163: iconst_2       
        //   164: aload_0        
        //   165: getfield        org/whispersystems/aD.w:I
        //   168: ior            
        //   169: putfield        org/whispersystems/aD.w:I
        //   172: aload_0        
        //   173: aload_1        
        //   174: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   177: putfield        org/whispersystems/aD.u:Lcom/google/hv;
        //   180: iload_3        
        //   181: ifeq            294
        //   184: aload_0        
        //   185: iconst_4       
        //   186: aload_0        
        //   187: getfield        org/whispersystems/aD.w:I
        //   190: ior            
        //   191: putfield        org/whispersystems/aD.w:I
        //   194: aload_0        
        //   195: aload_1        
        //   196: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   199: putfield        org/whispersystems/aD.g:Lcom/google/hv;
        //   202: iload_3        
        //   203: ifeq            294
        //   206: aload_0        
        //   207: bipush          8
        //   209: aload_0        
        //   210: getfield        org/whispersystems/aD.w:I
        //   213: ior            
        //   214: putfield        org/whispersystems/aD.w:I
        //   217: aload_0        
        //   218: aload_1        
        //   219: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   222: putfield        org/whispersystems/aD.j:Lcom/google/hv;
        //   225: iload_3        
        //   226: ifeq            294
        //   229: aload_0        
        //   230: bipush          16
        //   232: aload_0        
        //   233: getfield        org/whispersystems/aD.w:I
        //   236: ior            
        //   237: putfield        org/whispersystems/aD.w:I
        //   240: aload_0        
        //   241: aload_1        
        //   242: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   245: putfield        org/whispersystems/aD.i:Lcom/google/hv;
        //   248: iload_3        
        //   249: ifeq            294
        //   252: aload_0        
        //   253: bipush          32
        //   255: aload_0        
        //   256: getfield        org/whispersystems/aD.w:I
        //   259: ior            
        //   260: putfield        org/whispersystems/aD.w:I
        //   263: aload_0        
        //   264: aload_1        
        //   265: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   268: putfield        org/whispersystems/aD.t:Lcom/google/hv;
        //   271: iload_3        
        //   272: ifeq            294
        //   275: aload_0        
        //   276: bipush          64
        //   278: aload_0        
        //   279: getfield        org/whispersystems/aD.w:I
        //   282: ior            
        //   283: putfield        org/whispersystems/aD.w:I
        //   286: aload_0        
        //   287: aload_1        
        //   288: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   291: putfield        org/whispersystems/aD.l:Lcom/google/hv;
        //   294: iload_3        
        //   295: ifeq            30
        //   298: aload_0        
        //   299: aload           4
        //   301: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   304: putfield        org/whispersystems/aD.m:Lcom/google/ce;
        //   307: aload_0        
        //   308: invokevirtual   org/whispersystems/aD.c:()V
        //   311: return         
        //   312: iload_3        
        //   313: ifeq            408
        //   316: iconst_1       
        //   317: istore          5
        //   319: goto            116
        //   322: astore          10
        //   324: aload           10
        //   326: athrow         
        //   327: astore          8
        //   329: aload           8
        //   331: aload_0        
        //   332: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   335: athrow         
        //   336: astore          7
        //   338: aload_0        
        //   339: aload           4
        //   341: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   344: putfield        org/whispersystems/aD.m:Lcom/google/ce;
        //   347: aload_0        
        //   348: invokevirtual   org/whispersystems/aD.c:()V
        //   351: aload           7
        //   353: athrow         
        //   354: astore          12
        //   356: aload           12
        //   358: athrow         
        //   359: astore          13
        //   361: aload           13
        //   363: athrow         
        //   364: astore          14
        //   366: aload           14
        //   368: athrow         
        //   369: astore          15
        //   371: aload           15
        //   373: athrow         
        //   374: astore          16
        //   376: aload           16
        //   378: athrow         
        //   379: astore          17
        //   381: aload           17
        //   383: athrow         
        //   384: astore          18
        //   386: aload           18
        //   388: athrow         
        //   389: astore          6
        //   391: new             Lcom/google/bg;
        //   394: dup            
        //   395: aload           6
        //   397: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   400: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   403: aload_0        
        //   404: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   407: athrow         
        //   408: iconst_1       
        //   409: istore          5
        //   411: goto            294
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     327    336    Lcom/google/bg;
        //  35     41     389    408    Ljava/io/IOException;
        //  35     41     336    354    Any
        //  116    128    322    327    Lcom/google/bg;
        //  116    128    389    408    Ljava/io/IOException;
        //  116    128    336    354    Any
        //  140    158    354    359    Lcom/google/bg;
        //  140    158    389    408    Ljava/io/IOException;
        //  140    158    336    354    Any
        //  162    180    359    364    Lcom/google/bg;
        //  162    180    389    408    Ljava/io/IOException;
        //  162    180    336    354    Any
        //  184    202    364    369    Lcom/google/bg;
        //  184    202    389    408    Ljava/io/IOException;
        //  184    202    336    354    Any
        //  206    225    369    374    Lcom/google/bg;
        //  206    225    389    408    Ljava/io/IOException;
        //  206    225    336    354    Any
        //  229    248    374    379    Lcom/google/bg;
        //  229    248    389    408    Ljava/io/IOException;
        //  229    248    336    354    Any
        //  252    271    379    384    Lcom/google/bg;
        //  252    271    389    408    Ljava/io/IOException;
        //  252    271    336    354    Any
        //  275    294    384    389    Lcom/google/bg;
        //  275    294    389    408    Ljava/io/IOException;
        //  275    294    336    354    Any
        //  324    327    327    336    Lcom/google/bg;
        //  324    327    389    408    Ljava/io/IOException;
        //  324    327    336    354    Any
        //  329    336    336    354    Any
        //  356    359    359    364    Lcom/google/bg;
        //  356    359    389    408    Ljava/io/IOException;
        //  356    359    336    354    Any
        //  361    364    364    369    Lcom/google/bg;
        //  361    364    389    408    Ljava/io/IOException;
        //  361    364    336    354    Any
        //  366    369    369    374    Lcom/google/bg;
        //  366    369    389    408    Ljava/io/IOException;
        //  366    369    336    354    Any
        //  371    374    374    379    Lcom/google/bg;
        //  371    374    389    408    Ljava/io/IOException;
        //  371    374    336    354    Any
        //  376    379    379    384    Lcom/google/bg;
        //  376    379    389    408    Ljava/io/IOException;
        //  376    379    336    354    Any
        //  381    384    384    389    Lcom/google/bg;
        //  381    384    389    408    Ljava/io/IOException;
        //  381    384    336    354    Any
        //  386    389    327    336    Lcom/google/bg;
        //  386    389    389    408    Ljava/io/IOException;
        //  386    389    336    354    Any
        //  391    408    336    354    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 182, Size: 182
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    aD(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private aD(final fp fp) {
        super(fp);
        this.q = -1;
        this.v = -1;
        this.m = fp.getUnknownFields();
    }
    
    aD(final fp fp, final j j) {
        this(fp);
    }
    
    private aD(final boolean b) {
        this.q = -1;
        this.v = -1;
        this.m = ce.d();
    }
    
    static int a(final aD ad, final int n) {
        return ad.n = n;
    }
    
    static hv a(final aD ad, final hv i) {
        return ad.i = i;
    }
    
    public static aD a(final cL cl) {
        return (aD)aD.h.a(cl);
    }
    
    public static aD a(final cL cl, final fu fu) {
        return (aD)aD.h.a(cl, fu);
    }
    
    public static aD a(final hv hv) {
        return (aD)aD.h.a(hv);
    }
    
    public static aD a(final hv hv, final fu fu) {
        return (aD)aD.h.a(hv, fu);
    }
    
    public static aD a(final InputStream inputStream) {
        return (aD)aD.h.b(inputStream);
    }
    
    public static aD a(final InputStream inputStream, final fu fu) {
        return (aD)aD.h.a(inputStream, fu);
    }
    
    public static aD a(final byte[] array) {
        return (aD)aD.h.a(array);
    }
    
    public static aD a(final byte[] array, final fu fu) {
        return (aD)aD.h.a(array, fu);
    }
    
    public static b4 a(final aD ad) {
        return m().a(ad);
    }
    
    static int b(final aD ad, final int w) {
        return ad.w = w;
    }
    
    static hv b(final aD ad, final hv u) {
        return ad.u = u;
    }
    
    public static aD b(final InputStream inputStream) {
        return (aD)aD.h.a(inputStream);
    }
    
    public static aD b(final InputStream inputStream, final fu fu) {
        return (aD)aD.h.b(inputStream, fu);
    }
    
    static hv c(final aD ad, final hv g) {
        return ad.g = g;
    }
    
    static hv d(final aD ad, final hv t) {
        return ad.t = t;
    }
    
    public static aD d() {
        return aD.x;
    }
    
    static hv e(final aD ad, final hv l) {
        return ad.l = l;
    }
    
    static hv f(final aD ad, final hv j) {
        return ad.j = j;
    }
    
    static boolean i() {
        return aD.d;
    }
    
    public static b4 m() {
        return b4.h();
    }
    
    private void r() {
        this.n = 0;
        this.u = hv.b;
        this.g = hv.b;
        this.j = hv.b;
        this.i = hv.b;
        this.t = hv.b;
        this.l = hv.b;
    }
    
    public static final bl u() {
        return bO.e();
    }
    
    protected b4 a(final dg dg) {
        return new b4(dg, null);
    }
    
    public boolean a() {
        return (0x4 & this.w) == 0x4;
    }
    
    public hv c() {
        return this.l;
    }
    
    public boolean e() {
        return (0x40 & this.w) == 0x40;
    }
    
    public hv f() {
        return this.g;
    }
    
    public hv g() {
        return this.j;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.w();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.w();
    }
    
    @Override
    public du getParserForType() {
        return aD.h;
    }
    
    @Override
    public int getSerializedSize() {
        final int v = this.v;
        if (v != -1) {
            return v;
        }
        final int n = 0x1 & this.w;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.n);
        }
        if ((0x2 & this.w) == 0x2) {
            n2 += ep.b(2, this.u);
        }
        if ((0x4 & this.w) == 0x4) {
            n2 += ep.b(3, this.g);
        }
        if ((0x8 & this.w) == 0x8) {
            n2 += ep.b(4, this.j);
        }
        if ((0x10 & this.w) == 0x10) {
            n2 += ep.b(5, this.i);
        }
        if ((0x20 & this.w) == 0x20) {
            n2 += ep.b(7, this.t);
        }
        if ((0x40 & this.w) == 0x40) {
            n2 += ep.b(8, this.l);
        }
        return this.v = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.m;
    }
    
    public b4 h() {
        return a(this);
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.z().a(aD.class, b4.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte q = this.q;
        if (q != -1) {
            return q == 1;
        }
        this.q = 1;
        return true;
    }
    
    public boolean j() {
        return (0x10 & this.w) == 0x10;
    }
    
    public boolean k() {
        return (0x20 & this.w) == 0x20;
    }
    
    public int l() {
        return this.n;
    }
    
    public boolean n() {
        return (0x1 & this.w) == 0x1;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.s();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.s();
    }
    
    public hv o() {
        return this.t;
    }
    
    public boolean p() {
        return (0x8 & this.w) == 0x8;
    }
    
    public hv q() {
        return this.u;
    }
    
    public b4 s() {
        return m();
    }
    
    public boolean t() {
        return (0x2 & this.w) == 0x2;
    }
    
    @Override
    public a8 toBuilder() {
        return this.h();
    }
    
    @Override
    public aJ toBuilder() {
        return this.h();
    }
    
    public hv v() {
        return this.i;
    }
    
    public aD w() {
        return aD.x;
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.w) == 0x1) {
            ep.a(1, this.n);
        }
        if ((0x2 & this.w) == 0x2) {
            ep.c(2, this.u);
        }
        if ((0x4 & this.w) == 0x4) {
            ep.c(3, this.g);
        }
        if ((0x8 & this.w) == 0x8) {
            ep.c(4, this.j);
        }
        if ((0x10 & this.w) == 0x10) {
            ep.c(5, this.i);
        }
        if ((0x20 & this.w) == 0x20) {
            ep.c(7, this.t);
        }
        if ((0x40 & this.w) == 0x40) {
            ep.c(8, this.l);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
