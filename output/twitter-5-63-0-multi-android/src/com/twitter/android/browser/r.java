// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.browser;

import java.net.HttpURLConnection;
import android.content.Context;

public class r extends n
{
    private final String b;
    
    public r(final p p3, final Context context, final String s) {
        this(p3, j.a(context), s);
    }
    
    public r(final p p3, final String b, final String s) {
        super(p3, s);
        this.b = b;
    }
    
    protected k a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: new             Ljava/net/URL;
        //     5: dup            
        //     6: aload_1        
        //     7: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    10: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    13: checkcast       Ljava/net/HttpURLConnection;
        //    16: astore          5
        //    18: aload           5
        //    20: ldc             "User-Agent"
        //    22: aload_0        
        //    23: getfield        com/twitter/android/browser/r.b:Ljava/lang/String;
        //    26: invokevirtual   java/net/HttpURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //    29: aload           5
        //    31: iconst_1       
        //    32: invokevirtual   java/net/HttpURLConnection.setInstanceFollowRedirects:(Z)V
        //    35: aload_0        
        //    36: aload           5
        //    38: invokevirtual   com/twitter/android/browser/r.a:(Ljava/net/HttpURLConnection;)Lcom/twitter/android/browser/k;
        //    41: astore          10
        //    43: aload           5
        //    45: ifnull          53
        //    48: aload           5
        //    50: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    53: aload           10
        //    55: areturn        
        //    56: astore          6
        //    58: aconst_null    
        //    59: astore          5
        //    61: new             Lcom/twitter/errorreporter/a;
        //    64: dup            
        //    65: invokespecial   com/twitter/errorreporter/a.<init>:()V
        //    68: ldc             "website_dest_url"
        //    70: aload_1        
        //    71: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //    74: new             Ljava/lang/NullPointerException;
        //    77: dup            
        //    78: ldc             "URI shouldn't be null"
        //    80: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    83: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //    86: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Lcom/twitter/errorreporter/a;)V
        //    89: aload           5
        //    91: ifnull          99
        //    94: aload           5
        //    96: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    99: aconst_null    
        //   100: areturn        
        //   101: astore          4
        //   103: aconst_null    
        //   104: astore          5
        //   106: aload           5
        //   108: ifnull          116
        //   111: aload           5
        //   113: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   116: aconst_null    
        //   117: areturn        
        //   118: astore_3       
        //   119: aload_2        
        //   120: ifnull          127
        //   123: aload_2        
        //   124: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   127: aload_3        
        //   128: athrow         
        //   129: astore          7
        //   131: aload           5
        //   133: astore_2       
        //   134: aload           7
        //   136: astore_3       
        //   137: goto            119
        //   140: astore          9
        //   142: goto            106
        //   145: astore          8
        //   147: goto            61
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      18     56     61     Ljava/net/MalformedURLException;
        //  2      18     101    106    Ljava/io/IOException;
        //  2      18     118    119    Any
        //  18     43     145    150    Ljava/net/MalformedURLException;
        //  18     43     140    145    Ljava/io/IOException;
        //  18     43     129    140    Any
        //  61     89     129    140    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    k a(final HttpURLConnection p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //     4: astore          7
        //     6: aload           7
        //     8: astore_3       
        //     9: aload_1        
        //    10: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    13: sipush          200
        //    16: if_icmpne       67
        //    19: aload_3        
        //    20: invokestatic    yp.b:(Ljava/io/InputStream;)[B
        //    23: astore          10
        //    25: aload           10
        //    27: ifnull          67
        //    30: aload_1        
        //    31: invokevirtual   java/net/HttpURLConnection.getURL:()Ljava/net/URL;
        //    34: invokevirtual   java/net/URL.toString:()Ljava/lang/String;
        //    37: astore          11
        //    39: new             Lcom/twitter/android/browser/k;
        //    42: dup            
        //    43: aload           10
        //    45: aload_1        
        //    46: invokevirtual   java/net/HttpURLConnection.getContentEncoding:()Ljava/lang/String;
        //    49: aload_1        
        //    50: invokevirtual   java/net/HttpURLConnection.getContentType:()Ljava/lang/String;
        //    53: aload           11
        //    55: invokespecial   com/twitter/android/browser/k.<init>:([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    58: astore          12
        //    60: aload_3        
        //    61: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    64: aload           12
        //    66: areturn        
        //    67: aload_3        
        //    68: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    71: aconst_null    
        //    72: areturn        
        //    73: astore          5
        //    75: aconst_null    
        //    76: astore          6
        //    78: aload           6
        //    80: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    83: goto            71
        //    86: astore          4
        //    88: aconst_null    
        //    89: astore_3       
        //    90: new             Lcom/twitter/errorreporter/a;
        //    93: dup            
        //    94: invokespecial   com/twitter/errorreporter/a.<init>:()V
        //    97: ldc             "url"
        //    99: aload_0        
        //   100: getfield        com/twitter/android/browser/r.a:Ljava/lang/String;
        //   103: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   106: new             Ljava/lang/OutOfMemoryError;
        //   109: dup            
        //   110: ldc             "OutOfMemoryError pre-fetching"
        //   112: invokespecial   java/lang/OutOfMemoryError.<init>:(Ljava/lang/String;)V
        //   115: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //   118: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Lcom/twitter/errorreporter/a;)V
        //   121: aload_3        
        //   122: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   125: goto            71
        //   128: astore_2       
        //   129: aconst_null    
        //   130: astore_3       
        //   131: aload_3        
        //   132: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   135: aload_2        
        //   136: athrow         
        //   137: astore_2       
        //   138: goto            131
        //   141: astore          9
        //   143: goto            90
        //   146: astore          8
        //   148: aload_3        
        //   149: astore          6
        //   151: goto            78
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      6      73     78     Ljava/io/IOException;
        //  0      6      86     90     Ljava/lang/OutOfMemoryError;
        //  0      6      128    131    Any
        //  9      25     146    154    Ljava/io/IOException;
        //  9      25     141    146    Ljava/lang/OutOfMemoryError;
        //  9      25     137    141    Any
        //  30     60     146    154    Ljava/io/IOException;
        //  30     60     141    146    Ljava/lang/OutOfMemoryError;
        //  30     60     137    141    Any
        //  90     121    137    141    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0067:
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
}
