// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class dQ extends dS implements gn
{
    public static final int f = 2;
    public static final int h = 4;
    public static du j;
    public static final int k = 1;
    private static final dQ m;
    public static final int n = 7;
    public static final int p = 5;
    public static final int r = 3;
    private static final long serialVersionUID = 0L;
    public static final int x = 6;
    private byte e;
    private List g;
    private int i;
    private List l;
    private List o;
    private List q;
    private d_ s;
    private int t;
    private final ce u;
    private List v;
    private Object w;
    
    static {
        dQ.j = new hi();
        (m = new dQ(true)).A();
    }
    
    private dQ(final cL p0, final fu p1) {
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
        //    10: putfield        com/google/dQ.e:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        com/google/dQ.i:I
        //    18: aload_0        
        //    19: invokespecial   com/google/dQ.A:()V
        //    22: iconst_0       
        //    23: istore          4
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload           6
        //    35: ifne            498
        //    38: aload_1        
        //    39: invokevirtual   com/google/cL.a:()I
        //    42: istore          20
        //    44: iload           20
        //    46: lookupswitch {
        //                0: 613
        //               10: 908
        //               18: 901
        //               26: 894
        //               34: 887
        //               42: 880
        //               50: 873
        //               58: 418
        //          default: 120
        //        }
        //   120: iload           6
        //   122: istore          21
        //   124: aload_0        
        //   125: aload_1        
        //   126: aload           5
        //   128: aload_2        
        //   129: iload           20
        //   131: invokevirtual   com/google/dQ.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   134: istore          38
        //   136: iload           38
        //   138: ifne            494
        //   141: iconst_1       
        //   142: istore          21
        //   144: iload_3        
        //   145: ifeq            494
        //   148: aload_0        
        //   149: iconst_1       
        //   150: aload_0        
        //   151: getfield        com/google/dQ.t:I
        //   154: ior            
        //   155: putfield        com/google/dQ.t:I
        //   158: aload_0        
        //   159: aload_1        
        //   160: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   163: putfield        com/google/dQ.w:Ljava/lang/Object;
        //   166: iload_3        
        //   167: ifeq            494
        //   170: iload           4
        //   172: iconst_2       
        //   173: iand           
        //   174: iconst_2       
        //   175: if_icmpeq       195
        //   178: aload_0        
        //   179: new             Ljava/util/ArrayList;
        //   182: dup            
        //   183: invokespecial   java/util/ArrayList.<init>:()V
        //   186: putfield        com/google/dQ.o:Ljava/util/List;
        //   189: iload           4
        //   191: iconst_2       
        //   192: ior            
        //   193: istore          4
        //   195: aload_0        
        //   196: getfield        com/google/dQ.o:Ljava/util/List;
        //   199: aload_1        
        //   200: getstatic       com/google/dC.h:Lcom/google/du;
        //   203: aload_2        
        //   204: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   207: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   212: pop            
        //   213: iload_3        
        //   214: ifeq            494
        //   217: iload           4
        //   219: bipush          8
        //   221: iand           
        //   222: bipush          8
        //   224: if_icmpeq       245
        //   227: aload_0        
        //   228: new             Ljava/util/ArrayList;
        //   231: dup            
        //   232: invokespecial   java/util/ArrayList.<init>:()V
        //   235: putfield        com/google/dQ.v:Ljava/util/List;
        //   238: iload           4
        //   240: bipush          8
        //   242: ior            
        //   243: istore          4
        //   245: aload_0        
        //   246: getfield        com/google/dQ.v:Ljava/util/List;
        //   249: aload_1        
        //   250: getstatic       com/google/dQ.j:Lcom/google/du;
        //   253: aload_2        
        //   254: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   257: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   262: pop            
        //   263: iload_3        
        //   264: ifeq            494
        //   267: iload           4
        //   269: bipush          16
        //   271: iand           
        //   272: bipush          16
        //   274: if_icmpeq       295
        //   277: aload_0        
        //   278: new             Ljava/util/ArrayList;
        //   281: dup            
        //   282: invokespecial   java/util/ArrayList.<init>:()V
        //   285: putfield        com/google/dQ.q:Ljava/util/List;
        //   288: iload           4
        //   290: bipush          16
        //   292: ior            
        //   293: istore          4
        //   295: aload_0        
        //   296: getfield        com/google/dQ.q:Ljava/util/List;
        //   299: aload_1        
        //   300: getstatic       com/google/dq.e:Lcom/google/du;
        //   303: aload_2        
        //   304: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   307: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   312: pop            
        //   313: iload_3        
        //   314: ifeq            494
        //   317: iload           4
        //   319: bipush          32
        //   321: iand           
        //   322: bipush          32
        //   324: if_icmpeq       345
        //   327: aload_0        
        //   328: new             Ljava/util/ArrayList;
        //   331: dup            
        //   332: invokespecial   java/util/ArrayList.<init>:()V
        //   335: putfield        com/google/dQ.l:Ljava/util/List;
        //   338: iload           4
        //   340: bipush          32
        //   342: ior            
        //   343: istore          4
        //   345: aload_0        
        //   346: getfield        com/google/dQ.l:Ljava/util/List;
        //   349: aload_1        
        //   350: getstatic       com/google/dr.l:Lcom/google/du;
        //   353: aload_2        
        //   354: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   357: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   362: pop            
        //   363: iload_3        
        //   364: ifeq            494
        //   367: iload           4
        //   369: iconst_4       
        //   370: iand           
        //   371: iconst_4       
        //   372: if_icmpeq       392
        //   375: aload_0        
        //   376: new             Ljava/util/ArrayList;
        //   379: dup            
        //   380: invokespecial   java/util/ArrayList.<init>:()V
        //   383: putfield        com/google/dQ.g:Ljava/util/List;
        //   386: iload           4
        //   388: iconst_4       
        //   389: ior            
        //   390: istore          4
        //   392: aload_0        
        //   393: getfield        com/google/dQ.g:Ljava/util/List;
        //   396: aload_1        
        //   397: getstatic       com/google/dC.h:Lcom/google/du;
        //   400: aload_2        
        //   401: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   404: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   409: pop            
        //   410: iload_3        
        //   411: ifeq            494
        //   414: iload           21
        //   416: istore          6
        //   418: iconst_2       
        //   419: aload_0        
        //   420: getfield        com/google/dQ.t:I
        //   423: iand           
        //   424: iconst_2       
        //   425: if_icmpne       867
        //   428: aload_0        
        //   429: getfield        com/google/dQ.s:Lcom/google/d_;
        //   432: invokevirtual   com/google/d_.i:()Lcom/google/gc;
        //   435: astore          36
        //   437: aload           36
        //   439: astore          33
        //   441: aload_0        
        //   442: aload_1        
        //   443: getstatic       com/google/d_.h:Lcom/google/du;
        //   446: aload_2        
        //   447: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   450: checkcast       Lcom/google/d_;
        //   453: putfield        com/google/dQ.s:Lcom/google/d_;
        //   456: aload           33
        //   458: ifnull          480
        //   461: aload           33
        //   463: aload_0        
        //   464: getfield        com/google/dQ.s:Lcom/google/d_;
        //   467: invokevirtual   com/google/gc.a:(Lcom/google/d_;)Lcom/google/gc;
        //   470: pop            
        //   471: aload_0        
        //   472: aload           33
        //   474: invokevirtual   com/google/gc.g:()Lcom/google/d_;
        //   477: putfield        com/google/dQ.s:Lcom/google/d_;
        //   480: aload_0        
        //   481: iconst_2       
        //   482: aload_0        
        //   483: getfield        com/google/dQ.t:I
        //   486: ior            
        //   487: putfield        com/google/dQ.t:I
        //   490: iload           6
        //   492: istore          21
        //   494: iload_3        
        //   495: ifeq            860
        //   498: iload           4
        //   500: iconst_2       
        //   501: iand           
        //   502: iconst_2       
        //   503: if_icmpne       517
        //   506: aload_0        
        //   507: aload_0        
        //   508: getfield        com/google/dQ.o:Ljava/util/List;
        //   511: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   514: putfield        com/google/dQ.o:Ljava/util/List;
        //   517: iload           4
        //   519: bipush          8
        //   521: iand           
        //   522: bipush          8
        //   524: if_icmpne       538
        //   527: aload_0        
        //   528: aload_0        
        //   529: getfield        com/google/dQ.v:Ljava/util/List;
        //   532: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   535: putfield        com/google/dQ.v:Ljava/util/List;
        //   538: iload           4
        //   540: bipush          16
        //   542: iand           
        //   543: bipush          16
        //   545: if_icmpne       559
        //   548: aload_0        
        //   549: aload_0        
        //   550: getfield        com/google/dQ.q:Ljava/util/List;
        //   553: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   556: putfield        com/google/dQ.q:Ljava/util/List;
        //   559: iload           4
        //   561: bipush          32
        //   563: iand           
        //   564: bipush          32
        //   566: if_icmpne       580
        //   569: aload_0        
        //   570: aload_0        
        //   571: getfield        com/google/dQ.l:Ljava/util/List;
        //   574: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   577: putfield        com/google/dQ.l:Ljava/util/List;
        //   580: iload           4
        //   582: iconst_4       
        //   583: iand           
        //   584: iconst_4       
        //   585: if_icmpne       599
        //   588: aload_0        
        //   589: aload_0        
        //   590: getfield        com/google/dQ.g:Ljava/util/List;
        //   593: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   596: putfield        com/google/dQ.g:Ljava/util/List;
        //   599: aload_0        
        //   600: aload           5
        //   602: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   605: putfield        com/google/dQ.u:Lcom/google/ce;
        //   608: aload_0        
        //   609: invokevirtual   com/google/dQ.c:()V
        //   612: return         
        //   613: iconst_1       
        //   614: istore          21
        //   616: iload_3        
        //   617: ifeq            494
        //   620: goto            124
        //   623: astore          37
        //   625: aload           37
        //   627: athrow         
        //   628: astore          19
        //   630: aload           19
        //   632: aload_0        
        //   633: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   636: athrow         
        //   637: astore          13
        //   639: iload           4
        //   641: iconst_2       
        //   642: iand           
        //   643: iconst_2       
        //   644: if_icmpne       658
        //   647: aload_0        
        //   648: aload_0        
        //   649: getfield        com/google/dQ.o:Ljava/util/List;
        //   652: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   655: putfield        com/google/dQ.o:Ljava/util/List;
        //   658: iload           4
        //   660: bipush          8
        //   662: iand           
        //   663: bipush          8
        //   665: if_icmpne       679
        //   668: aload_0        
        //   669: aload_0        
        //   670: getfield        com/google/dQ.v:Ljava/util/List;
        //   673: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   676: putfield        com/google/dQ.v:Ljava/util/List;
        //   679: iload           4
        //   681: bipush          16
        //   683: iand           
        //   684: bipush          16
        //   686: if_icmpne       700
        //   689: aload_0        
        //   690: aload_0        
        //   691: getfield        com/google/dQ.q:Ljava/util/List;
        //   694: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   697: putfield        com/google/dQ.q:Ljava/util/List;
        //   700: iload           4
        //   702: bipush          32
        //   704: iand           
        //   705: bipush          32
        //   707: if_icmpne       721
        //   710: aload_0        
        //   711: aload_0        
        //   712: getfield        com/google/dQ.l:Ljava/util/List;
        //   715: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   718: putfield        com/google/dQ.l:Ljava/util/List;
        //   721: iload           4
        //   723: iconst_4       
        //   724: iand           
        //   725: iconst_4       
        //   726: if_icmpne       740
        //   729: aload_0        
        //   730: aload_0        
        //   731: getfield        com/google/dQ.g:Ljava/util/List;
        //   734: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   737: putfield        com/google/dQ.g:Ljava/util/List;
        //   740: aload_0        
        //   741: aload           5
        //   743: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   746: putfield        com/google/dQ.u:Lcom/google/ce;
        //   749: aload_0        
        //   750: invokevirtual   com/google/dQ.c:()V
        //   753: aload           13
        //   755: athrow         
        //   756: astore          22
        //   758: aload           22
        //   760: athrow         
        //   761: astore          23
        //   763: aload           23
        //   765: athrow         
        //   766: astore          12
        //   768: new             Lcom/google/bg;
        //   771: dup            
        //   772: aload           12
        //   774: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   777: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   780: aload_0        
        //   781: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   784: athrow         
        //   785: astore          24
        //   787: aload           24
        //   789: athrow         
        //   790: astore          26
        //   792: aload           26
        //   794: athrow         
        //   795: astore          28
        //   797: aload           28
        //   799: athrow         
        //   800: astore          30
        //   802: aload           30
        //   804: athrow         
        //   805: astore          34
        //   807: aload           34
        //   809: athrow         
        //   810: astore          18
        //   812: aload           18
        //   814: athrow         
        //   815: astore          17
        //   817: aload           17
        //   819: athrow         
        //   820: astore          16
        //   822: aload           16
        //   824: athrow         
        //   825: astore          15
        //   827: aload           15
        //   829: athrow         
        //   830: astore          14
        //   832: aload           14
        //   834: athrow         
        //   835: astore          11
        //   837: aload           11
        //   839: athrow         
        //   840: astore          10
        //   842: aload           10
        //   844: athrow         
        //   845: astore          9
        //   847: aload           9
        //   849: athrow         
        //   850: astore          8
        //   852: aload           8
        //   854: athrow         
        //   855: astore          7
        //   857: aload           7
        //   859: athrow         
        //   860: iload           21
        //   862: istore          6
        //   864: goto            33
        //   867: aconst_null    
        //   868: astore          33
        //   870: goto            441
        //   873: iload           6
        //   875: istore          21
        //   877: goto            367
        //   880: iload           6
        //   882: istore          21
        //   884: goto            317
        //   887: iload           6
        //   889: istore          21
        //   891: goto            267
        //   894: iload           6
        //   896: istore          21
        //   898: goto            217
        //   901: iload           6
        //   903: istore          21
        //   905: goto            170
        //   908: iload           6
        //   910: istore          21
        //   912: goto            148
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  38     44     628    637    Lcom/google/bg;
        //  38     44     766    785    Ljava/io/IOException;
        //  38     44     637    835    Any
        //  124    136    623    628    Lcom/google/bg;
        //  124    136    766    785    Ljava/io/IOException;
        //  124    136    637    835    Any
        //  148    166    756    766    Lcom/google/bg;
        //  148    166    766    785    Ljava/io/IOException;
        //  148    166    637    835    Any
        //  178    189    628    637    Lcom/google/bg;
        //  178    189    766    785    Ljava/io/IOException;
        //  178    189    637    835    Any
        //  195    213    785    790    Lcom/google/bg;
        //  195    213    766    785    Ljava/io/IOException;
        //  195    213    637    835    Any
        //  227    238    628    637    Lcom/google/bg;
        //  227    238    766    785    Ljava/io/IOException;
        //  227    238    637    835    Any
        //  245    263    790    795    Lcom/google/bg;
        //  245    263    766    785    Ljava/io/IOException;
        //  245    263    637    835    Any
        //  277    288    628    637    Lcom/google/bg;
        //  277    288    766    785    Ljava/io/IOException;
        //  277    288    637    835    Any
        //  295    313    795    800    Lcom/google/bg;
        //  295    313    766    785    Ljava/io/IOException;
        //  295    313    637    835    Any
        //  327    338    628    637    Lcom/google/bg;
        //  327    338    766    785    Ljava/io/IOException;
        //  327    338    637    835    Any
        //  345    363    800    805    Lcom/google/bg;
        //  345    363    766    785    Ljava/io/IOException;
        //  345    363    637    835    Any
        //  375    386    628    637    Lcom/google/bg;
        //  375    386    766    785    Ljava/io/IOException;
        //  375    386    637    835    Any
        //  392    410    628    637    Lcom/google/bg;
        //  392    410    766    785    Ljava/io/IOException;
        //  392    410    637    835    Any
        //  418    437    628    637    Lcom/google/bg;
        //  418    437    766    785    Ljava/io/IOException;
        //  418    437    637    835    Any
        //  441    456    805    810    Lcom/google/bg;
        //  441    456    766    785    Ljava/io/IOException;
        //  441    456    637    835    Any
        //  461    480    805    810    Lcom/google/bg;
        //  461    480    766    785    Ljava/io/IOException;
        //  461    480    637    835    Any
        //  480    490    628    637    Lcom/google/bg;
        //  480    490    766    785    Ljava/io/IOException;
        //  480    490    637    835    Any
        //  506    517    835    840    Lcom/google/bg;
        //  527    538    840    845    Lcom/google/bg;
        //  548    559    845    850    Lcom/google/bg;
        //  569    580    850    855    Lcom/google/bg;
        //  588    599    855    860    Lcom/google/bg;
        //  625    628    628    637    Lcom/google/bg;
        //  625    628    766    785    Ljava/io/IOException;
        //  625    628    637    835    Any
        //  630    637    637    835    Any
        //  647    658    810    815    Lcom/google/bg;
        //  668    679    815    820    Lcom/google/bg;
        //  689    700    820    825    Lcom/google/bg;
        //  710    721    825    830    Lcom/google/bg;
        //  729    740    830    835    Lcom/google/bg;
        //  758    761    761    766    Lcom/google/bg;
        //  758    761    766    785    Ljava/io/IOException;
        //  758    761    637    835    Any
        //  763    766    628    637    Lcom/google/bg;
        //  763    766    766    785    Ljava/io/IOException;
        //  763    766    637    835    Any
        //  768    785    637    835    Any
        //  787    790    628    637    Lcom/google/bg;
        //  787    790    766    785    Ljava/io/IOException;
        //  787    790    637    835    Any
        //  792    795    628    637    Lcom/google/bg;
        //  792    795    766    785    Ljava/io/IOException;
        //  792    795    637    835    Any
        //  797    800    628    637    Lcom/google/bg;
        //  797    800    766    785    Ljava/io/IOException;
        //  797    800    637    835    Any
        //  802    805    628    637    Lcom/google/bg;
        //  802    805    766    785    Ljava/io/IOException;
        //  802    805    637    835    Any
        //  807    810    628    637    Lcom/google/bg;
        //  807    810    766    785    Ljava/io/IOException;
        //  807    810    637    835    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 427, Size: 427
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    dQ(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dQ(final fp fp) {
        super(fp);
        this.e = -1;
        this.i = -1;
        this.u = fp.getUnknownFields();
    }
    
    dQ(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dQ(final boolean b) {
        this.e = -1;
        this.i = -1;
        this.u = ce.d();
    }
    
    private void A() {
        this.w = "";
        this.o = Collections.emptyList();
        this.g = Collections.emptyList();
        this.v = Collections.emptyList();
        this.q = Collections.emptyList();
        this.l = Collections.emptyList();
        this.s = d_.h();
    }
    
    static int a(final dQ dq, final int t) {
        return dq.t = t;
    }
    
    public static dQ a(final cL cl) {
        return (dQ)dQ.j.a(cl);
    }
    
    public static dQ a(final cL cl, final fu fu) {
        return (dQ)dQ.j.a(cl, fu);
    }
    
    public static dQ a(final hv hv) {
        return (dQ)dQ.j.a(hv);
    }
    
    public static dQ a(final hv hv, final fu fu) {
        return (dQ)dQ.j.a(hv, fu);
    }
    
    public static dQ a(final InputStream inputStream) {
        return (dQ)dQ.j.b(inputStream);
    }
    
    public static dQ a(final InputStream inputStream, final fu fu) {
        return (dQ)dQ.j.b(inputStream, fu);
    }
    
    public static dQ a(final byte[] array) {
        return (dQ)dQ.j.a(array);
    }
    
    public static dQ a(final byte[] array, final fu fu) {
        return (dQ)dQ.j.a(array, fu);
    }
    
    static d_ a(final dQ dq, final d_ s) {
        return dq.s = s;
    }
    
    static Object a(final dQ dq, final Object w) {
        return dq.w = w;
    }
    
    static List a(final dQ dq) {
        return dq.l;
    }
    
    static List a(final dQ dq, final List l) {
        return dq.l = l;
    }
    
    public static dQ b(final InputStream inputStream) {
        return (dQ)dQ.j.a(inputStream);
    }
    
    public static dQ b(final InputStream inputStream, final fu fu) {
        return (dQ)dQ.j.a(inputStream, fu);
    }
    
    static List b(final dQ dq) {
        return dq.g;
    }
    
    static List b(final dQ dq, final List v) {
        return dq.v = v;
    }
    
    static Object c(final dQ dq) {
        return dq.w;
    }
    
    static List c(final dQ dq, final List g) {
        return dq.g = g;
    }
    
    static List d(final dQ dq) {
        return dq.o;
    }
    
    static List d(final dQ dq, final List q) {
        return dq.q = q;
    }
    
    public static fe e(final dQ dq) {
        return i().a(dq);
    }
    
    static List e(final dQ dq, final List o) {
        return dq.o = o;
    }
    
    static List f(final dQ dq) {
        return dq.v;
    }
    
    static List g(final dQ dq) {
        return dq.q;
    }
    
    public static fe i() {
        return fe.l();
    }
    
    public static final bl j() {
        return hM.e();
    }
    
    public static dQ p() {
        return dQ.m;
    }
    
    public List B() {
        return this.l;
    }
    
    public dC a(final int n) {
        return this.o.get(n);
    }
    
    public d_ a() {
        return this.s;
    }
    
    protected fe a(final dg dg) {
        return new fe(dg, null);
    }
    
    public dr b(final int n) {
        return this.l.get(n);
    }
    
    public List b() {
        return this.v;
    }
    
    public dQ c(final int n) {
        return this.v.get(n);
    }
    
    public boolean c() {
        return (0x1 & this.t) == 0x1;
    }
    
    public gI d(final int n) {
        return this.g.get(n);
    }
    
    public List d() {
        return this.l;
    }
    
    public dC e(final int n) {
        return this.g.get(n);
    }
    
    public fg e() {
        return this.s;
    }
    
    public dq f(final int n) {
        return this.q.get(n);
    }
    
    public hv f() {
        final Object w = this.w;
        if (w instanceof String) {
            return (hv)(this.w = hv.b((String)w));
        }
        return (hv)w;
    }
    
    public gn g(final int n) {
        return this.v.get(n);
    }
    
    public List g() {
        return this.q;
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
        return dQ.j;
    }
    
    @Override
    public int getSerializedSize() {
        final boolean b = dt.b;
        final int i = this.i;
        if (i != -1) {
            return i;
        }
        int n;
        if ((0x1 & this.t) == 0x1) {
            n = 0 + ep.b(1, this.f());
        }
        else {
            n = 0;
        }
        int j = 0;
        int n2 = n;
        while (j < this.o.size()) {
            n2 += ep.f(2, this.o.get(j));
            final int n3 = j + 1;
            if (b) {
                break;
            }
            j = n3;
        }
        int n4;
        for (int k = 0; k < this.v.size(); k = n4) {
            n2 += ep.f(3, (ci)this.v.get(k));
            n4 = k + 1;
            if (b) {
                break;
            }
        }
        int n5;
        for (int l = 0; l < this.q.size(); l = n5) {
            n2 += ep.f(4, (ci)this.q.get(l));
            n5 = l + 1;
            if (b) {
                break;
            }
        }
        int n6 = 0;
        int n7;
        while (true) {
            final int size = this.l.size();
            n7 = 0;
            if (n6 >= size) {
                break;
            }
            n2 += ep.f(5, (ci)this.l.get(n6));
            final int n8 = n6 + 1;
            n7 = 0;
            if (b) {
                break;
            }
            n6 = n8;
        }
        while (n7 < this.g.size()) {
            n2 += ep.f(6, (ci)this.g.get(n7));
            ++n7;
            if (b) {
                break;
            }
        }
        if ((0x2 & this.t) == 0x2) {
            n2 += ep.f(7, this.s);
        }
        return this.i = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.u;
    }
    
    public gI h(final int n) {
        return this.o.get(n);
    }
    
    public List h() {
        return this.q;
    }
    
    public q i(final int n) {
        return this.q.get(n);
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.z().a(dQ.class, fe.class);
    }
    
    @Override
    public final boolean isInitialized() {
        boolean e = true;
        final boolean b = dt.b;
        final byte e2 = this.e;
        if (e2 != -1) {
            if (e2 != (e ? 1 : 0)) {
                e = false;
            }
            return e;
        }
        int i = 0;
        while (i < this.x()) {
            if (!this.a(i).isInitialized()) {
                this.e = 0;
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        int j = 0;
        while (j < this.v()) {
            if (!this.e(j).isInitialized()) {
                this.e = 0;
                return false;
            }
            ++j;
            if (b) {
                break;
            }
        }
        int k = 0;
        while (k < this.l()) {
            if (!this.c(k).isInitialized()) {
                this.e = 0;
                return false;
            }
            ++k;
            if (b) {
                break;
            }
        }
        int l = 0;
        while (l < this.u()) {
            if (!this.f(l).isInitialized()) {
                this.e = 0;
                return false;
            }
            ++l;
            if (b) {
                break;
            }
        }
        if (this.k() && !this.a().isInitialized()) {
            this.e = 0;
            return false;
        }
        return (this.e = (byte)(e ? 1 : 0)) != 0;
    }
    
    public bC j(final int n) {
        return this.l.get(n);
    }
    
    public boolean k() {
        return (0x2 & this.t) == 0x2;
    }
    
    public int l() {
        return this.v.size();
    }
    
    public int m() {
        return this.l.size();
    }
    
    public List n() {
        return this.g;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.w();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.w();
    }
    
    public fe o() {
        return e(this);
    }
    
    public List q() {
        return this.g;
    }
    
    public List r() {
        return this.v;
    }
    
    public String s() {
        final Object w = this.w;
        if (w instanceof String) {
            return (String)w;
        }
        final hv hv = (hv)w;
        final String i = hv.i();
        if (hv.b()) {
            this.w = i;
        }
        return i;
    }
    
    public List t() {
        return this.o;
    }
    
    @Override
    public a8 toBuilder() {
        return this.o();
    }
    
    @Override
    public aJ toBuilder() {
        return this.o();
    }
    
    public int u() {
        return this.q.size();
    }
    
    public int v() {
        return this.g.size();
    }
    
    public fe w() {
        return i();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean b = dt.b;
        this.getSerializedSize();
        if ((0x1 & this.t) == 0x1) {
            ep.c(1, this.f());
        }
        int n;
        for (int i = 0; i < this.o.size(); i = n) {
            ep.e(2, (ci)this.o.get(i));
            n = i + 1;
            if (b) {
                break;
            }
        }
        int n2;
        for (int j = 0; j < this.v.size(); j = n2) {
            ep.e(3, (ci)this.v.get(j));
            n2 = j + 1;
            if (b) {
                break;
            }
        }
        int n3;
        for (int k = 0; k < this.q.size(); k = n3) {
            ep.e(4, (ci)this.q.get(k));
            n3 = k + 1;
            if (b) {
                break;
            }
        }
        int n4 = 0;
        int l;
        while (true) {
            final int size = this.l.size();
            l = 0;
            if (n4 >= size) {
                break;
            }
            ep.e(5, (ci)this.l.get(n4));
            final int n5 = n4 + 1;
            l = 0;
            if (b) {
                break;
            }
            n4 = n5;
        }
        while (l < this.g.size()) {
            ep.e(6, (ci)this.g.get(l));
            ++l;
            if (b) {
                break;
            }
        }
        if ((0x2 & this.t) == 0x2) {
            ep.e(7, this.s);
        }
        this.getUnknownFields().writeTo(ep);
    }
    
    public int x() {
        return this.o.size();
    }
    
    public List y() {
        return this.o;
    }
    
    public dQ z() {
        return dQ.m;
    }
}
