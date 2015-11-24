// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class ds extends df implements c
{
    public static final int h = 9;
    public static final int i = 3;
    public static final int l = 10;
    public static final int m = 1;
    public static final int q = 5;
    public static final int r = 2;
    public static final int s = 999;
    private static final long serialVersionUID;
    public static du t;
    private static final ds u;
    private bb f;
    private int g;
    private final ce j;
    private boolean k;
    private Object n;
    private int o;
    private List p;
    private boolean v;
    private boolean w;
    private byte x;
    private boolean y;
    
    static {
        ds.t = new hW();
        (u = new ds(true)).r();
    }
    
    private ds(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: getstatic       com/google/dt.b:Z
        //     5: istore          4
        //     7: aload_0        
        //     8: invokespecial   com/google/df.<init>:()V
        //    11: aload_0        
        //    12: iconst_m1      
        //    13: putfield        com/google/ds.x:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        com/google/ds.g:I
        //    21: aload_0        
        //    22: invokespecial   com/google/ds.r:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            366
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 401
        //                8: 144
        //               16: 197
        //               24: 220
        //               40: 244
        //               74: 267
        //               80: 291
        //             7994: 315
        //          default: 120
        //        }
        //   120: aload_0        
        //   121: aload_1        
        //   122: aload           5
        //   124: aload_2        
        //   125: iload           12
        //   127: invokevirtual   com/google/ds.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   130: istore          14
        //   132: iload           14
        //   134: ifne            361
        //   137: iload           4
        //   139: ifeq            533
        //   142: iconst_1       
        //   143: istore_3       
        //   144: aload_1        
        //   145: invokevirtual   com/google/cL.g:()I
        //   148: istore          15
        //   150: iload           15
        //   152: invokestatic    com/google/bb.valueOf:(I)Lcom/google/bb;
        //   155: astore          16
        //   157: aload           16
        //   159: ifnonnull       176
        //   162: aload           5
        //   164: iconst_1       
        //   165: iload           15
        //   167: invokevirtual   com/google/aY.a:(II)Lcom/google/aY;
        //   170: pop            
        //   171: iload           4
        //   173: ifeq            361
        //   176: aload_0        
        //   177: iconst_1       
        //   178: aload_0        
        //   179: getfield        com/google/ds.o:I
        //   182: ior            
        //   183: putfield        com/google/ds.o:I
        //   186: aload_0        
        //   187: aload           16
        //   189: putfield        com/google/ds.f:Lcom/google/bb;
        //   192: iload           4
        //   194: ifeq            361
        //   197: aload_0        
        //   198: iconst_2       
        //   199: aload_0        
        //   200: getfield        com/google/ds.o:I
        //   203: ior            
        //   204: putfield        com/google/ds.o:I
        //   207: aload_0        
        //   208: aload_1        
        //   209: invokevirtual   com/google/cL.x:()Z
        //   212: putfield        com/google/ds.w:Z
        //   215: iload           4
        //   217: ifeq            361
        //   220: aload_0        
        //   221: bipush          8
        //   223: aload_0        
        //   224: getfield        com/google/ds.o:I
        //   227: ior            
        //   228: putfield        com/google/ds.o:I
        //   231: aload_0        
        //   232: aload_1        
        //   233: invokevirtual   com/google/cL.x:()Z
        //   236: putfield        com/google/ds.y:Z
        //   239: iload           4
        //   241: ifeq            361
        //   244: aload_0        
        //   245: iconst_4       
        //   246: aload_0        
        //   247: getfield        com/google/ds.o:I
        //   250: ior            
        //   251: putfield        com/google/ds.o:I
        //   254: aload_0        
        //   255: aload_1        
        //   256: invokevirtual   com/google/cL.x:()Z
        //   259: putfield        com/google/ds.v:Z
        //   262: iload           4
        //   264: ifeq            361
        //   267: aload_0        
        //   268: bipush          16
        //   270: aload_0        
        //   271: getfield        com/google/ds.o:I
        //   274: ior            
        //   275: putfield        com/google/ds.o:I
        //   278: aload_0        
        //   279: aload_1        
        //   280: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   283: putfield        com/google/ds.n:Ljava/lang/Object;
        //   286: iload           4
        //   288: ifeq            361
        //   291: aload_0        
        //   292: bipush          32
        //   294: aload_0        
        //   295: getfield        com/google/ds.o:I
        //   298: ior            
        //   299: putfield        com/google/ds.o:I
        //   302: aload_0        
        //   303: aload_1        
        //   304: invokevirtual   com/google/cL.x:()Z
        //   307: putfield        com/google/ds.k:Z
        //   310: iload           4
        //   312: ifeq            361
        //   315: iload           6
        //   317: bipush          64
        //   319: iand           
        //   320: bipush          64
        //   322: if_icmpeq       343
        //   325: aload_0        
        //   326: new             Ljava/util/ArrayList;
        //   329: dup            
        //   330: invokespecial   java/util/ArrayList.<init>:()V
        //   333: putfield        com/google/ds.p:Ljava/util/List;
        //   336: iload           6
        //   338: bipush          64
        //   340: ior            
        //   341: istore          6
        //   343: aload_0        
        //   344: getfield        com/google/ds.p:Ljava/util/List;
        //   347: aload_1        
        //   348: getstatic       com/google/dy.k:Lcom/google/du;
        //   351: aload_2        
        //   352: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   355: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   360: pop            
        //   361: iload           4
        //   363: ifeq            33
        //   366: iload           6
        //   368: bipush          64
        //   370: iand           
        //   371: bipush          64
        //   373: if_icmpne       387
        //   376: aload_0        
        //   377: aload_0        
        //   378: getfield        com/google/ds.p:Ljava/util/List;
        //   381: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   384: putfield        com/google/ds.p:Ljava/util/List;
        //   387: aload_0        
        //   388: aload           5
        //   390: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   393: putfield        com/google/ds.j:Lcom/google/ce;
        //   396: aload_0        
        //   397: invokevirtual   com/google/ds.c:()V
        //   400: return         
        //   401: iload           4
        //   403: ifeq            533
        //   406: iconst_1       
        //   407: istore_3       
        //   408: goto            120
        //   411: astore          13
        //   413: aload           13
        //   415: athrow         
        //   416: astore          11
        //   418: aload           11
        //   420: aload_0        
        //   421: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   424: athrow         
        //   425: astore          9
        //   427: iload           6
        //   429: bipush          64
        //   431: iand           
        //   432: bipush          64
        //   434: if_icmpne       448
        //   437: aload_0        
        //   438: aload_0        
        //   439: getfield        com/google/ds.p:Ljava/util/List;
        //   442: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   445: putfield        com/google/ds.p:Ljava/util/List;
        //   448: aload_0        
        //   449: aload           5
        //   451: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   454: putfield        com/google/ds.j:Lcom/google/ce;
        //   457: aload_0        
        //   458: invokevirtual   com/google/ds.c:()V
        //   461: aload           9
        //   463: athrow         
        //   464: astore          25
        //   466: aload           25
        //   468: athrow         
        //   469: astore          17
        //   471: aload           17
        //   473: athrow         
        //   474: astore          18
        //   476: aload           18
        //   478: athrow         
        //   479: astore          19
        //   481: aload           19
        //   483: athrow         
        //   484: astore          20
        //   486: aload           20
        //   488: athrow         
        //   489: astore          21
        //   491: aload           21
        //   493: athrow         
        //   494: astore          22
        //   496: aload           22
        //   498: athrow         
        //   499: astore          23
        //   501: aload           23
        //   503: athrow         
        //   504: astore          8
        //   506: new             Lcom/google/bg;
        //   509: dup            
        //   510: aload           8
        //   512: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   515: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   518: aload_0        
        //   519: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   522: athrow         
        //   523: astore          10
        //   525: aload           10
        //   527: athrow         
        //   528: astore          7
        //   530: aload           7
        //   532: athrow         
        //   533: iconst_1       
        //   534: istore_3       
        //   535: goto            361
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     416    425    Lcom/google/bg;
        //  37     43     504    523    Ljava/io/IOException;
        //  37     43     425    464    Any
        //  120    132    411    416    Lcom/google/bg;
        //  120    132    504    523    Ljava/io/IOException;
        //  120    132    425    464    Any
        //  144    157    416    425    Lcom/google/bg;
        //  144    157    504    523    Ljava/io/IOException;
        //  144    157    425    464    Any
        //  162    171    464    469    Lcom/google/bg;
        //  162    171    504    523    Ljava/io/IOException;
        //  162    171    425    464    Any
        //  176    192    469    474    Lcom/google/bg;
        //  176    192    504    523    Ljava/io/IOException;
        //  176    192    425    464    Any
        //  197    215    474    479    Lcom/google/bg;
        //  197    215    504    523    Ljava/io/IOException;
        //  197    215    425    464    Any
        //  220    239    479    484    Lcom/google/bg;
        //  220    239    504    523    Ljava/io/IOException;
        //  220    239    425    464    Any
        //  244    262    484    489    Lcom/google/bg;
        //  244    262    504    523    Ljava/io/IOException;
        //  244    262    425    464    Any
        //  267    286    489    494    Lcom/google/bg;
        //  267    286    504    523    Ljava/io/IOException;
        //  267    286    425    464    Any
        //  291    310    494    504    Lcom/google/bg;
        //  291    310    504    523    Ljava/io/IOException;
        //  291    310    425    464    Any
        //  325    336    416    425    Lcom/google/bg;
        //  325    336    504    523    Ljava/io/IOException;
        //  325    336    425    464    Any
        //  343    361    416    425    Lcom/google/bg;
        //  343    361    504    523    Ljava/io/IOException;
        //  343    361    425    464    Any
        //  376    387    528    533    Lcom/google/bg;
        //  413    416    416    425    Lcom/google/bg;
        //  413    416    504    523    Ljava/io/IOException;
        //  413    416    425    464    Any
        //  418    425    425    464    Any
        //  437    448    523    528    Lcom/google/bg;
        //  466    469    469    474    Lcom/google/bg;
        //  466    469    504    523    Ljava/io/IOException;
        //  466    469    425    464    Any
        //  471    474    474    479    Lcom/google/bg;
        //  471    474    504    523    Ljava/io/IOException;
        //  471    474    425    464    Any
        //  476    479    479    484    Lcom/google/bg;
        //  476    479    504    523    Ljava/io/IOException;
        //  476    479    425    464    Any
        //  481    484    484    489    Lcom/google/bg;
        //  481    484    504    523    Ljava/io/IOException;
        //  481    484    425    464    Any
        //  486    489    489    494    Lcom/google/bg;
        //  486    489    504    523    Ljava/io/IOException;
        //  486    489    425    464    Any
        //  491    494    494    504    Lcom/google/bg;
        //  491    494    504    523    Ljava/io/IOException;
        //  491    494    425    464    Any
        //  496    499    499    504    Lcom/google/bg;
        //  496    499    504    523    Ljava/io/IOException;
        //  496    499    425    464    Any
        //  501    504    416    425    Lcom/google/bg;
        //  501    504    504    523    Ljava/io/IOException;
        //  501    504    425    464    Any
        //  506    523    425    464    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 239, Size: 239
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
    
    ds(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private ds(final gq gq) {
        super(gq);
        this.x = -1;
        this.g = -1;
        this.j = gq.getUnknownFields();
    }
    
    ds(final gq gq, final fM fm) {
        this(gq);
    }
    
    private ds(final boolean b) {
        this.x = -1;
        this.g = -1;
        this.j = ce.d();
    }
    
    static int a(final ds ds, final int o) {
        return ds.o = o;
    }
    
    static bb a(final ds ds, final bb f) {
        return ds.f = f;
    }
    
    public static ds a(final cL cl) {
        return (ds)ds.t.a(cl);
    }
    
    public static ds a(final cL cl, final fu fu) {
        return (ds)ds.t.a(cl, fu);
    }
    
    public static ds a(final hv hv) {
        return (ds)ds.t.a(hv);
    }
    
    public static ds a(final hv hv, final fu fu) {
        return (ds)ds.t.a(hv, fu);
    }
    
    public static ds a(final InputStream inputStream) {
        return (ds)ds.t.a(inputStream);
    }
    
    public static ds a(final InputStream inputStream, final fu fu) {
        return (ds)ds.t.b(inputStream, fu);
    }
    
    public static ds a(final byte[] array) {
        return (ds)ds.t.a(array);
    }
    
    public static ds a(final byte[] array, final fu fu) {
        return (ds)ds.t.a(array, fu);
    }
    
    static Object a(final ds ds) {
        return ds.n;
    }
    
    static Object a(final ds ds, final Object n) {
        return ds.n = n;
    }
    
    static List a(final ds ds, final List p2) {
        return ds.p = p2;
    }
    
    static boolean a(final ds ds, final boolean v) {
        return ds.v = v;
    }
    
    public static ds b(final InputStream inputStream) {
        return (ds)ds.t.b(inputStream);
    }
    
    public static ds b(final InputStream inputStream, final fu fu) {
        return (ds)ds.t.a(inputStream, fu);
    }
    
    static List b(final ds ds) {
        return ds.p;
    }
    
    static boolean b(final ds ds, final boolean y) {
        return ds.y = y;
    }
    
    public static gO c(final ds ds) {
        return e().a(ds);
    }
    
    static boolean c(final ds ds, final boolean w) {
        return ds.w = w;
    }
    
    static boolean d(final ds ds, final boolean k) {
        return ds.k = k;
    }
    
    public static gO e() {
        return gO.g();
    }
    
    public static final bl o() {
        return hM.u();
    }
    
    public static ds p() {
        return ds.u;
    }
    
    private void r() {
        this.f = bb.STRING;
        this.w = false;
        this.v = false;
        this.y = false;
        this.n = "";
        this.k = false;
        this.p = Collections.emptyList();
    }
    
    public dy a(final int n) {
        return this.p.get(n);
    }
    
    protected gO a(final dg dg) {
        return new gO(dg, null);
    }
    
    public String a() {
        final Object n = this.n;
        if (n instanceof String) {
            return (String)n;
        }
        final hv hv = (hv)n;
        final String i = hv.i();
        if (hv.b()) {
            this.n = i;
        }
        return i;
    }
    
    public f b(final int n) {
        return this.p.get(n);
    }
    
    public gO b() {
        return e();
    }
    
    public bb c() {
        return this.f;
    }
    
    public int d() {
        return this.p.size();
    }
    
    public boolean f() {
        return (0x2 & this.o) == 0x2;
    }
    
    public hv g() {
        final Object n = this.n;
        if (n instanceof String) {
            return (hv)(this.n = hv.b((String)n));
        }
        return (hv)n;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.j();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.j();
    }
    
    @Override
    public du getParserForType() {
        return ds.t;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean b = dt.b;
        final int g = this.g;
        if (g != -1) {
            return g;
        }
        int n;
        if ((0x1 & this.o) == 0x1) {
            n = 0 + ep.h(1, this.f.getNumber());
        }
        else {
            n = 0;
        }
        if ((0x2 & this.o) == 0x2) {
            n += ep.a(2, this.w);
        }
        if ((0x8 & this.o) == 0x8) {
            n += ep.a(3, this.y);
        }
        if ((0x4 & this.o) == 0x4) {
            n += ep.a(5, this.v);
        }
        if ((0x10 & this.o) == 0x10) {
            n += ep.b(9, this.g());
        }
        if ((0x20 & this.o) == 0x20) {
            n += ep.a(10, this.k);
        }
        int n2 = n;
        while (i < this.p.size()) {
            final int n3 = n2 + ep.f(999, this.p.get(i));
            ++i;
            if (b) {
                return this.g = n3 + this.c() + this.getUnknownFields().getSerializedSize();
            }
            n2 = n3;
        }
        final int n3 = n2;
        return this.g = n3 + this.c() + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.j;
    }
    
    public boolean h() {
        return (0x10 & this.o) == 0x10;
    }
    
    public List i() {
        return this.p;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.g().a(ds.class, gO.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        final byte x = this.x;
        if (x != -1) {
            return x == 1;
        }
        int i = 0;
        while (i < this.d()) {
            if (!this.a(i).isInitialized()) {
                this.x = 0;
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        if (!this.e()) {
            this.x = 0;
            return false;
        }
        this.x = 1;
        return true;
    }
    
    public ds j() {
        return ds.u;
    }
    
    public boolean k() {
        return this.v;
    }
    
    public boolean l() {
        return this.y;
    }
    
    public boolean m() {
        return this.w;
    }
    
    public boolean n() {
        return this.k;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.b();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.b();
    }
    
    public boolean q() {
        return (0x8 & this.o) == 0x8;
    }
    
    public List s() {
        return this.p;
    }
    
    public boolean t() {
        return (0x4 & this.o) == 0x4;
    }
    
    @Override
    public a8 toBuilder() {
        return this.u();
    }
    
    @Override
    public aJ toBuilder() {
        return this.u();
    }
    
    public gO u() {
        return c(this);
    }
    
    public boolean v() {
        return (0x20 & this.o) == 0x20;
    }
    
    public boolean w() {
        return (0x1 & this.o) == 0x1;
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean b = dt.b;
        this.getSerializedSize();
        final ar b2 = this.b();
        if ((0x1 & this.o) == 0x1) {
            ep.g(1, this.f.getNumber());
        }
        if ((0x2 & this.o) == 0x2) {
            ep.b(2, this.w);
        }
        if ((0x8 & this.o) == 0x8) {
            ep.b(3, this.y);
        }
        if ((0x4 & this.o) == 0x4) {
            ep.b(5, this.v);
        }
        if ((0x10 & this.o) == 0x10) {
            ep.c(9, this.g());
        }
        if ((0x20 & this.o) == 0x20) {
            ep.b(10, this.k);
        }
        int n;
        for (int i = 0; i < this.p.size(); i = n) {
            ep.e(999, (ci)this.p.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        b2.a(536870912, ep);
        this.getUnknownFields().writeTo(ep);
    }
}
