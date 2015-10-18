// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.os.AsyncTask;

final class ActivityChooserModel$PersistHistoryAsyncTask extends AsyncTask
{
    private static final String[] z;
    final ActivityChooserModel this$0;
    
    static {
        final String[] z2 = new String[12];
        String s = "Pu\u0010lwJu\u0000yt\u0015n\u0006{wJx";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
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
                        c2 = '8';
                        break;
                    }
                    case 1: {
                        c2 = '\u001c';
                        break;
                    }
                    case 2: {
                        c2 = 'c';
                        break;
                    }
                    case 3: {
                        c2 = '\u0018';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "}n\u0011wj\u0018k\u0011qlQr\u00048pQo\u0017wjQ\u007f\u0002t8Jy\u0000jw\\<\u0005qt]&C";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Pu\u0010lwJu\u0000yt\u0015n\u0006{wJx\u0010";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "}n\u0011wj\u0018k\u0011qlQr\u00048pQo\u0017wjQ\u007f\u0002t8Jy\u0000jw\\<\u0005qt]&C";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Oy\n\u007fpL";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Pu\u0010lwJu\u0000yt\u0015n\u0006{wJx\u0010";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Pu\u0010lwJu\u0000yt\u0015n\u0006{wJx";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "}n\u0011wj\u0018k\u0011qlQr\u00048pQo\u0017wjQ\u007f\u0002t8Jy\u0000jw\\<\u0005qt]&C";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "mH%5 ";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Y\u007f\u0017qnQh\u001a";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "Lu\u000e}";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "}n\u0011wj\u0018k\u0011qlQr\u00048pQo\u0017wjQ\u007f\u0002t8Jy\u0000jw\\<\u0005qt]&C";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private ActivityChooserModel$PersistHistoryAsyncTask(final ActivityChooserModel this$0) {
        this.this$0 = this$0;
    }
    
    ActivityChooserModel$PersistHistoryAsyncTask(final ActivityChooserModel activityChooserModel, final ActivityChooserModel$1 activityChooserModel$1) {
        this(activityChooserModel);
    }
    
    public Object doInBackground(final Object[] array) {
        return this.doInBackground(array);
    }
    
    public Void doInBackground(final Object[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     5: istore_3       
        //     6: aload_1        
        //     7: iconst_0       
        //     8: aaload         
        //     9: checkcast       Ljava/util/List;
        //    12: astore          4
        //    14: aload_1        
        //    15: iconst_1       
        //    16: aaload         
        //    17: checkcast       Ljava/lang/String;
        //    20: astore          5
        //    22: aload_0        
        //    23: getfield        android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //    26: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$200:(Landroid/support/v7/internal/widget/ActivityChooserModel;)Landroid/content/Context;
        //    29: aload           5
        //    31: iconst_0       
        //    32: invokevirtual   android/content/Context.openFileOutput:(Ljava/lang/String;I)Ljava/io/FileOutputStream;
        //    35: astore          8
        //    37: invokestatic    android/util/Xml.newSerializer:()Lorg/xmlpull/v1/XmlSerializer;
        //    40: astore          9
        //    42: aload           9
        //    44: aload           8
        //    46: aconst_null    
        //    47: invokeinterface org/xmlpull/v1/XmlSerializer.setOutput:(Ljava/io/OutputStream;Ljava/lang/String;)V
        //    52: aload           9
        //    54: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //    57: bipush          8
        //    59: aaload         
        //    60: iconst_1       
        //    61: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    64: invokeinterface org/xmlpull/v1/XmlSerializer.startDocument:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //    69: aload           9
        //    71: aconst_null    
        //    72: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //    75: iconst_5       
        //    76: aaload         
        //    77: invokeinterface org/xmlpull/v1/XmlSerializer.startTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //    82: pop            
        //    83: aload           4
        //    85: invokeinterface java/util/List.size:()I
        //    90: istore          27
        //    92: iload_2        
        //    93: iload           27
        //    95: if_icmpge       217
        //    98: aload           4
        //   100: iconst_0       
        //   101: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
        //   106: checkcast       Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
        //   109: astore          28
        //   111: aload           9
        //   113: aconst_null    
        //   114: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //   117: bipush          6
        //   119: aaload         
        //   120: invokeinterface org/xmlpull/v1/XmlSerializer.startTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //   125: pop            
        //   126: aload           9
        //   128: aconst_null    
        //   129: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //   132: bipush          9
        //   134: aaload         
        //   135: aload           28
        //   137: getfield        android/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord.activity:Landroid/content/ComponentName;
        //   140: invokevirtual   android/content/ComponentName.flattenToString:()Ljava/lang/String;
        //   143: invokeinterface org/xmlpull/v1/XmlSerializer.attribute:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //   148: pop            
        //   149: aload           9
        //   151: aconst_null    
        //   152: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //   155: bipush          10
        //   157: aaload         
        //   158: aload           28
        //   160: getfield        android/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord.time:J
        //   163: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   166: invokeinterface org/xmlpull/v1/XmlSerializer.attribute:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //   171: pop            
        //   172: aload           9
        //   174: aconst_null    
        //   175: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //   178: iconst_4       
        //   179: aaload         
        //   180: aload           28
        //   182: getfield        android/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord.weight:F
        //   185: invokestatic    java/lang/String.valueOf:(F)Ljava/lang/String;
        //   188: invokeinterface org/xmlpull/v1/XmlSerializer.attribute:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //   193: pop            
        //   194: aload           9
        //   196: aconst_null    
        //   197: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //   200: iconst_0       
        //   201: aaload         
        //   202: invokeinterface org/xmlpull/v1/XmlSerializer.endTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //   207: pop            
        //   208: iload_2        
        //   209: iconst_1       
        //   210: iadd           
        //   211: istore          34
        //   213: iload_3        
        //   214: ifeq            527
        //   217: aload           9
        //   219: aconst_null    
        //   220: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //   223: iconst_2       
        //   224: aaload         
        //   225: invokeinterface org/xmlpull/v1/XmlSerializer.endTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //   230: pop            
        //   231: aload           9
        //   233: invokeinterface org/xmlpull/v1/XmlSerializer.endDocument:()V
        //   238: aload_0        
        //   239: getfield        android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //   242: iconst_1       
        //   243: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$502:(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
        //   246: pop            
        //   247: aload           8
        //   249: ifnull          257
        //   252: aload           8
        //   254: invokevirtual   java/io/FileOutputStream.close:()V
        //   257: aconst_null    
        //   258: areturn        
        //   259: astore          6
        //   261: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$300:()Ljava/lang/String;
        //   264: new             Ljava/lang/StringBuilder;
        //   267: dup            
        //   268: invokespecial   java/lang/StringBuilder.<init>:()V
        //   271: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //   274: bipush          7
        //   276: aaload         
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: aload           5
        //   282: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   285: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   288: aload           6
        //   290: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   293: pop            
        //   294: aconst_null    
        //   295: areturn        
        //   296: astore          22
        //   298: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$300:()Ljava/lang/String;
        //   301: new             Ljava/lang/StringBuilder;
        //   304: dup            
        //   305: invokespecial   java/lang/StringBuilder.<init>:()V
        //   308: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //   311: iconst_1       
        //   312: aaload         
        //   313: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   316: aload_0        
        //   317: getfield        android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //   320: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$400:(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;
        //   323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   326: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   329: aload           22
        //   331: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   334: pop            
        //   335: aload_0        
        //   336: getfield        android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //   339: iconst_1       
        //   340: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$502:(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
        //   343: pop            
        //   344: aload           8
        //   346: ifnull          257
        //   349: aload           8
        //   351: invokevirtual   java/io/FileOutputStream.close:()V
        //   354: aconst_null    
        //   355: areturn        
        //   356: astore          25
        //   358: aconst_null    
        //   359: areturn        
        //   360: astore          18
        //   362: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$300:()Ljava/lang/String;
        //   365: new             Ljava/lang/StringBuilder;
        //   368: dup            
        //   369: invokespecial   java/lang/StringBuilder.<init>:()V
        //   372: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //   375: bipush          11
        //   377: aaload         
        //   378: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   381: aload_0        
        //   382: getfield        android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //   385: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$400:(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;
        //   388: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   391: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   394: aload           18
        //   396: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   399: pop            
        //   400: aload_0        
        //   401: getfield        android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //   404: iconst_1       
        //   405: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$502:(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
        //   408: pop            
        //   409: aload           8
        //   411: ifnull          257
        //   414: aload           8
        //   416: invokevirtual   java/io/FileOutputStream.close:()V
        //   419: aconst_null    
        //   420: areturn        
        //   421: astore          21
        //   423: aconst_null    
        //   424: areturn        
        //   425: astore          14
        //   427: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$300:()Ljava/lang/String;
        //   430: new             Ljava/lang/StringBuilder;
        //   433: dup            
        //   434: invokespecial   java/lang/StringBuilder.<init>:()V
        //   437: getstatic       android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.z:[Ljava/lang/String;
        //   440: iconst_3       
        //   441: aaload         
        //   442: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   445: aload_0        
        //   446: getfield        android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //   449: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$400:(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;
        //   452: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   455: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   458: aload           14
        //   460: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   463: pop            
        //   464: aload_0        
        //   465: getfield        android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //   468: iconst_1       
        //   469: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$502:(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
        //   472: pop            
        //   473: aload           8
        //   475: ifnull          257
        //   478: aload           8
        //   480: invokevirtual   java/io/FileOutputStream.close:()V
        //   483: aconst_null    
        //   484: areturn        
        //   485: astore          17
        //   487: aconst_null    
        //   488: areturn        
        //   489: astore          10
        //   491: aload_0        
        //   492: getfield        android/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask.this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
        //   495: iconst_1       
        //   496: invokestatic    android/support/v7/internal/widget/ActivityChooserModel.access$502:(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
        //   499: pop            
        //   500: aload           8
        //   502: ifnull          510
        //   505: aload           8
        //   507: invokevirtual   java/io/FileOutputStream.close:()V
        //   510: aload           10
        //   512: athrow         
        //   513: astore          11
        //   515: aload           11
        //   517: athrow         
        //   518: astore          37
        //   520: aconst_null    
        //   521: areturn        
        //   522: astore          13
        //   524: goto            510
        //   527: iload           34
        //   529: istore_2       
        //   530: goto            92
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  22     37     259    296    Ljava/io/FileNotFoundException;
        //  42     92     296    360    Ljava/lang/IllegalArgumentException;
        //  42     92     360    425    Ljava/lang/IllegalStateException;
        //  42     92     425    489    Ljava/io/IOException;
        //  42     92     489    518    Any
        //  98     208    296    360    Ljava/lang/IllegalArgumentException;
        //  98     208    360    425    Ljava/lang/IllegalStateException;
        //  98     208    425    489    Ljava/io/IOException;
        //  98     208    489    518    Any
        //  217    238    296    360    Ljava/lang/IllegalArgumentException;
        //  217    238    360    425    Ljava/lang/IllegalStateException;
        //  217    238    425    489    Ljava/io/IOException;
        //  217    238    489    518    Any
        //  252    257    518    522    Ljava/io/IOException;
        //  298    335    489    518    Any
        //  349    354    356    360    Ljava/io/IOException;
        //  362    400    489    518    Any
        //  414    419    421    425    Ljava/io/IOException;
        //  427    464    489    518    Any
        //  478    483    485    489    Ljava/io/IOException;
        //  491    500    513    518    Ljava/lang/IllegalArgumentException;
        //  505    510    522    527    Ljava/io/IOException;
        //  505    510    513    518    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 255, Size: 255
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
