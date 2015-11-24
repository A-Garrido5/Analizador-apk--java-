// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class VerifySms$3 extends BroadcastReceiver
{
    private static final String[] z;
    final VerifySms a;
    
    static {
        final String[] z2 = new String[31];
        String s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016F";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0807:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = 'U';
                        break;
                    }
                    case 1: {
                        c2 = 'd';
                        break;
                    }
                    case 2: {
                        c2 = 'f';
                        break;
                    }
                    case 3: {
                        c2 = 'Z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "~QTk";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "#\u0001\u00143 ,\u0017\u000b)i:\u0011\u0012w)3I\u000b?+:\u0016\u001fz";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016I7/&\t\u0007.%=K\u00152)'\u0010F";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "~QT";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "#\u0001\u00143 ,\u0017\u000b)i2\u0001\u0012\n50\u0011\u00025\u0015 \u0006\f?%!D";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "&\u0001\n<k&\u0001\b>k8\r\u00157'!\u0007\u000ew6=\u000b\b?";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016I7/&\t\u0007.%=K\u0010;* \u0001F438\u0006\u0003({";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016I7/&\u0017\u000f4!x\u0007\u000e;*9\u0001\b=#";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "u\u0016\u00039#<\u0012\u0003>{";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "#\u0001\u00143 ,\u0017\u000b)i0\t\u00073*\u0017\u000b\u0002#f";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0011\u0001\u0015./;\u000bF3(6\u000b\u0014(#6\u0010\t";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016I>'!\u0005I3(!\u0001\b.";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016I*\" \u0017K6#;\u0003\u00122i";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "#\u0001\u00143 ,\u0017\u000b)i0\t\u00073*\u0013\u0016\t7f";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016F";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016I,#'\r\u00003#1";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "#\u0001\u00143 ,\u0017\u000b)i2\u0001\u0012\t#'\u0012\u000f9#\u0016\u0001\b.#'%\u0002>40\u0017\u0015z";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016I7#&\u0017\u0007=#x\n\u00136*";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "#\u0001\u00143 ,\u0017\u000b)i2\u0001\u0012\u00154<\u0003\u000f4'!\r\b=\u00071\u0000\u0014?5&D";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "&\u0001\n<k&\u0001\b>k8\r\u00157'!\u0007\u000ew6=\u000b\b?";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016I83;\u0000\n?k;\u0011\n6";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "#\u0001\u00143 ,\u0017\u000b)i2\u0001\u0012\u0017#&\u0017\u0007=#\u0017\u000b\u0002#f";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "%\u0000\u0013)";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "#\u0001\u00143 ,\u0017\u000b)i1\r\u0015**4\u001d)(/2\r\b;2<\n\u0001\u001b\"1\u0016\u0003)5u";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "4\u0011\u00125";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "#\u0001\u00143 ,\u0017\u000b)i'\u0001\u0005?/#\u0001\u0002w40\u0007\u0003300\u0016I>#&\u0010\u00145?0\u0000";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0011\u0001\u0015./;\u000bF3(6\u000b\u0014(#6\u0010\t";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "#\u0001\u00143 ,\u0017\u000b)i1\r\u0015**4\u001d+?5&\u0005\u0001?\u0004:\u0000\u001fz";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "#\u0001\u00143 ,\u0017\u000b)i2\u0001\u0012\t#'\u0012\u000f9#\u0016\u0001\b.#'0\u000f7#&\u0010\u000776u";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "#\u0001\u00143 ,\u0017\u000b)";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    break Label_0807;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    VerifySms$3(final VerifySms a) {
        this.a = a;
    }
    
    public void onReceive(final Context p0, final Intent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //     7: bipush          12
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //    17: getfield        com/whatsapp/VerifySms.P:Z
        //    20: ifne            962
        //    23: aload_2        
        //    24: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //    27: astore          5
        //    29: aload           5
        //    31: ifnull          949
        //    34: aload           5
        //    36: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //    39: bipush          23
        //    41: aaload         
        //    42: invokevirtual   android/os/Bundle.get:(Ljava/lang/String;)Ljava/lang/Object;
        //    45: checkcast       [Ljava/lang/Object;
        //    48: checkcast       [Ljava/lang/Object;
        //    51: astore          7
        //    53: new             Ljava/lang/StringBuilder;
        //    56: dup            
        //    57: invokespecial   java/lang/StringBuilder.<init>:()V
        //    60: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //    63: bipush          13
        //    65: aaload         
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: aload           7
        //    71: arraylength    
        //    72: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    75: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    78: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    81: ldc             ""
        //    83: astore          8
        //    85: ldc             ""
        //    87: astore          9
        //    89: aconst_null    
        //    90: astore          10
        //    92: iconst_0       
        //    93: istore          11
        //    95: iload           11
        //    97: aload           7
        //    99: arraylength    
        //   100: if_icmpge       529
        //   103: aload           7
        //   105: iload           11
        //   107: aaload         
        //   108: checkcast       [B
        //   111: checkcast       [B
        //   114: invokestatic    android/telephony/SmsMessage.createFromPdu:([B)Landroid/telephony/SmsMessage;
        //   117: astore          50
        //   119: iload           11
        //   121: ifne            128
        //   124: aload           50
        //   126: astore          10
        //   128: aload           50
        //   130: astore          43
        //   132: aload           43
        //   134: ifnull          519
        //   137: ldc             ""
        //   139: astore          45
        //   141: aload           43
        //   143: invokevirtual   android/telephony/SmsMessage.getUserData:()[B
        //   146: astore          47
        //   148: aload           47
        //   150: ifnull          222
        //   153: iconst_0       
        //   154: istore          49
        //   156: iload           49
        //   158: aload           47
        //   160: arraylength    
        //   161: if_icmpge       200
        //   164: new             Ljava/lang/StringBuilder;
        //   167: dup            
        //   168: invokespecial   java/lang/StringBuilder.<init>:()V
        //   171: aload           45
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: aload           47
        //   178: iload           49
        //   180: baload         
        //   181: i2c            
        //   182: invokestatic    java/lang/Character.toString:(C)Ljava/lang/String;
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   191: astore          45
        //   193: iinc            49, 1
        //   196: iload_3        
        //   197: ifeq            156
        //   200: new             Ljava/lang/StringBuilder;
        //   203: dup            
        //   204: invokespecial   java/lang/StringBuilder.<init>:()V
        //   207: aload           8
        //   209: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   212: aload           45
        //   214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   217: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   220: astore          8
        //   222: aload           43
        //   224: invokevirtual   android/telephony/SmsMessage.getDisplayMessageBody:()Ljava/lang/String;
        //   227: astore          48
        //   229: aload           48
        //   231: ifnull          256
        //   234: new             Ljava/lang/StringBuilder;
        //   237: dup            
        //   238: invokespecial   java/lang/StringBuilder.<init>:()V
        //   241: aload           9
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: aload           48
        //   248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   251: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   254: astore          9
        //   256: new             Ljava/lang/StringBuilder;
        //   259: dup            
        //   260: invokespecial   java/lang/StringBuilder.<init>:()V
        //   263: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   266: bipush          22
        //   268: aaload         
        //   269: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   272: aload           45
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   280: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   283: new             Ljava/lang/StringBuilder;
        //   286: dup            
        //   287: invokespecial   java/lang/StringBuilder.<init>:()V
        //   290: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   293: bipush          28
        //   295: aaload         
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   299: aload           48
        //   301: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   304: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   307: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   310: new             Ljava/lang/StringBuilder;
        //   313: dup            
        //   314: invokespecial   java/lang/StringBuilder.<init>:()V
        //   317: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   320: bipush          24
        //   322: aaload         
        //   323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   326: aload           43
        //   328: invokevirtual   android/telephony/SmsMessage.getDisplayOriginatingAddress:()Ljava/lang/String;
        //   331: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   334: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   337: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   340: new             Ljava/lang/StringBuilder;
        //   343: dup            
        //   344: invokespecial   java/lang/StringBuilder.<init>:()V
        //   347: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   350: bipush          10
        //   352: aaload         
        //   353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   356: aload           43
        //   358: invokevirtual   android/telephony/SmsMessage.getEmailBody:()Ljava/lang/String;
        //   361: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   364: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   367: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   370: new             Ljava/lang/StringBuilder;
        //   373: dup            
        //   374: invokespecial   java/lang/StringBuilder.<init>:()V
        //   377: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   380: bipush          14
        //   382: aaload         
        //   383: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   386: aload           43
        //   388: invokevirtual   android/telephony/SmsMessage.getEmailFrom:()Ljava/lang/String;
        //   391: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   394: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   397: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   400: new             Ljava/lang/StringBuilder;
        //   403: dup            
        //   404: invokespecial   java/lang/StringBuilder.<init>:()V
        //   407: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   410: bipush          19
        //   412: aaload         
        //   413: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   416: aload           43
        //   418: invokevirtual   android/telephony/SmsMessage.getOriginatingAddress:()Ljava/lang/String;
        //   421: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   424: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   427: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   430: new             Ljava/lang/StringBuilder;
        //   433: dup            
        //   434: invokespecial   java/lang/StringBuilder.<init>:()V
        //   437: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   440: iconst_5       
        //   441: aaload         
        //   442: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   445: aload           43
        //   447: invokevirtual   android/telephony/SmsMessage.getPseudoSubject:()Ljava/lang/String;
        //   450: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   453: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   456: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   459: new             Ljava/lang/StringBuilder;
        //   462: dup            
        //   463: invokespecial   java/lang/StringBuilder.<init>:()V
        //   466: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   469: bipush          29
        //   471: aaload         
        //   472: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   475: aload           43
        //   477: invokevirtual   android/telephony/SmsMessage.getTimestampMillis:()J
        //   480: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   483: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   486: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   489: new             Ljava/lang/StringBuilder;
        //   492: dup            
        //   493: invokespecial   java/lang/StringBuilder.<init>:()V
        //   496: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   499: bipush          17
        //   501: aaload         
        //   502: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   505: aload           43
        //   507: invokevirtual   android/telephony/SmsMessage.getServiceCenterAddress:()Ljava/lang/String;
        //   510: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   513: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   516: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   519: iload           11
        //   521: iconst_1       
        //   522: iadd           
        //   523: istore          44
        //   525: iload_3        
        //   526: ifeq            1226
        //   529: aload           8
        //   531: invokevirtual   java/lang/String.length:()I
        //   534: istore          15
        //   536: iload           15
        //   538: ifgt            553
        //   541: aload           9
        //   543: invokevirtual   java/lang/String.length:()I
        //   546: istore          41
        //   548: iload           41
        //   550: ifle            1179
        //   553: new             Ljava/lang/StringBuilder;
        //   556: dup            
        //   557: invokespecial   java/lang/StringBuilder.<init>:()V
        //   560: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   563: bipush          15
        //   565: aaload         
        //   566: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   569: aload           8
        //   571: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   574: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   577: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   580: new             Ljava/lang/StringBuilder;
        //   583: dup            
        //   584: invokespecial   java/lang/StringBuilder.<init>:()V
        //   587: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   590: iconst_0       
        //   591: aaload         
        //   592: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   595: aload           9
        //   597: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   600: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   603: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   606: aload           8
        //   608: invokestatic    com/whatsapp/VerifySms.H:()Ljava/lang/String;
        //   611: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   614: ifne            632
        //   617: aload           9
        //   619: invokestatic    com/whatsapp/VerifySms.H:()Ljava/lang/String;
        //   622: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   625: istore          31
        //   627: iload           31
        //   629: ifeq            1070
        //   632: aload_0        
        //   633: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //   636: aload_0        
        //   637: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //   640: invokestatic    com/whatsapp/VerifySms.e:(Lcom/whatsapp/VerifySms;)Ljava/lang/String;
        //   643: aload_0        
        //   644: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //   647: invokestatic    com/whatsapp/VerifySms.y:(Lcom/whatsapp/VerifySms;)Ljava/lang/String;
        //   650: invokevirtual   com/whatsapp/VerifySms.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   653: astore          16
        //   655: aload           10
        //   657: invokevirtual   android/telephony/SmsMessage.getOriginatingAddress:()Ljava/lang/String;
        //   660: astore          17
        //   662: aload_0        
        //   663: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //   666: invokestatic    com/whatsapp/VerifySms.t:(Lcom/whatsapp/VerifySms;)V
        //   669: aload           16
        //   671: ifnull          707
        //   674: aload           17
        //   676: ifnull          707
        //   679: aload           16
        //   681: invokevirtual   java/lang/String.length:()I
        //   684: istore          29
        //   686: iload           29
        //   688: bipush          6
        //   690: if_icmplt       707
        //   693: aload           17
        //   695: invokevirtual   java/lang/String.length:()I
        //   698: istore          30
        //   700: iload           30
        //   702: bipush          6
        //   704: if_icmpge       757
        //   707: new             Ljava/lang/StringBuilder;
        //   710: dup            
        //   711: invokespecial   java/lang/StringBuilder.<init>:()V
        //   714: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   717: iconst_3       
        //   718: aaload         
        //   719: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   722: aload           17
        //   724: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   727: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   730: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   733: aload_0        
        //   734: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //   737: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   740: bipush          6
        //   742: aaload         
        //   743: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   746: aload_0        
        //   747: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //   750: invokestatic    com/whatsapp/VerifySms.g:(Lcom/whatsapp/VerifySms;)V
        //   753: iload_3        
        //   754: ifeq            945
        //   757: aload           16
        //   759: bipush          -6
        //   761: aload           16
        //   763: invokevirtual   java/lang/String.length:()I
        //   766: iadd           
        //   767: aload           16
        //   769: invokevirtual   java/lang/String.length:()I
        //   772: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   775: aload           17
        //   777: bipush          -6
        //   779: aload           17
        //   781: invokevirtual   java/lang/String.length:()I
        //   784: iadd           
        //   785: aload           17
        //   787: invokevirtual   java/lang/String.length:()I
        //   790: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   793: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   796: istore          23
        //   798: iload           23
        //   800: ifeq            884
        //   803: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   806: bipush          16
        //   808: aaload         
        //   809: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   812: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   815: invokestatic    com/whatsapp/App.y:(Landroid/content/Context;)Ljava/lang/String;
        //   818: invokestatic    com/whatsapp/VerifyNumber.b:(Ljava/lang/String;)Ljava/lang/String;
        //   821: astore          25
        //   823: getstatic       com/whatsapp/App.aV:I
        //   826: iconst_3       
        //   827: if_icmpeq       837
        //   830: aload           25
        //   832: invokestatic    com/whatsapp/al5.c:(Ljava/lang/String;)Ljava/lang/String;
        //   835: astore          25
        //   837: new             Lcom/whatsapp/b2;
        //   840: dup            
        //   841: aload_0        
        //   842: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //   845: invokespecial   com/whatsapp/b2.<init>:(Lcom/whatsapp/VerifySms;)V
        //   848: astore          26
        //   850: iconst_2       
        //   851: anewarray       Ljava/lang/String;
        //   854: astore          27
        //   856: aload           27
        //   858: iconst_0       
        //   859: aload           25
        //   861: aastore        
        //   862: aload           27
        //   864: iconst_1       
        //   865: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   868: bipush          25
        //   870: aaload         
        //   871: aastore        
        //   872: aload           26
        //   874: aload           27
        //   876: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   879: pop            
        //   880: iload_3        
        //   881: ifeq            945
        //   884: new             Ljava/lang/StringBuilder;
        //   887: dup            
        //   888: invokespecial   java/lang/StringBuilder.<init>:()V
        //   891: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   894: bipush          7
        //   896: aaload         
        //   897: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   900: aload           16
        //   902: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   905: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   908: bipush          9
        //   910: aaload         
        //   911: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   914: aload           17
        //   916: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   919: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   922: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   925: aload_0        
        //   926: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //   929: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   932: bipush          20
        //   934: aaload         
        //   935: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   938: aload_0        
        //   939: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //   942: invokestatic    com/whatsapp/VerifySms.g:(Lcom/whatsapp/VerifySms;)V
        //   945: iload_3        
        //   946: ifeq            958
        //   949: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   952: bipush          21
        //   954: aaload         
        //   955: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   958: iload_3        
        //   959: ifeq            971
        //   962: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   965: bipush          26
        //   967: aaload         
        //   968: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   971: return         
        //   972: astore          42
        //   974: new             Ljava/lang/StringBuilder;
        //   977: dup            
        //   978: invokespecial   java/lang/StringBuilder.<init>:()V
        //   981: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //   984: iconst_2       
        //   985: aaload         
        //   986: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   989: aload           42
        //   991: invokevirtual   java/lang/OutOfMemoryError.toString:()Ljava/lang/String;
        //   994: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   997: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1000: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1003: aconst_null    
        //  1004: astore          43
        //  1006: goto            132
        //  1009: astore          46
        //  1011: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //  1014: bipush          30
        //  1016: aaload         
        //  1017: aload           46
        //  1019: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1022: goto            519
        //  1025: astore          12
        //  1027: aload           12
        //  1029: athrow         
        //  1030: astore          13
        //  1032: aload           13
        //  1034: athrow         
        //  1035: astore          14
        //  1037: aload           14
        //  1039: athrow         
        //  1040: astore          18
        //  1042: aload           18
        //  1044: athrow         
        //  1045: astore          19
        //  1047: aload           19
        //  1049: athrow         
        //  1050: astore          20
        //  1052: aload           20
        //  1054: athrow         
        //  1055: astore          21
        //  1057: aload           21
        //  1059: athrow         
        //  1060: astore          22
        //  1062: aload           22
        //  1064: athrow         
        //  1065: astore          24
        //  1067: aload           24
        //  1069: athrow         
        //  1070: aload           8
        //  1072: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //  1075: bipush          27
        //  1077: aaload         
        //  1078: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1081: istore          36
        //  1083: iload           36
        //  1085: ifne            1106
        //  1088: aload           9
        //  1090: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //  1093: bipush          11
        //  1095: aaload         
        //  1096: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1099: istore          40
        //  1101: iload           40
        //  1103: ifeq            1166
        //  1106: invokestatic    com/whatsapp/VerifySms.c:()Ljava/lang/String;
        //  1109: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //  1112: iconst_4       
        //  1113: aaload         
        //  1114: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  1117: istore          37
        //  1119: iload           37
        //  1121: ifeq            1166
        //  1124: invokestatic    com/whatsapp/VerifySms.c:()Ljava/lang/String;
        //  1127: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //  1130: iconst_1       
        //  1131: aaload         
        //  1132: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  1135: ifne            1166
        //  1138: aload_0        
        //  1139: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //  1142: invokestatic    com/whatsapp/VerifySms.t:(Lcom/whatsapp/VerifySms;)V
        //  1145: bipush          6
        //  1147: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //  1150: pop            
        //  1151: aload_0        
        //  1152: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //  1155: invokestatic    com/whatsapp/VerifySms.k:(Lcom/whatsapp/VerifySms;)V
        //  1158: aload_0        
        //  1159: getfield        com/whatsapp/VerifySms$3.a:Lcom/whatsapp/VerifySms;
        //  1162: iconst_4       
        //  1163: invokevirtual   com/whatsapp/VerifySms.e:(I)V
        //  1166: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //  1169: bipush          8
        //  1171: aaload         
        //  1172: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1175: iload_3        
        //  1176: ifeq            945
        //  1179: getstatic       com/whatsapp/VerifySms$3.z:[Ljava/lang/String;
        //  1182: bipush          18
        //  1184: aaload         
        //  1185: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1188: goto            945
        //  1191: astore          38
        //  1193: aload           38
        //  1195: athrow         
        //  1196: astore          32
        //  1198: aload           32
        //  1200: athrow         
        //  1201: astore          33
        //  1203: aload           33
        //  1205: athrow         
        //  1206: astore          34
        //  1208: aload           34
        //  1210: athrow         
        //  1211: astore          35
        //  1213: aload           35
        //  1215: athrow         
        //  1216: astore          6
        //  1218: aload           6
        //  1220: athrow         
        //  1221: astore          4
        //  1223: aload           4
        //  1225: athrow         
        //  1226: iload           44
        //  1228: istore          11
        //  1230: goto            95
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  103    119    972    1009   Ljava/lang/OutOfMemoryError;
        //  141    148    1009   1025   Ljava/lang/NullPointerException;
        //  156    193    1009   1025   Ljava/lang/NullPointerException;
        //  200    222    1009   1025   Ljava/lang/NullPointerException;
        //  222    229    1009   1025   Ljava/lang/NullPointerException;
        //  234    256    1009   1025   Ljava/lang/NullPointerException;
        //  256    519    1009   1025   Ljava/lang/NullPointerException;
        //  529    536    1025   1030   Ljava/lang/OutOfMemoryError;
        //  541    548    1030   1035   Ljava/lang/OutOfMemoryError;
        //  553    627    1035   1040   Ljava/lang/OutOfMemoryError;
        //  662    669    1040   1050   Ljava/lang/OutOfMemoryError;
        //  679    686    1050   1055   Ljava/lang/OutOfMemoryError;
        //  693    700    1055   1060   Ljava/lang/OutOfMemoryError;
        //  707    753    1060   1065   Ljava/lang/OutOfMemoryError;
        //  757    798    1060   1065   Ljava/lang/OutOfMemoryError;
        //  837    880    1065   1070   Ljava/lang/OutOfMemoryError;
        //  884    945    1065   1070   Ljava/lang/OutOfMemoryError;
        //  949    958    1216   1221   Ljava/lang/OutOfMemoryError;
        //  962    971    1221   1226   Ljava/lang/OutOfMemoryError;
        //  1027   1030   1030   1035   Ljava/lang/OutOfMemoryError;
        //  1032   1035   1035   1040   Ljava/lang/OutOfMemoryError;
        //  1042   1045   1045   1050   Ljava/lang/OutOfMemoryError;
        //  1047   1050   1050   1055   Ljava/lang/OutOfMemoryError;
        //  1052   1055   1055   1060   Ljava/lang/OutOfMemoryError;
        //  1057   1060   1060   1065   Ljava/lang/OutOfMemoryError;
        //  1070   1083   1196   1201   Ljava/lang/OutOfMemoryError;
        //  1088   1101   1201   1206   Ljava/lang/OutOfMemoryError;
        //  1106   1119   1206   1211   Ljava/lang/OutOfMemoryError;
        //  1124   1166   1211   1216   Ljava/lang/OutOfMemoryError;
        //  1166   1175   1191   1196   Ljava/lang/OutOfMemoryError;
        //  1179   1188   1191   1196   Ljava/lang/OutOfMemoryError;
        //  1198   1201   1201   1206   Ljava/lang/OutOfMemoryError;
        //  1203   1206   1206   1211   Ljava/lang/OutOfMemoryError;
        //  1208   1211   1211   1216   Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 548, Size: 548
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
