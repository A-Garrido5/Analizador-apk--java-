// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class a9t
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[15];
        String s = "G>6\u0016w]d\"\bbB/m\u001b}C";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = 'J';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = 'x';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "W%6\fgL/m\u001b}C";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0001.&\u001es[&7Vx^-";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "^&\"\u0001<I%,\u001f~Kd \u0017\u007f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000bxs";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "W%6\fg\u0000(&";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "F>7\ba\u0014el\u0011\u007fId:\u0017gZ?!\u001d<M%.WdGe";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "G.";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "F>7\ba\u0014el\u0011f[$&\u000b<O:3\u0014w\u0000),\u0015=B%,\u0013g^u*\u001c/";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "F>7\ba\u0014el\u0011\u007fId:\u0017gZ?!\u001d<M%.WdGe";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "G'\"\u001fw\u000e>,\u00172B+1\u001fw";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\\/0\r~Z9";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "O87\u000f}\\!\u0016\n~\u001fzs";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "{\u001e\u0005U*";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0001.&\u001es[&7Vx^-";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    break Label_0407;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static byte[] a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //     8: istore_3       
        //     9: iload_3        
        //    10: ifeq            18
        //    13: aconst_null    
        //    14: areturn        
        //    15: astore_2       
        //    16: aload_2        
        //    17: athrow         
        //    18: new             Landroid/text/SpannableString;
        //    21: dup            
        //    22: aload_0        
        //    23: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //    26: astore          4
        //    28: aload           4
        //    30: iconst_1       
        //    31: invokestatic    android/text/util/Linkify.addLinks:(Landroid/text/Spannable;I)Z
        //    34: pop            
        //    35: aload           4
        //    37: iconst_0       
        //    38: aload           4
        //    40: invokevirtual   android/text/SpannableString.length:()I
        //    43: ldc             Landroid/text/style/URLSpan;.class
        //    45: invokevirtual   android/text/SpannableString.getSpans:(IILjava/lang/Class;)[Ljava/lang/Object;
        //    48: checkcast       [Landroid/text/style/URLSpan;
        //    51: astore          6
        //    53: aload           6
        //    55: ifnull          13
        //    58: aload           6
        //    60: arraylength    
        //    61: istore          8
        //    63: iload           8
        //    65: ifle            13
        //    68: aload           6
        //    70: iconst_0       
        //    71: aaload         
        //    72: invokevirtual   android/text/style/URLSpan.getURL:()Ljava/lang/String;
        //    75: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    78: astore          9
        //    80: aload           9
        //    82: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //    85: ifnull          292
        //    88: aload           9
        //    90: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //    93: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //    96: iconst_1       
        //    97: aaload         
        //    98: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   101: istore          43
        //   103: iload           43
        //   105: ifeq            292
        //   108: aload           9
        //   110: ldc             "v"
        //   112: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   115: astore          44
        //   117: aload           44
        //   119: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   122: ifne            715
        //   125: new             Ljava/lang/StringBuilder;
        //   128: dup            
        //   129: invokespecial   java/lang/StringBuilder.<init>:()V
        //   132: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   135: bipush          9
        //   137: aaload         
        //   138: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   141: aload           44
        //   143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   146: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   149: iconst_2       
        //   150: aaload         
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   157: astore          15
        //   159: aload           15
        //   161: ifnull          13
        //   164: new             Ljava/net/URL;
        //   167: dup            
        //   168: aload           15
        //   170: ldc             " "
        //   172: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   175: iconst_4       
        //   176: aaload         
        //   177: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   180: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   183: invokevirtual   java/net/URL.openStream:()Ljava/io/InputStream;
        //   186: astore          17
        //   188: new             Ljava/io/ByteArrayOutputStream;
        //   191: dup            
        //   192: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   195: astore          18
        //   197: sipush          1024
        //   200: newarray        B
        //   202: astore          19
        //   204: iconst_0       
        //   205: istore          20
        //   207: aload           17
        //   209: aload           19
        //   211: iconst_0       
        //   212: sipush          1024
        //   215: invokevirtual   java/io/InputStream.read:([BII)I
        //   218: istore          21
        //   220: iload           21
        //   222: iconst_m1      
        //   223: if_icmpne       230
        //   226: iload_1        
        //   227: ifeq            725
        //   230: aload           18
        //   232: aload           19
        //   234: iconst_0       
        //   235: iload           21
        //   237: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //   240: iload           20
        //   242: iload           21
        //   244: iadd           
        //   245: istore          20
        //   247: iload           20
        //   249: ldc             204800
        //   251: if_icmple       721
        //   254: new             Ljava/io/IOException;
        //   257: dup            
        //   258: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   261: bipush          10
        //   263: aaload         
        //   264: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   267: athrow         
        //   268: astore          23
        //   270: aload           23
        //   272: athrow         
        //   273: astore          16
        //   275: aload           16
        //   277: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   280: aconst_null    
        //   281: areturn        
        //   282: astore          7
        //   284: aload           7
        //   286: athrow         
        //   287: astore          10
        //   289: aload           10
        //   291: athrow         
        //   292: aload           9
        //   294: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   297: ifnull          386
        //   300: aload           9
        //   302: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   305: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   308: iconst_5       
        //   309: aaload         
        //   310: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   313: istore          40
        //   315: iload           40
        //   317: ifeq            386
        //   320: aload           9
        //   322: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //   325: astore          41
        //   327: aload           41
        //   329: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   332: ifne            715
        //   335: aload           41
        //   337: iconst_1       
        //   338: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   341: astore          42
        //   343: new             Ljava/lang/StringBuilder;
        //   346: dup            
        //   347: invokespecial   java/lang/StringBuilder.<init>:()V
        //   350: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   353: bipush          6
        //   355: aaload         
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: aload           42
        //   361: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   364: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   367: bipush          14
        //   369: aaload         
        //   370: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   373: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   376: astore          15
        //   378: goto            159
        //   381: astore          11
        //   383: aload           11
        //   385: athrow         
        //   386: aload           9
        //   388: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   391: ifnull          430
        //   394: aload           9
        //   396: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   399: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   402: iconst_3       
        //   403: aaload         
        //   404: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   407: istore          39
        //   409: iload           39
        //   411: ifeq            430
        //   414: aconst_null    
        //   415: astore          15
        //   417: goto            159
        //   420: astore          12
        //   422: aload           12
        //   424: athrow         
        //   425: astore          13
        //   427: aload           13
        //   429: athrow         
        //   430: aload           9
        //   432: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   435: ifnull          715
        //   438: aload           9
        //   440: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   443: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   446: iconst_0       
        //   447: aaload         
        //   448: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   451: istore          24
        //   453: iload           24
        //   455: ifeq            715
        //   458: aload           9
        //   460: invokevirtual   android/net/Uri.getPathSegments:()Ljava/util/List;
        //   463: astore          26
        //   465: aload           26
        //   467: ifnull          745
        //   470: aload           26
        //   472: invokeinterface java/util/List.size:()I
        //   477: istore          37
        //   479: iload           37
        //   481: ifle            745
        //   484: aload           26
        //   486: iconst_m1      
        //   487: aload           26
        //   489: invokeinterface java/util/List.size:()I
        //   494: iadd           
        //   495: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   500: checkcast       Ljava/lang/String;
        //   503: astore          38
        //   505: aload           38
        //   507: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   510: bipush          7
        //   512: aaload         
        //   513: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   516: ifeq            745
        //   519: aload           38
        //   521: iconst_2       
        //   522: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   525: astore          27
        //   527: aload           27
        //   529: ifnull          715
        //   532: new             Ljava/net/URL;
        //   535: dup            
        //   536: new             Ljava/lang/StringBuilder;
        //   539: dup            
        //   540: invokespecial   java/lang/StringBuilder.<init>:()V
        //   543: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   546: bipush          8
        //   548: aaload         
        //   549: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   552: aload           27
        //   554: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   557: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   560: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   563: invokevirtual   java/net/URL.openStream:()Ljava/io/InputStream;
        //   566: astore          28
        //   568: new             Ljava/io/BufferedReader;
        //   571: dup            
        //   572: new             Ljava/io/InputStreamReader;
        //   575: dup            
        //   576: aload           28
        //   578: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   581: bipush          13
        //   583: aaload         
        //   584: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/lang/String;)V
        //   587: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   590: astore          29
        //   592: new             Ljava/lang/StringBuilder;
        //   595: dup            
        //   596: invokespecial   java/lang/StringBuilder.<init>:()V
        //   599: astore          30
        //   601: aload           29
        //   603: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   606: astore          31
        //   608: aload           31
        //   610: ifnull          632
        //   613: aload           30
        //   615: aload           31
        //   617: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   620: pop            
        //   621: aload           29
        //   623: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   626: astore          31
        //   628: iload_1        
        //   629: ifeq            608
        //   632: aload           28
        //   634: invokevirtual   java/io/InputStream.close:()V
        //   637: new             Lorg/json/JSONObject;
        //   640: dup            
        //   641: aload           30
        //   643: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   646: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   649: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   652: bipush          11
        //   654: aaload         
        //   655: invokevirtual   org/json/JSONObject.optJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //   658: astore          33
        //   660: aload           33
        //   662: ifnull          715
        //   665: aload           33
        //   667: iconst_0       
        //   668: invokevirtual   org/json/JSONArray.optJSONObject:(I)Lorg/json/JSONObject;
        //   671: astore          34
        //   673: aload           34
        //   675: ifnull          715
        //   678: aload           34
        //   680: getstatic       com/whatsapp/a9t.z:[Ljava/lang/String;
        //   683: bipush          12
        //   685: aaload         
        //   686: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //   689: astore          35
        //   691: aload           35
        //   693: astore          15
        //   695: goto            159
        //   698: astore          14
        //   700: aload           14
        //   702: athrow         
        //   703: astore          36
        //   705: aload           36
        //   707: athrow         
        //   708: astore          25
        //   710: aload           25
        //   712: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   715: aconst_null    
        //   716: astore          15
        //   718: goto            159
        //   721: iload_1        
        //   722: ifeq            207
        //   725: aload           18
        //   727: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   730: aload           17
        //   732: invokevirtual   java/io/InputStream.close:()V
        //   735: aload           18
        //   737: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   740: astore          22
        //   742: aload           22
        //   744: areturn        
        //   745: aconst_null    
        //   746: astore          27
        //   748: goto            527
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      9      15     18     Ljava/lang/Exception;
        //  58     63     282    287    Ljava/lang/Exception;
        //  80     103    287    292    Ljava/lang/Exception;
        //  164    204    273    282    Ljava/lang/Exception;
        //  207    220    273    282    Ljava/lang/Exception;
        //  230    240    273    282    Ljava/lang/Exception;
        //  254    268    268    273    Ljava/lang/Exception;
        //  270    273    273    282    Ljava/lang/Exception;
        //  292    315    381    386    Ljava/lang/Exception;
        //  386    409    420    430    Ljava/lang/Exception;
        //  422    425    425    430    Ljava/lang/Exception;
        //  430    453    698    703    Ljava/lang/Exception;
        //  458    465    708    715    Ljava/lang/Exception;
        //  470    479    703    708    Ljava/lang/Exception;
        //  484    527    708    715    Ljava/lang/Exception;
        //  532    608    708    715    Ljava/lang/Exception;
        //  613    628    708    715    Ljava/lang/Exception;
        //  632    660    708    715    Ljava/lang/Exception;
        //  665    673    708    715    Ljava/lang/Exception;
        //  678    691    708    715    Ljava/lang/Exception;
        //  705    708    708    715    Ljava/lang/Exception;
        //  725    742    273    282    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0159:
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
