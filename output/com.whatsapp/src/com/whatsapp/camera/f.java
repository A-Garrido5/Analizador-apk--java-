// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import java.io.File;
import android.os.AsyncTask;

class f extends AsyncTask
{
    private static final String[] z;
    final byte[] a;
    final File b;
    final a c;
    final boolean d;
    
    static {
        final String[] z2 = new String[11];
        String s = "\bG#\u0011\u001d\nG-\u0000\u0006\u001dO:\r@Kc<\u0006\u0000\u0019\u0006-\u0018\u0000\u0018O \u0013O\rO\"\u0011UK";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'o';
                        break;
                    }
                    case 0: {
                        c2 = 'k';
                        break;
                    }
                    case 1: {
                        c2 = '&';
                        break;
                    }
                    case 2: {
                        c2 = 'N';
                        break;
                    }
                    case 3: {
                        c2 = 't';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\bG#\u0011\u001d\nG-\u0000\u0006\u001dO:\r@K`'\u0018\nKH!\u0000O\rI;\u001a\u000bQ\u0006";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\bG#\u0011\u001d\nG-\u0000\u0006\u001dO:\r@Kc<\u0006\u0000\u0019\u0006-\u0018\u0000\u0018O \u0013O\rO\"\u0011UK";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\rJ'\u0004B\u0003";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\bG#\u0011\u001d\nG-\u0000\u0006\u001dO:\r@Kc<\u0006\u0000\u0019\u0006/\u0017\f\u000eU=\u001d\u0001\f\u0006(\u001d\u0003\u000e\u001cn";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\bG#\u0011\u001d\nG-\u0000\u0006\u001dO:\r@Kc<\u0006\u0000\u0019\u0006-\u0018\u0000\u0018O \u0013O\rO\"\u0011UK";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\bG#\u0011\u001d\nG-\u0000\u0006\u001dO:\r@Kc<\u0006\u0000\u0019\u0006-\u0018\u0000\u0018O \u0013O\rO\"\u0011UK";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\bG#\u0011\u001d\nG-\u0000\u0006\u001dO:\r@\rG'\u0018\n\u000f\u0006";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\rJ'\u0004B\u0003";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0002K/\u0013\nD\f";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\nH*\u0006\u0000\u0002B`\u001d\u0001\u001fC \u0000A\u000e^:\u0006\u000eEu\u001a&**k";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    f(final a c, final File b, final byte[] a, final boolean d) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    protected Boolean a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //     3: astore_2       
        //     4: aconst_null    
        //     5: astore_3       
        //     6: new             Ljava/io/FileOutputStream;
        //     9: dup            
        //    10: aload_0        
        //    11: getfield        com/whatsapp/camera/f.b:Ljava/io/File;
        //    14: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    17: astore          4
        //    19: aload           4
        //    21: aload_0        
        //    22: getfield        com/whatsapp/camera/f.a:[B
        //    25: invokevirtual   java/io/FileOutputStream.write:([B)V
        //    28: aload           4
        //    30: ifnull          38
        //    33: aload           4
        //    35: invokevirtual   java/io/FileOutputStream.close:()V
        //    38: aload_2        
        //    39: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    42: ifeq            140
        //    45: aload_0        
        //    46: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //    49: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //    52: invokestatic    com/whatsapp/camera/CameraActivity.x:(Lcom/whatsapp/camera/CameraActivity;)Lcom/whatsapp/a_9;
        //    55: astore          13
        //    57: aload           13
        //    59: ifnull          140
        //    62: aload_0        
        //    63: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //    66: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //    69: invokestatic    com/whatsapp/camera/CameraActivity.f:(Lcom/whatsapp/camera/CameraActivity;)Z
        //    72: istore          14
        //    74: iload           14
        //    76: ifne            140
        //    79: aload_0        
        //    80: getfield        com/whatsapp/camera/f.b:Ljava/io/File;
        //    83: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //    86: astore          15
        //    88: aload_0        
        //    89: getfield        com/whatsapp/camera/f.d:Z
        //    92: ifeq            115
        //    95: aload           15
        //    97: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //   100: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //   103: iconst_3       
        //   104: aaload         
        //   105: ldc             "1"
        //   107: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   110: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   113: astore          15
        //   115: aload_0        
        //   116: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //   119: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //   122: aload_0        
        //   123: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //   126: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //   129: invokestatic    com/whatsapp/camera/CameraActivity.x:(Lcom/whatsapp/camera/CameraActivity;)Lcom/whatsapp/a_9;
        //   132: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   135: aload           15
        //   137: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V
        //   140: aload_2        
        //   141: areturn        
        //   142: astore          21
        //   144: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   147: astore_2       
        //   148: new             Ljava/lang/StringBuilder;
        //   151: dup            
        //   152: invokespecial   java/lang/StringBuilder.<init>:()V
        //   155: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //   158: iconst_0       
        //   159: aaload         
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: aload           21
        //   165: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   174: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   177: goto            38
        //   180: astore          5
        //   182: aconst_null    
        //   183: astore          4
        //   185: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   188: astore          10
        //   190: new             Ljava/lang/StringBuilder;
        //   193: dup            
        //   194: invokespecial   java/lang/StringBuilder.<init>:()V
        //   197: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //   200: iconst_1       
        //   201: aaload         
        //   202: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   205: aload           5
        //   207: invokevirtual   java/io/FileNotFoundException.getMessage:()Ljava/lang/String;
        //   210: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   213: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   216: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   219: aload           4
        //   221: ifnull          506
        //   224: aload           4
        //   226: invokevirtual   java/io/FileOutputStream.close:()V
        //   229: aload           10
        //   231: astore_2       
        //   232: goto            38
        //   235: astore          17
        //   237: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   240: astore_2       
        //   241: new             Ljava/lang/StringBuilder;
        //   244: dup            
        //   245: invokespecial   java/lang/StringBuilder.<init>:()V
        //   248: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //   251: bipush          6
        //   253: aaload         
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: aload           17
        //   259: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   262: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   265: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   268: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   271: goto            38
        //   274: astore          18
        //   276: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   279: astore          19
        //   281: new             Ljava/lang/StringBuilder;
        //   284: dup            
        //   285: invokespecial   java/lang/StringBuilder.<init>:()V
        //   288: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //   291: iconst_4       
        //   292: aaload         
        //   293: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   296: aload           18
        //   298: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   301: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   304: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   307: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   310: aload_3        
        //   311: ifnull          500
        //   314: aload_3        
        //   315: invokevirtual   java/io/FileOutputStream.close:()V
        //   318: aload           19
        //   320: astore_2       
        //   321: goto            38
        //   324: astore          20
        //   326: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   329: astore_2       
        //   330: new             Ljava/lang/StringBuilder;
        //   333: dup            
        //   334: invokespecial   java/lang/StringBuilder.<init>:()V
        //   337: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //   340: iconst_5       
        //   341: aaload         
        //   342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   345: aload           20
        //   347: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   350: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   353: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   356: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   359: goto            38
        //   362: astore          6
        //   364: aload_3        
        //   365: ifnull          372
        //   368: aload_3        
        //   369: invokevirtual   java/io/FileOutputStream.close:()V
        //   372: aload           6
        //   374: athrow         
        //   375: astore          9
        //   377: aload           9
        //   379: athrow         
        //   380: astore          7
        //   382: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   385: pop            
        //   386: new             Ljava/lang/StringBuilder;
        //   389: dup            
        //   390: invokespecial   java/lang/StringBuilder.<init>:()V
        //   393: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //   396: iconst_2       
        //   397: aaload         
        //   398: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   401: aload           7
        //   403: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   406: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   409: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   412: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   415: goto            372
        //   418: astore          11
        //   420: aload           11
        //   422: athrow         
        //   423: astore          12
        //   425: aload           12
        //   427: athrow         
        //   428: astore          16
        //   430: new             Ljava/lang/StringBuilder;
        //   433: dup            
        //   434: invokespecial   java/lang/StringBuilder.<init>:()V
        //   437: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //   440: bipush          7
        //   442: aaload         
        //   443: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   446: aload           16
        //   448: invokevirtual   java/lang/Throwable.toString:()Ljava/lang/String;
        //   451: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   454: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   457: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   460: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   463: areturn        
        //   464: astore          16
        //   466: goto            430
        //   469: astore          16
        //   471: goto            430
        //   474: astore          16
        //   476: goto            430
        //   479: astore          6
        //   481: aload           4
        //   483: astore_3       
        //   484: goto            364
        //   487: astore          18
        //   489: aload           4
        //   491: astore_3       
        //   492: goto            276
        //   495: astore          5
        //   497: goto            185
        //   500: aload           19
        //   502: astore_2       
        //   503: goto            38
        //   506: aload           10
        //   508: astore_2       
        //   509: goto            38
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  6      19     180    185    Ljava/io/FileNotFoundException;
        //  6      19     274    276    Ljava/io/IOException;
        //  6      19     362    364    Any
        //  19     28     495    500    Ljava/io/FileNotFoundException;
        //  19     28     487    495    Ljava/io/IOException;
        //  19     28     479    487    Any
        //  33     38     142    180    Ljava/io/IOException;
        //  38     57     418    423    Ljava/io/IOException;
        //  62     74     423    428    Ljava/io/IOException;
        //  115    140    469    474    Ljava/io/IOException;
        //  115    140    464    469    Ljava/lang/OutOfMemoryError;
        //  115    140    428    430    Lcom/whatsapp/util/av;
        //  115    140    474    479    Ljava/lang/SecurityException;
        //  185    219    479    487    Any
        //  224    229    235    274    Ljava/io/IOException;
        //  276    310    362    364    Any
        //  314    318    324    362    Ljava/io/IOException;
        //  368    372    380    418    Ljava/io/IOException;
        //  368    372    375    380    Ljava/lang/OutOfMemoryError;
        //  420    423    423    428    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 226, Size: 226
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
    
    protected void a(final Boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraActivity.m:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //     8: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //    11: ldc             2131755343
        //    13: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //    16: bipush          8
        //    18: invokevirtual   android/view/View.setVisibility:(I)V
        //    21: aload_1        
        //    22: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    25: ifne            55
        //    28: aload_0        
        //    29: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //    32: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //    35: ldc             2131230866
        //    37: iconst_1       
        //    38: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //    41: aload_0        
        //    42: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //    45: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //    48: invokevirtual   com/whatsapp/camera/CameraActivity.finish:()V
        //    51: iload_2        
        //    52: ifeq            228
        //    55: aload_0        
        //    56: getfield        com/whatsapp/camera/f.b:Ljava/io/File;
        //    59: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //    62: astore          4
        //    64: aload_0        
        //    65: getfield        com/whatsapp/camera/f.d:Z
        //    68: ifeq            92
        //    71: aload           4
        //    73: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //    76: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //    79: bipush          8
        //    81: aaload         
        //    82: ldc             "1"
        //    84: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    87: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //    90: astore          4
        //    92: aload_0        
        //    93: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //    96: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //    99: invokestatic    com/whatsapp/camera/CameraActivity.f:(Lcom/whatsapp/camera/CameraActivity;)Z
        //   102: istore          7
        //   104: iload           7
        //   106: ifeq            125
        //   109: aload_0        
        //   110: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //   113: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //   116: aload           4
        //   118: invokestatic    com/whatsapp/camera/CameraActivity.a:(Lcom/whatsapp/camera/CameraActivity;Landroid/net/Uri;)V
        //   121: iload_2        
        //   122: ifeq            228
        //   125: aload_0        
        //   126: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //   129: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //   132: invokestatic    com/whatsapp/camera/CameraActivity.x:(Lcom/whatsapp/camera/CameraActivity;)Lcom/whatsapp/a_9;
        //   135: astore          8
        //   137: aload           8
        //   139: ifnonnull       201
        //   142: new             Landroid/content/Intent;
        //   145: dup            
        //   146: aload_0        
        //   147: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //   150: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //   153: invokevirtual   com/whatsapp/camera/CameraActivity.getBaseContext:()Landroid/content/Context;
        //   156: ldc             Lcom/whatsapp/ContactPicker;.class
        //   158: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   161: astore          9
        //   163: aload           9
        //   165: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //   168: bipush          9
        //   170: aaload         
        //   171: invokevirtual   android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
        //   174: pop            
        //   175: aload           9
        //   177: getstatic       com/whatsapp/camera/f.z:[Ljava/lang/String;
        //   180: bipush          10
        //   182: aaload         
        //   183: aload           4
        //   185: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   188: pop            
        //   189: aload_0        
        //   190: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //   193: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //   196: aload           9
        //   198: invokevirtual   com/whatsapp/camera/CameraActivity.startActivity:(Landroid/content/Intent;)V
        //   201: aload_0        
        //   202: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //   205: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //   208: aload_0        
        //   209: getfield        com/whatsapp/camera/f.b:Ljava/io/File;
        //   212: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   215: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Landroid/net/Uri;)V
        //   218: aload_0        
        //   219: getfield        com/whatsapp/camera/f.c:Lcom/whatsapp/camera/a;
        //   222: getfield        com/whatsapp/camera/a.a:Lcom/whatsapp/camera/CameraActivity;
        //   225: invokevirtual   com/whatsapp/camera/CameraActivity.finish:()V
        //   228: return         
        //   229: astore_3       
        //   230: aload_3        
        //   231: athrow         
        //   232: astore          5
        //   234: aload           5
        //   236: athrow         
        //   237: astore          6
        //   239: aload           6
        //   241: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  4      51     229    232    Ljava/lang/SecurityException;
        //  92     104    232    237    Ljava/lang/SecurityException;
        //  109    121    237    242    Ljava/lang/SecurityException;
        //  125    137    237    242    Ljava/lang/SecurityException;
        //  234    237    237    242    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 109, Size: 109
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
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Boolean)o);
    }
}
