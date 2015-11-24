// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import java.util.Arrays;
import java.util.List;

class ad extends ao
{
    private static final String[] e;
    private static final String[] z;
    long f;
    
    static {
        final String[] array = new String[19];
        String s = "ml\u001fluk`\\#hjq\u001d+b b\u00022(bb\u0007,eff\u0000";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_0756:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = '\u000e';
                        break;
                    }
                    case 1: {
                        c2 = '\u0003';
                        break;
                    }
                    case 2: {
                        c2 = 'r';
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
                    array2[n2] = intern;
                    s = "ml\u001fluk`\\#hjq\u001d+b b\u00022(zt\u001e#s``\u001a't";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "mo\u00131u";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "lb\u0016%cQ`\u001d7hz\\\u0002#eeb\u0015'Y`b\u001f'";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    s = "yj\u0016%czs\u0000-pgg\u00170)zl\u001dbkom\u000bbdog\u0015'u4#";
                    n2 = 4;
                    array2 = array3;
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    array2 = array3;
                    s = "yj\u0016%czs\u0000-pgg\u00170){s\u0016#rka\u0013&ak";
                    n = 4;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "lb\u0016%cml\u0007,r";
                    n = 5;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "lb\u0016%cQ`\u001d7hz";
                    n = 6;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "ml\u001c6c`wHm)ml\u001fluk`\\ gjd\u0017mg~s\u0001";
                    n = 7;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "yj\u0016%czs\u0000-pgg\u00170){s\u0016#rka\u0013&ak#\u001b&<";
                    n = 8;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = ".`\u001d7hz9";
                    n = 9;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "~b\u0011)gif";
                    n = 10;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "om\u00160igg\\+hzf\u001c6(o`\u0006+i`-0\u0003BIF-\u0001I[M&\u001dS^G3\u0016C";
                    n = 11;
                    array2 = array3;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "~b\u0011)gifO}";
                    n = 12;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 14;
                    s = "~b\u0011)gifO}";
                    n = 13;
                    array2 = array3;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "yj\u0016%czs\u0000-pgg\u00170){s\u0016#rka\u0013&ak#\u001b,ukq\u0006'b.j\u0016x";
                    n = 14;
                    array2 = array3;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 16;
                    s = "yj\u0016%czs\u0000-pgg\u00170){s\u0016#rka\u0013&ak#\u001b&<";
                    n = 15;
                    array2 = array3;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    n2 = 17;
                    s = "lb\u0016%cQ`\u001d7hz\\\u0011.g}p-,gcf";
                    n = 16;
                    array2 = array3;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    n2 = 18;
                    s = ".`\u001d7hz9";
                    n = 17;
                    array2 = array3;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    z = array3;
                    final String[] array4 = new String[5];
                    s = "Qj\u0016";
                    n = 18;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 18: {
                    array2[n2] = intern;
                    s = "~b\u0011)gif";
                    n = 19;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 19: {
                    array2[n2] = intern;
                    s = "mo\u00131u";
                    n = 20;
                    n2 = 2;
                    array2 = array3;
                    continue;
                }
                case 20: {
                    array2[n2] = intern;
                    s = "lb\u0016%cml\u0007,r";
                    n = 21;
                    n2 = 3;
                    array2 = array3;
                    continue;
                }
                case 21: {
                    array2[n2] = intern;
                    s = "g`\u001d,";
                    n = 22;
                    n2 = 4;
                    array2 = array3;
                    continue;
                }
                case 22: {
                    break Label_0756;
                }
            }
        }
        array2[n2] = intern;
        e = array3;
    }
    
    ad() {
        this.f = -1L;
    }
    
    @Override
    public void a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/ao.b:Z
        //     3: istore_2       
        //     4: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     7: bipush          22
        //     9: if_icmpge       415
        //    12: aload_0        
        //    13: invokevirtual   com/whatsapp/notification/ad.a:()Ljava/lang/String;
        //    16: astore          7
        //    18: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //    21: bipush          8
        //    23: aaload         
        //    24: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    27: astore          9
        //    29: aload_0        
        //    30: invokevirtual   com/whatsapp/notification/ad.c:()Landroid/content/Context;
        //    33: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    36: astore          10
        //    38: aload_0        
        //    39: getfield        com/whatsapp/notification/ad.f:J
        //    42: ldc2_w          -1
        //    45: lcmp           
        //    46: ifne            214
        //    49: aload           10
        //    51: aload           9
        //    53: getstatic       com/whatsapp/notification/ad.e:[Ljava/lang/String;
        //    56: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //    59: bipush          13
        //    61: aaload         
        //    62: iconst_1       
        //    63: anewarray       Ljava/lang/String;
        //    66: dup            
        //    67: iconst_0       
        //    68: aload           7
        //    70: aastore        
        //    71: aconst_null    
        //    72: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    75: astore          13
        //    77: aload           13
        //    79: ifnonnull       83
        //    82: return         
        //    83: aload           13
        //    85: invokeinterface android/database/Cursor.getCount:()I
        //    90: iconst_1       
        //    91: if_icmple       152
        //    94: new             Ljava/lang/StringBuilder;
        //    97: dup            
        //    98: invokespecial   java/lang/StringBuilder.<init>:()V
        //   101: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   104: iconst_4       
        //   105: aaload         
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: aload           13
        //   111: invokeinterface android/database/Cursor.getCount:()I
        //   116: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   119: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   122: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   125: aload           10
        //   127: aload           9
        //   129: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   132: bipush          14
        //   134: aaload         
        //   135: iconst_1       
        //   136: anewarray       Ljava/lang/String;
        //   139: dup            
        //   140: iconst_0       
        //   141: aload           7
        //   143: aastore        
        //   144: invokevirtual   android/content/ContentResolver.delete:(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
        //   147: pop            
        //   148: iload_2        
        //   149: ifeq            207
        //   152: aload           13
        //   154: invokeinterface android/database/Cursor.moveToNext:()Z
        //   159: istore          18
        //   161: iload           18
        //   163: ifeq            207
        //   166: aload_0        
        //   167: aload           13
        //   169: iconst_0       
        //   170: invokeinterface android/database/Cursor.getLong:(I)J
        //   175: putfield        com/whatsapp/notification/ad.f:J
        //   178: new             Ljava/lang/StringBuilder;
        //   181: dup            
        //   182: invokespecial   java/lang/StringBuilder.<init>:()V
        //   185: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   188: bipush          9
        //   190: aaload         
        //   191: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   194: aload_0        
        //   195: getfield        com/whatsapp/notification/ad.f:J
        //   198: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   201: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   204: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   207: aload           13
        //   209: invokeinterface android/database/Cursor.close:()V
        //   214: new             Landroid/content/ContentValues;
        //   217: dup            
        //   218: invokespecial   android/content/ContentValues.<init>:()V
        //   221: astore          11
        //   223: aload           11
        //   225: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   228: bipush          11
        //   230: aaload         
        //   231: aload           7
        //   233: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   236: aload           11
        //   238: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   241: iconst_2       
        //   242: aaload         
        //   243: aload_0        
        //   244: invokevirtual   com/whatsapp/notification/ad.d:()Ljava/lang/String;
        //   247: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   250: aload           11
        //   252: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   255: bipush          6
        //   257: aaload         
        //   258: iload_1        
        //   259: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   262: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   265: aload_0        
        //   266: getfield        com/whatsapp/notification/ad.f:J
        //   269: ldc2_w          -1
        //   272: lcmp           
        //   273: ifne            350
        //   276: aload_0        
        //   277: aload           10
        //   279: aload           9
        //   281: aload           11
        //   283: invokevirtual   android/content/ContentResolver.insert:(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
        //   286: invokevirtual   android/net/Uri.getPathSegments:()Ljava/util/List;
        //   289: iconst_1       
        //   290: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   295: checkcast       Ljava/lang/String;
        //   298: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   301: putfield        com/whatsapp/notification/ad.f:J
        //   304: new             Ljava/lang/StringBuilder;
        //   307: dup            
        //   308: invokespecial   java/lang/StringBuilder.<init>:()V
        //   311: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   314: bipush          15
        //   316: aaload         
        //   317: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   320: aload_0        
        //   321: getfield        com/whatsapp/notification/ad.f:J
        //   324: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   327: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   330: bipush          18
        //   332: aaload         
        //   333: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   336: iload_1        
        //   337: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   340: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   343: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   346: iload_2        
        //   347: ifeq            411
        //   350: aload           10
        //   352: aload           9
        //   354: aload_0        
        //   355: getfield        com/whatsapp/notification/ad.f:J
        //   358: invokestatic    android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   361: aload           11
        //   363: aconst_null    
        //   364: aconst_null    
        //   365: invokevirtual   android/content/ContentResolver.update:(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   368: pop            
        //   369: new             Ljava/lang/StringBuilder;
        //   372: dup            
        //   373: invokespecial   java/lang/StringBuilder.<init>:()V
        //   376: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   379: bipush          16
        //   381: aaload         
        //   382: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   385: aload_0        
        //   386: getfield        com/whatsapp/notification/ad.f:J
        //   389: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   392: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   395: bipush          10
        //   397: aaload         
        //   398: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   401: iload_1        
        //   402: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   405: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   408: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   411: iload_2        
        //   412: ifeq            82
        //   415: new             Landroid/content/Intent;
        //   418: dup            
        //   419: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   422: bipush          12
        //   424: aaload         
        //   425: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   428: astore_3       
        //   429: aload_3        
        //   430: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   433: bipush          7
        //   435: aaload         
        //   436: iload_1        
        //   437: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   440: pop            
        //   441: aload_3        
        //   442: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   445: iconst_3       
        //   446: aaload         
        //   447: aload_0        
        //   448: invokevirtual   com/whatsapp/notification/ad.a:()Ljava/lang/String;
        //   451: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   454: pop            
        //   455: aload_3        
        //   456: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   459: bipush          17
        //   461: aaload         
        //   462: aload_0        
        //   463: invokevirtual   com/whatsapp/notification/ad.d:()Ljava/lang/String;
        //   466: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   469: pop            
        //   470: aload_0        
        //   471: invokevirtual   com/whatsapp/notification/ad.c:()Landroid/content/Context;
        //   474: aload_3        
        //   475: invokevirtual   android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
        //   478: return         
        //   479: astore          15
        //   481: aload           15
        //   483: athrow         
        //   484: astore          16
        //   486: aload           16
        //   488: athrow         
        //   489: astore          17
        //   491: aload           17
        //   493: athrow         
        //   494: astore          14
        //   496: aload           13
        //   498: invokeinterface android/database/Cursor.close:()V
        //   503: aload           14
        //   505: athrow         
        //   506: astore          8
        //   508: getstatic       com/whatsapp/notification/ad.z:[Ljava/lang/String;
        //   511: iconst_5       
        //   512: aaload         
        //   513: aload           8
        //   515: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   518: goto            411
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  18     77     506    521    Ljava/lang/Exception;
        //  83     148    479    484    Ljava/lang/Exception;
        //  83     148    494    506    Any
        //  152    161    484    489    Ljava/lang/Exception;
        //  152    161    494    506    Any
        //  166    207    489    494    Ljava/lang/Exception;
        //  166    207    494    506    Any
        //  207    214    506    521    Ljava/lang/Exception;
        //  214    346    506    521    Ljava/lang/Exception;
        //  350    411    506    521    Ljava/lang/Exception;
        //  481    484    484    489    Ljava/lang/Exception;
        //  481    484    494    506    Any
        //  486    489    489    494    Ljava/lang/Exception;
        //  486    489    494    506    Any
        //  491    494    494    506    Any
        //  496    506    506    521    Ljava/lang/Exception;
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
    
    @Override
    public List b() {
        return Arrays.asList(ad.z[0], ad.z[1]);
    }
}
