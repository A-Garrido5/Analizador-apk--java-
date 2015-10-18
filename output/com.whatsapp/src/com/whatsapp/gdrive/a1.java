// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class a1 implements Runnable
{
    private static final String[] z;
    final c8 a;
    
    static {
        final String[] z2 = new String[9];
        String s = "l9V#\u0001n/M>.y";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = 'L';
                        break;
                    }
                    case 2: {
                        c2 = '\"';
                        break;
                    }
                    case 3: {
                        c2 = 'K';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "~)V?)c+Qf'i>K=%\")P9/\u007faF>2d\"Ef-h(K*m\u007f)Q?/\u007f)\r*#n#W%4 !C%!j)Pf2h8W9.h(\u000f<)y$\u000f%/ -A(/x\"Vf.l!G";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "~)V?)c+Qf'i>K=%\")P9/\u007faF>2d\"Ef-h(K*m\u007f)Q?/\u007f)\r*#n#W%4 !C%!j)Pk5~)Pk!i(G/`";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "n#Oe'b#E'%";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "-%L84h-Fk/kl";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "n#Oe'b#E'%";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "l9V#\u0001n/M>.y";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "~)V?)c+Qf'i>K=%\")P9/\u007faF>2d\"Ef-h(K*m\u007f)Q?/\u007f)";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "l9V#\u0001n/M>.y";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a1(final c8 a) {
        this.a = a;
    }
    
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
        //     4: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     7: istore_3       
        //     8: aload_0        
        //     9: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //    12: getfield        com/whatsapp/gdrive/c8.a:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //    15: invokestatic    android/accounts/AccountManager.get:(Landroid/content/Context;)Landroid/accounts/AccountManager;
        //    18: getstatic       com/whatsapp/gdrive/a1.z:[Ljava/lang/String;
        //    21: iconst_3       
        //    22: aaload         
        //    23: invokevirtual   android/accounts/AccountManager.getAccountsByType:(Ljava/lang/String;)[Landroid/accounts/Account;
        //    26: astore          4
        //    28: aload           4
        //    30: arraylength    
        //    31: istore          5
        //    33: iconst_0       
        //    34: istore          6
        //    36: iload           6
        //    38: iload           5
        //    40: if_icmpge       345
        //    43: aload           4
        //    45: iload           6
        //    47: aaload         
        //    48: getfield        android/accounts/Account.name:Ljava/lang/String;
        //    51: aload_0        
        //    52: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //    55: getfield        com/whatsapp/gdrive/c8.b:Ljava/lang/String;
        //    58: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //    61: ifeq            70
        //    64: iload_3        
        //    65: ifeq            79
        //    68: iload_1        
        //    69: istore_2       
        //    70: iinc            6, 1
        //    73: iload_3        
        //    74: ifeq            36
        //    77: iload_2        
        //    78: istore_1       
        //    79: iload_1        
        //    80: ifeq            105
        //    83: aload_0        
        //    84: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //    87: getfield        com/whatsapp/gdrive/c8.a:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //    90: aload_0        
        //    91: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //    94: getfield        com/whatsapp/gdrive/c8.b:Ljava/lang/String;
        //    97: invokestatic    com/whatsapp/gdrive/SettingsGoogleDrive.b:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;Ljava/lang/String;)Z
        //   100: pop            
        //   101: iload_3        
        //   102: ifeq            295
        //   105: aload_0        
        //   106: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //   109: getfield        com/whatsapp/gdrive/c8.a:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   112: invokestatic    android/accounts/AccountManager.get:(Landroid/content/Context;)Landroid/accounts/AccountManager;
        //   115: getstatic       com/whatsapp/gdrive/a1.z:[Ljava/lang/String;
        //   118: iconst_5       
        //   119: aaload         
        //   120: aconst_null    
        //   121: aconst_null    
        //   122: aconst_null    
        //   123: aload_0        
        //   124: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //   127: getfield        com/whatsapp/gdrive/c8.a:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   130: aconst_null    
        //   131: aconst_null    
        //   132: invokevirtual   android/accounts/AccountManager.addAccount:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;Landroid/app/Activity;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;
        //   135: astore          7
        //   137: aload           7
        //   139: invokeinterface android/accounts/AccountManagerFuture.getResult:()Ljava/lang/Object;
        //   144: checkcast       Landroid/os/Bundle;
        //   147: astore          9
        //   149: aload           9
        //   151: getstatic       com/whatsapp/gdrive/a1.z:[Ljava/lang/String;
        //   154: iconst_0       
        //   155: aaload         
        //   156: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //   159: ifne            174
        //   162: getstatic       com/whatsapp/gdrive/a1.z:[Ljava/lang/String;
        //   165: iconst_1       
        //   166: aaload         
        //   167: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   170: iload_3        
        //   171: ifeq            295
        //   174: aload           9
        //   176: getstatic       com/whatsapp/gdrive/a1.z:[Ljava/lang/String;
        //   179: bipush          6
        //   181: aaload         
        //   182: invokevirtual   android/os/Bundle.get:(Ljava/lang/String;)Ljava/lang/Object;
        //   185: aload_0        
        //   186: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //   189: getfield        com/whatsapp/gdrive/c8.b:Ljava/lang/String;
        //   192: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   195: istore          14
        //   197: iload           14
        //   199: ifne            259
        //   202: new             Ljava/lang/StringBuilder;
        //   205: dup            
        //   206: invokespecial   java/lang/StringBuilder.<init>:()V
        //   209: getstatic       com/whatsapp/gdrive/a1.z:[Ljava/lang/String;
        //   212: iconst_2       
        //   213: aaload         
        //   214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   217: aload           9
        //   219: getstatic       com/whatsapp/gdrive/a1.z:[Ljava/lang/String;
        //   222: bipush          8
        //   224: aaload         
        //   225: invokevirtual   android/os/Bundle.get:(Ljava/lang/String;)Ljava/lang/Object;
        //   228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   231: getstatic       com/whatsapp/gdrive/a1.z:[Ljava/lang/String;
        //   234: iconst_4       
        //   235: aaload         
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: aload_0        
        //   240: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //   243: getfield        com/whatsapp/gdrive/c8.b:Ljava/lang/String;
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   252: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   255: iload_3        
        //   256: ifeq            295
        //   259: aload_0        
        //   260: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //   263: getfield        com/whatsapp/gdrive/c8.a:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   266: new             Lcom/whatsapp/gdrive/y;
        //   269: dup            
        //   270: aload_0        
        //   271: invokespecial   com/whatsapp/gdrive/y.<init>:(Lcom/whatsapp/gdrive/a1;)V
        //   274: invokevirtual   com/whatsapp/gdrive/SettingsGoogleDrive.runOnUiThread:(Ljava/lang/Runnable;)V
        //   277: aload_0        
        //   278: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //   281: getfield        com/whatsapp/gdrive/c8.a:Lcom/whatsapp/gdrive/SettingsGoogleDrive;
        //   284: aload_0        
        //   285: getfield        com/whatsapp/gdrive/a1.a:Lcom/whatsapp/gdrive/c8;
        //   288: getfield        com/whatsapp/gdrive/c8.b:Ljava/lang/String;
        //   291: invokestatic    com/whatsapp/gdrive/SettingsGoogleDrive.b:(Lcom/whatsapp/gdrive/SettingsGoogleDrive;Ljava/lang/String;)Z
        //   294: pop            
        //   295: return         
        //   296: astore          16
        //   298: aload           16
        //   300: athrow         
        //   301: astore          10
        //   303: aload           10
        //   305: athrow         
        //   306: astore          11
        //   308: aload           11
        //   310: athrow         
        //   311: astore          12
        //   313: aload           12
        //   315: athrow         
        //   316: astore          13
        //   318: aload           13
        //   320: athrow         
        //   321: astore          8
        //   323: getstatic       com/whatsapp/gdrive/a1.z:[Ljava/lang/String;
        //   326: bipush          7
        //   328: aaload         
        //   329: aload           8
        //   331: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   334: return         
        //   335: astore          8
        //   337: goto            323
        //   340: astore          8
        //   342: goto            323
        //   345: iload_2        
        //   346: istore_1       
        //   347: goto            79
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  83     101    296    301    Landroid/accounts/AuthenticatorException;
        //  137    149    321    323    Landroid/accounts/AuthenticatorException;
        //  137    149    335    340    Landroid/accounts/OperationCanceledException;
        //  137    149    340    345    Ljava/io/IOException;
        //  149    170    301    306    Landroid/accounts/AuthenticatorException;
        //  149    170    335    340    Landroid/accounts/OperationCanceledException;
        //  149    170    340    345    Ljava/io/IOException;
        //  174    197    306    311    Landroid/accounts/AuthenticatorException;
        //  174    197    335    340    Landroid/accounts/OperationCanceledException;
        //  174    197    340    345    Ljava/io/IOException;
        //  202    255    311    316    Landroid/accounts/AuthenticatorException;
        //  202    255    335    340    Landroid/accounts/OperationCanceledException;
        //  202    255    340    345    Ljava/io/IOException;
        //  259    295    316    321    Landroid/accounts/AuthenticatorException;
        //  259    295    335    340    Landroid/accounts/OperationCanceledException;
        //  259    295    340    345    Ljava/io/IOException;
        //  303    306    306    311    Landroid/accounts/AuthenticatorException;
        //  303    306    335    340    Landroid/accounts/OperationCanceledException;
        //  303    306    340    345    Ljava/io/IOException;
        //  308    311    311    316    Landroid/accounts/AuthenticatorException;
        //  308    311    335    340    Landroid/accounts/OperationCanceledException;
        //  308    311    340    345    Ljava/io/IOException;
        //  313    316    316    321    Landroid/accounts/AuthenticatorException;
        //  313    316    335    340    Landroid/accounts/OperationCanceledException;
        //  313    316    340    345    Ljava/io/IOException;
        //  318    321    321    323    Landroid/accounts/AuthenticatorException;
        //  318    321    335    340    Landroid/accounts/OperationCanceledException;
        //  318    321    340    345    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 169, Size: 169
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
