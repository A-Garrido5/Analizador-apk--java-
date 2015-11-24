// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import android.os.Parcelable;
import android.net.Uri;
import android.provider.MediaStore$Images$Media;
import com.whatsapp.util.Log;
import android.app.Activity;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import java.util.List;
import android.content.Intent;
import android.content.Context;
import java.io.File;

public class qp
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[40];
        String s = "hgZ%";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1032:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ']';
                        break;
                    }
                    case 0: {
                        c2 = '\u001c';
                        break;
                    }
                    case 1: {
                        c2 = '\n';
                        break;
                    }
                    case 2: {
                        c2 = '*';
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
                    s = "lxE74poC?;s%Y43xzB>)s%I03re^q.}|Oq)t\u007fG3";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "lxE74poC?;s%Y43xzB>)s";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "lxE74poC?;s%Y43xzB>)s%I03re^q9yiE58<~B$0~";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "lxE74poC?;s%Y43xzB>)s";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "hgZ!";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "hgZ8";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "s\u007f^!(h";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "}dN#2un\u0004<8xcK\u007f<\u007f~C>32Cg\u0010\u001aYUi\u0010\rH_x\u0014";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "}dN#2un\u000483hoD%syr^#<2Cd\u0018\tUKf\u000e\u0014R^o\u001f\tO";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    s = "s\u007f^!(h";
                    n = 9;
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    array = z2;
                    s = "m\u007fO#$";
                    n = 10;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "}dN#2un\u000483hoD%s}i^82r$z\u0018\u001eW";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u007feG\u007f*tk^\"<lz\u000483hoD%s}i^82r$x\u0014\u000eY^u\u0016\u000fS_z\u000e\rTE~\u001e";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u007feG\u007f*tk^\"<lz\u000483hoD%s}i^82r$x\u0014\u000eY^u\u0001\u000fSLc\u001d\u0018CZb\u001e\tS";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "ugK683 ";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u007feG\u007f*tk^\"<lz\u000483hoD%s}i^82r$y\u0014\u001cNIb\u000e\rTE~\u001e";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "lxE74poC?;s%K2)u|C%$noY~;}cF~3s~\u00070pugK68";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "yxX>/1eE<";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "lxE74poC?;s%K2)u|C%$noY~;}cF~1skN|4qkM4";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "lxE74poC?;s%K2)u|C%$noY~2sg\u00074/neX";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "re^|<1cG0:y";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "lxE74poC?;s%K2)u|C%$noY~3s'Y!<\u007fo";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "re\u0007\"-}iO";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "ue\u00074/neX";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "}yZ4>hR";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "oiK=8";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "lxE74poC?;s%I#2lzB>)s%\n";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    s = "lxE74poC?;s%I#2lzB>)s%D>)1kD|4qkM4}";
                    n = 27;
                    n2 = 28;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    array = z2;
                    s = "s\u007f^!(hR";
                    n = 28;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u007fxE!\u001feE_%-i~y8'y";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "}yZ4>hS";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "lxE74poC?;s%I#2lzB>)s%D>pudZ$)1y^#8}g\n";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "s\u007f^!(h";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "lxE74poC?;s%I#2lzB>)s%D>pxk^0";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "oiK=8Izc7\u0013yoN49";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "qkR\u00174poy8'y";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "s\u007f^!(hLE#0}~";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "qcD\u0012/sz";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "s\u007f^!(hS";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    break Label_1032;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static File a() {
        return App.D(qp.z[0]);
    }
    
    private static void a(final Context context, final Intent intent, final List list) {
        final boolean i = App.I;
        final List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 1) {
            list.add(intent);
            if (!i) {
                return;
            }
        }
        for (final ResolveInfo resolveInfo : queryIntentActivities) {
            final Intent intent2 = (Intent)intent.clone();
            intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            list.add(intent2);
            if (i) {
                break;
            }
        }
    }
    
    public static void a(final Intent p0, final a_9 p1, final Activity p2, final int p3, final gu p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: aconst_null    
        //     6: astore          6
        //     8: aload_0        
        //     9: ifnull          18
        //    12: aload_0        
        //    13: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //    16: astore          6
        //    18: aload           6
        //    20: ifnonnull       44
        //    23: invokestatic    com/whatsapp/qp.b:()Ljava/io/File;
        //    26: invokevirtual   java/io/File.exists:()Z
        //    29: istore          33
        //    31: iload           33
        //    33: ifeq            44
        //    36: invokestatic    com/whatsapp/qp.b:()Ljava/io/File;
        //    39: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //    42: astore          6
        //    44: invokestatic    com/whatsapp/qp.c:()Ljava/io/File;
        //    47: invokevirtual   java/io/File.delete:()Z
        //    50: pop            
        //    51: aload           6
        //    53: ifnull          517
        //    56: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    59: aload           6
        //    61: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    64: astore          10
        //    66: aload           10
        //    68: ifnull          285
        //    71: new             Landroid/graphics/BitmapFactory$Options;
        //    74: dup            
        //    75: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //    78: astore          11
        //    80: aload           11
        //    82: iconst_1       
        //    83: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //    86: aload           10
        //    88: aconst_null    
        //    89: aload           11
        //    91: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    94: pop            
        //    95: aload           10
        //    97: invokevirtual   java/io/InputStream.close:()V
        //   100: aload           11
        //   102: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   105: ifle            120
        //   108: aload           11
        //   110: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   113: istore          14
        //   115: iload           14
        //   117: ifgt            209
        //   120: new             Ljava/lang/StringBuilder;
        //   123: dup            
        //   124: invokespecial   java/lang/StringBuilder.<init>:()V
        //   127: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   130: bipush          28
        //   132: aaload         
        //   133: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   136: aload           6
        //   138: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   141: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   144: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   147: aload           4
        //   149: ldc             2131231071
        //   151: invokeinterface com/whatsapp/gu.a:(I)V
        //   156: return         
        //   157: astore          32
        //   159: aload           32
        //   161: athrow         
        //   162: astore          12
        //   164: aload           12
        //   166: athrow         
        //   167: astore          9
        //   169: new             Ljava/lang/StringBuilder;
        //   172: dup            
        //   173: invokespecial   java/lang/StringBuilder.<init>:()V
        //   176: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   179: bipush          27
        //   181: aaload         
        //   182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   185: aload           6
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   190: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   193: aload           9
        //   195: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   198: aload           4
        //   200: ldc_w           2131231072
        //   203: invokeinterface com/whatsapp/gu.a:(I)V
        //   208: return         
        //   209: aload           11
        //   211: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   214: sipush          192
        //   217: if_icmplt       235
        //   220: aload           11
        //   222: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   225: istore          18
        //   227: iload           18
        //   229: sipush          192
        //   232: if_icmpge       541
        //   235: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   238: ldc_w           2131296269
        //   241: sipush          192
        //   244: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   247: astore          16
        //   249: iconst_1       
        //   250: anewarray       Ljava/lang/Object;
        //   253: astore          17
        //   255: aload           17
        //   257: iconst_0       
        //   258: sipush          192
        //   261: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   264: aastore        
        //   265: aload           4
        //   267: aload           16
        //   269: aload           17
        //   271: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   274: invokeinterface com/whatsapp/gu.f:(Ljava/lang/String;)V
        //   279: return         
        //   280: astore          15
        //   282: aload           15
        //   284: athrow         
        //   285: new             Ljava/lang/StringBuilder;
        //   288: dup            
        //   289: invokespecial   java/lang/StringBuilder.<init>:()V
        //   292: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   295: bipush          32
        //   297: aaload         
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: aload           6
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   306: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   309: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   312: aload           4
        //   314: ldc_w           2131231072
        //   317: invokeinterface com/whatsapp/gu.a:(I)V
        //   322: return         
        //   323: new             Landroid/content/Intent;
        //   326: dup            
        //   327: aload_2        
        //   328: ldc_w           Lcom/whatsapp/wallpaper/CropImage;.class
        //   331: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   334: astore          19
        //   336: aload           19
        //   338: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   341: bipush          29
        //   343: aaload         
        //   344: sipush          640
        //   347: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   350: pop            
        //   351: aload           19
        //   353: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   356: bipush          39
        //   358: aaload         
        //   359: sipush          640
        //   362: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   365: pop            
        //   366: aload           19
        //   368: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   371: bipush          38
        //   373: aaload         
        //   374: sipush          192
        //   377: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   380: pop            
        //   381: aload           19
        //   383: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   386: bipush          25
        //   388: aaload         
        //   389: iconst_1       
        //   390: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   393: pop            
        //   394: aload           19
        //   396: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   399: bipush          31
        //   401: aaload         
        //   402: iconst_1       
        //   403: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   406: pop            
        //   407: aload           19
        //   409: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   412: bipush          26
        //   414: aaload         
        //   415: iconst_1       
        //   416: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   419: pop            
        //   420: aload           19
        //   422: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   425: bipush          35
        //   427: aaload         
        //   428: iconst_0       
        //   429: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   432: pop            
        //   433: aload           19
        //   435: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   438: bipush          30
        //   440: aaload         
        //   441: iconst_0       
        //   442: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   445: pop            
        //   446: aload           19
        //   448: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   451: bipush          36
        //   453: aaload         
        //   454: ldc_w           61440
        //   457: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   460: pop            
        //   461: aload           19
        //   463: aload           6
        //   465: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   468: pop            
        //   469: aload           19
        //   471: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   474: bipush          33
        //   476: aaload         
        //   477: invokestatic    com/whatsapp/qp.c:()Ljava/io/File;
        //   480: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   483: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   486: pop            
        //   487: aload           19
        //   489: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   492: bipush          37
        //   494: aaload         
        //   495: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //   498: invokevirtual   android/graphics/Bitmap$CompressFormat.toString:()Ljava/lang/String;
        //   501: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   504: pop            
        //   505: aload_2        
        //   506: aload           19
        //   508: iload_3        
        //   509: invokevirtual   android/app/Activity.startActivityForResult:(Landroid/content/Intent;I)V
        //   512: iload           5
        //   514: ifeq            156
        //   517: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   520: bipush          34
        //   522: aaload         
        //   523: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   526: aload           4
        //   528: ldc             2131231071
        //   530: invokeinterface com/whatsapp/gu.a:(I)V
        //   535: return         
        //   536: astore          8
        //   538: aload           8
        //   540: athrow         
        //   541: iload           5
        //   543: ifeq            323
        //   546: goto            285
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  23     31     157    162    Ljava/io/IOException;
        //  56     66     167    209    Ljava/io/IOException;
        //  71     80     167    209    Ljava/io/IOException;
        //  80     115    162    167    Ljava/io/IOException;
        //  120    156    167    209    Ljava/io/IOException;
        //  164    167    167    209    Ljava/io/IOException;
        //  209    227    280    285    Ljava/io/IOException;
        //  235    279    167    209    Ljava/io/IOException;
        //  282    285    167    209    Ljava/io/IOException;
        //  285    322    167    209    Ljava/io/IOException;
        //  336    512    536    541    Ljava/io/IOException;
        //  517    535    536    541    Ljava/io/IOException;
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
    
    public static void a(final Intent intent, final gu gu) {
        final boolean i = App.I;
        if (intent.getBooleanExtra(qp.z[18], false)) {
            Log.e(qp.z[20]);
            App.a(gu, App.aq.getString(2131231082));
            if (!i) {
                return;
            }
        }
        if (intent.getBooleanExtra(qp.z[23], false)) {
            Log.e(qp.z[22]);
            App.a(gu, App.aq.getString(2131231078));
            if (!i) {
                return;
            }
        }
        if (intent.getBooleanExtra(qp.z[24], false)) {
            Log.e(qp.z[19]);
            App.a(gu, App.aq.getString(2131231072));
            if (!i) {
                return;
            }
        }
        if (intent.getBooleanExtra(qp.z[21], false)) {
            Log.e(qp.z[17]);
            App.a(gu, App.aq.getString(2131231071));
        }
    }
    
    public static void a(final a_9 a_9, final Activity activity, final int n) {
        final boolean i = App.I;
        if (ade.a()) {
            int n2;
            if (a_9.m()) {
                n2 = 2131231121;
            }
            else {
                n2 = 2131231124;
            }
            App.b((Context)activity, activity.getString(n2), 0);
            return;
        }
        final Intent intent = new Intent(qp.z[12], MediaStore$Images$Media.INTERNAL_CONTENT_URI);
        intent.setType(qp.z[15]);
        b().delete();
        final Uri fromFile = Uri.fromFile(b());
        final Intent putExtra = new Intent(qp.z[8]).putExtra(qp.z[7], (Parcelable)fromFile);
        final Intent putExtra2 = new Intent(qp.z[16]).putExtra(qp.z[10], (Parcelable)fromFile).putExtra(qp.z[11], a_9.t);
        Intent intent2 = null;
        String s = null;
        Label_0213: {
            if (a_9.m()) {
                intent2 = new Intent(qp.z[13], (Uri)null);
                s = activity.getString(2131231224);
                if (!i) {
                    break Label_0213;
                }
            }
            intent2 = new Intent(qp.z[14], (Uri)null);
            s = activity.getString(2131231498);
        }
        final ArrayList<Intent> list = new ArrayList<Intent>();
        Label_0306: {
            if (a_9.y().exists()) {
                a((Context)activity, intent, list);
                a((Context)activity, putExtra, list);
                if (!a_9.m()) {
                    break Label_0306;
                }
                list.add(putExtra2);
                if (!i) {
                    break Label_0306;
                }
            }
            if (a_9.m()) {
                a((Context)activity, intent, list);
                a((Context)activity, putExtra, list);
                if (!i) {
                    intent2 = putExtra2;
                    break Label_0306;
                }
            }
            a((Context)activity, intent, list);
            intent2 = putExtra;
        }
        final Intent chooser = Intent.createChooser(intent2, (CharSequence)s);
        if (!list.isEmpty()) {
            chooser.putExtra(qp.z[9], (Parcelable[])list.toArray((Parcelable[])new Intent[0]));
        }
        activity.startActivityForResult(chooser, n);
    }
    
    public static boolean a(final a_9 p0, final Activity p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/App.O:()Z
        //     3: ifeq            472
        //     6: invokestatic    com/whatsapp/qp.c:()Ljava/io/File;
        //     9: astore          4
        //    11: new             Ljava/io/FileInputStream;
        //    14: dup            
        //    15: aload           4
        //    17: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    20: astore          5
        //    22: aload           4
        //    24: invokevirtual   java/io/File.length:()J
        //    27: l2i            
        //    28: newarray        B
        //    30: astore          6
        //    32: aload           5
        //    34: aload           6
        //    36: invokevirtual   java/io/FileInputStream.read:([B)I
        //    39: pop            
        //    40: aload           5
        //    42: invokevirtual   java/io/FileInputStream.close:()V
        //    45: new             Landroid/graphics/BitmapFactory$Options;
        //    48: dup            
        //    49: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //    52: astore          9
        //    54: aload           9
        //    56: iconst_1       
        //    57: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //    60: aload           6
        //    62: iconst_0       
        //    63: aload           6
        //    65: arraylength    
        //    66: aload           9
        //    68: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    71: pop            
        //    72: aload           9
        //    74: aload           9
        //    76: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //    79: aload           9
        //    81: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //    84: invokestatic    java/lang/Math.min:(II)I
        //    87: bipush          96
        //    89: idiv           
        //    90: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //    93: aload           9
        //    95: iconst_0       
        //    96: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //    99: aload           9
        //   101: iconst_0       
        //   102: putfield        android/graphics/BitmapFactory$Options.inScaled:Z
        //   105: aload           9
        //   107: iconst_1       
        //   108: putfield        android/graphics/BitmapFactory$Options.inDither:Z
        //   111: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   114: bipush          10
        //   116: if_icmplt       125
        //   119: aload           9
        //   121: iconst_1       
        //   122: putfield        android/graphics/BitmapFactory$Options.inPreferQualityOverSpeed:Z
        //   125: aload           6
        //   127: iconst_0       
        //   128: aload           6
        //   130: arraylength    
        //   131: aload           9
        //   133: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   136: astore          12
        //   138: aload           12
        //   140: ifnull          362
        //   143: aload           12
        //   145: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //   148: astore          13
        //   150: aload           13
        //   152: astore          14
        //   154: aload           14
        //   156: ifnonnull       164
        //   159: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   162: astore          14
        //   164: bipush          96
        //   166: bipush          96
        //   168: aload           14
        //   170: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   173: astore          15
        //   175: new             Landroid/graphics/Canvas;
        //   178: dup            
        //   179: aload           15
        //   181: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   184: astore          16
        //   186: new             Landroid/graphics/Paint;
        //   189: dup            
        //   190: invokespecial   android/graphics/Paint.<init>:()V
        //   193: astore          17
        //   195: aload           17
        //   197: iconst_1       
        //   198: invokevirtual   android/graphics/Paint.setAntiAlias:(Z)V
        //   201: aload           17
        //   203: iconst_1       
        //   204: invokevirtual   android/graphics/Paint.setFilterBitmap:(Z)V
        //   207: aload           17
        //   209: iconst_1       
        //   210: invokevirtual   android/graphics/Paint.setDither:(Z)V
        //   213: aload           16
        //   215: aload           12
        //   217: new             Landroid/graphics/Rect;
        //   220: dup            
        //   221: iconst_0       
        //   222: iconst_0       
        //   223: aload           12
        //   225: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   228: aload           12
        //   230: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   233: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //   236: new             Landroid/graphics/Rect;
        //   239: dup            
        //   240: iconst_0       
        //   241: iconst_0       
        //   242: bipush          96
        //   244: bipush          96
        //   246: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //   249: aload           17
        //   251: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
        //   254: aload           12
        //   256: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   259: new             Ljava/io/FileOutputStream;
        //   262: dup            
        //   263: invokestatic    com/whatsapp/qp.a:()Ljava/io/File;
        //   266: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   269: astore          18
        //   271: aload           18
        //   273: ifnull          289
        //   276: aload           15
        //   278: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //   281: bipush          75
        //   283: aload           18
        //   285: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   288: pop            
        //   289: aload           18
        //   291: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   294: aload           15
        //   296: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   299: invokestatic    com/whatsapp/qp.a:()Ljava/io/File;
        //   302: astore          19
        //   304: new             Ljava/io/FileInputStream;
        //   307: dup            
        //   308: aload           19
        //   310: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   313: astore          20
        //   315: aload           19
        //   317: invokevirtual   java/io/File.length:()J
        //   320: l2i            
        //   321: newarray        B
        //   323: astore          21
        //   325: aload           20
        //   327: aload           21
        //   329: invokevirtual   java/io/FileInputStream.read:([B)I
        //   332: pop            
        //   333: aload           20
        //   335: invokevirtual   java/io/FileInputStream.close:()V
        //   338: new             Lcom/whatsapp/_r;
        //   341: dup            
        //   342: aload_0        
        //   343: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   346: aload           6
        //   348: aload           21
        //   350: invokespecial   com/whatsapp/_r.<init>:(Ljava/lang/String;[B[B)V
        //   353: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/_r;)V
        //   356: getstatic       com/whatsapp/App.I:Z
        //   359: ifeq            508
        //   362: aload_1        
        //   363: invokevirtual   android/app/Activity.getBaseContext:()Landroid/content/Context;
        //   366: ldc_w           2131231072
        //   369: iconst_0       
        //   370: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   373: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   376: iconst_3       
        //   377: aaload         
        //   378: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   381: iconst_0       
        //   382: ireturn        
        //   383: astore          10
        //   385: aload           10
        //   387: athrow         
        //   388: astore_3       
        //   389: aload_1        
        //   390: invokevirtual   android/app/Activity.getBaseContext:()Landroid/content/Context;
        //   393: ldc_w           2131231072
        //   396: iconst_0       
        //   397: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   400: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   403: iconst_2       
        //   404: aaload         
        //   405: aload_3        
        //   406: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   409: iconst_0       
        //   410: ireturn        
        //   411: astore          28
        //   413: aload           28
        //   415: athrow         
        //   416: astore_2       
        //   417: aload_1        
        //   418: invokevirtual   android/app/Activity.getBaseContext:()Landroid/content/Context;
        //   421: ldc_w           2131231072
        //   424: iconst_0       
        //   425: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   428: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   431: iconst_4       
        //   432: aaload         
        //   433: aload_2        
        //   434: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   437: iconst_0       
        //   438: ireturn        
        //   439: astore          25
        //   441: aload           25
        //   443: athrow         
        //   444: astore          26
        //   446: getstatic       com/whatsapp/qp.z:[Ljava/lang/String;
        //   449: iconst_1       
        //   450: aaload         
        //   451: aload           26
        //   453: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   456: aload           18
        //   458: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   461: goto            294
        //   464: aload           18
        //   466: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   469: aload           24
        //   471: athrow         
        //   472: aload_1        
        //   473: invokevirtual   android/app/Activity.getBaseContext:()Landroid/content/Context;
        //   476: ldc_w           2131230906
        //   479: iconst_0       
        //   480: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   483: iconst_0       
        //   484: ireturn        
        //   485: astore          8
        //   487: goto            45
        //   490: astore          23
        //   492: goto            338
        //   495: astore          24
        //   497: goto            464
        //   500: astore          26
        //   502: aconst_null    
        //   503: astore          18
        //   505: goto            446
        //   508: iconst_1       
        //   509: ireturn        
        //   510: astore          24
        //   512: aconst_null    
        //   513: astore          18
        //   515: goto            464
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  6      40     388    411    Ljava/io/FileNotFoundException;
        //  6      40     416    439    Ljava/io/IOException;
        //  40     45     485    490    Ljava/io/IOException;
        //  40     45     388    411    Ljava/io/FileNotFoundException;
        //  45     54     388    411    Ljava/io/FileNotFoundException;
        //  45     54     416    439    Ljava/io/IOException;
        //  54     125    383    388    Ljava/io/IOException;
        //  54     125    388    411    Ljava/io/FileNotFoundException;
        //  125    138    388    411    Ljava/io/FileNotFoundException;
        //  125    138    416    439    Ljava/io/IOException;
        //  143    150    388    411    Ljava/io/FileNotFoundException;
        //  143    150    416    439    Ljava/io/IOException;
        //  159    164    411    416    Ljava/io/IOException;
        //  159    164    388    411    Ljava/io/FileNotFoundException;
        //  164    259    388    411    Ljava/io/FileNotFoundException;
        //  164    259    416    439    Ljava/io/IOException;
        //  259    271    500    508    Ljava/io/IOException;
        //  259    271    510    518    Any
        //  276    289    439    446    Ljava/io/IOException;
        //  276    289    495    500    Any
        //  289    294    388    411    Ljava/io/FileNotFoundException;
        //  289    294    416    439    Ljava/io/IOException;
        //  294    333    388    411    Ljava/io/FileNotFoundException;
        //  294    333    416    439    Ljava/io/IOException;
        //  333    338    490    495    Ljava/io/IOException;
        //  333    338    388    411    Ljava/io/FileNotFoundException;
        //  338    362    388    411    Ljava/io/FileNotFoundException;
        //  338    362    416    439    Ljava/io/IOException;
        //  362    381    388    411    Ljava/io/FileNotFoundException;
        //  362    381    416    439    Ljava/io/IOException;
        //  385    388    388    411    Ljava/io/FileNotFoundException;
        //  385    388    416    439    Ljava/io/IOException;
        //  413    416    388    411    Ljava/io/FileNotFoundException;
        //  413    416    416    439    Ljava/io/IOException;
        //  441    444    444    446    Ljava/io/IOException;
        //  441    444    495    500    Any
        //  446    456    495    500    Any
        //  456    461    388    411    Ljava/io/FileNotFoundException;
        //  456    461    416    439    Ljava/io/IOException;
        //  464    472    388    411    Ljava/io/FileNotFoundException;
        //  464    472    416    439    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 248, Size: 248
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
    
    public static File b() {
        return App.D(qp.z[6]);
    }
    
    public static void b(final a_9 a_9, final Activity activity) {
        App.a(new _r(a_9.u, null, null));
    }
    
    public static File c() {
        return App.D(qp.z[5]);
    }
}
