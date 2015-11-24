// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import android.annotation.TargetApi;

@TargetApi(16)
class o8 extends od
{
    private static final int[] g;
    private static final String[] z;
    private Thread d;
    private Exception e;
    private CountDownLatch f;
    private int h;
    private boolean i;
    
    static {
        final String[] z2 = new String[18];
        String s = "ux \nqqr*\u0006fgr;\bag~&\u001bq`x;\r;#r'\n{gr;I{vc9\u001c`#q&\u001bybci\u0001up7*\u0001ump,\r4wxi";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0482:
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
                        c2 = '\u0003';
                        break;
                    }
                    case 1: {
                        c2 = '\u0017';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = 'i';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "`\u007f(\u0007zf{d\n{vy=";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "pv$\u0019xf:;\b`f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "ux \nqqr*\u0006fgr;\bag~&\u001bq`x;\r;#";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "ux \nqqr*\u0006fgr;\bag~&\u001bq`x;\r;#";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "bb-\u0000{,z9]u.{(\u001dy";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "bb-\u0000{,z9]u.{(\u001dy";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "ux \nqqr*\u0006fgr;\bag~&\u001bq`x;\r;#";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "ux \nqqr*\u0006fgr;\bag~&\u001bq`x;\r;#r'\n{gr;I{vc9\u001c`#u<\u000frfe:I|ba,Iwkv'\u000eqg9";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "bv*Ddqx/\u0000xf";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "nv1D}mg<\u001d9p~3\f";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "a~=\u001buwr";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    s = "n~$\f";
                    n = 11;
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    array = z2;
                    s = "ux \nqqr*\u0006fgr;\bag~&\u001bq`x;\r;#";
                    n = 12;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "pc(\u001b`#e,\n{qs \u0007s#q(\u0000xfs";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "ux \nqqr*\u0006fgr;\bag~&\u001bq`x;\r";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "ux \nqqr*\u0006fgr;\bag~&\u001bq`x;\r";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "-v(\n";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    break Label_0482;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        g = new int[] { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000 };
    }
    
    public o8(final String s) {
        boolean b = true;
        final int b2 = od.b;
        this.h = (b ? 1 : 0);
        this.a = new File(s + o8.z[17]);
        this.c = 32000;
        if (b2 == 0) {
            return;
        }
        try {
            if (DialogToastActivity.h) {
                b = false;
            }
            DialogToastActivity.h = b;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/od.b:I
        //     3: istore_1       
        //     4: sipush          22050
        //     7: bipush          16
        //     9: iconst_2       
        //    10: invokestatic    android/media/AudioRecord.getMinBufferSize:(III)I
        //    13: istore_2       
        //    14: iconst_1       
        //    15: istore_3       
        //    16: iload_3        
        //    17: iload_2        
        //    18: if_icmpge       29
        //    21: iload_3        
        //    22: iconst_2       
        //    23: imul           
        //    24: istore_3       
        //    25: iload_1        
        //    26: ifeq            16
        //    29: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //    32: iconst_5       
        //    33: aaload         
        //    34: invokestatic    android/media/MediaCodec.createEncoderByType:(Ljava/lang/String;)Landroid/media/MediaCodec;
        //    37: astore          4
        //    39: new             Landroid/media/MediaFormat;
        //    42: dup            
        //    43: invokespecial   android/media/MediaFormat.<init>:()V
        //    46: astore          5
        //    48: aload           5
        //    50: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //    53: bipush          12
        //    55: aaload         
        //    56: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //    59: bipush          6
        //    61: aaload         
        //    62: invokevirtual   android/media/MediaFormat.setString:(Ljava/lang/String;Ljava/lang/String;)V
        //    65: aload           5
        //    67: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //    70: iconst_1       
        //    71: aaload         
        //    72: iconst_1       
        //    73: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //    76: aload           5
        //    78: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //    81: iconst_2       
        //    82: aaload         
        //    83: sipush          22050
        //    86: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //    89: aload           5
        //    91: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //    94: bipush          11
        //    96: aaload         
        //    97: sipush          32000
        //   100: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //   103: aload           5
        //   105: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //   108: bipush          9
        //   110: aaload         
        //   111: iconst_2       
        //   112: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //   115: aload           5
        //   117: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //   120: bipush          10
        //   122: aaload         
        //   123: iload_3        
        //   124: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //   127: aload           4
        //   129: aload           5
        //   131: aconst_null    
        //   132: aconst_null    
        //   133: iconst_1       
        //   134: invokevirtual   android/media/MediaCodec.configure:(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
        //   137: aload           4
        //   139: invokevirtual   android/media/MediaCodec.start:()V
        //   142: aload           4
        //   144: invokevirtual   android/media/MediaCodec.getInputBuffers:()[Ljava/nio/ByteBuffer;
        //   147: astore          7
        //   149: aload           4
        //   151: invokevirtual   android/media/MediaCodec.getOutputBuffers:()[Ljava/nio/ByteBuffer;
        //   154: astore          8
        //   156: new             Landroid/media/MediaCodec$BufferInfo;
        //   159: dup            
        //   160: invokespecial   android/media/MediaCodec$BufferInfo.<init>:()V
        //   163: astore          9
        //   165: bipush          7
        //   167: newarray        B
        //   169: astore          10
        //   171: aload           10
        //   173: iconst_0       
        //   174: iconst_m1      
        //   175: bastore        
        //   176: aload           10
        //   178: iconst_1       
        //   179: bipush          -15
        //   181: bastore        
        //   182: sipush          22050
        //   185: invokestatic    com/whatsapp/o8.b:(I)I
        //   188: i2b            
        //   189: istore          11
        //   191: aload           10
        //   193: iconst_2       
        //   194: bipush          64
        //   196: bastore        
        //   197: aload           10
        //   199: iconst_2       
        //   200: aload           10
        //   202: iconst_2       
        //   203: baload         
        //   204: iload           11
        //   206: iconst_2       
        //   207: ishl           
        //   208: ior            
        //   209: i2b            
        //   210: bastore        
        //   211: aload           10
        //   213: iconst_2       
        //   214: iconst_0       
        //   215: aload           10
        //   217: iconst_2       
        //   218: baload         
        //   219: ior            
        //   220: i2b            
        //   221: bastore        
        //   222: aload           10
        //   224: iconst_3       
        //   225: iconst_0       
        //   226: bastore        
        //   227: aload           10
        //   229: iconst_4       
        //   230: iconst_0       
        //   231: bastore        
        //   232: aload           10
        //   234: iconst_5       
        //   235: iconst_0       
        //   236: bastore        
        //   237: aload           10
        //   239: bipush          6
        //   241: bipush          -4
        //   243: bastore        
        //   244: iload_3        
        //   245: newarray        B
        //   247: astore          12
        //   249: new             Landroid/media/AudioRecord;
        //   252: dup            
        //   253: aload_0        
        //   254: getfield        com/whatsapp/o8.h:I
        //   257: sipush          22050
        //   260: bipush          16
        //   262: iconst_2       
        //   263: iload_3        
        //   264: invokespecial   android/media/AudioRecord.<init>:(IIIII)V
        //   267: astore          13
        //   269: aload           13
        //   271: invokevirtual   android/media/AudioRecord.startRecording:()V
        //   274: aload_0        
        //   275: getfield        com/whatsapp/o8.f:Ljava/util/concurrent/CountDownLatch;
        //   278: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   281: aconst_null    
        //   282: astore          15
        //   284: new             Ljava/io/FileOutputStream;
        //   287: dup            
        //   288: aload_0        
        //   289: invokevirtual   com/whatsapp/o8.a:()Ljava/io/File;
        //   292: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   295: astore          16
        //   297: aload           16
        //   299: invokevirtual   java/io/FileOutputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //   302: astore          15
        //   304: aload           8
        //   306: astore          22
        //   308: aload_0        
        //   309: getfield        com/whatsapp/o8.i:Z
        //   312: ifne            775
        //   315: iconst_1       
        //   316: istore          23
        //   318: aload           13
        //   320: aload           12
        //   322: iconst_0       
        //   323: iload_3        
        //   324: invokevirtual   android/media/AudioRecord.read:([BII)I
        //   327: istore          24
        //   329: aload           4
        //   331: ldc2_w          1000000
        //   334: invokevirtual   android/media/MediaCodec.dequeueInputBuffer:(J)I
        //   337: istore          25
        //   339: iload           25
        //   341: iflt            386
        //   344: aload           7
        //   346: iload           25
        //   348: aaload         
        //   349: astore          26
        //   351: aload           26
        //   353: invokevirtual   java/nio/ByteBuffer.clear:()Ljava/nio/Buffer;
        //   356: pop            
        //   357: aload           26
        //   359: aload           12
        //   361: invokevirtual   java/nio/ByteBuffer.put:([B)Ljava/nio/ByteBuffer;
        //   364: pop            
        //   365: iload           23
        //   367: ifeq            833
        //   370: iconst_4       
        //   371: istore          30
        //   373: aload           4
        //   375: iload           25
        //   377: iconst_0       
        //   378: iload           24
        //   380: lconst_0       
        //   381: iload           30
        //   383: invokevirtual   android/media/MediaCodec.queueInputBuffer:(IIIJI)V
        //   386: aload           4
        //   388: aload           9
        //   390: lconst_0       
        //   391: invokevirtual   android/media/MediaCodec.dequeueOutputBuffer:(Landroid/media/MediaCodec$BufferInfo;J)I
        //   394: istore          31
        //   396: aload           22
        //   398: astore          32
        //   400: iload           31
        //   402: istore          33
        //   404: iload           33
        //   406: iconst_m1      
        //   407: if_icmpeq       658
        //   410: iload           33
        //   412: iflt            569
        //   415: aload           32
        //   417: iload           33
        //   419: aaload         
        //   420: astore          38
        //   422: aload           38
        //   424: aload           9
        //   426: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //   429: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   432: pop            
        //   433: aload           38
        //   435: aload           9
        //   437: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //   440: aload           9
        //   442: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   445: iadd           
        //   446: invokevirtual   java/nio/ByteBuffer.limit:(I)Ljava/nio/Buffer;
        //   449: pop            
        //   450: iconst_2       
        //   451: aload           9
        //   453: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   456: iand           
        //   457: iconst_2       
        //   458: if_icmpeq       551
        //   461: bipush          7
        //   463: aload           9
        //   465: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   468: aload           9
        //   470: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //   473: isub           
        //   474: iadd           
        //   475: istore          47
        //   477: iload           47
        //   479: bipush          7
        //   481: iand           
        //   482: istore          48
        //   484: sipush          255
        //   487: iload           47
        //   489: iconst_3       
        //   490: ishr           
        //   491: iand           
        //   492: istore          49
        //   494: aload           10
        //   496: iconst_3       
        //   497: bipush          64
        //   499: iconst_3       
        //   500: iload           47
        //   502: bipush          11
        //   504: ishr           
        //   505: iand           
        //   506: ior            
        //   507: i2b            
        //   508: bastore        
        //   509: aload           10
        //   511: iconst_4       
        //   512: iload           49
        //   514: i2b            
        //   515: bastore        
        //   516: aload           10
        //   518: iconst_5       
        //   519: bipush          31
        //   521: iload           48
        //   523: iconst_5       
        //   524: ishl           
        //   525: ior            
        //   526: i2b            
        //   527: bastore        
        //   528: aload           15
        //   530: aload           10
        //   532: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //   535: invokeinterface java/nio/channels/WritableByteChannel.write:(Ljava/nio/ByteBuffer;)I
        //   540: pop            
        //   541: aload           15
        //   543: aload           38
        //   545: invokeinterface java/nio/channels/WritableByteChannel.write:(Ljava/nio/ByteBuffer;)I
        //   550: pop            
        //   551: aload           38
        //   553: invokevirtual   java/nio/ByteBuffer.clear:()Ljava/nio/Buffer;
        //   556: pop            
        //   557: aload           4
        //   559: iload           33
        //   561: iconst_0       
        //   562: invokevirtual   android/media/MediaCodec.releaseOutputBuffer:(IZ)V
        //   565: iload_1        
        //   566: ifeq            640
        //   569: iload           33
        //   571: bipush          -3
        //   573: if_icmpne       600
        //   576: aload           4
        //   578: invokevirtual   android/media/MediaCodec.getOutputBuffers:()[Ljava/nio/ByteBuffer;
        //   581: astore          45
        //   583: aload           45
        //   585: astore          32
        //   587: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //   590: bipush          8
        //   592: aaload         
        //   593: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   596: iload_1        
        //   597: ifeq            640
        //   600: iload           33
        //   602: bipush          -2
        //   604: if_icmpne       640
        //   607: aload           4
        //   609: invokevirtual   android/media/MediaCodec.getOutputFormat:()Landroid/media/MediaFormat;
        //   612: astore          44
        //   614: new             Ljava/lang/StringBuilder;
        //   617: dup            
        //   618: invokespecial   java/lang/StringBuilder.<init>:()V
        //   621: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //   624: iconst_0       
        //   625: aaload         
        //   626: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   629: aload           44
        //   631: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   634: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   637: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   640: aload           4
        //   642: aload           9
        //   644: lconst_0       
        //   645: invokevirtual   android/media/MediaCodec.dequeueOutputBuffer:(Landroid/media/MediaCodec$BufferInfo;J)I
        //   648: istore          43
        //   650: iload           43
        //   652: istore          33
        //   654: iload_1        
        //   655: ifeq            404
        //   658: iload           23
        //   660: ifeq            667
        //   663: iload_1        
        //   664: ifeq            671
        //   667: iload_1        
        //   668: ifeq            942
        //   671: aload           4
        //   673: invokevirtual   android/media/MediaCodec.stop:()V
        //   676: aload           4
        //   678: invokevirtual   android/media/MediaCodec.release:()V
        //   681: aload           16
        //   683: ifnull          693
        //   686: aload           15
        //   688: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   693: aload           16
        //   695: ifnull          703
        //   698: aload           16
        //   700: invokevirtual   java/io/FileOutputStream.close:()V
        //   703: aload           13
        //   705: invokevirtual   android/media/AudioRecord.stop:()V
        //   708: aload           13
        //   710: invokevirtual   android/media/AudioRecord.release:()V
        //   713: return         
        //   714: astore          6
        //   716: aload           6
        //   718: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   721: aload_0        
        //   722: aload           6
        //   724: putfield        com/whatsapp/o8.e:Ljava/lang/Exception;
        //   727: aload           4
        //   729: invokevirtual   android/media/MediaCodec.release:()V
        //   732: aload_0        
        //   733: getfield        com/whatsapp/o8.f:Ljava/util/concurrent/CountDownLatch;
        //   736: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   739: aload           6
        //   741: athrow         
        //   742: astore          14
        //   744: aload           14
        //   746: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   749: aload_0        
        //   750: aload           14
        //   752: putfield        com/whatsapp/o8.e:Ljava/lang/Exception;
        //   755: aload           4
        //   757: invokevirtual   android/media/MediaCodec.stop:()V
        //   760: aload           4
        //   762: invokevirtual   android/media/MediaCodec.release:()V
        //   765: aload_0        
        //   766: getfield        com/whatsapp/o8.f:Ljava/util/concurrent/CountDownLatch;
        //   769: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   772: aload           14
        //   774: athrow         
        //   775: iconst_0       
        //   776: istore          23
        //   778: goto            318
        //   781: astore          27
        //   783: aload           27
        //   785: athrow         
        //   786: astore          17
        //   788: aload           4
        //   790: invokevirtual   android/media/MediaCodec.stop:()V
        //   793: aload           4
        //   795: invokevirtual   android/media/MediaCodec.release:()V
        //   798: aload           16
        //   800: ifnull          810
        //   803: aload           15
        //   805: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   810: aload           16
        //   812: ifnull          820
        //   815: aload           16
        //   817: invokevirtual   java/io/FileOutputStream.close:()V
        //   820: aload           13
        //   822: invokevirtual   android/media/AudioRecord.stop:()V
        //   825: aload           13
        //   827: invokevirtual   android/media/AudioRecord.release:()V
        //   830: aload           17
        //   832: athrow         
        //   833: iconst_0       
        //   834: istore          30
        //   836: goto            373
        //   839: astore          41
        //   841: aload           41
        //   843: athrow         
        //   844: astore          46
        //   846: aload           46
        //   848: athrow         
        //   849: astore          34
        //   851: aload           34
        //   853: athrow         
        //   854: astore          37
        //   856: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //   859: iconst_4       
        //   860: aaload         
        //   861: aload           37
        //   863: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   866: goto            693
        //   869: astore          36
        //   871: aload           36
        //   873: athrow         
        //   874: astore          35
        //   876: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //   879: iconst_3       
        //   880: aaload         
        //   881: aload           35
        //   883: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   886: goto            703
        //   889: astore          18
        //   891: aload           18
        //   893: athrow         
        //   894: astore          21
        //   896: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //   899: bipush          13
        //   901: aaload         
        //   902: aload           21
        //   904: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   907: goto            810
        //   910: astore          20
        //   912: aload           20
        //   914: athrow         
        //   915: astore          19
        //   917: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //   920: bipush          7
        //   922: aaload         
        //   923: aload           19
        //   925: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   928: goto            820
        //   931: astore          17
        //   933: aconst_null    
        //   934: astore          15
        //   936: aconst_null    
        //   937: astore          16
        //   939: goto            788
        //   942: aload           32
        //   944: astore          22
        //   946: goto            308
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  127    137    714    742    Ljava/lang/IllegalStateException;
        //  269    274    742    775    Ljava/lang/IllegalStateException;
        //  284    297    931    942    Any
        //  297    304    786    788    Any
        //  308    315    786    788    Any
        //  318    339    786    788    Any
        //  344    351    786    788    Any
        //  351    365    781    786    Ljava/lang/IllegalStateException;
        //  351    365    786    788    Any
        //  373    386    786    788    Any
        //  386    396    786    788    Any
        //  415    477    786    788    Any
        //  494    551    786    788    Any
        //  551    565    839    844    Ljava/lang/IllegalStateException;
        //  551    565    786    788    Any
        //  576    583    786    788    Any
        //  587    596    844    849    Ljava/lang/IllegalStateException;
        //  587    596    786    788    Any
        //  607    640    786    788    Any
        //  640    650    786    788    Any
        //  671    681    849    854    Ljava/lang/IllegalStateException;
        //  686    693    854    869    Ljava/io/IOException;
        //  686    693    849    854    Ljava/lang/IllegalStateException;
        //  698    703    874    889    Ljava/io/IOException;
        //  698    703    869    874    Ljava/lang/IllegalStateException;
        //  783    786    786    788    Any
        //  788    798    889    894    Ljava/lang/IllegalStateException;
        //  803    810    894    910    Ljava/io/IOException;
        //  803    810    889    894    Ljava/lang/IllegalStateException;
        //  815    820    915    931    Ljava/io/IOException;
        //  815    820    910    915    Ljava/lang/IllegalStateException;
        //  841    844    786    788    Any
        //  846    849    786    788    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 480, Size: 480
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
    
    static void a(final o8 o8) {
        o8.a();
    }
    
    static boolean a(final o8 o8, final boolean i) {
        return o8.i = i;
    }
    
    private static int b(final int n) {
        final int b = od.b;
        int i = 0;
        while (i < o8.g.length) {
            try {
                if (n == o8.g[i]) {
                    return i;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            ++i;
            if (b != 0) {
                break;
            }
        }
        return 0;
    }
    
    public void a(final int h) {
        this.h = h;
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public void d() {
        try {
            if (this.d != null) {
                throw new IllegalStateException();
            }
        }
        catch (InterruptedException ex) {
            throw ex;
        }
        this.i = true;
        this.d = new Thread(new fn(this));
        this.f = new CountDownLatch(1);
        this.d.start();
        try {
            this.f.await();
            if (this.e != null) {
                throw new RuntimeException(o8.z[14], this.e);
            }
        }
        catch (InterruptedException ex2) {
            Log.b(o8.z[15], ex2);
        }
    }
    
    @Override
    public void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iconst_0       
        //     2: putfield        com/whatsapp/o8.i:Z
        //     5: aload_0        
        //     6: getfield        com/whatsapp/o8.d:Ljava/lang/Thread;
        //     9: astore_2       
        //    10: aload_2        
        //    11: ifnull          26
        //    14: aload_0        
        //    15: getfield        com/whatsapp/o8.d:Ljava/lang/Thread;
        //    18: invokevirtual   java/lang/Thread.join:()V
        //    21: aload_0        
        //    22: aconst_null    
        //    23: putfield        com/whatsapp/o8.d:Ljava/lang/Thread;
        //    26: return         
        //    27: astore_1       
        //    28: aload_1        
        //    29: athrow         
        //    30: astore_3       
        //    31: getstatic       com/whatsapp/o8.z:[Ljava/lang/String;
        //    34: bipush          16
        //    36: aaload         
        //    37: aload_3        
        //    38: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    41: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      10     27     30     Ljava/lang/IllegalStateException;
        //  14     26     30     42     Ljava/lang/InterruptedException;
        //  14     26     27     30     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    @Override
    public void f() {
    }
}
