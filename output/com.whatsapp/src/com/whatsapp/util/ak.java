// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.File;

public class ak
{
    private static final String[] z;
    private File a;
    private int b;
    private int c;
    private int d;
    private long e;
    private int f;
    
    static {
        final String[] z2 = new String[10];
        String s = "Lq<d!\r4:qi\u0011q{";
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
                        c2 = '\u0001';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = 'Q';
                        break;
                    }
                    case 2: {
                        c2 = 'S';
                        break;
                    }
                    case 3: {
                        c2 = '\u0016';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Lq<d!\r4:qi\u0011q{";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001387sn\b4'w.\u00060=xn\u0011q#ws\u00164sah\u0001%;6)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001387sn\b4'w.\u00060=xn\u0011q4suE7!wl\u0000";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001387sn\b4'w.\u00060=xn\u0011q#dn\u00064 e!\u00038?s;";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001387sn\b4'w.\u00060=xn\u0011q#ws\u00164srt\u00170'\u007fn\u000bk";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001387sn\b4'w.\u000b>srt\u00170'\u007fn\u000bk";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Lq";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001387sn\b4'w.\u0007076v\f5'~!M";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Lq";
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
    
    public ak(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //     9: new             Landroid/media/MediaMetadataRetriever;
        //    12: dup            
        //    13: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //    16: astore_2       
        //    17: aload_2        
        //    18: aload_1        
        //    19: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    22: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Ljava/lang/String;)V
        //    25: aload_2        
        //    26: bipush          9
        //    28: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //    31: astore          4
        //    33: aload_2        
        //    34: bipush          18
        //    36: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //    39: astore          5
        //    41: aload_2        
        //    42: bipush          19
        //    44: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //    47: astore          6
        //    49: aload_0        
        //    50: aload           4
        //    52: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    55: putfield        com/whatsapp/util/ak.e:J
        //    58: aload_0        
        //    59: getfield        com/whatsapp/util/ak.e:J
        //    62: lconst_0       
        //    63: lcmp           
        //    64: ifne            280
        //    67: new             Ljava/lang/StringBuilder;
        //    70: dup            
        //    71: invokespecial   java/lang/StringBuilder.<init>:()V
        //    74: getstatic       com/whatsapp/util/ak.z:[Ljava/lang/String;
        //    77: bipush          6
        //    79: aaload         
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: aload           4
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: ldc             " "
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: aload_0        
        //    94: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //    97: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: ldc             " "
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: aload_0        
        //   109: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   112: invokevirtual   java/io/File.length:()J
        //   115: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   118: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   121: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   124: aload_2        
        //   125: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   128: new             Lcom/whatsapp/util/ag;
        //   131: dup            
        //   132: invokespecial   com/whatsapp/util/ag.<init>:()V
        //   135: athrow         
        //   136: astore_3       
        //   137: new             Ljava/lang/StringBuilder;
        //   140: dup            
        //   141: invokespecial   java/lang/StringBuilder.<init>:()V
        //   144: getstatic       com/whatsapp/util/ak.z:[Ljava/lang/String;
        //   147: iconst_4       
        //   148: aaload         
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: aload_0        
        //   153: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   156: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   159: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   162: ldc             " "
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: aload_0        
        //   168: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   171: invokevirtual   java/io/File.length:()J
        //   174: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   177: ldc             " "
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: aload_0        
        //   183: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   186: invokevirtual   java/io/File.exists:()Z
        //   189: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   192: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   195: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   198: aload_2        
        //   199: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   202: new             Lcom/whatsapp/util/ag;
        //   205: dup            
        //   206: invokespecial   com/whatsapp/util/ag.<init>:()V
        //   209: athrow         
        //   210: astore          7
        //   212: new             Ljava/lang/StringBuilder;
        //   215: dup            
        //   216: invokespecial   java/lang/StringBuilder.<init>:()V
        //   219: getstatic       com/whatsapp/util/ak.z:[Ljava/lang/String;
        //   222: iconst_5       
        //   223: aaload         
        //   224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   227: aload           4
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: ldc             " "
        //   234: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   237: aload_0        
        //   238: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   241: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   244: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   247: ldc             " "
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: aload_0        
        //   253: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   256: invokevirtual   java/io/File.length:()J
        //   259: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   262: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   265: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   268: aload_2        
        //   269: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   272: new             Lcom/whatsapp/util/ag;
        //   275: dup            
        //   276: invokespecial   com/whatsapp/util/ag.<init>:()V
        //   279: athrow         
        //   280: aload_0        
        //   281: aload           5
        //   283: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   286: putfield        com/whatsapp/util/ak.c:I
        //   289: aload_0        
        //   290: aload           6
        //   292: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   295: putfield        com/whatsapp/util/ak.b:I
        //   298: aload_0        
        //   299: aload_2        
        //   300: bipush          20
        //   302: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   305: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   308: putfield        com/whatsapp/util/ak.f:I
        //   311: aload_0        
        //   312: aload_2        
        //   313: bipush          24
        //   315: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   318: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   321: putfield        com/whatsapp/util/ak.d:I
        //   324: aload_2        
        //   325: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   328: return         
        //   329: astore          8
        //   331: new             Ljava/lang/StringBuilder;
        //   334: dup            
        //   335: invokespecial   java/lang/StringBuilder.<init>:()V
        //   338: getstatic       com/whatsapp/util/ak.z:[Ljava/lang/String;
        //   341: iconst_2       
        //   342: aaload         
        //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   346: aload           5
        //   348: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   351: getstatic       com/whatsapp/util/ak.z:[Ljava/lang/String;
        //   354: iconst_1       
        //   355: aaload         
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: aload           6
        //   361: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   364: getstatic       com/whatsapp/util/ak.z:[Ljava/lang/String;
        //   367: bipush          7
        //   369: aaload         
        //   370: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   373: aload_0        
        //   374: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   377: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   380: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   383: ldc             " "
        //   385: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   388: aload_0        
        //   389: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   392: invokevirtual   java/io/File.length:()J
        //   395: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   398: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   401: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   404: aload_2        
        //   405: lconst_0       
        //   406: invokevirtual   android/media/MediaMetadataRetriever.getFrameAtTime:(J)Landroid/graphics/Bitmap;
        //   409: astore          19
        //   411: aload           19
        //   413: astore          10
        //   415: aload           10
        //   417: ifnull          448
        //   420: aload_0        
        //   421: aload           10
        //   423: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   426: putfield        com/whatsapp/util/ak.c:I
        //   429: aload_0        
        //   430: aload           10
        //   432: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   435: putfield        com/whatsapp/util/ak.b:I
        //   438: getstatic       com/whatsapp/util/Log.l:Z
        //   441: istore          13
        //   443: iload           13
        //   445: ifeq            512
        //   448: new             Ljava/lang/StringBuilder;
        //   451: dup            
        //   452: invokespecial   java/lang/StringBuilder.<init>:()V
        //   455: getstatic       com/whatsapp/util/ak.z:[Ljava/lang/String;
        //   458: iconst_3       
        //   459: aaload         
        //   460: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   463: aload_0        
        //   464: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   467: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   470: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   473: ldc             " "
        //   475: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   478: aload_0        
        //   479: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   482: invokevirtual   java/io/File.length:()J
        //   485: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   488: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   491: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   494: new             Lcom/whatsapp/util/ag;
        //   497: dup            
        //   498: invokespecial   com/whatsapp/util/ag.<init>:()V
        //   501: athrow         
        //   502: astore          11
        //   504: aload           11
        //   506: athrow         
        //   507: astore          12
        //   509: aload           12
        //   511: athrow         
        //   512: aload_0        
        //   513: getfield        com/whatsapp/util/ak.c:I
        //   516: ifeq            530
        //   519: aload_0        
        //   520: getfield        com/whatsapp/util/ak.b:I
        //   523: istore          15
        //   525: iload           15
        //   527: ifne            298
        //   530: new             Ljava/lang/StringBuilder;
        //   533: dup            
        //   534: invokespecial   java/lang/StringBuilder.<init>:()V
        //   537: getstatic       com/whatsapp/util/ak.z:[Ljava/lang/String;
        //   540: bipush          8
        //   542: aaload         
        //   543: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   546: aload           5
        //   548: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   551: getstatic       com/whatsapp/util/ak.z:[Ljava/lang/String;
        //   554: iconst_0       
        //   555: aaload         
        //   556: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   559: aload           6
        //   561: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   564: getstatic       com/whatsapp/util/ak.z:[Ljava/lang/String;
        //   567: bipush          9
        //   569: aaload         
        //   570: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   573: aload_0        
        //   574: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   577: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   580: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   583: ldc             " "
        //   585: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   588: aload_0        
        //   589: getfield        com/whatsapp/util/ak.a:Ljava/io/File;
        //   592: invokevirtual   java/io/File.length:()J
        //   595: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   598: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   601: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   604: aload_2        
        //   605: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   608: new             Lcom/whatsapp/util/ag;
        //   611: dup            
        //   612: invokespecial   com/whatsapp/util/ag.<init>:()V
        //   615: athrow         
        //   616: astore          14
        //   618: aload           14
        //   620: athrow         
        //   621: astore          18
        //   623: aconst_null    
        //   624: astore          10
        //   626: goto            415
        //   629: astore          9
        //   631: aconst_null    
        //   632: astore          10
        //   634: goto            415
        //   637: astore          17
        //   639: goto            324
        //   642: astore          16
        //   644: goto            311
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  17     25     136    210    Ljava/lang/Exception;
        //  49     58     210    280    Ljava/lang/Exception;
        //  280    298    329    637    Ljava/lang/Exception;
        //  298    311    642    647    Ljava/lang/Exception;
        //  311    324    637    642    Ljava/lang/Exception;
        //  404    411    621    629    Ljava/lang/Exception;
        //  404    411    629    637    Ljava/lang/NoSuchMethodError;
        //  420    443    507    512    Ljava/lang/Exception;
        //  448    502    502    507    Ljava/lang/Exception;
        //  509    512    502    507    Ljava/lang/Exception;
        //  512    525    616    621    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0298:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    public int a() {
        return this.f;
    }
    
    public int b() {
        return this.c;
    }
    
    public int c() {
        return this.d;
    }
    
    public int d() {
        return this.b;
    }
    
    public long e() {
        return this.e;
    }
    
    public boolean f() {
        int n = 640;
        final boolean l = Log.l;
        if (this.c <= n && this.b <= n) {
            final int c = this.c;
            final int b = this.b;
            if (!l) {
                n = c;
                return 3 * (b * n) * (this.e / 1000L) / 8L + 96000L * (this.e / 1000L) / 8L < 1.5 * this.a.length();
            }
        }
        if (this.c < this.b) {
            final int n2 = n * this.c / this.b;
            if (!l) {
                final int n3 = n;
                n = n2;
                final int b = n3;
                return 3 * (b * n) * (this.e / 1000L) / 8L + 96000L * (this.e / 1000L) / 8L < 1.5 * this.a.length();
            }
        }
        final int b = n * this.b / this.c;
        return 3 * (b * n) * (this.e / 1000L) / 8L + 96000L * (this.e / 1000L) / 8L < 1.5 * this.a.length();
    }
}
