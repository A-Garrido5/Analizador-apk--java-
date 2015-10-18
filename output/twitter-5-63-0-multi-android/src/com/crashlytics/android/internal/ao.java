// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import org.json.JSONObject;

final class ao extends y implements bz
{
    public ao(final String s, final String s2, final bu bu) {
        this(s, s2, bu, ax.a);
    }
    
    private ao(final String s, final String s2, final bu bu, final ax ax) {
        super(s, s2, bu, ax);
    }
    
    @Override
    public final JSONObject a(final bb p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/util/HashMap;
        //     3: dup            
        //     4: invokespecial   java/util/HashMap.<init>:()V
        //     7: astore_2       
        //     8: aload_2        
        //     9: ldc             "build_version"
        //    11: aload_1        
        //    12: getfield        com/crashlytics/android/internal/bb.e:Ljava/lang/String;
        //    15: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    20: pop            
        //    21: aload_2        
        //    22: ldc             "display_version"
        //    24: aload_1        
        //    25: getfield        com/crashlytics/android/internal/bb.d:Ljava/lang/String;
        //    28: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    33: pop            
        //    34: aload_2        
        //    35: ldc             "source"
        //    37: aload_1        
        //    38: getfield        com/crashlytics/android/internal/bb.f:I
        //    41: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    44: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    49: pop            
        //    50: aload_1        
        //    51: getfield        com/crashlytics/android/internal/bb.g:Ljava/lang/String;
        //    54: ifnull          70
        //    57: aload_2        
        //    58: ldc             "icon_hash"
        //    60: aload_1        
        //    61: getfield        com/crashlytics/android/internal/bb.g:Ljava/lang/String;
        //    64: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    69: pop            
        //    70: aload_1        
        //    71: getfield        com/crashlytics/android/internal/bb.c:Ljava/lang/String;
        //    74: astore          9
        //    76: aload           9
        //    78: invokestatic    com/crashlytics/android/internal/bd.e:(Ljava/lang/String;)Z
        //    81: ifne            95
        //    84: aload_2        
        //    85: ldc             "instance"
        //    87: aload           9
        //    89: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    94: pop            
        //    95: aload_0        
        //    96: aload_2        
        //    97: invokevirtual   com/crashlytics/android/internal/ao.a:(Ljava/util/Map;)Lcom/crashlytics/android/internal/bw;
        //   100: astore          10
        //   102: aload           10
        //   104: astore          4
        //   106: aload           4
        //   108: ldc             "X-CRASHLYTICS-API-KEY"
        //   110: aload_1        
        //   111: getfield        com/crashlytics/android/internal/bb.a:Ljava/lang/String;
        //   114: invokevirtual   com/crashlytics/android/internal/bw.a:(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/internal/bw;
        //   117: ldc             "X-CRASHLYTICS-API-CLIENT-TYPE"
        //   119: ldc             "android"
        //   121: invokevirtual   com/crashlytics/android/internal/bw.a:(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/internal/bw;
        //   124: ldc             "X-CRASHLYTICS-D"
        //   126: aload_1        
        //   127: getfield        com/crashlytics/android/internal/bb.b:Ljava/lang/String;
        //   130: invokevirtual   com/crashlytics/android/internal/bw.a:(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/internal/bw;
        //   133: ldc             "X-CRASHLYTICS-API-CLIENT-VERSION"
        //   135: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   138: invokevirtual   com/crashlytics/android/internal/cl.f:()Ljava/lang/String;
        //   141: invokevirtual   com/crashlytics/android/internal/bw.a:(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/internal/bw;
        //   144: ldc             "Accept"
        //   146: ldc             "application/json"
        //   148: invokevirtual   com/crashlytics/android/internal/bw.a:(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/internal/bw;
        //   151: astore          4
        //   153: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   156: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   159: ldc             "Crashlytics"
        //   161: new             Ljava/lang/StringBuilder;
        //   164: dup            
        //   165: ldc             "Requesting settings from "
        //   167: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   170: aload_0        
        //   171: invokevirtual   com/crashlytics/android/internal/ao.a:()Ljava/lang/String;
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   180: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   185: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   188: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   191: ldc             "Crashlytics"
        //   193: new             Ljava/lang/StringBuilder;
        //   196: dup            
        //   197: ldc             "Settings query params were: "
        //   199: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   202: aload_2        
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   206: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   209: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   214: new             Lorg/json/JSONObject;
        //   217: dup            
        //   218: aload           4
        //   220: invokevirtual   com/crashlytics/android/internal/bw.c:()Ljava/lang/String;
        //   223: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   226: astore          11
        //   228: aload           4
        //   230: ifnull          268
        //   233: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   236: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   239: ldc             "Crashlytics"
        //   241: new             Ljava/lang/StringBuilder;
        //   244: dup            
        //   245: ldc             "Settings request ID: "
        //   247: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   250: aload           4
        //   252: ldc             "X-REQUEST-ID"
        //   254: invokevirtual   com/crashlytics/android/internal/bw.a:(Ljava/lang/String;)Ljava/lang/String;
        //   257: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   260: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   263: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   268: aload           11
        //   270: areturn        
        //   271: astore          5
        //   273: aconst_null    
        //   274: astore          4
        //   276: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   279: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   282: ldc             "Crashlytics"
        //   284: new             Ljava/lang/StringBuilder;
        //   287: dup            
        //   288: ldc             "Failed to retrieve settings from "
        //   290: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   293: aload_0        
        //   294: invokevirtual   com/crashlytics/android/internal/ao.a:()Ljava/lang/String;
        //   297: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   300: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   303: aload           5
        //   305: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   310: aload           4
        //   312: ifnull          407
        //   315: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   318: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   321: ldc             "Crashlytics"
        //   323: new             Ljava/lang/StringBuilder;
        //   326: dup            
        //   327: ldc             "Settings request ID: "
        //   329: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   332: aload           4
        //   334: ldc             "X-REQUEST-ID"
        //   336: invokevirtual   com/crashlytics/android/internal/bw.a:(Ljava/lang/String;)Ljava/lang/String;
        //   339: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   342: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   345: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   350: aconst_null    
        //   351: areturn        
        //   352: astore_3       
        //   353: aconst_null    
        //   354: astore          4
        //   356: aload           4
        //   358: ifnull          396
        //   361: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   364: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   367: ldc             "Crashlytics"
        //   369: new             Ljava/lang/StringBuilder;
        //   372: dup            
        //   373: ldc             "Settings request ID: "
        //   375: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   378: aload           4
        //   380: ldc             "X-REQUEST-ID"
        //   382: invokevirtual   com/crashlytics/android/internal/bw.a:(Ljava/lang/String;)Ljava/lang/String;
        //   385: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   388: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   391: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   396: aload_3        
        //   397: athrow         
        //   398: astore_3       
        //   399: goto            356
        //   402: astore          5
        //   404: goto            276
        //   407: aconst_null    
        //   408: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      70     271    276    Ljava/lang/Exception;
        //  0      70     352    356    Any
        //  70     95     271    276    Ljava/lang/Exception;
        //  70     95     352    356    Any
        //  95     102    271    276    Ljava/lang/Exception;
        //  95     102    352    356    Any
        //  106    228    402    407    Ljava/lang/Exception;
        //  106    228    398    402    Any
        //  276    310    398    402    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0268:
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
