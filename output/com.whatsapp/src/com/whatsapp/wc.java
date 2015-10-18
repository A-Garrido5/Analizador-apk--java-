// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.contact.o;
import com.whatsapp.contact.f;
import android.text.TextUtils;
import com.whatsapp.contact.j;
import com.whatsapp.util.Log;
import android.util.Pair;
import java.util.List;
import java.util.Collection;
import java.util.Set;
import java.util.ArrayList;
import android.database.Cursor;
import android.provider.ContactsContract$Contacts;
import android.provider.ContactsContract$RawContacts;
import android.content.ContentResolver;
import java.util.Iterator;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.whatsapp.util.cq;
import android.content.Intent;
import com.whatsapp.util.bm;
import android.net.Uri;
import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class wc
{
    private static a_d b;
    private static final Map c;
    private static final String[] z;
    private final v6 a;
    
    static {
        final String[] z2 = new String[38];
        String s = "Ko`CDRd";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0982:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '-';
                        break;
                    }
                    case 0: {
                        c3 = '=';
                        break;
                    }
                    case 1: {
                        c3 = '\n';
                        break;
                    }
                    case 2: {
                        c3 = '\u0012';
                        break;
                    }
                    case 3: {
                        c3 = '0';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Yh{^KR%uUYN\u007f\u007f\u001f\\Ho`I\u0002Xdv";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Yh{^KR%uUYN\u007f\u007f\u001f\\Ho`I\u0002N~sBY";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "^e\u007f\u001eLSn`_DY$~QXSizU_\u0013kqDDRd<ycn^S|abYZ\u007f\u007fiIGd";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\\dvBBTn<YCIo|D\u0003XrfBL\u0013yz__IigD\u0003sK_u";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "Wcv";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\\dvBBTn<YCIo|D\u0003XrfBL\u0013yz__IigD\u0003tDFuci";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Y\u007fb\\D^kfU";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Yca@A\\s|Q@X";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\\dvBBTn<YCIo|D\u0003XrfBL\u0013yz__IigD\u0003tI]~";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    s = "\\dvBBTn<YCIo|D\u0003\\ifYBS$_qds";
                    n = 9;
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    array = z2;
                    s = "}y<GE\\~aQ]M$|UY";
                    n = 10;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "no`FHOJa\u001eZUkfCLMz<^HI";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "Yo~";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "Yh{^KR%\u007fQC\\mwB\u0002Yo~UYXI}^Y\\ifC";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "bcv\r\u0012";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "^e|DL^~MYI";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "^e\u007f\u001eLSn`_DY$~QXSizU_\u0013kqDDRd<ectDAdlqFMcerXFsxi";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    s = "TdvY[^eg^Y\u0012i}ECI*";
                    n = 17;
                    n2 = 18;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    array = z2;
                    s = "^e|DL^~MYI\u00005";
                    n = 18;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "^e|DL^~\u007fQC\\mwB\u0002HzvQYXUz_AYegDr^e|DL^~MQCYx}YIbc|VB\u0007*7C";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "Yca@A\\sM^LPo";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "OkeoNRdfQNIU{T";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "YkfQ\u001c";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "YkfQ\u001e";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "YkfQ\u001f";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "YkfQ\u001e";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "TdMFDNcp\\Hbm`_XM";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "^e|DL^~MYI\u00005";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "YkfQ\u001f";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "Ne`DrVok";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "bcv";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "YkfQ\u001c";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "OkeoNRdfQNIU{T";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "HzvQYXB}\\Ir\u007ffsBS~sSY\u0012mwDrS\u007f~\\rJkq_CIkqD";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "^e|DL^~\u007fQC\\mwB\u0002^bwSFbk|Tr\\nvoNRdfQNI%aIC^Us\\_XkvIrTdM@_Rm`U^N";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "^e|DL^~\u007fQC\\mwB\u0002HzvQYXUz_AYU}EYbi}^Y\\if\u001f^DdqoLQxwQIDU{^rMx}W_Xya";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "}y<GE\\~aQ]M$|UY";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    break Label_0982;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        c = Collections.synchronizedMap(new HashMap<Object, Object>());
    }
    
    public wc(final Context context) {
        this.a = new v6(context);
    }
    
    static v6 a(final wc wc) {
        return wc.a;
    }
    
    private boolean a(final Context p0, final Uri p1, final a_9 p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore          4
        //     5: iconst_3       
        //     6: anewarray       Ljava/lang/String;
        //     9: astore          5
        //    11: aload           5
        //    13: iconst_0       
        //    14: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //    17: bipush          31
        //    19: aaload         
        //    20: aastore        
        //    21: aload           5
        //    23: iconst_1       
        //    24: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //    27: bipush          21
        //    29: aaload         
        //    30: aastore        
        //    31: aload           5
        //    33: iconst_2       
        //    34: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //    37: bipush          27
        //    39: aaload         
        //    40: aastore        
        //    41: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    44: bipush          11
        //    46: if_icmplt       110
        //    49: iconst_5       
        //    50: anewarray       Ljava/lang/String;
        //    53: astore          50
        //    55: aload           50
        //    57: iconst_0       
        //    58: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //    61: bipush          22
        //    63: aaload         
        //    64: aastore        
        //    65: aload           50
        //    67: iconst_1       
        //    68: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //    71: bipush          23
        //    73: aaload         
        //    74: aastore        
        //    75: aload           50
        //    77: iconst_2       
        //    78: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //    81: bipush          29
        //    83: aaload         
        //    84: aastore        
        //    85: aload           50
        //    87: iconst_3       
        //    88: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //    91: bipush          24
        //    93: aaload         
        //    94: aastore        
        //    95: aload           50
        //    97: iconst_4       
        //    98: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //   101: bipush          30
        //   103: aaload         
        //   104: aastore        
        //   105: iload           4
        //   107: ifeq            830
        //   110: iconst_4       
        //   111: anewarray       Ljava/lang/String;
        //   114: astore          6
        //   116: aload           6
        //   118: iconst_0       
        //   119: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //   122: bipush          33
        //   124: aaload         
        //   125: aastore        
        //   126: aload           6
        //   128: iconst_1       
        //   129: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //   132: bipush          32
        //   134: aaload         
        //   135: aastore        
        //   136: aload           6
        //   138: iconst_2       
        //   139: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //   142: bipush          25
        //   144: aaload         
        //   145: aastore        
        //   146: aload           6
        //   148: iconst_3       
        //   149: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //   152: bipush          26
        //   154: aaload         
        //   155: aastore        
        //   156: aload           6
        //   158: astore          7
        //   160: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //   163: bipush          28
        //   165: aaload         
        //   166: pop            
        //   167: aload_3        
        //   168: ifnonnull       281
        //   171: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //   174: bipush          34
        //   176: aaload         
        //   177: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   180: invokestatic    com/whatsapp/App.p:()Z
        //   183: istore          43
        //   185: iload           43
        //   187: ifeq            258
        //   190: getstatic       com/whatsapp/contact/h.INTERACTIVE_DELTA:Lcom/whatsapp/contact/h;
        //   193: astore          44
        //   195: aload_1        
        //   196: aload           44
        //   198: invokestatic    com/whatsapp/contact/f.d:(Landroid/content/Context;Lcom/whatsapp/contact/h;)Lcom/whatsapp/contact/k;
        //   201: astore          45
        //   203: aload           45
        //   205: invokevirtual   com/whatsapp/contact/k.isFailure:()Z
        //   208: ifeq            223
        //   211: getstatic       com/whatsapp/App.aL:Lcom/whatsapp/m7;
        //   214: iconst_0       
        //   215: invokevirtual   com/whatsapp/m7.b:(Z)V
        //   218: iload           4
        //   220: ifeq            242
        //   223: aload           45
        //   225: invokevirtual   com/whatsapp/contact/k.isSuccess:()Z
        //   228: istore          49
        //   230: iload           49
        //   232: ifeq            242
        //   235: getstatic       com/whatsapp/App.aL:Lcom/whatsapp/m7;
        //   238: iconst_0       
        //   239: invokevirtual   com/whatsapp/m7.c:(Z)V
        //   242: iconst_1       
        //   243: istore          13
        //   245: iload           13
        //   247: ireturn        
        //   248: astore          41
        //   250: aload           41
        //   252: athrow         
        //   253: astore          42
        //   255: aload           42
        //   257: athrow         
        //   258: getstatic       com/whatsapp/contact/h.BACKGROUND_DELTA:Lcom/whatsapp/contact/h;
        //   261: astore          44
        //   263: goto            195
        //   266: astore          46
        //   268: aload           46
        //   270: athrow         
        //   271: astore          47
        //   273: aload           47
        //   275: athrow         
        //   276: astore          48
        //   278: aload           48
        //   280: athrow         
        //   281: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   284: aload_2        
        //   285: aload           5
        //   287: aconst_null    
        //   288: aconst_null    
        //   289: aconst_null    
        //   290: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   293: astore          12
        //   295: aload           12
        //   297: ifnonnull       323
        //   300: iconst_1       
        //   301: istore          13
        //   303: aload           12
        //   305: ifnull          245
        //   308: aload           12
        //   310: invokeinterface android/database/Cursor.close:()V
        //   315: iload           13
        //   317: ireturn        
        //   318: astore          40
        //   320: aload           40
        //   322: athrow         
        //   323: iconst_0       
        //   324: istore          13
        //   326: aload           12
        //   328: invokeinterface android/database/Cursor.moveToNext:()Z
        //   333: ifeq            669
        //   336: aload           12
        //   338: iconst_2       
        //   339: invokeinterface android/database/Cursor.getInt:(I)I
        //   344: iconst_1       
        //   345: if_icmpne       664
        //   348: aload           12
        //   350: iconst_0       
        //   351: invokeinterface android/database/Cursor.getLong:(I)J
        //   356: lstore          15
        //   358: aload           12
        //   360: iconst_1       
        //   361: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   366: astore          17
        //   368: aload           17
        //   370: ifnull          385
        //   373: aload           17
        //   375: invokevirtual   java/lang/String.length:()I
        //   378: istore          39
        //   380: iload           39
        //   382: ifne            393
        //   385: iconst_1       
        //   386: istore          18
        //   388: iload           4
        //   390: ifeq            402
        //   393: iconst_0       
        //   394: istore          18
        //   396: aload_3        
        //   397: aload           17
        //   399: putfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   402: iconst_1       
        //   403: anewarray       Ljava/lang/String;
        //   406: astore          19
        //   408: aload           19
        //   410: iconst_0       
        //   411: lload           15
        //   413: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   416: aastore        
        //   417: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   420: astore          24
        //   422: getstatic       android/provider/ContactsContract$CommonDataKinds$Phone.CONTENT_URI:Landroid/net/Uri;
        //   425: astore          25
        //   427: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //   430: bipush          19
        //   432: aaload         
        //   433: astore          26
        //   435: aload           24
        //   437: aload           25
        //   439: aload           7
        //   441: aload           26
        //   443: aload           19
        //   445: aconst_null    
        //   446: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   449: astore          27
        //   451: aload           27
        //   453: astore          21
        //   455: aload           21
        //   457: ifnull          648
        //   460: aload           21
        //   462: invokeinterface android/database/Cursor.moveToNext:()Z
        //   467: istore          30
        //   469: iload           30
        //   471: ifeq            648
        //   474: aload_3        
        //   475: new             Lcom/whatsapp/xg;
        //   478: dup            
        //   479: aload           21
        //   481: iconst_0       
        //   482: invokeinterface android/database/Cursor.getLong:(I)J
        //   487: aload           21
        //   489: iconst_1       
        //   490: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   495: invokestatic    android/telephony/PhoneNumberUtils.stripSeparators:(Ljava/lang/String;)Ljava/lang/String;
        //   498: invokespecial   com/whatsapp/xg.<init>:(JLjava/lang/String;)V
        //   501: putfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   504: aload_3        
        //   505: aload           21
        //   507: iconst_2       
        //   508: invokeinterface android/database/Cursor.getInt:(I)I
        //   513: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   516: putfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //   519: aload_3        
        //   520: aload           21
        //   522: iconst_3       
        //   523: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   528: putfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //   531: aload           21
        //   533: invokeinterface android/database/Cursor.getColumnCount:()I
        //   538: iconst_4       
        //   539: if_icmple       768
        //   542: aload           21
        //   544: iconst_4       
        //   545: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   550: astore          37
        //   552: aload           37
        //   554: astore          32
        //   556: aload_3        
        //   557: aload           32
        //   559: putfield        com/whatsapp/a_9.r:Ljava/lang/String;
        //   562: iload           18
        //   564: ifeq            578
        //   567: aload_3        
        //   568: aload_3        
        //   569: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   572: getfield        com/whatsapp/xg.a:Ljava/lang/String;
        //   575: putfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   578: aload_3        
        //   579: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   582: getfield        com/whatsapp/xg.a:Ljava/lang/String;
        //   585: ifnull          460
        //   588: aload_3        
        //   589: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   592: getfield        com/whatsapp/xg.a:Ljava/lang/String;
        //   595: invokevirtual   java/lang/String.length:()I
        //   598: istore          34
        //   600: iload           34
        //   602: ifle            460
        //   605: invokestatic    com/whatsapp/contact/f.b:()Z
        //   608: ifne            629
        //   611: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //   614: bipush          20
        //   616: aaload         
        //   617: aconst_null    
        //   618: iconst_1       
        //   619: anewarray       Ljava/lang/Object;
        //   622: dup            
        //   623: iconst_0       
        //   624: aload_3        
        //   625: aastore        
        //   626: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   629: aload_0        
        //   630: getfield        com/whatsapp/wc.a:Lcom/whatsapp/v6;
        //   633: aload_3        
        //   634: invokevirtual   com/whatsapp/v6.a:(Lcom/whatsapp/a_9;)Z
        //   637: pop            
        //   638: aload_0        
        //   639: aload_3        
        //   640: invokespecial   com/whatsapp/wc.b:(Lcom/whatsapp/a_9;)V
        //   643: iload           4
        //   645: ifeq            460
        //   648: aload           21
        //   650: ifnull          823
        //   653: aload           21
        //   655: invokeinterface android/database/Cursor.close:()V
        //   660: iload           18
        //   662: istore          13
        //   664: iload           4
        //   666: ifeq            326
        //   669: aload           12
        //   671: ifnull          245
        //   674: aload           12
        //   676: invokeinterface android/database/Cursor.close:()V
        //   681: iload           13
        //   683: ireturn        
        //   684: astore          14
        //   686: aload           14
        //   688: athrow         
        //   689: astore          38
        //   691: aload           38
        //   693: athrow         
        //   694: astore          9
        //   696: aload           12
        //   698: astore          10
        //   700: aload           10
        //   702: ifnull          712
        //   705: aload           10
        //   707: invokeinterface android/database/Cursor.close:()V
        //   712: aload           9
        //   714: athrow         
        //   715: astore          29
        //   717: aload           29
        //   719: athrow         
        //   720: astore          20
        //   722: aload           20
        //   724: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   727: aload           21
        //   729: ifnull          823
        //   732: aload           21
        //   734: invokeinterface android/database/Cursor.close:()V
        //   739: iload           18
        //   741: istore          13
        //   743: goto            664
        //   746: astore          31
        //   748: aload           31
        //   750: athrow         
        //   751: astore          22
        //   753: aload           21
        //   755: ifnull          765
        //   758: aload           21
        //   760: invokeinterface android/database/Cursor.close:()V
        //   765: aload           22
        //   767: athrow         
        //   768: aconst_null    
        //   769: astore          32
        //   771: goto            556
        //   774: astore          33
        //   776: aload           33
        //   778: athrow         
        //   779: astore          35
        //   781: aload           35
        //   783: athrow         
        //   784: astore          28
        //   786: aload           28
        //   788: athrow         
        //   789: astore          23
        //   791: aload           23
        //   793: athrow         
        //   794: astore          11
        //   796: aload           11
        //   798: athrow         
        //   799: astore          9
        //   801: aconst_null    
        //   802: astore          10
        //   804: goto            700
        //   807: astore          22
        //   809: aconst_null    
        //   810: astore          21
        //   812: goto            753
        //   815: astore          20
        //   817: aconst_null    
        //   818: astore          21
        //   820: goto            722
        //   823: iload           18
        //   825: istore          13
        //   827: goto            664
        //   830: aload           50
        //   832: astore          7
        //   834: goto            160
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  171    185    248    253    Ljava/lang/Exception;
        //  190    195    253    258    Ljava/lang/Exception;
        //  203    218    266    271    Ljava/lang/Exception;
        //  223    230    271    276    Ljava/lang/Exception;
        //  235    242    276    281    Ljava/lang/Exception;
        //  250    253    253    258    Ljava/lang/Exception;
        //  268    271    271    276    Ljava/lang/Exception;
        //  273    276    276    281    Ljava/lang/Exception;
        //  281    295    799    807    Any
        //  308    315    318    323    Ljava/lang/Exception;
        //  326    368    694    700    Any
        //  373    380    689    694    Ljava/lang/Exception;
        //  373    380    694    700    Any
        //  396    402    694    700    Any
        //  402    417    694    700    Any
        //  417    451    815    823    Ljava/lang/Exception;
        //  417    451    807    815    Any
        //  460    469    715    720    Ljava/lang/Exception;
        //  460    469    751    753    Any
        //  474    552    746    751    Ljava/lang/Exception;
        //  474    552    751    753    Any
        //  556    562    774    779    Ljava/lang/Exception;
        //  556    562    751    753    Any
        //  567    578    774    779    Ljava/lang/Exception;
        //  567    578    751    753    Any
        //  578    600    720    722    Ljava/lang/Exception;
        //  578    600    751    753    Any
        //  605    629    779    784    Ljava/lang/Exception;
        //  605    629    751    753    Any
        //  629    643    720    722    Ljava/lang/Exception;
        //  629    643    751    753    Any
        //  653    660    784    789    Ljava/lang/Exception;
        //  653    660    694    700    Any
        //  674    681    684    689    Ljava/lang/Exception;
        //  691    694    694    700    Any
        //  705    712    794    799    Ljava/lang/Exception;
        //  717    720    720    722    Ljava/lang/Exception;
        //  717    720    751    753    Any
        //  722    727    751    753    Any
        //  732    739    694    700    Any
        //  748    751    720    722    Ljava/lang/Exception;
        //  748    751    751    753    Any
        //  758    765    789    794    Ljava/lang/Exception;
        //  758    765    694    700    Any
        //  765    768    694    700    Any
        //  776    779    720    722    Ljava/lang/Exception;
        //  776    779    751    753    Any
        //  781    784    720    722    Ljava/lang/Exception;
        //  781    784    751    753    Any
        //  786    789    694    700    Any
        //  791    794    694    700    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 401, Size: 401
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
    
    private void b(final a_9 a_9) {
        bm.a(new zd(this, a_9));
    }
    
    static void c(final a_9 a_9) {
        h(a_9.u);
    }
    
    static void h(final String s) {
        wc.c.remove(s);
    }
    
    static boolean o(final a_9 a_9) {
        return wc.c.put(a_9.u, a_9) == null;
    }
    
    public Intent a(final a_9 a_9, final boolean b) {
        final String a = cq.a((CharSequence)a_9.a((Context)App.aq));
        final Intent intent = new Intent(App.aq.getApplicationContext(), (Class)Conversation.class);
        intent.setAction(wc.z[10]);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra(wc.z[5], a_9.u);
        intent.putExtra(wc.z[8], a);
        final Intent intent2 = new Intent();
        intent2.putExtra(wc.z[6], (Parcelable)intent);
        intent2.putExtra(wc.z[7], false);
        intent2.putExtra(wc.z[4], a);
        if (b) {
            final int dimensionPixelSize = App.aq.getResources().getDimensionPixelSize(2131361951);
            Bitmap bitmap = a_9.a(dimensionPixelSize, App.aq.getResources().getDimension(2131361814), false);
            if (bitmap == null) {
                bitmap = a_9.x();
                if (bitmap != null && (bitmap.getWidth() != dimensionPixelSize || bitmap.getHeight() != dimensionPixelSize)) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true);
                }
            }
            intent2.putExtra(wc.z[9], (Parcelable)bitmap);
        }
        return intent2;
    }
    
    public a_9 a(final Uri uri) {
        while (true) {
            final boolean k = a_9.k;
        Label_0064_Outer:
            while (true) {
                while (true) {
                    synchronized (wc.c) {
                        final Iterator<a_9> iterator = wc.c.values().iterator();
                        if (!iterator.hasNext()) {
                            // monitorexit(wc.c)
                            return this.a.a(uri);
                        }
                        final a_9 a_9 = iterator.next();
                        if (uri.equals((Object)a_9.h())) {
                            return a_9;
                        }
                    }
                    if (k) {
                        continue;
                    }
                    break;
                }
                continue Label_0064_Outer;
            }
        }
    }
    
    public a_9 a(final a_9 a_9, final String s, final String s2, final long n) {
        this.a.a(a_9, s, s2, n);
        return this.e(s);
    }
    
    public a_9 a(final xg xg) {
        while (true) {
            final boolean k = a_9.k;
        Label_0064_Outer:
            while (true) {
                while (true) {
                    synchronized (wc.c) {
                        final Iterator<a_9> iterator = wc.c.values().iterator();
                        if (!iterator.hasNext()) {
                            // monitorexit(wc.c)
                            return this.a.a(xg);
                        }
                        final a_9 a_9 = iterator.next();
                        if (xg.equals(a_9.e)) {
                            return a_9;
                        }
                    }
                    if (k) {
                        continue;
                    }
                    break;
                }
                continue Label_0064_Outer;
            }
        }
    }
    
    public Map a() {
        return this.a.d();
    }
    
    public void a(final ContentResolver contentResolver, final String s) {
        if (!a_9.h(s) && !adc.b(s)) {
            final a_9 d = this.d(s);
            if (d != null && d.e != null && d.e.b > 0L) {
                final Cursor query = contentResolver.query(ContactsContract$RawContacts.CONTENT_URI, new String[] { wc.z[16] }, wc.z[15], new String[] { Long.toString(d.e.b) }, (String)null);
                if (query != null) {
                    try {
                        if (query.moveToNext()) {
                            ContactsContract$Contacts.markAsContacted(contentResolver, query.getLong(0));
                        }
                    }
                    finally {
                        query.close();
                    }
                }
            }
        }
    }
    
    public void a(final Uri uri, final a_9 a_9) {
        final Context applicationContext = App.aq.getApplicationContext();
        if (this.a(applicationContext, uri, a_9)) {
            App.a(applicationContext, 2131230787, 0);
        }
    }
    
    public void a(final a_9 a_9) {
        this.a.g(a_9);
    }
    
    public void a(final String s) {
        this.a.a(s, 0L, null);
    }
    
    public void a(final String s, final long n, final String s2) {
        this.a.a(s, n, s2);
    }
    
    public void a(final String s, final String s2, final String t) {
        final a_9 e = this.e(s);
        e.t = t;
        if (s2 != null && !s2.startsWith(App.au())) {
            ++e.l;
        }
        this.a.b(e);
    }
    
    public void a(final String s, final String i, final String t, final long n) {
        a_9 b = this.a.b(s);
        if (b == null) {
            b = new a_9(s);
            this.a.j(b);
        }
        b.t = t;
        b.m = Long.toString(n);
        b.i = i;
        this.a.b(b);
    }
    
    public void a(final ArrayList list) {
        final boolean k = a_9.k;
        this.a.e(list);
        for (final a_9 a_9 : list) {
            a_9.z();
            a_9.w();
            c(a_9);
            if (k) {
                break;
            }
        }
    }
    
    public void a(final ArrayList list, final Set set) {
        this.a.a(list, set);
    }
    
    public void a(final Collection collection) {
        if (collection.size() > 0) {
            final HashMap hashMap = new HashMap();
            this.a.a(collection, hashMap);
            wc.c.putAll(hashMap);
        }
    }
    
    public boolean a(final Collection collection, final b7 b7) {
        return this.a.a(collection, b7);
    }
    
    public ArrayList b() {
        return this.a.h();
    }
    
    public ArrayList b(final String s) {
        return this.a.c(s);
    }
    
    public void b(final ArrayList list) {
        this.a.c(list);
    }
    
    public void b(final Collection collection) {
        this.a.c(collection);
        App.b(new ArrayList(collection));
    }
    
    public a_9 c(final String s) {
        final a_9 a_9 = wc.c.get(s);
        if (a_9 != null) {
            return a_9;
        }
        return this.a.b(s);
    }
    
    public void c() {
        this.a.c();
    }
    
    public void c(final ArrayList list) {
        this.a.b(list);
    }
    
    public void c(final Collection collection) {
        final boolean k = a_9.k;
        this.a.d(collection);
        final Iterator<Pair> iterator = collection.iterator();
        while (iterator.hasNext()) {
            h((String)iterator.next().first);
            if (k) {
                break;
            }
        }
    }
    
    public int d() {
        final int f = this.a.f();
        Log.i(wc.z[18] + f);
        return f;
    }
    
    public a_9 d(final String s) {
        a_9 e;
        if (App.au() != null && s.equals(App.au() + wc.z[11])) {
            e = this.e();
        }
        else {
            e = wc.c.get(s);
            if (e == null) {
                return this.a.b(s);
            }
        }
        return e;
    }
    
    public void d(final a_9 a_9) {
        this.a.b(a_9);
        App.av.sendEmptyMessage(0);
    }
    
    public void d(final ArrayList list) {
        this.a.d(list);
    }
    
    public void d(final Collection collection) {
        final boolean k = a_9.k;
        this.a.b(collection);
        final Iterator<Pair> iterator = collection.iterator();
        while (iterator.hasNext()) {
            h((String)iterator.next().first);
            if (k) {
                break;
            }
        }
    }
    
    public a_9 e(final String s) {
        final a_9 d = this.d(s);
        if (d != null) {
            return d;
        }
        final a_9 a_9 = new a_9(s);
        this.a.j(a_9);
        return a_9;
    }
    
    public a_d e() {
        if (App.au() == null) {
            return null;
        }
        if (wc.b == null || !wc.b.u.equals(App.au() + wc.z[37])) {
            wc.b = new a_d();
        }
        return wc.b;
    }
    
    public void e(final a_9 a_9) {
        App.aq.getApplicationContext().sendBroadcast(this.a(a_9, true).setAction(wc.z[3]));
    }
    
    public void e(final ArrayList list) {
        this.a.a(list);
    }
    
    public void e(final Collection collection) {
        final boolean k = a_9.k;
        a_9.a(collection, wc.z[14], wc.z[13]);
        final ArrayList<a_9> list = new ArrayList<a_9>();
        for (final a_9 a_9 : collection) {
            Label_0184: {
                if (a_9 != null) {
                    if ((a_9.u != null && a_9.u.equals(wc.z[12])) || (a_9.m() && !k)) {
                        continue;
                    }
                    if (a_9.b && !this.a.e(a_9)) {
                        if (z8.b(a_9.u) || App.ak.s(a_9.u)) {
                            if (a_9.e == null) {
                                break Label_0184;
                            }
                            this.a.h(a_9);
                            if (!k) {
                                break Label_0184;
                            }
                        }
                        list.add(a_9);
                        if (!k) {
                            break Label_0184;
                        }
                    }
                    list.add(a_9);
                }
            }
            if (k) {
                break;
            }
        }
        if (list.size() > 0) {
            this.a(list);
            App.e(list);
        }
    }
    
    public ArrayList f() {
        return this.a.i();
    }
    
    public void f(final a_9 a_9) {
        this.a.c(a_9);
    }
    
    public void f(final Collection collection) {
        this.a.e(collection);
        App.b(new ArrayList(collection));
    }
    
    public boolean f(final String s) {
        if (s != null) {
            final a_d e = this.e();
            if (e != null && s.equals(e.u)) {
                return true;
            }
        }
        return false;
    }
    
    public void g() {
        wc.c.clear();
    }
    
    public void g(final a_9 a_9) {
        this.a.k(a_9);
    }
    
    public void g(final String s) {
        final o a = j.a(s);
        if (a != null && !TextUtils.isEmpty((CharSequence)a.e())) {
            final a_9 a_9 = new a_9(a);
            if (!f.b()) {
                Log.w(wc.z[35]);
            }
            bm.a(new h4(this, a_9));
        }
    }
    
    public void g(final Collection collection) {
        final boolean k = a_9.k;
        this.a.a(collection);
        final Iterator<Pair> iterator = collection.iterator();
        while (iterator.hasNext()) {
            h((String)iterator.next().first);
            if (k) {
                break;
            }
        }
    }
    
    public int h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore_1       
        //     4: invokestatic    java/lang/System.currentTimeMillis:()J
        //     7: pop2           
        //     8: iconst_1       
        //     9: anewarray       Ljava/lang/String;
        //    12: astore          4
        //    14: aload           4
        //    16: iconst_0       
        //    17: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //    20: iconst_0       
        //    21: aaload         
        //    22: aastore        
        //    23: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //    26: iconst_2       
        //    27: aaload         
        //    28: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    31: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    34: getstatic       android/provider/ContactsContract$RawContacts.CONTENT_URI:Landroid/net/Uri;
        //    37: aload           4
        //    39: aconst_null    
        //    40: aconst_null    
        //    41: aconst_null    
        //    42: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    45: astore          9
        //    47: aload           9
        //    49: astore          6
        //    51: getstatic       com/whatsapp/wc.z:[Ljava/lang/String;
        //    54: iconst_1       
        //    55: aaload         
        //    56: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    59: aload           6
        //    61: ifnull          148
        //    64: iconst_0       
        //    65: istore          12
        //    67: aload           6
        //    69: invokeinterface android/database/Cursor.moveToNext:()Z
        //    74: istore          13
        //    76: iload           13
        //    78: ifeq            102
        //    81: aload           6
        //    83: iconst_0       
        //    84: invokeinterface android/database/Cursor.getInt:(I)I
        //    89: istore          15
        //    91: iload           12
        //    93: iload           15
        //    95: iadd           
        //    96: istore          12
        //    98: iload_1        
        //    99: ifeq            67
        //   102: aload           6
        //   104: ifnull          114
        //   107: aload           6
        //   109: invokeinterface android/database/Cursor.close:()V
        //   114: iload           12
        //   116: ireturn        
        //   117: astore          10
        //   119: aload           10
        //   121: athrow         
        //   122: astore          5
        //   124: aload           5
        //   126: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   129: aload           6
        //   131: ifnull          141
        //   134: aload           6
        //   136: invokeinterface android/database/Cursor.close:()V
        //   141: iconst_0       
        //   142: ireturn        
        //   143: astore          14
        //   145: aload           14
        //   147: athrow         
        //   148: aload           6
        //   150: ifnull          141
        //   153: aload           6
        //   155: invokeinterface android/database/Cursor.close:()V
        //   160: goto            141
        //   163: astore          11
        //   165: aload           11
        //   167: athrow         
        //   168: astore          7
        //   170: aconst_null    
        //   171: astore          6
        //   173: aload           6
        //   175: ifnull          185
        //   178: aload           6
        //   180: invokeinterface android/database/Cursor.close:()V
        //   185: aload           7
        //   187: athrow         
        //   188: astore          8
        //   190: aload           8
        //   192: athrow         
        //   193: astore          7
        //   195: goto            173
        //   198: astore          5
        //   200: aconst_null    
        //   201: astore          6
        //   203: goto            124
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  23     47     198    206    Ljava/lang/Exception;
        //  23     47     168    173    Any
        //  51     59     117    122    Ljava/lang/Exception;
        //  51     59     193    198    Any
        //  67     76     117    122    Ljava/lang/Exception;
        //  67     76     193    198    Any
        //  81     91     122    124    Ljava/lang/Exception;
        //  81     91     193    198    Any
        //  107    114    143    148    Ljava/lang/Exception;
        //  119    122    122    124    Ljava/lang/Exception;
        //  119    122    193    198    Any
        //  124    129    193    198    Any
        //  153    160    163    168    Ljava/lang/Exception;
        //  178    185    188    193    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 97, Size: 97
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
    
    public void h(final a_9 a_9) {
        this.j(a_9);
    }
    
    public ArrayList i() {
        return this.a.b();
    }
    
    public ArrayList i(final String s) {
        return this.a.d(s);
    }
    
    public void i(final a_9 a_9) {
        this.a.l(a_9);
    }
    
    public void j(final a_9 a_9) {
        final o a = j.a(a_9.a((Context)App.aq));
        if (a != null && !TextUtils.isEmpty((CharSequence)a.e())) {
            a_9.e = new xg(a.g(), a.e());
            a_9.w = a.f();
            a_9.m = a.d();
            a_9.r = a.a();
            if (!TextUtils.isEmpty((CharSequence)a.c())) {
                a_9.t = a.c();
            }
            if (!f.b()) {
                Log.w(wc.z[36]);
            }
            this.a.a(a_9);
            this.b(a_9);
        }
    }
    
    public boolean j() {
        return this.a.e();
    }
    
    public void k() {
        this.a.g();
    }
    
    public void k(final a_9 a_9) {
        this.a.f(a_9);
    }
    
    public ArrayList l() {
        return this.a.a();
    }
    
    public void l(final a_9 a_9) {
        this.b(Collections.singletonList(a_9));
    }
    
    public void m(final a_9 a_9) {
        this.a.j(a_9);
    }
    
    public ArrayList n(final a_9 a_9) {
        return this.a.i(a_9);
    }
    
    public void p(final a_9 a_9) {
        App.aq.getApplicationContext().sendBroadcast(this.a(a_9, false).setAction(wc.z[17]));
    }
}
