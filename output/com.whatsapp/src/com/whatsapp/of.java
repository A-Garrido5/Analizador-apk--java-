// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;

class of implements Runnable
{
    private static final String[] z;
    final ConversationRowVideo a;
    Drawable b;
    long c;
    MediaData d;
    long e;
    
    static {
        final String[] z2 = new String[2];
        String s = "7+W`\u001b10Vs\u001d$5\u001cb\u001154Za\u0011.6[p\u0019#";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 't';
                        break;
                    }
                    case 0: {
                        c2 = 'A';
                        break;
                    }
                    case 1: {
                        c2 = 'B';
                        break;
                    }
                    case 2: {
                        c2 = '3';
                        break;
                    }
                    case 3: {
                        c2 = '\u0005';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "7+W`\u001b10Vs\u001d$5\u001cb\u001154Za\u0011.6[p\u0019#";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    of(final ConversationRowVideo a, final MediaData d) {
        this.a = a;
        this.e = 1000000L;
        this.d = d;
    }
    
    void a() {
        ConversationRowVideo.a().post((Runnable)new al3(this));
        this.a.post((Runnable)new a9x(this));
    }
    
    @TargetApi(10)
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: iconst_0       
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/App.I:Z
        //     7: istore_3       
        //     8: aload_0        
        //     9: getfield        com/whatsapp/of.d:Lcom/whatsapp/MediaData;
        //    12: ifnull          100
        //    15: aload_0        
        //    16: getfield        com/whatsapp/of.d:Lcom/whatsapp/MediaData;
        //    19: astore          10
        //    21: aload_0        
        //    22: getfield        com/whatsapp/of.a:Lcom/whatsapp/ConversationRowVideo;
        //    25: getfield        com/whatsapp/ConversationRowVideo.m:Lcom/whatsapp/protocol/bi;
        //    28: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    31: astore          11
        //    33: aload           10
        //    35: aload           11
        //    37: if_acmpne       100
        //    40: aload_0        
        //    41: getfield        com/whatsapp/of.a:Lcom/whatsapp/ConversationRowVideo;
        //    44: invokevirtual   com/whatsapp/ConversationRowVideo.isShown:()Z
        //    47: istore          12
        //    49: iload           12
        //    51: ifeq            100
        //    54: aload_0        
        //    55: getfield        com/whatsapp/of.a:Lcom/whatsapp/ConversationRowVideo;
        //    58: invokestatic    com/whatsapp/ConversationRowVideo.a:(Lcom/whatsapp/ConversationRowVideo;)Lcom/whatsapp/of;
        //    61: astore          13
        //    63: aload           13
        //    65: aload_0        
        //    66: if_acmpne       100
        //    69: aload_0        
        //    70: getfield        com/whatsapp/of.d:Lcom/whatsapp/MediaData;
        //    73: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    76: astore          14
        //    78: aload           14
        //    80: ifnull          100
        //    83: aload_0        
        //    84: getfield        com/whatsapp/of.d:Lcom/whatsapp/MediaData;
        //    87: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    90: invokevirtual   java/io/File.exists:()Z
        //    93: istore          15
        //    95: iload           15
        //    97: ifne            135
        //   100: aload_0        
        //   101: invokevirtual   com/whatsapp/of.a:()V
        //   104: return         
        //   105: astore          4
        //   107: aload           4
        //   109: athrow         
        //   110: astore          5
        //   112: aload           5
        //   114: athrow         
        //   115: astore          6
        //   117: aload           6
        //   119: athrow         
        //   120: astore          7
        //   122: aload           7
        //   124: athrow         
        //   125: astore          8
        //   127: aload           8
        //   129: athrow         
        //   130: astore          9
        //   132: aload           9
        //   134: athrow         
        //   135: aload_0        
        //   136: getfield        com/whatsapp/of.a:Lcom/whatsapp/ConversationRowVideo;
        //   139: invokevirtual   com/whatsapp/ConversationRowVideo.getDrawingTime:()J
        //   142: lstore          16
        //   144: aload_0        
        //   145: getfield        com/whatsapp/of.c:J
        //   148: lload           16
        //   150: lcmp           
        //   151: ifne            164
        //   154: aload_0        
        //   155: invokevirtual   com/whatsapp/of.a:()V
        //   158: return         
        //   159: astore          18
        //   161: aload           18
        //   163: athrow         
        //   164: aload_0        
        //   165: lload           16
        //   167: putfield        com/whatsapp/of.c:J
        //   170: new             Landroid/media/MediaMetadataRetriever;
        //   173: dup            
        //   174: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //   177: astore          19
        //   179: aload           19
        //   181: aload_0        
        //   182: getfield        com/whatsapp/of.d:Lcom/whatsapp/MediaData;
        //   185: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   188: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   191: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Ljava/lang/String;)V
        //   194: aload           19
        //   196: aload_0        
        //   197: getfield        com/whatsapp/of.e:J
        //   200: invokevirtual   android/media/MediaMetadataRetriever.getFrameAtTime:(J)Landroid/graphics/Bitmap;
        //   203: astore          25
        //   205: aload           19
        //   207: bipush          9
        //   209: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   212: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   215: lstore          26
        //   217: lload           26
        //   219: ldc2_w          2000
        //   222: lcmp           
        //   223: istore          28
        //   225: iconst_0       
        //   226: istore_2       
        //   227: iload           28
        //   229: ifle            469
        //   232: aload_0        
        //   233: getfield        com/whatsapp/of.e:J
        //   236: lstore          32
        //   238: lload           32
        //   240: lload           26
        //   242: ldc2_w          1000
        //   245: lmul           
        //   246: lcmp           
        //   247: ifle            259
        //   250: aload_0        
        //   251: lconst_0       
        //   252: putfield        com/whatsapp/of.e:J
        //   255: iload_3        
        //   256: ifeq            271
        //   259: aload_0        
        //   260: ldc2_w          1000000
        //   263: aload_0        
        //   264: getfield        com/whatsapp/of.e:J
        //   267: ladd           
        //   268: putfield        com/whatsapp/of.e:J
        //   271: iconst_0       
        //   272: istore_2       
        //   273: aload           25
        //   275: ifnull          469
        //   278: aload_0        
        //   279: getfield        com/whatsapp/of.d:Lcom/whatsapp/MediaData;
        //   282: astore          36
        //   284: aload_0        
        //   285: getfield        com/whatsapp/of.a:Lcom/whatsapp/ConversationRowVideo;
        //   288: getfield        com/whatsapp/ConversationRowVideo.m:Lcom/whatsapp/protocol/bi;
        //   291: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   294: astore          37
        //   296: iconst_0       
        //   297: istore_2       
        //   298: aload           36
        //   300: aload           37
        //   302: if_acmpne       469
        //   305: aload_0        
        //   306: getfield        com/whatsapp/of.a:Lcom/whatsapp/ConversationRowVideo;
        //   309: invokevirtual   com/whatsapp/ConversationRowVideo.isShown:()Z
        //   312: istore          38
        //   314: iconst_0       
        //   315: istore_2       
        //   316: iload           38
        //   318: ifeq            469
        //   321: aload_0        
        //   322: getfield        com/whatsapp/of.a:Lcom/whatsapp/ConversationRowVideo;
        //   325: new             Lcom/whatsapp/h7;
        //   328: dup            
        //   329: aload_0        
        //   330: aload           25
        //   332: invokespecial   com/whatsapp/h7.<init>:(Lcom/whatsapp/of;Landroid/graphics/Bitmap;)V
        //   335: invokevirtual   com/whatsapp/ConversationRowVideo.post:(Ljava/lang/Runnable;)Z
        //   338: pop            
        //   339: aload           19
        //   341: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   344: iload_1        
        //   345: ifeq            363
        //   348: invokestatic    com/whatsapp/ConversationRowVideo.a:()Landroid/os/Handler;
        //   351: aload_0        
        //   352: ldc2_w          2000
        //   355: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //   358: pop            
        //   359: iload_3        
        //   360: ifeq            104
        //   363: aload_0        
        //   364: invokevirtual   com/whatsapp/of.a:()V
        //   367: return         
        //   368: astore          21
        //   370: aload           21
        //   372: athrow         
        //   373: astore          29
        //   375: aload           29
        //   377: athrow         
        //   378: astore          30
        //   380: aload           30
        //   382: athrow         
        //   383: astore          31
        //   385: aload           31
        //   387: athrow         
        //   388: astore          23
        //   390: aload           23
        //   392: astore          24
        //   394: iconst_0       
        //   395: istore_1       
        //   396: new             Ljava/lang/StringBuilder;
        //   399: dup            
        //   400: invokespecial   java/lang/StringBuilder.<init>:()V
        //   403: getstatic       com/whatsapp/of.z:[Ljava/lang/String;
        //   406: iconst_0       
        //   407: aaload         
        //   408: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   411: aload           24
        //   413: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   416: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   419: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   422: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   425: goto            339
        //   428: astore          34
        //   430: aload           34
        //   432: athrow         
        //   433: astore          35
        //   435: aload           35
        //   437: athrow         
        //   438: astore          20
        //   440: new             Ljava/lang/StringBuilder;
        //   443: dup            
        //   444: invokespecial   java/lang/StringBuilder.<init>:()V
        //   447: getstatic       com/whatsapp/of.z:[Ljava/lang/String;
        //   450: iload_1        
        //   451: aaload         
        //   452: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   455: aload           20
        //   457: invokevirtual   java/lang/NoSuchMethodError.toString:()Ljava/lang/String;
        //   460: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   463: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   466: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   469: iload_2        
        //   470: istore_1       
        //   471: goto            339
        //   474: astore          39
        //   476: aload           39
        //   478: astore          20
        //   480: iload_1        
        //   481: istore_2       
        //   482: goto            440
        //   485: astore          24
        //   487: goto            396
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  8      33     105    110    Ljava/lang/Exception;
        //  40     49     110    115    Ljava/lang/Exception;
        //  54     63     115    120    Ljava/lang/Exception;
        //  69     78     120    125    Ljava/lang/Exception;
        //  83     95     125    130    Ljava/lang/Exception;
        //  100    104    130    135    Ljava/lang/Exception;
        //  107    110    110    115    Ljava/lang/Exception;
        //  112    115    115    120    Ljava/lang/Exception;
        //  117    120    120    125    Ljava/lang/Exception;
        //  122    125    125    130    Ljava/lang/Exception;
        //  127    130    130    135    Ljava/lang/Exception;
        //  144    158    159    164    Ljava/lang/Exception;
        //  179    217    388    396    Ljava/lang/Exception;
        //  179    217    438    440    Ljava/lang/NoSuchMethodError;
        //  232    238    373    378    Ljava/lang/Exception;
        //  232    238    438    440    Ljava/lang/NoSuchMethodError;
        //  250    255    378    383    Ljava/lang/Exception;
        //  250    255    438    440    Ljava/lang/NoSuchMethodError;
        //  259    271    383    388    Ljava/lang/Exception;
        //  259    271    438    440    Ljava/lang/NoSuchMethodError;
        //  278    296    428    433    Ljava/lang/Exception;
        //  278    296    438    440    Ljava/lang/NoSuchMethodError;
        //  305    314    433    438    Ljava/lang/Exception;
        //  305    314    438    440    Ljava/lang/NoSuchMethodError;
        //  321    339    485    490    Ljava/lang/Exception;
        //  321    339    474    485    Ljava/lang/NoSuchMethodError;
        //  348    359    368    373    Ljava/lang/Exception;
        //  363    367    368    373    Ljava/lang/Exception;
        //  375    378    378    383    Ljava/lang/Exception;
        //  375    378    438    440    Ljava/lang/NoSuchMethodError;
        //  380    383    383    388    Ljava/lang/Exception;
        //  380    383    438    440    Ljava/lang/NoSuchMethodError;
        //  385    388    388    396    Ljava/lang/Exception;
        //  385    388    438    440    Ljava/lang/NoSuchMethodError;
        //  430    433    433    438    Ljava/lang/Exception;
        //  430    433    438    440    Ljava/lang/NoSuchMethodError;
        //  435    438    388    396    Ljava/lang/Exception;
        //  435    438    438    440    Ljava/lang/NoSuchMethodError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 241, Size: 241
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
