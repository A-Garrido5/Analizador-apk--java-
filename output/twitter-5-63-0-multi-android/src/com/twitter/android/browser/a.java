// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.browser;

import android.util.Pair;
import java.net.MalformedURLException;
import android.text.TextUtils;
import java.net.URL;
import android.os.AsyncTask;

public class a extends AsyncTask
{
    public static boolean a(final int n) {
        return n / 100 == 3;
    }
    
    public static boolean a(final String s, final String s2) {
        while (true) {
            while (true) {
                try {
                    final URL url = new URL(s);
                    final URL url2 = new URL(s2);
                    final String host = url.getHost();
                    final String host2 = url2.getHost();
                    final String path = url.getPath();
                    final String path2 = url2.getPath();
                    if (!path.equals(path2) && (!path.equals("/") || !TextUtils.isEmpty((CharSequence)path2))) {
                        if (!path2.equals("/") || !TextUtils.isEmpty((CharSequence)path)) {
                            final int n = 0;
                            return host.equals(host2) && n != 0;
                        }
                    }
                }
                catch (MalformedURLException ex) {
                    return false;
                }
                final int n = 1;
                continue;
            }
        }
    }
    
    protected Pair a(final String... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: aload_1        
        //     3: ifnull          12
        //     6: aload_1        
        //     7: arraylength    
        //     8: iconst_2       
        //     9: if_icmpeq       14
        //    12: aconst_null    
        //    13: areturn        
        //    14: aload_1        
        //    15: iconst_1       
        //    16: aaload         
        //    17: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    20: ifne            35
        //    23: aload_1        
        //    24: iconst_0       
        //    25: aaload         
        //    26: aload_1        
        //    27: iconst_1       
        //    28: aaload         
        //    29: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    32: ifeq            50
        //    35: new             Landroid/util/Pair;
        //    38: dup            
        //    39: aload_1        
        //    40: iconst_0       
        //    41: aaload         
        //    42: iconst_0       
        //    43: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    46: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    49: areturn        
        //    50: new             Ljava/net/URL;
        //    53: dup            
        //    54: aload_1        
        //    55: iconst_0       
        //    56: aaload         
        //    57: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    60: astore_3       
        //    61: new             Ljava/net/URL;
        //    64: dup            
        //    65: aload_1        
        //    66: iconst_1       
        //    67: aaload         
        //    68: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    71: astore          4
        //    73: iconst_0       
        //    74: istore          5
        //    76: aload_3        
        //    77: astore          6
        //    79: aconst_null    
        //    80: astore          7
        //    82: aconst_null    
        //    83: astore          8
        //    85: iload           5
        //    87: bipush          6
        //    89: if_icmpge       386
        //    92: aload           6
        //    94: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    97: checkcast       Ljava/net/HttpURLConnection;
        //   100: astore          14
        //   102: aload           14
        //   104: iconst_0       
        //   105: invokevirtual   java/net/HttpURLConnection.setInstanceFollowRedirects:(Z)V
        //   108: aload           14
        //   110: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   113: astore          18
        //   115: aload           18
        //   117: astore          13
        //   119: aload           14
        //   121: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   124: istore          21
        //   126: iload           21
        //   128: invokestatic    com/twitter/android/browser/a.a:(I)Z
        //   131: ifne            195
        //   134: iload           21
        //   136: sipush          200
        //   139: if_icmpne       178
        //   142: new             Landroid/util/Pair;
        //   145: dup            
        //   146: aload           6
        //   148: invokevirtual   java/net/URL.toString:()Ljava/lang/String;
        //   151: iconst_1       
        //   152: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   155: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   158: astore          22
        //   160: aload           13
        //   162: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   165: aload           14
        //   167: ifnull          175
        //   170: aload           14
        //   172: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   175: aload           22
        //   177: areturn        
        //   178: aload           13
        //   180: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   183: aload           14
        //   185: ifnull          193
        //   188: aload           14
        //   190: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   193: aconst_null    
        //   194: areturn        
        //   195: aload           14
        //   197: ldc             "Location"
        //   199: invokevirtual   java/net/HttpURLConnection.getHeaderField:(Ljava/lang/String;)Ljava/lang/String;
        //   202: astore          23
        //   204: aload           23
        //   206: ldc             "//"
        //   208: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   211: ifeq            317
        //   214: new             Ljava/lang/StringBuilder;
        //   217: dup            
        //   218: invokespecial   java/lang/StringBuilder.<init>:()V
        //   221: aload           6
        //   223: invokevirtual   java/net/URL.getProtocol:()Ljava/lang/String;
        //   226: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   229: ldc             ":"
        //   231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   234: aload           23
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   242: astore          23
        //   244: aload           13
        //   246: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   249: aload           14
        //   251: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   254: new             Ljava/net/URL;
        //   257: dup            
        //   258: aload           23
        //   260: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   263: astore          6
        //   265: aload           6
        //   267: invokevirtual   java/net/URL.toString:()Ljava/lang/String;
        //   270: aload           4
        //   272: invokevirtual   java/net/URL.toString:()Ljava/lang/String;
        //   275: invokestatic    com/twitter/android/browser/a.a:(Ljava/lang/String;Ljava/lang/String;)Z
        //   278: ifeq            372
        //   281: new             Landroid/util/Pair;
        //   284: dup            
        //   285: aload           6
        //   287: invokevirtual   java/net/URL.toString:()Ljava/lang/String;
        //   290: iconst_0       
        //   291: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   294: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   297: astore          25
        //   299: aload           13
        //   301: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   304: aload           14
        //   306: ifnull          314
        //   309: aload           14
        //   311: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   314: aload           25
        //   316: areturn        
        //   317: aload           23
        //   319: ldc             "/"
        //   321: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   324: ifeq            244
        //   327: new             Ljava/lang/StringBuilder;
        //   330: dup            
        //   331: invokespecial   java/lang/StringBuilder.<init>:()V
        //   334: aload           6
        //   336: invokevirtual   java/net/URL.getProtocol:()Ljava/lang/String;
        //   339: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   342: ldc             "://"
        //   344: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   347: aload           6
        //   349: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //   352: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   355: aload           23
        //   357: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   360: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   363: astore          24
        //   365: aload           24
        //   367: astore          23
        //   369: goto            244
        //   372: iinc            5, 1
        //   375: aload           13
        //   377: astore          8
        //   379: aload           14
        //   381: astore          7
        //   383: goto            85
        //   386: aload           8
        //   388: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   391: aload           7
        //   393: ifnull          401
        //   396: aload           7
        //   398: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   401: aconst_null    
        //   402: areturn        
        //   403: astore          26
        //   405: aconst_null    
        //   406: astore          10
        //   408: aconst_null    
        //   409: astore          11
        //   411: aload           10
        //   413: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   416: aload           11
        //   418: ifnull          401
        //   421: aload           11
        //   423: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   426: goto            401
        //   429: astore          12
        //   431: aconst_null    
        //   432: astore          13
        //   434: aload           13
        //   436: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   439: aload_2        
        //   440: ifnull          447
        //   443: aload_2        
        //   444: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   447: aload           12
        //   449: athrow         
        //   450: astore          20
        //   452: aload           14
        //   454: astore_2       
        //   455: aload           20
        //   457: astore          12
        //   459: goto            434
        //   462: astore          12
        //   464: aload           7
        //   466: astore_2       
        //   467: aload           8
        //   469: astore          13
        //   471: goto            434
        //   474: astore          17
        //   476: aload           8
        //   478: astore          13
        //   480: aload           14
        //   482: astore_2       
        //   483: aload           17
        //   485: astore          12
        //   487: goto            434
        //   490: astore          19
        //   492: aload           14
        //   494: astore          11
        //   496: aload           13
        //   498: astore          10
        //   500: goto            411
        //   503: astore          9
        //   505: aload           8
        //   507: astore          10
        //   509: aload           7
        //   511: astore          11
        //   513: goto            411
        //   516: astore          15
        //   518: aload           8
        //   520: astore          16
        //   522: aload           14
        //   524: astore          11
        //   526: aload           16
        //   528: astore          10
        //   530: goto            411
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  50     73     403    411    Ljava/lang/Exception;
        //  50     73     429    434    Any
        //  92     102    503    516    Ljava/lang/Exception;
        //  92     102    462    474    Any
        //  102    115    516    533    Ljava/lang/Exception;
        //  102    115    474    490    Any
        //  119    134    490    503    Ljava/lang/Exception;
        //  119    134    450    462    Any
        //  142    160    490    503    Ljava/lang/Exception;
        //  142    160    450    462    Any
        //  195    244    490    503    Ljava/lang/Exception;
        //  195    244    450    462    Any
        //  244    299    490    503    Ljava/lang/Exception;
        //  244    299    450    462    Any
        //  317    365    490    503    Ljava/lang/Exception;
        //  317    365    450    462    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 252, Size: 252
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
