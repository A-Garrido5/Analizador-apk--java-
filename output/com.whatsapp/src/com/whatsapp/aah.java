// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.net.Uri;
import com.whatsapp.util.bm;
import android.content.Context;
import java.io.IOException;
import com.whatsapp.util.Log;
import java.io.File;

public class aah
{
    private static String a;
    private static String b;
    private static String c;
    private static volatile boolean d;
    private static String e;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[28];
        String s = "\"4f`T4,w:R\u0005;uuC\u0010";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0732:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\'';
                        break;
                    }
                    case 0: {
                        c2 = 'u';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = '\u0007';
                        break;
                    }
                    case 3: {
                        c2 = '\u0014';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "_v-aW\u0012.fpBZ8hcI\u00193fp\b\u00113pzK\u001a=c4D\u001a)kpIR('pB\u00199sq\u0007\u00113pzK\u001a=c5";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\"4f`T4,w:F\u00057";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\"4f`T4,w:C\u001a+ixH\u00148";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "_v-aW\u0012.fpBZ8hcI\u00193fp\u0007\u00163rxC\u001b{s4U\u00102fyBU8hcI\u00193fp\u0006";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "_v-aW\u0012.fpBZ5igS\u00140k4D\u001a)kpIR('pB\u00199sq\u0007\u00113pzK\u001a=c5";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "_v-aW\u0012.fpBZ8hcI\u00193fp\u0007\u00163rxC\u001b{s4C\u00100b`BU8hcI\u00193fp\u0006";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    s = "_v-aW\u0012.fpBZ8hcI\u00193fp\b\u00113pzK\u001a=c4D\u001a)kpIR('fB\u001b=jq\u0007\u00113pzK\u001a=c5";
                    n = 6;
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    array = z2;
                    s = "_v-aW\u0012.fpBZ5igS\u00140k4D\u001a)kpIR('pB\u00199sq\u0007\u001c2t`F\u00190&";
                    n = 7;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\"4f`T4,w:F\u00057";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\"4f`T4,w:C\u001a+ixH\u00148";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\"4f`T4,w:R\u0005;uuC\u0010";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0000,`fF\u00119(gB\u001b(nzB\u0019sauN\u0019";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\"4f`T4,w:R\u0005;uuC\u0010";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\"4f`T4,w:F\u00057";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\"4f`T4,w:Q\u0010.t}H\u001b";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0000,`fF\u00119(gH\u0000.dq\u0007";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\"4f`T4,w:O\u00011k";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u001d(sdTOs(cP\u0002rp|F\u0001/fdW[?hy\b\u00142cfH\u001c8(";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\"4f`T4,w:D\u001e/ry";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    s = "\"4f`T4,w:F\u00057";
                    n = 19;
                    n2 = 20;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    array = z2;
                    s = "\"4f`T4,w:R\u0005;uuC\u0010";
                    n = 20;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u001d(sdTOs(cP\u0002rp|F\u0001/fdW[?hy\b\u00142cfH\u001c8(wR\u0007.bzSZ\u000bouS\u0006\u001dwd\t\u0014,l";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0018=u\u007fB\u0001f(;C\u0010(f}K\u0006cnp\u001a\u00163j:P\u001d=sgF\u0005,";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u00141}z\u001dZsfdW\u0006sfzC\u00073np\u0018\u0005ad{J[+ouS\u0006=wd";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0000,`fF\u00119(pH\u00022k{F\u0011qa}K\u0010|";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u00163j:P\u001d=sgF\u0005,XdU\u0010:bfB\u001b?bg";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0019=t`x\u0000,`fF\u00119XwO\u0010?l";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    break Label_0732;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        aah.d = false;
    }
    
    private static long a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: sipush          4096
        //     7: newarray        B
        //     9: astore          11
        //    11: new             Ljava/util/zip/CRC32;
        //    14: dup            
        //    15: invokespecial   java/util/zip/CRC32.<init>:()V
        //    18: astore          12
        //    20: new             Ljava/io/FileInputStream;
        //    23: dup            
        //    24: aload_0        
        //    25: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    28: astore_3       
        //    29: aload_3        
        //    30: aload           11
        //    32: iconst_0       
        //    33: aload           11
        //    35: arraylength    
        //    36: invokevirtual   java/io/FileInputStream.read:([BII)I
        //    39: istore          13
        //    41: iload           13
        //    43: iflt            60
        //    46: aload           12
        //    48: aload           11
        //    50: iconst_0       
        //    51: iload           13
        //    53: invokevirtual   java/util/zip/CRC32.update:([BII)V
        //    56: iload_1        
        //    57: ifeq            29
        //    60: aload           12
        //    62: invokevirtual   java/util/zip/CRC32.getValue:()J
        //    65: lstore          14
        //    67: lload           14
        //    69: lstore          7
        //    71: aload_3        
        //    72: ifnull          79
        //    75: aload_3        
        //    76: invokevirtual   java/io/FileInputStream.close:()V
        //    79: lload           7
        //    81: lreturn        
        //    82: astore          17
        //    84: aload           17
        //    86: athrow         
        //    87: astore          16
        //    89: lload           7
        //    91: lreturn        
        //    92: astore          6
        //    94: aconst_null    
        //    95: astore_3       
        //    96: aload           6
        //    98: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   101: lconst_0       
        //   102: lstore          7
        //   104: aload_3        
        //   105: ifnull          79
        //   108: aload_3        
        //   109: invokevirtual   java/io/FileInputStream.close:()V
        //   112: lload           7
        //   114: lreturn        
        //   115: astore          10
        //   117: aload           10
        //   119: athrow         
        //   120: astore          9
        //   122: lload           7
        //   124: lreturn        
        //   125: astore_2       
        //   126: aconst_null    
        //   127: astore_3       
        //   128: aload_3        
        //   129: ifnull          136
        //   132: aload_3        
        //   133: invokevirtual   java/io/FileInputStream.close:()V
        //   136: aload_2        
        //   137: athrow         
        //   138: astore          5
        //   140: aload           5
        //   142: athrow         
        //   143: astore          4
        //   145: goto            136
        //   148: astore_2       
        //   149: goto            128
        //   152: astore          6
        //   154: goto            96
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      29     92     96     Ljava/io/IOException;
        //  4      29     125    128    Any
        //  29     41     152    157    Ljava/io/IOException;
        //  29     41     148    152    Any
        //  46     56     152    157    Ljava/io/IOException;
        //  46     56     148    152    Any
        //  60     67     152    157    Ljava/io/IOException;
        //  60     67     148    152    Any
        //  75     79     82     87     Ljava/lang/NumberFormatException;
        //  75     79     87     92     Ljava/io/IOException;
        //  84     87     87     92     Ljava/io/IOException;
        //  96     101    148    152    Any
        //  108    112    115    120    Ljava/lang/NumberFormatException;
        //  108    112    120    125    Ljava/io/IOException;
        //  117    120    120    125    Ljava/io/IOException;
        //  132    136    138    143    Ljava/lang/NumberFormatException;
        //  132    136    143    148    Ljava/io/IOException;
        //  140    143    143    148    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
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
    
    private static String a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: new             Lorg/apache/http/params/BasicHttpParams;
        //     7: dup            
        //     8: invokespecial   org/apache/http/params/BasicHttpParams.<init>:()V
        //    11: astore_2       
        //    12: aload_2        
        //    13: sipush          15000
        //    16: invokestatic    org/apache/http/params/HttpConnectionParams.setConnectionTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //    19: aload_2        
        //    20: sipush          30000
        //    23: invokestatic    org/apache/http/params/HttpConnectionParams.setSoTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //    26: aload_2        
        //    27: invokestatic    com/whatsapp/m3.a:()Ljava/lang/String;
        //    30: invokestatic    org/apache/http/params/HttpProtocolParams.setUserAgent:(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
        //    33: new             Lorg/apache/http/impl/client/DefaultHttpClient;
        //    36: dup            
        //    37: aload_2        
        //    38: invokespecial   org/apache/http/impl/client/DefaultHttpClient.<init>:(Lorg/apache/http/params/HttpParams;)V
        //    41: new             Lorg/apache/http/client/methods/HttpGet;
        //    44: dup            
        //    45: aload_0        
        //    46: invokespecial   org/apache/http/client/methods/HttpGet.<init>:(Ljava/lang/String;)V
        //    49: invokevirtual   org/apache/http/impl/client/DefaultHttpClient.execute:(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
        //    52: invokeinterface org/apache/http/HttpResponse.getEntity:()Lorg/apache/http/HttpEntity;
        //    57: invokeinterface org/apache/http/HttpEntity.getContent:()Ljava/io/InputStream;
        //    62: astore          12
        //    64: aload           12
        //    66: astore          4
        //    68: new             Ljava/lang/StringBuilder;
        //    71: dup            
        //    72: invokespecial   java/lang/StringBuilder.<init>:()V
        //    75: astore          13
        //    77: aload           4
        //    79: invokevirtual   java/io/InputStream.read:()I
        //    82: istore          15
        //    84: iload           15
        //    86: iflt            102
        //    89: aload           13
        //    91: iload           15
        //    93: i2c            
        //    94: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    97: pop            
        //    98: iload_1        
        //    99: ifeq            77
        //   102: aload           4
        //   104: invokevirtual   java/io/InputStream.close:()V
        //   107: aload           13
        //   109: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   112: astore          17
        //   114: aload           17
        //   116: astore          9
        //   118: aload           4
        //   120: ifnull          128
        //   123: aload           4
        //   125: invokevirtual   java/io/InputStream.close:()V
        //   128: aload           9
        //   130: areturn        
        //   131: astore          19
        //   133: aload           19
        //   135: athrow         
        //   136: astore          18
        //   138: aload           9
        //   140: areturn        
        //   141: astore          8
        //   143: aconst_null    
        //   144: astore          4
        //   146: ldc             ""
        //   148: astore          9
        //   150: aload           4
        //   152: ifnull          128
        //   155: aload           4
        //   157: invokevirtual   java/io/InputStream.close:()V
        //   160: aload           9
        //   162: areturn        
        //   163: astore          11
        //   165: aload           11
        //   167: athrow         
        //   168: astore          10
        //   170: aload           9
        //   172: areturn        
        //   173: astore_3       
        //   174: aconst_null    
        //   175: astore          4
        //   177: aload_3        
        //   178: astore          5
        //   180: aload           4
        //   182: ifnull          190
        //   185: aload           4
        //   187: invokevirtual   java/io/InputStream.close:()V
        //   190: aload           5
        //   192: athrow         
        //   193: astore          7
        //   195: aload           7
        //   197: athrow         
        //   198: astore          6
        //   200: goto            190
        //   203: astore          5
        //   205: goto            180
        //   208: astore          14
        //   210: goto            146
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      64     141    146    Ljava/io/IOException;
        //  4      64     173    180    Any
        //  68     77     208    213    Ljava/io/IOException;
        //  68     77     203    208    Any
        //  77     84     208    213    Ljava/io/IOException;
        //  77     84     203    208    Any
        //  89     98     208    213    Ljava/io/IOException;
        //  89     98     203    208    Any
        //  102    114    208    213    Ljava/io/IOException;
        //  102    114    203    208    Any
        //  123    128    131    136    Ljava/lang/NumberFormatException;
        //  123    128    136    141    Ljava/io/IOException;
        //  133    136    136    141    Ljava/io/IOException;
        //  155    160    163    168    Ljava/lang/NumberFormatException;
        //  155    160    168    173    Ljava/io/IOException;
        //  165    168    168    173    Ljava/io/IOException;
        //  185    190    193    198    Ljava/lang/NumberFormatException;
        //  185    190    198    203    Ljava/io/IOException;
        //  195    198    198    203    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0077:
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
    
    public static void a() {
        final File file = new File(App.M, aah.z[13]);
        try {
            file.createNewFile();
        }
        catch (IOException ex) {
            Log.e(aah.z[12]);
        }
    }
    
    public static void a(final Context context, final String s) {
        while (true) {
            try {
                if (!aah.d) {
                    return;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            long n;
            try {
                if (!h()) {
                    return;
                }
                n = 21600000L + context.getSharedPreferences(aah.z[26], 0).getLong(aah.z[27], 0L);
                final long n2 = System.currentTimeMillis();
                final long n3 = n;
                final long n4 = n2;
                final long n5 = lcmp(n3, n4);
                if (n5 <= 0) {
                    final String s2 = s;
                    final Context context2 = context;
                    final a9a a9a = new a9a(s2, context2);
                    bm.a(a9a);
                }
                return;
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
            try {
                final long n2 = System.currentTimeMillis();
                final long n3 = n;
                final long n4 = n2;
                final long n5 = lcmp(n3, n4);
                if (n5 <= 0) {
                    final String s2 = s;
                    final Context context2 = context;
                    final a9a a9a = new a9a(s2, context2);
                    bm.a(a9a);
                }
            }
            catch (NumberFormatException ex3) {
                throw ex3;
            }
        }
    }
    
    private static void a(final String p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: sipush          4096
        //     9: newarray        B
        //    11: astore          7
        //    13: new             Lorg/apache/http/params/BasicHttpParams;
        //    16: dup            
        //    17: invokespecial   org/apache/http/params/BasicHttpParams.<init>:()V
        //    20: astore          8
        //    22: aload           8
        //    24: sipush          15000
        //    27: invokestatic    org/apache/http/params/HttpConnectionParams.setConnectionTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //    30: aload           8
        //    32: sipush          30000
        //    35: invokestatic    org/apache/http/params/HttpConnectionParams.setSoTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //    38: aload           8
        //    40: invokestatic    com/whatsapp/m3.a:()Ljava/lang/String;
        //    43: invokestatic    org/apache/http/params/HttpProtocolParams.setUserAgent:(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
        //    46: new             Lorg/apache/http/impl/client/DefaultHttpClient;
        //    49: dup            
        //    50: aload           8
        //    52: invokespecial   org/apache/http/impl/client/DefaultHttpClient.<init>:(Lorg/apache/http/params/HttpParams;)V
        //    55: new             Lorg/apache/http/client/methods/HttpGet;
        //    58: dup            
        //    59: aload_0        
        //    60: invokespecial   org/apache/http/client/methods/HttpGet.<init>:(Ljava/lang/String;)V
        //    63: invokevirtual   org/apache/http/impl/client/DefaultHttpClient.execute:(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
        //    66: invokeinterface org/apache/http/HttpResponse.getEntity:()Lorg/apache/http/HttpEntity;
        //    71: invokeinterface org/apache/http/HttpEntity.getContent:()Ljava/io/InputStream;
        //    76: astore          9
        //    78: aload           9
        //    80: astore          5
        //    82: new             Ljava/io/FileOutputStream;
        //    85: dup            
        //    86: aload_1        
        //    87: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    90: astore          10
        //    92: aload           5
        //    94: aload           7
        //    96: iconst_0       
        //    97: aload           7
        //    99: arraylength    
        //   100: invokevirtual   java/io/InputStream.read:([BII)I
        //   103: istore          11
        //   105: iload           11
        //   107: iflt            124
        //   110: aload           10
        //   112: aload           7
        //   114: iconst_0       
        //   115: iload           11
        //   117: invokevirtual   java/io/OutputStream.write:([BII)V
        //   120: iload_3        
        //   121: ifeq            92
        //   124: aload           10
        //   126: invokevirtual   java/io/OutputStream.flush:()V
        //   129: aload           10
        //   131: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   134: aload           5
        //   136: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   139: return         
        //   140: astore          6
        //   142: aconst_null    
        //   143: astore          5
        //   145: new             Ljava/lang/StringBuilder;
        //   148: dup            
        //   149: invokespecial   java/lang/StringBuilder.<init>:()V
        //   152: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //   155: bipush          25
        //   157: aaload         
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: aload           6
        //   163: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   166: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   169: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   172: aload_2        
        //   173: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   176: aload           5
        //   178: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   181: return         
        //   182: astore          4
        //   184: aconst_null    
        //   185: astore          5
        //   187: aload_2        
        //   188: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   191: aload           5
        //   193: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   196: aload           4
        //   198: athrow         
        //   199: astore          4
        //   201: goto            187
        //   204: astore          4
        //   206: aload           10
        //   208: astore_2       
        //   209: goto            187
        //   212: astore          6
        //   214: aconst_null    
        //   215: astore_2       
        //   216: goto            145
        //   219: astore          6
        //   221: aload           10
        //   223: astore_2       
        //   224: goto            145
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      78     140    145    Ljava/io/IOException;
        //  6      78     182    187    Any
        //  82     92     212    219    Ljava/io/IOException;
        //  82     92     199    204    Any
        //  92     105    219    227    Ljava/io/IOException;
        //  92     105    204    212    Any
        //  110    120    219    227    Ljava/io/IOException;
        //  110    120    204    212    Any
        //  124    129    219    227    Ljava/io/IOException;
        //  124    129    204    212    Any
        //  145    172    199    204    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0092:
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
    
    private static String b() {
        return a(aah.e).trim();
    }
    
    public static boolean b(final String s) {
        if (s != null) {
            Label_0034: {
                try {
                    if (s.length() < 1) {
                        return false;
                    }
                    final boolean d = aah.d;
                    final boolean d2 = d;
                    if (d2) {
                        return true;
                    }
                    break Label_0034;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                try {
                    final boolean d2;
                    final boolean d = d2 = aah.d;
                    if (d2) {
                        return true;
                    }
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
            }
            final String string = aah.z[18] + s.substring(-1 + s.length()) + "/";
            Log.i(aah.z[16] + string);
            aah.b = string + aah.z[14];
            aah.c = string + aah.z[19];
            aah.e = string + aah.z[15];
            aah.a = string + aah.z[17];
            return aah.d = true;
        }
        return false;
    }
    
    private static long c() {
        final String trim = a(aah.c).trim();
        try {
            return Long.parseLong(trim);
        }
        catch (NumberFormatException ex) {
            Log.b(trim, ex);
            return -1L;
        }
    }
    
    public static Uri d() {
        final File m = App.M;
        final File file = new File(m, aah.z[20]);
        final File file2 = new File(m, aah.z[21]);
        try {
            if (!file2.delete()) {
                return null;
            }
            final File file3 = file;
            final boolean b = file3.exists();
            if (b) {
                final File file4 = file;
                return Uri.fromFile(file4);
            }
            return null;
        }
        catch (NumberFormatException ex) {
            try {
                throw ex;
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
        }
        try {
            final File file3 = file;
            final boolean b = file3.exists();
            if (b) {
                final File file4 = file;
                return Uri.fromFile(file4);
            }
        }
        catch (NumberFormatException ex3) {}
        return null;
    }
    
    public static Uri e() {
        try {
            if (!aah.d) {
                return null;
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        return Uri.parse(aah.a);
    }
    
    static String f() {
        return b();
    }
    
    public static void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_0       
        //     2: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //     5: astore_1       
        //     6: new             Ljava/io/File;
        //     9: dup            
        //    10: aload_1        
        //    11: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //    14: bipush          10
        //    16: aaload         
        //    17: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    20: astore_2       
        //    21: aload_2        
        //    22: invokevirtual   java/io/File.exists:()Z
        //    25: istore          5
        //    27: iload           5
        //    29: ifeq            52
        //    32: aload_2        
        //    33: invokevirtual   java/io/File.delete:()Z
        //    36: istore          14
        //    38: iload           14
        //    40: iload_0        
        //    41: if_icmpne       89
        //    44: iload_0        
        //    45: istore          15
        //    47: iload           15
        //    49: invokestatic    com/whatsapp/util/Log.b:(Z)V
        //    52: new             Ljava/io/File;
        //    55: dup            
        //    56: aload_1        
        //    57: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //    60: bipush          11
        //    62: aaload         
        //    63: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    66: astore          6
        //    68: aload           6
        //    70: invokevirtual   java/io/File.exists:()Z
        //    73: istore          8
        //    75: iload           8
        //    77: ifeq            100
        //    80: return         
        //    81: astore_3       
        //    82: aload_3        
        //    83: athrow         
        //    84: astore          4
        //    86: aload           4
        //    88: athrow         
        //    89: iconst_0       
        //    90: istore          15
        //    92: goto            47
        //    95: astore          7
        //    97: aload           7
        //    99: athrow         
        //   100: new             Ljava/io/File;
        //   103: dup            
        //   104: aload_1        
        //   105: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //   108: bipush          9
        //   110: aaload         
        //   111: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   114: astore          9
        //   116: aload           9
        //   118: invokevirtual   java/io/File.exists:()Z
        //   121: istore          12
        //   123: iload           12
        //   125: ifeq            80
        //   128: aload           9
        //   130: invokevirtual   java/io/File.delete:()Z
        //   133: istore          13
        //   135: iload           13
        //   137: iload_0        
        //   138: if_icmpne       156
        //   141: iload_0        
        //   142: invokestatic    com/whatsapp/util/Log.b:(Z)V
        //   145: return         
        //   146: astore          10
        //   148: aload           10
        //   150: athrow         
        //   151: astore          11
        //   153: aload           11
        //   155: athrow         
        //   156: iconst_0       
        //   157: istore_0       
        //   158: goto            141
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  21     27     81     84     Ljava/lang/NumberFormatException;
        //  32     38     84     89     Ljava/lang/NumberFormatException;
        //  68     75     95     100    Ljava/lang/NumberFormatException;
        //  82     84     84     89     Ljava/lang/NumberFormatException;
        //  116    123    146    151    Ljava/lang/NumberFormatException;
        //  128    135    151    156    Ljava/lang/NumberFormatException;
        //  148    151    151    156    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 84, Size: 84
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
    
    public static boolean h() {
        final int j = App.j();
        if (j != 1) {
            try {
                if ((App.c(j) & 0x4) != 0x0) {
                    return true;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            return false;
        }
        return true;
    }
    
    public static Uri i() {
        Label_0038: {
            try {
                if (App.aS != 1) {
                    break Label_0038;
                }
                final String s = aah.b;
                if (s != null) {
                    final String s2 = aah.b;
                    return Uri.parse(s2);
                }
                return Uri.parse(aah.z[22]);
            }
            catch (NumberFormatException ex) {
                try {
                    throw ex;
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
            }
            try {
                final String s = aah.b;
                if (s != null) {
                    final String s2 = aah.b;
                    return Uri.parse(s2);
                }
            }
            catch (NumberFormatException ex4) {}
            return Uri.parse(aah.z[22]);
            try {
                if (App.q()) {
                    return Uri.parse(aah.z[24]);
                }
            }
            catch (NumberFormatException ex3) {
                throw ex3;
            }
        }
        return Uri.parse(aah.z[23]);
    }
    
    private static void j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //     3: astore_0       
        //     4: new             Ljava/io/File;
        //     7: dup            
        //     8: aload_0        
        //     9: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //    12: iconst_3       
        //    13: aaload         
        //    14: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    17: astore_1       
        //    18: new             Ljava/io/File;
        //    21: dup            
        //    22: aload_0        
        //    23: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //    26: iconst_2       
        //    27: aaload         
        //    28: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    31: astore_2       
        //    32: new             Ljava/io/File;
        //    35: dup            
        //    36: aload_0        
        //    37: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //    40: iconst_0       
        //    41: aaload         
        //    42: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    45: pop            
        //    46: invokestatic    com/whatsapp/aah.c:()J
        //    49: lstore          4
        //    51: aload_2        
        //    52: invokevirtual   java/io/File.exists:()Z
        //    55: ifeq            124
        //    58: lload           4
        //    60: aload_2        
        //    61: invokestatic    com/whatsapp/aah.a:(Ljava/io/File;)J
        //    64: lcmp           
        //    65: ifne            108
        //    68: aload_1        
        //    69: invokevirtual   java/io/File.exists:()Z
        //    72: istore          15
        //    74: iload           15
        //    76: ifeq            94
        //    79: aload_1        
        //    80: invokevirtual   java/io/File.delete:()Z
        //    83: ifne            94
        //    86: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //    89: iconst_5       
        //    90: aaload         
        //    91: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    94: invokestatic    com/whatsapp/aah.a:()V
        //    97: return         
        //    98: astore          13
        //   100: aload           13
        //   102: athrow         
        //   103: astore          14
        //   105: aload           14
        //   107: athrow         
        //   108: aload_2        
        //   109: invokevirtual   java/io/File.delete:()Z
        //   112: ifne            124
        //   115: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //   118: bipush          8
        //   120: aaload         
        //   121: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   124: aload_1        
        //   125: invokevirtual   java/io/File.exists:()Z
        //   128: ifeq            187
        //   131: lload           4
        //   133: aload_1        
        //   134: invokestatic    com/whatsapp/aah.a:(Ljava/io/File;)J
        //   137: lcmp           
        //   138: ifne            171
        //   141: aload_1        
        //   142: aload_2        
        //   143: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   146: ifne            157
        //   149: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //   152: iconst_4       
        //   153: aaload         
        //   154: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   157: invokestatic    com/whatsapp/aah.a:()V
        //   160: return         
        //   161: astore          12
        //   163: aload           12
        //   165: athrow         
        //   166: astore          11
        //   168: aload           11
        //   170: athrow         
        //   171: aload_1        
        //   172: invokevirtual   java/io/File.delete:()Z
        //   175: ifne            187
        //   178: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //   181: bipush          6
        //   183: aaload         
        //   184: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   187: invokestatic    com/whatsapp/aah.h:()Z
        //   190: ifeq            97
        //   193: getstatic       com/whatsapp/aah.b:Ljava/lang/String;
        //   196: aload_1        
        //   197: invokestatic    com/whatsapp/aah.a:(Ljava/lang/String;Ljava/io/File;)V
        //   200: aload_1        
        //   201: invokevirtual   java/io/File.exists:()Z
        //   204: istore          7
        //   206: iload           7
        //   208: ifeq            97
        //   211: lload           4
        //   213: aload_1        
        //   214: invokestatic    com/whatsapp/aah.a:(Ljava/io/File;)J
        //   217: lcmp           
        //   218: ifne            257
        //   221: aload_1        
        //   222: aload_2        
        //   223: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   226: ifne            238
        //   229: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //   232: bipush          7
        //   234: aaload         
        //   235: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   238: invokestatic    com/whatsapp/aah.a:()V
        //   241: return         
        //   242: astore          10
        //   244: aload           10
        //   246: athrow         
        //   247: astore          6
        //   249: aload           6
        //   251: athrow         
        //   252: astore          9
        //   254: aload           9
        //   256: athrow         
        //   257: aload_1        
        //   258: invokevirtual   java/io/File.delete:()Z
        //   261: ifne            97
        //   264: getstatic       com/whatsapp/aah.z:[Ljava/lang/String;
        //   267: iconst_1       
        //   268: aaload         
        //   269: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   272: return         
        //   273: astore          8
        //   275: aload           8
        //   277: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  68     74     98     103    Ljava/lang/NumberFormatException;
        //  79     94     103    108    Ljava/lang/NumberFormatException;
        //  100    103    103    108    Ljava/lang/NumberFormatException;
        //  108    124    161    166    Ljava/lang/NumberFormatException;
        //  141    157    166    171    Ljava/lang/NumberFormatException;
        //  171    187    242    247    Ljava/lang/NumberFormatException;
        //  187    206    247    252    Ljava/lang/NumberFormatException;
        //  221    238    252    257    Ljava/lang/NumberFormatException;
        //  257    272    273    278    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 139, Size: 139
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
    
    static void k() {
        j();
    }
}
