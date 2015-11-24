// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.IOException;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap;
import android.content.Context;
import android.location.LocationListener;
import com.whatsapp.protocol.bi;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;

public class lh extends AsyncTask
{
    public static int m;
    private static final String[] z;
    private final LocationManager a;
    private byte[] b;
    int c;
    Location d;
    Location e;
    boolean f;
    public int g;
    private Location h;
    protected final bi i;
    LocationListener j;
    private final MediaData k;
    LocationListener l;
    
    static {
        final String[] z2 = new String[19];
        String s = "yj\t";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0507:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'J';
                        break;
                    }
                    case 0: {
                        c2 = '\u001e';
                        break;
                    }
                    case 1: {
                        c2 = '\u001a';
                        break;
                    }
                    case 2: {
                        c2 = 'z';
                        break;
                    }
                    case 3: {
                        c2 = '<';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "8i\u0013F/#+M\f2/-J\u001a9{t\tS8#n\bI/8|\u0015N'\u007fnGL$y\"\\Q%|s\u0016Ywjh\u000fYls{\bW/liG_%ru\b\u00068{~_\u000b\tms\u0000Ypss\u001e\u0019}]";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "|{\u001e\u001c(wn\u0017]:>h\u001f_/wl\u001fX";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "s{\nX%it\u0016S+z5\u0013S/lh\u0015Nj";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "!w\u001bL\u0019w`\u001f\u0001{.*V\rz.<\nLw";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "8q\u001fEw";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "8`\u0015S'#";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "vn\u000eL9$5UX/h4\fU8jo\u001bP/\u007fh\u000eTdp\u007f\u000e\u0013\u0018[I.\u0013</53Q+y\u007f\bEeS{\n\u0013\u0018q{\u001e\u0013";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "vn\u000eL9$5UQ+niT[%q}\u0016Y+ns\t\u0012)qwUQ+niU]:w5\tH+js\u0019Q+n%\u0019Y$j\u007f\b\u0001";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "s{\nX%it\u0016S+z5\u0013S/lh\u0015Nj";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "|{\u001e\u001c(wn\u0017]:>h\u001f_/wl\u001fX";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "%/N\u0007";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "yj\t";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "s{\nX%it\u0016S+z5\u001cU${5\u001fN8qhZ";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "p\u007f\u000eK%lq";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    s = "s{\nX%it\u0016S+z5\u0019S+li\u001f\u0013/lh\u0015Nj";
                    n = 14;
                    n2 = 15;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    array = z2;
                    s = "s{\nX%it\u0016S+z5\u0019S+li\u001fp%}{\u000eU%p:";
                    n = 15;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "s{\nX%it\u0016S+z5\u001c]#r\u007f\u001e\u00138{n\bE";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "ru\u0019]>wu\u0014";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    break Label_0507;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        lh.m = 15;
    }
    
    public lh(final Context context, final bi i) {
        this.g = lh.m;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.i = i;
        this.k = (MediaData)i.N;
        this.a = (LocationManager)context.getSystemService(lh.z[18]);
        if (i.p == 0.0) {
            return;
        }
        try {
            if (i.G != 0.0) {
                (this.h = new Location("")).setLatitude(i.p);
                this.h.setLongitude(i.G);
                this.f = true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public static Bitmap a(final double p0, final double p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore          5
        //     3: new             Lorg/apache/http/params/BasicHttpParams;
        //     6: dup            
        //     7: invokespecial   org/apache/http/params/BasicHttpParams.<init>:()V
        //    10: astore          6
        //    12: aload           6
        //    14: sipush          15000
        //    17: invokestatic    org/apache/http/params/HttpConnectionParams.setConnectionTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //    20: aload           6
        //    22: sipush          30000
        //    25: invokestatic    org/apache/http/params/HttpConnectionParams.setSoTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //    28: new             Lorg/apache/http/impl/client/DefaultHttpClient;
        //    31: dup            
        //    32: aload           6
        //    34: invokespecial   org/apache/http/impl/client/DefaultHttpClient.<init>:(Lorg/apache/http/params/HttpParams;)V
        //    37: astore          7
        //    39: aload           7
        //    41: new             Lorg/apache/http/client/methods/HttpGet;
        //    44: dup            
        //    45: new             Ljava/lang/StringBuilder;
        //    48: dup            
        //    49: invokespecial   java/lang/StringBuilder.<init>:()V
        //    52: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //    55: bipush          8
        //    57: aaload         
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: dload_0        
        //    62: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //    65: ldc             ","
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: dload_2        
        //    71: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //    74: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //    77: bipush          6
        //    79: aaload         
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: bipush          21
        //    85: iconst_1       
        //    86: iload           4
        //    88: invokestatic    java/lang/Math.max:(II)I
        //    91: invokestatic    java/lang/Math.min:(II)I
        //    94: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    97: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   100: iconst_1       
        //   101: aaload         
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: dload_0        
        //   106: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   109: ldc             ","
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: dload_2        
        //   115: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   118: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   121: invokespecial   org/apache/http/client/methods/HttpGet.<init>:(Ljava/lang/String;)V
        //   124: invokevirtual   org/apache/http/impl/client/DefaultHttpClient.execute:(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
        //   127: invokeinterface org/apache/http/HttpResponse.getEntity:()Lorg/apache/http/HttpEntity;
        //   132: invokeinterface org/apache/http/HttpEntity.getContent:()Ljava/io/InputStream;
        //   137: astore          35
        //   139: aload           35
        //   141: astore          13
        //   143: aload           13
        //   145: aconst_null    
        //   146: getstatic       com/whatsapp/util/br.a:Landroid/graphics/BitmapFactory$Options;
        //   149: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   152: astore          36
        //   154: aload           36
        //   156: ifnull          189
        //   159: aload           36
        //   161: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   164: istore          39
        //   166: iload           39
        //   168: sipush          170
        //   171: if_icmpne       189
        //   174: aload           36
        //   176: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   179: istore          40
        //   181: iload           40
        //   183: sipush          170
        //   186: if_icmpeq       527
        //   189: new             Ljava/io/IOException;
        //   192: dup            
        //   193: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   196: iconst_2       
        //   197: aaload         
        //   198: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   201: athrow         
        //   202: astore          8
        //   204: iconst_1       
        //   205: istore          9
        //   207: aload           36
        //   209: astore          10
        //   211: aload           13
        //   213: astore          11
        //   215: new             Ljava/lang/StringBuilder;
        //   218: dup            
        //   219: invokespecial   java/lang/StringBuilder.<init>:()V
        //   222: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   225: iconst_3       
        //   226: aaload         
        //   227: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   230: aload           8
        //   232: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   235: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   238: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   241: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   244: aload           10
        //   246: ifnull          259
        //   249: aload           10
        //   251: ifnull          259
        //   254: aload           10
        //   256: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   259: aload           11
        //   261: ifnull          269
        //   264: aload           11
        //   266: invokevirtual   java/io/InputStream.close:()V
        //   269: aconst_null    
        //   270: astore          17
        //   272: aload           11
        //   274: astore          18
        //   276: aload           17
        //   278: ifnonnull       514
        //   281: iload           9
        //   283: ifeq            514
        //   286: aload           7
        //   288: new             Lorg/apache/http/client/methods/HttpGet;
        //   291: dup            
        //   292: new             Ljava/lang/StringBuilder;
        //   295: dup            
        //   296: invokespecial   java/lang/StringBuilder.<init>:()V
        //   299: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   302: bipush          7
        //   304: aaload         
        //   305: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   308: dload_0        
        //   309: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   312: ldc             ","
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: dload_2        
        //   318: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   321: ldc             "/"
        //   323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   326: bipush          21
        //   328: iconst_1       
        //   329: iload           4
        //   331: invokestatic    java/lang/Math.max:(II)I
        //   334: invokestatic    java/lang/Math.min:(II)I
        //   337: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   340: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   343: iconst_4       
        //   344: aaload         
        //   345: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   348: dload_0        
        //   349: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   352: ldc             ","
        //   354: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   357: dload_2        
        //   358: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   361: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   364: bipush          11
        //   366: aaload         
        //   367: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   370: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   373: iconst_5       
        //   374: aaload         
        //   375: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   378: getstatic       com/whatsapp/a6c.s:Ljava/lang/String;
        //   381: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   384: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   387: invokespecial   org/apache/http/client/methods/HttpGet.<init>:(Ljava/lang/String;)V
        //   390: invokevirtual   org/apache/http/impl/client/DefaultHttpClient.execute:(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
        //   393: invokeinterface org/apache/http/HttpResponse.getEntity:()Lorg/apache/http/HttpEntity;
        //   398: invokeinterface org/apache/http/HttpEntity.getContent:()Ljava/io/InputStream;
        //   403: astore          18
        //   405: aload           18
        //   407: aconst_null    
        //   408: getstatic       com/whatsapp/util/br.a:Landroid/graphics/BitmapFactory$Options;
        //   411: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   414: astore          24
        //   416: aload           24
        //   418: astore          17
        //   420: aload           17
        //   422: ifnull          453
        //   425: aload           17
        //   427: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   430: istore          28
        //   432: iload           28
        //   434: bipush          100
        //   436: if_icmpne       453
        //   439: aload           17
        //   441: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   444: istore          29
        //   446: iload           29
        //   448: bipush          100
        //   450: if_icmpeq       704
        //   453: new             Ljava/io/IOException;
        //   456: dup            
        //   457: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   460: bipush          10
        //   462: aaload         
        //   463: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   466: athrow         
        //   467: astore          25
        //   469: aload           25
        //   471: athrow         
        //   472: astore          22
        //   474: new             Ljava/lang/StringBuilder;
        //   477: dup            
        //   478: invokespecial   java/lang/StringBuilder.<init>:()V
        //   481: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   484: bipush          9
        //   486: aaload         
        //   487: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   490: aload           22
        //   492: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   495: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   498: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   501: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   504: aload           18
        //   506: ifnull          514
        //   509: aload           18
        //   511: invokevirtual   java/io/InputStream.close:()V
        //   514: aload           17
        //   516: areturn        
        //   517: astore          37
        //   519: aload           37
        //   521: athrow         
        //   522: astore          38
        //   524: aload           38
        //   526: athrow         
        //   527: aload           36
        //   529: bipush          35
        //   531: bipush          35
        //   533: bipush          100
        //   535: bipush          100
        //   537: invokestatic    android/graphics/Bitmap.createBitmap:(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
        //   540: astore          41
        //   542: aload           36
        //   544: ifnull          559
        //   547: aload           36
        //   549: aload           41
        //   551: if_acmpeq       559
        //   554: aload           36
        //   556: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   559: aload           13
        //   561: ifnull          569
        //   564: aload           13
        //   566: invokevirtual   java/io/InputStream.close:()V
        //   569: aload           41
        //   571: astore          17
        //   573: aload           13
        //   575: astore          18
        //   577: iconst_0       
        //   578: istore          9
        //   580: goto            276
        //   583: astore          44
        //   585: aload           44
        //   587: athrow         
        //   588: astore          43
        //   590: aload           43
        //   592: athrow         
        //   593: astore          42
        //   595: aload           41
        //   597: astore          17
        //   599: aload           13
        //   601: astore          18
        //   603: iconst_0       
        //   604: istore          9
        //   606: goto            276
        //   609: astore          34
        //   611: aload           34
        //   613: athrow         
        //   614: astore          33
        //   616: aload           33
        //   618: athrow         
        //   619: astore          32
        //   621: aload           11
        //   623: astore          18
        //   625: aconst_null    
        //   626: astore          17
        //   628: goto            276
        //   631: astore          12
        //   633: aconst_null    
        //   634: astore          13
        //   636: aload           5
        //   638: ifnull          651
        //   641: aload           5
        //   643: ifnull          651
        //   646: aload           5
        //   648: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   651: aload           13
        //   653: ifnull          661
        //   656: aload           13
        //   658: invokevirtual   java/io/InputStream.close:()V
        //   661: aload           12
        //   663: athrow         
        //   664: astore          16
        //   666: aload           16
        //   668: athrow         
        //   669: astore          15
        //   671: aload           15
        //   673: athrow         
        //   674: astore          14
        //   676: goto            661
        //   679: astore          26
        //   681: aload           26
        //   683: athrow         
        //   684: astore          27
        //   686: aload           27
        //   688: athrow         
        //   689: astore          19
        //   691: aload           18
        //   693: ifnull          701
        //   696: aload           18
        //   698: invokevirtual   java/io/InputStream.close:()V
        //   701: aload           19
        //   703: athrow         
        //   704: aload           18
        //   706: ifnull          514
        //   709: aload           18
        //   711: invokevirtual   java/io/InputStream.close:()V
        //   714: aload           17
        //   716: areturn        
        //   717: astore          31
        //   719: aload           31
        //   721: athrow         
        //   722: astore          30
        //   724: aload           17
        //   726: areturn        
        //   727: astore          21
        //   729: aload           21
        //   731: athrow         
        //   732: astore          20
        //   734: goto            701
        //   737: astore          23
        //   739: aload           17
        //   741: areturn        
        //   742: astore          12
        //   744: aconst_null    
        //   745: astore          5
        //   747: goto            636
        //   750: astore          12
        //   752: aload           36
        //   754: astore          5
        //   756: goto            636
        //   759: astore          12
        //   761: aload           10
        //   763: astore          5
        //   765: aload           11
        //   767: astore          13
        //   769: goto            636
        //   772: astore          8
        //   774: iconst_0       
        //   775: istore          9
        //   777: aconst_null    
        //   778: astore          10
        //   780: aconst_null    
        //   781: astore          11
        //   783: goto            215
        //   786: astore          8
        //   788: aload           13
        //   790: astore          11
        //   792: iconst_0       
        //   793: istore          9
        //   795: aconst_null    
        //   796: astore          10
        //   798: goto            215
        //   801: astore          8
        //   803: aload           36
        //   805: astore          10
        //   807: aload           13
        //   809: astore          11
        //   811: iconst_0       
        //   812: istore          9
        //   814: goto            215
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  39     139    772    786    Ljava/io/IOException;
        //  39     139    631    636    Any
        //  143    154    786    801    Ljava/io/IOException;
        //  143    154    742    750    Any
        //  159    166    517    522    Ljava/io/IOException;
        //  159    166    750    759    Any
        //  174    181    522    527    Ljava/io/IOException;
        //  174    181    750    759    Any
        //  189    202    202    215    Ljava/io/IOException;
        //  189    202    750    759    Any
        //  215    244    759    772    Any
        //  254    259    609    614    Ljava/io/IOException;
        //  264    269    614    619    Ljava/lang/IllegalArgumentException;
        //  264    269    619    631    Ljava/io/IOException;
        //  286    416    472    514    Ljava/io/IOException;
        //  286    416    689    737    Any
        //  425    432    679    684    Ljava/io/IOException;
        //  425    432    689    737    Any
        //  439    446    684    689    Ljava/io/IOException;
        //  439    446    689    737    Any
        //  453    467    467    472    Ljava/io/IOException;
        //  453    467    689    737    Any
        //  469    472    472    514    Ljava/io/IOException;
        //  469    472    689    737    Any
        //  474    504    689    737    Any
        //  509    514    737    742    Ljava/io/IOException;
        //  519    522    522    527    Ljava/io/IOException;
        //  519    522    750    759    Any
        //  524    527    801    817    Ljava/io/IOException;
        //  524    527    750    759    Any
        //  527    542    801    817    Ljava/io/IOException;
        //  527    542    750    759    Any
        //  554    559    583    588    Ljava/io/IOException;
        //  564    569    588    593    Ljava/lang/IllegalArgumentException;
        //  564    569    593    609    Ljava/io/IOException;
        //  590    593    593    609    Ljava/io/IOException;
        //  616    619    619    631    Ljava/io/IOException;
        //  646    651    664    669    Ljava/io/IOException;
        //  656    661    669    674    Ljava/lang/IllegalArgumentException;
        //  656    661    674    679    Ljava/io/IOException;
        //  671    674    674    679    Ljava/io/IOException;
        //  681    684    684    689    Ljava/io/IOException;
        //  681    684    689    737    Any
        //  686    689    467    472    Ljava/io/IOException;
        //  686    689    689    737    Any
        //  696    701    727    732    Ljava/lang/IllegalArgumentException;
        //  696    701    732    737    Ljava/io/IOException;
        //  709    714    717    722    Ljava/lang/IllegalArgumentException;
        //  709    714    722    727    Ljava/io/IOException;
        //  719    722    722    727    Ljava/io/IOException;
        //  729    732    732    737    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public static byte[] a(final double n, final double n2) {
        return b(n, n2, lh.m);
    }
    
    public static byte[] b(final double n, final double n2, final int n3) {
        final Bitmap a = a(n, n2, n3);
        byte[] byteArray = null;
        if (a == null) {
            return byteArray;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a.compress(Bitmap$CompressFormat.JPEG, 80, (OutputStream)byteArrayOutputStream);
        byteArray = byteArrayOutputStream.toByteArray();
        while (true) {
            try {
                byteArrayOutputStream.close();
                a.recycle();
                return byteArray;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public Boolean a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/lh.h:Landroid/location/Location;
        //     8: astore          4
        //    10: iconst_0       
        //    11: istore          5
        //    13: aload           4
        //    15: ifnonnull       173
        //    18: aload_0        
        //    19: getfield        com/whatsapp/lh.f:Z
        //    22: istore          6
        //    24: iload           6
        //    26: ifne            49
        //    29: iload           5
        //    31: bipush          40
        //    33: if_icmpge       49
        //    36: ldc2_w          250
        //    39: invokestatic    java/lang/Thread.sleep:(J)V
        //    42: iinc            5, 1
        //    45: iload_2        
        //    46: ifeq            18
        //    49: aload_0        
        //    50: getfield        com/whatsapp/lh.f:Z
        //    53: istore          11
        //    55: iload           11
        //    57: ifeq            72
        //    60: aload_0        
        //    61: aload_0        
        //    62: getfield        com/whatsapp/lh.d:Landroid/location/Location;
        //    65: putfield        com/whatsapp/lh.h:Landroid/location/Location;
        //    68: iload_2        
        //    69: ifeq            173
        //    72: aload_0        
        //    73: getfield        com/whatsapp/lh.e:Landroid/location/Location;
        //    76: astore          12
        //    78: aload           12
        //    80: ifnull          127
        //    83: new             Ljava/lang/StringBuilder;
        //    86: dup            
        //    87: invokespecial   java/lang/StringBuilder.<init>:()V
        //    90: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //    93: bipush          16
        //    95: aaload         
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    99: aload_0        
        //   100: getfield        com/whatsapp/lh.e:Landroid/location/Location;
        //   103: invokevirtual   android/location/Location.toString:()Ljava/lang/String;
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   112: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   115: aload_0        
        //   116: aload_0        
        //   117: getfield        com/whatsapp/lh.e:Landroid/location/Location;
        //   120: putfield        com/whatsapp/lh.h:Landroid/location/Location;
        //   123: iload_2        
        //   124: ifeq            173
        //   127: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   130: bipush          17
        //   132: aaload         
        //   133: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   136: iconst_0       
        //   137: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   140: astore          13
        //   142: aload           13
        //   144: areturn        
        //   145: astore_3       
        //   146: aload_3        
        //   147: athrow         
        //   148: astore          15
        //   150: aload           15
        //   152: athrow         
        //   153: astore          7
        //   155: aload           7
        //   157: athrow         
        //   158: astore          8
        //   160: aload           8
        //   162: athrow         
        //   163: astore          9
        //   165: aload           9
        //   167: athrow         
        //   168: astore          10
        //   170: aload           10
        //   172: athrow         
        //   173: aload_0        
        //   174: aload_0        
        //   175: getfield        com/whatsapp/lh.h:Landroid/location/Location;
        //   178: invokevirtual   android/location/Location.getLatitude:()D
        //   181: aload_0        
        //   182: getfield        com/whatsapp/lh.h:Landroid/location/Location;
        //   185: invokevirtual   android/location/Location.getLongitude:()D
        //   188: aload_0        
        //   189: getfield        com/whatsapp/lh.g:I
        //   192: invokestatic    com/whatsapp/lh.b:(DDI)[B
        //   195: putfield        com/whatsapp/lh.b:[B
        //   198: iconst_1       
        //   199: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   202: areturn        
        //   203: astore          14
        //   205: goto            42
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      10     145    148    Ljava/lang/InterruptedException;
        //  18     24     145    148    Ljava/lang/InterruptedException;
        //  36     42     203    208    Ljava/lang/InterruptedException;
        //  36     42     148    153    Ljava/lang/IllegalArgumentException;
        //  49     55     153    158    Ljava/lang/InterruptedException;
        //  60     68     158    163    Ljava/lang/InterruptedException;
        //  72     78     163    168    Ljava/lang/InterruptedException;
        //  83     123    168    173    Ljava/lang/InterruptedException;
        //  127    142    168    173    Ljava/lang/InterruptedException;
        //  155    158    158    163    Ljava/lang/InterruptedException;
        //  160    163    163    168    Ljava/lang/InterruptedException;
        //  165    168    168    173    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 100, Size: 100
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
    
    void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/whatsapp/lh.l:Landroid/location/LocationListener;
        //     4: ifnonnull       19
        //     7: aload_0        
        //     8: new             Lcom/whatsapp/_q;
        //    11: dup            
        //    12: aload_0        
        //    13: invokespecial   com/whatsapp/_q.<init>:(Lcom/whatsapp/lh;)V
        //    16: putfield        com/whatsapp/lh.l:Landroid/location/LocationListener;
        //    19: aload_0        
        //    20: getfield        com/whatsapp/lh.j:Landroid/location/LocationListener;
        //    23: ifnonnull       38
        //    26: aload_0        
        //    27: new             Lcom/whatsapp/rl;
        //    30: dup            
        //    31: aload_0        
        //    32: invokespecial   com/whatsapp/rl.<init>:(Lcom/whatsapp/lh;)V
        //    35: putfield        com/whatsapp/lh.j:Landroid/location/LocationListener;
        //    38: aload_0        
        //    39: getfield        com/whatsapp/lh.a:Landroid/location/LocationManager;
        //    42: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //    45: bipush          12
        //    47: aaload         
        //    48: ldc2_w          1000
        //    51: fconst_1       
        //    52: aload_0        
        //    53: getfield        com/whatsapp/lh.l:Landroid/location/LocationListener;
        //    56: invokevirtual   android/location/LocationManager.requestLocationUpdates:(Ljava/lang/String;JFLandroid/location/LocationListener;)V
        //    59: aload_0        
        //    60: getfield        com/whatsapp/lh.a:Landroid/location/LocationManager;
        //    63: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //    66: bipush          14
        //    68: aaload         
        //    69: ldc2_w          1000
        //    72: fconst_1       
        //    73: aload_0        
        //    74: getfield        com/whatsapp/lh.j:Landroid/location/LocationListener;
        //    77: invokevirtual   android/location/LocationManager.requestLocationUpdates:(Ljava/lang/String;JFLandroid/location/LocationListener;)V
        //    80: return         
        //    81: astore_1       
        //    82: aload_1        
        //    83: athrow         
        //    84: astore_2       
        //    85: aload_2        
        //    86: athrow         
        //    87: astore_3       
        //    88: new             Ljava/lang/StringBuilder;
        //    91: dup            
        //    92: invokespecial   java/lang/StringBuilder.<init>:()V
        //    95: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //    98: bipush          13
        //   100: aaload         
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: aload_3        
        //   105: invokevirtual   java/lang/IllegalArgumentException.toString:()Ljava/lang/String;
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   114: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   117: aload_0        
        //   118: aconst_null    
        //   119: putfield        com/whatsapp/lh.l:Landroid/location/LocationListener;
        //   122: goto            59
        //   125: astore          4
        //   127: new             Ljava/lang/StringBuilder;
        //   130: dup            
        //   131: invokespecial   java/lang/StringBuilder.<init>:()V
        //   134: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   137: bipush          15
        //   139: aaload         
        //   140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   143: aload           4
        //   145: invokevirtual   java/lang/IllegalArgumentException.toString:()Ljava/lang/String;
        //   148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   154: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   157: aload_0        
        //   158: aconst_null    
        //   159: putfield        com/whatsapp/lh.j:Landroid/location/LocationListener;
        //   162: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      19     81     84     Ljava/lang/IllegalArgumentException;
        //  19     38     84     87     Ljava/lang/IllegalArgumentException;
        //  38     59     87     125    Ljava/lang/IllegalArgumentException;
        //  59     80     125    163    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 79, Size: 79
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
    
    public void a(final Boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/lh.k:Lcom/whatsapp/MediaData;
        //     8: iconst_0       
        //     9: putfield        com/whatsapp/MediaData.transferring:Z
        //    12: aload_1        
        //    13: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    16: ifeq            113
        //    19: aload_0        
        //    20: getfield        com/whatsapp/lh.k:Lcom/whatsapp/MediaData;
        //    23: iconst_1       
        //    24: putfield        com/whatsapp/MediaData.transferred:Z
        //    27: aload_0        
        //    28: getfield        com/whatsapp/lh.i:Lcom/whatsapp/protocol/bi;
        //    31: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    34: checkcast       Lcom/whatsapp/MediaData;
        //    37: astore          12
        //    39: aload_0        
        //    40: getfield        com/whatsapp/lh.i:Lcom/whatsapp/protocol/bi;
        //    43: iconst_1       
        //    44: putfield        com/whatsapp/protocol/bi.n:I
        //    47: aload_0        
        //    48: getfield        com/whatsapp/lh.i:Lcom/whatsapp/protocol/bi;
        //    51: aload_0        
        //    52: getfield        com/whatsapp/lh.b:[B
        //    55: invokevirtual   com/whatsapp/protocol/bi.a:([B)V
        //    58: aload_0        
        //    59: getfield        com/whatsapp/lh.i:Lcom/whatsapp/protocol/bi;
        //    62: aload           12
        //    64: putfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    67: aload_0        
        //    68: getfield        com/whatsapp/lh.h:Landroid/location/Location;
        //    71: ifnull          102
        //    74: aload_0        
        //    75: getfield        com/whatsapp/lh.i:Lcom/whatsapp/protocol/bi;
        //    78: aload_0        
        //    79: getfield        com/whatsapp/lh.h:Landroid/location/Location;
        //    82: invokevirtual   android/location/Location.getLatitude:()D
        //    85: putfield        com/whatsapp/protocol/bi.p:D
        //    88: aload_0        
        //    89: getfield        com/whatsapp/lh.i:Lcom/whatsapp/protocol/bi;
        //    92: aload_0        
        //    93: getfield        com/whatsapp/lh.h:Landroid/location/Location;
        //    96: invokevirtual   android/location/Location.getLongitude:()D
        //    99: putfield        com/whatsapp/protocol/bi.G:D
        //   102: aload_0        
        //   103: getfield        com/whatsapp/lh.i:Lcom/whatsapp/protocol/bi;
        //   106: invokestatic    com/whatsapp/App.p:(Lcom/whatsapp/protocol/bi;)V
        //   109: iload_2        
        //   110: ifeq            219
        //   113: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   116: aload_0        
        //   117: getfield        com/whatsapp/lh.i:Lcom/whatsapp/protocol/bi;
        //   120: iconst_0       
        //   121: iconst_m1      
        //   122: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;ZI)V
        //   125: aload_0        
        //   126: getfield        com/whatsapp/lh.a:Landroid/location/LocationManager;
        //   129: getstatic       com/whatsapp/lh.z:[Ljava/lang/String;
        //   132: iconst_0       
        //   133: aaload         
        //   134: invokevirtual   android/location/LocationManager.isProviderEnabled:(Ljava/lang/String;)Z
        //   137: istore          4
        //   139: iload           4
        //   141: ifne            219
        //   144: invokestatic    com/whatsapp/Conversation.p:()Lcom/whatsapp/v1;
        //   147: astore          5
        //   149: aload           5
        //   151: invokevirtual   com/whatsapp/v1.a:()Z
        //   154: istore          9
        //   156: iload           9
        //   158: ifeq            202
        //   161: aload           5
        //   163: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //   166: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   169: aload_0        
        //   170: getfield        com/whatsapp/lh.i:Lcom/whatsapp/protocol/bi;
        //   173: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   176: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   179: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   182: istore          11
        //   184: iload           11
        //   186: ifeq            202
        //   189: aload           5
        //   191: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //   194: iconst_2       
        //   195: invokevirtual   com/whatsapp/Conversation.showDialog:(I)V
        //   198: iload_2        
        //   199: ifeq            219
        //   202: getstatic       com/whatsapp/Conversation.ao:Ljava/util/ArrayList;
        //   205: aload_0        
        //   206: getfield        com/whatsapp/lh.i:Lcom/whatsapp/protocol/bi;
        //   209: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   212: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   215: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   218: pop            
        //   219: aload_0        
        //   220: invokevirtual   com/whatsapp/lh.b:()V
        //   223: return         
        //   224: astore          13
        //   226: aload           13
        //   228: athrow         
        //   229: astore_3       
        //   230: aload_3        
        //   231: athrow         
        //   232: astore          6
        //   234: aload           6
        //   236: athrow         
        //   237: astore          7
        //   239: aload           7
        //   241: athrow         
        //   242: astore          8
        //   244: aload           8
        //   246: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  39     102    224    229    Ljava/lang/IllegalArgumentException;
        //  102    109    229    232    Ljava/lang/IllegalArgumentException;
        //  113    139    229    232    Ljava/lang/IllegalArgumentException;
        //  149    156    232    237    Ljava/lang/IllegalArgumentException;
        //  161    184    237    242    Ljava/lang/IllegalArgumentException;
        //  189    198    242    247    Ljava/lang/IllegalArgumentException;
        //  202    219    242    247    Ljava/lang/IllegalArgumentException;
        //  234    237    237    242    Ljava/lang/IllegalArgumentException;
        //  239    242    242    247    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 115, Size: 115
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
    
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/lh.a:Landroid/location/LocationManager;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          55
        //     9: aload_0        
        //    10: getfield        com/whatsapp/lh.l:Landroid/location/LocationListener;
        //    13: ifnull          32
        //    16: aload_0        
        //    17: getfield        com/whatsapp/lh.a:Landroid/location/LocationManager;
        //    20: aload_0        
        //    21: getfield        com/whatsapp/lh.l:Landroid/location/LocationListener;
        //    24: invokevirtual   android/location/LocationManager.removeUpdates:(Landroid/location/LocationListener;)V
        //    27: aload_0        
        //    28: aconst_null    
        //    29: putfield        com/whatsapp/lh.l:Landroid/location/LocationListener;
        //    32: aload_0        
        //    33: getfield        com/whatsapp/lh.j:Landroid/location/LocationListener;
        //    36: ifnull          55
        //    39: aload_0        
        //    40: getfield        com/whatsapp/lh.a:Landroid/location/LocationManager;
        //    43: aload_0        
        //    44: getfield        com/whatsapp/lh.j:Landroid/location/LocationListener;
        //    47: invokevirtual   android/location/LocationManager.removeUpdates:(Landroid/location/LocationListener;)V
        //    50: aload_0        
        //    51: aconst_null    
        //    52: putfield        com/whatsapp/lh.j:Landroid/location/LocationListener;
        //    55: return         
        //    56: astore_1       
        //    57: aload_1        
        //    58: athrow         
        //    59: astore_2       
        //    60: aload_2        
        //    61: athrow         
        //    62: astore          4
        //    64: aload           4
        //    66: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      56     59     Ljava/lang/IllegalArgumentException;
        //  9      32     59     62     Ljava/lang/IllegalArgumentException;
        //  32     55     62     67     Ljava/lang/IllegalArgumentException;
        //  57     59     59     62     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 37, Size: 37
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
    
    public Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    public void onPostExecute(final Object o) {
        this.a((Boolean)o);
    }
    
    public void onPreExecute() {
        this.a();
        this.k.transferring = true;
        App.ak.a(this.i, false, -1);
    }
}
