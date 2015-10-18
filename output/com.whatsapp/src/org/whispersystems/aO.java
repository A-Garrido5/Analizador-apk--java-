// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

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

public final class aO extends dS implements Y
{
    public static final int e = 5;
    public static final int g = 2;
    public static final int i = 4;
    public static final int l = 3;
    private static final aO o;
    public static final int q = 1;
    public static du s;
    private static final long serialVersionUID = 0L;
    public static final int t = 6;
    private int f;
    private int h;
    private byte j;
    private hv k;
    private hv m;
    private hv n;
    private final ce p;
    private int r;
    private int u;
    private int v;
    
    static {
        aO.s = new bn();
        (o = new aO(true)).o();
    }
    
    private aO(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/bR.h:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/google/dS.<init>:()V
        //     8: aload_0        
        //     9: iconst_m1      
        //    10: putfield        org/whispersystems/aO.j:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/aO.v:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/aO.o:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            267
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 281
        //                8: 132
        //               18: 154
        //               26: 177
        //               34: 200
        //               40: 223
        //               48: 245
        //          default: 108
        //        }
        //   108: aload_0        
        //   109: aload_1        
        //   110: aload           4
        //   112: aload_2        
        //   113: iload           9
        //   115: invokevirtual   org/whispersystems/aO.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   118: istore          11
        //   120: iload           11
        //   122: ifne            263
        //   125: iload_3        
        //   126: ifeq            372
        //   129: iconst_1       
        //   130: istore          5
        //   132: aload_0        
        //   133: iconst_2       
        //   134: aload_0        
        //   135: getfield        org/whispersystems/aO.r:I
        //   138: ior            
        //   139: putfield        org/whispersystems/aO.r:I
        //   142: aload_0        
        //   143: aload_1        
        //   144: invokevirtual   com/google/cL.l:()I
        //   147: putfield        org/whispersystems/aO.f:I
        //   150: iload_3        
        //   151: ifeq            263
        //   154: aload_0        
        //   155: bipush          8
        //   157: aload_0        
        //   158: getfield        org/whispersystems/aO.r:I
        //   161: ior            
        //   162: putfield        org/whispersystems/aO.r:I
        //   165: aload_0        
        //   166: aload_1        
        //   167: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   170: putfield        org/whispersystems/aO.k:Lcom/google/hv;
        //   173: iload_3        
        //   174: ifeq            263
        //   177: aload_0        
        //   178: bipush          16
        //   180: aload_0        
        //   181: getfield        org/whispersystems/aO.r:I
        //   184: ior            
        //   185: putfield        org/whispersystems/aO.r:I
        //   188: aload_0        
        //   189: aload_1        
        //   190: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   193: putfield        org/whispersystems/aO.n:Lcom/google/hv;
        //   196: iload_3        
        //   197: ifeq            263
        //   200: aload_0        
        //   201: bipush          32
        //   203: aload_0        
        //   204: getfield        org/whispersystems/aO.r:I
        //   207: ior            
        //   208: putfield        org/whispersystems/aO.r:I
        //   211: aload_0        
        //   212: aload_1        
        //   213: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   216: putfield        org/whispersystems/aO.m:Lcom/google/hv;
        //   219: iload_3        
        //   220: ifeq            263
        //   223: aload_0        
        //   224: iconst_1       
        //   225: aload_0        
        //   226: getfield        org/whispersystems/aO.r:I
        //   229: ior            
        //   230: putfield        org/whispersystems/aO.r:I
        //   233: aload_0        
        //   234: aload_1        
        //   235: invokevirtual   com/google/cL.l:()I
        //   238: putfield        org/whispersystems/aO.h:I
        //   241: iload_3        
        //   242: ifeq            263
        //   245: aload_0        
        //   246: iconst_4       
        //   247: aload_0        
        //   248: getfield        org/whispersystems/aO.r:I
        //   251: ior            
        //   252: putfield        org/whispersystems/aO.r:I
        //   255: aload_0        
        //   256: aload_1        
        //   257: invokevirtual   com/google/cL.l:()I
        //   260: putfield        org/whispersystems/aO.u:I
        //   263: iload_3        
        //   264: ifeq            30
        //   267: aload_0        
        //   268: aload           4
        //   270: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   273: putfield        org/whispersystems/aO.p:Lcom/google/ce;
        //   276: aload_0        
        //   277: invokevirtual   org/whispersystems/aO.c:()V
        //   280: return         
        //   281: iload_3        
        //   282: ifeq            372
        //   285: iconst_1       
        //   286: istore          5
        //   288: goto            108
        //   291: astore          10
        //   293: aload           10
        //   295: athrow         
        //   296: astore          8
        //   298: aload           8
        //   300: aload_0        
        //   301: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   304: athrow         
        //   305: astore          7
        //   307: aload_0        
        //   308: aload           4
        //   310: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   313: putfield        org/whispersystems/aO.p:Lcom/google/ce;
        //   316: aload_0        
        //   317: invokevirtual   org/whispersystems/aO.c:()V
        //   320: aload           7
        //   322: athrow         
        //   323: astore          12
        //   325: aload           12
        //   327: athrow         
        //   328: astore          13
        //   330: aload           13
        //   332: athrow         
        //   333: astore          14
        //   335: aload           14
        //   337: athrow         
        //   338: astore          15
        //   340: aload           15
        //   342: athrow         
        //   343: astore          16
        //   345: aload           16
        //   347: athrow         
        //   348: astore          17
        //   350: aload           17
        //   352: athrow         
        //   353: astore          6
        //   355: new             Lcom/google/bg;
        //   358: dup            
        //   359: aload           6
        //   361: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   364: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   367: aload_0        
        //   368: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   371: athrow         
        //   372: iconst_1       
        //   373: istore          5
        //   375: goto            263
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     296    305    Lcom/google/bg;
        //  35     41     353    372    Ljava/io/IOException;
        //  35     41     305    323    Any
        //  108    120    291    296    Lcom/google/bg;
        //  108    120    353    372    Ljava/io/IOException;
        //  108    120    305    323    Any
        //  132    150    323    328    Lcom/google/bg;
        //  132    150    353    372    Ljava/io/IOException;
        //  132    150    305    323    Any
        //  154    173    328    333    Lcom/google/bg;
        //  154    173    353    372    Ljava/io/IOException;
        //  154    173    305    323    Any
        //  177    196    333    338    Lcom/google/bg;
        //  177    196    353    372    Ljava/io/IOException;
        //  177    196    305    323    Any
        //  200    219    338    343    Lcom/google/bg;
        //  200    219    353    372    Ljava/io/IOException;
        //  200    219    305    323    Any
        //  223    241    343    348    Lcom/google/bg;
        //  223    241    353    372    Ljava/io/IOException;
        //  223    241    305    323    Any
        //  245    263    348    353    Lcom/google/bg;
        //  245    263    353    372    Ljava/io/IOException;
        //  245    263    305    323    Any
        //  293    296    296    305    Lcom/google/bg;
        //  293    296    353    372    Ljava/io/IOException;
        //  293    296    305    323    Any
        //  298    305    305    323    Any
        //  325    328    328    333    Lcom/google/bg;
        //  325    328    353    372    Ljava/io/IOException;
        //  325    328    305    323    Any
        //  330    333    333    338    Lcom/google/bg;
        //  330    333    353    372    Ljava/io/IOException;
        //  330    333    305    323    Any
        //  335    338    338    343    Lcom/google/bg;
        //  335    338    353    372    Ljava/io/IOException;
        //  335    338    305    323    Any
        //  340    343    343    348    Lcom/google/bg;
        //  340    343    353    372    Ljava/io/IOException;
        //  340    343    305    323    Any
        //  345    348    348    353    Lcom/google/bg;
        //  345    348    353    372    Ljava/io/IOException;
        //  345    348    305    323    Any
        //  350    353    296    305    Lcom/google/bg;
        //  350    353    353    372    Ljava/io/IOException;
        //  350    353    305    323    Any
        //  355    372    305    323    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 167, Size: 167
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
    
    aO(final cL cl, final fu fu, final U u) {
        this(cl, fu);
    }
    
    private aO(final fp fp) {
        super(fp);
        this.j = -1;
        this.v = -1;
        this.p = fp.getUnknownFields();
    }
    
    aO(final fp fp, final U u) {
        this(fp);
    }
    
    private aO(final boolean b) {
        this.j = -1;
        this.v = -1;
        this.p = ce.d();
    }
    
    static int a(final aO ao, final int h) {
        return ao.h = h;
    }
    
    static hv a(final aO ao, final hv n) {
        return ao.n = n;
    }
    
    public static aJ a(final aO ao) {
        return k().a(ao);
    }
    
    public static aO a(final cL cl) {
        return (aO)aO.s.a(cl);
    }
    
    public static aO a(final cL cl, final fu fu) {
        return (aO)aO.s.a(cl, fu);
    }
    
    public static aO a(final hv hv) {
        return (aO)aO.s.a(hv);
    }
    
    public static aO a(final hv hv, final fu fu) {
        return (aO)aO.s.a(hv, fu);
    }
    
    public static aO a(final InputStream inputStream) {
        return (aO)aO.s.a(inputStream);
    }
    
    public static aO a(final InputStream inputStream, final fu fu) {
        return (aO)aO.s.a(inputStream, fu);
    }
    
    public static aO a(final byte[] array) {
        return (aO)aO.s.a(array);
    }
    
    public static aO a(final byte[] array, final fu fu) {
        return (aO)aO.s.a(array, fu);
    }
    
    static int b(final aO ao, final int u) {
        return ao.u = u;
    }
    
    static hv b(final aO ao, final hv k) {
        return ao.k = k;
    }
    
    public static aO b(final InputStream inputStream) {
        return (aO)aO.s.b(inputStream);
    }
    
    public static aO b(final InputStream inputStream, final fu fu) {
        return (aO)aO.s.b(inputStream, fu);
    }
    
    static int c(final aO ao, final int r) {
        return ao.r = r;
    }
    
    static hv c(final aO ao, final hv m) {
        return ao.m = m;
    }
    
    public static aO c() {
        return aO.o;
    }
    
    static int d(final aO ao, final int f) {
        return ao.f = f;
    }
    
    static boolean e() {
        return aO.d;
    }
    
    public static aJ k() {
        return aJ.e();
    }
    
    public static final bl l() {
        return bR.c();
    }
    
    private void o() {
        this.h = 0;
        this.f = 0;
        this.u = 0;
        this.k = hv.b;
        this.n = hv.b;
        this.m = hv.b;
    }
    
    protected aJ a(final dg dg) {
        return new aJ(dg, null);
    }
    
    public aO a() {
        return aO.o;
    }
    
    public int b() {
        return this.u;
    }
    
    public boolean d() {
        return (0x2 & this.r) == 0x2;
    }
    
    public hv f() {
        return this.k;
    }
    
    public hv g() {
        return this.m;
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
    public du getParserForType() {
        return aO.s;
    }
    
    @Override
    public int getSerializedSize() {
        final int v = this.v;
        if (v != -1) {
            return v;
        }
        final int n = 0x2 & this.r;
        int n2 = 0;
        if (n == 2) {
            n2 = 0 + ep.b(1, this.f);
        }
        if ((0x8 & this.r) == 0x8) {
            n2 += ep.b(2, this.k);
        }
        if ((0x10 & this.r) == 0x10) {
            n2 += ep.b(3, this.n);
        }
        if ((0x20 & this.r) == 0x20) {
            n2 += ep.b(4, this.m);
        }
        if ((0x1 & this.r) == 0x1) {
            n2 += ep.b(5, this.h);
        }
        if ((0x4 & this.r) == 0x4) {
            n2 += ep.b(6, this.u);
        }
        return this.v = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.p;
    }
    
    public int h() {
        return this.f;
    }
    
    public boolean i() {
        return (0x10 & this.r) == 0x10;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bR.e().a(aO.class, aJ.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte j = this.j;
        if (j != -1) {
            return j == 1;
        }
        this.j = 1;
        return true;
    }
    
    public boolean j() {
        return (0x20 & this.r) == 0x20;
    }
    
    public int m() {
        return this.h;
    }
    
    public aJ n() {
        return a(this);
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.r();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public com.google.aJ newBuilderForType() {
        return this.r();
    }
    
    public boolean p() {
        return (0x1 & this.r) == 0x1;
    }
    
    public boolean q() {
        return (0x4 & this.r) == 0x4;
    }
    
    public aJ r() {
        return k();
    }
    
    public hv s() {
        return this.n;
    }
    
    public boolean t() {
        return (0x8 & this.r) == 0x8;
    }
    
    @Override
    public a8 toBuilder() {
        return this.n();
    }
    
    @Override
    public com.google.aJ toBuilder() {
        return this.n();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x2 & this.r) == 0x2) {
            ep.a(1, this.f);
        }
        if ((0x8 & this.r) == 0x8) {
            ep.c(2, this.k);
        }
        if ((0x10 & this.r) == 0x10) {
            ep.c(3, this.n);
        }
        if ((0x20 & this.r) == 0x20) {
            ep.c(4, this.m);
        }
        if ((0x1 & this.r) == 0x1) {
            ep.a(5, this.h);
        }
        if ((0x4 & this.r) == 0x4) {
            ep.a(6, this.u);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
