// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

class a5 extends Thread
{
    private static final String[] z;
    final b a;
    
    static {
        final String[] z2 = new String[10];
        String s = "v\u0011(&B|\u0011/=Vv\u0016(!Ki\u0011:1\fx\u00158=F;\u000743W;\u00072/F!";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = '\u001b';
                        break;
                    }
                    case 1: {
                        c2 = 't';
                        break;
                    }
                    case 2: {
                        c2 = '[';
                        break;
                    }
                    case 3: {
                        c2 = 'U';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ";\u0007:8Sw\u0011a";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ";\u00174 MoN";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "v\u0011(&B|\u0011/=Vv\u0016(!Ki\u0011:1\fx\u00158=F;\u001c:'G;\u00072/F!";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "v\u0011(&B|\u0011/=Vv\u0016(!Ki\u0011:1\f\u007f\u00118:G~T=<O~\u00072/F!";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ";\u00174 MoN";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "T\u000620Mo\u0015/<Lu";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = ";\u0003a";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = ";\u0000:'D~\u0000\u0004\"J\u007f\u00003o";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = ";\u001ca";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a5(final b a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //     8: invokestatic    com/whatsapp/util/b.e:(Lcom/whatsapp/util/b;)Lcom/whatsapp/util/cs;
        //    11: invokestatic    com/whatsapp/util/cs.a:(Lcom/whatsapp/util/cs;)Ljava/util/Stack;
        //    14: invokevirtual   java/util/Stack.size:()I
        //    17: ifne            51
        //    20: aload_0        
        //    21: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //    24: invokestatic    com/whatsapp/util/b.e:(Lcom/whatsapp/util/b;)Lcom/whatsapp/util/cs;
        //    27: invokestatic    com/whatsapp/util/cs.a:(Lcom/whatsapp/util/cs;)Ljava/util/Stack;
        //    30: astore          45
        //    32: aload           45
        //    34: monitorenter   
        //    35: aload_0        
        //    36: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //    39: invokestatic    com/whatsapp/util/b.e:(Lcom/whatsapp/util/b;)Lcom/whatsapp/util/cs;
        //    42: invokestatic    com/whatsapp/util/cs.a:(Lcom/whatsapp/util/cs;)Ljava/util/Stack;
        //    45: invokevirtual   java/lang/Object.wait:()V
        //    48: aload           45
        //    50: monitorexit    
        //    51: aload_0        
        //    52: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //    55: invokestatic    com/whatsapp/util/b.e:(Lcom/whatsapp/util/b;)Lcom/whatsapp/util/cs;
        //    58: invokestatic    com/whatsapp/util/cs.a:(Lcom/whatsapp/util/cs;)Ljava/util/Stack;
        //    61: invokevirtual   java/util/Stack.size:()I
        //    64: ifeq            528
        //    67: aload_0        
        //    68: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //    71: invokestatic    com/whatsapp/util/b.e:(Lcom/whatsapp/util/b;)Lcom/whatsapp/util/cs;
        //    74: invokestatic    com/whatsapp/util/cs.a:(Lcom/whatsapp/util/cs;)Ljava/util/Stack;
        //    77: astore          4
        //    79: aload           4
        //    81: monitorenter   
        //    82: aload_0        
        //    83: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //    86: invokestatic    com/whatsapp/util/b.e:(Lcom/whatsapp/util/b;)Lcom/whatsapp/util/cs;
        //    89: invokestatic    com/whatsapp/util/cs.a:(Lcom/whatsapp/util/cs;)Ljava/util/Stack;
        //    92: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
        //    95: checkcast       Lcom/whatsapp/util/as;
        //    98: astore          6
        //   100: aload           4
        //   102: monitorexit    
        //   103: invokestatic    com/whatsapp/util/b.b:()Z
        //   106: ifeq            119
        //   109: ldc2_w          50
        //   112: invokestatic    java/lang/Thread.sleep:(J)V
        //   115: iload_1        
        //   116: ifeq            103
        //   119: aload           6
        //   121: getfield        com/whatsapp/util/as.a:Landroid/widget/ImageView;
        //   124: invokevirtual   android/widget/ImageView.getTag:()Ljava/lang/Object;
        //   127: aload           6
        //   129: getfield        com/whatsapp/util/as.d:Lcom/whatsapp/protocol/bi;
        //   132: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   135: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   138: istore          7
        //   140: aconst_null    
        //   141: astore          8
        //   143: iload           7
        //   145: ifeq            445
        //   148: aload           6
        //   150: getfield        com/whatsapp/util/as.d:Lcom/whatsapp/protocol/bi;
        //   153: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   156: checkcast       Lcom/whatsapp/MediaData;
        //   159: astore          9
        //   161: aconst_null    
        //   162: astore          8
        //   164: aload           9
        //   166: ifnull          445
        //   169: aload           9
        //   171: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   174: astore          18
        //   176: aconst_null    
        //   177: astore          8
        //   179: aload           18
        //   181: ifnull          445
        //   184: aload           9
        //   186: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   189: invokevirtual   java/io/File.exists:()Z
        //   192: istore          19
        //   194: aconst_null    
        //   195: astore          8
        //   197: iload           19
        //   199: ifeq            445
        //   202: aload           6
        //   204: getfield        com/whatsapp/util/as.d:Lcom/whatsapp/protocol/bi;
        //   207: getfield        com/whatsapp/protocol/bi.I:B
        //   210: istore          20
        //   212: iload           20
        //   214: iconst_1       
        //   215: if_icmpne       946
        //   218: new             Landroid/graphics/BitmapFactory$Options;
        //   221: dup            
        //   222: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   225: astore          22
        //   227: aload           22
        //   229: iconst_1       
        //   230: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   233: aload           9
        //   235: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   238: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   241: aload           22
        //   243: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   246: pop            
        //   247: aload           6
        //   249: getfield        com/whatsapp/util/as.c:Lcom/whatsapp/util/ar;
        //   252: invokeinterface com/whatsapp/util/ar.a:()I
        //   257: i2f            
        //   258: invokestatic    com/whatsapp/vc.b:()Lcom/whatsapp/vc;
        //   261: getfield        com/whatsapp/vc.b:F
        //   264: fdiv           
        //   265: f2i            
        //   266: istore          24
        //   268: aload           22
        //   270: iconst_1       
        //   271: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   274: aload           22
        //   276: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   279: istore          25
        //   281: iload           25
        //   283: iconst_2       
        //   284: idiv           
        //   285: iload           24
        //   287: if_icmplt       312
        //   290: iload           25
        //   292: iconst_2       
        //   293: idiv           
        //   294: istore          25
        //   296: aload           22
        //   298: iconst_2       
        //   299: aload           22
        //   301: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   304: imul           
        //   305: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   308: iload_1        
        //   309: ifeq            281
        //   312: aload           22
        //   314: iconst_0       
        //   315: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   318: aload           22
        //   320: iconst_1       
        //   321: putfield        android/graphics/BitmapFactory$Options.inInputShareable:Z
        //   324: aload           22
        //   326: iconst_1       
        //   327: putfield        android/graphics/BitmapFactory$Options.inPurgeable:Z
        //   330: aload           22
        //   332: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   335: istore          26
        //   337: aload           22
        //   339: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   342: istore          27
        //   344: aload           9
        //   346: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   349: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   352: aload           22
        //   354: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   357: astore          44
        //   359: aload           44
        //   361: astore          34
        //   363: aload           34
        //   365: ifnull          441
        //   368: new             Landroid/media/ExifInterface;
        //   371: dup            
        //   372: aload           9
        //   374: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   377: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   380: invokespecial   android/media/ExifInterface.<init>:(Ljava/lang/String;)V
        //   383: getstatic       com/whatsapp/util/a5.z:[Ljava/lang/String;
        //   386: bipush          6
        //   388: aaload         
        //   389: iconst_1       
        //   390: invokevirtual   android/media/ExifInterface.getAttributeInt:(Ljava/lang/String;I)I
        //   393: invokestatic    com/whatsapp/util/br.a:(I)Landroid/graphics/Matrix;
        //   396: astore          36
        //   398: aload           36
        //   400: ifnull          441
        //   403: aload           34
        //   405: iconst_0       
        //   406: iconst_0       
        //   407: aload           34
        //   409: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   412: aload           34
        //   414: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   417: aload           36
        //   419: iconst_1       
        //   420: invokestatic    android/graphics/Bitmap.createBitmap:(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
        //   423: astore          37
        //   425: aload           34
        //   427: aload           37
        //   429: if_acmpeq       437
        //   432: aload           34
        //   434: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   437: aload           37
        //   439: astore          34
        //   441: aload           34
        //   443: astore          8
        //   445: aload           8
        //   447: ifnull          528
        //   450: aload           6
        //   452: getfield        com/whatsapp/util/as.a:Landroid/widget/ImageView;
        //   455: invokevirtual   android/widget/ImageView.getTag:()Ljava/lang/Object;
        //   458: aload           6
        //   460: getfield        com/whatsapp/util/as.d:Lcom/whatsapp/protocol/bi;
        //   463: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   466: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   469: istore          11
        //   471: iload           11
        //   473: ifeq            523
        //   476: new             Lcom/whatsapp/util/a8;
        //   479: dup            
        //   480: aload_0        
        //   481: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //   484: aload           8
        //   486: aload           6
        //   488: getfield        com/whatsapp/util/as.a:Landroid/widget/ImageView;
        //   491: aload           6
        //   493: getfield        com/whatsapp/util/as.d:Lcom/whatsapp/protocol/bi;
        //   496: aload           6
        //   498: getfield        com/whatsapp/util/as.c:Lcom/whatsapp/util/ar;
        //   501: invokespecial   com/whatsapp/util/a8.<init>:(Lcom/whatsapp/util/b;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Lcom/whatsapp/protocol/bi;Lcom/whatsapp/util/ar;)V
        //   504: astore          13
        //   506: aload_0        
        //   507: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //   510: invokestatic    com/whatsapp/util/b.c:(Lcom/whatsapp/util/b;)Landroid/os/Handler;
        //   513: aload           13
        //   515: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   518: pop            
        //   519: iload_1        
        //   520: ifeq            528
        //   523: aload           8
        //   525: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   528: invokestatic    java/lang/Thread.interrupted:()Z
        //   531: istore_3       
        //   532: iload_3        
        //   533: ifeq            4
        //   536: return         
        //   537: astore          46
        //   539: aload           45
        //   541: monitorexit    
        //   542: aload           46
        //   544: athrow         
        //   545: astore_2       
        //   546: return         
        //   547: astore          5
        //   549: aload           4
        //   551: monitorexit    
        //   552: aload           5
        //   554: athrow         
        //   555: astore          15
        //   557: aload           15
        //   559: athrow         
        //   560: astore          16
        //   562: aload           16
        //   564: athrow         
        //   565: astore          17
        //   567: aload           17
        //   569: athrow         
        //   570: astore          28
        //   572: new             Ljava/lang/StringBuilder;
        //   575: dup            
        //   576: invokespecial   java/lang/StringBuilder.<init>:()V
        //   579: getstatic       com/whatsapp/util/a5.z:[Ljava/lang/String;
        //   582: iconst_4       
        //   583: aaload         
        //   584: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   587: aload           9
        //   589: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   592: invokevirtual   java/io/File.length:()J
        //   595: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   598: getstatic       com/whatsapp/util/a5.z:[Ljava/lang/String;
        //   601: bipush          7
        //   603: aaload         
        //   604: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   607: iload           26
        //   609: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   612: getstatic       com/whatsapp/util/a5.z:[Ljava/lang/String;
        //   615: bipush          9
        //   617: aaload         
        //   618: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   621: iload           27
        //   623: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   626: getstatic       com/whatsapp/util/a5.z:[Ljava/lang/String;
        //   629: bipush          8
        //   631: aaload         
        //   632: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   635: iload           24
        //   637: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   640: getstatic       com/whatsapp/util/a5.z:[Ljava/lang/String;
        //   643: iconst_1       
        //   644: aaload         
        //   645: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   648: aload           22
        //   650: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   653: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   656: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   659: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   662: new             Ljava/lang/StringBuilder;
        //   665: dup            
        //   666: invokespecial   java/lang/StringBuilder.<init>:()V
        //   669: getstatic       com/whatsapp/util/a5.z:[Ljava/lang/String;
        //   672: iconst_3       
        //   673: aaload         
        //   674: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   677: aload_0        
        //   678: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //   681: invokestatic    com/whatsapp/util/b.d:(Lcom/whatsapp/util/b;)Landroid/support/v4/util/LruCache;
        //   684: invokevirtual   android/support/v4/util/LruCache.size:()I
        //   687: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   690: getstatic       com/whatsapp/util/a5.z:[Ljava/lang/String;
        //   693: iconst_2       
        //   694: aaload         
        //   695: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   698: aload_0        
        //   699: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //   702: invokestatic    com/whatsapp/util/b.b:(Lcom/whatsapp/util/b;)Ljava/util/HashSet;
        //   705: invokevirtual   java/util/HashSet.size:()I
        //   708: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   711: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   714: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   717: aload_0        
        //   718: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //   721: invokestatic    com/whatsapp/util/b.a:(Lcom/whatsapp/util/b;)Ljava/util/HashMap;
        //   724: invokevirtual   java/util/HashMap.values:()Ljava/util/Collection;
        //   727: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   732: astore          29
        //   734: iconst_0       
        //   735: istore          30
        //   737: iconst_0       
        //   738: istore          31
        //   740: aload           29
        //   742: invokeinterface java/util/Iterator.hasNext:()Z
        //   747: ifeq            1013
        //   750: aload           29
        //   752: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   757: checkcast       Ljava/lang/ref/SoftReference;
        //   760: invokevirtual   java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        //   763: checkcast       Landroid/graphics/Bitmap;
        //   766: astore          39
        //   768: aload           39
        //   770: ifnull          1002
        //   773: aload           39
        //   775: invokevirtual   android/graphics/Bitmap.isRecycled:()Z
        //   778: istore          41
        //   780: iload           41
        //   782: ifne            1002
        //   785: iload           30
        //   787: iconst_1       
        //   788: iadd           
        //   789: istore          42
        //   791: iload           31
        //   793: aload           39
        //   795: invokestatic    com/whatsapp/util/b8.a:(Landroid/graphics/Bitmap;)I
        //   798: sipush          1024
        //   801: idiv           
        //   802: iadd           
        //   803: istore          43
        //   805: iload           42
        //   807: istore          32
        //   809: iload           43
        //   811: istore          33
        //   813: goto            1024
        //   816: new             Ljava/lang/StringBuilder;
        //   819: dup            
        //   820: invokespecial   java/lang/StringBuilder.<init>:()V
        //   823: getstatic       com/whatsapp/util/a5.z:[Ljava/lang/String;
        //   826: iconst_0       
        //   827: aaload         
        //   828: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   831: iload           33
        //   833: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   836: getstatic       com/whatsapp/util/a5.z:[Ljava/lang/String;
        //   839: iconst_5       
        //   840: aaload         
        //   841: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   844: aload_0        
        //   845: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //   848: invokestatic    com/whatsapp/util/b.a:(Lcom/whatsapp/util/b;)Ljava/util/HashMap;
        //   851: invokevirtual   java/util/HashMap.size:()I
        //   854: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   857: ldc_w           " "
        //   860: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   863: iload           32
        //   865: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   868: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   871: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   874: invokestatic    com/whatsapp/App.y:()V
        //   877: aload_0        
        //   878: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //   881: invokestatic    com/whatsapp/util/b.d:(Lcom/whatsapp/util/b;)Landroid/support/v4/util/LruCache;
        //   884: invokevirtual   android/support/v4/util/LruCache.evictAll:()V
        //   887: aload_0        
        //   888: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //   891: invokestatic    com/whatsapp/util/b.b:(Lcom/whatsapp/util/b;)Ljava/util/HashSet;
        //   894: invokevirtual   java/util/HashSet.clear:()V
        //   897: aload_0        
        //   898: getfield        com/whatsapp/util/a5.a:Lcom/whatsapp/util/b;
        //   901: invokestatic    com/whatsapp/util/b.a:(Lcom/whatsapp/util/b;)Ljava/util/HashMap;
        //   904: invokevirtual   java/util/HashMap.clear:()V
        //   907: invokestatic    java/lang/System.gc:()V
        //   910: invokestatic    com/whatsapp/App.y:()V
        //   913: aload           9
        //   915: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   918: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   921: aload           22
        //   923: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   926: astore          34
        //   928: goto            363
        //   931: astore          40
        //   933: aload           40
        //   935: athrow         
        //   936: astore          38
        //   938: aload           38
        //   940: athrow         
        //   941: astore          35
        //   943: goto            441
        //   946: aload           6
        //   948: getfield        com/whatsapp/util/as.d:Lcom/whatsapp/protocol/bi;
        //   951: getfield        com/whatsapp/protocol/bi.I:B
        //   954: istore          21
        //   956: aconst_null    
        //   957: astore          8
        //   959: iload           21
        //   961: iconst_3       
        //   962: if_icmpne       445
        //   965: aload           9
        //   967: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   970: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   973: invokestatic    com/whatsapp/util/br.b:(Ljava/lang/String;)Landroid/graphics/Bitmap;
        //   976: astore          8
        //   978: goto            445
        //   981: astore          10
        //   983: aload           10
        //   985: athrow         
        //   986: astore          12
        //   988: aload           12
        //   990: athrow         
        //   991: iload           33
        //   993: istore          31
        //   995: iload           32
        //   997: istore          30
        //   999: goto            740
        //  1002: iload           30
        //  1004: istore          32
        //  1006: iload           31
        //  1008: istore          33
        //  1010: goto            1024
        //  1013: iload           30
        //  1015: istore          32
        //  1017: iload           31
        //  1019: istore          33
        //  1021: goto            816
        //  1024: iload_1        
        //  1025: ifeq            991
        //  1028: goto            816
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      35     545    547    Ljava/lang/InterruptedException;
        //  35     51     537    545    Any
        //  51     82     545    547    Ljava/lang/InterruptedException;
        //  82     103    547    555    Any
        //  103    115    545    547    Ljava/lang/InterruptedException;
        //  119    140    545    547    Ljava/lang/InterruptedException;
        //  148    161    545    547    Ljava/lang/InterruptedException;
        //  169    176    555    560    Ljava/lang/OutOfMemoryError;
        //  169    176    545    547    Ljava/lang/InterruptedException;
        //  184    194    560    565    Ljava/lang/OutOfMemoryError;
        //  184    194    545    547    Ljava/lang/InterruptedException;
        //  202    212    565    570    Ljava/lang/OutOfMemoryError;
        //  202    212    545    547    Ljava/lang/InterruptedException;
        //  218    281    545    547    Ljava/lang/InterruptedException;
        //  281    308    545    547    Ljava/lang/InterruptedException;
        //  312    344    545    547    Ljava/lang/InterruptedException;
        //  344    359    570    1031   Ljava/lang/OutOfMemoryError;
        //  344    359    545    547    Ljava/lang/InterruptedException;
        //  368    398    941    946    Ljava/io/IOException;
        //  368    398    545    547    Ljava/lang/InterruptedException;
        //  403    425    941    946    Ljava/io/IOException;
        //  403    425    545    547    Ljava/lang/InterruptedException;
        //  432    437    936    941    Ljava/lang/OutOfMemoryError;
        //  432    437    941    946    Ljava/io/IOException;
        //  432    437    545    547    Ljava/lang/InterruptedException;
        //  450    471    981    986    Ljava/lang/OutOfMemoryError;
        //  450    471    545    547    Ljava/lang/InterruptedException;
        //  476    506    545    547    Ljava/lang/InterruptedException;
        //  506    519    986    991    Ljava/lang/OutOfMemoryError;
        //  506    519    545    547    Ljava/lang/InterruptedException;
        //  523    528    986    991    Ljava/lang/OutOfMemoryError;
        //  523    528    545    547    Ljava/lang/InterruptedException;
        //  528    532    545    547    Ljava/lang/InterruptedException;
        //  539    542    537    545    Any
        //  542    545    545    547    Ljava/lang/InterruptedException;
        //  549    552    547    555    Any
        //  552    555    545    547    Ljava/lang/InterruptedException;
        //  557    560    560    565    Ljava/lang/OutOfMemoryError;
        //  557    560    545    547    Ljava/lang/InterruptedException;
        //  562    565    565    570    Ljava/lang/OutOfMemoryError;
        //  562    565    545    547    Ljava/lang/InterruptedException;
        //  567    570    545    547    Ljava/lang/InterruptedException;
        //  572    734    545    547    Ljava/lang/InterruptedException;
        //  740    768    545    547    Ljava/lang/InterruptedException;
        //  773    780    931    936    Ljava/lang/OutOfMemoryError;
        //  773    780    545    547    Ljava/lang/InterruptedException;
        //  791    805    545    547    Ljava/lang/InterruptedException;
        //  816    928    545    547    Ljava/lang/InterruptedException;
        //  933    936    545    547    Ljava/lang/InterruptedException;
        //  938    941    941    946    Ljava/io/IOException;
        //  938    941    545    547    Ljava/lang/InterruptedException;
        //  946    956    545    547    Ljava/lang/InterruptedException;
        //  965    978    545    547    Ljava/lang/InterruptedException;
        //  983    986    545    547    Ljava/lang/InterruptedException;
        //  988    991    545    547    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 456, Size: 456
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
