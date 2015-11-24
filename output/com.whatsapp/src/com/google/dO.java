// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.InputStream;
import java.util.List;

public final class dO extends dS implements g
{
    public static final int B = 10;
    public static final int D = 11;
    public static final int E = 3;
    private static final dO e;
    public static final int f = 6;
    public static final int h = 8;
    public static final int j = 4;
    public static final int k = 5;
    public static final int m = 2;
    public static final int r = 9;
    private static final long serialVersionUID = 0L;
    public static final int t = 7;
    public static final int v = 1;
    public static du z;
    private List A;
    private int C;
    private List F;
    private Object g;
    private dR i;
    private List l;
    private byte n;
    private List o;
    private Object p;
    private dZ q;
    private final ce s;
    private int u;
    private List w;
    private eQ x;
    private List y;
    
    static {
        dO.z = new hC();
        (e = new dO(true)).d();
    }
    
    private dO(final cL p0, final fu p1) {
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
        //    10: putfield        com/google/dO.n:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        com/google/dO.u:I
        //    18: aload_0        
        //    19: invokespecial   com/google/dO.d:()V
        //    22: iconst_0       
        //    23: istore          4
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload           6
        //    35: ifne            919
        //    38: aload_1        
        //    39: invokevirtual   com/google/cL.a:()I
        //    42: istore          24
        //    44: iload           24
        //    46: lookupswitch {
        //                0: 1086
        //               10: 192
        //               18: 214
        //               26: 236
        //               34: 278
        //               42: 328
        //               50: 378
        //               58: 431
        //               66: 484
        //               74: 1454
        //               80: 647
        //               82: 696
        //               88: 783
        //               90: 832
        //          default: 168
        //        }
        //   168: aload_0        
        //   169: aload_1        
        //   170: aload           5
        //   172: aload_2        
        //   173: iload           24
        //   175: invokevirtual   com/google/dO.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   178: istore          43
        //   180: iload           43
        //   182: ifne            915
        //   185: iconst_1       
        //   186: istore          6
        //   188: iload_3        
        //   189: ifeq            915
        //   192: aload_0        
        //   193: iconst_1       
        //   194: aload_0        
        //   195: getfield        com/google/dO.C:I
        //   198: ior            
        //   199: putfield        com/google/dO.C:I
        //   202: aload_0        
        //   203: aload_1        
        //   204: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   207: putfield        com/google/dO.g:Ljava/lang/Object;
        //   210: iload_3        
        //   211: ifeq            915
        //   214: aload_0        
        //   215: iconst_2       
        //   216: aload_0        
        //   217: getfield        com/google/dO.C:I
        //   220: ior            
        //   221: putfield        com/google/dO.C:I
        //   224: aload_0        
        //   225: aload_1        
        //   226: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   229: putfield        com/google/dO.p:Ljava/lang/Object;
        //   232: iload_3        
        //   233: ifeq            915
        //   236: iload           4
        //   238: iconst_4       
        //   239: iand           
        //   240: iconst_4       
        //   241: if_icmpeq       261
        //   244: aload_0        
        //   245: new             Lcom/google/gJ;
        //   248: dup            
        //   249: invokespecial   com/google/gJ.<init>:()V
        //   252: putfield        com/google/dO.x:Lcom/google/eQ;
        //   255: iload           4
        //   257: iconst_4       
        //   258: ior            
        //   259: istore          4
        //   261: aload_0        
        //   262: getfield        com/google/dO.x:Lcom/google/eQ;
        //   265: aload_1        
        //   266: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   269: invokeinterface com/google/eQ.a:(Lcom/google/hv;)V
        //   274: iload_3        
        //   275: ifeq            915
        //   278: iload           4
        //   280: bipush          32
        //   282: iand           
        //   283: bipush          32
        //   285: if_icmpeq       306
        //   288: aload_0        
        //   289: new             Ljava/util/ArrayList;
        //   292: dup            
        //   293: invokespecial   java/util/ArrayList.<init>:()V
        //   296: putfield        com/google/dO.o:Ljava/util/List;
        //   299: iload           4
        //   301: bipush          32
        //   303: ior            
        //   304: istore          4
        //   306: aload_0        
        //   307: getfield        com/google/dO.o:Ljava/util/List;
        //   310: aload_1        
        //   311: getstatic       com/google/dQ.j:Lcom/google/du;
        //   314: aload_2        
        //   315: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   318: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   323: pop            
        //   324: iload_3        
        //   325: ifeq            915
        //   328: iload           4
        //   330: bipush          64
        //   332: iand           
        //   333: bipush          64
        //   335: if_icmpeq       356
        //   338: aload_0        
        //   339: new             Ljava/util/ArrayList;
        //   342: dup            
        //   343: invokespecial   java/util/ArrayList.<init>:()V
        //   346: putfield        com/google/dO.w:Ljava/util/List;
        //   349: iload           4
        //   351: bipush          64
        //   353: ior            
        //   354: istore          4
        //   356: aload_0        
        //   357: getfield        com/google/dO.w:Ljava/util/List;
        //   360: aload_1        
        //   361: getstatic       com/google/dq.e:Lcom/google/du;
        //   364: aload_2        
        //   365: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   368: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   373: pop            
        //   374: iload_3        
        //   375: ifeq            915
        //   378: iload           4
        //   380: sipush          128
        //   383: iand           
        //   384: sipush          128
        //   387: if_icmpeq       409
        //   390: aload_0        
        //   391: new             Ljava/util/ArrayList;
        //   394: dup            
        //   395: invokespecial   java/util/ArrayList.<init>:()V
        //   398: putfield        com/google/dO.A:Ljava/util/List;
        //   401: iload           4
        //   403: sipush          128
        //   406: ior            
        //   407: istore          4
        //   409: aload_0        
        //   410: getfield        com/google/dO.A:Ljava/util/List;
        //   413: aload_1        
        //   414: getstatic       com/google/dB.n:Lcom/google/du;
        //   417: aload_2        
        //   418: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   421: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   426: pop            
        //   427: iload_3        
        //   428: ifeq            915
        //   431: iload           4
        //   433: sipush          256
        //   436: iand           
        //   437: sipush          256
        //   440: if_icmpeq       462
        //   443: aload_0        
        //   444: new             Ljava/util/ArrayList;
        //   447: dup            
        //   448: invokespecial   java/util/ArrayList.<init>:()V
        //   451: putfield        com/google/dO.l:Ljava/util/List;
        //   454: iload           4
        //   456: sipush          256
        //   459: ior            
        //   460: istore          4
        //   462: aload_0        
        //   463: getfield        com/google/dO.l:Ljava/util/List;
        //   466: aload_1        
        //   467: getstatic       com/google/dC.h:Lcom/google/du;
        //   470: aload_2        
        //   471: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   474: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   479: pop            
        //   480: iload_3        
        //   481: ifeq            915
        //   484: iload           6
        //   486: istore          25
        //   488: iconst_4       
        //   489: aload_0        
        //   490: getfield        com/google/dO.C:I
        //   493: iand           
        //   494: iconst_4       
        //   495: if_icmpne       1448
        //   498: aload_0        
        //   499: getfield        com/google/dO.q:Lcom/google/dZ;
        //   502: invokevirtual   com/google/dZ.p:()Lcom/google/gl;
        //   505: astore          58
        //   507: aload           58
        //   509: astore          55
        //   511: aload_0        
        //   512: aload_1        
        //   513: getstatic       com/google/dZ.w:Lcom/google/du;
        //   516: aload_2        
        //   517: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   520: checkcast       Lcom/google/dZ;
        //   523: putfield        com/google/dO.q:Lcom/google/dZ;
        //   526: aload           55
        //   528: ifnull          550
        //   531: aload           55
        //   533: aload_0        
        //   534: getfield        com/google/dO.q:Lcom/google/dZ;
        //   537: invokevirtual   com/google/gl.a:(Lcom/google/dZ;)Lcom/google/gl;
        //   540: pop            
        //   541: aload_0        
        //   542: aload           55
        //   544: invokevirtual   com/google/gl.h:()Lcom/google/dZ;
        //   547: putfield        com/google/dO.q:Lcom/google/dZ;
        //   550: aload_0        
        //   551: iconst_4       
        //   552: aload_0        
        //   553: getfield        com/google/dO.C:I
        //   556: ior            
        //   557: putfield        com/google/dO.C:I
        //   560: iload_3        
        //   561: ifeq            1435
        //   564: bipush          8
        //   566: aload_0        
        //   567: getfield        com/google/dO.C:I
        //   570: iand           
        //   571: bipush          8
        //   573: if_icmpne       1442
        //   576: aload_0        
        //   577: getfield        com/google/dO.i:Lcom/google/dR;
        //   580: invokevirtual   com/google/dR.g:()Lcom/google/g4;
        //   583: astore          41
        //   585: aload           41
        //   587: astore          26
        //   589: aload_0        
        //   590: aload_1        
        //   591: getstatic       com/google/dR.f:Lcom/google/du;
        //   594: aload_2        
        //   595: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   598: checkcast       Lcom/google/dR;
        //   601: putfield        com/google/dO.i:Lcom/google/dR;
        //   604: aload           26
        //   606: ifnull          628
        //   609: aload           26
        //   611: aload_0        
        //   612: getfield        com/google/dO.i:Lcom/google/dR;
        //   615: invokevirtual   com/google/g4.a:(Lcom/google/dR;)Lcom/google/g4;
        //   618: pop            
        //   619: aload_0        
        //   620: aload           26
        //   622: invokevirtual   com/google/g4.a:()Lcom/google/dR;
        //   625: putfield        com/google/dO.i:Lcom/google/dR;
        //   628: aload_0        
        //   629: bipush          8
        //   631: aload_0        
        //   632: getfield        com/google/dO.C:I
        //   635: ior            
        //   636: putfield        com/google/dO.C:I
        //   639: iload_3        
        //   640: ifeq            1435
        //   643: iload           25
        //   645: istore          6
        //   647: iload           4
        //   649: bipush          8
        //   651: iand           
        //   652: bipush          8
        //   654: if_icmpeq       675
        //   657: aload_0        
        //   658: new             Ljava/util/ArrayList;
        //   661: dup            
        //   662: invokespecial   java/util/ArrayList.<init>:()V
        //   665: putfield        com/google/dO.y:Ljava/util/List;
        //   668: iload           4
        //   670: bipush          8
        //   672: ior            
        //   673: istore          4
        //   675: aload_0        
        //   676: getfield        com/google/dO.y:Ljava/util/List;
        //   679: aload_1        
        //   680: invokevirtual   com/google/cL.j:()I
        //   683: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   686: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   691: pop            
        //   692: iload_3        
        //   693: ifeq            915
        //   696: aload_1        
        //   697: aload_1        
        //   698: invokevirtual   com/google/cL.i:()I
        //   701: invokevirtual   com/google/cL.c:(I)I
        //   704: istore          31
        //   706: iload           4
        //   708: bipush          8
        //   710: iand           
        //   711: bipush          8
        //   713: if_icmpeq       745
        //   716: aload_1        
        //   717: invokevirtual   com/google/cL.s:()I
        //   720: istore          40
        //   722: iload           40
        //   724: ifle            745
        //   727: aload_0        
        //   728: new             Ljava/util/ArrayList;
        //   731: dup            
        //   732: invokespecial   java/util/ArrayList.<init>:()V
        //   735: putfield        com/google/dO.y:Ljava/util/List;
        //   738: iload           4
        //   740: bipush          8
        //   742: ior            
        //   743: istore          4
        //   745: aload_1        
        //   746: invokevirtual   com/google/cL.s:()I
        //   749: ifle            773
        //   752: aload_0        
        //   753: getfield        com/google/dO.y:Ljava/util/List;
        //   756: aload_1        
        //   757: invokevirtual   com/google/cL.j:()I
        //   760: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   763: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   768: pop            
        //   769: iload_3        
        //   770: ifeq            745
        //   773: aload_1        
        //   774: iload           31
        //   776: invokevirtual   com/google/cL.a:(I)V
        //   779: iload_3        
        //   780: ifeq            915
        //   783: iload           4
        //   785: bipush          16
        //   787: iand           
        //   788: bipush          16
        //   790: if_icmpeq       811
        //   793: aload_0        
        //   794: new             Ljava/util/ArrayList;
        //   797: dup            
        //   798: invokespecial   java/util/ArrayList.<init>:()V
        //   801: putfield        com/google/dO.F:Ljava/util/List;
        //   804: iload           4
        //   806: bipush          16
        //   808: ior            
        //   809: istore          4
        //   811: aload_0        
        //   812: getfield        com/google/dO.F:Ljava/util/List;
        //   815: aload_1        
        //   816: invokevirtual   com/google/cL.j:()I
        //   819: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   822: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   827: pop            
        //   828: iload_3        
        //   829: ifeq            915
        //   832: aload_1        
        //   833: aload_1        
        //   834: invokevirtual   com/google/cL.i:()I
        //   837: invokevirtual   com/google/cL.c:(I)I
        //   840: istore          34
        //   842: iload           4
        //   844: bipush          16
        //   846: iand           
        //   847: bipush          16
        //   849: if_icmpeq       881
        //   852: aload_1        
        //   853: invokevirtual   com/google/cL.s:()I
        //   856: istore          37
        //   858: iload           37
        //   860: ifle            881
        //   863: aload_0        
        //   864: new             Ljava/util/ArrayList;
        //   867: dup            
        //   868: invokespecial   java/util/ArrayList.<init>:()V
        //   871: putfield        com/google/dO.F:Ljava/util/List;
        //   874: iload           4
        //   876: bipush          16
        //   878: ior            
        //   879: istore          4
        //   881: aload_1        
        //   882: invokevirtual   com/google/cL.s:()I
        //   885: ifle            909
        //   888: aload_0        
        //   889: getfield        com/google/dO.F:Ljava/util/List;
        //   892: aload_1        
        //   893: invokevirtual   com/google/cL.j:()I
        //   896: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   899: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   904: pop            
        //   905: iload_3        
        //   906: ifeq            881
        //   909: aload_1        
        //   910: iload           34
        //   912: invokevirtual   com/google/cL.a:(I)V
        //   915: iload_3        
        //   916: ifeq            33
        //   919: iload           4
        //   921: iconst_4       
        //   922: iand           
        //   923: iconst_4       
        //   924: if_icmpne       942
        //   927: aload_0        
        //   928: new             Lcom/google/bT;
        //   931: dup            
        //   932: aload_0        
        //   933: getfield        com/google/dO.x:Lcom/google/eQ;
        //   936: invokespecial   com/google/bT.<init>:(Lcom/google/eQ;)V
        //   939: putfield        com/google/dO.x:Lcom/google/eQ;
        //   942: iload           4
        //   944: bipush          32
        //   946: iand           
        //   947: bipush          32
        //   949: if_icmpne       963
        //   952: aload_0        
        //   953: aload_0        
        //   954: getfield        com/google/dO.o:Ljava/util/List;
        //   957: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   960: putfield        com/google/dO.o:Ljava/util/List;
        //   963: iload           4
        //   965: bipush          64
        //   967: iand           
        //   968: bipush          64
        //   970: if_icmpne       984
        //   973: aload_0        
        //   974: aload_0        
        //   975: getfield        com/google/dO.w:Ljava/util/List;
        //   978: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   981: putfield        com/google/dO.w:Ljava/util/List;
        //   984: iload           4
        //   986: sipush          128
        //   989: iand           
        //   990: sipush          128
        //   993: if_icmpne       1007
        //   996: aload_0        
        //   997: aload_0        
        //   998: getfield        com/google/dO.A:Ljava/util/List;
        //  1001: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1004: putfield        com/google/dO.A:Ljava/util/List;
        //  1007: iload           4
        //  1009: sipush          256
        //  1012: iand           
        //  1013: sipush          256
        //  1016: if_icmpne       1030
        //  1019: aload_0        
        //  1020: aload_0        
        //  1021: getfield        com/google/dO.l:Ljava/util/List;
        //  1024: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1027: putfield        com/google/dO.l:Ljava/util/List;
        //  1030: iload           4
        //  1032: bipush          8
        //  1034: iand           
        //  1035: bipush          8
        //  1037: if_icmpne       1051
        //  1040: aload_0        
        //  1041: aload_0        
        //  1042: getfield        com/google/dO.y:Ljava/util/List;
        //  1045: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1048: putfield        com/google/dO.y:Ljava/util/List;
        //  1051: iload           4
        //  1053: bipush          16
        //  1055: iand           
        //  1056: bipush          16
        //  1058: if_icmpne       1072
        //  1061: aload_0        
        //  1062: aload_0        
        //  1063: getfield        com/google/dO.F:Ljava/util/List;
        //  1066: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1069: putfield        com/google/dO.F:Ljava/util/List;
        //  1072: aload_0        
        //  1073: aload           5
        //  1075: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //  1078: putfield        com/google/dO.s:Lcom/google/ce;
        //  1081: aload_0        
        //  1082: invokevirtual   com/google/dO.c:()V
        //  1085: return         
        //  1086: iconst_1       
        //  1087: istore          6
        //  1089: iload_3        
        //  1090: ifeq            915
        //  1093: goto            168
        //  1096: astore          42
        //  1098: aload           42
        //  1100: athrow         
        //  1101: astore          23
        //  1103: aload           23
        //  1105: aload_0        
        //  1106: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //  1109: athrow         
        //  1110: astore          15
        //  1112: iload           4
        //  1114: iconst_4       
        //  1115: iand           
        //  1116: iconst_4       
        //  1117: if_icmpne       1135
        //  1120: aload_0        
        //  1121: new             Lcom/google/bT;
        //  1124: dup            
        //  1125: aload_0        
        //  1126: getfield        com/google/dO.x:Lcom/google/eQ;
        //  1129: invokespecial   com/google/bT.<init>:(Lcom/google/eQ;)V
        //  1132: putfield        com/google/dO.x:Lcom/google/eQ;
        //  1135: iload           4
        //  1137: bipush          32
        //  1139: iand           
        //  1140: bipush          32
        //  1142: if_icmpne       1156
        //  1145: aload_0        
        //  1146: aload_0        
        //  1147: getfield        com/google/dO.o:Ljava/util/List;
        //  1150: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1153: putfield        com/google/dO.o:Ljava/util/List;
        //  1156: iload           4
        //  1158: bipush          64
        //  1160: iand           
        //  1161: bipush          64
        //  1163: if_icmpne       1177
        //  1166: aload_0        
        //  1167: aload_0        
        //  1168: getfield        com/google/dO.w:Ljava/util/List;
        //  1171: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1174: putfield        com/google/dO.w:Ljava/util/List;
        //  1177: iload           4
        //  1179: sipush          128
        //  1182: iand           
        //  1183: sipush          128
        //  1186: if_icmpne       1200
        //  1189: aload_0        
        //  1190: aload_0        
        //  1191: getfield        com/google/dO.A:Ljava/util/List;
        //  1194: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1197: putfield        com/google/dO.A:Ljava/util/List;
        //  1200: iload           4
        //  1202: sipush          256
        //  1205: iand           
        //  1206: sipush          256
        //  1209: if_icmpne       1223
        //  1212: aload_0        
        //  1213: aload_0        
        //  1214: getfield        com/google/dO.l:Ljava/util/List;
        //  1217: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1220: putfield        com/google/dO.l:Ljava/util/List;
        //  1223: iload           4
        //  1225: bipush          8
        //  1227: iand           
        //  1228: bipush          8
        //  1230: if_icmpne       1244
        //  1233: aload_0        
        //  1234: aload_0        
        //  1235: getfield        com/google/dO.y:Ljava/util/List;
        //  1238: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1241: putfield        com/google/dO.y:Ljava/util/List;
        //  1244: iload           4
        //  1246: bipush          16
        //  1248: iand           
        //  1249: bipush          16
        //  1251: if_icmpne       1265
        //  1254: aload_0        
        //  1255: aload_0        
        //  1256: getfield        com/google/dO.F:Ljava/util/List;
        //  1259: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1262: putfield        com/google/dO.F:Ljava/util/List;
        //  1265: aload_0        
        //  1266: aload           5
        //  1268: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //  1271: putfield        com/google/dO.s:Lcom/google/ce;
        //  1274: aload_0        
        //  1275: invokevirtual   com/google/dO.c:()V
        //  1278: aload           15
        //  1280: athrow         
        //  1281: astore          44
        //  1283: aload           44
        //  1285: athrow         
        //  1286: astore          45
        //  1288: aload           45
        //  1290: athrow         
        //  1291: astore          46
        //  1293: aload           46
        //  1295: athrow         
        //  1296: astore          14
        //  1298: new             Lcom/google/bg;
        //  1301: dup            
        //  1302: aload           14
        //  1304: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //  1307: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //  1310: aload_0        
        //  1311: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //  1314: athrow         
        //  1315: astore          47
        //  1317: aload           47
        //  1319: athrow         
        //  1320: astore          48
        //  1322: aload           48
        //  1324: athrow         
        //  1325: astore          50
        //  1327: aload           50
        //  1329: athrow         
        //  1330: astore          52
        //  1332: aload           52
        //  1334: athrow         
        //  1335: astore          56
        //  1337: aload           56
        //  1339: athrow         
        //  1340: astore          27
        //  1342: aload           27
        //  1344: athrow         
        //  1345: astore          29
        //  1347: aload           29
        //  1349: athrow         
        //  1350: astore          39
        //  1352: aload           39
        //  1354: athrow         
        //  1355: astore          32
        //  1357: aload           32
        //  1359: athrow         
        //  1360: astore          36
        //  1362: aload           36
        //  1364: athrow         
        //  1365: astore          22
        //  1367: aload           22
        //  1369: athrow         
        //  1370: astore          21
        //  1372: aload           21
        //  1374: athrow         
        //  1375: astore          20
        //  1377: aload           20
        //  1379: athrow         
        //  1380: astore          19
        //  1382: aload           19
        //  1384: athrow         
        //  1385: astore          18
        //  1387: aload           18
        //  1389: athrow         
        //  1390: astore          17
        //  1392: aload           17
        //  1394: athrow         
        //  1395: astore          16
        //  1397: aload           16
        //  1399: athrow         
        //  1400: astore          13
        //  1402: aload           13
        //  1404: athrow         
        //  1405: astore          12
        //  1407: aload           12
        //  1409: athrow         
        //  1410: astore          11
        //  1412: aload           11
        //  1414: athrow         
        //  1415: astore          10
        //  1417: aload           10
        //  1419: athrow         
        //  1420: astore          9
        //  1422: aload           9
        //  1424: athrow         
        //  1425: astore          8
        //  1427: aload           8
        //  1429: athrow         
        //  1430: astore          7
        //  1432: aload           7
        //  1434: athrow         
        //  1435: iload           25
        //  1437: istore          6
        //  1439: goto            915
        //  1442: aconst_null    
        //  1443: astore          26
        //  1445: goto            589
        //  1448: aconst_null    
        //  1449: astore          55
        //  1451: goto            511
        //  1454: iload           6
        //  1456: istore          25
        //  1458: goto            564
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  38     44     1101   1110   Lcom/google/bg;
        //  38     44     1296   1315   Ljava/io/IOException;
        //  38     44     1110   1400   Any
        //  168    180    1096   1101   Lcom/google/bg;
        //  168    180    1296   1315   Ljava/io/IOException;
        //  168    180    1110   1400   Any
        //  192    210    1281   1286   Lcom/google/bg;
        //  192    210    1296   1315   Ljava/io/IOException;
        //  192    210    1110   1400   Any
        //  214    232    1286   1296   Lcom/google/bg;
        //  214    232    1296   1315   Ljava/io/IOException;
        //  214    232    1110   1400   Any
        //  244    255    1101   1110   Lcom/google/bg;
        //  244    255    1296   1315   Ljava/io/IOException;
        //  244    255    1110   1400   Any
        //  261    274    1315   1320   Lcom/google/bg;
        //  261    274    1296   1315   Ljava/io/IOException;
        //  261    274    1110   1400   Any
        //  288    299    1101   1110   Lcom/google/bg;
        //  288    299    1296   1315   Ljava/io/IOException;
        //  288    299    1110   1400   Any
        //  306    324    1320   1325   Lcom/google/bg;
        //  306    324    1296   1315   Ljava/io/IOException;
        //  306    324    1110   1400   Any
        //  338    349    1101   1110   Lcom/google/bg;
        //  338    349    1296   1315   Ljava/io/IOException;
        //  338    349    1110   1400   Any
        //  356    374    1325   1330   Lcom/google/bg;
        //  356    374    1296   1315   Ljava/io/IOException;
        //  356    374    1110   1400   Any
        //  390    401    1101   1110   Lcom/google/bg;
        //  390    401    1296   1315   Ljava/io/IOException;
        //  390    401    1110   1400   Any
        //  409    427    1330   1335   Lcom/google/bg;
        //  409    427    1296   1315   Ljava/io/IOException;
        //  409    427    1110   1400   Any
        //  443    454    1101   1110   Lcom/google/bg;
        //  443    454    1296   1315   Ljava/io/IOException;
        //  443    454    1110   1400   Any
        //  462    480    1101   1110   Lcom/google/bg;
        //  462    480    1296   1315   Ljava/io/IOException;
        //  462    480    1110   1400   Any
        //  488    507    1101   1110   Lcom/google/bg;
        //  488    507    1296   1315   Ljava/io/IOException;
        //  488    507    1110   1400   Any
        //  511    526    1335   1340   Lcom/google/bg;
        //  511    526    1296   1315   Ljava/io/IOException;
        //  511    526    1110   1400   Any
        //  531    550    1335   1340   Lcom/google/bg;
        //  531    550    1296   1315   Ljava/io/IOException;
        //  531    550    1110   1400   Any
        //  550    560    1101   1110   Lcom/google/bg;
        //  550    560    1296   1315   Ljava/io/IOException;
        //  550    560    1110   1400   Any
        //  564    585    1101   1110   Lcom/google/bg;
        //  564    585    1296   1315   Ljava/io/IOException;
        //  564    585    1110   1400   Any
        //  589    604    1340   1345   Lcom/google/bg;
        //  589    604    1296   1315   Ljava/io/IOException;
        //  589    604    1110   1400   Any
        //  609    628    1340   1345   Lcom/google/bg;
        //  609    628    1296   1315   Ljava/io/IOException;
        //  609    628    1110   1400   Any
        //  628    639    1345   1350   Lcom/google/bg;
        //  628    639    1296   1315   Ljava/io/IOException;
        //  628    639    1110   1400   Any
        //  657    668    1101   1110   Lcom/google/bg;
        //  657    668    1296   1315   Ljava/io/IOException;
        //  657    668    1110   1400   Any
        //  675    692    1101   1110   Lcom/google/bg;
        //  675    692    1296   1315   Ljava/io/IOException;
        //  675    692    1110   1400   Any
        //  696    706    1101   1110   Lcom/google/bg;
        //  696    706    1296   1315   Ljava/io/IOException;
        //  696    706    1110   1400   Any
        //  716    722    1350   1355   Lcom/google/bg;
        //  716    722    1296   1315   Ljava/io/IOException;
        //  716    722    1110   1400   Any
        //  727    738    1101   1110   Lcom/google/bg;
        //  727    738    1296   1315   Ljava/io/IOException;
        //  727    738    1110   1400   Any
        //  745    769    1101   1110   Lcom/google/bg;
        //  745    769    1296   1315   Ljava/io/IOException;
        //  745    769    1110   1400   Any
        //  773    779    1355   1360   Lcom/google/bg;
        //  773    779    1296   1315   Ljava/io/IOException;
        //  773    779    1110   1400   Any
        //  793    804    1101   1110   Lcom/google/bg;
        //  793    804    1296   1315   Ljava/io/IOException;
        //  793    804    1110   1400   Any
        //  811    828    1101   1110   Lcom/google/bg;
        //  811    828    1296   1315   Ljava/io/IOException;
        //  811    828    1110   1400   Any
        //  832    842    1101   1110   Lcom/google/bg;
        //  832    842    1296   1315   Ljava/io/IOException;
        //  832    842    1110   1400   Any
        //  852    858    1360   1365   Lcom/google/bg;
        //  852    858    1296   1315   Ljava/io/IOException;
        //  852    858    1110   1400   Any
        //  863    874    1101   1110   Lcom/google/bg;
        //  863    874    1296   1315   Ljava/io/IOException;
        //  863    874    1110   1400   Any
        //  881    905    1101   1110   Lcom/google/bg;
        //  881    905    1296   1315   Ljava/io/IOException;
        //  881    905    1110   1400   Any
        //  909    915    1101   1110   Lcom/google/bg;
        //  909    915    1296   1315   Ljava/io/IOException;
        //  909    915    1110   1400   Any
        //  927    942    1400   1405   Lcom/google/bg;
        //  952    963    1405   1410   Lcom/google/bg;
        //  973    984    1410   1415   Lcom/google/bg;
        //  996    1007   1415   1420   Lcom/google/bg;
        //  1019   1030   1420   1425   Lcom/google/bg;
        //  1040   1051   1425   1430   Lcom/google/bg;
        //  1061   1072   1430   1435   Lcom/google/bg;
        //  1098   1101   1101   1110   Lcom/google/bg;
        //  1098   1101   1296   1315   Ljava/io/IOException;
        //  1098   1101   1110   1400   Any
        //  1103   1110   1110   1400   Any
        //  1120   1135   1365   1370   Lcom/google/bg;
        //  1145   1156   1370   1375   Lcom/google/bg;
        //  1166   1177   1375   1380   Lcom/google/bg;
        //  1189   1200   1380   1385   Lcom/google/bg;
        //  1212   1223   1385   1390   Lcom/google/bg;
        //  1233   1244   1390   1395   Lcom/google/bg;
        //  1254   1265   1395   1400   Lcom/google/bg;
        //  1283   1286   1286   1296   Lcom/google/bg;
        //  1283   1286   1296   1315   Ljava/io/IOException;
        //  1283   1286   1110   1400   Any
        //  1288   1291   1291   1296   Lcom/google/bg;
        //  1288   1291   1296   1315   Ljava/io/IOException;
        //  1288   1291   1110   1400   Any
        //  1293   1296   1101   1110   Lcom/google/bg;
        //  1293   1296   1296   1315   Ljava/io/IOException;
        //  1293   1296   1110   1400   Any
        //  1298   1315   1110   1400   Any
        //  1317   1320   1101   1110   Lcom/google/bg;
        //  1317   1320   1296   1315   Ljava/io/IOException;
        //  1317   1320   1110   1400   Any
        //  1322   1325   1101   1110   Lcom/google/bg;
        //  1322   1325   1296   1315   Ljava/io/IOException;
        //  1322   1325   1110   1400   Any
        //  1327   1330   1101   1110   Lcom/google/bg;
        //  1327   1330   1296   1315   Ljava/io/IOException;
        //  1327   1330   1110   1400   Any
        //  1332   1335   1101   1110   Lcom/google/bg;
        //  1332   1335   1296   1315   Ljava/io/IOException;
        //  1332   1335   1110   1400   Any
        //  1337   1340   1101   1110   Lcom/google/bg;
        //  1337   1340   1296   1315   Ljava/io/IOException;
        //  1337   1340   1110   1400   Any
        //  1342   1345   1101   1110   Lcom/google/bg;
        //  1342   1345   1296   1315   Ljava/io/IOException;
        //  1342   1345   1110   1400   Any
        //  1347   1350   1101   1110   Lcom/google/bg;
        //  1347   1350   1296   1315   Ljava/io/IOException;
        //  1347   1350   1110   1400   Any
        //  1352   1355   1101   1110   Lcom/google/bg;
        //  1352   1355   1296   1315   Ljava/io/IOException;
        //  1352   1355   1110   1400   Any
        //  1357   1360   1101   1110   Lcom/google/bg;
        //  1357   1360   1296   1315   Ljava/io/IOException;
        //  1357   1360   1110   1400   Any
        //  1362   1365   1101   1110   Lcom/google/bg;
        //  1362   1365   1296   1315   Ljava/io/IOException;
        //  1362   1365   1110   1400   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 662, Size: 662
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
    
    dO(final cL cl, final fu fu, final fM fm) {
        this(cl, fu);
    }
    
    private dO(final fp fp) {
        super(fp);
        this.n = -1;
        this.u = -1;
        this.s = fp.getUnknownFields();
    }
    
    dO(final fp fp, final fM fm) {
        this(fp);
    }
    
    private dO(final boolean b) {
        this.n = -1;
        this.u = -1;
        this.s = ce.d();
    }
    
    public static final bl F() {
        return hM.H();
    }
    
    public static dO G() {
        return dO.e;
    }
    
    public static f2 J() {
        return f2.b();
    }
    
    static int a(final dO do1, final int c) {
        return do1.C = c;
    }
    
    public static dO a(final cL cl) {
        return (dO)dO.z.a(cl);
    }
    
    public static dO a(final cL cl, final fu fu) {
        return (dO)dO.z.a(cl, fu);
    }
    
    public static dO a(final hv hv) {
        return (dO)dO.z.a(hv);
    }
    
    public static dO a(final hv hv, final fu fu) {
        return (dO)dO.z.a(hv, fu);
    }
    
    public static dO a(final InputStream inputStream) {
        return (dO)dO.z.a(inputStream);
    }
    
    public static dO a(final InputStream inputStream, final fu fu) {
        return (dO)dO.z.b(inputStream, fu);
    }
    
    public static dO a(final byte[] array) {
        return (dO)dO.z.a(array);
    }
    
    public static dO a(final byte[] array, final fu fu) {
        return (dO)dO.z.a(array, fu);
    }
    
    static dR a(final dO do1, final dR i) {
        return do1.i = i;
    }
    
    static dZ a(final dO do1, final dZ q) {
        return do1.q = q;
    }
    
    static eQ a(final dO do1, final eQ x) {
        return do1.x = x;
    }
    
    static Object a(final dO do1, final Object g) {
        return do1.g = g;
    }
    
    static List a(final dO do1) {
        return do1.w;
    }
    
    static List a(final dO do1, final List y) {
        return do1.y = y;
    }
    
    public static dO b(final InputStream inputStream) {
        return (dO)dO.z.b(inputStream);
    }
    
    public static dO b(final InputStream inputStream, final fu fu) {
        return (dO)dO.z.a(inputStream, fu);
    }
    
    static Object b(final dO do1, final Object p2) {
        return do1.p = p2;
    }
    
    static List b(final dO do1) {
        return do1.l;
    }
    
    static List b(final dO do1, final List w) {
        return do1.w = w;
    }
    
    static List c(final dO do1) {
        return do1.F;
    }
    
    static List c(final dO do1, final List f) {
        return do1.F = f;
    }
    
    static List d(final dO do1) {
        return do1.A;
    }
    
    static List d(final dO do1, final List a) {
        return do1.A = a;
    }
    
    private void d() {
        this.g = "";
        this.p = "";
        this.x = gJ.b;
        this.y = Collections.emptyList();
        this.F = Collections.emptyList();
        this.o = Collections.emptyList();
        this.w = Collections.emptyList();
        this.A = Collections.emptyList();
        this.l = Collections.emptyList();
        this.q = dZ.x();
        this.i = dR.a();
    }
    
    static eQ e(final dO do1) {
        return do1.x;
    }
    
    static List e(final dO do1, final List l) {
        return do1.l = l;
    }
    
    static Object f(final dO do1) {
        return do1.p;
    }
    
    static List f(final dO do1, final List o) {
        return do1.o = o;
    }
    
    static List g(final dO do1) {
        return do1.y;
    }
    
    static List h(final dO do1) {
        return do1.o;
    }
    
    public static f2 i(final dO do1) {
        return J().a(do1);
    }
    
    static Object j(final dO do1) {
        return do1.g;
    }
    
    public List A() {
        return this.o;
    }
    
    public List B() {
        return this.F;
    }
    
    public List C() {
        return this.l;
    }
    
    public f2 D() {
        return J();
    }
    
    public String E() {
        final Object p = this.p;
        if (p instanceof String) {
            return (String)p;
        }
        final hv hv = (hv)p;
        final String i = hv.i();
        if (hv.b()) {
            this.p = i;
        }
        return i;
    }
    
    public List H() {
        return this.w;
    }
    
    public int I() {
        return this.l.size();
    }
    
    public boolean K() {
        return (0x1 & this.C) == 0x1;
    }
    
    public dq a(final int n) {
        return this.w.get(n);
    }
    
    protected f2 a(final dg dg) {
        return new f2(dg, null);
    }
    
    public ff a() {
        return this.i;
    }
    
    public fa b() {
        return this.q;
    }
    
    public gI b(final int n) {
        return this.l.get(n);
    }
    
    public int c() {
        return this.A.size();
    }
    
    public cU c(final int n) {
        return this.A.get(n);
    }
    
    public int d(final int n) {
        return this.y.get(n);
    }
    
    public int e(final int n) {
        return this.F.get(n);
    }
    
    public List e() {
        return this.y;
    }
    
    public hv f(final int n) {
        return this.x.a(n);
    }
    
    public List f() {
        return this.A;
    }
    
    public int g() {
        return this.w.size();
    }
    
    public dQ g(final int n) {
        return this.o.get(n);
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.n();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.n();
    }
    
    @Override
    public du getParserForType() {
        return dO.z;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean b = dt.b;
        final int u = this.u;
        if (u != -1) {
            return u;
        }
        int n;
        if ((0x1 & this.C) == 0x1) {
            n = 0 + ep.b(1, this.m());
        }
        else {
            n = 0;
        }
        if ((0x2 & this.C) == 0x2) {
            n += ep.b(2, this.y());
        }
        int j = 0;
        int n2 = 0;
        while (j < this.x.size()) {
            n2 += ep.a(this.x.a(j));
            ++j;
            if (b) {
                break;
            }
        }
        final int n3 = n + n2 + 1 * this.j().size();
        int k = 0;
        int n4 = n3;
        while (k < this.o.size()) {
            n4 += ep.f(4, this.o.get(k));
            final int n5 = k + 1;
            if (b) {
                break;
            }
            k = n5;
        }
        int n6;
        for (int l = 0; l < this.w.size(); l = n6) {
            n4 += ep.f(5, (ci)this.w.get(l));
            n6 = l + 1;
            if (b) {
                break;
            }
        }
        int n8;
        for (int n7 = 0; n7 < this.A.size(); n7 = n8) {
            n4 += ep.f(6, (ci)this.A.get(n7));
            n8 = n7 + 1;
            if (b) {
                break;
            }
        }
        int n10;
        for (int n9 = 0; n9 < this.l.size(); n9 = n10) {
            n4 += ep.f(7, (ci)this.l.get(n9));
            n10 = n9 + 1;
            if (b) {
                break;
            }
        }
        if ((0x4 & this.C) == 0x4) {
            n4 += ep.f(8, this.q);
        }
        if ((0x8 & this.C) == 0x8) {
            n4 += ep.f(9, this.i);
        }
        int n11 = 0;
        int n12 = 0;
        while (n11 < this.y.size()) {
            n12 += ep.c(this.y.get(n11));
            final int n13 = n11 + 1;
            if (b) {
                break;
            }
            n11 = n13;
        }
        final int n14 = n4 + n12 + 1 * this.e().size();
        int n15 = 0;
        while (i < this.F.size()) {
            final int n16 = n15 + ep.c(this.F.get(i));
            ++i;
            if (b) {
                return this.u = n16 + n14 + 1 * this.B().size() + this.getUnknownFields().getSerializedSize();
            }
            n15 = n16;
        }
        final int n16 = n15;
        return this.u = n16 + n14 + 1 * this.B().size() + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.s;
    }
    
    public dC h(final int n) {
        return this.l.get(n);
    }
    
    public List h() {
        return this.w;
    }
    
    public dB i(final int n) {
        return this.A.get(n);
    }
    
    public List i() {
        return this.A;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.h().a(dO.class, f2.class);
    }
    
    @Override
    public final boolean isInitialized() {
        boolean n = true;
        final boolean b = dt.b;
        final byte n2 = this.n;
        if (n2 != -1) {
            if (n2 != (n ? 1 : 0)) {
                n = false;
            }
            return n;
        }
        int i = 0;
        while (i < this.w()) {
            if (!this.g(i).isInitialized()) {
                this.n = 0;
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        int j = 0;
        while (j < this.g()) {
            if (!this.a(j).isInitialized()) {
                this.n = 0;
                return false;
            }
            ++j;
            if (b) {
                break;
            }
        }
        int k = 0;
        while (k < this.c()) {
            if (!this.i(k).isInitialized()) {
                this.n = 0;
                return false;
            }
            ++k;
            if (b) {
                break;
            }
        }
        int l = 0;
        while (l < this.I()) {
            if (!this.h(l).isInitialized()) {
                this.n = 0;
                return false;
            }
            ++l;
            if (b) {
                break;
            }
        }
        if (this.v() && !this.r().isInitialized()) {
            this.n = 0;
            return false;
        }
        return (this.n = (byte)(n ? 1 : 0)) != 0;
    }
    
    public String j(final int n) {
        return this.x.get(n);
    }
    
    public List j() {
        return this.x;
    }
    
    public dR k() {
        return this.i;
    }
    
    public q k(final int n) {
        return this.w.get(n);
    }
    
    public gn l(final int n) {
        return this.o.get(n);
    }
    
    public List l() {
        return this.l;
    }
    
    public hv m() {
        final Object g = this.g;
        if (g instanceof String) {
            return (hv)(this.g = hv.b((String)g));
        }
        return (hv)g;
    }
    
    public dO n() {
        return dO.e;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.D();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.D();
    }
    
    public int o() {
        return this.x.size();
    }
    
    public int p() {
        return this.y.size();
    }
    
    public String q() {
        final Object g = this.g;
        if (g instanceof String) {
            return (String)g;
        }
        final hv hv = (hv)g;
        final String i = hv.i();
        if (hv.b()) {
            this.g = i;
        }
        return i;
    }
    
    public dZ r() {
        return this.q;
    }
    
    public boolean s() {
        return (0x2 & this.C) == 0x2;
    }
    
    public boolean t() {
        return (0x8 & this.C) == 0x8;
    }
    
    @Override
    public a8 toBuilder() {
        return this.u();
    }
    
    @Override
    public aJ toBuilder() {
        return this.u();
    }
    
    public f2 u() {
        return i(this);
    }
    
    public boolean v() {
        return (0x4 & this.C) == 0x4;
    }
    
    public int w() {
        return this.o.size();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean b = dt.b;
        this.getSerializedSize();
        if ((0x1 & this.C) == 0x1) {
            ep.c(1, this.m());
        }
        if ((0x2 & this.C) == 0x2) {
            ep.c(2, this.y());
        }
        int i = 0;
        while (i < this.x.size()) {
            ep.c(3, this.x.a(i));
            ++i;
            if (b) {
                break;
            }
        }
        int n;
        for (int j = 0; j < this.o.size(); j = n) {
            ep.e(4, (ci)this.o.get(j));
            n = j + 1;
            if (b) {
                break;
            }
        }
        int n2;
        for (int k = 0; k < this.w.size(); k = n2) {
            ep.e(5, (ci)this.w.get(k));
            n2 = k + 1;
            if (b) {
                break;
            }
        }
        int n3;
        for (int l = 0; l < this.A.size(); l = n3) {
            ep.e(6, (ci)this.A.get(l));
            n3 = l + 1;
            if (b) {
                break;
            }
        }
        int n5;
        for (int n4 = 0; n4 < this.l.size(); n4 = n5) {
            ep.e(7, (ci)this.l.get(n4));
            n5 = n4 + 1;
            if (b) {
                break;
            }
        }
        if ((0x4 & this.C) == 0x4) {
            ep.e(8, this.q);
        }
        if ((0x8 & this.C) == 0x8) {
            ep.e(9, this.i);
        }
        int n6 = 0;
        int n7;
        while (true) {
            final int size = this.y.size();
            n7 = 0;
            if (n6 >= size) {
                break;
            }
            ep.e(10, (int)this.y.get(n6));
            final int n8 = n6 + 1;
            n7 = 0;
            if (b) {
                break;
            }
            n6 = n8;
        }
        while (n7 < this.F.size()) {
            ep.e(11, (int)this.F.get(n7));
            ++n7;
            if (b) {
                break;
            }
        }
        this.getUnknownFields().writeTo(ep);
    }
    
    public int x() {
        return this.F.size();
    }
    
    public hv y() {
        final Object p = this.p;
        if (p instanceof String) {
            return (hv)(this.p = hv.b((String)p));
        }
        return (hv)p;
    }
    
    public List z() {
        return this.o;
    }
}
