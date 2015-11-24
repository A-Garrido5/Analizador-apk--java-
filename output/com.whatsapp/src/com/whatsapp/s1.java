// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import de.greenrobot.event.m;
import android.os.Build$VERSION;
import com.whatsapp.util.br;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.bi;
import com.whatsapp.c2dm.C2DMRegistrar;
import android.content.Context;

final class s1 extends sj
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[15];
        String s = "M?K59I<H{3I`I\u007f7I&M\u007f0\u0003+Nj8E,Zn1\f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'T';
                        break;
                    }
                    case 0: {
                        c2 = ',';
                        break;
                    }
                    case 1: {
                        c2 = 'O';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = '\u001a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "^*W{-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\\&Xn!^*";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "M?K59I<H{3I,S{:K*_:!B$Uu#BoOc$Io";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "M?K59I<H{3I`I\u007f7I&M\u007f0\u0003!^m!^#\u001b";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "M?K59I<H{3I`I\u007f7I&M\u007f0\u0003!^m!^#\u001b";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "O V43C \\v1\u0002?Iu7I<H43M?Ki";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\\&Xn!^*";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "^*W{-";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "[*Y";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "A<\\{0H*_52^ VE:M\"^:=_o^w$X6\u001b:>E+\u0001";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "M!_h;E+\u0015h1_ Nh7Iu\u001457C\"\u0015m<M;H{$\\`\t+g\u001d~\r/e\u0014y";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "E!Ms'";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "l<\u0015m<M;H{$\\aU\u007f ";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\f\"^i'M(^ ";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    break Label_0407;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private void a(final long n) {
        if (!App.aj && n > 900000L && App.n((Context)App.aq)) {
            C2DMRegistrar.a((Context)App.aq);
            App.B(s1.z[6]);
            App.aj = true;
        }
    }
    
    @Override
    public void a() {
        if (App.ak.n()) {
            App.a(new v_(this));
        }
    }
    
    @Override
    public void a(final bi p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: aload_1        
        //     5: ifnull          500
        //     8: aload_1        
        //     9: getfield        com/whatsapp/protocol/bi.I:B
        //    12: istore          6
        //    14: iload           6
        //    16: bipush          8
        //    18: if_icmpeq       500
        //    21: aload_1        
        //    22: getfield        com/whatsapp/protocol/bi.I:B
        //    25: istore          7
        //    27: iload           7
        //    29: ifne            166
        //    32: new             Landroid/text/SpannableString;
        //    35: dup            
        //    36: aload_1        
        //    37: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //    40: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //    43: astore          91
        //    45: aload           91
        //    47: iconst_1       
        //    48: invokestatic    android/text/util/Linkify.addLinks:(Landroid/text/Spannable;I)Z
        //    51: pop            
        //    52: aload           91
        //    54: iconst_0       
        //    55: aload           91
        //    57: invokevirtual   android/text/SpannableString.length:()I
        //    60: ldc             Landroid/text/style/URLSpan;.class
        //    62: invokevirtual   android/text/SpannableString.getSpans:(IILjava/lang/Class;)[Ljava/lang/Object;
        //    65: checkcast       [Landroid/text/style/URLSpan;
        //    68: astore          99
        //    70: aload           99
        //    72: ifnull          533
        //    75: aload           99
        //    77: arraylength    
        //    78: istore          105
        //    80: iload           105
        //    82: ifle            533
        //    85: iconst_1       
        //    86: istore          94
        //    88: iload           94
        //    90: ifeq            1457
        //    93: aload           99
        //    95: arraylength    
        //    96: istore          100
        //    98: aload_1        
        //    99: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   102: invokevirtual   java/lang/String.length:()I
        //   105: ifeq            136
        //   108: new             Lcom/whatsapp/fieldstats/bg;
        //   111: dup            
        //   112: invokespecial   com/whatsapp/fieldstats/bg.<init>:()V
        //   115: astore          102
        //   117: aload           102
        //   119: iload           100
        //   121: i2d            
        //   122: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   125: putfield        com/whatsapp/fieldstats/bg.a:Ljava/lang/Double;
        //   128: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   131: aload           102
        //   133: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //   136: iload           94
        //   138: ifeq            166
        //   141: aload_1        
        //   142: invokestatic    com/whatsapp/ConversationRowText.b:(Lcom/whatsapp/protocol/bi;)Z
        //   145: istore          97
        //   147: iload           97
        //   149: ifeq            166
        //   152: aload_1        
        //   153: invokestatic    com/whatsapp/App.e:(Lcom/whatsapp/protocol/bi;)Z
        //   156: ifeq            166
        //   159: invokestatic    com/whatsapp/arz.a:()Lcom/whatsapp/arz;
        //   162: aload_1        
        //   163: invokevirtual   com/whatsapp/arz.b:(Lcom/whatsapp/protocol/bi;)V
        //   166: aload_1        
        //   167: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   170: getfield        com/whatsapp/protocol/c6.b:Z
        //   173: ifne            836
        //   176: invokestatic    java/lang/System.currentTimeMillis:()J
        //   179: aload_1        
        //   180: getfield        com/whatsapp/protocol/bi.u:J
        //   183: lsub           
        //   184: lstore          45
        //   186: aload_1        
        //   187: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   190: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   193: astore          47
        //   195: aload           47
        //   197: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   200: astore          48
        //   202: getstatic       com/whatsapp/App.s:Lcom/whatsapp/a04;
        //   205: aload           47
        //   207: aload_1        
        //   208: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   211: invokevirtual   com/whatsapp/a04.a:(Ljava/lang/String;Ljava/lang/String;)I
        //   214: iflt            234
        //   217: getstatic       com/whatsapp/App.s:Lcom/whatsapp/a04;
        //   220: aload           47
        //   222: aload_1        
        //   223: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   226: invokevirtual   com/whatsapp/a04.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   229: aload           47
        //   231: invokestatic    com/whatsapp/App.u:(Ljava/lang/String;)V
        //   234: aload           48
        //   236: invokevirtual   com/whatsapp/a_9.m:()Z
        //   239: istore          52
        //   241: iload           52
        //   243: ifeq            570
        //   246: aload_1        
        //   247: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   250: ifnull          564
        //   253: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   256: aload_1        
        //   257: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   260: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   263: astore          90
        //   265: aload           90
        //   267: astore          53
        //   269: aload_1        
        //   270: getfield        com/whatsapp/protocol/bi.s:Ljava/lang/String;
        //   273: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   276: ifeq            325
        //   279: new             Ljava/lang/StringBuilder;
        //   282: dup            
        //   283: invokespecial   java/lang/StringBuilder.<init>:()V
        //   286: getstatic       com/whatsapp/s1.z:[Ljava/lang/String;
        //   289: bipush          10
        //   291: aaload         
        //   292: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   295: aload           47
        //   297: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   300: getstatic       com/whatsapp/s1.z:[Ljava/lang/String;
        //   303: bipush          14
        //   305: aaload         
        //   306: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   309: aload_1        
        //   310: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   313: invokevirtual   com/whatsapp/protocol/c6.toString:()Ljava/lang/String;
        //   316: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   319: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   322: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   325: aload           53
        //   327: ifnull          381
        //   330: aload_1        
        //   331: getfield        com/whatsapp/protocol/bi.s:Ljava/lang/String;
        //   334: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   337: istore          89
        //   339: iload           89
        //   341: ifne            381
        //   344: aload_1        
        //   345: getfield        com/whatsapp/protocol/bi.s:Ljava/lang/String;
        //   348: aload           53
        //   350: getfield        com/whatsapp/a_9.o:Ljava/lang/String;
        //   353: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   356: ifne            381
        //   359: aload           53
        //   361: aload_1        
        //   362: getfield        com/whatsapp/protocol/bi.s:Ljava/lang/String;
        //   365: putfield        com/whatsapp/a_9.o:Ljava/lang/String;
        //   368: new             Lcom/whatsapp/mn;
        //   371: dup            
        //   372: aload_0        
        //   373: aload           53
        //   375: invokespecial   com/whatsapp/mn.<init>:(Lcom/whatsapp/s1;Lcom/whatsapp/a_9;)V
        //   378: invokestatic    com/whatsapp/App.b:(Ljava/lang/Runnable;)V
        //   381: aload_1        
        //   382: aload           48
        //   384: aload           53
        //   386: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/protocol/bi;Lcom/whatsapp/a_9;Lcom/whatsapp/a_9;)Z
        //   389: istore          57
        //   391: iload           57
        //   393: ifeq            410
        //   396: aload_1        
        //   397: invokestatic    com/whatsapp/App.e:(Lcom/whatsapp/protocol/bi;)Z
        //   400: ifeq            410
        //   403: invokestatic    com/whatsapp/arz.a:()Lcom/whatsapp/arz;
        //   406: aload_1        
        //   407: invokevirtual   com/whatsapp/arz.b:(Lcom/whatsapp/protocol/bi;)V
        //   410: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //   413: ldc_w           Lcom/whatsapp/a8p;.class
        //   416: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //   419: checkcast       Lcom/whatsapp/a8p;
        //   422: astore          58
        //   424: invokestatic    com/whatsapp/Conversation.p:()Lcom/whatsapp/v1;
        //   427: astore          59
        //   429: aload           59
        //   431: invokevirtual   com/whatsapp/v1.a:()Z
        //   434: istore          65
        //   436: iload           65
        //   438: ifeq            705
        //   441: aload           58
        //   443: invokevirtual   com/whatsapp/a8p.a:()Z
        //   446: istore          77
        //   448: iload           77
        //   450: ifne            705
        //   453: aload           59
        //   455: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //   458: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   461: aload           47
        //   463: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   466: istore          78
        //   468: iload           78
        //   470: ifeq            705
        //   473: aload_1        
        //   474: getfield        com/whatsapp/protocol/bi.b:Ljava/lang/Integer;
        //   477: astore          79
        //   479: aload           79
        //   481: ifnull          627
        //   484: aload_0        
        //   485: lload           45
        //   487: invokespecial   com/whatsapp/s1.a:(J)V
        //   490: getstatic       com/whatsapp/App.e:Z
        //   493: istore          86
        //   495: iload           86
        //   497: ifeq            627
        //   500: return         
        //   501: astore          4
        //   503: aload           4
        //   505: athrow         
        //   506: astore          5
        //   508: aload           5
        //   510: athrow         
        //   511: astore          103
        //   513: aload           103
        //   515: athrow         
        //   516: astore          104
        //   518: aload           104
        //   520: athrow         
        //   521: astore          92
        //   523: iconst_0       
        //   524: istore          93
        //   526: iload           93
        //   528: istore          94
        //   530: goto            136
        //   533: iconst_0       
        //   534: istore          94
        //   536: goto            88
        //   539: astore          95
        //   541: aload           95
        //   543: athrow         
        //   544: astore          96
        //   546: aload           96
        //   548: athrow         
        //   549: astore          49
        //   551: aload           49
        //   553: athrow         
        //   554: astore          50
        //   556: aload           50
        //   558: athrow         
        //   559: astore          51
        //   561: aload           51
        //   563: athrow         
        //   564: aconst_null    
        //   565: astore          53
        //   567: goto            269
        //   570: aload           48
        //   572: astore          53
        //   574: goto            269
        //   577: astore          54
        //   579: aload           54
        //   581: athrow         
        //   582: astore          87
        //   584: aload           87
        //   586: athrow         
        //   587: astore          88
        //   589: aload           88
        //   591: athrow         
        //   592: astore          55
        //   594: aload           55
        //   596: athrow         
        //   597: astore          56
        //   599: aload           56
        //   601: athrow         
        //   602: astore          60
        //   604: aload           60
        //   606: athrow         
        //   607: astore          61
        //   609: aload           61
        //   611: athrow         
        //   612: astore          62
        //   614: aload           62
        //   616: athrow         
        //   617: astore          63
        //   619: aload           63
        //   621: athrow         
        //   622: astore          64
        //   624: aload           64
        //   626: athrow         
        //   627: iconst_1       
        //   628: putstatic       com/whatsapp/App.e:Z
        //   631: aload           48
        //   633: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   636: aload           59
        //   638: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //   641: getfield        com/whatsapp/Conversation.s:Lcom/whatsapp/a_9;
        //   644: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   647: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   650: istore          82
        //   652: iload           82
        //   654: ifeq            681
        //   657: invokestatic    com/whatsapp/notification/a2.b:()Lcom/whatsapp/notification/a2;
        //   660: invokevirtual   com/whatsapp/notification/a2.c:()V
        //   663: getstatic       com/whatsapp/Conversation.M:Z
        //   666: ifeq            681
        //   669: getstatic       com/whatsapp/s1.z:[Ljava/lang/String;
        //   672: bipush          11
        //   674: aaload         
        //   675: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   678: invokestatic    com/whatsapp/App.a:(Landroid/net/Uri;)V
        //   681: invokestatic    com/whatsapp/l7.j:()Z
        //   684: istore          85
        //   686: iload           85
        //   688: ifeq            824
        //   691: aload_1        
        //   692: getstatic       com/whatsapp/s1.z:[Ljava/lang/String;
        //   695: bipush          12
        //   697: aaload         
        //   698: putfield        com/whatsapp/protocol/bi.C:Ljava/lang/String;
        //   701: iload_3        
        //   702: ifeq            824
        //   705: aload           48
        //   707: iconst_1       
        //   708: aload           48
        //   710: getfield        com/whatsapp/a_9.l:I
        //   713: iadd           
        //   714: putfield        com/whatsapp/a_9.l:I
        //   717: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   720: bipush          16
        //   722: if_icmplt       734
        //   725: invokestatic    com/whatsapp/notification/a2.b:()Lcom/whatsapp/notification/a2;
        //   728: aload           47
        //   730: aload_1        
        //   731: invokevirtual   com/whatsapp/notification/a2.b:(Ljava/lang/String;Lcom/whatsapp/protocol/bi;)V
        //   734: new             Lcom/whatsapp/_m;
        //   737: dup            
        //   738: aload_0        
        //   739: aload           48
        //   741: invokespecial   com/whatsapp/_m.<init>:(Lcom/whatsapp/s1;Lcom/whatsapp/a_9;)V
        //   744: invokestatic    com/whatsapp/App.b:(Ljava/lang/Runnable;)V
        //   747: aload_1        
        //   748: getfield        com/whatsapp/protocol/bi.b:Ljava/lang/Integer;
        //   751: astore          70
        //   753: aload           70
        //   755: ifnull          799
        //   758: aload_1        
        //   759: getfield        com/whatsapp/protocol/bi.I:B
        //   762: istore          75
        //   764: iload           75
        //   766: iconst_2       
        //   767: if_icmpne       778
        //   770: aload_1        
        //   771: getfield        com/whatsapp/protocol/bi.E:I
        //   774: iconst_1       
        //   775: if_icmpeq       789
        //   778: iconst_1       
        //   779: getstatic       com/whatsapp/App.e:Z
        //   782: invokestatic    com/whatsapp/App.a:(ZZ)V
        //   785: iconst_1       
        //   786: putstatic       com/whatsapp/App.e:Z
        //   789: aload_0        
        //   790: lload           45
        //   792: invokespecial   com/whatsapp/s1.a:(J)V
        //   795: iload_3        
        //   796: ifeq            824
        //   799: aload_1        
        //   800: getfield        com/whatsapp/protocol/bi.I:B
        //   803: istore          73
        //   805: iload           73
        //   807: iconst_2       
        //   808: if_icmpne       819
        //   811: aload_1        
        //   812: getfield        com/whatsapp/protocol/bi.E:I
        //   815: iconst_1       
        //   816: if_icmpeq       824
        //   819: iconst_1       
        //   820: iconst_0       
        //   821: invokestatic    com/whatsapp/App.a:(ZZ)V
        //   824: aload_1        
        //   825: invokestatic    com/whatsapp/App.h:(Lcom/whatsapp/protocol/bi;)V
        //   828: aload_1        
        //   829: invokestatic    com/whatsapp/App.f:(Lcom/whatsapp/protocol/bi;)V
        //   832: iload_3        
        //   833: ifeq            500
        //   836: aload_1        
        //   837: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   840: getfield        com/whatsapp/protocol/c6.b:Z
        //   843: istore          15
        //   845: iload           15
        //   847: ifeq            970
        //   850: getstatic       com/whatsapp/s1.z:[Ljava/lang/String;
        //   853: bipush          8
        //   855: aaload         
        //   856: aload_1        
        //   857: getfield        com/whatsapp/protocol/bi.C:Ljava/lang/String;
        //   860: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   863: istore          40
        //   865: iload           40
        //   867: ifeq            970
        //   870: aload_1        
        //   871: getfield        com/whatsapp/protocol/bi.I:B
        //   874: istore          41
        //   876: iload           41
        //   878: iconst_5       
        //   879: if_icmpne       922
        //   882: aload_1        
        //   883: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   886: astore          43
        //   888: aload           43
        //   890: ifnull          922
        //   893: aload_1        
        //   894: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   897: instanceof      Lcom/whatsapp/MediaData;
        //   900: istore          44
        //   902: iload           44
        //   904: ifeq            922
        //   907: aload_1        
        //   908: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   911: checkcast       Lcom/whatsapp/MediaData;
        //   914: iconst_1       
        //   915: putfield        com/whatsapp/MediaData.transferred:Z
        //   918: iload_3        
        //   919: ifeq            936
        //   922: aload_1        
        //   923: getfield        com/whatsapp/protocol/bi.I:B
        //   926: ifeq            936
        //   929: invokestatic    com/whatsapp/arz.a:()Lcom/whatsapp/arz;
        //   932: aload_1        
        //   933: invokevirtual   com/whatsapp/arz.b:(Lcom/whatsapp/protocol/bi;)V
        //   936: aload_1        
        //   937: iconst_0       
        //   938: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/bi;Z)V
        //   941: aload_1        
        //   942: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   945: getfield        com/whatsapp/protocol/c6.c:Ljava/lang/String;
        //   948: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   951: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //   954: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //   957: getstatic       com/whatsapp/s1.z:[Ljava/lang/String;
        //   960: bipush          9
        //   962: aaload         
        //   963: invokestatic    com/whatsapp/App.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   966: iload_3        
        //   967: ifeq            500
        //   970: aload_1        
        //   971: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   974: getfield        com/whatsapp/protocol/c6.b:Z
        //   977: ifeq            1030
        //   980: new             Ljava/lang/StringBuilder;
        //   983: dup            
        //   984: invokespecial   java/lang/StringBuilder.<init>:()V
        //   987: invokestatic    com/whatsapp/App.au:()Ljava/lang/String;
        //   990: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   993: getstatic       com/whatsapp/s1.z:[Ljava/lang/String;
        //   996: bipush          13
        //   998: aaload         
        //   999: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1002: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1005: aload_1        
        //  1006: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1009: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //  1012: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1015: istore          38
        //  1017: iload           38
        //  1019: ifeq            1030
        //  1022: aload_1        
        //  1023: invokestatic    com/whatsapp/App.h:(Lcom/whatsapp/protocol/bi;)V
        //  1026: iload_3        
        //  1027: ifeq            500
        //  1030: aload_1        
        //  1031: invokestatic    com/whatsapp/App.h:(Lcom/whatsapp/protocol/bi;)V
        //  1034: iload_2        
        //  1035: iconst_m1      
        //  1036: if_icmpne       1053
        //  1039: aload_1        
        //  1040: getfield        com/whatsapp/protocol/bi.c:I
        //  1043: bipush          6
        //  1045: if_icmpeq       1053
        //  1048: aload_1        
        //  1049: iconst_0       
        //  1050: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/bi;Z)V
        //  1053: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //  1056: ldc_w           Lcom/whatsapp/a8p;.class
        //  1059: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //  1062: checkcast       Lcom/whatsapp/a8p;
        //  1065: astore          19
        //  1067: invokestatic    com/whatsapp/Conversation.p:()Lcom/whatsapp/v1;
        //  1070: astore          20
        //  1072: aload_1        
        //  1073: invokestatic    com/whatsapp/adc.a:(Lcom/whatsapp/protocol/bi;)Z
        //  1076: istore          25
        //  1078: iload           25
        //  1080: ifeq            1205
        //  1083: aload           20
        //  1085: invokevirtual   com/whatsapp/v1.a:()Z
        //  1088: istore          32
        //  1090: iload           32
        //  1092: ifeq            1128
        //  1095: aload           19
        //  1097: invokevirtual   com/whatsapp/a8p.a:()Z
        //  1100: istore          37
        //  1102: iload           37
        //  1104: ifne            1128
        //  1107: aload           20
        //  1109: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //  1112: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //  1115: aload_1        
        //  1116: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1119: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //  1122: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1125: ifne            1205
        //  1128: aload_1        
        //  1129: getfield        com/whatsapp/protocol/bi.L:J
        //  1132: lstore          33
        //  1134: lload           33
        //  1136: lconst_1       
        //  1137: lcmp           
        //  1138: ifeq            1178
        //  1141: aload_1        
        //  1142: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1145: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //  1148: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //  1151: astore          36
        //  1153: aload           36
        //  1155: iconst_1       
        //  1156: aload           36
        //  1158: getfield        com/whatsapp/a_9.l:I
        //  1161: iadd           
        //  1162: putfield        com/whatsapp/a_9.l:I
        //  1165: new             Lcom/whatsapp/g6;
        //  1168: dup            
        //  1169: aload_0        
        //  1170: aload           36
        //  1172: invokespecial   com/whatsapp/g6.<init>:(Lcom/whatsapp/s1;Lcom/whatsapp/a_9;)V
        //  1175: invokestatic    com/whatsapp/App.b:(Ljava/lang/Runnable;)V
        //  1178: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1181: bipush          16
        //  1183: if_icmplt       1200
        //  1186: invokestatic    com/whatsapp/notification/a2.b:()Lcom/whatsapp/notification/a2;
        //  1189: aload_1        
        //  1190: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1193: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //  1196: aload_1        
        //  1197: invokevirtual   com/whatsapp/notification/a2.b:(Ljava/lang/String;Lcom/whatsapp/protocol/bi;)V
        //  1200: iconst_1       
        //  1201: iconst_0       
        //  1202: invokestatic    com/whatsapp/App.a:(ZZ)V
        //  1205: aload_1        
        //  1206: getfield        com/whatsapp/protocol/bi.c:I
        //  1209: istore          28
        //  1211: iload           28
        //  1213: bipush          6
        //  1215: if_icmpne       1235
        //  1218: aload_1        
        //  1219: instanceof      Lcom/whatsapp/wb;
        //  1222: ifeq            1235
        //  1225: aload_1        
        //  1226: checkcast       Lcom/whatsapp/wb;
        //  1229: getfield        com/whatsapp/wb.S:Lcom/whatsapp/protocol/cr;
        //  1232: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/cr;)V
        //  1235: aload_1        
        //  1236: getfield        com/whatsapp/protocol/bi.c:I
        //  1239: istore          31
        //  1241: iload           31
        //  1243: bipush          6
        //  1245: if_icmpne       500
        //  1248: aload_1        
        //  1249: getfield        com/whatsapp/protocol/bi.L:J
        //  1252: ldc2_w          6
        //  1255: lcmp           
        //  1256: ifne            500
        //  1259: aload_1        
        //  1260: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1263: getfield        com/whatsapp/protocol/c6.c:Ljava/lang/String;
        //  1266: aload_1        
        //  1267: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1270: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //  1273: getstatic       com/whatsapp/s1.z:[Ljava/lang/String;
        //  1276: bipush          7
        //  1278: aaload         
        //  1279: invokestatic    com/whatsapp/App.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1282: return         
        //  1283: astore          30
        //  1285: aload           30
        //  1287: athrow         
        //  1288: astore          80
        //  1290: aload           80
        //  1292: athrow         
        //  1293: astore          81
        //  1295: aload           81
        //  1297: athrow         
        //  1298: astore          83
        //  1300: aload           83
        //  1302: athrow         
        //  1303: astore          84
        //  1305: aload           84
        //  1307: athrow         
        //  1308: astore          66
        //  1310: aload           66
        //  1312: athrow         
        //  1313: astore          67
        //  1315: aload           67
        //  1317: athrow         
        //  1318: astore          68
        //  1320: aload           68
        //  1322: athrow         
        //  1323: astore          69
        //  1325: aload           69
        //  1327: athrow         
        //  1328: astore          76
        //  1330: aload           76
        //  1332: athrow         
        //  1333: astore          71
        //  1335: aload           71
        //  1337: athrow         
        //  1338: astore          72
        //  1340: aload           72
        //  1342: athrow         
        //  1343: astore          74
        //  1345: aload           74
        //  1347: athrow         
        //  1348: astore          8
        //  1350: aload           8
        //  1352: athrow         
        //  1353: astore          9
        //  1355: aload           9
        //  1357: athrow         
        //  1358: astore          10
        //  1360: aload           10
        //  1362: athrow         
        //  1363: astore          11
        //  1365: aload           11
        //  1367: athrow         
        //  1368: astore          12
        //  1370: aload           12
        //  1372: athrow         
        //  1373: astore          13
        //  1375: aload           13
        //  1377: athrow         
        //  1378: astore          14
        //  1380: aload           14
        //  1382: athrow         
        //  1383: astore          42
        //  1385: aload           42
        //  1387: athrow         
        //  1388: astore          16
        //  1390: aload           16
        //  1392: athrow         
        //  1393: astore          39
        //  1395: aload           39
        //  1397: athrow         
        //  1398: astore          17
        //  1400: aload           17
        //  1402: athrow         
        //  1403: astore          18
        //  1405: aload           18
        //  1407: athrow         
        //  1408: astore          21
        //  1410: aload           21
        //  1412: athrow         
        //  1413: astore          22
        //  1415: aload           22
        //  1417: athrow         
        //  1418: astore          23
        //  1420: aload           23
        //  1422: athrow         
        //  1423: astore          24
        //  1425: aload           24
        //  1427: athrow         
        //  1428: astore          35
        //  1430: aload           35
        //  1432: athrow         
        //  1433: astore          26
        //  1435: aload           26
        //  1437: athrow         
        //  1438: astore          27
        //  1440: aload           27
        //  1442: athrow         
        //  1443: astore          29
        //  1445: aload           29
        //  1447: athrow         
        //  1448: astore          101
        //  1450: iload           94
        //  1452: istore          93
        //  1454: goto            526
        //  1457: iconst_0       
        //  1458: istore          100
        //  1460: goto            98
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      14     501    506    Ljava/lang/Exception;
        //  21     27     506    511    Ljava/lang/Exception;
        //  32     70     521    526    Ljava/lang/Exception;
        //  75     80     511    521    Ljava/lang/Exception;
        //  93     98     1448   1457   Ljava/lang/Exception;
        //  98     136    1448   1457   Ljava/lang/Exception;
        //  141    147    539    544    Ljava/lang/Exception;
        //  152    166    544    549    Ljava/lang/Exception;
        //  202    234    549    554    Ljava/lang/Exception;
        //  234    241    554    559    Ljava/lang/Exception;
        //  246    265    559    564    Ljava/lang/Exception;
        //  269    325    577    582    Ljava/lang/Exception;
        //  330    339    582    587    Ljava/lang/Exception;
        //  344    381    587    592    Ljava/lang/Exception;
        //  381    391    592    597    Ljava/lang/Exception;
        //  396    410    597    602    Ljava/lang/Exception;
        //  429    436    602    607    Ljava/lang/Exception;
        //  441    448    607    612    Ljava/lang/Exception;
        //  453    468    612    617    Ljava/lang/Exception;
        //  473    479    617    622    Ljava/lang/Exception;
        //  484    495    622    627    Ljava/lang/Exception;
        //  503    506    506    511    Ljava/lang/Exception;
        //  513    516    516    521    Ljava/lang/Exception;
        //  518    521    521    526    Ljava/lang/Exception;
        //  541    544    544    549    Ljava/lang/Exception;
        //  556    559    559    564    Ljava/lang/Exception;
        //  584    587    587    592    Ljava/lang/Exception;
        //  594    597    597    602    Ljava/lang/Exception;
        //  604    607    607    612    Ljava/lang/Exception;
        //  609    612    612    617    Ljava/lang/Exception;
        //  614    617    617    622    Ljava/lang/Exception;
        //  619    622    622    627    Ljava/lang/Exception;
        //  627    652    1288   1293   Ljava/lang/Exception;
        //  657    681    1293   1298   Ljava/lang/Exception;
        //  681    686    1298   1303   Ljava/lang/Exception;
        //  691    701    1303   1308   Ljava/lang/Exception;
        //  705    734    1308   1313   Ljava/lang/Exception;
        //  734    753    1313   1318   Ljava/lang/Exception;
        //  758    764    1318   1323   Ljava/lang/Exception;
        //  770    778    1323   1328   Ljava/lang/Exception;
        //  778    789    1323   1328   Ljava/lang/Exception;
        //  789    795    1328   1333   Ljava/lang/Exception;
        //  799    805    1333   1338   Ljava/lang/Exception;
        //  811    819    1338   1343   Ljava/lang/Exception;
        //  819    824    1338   1343   Ljava/lang/Exception;
        //  824    832    1343   1348   Ljava/lang/Exception;
        //  836    845    1348   1353   Ljava/lang/Exception;
        //  850    865    1353   1358   Ljava/lang/Exception;
        //  870    876    1358   1363   Ljava/lang/Exception;
        //  882    888    1363   1368   Ljava/lang/Exception;
        //  893    902    1368   1373   Ljava/lang/Exception;
        //  907    918    1373   1378   Ljava/lang/Exception;
        //  922    936    1378   1383   Ljava/lang/Exception;
        //  936    966    1383   1388   Ljava/lang/Exception;
        //  970    1017   1388   1393   Ljava/lang/Exception;
        //  1022   1026   1393   1398   Ljava/lang/Exception;
        //  1030   1034   1398   1403   Ljava/lang/Exception;
        //  1039   1053   1403   1408   Ljava/lang/Exception;
        //  1072   1078   1408   1413   Ljava/lang/Exception;
        //  1083   1090   1413   1418   Ljava/lang/Exception;
        //  1095   1102   1418   1423   Ljava/lang/Exception;
        //  1107   1128   1423   1428   Ljava/lang/Exception;
        //  1128   1134   1423   1428   Ljava/lang/Exception;
        //  1178   1200   1428   1433   Ljava/lang/Exception;
        //  1205   1211   1433   1438   Ljava/lang/Exception;
        //  1218   1235   1438   1443   Ljava/lang/Exception;
        //  1235   1241   1443   1448   Ljava/lang/Exception;
        //  1248   1282   1283   1288   Ljava/lang/Exception;
        //  1290   1293   1293   1298   Ljava/lang/Exception;
        //  1300   1303   1303   1308   Ljava/lang/Exception;
        //  1305   1308   1308   1313   Ljava/lang/Exception;
        //  1315   1318   1318   1323   Ljava/lang/Exception;
        //  1320   1323   1323   1328   Ljava/lang/Exception;
        //  1330   1333   1333   1338   Ljava/lang/Exception;
        //  1335   1338   1338   1343   Ljava/lang/Exception;
        //  1345   1348   1348   1353   Ljava/lang/Exception;
        //  1350   1353   1353   1358   Ljava/lang/Exception;
        //  1355   1358   1358   1363   Ljava/lang/Exception;
        //  1360   1363   1363   1368   Ljava/lang/Exception;
        //  1365   1368   1368   1373   Ljava/lang/Exception;
        //  1370   1373   1373   1378   Ljava/lang/Exception;
        //  1375   1378   1378   1383   Ljava/lang/Exception;
        //  1385   1388   1388   1393   Ljava/lang/Exception;
        //  1395   1398   1398   1403   Ljava/lang/Exception;
        //  1400   1403   1403   1408   Ljava/lang/Exception;
        //  1410   1413   1413   1418   Ljava/lang/Exception;
        //  1415   1418   1418   1423   Ljava/lang/Exception;
        //  1420   1423   1423   1428   Ljava/lang/Exception;
        //  1435   1438   1438   1443   Ljava/lang/Exception;
        //  1445   1448   1283   1288   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 689, Size: 689
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
    
    @Override
    public void a(final bi bi, final boolean b) {
        if (bi != null) {
            App.a(s1.z[4], bi);
            Log.i(s1.z[5] + b);
            App.f(bi);
            if (!bi.a.b && b && App.c(bi) && App.e(bi)) {
                arz.a().b(bi);
            }
        }
    }
    
    @Override
    public void a(final Collection collection, final Map map) {
        final boolean i = App.I;
        final HashMap<Object, Collection<bi>> hashMap = new HashMap<Object, Collection<bi>>();
        for (final bi bi : collection) {
            Collection<bi> collection2 = hashMap.get(bi.a.a);
            if (collection2 == null) {
                collection2 = new ArrayList<bi>();
                hashMap.put(bi.a.a, collection2);
            }
            collection2.add(bi);
            if (i) {
                break;
            }
        }
        for (final Map.Entry<String, Collection<bi>> entry : hashMap.entrySet()) {
            final Integer n = map.get(entry.getKey());
            final String s = entry.getKey();
            final Collection<bi> collection3 = entry.getValue();
            int intValue;
            if (n == null) {
                intValue = 0;
            }
            else {
                intValue = n;
            }
            App.a(s, collection3, intValue);
            if (i) {
                break;
            }
        }
    }
    
    @Override
    public void b(final bi bi) {
        if (bi.b != null && !App.aa && bi.I != 8 && System.currentTimeMillis() - bi.u > 900000L) {
            App.aa = true;
            final boolean n = App.n((Context)App.aq);
            if (n) {
                App.c((Context)App.aq, 1 + App.t((Context)App.aq));
                if (App.n((Context)App.aq) != n) {
                    App.f((Context)App.aq);
                }
            }
        }
    }
    
    @Override
    public void b(final bi bi, final int n) {
        final boolean i = App.I;
        Label_0246: {
            switch (n) {
                case 1:
                case 4: {
                    App.b(bi, false);
                    App.o(bi);
                    if (i) {
                        break Label_0246;
                    }
                    return;
                }
                case 3: {
                    final MediaData mediaData = (MediaData)bi.N;
                    if (mediaData == null || !mediaData.transferred) {
                        return;
                    }
                    br.a((Context)App.aq, bi);
                    App.c(bi.d, mediaData.dedupeDownload);
                    if (bi.I == 2 && bi.E == 1) {
                        if (bi.b != null) {
                            App.a(true, App.e);
                            App.e = true;
                            if (!i) {
                                return;
                            }
                        }
                        App.a(true, false);
                        if (!i) {
                            return;
                        }
                    }
                    if (Build$VERSION.SDK_INT < 16) {
                        return;
                    }
                    final a8p a8p = (a8p)m.b().a(a8p.class);
                    final v1 p2 = Conversation.p();
                    if (!p2.a() || a8p.a() || !p2.b().I.equals(bi.a.a)) {
                        App.a(true, true, true, false);
                    }
                    if (i) {
                        break Label_0246;
                    }
                    return;
                }
                case -1: {
                    if (i) {
                        break;
                    }
                    return;
                }
            }
        }
        Log.w(s1.z[3] + n);
    }
    
    @Override
    public void c(final bi bi) {
        final boolean i = App.I;
        if (bi != null) {
            App.a(s1.z[0], bi);
            if (!bi.a.b) {
                App.f(bi);
                if (!i) {
                    return;
                }
            }
            if (bi.c == 6) {
                if (bi instanceof wb) {
                    App.b(((wb)bi).S);
                    if (!i) {
                        return;
                    }
                }
                if (bi.L != 6L) {
                    return;
                }
                App.b(bi.a.c, bi.a.a, s1.z[2]);
                if (!i) {
                    return;
                }
            }
            if (s1.z[1].equals(bi.C)) {
                App.b(bi.a.c, 200);
            }
        }
    }
}
