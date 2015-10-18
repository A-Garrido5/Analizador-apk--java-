// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.Voip;
import com.whatsapp.appwidget.WidgetProvider;
import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.protocol.bi;
import android.content.Context;
import com.whatsapp.util.Log;
import com.whatsapp.hj;
import com.whatsapp.App;
import java.util.LinkedList;
import com.whatsapp.aa0;

public class w implements aa0
{
    private static w a;
    private static final String[] z;
    private LinkedList b;
    
    static {
        final String[] z2 = new String[22];
        String s = "S\u001a$jZZ\u00106uSP\u001c#pYW\u00106mVQ\u001dxlOZ\u0012#|\u001f]\u001c\"wK\u0004";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0582:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '?';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = 'W';
                        break;
                    }
                    case 3: {
                        c2 = '\u0019';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "X\u00018t|_\u001f;WPJ\u001a1p\\_\u0007>vQ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "P\u001c#pYG,%pQY\u00078wZ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "]\u001c:7HV\u0012#j^N\u0003\biM[\u00152kZP\u00102j";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001e\u0002\"pZJI";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "]\u0012;u";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "]\u001c:7HV\u0012#j^N\u0003ypQJ\u00169m\u0011_\u0010#pPP]\u0014Xsr ";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "S\u001a$jZZ\u00106uSP\u001c#pYW\u00106mVQ\u001dxlOZ\u0012#|\u001f]\u00129zZRS";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001e\u00108wK[\u0010#j\u0005";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "_\u001d3kPW\u0017yiZL\u001e>jLW\u001c97jn7\u0016Mza2\u0007I`q#\u0004Flj2\u0003J";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "T\u001a3";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "]\u0012;u`H\u001a5k^J\u0016\buZP\u0014#q";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "X\u00018t|_\u001f;WPJ\u001a1p\\_\u0007>vQ";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u001e\u0007>tZM\u00076tO\u0004";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "]\u001c:7HV\u0012#j^N\u0003\biM[\u00152kZP\u00102j";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "X\u001a%jKa\u001e>jL[\u0017\bz^R\u001f";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "S\u001a$jZZ\u00106uSP\u001c#pYW\u00106mVQ\u001dxpQW\u0007wzPK\u001d##";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "X\u001a%jKa\u001e>jL[\u0017\bz^R\u001f";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "S\u001a$jZZ\u00106uSP\u001c#pYW\u00106mVQ\u001dxzS[\u0012%9";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "]\u001c:7HV\u0012#j^N\u0003\biM[\u00152kZP\u00102j";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "X\u001a%jKa\u001e>jL[\u0017\bz^R\u001f";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "]\u001c:7HV\u0012#j^N\u0003\biM[\u00152kZP\u00102j";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    break Label_0582;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        w.a = new w();
    }
    
    public w() {
        App.a(this);
    }
    
    private void a() {
        synchronized (this) {
            if (this.b != null) {
                return;
            }
            final long long1 = App.aq.getSharedPreferences(w.z[14], 0).getLong(w.z[15], 0L);
            Label_0059: {
                if (long1 <= 0L) {
                    break Label_0059;
                }
                try {
                    this.b = App.ak.a(long1, null);
                    if (PopupNotification.A) {
                        this.b = new LinkedList();
                    }
                    Log.i(w.z[16] + this.b.size() + w.z[13] + long1);
                }
                catch (SecurityException ex) {
                    throw ex;
                }
            }
        }
    }
    
    public static w b() {
        return w.a;
    }
    
    public void a(final Context context, final bi bi, final boolean b) {
        this.a();
        if (this.b.isEmpty()) {
            App.aq.getSharedPreferences(w.z[21], 0).edit().putLong(w.z[20], bi.u).commit();
        }
        this.b.add(0, bi);
        this.a(context, b);
        App.aq.a5().post((Runnable)new aw(this));
    }
    
    public void a(final Context p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/whatsapp/notification/w.a:()V
        //     8: aload_0        
        //     9: getfield        com/whatsapp/notification/w.b:Ljava/util/LinkedList;
        //    12: invokevirtual   java/util/LinkedList.isEmpty:()Z
        //    15: ifeq            59
        //    18: new             Ljava/lang/StringBuilder;
        //    21: dup            
        //    22: invokespecial   java/lang/StringBuilder.<init>:()V
        //    25: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //    28: bipush          7
        //    30: aaload         
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: iload_2        
        //    35: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    38: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    41: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    44: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    47: invokestatic    android/support/v4/app/NotificationManagerCompat.from:(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;
        //    50: bipush          7
        //    52: invokevirtual   android/support/v4/app/NotificationManagerCompat.cancel:(I)V
        //    55: iload_3        
        //    56: ifeq            984
        //    59: new             Ljava/util/HashSet;
        //    62: dup            
        //    63: invokespecial   java/util/HashSet.<init>:()V
        //    66: astore          5
        //    68: aload_0        
        //    69: getfield        com/whatsapp/notification/w.b:Ljava/util/LinkedList;
        //    72: invokevirtual   java/util/LinkedList.iterator:()Ljava/util/Iterator;
        //    75: astore          6
        //    77: aload           6
        //    79: invokeinterface java/util/Iterator.hasNext:()Z
        //    84: ifeq            113
        //    87: aload           5
        //    89: aload           6
        //    91: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    96: checkcast       Lcom/whatsapp/protocol/bi;
        //    99: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   102: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   105: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   108: pop            
        //   109: iload_3        
        //   110: ifeq            77
        //   113: new             Landroid/support/v4/app/NotificationCompat$Builder;
        //   116: dup            
        //   117: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   120: invokespecial   android/support/v4/app/NotificationCompat$Builder.<init>:(Landroid/content/Context;)V
        //   123: astore          7
        //   125: aload           7
        //   127: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   130: iconst_5       
        //   131: aaload         
        //   132: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setCategory:(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   135: pop            
        //   136: aload           7
        //   138: iconst_1       
        //   139: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setPriority:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //   142: pop            
        //   143: aload           7
        //   145: ldc             2130838962
        //   147: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setSmallIcon:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //   150: pop            
        //   151: aload           7
        //   153: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   156: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //   159: ldc             2131624025
        //   161: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   164: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setColor:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //   167: pop            
        //   168: aload           7
        //   170: iconst_1       
        //   171: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setAutoCancel:(Z)Landroid/support/v4/app/NotificationCompat$Builder;
        //   174: pop            
        //   175: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   178: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   181: iconst_3       
        //   182: aaload         
        //   183: iconst_0       
        //   184: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   187: astore          13
        //   189: iload_2        
        //   190: ifne            319
        //   193: invokestatic    com/whatsapp/Voip.d:()Z
        //   196: ifeq            990
        //   199: aload           13
        //   201: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   204: iconst_2       
        //   205: aaload         
        //   206: aconst_null    
        //   207: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   212: astore          69
        //   214: aload           69
        //   216: ifnull          315
        //   219: aload           69
        //   221: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   224: astore          70
        //   226: aload           70
        //   228: ifnull          315
        //   231: invokestatic    com/whatsapp/Conversation.p:()Lcom/whatsapp/v1;
        //   234: astore          71
        //   236: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   239: bipush          21
        //   241: if_icmplt       310
        //   244: getstatic       android/provider/Settings$System.DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;
        //   247: aload           70
        //   249: invokevirtual   android/net/Uri.equals:(Ljava/lang/Object;)Z
        //   252: istore          78
        //   254: iload           78
        //   256: ifne            271
        //   259: aload           70
        //   261: invokestatic    com/whatsapp/notification/q.a:(Landroid/net/Uri;)Z
        //   264: istore          82
        //   266: iload           82
        //   268: ifeq            310
        //   271: aload           71
        //   273: invokevirtual   com/whatsapp/v1.a:()Z
        //   276: istore          79
        //   278: iload           79
        //   280: ifeq            298
        //   283: aload           71
        //   285: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //   288: invokevirtual   com/whatsapp/Conversation.h:()Z
        //   291: istore          81
        //   293: iload           81
        //   295: ifne            315
        //   298: aload           7
        //   300: aload           70
        //   302: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setSound:(Landroid/net/Uri;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   305: pop            
        //   306: iload_3        
        //   307: ifeq            315
        //   310: aload           70
        //   312: invokestatic    com/whatsapp/App.a:(Landroid/net/Uri;)V
        //   315: iload_3        
        //   316: ifeq            326
        //   319: aload           7
        //   321: iconst_4       
        //   322: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setDefaults:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //   325: pop            
        //   326: new             Ljava/lang/StringBuilder;
        //   329: dup            
        //   330: invokespecial   java/lang/StringBuilder.<init>:()V
        //   333: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   336: iconst_0       
        //   337: aaload         
        //   338: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   341: aload_0        
        //   342: getfield        com/whatsapp/notification/w.b:Ljava/util/LinkedList;
        //   345: invokevirtual   java/util/LinkedList.size:()I
        //   348: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   351: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   354: bipush          8
        //   356: aaload         
        //   357: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   360: aload           5
        //   362: invokevirtual   java/util/HashSet.size:()I
        //   365: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   368: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   371: iconst_4       
        //   372: aaload         
        //   373: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   376: iload_2        
        //   377: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   380: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   383: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   386: aload           5
        //   388: invokevirtual   java/util/HashSet.size:()I
        //   391: iconst_1       
        //   392: if_icmpne       692
        //   395: aload           5
        //   397: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   400: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   405: checkcast       Ljava/lang/String;
        //   408: astore          39
        //   410: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   413: aload           39
        //   415: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   418: astore          40
        //   420: aload_0        
        //   421: getfield        com/whatsapp/notification/w.b:Ljava/util/LinkedList;
        //   424: invokevirtual   java/util/LinkedList.size:()I
        //   427: iconst_1       
        //   428: if_icmpne       450
        //   431: aload           7
        //   433: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   436: ldc_w           2131231333
        //   439: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //   442: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   445: pop            
        //   446: iload_3        
        //   447: ifeq            501
        //   450: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   453: ldc_w           2131296280
        //   456: aload_0        
        //   457: getfield        com/whatsapp/notification/w.b:Ljava/util/LinkedList;
        //   460: invokevirtual   java/util/LinkedList.size:()I
        //   463: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   466: astore          43
        //   468: iconst_1       
        //   469: anewarray       Ljava/lang/Object;
        //   472: astore          44
        //   474: aload           44
        //   476: iconst_0       
        //   477: aload_0        
        //   478: getfield        com/whatsapp/notification/w.b:Ljava/util/LinkedList;
        //   481: invokevirtual   java/util/LinkedList.size:()I
        //   484: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   487: aastore        
        //   488: aload           7
        //   490: aload           43
        //   492: aload           44
        //   494: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   497: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   500: pop            
        //   501: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   504: astore          46
        //   506: iconst_1       
        //   507: anewarray       Ljava/lang/Object;
        //   510: astore          47
        //   512: aload           47
        //   514: iconst_0       
        //   515: aload           40
        //   517: aload_1        
        //   518: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   521: aastore        
        //   522: aload           7
        //   524: aload           46
        //   526: ldc_w           2131231335
        //   529: aload           47
        //   531: invokevirtual   com/whatsapp/App.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   534: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setTicker:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   537: pop            
        //   538: aload           7
        //   540: aload           40
        //   542: aload_1        
        //   543: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   546: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   549: pop            
        //   550: new             Landroid/content/Intent;
        //   553: dup            
        //   554: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   557: ldc_w           Lcom/whatsapp/VoipActivity;.class
        //   560: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   563: astore          50
        //   565: aload           50
        //   567: ldc_w           268435456
        //   570: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //   573: pop            
        //   574: aload           50
        //   576: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   579: bipush          10
        //   581: aaload         
        //   582: aload           39
        //   584: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   587: pop            
        //   588: aload           50
        //   590: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   593: bipush          12
        //   595: aaload         
        //   596: iconst_1       
        //   597: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   600: pop            
        //   601: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   604: iconst_0       
        //   605: aload           50
        //   607: ldc_w           268435456
        //   610: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   613: astore          54
        //   615: aload           7
        //   617: ldc_w           2130838712
        //   620: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   623: ldc_w           2131231334
        //   626: invokevirtual   com/whatsapp/App.getText:(I)Ljava/lang/CharSequence;
        //   629: aload           54
        //   631: invokevirtual   android/support/v4/app/NotificationCompat$Builder.addAction:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   634: pop            
        //   635: aload           40
        //   637: invokestatic    com/whatsapp/Conversation.a:(Lcom/whatsapp/a_9;)Landroid/content/Intent;
        //   640: astore          56
        //   642: aload           56
        //   644: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   647: iconst_1       
        //   648: aaload         
        //   649: iconst_1       
        //   650: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   653: pop            
        //   654: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   657: iconst_0       
        //   658: aload           56
        //   660: ldc_w           268435456
        //   663: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   666: astore          58
        //   668: aload           7
        //   670: ldc_w           2130838726
        //   673: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   676: ldc_w           2131231336
        //   679: invokevirtual   com/whatsapp/App.getText:(I)Ljava/lang/CharSequence;
        //   682: aload           58
        //   684: invokevirtual   android/support/v4/app/NotificationCompat$Builder.addAction:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   687: pop            
        //   688: iload_3        
        //   689: ifeq            879
        //   692: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   695: ldc_w           2131296280
        //   698: aload_0        
        //   699: getfield        com/whatsapp/notification/w.b:Ljava/util/LinkedList;
        //   702: invokevirtual   java/util/LinkedList.size:()I
        //   705: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   708: astore          16
        //   710: iconst_1       
        //   711: anewarray       Ljava/lang/Object;
        //   714: astore          17
        //   716: aload           17
        //   718: iconst_0       
        //   719: aload_0        
        //   720: getfield        com/whatsapp/notification/w.b:Ljava/util/LinkedList;
        //   723: invokevirtual   java/util/LinkedList.size:()I
        //   726: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   729: aastore        
        //   730: aload           7
        //   732: aload           16
        //   734: aload           17
        //   736: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   739: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   742: pop            
        //   743: new             Ljava/util/HashSet;
        //   746: dup            
        //   747: invokespecial   java/util/HashSet.<init>:()V
        //   750: astore          19
        //   752: new             Ljava/lang/StringBuilder;
        //   755: dup            
        //   756: invokespecial   java/lang/StringBuilder.<init>:()V
        //   759: astore          20
        //   761: invokestatic    com/whatsapp/alm.a:()C
        //   764: istore          21
        //   766: aload_0        
        //   767: getfield        com/whatsapp/notification/w.b:Ljava/util/LinkedList;
        //   770: invokevirtual   java/util/LinkedList.iterator:()Ljava/util/Iterator;
        //   773: astore          22
        //   775: aload           22
        //   777: invokeinterface java/util/Iterator.hasNext:()Z
        //   782: ifeq            868
        //   785: aload           22
        //   787: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   792: checkcast       Lcom/whatsapp/protocol/bi;
        //   795: astore          32
        //   797: aload           19
        //   799: aload           32
        //   801: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   804: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   807: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   810: ifeq            864
        //   813: aload           20
        //   815: invokevirtual   java/lang/StringBuilder.length:()I
        //   818: istore          35
        //   820: iload           35
        //   822: ifle            841
        //   825: aload           20
        //   827: iload           21
        //   829: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   832: pop            
        //   833: aload           20
        //   835: bipush          32
        //   837: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   840: pop            
        //   841: aload           20
        //   843: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   846: aload           32
        //   848: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   851: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   854: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   857: invokevirtual   com/whatsapp/a_9.q:()Ljava/lang/String;
        //   860: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   863: pop            
        //   864: iload_3        
        //   865: ifeq            775
        //   868: aload           7
        //   870: aload           20
        //   872: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   875: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   878: pop            
        //   879: new             Landroid/content/Intent;
        //   882: dup            
        //   883: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   886: ldc_w           Lcom/whatsapp/notification/MissedCallNotificationDismissedReceiver;.class
        //   889: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   892: astore          24
        //   894: aload           7
        //   896: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   899: bipush          7
        //   901: aload           24
        //   903: ldc_w           134217728
        //   906: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   909: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setDeleteIntent:(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   912: pop            
        //   913: new             Landroid/content/Intent;
        //   916: dup            
        //   917: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   920: invokestatic    com/whatsapp/Main.h:()Ljava/lang/Class;
        //   923: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   926: astore          26
        //   928: aload           26
        //   930: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   933: bipush          6
        //   935: aaload         
        //   936: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   939: pop            
        //   940: aload           7
        //   942: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   945: iconst_0       
        //   946: aload           26
        //   948: ldc_w           268435456
        //   951: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   954: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentIntent:(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   957: pop            
        //   958: aload           7
        //   960: invokevirtual   android/support/v4/app/NotificationCompat$Builder.build:()Landroid/app/Notification;
        //   963: astore          29
        //   965: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   968: invokestatic    android/support/v4/app/NotificationManagerCompat.from:(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;
        //   971: bipush          7
        //   973: aload           29
        //   975: invokevirtual   android/support/v4/app/NotificationManagerCompat.notify:(ILandroid/app/Notification;)V
        //   978: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   981: invokestatic    com/whatsapp/appwidget/WidgetProvider.a:(Landroid/content/Context;)V
        //   984: return         
        //   985: astore          4
        //   987: aload           4
        //   989: athrow         
        //   990: aload           13
        //   992: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //   995: bipush          11
        //   997: aaload         
        //   998: ldc_w           "1"
        //  1001: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1006: astore          61
        //  1008: iconst_m1      
        //  1009: istore          62
        //  1011: aload           61
        //  1013: invokevirtual   java/lang/String.hashCode:()I
        //  1016: istore          64
        //  1018: iload           64
        //  1020: tableswitch {
        //               96: 1258
        //               97: 1192
        //               98: 1214
        //               99: 1236
        //          default: 1052
        //        }
        //  1052: iload           62
        //  1054: tableswitch {
        //                0: 1086
        //                1: 1100
        //                2: 1144
        //          default: 1080
        //        }
        //  1080: aconst_null    
        //  1081: astore          69
        //  1083: goto            214
        //  1086: aload           7
        //  1088: iconst_2       
        //  1089: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setDefaults:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1092: pop            
        //  1093: aconst_null    
        //  1094: astore          69
        //  1096: iload_3        
        //  1097: ifeq            214
        //  1100: aload           7
        //  1102: iconst_5       
        //  1103: newarray        J
        //  1105: dup            
        //  1106: iconst_0       
        //  1107: lconst_0       
        //  1108: lastore        
        //  1109: dup            
        //  1110: iconst_1       
        //  1111: ldc2_w          300
        //  1114: lastore        
        //  1115: dup            
        //  1116: iconst_2       
        //  1117: ldc2_w          200
        //  1120: lastore        
        //  1121: dup            
        //  1122: iconst_3       
        //  1123: ldc2_w          300
        //  1126: lastore        
        //  1127: dup            
        //  1128: iconst_4       
        //  1129: ldc2_w          200
        //  1132: lastore        
        //  1133: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setVibrate:([J)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1136: pop            
        //  1137: aconst_null    
        //  1138: astore          69
        //  1140: iload_3        
        //  1141: ifeq            214
        //  1144: aload           7
        //  1146: iconst_5       
        //  1147: newarray        J
        //  1149: dup            
        //  1150: iconst_0       
        //  1151: lconst_0       
        //  1152: lastore        
        //  1153: dup            
        //  1154: iconst_1       
        //  1155: ldc2_w          750
        //  1158: lastore        
        //  1159: dup            
        //  1160: iconst_2       
        //  1161: ldc2_w          250
        //  1164: lastore        
        //  1165: dup            
        //  1166: iconst_3       
        //  1167: ldc2_w          750
        //  1170: lastore        
        //  1171: dup            
        //  1172: iconst_4       
        //  1173: ldc2_w          250
        //  1176: lastore        
        //  1177: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setVibrate:([J)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1180: pop            
        //  1181: aconst_null    
        //  1182: astore          69
        //  1184: goto            214
        //  1187: astore          67
        //  1189: aload           67
        //  1191: athrow         
        //  1192: aload           61
        //  1194: ldc_w           "1"
        //  1197: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1200: istore          91
        //  1202: iload           91
        //  1204: ifeq            1052
        //  1207: iload_3        
        //  1208: ifeq            1403
        //  1211: iconst_0       
        //  1212: istore          62
        //  1214: aload           61
        //  1216: ldc_w           "2"
        //  1219: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1222: istore          90
        //  1224: iload           90
        //  1226: ifeq            1052
        //  1229: iload_3        
        //  1230: ifeq            1397
        //  1233: iconst_1       
        //  1234: istore          62
        //  1236: aload           61
        //  1238: ldc_w           "3"
        //  1241: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1244: istore          88
        //  1246: iload           88
        //  1248: ifeq            1052
        //  1251: iload_3        
        //  1252: ifeq            1391
        //  1255: iconst_2       
        //  1256: istore          62
        //  1258: aload           61
        //  1260: ldc_w           "0"
        //  1263: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1266: istore          66
        //  1268: iload           66
        //  1270: ifeq            1052
        //  1273: iconst_3       
        //  1274: istore          62
        //  1276: goto            1052
        //  1279: astore          63
        //  1281: aload           63
        //  1283: athrow         
        //  1284: astore          89
        //  1286: aload           89
        //  1288: athrow         
        //  1289: astore          87
        //  1291: aload           87
        //  1293: athrow         
        //  1294: astore          65
        //  1296: aload           65
        //  1298: athrow         
        //  1299: astore          85
        //  1301: aload           85
        //  1303: athrow         
        //  1304: astore          83
        //  1306: aload           83
        //  1308: athrow         
        //  1309: astore          72
        //  1311: aload           72
        //  1313: athrow         
        //  1314: astore          73
        //  1316: aload           73
        //  1318: athrow         
        //  1319: astore          74
        //  1321: aload           74
        //  1323: athrow         
        //  1324: astore          75
        //  1326: aload           75
        //  1328: athrow         
        //  1329: astore          76
        //  1331: aload           76
        //  1333: athrow         
        //  1334: astore          77
        //  1336: aload           77
        //  1338: athrow         
        //  1339: astore          14
        //  1341: aload           14
        //  1343: athrow         
        //  1344: astore          41
        //  1346: aload           41
        //  1348: athrow         
        //  1349: astore          42
        //  1351: aload           42
        //  1353: athrow         
        //  1354: astore          33
        //  1356: aload           33
        //  1358: athrow         
        //  1359: astore          34
        //  1361: aload           34
        //  1363: athrow         
        //  1364: astore          30
        //  1366: aload           30
        //  1368: invokevirtual   java/lang/SecurityException.toString:()Ljava/lang/String;
        //  1371: getstatic       com/whatsapp/notification/w.z:[Ljava/lang/String;
        //  1374: bipush          9
        //  1376: aaload         
        //  1377: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1380: ifne            978
        //  1383: aload           30
        //  1385: athrow         
        //  1386: astore          31
        //  1388: aload           31
        //  1390: athrow         
        //  1391: iconst_2       
        //  1392: istore          62
        //  1394: goto            1052
        //  1397: iconst_1       
        //  1398: istore          62
        //  1400: goto            1052
        //  1403: iconst_0       
        //  1404: istore          62
        //  1406: goto            1052
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  4      55     985    990    Ljava/lang/SecurityException;
        //  236    254    1309   1314   Ljava/lang/SecurityException;
        //  259    266    1314   1319   Ljava/lang/SecurityException;
        //  271    278    1319   1324   Ljava/lang/SecurityException;
        //  283    293    1324   1329   Ljava/lang/SecurityException;
        //  298    306    1329   1334   Ljava/lang/SecurityException;
        //  310    315    1334   1339   Ljava/lang/SecurityException;
        //  319    326    1339   1344   Ljava/lang/SecurityException;
        //  420    446    1344   1349   Ljava/lang/SecurityException;
        //  450    501    1349   1354   Ljava/lang/SecurityException;
        //  797    820    1354   1359   Ljava/lang/SecurityException;
        //  825    841    1359   1364   Ljava/lang/SecurityException;
        //  965    978    1364   1391   Ljava/lang/SecurityException;
        //  1011   1018   1279   1284   Ljava/lang/SecurityException;
        //  1086   1093   1299   1304   Ljava/lang/SecurityException;
        //  1100   1137   1304   1309   Ljava/lang/SecurityException;
        //  1144   1181   1187   1192   Ljava/lang/SecurityException;
        //  1192   1202   1279   1284   Ljava/lang/SecurityException;
        //  1214   1224   1284   1289   Ljava/lang/SecurityException;
        //  1236   1246   1289   1294   Ljava/lang/SecurityException;
        //  1258   1268   1294   1299   Ljava/lang/SecurityException;
        //  1301   1304   1304   1309   Ljava/lang/SecurityException;
        //  1306   1309   1187   1192   Ljava/lang/SecurityException;
        //  1311   1314   1314   1319   Ljava/lang/SecurityException;
        //  1316   1319   1319   1324   Ljava/lang/SecurityException;
        //  1321   1324   1324   1329   Ljava/lang/SecurityException;
        //  1326   1329   1329   1334   Ljava/lang/SecurityException;
        //  1331   1334   1334   1339   Ljava/lang/SecurityException;
        //  1346   1349   1349   1354   Ljava/lang/SecurityException;
        //  1356   1359   1359   1364   Ljava/lang/SecurityException;
        //  1366   1386   1386   1391   Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 631, Size: 631
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
    public void a(final bi bi) {
    }
    
    @Override
    public void a(final String s, final long n) {
    }
    
    @Override
    public void b(final bi bi) {
    }
    
    public void c() {
        synchronized (this) {
            this.a();
            if (!this.b.isEmpty()) {
                Log.i(w.z[18] + this.b.size());
                App.aq.getSharedPreferences(w.z[19], 0).edit().remove(w.z[17]).commit();
                this.b = new LinkedList();
                NotificationManagerCompat.from((Context)App.aq).cancel(7);
                App.aq.a5().post((Runnable)new e(this));
                WidgetProvider.a((Context)App.aq);
            }
        }
    }
    
    @Override
    public void c(final bi bi) {
        this.a((Context)App.aq, bi, Voip.b(bi));
    }
    
    public LinkedList d() {
        this.a();
        return this.b;
    }
}
