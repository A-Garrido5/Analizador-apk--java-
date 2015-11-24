// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.c2dm;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;

public class b
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[18];
        String s = "h{C\u001e(hq\u0015\u000b-lpF\u000b%le\u0015\r!bp\\\t!e5\\\u0011db'Q\u0012dq`F\u0017~!";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0482:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'D';
                        break;
                    }
                    case 0: {
                        c2 = '\u0001';
                        break;
                    }
                    case 1: {
                        c2 = '\u0015';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = '\u007f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "b'Q\u0012kspV\u001a-wp\u001a\u0011+u8\\\u000fi`qQ\r!rf";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "]q\u001e#j]q\u001e#j]q\u001e#j]q\u001e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "1;\u0005Qt/%";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "ug@\u001a";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "hq";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "uf";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "-|EB";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "]i";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "`yY\u00103^pM\u000f-spQ";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "he";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "b'Q\u0012klxF +wpG\r-ep\u001a\u0016*wtY\u0016 ^{@\u0012&dgFE";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "lxF\u00102";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "gw\\\u000f7";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "b'Q\u0012klxF +wpG\r-ep\u001a\u0016*wtY\u0016 ^zC\u001a6s|Q\u001a~";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "-aFB";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "b'Q\u0012kspV\u001a-wp\u001a\u0016 <";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "BYp>\u0016";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    break Label_0482;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static void a(final Context p0, final Intent p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/c2dm/C2DMRegistrar.c:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: iconst_0       
        //     6: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;I)V
        //     9: iconst_1       
        //    10: putstatic       com/whatsapp/App.aR:Z
        //    13: aload_1        
        //    14: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //    17: iconst_5       
        //    18: aaload         
        //    19: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    22: astore          4
        //    24: aload_1        
        //    25: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //    28: bipush          10
        //    30: aaload         
        //    31: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    34: astore          5
        //    36: aload_1        
        //    37: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //    40: bipush          6
        //    42: aaload         
        //    43: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    46: astore          6
        //    48: new             Ljava/lang/StringBuilder;
        //    51: dup            
        //    52: invokespecial   java/lang/StringBuilder.<init>:()V
        //    55: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //    58: bipush          16
        //    60: aaload         
        //    61: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    64: aload           4
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //    72: bipush          7
        //    74: aaload         
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: aload           5
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //    86: bipush          15
        //    88: aaload         
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: aload           6
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   100: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   103: iload_2        
        //   104: ifeq            125
        //   107: aload           6
        //   109: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   112: istore          9
        //   114: iload           9
        //   116: ifne            125
        //   119: aload_0        
        //   120: aload           6
        //   122: invokestatic    com/whatsapp/c2dm/b.a:(Landroid/content/Context;Ljava/lang/String;)V
        //   125: aload           5
        //   127: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   130: ifeq            181
        //   133: aload           4
        //   135: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   138: istore          27
        //   140: iload           27
        //   142: ifne            181
        //   145: aload           4
        //   147: ldc             ","
        //   149: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   152: astore          28
        //   154: aload           28
        //   156: arraylength    
        //   157: iconst_1       
        //   158: if_icmple       181
        //   161: aload           28
        //   163: iconst_1       
        //   164: aaload         
        //   165: invokestatic    com/whatsapp/c2dm/b.a:(Ljava/lang/String;)Z
        //   168: istore          30
        //   170: iload           30
        //   172: ifeq            181
        //   175: aload           28
        //   177: iconst_1       
        //   178: aaload         
        //   179: astore          5
        //   181: aload_1        
        //   182: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //   185: bipush          12
        //   187: aaload         
        //   188: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   191: astore          11
        //   193: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //   196: bipush          17
        //   198: aaload         
        //   199: aload           11
        //   201: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   204: ifeq            235
        //   207: aload_0        
        //   208: aconst_null    
        //   209: lconst_0       
        //   210: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;J)V
        //   213: iload_3        
        //   214: ifeq            295
        //   217: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   220: istore          25
        //   222: iconst_0       
        //   223: istore          26
        //   225: iload           25
        //   227: ifeq            397
        //   230: iload           26
        //   232: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //   235: aload           11
        //   237: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   240: ifne            295
        //   243: aload           11
        //   245: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //   248: bipush          8
        //   250: aaload         
        //   251: iconst_3       
        //   252: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   255: astore          20
        //   257: aload           20
        //   259: arraylength    
        //   260: iconst_3       
        //   261: if_icmpne       436
        //   264: ldc2_w          1000
        //   267: aload           20
        //   269: iconst_1       
        //   270: aaload         
        //   271: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   274: aload           20
        //   276: iconst_2       
        //   277: aaload         
        //   278: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   281: ladd           
        //   282: lmul           
        //   283: lstore          23
        //   285: aload_0        
        //   286: aload           20
        //   288: iconst_0       
        //   289: aaload         
        //   290: lload           23
        //   292: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;J)V
        //   295: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //   298: iconst_4       
        //   299: aaload         
        //   300: aload_1        
        //   301: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //   304: bipush          9
        //   306: aaload         
        //   307: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   310: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   313: istore          15
        //   315: aload_1        
        //   316: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //   319: bipush          13
        //   321: aaload         
        //   322: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   325: astore          16
        //   327: aconst_null    
        //   328: astore          17
        //   330: aload           16
        //   332: ifnull          348
        //   335: aload           16
        //   337: ldc             ","
        //   339: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   342: astore          19
        //   344: aload           19
        //   346: astore          17
        //   348: aload_0        
        //   349: iconst_1       
        //   350: iconst_1       
        //   351: iconst_1       
        //   352: aload           5
        //   354: aload           17
        //   356: iload           15
        //   358: invokestatic    com/whatsapp/messaging/MessageService.a:(Landroid/content/Context;ZZZLjava/lang/String;[Ljava/lang/String;Z)V
        //   361: return         
        //   362: astore          7
        //   364: aload           7
        //   366: athrow         
        //   367: astore          8
        //   369: aload           8
        //   371: athrow         
        //   372: astore          10
        //   374: aload           10
        //   376: athrow         
        //   377: astore          29
        //   379: aload           29
        //   381: athrow         
        //   382: astore          12
        //   384: aload           12
        //   386: athrow         
        //   387: astore          13
        //   389: aload           13
        //   391: athrow         
        //   392: astore          14
        //   394: aload           14
        //   396: athrow         
        //   397: iconst_1       
        //   398: istore          26
        //   400: goto            230
        //   403: astore          22
        //   405: new             Ljava/lang/StringBuilder;
        //   408: dup            
        //   409: invokespecial   java/lang/StringBuilder.<init>:()V
        //   412: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //   415: bipush          11
        //   417: aaload         
        //   418: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   421: aload           11
        //   423: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   426: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   429: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   432: iload_3        
        //   433: ifeq            295
        //   436: new             Ljava/lang/StringBuilder;
        //   439: dup            
        //   440: invokespecial   java/lang/StringBuilder.<init>:()V
        //   443: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //   446: bipush          14
        //   448: aaload         
        //   449: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   452: aload           11
        //   454: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   457: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   460: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   463: goto            295
        //   466: astore          21
        //   468: aload           21
        //   470: athrow         
        //   471: astore          18
        //   473: aload           18
        //   475: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  48     103    362    367    Ljava/lang/NumberFormatException;
        //  107    114    362    367    Ljava/lang/NumberFormatException;
        //  119    125    367    372    Ljava/lang/NumberFormatException;
        //  125    140    372    377    Ljava/lang/NumberFormatException;
        //  154    170    377    382    Ljava/lang/NumberFormatException;
        //  193    213    382    387    Ljava/lang/NumberFormatException;
        //  217    222    387    397    Ljava/lang/NumberFormatException;
        //  264    295    403    436    Ljava/lang/NumberFormatException;
        //  335    344    471    476    Ljava/lang/NumberFormatException;
        //  364    367    367    372    Ljava/lang/NumberFormatException;
        //  384    387    387    397    Ljava/lang/NumberFormatException;
        //  389    392    392    397    Ljava/lang/NumberFormatException;
        //  405    432    466    471    Ljava/lang/NumberFormatException;
        //  436    463    466    471    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 234, Size: 234
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
    
    private static void a(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //     4: lstore_3       
        //     5: lload_3        
        //     6: ldc2_w          1000
        //     9: lmul           
        //    10: lstore          5
        //    12: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //    15: ldc             Lcom/whatsapp/i_;.class
        //    17: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //    20: checkcast       Lcom/whatsapp/i_;
        //    23: astore          7
        //    25: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //    28: ldc             Lcom/whatsapp/vp;.class
        //    30: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //    33: checkcast       Lcom/whatsapp/vp;
        //    36: astore          8
        //    38: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //    41: ldc             Lcom/whatsapp/fr;.class
        //    43: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //    46: checkcast       Lcom/whatsapp/fr;
        //    49: astore          9
        //    51: new             Lcom/whatsapp/fieldstats/b7;
        //    54: dup            
        //    55: invokespecial   com/whatsapp/fieldstats/b7.<init>:()V
        //    58: astore          10
        //    60: aload           7
        //    62: invokevirtual   com/whatsapp/i_.a:()J
        //    65: lstore          11
        //    67: lload           11
        //    69: lload           5
        //    71: lsub           
        //    72: l2d            
        //    73: dstore          13
        //    75: aload           10
        //    77: dload           13
        //    79: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    82: putfield        com/whatsapp/fieldstats/b7.b:Ljava/lang/Double;
        //    85: aload           10
        //    87: lload           11
        //    89: aload           8
        //    91: invokevirtual   com/whatsapp/vp.b:()J
        //    94: lsub           
        //    95: l2d            
        //    96: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    99: putfield        com/whatsapp/fieldstats/b7.c:Ljava/lang/Double;
        //   102: aload           9
        //   104: invokevirtual   com/whatsapp/fr.a:()Z
        //   107: ifeq            166
        //   110: dconst_1       
        //   111: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   114: astore          17
        //   116: aload           17
        //   118: astore          16
        //   120: aload           10
        //   122: aload           16
        //   124: putfield        com/whatsapp/fieldstats/b7.a:Ljava/lang/Double;
        //   127: aload_0        
        //   128: aload           10
        //   130: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //   133: return         
        //   134: astore_2       
        //   135: new             Ljava/lang/StringBuilder;
        //   138: dup            
        //   139: invokespecial   java/lang/StringBuilder.<init>:()V
        //   142: getstatic       com/whatsapp/c2dm/b.z:[Ljava/lang/String;
        //   145: iconst_0       
        //   146: aaload         
        //   147: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   150: aload_1        
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   157: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   160: return         
        //   161: astore          15
        //   163: aload           15
        //   165: athrow         
        //   166: dconst_0       
        //   167: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   170: astore          16
        //   172: goto            120
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      134    161    Ljava/lang/NumberFormatException;
        //  75     116    161    166    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0120:
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
    
    private static boolean a(final String s) {
        Label_0040: {
            if (s != null) {
                try {
                    if (!s.matches(b.z[2])) {
                        break Label_0040;
                    }
                    final String s2 = s;
                    final String[] array = b.z;
                    final int n = 3;
                    final String s3 = array[n];
                    final boolean b = s2.equals(s3);
                    if (b) {
                        return false;
                    }
                    return true;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                try {
                    final String s2 = s;
                    final String[] array = b.z;
                    final int n = 3;
                    final String s3 = array[n];
                    final boolean b = s2.equals(s3);
                    if (b) {
                        return false;
                    }
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
                return true;
            }
        }
        Log.w(b.z[1]);
        return false;
    }
}
