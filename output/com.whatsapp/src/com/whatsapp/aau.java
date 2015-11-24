// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.bi;

class aau implements Runnable
{
    private static final String[] z;
    int a;
    final Conversation b;
    final bi c;
    final Handler d;
    
    static {
        final String[] z2 = new String[3];
        String s = "\r#Zu";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
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
                        c2 = '#';
                        break;
                    }
                    case 1: {
                        c2 = 'I';
                        break;
                    }
                    case 2: {
                        c2 = '*';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0003a";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "W,Yf5@%E|}\u000e";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    aau(final Conversation b, final bi c, final Handler d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = 0;
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
        //     4: new             Lcom/whatsapp/protocol/bi;
        //     7: dup            
        //     8: new             Lcom/whatsapp/protocol/c6;
        //    11: dup            
        //    12: aload_0        
        //    13: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //    16: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    19: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    22: aload_0        
        //    23: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //    26: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    29: getfield        com/whatsapp/protocol/c6.b:Z
        //    32: new             Ljava/lang/StringBuilder;
        //    35: dup            
        //    36: invokespecial   java/lang/StringBuilder.<init>:()V
        //    39: getstatic       com/whatsapp/aau.z:[Ljava/lang/String;
        //    42: iconst_2       
        //    43: aaload         
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: invokestatic    java/lang/System.currentTimeMillis:()J
        //    50: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //    53: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    56: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    59: invokespecial   com/whatsapp/protocol/c6.<init>:(Ljava/lang/String;ZLjava/lang/String;)V
        //    62: invokespecial   com/whatsapp/protocol/bi.<init>:(Lcom/whatsapp/protocol/c6;)V
        //    65: astore_2       
        //    66: aload_2        
        //    67: aload_0        
        //    68: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //    71: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //    74: putfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //    77: aload_0        
        //    78: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //    81: getfield        com/whatsapp/protocol/bi.n:I
        //    84: ifne            102
        //    87: aload_2        
        //    88: aload_0        
        //    89: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //    92: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //    95: invokevirtual   com/whatsapp/protocol/bi.b:(Ljava/lang/String;)V
        //    98: iload_1        
        //    99: ifeq            113
        //   102: aload_2        
        //   103: aload_0        
        //   104: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   107: invokevirtual   com/whatsapp/protocol/bi.d:()[B
        //   110: invokevirtual   com/whatsapp/protocol/bi.a:([B)V
        //   113: aload_2        
        //   114: aload_0        
        //   115: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   118: getfield        com/whatsapp/protocol/bi.u:J
        //   121: putfield        com/whatsapp/protocol/bi.u:J
        //   124: aload_2        
        //   125: aload_0        
        //   126: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   129: getfield        com/whatsapp/protocol/bi.c:I
        //   132: putfield        com/whatsapp/protocol/bi.c:I
        //   135: aload_2        
        //   136: aload_0        
        //   137: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   140: getfield        com/whatsapp/protocol/bi.p:D
        //   143: putfield        com/whatsapp/protocol/bi.p:D
        //   146: aload_2        
        //   147: aload_0        
        //   148: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   151: getfield        com/whatsapp/protocol/bi.G:D
        //   154: putfield        com/whatsapp/protocol/bi.G:D
        //   157: aload_2        
        //   158: aload_0        
        //   159: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   162: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   165: putfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   168: aload_2        
        //   169: aload_0        
        //   170: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   173: getfield        com/whatsapp/protocol/bi.I:B
        //   176: putfield        com/whatsapp/protocol/bi.I:B
        //   179: aload_2        
        //   180: aload_0        
        //   181: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   184: getfield        com/whatsapp/protocol/bi.o:Ljava/lang/String;
        //   187: putfield        com/whatsapp/protocol/bi.o:Ljava/lang/String;
        //   190: aload_2        
        //   191: aload_0        
        //   192: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   195: getfield        com/whatsapp/protocol/bi.L:J
        //   198: putfield        com/whatsapp/protocol/bi.L:J
        //   201: aload_2        
        //   202: aload_0        
        //   203: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   206: getfield        com/whatsapp/protocol/bi.D:I
        //   209: putfield        com/whatsapp/protocol/bi.D:I
        //   212: aload_2        
        //   213: aload_0        
        //   214: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   217: getfield        com/whatsapp/protocol/bi.E:I
        //   220: putfield        com/whatsapp/protocol/bi.E:I
        //   223: aload_2        
        //   224: aload_0        
        //   225: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   228: getfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //   231: putfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //   234: aload_2        
        //   235: aload_0        
        //   236: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   239: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   242: putfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   245: aload_0        
        //   246: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   249: getfield        com/whatsapp/protocol/bi.I:B
        //   252: ifne            296
        //   255: aload_2        
        //   256: new             Ljava/lang/StringBuilder;
        //   259: dup            
        //   260: invokespecial   java/lang/StringBuilder.<init>:()V
        //   263: aload_2        
        //   264: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   267: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   270: getstatic       com/whatsapp/aau.z:[Ljava/lang/String;
        //   273: iconst_1       
        //   274: aaload         
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   278: aload_0        
        //   279: getfield        com/whatsapp/aau.a:I
        //   282: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   285: ldc             ")"
        //   287: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   290: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   293: invokevirtual   com/whatsapp/protocol/bi.b:(Ljava/lang/String;)V
        //   296: aload_0        
        //   297: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   300: getfield        com/whatsapp/protocol/bi.I:B
        //   303: iconst_1       
        //   304: if_icmpne       622
        //   307: aload_0        
        //   308: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   311: invokestatic    com/whatsapp/util/b.a:(Lcom/whatsapp/protocol/bi;)Landroid/graphics/Bitmap;
        //   314: astore          10
        //   316: aload           10
        //   318: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   321: aload           10
        //   323: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   326: aload           10
        //   328: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //   331: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   334: astore          11
        //   336: new             Landroid/graphics/Canvas;
        //   339: dup            
        //   340: aload           11
        //   342: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   345: astore          12
        //   347: new             Landroid/graphics/Paint;
        //   350: dup            
        //   351: invokespecial   android/graphics/Paint.<init>:()V
        //   354: astore          13
        //   356: aload           13
        //   358: iconst_1       
        //   359: invokevirtual   android/graphics/Paint.setAntiAlias:(Z)V
        //   362: aload           13
        //   364: iconst_1       
        //   365: invokevirtual   android/graphics/Paint.setFilterBitmap:(Z)V
        //   368: aload           13
        //   370: iconst_1       
        //   371: invokevirtual   android/graphics/Paint.setDither:(Z)V
        //   374: aload           12
        //   376: aload           10
        //   378: fconst_0       
        //   379: fconst_0       
        //   380: aload           13
        //   382: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
        //   385: new             Landroid/text/TextPaint;
        //   388: dup            
        //   389: invokespecial   android/text/TextPaint.<init>:()V
        //   392: astore          14
        //   394: aload           14
        //   396: iconst_1       
        //   397: invokevirtual   android/text/TextPaint.setAntiAlias:(Z)V
        //   400: aload           14
        //   402: iconst_m1      
        //   403: invokevirtual   android/text/TextPaint.setColor:(I)V
        //   406: aload           14
        //   408: ldc             36.0
        //   410: invokevirtual   android/text/TextPaint.setTextSize:(F)V
        //   413: aload           14
        //   415: getstatic       android/graphics/Typeface.DEFAULT_BOLD:Landroid/graphics/Typeface;
        //   418: invokevirtual   android/text/TextPaint.setTypeface:(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
        //   421: pop            
        //   422: aload           14
        //   424: getstatic       android/graphics/Paint$Align.CENTER:Landroid/graphics/Paint$Align;
        //   427: invokevirtual   android/text/TextPaint.setTextAlign:(Landroid/graphics/Paint$Align;)V
        //   430: aload           12
        //   432: aload_0        
        //   433: getfield        com/whatsapp/aau.a:I
        //   436: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   439: aload           10
        //   441: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   444: iconst_2       
        //   445: idiv           
        //   446: i2f            
        //   447: aload           10
        //   449: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   452: iconst_2       
        //   453: idiv           
        //   454: i2f            
        //   455: aload           14
        //   457: invokevirtual   android/graphics/Canvas.drawText:(Ljava/lang/String;FFLandroid/graphics/Paint;)V
        //   460: new             Ljava/io/ByteArrayOutputStream;
        //   463: dup            
        //   464: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   467: astore          16
        //   469: aload           11
        //   471: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //   474: bipush          80
        //   476: aload           16
        //   478: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   481: pop            
        //   482: aload           16
        //   484: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   487: astore          18
        //   489: aload           16
        //   491: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   494: aload_2        
        //   495: iconst_1       
        //   496: putfield        com/whatsapp/protocol/bi.n:I
        //   499: aload_2        
        //   500: aload           18
        //   502: invokevirtual   com/whatsapp/protocol/bi.a:([B)V
        //   505: aload_2        
        //   506: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   509: getfield        com/whatsapp/protocol/c6.b:Z
        //   512: ifeq            611
        //   515: new             Lcom/whatsapp/MediaData;
        //   518: dup            
        //   519: invokespecial   com/whatsapp/MediaData.<init>:()V
        //   522: astore          19
        //   524: invokestatic    com/whatsapp/util/br.c:()Ljava/lang/String;
        //   527: astore          20
        //   529: aload           19
        //   531: new             Ljava/lang/StringBuilder;
        //   534: dup            
        //   535: invokespecial   java/lang/StringBuilder.<init>:()V
        //   538: aload           20
        //   540: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   543: getstatic       com/whatsapp/aau.z:[Ljava/lang/String;
        //   546: iconst_0       
        //   547: aaload         
        //   548: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   551: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   554: iconst_1       
        //   555: iconst_1       
        //   556: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;BZ)Ljava/io/File;
        //   559: putfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   562: aload_2        
        //   563: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   566: checkcast       Lcom/whatsapp/MediaData;
        //   569: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   572: aload           19
        //   574: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   577: invokestatic    com/whatsapp/util/br.a:(Ljava/io/File;Ljava/io/File;)V
        //   580: aload_0        
        //   581: getfield        com/whatsapp/aau.c:Lcom/whatsapp/protocol/bi;
        //   584: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   587: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   590: aload_2        
        //   591: invokevirtual   com/whatsapp/protocol/bi.d:()[B
        //   594: aload           19
        //   596: aload_2        
        //   597: getfield        com/whatsapp/protocol/bi.I:B
        //   600: aload_2        
        //   601: getfield        com/whatsapp/protocol/bi.E:I
        //   604: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;[BLcom/whatsapp/MediaData;BI)V
        //   607: iload_1        
        //   608: ifeq            618
        //   611: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   614: aload_2        
        //   615: invokevirtual   com/whatsapp/vy.g:(Lcom/whatsapp/protocol/bi;)V
        //   618: iload_1        
        //   619: ifeq            629
        //   622: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   625: aload_2        
        //   626: invokevirtual   com/whatsapp/vy.g:(Lcom/whatsapp/protocol/bi;)V
        //   629: iconst_1       
        //   630: aload_0        
        //   631: getfield        com/whatsapp/aau.a:I
        //   634: iadd           
        //   635: istore          8
        //   637: aload_0        
        //   638: iload           8
        //   640: putfield        com/whatsapp/aau.a:I
        //   643: iload           8
        //   645: iconst_5       
        //   646: if_icmpge       661
        //   649: aload_0        
        //   650: getfield        com/whatsapp/aau.d:Landroid/os/Handler;
        //   653: aload_0        
        //   654: ldc2_w          2000
        //   657: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //   660: pop            
        //   661: return         
        //   662: astore_3       
        //   663: aload_3        
        //   664: athrow         
        //   665: astore          4
        //   667: aload           4
        //   669: athrow         
        //   670: astore          5
        //   672: aload           5
        //   674: athrow         
        //   675: astore          21
        //   677: aload           21
        //   679: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   682: goto            580
        //   685: astore          22
        //   687: aload           22
        //   689: athrow         
        //   690: astore          6
        //   692: aload           6
        //   694: athrow         
        //   695: astore          7
        //   697: aload           7
        //   699: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  66     98     662    665    Ljava/io/IOException;
        //  102    113    665    670    Ljava/io/IOException;
        //  113    296    670    675    Ljava/io/IOException;
        //  562    580    675    685    Ljava/io/IOException;
        //  580    607    685    690    Ljava/io/IOException;
        //  611    618    685    690    Ljava/io/IOException;
        //  622    629    690    695    Ljava/io/IOException;
        //  629    643    695    700    Ljava/io/IOException;
        //  649    661    695    700    Ljava/io/IOException;
        //  663    665    665    670    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 323, Size: 323
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
}
