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
import java.util.Collections;
import java.io.InputStream;
import com.google.bl;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import com.google.ce;
import java.util.List;
import com.google.hv;
import com.google.du;
import com.google.dS;

public final class aZ extends dS implements bK
{
    public static final int A = 7;
    public static final int C = 2;
    public static du E;
    private static final aZ G;
    public static final int I = 12;
    public static final int J = 9;
    public static final int h = 10;
    public static final int i = 4;
    public static final int k = 5;
    public static final int l = 8;
    public static boolean o = false;
    public static final int p = 13;
    public static final int s = 11;
    private static final long serialVersionUID = 0L;
    public static final int u = 6;
    public static final int v = 1;
    public static final int z = 3;
    private hv B;
    private List D;
    private av F;
    private int H;
    private int K;
    private int e;
    private int f;
    private a_ g;
    private hv j;
    private aD m;
    private boolean n;
    private hv q;
    private int r;
    private byte t;
    private hv w;
    private int x;
    private final ce y;
    
    static {
        aZ.E = new bu();
        (G = new aZ(true)).m();
    }
    
    private aZ(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: getstatic       org/whispersystems/aZ.o:Z
        //     5: istore          4
        //     7: aload_0        
        //     8: invokespecial   com/google/dS.<init>:()V
        //    11: aload_0        
        //    12: iconst_m1      
        //    13: putfield        org/whispersystems/aZ.t:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        org/whispersystems/aZ.r:I
        //    21: aload_0        
        //    22: invokespecial   org/whispersystems/aZ.m:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            715
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 750
        //                8: 192
        //               18: 215
        //               26: 238
        //               34: 261
        //               40: 285
        //               50: 942
        //               58: 395
        //               66: 446
        //               74: 936
        //               80: 615
        //               88: 640
        //               96: 665
        //              106: 690
        //          default: 168
        //        }
        //   168: aload_0        
        //   169: aload_1        
        //   170: aload           5
        //   172: aload_2        
        //   173: iload           12
        //   175: invokevirtual   org/whispersystems/aZ.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   178: istore          33
        //   180: iload           33
        //   182: ifne            710
        //   185: iload           4
        //   187: ifeq            931
        //   190: iconst_1       
        //   191: istore_3       
        //   192: aload_0        
        //   193: iconst_1       
        //   194: aload_0        
        //   195: getfield        org/whispersystems/aZ.K:I
        //   198: ior            
        //   199: putfield        org/whispersystems/aZ.K:I
        //   202: aload_0        
        //   203: aload_1        
        //   204: invokevirtual   com/google/cL.l:()I
        //   207: putfield        org/whispersystems/aZ.e:I
        //   210: iload           4
        //   212: ifeq            710
        //   215: aload_0        
        //   216: iconst_2       
        //   217: aload_0        
        //   218: getfield        org/whispersystems/aZ.K:I
        //   221: ior            
        //   222: putfield        org/whispersystems/aZ.K:I
        //   225: aload_0        
        //   226: aload_1        
        //   227: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   230: putfield        org/whispersystems/aZ.q:Lcom/google/hv;
        //   233: iload           4
        //   235: ifeq            710
        //   238: aload_0        
        //   239: iconst_4       
        //   240: aload_0        
        //   241: getfield        org/whispersystems/aZ.K:I
        //   244: ior            
        //   245: putfield        org/whispersystems/aZ.K:I
        //   248: aload_0        
        //   249: aload_1        
        //   250: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   253: putfield        org/whispersystems/aZ.j:Lcom/google/hv;
        //   256: iload           4
        //   258: ifeq            710
        //   261: aload_0        
        //   262: bipush          8
        //   264: aload_0        
        //   265: getfield        org/whispersystems/aZ.K:I
        //   268: ior            
        //   269: putfield        org/whispersystems/aZ.K:I
        //   272: aload_0        
        //   273: aload_1        
        //   274: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   277: putfield        org/whispersystems/aZ.B:Lcom/google/hv;
        //   280: iload           4
        //   282: ifeq            710
        //   285: aload_0        
        //   286: bipush          16
        //   288: aload_0        
        //   289: getfield        org/whispersystems/aZ.K:I
        //   292: ior            
        //   293: putfield        org/whispersystems/aZ.K:I
        //   296: aload_0        
        //   297: aload_1        
        //   298: invokevirtual   com/google/cL.l:()I
        //   301: putfield        org/whispersystems/aZ.x:I
        //   304: iload           4
        //   306: ifeq            710
        //   309: iload_3        
        //   310: istore          13
        //   312: bipush          32
        //   314: aload_0        
        //   315: getfield        org/whispersystems/aZ.K:I
        //   318: iand           
        //   319: bipush          32
        //   321: if_icmpne       925
        //   324: aload_0        
        //   325: getfield        org/whispersystems/aZ.g:Lorg/whispersystems/a_;
        //   328: invokevirtual   org/whispersystems/a_.d:()Lorg/whispersystems/bT;
        //   331: astore          31
        //   333: aload           31
        //   335: astore          14
        //   337: aload_0        
        //   338: aload_1        
        //   339: getstatic       org/whispersystems/a_.g:Lcom/google/du;
        //   342: aload_2        
        //   343: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   346: checkcast       Lorg/whispersystems/a_;
        //   349: putfield        org/whispersystems/aZ.g:Lorg/whispersystems/a_;
        //   352: aload           14
        //   354: ifnull          376
        //   357: aload           14
        //   359: aload_0        
        //   360: getfield        org/whispersystems/aZ.g:Lorg/whispersystems/a_;
        //   363: invokevirtual   org/whispersystems/bT.a:(Lorg/whispersystems/a_;)Lorg/whispersystems/bT;
        //   366: pop            
        //   367: aload_0        
        //   368: aload           14
        //   370: invokevirtual   org/whispersystems/bT.h:()Lorg/whispersystems/a_;
        //   373: putfield        org/whispersystems/aZ.g:Lorg/whispersystems/a_;
        //   376: aload_0        
        //   377: bipush          32
        //   379: aload_0        
        //   380: getfield        org/whispersystems/aZ.K:I
        //   383: ior            
        //   384: putfield        org/whispersystems/aZ.K:I
        //   387: iload           4
        //   389: ifeq            907
        //   392: iload           13
        //   394: istore_3       
        //   395: iload           6
        //   397: bipush          64
        //   399: iand           
        //   400: bipush          64
        //   402: if_icmpeq       423
        //   405: aload_0        
        //   406: new             Ljava/util/ArrayList;
        //   409: dup            
        //   410: invokespecial   java/util/ArrayList.<init>:()V
        //   413: putfield        org/whispersystems/aZ.D:Ljava/util/List;
        //   416: iload           6
        //   418: bipush          64
        //   420: ior            
        //   421: istore          6
        //   423: aload_0        
        //   424: getfield        org/whispersystems/aZ.D:Ljava/util/List;
        //   427: aload_1        
        //   428: getstatic       org/whispersystems/a_.g:Lcom/google/du;
        //   431: aload_2        
        //   432: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   435: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   440: pop            
        //   441: iload           4
        //   443: ifeq            710
        //   446: iload_3        
        //   447: istore          13
        //   449: bipush          64
        //   451: aload_0        
        //   452: getfield        org/whispersystems/aZ.K:I
        //   455: iand           
        //   456: bipush          64
        //   458: if_icmpne       919
        //   461: aload_0        
        //   462: getfield        org/whispersystems/aZ.m:Lorg/whispersystems/aD;
        //   465: invokevirtual   org/whispersystems/aD.h:()Lorg/whispersystems/b4;
        //   468: astore          30
        //   470: aload           30
        //   472: astore          19
        //   474: aload_0        
        //   475: aload_1        
        //   476: getstatic       org/whispersystems/aD.h:Lcom/google/du;
        //   479: aload_2        
        //   480: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   483: checkcast       Lorg/whispersystems/aD;
        //   486: putfield        org/whispersystems/aZ.m:Lorg/whispersystems/aD;
        //   489: aload           19
        //   491: ifnull          513
        //   494: aload           19
        //   496: aload_0        
        //   497: getfield        org/whispersystems/aZ.m:Lorg/whispersystems/aD;
        //   500: invokevirtual   org/whispersystems/b4.a:(Lorg/whispersystems/aD;)Lorg/whispersystems/b4;
        //   503: pop            
        //   504: aload_0        
        //   505: aload           19
        //   507: invokevirtual   org/whispersystems/b4.f:()Lorg/whispersystems/aD;
        //   510: putfield        org/whispersystems/aZ.m:Lorg/whispersystems/aD;
        //   513: aload_0        
        //   514: bipush          64
        //   516: aload_0        
        //   517: getfield        org/whispersystems/aZ.K:I
        //   520: ior            
        //   521: putfield        org/whispersystems/aZ.K:I
        //   524: iload           4
        //   526: ifeq            907
        //   529: sipush          128
        //   532: aload_0        
        //   533: getfield        org/whispersystems/aZ.K:I
        //   536: iand           
        //   537: sipush          128
        //   540: if_icmpne       913
        //   543: aload_0        
        //   544: getfield        org/whispersystems/aZ.F:Lorg/whispersystems/av;
        //   547: invokevirtual   org/whispersystems/av.n:()Lorg/whispersystems/bS;
        //   550: astore          29
        //   552: aload           29
        //   554: astore          22
        //   556: aload_0        
        //   557: aload_1        
        //   558: getstatic       org/whispersystems/av.PARSER:Lcom/google/du;
        //   561: aload_2        
        //   562: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   565: checkcast       Lorg/whispersystems/av;
        //   568: putfield        org/whispersystems/aZ.F:Lorg/whispersystems/av;
        //   571: aload           22
        //   573: ifnull          595
        //   576: aload           22
        //   578: aload_0        
        //   579: getfield        org/whispersystems/aZ.F:Lorg/whispersystems/av;
        //   582: invokevirtual   org/whispersystems/bS.a:(Lorg/whispersystems/av;)Lorg/whispersystems/bS;
        //   585: pop            
        //   586: aload_0        
        //   587: aload           22
        //   589: invokevirtual   org/whispersystems/bS.g:()Lorg/whispersystems/av;
        //   592: putfield        org/whispersystems/aZ.F:Lorg/whispersystems/av;
        //   595: aload_0        
        //   596: sipush          128
        //   599: aload_0        
        //   600: getfield        org/whispersystems/aZ.K:I
        //   603: ior            
        //   604: putfield        org/whispersystems/aZ.K:I
        //   607: iload           4
        //   609: ifeq            907
        //   612: iload           13
        //   614: istore_3       
        //   615: aload_0        
        //   616: sipush          256
        //   619: aload_0        
        //   620: getfield        org/whispersystems/aZ.K:I
        //   623: ior            
        //   624: putfield        org/whispersystems/aZ.K:I
        //   627: aload_0        
        //   628: aload_1        
        //   629: invokevirtual   com/google/cL.l:()I
        //   632: putfield        org/whispersystems/aZ.f:I
        //   635: iload           4
        //   637: ifeq            710
        //   640: aload_0        
        //   641: sipush          512
        //   644: aload_0        
        //   645: getfield        org/whispersystems/aZ.K:I
        //   648: ior            
        //   649: putfield        org/whispersystems/aZ.K:I
        //   652: aload_0        
        //   653: aload_1        
        //   654: invokevirtual   com/google/cL.l:()I
        //   657: putfield        org/whispersystems/aZ.H:I
        //   660: iload           4
        //   662: ifeq            710
        //   665: aload_0        
        //   666: sipush          1024
        //   669: aload_0        
        //   670: getfield        org/whispersystems/aZ.K:I
        //   673: ior            
        //   674: putfield        org/whispersystems/aZ.K:I
        //   677: aload_0        
        //   678: aload_1        
        //   679: invokevirtual   com/google/cL.x:()Z
        //   682: putfield        org/whispersystems/aZ.n:Z
        //   685: iload           4
        //   687: ifeq            710
        //   690: aload_0        
        //   691: sipush          2048
        //   694: aload_0        
        //   695: getfield        org/whispersystems/aZ.K:I
        //   698: ior            
        //   699: putfield        org/whispersystems/aZ.K:I
        //   702: aload_0        
        //   703: aload_1        
        //   704: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   707: putfield        org/whispersystems/aZ.w:Lcom/google/hv;
        //   710: iload           4
        //   712: ifeq            33
        //   715: iload           6
        //   717: bipush          64
        //   719: iand           
        //   720: bipush          64
        //   722: if_icmpne       736
        //   725: aload_0        
        //   726: aload_0        
        //   727: getfield        org/whispersystems/aZ.D:Ljava/util/List;
        //   730: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   733: putfield        org/whispersystems/aZ.D:Ljava/util/List;
        //   736: aload_0        
        //   737: aload           5
        //   739: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   742: putfield        org/whispersystems/aZ.y:Lcom/google/ce;
        //   745: aload_0        
        //   746: invokevirtual   org/whispersystems/aZ.c:()V
        //   749: return         
        //   750: iload           4
        //   752: ifeq            931
        //   755: iconst_1       
        //   756: istore_3       
        //   757: goto            168
        //   760: astore          32
        //   762: aload           32
        //   764: athrow         
        //   765: astore          11
        //   767: aload           11
        //   769: aload_0        
        //   770: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   773: athrow         
        //   774: astore          9
        //   776: iload           6
        //   778: bipush          64
        //   780: iand           
        //   781: bipush          64
        //   783: if_icmpne       797
        //   786: aload_0        
        //   787: aload_0        
        //   788: getfield        org/whispersystems/aZ.D:Ljava/util/List;
        //   791: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   794: putfield        org/whispersystems/aZ.D:Ljava/util/List;
        //   797: aload_0        
        //   798: aload           5
        //   800: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   803: putfield        org/whispersystems/aZ.y:Lcom/google/ce;
        //   806: aload_0        
        //   807: invokevirtual   org/whispersystems/aZ.c:()V
        //   810: aload           9
        //   812: athrow         
        //   813: astore          34
        //   815: aload           34
        //   817: athrow         
        //   818: astore          35
        //   820: aload           35
        //   822: athrow         
        //   823: astore          36
        //   825: aload           36
        //   827: athrow         
        //   828: astore          37
        //   830: aload           37
        //   832: athrow         
        //   833: astore          38
        //   835: aload           38
        //   837: athrow         
        //   838: astore          8
        //   840: new             Lcom/google/bg;
        //   843: dup            
        //   844: aload           8
        //   846: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   849: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   852: aload_0        
        //   853: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   856: athrow         
        //   857: astore          15
        //   859: aload           15
        //   861: athrow         
        //   862: astore          17
        //   864: aload           17
        //   866: athrow         
        //   867: astore          20
        //   869: aload           20
        //   871: athrow         
        //   872: astore          23
        //   874: aload           23
        //   876: athrow         
        //   877: astore          25
        //   879: aload           25
        //   881: athrow         
        //   882: astore          26
        //   884: aload           26
        //   886: athrow         
        //   887: astore          27
        //   889: aload           27
        //   891: athrow         
        //   892: astore          28
        //   894: aload           28
        //   896: athrow         
        //   897: astore          7
        //   899: aload           7
        //   901: athrow         
        //   902: astore          10
        //   904: aload           10
        //   906: athrow         
        //   907: iload           13
        //   909: istore_3       
        //   910: goto            710
        //   913: aconst_null    
        //   914: astore          22
        //   916: goto            556
        //   919: aconst_null    
        //   920: astore          19
        //   922: goto            474
        //   925: aconst_null    
        //   926: astore          14
        //   928: goto            337
        //   931: iconst_1       
        //   932: istore_3       
        //   933: goto            710
        //   936: iload_3        
        //   937: istore          13
        //   939: goto            529
        //   942: iload_3        
        //   943: istore          13
        //   945: goto            312
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     765    774    Lcom/google/bg;
        //  37     43     838    857    Ljava/io/IOException;
        //  37     43     774    813    Any
        //  168    180    760    765    Lcom/google/bg;
        //  168    180    838    857    Ljava/io/IOException;
        //  168    180    774    813    Any
        //  192    210    813    818    Lcom/google/bg;
        //  192    210    838    857    Ljava/io/IOException;
        //  192    210    774    813    Any
        //  215    233    818    823    Lcom/google/bg;
        //  215    233    838    857    Ljava/io/IOException;
        //  215    233    774    813    Any
        //  238    256    823    828    Lcom/google/bg;
        //  238    256    838    857    Ljava/io/IOException;
        //  238    256    774    813    Any
        //  261    280    828    833    Lcom/google/bg;
        //  261    280    838    857    Ljava/io/IOException;
        //  261    280    774    813    Any
        //  285    304    833    838    Lcom/google/bg;
        //  285    304    838    857    Ljava/io/IOException;
        //  285    304    774    813    Any
        //  312    333    765    774    Lcom/google/bg;
        //  312    333    838    857    Ljava/io/IOException;
        //  312    333    774    813    Any
        //  337    352    857    862    Lcom/google/bg;
        //  337    352    838    857    Ljava/io/IOException;
        //  337    352    774    813    Any
        //  357    376    857    862    Lcom/google/bg;
        //  357    376    838    857    Ljava/io/IOException;
        //  357    376    774    813    Any
        //  376    387    862    867    Lcom/google/bg;
        //  376    387    838    857    Ljava/io/IOException;
        //  376    387    774    813    Any
        //  405    416    765    774    Lcom/google/bg;
        //  405    416    838    857    Ljava/io/IOException;
        //  405    416    774    813    Any
        //  423    441    765    774    Lcom/google/bg;
        //  423    441    838    857    Ljava/io/IOException;
        //  423    441    774    813    Any
        //  449    470    765    774    Lcom/google/bg;
        //  449    470    838    857    Ljava/io/IOException;
        //  449    470    774    813    Any
        //  474    489    867    872    Lcom/google/bg;
        //  474    489    838    857    Ljava/io/IOException;
        //  474    489    774    813    Any
        //  494    513    867    872    Lcom/google/bg;
        //  494    513    838    857    Ljava/io/IOException;
        //  494    513    774    813    Any
        //  513    524    765    774    Lcom/google/bg;
        //  513    524    838    857    Ljava/io/IOException;
        //  513    524    774    813    Any
        //  529    552    765    774    Lcom/google/bg;
        //  529    552    838    857    Ljava/io/IOException;
        //  529    552    774    813    Any
        //  556    571    872    877    Lcom/google/bg;
        //  556    571    838    857    Ljava/io/IOException;
        //  556    571    774    813    Any
        //  576    595    872    877    Lcom/google/bg;
        //  576    595    838    857    Ljava/io/IOException;
        //  576    595    774    813    Any
        //  595    607    877    882    Lcom/google/bg;
        //  595    607    838    857    Ljava/io/IOException;
        //  595    607    774    813    Any
        //  615    635    877    882    Lcom/google/bg;
        //  615    635    838    857    Ljava/io/IOException;
        //  615    635    774    813    Any
        //  640    660    882    887    Lcom/google/bg;
        //  640    660    838    857    Ljava/io/IOException;
        //  640    660    774    813    Any
        //  665    685    887    892    Lcom/google/bg;
        //  665    685    838    857    Ljava/io/IOException;
        //  665    685    774    813    Any
        //  690    710    892    897    Lcom/google/bg;
        //  690    710    838    857    Ljava/io/IOException;
        //  690    710    774    813    Any
        //  725    736    897    902    Lcom/google/bg;
        //  762    765    765    774    Lcom/google/bg;
        //  762    765    838    857    Ljava/io/IOException;
        //  762    765    774    813    Any
        //  767    774    774    813    Any
        //  786    797    902    907    Lcom/google/bg;
        //  815    818    818    823    Lcom/google/bg;
        //  815    818    838    857    Ljava/io/IOException;
        //  815    818    774    813    Any
        //  820    823    823    828    Lcom/google/bg;
        //  820    823    838    857    Ljava/io/IOException;
        //  820    823    774    813    Any
        //  825    828    828    833    Lcom/google/bg;
        //  825    828    838    857    Ljava/io/IOException;
        //  825    828    774    813    Any
        //  830    833    833    838    Lcom/google/bg;
        //  830    833    838    857    Ljava/io/IOException;
        //  830    833    774    813    Any
        //  835    838    765    774    Lcom/google/bg;
        //  835    838    838    857    Ljava/io/IOException;
        //  835    838    774    813    Any
        //  840    857    774    813    Any
        //  859    862    765    774    Lcom/google/bg;
        //  859    862    838    857    Ljava/io/IOException;
        //  859    862    774    813    Any
        //  864    867    765    774    Lcom/google/bg;
        //  864    867    838    857    Ljava/io/IOException;
        //  864    867    774    813    Any
        //  869    872    765    774    Lcom/google/bg;
        //  869    872    838    857    Ljava/io/IOException;
        //  869    872    774    813    Any
        //  874    877    765    774    Lcom/google/bg;
        //  874    877    838    857    Ljava/io/IOException;
        //  874    877    774    813    Any
        //  879    882    882    887    Lcom/google/bg;
        //  879    882    838    857    Ljava/io/IOException;
        //  879    882    774    813    Any
        //  884    887    887    892    Lcom/google/bg;
        //  884    887    838    857    Ljava/io/IOException;
        //  884    887    774    813    Any
        //  889    892    892    897    Lcom/google/bg;
        //  889    892    838    857    Ljava/io/IOException;
        //  889    892    774    813    Any
        //  894    897    765    774    Lcom/google/bg;
        //  894    897    838    857    Ljava/io/IOException;
        //  894    897    774    813    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 416, Size: 416
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    aZ(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private aZ(final fp fp) {
        super(fp);
        this.t = -1;
        this.r = -1;
        this.y = fp.getUnknownFields();
    }
    
    aZ(final fp fp, final j j) {
        this(fp);
    }
    
    private aZ(final boolean b) {
        this.t = -1;
        this.r = -1;
        this.y = ce.d();
    }
    
    public static final bl D() {
        return bO.x();
    }
    
    static boolean L() {
        return aZ.d;
    }
    
    static boolean M() {
        return aZ.d;
    }
    
    static int a(final aZ az, final int f) {
        return az.f = f;
    }
    
    static hv a(final aZ az, final hv j) {
        return az.j = j;
    }
    
    static List a(final aZ az, final List d) {
        return az.D = d;
    }
    
    public static a2 a(final aZ az) {
        return o().a(az);
    }
    
    static aD a(final aZ az, final aD m) {
        return az.m = m;
    }
    
    public static aZ a(final cL cl) {
        return (aZ)aZ.E.a(cl);
    }
    
    public static aZ a(final cL cl, final fu fu) {
        return (aZ)aZ.E.a(cl, fu);
    }
    
    public static aZ a(final hv hv) {
        return (aZ)aZ.E.a(hv);
    }
    
    public static aZ a(final hv hv, final fu fu) {
        return (aZ)aZ.E.a(hv, fu);
    }
    
    public static aZ a(final InputStream inputStream) {
        return (aZ)aZ.E.b(inputStream);
    }
    
    public static aZ a(final InputStream inputStream, final fu fu) {
        return (aZ)aZ.E.b(inputStream, fu);
    }
    
    public static aZ a(final byte[] array) {
        return (aZ)aZ.E.a(array);
    }
    
    public static aZ a(final byte[] array, final fu fu) {
        return (aZ)aZ.E.a(array, fu);
    }
    
    static a_ a(final aZ az, final a_ g) {
        return az.g = g;
    }
    
    static av a(final aZ az, final av f) {
        return az.F = f;
    }
    
    static boolean a(final aZ az, final boolean n) {
        return az.n = n;
    }
    
    static int b(final aZ az, final int x) {
        return az.x = x;
    }
    
    static hv b(final aZ az, final hv w) {
        return az.w = w;
    }
    
    static List b(final aZ az) {
        return az.D;
    }
    
    public static aZ b(final InputStream inputStream) {
        return (aZ)aZ.E.a(inputStream);
    }
    
    public static aZ b(final InputStream inputStream, final fu fu) {
        return (aZ)aZ.E.a(inputStream, fu);
    }
    
    static int c(final aZ az, final int e) {
        return az.e = e;
    }
    
    static hv c(final aZ az, final hv b) {
        return az.B = b;
    }
    
    static int d(final aZ az, final int k) {
        return az.K = k;
    }
    
    static hv d(final aZ az, final hv q) {
        return az.q = q;
    }
    
    static int e(final aZ az, final int h) {
        return az.H = h;
    }
    
    public static aZ i() {
        return aZ.G;
    }
    
    private void m() {
        this.e = 0;
        this.q = hv.b;
        this.j = hv.b;
        this.B = hv.b;
        this.x = 0;
        this.g = a_.m();
        this.D = Collections.emptyList();
        this.m = aD.d();
        this.F = av.c();
        this.f = 0;
        this.H = 0;
        this.n = false;
        this.w = hv.b;
    }
    
    public static a2 o() {
        return a2.d();
    }
    
    public boolean A() {
        return this.n;
    }
    
    public boolean B() {
        return (0x400 & this.K) == 0x400;
    }
    
    public int C() {
        return this.x;
    }
    
    public boolean E() {
        return (0x1 & this.K) == 0x1;
    }
    
    public int F() {
        return this.e;
    }
    
    public ab G() {
        return this.m;
    }
    
    public N H() {
        return this.F;
    }
    
    public a2 I() {
        return o();
    }
    
    public a J() {
        return this.g;
    }
    
    public boolean K() {
        return (0x100 & this.K) == 0x100;
    }
    
    public List a() {
        return this.D;
    }
    
    protected a2 a(final dg dg) {
        return new a2(dg, null);
    }
    
    public a a(final int n) {
        return this.D.get(n);
    }
    
    public a_ b(final int n) {
        return this.D.get(n);
    }
    
    public boolean b() {
        return (0x20 & this.K) == 0x20;
    }
    
    public hv c() {
        return this.B;
    }
    
    public int d() {
        return this.H;
    }
    
    public int e() {
        return this.D.size();
    }
    
    public List f() {
        return this.D;
    }
    
    public boolean g() {
        return (0x10 & this.K) == 0x10;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.k();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.k();
    }
    
    @Override
    public du getParserForType() {
        return aZ.E;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean o = aZ.o;
        final int r = this.r;
        if (r != -1) {
            return r;
        }
        int n;
        if ((0x1 & this.K) == 0x1) {
            n = 0 + ep.b(1, this.e);
        }
        else {
            n = 0;
        }
        if ((0x2 & this.K) == 0x2) {
            n += ep.b(2, this.q);
        }
        if ((0x4 & this.K) == 0x4) {
            n += ep.b(3, this.j);
        }
        if ((0x8 & this.K) == 0x8) {
            n += ep.b(4, this.B);
        }
        if ((0x10 & this.K) == 0x10) {
            n += ep.b(5, this.x);
        }
        if ((0x20 & this.K) == 0x20) {
            n += ep.f(6, this.g);
        }
        int n2 = n;
        while (true) {
            while (i < this.D.size()) {
                int n3 = n2 + ep.f(7, this.D.get(i));
                ++i;
                if (o) {
                    if ((0x40 & this.K) == 0x40) {
                        n3 += ep.f(8, this.m);
                    }
                    if ((0x80 & this.K) == 0x80) {
                        n3 += ep.f(9, this.F);
                    }
                    if ((0x100 & this.K) == 0x100) {
                        n3 += ep.b(10, this.f);
                    }
                    if ((0x200 & this.K) == 0x200) {
                        n3 += ep.b(11, this.H);
                    }
                    if ((0x400 & this.K) == 0x400) {
                        n3 += ep.a(12, this.n);
                    }
                    if ((0x800 & this.K) == 0x800) {
                        n3 += ep.b(13, this.w);
                    }
                    return this.r = n3 + this.getUnknownFields().getSerializedSize();
                }
                n2 = n3;
            }
            int n3 = n2;
            continue;
        }
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.y;
    }
    
    public boolean h() {
        return (0x80 & this.K) == 0x80;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.s().a(aZ.class, a2.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte t = this.t;
        if (t != -1) {
            return t == 1;
        }
        this.t = 1;
        return true;
    }
    
    public hv j() {
        return this.w;
    }
    
    public aZ k() {
        return aZ.G;
    }
    
    public boolean l() {
        return (0x4 & this.K) == 0x4;
    }
    
    public hv n() {
        return this.q;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.I();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.I();
    }
    
    public av p() {
        return this.F;
    }
    
    public a_ q() {
        return this.g;
    }
    
    public a2 r() {
        return a(this);
    }
    
    public boolean s() {
        return (0x800 & this.K) == 0x800;
    }
    
    public boolean t() {
        return (0x2 & this.K) == 0x2;
    }
    
    @Override
    public a8 toBuilder() {
        return this.r();
    }
    
    @Override
    public aJ toBuilder() {
        return this.r();
    }
    
    public aD u() {
        return this.m;
    }
    
    public boolean v() {
        return (0x8 & this.K) == 0x8;
    }
    
    public hv w() {
        return this.j;
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean o = aZ.o;
        this.getSerializedSize();
        if ((0x1 & this.K) == 0x1) {
            ep.a(1, this.e);
        }
        if ((0x2 & this.K) == 0x2) {
            ep.c(2, this.q);
        }
        if ((0x4 & this.K) == 0x4) {
            ep.c(3, this.j);
        }
        if ((0x8 & this.K) == 0x8) {
            ep.c(4, this.B);
        }
        if ((0x10 & this.K) == 0x10) {
            ep.a(5, this.x);
        }
        if ((0x20 & this.K) == 0x20) {
            ep.e(6, this.g);
        }
        int n;
        for (int i = 0; i < this.D.size(); i = n) {
            ep.e(7, (ci)this.D.get(i));
            n = i + 1;
            if (o) {
                break;
            }
        }
        if ((0x40 & this.K) == 0x40) {
            ep.e(8, this.m);
        }
        if ((0x80 & this.K) == 0x80) {
            ep.e(9, this.F);
        }
        if ((0x100 & this.K) == 0x100) {
            ep.a(10, this.f);
        }
        if ((0x200 & this.K) == 0x200) {
            ep.a(11, this.H);
        }
        if ((0x400 & this.K) == 0x400) {
            ep.b(12, this.n);
        }
        if ((0x800 & this.K) == 0x800) {
            ep.c(13, this.w);
        }
        this.getUnknownFields().writeTo(ep);
    }
    
    public boolean x() {
        return (0x40 & this.K) == 0x40;
    }
    
    public boolean y() {
        return (0x200 & this.K) == 0x200;
    }
    
    public int z() {
        return this.f;
    }
}
