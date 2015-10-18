// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import java.io.FileDescriptor;
import android.widget.ImageView;
import com.whatsapp.al5;
import android.graphics.Bitmap;
import android.annotation.TargetApi;
import android.os.StatFs;
import android.os.Build$VERSION;
import java.util.HashMap;
import java.io.File;
import android.graphics.drawable.Drawable;

public class b7
{
    private static final String[] z;
    private n a;
    private final Drawable b;
    private j[] c;
    private final Object d;
    private final File e;
    private final Drawable f;
    private final bc g;
    private final long h;
    private final HashMap i;
    private final int j;
    private final int k;
    
    static {
        final String[] z2 = new String[9];
        String s = "'8\u0001\f.<,\b\u000b0|)\t\r-7(L\f#7m\u0005\u0003#4(";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'B';
                        break;
                    }
                    case 0: {
                        c2 = 'S';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = 'l';
                        break;
                    }
                    case 3: {
                        c2 = 'n';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "'8\u0001\f.<,\b\u000b0|$\u0002\u00076\u0017$\u001f\u0005\u00012.\u0004\u000bb";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "'8\u0001\f.<,\b\u000b0|)\t\r-7(L\b#:!\t\n";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "'8\u0001\f.<,\b\u000b0|*\t\u001a\u0000:9\u0001\u000f2\u0015?\u0003\u0003\u0006:>\u0007-#0%\tNos";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "'8\u0001\f.<,\b\u000b0|m\t\u001c0<?L\n-$#\u0000\u0001#7$\u0002\tb";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "'8\u0001\f.<,\b\u000b0|)\u0003\u0019,?\"\r\nb";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "'8\u0001\f.<,\b\u000b0|m\b\u000b!<)\tN$2$\u0000\u000b&s";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "'8\u0001\f.<,\b\u000b0|)\u0003\u0019,?\"\r\nb";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "'8\u0001\f.<,\b\u000b0|.\u0000\u000116m";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private b7(final aw aw) {
        final boolean l = Log.l;
        this.i = new u(60);
        this.d = new Object();
        this.g = new bc(null);
        this.b = aw.e(aw);
        this.f = aw.b(aw);
        this.k = aw.a(aw);
        this.j = aw.d(aw);
        this.e = aw.c(aw);
        this.h = aw.f(aw);
        this.c = new j[this.j];
        int i = 0;
        while (i < this.j) {
            (this.c[i] = new j(this, null)).setPriority(4);
            ++i;
            if (l) {
                break;
            }
        }
    }
    
    b7(final aw aw, final c_ c_) {
        this(aw);
    }
    
    @TargetApi(9)
    public static long a(final File file) {
        if (Build$VERSION.SDK_INT >= 9) {
            return file.getUsableSpace();
        }
        final StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }
    
    static Bitmap a(final b7 b7, final bn bn) {
        return b7.a(bn);
    }
    
    private Bitmap a(final bn p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: getfield        com/whatsapp/util/bn.b:Ljava/lang/String;
        //     8: invokestatic    com/whatsapp/util/b7.a:(Ljava/lang/String;)Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_0        
        //    13: invokespecial   com/whatsapp/util/b7.a:()V
        //    16: aload_0        
        //    17: aload_3        
        //    18: invokevirtual   com/whatsapp/util/b7.b:(Ljava/lang/String;)Landroid/graphics/Bitmap;
        //    21: astore          4
        //    23: aload           4
        //    25: ifnull          31
        //    28: aload           4
        //    30: areturn        
        //    31: new             Ljava/lang/StringBuilder;
        //    34: dup            
        //    35: invokespecial   java/lang/StringBuilder.<init>:()V
        //    38: getstatic       com/whatsapp/util/b7.z:[Ljava/lang/String;
        //    41: iconst_5       
        //    42: aaload         
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: aload_1        
        //    47: getfield        com/whatsapp/util/bn.b:Ljava/lang/String;
        //    50: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    53: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    56: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    59: new             Lorg/apache/http/client/methods/HttpGet;
        //    62: dup            
        //    63: aload_1        
        //    64: getfield        com/whatsapp/util/bn.b:Ljava/lang/String;
        //    67: invokespecial   org/apache/http/client/methods/HttpGet.<init>:(Ljava/lang/String;)V
        //    70: astore          6
        //    72: new             Lorg/apache/http/params/BasicHttpParams;
        //    75: dup            
        //    76: invokespecial   org/apache/http/params/BasicHttpParams.<init>:()V
        //    79: astore          7
        //    81: aload           7
        //    83: sipush          15000
        //    86: invokestatic    org/apache/http/params/HttpConnectionParams.setConnectionTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //    89: aload           7
        //    91: sipush          30000
        //    94: invokestatic    org/apache/http/params/HttpConnectionParams.setSoTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //    97: new             Lorg/apache/http/impl/client/DefaultHttpClient;
        //   100: dup            
        //   101: aload           7
        //   103: invokespecial   org/apache/http/impl/client/DefaultHttpClient.<init>:(Lorg/apache/http/params/HttpParams;)V
        //   106: aload           6
        //   108: invokevirtual   org/apache/http/impl/client/DefaultHttpClient.execute:(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
        //   111: invokeinterface org/apache/http/HttpResponse.getEntity:()Lorg/apache/http/HttpEntity;
        //   116: astore          8
        //   118: aload           8
        //   120: ifnull          271
        //   123: aload           8
        //   125: invokeinterface org/apache/http/HttpEntity.getContent:()Ljava/io/InputStream;
        //   130: astore          9
        //   132: aload_0        
        //   133: getfield        com/whatsapp/util/b7.d:Ljava/lang/Object;
        //   136: astore          10
        //   138: aload           10
        //   140: monitorenter   
        //   141: aload_0        
        //   142: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //   145: astore          12
        //   147: aload           12
        //   149: ifnull          268
        //   152: aload           9
        //   154: ifnull          268
        //   157: aload_0        
        //   158: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //   161: aload_3        
        //   162: invokevirtual   com/whatsapp/util/n.c:(Ljava/lang/String;)Lcom/whatsapp/util/d;
        //   165: astore          23
        //   167: aload           23
        //   169: ifnonnull       374
        //   172: aload_0        
        //   173: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //   176: aload_3        
        //   177: invokevirtual   com/whatsapp/util/n.b:(Ljava/lang/String;)Lcom/whatsapp/util/bj;
        //   180: astore          24
        //   182: aload           24
        //   184: ifnull          383
        //   187: aload           24
        //   189: iconst_0       
        //   190: invokevirtual   com/whatsapp/util/bj.a:(I)Ljava/io/OutputStream;
        //   193: astore          25
        //   195: aload           25
        //   197: astore          26
        //   199: sipush          1024
        //   202: newarray        B
        //   204: astore          29
        //   206: aload           9
        //   208: aload           29
        //   210: iconst_0       
        //   211: sipush          1024
        //   214: invokevirtual   java/io/InputStream.read:([BII)I
        //   217: istore          30
        //   219: iload           30
        //   221: iconst_m1      
        //   222: if_icmpne       229
        //   225: iload_2        
        //   226: ifeq            243
        //   229: aload           26
        //   231: aload           29
        //   233: iconst_0       
        //   234: iload           30
        //   236: invokevirtual   java/io/OutputStream.write:([BII)V
        //   239: iload_2        
        //   240: ifeq            206
        //   243: aload           24
        //   245: invokevirtual   com/whatsapp/util/bj.a:()V
        //   248: aload           26
        //   250: ifnull          258
        //   253: aload           26
        //   255: invokevirtual   java/io/OutputStream.close:()V
        //   258: aload           9
        //   260: ifnull          268
        //   263: aload           9
        //   265: invokevirtual   java/io/InputStream.close:()V
        //   268: aload           10
        //   270: monitorexit    
        //   271: aload_0        
        //   272: aload_3        
        //   273: invokevirtual   com/whatsapp/util/b7.b:(Ljava/lang/String;)Landroid/graphics/Bitmap;
        //   276: astore          13
        //   278: aload           13
        //   280: ifnonnull       312
        //   283: new             Ljava/lang/StringBuilder;
        //   286: dup            
        //   287: invokespecial   java/lang/StringBuilder.<init>:()V
        //   290: getstatic       com/whatsapp/util/b7.z:[Ljava/lang/String;
        //   293: bipush          6
        //   295: aaload         
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   299: aload_1        
        //   300: getfield        com/whatsapp/util/bn.b:Ljava/lang/String;
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   309: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   312: aload           13
        //   314: areturn        
        //   315: astore          31
        //   317: aload           31
        //   319: athrow         
        //   320: astore          28
        //   322: aload           26
        //   324: astore          16
        //   326: aload           28
        //   328: astore          15
        //   330: getstatic       com/whatsapp/util/b7.z:[Ljava/lang/String;
        //   333: bipush          7
        //   335: aaload         
        //   336: aload           15
        //   338: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   341: aload           16
        //   343: ifnull          351
        //   346: aload           16
        //   348: invokevirtual   java/io/OutputStream.close:()V
        //   351: aload           9
        //   353: ifnull          268
        //   356: aload           9
        //   358: invokevirtual   java/io/InputStream.close:()V
        //   361: goto            268
        //   364: astore          21
        //   366: aload           21
        //   368: athrow         
        //   369: astore          22
        //   371: goto            268
        //   374: aload           23
        //   376: iconst_0       
        //   377: invokevirtual   com/whatsapp/util/d.a:(I)Ljava/io/InputStream;
        //   380: invokevirtual   java/io/InputStream.close:()V
        //   383: aconst_null    
        //   384: astore          26
        //   386: goto            248
        //   389: astore          34
        //   391: aload           34
        //   393: athrow         
        //   394: astore          32
        //   396: aload           32
        //   398: athrow         
        //   399: astore          11
        //   401: aload           10
        //   403: monitorexit    
        //   404: aload           11
        //   406: athrow         
        //   407: astore          5
        //   409: new             Ljava/lang/StringBuilder;
        //   412: dup            
        //   413: invokespecial   java/lang/StringBuilder.<init>:()V
        //   416: getstatic       com/whatsapp/util/b7.z:[Ljava/lang/String;
        //   419: iconst_4       
        //   420: aaload         
        //   421: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   424: aload_1        
        //   425: getfield        com/whatsapp/util/bn.b:Ljava/lang/String;
        //   428: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   431: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   434: aload           5
        //   436: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   439: aconst_null    
        //   440: areturn        
        //   441: astore          17
        //   443: aconst_null    
        //   444: astore          16
        //   446: aload           16
        //   448: ifnull          456
        //   451: aload           16
        //   453: invokevirtual   java/io/OutputStream.close:()V
        //   456: aload           9
        //   458: ifnull          466
        //   461: aload           9
        //   463: invokevirtual   java/io/InputStream.close:()V
        //   466: aload           17
        //   468: athrow         
        //   469: astore          20
        //   471: aload           20
        //   473: athrow         
        //   474: astore          18
        //   476: aload           18
        //   478: athrow         
        //   479: astore          14
        //   481: aload           14
        //   483: athrow         
        //   484: astore          27
        //   486: aload           26
        //   488: astore          16
        //   490: aload           27
        //   492: astore          17
        //   494: goto            446
        //   497: astore          17
        //   499: goto            446
        //   502: astore          15
        //   504: aconst_null    
        //   505: astore          16
        //   507: goto            330
        //   510: astore          33
        //   512: goto            268
        //   515: astore          19
        //   517: goto            466
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  31     118    407    441    Ljava/lang/Exception;
        //  123    141    407    441    Ljava/lang/Exception;
        //  141    147    399    407    Any
        //  157    167    502    510    Ljava/lang/Exception;
        //  157    167    441    446    Any
        //  172    182    502    510    Ljava/lang/Exception;
        //  172    182    441    446    Any
        //  187    195    502    510    Ljava/lang/Exception;
        //  187    195    441    446    Any
        //  199    206    320    330    Ljava/lang/Exception;
        //  199    206    484    497    Any
        //  206    219    320    330    Ljava/lang/Exception;
        //  206    219    484    497    Any
        //  229    239    315    320    Ljava/io/IOException;
        //  229    239    320    330    Ljava/lang/Exception;
        //  229    239    484    497    Any
        //  243    248    320    330    Ljava/lang/Exception;
        //  243    248    484    497    Any
        //  253    258    389    394    Ljava/io/IOException;
        //  253    258    399    407    Any
        //  263    268    394    399    Ljava/io/IOException;
        //  263    268    399    407    Any
        //  268    271    399    407    Any
        //  271    278    407    441    Ljava/lang/Exception;
        //  283    312    479    484    Ljava/io/IOException;
        //  283    312    407    441    Ljava/lang/Exception;
        //  317    320    320    330    Ljava/lang/Exception;
        //  317    320    484    497    Any
        //  330    341    497    502    Any
        //  346    351    369    374    Ljava/io/IOException;
        //  346    351    399    407    Any
        //  356    361    364    369    Ljava/io/IOException;
        //  356    361    399    407    Any
        //  366    369    369    374    Ljava/io/IOException;
        //  366    369    399    407    Any
        //  374    383    502    510    Ljava/lang/Exception;
        //  374    383    441    446    Any
        //  391    394    510    515    Ljava/io/IOException;
        //  391    394    399    407    Any
        //  396    399    510    515    Ljava/io/IOException;
        //  396    399    399    407    Any
        //  401    404    399    407    Any
        //  404    407    407    441    Ljava/lang/Exception;
        //  451    456    469    474    Ljava/io/IOException;
        //  451    456    399    407    Any
        //  461    466    474    479    Ljava/io/IOException;
        //  461    466    399    407    Any
        //  466    469    399    407    Any
        //  471    474    515    520    Ljava/io/IOException;
        //  471    474    399    407    Any
        //  476    479    515    520    Ljava/io/IOException;
        //  476    479    399    407    Any
        //  481    484    407    441    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 241, Size: 241
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
    
    static bc a(final b7 b7) {
        return b7.g;
    }
    
    public static String a(final String s) {
        return al5.d(s);
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/util/b7.d:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //    11: astore_3       
        //    12: aload_3        
        //    13: ifnull          26
        //    16: aload_0        
        //    17: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //    20: invokevirtual   com/whatsapp/util/n.h:()Z
        //    23: ifeq            88
        //    26: aload_0        
        //    27: getfield        com/whatsapp/util/b7.e:Ljava/io/File;
        //    30: invokevirtual   java/io/File.exists:()Z
        //    33: istore          6
        //    35: iload           6
        //    37: ifne            48
        //    40: aload_0        
        //    41: getfield        com/whatsapp/util/b7.e:Ljava/io/File;
        //    44: invokevirtual   java/io/File.mkdirs:()Z
        //    47: pop            
        //    48: aload_0        
        //    49: getfield        com/whatsapp/util/b7.e:Ljava/io/File;
        //    52: invokestatic    com/whatsapp/util/b7.a:(Ljava/io/File;)J
        //    55: lstore          7
        //    57: aload_0        
        //    58: getfield        com/whatsapp/util/b7.h:J
        //    61: lstore          9
        //    63: lload           7
        //    65: lload           9
        //    67: lcmp           
        //    68: ifle            88
        //    71: aload_0        
        //    72: aload_0        
        //    73: getfield        com/whatsapp/util/b7.e:Ljava/io/File;
        //    76: iconst_1       
        //    77: iconst_1       
        //    78: aload_0        
        //    79: getfield        com/whatsapp/util/b7.h:J
        //    82: invokestatic    com/whatsapp/util/n.a:(Ljava/io/File;IIJ)Lcom/whatsapp/util/n;
        //    85: putfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //    88: aload_0        
        //    89: getfield        com/whatsapp/util/b7.d:Ljava/lang/Object;
        //    92: invokevirtual   java/lang/Object.notifyAll:()V
        //    95: aload_1        
        //    96: monitorexit    
        //    97: return         
        //    98: astore          4
        //   100: aload           4
        //   102: athrow         
        //   103: astore          5
        //   105: aload           5
        //   107: athrow         
        //   108: astore_2       
        //   109: aload_1        
        //   110: monitorexit    
        //   111: aload_2        
        //   112: athrow         
        //   113: astore          11
        //   115: new             Ljava/lang/StringBuilder;
        //   118: dup            
        //   119: invokespecial   java/lang/StringBuilder.<init>:()V
        //   122: getstatic       com/whatsapp/util/b7.z:[Ljava/lang/String;
        //   125: iconst_1       
        //   126: aaload         
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: aload           11
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   135: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   138: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   141: goto            88
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      12     108    113    Any
        //  16     26     98     103    Ljava/io/IOException;
        //  16     26     108    113    Any
        //  26     35     98     103    Ljava/io/IOException;
        //  26     35     108    113    Any
        //  40     48     103    108    Ljava/io/IOException;
        //  40     48     108    113    Any
        //  48     63     108    113    Any
        //  71     88     113    144    Ljava/io/IOException;
        //  71     88     108    113    Any
        //  88     97     108    113    Any
        //  100    103    103    108    Ljava/io/IOException;
        //  100    103    108    113    Any
        //  105    108    108    113    Any
        //  109    111    108    113    Any
        //  115    141    108    113    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
    
    private void a(final String p0, final ImageView p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/util/b7.g:Lcom/whatsapp/util/bc;
        //     4: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //     7: astore_3       
        //     8: aload_3        
        //     9: monitorenter   
        //    10: aload_0        
        //    11: getfield        com/whatsapp/util/b7.g:Lcom/whatsapp/util/bc;
        //    14: aload_2        
        //    15: invokevirtual   com/whatsapp/util/bc.a:(Landroid/widget/ImageView;)V
        //    18: aload_3        
        //    19: monitorexit    
        //    20: new             Lcom/whatsapp/util/bn;
        //    23: dup            
        //    24: aload_0        
        //    25: aload_1        
        //    26: aload_2        
        //    27: invokespecial   com/whatsapp/util/bn.<init>:(Lcom/whatsapp/util/b7;Ljava/lang/String;Landroid/widget/ImageView;)V
        //    30: astore          5
        //    32: aload_0        
        //    33: getfield        com/whatsapp/util/b7.g:Lcom/whatsapp/util/bc;
        //    36: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //    39: astore          6
        //    41: aload           6
        //    43: monitorenter   
        //    44: aload_0        
        //    45: getfield        com/whatsapp/util/b7.g:Lcom/whatsapp/util/bc;
        //    48: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //    51: iconst_0       
        //    52: aload           5
        //    54: invokevirtual   java/util/Stack.add:(ILjava/lang/Object;)V
        //    57: aload_0        
        //    58: getfield        com/whatsapp/util/b7.g:Lcom/whatsapp/util/bc;
        //    61: invokestatic    com/whatsapp/util/bc.a:(Lcom/whatsapp/util/bc;)Ljava/util/Stack;
        //    64: invokevirtual   java/lang/Object.notifyAll:()V
        //    67: aload           6
        //    69: monitorexit    
        //    70: aload_0        
        //    71: getfield        com/whatsapp/util/b7.c:[Lcom/whatsapp/util/j;
        //    74: aload_1        
        //    75: invokevirtual   java/lang/String.hashCode:()I
        //    78: invokestatic    java/lang/Math.abs:(I)I
        //    81: aload_0        
        //    82: getfield        com/whatsapp/util/b7.c:[Lcom/whatsapp/util/j;
        //    85: arraylength    
        //    86: irem           
        //    87: aaload         
        //    88: astore          8
        //    90: aload           8
        //    92: invokevirtual   java/lang/Thread.getState:()Ljava/lang/Thread$State;
        //    95: getstatic       java/lang/Thread$State.NEW:Ljava/lang/Thread$State;
        //    98: if_acmpne       106
        //   101: aload           8
        //   103: invokevirtual   java/lang/Thread.start:()V
        //   106: return         
        //   107: astore          4
        //   109: aload_3        
        //   110: monitorexit    
        //   111: aload           4
        //   113: athrow         
        //   114: astore          7
        //   116: aload           6
        //   118: monitorexit    
        //   119: aload           7
        //   121: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  10     20     107    114    Any
        //  44     70     114    122    Any
        //  109    111    107    114    Any
        //  116    119    114    122    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0106:
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
    
    static Drawable b(final b7 b7) {
        return b7.b;
    }
    
    static HashMap c(final b7 b7) {
        return b7.i;
    }
    
    public Bitmap a(final FileDescriptor fileDescriptor) {
        final boolean l = Log.l;
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect)null, bitmapFactory$Options);
        if (bitmapFactory$Options.outWidth < 0 || bitmapFactory$Options.outHeight < 0) {
            Log.e(b7.z[0]);
            return null;
        }
        int outWidth = bitmapFactory$Options.outWidth;
        int outHeight = bitmapFactory$Options.outHeight;
        bitmapFactory$Options.inSampleSize = 1;
        while (outWidth / 2 >= this.k || outHeight / 2 >= this.k || l) {
            outWidth /= 2;
            outHeight /= 2;
            ++bitmapFactory$Options.inSampleSize;
            if (l) {
                break;
            }
        }
        bitmapFactory$Options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect)null, bitmapFactory$Options);
    }
    
    public void a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/util/b7.c:[Lcom/whatsapp/util/j;
        //     8: astore_3       
        //     9: aload_3        
        //    10: arraylength    
        //    11: istore          4
        //    13: iconst_0       
        //    14: istore          5
        //    16: iload           5
        //    18: iload           4
        //    20: if_icmpge       37
        //    23: aload_3        
        //    24: iload           5
        //    26: aaload         
        //    27: invokevirtual   java/lang/Thread.interrupt:()V
        //    30: iinc            5, 1
        //    33: iload_2        
        //    34: ifeq            16
        //    37: aload_0        
        //    38: getfield        com/whatsapp/util/b7.i:Ljava/util/HashMap;
        //    41: astore          6
        //    43: aload           6
        //    45: monitorenter   
        //    46: aload_0        
        //    47: getfield        com/whatsapp/util/b7.i:Ljava/util/HashMap;
        //    50: invokevirtual   java/util/HashMap.clear:()V
        //    53: aload           6
        //    55: monitorexit    
        //    56: aload_0        
        //    57: getfield        com/whatsapp/util/b7.d:Ljava/lang/Object;
        //    60: astore          8
        //    62: aload           8
        //    64: monitorenter   
        //    65: aload_0        
        //    66: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //    69: astore          10
        //    71: aload           10
        //    73: ifnull          109
        //    76: iload_1        
        //    77: ifeq            87
        //    80: aload_0        
        //    81: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //    84: invokevirtual   com/whatsapp/util/n.g:()V
        //    87: aload_0        
        //    88: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //    91: invokevirtual   com/whatsapp/util/n.h:()Z
        //    94: ifne            104
        //    97: aload_0        
        //    98: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //   101: invokevirtual   com/whatsapp/util/n.close:()V
        //   104: aload_0        
        //   105: aconst_null    
        //   106: putfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //   109: aload           8
        //   111: monitorexit    
        //   112: return         
        //   113: astore          7
        //   115: aload           6
        //   117: monitorexit    
        //   118: aload           7
        //   120: athrow         
        //   121: astore          13
        //   123: aload           13
        //   125: athrow         
        //   126: astore          12
        //   128: new             Ljava/lang/StringBuilder;
        //   131: dup            
        //   132: invokespecial   java/lang/StringBuilder.<init>:()V
        //   135: getstatic       com/whatsapp/util/b7.z:[Ljava/lang/String;
        //   138: bipush          8
        //   140: aaload         
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: aload           12
        //   146: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   149: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   152: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   155: goto            109
        //   158: astore          9
        //   160: aload           8
        //   162: monitorexit    
        //   163: aload           9
        //   165: athrow         
        //   166: astore          11
        //   168: aload           11
        //   170: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  46     56     113    121    Any
        //  65     71     158    166    Any
        //  80     87     121    126    Ljava/io/IOException;
        //  80     87     158    166    Any
        //  87     104    166    171    Ljava/io/IOException;
        //  87     104    158    166    Any
        //  104    109    126    158    Ljava/io/IOException;
        //  104    109    158    166    Any
        //  109    112    158    166    Any
        //  115    118    113    121    Any
        //  123    126    126    158    Ljava/io/IOException;
        //  123    126    158    166    Any
        //  128    155    158    166    Any
        //  160    163    158    166    Any
        //  168    171    126    158    Ljava/io/IOException;
        //  168    171    158    166    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 87, Size: 87
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
    
    public Bitmap b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: aload_0        
        //     3: getfield        com/whatsapp/util/b7.d:Ljava/lang/Object;
        //     6: astore_3       
        //     7: aload_3        
        //     8: monitorenter   
        //     9: aload_0        
        //    10: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //    13: astore          5
        //    15: aload           5
        //    17: ifnull          247
        //    20: aload_0        
        //    21: getfield        com/whatsapp/util/b7.a:Lcom/whatsapp/util/n;
        //    24: aload_1        
        //    25: invokevirtual   com/whatsapp/util/n.c:(Ljava/lang/String;)Lcom/whatsapp/util/d;
        //    28: astore          12
        //    30: aload           12
        //    32: ifnull          238
        //    35: aload           12
        //    37: iconst_0       
        //    38: invokevirtual   com/whatsapp/util/d.a:(I)Ljava/io/InputStream;
        //    41: astore          13
        //    43: aload           13
        //    45: astore          8
        //    47: aconst_null    
        //    48: astore          14
        //    50: aload           8
        //    52: ifnull          100
        //    55: aload_0        
        //    56: aload           8
        //    58: checkcast       Ljava/io/FileInputStream;
        //    61: invokevirtual   java/io/FileInputStream.getFD:()Ljava/io/FileDescriptor;
        //    64: invokevirtual   com/whatsapp/util/b7.a:(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
        //    67: astore          16
        //    69: aload           16
        //    71: ifnonnull       96
        //    74: getstatic       com/whatsapp/util/b7.z:[Ljava/lang/String;
        //    77: iconst_2       
        //    78: aaload         
        //    79: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    82: aload           8
        //    84: ifnull          92
        //    87: aload           8
        //    89: invokevirtual   java/io/InputStream.close:()V
        //    92: aload_3        
        //    93: monitorexit    
        //    94: aconst_null    
        //    95: areturn        
        //    96: aload           16
        //    98: astore          14
        //   100: aload           8
        //   102: ifnull          110
        //   105: aload           8
        //   107: invokevirtual   java/io/InputStream.close:()V
        //   110: aload           14
        //   112: astore          6
        //   114: aload_3        
        //   115: monitorexit    
        //   116: aload           6
        //   118: areturn        
        //   119: astore          4
        //   121: aload_3        
        //   122: monitorexit    
        //   123: aload           4
        //   125: athrow         
        //   126: astore          15
        //   128: aload           14
        //   130: astore          6
        //   132: goto            114
        //   135: astore          10
        //   137: aconst_null    
        //   138: astore          8
        //   140: new             Ljava/lang/StringBuilder;
        //   143: dup            
        //   144: invokespecial   java/lang/StringBuilder.<init>:()V
        //   147: getstatic       com/whatsapp/util/b7.z:[Ljava/lang/String;
        //   150: iconst_3       
        //   151: aaload         
        //   152: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   155: aload           10
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   160: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   163: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   166: aload           8
        //   168: ifnull          176
        //   171: aload           8
        //   173: invokevirtual   java/io/InputStream.close:()V
        //   176: aload_2        
        //   177: astore          6
        //   179: goto            114
        //   182: astore          11
        //   184: aload_2        
        //   185: astore          6
        //   187: goto            114
        //   190: astore          7
        //   192: aconst_null    
        //   193: astore          8
        //   195: aload           8
        //   197: ifnull          205
        //   200: aload           8
        //   202: invokevirtual   java/io/InputStream.close:()V
        //   205: aload           7
        //   207: athrow         
        //   208: astore          17
        //   210: goto            92
        //   213: astore          9
        //   215: goto            205
        //   218: astore          7
        //   220: goto            195
        //   223: astore          10
        //   225: aconst_null    
        //   226: astore_2       
        //   227: goto            140
        //   230: astore          10
        //   232: aload           16
        //   234: astore_2       
        //   235: goto            140
        //   238: aconst_null    
        //   239: astore          8
        //   241: aconst_null    
        //   242: astore          14
        //   244: goto            100
        //   247: aconst_null    
        //   248: astore          6
        //   250: goto            114
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      15     119    126    Any
        //  20     30     135    140    Ljava/io/IOException;
        //  20     30     190    195    Any
        //  35     43     135    140    Ljava/io/IOException;
        //  35     43     190    195    Any
        //  55     69     223    230    Ljava/io/IOException;
        //  55     69     218    223    Any
        //  74     82     230    238    Ljava/io/IOException;
        //  74     82     218    223    Any
        //  87     92     208    213    Ljava/io/IOException;
        //  87     92     119    126    Any
        //  92     94     119    126    Any
        //  105    110    126    135    Ljava/io/IOException;
        //  105    110    119    126    Any
        //  114    116    119    126    Any
        //  121    123    119    126    Any
        //  140    166    218    223    Any
        //  171    176    182    190    Ljava/io/IOException;
        //  171    176    119    126    Any
        //  200    205    213    218    Ljava/io/IOException;
        //  200    205    119    126    Any
        //  205    208    119    126    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 126, Size: 126
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
        this.a(false);
    }
    
    public void b(final String tag, final ImageView imageView) {
        final boolean l = Log.l;
        imageView.setTag((Object)tag);
        if (this.i.containsKey(tag)) {
            final Bitmap imageBitmap = this.i.get(tag);
            Label_0056: {
                if (imageBitmap != null) {
                    imageView.setImageBitmap(imageBitmap);
                    if (!l) {
                        break Label_0056;
                    }
                }
                imageView.setImageDrawable(this.b);
            }
            if (!l) {
                return;
            }
        }
        imageView.setImageDrawable(this.f);
        this.a(tag, imageView);
    }
}
