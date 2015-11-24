// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;

class vq extends AsyncTask
{
    private static final String[] z;
    private final boolean a;
    
    static {
        final String[] z2 = new String[12];
        String s = "l=~!Nl.e{\\\":b!Mn<{g^h";
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
                        c2 = ',';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = '\u000e';
                        break;
                    }
                    case 3: {
                        c2 = '\u000e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "y4~k";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "l=~!Nl.e{\\\":b!^h!ko_h";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "l=~!Ki?gxI /omGx=!|Mc)ac\u0001z,gz\u0001y$ck\u0003";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "l=~!Nl.e{\\\":b!^h!ko_h";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "}\"yk^";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "l!o|A";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "l.zgCc\u0012loOf8~";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "o,meY})l";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "l8zaAl9kj";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "l=~!Nl.e{\\\":b!^h!ko_h";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "l=~!Nl.e{\\\"(||C\u007fm";
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
    
    protected vq(final boolean a) {
        this.a = a;
    }
    
    protected ai a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/ai.FAILED_GENERIC:Lcom/whatsapp/ai;
        //     3: astore_2       
        //     4: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //     7: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //    10: iconst_5       
        //    11: aaload         
        //    12: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    15: checkcast       Landroid/os/PowerManager;
        //    18: astore_3       
        //    19: aconst_null    
        //    20: astore          4
        //    22: aload_3        
        //    23: ifnull          39
        //    26: aload_3        
        //    27: iconst_1       
        //    28: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //    31: bipush          8
        //    33: aaload         
        //    34: invokevirtual   android/os/PowerManager.newWakeLock:(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
        //    37: astore          4
        //    39: aload           4
        //    41: ifnull          49
        //    44: aload           4
        //    46: invokevirtual   android/os/PowerManager$WakeLock.acquire:()V
        //    49: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //    52: iconst_0       
        //    53: aaload         
        //    54: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    57: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    60: iconst_0       
        //    61: aload_0        
        //    62: getfield        com/whatsapp/vq.a:Z
        //    65: invokevirtual   com/whatsapp/vy.a:(ZZ)Lcom/whatsapp/ai;
        //    68: astore_2       
        //    69: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    72: invokestatic    com/whatsapp/wallpaper/h.c:(Landroid/content/Context;)V
        //    75: invokestatic    com/whatsapp/gdrive/GoogleDriveService.n:()Z
        //    78: ifeq            213
        //    81: new             Ljava/util/Random;
        //    84: dup            
        //    85: invokespecial   java/util/Random.<init>:()V
        //    88: sipush          1800
        //    91: invokevirtual   java/util/Random.nextInt:(I)I
        //    94: istore          13
        //    96: new             Ljava/lang/StringBuilder;
        //    99: dup            
        //   100: invokespecial   java/lang/StringBuilder.<init>:()V
        //   103: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //   106: iconst_3       
        //   107: aaload         
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: iload           13
        //   113: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   116: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   119: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   122: new             Landroid/content/Intent;
        //   125: dup            
        //   126: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   129: ldc             Lcom/whatsapp/gdrive/GoogleDriveService;.class
        //   131: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   134: astore          14
        //   136: aload           14
        //   138: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //   141: bipush          7
        //   143: aaload         
        //   144: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   147: pop            
        //   148: aload           14
        //   150: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //   153: iconst_1       
        //   154: aaload         
        //   155: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //   158: bipush          9
        //   160: aaload         
        //   161: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   164: pop            
        //   165: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   168: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //   171: bipush          6
        //   173: aaload         
        //   174: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   177: checkcast       Landroid/app/AlarmManager;
        //   180: astore          17
        //   182: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   185: iconst_0       
        //   186: aload           14
        //   188: iconst_0       
        //   189: invokestatic    android/app/PendingIntent.getService:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   192: astore          18
        //   194: aload           17
        //   196: iconst_1       
        //   197: invokestatic    java/lang/System.currentTimeMillis:()J
        //   200: iload           13
        //   202: sipush          1000
        //   205: imul           
        //   206: i2l            
        //   207: ladd           
        //   208: aload           18
        //   210: invokevirtual   android/app/AlarmManager.set:(IJLandroid/app/PendingIntent;)V
        //   213: aload           4
        //   215: ifnull          370
        //   218: aload           4
        //   220: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //   223: istore          12
        //   225: iload           12
        //   227: ifeq            370
        //   230: aload           4
        //   232: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   235: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //   238: bipush          10
        //   240: aaload         
        //   241: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   244: aload_2        
        //   245: astore          8
        //   247: aload           8
        //   249: areturn        
        //   250: astore          19
        //   252: aload           19
        //   254: athrow         
        //   255: astore          7
        //   257: aload_2        
        //   258: astore          8
        //   260: new             Ljava/lang/StringBuilder;
        //   263: dup            
        //   264: invokespecial   java/lang/StringBuilder.<init>:()V
        //   267: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //   270: bipush          11
        //   272: aaload         
        //   273: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   276: aload           7
        //   278: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   284: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   287: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   290: aload           4
        //   292: ifnull          247
        //   295: aload           4
        //   297: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //   300: ifeq            247
        //   303: aload           4
        //   305: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   308: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //   311: iconst_4       
        //   312: aaload         
        //   313: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   316: aload           8
        //   318: areturn        
        //   319: astore          9
        //   321: aload           9
        //   323: athrow         
        //   324: astore          10
        //   326: aload           10
        //   328: athrow         
        //   329: astore          11
        //   331: aload           11
        //   333: athrow         
        //   334: astore          5
        //   336: aload           4
        //   338: ifnull          362
        //   341: aload           4
        //   343: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //   346: ifeq            362
        //   349: aload           4
        //   351: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   354: getstatic       com/whatsapp/vq.z:[Ljava/lang/String;
        //   357: iconst_2       
        //   358: aaload         
        //   359: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   362: aload           5
        //   364: athrow         
        //   365: astore          6
        //   367: aload           6
        //   369: athrow         
        //   370: aload_2        
        //   371: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  44     49     250    255    Ljava/io/IOException;
        //  44     49     334    370    Any
        //  49     213    255    324    Ljava/io/IOException;
        //  49     213    334    370    Any
        //  218    225    324    329    Ljava/io/IOException;
        //  230    244    329    334    Ljava/io/IOException;
        //  252    255    255    324    Ljava/io/IOException;
        //  252    255    334    370    Any
        //  260    290    334    370    Any
        //  295    316    319    324    Ljava/io/IOException;
        //  326    329    329    334    Ljava/io/IOException;
        //  341    362    365    370    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 175, Size: 175
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    protected void a(final ai ai) {
        Conversation.g();
        if (App.an() != null) {
            App.an().c();
        }
        if (ai == ai.FAILED_INVALID) {
            al5.u();
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((ai)o);
    }
    
    protected void onPreExecute() {
        App.aJ = false;
        if (App.an() != null) {
            App.an().a(2131231341, 2131231340);
        }
    }
}
