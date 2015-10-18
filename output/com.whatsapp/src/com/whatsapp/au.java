// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Handler;

class au extends Handler
{
    private static final String[] z;
    final AccountInfoActivity a;
    
    static {
        final String[] z2 = new String[11];
        String s = "#?M\u001fT,(\u0003\u0019O$3\u0001\u001c@72M\u0018\f$=G\u001cD&sM\u0011O!9B\u001cD&";
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
                        c2 = '!';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = '.';
                        break;
                    }
                    case 3: {
                        c2 = 'p';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "#?M\u001fT,(\u0003\u0019O$3\u0001\u0018@,8B\u0015\f.=[\u001eB*qH\u0011H.9JPS'/^\u001fO19\u0013";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "#?M\u001fT,(\u0003\u0019O$3\u0001\u0014H#0A\u0017\u000e%5H\u0004\u0001";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "#?M\u001fT,(\u0003\u0019O$3\u0001\u0018@,8B\u0015\f!4O\u001eF'qJ\u0005Do(A]F+:ZPO-|C\u0015R1=I\u0015";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0002/\u0000\u0007I#(]\u0011Q2r@\u0015U";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "#?M\u001fT,(\u0003\u0019O$3\u0001\u0004H/9A\u0005Um9V\u0000H09J";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "#?M\u001fT,(\u0003\u0019O$3\u0001\u001c@72M\u0018\f$=G\u001cD&sO\u001cS'=J\t\f-+@\u0015E";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "#?M\u001fT,(\u0003\u0019O$3\u0001\u001c@72M\u0018\f$=G\u001cD&sK\bQ+.K\u0014";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "#?M\u001fT,(\u0003\u0019O$3\u0001\u0014H#0A\u0017\u000e%=X\u0015\f19\\\u0006H!9\u000e";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "#?M\u001fT,(\u0003\u0019O$3\u0001\u0004H/9A\u0005Um9B\u0019F+>G\u001cH6%";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "#?M\u001fT,(\u0003\u0019O$3\u0001\u0018@,8B\u0015\f.=[\u001eB*q]\u0005B!9]\u0003\u000e'$M\u0015Q65A\u001e";
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
    
    au(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public void handleMessage(final Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: getfield        android/os/Message.what:I
        //     8: tableswitch {
        //                0: 72
        //                1: 900
        //                2: 900
        //                3: 300
        //                4: 328
        //                5: 564
        //                6: 127
        //                7: 206
        //                8: 99
        //                9: 533
        //               10: 698
        //               11: 599
        //          default: 900
        //        }
        //    72: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //    75: iconst_5       
        //    76: aaload         
        //    77: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    80: aload_0        
        //    81: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //    84: invokevirtual   com/whatsapp/AccountInfoActivity.c:()V
        //    87: aload_0        
        //    88: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //    91: iconst_2       
        //    92: invokevirtual   com/whatsapp/AccountInfoActivity.showDialog:(I)V
        //    95: iload_2        
        //    96: ifeq            900
        //    99: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //   102: bipush          7
        //   104: aaload         
        //   105: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   108: aload_0        
        //   109: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   112: invokevirtual   com/whatsapp/AccountInfoActivity.c:()V
        //   115: aload_0        
        //   116: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   119: iconst_4       
        //   120: invokevirtual   com/whatsapp/AccountInfoActivity.showDialog:(I)V
        //   123: iload_2        
        //   124: ifeq            900
        //   127: aload_0        
        //   128: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   131: invokestatic    com/whatsapp/AccountInfoActivity.o:(Lcom/whatsapp/AccountInfoActivity;)Landroid/os/Handler;
        //   134: bipush          8
        //   136: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   139: aload_0        
        //   140: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   143: invokevirtual   com/whatsapp/AccountInfoActivity.c:()V
        //   146: aload_1        
        //   147: getfield        android/os/Message.obj:Ljava/lang/Object;
        //   150: checkcast       Landroid/app/PendingIntent;
        //   153: astore          37
        //   155: aload_0        
        //   156: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   159: aload           37
        //   161: invokevirtual   android/app/PendingIntent.getIntentSender:()Landroid/content/IntentSender;
        //   164: sipush          10001
        //   167: new             Landroid/content/Intent;
        //   170: dup            
        //   171: invokespecial   android/content/Intent.<init>:()V
        //   174: iconst_0       
        //   175: iconst_0       
        //   176: iconst_0       
        //   177: invokevirtual   com/whatsapp/AccountInfoActivity.startIntentSenderForResult:(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
        //   180: return         
        //   181: astore          35
        //   183: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //   186: bipush          10
        //   188: aaload         
        //   189: aload           35
        //   191: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   194: aload_0        
        //   195: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   198: iconst_4       
        //   199: invokevirtual   com/whatsapp/AccountInfoActivity.showDialog:(I)V
        //   202: iload_2        
        //   203: ifeq            900
        //   206: aload_0        
        //   207: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   210: invokestatic    com/whatsapp/AccountInfoActivity.o:(Lcom/whatsapp/AccountInfoActivity;)Landroid/os/Handler;
        //   213: bipush          8
        //   215: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   218: aload_0        
        //   219: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   222: invokevirtual   com/whatsapp/AccountInfoActivity.c:()V
        //   225: aload_1        
        //   226: getfield        android/os/Message.arg1:I
        //   229: istore          34
        //   231: iload           34
        //   233: lookupswitch {
        //                1: 831
        //                7: 810
        //          default: 260
        //        }
        //   260: new             Ljava/lang/StringBuilder;
        //   263: dup            
        //   264: invokespecial   java/lang/StringBuilder.<init>:()V
        //   267: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //   270: iconst_1       
        //   271: aaload         
        //   272: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   275: aload_1        
        //   276: getfield        android/os/Message.arg1:I
        //   279: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   282: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   285: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   288: aload_0        
        //   289: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   292: iconst_4       
        //   293: invokevirtual   com/whatsapp/AccountInfoActivity.showDialog:(I)V
        //   296: iload_2        
        //   297: ifeq            900
        //   300: aload_0        
        //   301: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   304: ldc             2131231523
        //   306: invokevirtual   com/whatsapp/AccountInfoActivity.c:(I)V
        //   309: aload_0        
        //   310: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   313: invokestatic    com/whatsapp/AccountInfoActivity.o:(Lcom/whatsapp/AccountInfoActivity;)Landroid/os/Handler;
        //   316: iconst_0       
        //   317: ldc2_w          32000
        //   320: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
        //   323: pop            
        //   324: iload_2        
        //   325: ifeq            900
        //   328: aload_1        
        //   329: getfield        android/os/Message.obj:Ljava/lang/Object;
        //   332: checkcast       Ljava/lang/String;
        //   335: astore          19
        //   337: aload_1        
        //   338: getfield        android/os/Message.arg1:I
        //   341: istore          20
        //   343: aload_0        
        //   344: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   347: invokestatic    com/whatsapp/AccountInfoActivity.o:(Lcom/whatsapp/AccountInfoActivity;)Landroid/os/Handler;
        //   350: iconst_0       
        //   351: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   354: aload_0        
        //   355: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   358: invokevirtual   com/whatsapp/AccountInfoActivity.c:()V
        //   361: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //   364: getfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //   367: aload           19
        //   369: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   372: ifne            900
        //   375: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   378: new             Ljava/lang/StringBuilder;
        //   381: dup            
        //   382: invokespecial   java/lang/StringBuilder.<init>:()V
        //   385: aload           19
        //   387: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   390: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //   393: iconst_4       
        //   394: aaload         
        //   395: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   398: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   401: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   404: astore          21
        //   406: aload           21
        //   408: ifnonnull       851
        //   411: aload           19
        //   413: invokestatic    com/whatsapp/a_9.a:(Ljava/lang/String;)Ljava/lang/String;
        //   416: astore          28
        //   418: aload           28
        //   420: astore          22
        //   422: iload           20
        //   424: ifle            473
        //   427: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   430: ldc             2131296256
        //   432: iload           20
        //   434: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   437: astore          25
        //   439: iconst_2       
        //   440: anewarray       Ljava/lang/Object;
        //   443: astore          26
        //   445: aload           26
        //   447: iconst_0       
        //   448: iload           20
        //   450: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   453: aastore        
        //   454: aload           26
        //   456: iconst_1       
        //   457: aload           22
        //   459: aastore        
        //   460: aload           25
        //   462: aload           26
        //   464: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   467: astore          23
        //   469: iload_2        
        //   470: ifeq            493
        //   473: aload_0        
        //   474: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   477: ldc             2131230772
        //   479: iconst_1       
        //   480: anewarray       Ljava/lang/Object;
        //   483: dup            
        //   484: iconst_0       
        //   485: aload           22
        //   487: aastore        
        //   488: invokevirtual   com/whatsapp/AccountInfoActivity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   491: astore          23
        //   493: aload_0        
        //   494: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   497: aload           23
        //   499: invokevirtual   com/whatsapp/AccountInfoActivity.f:(Ljava/lang/String;)V
        //   502: new             Ljava/lang/StringBuilder;
        //   505: dup            
        //   506: invokespecial   java/lang/StringBuilder.<init>:()V
        //   509: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //   512: bipush          8
        //   514: aaload         
        //   515: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   518: aload           19
        //   520: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   523: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   526: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   529: iload_2        
        //   530: ifeq            900
        //   533: aload_0        
        //   534: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   537: invokestatic    com/whatsapp/AccountInfoActivity.o:(Lcom/whatsapp/AccountInfoActivity;)Landroid/os/Handler;
        //   540: iconst_0       
        //   541: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   544: aload_0        
        //   545: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   548: invokevirtual   com/whatsapp/AccountInfoActivity.c:()V
        //   551: aload_0        
        //   552: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   555: bipush          119
        //   557: invokevirtual   com/whatsapp/AccountInfoActivity.showDialog:(I)V
        //   560: iload_2        
        //   561: ifeq            900
        //   564: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //   567: getfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //   570: aload_0        
        //   571: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   574: invokestatic    com/whatsapp/AccountInfoActivity.i:(Lcom/whatsapp/AccountInfoActivity;)Ljava/lang/String;
        //   577: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   580: istore          16
        //   582: iload           16
        //   584: ifeq            900
        //   587: aload_0        
        //   588: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   591: invokestatic    com/whatsapp/AccountInfoActivity.h:(Lcom/whatsapp/AccountInfoActivity;)Z
        //   594: pop            
        //   595: iload_2        
        //   596: ifeq            900
        //   599: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //   602: getfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //   605: aload_0        
        //   606: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   609: invokestatic    com/whatsapp/AccountInfoActivity.i:(Lcom/whatsapp/AccountInfoActivity;)Ljava/lang/String;
        //   612: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   615: ifeq            626
        //   618: aload_0        
        //   619: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   622: invokestatic    com/whatsapp/AccountInfoActivity.h:(Lcom/whatsapp/AccountInfoActivity;)Z
        //   625: pop            
        //   626: aload_1        
        //   627: getfield        android/os/Message.obj:Ljava/lang/Object;
        //   630: astore          12
        //   632: aload           12
        //   634: ifnull          686
        //   637: aload_0        
        //   638: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   641: aload_1        
        //   642: getfield        android/os/Message.obj:Ljava/lang/Object;
        //   645: checkcast       Ljava/lang/String;
        //   648: checkcast       Ljava/lang/String;
        //   651: invokevirtual   com/whatsapp/AccountInfoActivity.f:(Ljava/lang/String;)V
        //   654: new             Ljava/lang/StringBuilder;
        //   657: dup            
        //   658: invokespecial   java/lang/StringBuilder.<init>:()V
        //   661: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //   664: iconst_2       
        //   665: aaload         
        //   666: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   669: aload_1        
        //   670: getfield        android/os/Message.obj:Ljava/lang/Object;
        //   673: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   676: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   679: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   682: iload_2        
        //   683: ifeq            900
        //   686: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //   689: iconst_3       
        //   690: aaload         
        //   691: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   694: iload_2        
        //   695: ifeq            900
        //   698: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //   701: bipush          9
        //   703: aaload         
        //   704: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   707: aload_0        
        //   708: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   711: invokestatic    com/whatsapp/AccountInfoActivity.o:(Lcom/whatsapp/AccountInfoActivity;)Landroid/os/Handler;
        //   714: bipush          10
        //   716: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   719: aload_0        
        //   720: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   723: invokevirtual   com/whatsapp/AccountInfoActivity.c:()V
        //   726: aload_0        
        //   727: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   730: astore          6
        //   732: aload_0        
        //   733: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   736: astore          7
        //   738: iconst_1       
        //   739: anewarray       Ljava/lang/Object;
        //   742: astore          8
        //   744: aload           8
        //   746: iconst_0       
        //   747: aload_0        
        //   748: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   751: ldc             2131230921
        //   753: invokevirtual   com/whatsapp/AccountInfoActivity.getString:(I)Ljava/lang/String;
        //   756: aastore        
        //   757: aload           6
        //   759: aload           7
        //   761: ldc             2131231532
        //   763: aload           8
        //   765: invokevirtual   com/whatsapp/AccountInfoActivity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   768: invokevirtual   com/whatsapp/AccountInfoActivity.f:(Ljava/lang/String;)V
        //   771: return         
        //   772: astore          5
        //   774: aload           5
        //   776: athrow         
        //   777: astore_3       
        //   778: aload_3        
        //   779: athrow         
        //   780: astore          4
        //   782: aload           4
        //   784: athrow         
        //   785: astore          36
        //   787: aload           36
        //   789: athrow         
        //   790: astore          31
        //   792: aload           31
        //   794: athrow         
        //   795: astore          32
        //   797: aload           32
        //   799: athrow         
        //   800: astore          33
        //   802: aload           33
        //   804: athrow         
        //   805: astore          29
        //   807: aload           29
        //   809: athrow         
        //   810: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //   813: bipush          6
        //   815: aaload         
        //   816: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   819: aload_0        
        //   820: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   823: iconst_5       
        //   824: invokevirtual   com/whatsapp/AccountInfoActivity.showDialog:(I)V
        //   827: iload_2        
        //   828: ifeq            900
        //   831: getstatic       com/whatsapp/au.z:[Ljava/lang/String;
        //   834: iconst_0       
        //   835: aaload         
        //   836: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   839: iload_2        
        //   840: ifeq            900
        //   843: goto            260
        //   846: astore          27
        //   848: aload           27
        //   850: athrow         
        //   851: aload           21
        //   853: aload_0        
        //   854: getfield        com/whatsapp/au.a:Lcom/whatsapp/AccountInfoActivity;
        //   857: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   860: astore          22
        //   862: goto            422
        //   865: astore          24
        //   867: aload           24
        //   869: athrow         
        //   870: astore          18
        //   872: aload           18
        //   874: athrow         
        //   875: astore          14
        //   877: aload           14
        //   879: athrow         
        //   880: astore          15
        //   882: aload           15
        //   884: athrow         
        //   885: astore          9
        //   887: aload           9
        //   889: athrow         
        //   890: astore          10
        //   892: aload           10
        //   894: athrow         
        //   895: astore          11
        //   897: aload           11
        //   899: athrow         
        //   900: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  4      72     777    780    Landroid/content/IntentSender$SendIntentException;
        //  72     95     777    780    Landroid/content/IntentSender$SendIntentException;
        //  99     123    780    785    Landroid/content/IntentSender$SendIntentException;
        //  127    180    181    790    Landroid/content/IntentSender$SendIntentException;
        //  183    202    785    790    Landroid/content/IntentSender$SendIntentException;
        //  206    231    790    795    Landroid/content/IntentSender$SendIntentException;
        //  260    296    805    810    Landroid/content/IntentSender$SendIntentException;
        //  300    324    805    810    Landroid/content/IntentSender$SendIntentException;
        //  411    418    846    851    Landroid/content/IntentSender$SendIntentException;
        //  493    529    865    870    Landroid/content/IntentSender$SendIntentException;
        //  533    560    870    875    Landroid/content/IntentSender$SendIntentException;
        //  564    582    875    880    Landroid/content/IntentSender$SendIntentException;
        //  587    595    880    885    Landroid/content/IntentSender$SendIntentException;
        //  599    626    885    890    Landroid/content/IntentSender$SendIntentException;
        //  626    632    890    895    Landroid/content/IntentSender$SendIntentException;
        //  637    682    895    900    Landroid/content/IntentSender$SendIntentException;
        //  686    694    772    777    Landroid/content/IntentSender$SendIntentException;
        //  698    771    772    777    Landroid/content/IntentSender$SendIntentException;
        //  778    780    780    785    Landroid/content/IntentSender$SendIntentException;
        //  787    790    790    795    Landroid/content/IntentSender$SendIntentException;
        //  792    795    795    800    Landroid/content/IntentSender$SendIntentException;
        //  797    800    800    805    Landroid/content/IntentSender$SendIntentException;
        //  802    805    805    810    Landroid/content/IntentSender$SendIntentException;
        //  810    827    795    800    Landroid/content/IntentSender$SendIntentException;
        //  831    839    800    805    Landroid/content/IntentSender$SendIntentException;
        //  867    870    870    875    Landroid/content/IntentSender$SendIntentException;
        //  872    875    875    880    Landroid/content/IntentSender$SendIntentException;
        //  877    880    880    885    Landroid/content/IntentSender$SendIntentException;
        //  882    885    885    890    Landroid/content/IntentSender$SendIntentException;
        //  892    895    895    900    Landroid/content/IntentSender$SendIntentException;
        //  897    900    772    777    Landroid/content/IntentSender$SendIntentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 384, Size: 384
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
