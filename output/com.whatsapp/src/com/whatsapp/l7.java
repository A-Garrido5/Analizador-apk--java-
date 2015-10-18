// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import android.annotation.TargetApi;
import android.content.SharedPreferences$Editor;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.backport.util.Base64;
import android.location.Location;
import android.location.LocationListener;
import com.whatsapp.util.bm;
import com.whatsapp.util.Log;
import java.util.Scanner;
import android.content.Context;
import java.util.Iterator;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.File;
import android.hardware.Sensor;
import java.util.List;
import android.hardware.TriggerEventListener;
import android.hardware.SensorManager;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class l7
{
    public static byte[] a;
    public static tj b;
    public static String c;
    private static b8 d;
    private static AtomicReference e;
    private static Map f;
    private static final o2 g;
    private static SensorManager h;
    public static boolean i;
    public static String j;
    private static TriggerEventListener k;
    private static boolean l;
    private static final List m;
    public static byte[] n;
    public static final Map o;
    private static Sensor p;
    private static final File q;
    public static String r;
    public static final List s;
    private static boolean t;
    public static String u;
    private static boolean v;
    private static final AtomicInteger w;
    public static byte[] x;
    private static final SecureRandom y;
    private static final String[] z;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_m1      
        //     1: istore_0       
        //     2: iconst_1       
        //     3: istore_1       
        //     4: bipush          51
        //     6: anewarray       Ljava/lang/String;
        //     9: astore_2       
        //    10: iconst_0       
        //    11: istore_3       
        //    12: aload_2        
        //    13: astore          4
        //    15: ldc             "1e\u0002_A3~\u001eT\u001d%y\u0012HK0c\"_Q2r\u0005\u0015Q5e\u0007_\u0012%e\u0003U@`"
        //    17: astore          5
        //    19: iload_0        
        //    20: istore          6
        //    22: aload           5
        //    24: invokestatic    com/whatsapp/l7.z:(Ljava/lang/String;)[C
        //    27: invokestatic    com/whatsapp/l7.z:([C)Ljava/lang/String;
        //    30: astore          7
        //    32: iload           6
        //    34: tableswitch {
        //                0: 269
        //                1: 290
        //                2: 311
        //                3: 332
        //                4: 353
        //                5: 375
        //                6: 398
        //                7: 421
        //                8: 444
        //                9: 467
        //               10: 490
        //               11: 513
        //               12: 536
        //               13: 559
        //               14: 582
        //               15: 605
        //               16: 628
        //               17: 651
        //               18: 674
        //               19: 697
        //               20: 720
        //               21: 743
        //               22: 766
        //               23: 789
        //               24: 812
        //               25: 835
        //               26: 858
        //               27: 881
        //               28: 904
        //               29: 927
        //               30: 950
        //               31: 973
        //               32: 996
        //               33: 1019
        //               34: 1042
        //               35: 1065
        //               36: 1088
        //               37: 1111
        //               38: 1134
        //               39: 1157
        //               40: 1180
        //               41: 1203
        //               42: 1226
        //               43: 1249
        //               44: 1272
        //               45: 1295
        //               46: 1318
        //               47: 1341
        //               48: 1364
        //               49: 1387
        //          default: 248
        //        }
        //   248: aload           4
        //   250: iload_3        
        //   251: aload           7
        //   253: aastore        
        //   254: ldc             "1e\u0002_A3~\u001eT\u001d%y\u0012HK0c\"_Q2r\u0005\u001aT!~\u001d\u001a\\5{\u001d\u001aW.tK\u001a\u0017\"7\u0019WS#-Q\u001fP"
        //   256: astore          5
        //   258: iload_1        
        //   259: istore_3       
        //   260: aload_2        
        //   261: astore          4
        //   263: iconst_0       
        //   264: istore          6
        //   266: goto            22
        //   269: aload           4
        //   271: iload_3        
        //   272: aload           7
        //   274: aastore        
        //   275: iconst_2       
        //   276: istore_3       
        //   277: aload_2        
        //   278: astore          4
        //   280: ldc             "5y\u0010X^%7\u0005U\u00122r\u0010^\u0012\u0001b\u0005U_!c\u0018U\\\u0011E2UV%9\u0005BF"
        //   282: astore          5
        //   284: iload_1        
        //   285: istore          6
        //   287: goto            22
        //   290: aload           4
        //   292: iload_3        
        //   293: aload           7
        //   295: aastore        
        //   296: iconst_3       
        //   297: istore_3       
        //   298: ldc             "\u0001b\u0005U_!c\u0018U\\\u0011E2UV%9\u0005BF`~\u0002\u001a_)d\u0002S\\'"
        //   300: astore          5
        //   302: iconst_2       
        //   303: istore          6
        //   305: aload_2        
        //   306: astore          4
        //   308: goto            22
        //   311: aload           4
        //   313: iload_3        
        //   314: aload           7
        //   316: aastore        
        //   317: iconst_4       
        //   318: istore_3       
        //   319: ldc             "\u0001b\u0005U_!c\u0018U\\\u0011E2UV%9\u0005BF"
        //   321: astore          5
        //   323: iconst_3       
        //   324: istore          6
        //   326: aload_2        
        //   327: astore          4
        //   329: goto            22
        //   332: aload           4
        //   334: iload_3        
        //   335: aload           7
        //   337: aastore        
        //   338: iconst_5       
        //   339: istore_3       
        //   340: ldc             ")y\u0007[^)sQk`\u0003x\u0015_\u0012)yQ{G4x\u001c[F)x\u001fk`\u0003x\u0015_\u001c4o\u0005"
        //   342: astore          5
        //   344: iconst_4       
        //   345: istore          6
        //   347: aload_2        
        //   348: astore          4
        //   350: goto            22
        //   353: aload           4
        //   355: iload_3        
        //   356: aload           7
        //   358: aastore        
        //   359: bipush          6
        //   361: istore_3       
        //   362: ldc             "1e\u0002_A3~\u001eT\u001d0e\u001eYW3d h\u001d%e\u0003U@o~\u001fLS,~\u0015eQ/s\u0014\u001aB!e\u0005I"
        //   364: astore          5
        //   366: iconst_5       
        //   367: istore          6
        //   369: aload_2        
        //   370: astore          4
        //   372: goto            22
        //   375: aload           4
        //   377: iload_3        
        //   378: aload           7
        //   380: aastore        
        //   381: bipush          7
        //   383: istore_3       
        //   384: ldc             "1e.^S4v"
        //   386: astore          5
        //   388: bipush          6
        //   390: istore          6
        //   392: aload_2        
        //   393: astore          4
        //   395: goto            22
        //   398: aload           4
        //   400: iload_3        
        //   401: aload           7
        //   403: aastore        
        //   404: bipush          8
        //   406: istore_3       
        //   407: ldc             "2r\u0017"
        //   409: astore          5
        //   411: bipush          7
        //   413: istore          6
        //   415: aload_2        
        //   416: astore          4
        //   418: goto            22
        //   421: aload           4
        //   423: iload_3        
        //   424: aload           7
        //   426: aastore        
        //   427: bipush          9
        //   429: istore_3       
        //   430: ldc             "4x\u001a_\\"
        //   432: astore          5
        //   434: bipush          8
        //   436: istore          6
        //   438: aload_2        
        //   439: astore          4
        //   441: goto            22
        //   444: aload           4
        //   446: iload_3        
        //   447: aload           7
        //   449: aastore        
        //   450: bipush          10
        //   452: istore_3       
        //   453: ldc             "1e.^S4v"
        //   455: astore          5
        //   457: bipush          9
        //   459: istore          6
        //   461: aload_2        
        //   462: astore          4
        //   464: goto            22
        //   467: aload           4
        //   469: iload_3        
        //   470: aload           7
        //   472: aastore        
        //   473: bipush          11
        //   475: istore_3       
        //   476: ldc             "+r\b"
        //   478: astore          5
        //   480: bipush          10
        //   482: istore          6
        //   484: aload_2        
        //   485: astore          4
        //   487: goto            22
        //   490: aload           4
        //   492: iload_3        
        //   493: aload           7
        //   495: aastore        
        //   496: bipush          12
        //   498: istore_3       
        //   499: ldc             "\"e\u001eMA%e"
        //   501: astore          5
        //   503: bipush          11
        //   505: istore          6
        //   507: aload_2        
        //   508: astore          4
        //   510: goto            22
        //   513: aload           4
        //   515: iload_3        
        //   516: aload           7
        //   518: aastore        
        //   519: bipush          13
        //   521: istore_3       
        //   522: ldc             "\"e\u001eMA%e.YZ!y\u0016_V"
        //   524: astore          5
        //   526: bipush          12
        //   528: istore          6
        //   530: aload_2        
        //   531: astore          4
        //   533: goto            22
        //   536: aload           4
        //   538: iload_3        
        //   539: aload           7
        //   541: aastore        
        //   542: bipush          14
        //   544: istore_3       
        //   545: ldc             "1e.^S4v"
        //   547: astore          5
        //   549: bipush          13
        //   551: istore          6
        //   553: aload_2        
        //   554: astore          4
        //   556: goto            22
        //   559: aload           4
        //   561: iload_3        
        //   562: aload           7
        //   564: aastore        
        //   565: bipush          15
        //   567: istore_3       
        //   568: ldc             "1e\u0002_A3~\u001eT\u001d2r\u0002_F\u0013c\u0010NWor\u0003H]28\u0012U_-~\u0005eT!~\u001d_V"
        //   570: astore          5
        //   572: bipush          14
        //   574: istore          6
        //   576: aload_2        
        //   577: astore          4
        //   579: goto            22
        //   582: aload           4
        //   584: iload_3        
        //   585: aload           7
        //   587: aastore        
        //   588: bipush          16
        //   590: istore_3       
        //   591: ldc             "1e\u0002_A3~\u001eT\u001d,x\u0012[F)x\u001f\u0015^!d\u0005\u001a"
        //   593: astore          5
        //   595: bipush          15
        //   597: istore          6
        //   599: aload_2        
        //   600: astore          4
        //   602: goto            22
        //   605: aload           4
        //   607: iload_3        
        //   608: aload           7
        //   610: aastore        
        //   611: bipush          17
        //   613: istore_3       
        //   614: ldc             "!{\u0010H_"
        //   616: astore          5
        //   618: bipush          16
        //   620: istore          6
        //   622: aload_2        
        //   623: astore          4
        //   625: goto            22
        //   628: aload           4
        //   630: iload_3        
        //   631: aload           7
        //   633: aastore        
        //   634: bipush          18
        //   636: istore_3       
        //   637: ldc             "#x\u001c\u0014E(v\u0005IS0g"
        //   639: astore          5
        //   641: bipush          17
        //   643: istore          6
        //   645: aload_2        
        //   646: astore          4
        //   648: goto            22
        //   651: aload           4
        //   653: iload_3        
        //   654: aload           7
        //   656: aastore        
        //   657: bipush          19
        //   659: istore_3       
        //   660: ldc             "#x\u001c\u0014E(v\u0005IS0g_[^!e\u001c\u0014e\u0005U.hw\u000eX%st\u0019"
        //   662: astore          5
        //   664: bipush          18
        //   666: istore          6
        //   668: aload_2        
        //   669: astore          4
        //   671: goto            22
        //   674: aload           4
        //   676: iload_3        
        //   677: aload           7
        //   679: aastore        
        //   680: bipush          20
        //   682: istore_3       
        //   683: ldc             "1e\u0002_A3~\u001eT\u001d/y Ha9y\u0012\u0015W2e\u001eH\u001d#x\u001cW[4H\u0017[[,r\u0015"
        //   685: astore          5
        //   687: bipush          19
        //   689: istore          6
        //   691: aload_2        
        //   692: astore          4
        //   694: goto            22
        //   697: aload           4
        //   699: iload_3        
        //   700: aload           7
        //   702: aastore        
        //   703: bipush          21
        //   705: istore_3       
        //   706: ldc             "1e\u0002_A3~\u001eT\u001d/y ha9y\u0012\u0015A5t\u0012_A38\u0012U_-~\u0005eT!~\u001d_V\u001fu\u0003UE3r\u0003e[.q\u001e"
        //   708: astore          5
        //   710: bipush          20
        //   712: istore          6
        //   714: aload_2        
        //   715: astore          4
        //   717: goto            22
        //   720: aload           4
        //   722: iload_3        
        //   723: aload           7
        //   725: aastore        
        //   726: bipush          22
        //   728: istore_3       
        //   729: ldc             "1e\u0002_A3~\u001eT\u001d/y Ha9y\u0012\u0015A5t\u0012_A38\u0012U_-~\u0005eT!~\u001d_V\u001fe\u0014\\"
        //   731: astore          5
        //   733: bipush          21
        //   735: istore          6
        //   737: aload_2        
        //   738: astore          4
        //   740: goto            22
        //   743: aload           4
        //   745: iload_3        
        //   746: aload           7
        //   748: aastore        
        //   749: bipush          23
        //   751: istore_3       
        //   752: ldc             "1e\u0002_A3~\u001eT\u001d/y Ha9y\u0012\u0015Q,r\u0010H\u0012%g\u001eYZ`~\u0015YS#\u007f\u0014"
        //   754: astore          5
        //   756: bipush          22
        //   758: istore          6
        //   760: aload_2        
        //   761: astore          4
        //   763: goto            22
        //   766: aload           4
        //   768: iload_3        
        //   769: aload           7
        //   771: aastore        
        //   772: bipush          24
        //   774: istore_3       
        //   775: ldc             "1e\u0002_A3~\u001eT\u001d/y Ha9y\u0012\u0015A5t\u0012_A38\u0012U_-~\u0005eT!~\u001d_V\u001fc\u001eQW."
        //   777: astore          5
        //   779: bipush          23
        //   781: istore          6
        //   783: aload_2        
        //   784: astore          4
        //   786: goto            22
        //   789: aload           4
        //   791: iload_3        
        //   792: aload           7
        //   794: aastore        
        //   795: bipush          25
        //   797: istore_3       
        //   798: ldc             "1e\u0002_A3~\u001eT\u001d/y ha9y\u0012\u0015A5t\u0012_A38\u0012U_-~\u0005eT!~\u001d_V\u001fd\u0014Y@%c"
        //   800: astore          5
        //   802: bipush          24
        //   804: istore          6
        //   806: aload_2        
        //   807: astore          4
        //   809: goto            22
        //   812: aload           4
        //   814: iload_3        
        //   815: aload           7
        //   817: aastore        
        //   818: bipush          26
        //   820: istore_3       
        //   821: ldc             "1e\u0002_A3~\u001eT\u001d/y ha9y\u0012\u0015A5t\u0012_A38\u0012U_-~\u0005eT!~\u001d_V\u001ft\u0004H@\u001fu\u0003UE3r\u0003"
        //   823: astore          5
        //   825: bipush          25
        //   827: istore          6
        //   829: aload_2        
        //   830: astore          4
        //   832: goto            22
        //   835: aload           4
        //   837: iload_3        
        //   838: aload           7
        //   840: aastore        
        //   841: bipush          27
        //   843: istore_3       
        //   844: ldc             "1e\u0002_A3~\u001eT\u001d/y Ha9y\u0012\u0015A5t\u0012_A38\u0012U_-~\u0005eT!~\u001d_V\u001fu\u0003UE3r\u0003eQ(v\u001f]W"
        //   846: astore          5
        //   848: bipush          26
        //   850: istore          6
        //   852: aload_2        
        //   853: astore          4
        //   855: goto            22
        //   858: aload           4
        //   860: iload_3        
        //   861: aload           7
        //   863: aastore        
        //   864: bipush          28
        //   866: istore_3       
        //   867: ldc             "+r\b"
        //   869: astore          5
        //   871: bipush          27
        //   873: istore          6
        //   875: aload_2        
        //   876: astore          4
        //   878: goto            22
        //   881: aload           4
        //   883: iload_3        
        //   884: aload           7
        //   886: aastore        
        //   887: bipush          29
        //   889: istore_3       
        //   890: ldc             "1e.^S4v"
        //   892: astore          5
        //   894: bipush          28
        //   896: istore          6
        //   898: aload_2        
        //   899: astore          4
        //   901: goto            22
        //   904: aload           4
        //   906: iload_3        
        //   907: aload           7
        //   909: aastore        
        //   910: bipush          30
        //   912: istore_3       
        //   913: ldc             "\"e\u001eMA%e"
        //   915: astore          5
        //   917: bipush          29
        //   919: istore          6
        //   921: aload_2        
        //   922: astore          4
        //   924: goto            22
        //   927: aload           4
        //   929: iload_3        
        //   930: aload           7
        //   932: aastore        
        //   933: bipush          31
        //   935: istore_3       
        //   936: ldc             "1e.^S4v"
        //   938: astore          5
        //   940: bipush          30
        //   942: istore          6
        //   944: aload_2        
        //   945: astore          4
        //   947: goto            22
        //   950: aload           4
        //   952: iload_3        
        //   953: aload           7
        //   955: aastore        
        //   956: ldc             "#x\u001c\u0014E(v\u0005IS0g_[^!e\u001c\u0014e\u0005U.hw\u000eX%st\u0019"
        //   958: astore          5
        //   960: bipush          31
        //   962: istore          6
        //   964: bipush          32
        //   966: istore_3       
        //   967: aload_2        
        //   968: astore          4
        //   970: goto            22
        //   973: aload           4
        //   975: iload_3        
        //   976: aload           7
        //   978: aastore        
        //   979: bipush          33
        //   981: istore_3       
        //   982: aload_2        
        //   983: astore          4
        //   985: ldc             "!{\u0010H_"
        //   987: astore          5
        //   989: bipush          32
        //   991: istore          6
        //   993: goto            22
        //   996: aload           4
        //   998: iload_3        
        //   999: aload           7
        //  1001: aastore        
        //  1002: bipush          34
        //  1004: istore_3       
        //  1005: ldc             ".r\u0006wW3d\u0010]W"
        //  1007: astore          5
        //  1009: bipush          33
        //  1011: istore          6
        //  1013: aload_2        
        //  1014: astore          4
        //  1016: goto            22
        //  1019: aload           4
        //  1021: iload_3        
        //  1022: aload           7
        //  1024: aastore        
        //  1025: bipush          35
        //  1027: istore_3       
        //  1028: ldc             ")d0TV2x\u0018^e%v\u0003hW&e\u0014IZ"
        //  1030: astore          5
        //  1032: bipush          34
        //  1034: istore          6
        //  1036: aload_2        
        //  1037: astore          4
        //  1039: goto            22
        //  1042: aload           4
        //  1044: iload_3        
        //  1045: aload           7
        //  1047: aastore        
        //  1048: bipush          36
        //  1050: istore_3       
        //  1051: ldc             "#x\u001c\u0014E(v\u0005IS0g"
        //  1053: astore          5
        //  1055: bipush          35
        //  1057: istore          6
        //  1059: aload_2        
        //  1060: astore          4
        //  1062: goto            22
        //  1065: aload           4
        //  1067: iload_3        
        //  1068: aload           7
        //  1070: aastore        
        //  1071: bipush          37
        //  1073: istore_3       
        //  1074: ldc             ".x!UB5g"
        //  1076: astore          5
        //  1078: bipush          36
        //  1080: istore          6
        //  1082: aload_2        
        //  1083: astore          4
        //  1085: goto            22
        //  1088: aload           4
        //  1090: iload_3        
        //  1091: aload           7
        //  1093: aastore        
        //  1094: bipush          38
        //  1096: istore_3       
        //  1097: ldc             "1e\u0002_A3~\u001eT\u001d3r\u0005eP2x\u0006IW27TI\u0012edQ\u001fA`2\u0002"
        //  1099: astore          5
        //  1101: bipush          37
        //  1103: istore          6
        //  1105: aload_2        
        //  1106: astore          4
        //  1108: goto            22
        //  1111: aload           4
        //  1113: iload_3        
        //  1114: aload           7
        //  1116: aastore        
        //  1117: bipush          39
        //  1119: istore_3       
        //  1120: ldc             "1e\u0002_A3~\u001eT\u001d/y Hf%e\u001cS\\!c\u0014\u0015W2e\u001eH\u001d#x\u001cW[4H\u0017[[,r\u0015"
        //  1122: astore          5
        //  1124: bipush          38
        //  1126: istore          6
        //  1128: aload_2        
        //  1129: astore          4
        //  1131: goto            22
        //  1134: aload           4
        //  1136: iload_3        
        //  1137: aload           7
        //  1139: aastore        
        //  1140: bipush          40
        //  1142: istore_3       
        //  1143: ldc             "1e\u0002_A3~\u001eT\u001d\"r\u0017U@%F#iK.t^Y]-z\u0018Nm&v\u0018VW$H\u0002_Q2r\u0005"
        //  1145: astore          5
        //  1147: bipush          39
        //  1149: istore          6
        //  1151: aload_2        
        //  1152: astore          4
        //  1154: goto            22
        //  1157: aload           4
        //  1159: iload_3        
        //  1160: aload           7
        //  1162: aastore        
        //  1163: bipush          41
        //  1165: istore_3       
        //  1166: ldc             "7r\u0013iW3d\u0018U\\op\u0014Ng.r\tJ[2r\u0015iW3d\u0018U\\`u\u0003UE3r\u0003\u001aF)z\u0014^\u0012/b\u0005\u001a\u00173"
        //  1168: astore          5
        //  1170: bipush          40
        //  1172: istore          6
        //  1174: aload_2        
        //  1175: astore          4
        //  1177: goto            22
        //  1180: aload           4
        //  1182: iload_3        
        //  1183: aload           7
        //  1185: aastore        
        //  1186: bipush          42
        //  1188: istore_3       
        //  1189: ldc             "4x\u001a_\\"
        //  1191: astore          5
        //  1193: bipush          41
        //  1195: istore          6
        //  1197: aload_2        
        //  1198: astore          4
        //  1200: goto            22
        //  1203: aload           4
        //  1205: iload_3        
        //  1206: aload           7
        //  1208: aastore        
        //  1209: bipush          43
        //  1211: istore_3       
        //  1212: ldc             "1e.^S4v"
        //  1214: astore          5
        //  1216: bipush          42
        //  1218: istore          6
        //  1220: aload_2        
        //  1221: astore          4
        //  1223: goto            22
        //  1226: aload           4
        //  1228: iload_3        
        //  1229: aload           7
        //  1231: aastore        
        //  1232: bipush          44
        //  1234: istore_3       
        //  1235: ldc             "n:\\"
        //  1237: astore          5
        //  1239: bipush          43
        //  1241: istore          6
        //  1243: aload_2        
        //  1244: astore          4
        //  1246: goto            22
        //  1249: aload           4
        //  1251: iload_3        
        //  1252: aload           7
        //  1254: aastore        
        //  1255: bipush          45
        //  1257: istore_3       
        //  1258: ldc             "1e.^S4v"
        //  1260: astore          5
        //  1262: bipush          44
        //  1264: istore          6
        //  1266: aload_2        
        //  1267: astore          4
        //  1269: goto            22
        //  1272: aload           4
        //  1274: iload_3        
        //  1275: aload           7
        //  1277: aastore        
        //  1278: bipush          46
        //  1280: istore_3       
        //  1281: ldc             "4x\u001a_\\"
        //  1283: astore          5
        //  1285: bipush          45
        //  1287: istore          6
        //  1289: aload_2        
        //  1290: astore          4
        //  1292: goto            22
        //  1295: aload           4
        //  1297: iload_3        
        //  1298: aload           7
        //  1300: aastore        
        //  1301: bipush          47
        //  1303: istore_3       
        //  1304: ldc             "1e\u0002_A3~\u001eT\u001d#{\u0014[@\fx\u0016S\\\u0014x\u001a_\\or\u0003H]28\u0012U_-~\u0005eT!~\u001d_V"
        //  1306: astore          5
        //  1308: bipush          46
        //  1310: istore          6
        //  1312: aload_2        
        //  1313: astore          4
        //  1315: goto            22
        //  1318: aload           4
        //  1320: iload_3        
        //  1321: aload           7
        //  1323: aastore        
        //  1324: bipush          48
        //  1326: istore_3       
        //  1327: ldc             "1e.^S4v"
        //  1329: astore          5
        //  1331: bipush          47
        //  1333: istore          6
        //  1335: aload_2        
        //  1336: astore          4
        //  1338: goto            22
        //  1341: aload           4
        //  1343: iload_3        
        //  1344: aload           7
        //  1346: aastore        
        //  1347: bipush          49
        //  1349: istore_3       
        //  1350: ldc             "2r\u0017"
        //  1352: astore          5
        //  1354: bipush          48
        //  1356: istore          6
        //  1358: aload_2        
        //  1359: astore          4
        //  1361: goto            22
        //  1364: aload           4
        //  1366: iload_3        
        //  1367: aload           7
        //  1369: aastore        
        //  1370: bipush          50
        //  1372: istore_3       
        //  1373: ldc             "\u0017r\u0013{Q4~\u001eT{$T\u0010YZ%"
        //  1375: astore          5
        //  1377: bipush          49
        //  1379: istore          6
        //  1381: aload_2        
        //  1382: astore          4
        //  1384: goto            22
        //  1387: aload           4
        //  1389: iload_3        
        //  1390: aload           7
        //  1392: aastore        
        //  1393: aload_2        
        //  1394: putstatic       com/whatsapp/l7.z:[Ljava/lang/String;
        //  1397: new             Ljava/security/SecureRandom;
        //  1400: dup            
        //  1401: invokespecial   java/security/SecureRandom.<init>:()V
        //  1404: putstatic       com/whatsapp/l7.y:Ljava/security/SecureRandom;
        //  1407: new             Ljava/util/concurrent/atomic/AtomicInteger;
        //  1410: dup            
        //  1411: invokespecial   java/util/concurrent/atomic/AtomicInteger.<init>:()V
        //  1414: putstatic       com/whatsapp/l7.w:Ljava/util/concurrent/atomic/AtomicInteger;
        //  1417: new             Ljava/util/concurrent/atomic/AtomicReference;
        //  1420: dup            
        //  1421: invokespecial   java/util/concurrent/atomic/AtomicReference.<init>:()V
        //  1424: putstatic       com/whatsapp/l7.e:Ljava/util/concurrent/atomic/AtomicReference;
        //  1427: iconst_0       
        //  1428: putstatic       com/whatsapp/l7.l:Z
        //  1431: aconst_null    
        //  1432: putstatic       com/whatsapp/l7.c:Ljava/lang/String;
        //  1435: aconst_null    
        //  1436: putstatic       com/whatsapp/l7.a:[B
        //  1439: aconst_null    
        //  1440: putstatic       com/whatsapp/l7.n:[B
        //  1443: aconst_null    
        //  1444: putstatic       com/whatsapp/l7.x:[B
        //  1447: aconst_null    
        //  1448: putstatic       com/whatsapp/l7.j:Ljava/lang/String;
        //  1451: aconst_null    
        //  1452: putstatic       com/whatsapp/l7.r:Ljava/lang/String;
        //  1455: aconst_null    
        //  1456: putstatic       com/whatsapp/l7.u:Ljava/lang/String;
        //  1459: new             Lcom/whatsapp/oz;
        //  1462: dup            
        //  1463: invokespecial   com/whatsapp/oz.<init>:()V
        //  1466: invokestatic    java/util/Collections.synchronizedMap:(Ljava/util/Map;)Ljava/util/Map;
        //  1469: putstatic       com/whatsapp/l7.o:Ljava/util/Map;
        //  1472: new             Lcom/whatsapp/o2;
        //  1475: dup            
        //  1476: invokespecial   com/whatsapp/o2.<init>:()V
        //  1479: putstatic       com/whatsapp/l7.g:Lcom/whatsapp/o2;
        //  1482: new             Ljava/util/ArrayList;
        //  1485: dup            
        //  1486: invokespecial   java/util/ArrayList.<init>:()V
        //  1489: invokestatic    java/util/Collections.synchronizedList:(Ljava/util/List;)Ljava/util/List;
        //  1492: putstatic       com/whatsapp/l7.s:Ljava/util/List;
        //  1495: aconst_null    
        //  1496: putstatic       com/whatsapp/l7.b:Lcom/whatsapp/tj;
        //  1499: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1502: ldc             "1e.^S4v"
        //  1504: invokestatic    com/whatsapp/l7.z:(Ljava/lang/String;)[C
        //  1507: invokestatic    com/whatsapp/l7.z:([C)Ljava/lang/String;
        //  1510: iconst_0       
        //  1511: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //  1514: astore          8
        //  1516: ldc             "2r\u0017"
        //  1518: astore          9
        //  1520: aload           8
        //  1522: astore          10
        //  1524: iload_0        
        //  1525: istore          11
        //  1527: aload           9
        //  1529: invokestatic    com/whatsapp/l7.z:(Ljava/lang/String;)[C
        //  1532: invokestatic    com/whatsapp/l7.z:([C)Ljava/lang/String;
        //  1535: astore          12
        //  1537: iload           11
        //  1539: tableswitch {
        //                0: 1583
        //          default: 1556
        //        }
        //  1556: aload           10
        //  1558: aload           12
        //  1560: aconst_null    
        //  1561: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1566: putstatic       com/whatsapp/l7.c:Ljava/lang/String;
        //  1569: ldc             "+r\b"
        //  1571: astore          9
        //  1573: aload           8
        //  1575: astore          10
        //  1577: iconst_0       
        //  1578: istore          11
        //  1580: goto            1527
        //  1583: aload           10
        //  1585: aload           12
        //  1587: aconst_null    
        //  1588: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1593: astore          13
        //  1595: aload           13
        //  1597: ifnonnull       1915
        //  1600: aconst_null    
        //  1601: astore          14
        //  1603: aload           14
        //  1605: putstatic       com/whatsapp/l7.a:[B
        //  1608: aconst_null    
        //  1609: putstatic       com/whatsapp/l7.n:[B
        //  1612: aconst_null    
        //  1613: putstatic       com/whatsapp/l7.x:[B
        //  1616: getstatic       com/whatsapp/l7.a:[B
        //  1619: ifnull          1663
        //  1622: bipush          32
        //  1624: newarray        B
        //  1626: putstatic       com/whatsapp/l7.n:[B
        //  1629: bipush          32
        //  1631: newarray        B
        //  1633: putstatic       com/whatsapp/l7.x:[B
        //  1636: getstatic       com/whatsapp/l7.a:[B
        //  1639: iconst_0       
        //  1640: getstatic       com/whatsapp/l7.n:[B
        //  1643: iconst_0       
        //  1644: bipush          32
        //  1646: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //  1649: getstatic       com/whatsapp/l7.a:[B
        //  1652: bipush          32
        //  1654: getstatic       com/whatsapp/l7.x:[B
        //  1657: iconst_0       
        //  1658: bipush          32
        //  1660: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //  1663: ldc             "4x\u001a_\\"
        //  1665: astore          16
        //  1667: aload           8
        //  1669: astore          17
        //  1671: aload           16
        //  1673: invokestatic    com/whatsapp/l7.z:(Ljava/lang/String;)[C
        //  1676: invokestatic    com/whatsapp/l7.z:([C)Ljava/lang/String;
        //  1679: astore          18
        //  1681: iload_0        
        //  1682: tableswitch {
        //                0: 1931
        //                1: 1958
        //                2: 1734
        //          default: 1708
        //        }
        //  1708: aload           17
        //  1710: aload           18
        //  1712: aconst_null    
        //  1713: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1718: putstatic       com/whatsapp/l7.j:Ljava/lang/String;
        //  1721: ldc             "\"e\u001eMA%e"
        //  1723: astore          16
        //  1725: aload           8
        //  1727: astore          17
        //  1729: iconst_0       
        //  1730: istore_0       
        //  1731: goto            1671
        //  1734: aload           17
        //  1736: aload           18
        //  1738: iconst_0       
        //  1739: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //  1744: putstatic       com/whatsapp/l7.i:Z
        //  1747: ldc             "!y\u0015H])s_RS2s\u0006[@%9%H['p\u0014Hw6r\u001fN~)d\u0005_\\%e"
        //  1749: invokestatic    com/whatsapp/l7.z:(Ljava/lang/String;)[C
        //  1752: invokestatic    com/whatsapp/l7.z:([C)Ljava/lang/String;
        //  1755: astore          19
        //  1757: aload           19
        //  1759: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //  1762: pop            
        //  1763: iload_1        
        //  1764: istore          21
        //  1766: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1769: istore          25
        //  1771: iload           25
        //  1773: bipush          18
        //  1775: if_icmplt       1846
        //  1778: iload           21
        //  1780: ifeq            1846
        //  1783: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1786: astore          31
        //  1788: ldc             "3r\u001fI]2"
        //  1790: invokestatic    com/whatsapp/l7.z:(Ljava/lang/String;)[C
        //  1793: invokestatic    com/whatsapp/l7.z:([C)Ljava/lang/String;
        //  1796: astore          32
        //  1798: aload           31
        //  1800: aload           32
        //  1802: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //  1805: checkcast       Landroid/hardware/SensorManager;
        //  1808: putstatic       com/whatsapp/l7.h:Landroid/hardware/SensorManager;
        //  1811: getstatic       com/whatsapp/l7.h:Landroid/hardware/SensorManager;
        //  1814: ifnull          2007
        //  1817: getstatic       com/whatsapp/l7.h:Landroid/hardware/SensorManager;
        //  1820: bipush          17
        //  1822: invokevirtual   android/hardware/SensorManager.getDefaultSensor:(I)Landroid/hardware/Sensor;
        //  1825: astore          34
        //  1827: aload           34
        //  1829: astore          33
        //  1831: aload           33
        //  1833: putstatic       com/whatsapp/l7.p:Landroid/hardware/Sensor;
        //  1836: new             Lcom/whatsapp/yc;
        //  1839: dup            
        //  1840: invokespecial   com/whatsapp/yc.<init>:()V
        //  1843: putstatic       com/whatsapp/l7.k:Landroid/hardware/TriggerEventListener;
        //  1846: getstatic       com/whatsapp/l7.h:Landroid/hardware/SensorManager;
        //  1849: astore          28
        //  1851: aload           28
        //  1853: ifnull          2023
        //  1856: getstatic       com/whatsapp/l7.p:Landroid/hardware/Sensor;
        //  1859: astore          30
        //  1861: aload           30
        //  1863: ifnull          2023
        //  1866: iload_1        
        //  1867: putstatic       com/whatsapp/l7.t:Z
        //  1870: new             Ljava/io/File;
        //  1873: dup            
        //  1874: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1877: invokevirtual   com/whatsapp/App.getCacheDir:()Ljava/io/File;
        //  1880: getstatic       com/whatsapp/l7.z:[Ljava/lang/String;
        //  1883: bipush          50
        //  1885: aaload         
        //  1886: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1889: putstatic       com/whatsapp/l7.q:Ljava/io/File;
        //  1892: getstatic       com/whatsapp/l7.q:Ljava/io/File;
        //  1895: invokevirtual   java/io/File.exists:()Z
        //  1898: ifeq            1904
        //  1901: invokestatic    com/whatsapp/l7.l:()V
        //  1904: new             Ljava/util/ArrayList;
        //  1907: dup            
        //  1908: invokespecial   java/util/ArrayList.<init>:()V
        //  1911: putstatic       com/whatsapp/l7.m:Ljava/util/List;
        //  1914: return         
        //  1915: aload           13
        //  1917: iconst_0       
        //  1918: invokestatic    android/backport/util/Base64.decode:(Ljava/lang/String;I)[B
        //  1921: astore          14
        //  1923: goto            1603
        //  1926: astore          15
        //  1928: aload           15
        //  1930: athrow         
        //  1931: aload           17
        //  1933: aload           18
        //  1935: aconst_null    
        //  1936: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1941: putstatic       com/whatsapp/l7.r:Ljava/lang/String;
        //  1944: ldc_w           "%g\u001eYZ"
        //  1947: astore          16
        //  1949: iload_1        
        //  1950: istore_0       
        //  1951: aload           8
        //  1953: astore          17
        //  1955: goto            1671
        //  1958: aload           17
        //  1960: aload           18
        //  1962: aconst_null    
        //  1963: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1968: putstatic       com/whatsapp/l7.u:Ljava/lang/String;
        //  1971: ldc             "\"e\u001eMA%e.YZ!y\u0016_V"
        //  1973: astore          16
        //  1975: iconst_2       
        //  1976: istore_0       
        //  1977: aload           8
        //  1979: astore          17
        //  1981: goto            1671
        //  1984: astore          20
        //  1986: iconst_0       
        //  1987: istore          21
        //  1989: goto            1766
        //  1992: astore          22
        //  1994: aload           22
        //  1996: athrow         
        //  1997: astore          23
        //  1999: aload           23
        //  2001: athrow         
        //  2002: astore          24
        //  2004: aload           24
        //  2006: athrow         
        //  2007: aconst_null    
        //  2008: astore          33
        //  2010: goto            1831
        //  2013: astore          26
        //  2015: aload           26
        //  2017: athrow         
        //  2018: astore          27
        //  2020: aload           27
        //  2022: athrow         
        //  2023: iconst_0       
        //  2024: istore_1       
        //  2025: goto            1866
        //  2028: astore          29
        //  2030: aload           29
        //  2032: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  1603   1663   1926   1931   Ljava/lang/Exception;
        //  1757   1763   1984   1992   Ljava/lang/Exception;
        //  1766   1771   1992   2002   Ljava/lang/Exception;
        //  1783   1788   2002   2007   Ljava/lang/Exception;
        //  1798   1827   2002   2007   Ljava/lang/Exception;
        //  1846   1851   2013   2018   Ljava/lang/Exception;
        //  1856   1861   2018   2023   Ljava/lang/Exception;
        //  1866   1904   2028   2033   Ljava/lang/Exception;
        //  1994   1997   1997   2002   Ljava/lang/Exception;
        //  1999   2002   2002   2007   Ljava/lang/Exception;
        //  2015   2018   2018   2023   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 943, Size: 943
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
    
    private static boolean A() {
        return c(false);
    }
    
    static SecureRandom B() {
        return l7.y;
    }
    
    public static void C() {
        if (j() && l7.t) {
            l7.v = true;
            e();
        }
    }
    
    private static void D() {
        l7.o.clear();
        l7.g.b();
    }
    
    static boolean E() {
        return l7.l;
    }
    
    public static arb a(final int n, final boolean b, final boolean b2) {
        final arb arb = new arb(n, b, b2, null);
        if (arb.equals(l7.e.getAndSet(arb))) {
            return null;
        }
        return arb;
    }
    
    public static String a(final String p0, final byte[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    org/whispersystems/s.a:()Lorg/whispersystems/w;
        //     3: astore_2       
        //     4: iconst_1       
        //     5: newarray        B
        //     7: dup            
        //     8: iconst_0       
        //     9: iconst_5       
        //    10: bastore        
        //    11: aload_0        
        //    12: iconst_0       
        //    13: invokestatic    android/backport/util/Base64.decode:(Ljava/lang/String;I)[B
        //    16: invokestatic    com/whatsapp/jp.b:([B[B)[B
        //    19: iconst_0       
        //    20: invokestatic    org/whispersystems/s.a:([BI)Lorg/whispersystems/ak;
        //    23: aload_2        
        //    24: invokevirtual   org/whispersystems/w.a:()Lorg/whispersystems/P;
        //    27: invokestatic    org/whispersystems/s.a:(Lorg/whispersystems/ak;Lorg/whispersystems/P;)[B
        //    30: astore          4
        //    32: iconst_3       
        //    33: invokestatic    org/whispersystems/B.a:(I)Lorg/whispersystems/B;
        //    36: aload           4
        //    38: aconst_null    
        //    39: bipush          80
        //    41: invokevirtual   org/whispersystems/B.a:([B[BI)[B
        //    44: astore          5
        //    46: bipush          32
        //    48: newarray        B
        //    50: astore          6
        //    52: aload           5
        //    54: iconst_0       
        //    55: aload           6
        //    57: iconst_0       
        //    58: bipush          32
        //    60: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    63: bipush          32
        //    65: newarray        B
        //    67: astore          7
        //    69: aload           5
        //    71: bipush          32
        //    73: aload           7
        //    75: iconst_0       
        //    76: bipush          32
        //    78: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    81: bipush          16
        //    83: newarray        B
        //    85: astore          8
        //    87: aload           5
        //    89: bipush          64
        //    91: aload           8
        //    93: iconst_0       
        //    94: bipush          16
        //    96: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    99: aload           6
        //   101: aload           8
        //   103: aload_1        
        //   104: invokestatic    com/whatsapp/jp.a:([B[B[B)[B
        //   107: astore          9
        //   109: aload_2        
        //   110: invokevirtual   org/whispersystems/w.b:()Lorg/whispersystems/ak;
        //   113: checkcast       Lorg/whispersystems/l;
        //   116: checkcast       Lorg/whispersystems/l;
        //   119: invokevirtual   org/whispersystems/l.b:()[B
        //   122: astore          10
        //   124: aload           7
        //   126: aload           10
        //   128: aload           9
        //   130: invokestatic    com/whatsapp/jp.b:([B[B)[B
        //   133: invokestatic    com/whatsapp/jp.a:([B[B)[B
        //   136: astore          11
        //   138: aload           11
        //   140: ifnull          148
        //   143: aload           9
        //   145: ifnonnull       255
        //   148: getstatic       com/whatsapp/l7.z:[Ljava/lang/String;
        //   151: iconst_1       
        //   152: aaload         
        //   153: astore          13
        //   155: iconst_2       
        //   156: anewarray       Ljava/lang/Object;
        //   159: astore          14
        //   161: aload           9
        //   163: ifnonnull       238
        //   166: iconst_1       
        //   167: istore          15
        //   169: aload           14
        //   171: iconst_0       
        //   172: iload           15
        //   174: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   177: aastore        
        //   178: aload           11
        //   180: ifnonnull       249
        //   183: iconst_1       
        //   184: istore          17
        //   186: aload           14
        //   188: iconst_1       
        //   189: iload           17
        //   191: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   194: aastore        
        //   195: aload           13
        //   197: aconst_null    
        //   198: aload           14
        //   200: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   203: aconst_null    
        //   204: areturn        
        //   205: astore_3       
        //   206: new             Ljava/lang/StringBuilder;
        //   209: dup            
        //   210: invokespecial   java/lang/StringBuilder.<init>:()V
        //   213: getstatic       com/whatsapp/l7.z:[Ljava/lang/String;
        //   216: iconst_0       
        //   217: aaload         
        //   218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: aload_3        
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   225: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   228: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   231: aconst_null    
        //   232: areturn        
        //   233: astore          12
        //   235: aload           12
        //   237: athrow         
        //   238: iconst_0       
        //   239: istore          15
        //   241: goto            169
        //   244: astore          16
        //   246: aload           16
        //   248: athrow         
        //   249: iconst_0       
        //   250: istore          17
        //   252: goto            186
        //   255: aload           10
        //   257: aload           11
        //   259: aload           9
        //   261: invokestatic    com/whatsapp/jp.b:([B[B)[B
        //   264: invokestatic    com/whatsapp/jp.b:([B[B)[B
        //   267: iconst_2       
        //   268: invokestatic    android/backport/util/Base64.encodeToString:([BI)Ljava/lang/String;
        //   271: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      32     205    233    Ljava/lang/Exception;
        //  148    161    233    238    Ljava/lang/Exception;
        //  169    178    244    249    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 138, Size: 138
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
    
    private static void a(final int n) {
        final boolean i = App.I;
        final Iterator<og> iterator = l7.m.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(n);
            if (i) {
                break;
            }
        }
    }
    
    public static void a(final long n) {
        l7.l = false;
        a(n, l7.r);
    }
    
    public static void a(final long e, final String s) {
        if (s != null && e > 0L) {
            final nl nl = s().get(s);
            if (nl != null) {
                nl.e = e;
                n().b(s, nl.e);
                x();
            }
        }
    }
    
    public static void a(final Context context) {
        final File file = new File(App.M, l7.z[4]);
        Label_0077: {
            if (!file.exists()) {
                break Label_0077;
            }
            try {
                if (App.A(new Scanner(file).nextLine()) != null) {
                    return;
                }
                try {
                    App.a(context, l7.z[5], 1);
                    return;
                }
                catch (Exception ex) {
                    throw ex;
                }
            }
            catch (Exception ex3) {
                final Context context2 = context;
                final String[] array = l7.z;
                final int n = 2;
                final String s = array[n];
                final int n2 = 1;
                App.a(context2, s, n2);
                final boolean b = App.I;
                if (!b) {
                    return;
                }
            }
            try {
                final Context context2 = context;
                final String[] array = l7.z;
                final int n = 2;
                final String s = array[n];
                final int n2 = 1;
                App.a(context2, s, n2);
                final boolean b = App.I;
                if (b) {
                    App.a(context, l7.z[3], 1);
                }
            }
            catch (Exception ex2) {
                throw ex2;
            }
        }
    }
    
    private static void a(final nl nl) {
        final ho ho = new ho((Context)App.aq);
        final Location a = ho.a(2);
        if (a != null && 120000L + a.getTime() > System.currentTimeMillis()) {
            Log.i(l7.z[16] + a.getTime());
            bm.a(new zx(nl, a));
            if (!App.I) {
                return;
            }
        }
        final s s = new s(nl, ho);
        ho.a(2, 0L, 0.0f, (LocationListener)s);
        App.aq.a5().postDelayed((Runnable)new ahu(ho, (LocationListener)s), 60000L);
    }
    
    public static void a(final og og) {
        l7.m.remove(og);
    }
    
    public static void a(final String s, final int n) {
        l7.o.put(s, n);
        l7.g.a();
    }
    
    public static void a(final String s, final String s2) {
        final nl nl = s().get(s);
        if (nl != null) {
            final byte[] decode = Base64.decode(nl.k, 0);
            final byte[] array = new byte[32];
            System.arraycopy(decode, 0, array, 0, 32);
            final byte[] array2 = new byte[32];
            System.arraycopy(decode, 32, array2, 0, 32);
            final byte[] a = jp.a(array2, array);
            if (a != null && Base64.encodeToString(a, 2).equals(s2)) {
                h(s);
                x();
            }
        }
    }
    
    public static void a(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final boolean b) {
        if (!c(s3)) {
            l7.w.getAndSet(0);
            Log.i(l7.z[23]);
            l7.u = null;
            D();
        }
        final boolean c = c(s3);
        boolean b2 = false;
        if (!c) {
            b2 = true;
        }
        if (!d(b2)) {
            Log.e(l7.z[27]);
        }
        if (!l(s)) {
            Log.e(l7.z[22]);
        }
        if (!i(s4)) {
            Log.e(l7.z[24]);
        }
        if (s2 != null && !k(s2)) {
            Log.e(l7.z[25]);
        }
        if (s3 != null && !m(s3)) {
            Log.e(l7.z[26]);
        }
        if (!a(s3, s2, s4, s5, s6, b)) {
            Log.e(l7.z[21]);
        }
    }
    
    public static void a(final boolean b, final boolean b2, final boolean b3) {
        if (j()) {
            final Intent setPackage = new Intent(l7.z[32]).setPackage(l7.z[36]);
            if (PendingIntent.getBroadcast((Context)App.aq, 0, setPackage, 536870912) == null) {
                setPackage.putExtra(l7.z[34], b);
                setPackage.putExtra(l7.z[37], b2);
                setPackage.putExtra(l7.z[35], b3);
                ((AlarmManager)App.aq.getSystemService(l7.z[33])).set(0, 20000L + System.currentTimeMillis(), PendingIntent.getBroadcast((Context)App.aq, 0, setPackage, 0));
            }
        }
    }
    
    public static boolean a() {
        return j() && l7.v;
    }
    
    public static boolean a(final String s) {
        return s != null && s.equals(l7.r) && d();
    }
    
    static boolean a(final String s, final String s2, final String s3) {
        return b(s, s2, s3);
    }
    
    private static boolean a(final String s, final String k, final String b, final String c, final String h, final boolean g) {
        if (s == null) {
            return true;
        }
        Log.c(l7.z[38], null, new Object[] { s, b, c, h });
        nl nl = s().get(s);
        nl nl2 = null;
        Label_0133: {
            if (nl == null) {
                nl = new nl(s, k, b, c, h, g);
                s().put(s, nl);
                if (!App.I) {
                    nl2 = nl;
                    break Label_0133;
                }
            }
            nl.k = k;
            nl.b = b;
            nl.c = c;
            nl.h = h;
            nl.g = g;
            nl.d = 0L;
            nl2 = nl;
        }
        nl2.e = System.currentTimeMillis();
        n().a(s, k, b, c, h, g);
        x();
        a(nl2);
        return true;
    }
    
    private static boolean a(final String s, final String s2, final boolean b) {
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(s, 0).edit();
        edit.putBoolean(s2, b);
        return edit.commit();
    }
    
    private static boolean a(final String s, final boolean b) {
        l7.a = Base64.decode(s, 0);
        if (l7.a.length == 64) {
            l7.n = new byte[32];
            l7.x = new byte[32];
            System.arraycopy(l7.a, 0, l7.n, 0, 32);
            System.arraycopy(l7.a, 32, l7.x, 0, 32);
        }
        if (b) {
            final boolean b2 = b(l7.z[29], l7.z[28], s);
            final boolean b3 = false;
            if (!b2) {
                return b3;
            }
        }
        return true;
    }
    
    static boolean a(final boolean v) {
        return l7.v = v;
    }
    
    public static nh b(final String s) {
        final String[] split = s.split(",");
        if (split.length < 2) {
            Log.e(l7.z[6]);
            return null;
        }
        final String s2 = split[0];
        final String s3 = split[1];
        final int length = split.length;
        String s4 = null;
        if (length >= 3) {
            s4 = split[2];
        }
        return new nh(s2, s3, s4);
    }
    
    private static nl b(nl nl) {
        if (nl != null) {
            if (nl.g && nl.d != 0L && nl.d < System.currentTimeMillis()) {
                Log.c(l7.z[41], null, new Object[] { nl.f });
                h(nl.f);
                x();
                nl = null;
            }
            return nl;
        }
        return null;
    }
    
    public static void b() {
        if (l7.s.size() > 0) {
            bm.a(new a6l());
        }
    }
    
    public static void b(final og og) {
        if (!l7.m.contains(og)) {
            l7.m.add(og);
        }
    }
    
    public static void b(final String s, final int n) {
        if (l7.c != null && !l7.c.equals(s)) {
            return;
        }
        if (!A()) {
            Log.e(l7.z[20]);
        }
        a(n);
    }
    
    public static void b(final String s, final String s2) {
        App.a(s, s2, s2 != null && s2.equals(l7.c));
    }
    
    public static void b(final boolean b) {
        if (!c(b)) {
            Log.e(l7.z[39]);
        }
    }
    
    private static boolean b(final String s, final String s2, final String s3) {
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(s, 0).edit();
        edit.putString(s2, s3);
        return edit.commit();
    }
    
    public static String c(final String s, final String s2, final String s3) {
        final nl nl = s().get(s);
        if (nl != null) {
            final byte[] decode = Base64.decode(nl.k, 0);
            final byte[] array = new byte[32];
            System.arraycopy(decode, 32, array, 0, 32);
            final byte[] a = jp.a(array, Base64.decode(s3, 0));
            if (a != null) {
                String k;
                if (Base64.encodeToString(a, 2).equals(s2)) {
                    k = nl.k;
                }
                else {
                    k = null;
                }
                return k;
            }
        }
        return null;
    }
    
    static void c() {
        e();
    }
    
    public static boolean c(final String s) {
        return l7.r != null && l7.r.equals(s);
    }
    
    private static boolean c(final String s, final String s2) {
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(s, 0).edit();
        edit.remove(s2);
        return edit.commit();
    }
    
    private static boolean c(final boolean b) {
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(l7.z[10], 0).edit();
        l7.c = null;
        edit.remove(l7.z[8]);
        Label_0164: {
            if (b) {
                h(l7.r);
                l7.a = null;
                l7.n = null;
                l7.x = null;
                l7.j = null;
                l7.r = null;
                edit.remove(l7.z[11]);
                edit.remove(l7.z[9]);
                edit.remove(l7.z[12]);
                x();
                if (!App.I) {
                    break Label_0164;
                }
            }
            final nl nl = s().get(l7.r);
            if (nl != null && nl.g) {
                nl.d = 600000L + System.currentTimeMillis();
                n().a(l7.r, nl.d);
            }
        }
        l7.s.clear();
        l7.b = null;
        l7.v = false;
        h();
        return edit.commit();
    }
    
    private static nl d(final String s) {
        return b(s().get(s));
    }
    
    public static String d(final String s, final String s2) {
        final nl d = d(s);
        String k = null;
        if (d != null) {
            final boolean equals = d.b.equals(s2);
            k = null;
            if (equals) {
                k = d.k;
            }
        }
        return k;
    }
    
    public static boolean d() {
        return j() && l7.l;
    }
    
    private static boolean d(final boolean i) {
        l7.i = i;
        return a(l7.z[14], l7.z[13], i);
    }
    
    @TargetApi(18)
    private static void e() {
        if (l7.t) {
            l7.h.requestTriggerSensor(l7.k, l7.p);
        }
    }
    
    public static void e(final String s) {
        if (f(s)) {
            h(s);
            x();
        }
    }
    
    static boolean e(final String s, final String s2) {
        return c(s, s2);
    }
    
    static boolean f() {
        return A();
    }
    
    public static boolean f(final String s) {
        return s().containsKey(s);
    }
    
    public static String g() {
        final byte[] array = new byte[32];
        l7.y.nextBytes(array);
        return Base64.encodeToString(array, 2);
    }
    
    public static void g(final String u) {
        if (u != null && !u.equals(l7.u)) {
            l7.u = u;
            l7.o.clear();
        }
    }
    
    @TargetApi(18)
    private static void h() {
        if (l7.t) {
            l7.h.cancelTriggerSensor(l7.k, l7.p);
        }
    }
    
    public static void h(final String s) {
        if (c(s)) {
            D();
        }
        s().remove(s);
        n().a(s);
    }
    
    public static tj i() {
        final tj b = l7.b;
        l7.b = null;
        return b;
    }
    
    private static boolean i(final String j) {
        l7.j = j;
        return b(l7.z[43], l7.z[42], j);
    }
    
    public static String j(final String s) {
        final String g = g();
        l7.b = new tj(g, s);
        return g;
    }
    
    public static boolean j() {
        return l7.c != null;
    }
    
    public static void k() {
        App.aq.getSharedPreferences(l7.z[7], 0).edit().clear().commit();
        s().clear();
        n().b();
        D();
        l7.a = null;
        l7.n = null;
        l7.x = null;
        l7.j = null;
        l7.r = null;
        x();
    }
    
    private static boolean k(final String s) {
        return a(s, true);
    }
    
    private static void l() {
        try {
            synchronized (l7.o) {
                final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(l7.q));
                l7.o.putAll((Map)objectInputStream.readObject());
                objectInputStream.close();
            }
        }
        catch (Exception ex) {}
    }
    
    private static boolean l(final String c) {
        l7.c = c;
        return b(l7.z[48], l7.z[49], c);
    }
    
    static File m() {
        return l7.q;
    }
    
    private static boolean m(final String r) {
        l7.r = r;
        return b(l7.z[31], l7.z[30], r);
    }
    
    private static b8 n() {
        if (l7.d == null) {
            l7.d = b8.a((Context)App.aq);
        }
        return l7.d;
    }
    
    public static void n(final String s) {
        if (!a(s, false)) {
            Log.e(l7.z[40]);
        }
    }
    
    public static String o() {
        return l7.z[44] + Integer.toHexString(l7.w.getAndIncrement());
    }
    
    public static boolean o(final String s) {
        return s != null && s.equals(l7.c);
    }
    
    public static boolean p() {
        return !s().isEmpty();
    }
    
    public static void q() {
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(l7.z[45], 0).edit();
        l7.j = null;
        edit.remove(l7.z[46]);
        if (!edit.commit()) {
            Log.e(l7.z[47]);
        }
    }
    
    public static void r() {
        l7.l = true;
        x();
    }
    
    private static Map s() {
        final boolean i = App.I;
        if (l7.f == null) {
            l7.f = new LinkedHashMap();
            for (final nl nl : n().a()) {
                l7.f.put(nl.f, nl);
                if (i) {
                    break;
                }
            }
        }
        return l7.f;
    }
    
    public static boolean t() {
        return l7.j != null;
    }
    
    static void u() {
        x();
    }
    
    public static void v() {
        if (j()) {
            final PendingIntent broadcast = PendingIntent.getBroadcast((Context)App.aq, 0, new Intent(l7.z[19]).setPackage(l7.z[18]), 536870912);
            if (broadcast != null) {
                ((AlarmManager)App.aq.getSystemService(l7.z[17])).cancel(broadcast);
                broadcast.cancel();
            }
        }
    }
    
    public static void w() {
        if (!A()) {
            Log.e(l7.z[15]);
        }
    }
    
    private static void x() {
        final boolean i = App.I;
        final Iterator<og> iterator = l7.m.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
            if (i) {
                break;
            }
        }
    }
    
    static b8 y() {
        return n();
    }
    
    private static String z(final char[] array) {
        for (int i = array.length, n = 0; i > n; ++n) {
            final char c = array[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '2';
                    break;
                }
                case 0: {
                    c2 = '@';
                    break;
                }
                case 1: {
                    c2 = '\u0017';
                    break;
                }
                case 2: {
                    c2 = 'q';
                    break;
                }
                case 3: {
                    c2 = ':';
                    break;
                }
            }
            array[n] = (char)(c2 ^ c);
        }
        return new String(array).intern();
    }
    
    public static List z() {
        final boolean i = App.I;
        final Iterator<nl> iterator = new ArrayList<nl>(s().values()).iterator();
        while (iterator.hasNext()) {
            b(iterator.next());
            if (i) {
                break;
            }
        }
        return new ArrayList(s().values());
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length < 2) {
            charArray[0] ^= '2';
        }
        return charArray;
    }
}
