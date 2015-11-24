// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.text.format.Time;
import org.json.JSONObject;
import com.google.ai;

final class ag
{
    private static final String[] z;
    private final String a;
    private final String b;
    private final boolean c;
    private final long d;
    private final String e;
    private final String f;
    private final long g;
    
    static {
        final String[] z2 = new String[28];
        String s = "\t]";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0732:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0014';
                        break;
                    }
                    case 0: {
                        c2 = '`';
                        break;
                    }
                    case 1: {
                        c2 = '9';
                        break;
                    }
                    case 2: {
                        c2 = '8';
                        break;
                    }
                    case 3: {
                        c2 = '\u000b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0001IHg}\u0003XLb{\u000e\u0016NepN^Wds\f\\\u0015jd\u0010J\u0016m{\f]]y";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\rV\\br\t\\\\Ou\u0014\\";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\rPUn@\u0019I]";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u0014PLgq";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\rV\\br\t\\\\Ou\u0014\\";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0004\\Khf\tILb{\u000e";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\r]\rH|\u0005ZSxa\r";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0006PTnG\tC]";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0006PTnG\tC]";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\t]";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    s = "\u0004\\Khf\tILb{\u000e";
                    n = 10;
                    n2 = 11;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    array = z2;
                    s = "\r]\rH|\u0005ZSxa\r";
                    n = 11;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0007]Jbb\u0005\u0014^bx\u0005\u0016[dz\u0013MJ~w\u0014";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\rV\\br\t\\\\Ou\u0014\\";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\rPUn@\u0019I]";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0001IHg}\u0003XLb{\u000e\u0016NepN^Wds\f\\\u0015jd\u0010J\u0016m{\f]]y";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0014PLgq";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0006PTn";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0012\\KBpZ\u0019\u001dx4\u0014PLgqZ\u001cK+y\u0004\f\u0002.g@JQqqZ\u001c\\+`\u0019I]11\u0013";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    s = "\u0006VToq\u0012";
                    n = 19;
                    n2 = 20;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    array = z2;
                    s = "\u0004\\Khf\tILb{\u000e";
                    n = 20;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0006PTnG\tC]";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0014PLgq";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\rPUn@\u0019I]";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\r]\rH|\u0005ZSxa\r";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\t]";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\rV\\br\t\\\\Ou\u0014\\";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    break Label_0732;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ag(final ai p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: ldc2_w          -1
        //    11: lstore_3       
        //    12: ldc2_w          -1
        //    15: lstore          5
        //    17: iconst_0       
        //    18: istore          7
        //    20: aconst_null    
        //    21: astore          8
        //    23: aconst_null    
        //    24: astore          9
        //    26: aconst_null    
        //    27: astore          10
        //    29: aconst_null    
        //    30: astore          11
        //    32: aload_1        
        //    33: invokevirtual   com/google/ai.o:()Z
        //    36: ifeq            216
        //    39: aload_1        
        //    40: invokevirtual   com/google/ai.b:()Ljava/lang/String;
        //    43: astore          13
        //    45: iconst_m1      
        //    46: istore          14
        //    48: aload           13
        //    50: invokevirtual   java/lang/String.hashCode:()I
        //    53: istore          16
        //    55: iload           16
        //    57: lookupswitch {
        //          -1724546052: 308
        //          -1392120434: 383
        //          -735564899: 358
        //          -626009577: 408
        //          -474937375: 333
        //             3355: 258
        //          110371416: 283
        //          default: 124
        //        }
        //   124: iload           14
        //   126: tableswitch {
        //                0: 484
        //                1: 811
        //                2: 800
        //                3: 785
        //                4: 860
        //                5: 841
        //                6: 818
        //          default: 168
        //        }
        //   168: iload           7
        //   170: istore          26
        //   172: aload           8
        //   174: astore          27
        //   176: aload           9
        //   178: astore          20
        //   180: aload           10
        //   182: astore          21
        //   184: aload           11
        //   186: astore          22
        //   188: aload_1        
        //   189: invokevirtual   com/google/ai.c:()V
        //   192: aload           22
        //   194: astore          11
        //   196: aload           21
        //   198: astore          10
        //   200: aload           20
        //   202: astore          9
        //   204: aload           27
        //   206: astore          8
        //   208: iload           26
        //   210: istore          7
        //   212: iload_2        
        //   213: ifeq            32
        //   216: aload_0        
        //   217: aload           8
        //   219: putfield        com/whatsapp/gdrive/ag.e:Ljava/lang/String;
        //   222: aload_0        
        //   223: aload           9
        //   225: putfield        com/whatsapp/gdrive/ag.b:Ljava/lang/String;
        //   228: aload_0        
        //   229: aload           10
        //   231: putfield        com/whatsapp/gdrive/ag.a:Ljava/lang/String;
        //   234: aload_0        
        //   235: aload           11
        //   237: putfield        com/whatsapp/gdrive/ag.f:Ljava/lang/String;
        //   240: aload_0        
        //   241: lload           5
        //   243: putfield        com/whatsapp/gdrive/ag.g:J
        //   246: aload_0        
        //   247: iload           7
        //   249: putfield        com/whatsapp/gdrive/ag.c:Z
        //   252: aload_0        
        //   253: lload_3        
        //   254: putfield        com/whatsapp/gdrive/ag.d:J
        //   257: return         
        //   258: aload           13
        //   260: getstatic       com/whatsapp/gdrive/ag.z:[Ljava/lang/String;
        //   263: bipush          10
        //   265: aaload         
        //   266: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   269: istore          49
        //   271: iload           49
        //   273: ifeq            124
        //   276: iconst_0       
        //   277: istore          14
        //   279: iload_2        
        //   280: ifeq            124
        //   283: aload           13
        //   285: getstatic       com/whatsapp/gdrive/ag.z:[Ljava/lang/String;
        //   288: bipush          17
        //   290: aaload         
        //   291: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   294: istore          48
        //   296: iload           48
        //   298: ifeq            124
        //   301: iconst_1       
        //   302: istore          14
        //   304: iload_2        
        //   305: ifeq            124
        //   308: aload           13
        //   310: getstatic       com/whatsapp/gdrive/ag.z:[Ljava/lang/String;
        //   313: bipush          11
        //   315: aaload         
        //   316: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   319: istore          46
        //   321: iload           46
        //   323: ifeq            124
        //   326: iconst_2       
        //   327: istore          14
        //   329: iload_2        
        //   330: ifeq            124
        //   333: aload           13
        //   335: getstatic       com/whatsapp/gdrive/ag.z:[Ljava/lang/String;
        //   338: bipush          12
        //   340: aaload         
        //   341: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   344: istore          44
        //   346: iload           44
        //   348: ifeq            124
        //   351: iconst_3       
        //   352: istore          14
        //   354: iload_2        
        //   355: ifeq            124
        //   358: aload           13
        //   360: getstatic       com/whatsapp/gdrive/ag.z:[Ljava/lang/String;
        //   363: bipush          9
        //   365: aaload         
        //   366: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   369: istore          42
        //   371: iload           42
        //   373: ifeq            124
        //   376: iconst_4       
        //   377: istore          14
        //   379: iload_2        
        //   380: ifeq            124
        //   383: aload           13
        //   385: getstatic       com/whatsapp/gdrive/ag.z:[Ljava/lang/String;
        //   388: bipush          15
        //   390: aaload         
        //   391: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   394: istore          40
        //   396: iload           40
        //   398: ifeq            124
        //   401: iconst_5       
        //   402: istore          14
        //   404: iload_2        
        //   405: ifeq            124
        //   408: aload           13
        //   410: getstatic       com/whatsapp/gdrive/ag.z:[Ljava/lang/String;
        //   413: bipush          14
        //   415: aaload         
        //   416: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   419: istore          18
        //   421: iload           18
        //   423: ifeq            124
        //   426: bipush          6
        //   428: istore          14
        //   430: goto            124
        //   433: astore          15
        //   435: aload           15
        //   437: athrow         
        //   438: astore          12
        //   440: getstatic       com/whatsapp/gdrive/ag.z:[Ljava/lang/String;
        //   443: bipush          13
        //   445: aaload         
        //   446: aload           12
        //   448: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   451: goto            216
        //   454: astore          47
        //   456: aload           47
        //   458: athrow         
        //   459: astore          45
        //   461: aload           45
        //   463: athrow         
        //   464: astore          43
        //   466: aload           43
        //   468: athrow         
        //   469: astore          41
        //   471: aload           41
        //   473: athrow         
        //   474: astore          39
        //   476: aload           39
        //   478: athrow         
        //   479: astore          17
        //   481: aload           17
        //   483: athrow         
        //   484: aload_1        
        //   485: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   488: astore          38
        //   490: aload           38
        //   492: astore          19
        //   494: iload_2        
        //   495: ifeq            778
        //   498: aload_1        
        //   499: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   502: astore          33
        //   504: aload           33
        //   506: astore          20
        //   508: iload_2        
        //   509: ifeq            767
        //   512: aload_1        
        //   513: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   516: astore          35
        //   518: aload           35
        //   520: astore          21
        //   522: iload_2        
        //   523: ifeq            752
        //   526: aload_1        
        //   527: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   530: astore          37
        //   532: aload           37
        //   534: astore          11
        //   536: iload_2        
        //   537: ifeq            752
        //   540: aload           11
        //   542: astore          22
        //   544: aload_1        
        //   545: invokevirtual   com/google/ai.t:()J
        //   548: lstore          5
        //   550: iload_2        
        //   551: ifeq            879
        //   554: getstatic       com/whatsapp/gdrive/ag.z:[Ljava/lang/String;
        //   557: bipush          16
        //   559: aaload         
        //   560: aload_1        
        //   561: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   564: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   567: istore          24
        //   569: iload           24
        //   571: istore          7
        //   573: iload_2        
        //   574: ifeq            879
        //   577: aload           19
        //   579: astore          25
        //   581: iload           7
        //   583: istore          26
        //   585: aload           25
        //   587: astore          27
        //   589: new             Landroid/text/format/Time;
        //   592: dup            
        //   593: invokespecial   android/text/format/Time.<init>:()V
        //   596: astore          28
        //   598: aload           28
        //   600: aload_1        
        //   601: invokevirtual   com/google/ai.u:()Ljava/lang/String;
        //   604: invokevirtual   android/text/format/Time.parse3339:(Ljava/lang/String;)Z
        //   607: pop            
        //   608: aload           28
        //   610: iconst_1       
        //   611: invokevirtual   android/text/format/Time.toMillis:(Z)J
        //   614: lstore_3       
        //   615: iload_2        
        //   616: ifne            188
        //   619: aload           22
        //   621: astore          11
        //   623: aload           21
        //   625: astore          10
        //   627: aload           20
        //   629: astore          9
        //   631: aload           27
        //   633: astore          8
        //   635: iload           26
        //   637: istore          7
        //   639: goto            212
        //   642: astore          31
        //   644: aload           31
        //   646: athrow         
        //   647: astore          29
        //   649: aload           22
        //   651: astore          11
        //   653: aload           21
        //   655: astore          10
        //   657: aload           20
        //   659: astore          9
        //   661: aload           27
        //   663: astore          8
        //   665: iload           26
        //   667: istore          7
        //   669: aload           29
        //   671: astore          12
        //   673: goto            440
        //   676: astore          23
        //   678: aload           22
        //   680: astore          11
        //   682: aload           21
        //   684: astore          10
        //   686: aload           20
        //   688: astore          9
        //   690: aload           19
        //   692: astore          8
        //   694: aload           23
        //   696: astore          12
        //   698: goto            440
        //   701: astore          32
        //   703: aload           19
        //   705: astore          8
        //   707: aload           32
        //   709: astore          12
        //   711: goto            440
        //   714: astore          34
        //   716: aload           20
        //   718: astore          9
        //   720: aload           19
        //   722: astore          8
        //   724: aload           34
        //   726: astore          12
        //   728: goto            440
        //   731: astore          36
        //   733: aload           21
        //   735: astore          10
        //   737: aload           20
        //   739: astore          9
        //   741: aload           19
        //   743: astore          8
        //   745: aload           36
        //   747: astore          12
        //   749: goto            440
        //   752: aload           21
        //   754: astore          10
        //   756: aload           20
        //   758: astore          9
        //   760: aload           19
        //   762: astore          8
        //   764: goto            212
        //   767: aload           20
        //   769: astore          9
        //   771: aload           19
        //   773: astore          8
        //   775: goto            212
        //   778: aload           19
        //   780: astore          8
        //   782: goto            212
        //   785: aload           8
        //   787: astore          19
        //   789: aload           9
        //   791: astore          20
        //   793: aload           10
        //   795: astore          21
        //   797: goto            526
        //   800: aload           8
        //   802: astore          19
        //   804: aload           9
        //   806: astore          20
        //   808: goto            512
        //   811: aload           8
        //   813: astore          19
        //   815: goto            498
        //   818: iload           7
        //   820: istore          26
        //   822: aload           8
        //   824: astore          27
        //   826: aload           9
        //   828: astore          20
        //   830: aload           10
        //   832: astore          21
        //   834: aload           11
        //   836: astore          22
        //   838: goto            589
        //   841: aload           8
        //   843: astore          19
        //   845: aload           9
        //   847: astore          20
        //   849: aload           10
        //   851: astore          21
        //   853: aload           11
        //   855: astore          22
        //   857: goto            554
        //   860: aload           8
        //   862: astore          19
        //   864: aload           9
        //   866: astore          20
        //   868: aload           10
        //   870: astore          21
        //   872: aload           11
        //   874: astore          22
        //   876: goto            544
        //   879: aload           22
        //   881: astore          11
        //   883: aload           21
        //   885: astore          10
        //   887: aload           20
        //   889: astore          9
        //   891: aload           19
        //   893: astore          8
        //   895: goto            212
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  32     45     438    440    Ljava/io/IOException;
        //  48     55     433    438    Ljava/io/IOException;
        //  188    192    642    647    Ljava/io/IOException;
        //  258    271    433    438    Ljava/io/IOException;
        //  283    296    454    459    Ljava/io/IOException;
        //  308    321    459    464    Ljava/io/IOException;
        //  333    346    464    469    Ljava/io/IOException;
        //  358    371    469    474    Ljava/io/IOException;
        //  383    396    474    479    Ljava/io/IOException;
        //  408    421    479    484    Ljava/io/IOException;
        //  435    438    438    440    Ljava/io/IOException;
        //  456    459    438    440    Ljava/io/IOException;
        //  461    464    438    440    Ljava/io/IOException;
        //  466    469    438    440    Ljava/io/IOException;
        //  471    474    438    440    Ljava/io/IOException;
        //  476    479    438    440    Ljava/io/IOException;
        //  481    484    438    440    Ljava/io/IOException;
        //  484    490    438    440    Ljava/io/IOException;
        //  498    504    701    714    Ljava/io/IOException;
        //  512    518    714    731    Ljava/io/IOException;
        //  526    532    731    752    Ljava/io/IOException;
        //  544    550    676    701    Ljava/io/IOException;
        //  554    569    676    701    Ljava/io/IOException;
        //  589    615    647    676    Ljava/io/IOException;
        //  644    647    647    676    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 389, Size: 389
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
    
    public ag(final String e, final String b, final String a, final String f, final long g, final boolean c, final long d) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.f = f;
        this.g = g;
        this.c = c;
        this.d = d;
    }
    
    public ag(final JSONObject jsonObject) {
        this.e = jsonObject.optString(ag.z[0], (String)null);
        this.b = jsonObject.optString(ag.z[4], (String)null);
        this.a = jsonObject.optString(ag.z[6], (String)null);
        this.f = jsonObject.optString(ag.z[7], (String)null);
        this.g = jsonObject.optLong(ag.z[8], -1L);
        this.c = ag.z[1].equals(jsonObject.optString(ag.z[3], (String)null));
        if (jsonObject.has(ag.z[5])) {
            final Time time = new Time();
            time.parse3339(jsonObject.optString(ag.z[2], (String)null));
            this.d = time.toMillis(true);
            if (GoogleDriveService.F == 0) {
                return;
            }
        }
        this.d = -1L;
    }
    
    public static String[] f() {
        return new String[] { ag.z[26], ag.z[23], ag.z[21], ag.z[25], ag.z[22], ag.z[24], ag.z[27] };
    }
    
    public boolean a() {
        return this.c;
    }
    
    public String b() {
        return this.e;
    }
    
    public String c() {
        return this.a;
    }
    
    public long d() {
        return this.g;
    }
    
    public String e() {
        return this.f;
    }
    
    public String g() {
        return this.b;
    }
    
    public long h() {
        return this.d;
    }
    
    @Override
    public String toString() {
        final String s = ag.z[19];
        final Object[] array = { this.e, this.b, this.f, this.g, null };
        String s2;
        if (this.c) {
            s2 = ag.z[20];
        }
        else {
            s2 = ag.z[18];
        }
        array[4] = s2;
        return String.format(s, array);
    }
}
