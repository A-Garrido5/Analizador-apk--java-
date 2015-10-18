// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.IBinder;
import android.content.Intent;
import java.util.HashMap;
import android.app.Service;

public class VideoTranscodeService extends Service
{
    private static final HashMap d;
    private static final String[] z;
    private boolean a;
    private int b;
    private String c;
    
    static {
        final String[] z2 = new String[2];
        String s = "OO-\r{GEg\u000fq\\L \fgGN'QA~e\b+Qq`\u0019/Kaq\u001a Gz`\u001d,";
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
                        c2 = '\u0014';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = '!';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
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
                    n2 = 1;
                    array = z2;
                    s = "^S&\u0018fKR:";
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
        d = new HashMap();
    }
    
    public VideoTranscodeService() {
        this.a = false;
        this.b = -1;
    }
    
    public static void a() {
        App.ak.a(new sx());
    }
    
    static HashMap b() {
        return VideoTranscodeService.d;
    }
    
    public IBinder onBind(final Intent intent) {
        return null;
    }
    
    public void onDestroy() {
        try {
            if (this.a) {
                this.a = false;
                this.stopForeground(true);
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    public int onStartCommand(final Intent p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: getstatic       com/whatsapp/VideoTranscodeService.d:Ljava/util/HashMap;
        //     8: invokevirtual   java/util/HashMap.isEmpty:()Z
        //    11: ifeq            23
        //    14: aload_0        
        //    15: invokevirtual   com/whatsapp/VideoTranscodeService.stopSelf:()V
        //    18: iload           4
        //    20: ifeq            558
        //    23: aload_0        
        //    24: getfield        com/whatsapp/VideoTranscodeService.a:Z
        //    27: istore          6
        //    29: aload_0        
        //    30: iconst_1       
        //    31: putfield        com/whatsapp/VideoTranscodeService.a:Z
        //    34: new             Landroid/support/v4/app/NotificationCompat$Builder;
        //    37: dup            
        //    38: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    41: invokespecial   android/support/v4/app/NotificationCompat$Builder.<init>:(Landroid/content/Context;)V
        //    44: astore          7
        //    46: aload           7
        //    48: getstatic       com/whatsapp/VideoTranscodeService.z:[Ljava/lang/String;
        //    51: iconst_1       
        //    52: aaload         
        //    53: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setCategory:(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
        //    56: pop            
        //    57: aload           7
        //    59: ldc             17301640
        //    61: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setSmallIcon:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //    64: pop            
        //    65: aload           7
        //    67: invokestatic    java/lang/System.currentTimeMillis:()J
        //    70: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setWhen:(J)Landroid/support/v4/app/NotificationCompat$Builder;
        //    73: pop            
        //    74: aload           7
        //    76: aload_0        
        //    77: ldc             2131231990
        //    79: invokevirtual   com/whatsapp/VideoTranscodeService.getString:(I)Ljava/lang/String;
        //    82: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //    85: pop            
        //    86: iconst_m1      
        //    87: istore          12
        //    89: getstatic       com/whatsapp/VideoTranscodeService.d:Ljava/util/HashMap;
        //    92: invokevirtual   java/util/HashMap.size:()I
        //    95: iconst_1       
        //    96: if_icmpne       263
        //    99: getstatic       com/whatsapp/VideoTranscodeService.d:Ljava/util/HashMap;
        //   102: invokevirtual   java/util/HashMap.values:()Ljava/util/Collection;
        //   105: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   110: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   115: checkcast       Lcom/whatsapp/protocol/bi;
        //   118: astore          40
        //   120: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   123: aload           40
        //   125: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   128: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   131: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   134: astore          41
        //   136: iconst_1       
        //   137: anewarray       Ljava/lang/Object;
        //   140: astore          42
        //   142: aload           42
        //   144: iconst_0       
        //   145: aload           41
        //   147: aload_0        
        //   148: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   151: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //   154: aastore        
        //   155: aload_0        
        //   156: ldc             2131231641
        //   158: aload           42
        //   160: invokevirtual   com/whatsapp/VideoTranscodeService.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   163: astore          20
        //   165: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   168: bipush          11
        //   170: if_icmplt       251
        //   173: aload           40
        //   175: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   178: checkcast       Lcom/whatsapp/MediaData;
        //   181: astore          44
        //   183: aload           44
        //   185: ifnull          251
        //   188: aload           44
        //   190: getfield        com/whatsapp/MediaData.progress:J
        //   193: l2i            
        //   194: istore          12
        //   196: aload           44
        //   198: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   201: ifnull          251
        //   204: aload           44
        //   206: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   209: invokevirtual   com/whatsapp/wm.g:()Z
        //   212: istore          47
        //   214: iload           47
        //   216: ifeq            251
        //   219: aload           44
        //   221: getfield        com/whatsapp/MediaData.uploader:Lcom/whatsapp/a9;
        //   224: astore          48
        //   226: aload           48
        //   228: ifnonnull       710
        //   231: iload           12
        //   233: iconst_2       
        //   234: idiv           
        //   235: istore          49
        //   237: iload           4
        //   239: ifeq            703
        //   242: bipush          50
        //   244: iload           49
        //   246: iconst_2       
        //   247: idiv           
        //   248: iadd           
        //   249: istore          12
        //   251: aload           41
        //   253: invokestatic    com/whatsapp/Conversation.a:(Lcom/whatsapp/a_9;)Landroid/content/Intent;
        //   256: astore          43
        //   258: iload           4
        //   260: ifeq            696
        //   263: new             Ljava/util/HashSet;
        //   266: dup            
        //   267: invokespecial   java/util/HashSet.<init>:()V
        //   270: astore          13
        //   272: getstatic       com/whatsapp/VideoTranscodeService.d:Ljava/util/HashMap;
        //   275: invokevirtual   java/util/HashMap.values:()Ljava/util/Collection;
        //   278: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   283: astore          14
        //   285: aload           14
        //   287: invokeinterface java/util/Iterator.hasNext:()Z
        //   292: ifeq            322
        //   295: aload           13
        //   297: aload           14
        //   299: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   304: checkcast       Lcom/whatsapp/protocol/bi;
        //   307: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   310: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   313: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   316: pop            
        //   317: iload           4
        //   319: ifeq            285
        //   322: aload           13
        //   324: invokevirtual   java/util/HashSet.size:()I
        //   327: iconst_1       
        //   328: if_icmpne       575
        //   331: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   334: aload           13
        //   336: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   339: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   344: checkcast       Ljava/lang/String;
        //   347: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   350: astore          35
        //   352: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   355: ldc             2131296296
        //   357: getstatic       com/whatsapp/VideoTranscodeService.d:Ljava/util/HashMap;
        //   360: invokevirtual   java/util/HashMap.size:()I
        //   363: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   366: astore          36
        //   368: iconst_2       
        //   369: anewarray       Ljava/lang/Object;
        //   372: astore          37
        //   374: aload           37
        //   376: iconst_0       
        //   377: getstatic       com/whatsapp/VideoTranscodeService.d:Ljava/util/HashMap;
        //   380: invokevirtual   java/util/HashMap.size:()I
        //   383: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   386: aastore        
        //   387: aload           37
        //   389: iconst_1       
        //   390: aload           35
        //   392: aload_0        
        //   393: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   396: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //   399: aastore        
        //   400: aload           36
        //   402: aload           37
        //   404: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   407: astore          38
        //   409: aload           35
        //   411: invokestatic    com/whatsapp/Conversation.a:(Lcom/whatsapp/a_9;)Landroid/content/Intent;
        //   414: astore          19
        //   416: aload           38
        //   418: astore          20
        //   420: iload           12
        //   422: iflt            445
        //   425: iload           12
        //   427: ifne            644
        //   430: iconst_1       
        //   431: istore          33
        //   433: aload           7
        //   435: bipush          100
        //   437: iload           12
        //   439: iload           33
        //   441: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setProgress:(IIZ)Landroid/support/v4/app/NotificationCompat$Builder;
        //   444: pop            
        //   445: aload           7
        //   447: aload           20
        //   449: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   452: pop            
        //   453: iload           6
        //   455: ifne            466
        //   458: aload           7
        //   460: aload           20
        //   462: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setTicker:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   465: pop            
        //   466: aload_0        
        //   467: iconst_0       
        //   468: aload           19
        //   470: iconst_0       
        //   471: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   474: astore          24
        //   476: aload           7
        //   478: aload           24
        //   480: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentIntent:(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   483: pop            
        //   484: iload           6
        //   486: ifne            504
        //   489: aload_0        
        //   490: iconst_4       
        //   491: aload           7
        //   493: invokevirtual   android/support/v4/app/NotificationCompat$Builder.build:()Landroid/app/Notification;
        //   496: invokevirtual   com/whatsapp/VideoTranscodeService.startForeground:(ILandroid/app/Notification;)V
        //   499: iload           4
        //   501: ifeq            546
        //   504: aload_0        
        //   505: getfield        com/whatsapp/VideoTranscodeService.b:I
        //   508: istore          29
        //   510: iload           29
        //   512: iload           12
        //   514: if_icmpne       533
        //   517: aload           20
        //   519: aload_0        
        //   520: getfield        com/whatsapp/VideoTranscodeService.c:Ljava/lang/String;
        //   523: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   526: istore          32
        //   528: iload           32
        //   530: ifne            546
        //   533: aload_0        
        //   534: invokestatic    android/support/v4/app/NotificationManagerCompat.from:(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;
        //   537: iconst_4       
        //   538: aload           7
        //   540: invokevirtual   android/support/v4/app/NotificationCompat$Builder.build:()Landroid/app/Notification;
        //   543: invokevirtual   android/support/v4/app/NotificationManagerCompat.notify:(ILandroid/app/Notification;)V
        //   546: aload_0        
        //   547: iload           12
        //   549: putfield        com/whatsapp/VideoTranscodeService.b:I
        //   552: aload_0        
        //   553: aload           20
        //   555: putfield        com/whatsapp/VideoTranscodeService.c:Ljava/lang/String;
        //   558: iconst_2       
        //   559: ireturn        
        //   560: astore          5
        //   562: aload           5
        //   564: athrow         
        //   565: astore          45
        //   567: aload           45
        //   569: athrow         
        //   570: astore          46
        //   572: aload           46
        //   574: athrow         
        //   575: new             Landroid/content/Intent;
        //   578: dup            
        //   579: aload_0        
        //   580: invokestatic    com/whatsapp/Main.h:()Ljava/lang/Class;
        //   583: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   586: astore          15
        //   588: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   591: ldc_w           2131296297
        //   594: getstatic       com/whatsapp/VideoTranscodeService.d:Ljava/util/HashMap;
        //   597: invokevirtual   java/util/HashMap.size:()I
        //   600: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   603: astore          16
        //   605: iconst_1       
        //   606: anewarray       Ljava/lang/Object;
        //   609: astore          17
        //   611: aload           17
        //   613: iconst_0       
        //   614: getstatic       com/whatsapp/VideoTranscodeService.d:Ljava/util/HashMap;
        //   617: invokevirtual   java/util/HashMap.size:()I
        //   620: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   623: aastore        
        //   624: aload           16
        //   626: aload           17
        //   628: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   631: astore          18
        //   633: aload           15
        //   635: astore          19
        //   637: aload           18
        //   639: astore          20
        //   641: goto            420
        //   644: iconst_0       
        //   645: istore          33
        //   647: goto            433
        //   650: astore          21
        //   652: aload           21
        //   654: athrow         
        //   655: astore          25
        //   657: aload           25
        //   659: athrow         
        //   660: astore          26
        //   662: aload           26
        //   664: athrow         
        //   665: astore          27
        //   667: aload           27
        //   669: athrow         
        //   670: astore          30
        //   672: aload           30
        //   674: invokevirtual   java/lang/SecurityException.toString:()Ljava/lang/String;
        //   677: getstatic       com/whatsapp/VideoTranscodeService.z:[Ljava/lang/String;
        //   680: iconst_0       
        //   681: aaload         
        //   682: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   685: ifne            546
        //   688: aload           30
        //   690: athrow         
        //   691: astore          31
        //   693: aload           31
        //   695: athrow         
        //   696: aload           43
        //   698: astore          19
        //   700: goto            420
        //   703: iload           49
        //   705: istore          12
        //   707: goto            251
        //   710: iload           12
        //   712: istore          49
        //   714: goto            242
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  5      18     560    565    Ljava/lang/SecurityException;
        //  196    214    565    570    Ljava/lang/SecurityException;
        //  219    226    570    575    Ljava/lang/SecurityException;
        //  445    453    650    655    Ljava/lang/SecurityException;
        //  458    466    650    655    Ljava/lang/SecurityException;
        //  476    484    655    660    Ljava/lang/SecurityException;
        //  489    499    655    660    Ljava/lang/SecurityException;
        //  504    510    660    665    Ljava/lang/SecurityException;
        //  517    528    665    670    Ljava/lang/SecurityException;
        //  533    546    670    696    Ljava/lang/SecurityException;
        //  567    570    570    575    Ljava/lang/SecurityException;
        //  657    660    660    665    Ljava/lang/SecurityException;
        //  662    665    665    670    Ljava/lang/SecurityException;
        //  672    691    691    696    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 324, Size: 324
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
