// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a_l implements View$OnClickListener
{
    private static final String[] z;
    final RecordAudio a;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0017\u0000f\bc\u0001\u0004p\u0003x\nJf\b\u007f\u0011\u0017j\u000b>";
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
                        c2 = '\u0011';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = 'e';
                        break;
                    }
                    case 2: {
                        c2 = '\u0005';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\r\u0004v8a\u0017\u0000s\u000et\u0012";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "+\n%\u0014a\u0004\u0006`";
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
    
    a_l(final RecordAudio a) {
        this.a = a;
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //     4: aload_0        
        //     5: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //     8: aload_0        
        //     9: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    12: invokestatic    com/whatsapp/RecordAudio.g:(Lcom/whatsapp/RecordAudio;)Ljava/lang/String;
        //    15: aload_0        
        //    16: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    19: invokestatic    com/whatsapp/RecordAudio.f:(Lcom/whatsapp/RecordAudio;)Ljava/io/File;
        //    22: iconst_2       
        //    23: aload_0        
        //    24: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    27: invokestatic    com/whatsapp/RecordAudio.b:(Lcom/whatsapp/RecordAudio;)Z
        //    30: invokestatic    com/whatsapp/util/br.a:(Landroid/app/Activity;Lcom/whatsapp/gu;Ljava/lang/String;Ljava/io/File;BZ)Z
        //    33: pop            
        //    34: aload_0        
        //    35: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    38: invokestatic    com/whatsapp/RecordAudio.j:(Lcom/whatsapp/RecordAudio;)Lcom/whatsapp/util/ao;
        //    41: astore          8
        //    43: aload           8
        //    45: ifnull          71
        //    48: aload_0        
        //    49: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    52: invokestatic    com/whatsapp/RecordAudio.j:(Lcom/whatsapp/RecordAudio;)Lcom/whatsapp/util/ao;
        //    55: invokevirtual   com/whatsapp/util/ao.f:()Z
        //    58: ifeq            71
        //    61: aload_0        
        //    62: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    65: invokestatic    com/whatsapp/RecordAudio.j:(Lcom/whatsapp/RecordAudio;)Lcom/whatsapp/util/ao;
        //    68: invokevirtual   com/whatsapp/util/ao.c:()V
        //    71: aload_0        
        //    72: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    75: invokevirtual   com/whatsapp/RecordAudio.finish:()V
        //    78: return         
        //    79: astore          10
        //    81: aload           10
        //    83: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //    86: aload_0        
        //    87: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    90: invokevirtual   com/whatsapp/RecordAudio.getBaseContext:()Landroid/content/Context;
        //    93: ldc             2131231735
        //    95: iconst_0       
        //    96: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //    99: goto            34
        //   102: astore_1       
        //   103: aload_1        
        //   104: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   107: aload_1        
        //   108: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   111: astore          5
        //   113: aload           5
        //   115: ifnull          156
        //   118: aload_1        
        //   119: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   122: getstatic       com/whatsapp/a_l.z:[Ljava/lang/String;
        //   125: iconst_2       
        //   126: aaload         
        //   127: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   130: istore          9
        //   132: iload           9
        //   134: ifeq            156
        //   137: aload_0        
        //   138: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   141: invokevirtual   com/whatsapp/RecordAudio.getBaseContext:()Landroid/content/Context;
        //   144: ldc             2131231078
        //   146: iconst_1       
        //   147: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   150: getstatic       com/whatsapp/App.I:Z
        //   153: ifeq            34
        //   156: aload_0        
        //   157: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   160: invokevirtual   com/whatsapp/RecordAudio.getBaseContext:()Landroid/content/Context;
        //   163: ldc             2131231735
        //   165: iconst_1       
        //   166: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   169: goto            34
        //   172: astore          4
        //   174: aload           4
        //   176: athrow         
        //   177: astore_2       
        //   178: aload_2        
        //   179: athrow         
        //   180: astore_3       
        //   181: aload_3        
        //   182: athrow         
        //   183: astore          6
        //   185: aload           6
        //   187: athrow         
        //   188: astore          7
        //   190: aload           7
        //   192: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      34     79     102    Ljava/io/FileNotFoundException;
        //  0      34     102    183    Ljava/io/IOException;
        //  34     43     183    188    Ljava/io/FileNotFoundException;
        //  48     71     188    193    Ljava/io/FileNotFoundException;
        //  103    113    177    180    Ljava/io/FileNotFoundException;
        //  118    132    180    183    Ljava/io/FileNotFoundException;
        //  137    156    172    177    Ljava/io/FileNotFoundException;
        //  156    169    172    177    Ljava/io/FileNotFoundException;
        //  178    180    180    183    Ljava/io/FileNotFoundException;
        //  181    183    172    177    Ljava/io/FileNotFoundException;
        //  185    188    188    193    Ljava/io/FileNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 92, Size: 92
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
    
    public void onClick(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/a_l.z:[Ljava/lang/String;
        //    14: iconst_0       
        //    15: aaload         
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    19: aload_0        
        //    20: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    23: invokestatic    com/whatsapp/RecordAudio.c:(Lcom/whatsapp/RecordAudio;)I
        //    26: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    29: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    32: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    35: aload_0        
        //    36: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    39: invokestatic    com/whatsapp/RecordAudio.c:(Lcom/whatsapp/RecordAudio;)I
        //    42: istore          6
        //    44: iload           6
        //    46: tableswitch {
        //                0: 99
        //                1: 207
        //                2: 84
        //                3: 227
        //                4: 256
        //                5: 256
        //          default: 84
        //        }
        //    84: aload_0        
        //    85: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    88: aload_0        
        //    89: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //    92: invokestatic    com/whatsapp/RecordAudio.c:(Lcom/whatsapp/RecordAudio;)I
        //    95: invokestatic    com/whatsapp/RecordAudio.c:(Lcom/whatsapp/RecordAudio;I)V
        //    98: return         
        //    99: aload_0        
        //   100: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   103: invokestatic    com/whatsapp/RecordAudio.b:(Lcom/whatsapp/RecordAudio;)Z
        //   106: istore          16
        //   108: iload           16
        //   110: ifeq            121
        //   113: aload_0        
        //   114: invokespecial   com/whatsapp/a_l.a:()V
        //   117: iload_2        
        //   118: ifeq            84
        //   121: aload_0        
        //   122: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   125: invokestatic    com/whatsapp/RecordAudio.i:(Lcom/whatsapp/RecordAudio;)Landroid/os/Handler;
        //   128: iconst_0       
        //   129: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   132: pop            
        //   133: aload_0        
        //   134: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   137: invokestatic    com/whatsapp/RecordAudio.n:(Lcom/whatsapp/RecordAudio;)Landroid/widget/ProgressBar;
        //   140: ldc             120000
        //   142: invokevirtual   android/widget/ProgressBar.setMax:(I)V
        //   145: aload_0        
        //   146: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   149: invokestatic    java/lang/System.currentTimeMillis:()J
        //   152: invokestatic    com/whatsapp/RecordAudio.a:(Lcom/whatsapp/RecordAudio;J)J
        //   155: pop2           
        //   156: aload_0        
        //   157: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   160: invokestatic    com/whatsapp/RecordAudio.d:(Lcom/whatsapp/RecordAudio;)Lcom/whatsapp/od;
        //   163: invokevirtual   com/whatsapp/od.c:()V
        //   166: aload_0        
        //   167: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   170: invokestatic    com/whatsapp/RecordAudio.d:(Lcom/whatsapp/RecordAudio;)Lcom/whatsapp/od;
        //   173: invokevirtual   com/whatsapp/od.d:()V
        //   176: aload_0        
        //   177: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   180: iconst_1       
        //   181: invokestatic    com/whatsapp/RecordAudio.b:(Lcom/whatsapp/RecordAudio;I)I
        //   184: pop            
        //   185: aload_0        
        //   186: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   189: aload_0        
        //   190: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   193: invokestatic    com/whatsapp/RecordAudio.d:(Lcom/whatsapp/RecordAudio;)Lcom/whatsapp/od;
        //   196: invokevirtual   com/whatsapp/od.a:()Ljava/io/File;
        //   199: invokestatic    com/whatsapp/RecordAudio.a:(Lcom/whatsapp/RecordAudio;Ljava/io/File;)Ljava/io/File;
        //   202: pop            
        //   203: iload_2        
        //   204: ifeq            84
        //   207: aload_0        
        //   208: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   211: invokestatic    com/whatsapp/RecordAudio.k:(Lcom/whatsapp/RecordAudio;)V
        //   214: aload_0        
        //   215: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   218: iconst_4       
        //   219: invokestatic    com/whatsapp/RecordAudio.b:(Lcom/whatsapp/RecordAudio;I)I
        //   222: pop            
        //   223: iload_2        
        //   224: ifeq            84
        //   227: aload_0        
        //   228: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   231: invokestatic    com/whatsapp/RecordAudio.j:(Lcom/whatsapp/RecordAudio;)Lcom/whatsapp/util/ao;
        //   234: invokevirtual   com/whatsapp/util/ao.c:()V
        //   237: aload_0        
        //   238: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   241: invokestatic    com/whatsapp/RecordAudio.j:(Lcom/whatsapp/RecordAudio;)Lcom/whatsapp/util/ao;
        //   244: invokevirtual   com/whatsapp/util/ao.g:()V
        //   247: aload_0        
        //   248: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   251: iconst_4       
        //   252: invokestatic    com/whatsapp/RecordAudio.b:(Lcom/whatsapp/RecordAudio;I)I
        //   255: pop            
        //   256: aload_0        
        //   257: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   260: invokestatic    com/whatsapp/RecordAudio.b:(Lcom/whatsapp/RecordAudio;)Z
        //   263: ifeq            274
        //   266: aload_0        
        //   267: invokespecial   com/whatsapp/a_l.a:()V
        //   270: iload_2        
        //   271: ifeq            84
        //   274: new             Lcom/whatsapp/MediaData;
        //   277: dup            
        //   278: invokespecial   com/whatsapp/MediaData.<init>:()V
        //   281: aload_0        
        //   282: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   285: invokestatic    com/whatsapp/RecordAudio.f:(Lcom/whatsapp/RecordAudio;)Ljava/io/File;
        //   288: putfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   291: new             Landroid/content/Intent;
        //   294: dup            
        //   295: invokespecial   android/content/Intent.<init>:()V
        //   298: astore          8
        //   300: aload           8
        //   302: aload_0        
        //   303: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   306: invokestatic    com/whatsapp/RecordAudio.f:(Lcom/whatsapp/RecordAudio;)Ljava/io/File;
        //   309: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   312: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   315: pop            
        //   316: aload           8
        //   318: getstatic       com/whatsapp/a_l.z:[Ljava/lang/String;
        //   321: iconst_1       
        //   322: aaload         
        //   323: iconst_0       
        //   324: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   327: pop            
        //   328: aload_0        
        //   329: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   332: iconst_m1      
        //   333: aload           8
        //   335: invokevirtual   com/whatsapp/RecordAudio.setResult:(ILandroid/content/Intent;)V
        //   338: aload_0        
        //   339: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   342: invokevirtual   com/whatsapp/RecordAudio.finish:()V
        //   345: goto            84
        //   348: astore_3       
        //   349: aload_3        
        //   350: athrow         
        //   351: astore          4
        //   353: aload           4
        //   355: athrow         
        //   356: astore          5
        //   358: aload           5
        //   360: athrow         
        //   361: astore          20
        //   363: aload           20
        //   365: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   368: goto            166
        //   371: astore          23
        //   373: aload           23
        //   375: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   378: aload_0        
        //   379: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   382: ldc             2131231088
        //   384: invokevirtual   com/whatsapp/RecordAudio.a:(I)V
        //   387: goto            185
        //   390: astore          21
        //   392: aload           21
        //   394: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   397: aload_0        
        //   398: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   401: ldc             2131231088
        //   403: invokevirtual   com/whatsapp/RecordAudio.a:(I)V
        //   406: goto            185
        //   409: astore          14
        //   411: aload           14
        //   413: athrow         
        //   414: astore          13
        //   416: aload           13
        //   418: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   421: goto            247
        //   424: astore          11
        //   426: aload           11
        //   428: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   431: aload_0        
        //   432: getfield        com/whatsapp/a_l.a:Lcom/whatsapp/RecordAudio;
        //   435: ldc             2131231134
        //   437: invokevirtual   com/whatsapp/RecordAudio.a:(I)V
        //   440: goto            247
        //   443: astore          7
        //   445: aload           7
        //   447: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      44     348    351    Ljava/io/IOException;
        //  99     108    348    351    Ljava/io/IOException;
        //  113    117    351    356    Ljava/io/IOException;
        //  113    117    356    361    Ljava/lang/RuntimeException;
        //  121    156    356    361    Ljava/lang/RuntimeException;
        //  156    166    361    371    Ljava/io/IOException;
        //  156    166    356    361    Ljava/lang/RuntimeException;
        //  166    185    371    390    Ljava/io/IOException;
        //  166    185    390    409    Ljava/lang/RuntimeException;
        //  185    203    409    414    Ljava/io/IOException;
        //  207    223    409    414    Ljava/io/IOException;
        //  237    247    414    424    Ljava/lang/IllegalStateException;
        //  237    247    424    443    Ljava/io/IOException;
        //  256    270    443    448    Ljava/io/IOException;
        //  349    351    351    356    Ljava/io/IOException;
        //  353    356    356    361    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 189, Size: 189
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
