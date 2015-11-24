// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ek extends Thread
{
    private static final String[] z;
    final ao1 a;
    
    static {
        final String[] z2 = new String[13];
        String s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7iHB";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = '\u001b';
                        break;
                    }
                    case 1: {
                        c2 = '=';
                        break;
                    }
                    case 2: {
                        c2 = ',';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7xR\\\u0013";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7lT@\u00068l\\E\u001e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7kOC\t}hN\f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7xR\\\u0013";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7rRI\u0012{~MX\u0003wu";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7NSM\bt~\u001dX\u00058xOI\u000bl~\u001dO\u0018yhU\f\u0003v;KE\u000e}t\u001d_\u000fvoTB\u000ft;[E\u0006}";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7y\\HJnrYI\u0005";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "UR\f\u0019hz^I";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7oOE\u0007";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7}T@\u000fvtIJ\u0005muY";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7xRY\u0006|;SC\u001e8|XXJnrYI\u00058oUY\u0007z";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "mTH\u000fwoOM\u0004kxRH\u000finXY\u000f7rQ@\u000f\u007fzQ_\u001eyoX";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ek(final ao1 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //     7: iconst_0       
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    12: aload_0        
        //    13: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //    16: invokestatic    com/whatsapp/ao1.c:(Lcom/whatsapp/ao1;)Ljava/util/ArrayList;
        //    19: invokevirtual   java/util/ArrayList.size:()I
        //    22: ifne            58
        //    25: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //    28: iconst_2       
        //    29: aaload         
        //    30: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    33: aload_0        
        //    34: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //    37: invokestatic    com/whatsapp/ao1.c:(Lcom/whatsapp/ao1;)Ljava/util/ArrayList;
        //    40: astore          98
        //    42: aload           98
        //    44: monitorenter   
        //    45: aload_0        
        //    46: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //    49: invokestatic    com/whatsapp/ao1.c:(Lcom/whatsapp/ao1;)Ljava/util/ArrayList;
        //    52: invokevirtual   java/lang/Object.wait:()V
        //    55: aload           98
        //    57: monitorexit    
        //    58: aload_0        
        //    59: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //    62: invokestatic    com/whatsapp/ao1.c:(Lcom/whatsapp/ao1;)Ljava/util/ArrayList;
        //    65: invokevirtual   java/util/ArrayList.size:()I
        //    68: ifeq            917
        //    71: aload_0        
        //    72: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //    75: invokestatic    com/whatsapp/ao1.c:(Lcom/whatsapp/ao1;)Ljava/util/ArrayList;
        //    78: astore          7
        //    80: aload           7
        //    82: monitorenter   
        //    83: aload_0        
        //    84: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //    87: invokestatic    com/whatsapp/ao1.c:(Lcom/whatsapp/ao1;)Ljava/util/ArrayList;
        //    90: iconst_0       
        //    91: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //    94: checkcast       Lcom/whatsapp/protocol/bi;
        //    97: astore          9
        //    99: new             Ljava/lang/StringBuilder;
        //   102: dup            
        //   103: invokespecial   java/lang/StringBuilder.<init>:()V
        //   106: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //   109: iconst_3       
        //   110: aaload         
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: aload           9
        //   116: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   119: getfield        com/whatsapp/protocol/c6.c:Ljava/lang/String;
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   125: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   128: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   131: aload           7
        //   133: monitorexit    
        //   134: aload           9
        //   136: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   139: checkcast       Lcom/whatsapp/MediaData;
        //   142: astore          10
        //   144: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   147: aload           10
        //   149: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   152: aload           9
        //   154: getfield        com/whatsapp/protocol/bi.I:B
        //   157: aload           9
        //   159: getfield        com/whatsapp/protocol/bi.E:I
        //   162: iconst_1       
        //   163: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Ljava/io/File;BIZ)Ljava/io/File;
        //   166: astore          11
        //   168: aload           10
        //   170: new             Lcom/whatsapp/wm;
        //   173: dup            
        //   174: aload           10
        //   176: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   179: aload           11
        //   181: aload           10
        //   183: getfield        com/whatsapp/MediaData.trimFrom:J
        //   186: aload           10
        //   188: getfield        com/whatsapp/MediaData.trimTo:J
        //   191: invokespecial   com/whatsapp/wm.<init>:(Ljava/io/File;Ljava/io/File;JJ)V
        //   194: putfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   197: aload           10
        //   199: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   202: new             Lcom/whatsapp/zf;
        //   205: dup            
        //   206: aload_0        
        //   207: aload           9
        //   209: aload           10
        //   211: invokespecial   com/whatsapp/zf.<init>:(Lcom/whatsapp/ek;Lcom/whatsapp/protocol/bi;Lcom/whatsapp/MediaData;)V
        //   214: invokevirtual   com/whatsapp/wm.a:(Lcom/whatsapp/ao;)V
        //   217: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //   220: invokevirtual   java/io/File.createNewFile:()Z
        //   223: pop            
        //   224: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //   227: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   230: invokestatic    com/whatsapp/VideoFrameConverter.setLogFilePath:(Ljava/lang/String;)V
        //   233: aload_0        
        //   234: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //   237: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //   240: ifnull          253
        //   243: aload_0        
        //   244: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //   247: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //   250: invokevirtual   android/os/PowerManager$WakeLock.acquire:()V
        //   253: aload           10
        //   255: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   258: invokestatic    com/whatsapp/wm.b:(Ljava/io/File;)Z
        //   261: ifeq            509
        //   264: new             Lcom/whatsapp/util/ak;
        //   267: dup            
        //   268: aload           10
        //   270: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   273: invokespecial   com/whatsapp/util/ak.<init>:(Ljava/io/File;)V
        //   276: astore          59
        //   278: aload           59
        //   280: invokevirtual   com/whatsapp/util/ak.b:()I
        //   283: istore          60
        //   285: aload           59
        //   287: invokevirtual   com/whatsapp/util/ak.d:()I
        //   290: istore          61
        //   292: iload           60
        //   294: iload           61
        //   296: if_icmplt       318
        //   299: sipush          640
        //   302: istore          63
        //   304: iload           61
        //   306: iload           63
        //   308: imul           
        //   309: iload           60
        //   311: idiv           
        //   312: istore          62
        //   314: iload_1        
        //   315: ifeq            333
        //   318: sipush          640
        //   321: istore          62
        //   323: iload           60
        //   325: iload           62
        //   327: imul           
        //   328: iload           61
        //   330: idiv           
        //   331: istore          63
        //   333: aload           10
        //   335: getfield        com/whatsapp/MediaData.trimFrom:J
        //   338: lconst_0       
        //   339: lcmp           
        //   340: iflt            443
        //   343: aload           10
        //   345: getfield        com/whatsapp/MediaData.trimTo:J
        //   348: lstore          93
        //   350: lload           93
        //   352: lconst_0       
        //   353: lcmp           
        //   354: ifle            443
        //   357: aload           59
        //   359: invokevirtual   com/whatsapp/util/ak.f:()Z
        //   362: istore          95
        //   364: iload           95
        //   366: ifne            405
        //   369: aload           10
        //   371: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   374: invokestatic    com/whatsapp/wm.a:(Ljava/io/File;)Z
        //   377: istore          96
        //   379: iload           96
        //   381: ifeq            405
        //   384: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //   387: bipush          9
        //   389: aaload         
        //   390: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   393: aload           10
        //   395: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   398: invokevirtual   com/whatsapp/wm.h:()V
        //   401: iload_1        
        //   402: ifeq            505
        //   405: aload           10
        //   407: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   410: iload           63
        //   412: iload           62
        //   414: aload           10
        //   416: getfield        com/whatsapp/MediaData.trimTo:J
        //   419: aload           10
        //   421: getfield        com/whatsapp/MediaData.trimFrom:J
        //   424: lsub           
        //   425: invokestatic    com/whatsapp/util/br.a:(IIJ)F
        //   428: invokevirtual   com/whatsapp/wm.a:(F)V
        //   431: aload           10
        //   433: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   436: invokevirtual   com/whatsapp/wm.a:()V
        //   439: iload_1        
        //   440: ifeq            505
        //   443: aload           59
        //   445: invokevirtual   com/whatsapp/util/ak.f:()Z
        //   448: istore          72
        //   450: iload           72
        //   452: ifne            477
        //   455: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //   458: iconst_1       
        //   459: aaload         
        //   460: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   463: aload           10
        //   465: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   468: aload           11
        //   470: invokestatic    com/whatsapp/util/br.a:(Ljava/io/File;Ljava/io/File;)V
        //   473: iload_1        
        //   474: ifeq            505
        //   477: aload           10
        //   479: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   482: iload           63
        //   484: iload           62
        //   486: aload           59
        //   488: invokevirtual   com/whatsapp/util/ak.e:()J
        //   491: invokestatic    com/whatsapp/util/br.a:(IIJ)F
        //   494: invokevirtual   com/whatsapp/wm.a:(F)V
        //   497: aload           10
        //   499: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   502: invokevirtual   com/whatsapp/wm.a:()V
        //   505: iload_1        
        //   506: ifeq            1428
        //   509: aload           10
        //   511: getfield        com/whatsapp/MediaData.trimFrom:J
        //   514: lstore          86
        //   516: lload           86
        //   518: lconst_0       
        //   519: lcmp           
        //   520: iflt            549
        //   523: aload           10
        //   525: getfield        com/whatsapp/MediaData.trimTo:J
        //   528: lstore          91
        //   530: lload           91
        //   532: lconst_0       
        //   533: lcmp           
        //   534: ifle            549
        //   537: aload           10
        //   539: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   542: invokevirtual   com/whatsapp/wm.h:()V
        //   545: iload_1        
        //   546: ifeq            1428
        //   549: aload           10
        //   551: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   554: invokevirtual   java/io/File.length:()J
        //   557: l2d            
        //   558: dstore          88
        //   560: getstatic       com/whatsapp/ym.k:I
        //   563: istore          90
        //   565: dload           88
        //   567: ldc2_w          1.5
        //   570: ldc2_w          1048576
        //   573: iload           90
        //   575: i2l            
        //   576: lmul           
        //   577: l2d            
        //   578: dmul           
        //   579: dcmpg          
        //   580: ifge            605
        //   583: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //   586: iconst_4       
        //   587: aaload         
        //   588: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   591: aload           10
        //   593: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   596: aload           11
        //   598: invokestatic    com/whatsapp/util/br.a:(Ljava/io/File;Ljava/io/File;)V
        //   601: iload_1        
        //   602: ifeq            1428
        //   605: new             Ljava/lang/IllegalArgumentException;
        //   608: dup            
        //   609: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //   612: athrow         
        //   613: astore          85
        //   615: aload           85
        //   617: athrow         
        //   618: astore          53
        //   620: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //   623: bipush          12
        //   625: aaload         
        //   626: aload           53
        //   628: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   631: aload           53
        //   633: invokestatic    com/whatsapp/ao1.b:(Ljava/lang/Exception;)V
        //   636: aload_0        
        //   637: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //   640: invokestatic    com/whatsapp/ao1.b:(Lcom/whatsapp/ao1;)Landroid/os/Handler;
        //   643: new             Lcom/whatsapp/aqc;
        //   646: dup            
        //   647: aload_0        
        //   648: invokespecial   com/whatsapp/aqc.<init>:(Lcom/whatsapp/ek;)V
        //   651: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   654: pop            
        //   655: aconst_null    
        //   656: invokestatic    com/whatsapp/VideoFrameConverter.setLogFilePath:(Ljava/lang/String;)V
        //   659: aload_0        
        //   660: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //   663: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //   666: astore          55
        //   668: aload           55
        //   670: ifnull          696
        //   673: aload_0        
        //   674: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //   677: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //   680: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //   683: ifeq            696
        //   686: aload_0        
        //   687: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //   690: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //   693: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   696: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //   699: invokevirtual   java/io/File.exists:()Z
        //   702: ifeq            1689
        //   705: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //   708: invokevirtual   java/io/File.delete:()Z
        //   711: pop            
        //   712: iconst_0       
        //   713: istore          25
        //   715: iload           25
        //   717: ifeq            874
        //   720: aload           10
        //   722: aload           11
        //   724: putfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   727: aload           10
        //   729: iconst_1       
        //   730: putfield        com/whatsapp/MediaData.transcoded:Z
        //   733: aload           10
        //   735: aload           10
        //   737: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   740: invokevirtual   java/io/File.length:()J
        //   743: putfield        com/whatsapp/MediaData.fileSize:J
        //   746: aload           9
        //   748: aload           10
        //   750: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   753: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   756: putfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //   759: aload           9
        //   761: aload           10
        //   763: getfield        com/whatsapp/MediaData.fileSize:J
        //   766: putfield        com/whatsapp/protocol/bi.L:J
        //   769: aload           9
        //   771: aload           10
        //   773: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   776: invokestatic    com/whatsapp/util/br.a:(Ljava/io/File;)I
        //   779: putfield        com/whatsapp/protocol/bi.D:I
        //   782: aload           10
        //   784: getfield        com/whatsapp/MediaData.trimFrom:J
        //   787: lstore          30
        //   789: lload           30
        //   791: lconst_0       
        //   792: lcmp           
        //   793: ifle            839
        //   796: aload           9
        //   798: invokestatic    com/whatsapp/util/b.c:(Lcom/whatsapp/protocol/bi;)V
        //   801: aload           10
        //   803: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   806: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   809: invokestatic    com/whatsapp/util/br.a:(Ljava/lang/String;)[B
        //   812: astore          33
        //   814: aload           33
        //   816: ifnull          830
        //   819: aload           9
        //   821: aload           33
        //   823: invokevirtual   com/whatsapp/protocol/bi.a:([B)V
        //   826: iload_1        
        //   827: ifeq            839
        //   830: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //   833: bipush          11
        //   835: aaload         
        //   836: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   839: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   842: aload           9
        //   844: iconst_1       
        //   845: iconst_m1      
        //   846: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;ZI)V
        //   849: aload_0        
        //   850: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //   853: invokestatic    com/whatsapp/ao1.b:(Lcom/whatsapp/ao1;)Landroid/os/Handler;
        //   856: new             Lcom/whatsapp/a8_;
        //   859: dup            
        //   860: aload_0        
        //   861: aload           9
        //   863: invokespecial   com/whatsapp/a8_.<init>:(Lcom/whatsapp/ek;Lcom/whatsapp/protocol/bi;)V
        //   866: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   869: pop            
        //   870: iload_1        
        //   871: ifeq            917
        //   874: aload           10
        //   876: iconst_0       
        //   877: putfield        com/whatsapp/MediaData.transferring:Z
        //   880: aload           9
        //   882: iconst_0       
        //   883: putfield        com/whatsapp/protocol/bi.c:I
        //   886: aload           10
        //   888: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   891: invokevirtual   com/whatsapp/wm.c:()Z
        //   894: istore          28
        //   896: iload           28
        //   898: ifeq            907
        //   901: aload           10
        //   903: iconst_0       
        //   904: putfield        com/whatsapp/MediaData.autodownloadRetryEnabled:Z
        //   907: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   910: aload           9
        //   912: iconst_1       
        //   913: iconst_m1      
        //   914: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;ZI)V
        //   917: invokestatic    java/lang/Thread.interrupted:()Z
        //   920: istore          6
        //   922: iload           6
        //   924: ifeq            12
        //   927: return         
        //   928: astore          99
        //   930: aload           98
        //   932: monitorexit    
        //   933: aload           99
        //   935: athrow         
        //   936: astore_2       
        //   937: aload_0        
        //   938: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //   941: invokestatic    com/whatsapp/ao1.c:(Lcom/whatsapp/ao1;)Ljava/util/ArrayList;
        //   944: astore_3       
        //   945: aload_3        
        //   946: monitorenter   
        //   947: aload_0        
        //   948: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //   951: invokestatic    com/whatsapp/ao1.c:(Lcom/whatsapp/ao1;)Ljava/util/ArrayList;
        //   954: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   957: ifne            998
        //   960: aload_0        
        //   961: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //   964: invokestatic    com/whatsapp/ao1.c:(Lcom/whatsapp/ao1;)Ljava/util/ArrayList;
        //   967: iconst_0       
        //   968: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   971: checkcast       Lcom/whatsapp/protocol/bi;
        //   974: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   977: checkcast       Lcom/whatsapp/MediaData;
        //   980: astore          5
        //   982: aload           5
        //   984: iconst_0       
        //   985: putfield        com/whatsapp/MediaData.transferring:Z
        //   988: aload           5
        //   990: lconst_0       
        //   991: putfield        com/whatsapp/MediaData.progress:J
        //   994: iload_1        
        //   995: ifeq            947
        //   998: aload_3        
        //   999: monitorexit    
        //  1000: return         
        //  1001: astore          4
        //  1003: aload_3        
        //  1004: monitorexit    
        //  1005: aload           4
        //  1007: athrow         
        //  1008: astore          8
        //  1010: aload           7
        //  1012: monitorexit    
        //  1013: aload           8
        //  1015: athrow         
        //  1016: astore          12
        //  1018: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //  1021: bipush          6
        //  1023: aaload         
        //  1024: aload           12
        //  1026: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1029: goto            233
        //  1032: astore          52
        //  1034: aload           52
        //  1036: athrow         
        //  1037: astore          46
        //  1039: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //  1042: bipush          7
        //  1044: aaload         
        //  1045: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1048: aload           46
        //  1050: invokestatic    com/whatsapp/ao1.b:(Ljava/lang/Exception;)V
        //  1053: aload_0        
        //  1054: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1057: invokestatic    com/whatsapp/ao1.b:(Lcom/whatsapp/ao1;)Landroid/os/Handler;
        //  1060: new             Lcom/whatsapp/awy;
        //  1063: dup            
        //  1064: aload_0        
        //  1065: invokespecial   com/whatsapp/awy.<init>:(Lcom/whatsapp/ek;)V
        //  1068: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //  1071: pop            
        //  1072: aconst_null    
        //  1073: invokestatic    com/whatsapp/VideoFrameConverter.setLogFilePath:(Ljava/lang/String;)V
        //  1076: aload_0        
        //  1077: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1080: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1083: astore          48
        //  1085: aload           48
        //  1087: ifnull          1113
        //  1090: aload_0        
        //  1091: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1094: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1097: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //  1100: ifeq            1113
        //  1103: aload_0        
        //  1104: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1107: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1110: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //  1113: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //  1116: invokevirtual   java/io/File.exists:()Z
        //  1119: ifeq            1689
        //  1122: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //  1125: invokevirtual   java/io/File.delete:()Z
        //  1128: pop            
        //  1129: iconst_0       
        //  1130: istore          25
        //  1132: goto            715
        //  1135: astore          64
        //  1137: aload           64
        //  1139: athrow         
        //  1140: astore          65
        //  1142: aload           65
        //  1144: athrow         
        //  1145: astore          66
        //  1147: aload           66
        //  1149: athrow         
        //  1150: astore          67
        //  1152: aload           67
        //  1154: athrow         
        //  1155: astore          68
        //  1157: aload           68
        //  1159: athrow         
        //  1160: astore          69
        //  1162: aload           69
        //  1164: athrow         
        //  1165: astore          70
        //  1167: aload           70
        //  1169: athrow         
        //  1170: astore          71
        //  1172: aload           71
        //  1174: athrow         
        //  1175: astore          40
        //  1177: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //  1180: bipush          10
        //  1182: aaload         
        //  1183: aload           40
        //  1185: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1188: aload           40
        //  1190: invokestatic    com/whatsapp/ao1.b:(Ljava/lang/Exception;)V
        //  1193: aload_0        
        //  1194: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1197: invokestatic    com/whatsapp/ao1.b:(Lcom/whatsapp/ao1;)Landroid/os/Handler;
        //  1200: new             Lcom/whatsapp/dq;
        //  1203: dup            
        //  1204: aload_0        
        //  1205: invokespecial   com/whatsapp/dq.<init>:(Lcom/whatsapp/ek;)V
        //  1208: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //  1211: pop            
        //  1212: aconst_null    
        //  1213: invokestatic    com/whatsapp/VideoFrameConverter.setLogFilePath:(Ljava/lang/String;)V
        //  1216: aload_0        
        //  1217: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1220: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1223: astore          42
        //  1225: aload           42
        //  1227: ifnull          1253
        //  1230: aload_0        
        //  1231: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1234: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1237: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //  1240: ifeq            1253
        //  1243: aload_0        
        //  1244: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1247: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1250: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //  1253: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //  1256: invokevirtual   java/io/File.exists:()Z
        //  1259: ifeq            1689
        //  1262: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //  1265: invokevirtual   java/io/File.delete:()Z
        //  1268: pop            
        //  1269: iconst_0       
        //  1270: istore          25
        //  1272: goto            715
        //  1275: astore          80
        //  1277: aload           80
        //  1279: athrow         
        //  1280: astore          81
        //  1282: aload           81
        //  1284: athrow         
        //  1285: astore          82
        //  1287: aload           82
        //  1289: athrow         
        //  1290: astore          83
        //  1292: aload           83
        //  1294: athrow         
        //  1295: astore          84
        //  1297: aload           84
        //  1299: athrow         
        //  1300: astore          19
        //  1302: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //  1305: iconst_5       
        //  1306: aaload         
        //  1307: aload           19
        //  1309: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1312: aload           19
        //  1314: invokestatic    com/whatsapp/ao1.b:(Ljava/lang/Exception;)V
        //  1317: aload           19
        //  1319: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //  1322: ifnull          1365
        //  1325: aload           19
        //  1327: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //  1330: getstatic       com/whatsapp/ek.z:[Ljava/lang/String;
        //  1333: bipush          8
        //  1335: aaload         
        //  1336: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1339: istore          38
        //  1341: iload           38
        //  1343: ifeq            1365
        //  1346: aload_0        
        //  1347: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1350: invokestatic    com/whatsapp/ao1.b:(Lcom/whatsapp/ao1;)Landroid/os/Handler;
        //  1353: new             Lcom/whatsapp/awu;
        //  1356: dup            
        //  1357: aload_0        
        //  1358: invokespecial   com/whatsapp/awu.<init>:(Lcom/whatsapp/ek;)V
        //  1361: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //  1364: pop            
        //  1365: aconst_null    
        //  1366: invokestatic    com/whatsapp/VideoFrameConverter.setLogFilePath:(Ljava/lang/String;)V
        //  1369: aload_0        
        //  1370: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1373: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1376: ifnull          1406
        //  1379: aload_0        
        //  1380: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1383: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1386: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //  1389: istore          37
        //  1391: iload           37
        //  1393: ifeq            1406
        //  1396: aload_0        
        //  1397: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1400: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1403: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //  1406: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //  1409: invokevirtual   java/io/File.exists:()Z
        //  1412: ifeq            1689
        //  1415: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //  1418: invokevirtual   java/io/File.delete:()Z
        //  1421: pop            
        //  1422: iconst_0       
        //  1423: istore          25
        //  1425: goto            715
        //  1428: aload           10
        //  1430: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //  1433: invokevirtual   com/whatsapp/wm.c:()Z
        //  1436: istore          74
        //  1438: iload           74
        //  1440: ifne            1578
        //  1443: iconst_1       
        //  1444: istore          25
        //  1446: aconst_null    
        //  1447: invokestatic    com/whatsapp/VideoFrameConverter.setLogFilePath:(Ljava/lang/String;)V
        //  1450: aload_0        
        //  1451: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1454: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1457: ifnull          1487
        //  1460: aload_0        
        //  1461: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1464: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1467: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //  1470: istore          79
        //  1472: iload           79
        //  1474: ifeq            1487
        //  1477: aload_0        
        //  1478: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1481: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1484: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //  1487: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //  1490: invokevirtual   java/io/File.exists:()Z
        //  1493: ifeq            715
        //  1496: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //  1499: invokevirtual   java/io/File.delete:()Z
        //  1502: pop            
        //  1503: goto            715
        //  1506: astore          77
        //  1508: aload           77
        //  1510: athrow         
        //  1511: astore          73
        //  1513: aload           73
        //  1515: athrow         
        //  1516: astore          13
        //  1518: aconst_null    
        //  1519: invokestatic    com/whatsapp/VideoFrameConverter.setLogFilePath:(Ljava/lang/String;)V
        //  1522: aload_0        
        //  1523: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1526: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1529: ifnull          1559
        //  1532: aload_0        
        //  1533: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1536: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1539: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //  1542: istore          18
        //  1544: iload           18
        //  1546: ifeq            1559
        //  1549: aload_0        
        //  1550: getfield        com/whatsapp/ek.a:Lcom/whatsapp/ao1;
        //  1553: invokestatic    com/whatsapp/ao1.a:(Lcom/whatsapp/ao1;)Landroid/os/PowerManager$WakeLock;
        //  1556: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //  1559: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //  1562: invokevirtual   java/io/File.exists:()Z
        //  1565: ifeq            1575
        //  1568: getstatic       com/whatsapp/App.aw:Ljava/io/File;
        //  1571: invokevirtual   java/io/File.delete:()Z
        //  1574: pop            
        //  1575: aload           13
        //  1577: athrow         
        //  1578: iconst_0       
        //  1579: istore          25
        //  1581: goto            1446
        //  1584: astore          75
        //  1586: aload           75
        //  1588: athrow         
        //  1589: astore          76
        //  1591: aload           76
        //  1593: athrow         
        //  1594: astore          58
        //  1596: aload           58
        //  1598: athrow         
        //  1599: astore          56
        //  1601: aload           56
        //  1603: athrow         
        //  1604: astore          51
        //  1606: aload           51
        //  1608: athrow         
        //  1609: astore          49
        //  1611: aload           49
        //  1613: athrow         
        //  1614: astore          45
        //  1616: aload           45
        //  1618: athrow         
        //  1619: astore          43
        //  1621: aload           43
        //  1623: athrow         
        //  1624: astore          20
        //  1626: aload           20
        //  1628: athrow         
        //  1629: astore          21
        //  1631: aload           21
        //  1633: athrow         
        //  1634: astore          22
        //  1636: aload           22
        //  1638: athrow         
        //  1639: astore          23
        //  1641: aload           23
        //  1643: athrow         
        //  1644: astore          24
        //  1646: aload           24
        //  1648: athrow         
        //  1649: astore          14
        //  1651: aload           14
        //  1653: athrow         
        //  1654: astore          15
        //  1656: aload           15
        //  1658: athrow         
        //  1659: astore          16
        //  1661: aload           16
        //  1663: athrow         
        //  1664: astore          29
        //  1666: aload           29
        //  1668: athrow         
        //  1669: astore          35
        //  1671: aload           35
        //  1673: athrow         
        //  1674: astore          34
        //  1676: aload           34
        //  1678: athrow         
        //  1679: astore          26
        //  1681: aload           26
        //  1683: athrow         
        //  1684: astore          27
        //  1686: aload           27
        //  1688: athrow         
        //  1689: iconst_0       
        //  1690: istore          25
        //  1692: goto            715
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      12     936    1008   Ljava/lang/InterruptedException;
        //  12     45     936    1008   Ljava/lang/InterruptedException;
        //  45     58     928    936    Any
        //  58     83     936    1008   Ljava/lang/InterruptedException;
        //  83     134    1008   1016   Any
        //  134    217    936    1008   Ljava/lang/InterruptedException;
        //  217    233    1016   1032   Ljava/lang/Exception;
        //  217    233    936    1008   Ljava/lang/InterruptedException;
        //  233    253    1032   1037   Ljava/lang/Exception;
        //  233    253    618    1604   Ljava/lang/IllegalStateException;
        //  233    253    1037   1614   Lcom/whatsapp/util/ag;
        //  233    253    1175   1624   Ljava/io/FileNotFoundException;
        //  233    253    1300   1649   Ljava/io/IOException;
        //  233    253    1516   1664   Any
        //  253    292    618    1604   Ljava/lang/IllegalStateException;
        //  253    292    1037   1614   Lcom/whatsapp/util/ag;
        //  253    292    1175   1624   Ljava/io/FileNotFoundException;
        //  253    292    1300   1649   Ljava/io/IOException;
        //  253    292    1516   1664   Any
        //  304    314    618    1604   Ljava/lang/IllegalStateException;
        //  304    314    1037   1614   Lcom/whatsapp/util/ag;
        //  304    314    1175   1624   Ljava/io/FileNotFoundException;
        //  304    314    1300   1649   Ljava/io/IOException;
        //  304    314    1516   1664   Any
        //  323    333    618    1604   Ljava/lang/IllegalStateException;
        //  323    333    1037   1614   Lcom/whatsapp/util/ag;
        //  323    333    1175   1624   Ljava/io/FileNotFoundException;
        //  323    333    1300   1649   Ljava/io/IOException;
        //  323    333    1516   1664   Any
        //  333    350    1135   1140   Ljava/lang/Exception;
        //  333    350    618    1604   Ljava/lang/IllegalStateException;
        //  333    350    1037   1614   Lcom/whatsapp/util/ag;
        //  333    350    1175   1624   Ljava/io/FileNotFoundException;
        //  333    350    1300   1649   Ljava/io/IOException;
        //  333    350    1516   1664   Any
        //  357    364    1140   1145   Ljava/lang/Exception;
        //  357    364    618    1604   Ljava/lang/IllegalStateException;
        //  357    364    1037   1614   Lcom/whatsapp/util/ag;
        //  357    364    1175   1624   Ljava/io/FileNotFoundException;
        //  357    364    1300   1649   Ljava/io/IOException;
        //  357    364    1516   1664   Any
        //  369    379    1145   1150   Ljava/lang/Exception;
        //  369    379    618    1604   Ljava/lang/IllegalStateException;
        //  369    379    1037   1614   Lcom/whatsapp/util/ag;
        //  369    379    1175   1624   Ljava/io/FileNotFoundException;
        //  369    379    1300   1649   Ljava/io/IOException;
        //  369    379    1516   1664   Any
        //  384    401    1150   1155   Ljava/lang/Exception;
        //  384    401    618    1604   Ljava/lang/IllegalStateException;
        //  384    401    1037   1614   Lcom/whatsapp/util/ag;
        //  384    401    1175   1624   Ljava/io/FileNotFoundException;
        //  384    401    1300   1649   Ljava/io/IOException;
        //  384    401    1516   1664   Any
        //  405    439    1155   1160   Ljava/lang/Exception;
        //  405    439    618    1604   Ljava/lang/IllegalStateException;
        //  405    439    1037   1614   Lcom/whatsapp/util/ag;
        //  405    439    1175   1624   Ljava/io/FileNotFoundException;
        //  405    439    1300   1649   Ljava/io/IOException;
        //  405    439    1516   1664   Any
        //  443    450    1160   1165   Ljava/lang/Exception;
        //  443    450    618    1604   Ljava/lang/IllegalStateException;
        //  443    450    1037   1614   Lcom/whatsapp/util/ag;
        //  443    450    1175   1624   Ljava/io/FileNotFoundException;
        //  443    450    1300   1649   Ljava/io/IOException;
        //  443    450    1516   1664   Any
        //  455    473    1165   1170   Ljava/lang/Exception;
        //  455    473    618    1604   Ljava/lang/IllegalStateException;
        //  455    473    1037   1614   Lcom/whatsapp/util/ag;
        //  455    473    1175   1624   Ljava/io/FileNotFoundException;
        //  455    473    1300   1649   Ljava/io/IOException;
        //  455    473    1516   1664   Any
        //  477    505    1170   1175   Ljava/lang/Exception;
        //  477    505    618    1604   Ljava/lang/IllegalStateException;
        //  477    505    1037   1614   Lcom/whatsapp/util/ag;
        //  477    505    1175   1624   Ljava/io/FileNotFoundException;
        //  477    505    1300   1649   Ljava/io/IOException;
        //  477    505    1516   1664   Any
        //  509    516    1275   1280   Ljava/lang/Exception;
        //  509    516    618    1604   Ljava/lang/IllegalStateException;
        //  509    516    1037   1614   Lcom/whatsapp/util/ag;
        //  509    516    1175   1624   Ljava/io/FileNotFoundException;
        //  509    516    1300   1649   Ljava/io/IOException;
        //  509    516    1516   1664   Any
        //  523    530    1280   1285   Ljava/lang/Exception;
        //  523    530    618    1604   Ljava/lang/IllegalStateException;
        //  523    530    1037   1614   Lcom/whatsapp/util/ag;
        //  523    530    1175   1624   Ljava/io/FileNotFoundException;
        //  523    530    1300   1649   Ljava/io/IOException;
        //  523    530    1516   1664   Any
        //  537    545    1285   1290   Ljava/lang/Exception;
        //  537    545    618    1604   Ljava/lang/IllegalStateException;
        //  537    545    1037   1614   Lcom/whatsapp/util/ag;
        //  537    545    1175   1624   Ljava/io/FileNotFoundException;
        //  537    545    1300   1649   Ljava/io/IOException;
        //  537    545    1516   1664   Any
        //  549    565    1290   1295   Ljava/lang/Exception;
        //  549    565    618    1604   Ljava/lang/IllegalStateException;
        //  549    565    1037   1614   Lcom/whatsapp/util/ag;
        //  549    565    1175   1624   Ljava/io/FileNotFoundException;
        //  549    565    1300   1649   Ljava/io/IOException;
        //  549    565    1516   1664   Any
        //  583    601    1295   1300   Ljava/lang/Exception;
        //  583    601    618    1604   Ljava/lang/IllegalStateException;
        //  583    601    1037   1614   Lcom/whatsapp/util/ag;
        //  583    601    1175   1624   Ljava/io/FileNotFoundException;
        //  583    601    1300   1649   Ljava/io/IOException;
        //  583    601    1516   1664   Any
        //  605    613    613    618    Ljava/lang/Exception;
        //  605    613    618    1604   Ljava/lang/IllegalStateException;
        //  605    613    1037   1614   Lcom/whatsapp/util/ag;
        //  605    613    1175   1624   Ljava/io/FileNotFoundException;
        //  605    613    1300   1649   Ljava/io/IOException;
        //  605    613    1516   1664   Any
        //  615    618    618    1604   Ljava/lang/IllegalStateException;
        //  615    618    1037   1614   Lcom/whatsapp/util/ag;
        //  615    618    1175   1624   Ljava/io/FileNotFoundException;
        //  615    618    1300   1649   Ljava/io/IOException;
        //  615    618    1516   1664   Any
        //  620    655    1516   1664   Any
        //  655    668    936    1008   Ljava/lang/InterruptedException;
        //  673    696    1594   1599   Ljava/lang/Exception;
        //  673    696    936    1008   Ljava/lang/InterruptedException;
        //  696    712    1599   1604   Ljava/lang/Exception;
        //  696    712    936    1008   Ljava/lang/InterruptedException;
        //  720    789    1664   1669   Ljava/lang/Exception;
        //  720    789    936    1008   Ljava/lang/InterruptedException;
        //  796    814    936    1008   Ljava/lang/InterruptedException;
        //  819    826    1669   1674   Ljava/lang/Exception;
        //  819    826    936    1008   Ljava/lang/InterruptedException;
        //  830    839    1674   1679   Ljava/lang/Exception;
        //  830    839    936    1008   Ljava/lang/InterruptedException;
        //  839    870    1679   1684   Ljava/lang/Exception;
        //  839    870    936    1008   Ljava/lang/InterruptedException;
        //  874    896    1679   1684   Ljava/lang/Exception;
        //  874    896    936    1008   Ljava/lang/InterruptedException;
        //  901    907    1684   1689   Ljava/lang/Exception;
        //  901    907    936    1008   Ljava/lang/InterruptedException;
        //  907    917    936    1008   Ljava/lang/InterruptedException;
        //  917    922    936    1008   Ljava/lang/InterruptedException;
        //  930    933    928    936    Any
        //  933    936    936    1008   Ljava/lang/InterruptedException;
        //  947    994    1001   1008   Any
        //  998    1000   1001   1008   Any
        //  1003   1005   1001   1008   Any
        //  1010   1013   1008   1016   Any
        //  1013   1016   936    1008   Ljava/lang/InterruptedException;
        //  1018   1029   936    1008   Ljava/lang/InterruptedException;
        //  1034   1037   618    1604   Ljava/lang/IllegalStateException;
        //  1034   1037   1037   1614   Lcom/whatsapp/util/ag;
        //  1034   1037   1175   1624   Ljava/io/FileNotFoundException;
        //  1034   1037   1300   1649   Ljava/io/IOException;
        //  1034   1037   1516   1664   Any
        //  1039   1072   1516   1664   Any
        //  1072   1085   936    1008   Ljava/lang/InterruptedException;
        //  1090   1113   1604   1609   Ljava/lang/Exception;
        //  1090   1113   936    1008   Ljava/lang/InterruptedException;
        //  1113   1129   1609   1614   Ljava/lang/Exception;
        //  1113   1129   936    1008   Ljava/lang/InterruptedException;
        //  1137   1140   1140   1145   Ljava/lang/Exception;
        //  1137   1140   618    1604   Ljava/lang/IllegalStateException;
        //  1137   1140   1037   1614   Lcom/whatsapp/util/ag;
        //  1137   1140   1175   1624   Ljava/io/FileNotFoundException;
        //  1137   1140   1300   1649   Ljava/io/IOException;
        //  1137   1140   1516   1664   Any
        //  1142   1145   1145   1150   Ljava/lang/Exception;
        //  1142   1145   618    1604   Ljava/lang/IllegalStateException;
        //  1142   1145   1037   1614   Lcom/whatsapp/util/ag;
        //  1142   1145   1175   1624   Ljava/io/FileNotFoundException;
        //  1142   1145   1300   1649   Ljava/io/IOException;
        //  1142   1145   1516   1664   Any
        //  1147   1150   1150   1155   Ljava/lang/Exception;
        //  1147   1150   618    1604   Ljava/lang/IllegalStateException;
        //  1147   1150   1037   1614   Lcom/whatsapp/util/ag;
        //  1147   1150   1175   1624   Ljava/io/FileNotFoundException;
        //  1147   1150   1300   1649   Ljava/io/IOException;
        //  1147   1150   1516   1664   Any
        //  1152   1155   1155   1160   Ljava/lang/Exception;
        //  1152   1155   618    1604   Ljava/lang/IllegalStateException;
        //  1152   1155   1037   1614   Lcom/whatsapp/util/ag;
        //  1152   1155   1175   1624   Ljava/io/FileNotFoundException;
        //  1152   1155   1300   1649   Ljava/io/IOException;
        //  1152   1155   1516   1664   Any
        //  1157   1160   1160   1165   Ljava/lang/Exception;
        //  1157   1160   618    1604   Ljava/lang/IllegalStateException;
        //  1157   1160   1037   1614   Lcom/whatsapp/util/ag;
        //  1157   1160   1175   1624   Ljava/io/FileNotFoundException;
        //  1157   1160   1300   1649   Ljava/io/IOException;
        //  1157   1160   1516   1664   Any
        //  1162   1165   1165   1170   Ljava/lang/Exception;
        //  1162   1165   618    1604   Ljava/lang/IllegalStateException;
        //  1162   1165   1037   1614   Lcom/whatsapp/util/ag;
        //  1162   1165   1175   1624   Ljava/io/FileNotFoundException;
        //  1162   1165   1300   1649   Ljava/io/IOException;
        //  1162   1165   1516   1664   Any
        //  1167   1170   1170   1175   Ljava/lang/Exception;
        //  1167   1170   618    1604   Ljava/lang/IllegalStateException;
        //  1167   1170   1037   1614   Lcom/whatsapp/util/ag;
        //  1167   1170   1175   1624   Ljava/io/FileNotFoundException;
        //  1167   1170   1300   1649   Ljava/io/IOException;
        //  1167   1170   1516   1664   Any
        //  1172   1175   618    1604   Ljava/lang/IllegalStateException;
        //  1172   1175   1037   1614   Lcom/whatsapp/util/ag;
        //  1172   1175   1175   1624   Ljava/io/FileNotFoundException;
        //  1172   1175   1300   1649   Ljava/io/IOException;
        //  1172   1175   1516   1664   Any
        //  1177   1212   1516   1664   Any
        //  1212   1225   936    1008   Ljava/lang/InterruptedException;
        //  1230   1253   1614   1619   Ljava/lang/Exception;
        //  1230   1253   936    1008   Ljava/lang/InterruptedException;
        //  1253   1269   1619   1624   Ljava/lang/Exception;
        //  1253   1269   936    1008   Ljava/lang/InterruptedException;
        //  1277   1280   1280   1285   Ljava/lang/Exception;
        //  1277   1280   618    1604   Ljava/lang/IllegalStateException;
        //  1277   1280   1037   1614   Lcom/whatsapp/util/ag;
        //  1277   1280   1175   1624   Ljava/io/FileNotFoundException;
        //  1277   1280   1300   1649   Ljava/io/IOException;
        //  1277   1280   1516   1664   Any
        //  1282   1285   1285   1290   Ljava/lang/Exception;
        //  1282   1285   618    1604   Ljava/lang/IllegalStateException;
        //  1282   1285   1037   1614   Lcom/whatsapp/util/ag;
        //  1282   1285   1175   1624   Ljava/io/FileNotFoundException;
        //  1282   1285   1300   1649   Ljava/io/IOException;
        //  1282   1285   1516   1664   Any
        //  1287   1290   1290   1295   Ljava/lang/Exception;
        //  1287   1290   618    1604   Ljava/lang/IllegalStateException;
        //  1287   1290   1037   1614   Lcom/whatsapp/util/ag;
        //  1287   1290   1175   1624   Ljava/io/FileNotFoundException;
        //  1287   1290   1300   1649   Ljava/io/IOException;
        //  1287   1290   1516   1664   Any
        //  1292   1295   1295   1300   Ljava/lang/Exception;
        //  1292   1295   618    1604   Ljava/lang/IllegalStateException;
        //  1292   1295   1037   1614   Lcom/whatsapp/util/ag;
        //  1292   1295   1175   1624   Ljava/io/FileNotFoundException;
        //  1292   1295   1300   1649   Ljava/io/IOException;
        //  1292   1295   1516   1664   Any
        //  1297   1300   613    618    Ljava/lang/Exception;
        //  1297   1300   618    1604   Ljava/lang/IllegalStateException;
        //  1297   1300   1037   1614   Lcom/whatsapp/util/ag;
        //  1297   1300   1175   1624   Ljava/io/FileNotFoundException;
        //  1297   1300   1300   1649   Ljava/io/IOException;
        //  1297   1300   1516   1664   Any
        //  1302   1341   1624   1629   Ljava/lang/Exception;
        //  1302   1341   1516   1664   Any
        //  1346   1365   1629   1634   Ljava/lang/Exception;
        //  1346   1365   1516   1664   Any
        //  1365   1391   1634   1639   Ljava/lang/Exception;
        //  1365   1391   936    1008   Ljava/lang/InterruptedException;
        //  1396   1406   1639   1644   Ljava/lang/Exception;
        //  1396   1406   936    1008   Ljava/lang/InterruptedException;
        //  1406   1422   1644   1649   Ljava/lang/Exception;
        //  1406   1422   936    1008   Ljava/lang/InterruptedException;
        //  1428   1438   1511   1516   Ljava/lang/Exception;
        //  1428   1438   618    1604   Ljava/lang/IllegalStateException;
        //  1428   1438   1037   1614   Lcom/whatsapp/util/ag;
        //  1428   1438   1175   1624   Ljava/io/FileNotFoundException;
        //  1428   1438   1300   1649   Ljava/io/IOException;
        //  1428   1438   1516   1664   Any
        //  1446   1472   1584   1589   Ljava/lang/Exception;
        //  1446   1472   936    1008   Ljava/lang/InterruptedException;
        //  1477   1487   1589   1594   Ljava/lang/Exception;
        //  1477   1487   936    1008   Ljava/lang/InterruptedException;
        //  1487   1503   1506   1511   Ljava/lang/Exception;
        //  1487   1503   936    1008   Ljava/lang/InterruptedException;
        //  1508   1511   936    1008   Ljava/lang/InterruptedException;
        //  1513   1516   618    1604   Ljava/lang/IllegalStateException;
        //  1513   1516   1037   1614   Lcom/whatsapp/util/ag;
        //  1513   1516   1175   1624   Ljava/io/FileNotFoundException;
        //  1513   1516   1300   1649   Ljava/io/IOException;
        //  1513   1516   1516   1664   Any
        //  1518   1544   1649   1654   Ljava/lang/Exception;
        //  1518   1544   936    1008   Ljava/lang/InterruptedException;
        //  1549   1559   1654   1659   Ljava/lang/Exception;
        //  1549   1559   936    1008   Ljava/lang/InterruptedException;
        //  1559   1575   1659   1664   Ljava/lang/Exception;
        //  1559   1575   936    1008   Ljava/lang/InterruptedException;
        //  1575   1578   936    1008   Ljava/lang/InterruptedException;
        //  1586   1589   1589   1594   Ljava/lang/Exception;
        //  1586   1589   936    1008   Ljava/lang/InterruptedException;
        //  1591   1594   936    1008   Ljava/lang/InterruptedException;
        //  1596   1599   936    1008   Ljava/lang/InterruptedException;
        //  1601   1604   936    1008   Ljava/lang/InterruptedException;
        //  1606   1609   936    1008   Ljava/lang/InterruptedException;
        //  1611   1614   936    1008   Ljava/lang/InterruptedException;
        //  1616   1619   936    1008   Ljava/lang/InterruptedException;
        //  1621   1624   936    1008   Ljava/lang/InterruptedException;
        //  1626   1629   1629   1634   Ljava/lang/Exception;
        //  1626   1629   1516   1664   Any
        //  1631   1634   1516   1664   Any
        //  1636   1639   1639   1644   Ljava/lang/Exception;
        //  1636   1639   936    1008   Ljava/lang/InterruptedException;
        //  1641   1644   936    1008   Ljava/lang/InterruptedException;
        //  1646   1649   936    1008   Ljava/lang/InterruptedException;
        //  1651   1654   1654   1659   Ljava/lang/Exception;
        //  1651   1654   936    1008   Ljava/lang/InterruptedException;
        //  1656   1659   936    1008   Ljava/lang/InterruptedException;
        //  1661   1664   936    1008   Ljava/lang/InterruptedException;
        //  1666   1669   936    1008   Ljava/lang/InterruptedException;
        //  1671   1674   1674   1679   Ljava/lang/Exception;
        //  1671   1674   936    1008   Ljava/lang/InterruptedException;
        //  1676   1679   936    1008   Ljava/lang/InterruptedException;
        //  1681   1684   1684   1689   Ljava/lang/Exception;
        //  1681   1684   936    1008   Ljava/lang/InterruptedException;
        //  1686   1689   936    1008   Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 780, Size: 780
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
}
