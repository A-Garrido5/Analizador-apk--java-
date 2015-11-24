// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class VerifySms$2 extends BroadcastReceiver
{
    private static final String[] z;
    private boolean a;
    final VerifySms b;
    
    static {
        final String[] z2 = new String[25];
        String s = "~mf8\rq{y\"Dzmw4\u0002~mp|\u0019mkq8\u001dmz;%\u000ep|;8\u0005|mz%";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0657:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'k';
                        break;
                    }
                    case 0: {
                        c2 = '\b';
                        break;
                    }
                    case 1: {
                        c2 = '\b';
                        break;
                    }
                    case 2: {
                        c2 = '\u0014';
                        break;
                    }
                    case 3: {
                        c2 = 'Q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "~mf8\rq{y\"Dzmw4\u0002~mp|\u0019mkq8\u001dmz;<\u000e{{u6\u000e%fa=\u0007";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "~mf8\rq{y\"Dom`\u0001\u0018m}p>8}j~4\b|(";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "~mf8\rq{y\"Dlag!\u0007iq[#\u0002oaz0\u001fafs\u0010\u000flzq\"\u0018(";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "~mf8\rq{y\"Dmeu8\u0007Nz{<K";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "~mf8\rq{y\"Dom`\u0002\u000ez~}2\u000eKmz%\u000ezIp5\u0019m{gq";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "~mf8\rq{y\"D|ml%Fzmw4\u0002~mf~\u000ezz{#K";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "~mf8\rq{y\"D|ml%Dg}`|\u0004n%y4\u0006gzmq";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "~mf8\rq{y\"D|ml%Fzmw4\u0002~mf~\u0005g|K\"\u0006{Wb4\u0019an}2\n|a{?";
                    n = 7;
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "xla\"";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "_`u%\u0018Ixdq\bglqq";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "~mf8\rq{y\"Dzmw4\u0002~mp|\u0019mkq8\u001dmz;5\u000e{|f>\u0012ml";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "~mf8\rq{y\"Dmeu8\u0007Jgp(K";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "~mf8\rq{y\"Dzmw4\u0002~mp|\u0019mkq8\u001dmz;!\u000f}{9?\u001edd";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "~mf8\rq{y\"Dzmw4\u0002~mp|\u0019mkq8\u001dmz;0\u0007zmu5\u0012(zq2\u000ea~q5";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "~mf8\rq{y\"Dom`\u001c\u000e{{u6\u000eJgp(K";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "~mf8\rq{y\"D|ml%Fzmw4\u0002~mf~";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "~mf8\rq{y\"";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "~mf8\rq{y\"Dlag!\u0007iqY4\u0018{is4)glmq";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "~mf8\rq{y\"Dom`\u001e\u0019ao}?\n|az6*llf4\u0018{(";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    s = "{mf'\u000ez%g4\u0005l%y8\u0018ei`2\u0003%my!\u001fq";
                    n = 19;
                    n2 = 20;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    array = z2;
                    s = "~mf8\rq{y\"Dzmw4\u0002~mp|\u0019mkq8\u001dmz;!\u000f}{9=\u000efo`9D";
                    n = 20;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "~mf8\rq{y\"Dzmw4\u0002~mp|\u0019mkq8\u001dmz;3\u001eflx4Ff}x=";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "~mf8\rq{y\"D|ml%Fzmw4\u0002~mf~\u0005g%w>\u000fm";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "i}`>";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    break Label_0657;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    VerifySms$2(final VerifySms b) {
        this.b = b;
    }
    
    public void onReceive(final Context p0, final Intent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //     7: iconst_0       
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    12: aload_0        
        //    13: getfield        com/whatsapp/VerifySms$2.a:Z
        //    16: ifeq            34
        //    19: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //    22: bipush          14
        //    24: aaload         
        //    25: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    28: return         
        //    29: astore          4
        //    31: aload           4
        //    33: athrow         
        //    34: aload_0        
        //    35: getfield        com/whatsapp/VerifySms$2.b:Lcom/whatsapp/VerifySms;
        //    38: getfield        com/whatsapp/VerifySms.P:Z
        //    41: ifne            697
        //    44: aload_2        
        //    45: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //    48: astore          6
        //    50: aload           6
        //    52: ifnull          684
        //    55: aload           6
        //    57: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //    60: bipush          9
        //    62: aaload         
        //    63: invokevirtual   android/os/Bundle.get:(Ljava/lang/String;)Ljava/lang/Object;
        //    66: checkcast       [Ljava/lang/Object;
        //    69: checkcast       [Ljava/lang/Object;
        //    72: astore          8
        //    74: aload           8
        //    76: ifnull          671
        //    79: new             Ljava/lang/StringBuilder;
        //    82: dup            
        //    83: invokespecial   java/lang/StringBuilder.<init>:()V
        //    86: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //    89: bipush          21
        //    91: aaload         
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: aload           8
        //    97: arraylength    
        //    98: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   101: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   104: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   107: iconst_0       
        //   108: istore          10
        //   110: iload           10
        //   112: aload           8
        //   114: arraylength    
        //   115: if_icmpge       667
        //   118: aload           8
        //   120: iload           10
        //   122: aaload         
        //   123: checkcast       [B
        //   126: checkcast       [B
        //   129: invokestatic    android/telephony/SmsMessage.createFromPdu:([B)Landroid/telephony/SmsMessage;
        //   132: astore          32
        //   134: aload           32
        //   136: astore          12
        //   138: aload           12
        //   140: ifnull          848
        //   143: aload           12
        //   145: invokevirtual   android/telephony/SmsMessage.getMessageBody:()Ljava/lang/String;
        //   148: astore          31
        //   150: aload           31
        //   152: astore          30
        //   154: new             Ljava/lang/StringBuilder;
        //   157: dup            
        //   158: invokespecial   java/lang/StringBuilder.<init>:()V
        //   161: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   164: bipush          15
        //   166: aaload         
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: aload           30
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   178: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   181: new             Ljava/lang/StringBuilder;
        //   184: dup            
        //   185: invokespecial   java/lang/StringBuilder.<init>:()V
        //   188: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   191: bipush          18
        //   193: aaload         
        //   194: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   197: aload           12
        //   199: invokevirtual   android/telephony/SmsMessage.getDisplayMessageBody:()Ljava/lang/String;
        //   202: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   205: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   208: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   211: new             Ljava/lang/StringBuilder;
        //   214: dup            
        //   215: invokespecial   java/lang/StringBuilder.<init>:()V
        //   218: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   221: iconst_3       
        //   222: aaload         
        //   223: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   226: aload           12
        //   228: invokevirtual   android/telephony/SmsMessage.getDisplayOriginatingAddress:()Ljava/lang/String;
        //   231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   234: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   237: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   240: new             Ljava/lang/StringBuilder;
        //   243: dup            
        //   244: invokespecial   java/lang/StringBuilder.<init>:()V
        //   247: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   250: bipush          12
        //   252: aaload         
        //   253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   256: aload           12
        //   258: invokevirtual   android/telephony/SmsMessage.getEmailBody:()Ljava/lang/String;
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   267: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   270: new             Ljava/lang/StringBuilder;
        //   273: dup            
        //   274: invokespecial   java/lang/StringBuilder.<init>:()V
        //   277: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   280: iconst_4       
        //   281: aaload         
        //   282: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   285: aload           12
        //   287: invokevirtual   android/telephony/SmsMessage.getEmailFrom:()Ljava/lang/String;
        //   290: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   293: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   296: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   299: new             Ljava/lang/StringBuilder;
        //   302: dup            
        //   303: invokespecial   java/lang/StringBuilder.<init>:()V
        //   306: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   309: bipush          19
        //   311: aaload         
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: aload           12
        //   317: invokevirtual   android/telephony/SmsMessage.getOriginatingAddress:()Ljava/lang/String;
        //   320: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   323: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   326: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   329: new             Ljava/lang/StringBuilder;
        //   332: dup            
        //   333: invokespecial   java/lang/StringBuilder.<init>:()V
        //   336: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   339: iconst_2       
        //   340: aaload         
        //   341: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   344: aload           12
        //   346: invokevirtual   android/telephony/SmsMessage.getPseudoSubject:()Ljava/lang/String;
        //   349: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   352: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   355: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   358: new             Ljava/lang/StringBuilder;
        //   361: dup            
        //   362: invokespecial   java/lang/StringBuilder.<init>:()V
        //   365: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   368: iconst_5       
        //   369: aaload         
        //   370: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   373: aload           12
        //   375: invokevirtual   android/telephony/SmsMessage.getServiceCenterAddress:()Ljava/lang/String;
        //   378: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   381: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   384: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   387: aload           30
        //   389: astore          13
        //   391: aload           12
        //   393: ifnull          649
        //   396: aload           13
        //   398: ifnull          649
        //   401: new             Ljava/lang/StringBuilder;
        //   404: dup            
        //   405: invokespecial   java/lang/StringBuilder.<init>:()V
        //   408: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   411: bipush          16
        //   413: aaload         
        //   414: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   417: aload           13
        //   419: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   422: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   425: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   428: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   431: bipush          10
        //   433: aaload         
        //   434: astore          16
        //   436: aload           13
        //   438: aload           16
        //   440: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   443: istore          17
        //   445: iload           17
        //   447: iflt            636
        //   450: ldc             ""
        //   452: astore          19
        //   454: iload           17
        //   456: aload           16
        //   458: invokevirtual   java/lang/String.length:()I
        //   461: iadd           
        //   462: istore          26
        //   464: iload           26
        //   466: aload           13
        //   468: invokevirtual   java/lang/String.length:()I
        //   471: if_icmpge       520
        //   474: aload           13
        //   476: iload           26
        //   478: invokevirtual   java/lang/String.charAt:(I)C
        //   481: istore          28
        //   483: iload           28
        //   485: invokestatic    java/lang/Character.isDigit:(C)Z
        //   488: ifeq            854
        //   491: new             Ljava/lang/StringBuilder;
        //   494: dup            
        //   495: invokespecial   java/lang/StringBuilder.<init>:()V
        //   498: aload           19
        //   500: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   503: iload           28
        //   505: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   508: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   511: astore          19
        //   513: iload_3        
        //   514: ifeq            865
        //   517: goto            854
        //   520: aload           19
        //   522: invokevirtual   java/lang/String.length:()I
        //   525: ifle            805
        //   528: aload           19
        //   530: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   533: istore          27
        //   535: iload           27
        //   537: istore          21
        //   539: iload           21
        //   541: iconst_m1      
        //   542: if_icmpeq       610
        //   545: aload_0        
        //   546: iconst_1       
        //   547: putfield        com/whatsapp/VerifySms$2.a:Z
        //   550: aload_0        
        //   551: invokevirtual   com/whatsapp/VerifySms$2.abortBroadcast:()V
        //   554: aload_0        
        //   555: getfield        com/whatsapp/VerifySms$2.b:Lcom/whatsapp/VerifySms;
        //   558: aload           19
        //   560: invokestatic    com/whatsapp/VerifySms.a:(Lcom/whatsapp/VerifySms;Ljava/lang/String;)V
        //   563: new             Lcom/whatsapp/b2;
        //   566: dup            
        //   567: aload_0        
        //   568: getfield        com/whatsapp/VerifySms$2.b:Lcom/whatsapp/VerifySms;
        //   571: invokespecial   com/whatsapp/b2.<init>:(Lcom/whatsapp/VerifySms;)V
        //   574: astore          23
        //   576: iconst_2       
        //   577: anewarray       Ljava/lang/String;
        //   580: astore          24
        //   582: aload           24
        //   584: iconst_0       
        //   585: aload           19
        //   587: aastore        
        //   588: aload           24
        //   590: iconst_1       
        //   591: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   594: bipush          24
        //   596: aaload         
        //   597: aastore        
        //   598: aload           23
        //   600: aload           24
        //   602: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   605: pop            
        //   606: iload_3        
        //   607: ifeq            632
        //   610: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   613: bipush          23
        //   615: aaload         
        //   616: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   619: aload_0        
        //   620: getfield        com/whatsapp/VerifySms$2.b:Lcom/whatsapp/VerifySms;
        //   623: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   626: bipush          20
        //   628: aaload         
        //   629: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   632: iload_3        
        //   633: ifeq            645
        //   636: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   639: bipush          8
        //   641: aaload         
        //   642: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   645: iload_3        
        //   646: ifeq            657
        //   649: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   652: iconst_1       
        //   653: aaload         
        //   654: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   657: iload           10
        //   659: iconst_1       
        //   660: iadd           
        //   661: istore          15
        //   663: iload_3        
        //   664: ifeq            841
        //   667: iload_3        
        //   668: ifeq            680
        //   671: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   674: bipush          13
        //   676: aaload         
        //   677: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   680: iload_3        
        //   681: ifeq            693
        //   684: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   687: bipush          22
        //   689: aaload         
        //   690: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   693: iload_3        
        //   694: ifeq            28
        //   697: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   700: bipush          11
        //   702: aaload         
        //   703: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   706: return         
        //   707: astore          5
        //   709: aload           5
        //   711: athrow         
        //   712: astore          11
        //   714: new             Ljava/lang/StringBuilder;
        //   717: dup            
        //   718: invokespecial   java/lang/StringBuilder.<init>:()V
        //   721: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   724: bipush          7
        //   726: aaload         
        //   727: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   730: aload           11
        //   732: invokevirtual   java/lang/OutOfMemoryError.toString:()Ljava/lang/String;
        //   735: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   738: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   741: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   744: aconst_null    
        //   745: astore          12
        //   747: goto            138
        //   750: astore          29
        //   752: aconst_null    
        //   753: astore          30
        //   755: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   758: bipush          17
        //   760: aaload         
        //   761: aload           29
        //   763: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   766: aload           30
        //   768: astore          13
        //   770: goto            391
        //   773: astore          20
        //   775: new             Ljava/lang/StringBuilder;
        //   778: dup            
        //   779: invokespecial   java/lang/StringBuilder.<init>:()V
        //   782: getstatic       com/whatsapp/VerifySms$2.z:[Ljava/lang/String;
        //   785: bipush          6
        //   787: aaload         
        //   788: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   791: aload           20
        //   793: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   796: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   799: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   802: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   805: iconst_m1      
        //   806: istore          21
        //   808: goto            539
        //   811: astore          22
        //   813: aload           22
        //   815: athrow         
        //   816: astore          18
        //   818: aload           18
        //   820: athrow         
        //   821: astore          14
        //   823: aload           14
        //   825: athrow         
        //   826: astore          9
        //   828: aload           9
        //   830: athrow         
        //   831: astore          7
        //   833: aload           7
        //   835: athrow         
        //   836: astore          29
        //   838: goto            755
        //   841: iload           15
        //   843: istore          10
        //   845: goto            110
        //   848: aconst_null    
        //   849: astore          13
        //   851: goto            391
        //   854: iload           28
        //   856: bipush          45
        //   858: if_icmpeq       865
        //   861: iload_3        
        //   862: ifeq            520
        //   865: iinc            26, 1
        //   868: iload_3        
        //   869: ifeq            464
        //   872: goto            520
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      28     29     34     Ljava/lang/OutOfMemoryError;
        //  118    134    712    750    Ljava/lang/OutOfMemoryError;
        //  143    150    750    755    Ljava/lang/NullPointerException;
        //  154    387    836    841    Ljava/lang/NullPointerException;
        //  454    464    773    805    Ljava/lang/Exception;
        //  464    513    773    805    Ljava/lang/Exception;
        //  520    535    773    805    Ljava/lang/Exception;
        //  545    606    811    816    Ljava/lang/OutOfMemoryError;
        //  610    632    811    816    Ljava/lang/OutOfMemoryError;
        //  636    645    816    821    Ljava/lang/OutOfMemoryError;
        //  649    657    821    826    Ljava/lang/OutOfMemoryError;
        //  671    680    826    831    Ljava/lang/OutOfMemoryError;
        //  684    693    831    836    Ljava/lang/OutOfMemoryError;
        //  697    706    707    712    Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 392, Size: 392
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
