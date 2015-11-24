// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public class cs
{
    private static final String F;
    private byte[] A;
    private byte[] B;
    private String C;
    private Double D;
    private String E;
    private bi a;
    private Integer b;
    private Integer c;
    private Boolean d;
    private Boolean e;
    private String f;
    private Integer g;
    private String h;
    private Double i;
    private String j;
    private Integer k;
    private String l;
    private Integer m;
    private String n;
    private String o;
    private String p;
    private Long q;
    private Boolean r;
    private String s;
    private Integer t;
    private String u;
    private Long v;
    private String w;
    private Integer x;
    private Byte y;
    private String z;
    
    static {
        final char[] charArray = "f}?M\u000feslL\u0003za%L\u0003o4<L\t{q>J\u001f+v)X\tyqlW\bx`-P\u0012bu8W\bl4\"[\u0011+}\"]\tf}\"YFfq?M\u0007lq".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'f';
                    break;
                }
                case 0: {
                    c2 = '\u000b';
                    break;
                }
                case 1: {
                    c2 = '\u0014';
                    break;
                }
                case 2: {
                    c2 = 'L';
                    break;
                }
                case 3: {
                    c2 = '>';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        F = new String(charArray).intern();
    }
    
    public cs a(final byte b) {
        this.y = new Byte(b);
        return this;
    }
    
    public cs a(final int n) {
        this.k = new Integer(n);
        return this;
    }
    
    public cs a(final long n) {
        this.v = new Long(n);
        return this;
    }
    
    public cs a(final Boolean d) {
        this.d = d;
        return this;
    }
    
    public cs a(final Double d) {
        this.D = d;
        return this;
    }
    
    public cs a(final Integer x) {
        this.x = x;
        return this;
    }
    
    public cs a(final String z) {
        this.z = z;
        return this;
    }
    
    public cs a(final boolean b) {
        while (true) {
            Label_0018: {
                if (!b) {
                    break Label_0018;
                }
                try {
                    final Boolean e = Boolean.TRUE;
                    this.e = e;
                    return this;
                }
                catch (UnsupportedOperationException ex) {
                    throw ex;
                }
            }
            final Boolean e = Boolean.FALSE;
            continue;
        }
    }
    
    public cs a(final byte[] a) {
        this.A = a;
        return this;
    }
    
    public Byte a() {
        return this.y;
    }
    
    public bi b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnonnull       14
        //     9: aconst_null    
        //    10: areturn        
        //    11: astore_1       
        //    12: aload_1        
        //    13: athrow         
        //    14: aload_0        
        //    15: getfield        com/whatsapp/protocol/cs.h:Ljava/lang/String;
        //    18: astore          6
        //    20: aload           6
        //    22: ifnull          72
        //    25: aload_0        
        //    26: getfield        com/whatsapp/protocol/cs.e:Ljava/lang/Boolean;
        //    29: astore          34
        //    31: aload           34
        //    33: ifnull          72
        //    36: aload_0        
        //    37: getfield        com/whatsapp/protocol/cs.z:Ljava/lang/String;
        //    40: ifnull          72
        //    43: aload_0        
        //    44: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //    47: new             Lcom/whatsapp/protocol/c6;
        //    50: dup            
        //    51: aload_0        
        //    52: getfield        com/whatsapp/protocol/cs.h:Ljava/lang/String;
        //    55: aload_0        
        //    56: getfield        com/whatsapp/protocol/cs.e:Ljava/lang/Boolean;
        //    59: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    62: aload_0        
        //    63: getfield        com/whatsapp/protocol/cs.z:Ljava/lang/String;
        //    66: invokespecial   com/whatsapp/protocol/c6.<init>:(Ljava/lang/String;ZLjava/lang/String;)V
        //    69: putfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    72: aload_0        
        //    73: getfield        com/whatsapp/protocol/cs.j:Ljava/lang/String;
        //    76: ifnull          90
        //    79: aload_0        
        //    80: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //    83: aload_0        
        //    84: getfield        com/whatsapp/protocol/cs.j:Ljava/lang/String;
        //    87: putfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //    90: aload_0        
        //    91: getfield        com/whatsapp/protocol/cs.w:Ljava/lang/String;
        //    94: ifnull          108
        //    97: aload_0        
        //    98: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   101: aload_0        
        //   102: getfield        com/whatsapp/protocol/cs.w:Ljava/lang/String;
        //   105: putfield        com/whatsapp/protocol/bi.Q:Ljava/lang/String;
        //   108: aload_0        
        //   109: getfield        com/whatsapp/protocol/cs.n:Ljava/lang/String;
        //   112: ifnull          126
        //   115: aload_0        
        //   116: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   119: aload_0        
        //   120: getfield        com/whatsapp/protocol/cs.n:Ljava/lang/String;
        //   123: invokevirtual   com/whatsapp/protocol/bi.b:(Ljava/lang/String;)V
        //   126: aload_0        
        //   127: getfield        com/whatsapp/protocol/cs.B:[B
        //   130: ifnull          144
        //   133: aload_0        
        //   134: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   137: aload_0        
        //   138: getfield        com/whatsapp/protocol/cs.B:[B
        //   141: invokevirtual   com/whatsapp/protocol/bi.a:([B)V
        //   144: aload_0        
        //   145: getfield        com/whatsapp/protocol/cs.g:Ljava/lang/Integer;
        //   148: ifnull          165
        //   151: aload_0        
        //   152: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   155: aload_0        
        //   156: getfield        com/whatsapp/protocol/cs.g:Ljava/lang/Integer;
        //   159: invokevirtual   java/lang/Integer.intValue:()I
        //   162: invokevirtual   com/whatsapp/protocol/bi.a:(I)V
        //   165: aload_0        
        //   166: getfield        com/whatsapp/protocol/cs.A:[B
        //   169: ifnull          183
        //   172: aload_0        
        //   173: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   176: aload_0        
        //   177: getfield        com/whatsapp/protocol/cs.A:[B
        //   180: invokevirtual   com/whatsapp/protocol/bi.b:([B)V
        //   183: aload_0        
        //   184: getfield        com/whatsapp/protocol/cs.m:Ljava/lang/Integer;
        //   187: ifnull          204
        //   190: aload_0        
        //   191: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   194: aload_0        
        //   195: getfield        com/whatsapp/protocol/cs.m:Ljava/lang/Integer;
        //   198: invokevirtual   java/lang/Integer.intValue:()I
        //   201: invokevirtual   com/whatsapp/protocol/bi.b:(I)V
        //   204: aload_0        
        //   205: getfield        com/whatsapp/protocol/cs.t:Ljava/lang/Integer;
        //   208: ifnull          225
        //   211: aload_0        
        //   212: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   215: aload_0        
        //   216: getfield        com/whatsapp/protocol/cs.t:Ljava/lang/Integer;
        //   219: invokevirtual   java/lang/Integer.intValue:()I
        //   222: putfield        com/whatsapp/protocol/bi.y:I
        //   225: aload_0        
        //   226: getfield        com/whatsapp/protocol/cs.c:Ljava/lang/Integer;
        //   229: ifnull          246
        //   232: aload_0        
        //   233: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   236: aload_0        
        //   237: getfield        com/whatsapp/protocol/cs.c:Ljava/lang/Integer;
        //   240: invokevirtual   java/lang/Integer.intValue:()I
        //   243: putfield        com/whatsapp/protocol/bi.n:I
        //   246: aload_0        
        //   247: getfield        com/whatsapp/protocol/cs.k:Ljava/lang/Integer;
        //   250: ifnull          267
        //   253: aload_0        
        //   254: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   257: aload_0        
        //   258: getfield        com/whatsapp/protocol/cs.k:Ljava/lang/Integer;
        //   261: invokevirtual   java/lang/Integer.intValue:()I
        //   264: putfield        com/whatsapp/protocol/bi.E:I
        //   267: aload_0        
        //   268: getfield        com/whatsapp/protocol/cs.v:Ljava/lang/Long;
        //   271: ifnull          288
        //   274: aload_0        
        //   275: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   278: aload_0        
        //   279: getfield        com/whatsapp/protocol/cs.v:Ljava/lang/Long;
        //   282: invokevirtual   java/lang/Long.longValue:()J
        //   285: putfield        com/whatsapp/protocol/bi.u:J
        //   288: aload_0        
        //   289: getfield        com/whatsapp/protocol/cs.x:Ljava/lang/Integer;
        //   292: ifnull          306
        //   295: aload_0        
        //   296: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   299: aload_0        
        //   300: getfield        com/whatsapp/protocol/cs.x:Ljava/lang/Integer;
        //   303: putfield        com/whatsapp/protocol/bi.b:Ljava/lang/Integer;
        //   306: aload_0        
        //   307: getfield        com/whatsapp/protocol/cs.y:Ljava/lang/Byte;
        //   310: ifnull          327
        //   313: aload_0        
        //   314: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   317: aload_0        
        //   318: getfield        com/whatsapp/protocol/cs.y:Ljava/lang/Byte;
        //   321: invokevirtual   java/lang/Byte.byteValue:()B
        //   324: putfield        com/whatsapp/protocol/bi.I:B
        //   327: aload_0        
        //   328: getfield        com/whatsapp/protocol/cs.q:Ljava/lang/Long;
        //   331: ifnull          348
        //   334: aload_0        
        //   335: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   338: aload_0        
        //   339: getfield        com/whatsapp/protocol/cs.q:Ljava/lang/Long;
        //   342: invokevirtual   java/lang/Long.longValue:()J
        //   345: putfield        com/whatsapp/protocol/bi.L:J
        //   348: aload_0        
        //   349: getfield        com/whatsapp/protocol/cs.o:Ljava/lang/String;
        //   352: ifnull          366
        //   355: aload_0        
        //   356: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   359: aload_0        
        //   360: getfield        com/whatsapp/protocol/cs.o:Ljava/lang/String;
        //   363: putfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //   366: aload_0        
        //   367: getfield        com/whatsapp/protocol/cs.b:Ljava/lang/Integer;
        //   370: ifnull          387
        //   373: aload_0        
        //   374: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   377: aload_0        
        //   378: getfield        com/whatsapp/protocol/cs.b:Ljava/lang/Integer;
        //   381: invokevirtual   java/lang/Integer.intValue:()I
        //   384: putfield        com/whatsapp/protocol/bi.D:I
        //   387: aload_0        
        //   388: getfield        com/whatsapp/protocol/cs.p:Ljava/lang/String;
        //   391: ifnull          405
        //   394: aload_0        
        //   395: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   398: aload_0        
        //   399: getfield        com/whatsapp/protocol/cs.p:Ljava/lang/String;
        //   402: putfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   405: aload_0        
        //   406: getfield        com/whatsapp/protocol/cs.C:Ljava/lang/String;
        //   409: ifnull          423
        //   412: aload_0        
        //   413: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   416: aload_0        
        //   417: getfield        com/whatsapp/protocol/cs.C:Ljava/lang/String;
        //   420: putfield        com/whatsapp/protocol/bi.F:Ljava/lang/String;
        //   423: aload_0        
        //   424: getfield        com/whatsapp/protocol/cs.s:Ljava/lang/String;
        //   427: ifnull          441
        //   430: aload_0        
        //   431: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   434: aload_0        
        //   435: getfield        com/whatsapp/protocol/cs.s:Ljava/lang/String;
        //   438: putfield        com/whatsapp/protocol/bi.o:Ljava/lang/String;
        //   441: aload_0        
        //   442: getfield        com/whatsapp/protocol/cs.u:Ljava/lang/String;
        //   445: ifnull          459
        //   448: aload_0        
        //   449: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   452: aload_0        
        //   453: getfield        com/whatsapp/protocol/cs.u:Ljava/lang/String;
        //   456: putfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //   459: aload_0        
        //   460: getfield        com/whatsapp/protocol/cs.l:Ljava/lang/String;
        //   463: ifnull          477
        //   466: aload_0        
        //   467: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   470: aload_0        
        //   471: getfield        com/whatsapp/protocol/cs.l:Ljava/lang/String;
        //   474: putfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //   477: aload_0        
        //   478: getfield        com/whatsapp/protocol/cs.r:Ljava/lang/Boolean;
        //   481: ifnull          498
        //   484: aload_0        
        //   485: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   488: aload_0        
        //   489: getfield        com/whatsapp/protocol/cs.r:Ljava/lang/Boolean;
        //   492: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   495: putfield        com/whatsapp/protocol/bi.e:Z
        //   498: aload_0        
        //   499: getfield        com/whatsapp/protocol/cs.D:Ljava/lang/Double;
        //   502: ifnull          519
        //   505: aload_0        
        //   506: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   509: aload_0        
        //   510: getfield        com/whatsapp/protocol/cs.D:Ljava/lang/Double;
        //   513: invokevirtual   java/lang/Double.doubleValue:()D
        //   516: putfield        com/whatsapp/protocol/bi.p:D
        //   519: aload_0        
        //   520: getfield        com/whatsapp/protocol/cs.i:Ljava/lang/Double;
        //   523: ifnull          540
        //   526: aload_0        
        //   527: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   530: aload_0        
        //   531: getfield        com/whatsapp/protocol/cs.i:Ljava/lang/Double;
        //   534: invokevirtual   java/lang/Double.doubleValue:()D
        //   537: putfield        com/whatsapp/protocol/bi.G:D
        //   540: aload_0        
        //   541: getfield        com/whatsapp/protocol/cs.E:Ljava/lang/String;
        //   544: ifnull          558
        //   547: aload_0        
        //   548: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   551: aload_0        
        //   552: getfield        com/whatsapp/protocol/cs.E:Ljava/lang/String;
        //   555: putfield        com/whatsapp/protocol/bi.s:Ljava/lang/String;
        //   558: aload_0        
        //   559: getfield        com/whatsapp/protocol/cs.d:Ljava/lang/Boolean;
        //   562: ifnull          579
        //   565: aload_0        
        //   566: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   569: aload_0        
        //   570: getfield        com/whatsapp/protocol/cs.d:Ljava/lang/Boolean;
        //   573: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   576: putfield        com/whatsapp/protocol/bi.x:Z
        //   579: aload_0        
        //   580: getfield        com/whatsapp/protocol/cs.f:Ljava/lang/String;
        //   583: ifnull          597
        //   586: aload_0        
        //   587: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   590: aload_0        
        //   591: getfield        com/whatsapp/protocol/cs.f:Ljava/lang/String;
        //   594: putfield        com/whatsapp/protocol/bi.C:Ljava/lang/String;
        //   597: aload_0        
        //   598: getfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //   601: areturn        
        //   602: astore_3       
        //   603: aload_3        
        //   604: athrow         
        //   605: astore          4
        //   607: aload           4
        //   609: athrow         
        //   610: astore          5
        //   612: aload           5
        //   614: athrow         
        //   615: astore          7
        //   617: aload           7
        //   619: athrow         
        //   620: astore          8
        //   622: aload           8
        //   624: athrow         
        //   625: astore          9
        //   627: aload           9
        //   629: athrow         
        //   630: astore          10
        //   632: aload           10
        //   634: athrow         
        //   635: astore          11
        //   637: aload           11
        //   639: athrow         
        //   640: astore          12
        //   642: aload           12
        //   644: athrow         
        //   645: astore          13
        //   647: aload           13
        //   649: athrow         
        //   650: astore          14
        //   652: aload           14
        //   654: athrow         
        //   655: astore          15
        //   657: aload           15
        //   659: athrow         
        //   660: astore          16
        //   662: aload           16
        //   664: athrow         
        //   665: astore          17
        //   667: aload           17
        //   669: athrow         
        //   670: astore          18
        //   672: aload           18
        //   674: athrow         
        //   675: astore          19
        //   677: aload           19
        //   679: athrow         
        //   680: astore          20
        //   682: aload           20
        //   684: athrow         
        //   685: astore          21
        //   687: aload           21
        //   689: athrow         
        //   690: astore          22
        //   692: aload           22
        //   694: athrow         
        //   695: astore          23
        //   697: aload           23
        //   699: athrow         
        //   700: astore          24
        //   702: aload           24
        //   704: athrow         
        //   705: astore          25
        //   707: aload           25
        //   709: athrow         
        //   710: astore          26
        //   712: aload           26
        //   714: athrow         
        //   715: astore          27
        //   717: aload           27
        //   719: athrow         
        //   720: astore          28
        //   722: aload           28
        //   724: athrow         
        //   725: astore          29
        //   727: aload           29
        //   729: athrow         
        //   730: astore          30
        //   732: aload           30
        //   734: athrow         
        //   735: astore          31
        //   737: aload           31
        //   739: athrow         
        //   740: astore          32
        //   742: aload           32
        //   744: athrow         
        //   745: astore          33
        //   747: aload           33
        //   749: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      5      11     14     Ljava/lang/UnsupportedOperationException;
        //  14     20     602    605    Ljava/lang/UnsupportedOperationException;
        //  25     31     605    610    Ljava/lang/UnsupportedOperationException;
        //  36     72     610    615    Ljava/lang/UnsupportedOperationException;
        //  72     90     615    620    Ljava/lang/UnsupportedOperationException;
        //  90     108    620    625    Ljava/lang/UnsupportedOperationException;
        //  108    126    625    630    Ljava/lang/UnsupportedOperationException;
        //  126    144    630    635    Ljava/lang/UnsupportedOperationException;
        //  144    165    635    640    Ljava/lang/UnsupportedOperationException;
        //  165    183    640    645    Ljava/lang/UnsupportedOperationException;
        //  183    204    645    650    Ljava/lang/UnsupportedOperationException;
        //  204    225    650    655    Ljava/lang/UnsupportedOperationException;
        //  225    246    655    660    Ljava/lang/UnsupportedOperationException;
        //  246    267    660    665    Ljava/lang/UnsupportedOperationException;
        //  267    288    665    670    Ljava/lang/UnsupportedOperationException;
        //  288    306    670    675    Ljava/lang/UnsupportedOperationException;
        //  306    327    675    680    Ljava/lang/UnsupportedOperationException;
        //  327    348    680    685    Ljava/lang/UnsupportedOperationException;
        //  348    366    685    690    Ljava/lang/UnsupportedOperationException;
        //  366    387    690    695    Ljava/lang/UnsupportedOperationException;
        //  387    405    695    700    Ljava/lang/UnsupportedOperationException;
        //  405    423    700    705    Ljava/lang/UnsupportedOperationException;
        //  423    441    705    710    Ljava/lang/UnsupportedOperationException;
        //  441    459    710    715    Ljava/lang/UnsupportedOperationException;
        //  459    477    715    720    Ljava/lang/UnsupportedOperationException;
        //  477    498    720    725    Ljava/lang/UnsupportedOperationException;
        //  498    519    725    730    Ljava/lang/UnsupportedOperationException;
        //  519    540    730    735    Ljava/lang/UnsupportedOperationException;
        //  540    558    735    740    Ljava/lang/UnsupportedOperationException;
        //  558    579    740    745    Ljava/lang/UnsupportedOperationException;
        //  579    597    745    750    Ljava/lang/UnsupportedOperationException;
        //  603    605    605    610    Ljava/lang/UnsupportedOperationException;
        //  607    610    610    615    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 358, Size: 358
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
    
    public cs b(final int n) {
        this.g = new Integer(n);
        return this;
    }
    
    public cs b(final long n) {
        this.q = new Long(n);
        return this;
    }
    
    public cs b(final Boolean r) {
        this.r = r;
        return this;
    }
    
    public cs b(final Double i) {
        this.i = i;
        return this;
    }
    
    public cs b(final String c) {
        this.C = c;
        return this;
    }
    
    public cs b(final byte[] b) {
        this.B = b;
        return this;
    }
    
    public cs c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/protocol/cs.h:Ljava/lang/String;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          29
        //    11: aload_0        
        //    12: getfield        com/whatsapp/protocol/cs.e:Ljava/lang/Boolean;
        //    15: astore          5
        //    17: aload           5
        //    19: ifnull          29
        //    22: aload_0        
        //    23: getfield        com/whatsapp/protocol/cs.z:Ljava/lang/String;
        //    26: ifnonnull       49
        //    29: new             Ljava/lang/UnsupportedOperationException;
        //    32: dup            
        //    33: getstatic       com/whatsapp/protocol/cs.F:Ljava/lang/String;
        //    36: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //    39: athrow         
        //    40: astore_3       
        //    41: aload_3        
        //    42: athrow         
        //    43: astore_1       
        //    44: aload_1        
        //    45: athrow         
        //    46: astore_2       
        //    47: aload_2        
        //    48: athrow         
        //    49: aload_0        
        //    50: new             Lcom/whatsapp/protocol/bi;
        //    53: dup            
        //    54: new             Lcom/whatsapp/protocol/c6;
        //    57: dup            
        //    58: aload_0        
        //    59: getfield        com/whatsapp/protocol/cs.h:Ljava/lang/String;
        //    62: aload_0        
        //    63: getfield        com/whatsapp/protocol/cs.e:Ljava/lang/Boolean;
        //    66: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    69: aload_0        
        //    70: getfield        com/whatsapp/protocol/cs.z:Ljava/lang/String;
        //    73: invokespecial   com/whatsapp/protocol/c6.<init>:(Ljava/lang/String;ZLjava/lang/String;)V
        //    76: invokespecial   com/whatsapp/protocol/bi.<init>:(Lcom/whatsapp/protocol/c6;)V
        //    79: putfield        com/whatsapp/protocol/cs.a:Lcom/whatsapp/protocol/bi;
        //    82: aload_0        
        //    83: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      6      43     46     Ljava/lang/UnsupportedOperationException;
        //  11     17     46     49     Ljava/lang/UnsupportedOperationException;
        //  22     29     40     43     Ljava/lang/UnsupportedOperationException;
        //  29     40     40     43     Ljava/lang/UnsupportedOperationException;
        //  44     46     46     49     Ljava/lang/UnsupportedOperationException;
        //  47     49     40     43     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    public cs c(final int n) {
        this.m = new Integer(n);
        return this;
    }
    
    public cs c(final String o) {
        this.o = o;
        return this;
    }
    
    public cs d(final int n) {
        this.b = new Integer(n);
        return this;
    }
    
    public cs d(final String p) {
        this.p = p;
        return this;
    }
    
    public cs e(final int n) {
        this.t = new Integer(n);
        return this;
    }
    
    public cs e(final String j) {
        this.j = j;
        return this;
    }
    
    public cs f(final int n) {
        this.c = new Integer(n);
        return this;
    }
    
    public cs f(final String u) {
        this.u = u;
        return this;
    }
    
    public cs g(final String n) {
        this.n = n;
        return this;
    }
    
    public cs h(final String s) {
        this.s = s;
        return this;
    }
    
    public cs i(final String e) {
        this.E = e;
        return this;
    }
    
    public cs j(final String h) {
        this.h = h;
        return this;
    }
    
    public cs k(final String f) {
        this.f = f;
        return this;
    }
    
    public cs l(final String l) {
        this.l = l;
        return this;
    }
}
