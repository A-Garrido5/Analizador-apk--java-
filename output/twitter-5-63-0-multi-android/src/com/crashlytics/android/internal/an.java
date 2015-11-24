// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import org.json.JSONObject;

public class an
{
    public JSONObject a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //     5: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //     8: ldc             "Crashlytics"
        //    10: ldc             "Reading cached settings..."
        //    12: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    17: new             Ljava/io/File;
        //    20: dup            
        //    21: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    24: invokevirtual   com/crashlytics/android/internal/cl.i:()Ljava/io/File;
        //    27: ldc             "com.crashlytics.settings.json"
        //    29: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    32: astore_2       
        //    33: aload_2        
        //    34: invokevirtual   java/io/File.exists:()Z
        //    37: ifeq            78
        //    40: new             Ljava/io/FileInputStream;
        //    43: dup            
        //    44: aload_2        
        //    45: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    48: astore          5
        //    50: new             Lorg/json/JSONObject;
        //    53: dup            
        //    54: aload           5
        //    56: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/InputStream;)Ljava/lang/String;
        //    59: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    62: astore          6
        //    64: aload           5
        //    66: astore          7
        //    68: aload           7
        //    70: ldc             "Error while closing settings cache file."
        //    72: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    75: aload           6
        //    77: areturn        
        //    78: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    81: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    84: ldc             "Crashlytics"
        //    86: ldc             "No cached settings found."
        //    88: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    93: aconst_null    
        //    94: astore          6
        //    96: aconst_null    
        //    97: astore          7
        //    99: goto            68
        //   102: astore          4
        //   104: aconst_null    
        //   105: astore          5
        //   107: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   110: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   113: ldc             "Crashlytics"
        //   115: ldc             "Failed to fetch cached settings"
        //   117: aload           4
        //   119: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   124: aload           5
        //   126: ldc             "Error while closing settings cache file."
        //   128: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   131: aconst_null    
        //   132: areturn        
        //   133: astore_3       
        //   134: aload_1        
        //   135: ldc             "Error while closing settings cache file."
        //   137: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   140: aload_3        
        //   141: athrow         
        //   142: astore_3       
        //   143: aload           5
        //   145: astore_1       
        //   146: goto            134
        //   149: astore          4
        //   151: goto            107
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     50     102    107    Ljava/lang/Exception;
        //  17     50     133    134    Any
        //  50     64     149    154    Ljava/lang/Exception;
        //  50     64     142    149    Any
        //  78     93     102    107    Ljava/lang/Exception;
        //  78     93     133    134    Any
        //  107    124    142    149    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
    
    public void a(final long p0, final JSONObject p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //     3: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //     6: ldc             "Crashlytics"
        //     8: ldc             "Writing settings to cache file..."
        //    10: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    15: aload_3        
        //    16: ifnull          75
        //    19: aconst_null    
        //    20: astore          4
        //    22: aload_3        
        //    23: ldc             "expires_at"
        //    25: lload_1        
        //    26: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;J)Lorg/json/JSONObject;
        //    29: pop            
        //    30: new             Ljava/io/FileWriter;
        //    33: dup            
        //    34: new             Ljava/io/File;
        //    37: dup            
        //    38: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    41: invokevirtual   com/crashlytics/android/internal/cl.i:()Ljava/io/File;
        //    44: ldc             "com.crashlytics.settings.json"
        //    46: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    49: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;)V
        //    52: astore          7
        //    54: aload           7
        //    56: aload_3        
        //    57: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //    60: invokevirtual   java/io/FileWriter.write:(Ljava/lang/String;)V
        //    63: aload           7
        //    65: invokevirtual   java/io/FileWriter.flush:()V
        //    68: aload           7
        //    70: ldc             "Failed to close settings writer."
        //    72: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    75: return         
        //    76: astore          6
        //    78: aconst_null    
        //    79: astore          7
        //    81: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    84: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    87: ldc             "Crashlytics"
        //    89: ldc             "Failed to cache settings"
        //    91: aload           6
        //    93: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //    98: aload           7
        //   100: ldc             "Failed to close settings writer."
        //   102: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   105: return         
        //   106: astore          5
        //   108: aload           4
        //   110: ldc             "Failed to close settings writer."
        //   112: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   115: aload           5
        //   117: athrow         
        //   118: astore          5
        //   120: aload           7
        //   122: astore          4
        //   124: goto            108
        //   127: astore          6
        //   129: goto            81
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  22     54     76     81     Ljava/lang/Exception;
        //  22     54     106    108    Any
        //  54     68     127    132    Ljava/lang/Exception;
        //  54     68     118    127    Any
        //  81     98     118    127    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0075:
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
