// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import java.util.Stack;

class a9b extends Thread
{
    private static final String[] z;
    private Stack a;
    final MediaView b;
    
    static {
        final String[] z2 = new String[4];
        String s = "GNNu>G";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Q';
                        break;
                    }
                    case 0: {
                        c2 = '0';
                        break;
                    }
                    case 1: {
                        c2 = '\'';
                        break;
                    }
                    case 2: {
                        c2 = ' ';
                        break;
                    }
                    case 3: {
                        c2 = '\u0011';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "]BDx0FNEf~";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "]BDx0FNEf~VNL}'YBW>3YSMp!\u001fIU}=";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u007fUIt?DFTx>^";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private a9b(final MediaView b) {
        this.b = b;
        this.a = new Stack();
    }
    
    a9b(final MediaView mediaView, final pz pz) {
        this(mediaView);
    }
    
    public void a(final bi bi, final PhotoView photoView) {
        final cf cf = new cf(this, bi, photoView);
        synchronized (this.a) {
            this.a.add(0, cf);
            this.a.notifyAll();
        }
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
        //     4: aload_0        
        //     5: getfield        com/whatsapp/a9b.a:Ljava/util/Stack;
        //     8: invokevirtual   java/util/Stack.size:()I
        //    11: ifne            33
        //    14: aload_0        
        //    15: getfield        com/whatsapp/a9b.a:Ljava/util/Stack;
        //    18: astore          33
        //    20: aload           33
        //    22: monitorenter   
        //    23: aload_0        
        //    24: getfield        com/whatsapp/a9b.a:Ljava/util/Stack;
        //    27: invokevirtual   java/lang/Object.wait:()V
        //    30: aload           33
        //    32: monitorexit    
        //    33: aload_0        
        //    34: getfield        com/whatsapp/a9b.a:Ljava/util/Stack;
        //    37: invokevirtual   java/util/Stack.size:()I
        //    40: ifeq            405
        //    43: aload_0        
        //    44: getfield        com/whatsapp/a9b.a:Ljava/util/Stack;
        //    47: astore          4
        //    49: aload           4
        //    51: monitorenter   
        //    52: aload_0        
        //    53: getfield        com/whatsapp/a9b.a:Ljava/util/Stack;
        //    56: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
        //    59: checkcast       Lcom/whatsapp/cf;
        //    62: astore          6
        //    64: aload           4
        //    66: monitorexit    
        //    67: aload           6
        //    69: getfield        com/whatsapp/cf.b:Lcom/whatsapp/protocol/bi;
        //    72: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    75: checkcast       Lcom/whatsapp/MediaData;
        //    78: astore          7
        //    80: aload           7
        //    82: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    85: ifnull          624
        //    88: aload           6
        //    90: getfield        com/whatsapp/cf.b:Lcom/whatsapp/protocol/bi;
        //    93: getfield        com/whatsapp/protocol/bi.I:B
        //    96: istore          12
        //    98: iload           12
        //   100: iconst_1       
        //   101: if_icmpne       541
        //   104: new             Landroid/graphics/BitmapFactory$Options;
        //   107: dup            
        //   108: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   111: astore          16
        //   113: aload           16
        //   115: iconst_1       
        //   116: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   119: aload           7
        //   121: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   124: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   127: aload           16
        //   129: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   132: pop            
        //   133: aload           16
        //   135: iconst_0       
        //   136: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   139: aload           6
        //   141: getfield        com/whatsapp/cf.c:Lcom/whatsapp/PhotoView;
        //   144: invokevirtual   com/whatsapp/PhotoView.getWidth:()I
        //   147: istore          18
        //   149: aload           6
        //   151: getfield        com/whatsapp/cf.c:Lcom/whatsapp/PhotoView;
        //   154: invokevirtual   com/whatsapp/PhotoView.getHeight:()I
        //   157: istore          19
        //   159: iload           18
        //   161: ifeq            169
        //   164: iload           19
        //   166: ifne            250
        //   169: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   172: getstatic       com/whatsapp/a9b.z:[Ljava/lang/String;
        //   175: iconst_0       
        //   176: aaload         
        //   177: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   180: checkcast       Landroid/view/WindowManager;
        //   183: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   188: astore          20
        //   190: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   193: bipush          13
        //   195: if_icmplt       232
        //   198: new             Landroid/graphics/Point;
        //   201: dup            
        //   202: invokespecial   android/graphics/Point.<init>:()V
        //   205: astore          21
        //   207: aload           20
        //   209: aload           21
        //   211: invokevirtual   android/view/Display.getSize:(Landroid/graphics/Point;)V
        //   214: aload           21
        //   216: getfield        android/graphics/Point.x:I
        //   219: istore          18
        //   221: aload           21
        //   223: getfield        android/graphics/Point.y:I
        //   226: istore          19
        //   228: iload_1        
        //   229: ifeq            250
        //   232: aload           20
        //   234: invokevirtual   android/view/Display.getWidth:()I
        //   237: istore          18
        //   239: aload           20
        //   241: invokevirtual   android/view/Display.getHeight:()I
        //   244: istore          32
        //   246: iload           32
        //   248: istore          19
        //   250: aload           16
        //   252: iconst_1       
        //   253: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   256: iload           18
        //   258: ifle            323
        //   261: iload           19
        //   263: ifle            323
        //   266: aload           16
        //   268: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   271: istore          30
        //   273: aload           16
        //   275: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   278: istore          31
        //   280: iload           30
        //   282: iload           31
        //   284: imul           
        //   285: iconst_4       
        //   286: iload           18
        //   288: iload           19
        //   290: imul           
        //   291: imul           
        //   292: if_icmple       323
        //   295: aload           16
        //   297: iconst_2       
        //   298: aload           16
        //   300: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   303: imul           
        //   304: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   307: iload           18
        //   309: iconst_2       
        //   310: imul           
        //   311: istore          18
        //   313: iload           19
        //   315: iconst_2       
        //   316: imul           
        //   317: istore          19
        //   319: iload_1        
        //   320: ifeq            266
        //   323: aload           7
        //   325: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   328: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   331: aload           16
        //   333: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   336: astore          29
        //   338: aload           29
        //   340: astore          10
        //   342: new             Landroid/media/ExifInterface;
        //   345: dup            
        //   346: aload           7
        //   348: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   351: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   354: invokespecial   android/media/ExifInterface.<init>:(Ljava/lang/String;)V
        //   357: getstatic       com/whatsapp/a9b.z:[Ljava/lang/String;
        //   360: iconst_3       
        //   361: aaload         
        //   362: iconst_1       
        //   363: invokevirtual   android/media/ExifInterface.getAttributeInt:(Ljava/lang/String;I)I
        //   366: istore          27
        //   368: iload           27
        //   370: istore          9
        //   372: aload           10
        //   374: ifnull          405
        //   377: aload           6
        //   379: getfield        com/whatsapp/cf.c:Lcom/whatsapp/PhotoView;
        //   382: astore          11
        //   384: aload_0        
        //   385: getfield        com/whatsapp/a9b.b:Lcom/whatsapp/MediaView;
        //   388: new             Lcom/whatsapp/de;
        //   391: dup            
        //   392: aload_0        
        //   393: iload           9
        //   395: aload           11
        //   397: aload           10
        //   399: invokespecial   com/whatsapp/de.<init>:(Lcom/whatsapp/a9b;ILcom/whatsapp/PhotoView;Landroid/graphics/Bitmap;)V
        //   402: invokevirtual   com/whatsapp/MediaView.runOnUiThread:(Ljava/lang/Runnable;)V
        //   405: invokestatic    java/lang/Thread.interrupted:()Z
        //   408: istore_3       
        //   409: iload_3        
        //   410: ifeq            4
        //   413: aload_0        
        //   414: getfield        com/whatsapp/a9b.a:Ljava/util/Stack;
        //   417: invokevirtual   java/util/Stack.clear:()V
        //   420: return         
        //   421: astore          34
        //   423: aload           33
        //   425: monitorexit    
        //   426: aload           34
        //   428: athrow         
        //   429: astore_2       
        //   430: goto            413
        //   433: astore          5
        //   435: aload           4
        //   437: monitorexit    
        //   438: aload           5
        //   440: athrow         
        //   441: astore          8
        //   443: aload           8
        //   445: athrow         
        //   446: astore          22
        //   448: aload           22
        //   450: athrow         
        //   451: astore          23
        //   453: aload           23
        //   455: athrow         
        //   456: astore          24
        //   458: new             Ljava/lang/StringBuilder;
        //   461: dup            
        //   462: invokespecial   java/lang/StringBuilder.<init>:()V
        //   465: getstatic       com/whatsapp/a9b.z:[Ljava/lang/String;
        //   468: iconst_1       
        //   469: aaload         
        //   470: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   473: aload           24
        //   475: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   478: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   481: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   484: aload_0        
        //   485: getfield        com/whatsapp/a9b.b:Lcom/whatsapp/MediaView;
        //   488: invokevirtual   com/whatsapp/MediaView.e:()V
        //   491: aload           16
        //   493: iconst_2       
        //   494: aload           16
        //   496: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   499: imul           
        //   500: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   503: aload           7
        //   505: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   508: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   511: aload           16
        //   513: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   516: astore          28
        //   518: aload           28
        //   520: astore          10
        //   522: goto            342
        //   525: astore          25
        //   527: aconst_null    
        //   528: astore          10
        //   530: goto            342
        //   533: astore          26
        //   535: iconst_1       
        //   536: istore          9
        //   538: goto            372
        //   541: aload           6
        //   543: getfield        com/whatsapp/cf.b:Lcom/whatsapp/protocol/bi;
        //   546: getfield        com/whatsapp/protocol/bi.I:B
        //   549: istore          13
        //   551: iload           13
        //   553: iconst_3       
        //   554: if_icmpne       624
        //   557: aload           7
        //   559: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   562: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   565: invokestatic    com/whatsapp/util/br.b:(Ljava/lang/String;)Landroid/graphics/Bitmap;
        //   568: astore          15
        //   570: aload           15
        //   572: astore          10
        //   574: aload           10
        //   576: ifnull          585
        //   579: iconst_1       
        //   580: istore          9
        //   582: goto            372
        //   585: getstatic       com/whatsapp/a9b.z:[Ljava/lang/String;
        //   588: iconst_2       
        //   589: aaload         
        //   590: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   593: goto            579
        //   596: astore          14
        //   598: aload           14
        //   600: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   603: aload_0        
        //   604: getfield        com/whatsapp/a9b.b:Lcom/whatsapp/MediaView;
        //   607: invokevirtual   com/whatsapp/MediaView.e:()V
        //   610: iconst_1       
        //   611: istore          9
        //   613: goto            372
        //   616: astore          14
        //   618: aconst_null    
        //   619: astore          10
        //   621: goto            598
        //   624: iconst_1       
        //   625: istore          9
        //   627: aconst_null    
        //   628: astore          10
        //   630: goto            372
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      23     429    433    Ljava/lang/InterruptedException;
        //  23     33     421    429    Any
        //  33     52     429    433    Ljava/lang/InterruptedException;
        //  52     67     433    441    Any
        //  67     80     429    433    Ljava/lang/InterruptedException;
        //  80     98     441    446    Ljava/lang/OutOfMemoryError;
        //  80     98     429    433    Ljava/lang/InterruptedException;
        //  104    159    429    433    Ljava/lang/InterruptedException;
        //  169    228    429    433    Ljava/lang/InterruptedException;
        //  232    246    429    433    Ljava/lang/InterruptedException;
        //  250    256    446    451    Ljava/lang/OutOfMemoryError;
        //  250    256    429    433    Ljava/lang/InterruptedException;
        //  266    280    451    456    Ljava/lang/OutOfMemoryError;
        //  266    280    429    433    Ljava/lang/InterruptedException;
        //  295    307    429    433    Ljava/lang/InterruptedException;
        //  323    338    456    533    Ljava/lang/OutOfMemoryError;
        //  323    338    429    433    Ljava/lang/InterruptedException;
        //  342    368    533    541    Ljava/io/IOException;
        //  342    368    429    433    Ljava/lang/InterruptedException;
        //  377    405    429    433    Ljava/lang/InterruptedException;
        //  405    409    429    433    Ljava/lang/InterruptedException;
        //  423    426    421    429    Any
        //  426    429    429    433    Ljava/lang/InterruptedException;
        //  435    438    433    441    Any
        //  438    441    429    433    Ljava/lang/InterruptedException;
        //  443    446    429    433    Ljava/lang/InterruptedException;
        //  448    451    451    456    Ljava/lang/OutOfMemoryError;
        //  448    451    429    433    Ljava/lang/InterruptedException;
        //  453    456    429    433    Ljava/lang/InterruptedException;
        //  458    503    429    433    Ljava/lang/InterruptedException;
        //  503    518    525    533    Ljava/lang/OutOfMemoryError;
        //  503    518    429    433    Ljava/lang/InterruptedException;
        //  541    551    429    433    Ljava/lang/InterruptedException;
        //  557    570    616    624    Ljava/lang/OutOfMemoryError;
        //  557    570    429    433    Ljava/lang/InterruptedException;
        //  585    593    596    598    Ljava/lang/OutOfMemoryError;
        //  585    593    429    433    Ljava/lang/InterruptedException;
        //  598    610    429    433    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 293, Size: 293
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
