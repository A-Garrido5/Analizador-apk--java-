// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a6d implements View$OnClickListener
{
    private static final String[] z;
    final DeleteAccount a;
    
    static {
        final String[] z2 = new String[7];
        String s = "/lH\u007f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'G';
                        break;
                    }
                    case 0: {
                        c2 = '\u000f';
                        break;
                    }
                    case 1: {
                        c2 = '\u001c';
                        break;
                    }
                    case 2: {
                        c2 = ' ';
                        break;
                    }
                    case 3: {
                        c2 = 'B';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "SX";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "kyL'3j1A!$`iN6h\u007ftO,\" \u007fC\u007f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "kyL'3j1A!$`iN6h|iB/.{3C!g";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "kyL'3j1A!$`iN6h\u007ftO,\"/zA++jx\u000065fql'&kuN%\u001djnOb!}sMb\u0004`iN65vLH-)jUN$(";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = " rU/%jn\u001d";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "/vI&z";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a6d(final DeleteAccount a) {
        this.a = a;
    }
    
    public void onClick(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //     4: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //     7: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    10: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    13: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    16: astore_2       
        //    17: aload_0        
        //    18: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //    21: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //    24: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    27: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    30: astore_3       
        //    31: aload_2        
        //    32: aload_3        
        //    33: invokestatic    com/whatsapp/RegisterPhone.a:(Ljava/lang/String;Ljava/lang/String;)I
        //    36: tableswitch {
        //                2: 334
        //                3: 344
        //                4: 375
        //                5: 408
        //                6: 429
        //                7: 487
        //                8: 545
        //          default: 80
        //        }
        //    80: aload_2        
        //    81: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    84: istore          22
        //    86: aload_3        
        //    87: getstatic       com/whatsapp/a6d.z:[Ljava/lang/String;
        //    90: iconst_1       
        //    91: aaload         
        //    92: ldc             ""
        //    94: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    97: astore          23
        //    99: iload           22
        //   101: aload           23
        //   103: invokestatic    com/whatsapp/vi.a:(ILjava/lang/String;)Ljava/lang/String;
        //   106: astore          32
        //   108: aload           32
        //   110: astore          23
        //   112: new             Ljava/lang/StringBuilder;
        //   115: dup            
        //   116: invokespecial   java/lang/StringBuilder.<init>:()V
        //   119: getstatic       com/whatsapp/a6d.z:[Ljava/lang/String;
        //   122: iconst_2       
        //   123: aaload         
        //   124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   127: aload_2        
        //   128: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   131: getstatic       com/whatsapp/a6d.z:[Ljava/lang/String;
        //   134: iconst_5       
        //   135: aaload         
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   139: aload           23
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   147: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   150: aload_2        
        //   151: invokestatic    com/whatsapp/DeleteAccount.a:(Ljava/lang/String;)Ljava/lang/String;
        //   154: pop            
        //   155: aload           23
        //   157: invokestatic    com/whatsapp/DeleteAccount.c:(Ljava/lang/String;)Ljava/lang/String;
        //   160: pop            
        //   161: new             Ljava/lang/StringBuilder;
        //   164: dup            
        //   165: invokespecial   java/lang/StringBuilder.<init>:()V
        //   168: getstatic       com/whatsapp/a6d.z:[Ljava/lang/String;
        //   171: iconst_3       
        //   172: aaload         
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: invokestatic    com/whatsapp/DeleteAccount.b:()Ljava/lang/String;
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: getstatic       com/whatsapp/a6d.z:[Ljava/lang/String;
        //   185: iconst_0       
        //   186: aaload         
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   190: invokestatic    com/whatsapp/DeleteAccount.a:()Ljava/lang/String;
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: getstatic       com/whatsapp/a6d.z:[Ljava/lang/String;
        //   199: bipush          6
        //   201: aaload         
        //   202: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   205: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //   208: getfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   217: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   220: aload_0        
        //   221: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   224: iconst_1       
        //   225: invokevirtual   com/whatsapp/DeleteAccount.showDialog:(I)V
        //   228: aload_0        
        //   229: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   232: invokestatic    com/whatsapp/DeleteAccount.a:(Lcom/whatsapp/DeleteAccount;)Landroid/os/Handler;
        //   235: iconst_4       
        //   236: ldc2_w          30000
        //   239: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   242: pop            
        //   243: invokestatic    com/whatsapp/DeleteAccount.b:()Ljava/lang/String;
        //   246: invokestatic    com/whatsapp/DeleteAccount.a:()Ljava/lang/String;
        //   249: aload_0        
        //   250: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   253: invokestatic    com/whatsapp/DeleteAccount.e:(Lcom/whatsapp/DeleteAccount;)Lcom/whatsapp/protocol/bl;
        //   256: aload_0        
        //   257: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   260: invokestatic    com/whatsapp/DeleteAccount.d:(Lcom/whatsapp/DeleteAccount;)Lcom/whatsapp/protocol/c2;
        //   263: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/protocol/bl;Lcom/whatsapp/protocol/c2;)Z
        //   266: ifne            333
        //   269: aload_0        
        //   270: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   273: invokestatic    com/whatsapp/DeleteAccount.a:(Lcom/whatsapp/DeleteAccount;)Landroid/os/Handler;
        //   276: iconst_4       
        //   277: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   280: aload_0        
        //   281: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   284: iconst_1       
        //   285: invokevirtual   com/whatsapp/DeleteAccount.removeDialog:(I)V
        //   288: aload_0        
        //   289: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   292: astore          29
        //   294: aload_0        
        //   295: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   298: astore          30
        //   300: iconst_1       
        //   301: anewarray       Ljava/lang/Object;
        //   304: astore          31
        //   306: aload           31
        //   308: iconst_0       
        //   309: aload_0        
        //   310: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   313: ldc             2131230921
        //   315: invokevirtual   com/whatsapp/DeleteAccount.getString:(I)Ljava/lang/String;
        //   318: aastore        
        //   319: aload           29
        //   321: aload           30
        //   323: ldc             2131231532
        //   325: aload           31
        //   327: invokevirtual   com/whatsapp/DeleteAccount.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   330: invokevirtual   com/whatsapp/DeleteAccount.f:(Ljava/lang/String;)V
        //   333: return         
        //   334: getstatic       com/whatsapp/App.I:Z
        //   337: istore          21
        //   339: iload           21
        //   341: ifeq            80
        //   344: aload_0        
        //   345: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   348: ldc             2131231525
        //   350: invokevirtual   com/whatsapp/DeleteAccount.a:(I)V
        //   353: aload_0        
        //   354: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   357: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //   360: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   363: pop            
        //   364: return         
        //   365: astore          18
        //   367: aload           18
        //   369: athrow         
        //   370: astore          20
        //   372: aload           20
        //   374: athrow         
        //   375: aload_0        
        //   376: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   379: ldc             2131231526
        //   381: invokevirtual   com/whatsapp/DeleteAccount.a:(I)V
        //   384: aload_0        
        //   385: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   388: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //   391: ldc             ""
        //   393: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   396: aload_0        
        //   397: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   400: getfield        com/whatsapp/DeleteAccount.t:Landroid/widget/EditText;
        //   403: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   406: pop            
        //   407: return         
        //   408: aload_0        
        //   409: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   412: ldc             2131231538
        //   414: invokevirtual   com/whatsapp/DeleteAccount.a:(I)V
        //   417: aload_0        
        //   418: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   421: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //   424: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   427: pop            
        //   428: return         
        //   429: aload_0        
        //   430: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   433: astore          12
        //   435: aload_0        
        //   436: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   439: astore          13
        //   441: iconst_1       
        //   442: anewarray       Ljava/lang/Object;
        //   445: astore          14
        //   447: aload           14
        //   449: iconst_0       
        //   450: aload_0        
        //   451: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   454: getfield        com/whatsapp/DeleteAccount.u:Landroid/widget/EditText;
        //   457: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //   460: aastore        
        //   461: aload           12
        //   463: aload           13
        //   465: ldc             2131231530
        //   467: aload           14
        //   469: invokevirtual   com/whatsapp/DeleteAccount.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   472: invokevirtual   com/whatsapp/DeleteAccount.f:(Ljava/lang/String;)V
        //   475: aload_0        
        //   476: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   479: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //   482: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   485: pop            
        //   486: return         
        //   487: aload_0        
        //   488: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   491: astore          8
        //   493: aload_0        
        //   494: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   497: astore          9
        //   499: iconst_1       
        //   500: anewarray       Ljava/lang/Object;
        //   503: astore          10
        //   505: aload           10
        //   507: iconst_0       
        //   508: aload_0        
        //   509: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   512: getfield        com/whatsapp/DeleteAccount.u:Landroid/widget/EditText;
        //   515: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //   518: aastore        
        //   519: aload           8
        //   521: aload           9
        //   523: ldc             2131231529
        //   525: aload           10
        //   527: invokevirtual   com/whatsapp/DeleteAccount.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   530: invokevirtual   com/whatsapp/DeleteAccount.f:(Ljava/lang/String;)V
        //   533: aload_0        
        //   534: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   537: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //   540: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   543: pop            
        //   544: return         
        //   545: aload_0        
        //   546: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   549: astore          4
        //   551: aload_0        
        //   552: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   555: astore          5
        //   557: iconst_1       
        //   558: anewarray       Ljava/lang/Object;
        //   561: astore          6
        //   563: aload           6
        //   565: iconst_0       
        //   566: aload_0        
        //   567: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   570: getfield        com/whatsapp/DeleteAccount.u:Landroid/widget/EditText;
        //   573: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //   576: aastore        
        //   577: aload           4
        //   579: aload           5
        //   581: ldc             2131231528
        //   583: aload           6
        //   585: invokevirtual   com/whatsapp/DeleteAccount.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   588: invokevirtual   com/whatsapp/DeleteAccount.f:(Ljava/lang/String;)V
        //   591: aload_0        
        //   592: getfield        com/whatsapp/a6d.a:Lcom/whatsapp/DeleteAccount;
        //   595: getfield        com/whatsapp/DeleteAccount.n:Landroid/widget/EditText;
        //   598: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   601: pop            
        //   602: return         
        //   603: astore          24
        //   605: getstatic       com/whatsapp/a6d.z:[Ljava/lang/String;
        //   608: iconst_4       
        //   609: aaload         
        //   610: aload           24
        //   612: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   615: goto            112
        //   618: astore          25
        //   620: aload           25
        //   622: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  99     108    603    618    Ljava/io/IOException;
        //  112    333    618    623    Ljava/io/IOException;
        //  334    339    370    375    Ljava/io/IOException;
        //  344    364    365    370    Ljava/io/IOException;
        //  372    375    365    370    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0112:
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
