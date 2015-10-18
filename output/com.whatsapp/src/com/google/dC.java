// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.InputStream;

public final class dC extends dS implements gI
{
    public static final int g = 2;
    public static du h;
    public static final int i = 4;
    public static final int k = 5;
    public static final int m = 7;
    private static final dC n;
    public static final int o = 1;
    public static final int p = 8;
    public static final int q = 6;
    private static final long serialVersionUID = 0L;
    public static final int v = 3;
    private final ce e;
    private int f;
    private byte j;
    private int l;
    private Object r;
    private Object s;
    private Object t;
    private Object u;
    private d1 w;
    private dU x;
    private int y;
    private ds z;
    
    static {
        dC.h = new hq();
        (n = new dC(true)).f();
    }
    
    private dC(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/google/dS.<init>:()V
        //     8: aload_0        
        //     9: iconst_m1      
        //    10: putfield        com/google/dC.j:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        com/google/dC.l:I
        //    18: aload_0        
        //    19: invokespecial   com/google/dC.f:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            458
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 472
        //               10: 644
        //               18: 637
        //               24: 630
        //               32: 623
        //               40: 616
        //               50: 609
        //               58: 602
        //               66: 372
        //          default: 124
        //        }
        //   124: iload           5
        //   126: istore          10
        //   128: aload_0        
        //   129: aload_1        
        //   130: aload           4
        //   132: aload_2        
        //   133: iload           9
        //   135: invokevirtual   com/google/dC.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   138: istore          31
        //   140: iload           31
        //   142: ifne            454
        //   145: iload_3        
        //   146: ifeq            596
        //   149: iconst_1       
        //   150: istore          10
        //   152: aload_0        
        //   153: iconst_1       
        //   154: aload_0        
        //   155: getfield        com/google/dC.y:I
        //   158: ior            
        //   159: putfield        com/google/dC.y:I
        //   162: aload_0        
        //   163: aload_1        
        //   164: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   167: putfield        com/google/dC.t:Ljava/lang/Object;
        //   170: iload_3        
        //   171: ifeq            454
        //   174: aload_0        
        //   175: bipush          32
        //   177: aload_0        
        //   178: getfield        com/google/dC.y:I
        //   181: ior            
        //   182: putfield        com/google/dC.y:I
        //   185: aload_0        
        //   186: aload_1        
        //   187: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   190: putfield        com/google/dC.r:Ljava/lang/Object;
        //   193: iload_3        
        //   194: ifeq            454
        //   197: aload_0        
        //   198: iconst_2       
        //   199: aload_0        
        //   200: getfield        com/google/dC.y:I
        //   203: ior            
        //   204: putfield        com/google/dC.y:I
        //   207: aload_0        
        //   208: aload_1        
        //   209: invokevirtual   com/google/cL.j:()I
        //   212: putfield        com/google/dC.f:I
        //   215: iload_3        
        //   216: ifeq            454
        //   219: aload_1        
        //   220: invokevirtual   com/google/cL.g:()I
        //   223: istore          14
        //   225: iload           14
        //   227: invokestatic    com/google/dU.valueOf:(I)Lcom/google/dU;
        //   230: astore          15
        //   232: aload           15
        //   234: ifnonnull       250
        //   237: aload           4
        //   239: iconst_4       
        //   240: iload           14
        //   242: invokevirtual   com/google/aY.a:(II)Lcom/google/aY;
        //   245: pop            
        //   246: iload_3        
        //   247: ifeq            454
        //   250: aload_0        
        //   251: iconst_4       
        //   252: aload_0        
        //   253: getfield        com/google/dC.y:I
        //   256: ior            
        //   257: putfield        com/google/dC.y:I
        //   260: aload_0        
        //   261: aload           15
        //   263: putfield        com/google/dC.x:Lcom/google/dU;
        //   266: iload_3        
        //   267: ifeq            454
        //   270: aload_1        
        //   271: invokevirtual   com/google/cL.g:()I
        //   274: istore          17
        //   276: iload           17
        //   278: invokestatic    com/google/d1.valueOf:(I)Lcom/google/d1;
        //   281: astore          18
        //   283: aload           18
        //   285: ifnonnull       301
        //   288: aload           4
        //   290: iconst_5       
        //   291: iload           17
        //   293: invokevirtual   com/google/aY.a:(II)Lcom/google/aY;
        //   296: pop            
        //   297: iload_3        
        //   298: ifeq            454
        //   301: aload_0        
        //   302: bipush          8
        //   304: aload_0        
        //   305: getfield        com/google/dC.y:I
        //   308: ior            
        //   309: putfield        com/google/dC.y:I
        //   312: aload_0        
        //   313: aload           18
        //   315: putfield        com/google/dC.w:Lcom/google/d1;
        //   318: iload_3        
        //   319: ifeq            454
        //   322: aload_0        
        //   323: bipush          16
        //   325: aload_0        
        //   326: getfield        com/google/dC.y:I
        //   329: ior            
        //   330: putfield        com/google/dC.y:I
        //   333: aload_0        
        //   334: aload_1        
        //   335: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   338: putfield        com/google/dC.s:Ljava/lang/Object;
        //   341: iload_3        
        //   342: ifeq            454
        //   345: aload_0        
        //   346: bipush          64
        //   348: aload_0        
        //   349: getfield        com/google/dC.y:I
        //   352: ior            
        //   353: putfield        com/google/dC.y:I
        //   356: aload_0        
        //   357: aload_1        
        //   358: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   361: putfield        com/google/dC.u:Ljava/lang/Object;
        //   364: iload_3        
        //   365: ifeq            454
        //   368: iload           10
        //   370: istore          5
        //   372: sipush          128
        //   375: aload_0        
        //   376: getfield        com/google/dC.y:I
        //   379: iand           
        //   380: sipush          128
        //   383: if_icmpne       590
        //   386: aload_0        
        //   387: getfield        com/google/dC.z:Lcom/google/ds;
        //   390: invokevirtual   com/google/ds.u:()Lcom/google/gO;
        //   393: astore          25
        //   395: aload           25
        //   397: astore          22
        //   399: aload_0        
        //   400: aload_1        
        //   401: getstatic       com/google/ds.t:Lcom/google/du;
        //   404: aload_2        
        //   405: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   408: checkcast       Lcom/google/ds;
        //   411: putfield        com/google/dC.z:Lcom/google/ds;
        //   414: aload           22
        //   416: ifnull          438
        //   419: aload           22
        //   421: aload_0        
        //   422: getfield        com/google/dC.z:Lcom/google/ds;
        //   425: invokevirtual   com/google/gO.a:(Lcom/google/ds;)Lcom/google/gO;
        //   428: pop            
        //   429: aload_0        
        //   430: aload           22
        //   432: invokevirtual   com/google/gO.a:()Lcom/google/ds;
        //   435: putfield        com/google/dC.z:Lcom/google/ds;
        //   438: aload_0        
        //   439: sipush          128
        //   442: aload_0        
        //   443: getfield        com/google/dC.y:I
        //   446: ior            
        //   447: putfield        com/google/dC.y:I
        //   450: iload           5
        //   452: istore          10
        //   454: iload_3        
        //   455: ifeq            583
        //   458: aload_0        
        //   459: aload           4
        //   461: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   464: putfield        com/google/dC.e:Lcom/google/ce;
        //   467: aload_0        
        //   468: invokevirtual   com/google/dC.c:()V
        //   471: return         
        //   472: iload_3        
        //   473: ifeq            596
        //   476: iconst_1       
        //   477: istore          10
        //   479: goto            128
        //   482: astore          30
        //   484: aload           30
        //   486: athrow         
        //   487: astore          8
        //   489: aload           8
        //   491: aload_0        
        //   492: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   495: athrow         
        //   496: astore          7
        //   498: aload_0        
        //   499: aload           4
        //   501: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   504: putfield        com/google/dC.e:Lcom/google/ce;
        //   507: aload_0        
        //   508: invokevirtual   com/google/dC.c:()V
        //   511: aload           7
        //   513: athrow         
        //   514: astore          11
        //   516: aload           11
        //   518: athrow         
        //   519: astore          12
        //   521: aload           12
        //   523: athrow         
        //   524: astore          13
        //   526: aload           13
        //   528: athrow         
        //   529: astore          6
        //   531: new             Lcom/google/bg;
        //   534: dup            
        //   535: aload           6
        //   537: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   540: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   543: aload_0        
        //   544: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   547: athrow         
        //   548: astore          28
        //   550: aload           28
        //   552: athrow         
        //   553: astore          16
        //   555: aload           16
        //   557: athrow         
        //   558: astore          26
        //   560: aload           26
        //   562: athrow         
        //   563: astore          19
        //   565: aload           19
        //   567: athrow         
        //   568: astore          20
        //   570: aload           20
        //   572: athrow         
        //   573: astore          21
        //   575: aload           21
        //   577: athrow         
        //   578: astore          23
        //   580: aload           23
        //   582: athrow         
        //   583: iload           10
        //   585: istore          5
        //   587: goto            30
        //   590: aconst_null    
        //   591: astore          22
        //   593: goto            399
        //   596: iconst_1       
        //   597: istore          10
        //   599: goto            454
        //   602: iload           5
        //   604: istore          10
        //   606: goto            345
        //   609: iload           5
        //   611: istore          10
        //   613: goto            322
        //   616: iload           5
        //   618: istore          10
        //   620: goto            270
        //   623: iload           5
        //   625: istore          10
        //   627: goto            219
        //   630: iload           5
        //   632: istore          10
        //   634: goto            197
        //   637: iload           5
        //   639: istore          10
        //   641: goto            174
        //   644: iload           5
        //   646: istore          10
        //   648: goto            152
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     487    496    Lcom/google/bg;
        //  35     41     529    548    Ljava/io/IOException;
        //  35     41     496    514    Any
        //  128    140    482    487    Lcom/google/bg;
        //  128    140    529    548    Ljava/io/IOException;
        //  128    140    496    514    Any
        //  152    170    514    519    Lcom/google/bg;
        //  152    170    529    548    Ljava/io/IOException;
        //  152    170    496    514    Any
        //  174    193    519    524    Lcom/google/bg;
        //  174    193    529    548    Ljava/io/IOException;
        //  174    193    496    514    Any
        //  197    215    524    529    Lcom/google/bg;
        //  197    215    529    548    Ljava/io/IOException;
        //  197    215    496    514    Any
        //  219    232    487    496    Lcom/google/bg;
        //  219    232    529    548    Ljava/io/IOException;
        //  219    232    496    514    Any
        //  237    246    548    553    Lcom/google/bg;
        //  237    246    529    548    Ljava/io/IOException;
        //  237    246    496    514    Any
        //  250    266    553    558    Lcom/google/bg;
        //  250    266    529    548    Ljava/io/IOException;
        //  250    266    496    514    Any
        //  270    283    487    496    Lcom/google/bg;
        //  270    283    529    548    Ljava/io/IOException;
        //  270    283    496    514    Any
        //  288    297    558    563    Lcom/google/bg;
        //  288    297    529    548    Ljava/io/IOException;
        //  288    297    496    514    Any
        //  301    318    563    568    Lcom/google/bg;
        //  301    318    529    548    Ljava/io/IOException;
        //  301    318    496    514    Any
        //  322    341    568    573    Lcom/google/bg;
        //  322    341    529    548    Ljava/io/IOException;
        //  322    341    496    514    Any
        //  345    364    573    578    Lcom/google/bg;
        //  345    364    529    548    Ljava/io/IOException;
        //  345    364    496    514    Any
        //  372    395    487    496    Lcom/google/bg;
        //  372    395    529    548    Ljava/io/IOException;
        //  372    395    496    514    Any
        //  399    414    578    583    Lcom/google/bg;
        //  399    414    529    548    Ljava/io/IOException;
        //  399    414    496    514    Any
        //  419    438    578    583    Lcom/google/bg;
        //  419    438    529    548    Ljava/io/IOException;
        //  419    438    496    514    Any
        //  438    450    487    496    Lcom/google/bg;
        //  438    450    529    548    Ljava/io/IOException;
        //  438    450    496    514    Any
        //  484    487    487    496    Lcom/google/bg;
        //  484    487    529    548    Ljava/io/IOException;
        //  484    487    496    514    Any
        //  489    496    496    514    Any
        //  516    519    519    524    Lcom/google/bg;
        //  516    519    529    548    Ljava/io/IOException;
        //  516    519    496    514    Any
        //  521    524    524    529    Lcom/google/bg;
        //  521    524    529    548    Ljava/io/IOException;
        //  521    524    496    514    Any
        //  526    529    487    496    Lcom/google/bg;
        //  526    529    529    548    Ljava/io/IOException;
        //  526    529    496    514    Any
        //  531    548    496    514    Any
        //  550    553    553    558    Lcom/google/bg;
        //  550    553    529    548    Ljava/io/IOException;
        //  550    553    496    514    Any
        //  555    558    487    496    Lcom/google/bg;
        //  555    558    529    548    Ljava/io/IOException;
        //  555    558    496    514    Any
        //  560    563    563    568    Lcom/google/bg;
        //  560    563    529    548    Ljava/io/IOException;
        //  560    563    496    514    Any
        //  565    568    568    573    Lcom/google/bg;
        //  565    568    529    548    Ljava/io/IOException;
        //  565    568    496    514    Any
        //  570    573    573    578    Lcom/google/bg;
        //  570    573    529    548    Ljava/io/IOException;
        //  570    573    496    514    Any
        //  575    578    487    496    Lcom/google/bg;
        //  575    578    529    548    Ljava/io/IOException;
        //  575    578    496    514    Any
        //  580    583    487    496    Lcom/google/bg;
        //  580    583    529    548    Ljava/io/IOException;
        //  580    583    496    514    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 290, Size: 290
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    dC(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dC(final fp fp) {
        super(fp);
        this.j = -1;
        this.l = -1;
        this.e = fp.getUnknownFields();
    }
    
    dC(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dC(final boolean b) {
        this.j = -1;
        this.l = -1;
        this.e = ce.d();
    }
    
    public static f7 A() {
        return f7.a();
    }
    
    static int a(final dC dc, final int f) {
        return dc.f = f;
    }
    
    static d1 a(final dC dc, final d1 w) {
        return dc.w = w;
    }
    
    public static dC a(final cL cl) {
        return (dC)dC.h.a(cl);
    }
    
    public static dC a(final cL cl, final fu fu) {
        return (dC)dC.h.a(cl, fu);
    }
    
    public static dC a(final hv hv) {
        return (dC)dC.h.a(hv);
    }
    
    public static dC a(final hv hv, final fu fu) {
        return (dC)dC.h.a(hv, fu);
    }
    
    public static dC a(final InputStream inputStream) {
        return (dC)dC.h.b(inputStream);
    }
    
    public static dC a(final InputStream inputStream, final fu fu) {
        return (dC)dC.h.a(inputStream, fu);
    }
    
    public static dC a(final byte[] array) {
        return (dC)dC.h.a(array);
    }
    
    public static dC a(final byte[] array, final fu fu) {
        return (dC)dC.h.a(array, fu);
    }
    
    static dU a(final dC dc, final dU x) {
        return dc.x = x;
    }
    
    static ds a(final dC dc, final ds z) {
        return dc.z = z;
    }
    
    static Object a(final dC dc) {
        return dc.r;
    }
    
    static Object a(final dC dc, final Object s) {
        return dc.s = s;
    }
    
    static int b(final dC dc, final int y) {
        return dc.y = y;
    }
    
    public static dC b(final InputStream inputStream) {
        return (dC)dC.h.a(inputStream);
    }
    
    public static dC b(final InputStream inputStream, final fu fu) {
        return (dC)dC.h.b(inputStream, fu);
    }
    
    static Object b(final dC dc) {
        return dc.u;
    }
    
    static Object b(final dC dc, final Object t) {
        return dc.t = t;
    }
    
    static Object c(final dC dc) {
        return dc.t;
    }
    
    static Object c(final dC dc, final Object u) {
        return dc.u = u;
    }
    
    static Object d(final dC dc) {
        return dc.s;
    }
    
    static Object d(final dC dc, final Object r) {
        return dc.r = r;
    }
    
    public static f7 e(final dC dc) {
        return A().a(dc);
    }
    
    private void f() {
        this.t = "";
        this.f = 0;
        this.x = dU.LABEL_OPTIONAL;
        this.w = d1.TYPE_DOUBLE;
        this.s = "";
        this.r = "";
        this.u = "";
        this.z = ds.p();
    }
    
    public static dC s() {
        return dC.n;
    }
    
    public static final bl z() {
        return hM.n();
    }
    
    public hv B() {
        final Object t = this.t;
        if (t instanceof String) {
            return (hv)(this.t = hv.b((String)t));
        }
        return (hv)t;
    }
    
    public c a() {
        return this.z;
    }
    
    protected f7 a(final dg dg) {
        return new f7(dg, null);
    }
    
    public boolean b() {
        return (0x2 & this.y) == 0x2;
    }
    
    public String c() {
        final Object u = this.u;
        if (u instanceof String) {
            return (String)u;
        }
        final hv hv = (hv)u;
        final String i = hv.i();
        if (hv.b()) {
            this.u = i;
        }
        return i;
    }
    
    public boolean d() {
        return (0x4 & this.y) == 0x4;
    }
    
    public boolean e() {
        return (0x10 & this.y) == 0x10;
    }
    
    public boolean g() {
        return (0x80 & this.y) == 0x80;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.r();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.r();
    }
    
    @Override
    public du getParserForType() {
        return dC.h;
    }
    
    @Override
    public int getSerializedSize() {
        final int l = this.l;
        if (l != -1) {
            return l;
        }
        final int n = 0x1 & this.y;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.B());
        }
        if ((0x20 & this.y) == 0x20) {
            n2 += ep.b(2, this.j());
        }
        if ((0x2 & this.y) == 0x2) {
            n2 += ep.c(3, this.f);
        }
        if ((0x4 & this.y) == 0x4) {
            n2 += ep.h(4, this.x.getNumber());
        }
        if ((0x8 & this.y) == 0x8) {
            n2 += ep.h(5, this.w.getNumber());
        }
        if ((0x10 & this.y) == 0x10) {
            n2 += ep.b(6, this.p());
        }
        if ((0x40 & this.y) == 0x40) {
            n2 += ep.b(7, this.h());
        }
        if ((0x80 & this.y) == 0x80) {
            n2 += ep.f(8, this.z);
        }
        return this.l = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.e;
    }
    
    public hv h() {
        final Object u = this.u;
        if (u instanceof String) {
            return (hv)(this.u = hv.b((String)u));
        }
        return (hv)u;
    }
    
    public String i() {
        final Object t = this.t;
        if (t instanceof String) {
            return (String)t;
        }
        final hv hv = (hv)t;
        final String i = hv.i();
        if (hv.b()) {
            this.t = i;
        }
        return i;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.s().a(dC.class, f7.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte j = this.j;
        if (j != -1) {
            return j == 1;
        }
        if (this.g() && !this.y().isInitialized()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }
    
    public hv j() {
        final Object r = this.r;
        if (r instanceof String) {
            return (hv)(this.r = hv.b((String)r));
        }
        return (hv)r;
    }
    
    public boolean k() {
        return (0x8 & this.y) == 0x8;
    }
    
    public f7 l() {
        return A();
    }
    
    public String m() {
        final Object r = this.r;
        if (r instanceof String) {
            return (String)r;
        }
        final hv hv = (hv)r;
        final String i = hv.i();
        if (hv.b()) {
            this.r = i;
        }
        return i;
    }
    
    public boolean n() {
        return (0x1 & this.y) == 0x1;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.l();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.l();
    }
    
    public String o() {
        final Object s = this.s;
        if (s instanceof String) {
            return (String)s;
        }
        final hv hv = (hv)s;
        final String i = hv.i();
        if (hv.b()) {
            this.s = i;
        }
        return i;
    }
    
    public hv p() {
        final Object s = this.s;
        if (s instanceof String) {
            return (hv)(this.s = hv.b((String)s));
        }
        return (hv)s;
    }
    
    public int q() {
        return this.f;
    }
    
    public dC r() {
        return dC.n;
    }
    
    public dU t() {
        return this.x;
    }
    
    @Override
    public a8 toBuilder() {
        return this.w();
    }
    
    @Override
    public aJ toBuilder() {
        return this.w();
    }
    
    public d1 u() {
        return this.w;
    }
    
    public boolean v() {
        return (0x40 & this.y) == 0x40;
    }
    
    public f7 w() {
        return e(this);
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.y) == 0x1) {
            ep.c(1, this.B());
        }
        if ((0x20 & this.y) == 0x20) {
            ep.c(2, this.j());
        }
        if ((0x2 & this.y) == 0x2) {
            ep.e(3, this.f);
        }
        if ((0x4 & this.y) == 0x4) {
            ep.g(4, this.x.getNumber());
        }
        if ((0x8 & this.y) == 0x8) {
            ep.g(5, this.w.getNumber());
        }
        if ((0x10 & this.y) == 0x10) {
            ep.c(6, this.p());
        }
        if ((0x40 & this.y) == 0x40) {
            ep.c(7, this.h());
        }
        if ((0x80 & this.y) == 0x80) {
            ep.e(8, this.z);
        }
        this.getUnknownFields().writeTo(ep);
    }
    
    public boolean x() {
        return (0x20 & this.y) == 0x20;
    }
    
    public ds y() {
        return this.z;
    }
}
