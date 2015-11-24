// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class dm extends dS implements aB
{
    public static final int f = 3;
    public static final int g = 1;
    public static final int i = 4;
    public static du q;
    private static final dm s;
    private static final long serialVersionUID = 0L;
    public static final int t = 2;
    private byte e;
    private int h;
    private Object j;
    private List k;
    private int l;
    private final ce m;
    private Object n;
    private List o;
    private int p;
    private int r;
    
    static {
        dm.q = new hf();
        (s = new dm(true)).j();
    }
    
    private dm(final cL p0, final fu p1) {
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
        //     8: invokespecial   com/google/dS.<init>:()V
        //    11: aload_0        
        //    12: iconst_m1      
        //    13: putfield        com/google/dm.r:I
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        com/google/dm.p:I
        //    21: aload_0        
        //    22: iconst_m1      
        //    23: putfield        com/google/dm.e:B
        //    26: aload_0        
        //    27: iconst_m1      
        //    28: putfield        com/google/dm.l:I
        //    31: aload_0        
        //    32: invokespecial   com/google/dm.j:()V
        //    35: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    38: astore          5
        //    40: iconst_0       
        //    41: istore          6
        //    43: iload_3        
        //    44: ifne            456
        //    47: aload_1        
        //    48: invokevirtual   com/google/cL.a:()I
        //    51: istore          14
        //    53: iload           14
        //    55: lookupswitch {
        //                0: 508
        //                8: 144
        //               10: 191
        //               16: 277
        //               18: 324
        //               26: 410
        //               34: 433
        //          default: 120
        //        }
        //   120: aload_0        
        //   121: aload_1        
        //   122: aload           5
        //   124: aload_2        
        //   125: iload           14
        //   127: invokevirtual   com/google/dm.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   130: istore          16
        //   132: iload           16
        //   134: ifne            451
        //   137: iload           4
        //   139: ifeq            652
        //   142: iconst_1       
        //   143: istore_3       
        //   144: iload           6
        //   146: iconst_1       
        //   147: iand           
        //   148: iconst_1       
        //   149: if_icmpeq       169
        //   152: aload_0        
        //   153: new             Ljava/util/ArrayList;
        //   156: dup            
        //   157: invokespecial   java/util/ArrayList.<init>:()V
        //   160: putfield        com/google/dm.o:Ljava/util/List;
        //   163: iload           6
        //   165: iconst_1       
        //   166: ior            
        //   167: istore          6
        //   169: aload_0        
        //   170: getfield        com/google/dm.o:Ljava/util/List;
        //   173: aload_1        
        //   174: invokevirtual   com/google/cL.j:()I
        //   177: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   180: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   185: pop            
        //   186: iload           4
        //   188: ifeq            451
        //   191: aload_1        
        //   192: aload_1        
        //   193: invokevirtual   com/google/cL.i:()I
        //   196: invokevirtual   com/google/cL.c:(I)I
        //   199: istore          18
        //   201: iload           6
        //   203: iconst_1       
        //   204: iand           
        //   205: iconst_1       
        //   206: if_icmpeq       237
        //   209: aload_1        
        //   210: invokevirtual   com/google/cL.s:()I
        //   213: istore          29
        //   215: iload           29
        //   217: ifle            237
        //   220: aload_0        
        //   221: new             Ljava/util/ArrayList;
        //   224: dup            
        //   225: invokespecial   java/util/ArrayList.<init>:()V
        //   228: putfield        com/google/dm.o:Ljava/util/List;
        //   231: iload           6
        //   233: iconst_1       
        //   234: ior            
        //   235: istore          6
        //   237: aload_1        
        //   238: invokevirtual   com/google/cL.s:()I
        //   241: ifle            266
        //   244: aload_0        
        //   245: getfield        com/google/dm.o:Ljava/util/List;
        //   248: aload_1        
        //   249: invokevirtual   com/google/cL.j:()I
        //   252: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   255: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   260: pop            
        //   261: iload           4
        //   263: ifeq            237
        //   266: aload_1        
        //   267: iload           18
        //   269: invokevirtual   com/google/cL.a:(I)V
        //   272: iload           4
        //   274: ifeq            451
        //   277: iload           6
        //   279: iconst_2       
        //   280: iand           
        //   281: iconst_2       
        //   282: if_icmpeq       302
        //   285: aload_0        
        //   286: new             Ljava/util/ArrayList;
        //   289: dup            
        //   290: invokespecial   java/util/ArrayList.<init>:()V
        //   293: putfield        com/google/dm.k:Ljava/util/List;
        //   296: iload           6
        //   298: iconst_2       
        //   299: ior            
        //   300: istore          6
        //   302: aload_0        
        //   303: getfield        com/google/dm.k:Ljava/util/List;
        //   306: aload_1        
        //   307: invokevirtual   com/google/cL.j:()I
        //   310: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   313: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   318: pop            
        //   319: iload           4
        //   321: ifeq            451
        //   324: aload_1        
        //   325: aload_1        
        //   326: invokevirtual   com/google/cL.i:()I
        //   329: invokevirtual   com/google/cL.c:(I)I
        //   332: istore          21
        //   334: iload           6
        //   336: iconst_2       
        //   337: iand           
        //   338: iconst_2       
        //   339: if_icmpeq       370
        //   342: aload_1        
        //   343: invokevirtual   com/google/cL.s:()I
        //   346: istore          26
        //   348: iload           26
        //   350: ifle            370
        //   353: aload_0        
        //   354: new             Ljava/util/ArrayList;
        //   357: dup            
        //   358: invokespecial   java/util/ArrayList.<init>:()V
        //   361: putfield        com/google/dm.k:Ljava/util/List;
        //   364: iload           6
        //   366: iconst_2       
        //   367: ior            
        //   368: istore          6
        //   370: aload_1        
        //   371: invokevirtual   com/google/cL.s:()I
        //   374: ifle            399
        //   377: aload_0        
        //   378: getfield        com/google/dm.k:Ljava/util/List;
        //   381: aload_1        
        //   382: invokevirtual   com/google/cL.j:()I
        //   385: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   388: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   393: pop            
        //   394: iload           4
        //   396: ifeq            370
        //   399: aload_1        
        //   400: iload           21
        //   402: invokevirtual   com/google/cL.a:(I)V
        //   405: iload           4
        //   407: ifeq            451
        //   410: aload_0        
        //   411: iconst_1       
        //   412: aload_0        
        //   413: getfield        com/google/dm.h:I
        //   416: ior            
        //   417: putfield        com/google/dm.h:I
        //   420: aload_0        
        //   421: aload_1        
        //   422: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   425: putfield        com/google/dm.j:Ljava/lang/Object;
        //   428: iload           4
        //   430: ifeq            451
        //   433: aload_0        
        //   434: iconst_2       
        //   435: aload_0        
        //   436: getfield        com/google/dm.h:I
        //   439: ior            
        //   440: putfield        com/google/dm.h:I
        //   443: aload_0        
        //   444: aload_1        
        //   445: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   448: putfield        com/google/dm.n:Ljava/lang/Object;
        //   451: iload           4
        //   453: ifeq            43
        //   456: iload           6
        //   458: iconst_1       
        //   459: iand           
        //   460: iconst_1       
        //   461: if_icmpne       475
        //   464: aload_0        
        //   465: aload_0        
        //   466: getfield        com/google/dm.o:Ljava/util/List;
        //   469: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   472: putfield        com/google/dm.o:Ljava/util/List;
        //   475: iload           6
        //   477: iconst_2       
        //   478: iand           
        //   479: iconst_2       
        //   480: if_icmpne       494
        //   483: aload_0        
        //   484: aload_0        
        //   485: getfield        com/google/dm.k:Ljava/util/List;
        //   488: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   491: putfield        com/google/dm.k:Ljava/util/List;
        //   494: aload_0        
        //   495: aload           5
        //   497: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   500: putfield        com/google/dm.m:Lcom/google/ce;
        //   503: aload_0        
        //   504: invokevirtual   com/google/dm.c:()V
        //   507: return         
        //   508: iload           4
        //   510: ifeq            652
        //   513: iconst_1       
        //   514: istore_3       
        //   515: goto            120
        //   518: astore          15
        //   520: aload           15
        //   522: athrow         
        //   523: astore          13
        //   525: aload           13
        //   527: aload_0        
        //   528: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   531: athrow         
        //   532: astore          10
        //   534: iload           6
        //   536: iconst_1       
        //   537: iand           
        //   538: iconst_1       
        //   539: if_icmpne       553
        //   542: aload_0        
        //   543: aload_0        
        //   544: getfield        com/google/dm.o:Ljava/util/List;
        //   547: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   550: putfield        com/google/dm.o:Ljava/util/List;
        //   553: iload           6
        //   555: iconst_2       
        //   556: iand           
        //   557: iconst_2       
        //   558: if_icmpne       572
        //   561: aload_0        
        //   562: aload_0        
        //   563: getfield        com/google/dm.k:Ljava/util/List;
        //   566: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   569: putfield        com/google/dm.k:Ljava/util/List;
        //   572: aload_0        
        //   573: aload           5
        //   575: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   578: putfield        com/google/dm.m:Lcom/google/ce;
        //   581: aload_0        
        //   582: invokevirtual   com/google/dm.c:()V
        //   585: aload           10
        //   587: athrow         
        //   588: astore          28
        //   590: aload           28
        //   592: athrow         
        //   593: astore          9
        //   595: new             Lcom/google/bg;
        //   598: dup            
        //   599: aload           9
        //   601: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   604: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   607: aload_0        
        //   608: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   611: athrow         
        //   612: astore          19
        //   614: aload           19
        //   616: athrow         
        //   617: astore          25
        //   619: aload           25
        //   621: athrow         
        //   622: astore          22
        //   624: aload           22
        //   626: athrow         
        //   627: astore          23
        //   629: aload           23
        //   631: athrow         
        //   632: astore          12
        //   634: aload           12
        //   636: athrow         
        //   637: astore          11
        //   639: aload           11
        //   641: athrow         
        //   642: astore          8
        //   644: aload           8
        //   646: athrow         
        //   647: astore          7
        //   649: aload           7
        //   651: athrow         
        //   652: iconst_1       
        //   653: istore_3       
        //   654: goto            451
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  47     53     523    532    Lcom/google/bg;
        //  47     53     593    612    Ljava/io/IOException;
        //  47     53     532    642    Any
        //  120    132    518    523    Lcom/google/bg;
        //  120    132    593    612    Ljava/io/IOException;
        //  120    132    532    642    Any
        //  152    163    523    532    Lcom/google/bg;
        //  152    163    593    612    Ljava/io/IOException;
        //  152    163    532    642    Any
        //  169    186    523    532    Lcom/google/bg;
        //  169    186    593    612    Ljava/io/IOException;
        //  169    186    532    642    Any
        //  191    201    523    532    Lcom/google/bg;
        //  191    201    593    612    Ljava/io/IOException;
        //  191    201    532    642    Any
        //  209    215    588    593    Lcom/google/bg;
        //  209    215    593    612    Ljava/io/IOException;
        //  209    215    532    642    Any
        //  220    231    523    532    Lcom/google/bg;
        //  220    231    593    612    Ljava/io/IOException;
        //  220    231    532    642    Any
        //  237    261    523    532    Lcom/google/bg;
        //  237    261    593    612    Ljava/io/IOException;
        //  237    261    532    642    Any
        //  266    272    612    617    Lcom/google/bg;
        //  266    272    593    612    Ljava/io/IOException;
        //  266    272    532    642    Any
        //  285    296    523    532    Lcom/google/bg;
        //  285    296    593    612    Ljava/io/IOException;
        //  285    296    532    642    Any
        //  302    319    523    532    Lcom/google/bg;
        //  302    319    593    612    Ljava/io/IOException;
        //  302    319    532    642    Any
        //  324    334    523    532    Lcom/google/bg;
        //  324    334    593    612    Ljava/io/IOException;
        //  324    334    532    642    Any
        //  342    348    617    622    Lcom/google/bg;
        //  342    348    593    612    Ljava/io/IOException;
        //  342    348    532    642    Any
        //  353    364    523    532    Lcom/google/bg;
        //  353    364    593    612    Ljava/io/IOException;
        //  353    364    532    642    Any
        //  370    394    523    532    Lcom/google/bg;
        //  370    394    593    612    Ljava/io/IOException;
        //  370    394    532    642    Any
        //  399    405    622    627    Lcom/google/bg;
        //  399    405    593    612    Ljava/io/IOException;
        //  399    405    532    642    Any
        //  410    428    622    627    Lcom/google/bg;
        //  410    428    593    612    Ljava/io/IOException;
        //  410    428    532    642    Any
        //  433    451    627    632    Lcom/google/bg;
        //  433    451    593    612    Ljava/io/IOException;
        //  433    451    532    642    Any
        //  464    475    642    647    Lcom/google/bg;
        //  483    494    647    652    Lcom/google/bg;
        //  520    523    523    532    Lcom/google/bg;
        //  520    523    593    612    Ljava/io/IOException;
        //  520    523    532    642    Any
        //  525    532    532    642    Any
        //  542    553    632    637    Lcom/google/bg;
        //  561    572    637    642    Lcom/google/bg;
        //  590    593    523    532    Lcom/google/bg;
        //  590    593    593    612    Ljava/io/IOException;
        //  590    593    532    642    Any
        //  595    612    532    642    Any
        //  614    617    523    532    Lcom/google/bg;
        //  614    617    593    612    Ljava/io/IOException;
        //  614    617    532    642    Any
        //  619    622    523    532    Lcom/google/bg;
        //  619    622    593    612    Ljava/io/IOException;
        //  619    622    532    642    Any
        //  624    627    627    632    Lcom/google/bg;
        //  624    627    593    612    Ljava/io/IOException;
        //  624    627    532    642    Any
        //  629    632    523    532    Lcom/google/bg;
        //  629    632    593    612    Ljava/io/IOException;
        //  629    632    532    642    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 304, Size: 304
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    dm(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dm(final fp fp) {
        super(fp);
        this.r = -1;
        this.p = -1;
        this.e = -1;
        this.l = -1;
        this.m = fp.getUnknownFields();
    }
    
    dm(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dm(final boolean b) {
        this.r = -1;
        this.p = -1;
        this.e = -1;
        this.l = -1;
        this.m = ce.d();
    }
    
    static int a(final dm dm, final int h) {
        return dm.h = h;
    }
    
    public static dm a(final cL cl) {
        return (dm)dm.q.a(cl);
    }
    
    public static dm a(final cL cl, final fu fu) {
        return (dm)dm.q.a(cl, fu);
    }
    
    public static dm a(final hv hv) {
        return (dm)dm.q.a(hv);
    }
    
    public static dm a(final hv hv, final fu fu) {
        return (dm)dm.q.a(hv, fu);
    }
    
    public static dm a(final InputStream inputStream) {
        return (dm)dm.q.b(inputStream);
    }
    
    public static dm a(final InputStream inputStream, final fu fu) {
        return (dm)dm.q.a(inputStream, fu);
    }
    
    public static dm a(final byte[] array) {
        return (dm)dm.q.a(array);
    }
    
    public static dm a(final byte[] array, final fu fu) {
        return (dm)dm.q.a(array, fu);
    }
    
    static Object a(final dm dm, final Object j) {
        return dm.j = j;
    }
    
    static List a(final dm dm) {
        return dm.o;
    }
    
    static List a(final dm dm, final List k) {
        return dm.k = k;
    }
    
    public static dm b(final InputStream inputStream) {
        return (dm)dm.q.a(inputStream);
    }
    
    public static dm b(final InputStream inputStream, final fu fu) {
        return (dm)dm.q.b(inputStream, fu);
    }
    
    static Object b(final dm dm) {
        return dm.n;
    }
    
    static Object b(final dm dm, final Object n) {
        return dm.n = n;
    }
    
    static List b(final dm dm, final List o) {
        return dm.o = o;
    }
    
    public static gS c(final dm dm) {
        return m().a(dm);
    }
    
    public static dm d() {
        return dm.s;
    }
    
    static List d(final dm dm) {
        return dm.k;
    }
    
    static Object e(final dm dm) {
        return dm.j;
    }
    
    private void j() {
        this.o = Collections.emptyList();
        this.k = Collections.emptyList();
        this.j = "";
        this.n = "";
    }
    
    public static gS m() {
        return gS.a();
    }
    
    public static final bl n() {
        return hM.o();
    }
    
    public int a(final int n) {
        return this.o.get(n);
    }
    
    protected gS a(final dg dg) {
        return new gS(dg, null);
    }
    
    public hv a() {
        final Object n = this.n;
        if (n instanceof String) {
            return (hv)(this.n = hv.b((String)n));
        }
        return (hv)n;
    }
    
    public int b(final int n) {
        return this.k.get(n);
    }
    
    public gS b() {
        return m();
    }
    
    public List c() {
        return this.o;
    }
    
    public String e() {
        final Object j = this.j;
        if (j instanceof String) {
            return (String)j;
        }
        final hv hv = (hv)j;
        final String i = hv.i();
        if (hv.b()) {
            this.j = i;
        }
        return i;
    }
    
    public int f() {
        return this.o.size();
    }
    
    public boolean g() {
        return (0x2 & this.h) == 0x2;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.q();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.q();
    }
    
    @Override
    public du getParserForType() {
        return dm.q;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean b = dt.b;
        final int l = this.l;
        if (l != -1) {
            return l;
        }
        int j = 0;
        int r = 0;
        while (j < this.o.size()) {
            r += ep.c(this.o.get(j));
            final int n = j + 1;
            if (b) {
                break;
            }
            j = n;
        }
        final int n2 = 0 + r;
        int n3;
        if (!this.c().isEmpty()) {
            n3 = n2 + 1 + ep.c(r);
        }
        else {
            n3 = n2;
        }
        this.r = r;
        int n4 = 0;
        while (true) {
            while (i < this.k.size()) {
                final int p = n4 + ep.c(this.k.get(i));
                ++i;
                if (b) {
                    int n5 = n3 + p;
                    if (!this.h().isEmpty()) {
                        n5 = n5 + 1 + ep.c(p);
                    }
                    this.p = p;
                    if ((0x1 & this.h) == 0x1) {
                        n5 += ep.b(3, this.l());
                    }
                    if ((0x2 & this.h) == 0x2) {
                        n5 += ep.b(4, this.a());
                    }
                    return this.l = n5 + this.getUnknownFields().getSerializedSize();
                }
                n4 = p;
            }
            final int p = n4;
            continue;
        }
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.m;
    }
    
    public List h() {
        return this.k;
    }
    
    public boolean i() {
        return (0x1 & this.h) == 0x1;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.L().a(dm.class, gS.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte e = this.e;
        if (e != -1) {
            return e == 1;
        }
        this.e = 1;
        return true;
    }
    
    public String k() {
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
    
    public hv l() {
        final Object j = this.j;
        if (j instanceof String) {
            return (hv)(this.j = hv.b((String)j));
        }
        return (hv)j;
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
    
    public int o() {
        return this.k.size();
    }
    
    public gS p() {
        return c(this);
    }
    
    public dm q() {
        return dm.s;
    }
    
    @Override
    public a8 toBuilder() {
        return this.p();
    }
    
    @Override
    public aJ toBuilder() {
        return this.p();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean b = dt.b;
        this.getSerializedSize();
        if (this.c().size() > 0) {
            ep.q(10);
            ep.q(this.r);
        }
        int n;
        for (int i = 0; i < this.o.size(); i = n) {
            ep.m((int)this.o.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        final int size = this.h().size();
        int j = 0;
        if (size > 0) {
            ep.q(18);
            ep.q(this.p);
        }
        while (j < this.k.size()) {
            ep.m((int)this.k.get(j));
            ++j;
            if (b) {
                break;
            }
        }
        if ((0x1 & this.h) == 0x1) {
            ep.c(3, this.l());
        }
        if ((0x2 & this.h) == 0x2) {
            ep.c(4, this.a());
        }
        this.getUnknownFields().writeTo(ep);
    }
}
