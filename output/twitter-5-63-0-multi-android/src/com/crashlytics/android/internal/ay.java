// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import org.json.JSONObject;

public class ay
{
    private bb a;
    private final ba b;
    private final bi c;
    private final an d;
    private final bz e;
    
    public ay(final bb a, final bi c, final ba b, final an d, final bz e) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    private void a(JSONObject a, final String s) {
        if (!bd.e(cl.a().w())) {
            a = this.b.a(a);
        }
        cl.a().b().a("Crashlytics", s + a.toString());
    }
    
    private az b(final aV p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/crashlytics/android/internal/aV.b:Lcom/crashlytics/android/internal/aV;
        //     3: aload_1        
        //     4: invokevirtual   com/crashlytics/android/internal/aV.equals:(Ljava/lang/Object;)Z
        //     7: ifne            198
        //    10: aload_0        
        //    11: getfield        com/crashlytics/android/internal/ay.d:Lcom/crashlytics/android/internal/an;
        //    14: invokevirtual   com/crashlytics/android/internal/an.a:()Lorg/json/JSONObject;
        //    17: astore          5
        //    19: aload           5
        //    21: ifnull          150
        //    24: aload_0        
        //    25: getfield        com/crashlytics/android/internal/ay.b:Lcom/crashlytics/android/internal/ba;
        //    28: aload_0        
        //    29: getfield        com/crashlytics/android/internal/ay.c:Lcom/crashlytics/android/internal/bi;
        //    32: aload           5
        //    34: invokevirtual   com/crashlytics/android/internal/ba.a:(Lcom/crashlytics/android/internal/bi;Lorg/json/JSONObject;)Lcom/crashlytics/android/internal/az;
        //    37: astore_3       
        //    38: aload_3        
        //    39: ifnull          132
        //    42: aload_0        
        //    43: aload           5
        //    45: ldc             "Loaded cached settings: "
        //    47: invokespecial   com/crashlytics/android/internal/ay.a:(Lorg/json/JSONObject;Ljava/lang/String;)V
        //    50: aload_0        
        //    51: getfield        com/crashlytics/android/internal/ay.c:Lcom/crashlytics/android/internal/bi;
        //    54: invokevirtual   com/crashlytics/android/internal/bi.a:()J
        //    57: lstore          6
        //    59: getstatic       com/crashlytics/android/internal/aV.c:Lcom/crashlytics/android/internal/aV;
        //    62: aload_1        
        //    63: invokevirtual   com/crashlytics/android/internal/aV.equals:(Ljava/lang/Object;)Z
        //    66: ifne            91
        //    69: aload_3        
        //    70: getfield        com/crashlytics/android/internal/az.f:J
        //    73: lstore          8
        //    75: lload           8
        //    77: lload           6
        //    79: lcmp           
        //    80: ifge            108
        //    83: iconst_1       
        //    84: istore          10
        //    86: iload           10
        //    88: ifne            114
        //    91: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    94: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    97: ldc             "Crashlytics"
        //    99: ldc             "Returning cached settings."
        //   101: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   106: aload_3        
        //   107: areturn        
        //   108: iconst_0       
        //   109: istore          10
        //   111: goto            86
        //   114: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   117: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   120: ldc             "Crashlytics"
        //   122: ldc             "Cached settings have expired."
        //   124: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   129: goto            198
        //   132: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   135: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   138: ldc             "Crashlytics"
        //   140: ldc             "Failed to transform cached settings data."
        //   142: aconst_null    
        //   143: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   148: aconst_null    
        //   149: areturn        
        //   150: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   153: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   156: ldc             "Crashlytics"
        //   158: ldc             "No cached settings data found."
        //   160: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   165: goto            198
        //   168: astore_2       
        //   169: aconst_null    
        //   170: astore_3       
        //   171: aload_2        
        //   172: astore          4
        //   174: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   177: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   180: ldc             "Crashlytics"
        //   182: ldc             "Failed to get cached settings"
        //   184: aload           4
        //   186: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   191: aload_3        
        //   192: areturn        
        //   193: astore          4
        //   195: goto            174
        //   198: aconst_null    
        //   199: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      19     168    174    Ljava/lang/Exception;
        //  24     38     168    174    Ljava/lang/Exception;
        //  42     75     168    174    Ljava/lang/Exception;
        //  91     106    193    198    Ljava/lang/Exception;
        //  114    129    168    174    Ljava/lang/Exception;
        //  132    148    168    174    Ljava/lang/Exception;
        //  150    165    168    174    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0091:
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
    
    public az a() {
        return this.a(aV.a);
    }
    
    public az a(final aV p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //     3: invokevirtual   com/crashlytics/android/internal/cl.g:()Z
        //     6: istore          5
        //     8: aconst_null    
        //     9: astore          6
        //    11: iload           5
        //    13: ifne            27
        //    16: aload_0        
        //    17: aload_1        
        //    18: invokespecial   com/crashlytics/android/internal/ay.b:(Lcom/crashlytics/android/internal/aV;)Lcom/crashlytics/android/internal/az;
        //    21: astore          7
        //    23: aload           7
        //    25: astore          6
        //    27: aload           6
        //    29: ifnonnull       89
        //    32: aload_0        
        //    33: getfield        com/crashlytics/android/internal/ay.e:Lcom/crashlytics/android/internal/bz;
        //    36: aload_0        
        //    37: getfield        com/crashlytics/android/internal/ay.a:Lcom/crashlytics/android/internal/bb;
        //    40: invokeinterface com/crashlytics/android/internal/bz.a:(Lcom/crashlytics/android/internal/bb;)Lorg/json/JSONObject;
        //    45: astore          10
        //    47: aload           10
        //    49: ifnull          89
        //    52: aload_0        
        //    53: getfield        com/crashlytics/android/internal/ay.b:Lcom/crashlytics/android/internal/ba;
        //    56: aload_0        
        //    57: getfield        com/crashlytics/android/internal/ay.c:Lcom/crashlytics/android/internal/bi;
        //    60: aload           10
        //    62: invokevirtual   com/crashlytics/android/internal/ba.a:(Lcom/crashlytics/android/internal/bi;Lorg/json/JSONObject;)Lcom/crashlytics/android/internal/az;
        //    65: astore          6
        //    67: aload_0        
        //    68: getfield        com/crashlytics/android/internal/ay.d:Lcom/crashlytics/android/internal/an;
        //    71: aload           6
        //    73: getfield        com/crashlytics/android/internal/az.f:J
        //    76: aload           10
        //    78: invokevirtual   com/crashlytics/android/internal/an.a:(JLorg/json/JSONObject;)V
        //    81: aload_0        
        //    82: aload           10
        //    84: ldc             "Loaded settings: "
        //    86: invokespecial   com/crashlytics/android/internal/ay.a:(Lorg/json/JSONObject;Ljava/lang/String;)V
        //    89: aload           6
        //    91: astore_3       
        //    92: aload_3        
        //    93: ifnonnull       108
        //    96: aload_0        
        //    97: getstatic       com/crashlytics/android/internal/aV.c:Lcom/crashlytics/android/internal/aV;
        //   100: invokespecial   com/crashlytics/android/internal/ay.b:(Lcom/crashlytics/android/internal/aV;)Lcom/crashlytics/android/internal/az;
        //   103: astore          8
        //   105: aload           8
        //   107: astore_3       
        //   108: aload_3        
        //   109: areturn        
        //   110: astore_2       
        //   111: aconst_null    
        //   112: astore_3       
        //   113: aload_2        
        //   114: astore          4
        //   116: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   119: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   122: ldc             "Crashlytics"
        //   124: ldc             "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved."
        //   126: aload           4
        //   128: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   133: aload_3        
        //   134: areturn        
        //   135: astore          9
        //   137: aload           6
        //   139: astore_3       
        //   140: aload           9
        //   142: astore          4
        //   144: goto            116
        //   147: astore          4
        //   149: goto            116
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      8      110    116    Ljava/lang/Exception;
        //  16     23     110    116    Ljava/lang/Exception;
        //  32     47     135    147    Ljava/lang/Exception;
        //  52     89     135    147    Ljava/lang/Exception;
        //  96     105    147    152    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 73, Size: 73
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
