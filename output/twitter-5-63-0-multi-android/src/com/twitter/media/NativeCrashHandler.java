// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media;

import java.io.File;

public class NativeCrashHandler
{
    private static a a;
    
    public static void a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: ldc             Lcom/twitter/media/NativeCrashHandler;.class
        //     4: monitorenter   
        //     5: new             Ljava/io/FileReader;
        //     8: dup            
        //     9: aload_0        
        //    10: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //    13: astore_2       
        //    14: new             Ljava/io/BufferedReader;
        //    17: dup            
        //    18: aload_2        
        //    19: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    22: astore_3       
        //    23: aload_3        
        //    24: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    27: astore          10
        //    29: aload_3        
        //    30: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    33: astore          11
        //    35: aload           10
        //    37: ifnull          69
        //    40: aload           11
        //    42: ifnull          69
        //    45: ldc             Lcom/twitter/media/NativeCrashHandler$CrashType;.class
        //    47: aload           10
        //    49: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    52: checkcast       Lcom/twitter/media/NativeCrashHandler$CrashType;
        //    55: astore          12
        //    57: getstatic       com/twitter/media/NativeCrashHandler.a:Lcom/twitter/media/a;
        //    60: aload           12
        //    62: aload           11
        //    64: invokeinterface com/twitter/media/a.a:(Lcom/twitter/media/NativeCrashHandler$CrashType;Ljava/lang/String;)V
        //    69: aload_2        
        //    70: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    73: aload_3        
        //    74: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    77: aload_0        
        //    78: invokevirtual   java/io/File.delete:()Z
        //    81: pop            
        //    82: ldc             Lcom/twitter/media/NativeCrashHandler;.class
        //    84: monitorexit    
        //    85: return         
        //    86: astore          16
        //    88: aconst_null    
        //    89: astore          5
        //    91: aload           5
        //    93: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    96: aload_1        
        //    97: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   100: goto            77
        //   103: astore          6
        //   105: ldc             Lcom/twitter/media/NativeCrashHandler;.class
        //   107: monitorexit    
        //   108: aload           6
        //   110: athrow         
        //   111: astore          15
        //   113: aconst_null    
        //   114: astore_2       
        //   115: aload           15
        //   117: astore          9
        //   119: aconst_null    
        //   120: astore_3       
        //   121: aload_2        
        //   122: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   125: aload_3        
        //   126: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   129: aload           9
        //   131: athrow         
        //   132: astore          7
        //   134: goto            82
        //   137: astore          14
        //   139: aload           14
        //   141: astore          9
        //   143: aconst_null    
        //   144: astore_3       
        //   145: goto            121
        //   148: astore          9
        //   150: goto            121
        //   153: astore          13
        //   155: aload_2        
        //   156: astore          5
        //   158: aconst_null    
        //   159: astore_1       
        //   160: goto            91
        //   163: astore          4
        //   165: aload_3        
        //   166: astore_1       
        //   167: aload_2        
        //   168: astore          5
        //   170: goto            91
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      14     86     91     Ljava/lang/Exception;
        //  5      14     111    121    Any
        //  14     23     153    163    Ljava/lang/Exception;
        //  14     23     137    148    Any
        //  23     35     163    173    Ljava/lang/Exception;
        //  23     35     148    153    Any
        //  45     69     163    173    Ljava/lang/Exception;
        //  45     69     148    153    Any
        //  69     77     103    111    Any
        //  77     82     132    137    Ljava/lang/Exception;
        //  77     82     103    111    Any
        //  91     100    103    111    Any
        //  121    132    103    111    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 91, Size: 91
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
    
    public static boolean a(final File file, final boolean b, final a a) {
        synchronized (NativeCrashHandler.class) {
            try {
                NativeCrashHandler.a = a;
                if (file.exists()) {
                    a(file);
                }
                if (NativeInit.b() && nativeInstall(file.getAbsolutePath(), b)) {
                    return true;
                }
                return false;
            }
            catch (LinkageError linkageError) {
                return false;
            }
            catch (Exception ex) {
                return false;
            }
        }
    }
    
    private static native boolean nativeInstall(final String p0, final boolean p1);
}
