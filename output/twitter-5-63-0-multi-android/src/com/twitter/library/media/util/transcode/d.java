// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util.transcode;

import java.io.IOException;
import java.io.File;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaMuxer;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.util.Log;
import com.twitter.internal.android.util.Size;
import android.annotation.TargetApi;

@TargetApi(18)
public class d
{
    private static final boolean a;
    private boolean b;
    private final String c;
    private final String d;
    private long e;
    private long f;
    private Size g;
    private int h;
    private int i;
    private int j;
    private Size k;
    private long l;
    private Size m;
    private long n;
    
    static {
        a = Log.isLoggable("TextureTranscoder", 3);
    }
    
    public d(final String c, final String d) {
        this.e = 0L;
        this.f = Long.MAX_VALUE;
        this.h = 3000000;
        this.i = 60;
        this.j = 1;
        this.c = c;
        this.d = d;
    }
    
    private static int a(final MediaExtractor mediaExtractor, final String s) {
        for (int trackCount = mediaExtractor.getTrackCount(), i = 0; i < trackCount; ++i) {
            final String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (string != null && string.startsWith(s)) {
                return i;
            }
        }
        return -1;
    }
    
    private void a(final int n, final MediaExtractor mediaExtractor, final MediaCodec mediaCodec, final b b, final a a, final MediaCodec mediaCodec2, final MediaMuxer mediaMuxer) {
        final h a2 = new h(mediaExtractor, mediaCodec).a(this.f);
        final f f = (f)new f(mediaCodec, b, a, mediaCodec2).a(n).a(this.e).b(this.j).d(200);
        final g a3 = new g(mediaCodec2, mediaMuxer).a(this.e);
        mediaExtractor.seekTo(this.e, 0);
        while (!a3.c() && !this.b) {
            a2.a();
            do {
                a3.a();
            } while (f.a() > 0);
        }
        mediaMuxer.stop();
        mediaMuxer.release();
        this.n = a3.b().presentationTimeUs;
    }
    
    private void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: aconst_null    
        //     3: astore_3       
        //     4: aconst_null    
        //     5: astore          4
        //     7: aconst_null    
        //     8: astore          5
        //    10: new             Landroid/media/MediaExtractor;
        //    13: dup            
        //    14: invokespecial   android/media/MediaExtractor.<init>:()V
        //    17: astore          6
        //    19: aload           6
        //    21: aload_0        
        //    22: getfield        com/twitter/library/media/util/transcode/d.c:Ljava/lang/String;
        //    25: invokevirtual   android/media/MediaExtractor.setDataSource:(Ljava/lang/String;)V
        //    28: aload           6
        //    30: ldc             "video/"
        //    32: invokestatic    com/twitter/library/media/util/transcode/d.a:(Landroid/media/MediaExtractor;Ljava/lang/String;)I
        //    35: istore          16
        //    37: aconst_null    
        //    38: astore          5
        //    40: aconst_null    
        //    41: astore_2       
        //    42: aconst_null    
        //    43: astore_3       
        //    44: aconst_null    
        //    45: astore          4
        //    47: iload           16
        //    49: ifge            182
        //    52: new             Lcom/twitter/library/media/util/transcode/TranscoderException;
        //    55: dup            
        //    56: iconst_1       
        //    57: new             Ljava/lang/StringBuilder;
        //    60: dup            
        //    61: invokespecial   java/lang/StringBuilder.<init>:()V
        //    64: ldc             "No video track found in "
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: aload_0        
        //    70: getfield        com/twitter/library/media/util/transcode/d.c:Ljava/lang/String;
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    76: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    79: aconst_null    
        //    80: invokespecial   com/twitter/library/media/util/transcode/TranscoderException.<init>:(ZLjava/lang/String;Ljava/lang/Throwable;)V
        //    83: athrow         
        //    84: astore          10
        //    86: aconst_null    
        //    87: astore          12
        //    89: aconst_null    
        //    90: astore          15
        //    92: aload           6
        //    94: astore          11
        //    96: aconst_null    
        //    97: astore          14
        //    99: aconst_null    
        //   100: astore          13
        //   102: aload           10
        //   104: athrow         
        //   105: astore          7
        //   107: aload           13
        //   109: astore          4
        //   111: aload           14
        //   113: astore_3       
        //   114: aload           11
        //   116: astore          6
        //   118: aload           15
        //   120: astore_2       
        //   121: aload           12
        //   123: astore          5
        //   125: aload           4
        //   127: ifnull          135
        //   130: aload           4
        //   132: invokevirtual   com/twitter/library/media/util/transcode/b.a:()V
        //   135: aload           5
        //   137: ifnull          145
        //   140: aload           5
        //   142: invokevirtual   com/twitter/library/media/util/transcode/a.a:()V
        //   145: aload_3        
        //   146: ifnull          157
        //   149: aload_3        
        //   150: invokevirtual   android/media/MediaCodec.stop:()V
        //   153: aload_3        
        //   154: invokevirtual   android/media/MediaCodec.release:()V
        //   157: aload_2        
        //   158: ifnull          169
        //   161: aload_2        
        //   162: invokevirtual   android/media/MediaCodec.stop:()V
        //   165: aload_2        
        //   166: invokevirtual   android/media/MediaCodec.release:()V
        //   169: aload           6
        //   171: ifnull          179
        //   174: aload           6
        //   176: invokevirtual   android/media/MediaExtractor.release:()V
        //   179: aload           7
        //   181: athrow         
        //   182: aload           6
        //   184: iload           16
        //   186: invokevirtual   android/media/MediaExtractor.selectTrack:(I)V
        //   189: aload           6
        //   191: iload           16
        //   193: invokevirtual   android/media/MediaExtractor.getTrackFormat:(I)Landroid/media/MediaFormat;
        //   196: astore          17
        //   198: getstatic       com/twitter/library/media/util/transcode/d.a:Z
        //   201: ifeq            230
        //   204: ldc             "TextureTranscoder"
        //   206: new             Ljava/lang/StringBuilder;
        //   209: dup            
        //   210: invokespecial   java/lang/StringBuilder.<init>:()V
        //   213: ldc             "Input format "
        //   215: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   218: aload           17
        //   220: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   223: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   226: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   229: pop            
        //   230: aload           17
        //   232: ldc             "rotation-degrees"
        //   234: invokevirtual   android/media/MediaFormat.containsKey:(Ljava/lang/String;)Z
        //   237: ifeq            248
        //   240: aload           17
        //   242: ldc             "rotation-degrees"
        //   244: iconst_0       
        //   245: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //   248: aload           17
        //   250: ldc             "width"
        //   252: invokevirtual   android/media/MediaFormat.getInteger:(Ljava/lang/String;)I
        //   255: istore          18
        //   257: aload           17
        //   259: ldc             "height"
        //   261: invokevirtual   android/media/MediaFormat.getInteger:(Ljava/lang/String;)I
        //   264: istore          19
        //   266: aload_0        
        //   267: aload           17
        //   269: ldc             "durationUs"
        //   271: invokevirtual   android/media/MediaFormat.getLong:(Ljava/lang/String;)J
        //   274: putfield        com/twitter/library/media/util/transcode/d.l:J
        //   277: aload           17
        //   279: ldc             "frame-rate"
        //   281: invokevirtual   android/media/MediaFormat.containsKey:(Ljava/lang/String;)Z
        //   284: istore          20
        //   286: iload           20
        //   288: ifeq            1442
        //   291: aload           17
        //   293: ldc             "frame-rate"
        //   295: invokevirtual   android/media/MediaFormat.getFloat:(Ljava/lang/String;)F
        //   298: fstore          46
        //   300: fload           46
        //   302: f2i            
        //   303: istore          21
        //   305: iload           21
        //   307: ifle            1449
        //   310: iconst_1       
        //   311: istore          22
        //   313: iload           22
        //   315: invokestatic    com/twitter/util/d.b:(Z)V
        //   318: aload_0        
        //   319: iconst_m1      
        //   320: iload           21
        //   322: aload_0        
        //   323: getfield        com/twitter/library/media/util/transcode/d.i:I
        //   326: iadd           
        //   327: iadd           
        //   328: aload_0        
        //   329: getfield        com/twitter/library/media/util/transcode/d.i:I
        //   332: idiv           
        //   333: putfield        com/twitter/library/media/util/transcode/d.j:I
        //   336: aload_0        
        //   337: getfield        com/twitter/library/media/util/transcode/d.f:J
        //   340: aload_0        
        //   341: getfield        com/twitter/library/media/util/transcode/d.e:J
        //   344: lsub           
        //   345: lconst_0       
        //   346: lcmp           
        //   347: istore          23
        //   349: aconst_null    
        //   350: astore          5
        //   352: aconst_null    
        //   353: astore_2       
        //   354: aconst_null    
        //   355: astore_3       
        //   356: aconst_null    
        //   357: astore          4
        //   359: iload           23
        //   361: ifgt            388
        //   364: new             Ljava/lang/IllegalArgumentException;
        //   367: dup            
        //   368: ldc             "Duration can't be 0, end == start"
        //   370: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   373: athrow         
        //   374: astore          45
        //   376: aload           17
        //   378: ldc             "frame-rate"
        //   380: invokevirtual   android/media/MediaFormat.getInteger:(Ljava/lang/String;)I
        //   383: istore          21
        //   385: goto            305
        //   388: new             Landroid/media/MediaMetadataRetriever;
        //   391: dup            
        //   392: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //   395: astore          24
        //   397: aload           24
        //   399: aload_0        
        //   400: getfield        com/twitter/library/media/util/transcode/d.c:Ljava/lang/String;
        //   403: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Ljava/lang/String;)V
        //   406: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   409: bipush          17
        //   411: if_icmplt       895
        //   414: aload           24
        //   416: bipush          24
        //   418: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   421: astore          43
        //   423: aconst_null    
        //   424: astore          5
        //   426: aconst_null    
        //   427: astore_2       
        //   428: aconst_null    
        //   429: astore_3       
        //   430: aconst_null    
        //   431: astore          4
        //   433: iconst_0       
        //   434: istore          44
        //   436: aload           43
        //   438: ifnull          1455
        //   441: aload           43
        //   443: invokestatic    java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        //   446: invokevirtual   java/lang/Integer.intValue:()I
        //   449: istore          44
        //   451: goto            1455
        //   454: aload           24
        //   456: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   459: aload_0        
        //   460: iload           18
        //   462: iload           19
        //   464: invokestatic    com/twitter/internal/android/util/Size.a:(II)Lcom/twitter/internal/android/util/Size;
        //   467: putfield        com/twitter/library/media/util/transcode/d.k:Lcom/twitter/internal/android/util/Size;
        //   470: aload_0        
        //   471: getfield        com/twitter/library/media/util/transcode/d.g:Lcom/twitter/internal/android/util/Size;
        //   474: ifnull          1010
        //   477: aload_0        
        //   478: getfield        com/twitter/library/media/util/transcode/d.g:Lcom/twitter/internal/android/util/Size;
        //   481: invokevirtual   com/twitter/internal/android/util/Size.a:()I
        //   484: istore          35
        //   486: aload_0        
        //   487: getfield        com/twitter/library/media/util/transcode/d.g:Lcom/twitter/internal/android/util/Size;
        //   490: invokevirtual   com/twitter/internal/android/util/Size.b:()I
        //   493: istore          36
        //   495: iload           35
        //   497: iload           36
        //   499: if_icmple       977
        //   502: iconst_1       
        //   503: istore          37
        //   505: goto            1462
        //   508: iload           38
        //   510: iload           37
        //   512: if_icmpne       989
        //   515: aload_0        
        //   516: getfield        com/twitter/library/media/util/transcode/d.g:Lcom/twitter/internal/android/util/Size;
        //   519: astore          39
        //   521: aload_0        
        //   522: getfield        com/twitter/library/media/util/transcode/d.k:Lcom/twitter/internal/android/util/Size;
        //   525: aload           39
        //   527: invokevirtual   com/twitter/internal/android/util/Size.c:(Lcom/twitter/internal/android/util/Size;)Lcom/twitter/internal/android/util/Size;
        //   530: invokevirtual   com/twitter/internal/android/util/Size.a:()I
        //   533: i2f            
        //   534: aload_0        
        //   535: getfield        com/twitter/library/media/util/transcode/d.k:Lcom/twitter/internal/android/util/Size;
        //   538: invokevirtual   com/twitter/internal/android/util/Size.a:()I
        //   541: i2f            
        //   542: fdiv           
        //   543: fstore          40
        //   545: fload           40
        //   547: fconst_1       
        //   548: fcmpg          
        //   549: istore          41
        //   551: aconst_null    
        //   552: astore          5
        //   554: aconst_null    
        //   555: astore_2       
        //   556: aconst_null    
        //   557: astore_3       
        //   558: aconst_null    
        //   559: astore          4
        //   561: iload           41
        //   563: ifge            1001
        //   566: iload           18
        //   568: fload           40
        //   570: invokestatic    com/twitter/media/MediaUtils.a:(IF)I
        //   573: iload           19
        //   575: fload           40
        //   577: invokestatic    com/twitter/media/MediaUtils.a:(IF)I
        //   580: invokestatic    com/twitter/internal/android/util/Size.a:(II)Lcom/twitter/internal/android/util/Size;
        //   583: astore          42
        //   585: aload_0        
        //   586: aload           42
        //   588: putfield        com/twitter/library/media/util/transcode/d.m:Lcom/twitter/internal/android/util/Size;
        //   591: goto            1475
        //   594: ldc_w           "video/avc"
        //   597: aload_0        
        //   598: getfield        com/twitter/library/media/util/transcode/d.m:Lcom/twitter/internal/android/util/Size;
        //   601: invokevirtual   com/twitter/internal/android/util/Size.b:()I
        //   604: aload_0        
        //   605: getfield        com/twitter/library/media/util/transcode/d.m:Lcom/twitter/internal/android/util/Size;
        //   608: invokevirtual   com/twitter/internal/android/util/Size.a:()I
        //   611: invokestatic    android/media/MediaFormat.createVideoFormat:(Ljava/lang/String;II)Landroid/media/MediaFormat;
        //   614: astore          27
        //   616: aload           27
        //   618: ldc_w           "color-format"
        //   621: ldc_w           2130708361
        //   624: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //   627: aload           27
        //   629: ldc_w           "bitrate"
        //   632: aload_0        
        //   633: getfield        com/twitter/library/media/util/transcode/d.h:I
        //   636: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //   639: aload           27
        //   641: ldc             "frame-rate"
        //   643: iload           21
        //   645: aload_0        
        //   646: getfield        com/twitter/library/media/util/transcode/d.j:I
        //   649: idiv           
        //   650: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //   653: aload           27
        //   655: ldc_w           "i-frame-interval"
        //   658: iconst_5       
        //   659: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //   662: getstatic       com/twitter/library/media/util/transcode/d.a:Z
        //   665: ifeq            695
        //   668: ldc             "TextureTranscoder"
        //   670: new             Ljava/lang/StringBuilder;
        //   673: dup            
        //   674: invokespecial   java/lang/StringBuilder.<init>:()V
        //   677: ldc_w           "Output format "
        //   680: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   683: aload           27
        //   685: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   688: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   691: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   694: pop            
        //   695: ldc_w           "video/avc"
        //   698: invokestatic    android/media/MediaCodec.createEncoderByType:(Ljava/lang/String;)Landroid/media/MediaCodec;
        //   701: astore          28
        //   703: aload           28
        //   705: astore_3       
        //   706: aload_3        
        //   707: aload           27
        //   709: aconst_null    
        //   710: aconst_null    
        //   711: iconst_1       
        //   712: invokevirtual   android/media/MediaCodec.configure:(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
        //   715: new             Lcom/twitter/library/media/util/transcode/a;
        //   718: dup            
        //   719: aload_3        
        //   720: invokevirtual   android/media/MediaCodec.createInputSurface:()Landroid/view/Surface;
        //   723: invokespecial   com/twitter/library/media/util/transcode/a.<init>:(Landroid/view/Surface;)V
        //   726: astore          29
        //   728: aload           29
        //   730: invokevirtual   com/twitter/library/media/util/transcode/a.b:()V
        //   733: aload_3        
        //   734: invokevirtual   android/media/MediaCodec.start:()V
        //   737: aload           17
        //   739: ldc             "mime"
        //   741: invokevirtual   android/media/MediaFormat.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   744: invokestatic    android/media/MediaCodec.createDecoderByType:(Ljava/lang/String;)Landroid/media/MediaCodec;
        //   747: astore          30
        //   749: new             Lcom/twitter/library/media/util/transcode/b;
        //   752: dup            
        //   753: invokespecial   com/twitter/library/media/util/transcode/b.<init>:()V
        //   756: astore          31
        //   758: aload           31
        //   760: ldc_w           "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
        //   763: invokevirtual   com/twitter/library/media/util/transcode/b.a:(Ljava/lang/String;)V
        //   766: aload           17
        //   768: ldc             "width"
        //   770: aload_0        
        //   771: getfield        com/twitter/library/media/util/transcode/d.m:Lcom/twitter/internal/android/util/Size;
        //   774: invokevirtual   com/twitter/internal/android/util/Size.a:()I
        //   777: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //   780: aload           17
        //   782: ldc             "height"
        //   784: aload_0        
        //   785: getfield        com/twitter/library/media/util/transcode/d.m:Lcom/twitter/internal/android/util/Size;
        //   788: invokevirtual   com/twitter/internal/android/util/Size.b:()I
        //   791: invokevirtual   android/media/MediaFormat.setInteger:(Ljava/lang/String;I)V
        //   794: aload           30
        //   796: aload           17
        //   798: aload           31
        //   800: invokevirtual   com/twitter/library/media/util/transcode/b.b:()Landroid/view/Surface;
        //   803: aconst_null    
        //   804: iconst_0       
        //   805: invokevirtual   android/media/MediaCodec.configure:(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
        //   808: aload           30
        //   810: invokevirtual   android/media/MediaCodec.start:()V
        //   813: aload_0        
        //   814: iload           26
        //   816: aload           6
        //   818: aload           30
        //   820: aload           31
        //   822: aload           29
        //   824: aload_3        
        //   825: new             Landroid/media/MediaMuxer;
        //   828: dup            
        //   829: aload_1        
        //   830: iconst_0       
        //   831: invokespecial   android/media/MediaMuxer.<init>:(Ljava/lang/String;I)V
        //   834: invokespecial   com/twitter/library/media/util/transcode/d.a:(ILandroid/media/MediaExtractor;Landroid/media/MediaCodec;Lcom/twitter/library/media/util/transcode/b;Lcom/twitter/library/media/util/transcode/a;Landroid/media/MediaCodec;Landroid/media/MediaMuxer;)V
        //   837: aload           31
        //   839: ifnull          847
        //   842: aload           31
        //   844: invokevirtual   com/twitter/library/media/util/transcode/b.a:()V
        //   847: aload           29
        //   849: ifnull          857
        //   852: aload           29
        //   854: invokevirtual   com/twitter/library/media/util/transcode/a.a:()V
        //   857: aload_3        
        //   858: ifnull          869
        //   861: aload_3        
        //   862: invokevirtual   android/media/MediaCodec.stop:()V
        //   865: aload_3        
        //   866: invokevirtual   android/media/MediaCodec.release:()V
        //   869: aload           30
        //   871: ifnull          884
        //   874: aload           30
        //   876: invokevirtual   android/media/MediaCodec.stop:()V
        //   879: aload           30
        //   881: invokevirtual   android/media/MediaCodec.release:()V
        //   884: aload           6
        //   886: ifnull          894
        //   889: aload           6
        //   891: invokevirtual   android/media/MediaExtractor.release:()V
        //   894: return         
        //   895: aload           24
        //   897: lconst_0       
        //   898: invokevirtual   android/media/MediaMetadataRetriever.getFrameAtTime:(J)Landroid/graphics/Bitmap;
        //   901: astore          25
        //   903: aconst_null    
        //   904: astore          5
        //   906: aconst_null    
        //   907: astore_2       
        //   908: aconst_null    
        //   909: astore_3       
        //   910: aconst_null    
        //   911: astore          4
        //   913: iload           18
        //   915: iload           19
        //   917: if_icmpeq       1415
        //   920: iload           19
        //   922: aload           25
        //   924: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   927: if_icmpne       1415
        //   930: bipush          90
        //   932: istore          26
        //   934: aload           25
        //   936: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   939: goto            454
        //   942: astore          8
        //   944: ldc             "TextureTranscoder"
        //   946: ldc_w           "Error transcoding video"
        //   949: aload           8
        //   951: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   954: pop            
        //   955: aload           8
        //   957: invokestatic    com/twitter/errorreporter/ErrorReporter.b:(Ljava/lang/Throwable;)V
        //   960: new             Lcom/twitter/library/media/util/transcode/TranscoderException;
        //   963: dup            
        //   964: iconst_0       
        //   965: aconst_null    
        //   966: aload           8
        //   968: invokespecial   com/twitter/library/media/util/transcode/TranscoderException.<init>:(ZLjava/lang/String;Ljava/lang/Throwable;)V
        //   971: athrow         
        //   972: astore          7
        //   974: goto            125
        //   977: iconst_0       
        //   978: istore          37
        //   980: goto            1462
        //   983: iconst_0       
        //   984: istore          38
        //   986: goto            508
        //   989: iload           36
        //   991: iload           35
        //   993: invokestatic    com/twitter/internal/android/util/Size.a:(II)Lcom/twitter/internal/android/util/Size;
        //   996: astore          39
        //   998: goto            521
        //  1001: aload_0        
        //  1002: getfield        com/twitter/library/media/util/transcode/d.k:Lcom/twitter/internal/android/util/Size;
        //  1005: astore          42
        //  1007: goto            585
        //  1010: aload_0        
        //  1011: iload           18
        //  1013: iload           19
        //  1015: invokestatic    com/twitter/internal/android/util/Size.a:(II)Lcom/twitter/internal/android/util/Size;
        //  1018: putfield        com/twitter/library/media/util/transcode/d.m:Lcom/twitter/internal/android/util/Size;
        //  1021: goto            1475
        //  1024: ldc_w           "video/avc"
        //  1027: aload_0        
        //  1028: getfield        com/twitter/library/media/util/transcode/d.m:Lcom/twitter/internal/android/util/Size;
        //  1031: invokevirtual   com/twitter/internal/android/util/Size.a:()I
        //  1034: aload_0        
        //  1035: getfield        com/twitter/library/media/util/transcode/d.m:Lcom/twitter/internal/android/util/Size;
        //  1038: invokevirtual   com/twitter/internal/android/util/Size.b:()I
        //  1041: invokestatic    android/media/MediaFormat.createVideoFormat:(Ljava/lang/String;II)Landroid/media/MediaFormat;
        //  1044: astore          34
        //  1046: aload           34
        //  1048: astore          27
        //  1050: goto            616
        //  1053: astore          32
        //  1055: new             Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  1058: dup            
        //  1059: iconst_1       
        //  1060: ldc_w           "cannot configure decoder"
        //  1063: aload           32
        //  1065: invokespecial   com/twitter/library/media/util/transcode/TranscoderException.<init>:(ZLjava/lang/String;Ljava/lang/Throwable;)V
        //  1068: athrow         
        //  1069: astore          10
        //  1071: aload           29
        //  1073: astore          12
        //  1075: aload           30
        //  1077: astore          15
        //  1079: aload           6
        //  1081: astore          11
        //  1083: aload           31
        //  1085: astore          13
        //  1087: aload_3        
        //  1088: astore          14
        //  1090: goto            102
        //  1093: astore          7
        //  1095: aconst_null    
        //  1096: astore          6
        //  1098: aconst_null    
        //  1099: astore          5
        //  1101: aconst_null    
        //  1102: astore_2       
        //  1103: aconst_null    
        //  1104: astore_3       
        //  1105: aconst_null    
        //  1106: astore          4
        //  1108: goto            125
        //  1111: astore          7
        //  1113: aload           29
        //  1115: astore          5
        //  1117: aconst_null    
        //  1118: astore_2       
        //  1119: aconst_null    
        //  1120: astore          4
        //  1122: goto            125
        //  1125: astore          7
        //  1127: aload           30
        //  1129: astore_2       
        //  1130: aload           29
        //  1132: astore          5
        //  1134: aconst_null    
        //  1135: astore          4
        //  1137: goto            125
        //  1140: astore          7
        //  1142: aload           31
        //  1144: astore          4
        //  1146: aload           30
        //  1148: astore_2       
        //  1149: aload           29
        //  1151: astore          5
        //  1153: goto            125
        //  1156: astore          8
        //  1158: aconst_null    
        //  1159: astore          6
        //  1161: aconst_null    
        //  1162: astore          5
        //  1164: aconst_null    
        //  1165: astore_2       
        //  1166: aconst_null    
        //  1167: astore_3       
        //  1168: aconst_null    
        //  1169: astore          4
        //  1171: goto            944
        //  1174: astore          8
        //  1176: aload           29
        //  1178: astore          5
        //  1180: aconst_null    
        //  1181: astore_2       
        //  1182: aconst_null    
        //  1183: astore          4
        //  1185: goto            944
        //  1188: astore          8
        //  1190: aload           30
        //  1192: astore_2       
        //  1193: aload           29
        //  1195: astore          5
        //  1197: aconst_null    
        //  1198: astore          4
        //  1200: goto            944
        //  1203: astore          8
        //  1205: aload           31
        //  1207: astore          4
        //  1209: aload           30
        //  1211: astore_2       
        //  1212: aload           29
        //  1214: astore          5
        //  1216: goto            944
        //  1219: astore          10
        //  1221: aconst_null    
        //  1222: astore          12
        //  1224: aconst_null    
        //  1225: astore          13
        //  1227: aconst_null    
        //  1228: astore          11
        //  1230: aconst_null    
        //  1231: astore          14
        //  1233: aconst_null    
        //  1234: astore          15
        //  1236: goto            102
        //  1239: astore          10
        //  1241: aload           6
        //  1243: astore          11
        //  1245: aload_3        
        //  1246: astore          14
        //  1248: aconst_null    
        //  1249: astore          12
        //  1251: aconst_null    
        //  1252: astore          13
        //  1254: aconst_null    
        //  1255: astore          15
        //  1257: goto            102
        //  1260: astore          10
        //  1262: aload           29
        //  1264: astore          12
        //  1266: aload           6
        //  1268: astore          11
        //  1270: aload_3        
        //  1271: astore          14
        //  1273: aconst_null    
        //  1274: astore          13
        //  1276: aconst_null    
        //  1277: astore          15
        //  1279: goto            102
        //  1282: astore          10
        //  1284: aload           29
        //  1286: astore          12
        //  1288: aload_3        
        //  1289: astore          14
        //  1291: aload           30
        //  1293: astore          15
        //  1295: aload           6
        //  1297: astore          11
        //  1299: aconst_null    
        //  1300: astore          13
        //  1302: goto            102
        //  1305: astore          10
        //  1307: aload           29
        //  1309: astore          12
        //  1311: aload           30
        //  1313: astore          15
        //  1315: aload           6
        //  1317: astore          11
        //  1319: aload           31
        //  1321: astore          13
        //  1323: aload_3        
        //  1324: astore          14
        //  1326: goto            102
        //  1329: astore          10
        //  1331: aconst_null    
        //  1332: astore          12
        //  1334: aconst_null    
        //  1335: astore          13
        //  1337: aconst_null    
        //  1338: astore          11
        //  1340: aconst_null    
        //  1341: astore          14
        //  1343: aconst_null    
        //  1344: astore          15
        //  1346: goto            102
        //  1349: astore          10
        //  1351: aload           6
        //  1353: astore          11
        //  1355: aload_3        
        //  1356: astore          14
        //  1358: aconst_null    
        //  1359: astore          12
        //  1361: aconst_null    
        //  1362: astore          13
        //  1364: aconst_null    
        //  1365: astore          15
        //  1367: goto            102
        //  1370: astore          10
        //  1372: aload           29
        //  1374: astore          12
        //  1376: aload           6
        //  1378: astore          11
        //  1380: aload_3        
        //  1381: astore          14
        //  1383: aconst_null    
        //  1384: astore          13
        //  1386: aconst_null    
        //  1387: astore          15
        //  1389: goto            102
        //  1392: astore          10
        //  1394: aload           29
        //  1396: astore          12
        //  1398: aload_3        
        //  1399: astore          14
        //  1401: aload           30
        //  1403: astore          15
        //  1405: aload           6
        //  1407: astore          11
        //  1409: aconst_null    
        //  1410: astore          13
        //  1412: goto            102
        //  1415: iconst_0       
        //  1416: istore          26
        //  1418: goto            934
        //  1421: astore          10
        //  1423: aload           6
        //  1425: astore          11
        //  1427: aconst_null    
        //  1428: astore          12
        //  1430: aconst_null    
        //  1431: astore          13
        //  1433: aconst_null    
        //  1434: astore          14
        //  1436: aconst_null    
        //  1437: astore          15
        //  1439: goto            102
        //  1442: bipush          30
        //  1444: istore          21
        //  1446: goto            305
        //  1449: iconst_0       
        //  1450: istore          22
        //  1452: goto            313
        //  1455: iload           44
        //  1457: istore          26
        //  1459: goto            454
        //  1462: iload           18
        //  1464: iload           19
        //  1466: if_icmple       983
        //  1469: iconst_1       
        //  1470: istore          38
        //  1472: goto            508
        //  1475: iload           26
        //  1477: bipush          90
        //  1479: if_icmpeq       594
        //  1482: iload           26
        //  1484: sipush          270
        //  1487: if_icmpne       1024
        //  1490: goto            594
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                          
        //  -----  -----  -----  -----  --------------------------------------------------------------
        //  10     19     1329   1349   Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  10     19     1219   1239   Ljava/lang/InterruptedException;
        //  10     19     1156   1174   Ljava/io/IOException;
        //  10     19     1093   1111   Any
        //  19     37     84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  19     37     1421   1442   Ljava/lang/InterruptedException;
        //  19     37     942    944    Ljava/io/IOException;
        //  19     37     972    977    Any
        //  52     84     84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  52     84     1421   1442   Ljava/lang/InterruptedException;
        //  52     84     942    944    Ljava/io/IOException;
        //  52     84     972    977    Any
        //  102    105    105    125    Any
        //  182    230    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  182    230    1421   1442   Ljava/lang/InterruptedException;
        //  182    230    942    944    Ljava/io/IOException;
        //  182    230    972    977    Any
        //  230    248    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  230    248    1421   1442   Ljava/lang/InterruptedException;
        //  230    248    942    944    Ljava/io/IOException;
        //  230    248    972    977    Any
        //  248    286    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  248    286    1421   1442   Ljava/lang/InterruptedException;
        //  248    286    942    944    Ljava/io/IOException;
        //  248    286    972    977    Any
        //  291    300    374    388    Ljava/lang/ClassCastException;
        //  291    300    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  291    300    1421   1442   Ljava/lang/InterruptedException;
        //  291    300    942    944    Ljava/io/IOException;
        //  291    300    972    977    Any
        //  313    349    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  313    349    1421   1442   Ljava/lang/InterruptedException;
        //  313    349    942    944    Ljava/io/IOException;
        //  313    349    972    977    Any
        //  364    374    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  364    374    1421   1442   Ljava/lang/InterruptedException;
        //  364    374    942    944    Ljava/io/IOException;
        //  364    374    972    977    Any
        //  376    385    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  376    385    1421   1442   Ljava/lang/InterruptedException;
        //  376    385    942    944    Ljava/io/IOException;
        //  376    385    972    977    Any
        //  388    423    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  388    423    1421   1442   Ljava/lang/InterruptedException;
        //  388    423    942    944    Ljava/io/IOException;
        //  388    423    972    977    Any
        //  441    451    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  441    451    1421   1442   Ljava/lang/InterruptedException;
        //  441    451    942    944    Ljava/io/IOException;
        //  441    451    972    977    Any
        //  454    495    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  454    495    1421   1442   Ljava/lang/InterruptedException;
        //  454    495    942    944    Ljava/io/IOException;
        //  454    495    972    977    Any
        //  515    521    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  515    521    1421   1442   Ljava/lang/InterruptedException;
        //  515    521    942    944    Ljava/io/IOException;
        //  515    521    972    977    Any
        //  521    545    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  521    545    1421   1442   Ljava/lang/InterruptedException;
        //  521    545    942    944    Ljava/io/IOException;
        //  521    545    972    977    Any
        //  566    585    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  566    585    1421   1442   Ljava/lang/InterruptedException;
        //  566    585    942    944    Ljava/io/IOException;
        //  566    585    972    977    Any
        //  585    591    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  585    591    1421   1442   Ljava/lang/InterruptedException;
        //  585    591    942    944    Ljava/io/IOException;
        //  585    591    972    977    Any
        //  594    616    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  594    616    1421   1442   Ljava/lang/InterruptedException;
        //  594    616    942    944    Ljava/io/IOException;
        //  594    616    972    977    Any
        //  616    695    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  616    695    1421   1442   Ljava/lang/InterruptedException;
        //  616    695    942    944    Ljava/io/IOException;
        //  616    695    972    977    Any
        //  695    703    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  695    703    1421   1442   Ljava/lang/InterruptedException;
        //  695    703    942    944    Ljava/io/IOException;
        //  695    703    972    977    Any
        //  706    728    1349   1370   Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  706    728    1239   1260   Ljava/lang/InterruptedException;
        //  706    728    942    944    Ljava/io/IOException;
        //  706    728    972    977    Any
        //  728    749    1370   1392   Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  728    749    1260   1282   Ljava/lang/InterruptedException;
        //  728    749    1174   1188   Ljava/io/IOException;
        //  728    749    1111   1125   Any
        //  749    758    1392   1415   Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  749    758    1282   1305   Ljava/lang/InterruptedException;
        //  749    758    1188   1203   Ljava/io/IOException;
        //  749    758    1125   1140   Any
        //  758    794    1069   1093   Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  758    794    1305   1329   Ljava/lang/InterruptedException;
        //  758    794    1203   1219   Ljava/io/IOException;
        //  758    794    1140   1156   Any
        //  794    808    1053   1069   Ljava/lang/Throwable;
        //  794    808    1069   1093   Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  794    808    1305   1329   Ljava/lang/InterruptedException;
        //  794    808    1203   1219   Ljava/io/IOException;
        //  794    808    1140   1156   Any
        //  808    837    1069   1093   Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  808    837    1305   1329   Ljava/lang/InterruptedException;
        //  808    837    1203   1219   Ljava/io/IOException;
        //  808    837    1140   1156   Any
        //  895    903    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  895    903    1421   1442   Ljava/lang/InterruptedException;
        //  895    903    942    944    Ljava/io/IOException;
        //  895    903    972    977    Any
        //  920    930    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  920    930    1421   1442   Ljava/lang/InterruptedException;
        //  920    930    942    944    Ljava/io/IOException;
        //  920    930    972    977    Any
        //  934    939    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  934    939    1421   1442   Ljava/lang/InterruptedException;
        //  934    939    942    944    Ljava/io/IOException;
        //  934    939    972    977    Any
        //  944    972    972    977    Any
        //  989    998    84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  989    998    1421   1442   Ljava/lang/InterruptedException;
        //  989    998    942    944    Ljava/io/IOException;
        //  989    998    972    977    Any
        //  1001   1007   84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  1001   1007   1421   1442   Ljava/lang/InterruptedException;
        //  1001   1007   942    944    Ljava/io/IOException;
        //  1001   1007   972    977    Any
        //  1010   1021   84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  1010   1021   1421   1442   Ljava/lang/InterruptedException;
        //  1010   1021   942    944    Ljava/io/IOException;
        //  1010   1021   972    977    Any
        //  1024   1046   84     102    Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  1024   1046   1421   1442   Ljava/lang/InterruptedException;
        //  1024   1046   942    944    Ljava/io/IOException;
        //  1024   1046   972    977    Any
        //  1055   1069   1069   1093   Lcom/twitter/library/media/util/transcode/TranscoderException;
        //  1055   1069   1305   1329   Ljava/lang/InterruptedException;
        //  1055   1069   1203   1219   Ljava/io/IOException;
        //  1055   1069   1140   1156   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 740, Size: 740
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    @TargetApi(21)
    private static void a(final String dataSource, final String dataSource2, final String s) {
        final MediaMuxer mediaMuxer = new MediaMuxer(s, 0);
        final MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(dataSource2);
        final int a = a(mediaExtractor, "audio/");
        mediaExtractor.selectTrack(a);
        final int addTrack = mediaMuxer.addTrack(mediaExtractor.getTrackFormat(a));
        final ByteBuffer allocate = ByteBuffer.allocate(600000);
        allocate.position(0);
        int size = mediaExtractor.readSampleData(allocate, 0);
        final MediaExtractor mediaExtractor2 = new MediaExtractor();
        mediaExtractor2.setDataSource(dataSource);
        final int a2 = a(mediaExtractor2, "video/");
        mediaExtractor2.selectTrack(a2);
        final MediaFormat trackFormat = mediaExtractor2.getTrackFormat(a2);
        final int addTrack2 = mediaMuxer.addTrack(trackFormat);
        ByteBuffer byteBuffer;
        if (trackFormat.containsKey("max-input-size")) {
            byteBuffer = ByteBuffer.allocate(trackFormat.getInteger("max-input-size"));
        }
        else {
            byteBuffer = ByteBuffer.allocate(1000000);
        }
        byteBuffer.position(0);
        int size2 = mediaExtractor2.readSampleData(byteBuffer, 0);
        mediaMuxer.start();
        final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
        while (true) {
            if (size == 0) {
                allocate.position(0);
                size = mediaExtractor.readSampleData(allocate, 0);
            }
            else if (size2 == 0) {
                byteBuffer.position(0);
                size2 = mediaExtractor2.readSampleData(byteBuffer, 0);
            }
            boolean b;
            if (size2 == -1) {
                b = true;
            }
            else {
                b = false;
            }
            boolean b2;
            if (size == -1) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b && b2) {
                break;
            }
            int n;
            if (!b && (b2 || mediaExtractor2.getSampleTime() < mediaExtractor.getSampleTime())) {
                n = 1;
            }
            else {
                n = 0;
            }
            int n3;
            int n4;
            if (n != 0) {
                mediaCodec$BufferInfo.size = size2;
                mediaCodec$BufferInfo.presentationTimeUs = mediaExtractor2.getSampleTime();
                int n2;
                if ((0x1 & mediaExtractor2.getSampleFlags()) > 0) {
                    n2 = 1;
                    mediaCodec$BufferInfo.flags = n2;
                }
                else {
                    n2 = 0;
                }
                mediaCodec$BufferInfo.flags = n2;
                byteBuffer.position(0);
                mediaMuxer.writeSampleData(addTrack2, byteBuffer, mediaCodec$BufferInfo);
                if (mediaExtractor2.advance()) {
                    n3 = 0;
                }
                else {
                    n3 = -1;
                }
                n4 = size;
            }
            else {
                mediaCodec$BufferInfo.size = size;
                mediaCodec$BufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                int n5;
                if ((0x1 & mediaExtractor.getSampleFlags()) > 0) {
                    n5 = 1;
                    mediaCodec$BufferInfo.flags = n5;
                }
                else {
                    n5 = 0;
                }
                mediaCodec$BufferInfo.flags = n5;
                allocate.position(0);
                mediaMuxer.writeSampleData(addTrack, allocate, mediaCodec$BufferInfo);
                int n6;
                if (mediaExtractor.advance()) {
                    n6 = 0;
                }
                else {
                    n6 = -1;
                }
                final int n7 = size2;
                n4 = n6;
                n3 = n7;
            }
            size = n4;
            size2 = n3;
        }
        mediaMuxer.stop();
        mediaMuxer.release();
        mediaExtractor.release();
        mediaExtractor2.release();
    }
    
    private static void a(final byte[] array, final int n, final String s, final int n2) {
        int n3 = 0;
        final MediaCodec encoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        encoderByType.configure(c(n2), (Surface)null, (MediaCrypto)null, 1);
        encoderByType.start();
        final MediaMuxer mediaMuxer = new MediaMuxer(s, 0);
        final g g = new g(encoderByType, mediaMuxer);
        while (true) {
            int n5 = 0;
            Label_0259: {
                int min = 0;
                Label_0252: {
                    try {
                        if (g.c()) {
                            goto Label_0210;
                        }
                        g.a();
                        final ByteBuffer[] inputBuffers = encoderByType.getInputBuffers();
                        final int dequeueInputBuffer = encoderByType.dequeueInputBuffer(-1L);
                        if (dequeueInputBuffer >= 0) {
                            final ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                            byteBuffer.clear();
                            min = Math.min(2048, n - n3);
                            byteBuffer.put(array, n3, min);
                            final long n4 = (long)(1000000.0f * (n3 / 2 / n2));
                            if (n3 + min >= n) {
                                encoderByType.queueInputBuffer(dequeueInputBuffer, 0, min, n4, 4);
                                break Label_0252;
                            }
                            encoderByType.queueInputBuffer(dequeueInputBuffer, 0, min, n4, 0);
                            break Label_0252;
                        }
                    }
                    catch (InterruptedException ex) {
                        throw ex;
                    }
                    catch (Throwable t) {
                        throw new TranscoderException(false, null, t);
                    }
                    finally {
                        encoderByType.stop();
                        encoderByType.release();
                        mediaMuxer.stop();
                        mediaMuxer.release();
                    }
                    n5 = n3;
                    break Label_0259;
                }
                n5 = n3 + min;
            }
            n3 = n5;
        }
    }
    
    @TargetApi(16)
    private void b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/twitter/library/media/util/transcode/d.f:J
        //     4: lstore_2       
        //     5: aconst_null    
        //     6: astore          4
        //     8: new             Landroid/media/MediaExtractor;
        //    11: dup            
        //    12: invokespecial   android/media/MediaExtractor.<init>:()V
        //    15: astore          5
        //    17: aload           5
        //    19: aload_0        
        //    20: getfield        com/twitter/library/media/util/transcode/d.c:Ljava/lang/String;
        //    23: invokevirtual   android/media/MediaExtractor.setDataSource:(Ljava/lang/String;)V
        //    26: aload           5
        //    28: ldc_w           "audio/"
        //    31: invokestatic    com/twitter/library/media/util/transcode/d.a:(Landroid/media/MediaExtractor;Ljava/lang/String;)I
        //    34: istore          8
        //    36: iload           8
        //    38: ifge            76
        //    41: new             Ljava/io/File;
        //    44: dup            
        //    45: aload_1        
        //    46: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    49: invokevirtual   java/io/File.delete:()Z
        //    52: pop            
        //    53: aload           5
        //    55: ifnull          63
        //    58: aload           5
        //    60: invokevirtual   android/media/MediaExtractor.release:()V
        //    63: iconst_0       
        //    64: ifeq            75
        //    67: aconst_null    
        //    68: invokevirtual   android/media/MediaCodec.stop:()V
        //    71: aconst_null    
        //    72: invokevirtual   android/media/MediaCodec.release:()V
        //    75: return         
        //    76: aload           5
        //    78: iload           8
        //    80: invokevirtual   android/media/MediaExtractor.selectTrack:(I)V
        //    83: lload_2        
        //    84: ldc2_w          5000
        //    87: ladd           
        //    88: lstore          10
        //    90: aload           5
        //    92: iload           8
        //    94: invokevirtual   android/media/MediaExtractor.getTrackFormat:(I)Landroid/media/MediaFormat;
        //    97: astore          12
        //    99: lconst_0       
        //   100: lstore          13
        //   102: aload           12
        //   104: ldc_w           "channel-count"
        //   107: invokevirtual   android/media/MediaFormat.getInteger:(Ljava/lang/String;)I
        //   110: istore          15
        //   112: aload           12
        //   114: ldc             "durationUs"
        //   116: invokevirtual   android/media/MediaFormat.containsKey:(Ljava/lang/String;)Z
        //   119: ifeq            131
        //   122: aload           12
        //   124: ldc             "durationUs"
        //   126: invokevirtual   android/media/MediaFormat.getLong:(Ljava/lang/String;)J
        //   129: lstore          13
        //   131: aload           12
        //   133: ldc_w           "sample-rate"
        //   136: invokevirtual   android/media/MediaFormat.containsKey:(Ljava/lang/String;)Z
        //   139: ifeq            1061
        //   142: aload           12
        //   144: ldc_w           "sample-rate"
        //   147: invokevirtual   android/media/MediaFormat.getInteger:(Ljava/lang/String;)I
        //   150: istore          16
        //   152: iload           16
        //   154: ifge            204
        //   157: new             Lcom/twitter/library/media/util/transcode/TranscoderException;
        //   160: dup            
        //   161: iconst_1       
        //   162: ldc_w           "no sample rate"
        //   165: aconst_null    
        //   166: invokespecial   com/twitter/library/media/util/transcode/TranscoderException.<init>:(ZLjava/lang/String;Ljava/lang/Throwable;)V
        //   169: athrow         
        //   170: astore          6
        //   172: aload           5
        //   174: astore          7
        //   176: aload           7
        //   178: ifnull          186
        //   181: aload           7
        //   183: invokevirtual   android/media/MediaExtractor.release:()V
        //   186: aload           4
        //   188: ifnull          201
        //   191: aload           4
        //   193: invokevirtual   android/media/MediaCodec.stop:()V
        //   196: aload           4
        //   198: invokevirtual   android/media/MediaCodec.release:()V
        //   201: aload           6
        //   203: athrow         
        //   204: ldc_w           1000000.0
        //   207: fconst_1       
        //   208: iload           16
        //   210: i2f            
        //   211: fdiv           
        //   212: fmul           
        //   213: f2l            
        //   214: lstore          17
        //   216: aload           12
        //   218: ldc             "mime"
        //   220: invokevirtual   android/media/MediaFormat.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   223: invokestatic    android/media/MediaCodec.createDecoderByType:(Ljava/lang/String;)Landroid/media/MediaCodec;
        //   226: astore          19
        //   228: aload           19
        //   230: aload           12
        //   232: aconst_null    
        //   233: aconst_null    
        //   234: iconst_0       
        //   235: invokevirtual   android/media/MediaCodec.configure:(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
        //   238: aload           19
        //   240: invokevirtual   android/media/MediaCodec.start:()V
        //   243: aload           19
        //   245: invokevirtual   android/media/MediaCodec.getInputBuffers:()[Ljava/nio/ByteBuffer;
        //   248: astore          21
        //   250: aload           19
        //   252: invokevirtual   android/media/MediaCodec.getOutputBuffers:()[Ljava/nio/ByteBuffer;
        //   255: astore          22
        //   257: new             Landroid/media/MediaCodec$BufferInfo;
        //   260: dup            
        //   261: invokespecial   android/media/MediaCodec$BufferInfo.<init>:()V
        //   264: astore          23
        //   266: fconst_2       
        //   267: fconst_2       
        //   268: lload           13
        //   270: iload           16
        //   272: i2l            
        //   273: lmul           
        //   274: l2f            
        //   275: ldc_w           1000000.0
        //   278: fdiv           
        //   279: fmul           
        //   280: fmul           
        //   281: f2i            
        //   282: newarray        B
        //   284: astore          24
        //   286: aload           5
        //   288: aload_0        
        //   289: getfield        com/twitter/library/media/util/transcode/d.e:J
        //   292: iconst_0       
        //   293: invokevirtual   android/media/MediaExtractor.seekTo:(JI)V
        //   296: getstatic       com/twitter/library/media/util/transcode/d.a:Z
        //   299: ifeq            345
        //   302: ldc             "TextureTranscoder"
        //   304: new             Ljava/lang/StringBuilder;
        //   307: dup            
        //   308: invokespecial   java/lang/StringBuilder.<init>:()V
        //   311: ldc_w           "Audio transcode start at "
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: aload           5
        //   319: invokevirtual   android/media/MediaExtractor.getSampleFlags:()I
        //   322: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   325: ldc_w           " desired start is "
        //   328: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   331: aload_0        
        //   332: getfield        com/twitter/library/media/util/transcode/d.e:J
        //   335: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   338: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   341: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   344: pop            
        //   345: iconst_0       
        //   346: istore          25
        //   348: iconst_0       
        //   349: istore          26
        //   351: iconst_0       
        //   352: istore          27
        //   354: iconst_0       
        //   355: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   358: astore          28
        //   360: iconst_0       
        //   361: istore          29
        //   363: aconst_null    
        //   364: astore          30
        //   366: aload_0        
        //   367: getfield        com/twitter/library/media/util/transcode/d.b:Z
        //   370: ifne            914
        //   373: iload           26
        //   375: ifne            914
        //   378: iload           27
        //   380: bipush          50
        //   382: if_icmpge       914
        //   385: aload           28
        //   387: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   390: ifne            914
        //   393: iload           27
        //   395: iconst_1       
        //   396: iadd           
        //   397: istore          31
        //   399: iload           25
        //   401: ifne            1033
        //   404: aload           19
        //   406: ldc2_w          10000
        //   409: invokevirtual   android/media/MediaCodec.dequeueInputBuffer:(J)I
        //   412: istore          32
        //   414: iload           32
        //   416: iflt            1026
        //   419: aload           5
        //   421: aload           21
        //   423: iload           32
        //   425: aaload         
        //   426: iconst_0       
        //   427: invokevirtual   android/media/MediaExtractor.readSampleData:(Ljava/nio/ByteBuffer;I)I
        //   430: istore          33
        //   432: lconst_0       
        //   433: lstore          34
        //   435: iload           33
        //   437: ifge            852
        //   440: iconst_1       
        //   441: istore          36
        //   443: iconst_0       
        //   444: istore          33
        //   446: goto            1067
        //   449: aload           19
        //   451: iload           32
        //   453: iconst_0       
        //   454: iload           33
        //   456: lload           34
        //   458: iload           37
        //   460: invokevirtual   android/media/MediaCodec.queueInputBuffer:(IIIJI)V
        //   463: iload           36
        //   465: ifne            474
        //   468: aload           5
        //   470: invokevirtual   android/media/MediaExtractor.advance:()Z
        //   473: pop            
        //   474: aload           19
        //   476: aload           23
        //   478: ldc2_w          10000
        //   481: invokevirtual   android/media/MediaCodec.dequeueOutputBuffer:(Landroid/media/MediaCodec$BufferInfo;J)I
        //   484: istore          39
        //   486: iload           39
        //   488: iflt            866
        //   491: aload           23
        //   493: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   496: ifle            1019
        //   499: iconst_0       
        //   500: istore          40
        //   502: aload           22
        //   504: iload           39
        //   506: aaload         
        //   507: astore          41
        //   509: aload           30
        //   511: ifnull          525
        //   514: aload           30
        //   516: arraylength    
        //   517: aload           23
        //   519: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   522: if_icmpge       1012
        //   525: aload           23
        //   527: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   530: newarray        B
        //   532: astore          42
        //   534: aload           41
        //   536: aload           42
        //   538: invokevirtual   java/nio/ByteBuffer.get:([B)Ljava/nio/ByteBuffer;
        //   541: pop            
        //   542: aload           41
        //   544: invokevirtual   java/nio/ByteBuffer.clear:()Ljava/nio/Buffer;
        //   547: pop            
        //   548: iload           15
        //   550: iconst_2       
        //   551: imul           
        //   552: istore          45
        //   554: aload           23
        //   556: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   559: lstore          46
        //   561: iload           29
        //   563: iconst_2       
        //   564: idiv           
        //   565: i2l            
        //   566: ldc2_w          1000000
        //   569: aload           23
        //   571: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   574: iload           45
        //   576: idiv           
        //   577: i2l            
        //   578: lmul           
        //   579: iload           16
        //   581: i2l            
        //   582: ldiv           
        //   583: ladd           
        //   584: lstore          48
        //   586: aload           23
        //   588: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   591: lconst_0       
        //   592: lcmp           
        //   593: ifeq            1054
        //   596: lload           48
        //   598: aload           23
        //   600: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   603: ldiv           
        //   604: ldc2_w          2
        //   607: lcmp           
        //   608: ifne            1054
        //   611: iload           15
        //   613: iconst_2       
        //   614: imul           
        //   615: istore          50
        //   617: iload           50
        //   619: iconst_2       
        //   620: imul           
        //   621: istore          45
        //   623: ldc             "TextureTranscoder"
        //   625: new             Ljava/lang/StringBuilder;
        //   628: dup            
        //   629: invokespecial   java/lang/StringBuilder.<init>:()V
        //   632: ldc_w           "Updated channel count to "
        //   635: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   638: iload           50
        //   640: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   643: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   646: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   649: pop            
        //   650: goto            1078
        //   653: iload           52
        //   655: aload           23
        //   657: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   660: iload           45
        //   662: idiv           
        //   663: if_icmpge       1047
        //   666: sipush          255
        //   669: aload           42
        //   671: iload           52
        //   673: iload           45
        //   675: imul           
        //   676: baload         
        //   677: iand           
        //   678: aload           42
        //   680: iconst_1       
        //   681: iload           52
        //   683: iload           45
        //   685: imul           
        //   686: iadd           
        //   687: baload         
        //   688: bipush          8
        //   690: ishl           
        //   691: ior            
        //   692: istore          60
        //   694: iload           50
        //   696: iconst_2       
        //   697: if_icmpne       735
        //   700: iload           60
        //   702: sipush          255
        //   705: aload           42
        //   707: iconst_2       
        //   708: iload           52
        //   710: iload           45
        //   712: imul           
        //   713: iadd           
        //   714: baload         
        //   715: iand           
        //   716: aload           42
        //   718: iconst_3       
        //   719: iload           52
        //   721: iload           45
        //   723: imul           
        //   724: iadd           
        //   725: baload         
        //   726: bipush          8
        //   728: ishl           
        //   729: ior            
        //   730: iadd           
        //   731: iconst_2       
        //   732: idiv           
        //   733: istore          60
        //   735: iload           51
        //   737: iconst_1       
        //   738: iadd           
        //   739: istore          61
        //   741: aload           24
        //   743: iload           51
        //   745: iload           60
        //   747: sipush          255
        //   750: iand           
        //   751: i2b            
        //   752: bastore        
        //   753: iload           61
        //   755: iconst_1       
        //   756: iadd           
        //   757: istore          51
        //   759: aload           24
        //   761: iload           61
        //   763: sipush          255
        //   766: iload           60
        //   768: bipush          8
        //   770: ishr           
        //   771: iand           
        //   772: i2b            
        //   773: bastore        
        //   774: lload           46
        //   776: lload           17
        //   778: ladd           
        //   779: lstore          46
        //   781: lload           46
        //   783: lload           10
        //   785: lcmp           
        //   786: iflt            1153
        //   789: iconst_1       
        //   790: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   793: astore          53
        //   795: getstatic       com/twitter/library/media/util/transcode/d.a:Z
        //   798: ifeq            828
        //   801: ldc             "TextureTranscoder"
        //   803: new             Ljava/lang/StringBuilder;
        //   806: dup            
        //   807: invokespecial   java/lang/StringBuilder.<init>:()V
        //   810: ldc_w           "Audio transcode last audio timestamp is "
        //   813: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   816: lload           46
        //   818: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   821: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   824: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   827: pop            
        //   828: aload           19
        //   830: iload           39
        //   832: iconst_0       
        //   833: invokevirtual   android/media/MediaCodec.releaseOutputBuffer:(IZ)V
        //   836: iconst_4       
        //   837: aload           23
        //   839: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   842: iand           
        //   843: ifeq            1040
        //   846: iconst_1       
        //   847: istore          54
        //   849: goto            1088
        //   852: aload           5
        //   854: invokevirtual   android/media/MediaExtractor.getSampleTime:()J
        //   857: lstore          34
        //   859: iload           25
        //   861: istore          36
        //   863: goto            1067
        //   866: iload           39
        //   868: bipush          -3
        //   870: if_icmpne       985
        //   873: aload           19
        //   875: invokevirtual   android/media/MediaCodec.getInputBuffers:()[Ljava/nio/ByteBuffer;
        //   878: astore          64
        //   880: aload           19
        //   882: invokevirtual   android/media/MediaCodec.getOutputBuffers:()[Ljava/nio/ByteBuffer;
        //   885: astore          65
        //   887: aload           28
        //   889: astore          57
        //   891: iload           31
        //   893: istore          27
        //   895: aload           65
        //   897: astore          59
        //   899: aload           64
        //   901: astore          58
        //   903: aload           30
        //   905: astore          55
        //   907: iload           29
        //   909: istore          56
        //   911: goto            1120
        //   914: aload_0        
        //   915: getfield        com/twitter/library/media/util/transcode/d.b:Z
        //   918: ifne            931
        //   921: aload           24
        //   923: iload           29
        //   925: aload_1        
        //   926: iload           16
        //   928: invokestatic    com/twitter/library/media/util/transcode/d.a:([BILjava/lang/String;I)V
        //   931: aload           5
        //   933: ifnull          941
        //   936: aload           5
        //   938: invokevirtual   android/media/MediaExtractor.release:()V
        //   941: aload           19
        //   943: ifnull          75
        //   946: aload           19
        //   948: invokevirtual   android/media/MediaCodec.stop:()V
        //   951: aload           19
        //   953: invokevirtual   android/media/MediaCodec.release:()V
        //   956: return         
        //   957: astore          6
        //   959: aconst_null    
        //   960: astore          4
        //   962: aconst_null    
        //   963: astore          7
        //   965: goto            176
        //   968: astore          20
        //   970: aload           5
        //   972: astore          7
        //   974: aload           20
        //   976: astore          6
        //   978: aload           19
        //   980: astore          4
        //   982: goto            176
        //   985: aload           30
        //   987: astore          55
        //   989: iload           29
        //   991: istore          56
        //   993: aload           28
        //   995: astore          57
        //   997: iload           31
        //   999: istore          27
        //  1001: aload           22
        //  1003: astore          59
        //  1005: aload           21
        //  1007: astore          58
        //  1009: goto            1120
        //  1012: aload           30
        //  1014: astore          42
        //  1016: goto            534
        //  1019: iload           31
        //  1021: istore          40
        //  1023: goto            502
        //  1026: iload           25
        //  1028: istore          36
        //  1030: goto            474
        //  1033: iload           31
        //  1035: istore          27
        //  1037: goto            366
        //  1040: iload           26
        //  1042: istore          54
        //  1044: goto            1088
        //  1047: aload           28
        //  1049: astore          53
        //  1051: goto            828
        //  1054: iload           15
        //  1056: istore          50
        //  1058: goto            1078
        //  1061: iconst_m1      
        //  1062: istore          16
        //  1064: goto            152
        //  1067: iload           36
        //  1069: ifeq            1147
        //  1072: iconst_4       
        //  1073: istore          37
        //  1075: goto            449
        //  1078: iload           29
        //  1080: istore          51
        //  1082: iconst_0       
        //  1083: istore          52
        //  1085: goto            653
        //  1088: iload           54
        //  1090: istore          26
        //  1092: iload           50
        //  1094: istore          15
        //  1096: aload           42
        //  1098: astore          55
        //  1100: iload           51
        //  1102: istore          56
        //  1104: aload           53
        //  1106: astore          57
        //  1108: iload           40
        //  1110: istore          27
        //  1112: aload           21
        //  1114: astore          58
        //  1116: aload           22
        //  1118: astore          59
        //  1120: aload           55
        //  1122: astore          30
        //  1124: iload           56
        //  1126: istore          29
        //  1128: aload           57
        //  1130: astore          28
        //  1132: aload           59
        //  1134: astore          22
        //  1136: aload           58
        //  1138: astore          21
        //  1140: iload           36
        //  1142: istore          25
        //  1144: goto            366
        //  1147: iconst_0       
        //  1148: istore          37
        //  1150: goto            449
        //  1153: iinc            52, 1
        //  1156: goto            653
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  8      17     957    968    Any
        //  17     36     170    176    Any
        //  41     53     170    176    Any
        //  76     83     170    176    Any
        //  90     99     170    176    Any
        //  102    131    170    176    Any
        //  131    152    170    176    Any
        //  157    170    170    176    Any
        //  216    228    170    176    Any
        //  228    345    968    985    Any
        //  354    360    968    985    Any
        //  366    373    968    985    Any
        //  385    393    968    985    Any
        //  404    414    968    985    Any
        //  419    432    968    985    Any
        //  449    463    968    985    Any
        //  468    474    968    985    Any
        //  474    486    968    985    Any
        //  491    499    968    985    Any
        //  502    509    968    985    Any
        //  514    525    968    985    Any
        //  525    534    968    985    Any
        //  534    548    968    985    Any
        //  554    611    968    985    Any
        //  623    650    968    985    Any
        //  653    694    968    985    Any
        //  700    735    968    985    Any
        //  741    753    968    985    Any
        //  759    774    968    985    Any
        //  789    828    968    985    Any
        //  828    846    968    985    Any
        //  852    859    968    985    Any
        //  873    887    968    985    Any
        //  914    931    968    985    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0345:
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
    
    private static MediaFormat c(final int n) {
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("aac-profile", 2);
        mediaFormat.setInteger("sample-rate", n);
        mediaFormat.setInteger("channel-count", 1);
        mediaFormat.setInteger("bitrate", 64000);
        mediaFormat.setInteger("max-input-size", (int)(0.38f * n));
        return mediaFormat;
    }
    
    public Size a() {
        return this.m;
    }
    
    public d a(final int h) {
        this.h = h;
        return this;
    }
    
    public d a(final long e, final long n) {
        this.e = e;
        this.f = e + n;
        return this;
    }
    
    public d a(final Size g) {
        this.g = g;
        return this;
    }
    
    public d b(final int i) {
        this.i = i;
        return this;
    }
    
    public void b() {
        final String string = this.d + ".video.mp4";
        final String string2 = this.d + ".audio.m4a";
        try {
            this.b(string2);
            if (new File(string2).exists()) {
                this.a(string);
                a(string, string2, this.d);
            }
            else {
                this.a(this.d);
            }
        }
        catch (TranscoderException ex2) {}
        catch (IOException ex) {
            throw new TranscoderException(true, null, ex);
        }
        catch (Throwable t) {
            throw new TranscoderException(false, null, t);
        }
        catch (InterruptedException ex3) {}
    }
}
