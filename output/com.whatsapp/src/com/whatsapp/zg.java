// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;

class zg extends AsyncTask
{
    long a;
    final VideoTimelineView b;
    final int c;
    final float d;
    final float e;
    
    zg(final VideoTimelineView b, final float d, final float e, final int c) {
        this.b = b;
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    protected Void a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Landroid/media/MediaMetadataRetriever;
        //     7: dup            
        //     8: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //    11: astore_3       
        //    12: aload_3        
        //    13: aload_0        
        //    14: getfield        com/whatsapp/zg.b:Lcom/whatsapp/VideoTimelineView;
        //    17: invokestatic    com/whatsapp/VideoTimelineView.b:(Lcom/whatsapp/VideoTimelineView;)Ljava/io/File;
        //    20: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    23: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Ljava/lang/String;)V
        //    26: aload_3        
        //    27: bipush          9
        //    29: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //    32: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    35: lstore          4
        //    37: aload_0        
        //    38: invokestatic    java/lang/System.currentTimeMillis:()J
        //    41: putfield        com/whatsapp/zg.a:J
        //    44: new             Landroid/graphics/RectF;
        //    47: dup            
        //    48: fconst_0       
        //    49: fconst_0       
        //    50: aload_0        
        //    51: getfield        com/whatsapp/zg.d:F
        //    54: aload_0        
        //    55: getfield        com/whatsapp/zg.e:F
        //    58: invokespecial   android/graphics/RectF.<init>:(FFFF)V
        //    61: astore          6
        //    63: new             Landroid/graphics/Rect;
        //    66: dup            
        //    67: invokespecial   android/graphics/Rect.<init>:()V
        //    70: astore          7
        //    72: iconst_0       
        //    73: istore          8
        //    75: iload           8
        //    77: aload_0        
        //    78: getfield        com/whatsapp/zg.c:I
        //    81: if_icmpge       349
        //    84: aload_0        
        //    85: invokevirtual   com/whatsapp/zg.isCancelled:()Z
        //    88: istore          10
        //    90: iload           10
        //    92: ifeq            102
        //    95: aconst_null    
        //    96: areturn        
        //    97: astore          9
        //    99: aload           9
        //   101: athrow         
        //   102: ldc2_w          1000
        //   105: lload           4
        //   107: lmul           
        //   108: iload           8
        //   110: i2l            
        //   111: lmul           
        //   112: aload_0        
        //   113: getfield        com/whatsapp/zg.c:I
        //   116: i2l            
        //   117: ldiv           
        //   118: lstore          11
        //   120: aload_3        
        //   121: lload           11
        //   123: invokevirtual   android/media/MediaMetadataRetriever.getFrameAtTime:(J)Landroid/graphics/Bitmap;
        //   126: astore          25
        //   128: aload           25
        //   130: astore          14
        //   132: aload           14
        //   134: ifnull          386
        //   137: aload           14
        //   139: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   142: istore          17
        //   144: aload           14
        //   146: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   149: istore          18
        //   151: iload           17
        //   153: i2f            
        //   154: fstore          19
        //   156: fload           19
        //   158: aload_0        
        //   159: getfield        com/whatsapp/zg.d:F
        //   162: fcmpl          
        //   163: ifle            386
        //   166: iload           18
        //   168: i2f            
        //   169: fstore          21
        //   171: aload_0        
        //   172: getfield        com/whatsapp/zg.e:F
        //   175: fstore          22
        //   177: fload           21
        //   179: fload           22
        //   181: fcmpl          
        //   182: ifle            386
        //   185: aload_0        
        //   186: getfield        com/whatsapp/zg.d:F
        //   189: f2i            
        //   190: aload_0        
        //   191: getfield        com/whatsapp/zg.e:F
        //   194: f2i            
        //   195: aload           14
        //   197: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //   200: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   203: astore          15
        //   205: iload           17
        //   207: iload           18
        //   209: if_icmple       254
        //   212: aload           7
        //   214: iconst_0       
        //   215: putfield        android/graphics/Rect.top:I
        //   218: aload           7
        //   220: iload           18
        //   222: putfield        android/graphics/Rect.bottom:I
        //   225: aload           7
        //   227: iload           17
        //   229: iload           18
        //   231: isub           
        //   232: iconst_2       
        //   233: idiv           
        //   234: putfield        android/graphics/Rect.left:I
        //   237: aload           7
        //   239: iload           18
        //   241: aload           7
        //   243: getfield        android/graphics/Rect.left:I
        //   246: iadd           
        //   247: putfield        android/graphics/Rect.right:I
        //   250: iload_2        
        //   251: ifeq            292
        //   254: aload           7
        //   256: iconst_0       
        //   257: putfield        android/graphics/Rect.left:I
        //   260: aload           7
        //   262: iload           17
        //   264: putfield        android/graphics/Rect.right:I
        //   267: aload           7
        //   269: iload           18
        //   271: iload           17
        //   273: isub           
        //   274: iconst_2       
        //   275: idiv           
        //   276: putfield        android/graphics/Rect.top:I
        //   279: aload           7
        //   281: iload           17
        //   283: aload           7
        //   285: getfield        android/graphics/Rect.top:I
        //   288: iadd           
        //   289: putfield        android/graphics/Rect.bottom:I
        //   292: new             Landroid/graphics/Canvas;
        //   295: dup            
        //   296: aload           15
        //   298: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   301: aload           14
        //   303: aload           7
        //   305: aload           6
        //   307: aload_0        
        //   308: getfield        com/whatsapp/zg.b:Lcom/whatsapp/VideoTimelineView;
        //   311: invokestatic    com/whatsapp/VideoTimelineView.c:(Lcom/whatsapp/VideoTimelineView;)Landroid/graphics/Paint;
        //   314: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
        //   317: aload           15
        //   319: aload           14
        //   321: if_acmpeq       329
        //   324: aload           14
        //   326: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   329: aload_0        
        //   330: iconst_1       
        //   331: anewarray       Landroid/graphics/Bitmap;
        //   334: dup            
        //   335: iconst_0       
        //   336: aload           15
        //   338: aastore        
        //   339: invokevirtual   com/whatsapp/zg.publishProgress:([Ljava/lang/Object;)V
        //   342: iinc            8, 1
        //   345: iload_2        
        //   346: ifeq            75
        //   349: aload_3        
        //   350: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   353: aconst_null    
        //   354: areturn        
        //   355: astore          20
        //   357: aload           20
        //   359: athrow         
        //   360: astore          23
        //   362: aload           23
        //   364: athrow         
        //   365: astore          16
        //   367: aload           16
        //   369: athrow         
        //   370: astore          24
        //   372: aconst_null    
        //   373: astore          14
        //   375: goto            132
        //   378: astore          13
        //   380: aconst_null    
        //   381: astore          14
        //   383: goto            132
        //   386: aload           14
        //   388: astore          15
        //   390: goto            317
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  84     90     97     102    Ljava/lang/Exception;
        //  120    128    370    378    Ljava/lang/Exception;
        //  120    128    378    386    Ljava/lang/NoSuchMethodError;
        //  156    166    355    360    Ljava/lang/Exception;
        //  171    177    355    360    Ljava/lang/Exception;
        //  212    250    360    365    Ljava/lang/Exception;
        //  254    292    360    365    Ljava/lang/Exception;
        //  324    329    365    370    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 197, Size: 197
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    protected void a(final Void void1) {
        this.b.invalidate();
    }
    
    protected void a(final Bitmap[] array) {
        final boolean i = App.I;
        final int length = array.length;
        int j = 0;
        while (j < length) {
            VideoTimelineView.a(this.b).add(array[j]);
            ++j;
            if (i) {
                break;
            }
        }
        if (System.currentTimeMillis() > 500L + this.a) {
            this.a = System.currentTimeMillis();
            this.b.invalidate();
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Void)o);
    }
    
    protected void onProgressUpdate(final Object[] array) {
        this.a((Bitmap[])array);
    }
}
