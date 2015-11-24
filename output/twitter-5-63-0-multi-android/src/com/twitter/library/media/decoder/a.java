// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.decoder;

import android.annotation.TargetApi;
import java.io.FileInputStream;
import android.graphics.RectF;
import java.util.Map;
import com.twitter.errorreporter.b;
import com.twitter.library.util.bq;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import java.io.FileDescriptor;
import android.graphics.Rect;
import com.twitter.library.media.util.m;
import com.twitter.internal.android.util.Size;
import android.graphics.Bitmap;

public class a extends ImageDecoder
{
    private Bitmap a(final Bitmap bitmap, final Size size) {
        try {
            final Bitmap a = com.twitter.library.media.util.m.a(bitmap, null, this.b.g(Size.a(bitmap)), true);
            if (a != bitmap) {
                bitmap.recycle();
            }
            return a;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.a(outOfMemoryError, size);
            return null;
        }
    }
    
    private Bitmap a(final FileDescriptor p0, final BitmapFactory$Options p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: invokestatic    com/twitter/internal/android/util/Size.a:(Landroid/graphics/BitmapFactory$Options;)Lcom/twitter/internal/android/util/Size;
        //     4: astore_3       
        //     5: aload_0        
        //     6: getfield        com/twitter/library/media/decoder/a.b:Lcom/twitter/library/media/decoder/f;
        //     9: aload_3        
        //    10: invokevirtual   com/twitter/library/media/decoder/f.c:(Lcom/twitter/internal/android/util/Size;)Landroid/graphics/Rect;
        //    13: astore          7
        //    15: aload           7
        //    17: invokestatic    com/twitter/internal/android/util/Size.a:(Landroid/graphics/Rect;)Lcom/twitter/internal/android/util/Size;
        //    20: aload_3        
        //    21: invokevirtual   com/twitter/internal/android/util/Size.d:(Lcom/twitter/internal/android/util/Size;)Z
        //    24: istore          8
        //    26: iload           8
        //    28: ifne            199
        //    31: aload_1        
        //    32: iconst_1       
        //    33: invokestatic    android/graphics/BitmapRegionDecoder.newInstance:(Ljava/io/FileDescriptor;Z)Landroid/graphics/BitmapRegionDecoder;
        //    36: astore          14
        //    38: aload           14
        //    40: astore          13
        //    42: aload           13
        //    44: aload           7
        //    46: aload_2        
        //    47: invokevirtual   android/graphics/BitmapRegionDecoder.decodeRegion:(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    50: astore          17
        //    52: aload           13
        //    54: ifnull          205
        //    57: aload           13
        //    59: invokevirtual   android/graphics/BitmapRegionDecoder.recycle:()V
        //    62: aload           17
        //    64: astore          5
        //    66: aload           5
        //    68: ifnonnull       107
        //    71: aload_1        
        //    72: aconst_null    
        //    73: aload_2        
        //    74: invokestatic    android/graphics/BitmapFactory.decodeFileDescriptor:(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    77: astore          9
        //    79: aload           9
        //    81: ifnull          107
        //    84: aload           9
        //    86: aload           7
        //    88: aconst_null    
        //    89: iconst_0       
        //    90: invokestatic    com/twitter/library/media/util/m.a:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
        //    93: astore          5
        //    95: aload           5
        //    97: aload           9
        //    99: if_acmpeq       107
        //   102: aload           9
        //   104: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   107: aload           5
        //   109: areturn        
        //   110: astore          12
        //   112: aconst_null    
        //   113: astore          13
        //   115: aload           13
        //   117: ifnull          199
        //   120: aload           13
        //   122: invokevirtual   android/graphics/BitmapRegionDecoder.recycle:()V
        //   125: aconst_null    
        //   126: astore          5
        //   128: goto            66
        //   131: aload           11
        //   133: ifnull          141
        //   136: aload           11
        //   138: invokevirtual   android/graphics/BitmapRegionDecoder.recycle:()V
        //   141: aload           10
        //   143: athrow         
        //   144: astore          4
        //   146: aconst_null    
        //   147: astore          5
        //   149: aload           4
        //   151: astore          6
        //   153: aload_0        
        //   154: aload           6
        //   156: aload_3        
        //   157: invokespecial   com/twitter/library/media/decoder/a.a:(Ljava/lang/OutOfMemoryError;Lcom/twitter/internal/android/util/Size;)V
        //   160: aload           5
        //   162: areturn        
        //   163: astore          18
        //   165: aload           17
        //   167: astore          5
        //   169: aload           18
        //   171: astore          6
        //   173: goto            153
        //   176: astore          6
        //   178: goto            153
        //   181: astore          16
        //   183: aload           13
        //   185: astore          11
        //   187: aload           16
        //   189: astore          10
        //   191: goto            131
        //   194: astore          15
        //   196: goto            115
        //   199: aconst_null    
        //   200: astore          5
        //   202: goto            66
        //   205: aload           17
        //   207: astore          5
        //   209: goto            66
        //   212: astore          10
        //   214: aconst_null    
        //   215: astore          11
        //   217: goto            131
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  5      26     144    153    Ljava/lang/OutOfMemoryError;
        //  31     38     110    115    Ljava/io/IOException;
        //  31     38     212    220    Any
        //  42     52     194    199    Ljava/io/IOException;
        //  42     52     181    194    Any
        //  57     62     163    176    Ljava/lang/OutOfMemoryError;
        //  71     79     176    181    Ljava/lang/OutOfMemoryError;
        //  84     95     176    181    Ljava/lang/OutOfMemoryError;
        //  102    107    176    181    Ljava/lang/OutOfMemoryError;
        //  120    125    144    153    Ljava/lang/OutOfMemoryError;
        //  136    141    144    153    Ljava/lang/OutOfMemoryError;
        //  141    144    144    153    Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
    
    private BitmapFactory$Options a(final FileDescriptor fileDescriptor) {
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inPreferredConfig = this.c;
        bitmapFactory$Options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect)null, bitmapFactory$Options);
        bitmapFactory$Options.inSampleSize = this.b.e(Size.a(bitmapFactory$Options));
        bitmapFactory$Options.inJustDecodeBounds = false;
        return bitmapFactory$Options;
    }
    
    private void a(final OutOfMemoryError outOfMemoryError, final Size size) {
        final com.twitter.library.util.error.b b = bq.b(outOfMemoryError);
        if (b == null) {
            return;
        }
        while (true) {
            try {
                final Map a = b.a().get(0).a();
                a.put("ImageDecoder.description", this.k);
                a.put("ImageDecoder.requested_size", this.b.a());
                a.put("ImageDecoder.bitmap_config", this.c);
                if (this.f != null) {
                    a.put("ImageDecoder.uri", this.f);
                }
                if (this.i != null) {
                    a.put("ImageDecoder.file", this.i.getAbsolutePath());
                }
                a.put("ImageDecoder.bitmap_size", size);
                final RectF b2 = this.b.b();
                if (b2 != null) {
                    a.put("ImageDecoder.relative_input_rect", b2);
                }
                a.put("ImageDecoder.input_size", this.b.d(size));
                a.put("ImageDecoder.coarse_scale", this.b.e(size));
                a.put("ImageDecoder.precise_scale", this.b.f(size));
                a.put("ImageDecoder.output_size", this.b.h(size));
                bq.a(b);
            }
            catch (Throwable t) {
                continue;
            }
            break;
        }
    }
    
    @Override
    protected Size a(final FileInputStream fileInputStream) {
        return Size.a(this.a(fileInputStream.getFD()));
    }
    
    @TargetApi(18)
    @Override
    protected Bitmap b(final FileInputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   java/io/FileInputStream.getFD:()Ljava/io/FileDescriptor;
        //     4: astore_2       
        //     5: aload_0        
        //     6: aload_2        
        //     7: invokespecial   com/twitter/library/media/decoder/a.a:(Ljava/io/FileDescriptor;)Landroid/graphics/BitmapFactory$Options;
        //    10: astore_3       
        //    11: lconst_0       
        //    12: lstore          4
        //    14: getstatic       com/twitter/library/media/decoder/a.a:Z
        //    17: ifeq            63
        //    20: invokestatic    java/lang/System.currentTimeMillis:()J
        //    23: lstore          4
        //    25: ldc             "ImageDecoder"
        //    27: new             Ljava/lang/StringBuilder;
        //    30: dup            
        //    31: invokespecial   java/lang/StringBuilder.<init>:()V
        //    34: ldc             "Decoding bitmap with file descriptor "
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    39: aload_2        
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    43: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    46: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    49: pop            
        //    50: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    53: bipush          18
        //    55: if_icmplt       63
        //    58: ldc             "Bitmap Decoding"
        //    60: invokestatic    android/os/Trace.beginSection:(Ljava/lang/String;)V
        //    63: aload_3        
        //    64: aload_0        
        //    65: getfield        com/twitter/library/media/decoder/a.j:Z
        //    68: putfield        android/graphics/BitmapFactory$Options.inMutable:Z
        //    71: aload_0        
        //    72: aload_2        
        //    73: aload_3        
        //    74: invokespecial   com/twitter/library/media/decoder/a.a:(Ljava/io/FileDescriptor;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    77: astore          11
        //    79: getstatic       com/twitter/library/media/decoder/a.a:Z
        //    82: ifeq            160
        //    85: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    88: bipush          18
        //    90: if_icmplt       96
        //    93: invokestatic    android/os/Trace.endSection:()V
        //    96: aload           11
        //    98: ifnull          316
        //   101: invokestatic    java/lang/System.currentTimeMillis:()J
        //   104: lload           4
        //   106: lsub           
        //   107: lstore          26
        //   109: ldc             "ImageDecoder"
        //   111: new             Ljava/lang/StringBuilder;
        //   114: dup            
        //   115: invokespecial   java/lang/StringBuilder.<init>:()V
        //   118: ldc_w           "Decoded "
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: aload_2        
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   128: ldc_w           " in "
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: lload           26
        //   136: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   139: ldc_w           "ms, size: "
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: aload           11
        //   147: invokestatic    com/twitter/internal/android/util/Size.a:(Landroid/graphics/Bitmap;)Lcom/twitter/internal/android/util/Size;
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   153: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   156: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   159: pop            
        //   160: aload           11
        //   162: ifnull          624
        //   165: getstatic       com/twitter/library/media/decoder/a.a:Z
        //   168: ifeq            216
        //   171: invokestatic    java/lang/System.currentTimeMillis:()J
        //   174: lstore          4
        //   176: ldc             "ImageDecoder"
        //   178: new             Ljava/lang/StringBuilder;
        //   181: dup            
        //   182: invokespecial   java/lang/StringBuilder.<init>:()V
        //   185: ldc_w           "Transforming bitmap with file descriptor "
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: aload_2        
        //   192: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   195: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   198: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   201: pop            
        //   202: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   205: bipush          18
        //   207: if_icmplt       216
        //   210: ldc_w           "Bitmap Transformation"
        //   213: invokestatic    android/os/Trace.beginSection:(Ljava/lang/String;)V
        //   216: lload           4
        //   218: lstore          12
        //   220: aload_0        
        //   221: aload           11
        //   223: aload_3        
        //   224: invokestatic    com/twitter/internal/android/util/Size.a:(Landroid/graphics/BitmapFactory$Options;)Lcom/twitter/internal/android/util/Size;
        //   227: invokespecial   com/twitter/library/media/decoder/a.a:(Landroid/graphics/Bitmap;Lcom/twitter/internal/android/util/Size;)Landroid/graphics/Bitmap;
        //   230: astore          19
        //   232: getstatic       com/twitter/library/media/decoder/a.a:Z
        //   235: ifeq            313
        //   238: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   241: bipush          18
        //   243: if_icmplt       249
        //   246: invokestatic    android/os/Trace.endSection:()V
        //   249: aload           19
        //   251: ifnull          470
        //   254: invokestatic    java/lang/System.currentTimeMillis:()J
        //   257: lload           12
        //   259: lsub           
        //   260: lstore          21
        //   262: ldc             "ImageDecoder"
        //   264: new             Ljava/lang/StringBuilder;
        //   267: dup            
        //   268: invokespecial   java/lang/StringBuilder.<init>:()V
        //   271: ldc_w           "Transformed "
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: aload_2        
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   281: ldc_w           " in "
        //   284: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   287: lload           21
        //   289: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   292: ldc_w           "ms, size: "
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: aload           19
        //   300: invokestatic    com/twitter/internal/android/util/Size.a:(Landroid/graphics/Bitmap;)Lcom/twitter/internal/android/util/Size;
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   306: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   309: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   312: pop            
        //   313: aload           19
        //   315: areturn        
        //   316: ldc             "ImageDecoder"
        //   318: new             Ljava/lang/StringBuilder;
        //   321: dup            
        //   322: invokespecial   java/lang/StringBuilder.<init>:()V
        //   325: ldc_w           "Failed to decode "
        //   328: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   331: aload_2        
        //   332: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   335: ldc_w           "."
        //   338: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   341: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   344: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   347: pop            
        //   348: goto            160
        //   351: astore          6
        //   353: getstatic       com/twitter/library/media/decoder/a.a:Z
        //   356: ifeq            432
        //   359: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   362: bipush          18
        //   364: if_icmplt       370
        //   367: invokestatic    android/os/Trace.endSection:()V
        //   370: iconst_0       
        //   371: ifeq            435
        //   374: invokestatic    java/lang/System.currentTimeMillis:()J
        //   377: lload           4
        //   379: lsub           
        //   380: lstore          8
        //   382: ldc             "ImageDecoder"
        //   384: new             Ljava/lang/StringBuilder;
        //   387: dup            
        //   388: invokespecial   java/lang/StringBuilder.<init>:()V
        //   391: ldc_w           "Decoded "
        //   394: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   397: aload_2        
        //   398: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   401: ldc_w           " in "
        //   404: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   407: lload           8
        //   409: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   412: ldc_w           "ms, size: "
        //   415: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   418: aconst_null    
        //   419: invokestatic    com/twitter/internal/android/util/Size.a:(Landroid/graphics/Bitmap;)Lcom/twitter/internal/android/util/Size;
        //   422: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   425: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   428: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   431: pop            
        //   432: aload           6
        //   434: athrow         
        //   435: ldc             "ImageDecoder"
        //   437: new             Ljava/lang/StringBuilder;
        //   440: dup            
        //   441: invokespecial   java/lang/StringBuilder.<init>:()V
        //   444: ldc_w           "Failed to decode "
        //   447: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   450: aload_2        
        //   451: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   454: ldc_w           "."
        //   457: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   460: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   463: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   466: pop            
        //   467: goto            432
        //   470: ldc             "ImageDecoder"
        //   472: new             Ljava/lang/StringBuilder;
        //   475: dup            
        //   476: invokespecial   java/lang/StringBuilder.<init>:()V
        //   479: ldc_w           "Failed to transform "
        //   482: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   485: aload_2        
        //   486: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   489: ldc_w           "."
        //   492: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   495: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   498: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   501: pop            
        //   502: aload           19
        //   504: areturn        
        //   505: astore          14
        //   507: getstatic       com/twitter/library/media/decoder/a.a:Z
        //   510: ifeq            586
        //   513: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   516: bipush          18
        //   518: if_icmplt       524
        //   521: invokestatic    android/os/Trace.endSection:()V
        //   524: iconst_0       
        //   525: ifeq            589
        //   528: invokestatic    java/lang/System.currentTimeMillis:()J
        //   531: lload           12
        //   533: lsub           
        //   534: lstore          16
        //   536: ldc             "ImageDecoder"
        //   538: new             Ljava/lang/StringBuilder;
        //   541: dup            
        //   542: invokespecial   java/lang/StringBuilder.<init>:()V
        //   545: ldc_w           "Transformed "
        //   548: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   551: aload_2        
        //   552: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   555: ldc_w           " in "
        //   558: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   561: lload           16
        //   563: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   566: ldc_w           "ms, size: "
        //   569: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   572: aconst_null    
        //   573: invokestatic    com/twitter/internal/android/util/Size.a:(Landroid/graphics/Bitmap;)Lcom/twitter/internal/android/util/Size;
        //   576: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   579: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   582: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   585: pop            
        //   586: aload           14
        //   588: athrow         
        //   589: ldc             "ImageDecoder"
        //   591: new             Ljava/lang/StringBuilder;
        //   594: dup            
        //   595: invokespecial   java/lang/StringBuilder.<init>:()V
        //   598: ldc_w           "Failed to transform "
        //   601: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   604: aload_2        
        //   605: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   608: ldc_w           "."
        //   611: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   614: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   617: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   620: pop            
        //   621: goto            586
        //   624: aconst_null    
        //   625: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  63     79     351    470    Any
        //  220    232    505    624    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0249:
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
}
