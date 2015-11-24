// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class dZ extends df implements fa
{
    public static final int A = 20;
    public static final int C = 10;
    public static final int E = 999;
    public static final int i = 17;
    public static final int k = 16;
    public static final int l = 9;
    public static final int n = 8;
    public static final int o = 11;
    private static final long serialVersionUID = 0L;
    public static final int t = 18;
    public static final int u = 1;
    public static du w;
    private static final dZ y;
    private boolean B;
    private int D;
    private List f;
    private byte g;
    private boolean h;
    private boolean j;
    private cF m;
    private boolean p;
    private Object q;
    private boolean r;
    private Object s;
    private final ce v;
    private Object x;
    private int z;
    
    static {
        dZ.w = new hl();
        (y = new dZ(true)).d();
    }
    
    private dZ(final cL p0, final fu p1) {
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
        //    13: putfield        com/google/dZ.g:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        com/google/dZ.D:I
        //    21: aload_0        
        //    22: invokespecial   com/google/dZ.d:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            468
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 505
        //               10: 168
        //               66: 191
        //               72: 214
        //               80: 269
        //               90: 292
        //              128: 316
        //              136: 340
        //              144: 365
        //              160: 390
        //             7994: 414
        //          default: 144
        //        }
        //   144: aload_0        
        //   145: aload_1        
        //   146: aload           5
        //   148: aload_2        
        //   149: iload           12
        //   151: invokevirtual   com/google/dZ.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   154: istore          14
        //   156: iload           14
        //   158: ifne            463
        //   161: iload           4
        //   163: ifeq            654
        //   166: iconst_1       
        //   167: istore_3       
        //   168: aload_0        
        //   169: iconst_1       
        //   170: aload_0        
        //   171: getfield        com/google/dZ.z:I
        //   174: ior            
        //   175: putfield        com/google/dZ.z:I
        //   178: aload_0        
        //   179: aload_1        
        //   180: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   183: putfield        com/google/dZ.s:Ljava/lang/Object;
        //   186: iload           4
        //   188: ifeq            463
        //   191: aload_0        
        //   192: iconst_2       
        //   193: aload_0        
        //   194: getfield        com/google/dZ.z:I
        //   197: ior            
        //   198: putfield        com/google/dZ.z:I
        //   201: aload_0        
        //   202: aload_1        
        //   203: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   206: putfield        com/google/dZ.x:Ljava/lang/Object;
        //   209: iload           4
        //   211: ifeq            463
        //   214: aload_1        
        //   215: invokevirtual   com/google/cL.g:()I
        //   218: istore          17
        //   220: iload           17
        //   222: invokestatic    com/google/cF.valueOf:(I)Lcom/google/cF;
        //   225: astore          18
        //   227: aload           18
        //   229: ifnonnull       247
        //   232: aload           5
        //   234: bipush          9
        //   236: iload           17
        //   238: invokevirtual   com/google/aY.a:(II)Lcom/google/aY;
        //   241: pop            
        //   242: iload           4
        //   244: ifeq            463
        //   247: aload_0        
        //   248: bipush          16
        //   250: aload_0        
        //   251: getfield        com/google/dZ.z:I
        //   254: ior            
        //   255: putfield        com/google/dZ.z:I
        //   258: aload_0        
        //   259: aload           18
        //   261: putfield        com/google/dZ.m:Lcom/google/cF;
        //   264: iload           4
        //   266: ifeq            463
        //   269: aload_0        
        //   270: iconst_4       
        //   271: aload_0        
        //   272: getfield        com/google/dZ.z:I
        //   275: ior            
        //   276: putfield        com/google/dZ.z:I
        //   279: aload_0        
        //   280: aload_1        
        //   281: invokevirtual   com/google/cL.x:()Z
        //   284: putfield        com/google/dZ.h:Z
        //   287: iload           4
        //   289: ifeq            463
        //   292: aload_0        
        //   293: bipush          32
        //   295: aload_0        
        //   296: getfield        com/google/dZ.z:I
        //   299: ior            
        //   300: putfield        com/google/dZ.z:I
        //   303: aload_0        
        //   304: aload_1        
        //   305: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   308: putfield        com/google/dZ.q:Ljava/lang/Object;
        //   311: iload           4
        //   313: ifeq            463
        //   316: aload_0        
        //   317: bipush          64
        //   319: aload_0        
        //   320: getfield        com/google/dZ.z:I
        //   323: ior            
        //   324: putfield        com/google/dZ.z:I
        //   327: aload_0        
        //   328: aload_1        
        //   329: invokevirtual   com/google/cL.x:()Z
        //   332: putfield        com/google/dZ.r:Z
        //   335: iload           4
        //   337: ifeq            463
        //   340: aload_0        
        //   341: sipush          128
        //   344: aload_0        
        //   345: getfield        com/google/dZ.z:I
        //   348: ior            
        //   349: putfield        com/google/dZ.z:I
        //   352: aload_0        
        //   353: aload_1        
        //   354: invokevirtual   com/google/cL.x:()Z
        //   357: putfield        com/google/dZ.j:Z
        //   360: iload           4
        //   362: ifeq            463
        //   365: aload_0        
        //   366: sipush          256
        //   369: aload_0        
        //   370: getfield        com/google/dZ.z:I
        //   373: ior            
        //   374: putfield        com/google/dZ.z:I
        //   377: aload_0        
        //   378: aload_1        
        //   379: invokevirtual   com/google/cL.x:()Z
        //   382: putfield        com/google/dZ.B:Z
        //   385: iload           4
        //   387: ifeq            463
        //   390: aload_0        
        //   391: bipush          8
        //   393: aload_0        
        //   394: getfield        com/google/dZ.z:I
        //   397: ior            
        //   398: putfield        com/google/dZ.z:I
        //   401: aload_0        
        //   402: aload_1        
        //   403: invokevirtual   com/google/cL.x:()Z
        //   406: putfield        com/google/dZ.p:Z
        //   409: iload           4
        //   411: ifeq            463
        //   414: iload           6
        //   416: sipush          512
        //   419: iand           
        //   420: sipush          512
        //   423: if_icmpeq       445
        //   426: aload_0        
        //   427: new             Ljava/util/ArrayList;
        //   430: dup            
        //   431: invokespecial   java/util/ArrayList.<init>:()V
        //   434: putfield        com/google/dZ.f:Ljava/util/List;
        //   437: iload           6
        //   439: sipush          512
        //   442: ior            
        //   443: istore          6
        //   445: aload_0        
        //   446: getfield        com/google/dZ.f:Ljava/util/List;
        //   449: aload_1        
        //   450: getstatic       com/google/dy.k:Lcom/google/du;
        //   453: aload_2        
        //   454: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   457: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   462: pop            
        //   463: iload           4
        //   465: ifeq            33
        //   468: iload           6
        //   470: sipush          512
        //   473: iand           
        //   474: sipush          512
        //   477: if_icmpne       491
        //   480: aload_0        
        //   481: aload_0        
        //   482: getfield        com/google/dZ.f:Ljava/util/List;
        //   485: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   488: putfield        com/google/dZ.f:Ljava/util/List;
        //   491: aload_0        
        //   492: aload           5
        //   494: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   497: putfield        com/google/dZ.v:Lcom/google/ce;
        //   500: aload_0        
        //   501: invokevirtual   com/google/dZ.c:()V
        //   504: return         
        //   505: iload           4
        //   507: ifeq            654
        //   510: iconst_1       
        //   511: istore_3       
        //   512: goto            144
        //   515: astore          13
        //   517: aload           13
        //   519: athrow         
        //   520: astore          11
        //   522: aload           11
        //   524: aload_0        
        //   525: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   528: athrow         
        //   529: astore          9
        //   531: iload           6
        //   533: sipush          512
        //   536: iand           
        //   537: sipush          512
        //   540: if_icmpne       554
        //   543: aload_0        
        //   544: aload_0        
        //   545: getfield        com/google/dZ.f:Ljava/util/List;
        //   548: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   551: putfield        com/google/dZ.f:Ljava/util/List;
        //   554: aload_0        
        //   555: aload           5
        //   557: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   560: putfield        com/google/dZ.v:Lcom/google/ce;
        //   563: aload_0        
        //   564: invokevirtual   com/google/dZ.c:()V
        //   567: aload           9
        //   569: athrow         
        //   570: astore          15
        //   572: aload           15
        //   574: athrow         
        //   575: astore          16
        //   577: aload           16
        //   579: athrow         
        //   580: astore          8
        //   582: new             Lcom/google/bg;
        //   585: dup            
        //   586: aload           8
        //   588: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   591: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   594: aload_0        
        //   595: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   598: athrow         
        //   599: astore          28
        //   601: aload           28
        //   603: athrow         
        //   604: astore          19
        //   606: aload           19
        //   608: athrow         
        //   609: astore          20
        //   611: aload           20
        //   613: athrow         
        //   614: astore          21
        //   616: aload           21
        //   618: athrow         
        //   619: astore          22
        //   621: aload           22
        //   623: athrow         
        //   624: astore          23
        //   626: aload           23
        //   628: athrow         
        //   629: astore          24
        //   631: aload           24
        //   633: athrow         
        //   634: astore          25
        //   636: aload           25
        //   638: athrow         
        //   639: astore          26
        //   641: aload           26
        //   643: athrow         
        //   644: astore          10
        //   646: aload           10
        //   648: athrow         
        //   649: astore          7
        //   651: aload           7
        //   653: athrow         
        //   654: iconst_1       
        //   655: istore_3       
        //   656: goto            463
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     520    529    Lcom/google/bg;
        //  37     43     580    599    Ljava/io/IOException;
        //  37     43     529    570    Any
        //  144    156    515    520    Lcom/google/bg;
        //  144    156    580    599    Ljava/io/IOException;
        //  144    156    529    570    Any
        //  168    186    570    575    Lcom/google/bg;
        //  168    186    580    599    Ljava/io/IOException;
        //  168    186    529    570    Any
        //  191    209    575    580    Lcom/google/bg;
        //  191    209    580    599    Ljava/io/IOException;
        //  191    209    529    570    Any
        //  214    227    520    529    Lcom/google/bg;
        //  214    227    580    599    Ljava/io/IOException;
        //  214    227    529    570    Any
        //  232    242    599    604    Lcom/google/bg;
        //  232    242    580    599    Ljava/io/IOException;
        //  232    242    529    570    Any
        //  247    264    604    609    Lcom/google/bg;
        //  247    264    580    599    Ljava/io/IOException;
        //  247    264    529    570    Any
        //  269    287    609    614    Lcom/google/bg;
        //  269    287    580    599    Ljava/io/IOException;
        //  269    287    529    570    Any
        //  292    311    614    619    Lcom/google/bg;
        //  292    311    580    599    Ljava/io/IOException;
        //  292    311    529    570    Any
        //  316    335    619    624    Lcom/google/bg;
        //  316    335    580    599    Ljava/io/IOException;
        //  316    335    529    570    Any
        //  340    360    624    629    Lcom/google/bg;
        //  340    360    580    599    Ljava/io/IOException;
        //  340    360    529    570    Any
        //  365    385    629    634    Lcom/google/bg;
        //  365    385    580    599    Ljava/io/IOException;
        //  365    385    529    570    Any
        //  390    409    634    644    Lcom/google/bg;
        //  390    409    580    599    Ljava/io/IOException;
        //  390    409    529    570    Any
        //  426    437    520    529    Lcom/google/bg;
        //  426    437    580    599    Ljava/io/IOException;
        //  426    437    529    570    Any
        //  445    463    520    529    Lcom/google/bg;
        //  445    463    580    599    Ljava/io/IOException;
        //  445    463    529    570    Any
        //  480    491    649    654    Lcom/google/bg;
        //  517    520    520    529    Lcom/google/bg;
        //  517    520    580    599    Ljava/io/IOException;
        //  517    520    529    570    Any
        //  522    529    529    570    Any
        //  543    554    644    649    Lcom/google/bg;
        //  572    575    575    580    Lcom/google/bg;
        //  572    575    580    599    Ljava/io/IOException;
        //  572    575    529    570    Any
        //  577    580    520    529    Lcom/google/bg;
        //  577    580    580    599    Ljava/io/IOException;
        //  577    580    529    570    Any
        //  582    599    529    570    Any
        //  601    604    604    609    Lcom/google/bg;
        //  601    604    580    599    Ljava/io/IOException;
        //  601    604    529    570    Any
        //  606    609    609    614    Lcom/google/bg;
        //  606    609    580    599    Ljava/io/IOException;
        //  606    609    529    570    Any
        //  611    614    614    619    Lcom/google/bg;
        //  611    614    580    599    Ljava/io/IOException;
        //  611    614    529    570    Any
        //  616    619    619    624    Lcom/google/bg;
        //  616    619    580    599    Ljava/io/IOException;
        //  616    619    529    570    Any
        //  621    624    624    629    Lcom/google/bg;
        //  621    624    580    599    Ljava/io/IOException;
        //  621    624    529    570    Any
        //  626    629    629    634    Lcom/google/bg;
        //  626    629    580    599    Ljava/io/IOException;
        //  626    629    529    570    Any
        //  631    634    634    644    Lcom/google/bg;
        //  631    634    580    599    Ljava/io/IOException;
        //  631    634    529    570    Any
        //  636    639    639    644    Lcom/google/bg;
        //  636    639    580    599    Ljava/io/IOException;
        //  636    639    529    570    Any
        //  641    644    520    529    Lcom/google/bg;
        //  641    644    580    599    Ljava/io/IOException;
        //  641    644    529    570    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 284, Size: 284
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    dZ(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dZ(final gq gq) {
        super(gq);
        this.g = -1;
        this.D = -1;
        this.v = gq.getUnknownFields();
    }
    
    dZ(final gq gq, final fM fm) {
        this(gq);
    }
    
    private dZ(final boolean b) {
        this.g = -1;
        this.D = -1;
        this.v = ce.d();
    }
    
    static int a(final dZ dz, final int z) {
        return dz.z = z;
    }
    
    static cF a(final dZ dz, final cF m) {
        return dz.m = m;
    }
    
    public static dZ a(final cL cl) {
        return (dZ)dZ.w.a(cl);
    }
    
    public static dZ a(final cL cl, final fu fu) {
        return (dZ)dZ.w.a(cl, fu);
    }
    
    public static dZ a(final hv hv) {
        return (dZ)dZ.w.a(hv);
    }
    
    public static dZ a(final hv hv, final fu fu) {
        return (dZ)dZ.w.a(hv, fu);
    }
    
    public static dZ a(final InputStream inputStream) {
        return (dZ)dZ.w.a(inputStream);
    }
    
    public static dZ a(final InputStream inputStream, final fu fu) {
        return (dZ)dZ.w.a(inputStream, fu);
    }
    
    public static dZ a(final byte[] array) {
        return (dZ)dZ.w.a(array);
    }
    
    public static dZ a(final byte[] array, final fu fu) {
        return (dZ)dZ.w.a(array, fu);
    }
    
    static Object a(final dZ dz, final Object x) {
        return dz.x = x;
    }
    
    static List a(final dZ dz) {
        return dz.f;
    }
    
    static List a(final dZ dz, final List f) {
        return dz.f = f;
    }
    
    static boolean a(final dZ dz, final boolean h) {
        return dz.h = h;
    }
    
    public static dZ b(final InputStream inputStream) {
        return (dZ)dZ.w.b(inputStream);
    }
    
    public static dZ b(final InputStream inputStream, final fu fu) {
        return (dZ)dZ.w.b(inputStream, fu);
    }
    
    public static gl b(final dZ dz) {
        return r().a(dz);
    }
    
    static Object b(final dZ dz, final Object q) {
        return dz.q = q;
    }
    
    static boolean b(final dZ dz, final boolean b) {
        return dz.B = b;
    }
    
    static Object c(final dZ dz) {
        return dz.x;
    }
    
    static Object c(final dZ dz, final Object s) {
        return dz.s = s;
    }
    
    static boolean c(final dZ dz, final boolean p2) {
        return dz.p = p2;
    }
    
    static Object d(final dZ dz) {
        return dz.s;
    }
    
    private void d() {
        this.s = "";
        this.x = "";
        this.h = false;
        this.p = false;
        this.m = cF.SPEED;
        this.q = "";
        this.r = false;
        this.j = false;
        this.B = false;
        this.f = Collections.emptyList();
    }
    
    static boolean d(final dZ dz, final boolean r) {
        return dz.r = r;
    }
    
    static Object e(final dZ dz) {
        return dz.q;
    }
    
    static boolean e(final dZ dz, final boolean j) {
        return dz.j = j;
    }
    
    public static gl r() {
        return gl.d();
    }
    
    public static final bl s() {
        return hM.y();
    }
    
    public static dZ x() {
        return dZ.y;
    }
    
    public boolean A() {
        return (0x100 & this.z) == 0x100;
    }
    
    public boolean B() {
        return (0x10 & this.z) == 0x10;
    }
    
    public boolean C() {
        return (0x80 & this.z) == 0x80;
    }
    
    public hv D() {
        final Object s = this.s;
        if (s instanceof String) {
            return (hv)(this.s = hv.b((String)s));
        }
        return (hv)s;
    }
    
    public hv E() {
        final Object q = this.q;
        if (q instanceof String) {
            return (hv)(this.q = hv.b((String)q));
        }
        return (hv)q;
    }
    
    public hv F() {
        final Object x = this.x;
        if (x instanceof String) {
            return (hv)(this.x = hv.b((String)x));
        }
        return (hv)x;
    }
    
    public dy a(final int n) {
        return this.f.get(n);
    }
    
    protected gl a(final dg dg) {
        return new gl(dg, null);
    }
    
    public boolean a() {
        return (0x20 & this.z) == 0x20;
    }
    
    public f b(final int n) {
        return this.f.get(n);
    }
    
    public gl b() {
        return r();
    }
    
    public List c() {
        return this.f;
    }
    
    public boolean f() {
        return this.r;
    }
    
    public boolean g() {
        return this.h;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.z();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.z();
    }
    
    @Override
    public du getParserForType() {
        return dZ.w;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean b = dt.b;
        final int d = this.D;
        if (d != -1) {
            return d;
        }
        int n;
        if ((0x1 & this.z) == 0x1) {
            n = 0 + ep.b(1, this.D());
        }
        else {
            n = 0;
        }
        if ((0x2 & this.z) == 0x2) {
            n += ep.b(8, this.F());
        }
        if ((0x10 & this.z) == 0x10) {
            n += ep.h(9, this.m.getNumber());
        }
        if ((0x4 & this.z) == 0x4) {
            n += ep.a(10, this.h);
        }
        if ((0x20 & this.z) == 0x20) {
            n += ep.b(11, this.E());
        }
        if ((0x40 & this.z) == 0x40) {
            n += ep.a(16, this.r);
        }
        if ((0x80 & this.z) == 0x80) {
            n += ep.a(17, this.j);
        }
        if ((0x100 & this.z) == 0x100) {
            n += ep.a(18, this.B);
        }
        if ((0x8 & this.z) == 0x8) {
            n += ep.a(20, this.p);
        }
        int n2 = n;
        while (i < this.f.size()) {
            final int n3 = n2 + ep.f(999, this.f.get(i));
            ++i;
            if (b) {
                return this.D = n3 + this.c() + this.getUnknownFields().getSerializedSize();
            }
            n2 = n3;
        }
        final int n3 = n2;
        return this.D = n3 + this.c() + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.v;
    }
    
    public boolean h() {
        return this.j;
    }
    
    public boolean i() {
        return (0x8 & this.z) == 0x8;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.a().a(dZ.class, gl.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        final byte g = this.g;
        if (g != -1) {
            return g == 1;
        }
        int i = 0;
        while (i < this.w()) {
            if (!this.a(i).isInitialized()) {
                this.g = 0;
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        if (!this.e()) {
            this.g = 0;
            return false;
        }
        this.g = 1;
        return true;
    }
    
    public String j() {
        final Object q = this.q;
        if (q instanceof String) {
            return (String)q;
        }
        final hv hv = (hv)q;
        final String i = hv.i();
        if (hv.b()) {
            this.q = i;
        }
        return i;
    }
    
    public cF k() {
        return this.m;
    }
    
    public boolean l() {
        return (0x4 & this.z) == 0x4;
    }
    
    public String m() {
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
    
    public boolean n() {
        return (0x1 & this.z) == 0x1;
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
    
    public boolean o() {
        return this.B;
    }
    
    public gl p() {
        return b(this);
    }
    
    public boolean q() {
        return this.p;
    }
    
    public List t() {
        return this.f;
    }
    
    @Override
    public a8 toBuilder() {
        return this.p();
    }
    
    @Override
    public aJ toBuilder() {
        return this.p();
    }
    
    public boolean u() {
        return (0x2 & this.z) == 0x2;
    }
    
    public boolean v() {
        return (0x40 & this.z) == 0x40;
    }
    
    public int w() {
        return this.f.size();
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
        if ((0x1 & this.z) == 0x1) {
            ep.c(1, this.D());
        }
        if ((0x2 & this.z) == 0x2) {
            ep.c(8, this.F());
        }
        if ((0x10 & this.z) == 0x10) {
            ep.g(9, this.m.getNumber());
        }
        if ((0x4 & this.z) == 0x4) {
            ep.b(10, this.h);
        }
        if ((0x20 & this.z) == 0x20) {
            ep.c(11, this.E());
        }
        if ((0x40 & this.z) == 0x40) {
            ep.b(16, this.r);
        }
        if ((0x80 & this.z) == 0x80) {
            ep.b(17, this.j);
        }
        if ((0x100 & this.z) == 0x100) {
            ep.b(18, this.B);
        }
        if ((0x8 & this.z) == 0x8) {
            ep.b(20, this.p);
        }
        int n;
        for (int i = 0; i < this.f.size(); i = n) {
            ep.e(999, (ci)this.f.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        b2.a(536870912, ep);
        this.getUnknownFields().writeTo(ep);
    }
    
    public String y() {
        final Object x = this.x;
        if (x instanceof String) {
            return (String)x;
        }
        final hv hv = (hv)x;
        final String i = hv.i();
        if (hv.b()) {
            this.x = i;
        }
        return i;
    }
    
    public dZ z() {
        return dZ.y;
    }
}
