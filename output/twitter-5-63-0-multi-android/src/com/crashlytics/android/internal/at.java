// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.Locale;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class at
{
    private final AtomicReference a;
    private ay b;
    private boolean c;
    
    private at() {
        this.a = new AtomicReference();
        this.c = false;
    }
    
    public static at a() {
        return au.a;
    }
    
    private static String a(final String p0, final String p1, final Context p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ldc             "\\."
        //     3: new             Ljava/lang/StringBuffer;
        //     6: dup            
        //     7: new             Ljava/lang/String;
        //    10: dup            
        //    11: iconst_3       
        //    12: newarray        C
        //    14: dup            
        //    15: iconst_0       
        //    16: ldc             115
        //    18: castore        
        //    19: dup            
        //    20: iconst_1       
        //    21: ldc             108
        //    23: castore        
        //    24: dup            
        //    25: iconst_2       
        //    26: ldc             99
        //    28: castore        
        //    29: invokespecial   java/lang/String.<init>:([C)V
        //    32: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //    35: invokevirtual   java/lang/StringBuffer.reverse:()Ljava/lang/StringBuffer;
        //    38: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //    41: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    44: astore          5
        //    46: iconst_1       
        //    47: new             Ljava/lang/StringBuilder;
        //    50: dup            
        //    51: invokespecial   java/lang/StringBuilder.<init>:()V
        //    54: aload_0        
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: aload           5
        //    60: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    63: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    66: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/lang/String;)Ljava/lang/String;
        //    69: invokestatic    com/crashlytics/android/internal/bd.b:(ILjava/lang/String;)Ljavax/crypto/Cipher;
        //    72: astore          6
        //    74: new             Lorg/json/JSONObject;
        //    77: dup            
        //    78: invokespecial   org/json/JSONObject.<init>:()V
        //    81: astore          7
        //    83: new             Lcom/crashlytics/android/internal/bo;
        //    86: dup            
        //    87: aload_2        
        //    88: invokespecial   com/crashlytics/android/internal/bo.<init>:(Landroid/content/Context;)V
        //    91: astore          8
        //    93: aload           7
        //    95: ldc             "APPLICATION_INSTALLATION_UUID"
        //    97: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   100: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   103: aload           8
        //   105: invokevirtual   com/crashlytics/android/internal/bo.b:()Ljava/lang/String;
        //   108: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   111: pop            
        //   112: aload           8
        //   114: invokevirtual   com/crashlytics/android/internal/bo.f:()Ljava/util/Map;
        //   117: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   127: astore          10
        //   129: aload           10
        //   131: invokeinterface java/util/Iterator.hasNext:()Z
        //   136: ifeq            280
        //   139: aload           10
        //   141: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   146: checkcast       Ljava/util/Map$Entry;
        //   149: astore          17
        //   151: aload           7
        //   153: aload           17
        //   155: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   160: checkcast       Lcom/crashlytics/android/internal/ap;
        //   163: invokevirtual   com/crashlytics/android/internal/ap.name:()Ljava/lang/String;
        //   166: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   169: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   172: aload           17
        //   174: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   179: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   182: pop            
        //   183: goto            129
        //   186: astore          18
        //   188: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   191: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   194: ldc             "Crashlytics"
        //   196: new             Ljava/lang/StringBuilder;
        //   199: dup            
        //   200: ldc             "Could not write value to JSON: "
        //   202: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   205: aload           17
        //   207: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   212: checkcast       Lcom/crashlytics/android/internal/ap;
        //   215: invokevirtual   com/crashlytics/android/internal/ap.name:()Ljava/lang/String;
        //   218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   224: aload           18
        //   226: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   231: goto            129
        //   234: astore_3       
        //   235: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   238: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   241: ldc             "Crashlytics"
        //   243: ldc             "Could not create cipher to encrypt headers."
        //   245: aload_3        
        //   246: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   251: ldc             ""
        //   253: astore          4
        //   255: aload           4
        //   257: areturn        
        //   258: astore          9
        //   260: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   263: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   266: ldc             "Crashlytics"
        //   268: ldc             "Could not write application id to JSON"
        //   270: aload           9
        //   272: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   277: goto            112
        //   280: aload           7
        //   282: ldc             "os_version"
        //   284: aload           8
        //   286: invokevirtual   com/crashlytics/android/internal/bo.c:()Ljava/lang/String;
        //   289: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   292: pop            
        //   293: aload           7
        //   295: ldc             "model"
        //   297: aload           8
        //   299: invokevirtual   com/crashlytics/android/internal/bo.d:()Ljava/lang/String;
        //   302: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   305: pop            
        //   306: ldc             ""
        //   308: astore          4
        //   310: aload           7
        //   312: invokevirtual   org/json/JSONObject.length:()I
        //   315: ifle            255
        //   318: aload           6
        //   320: aload           7
        //   322: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   325: invokevirtual   java/lang/String.getBytes:()[B
        //   328: invokevirtual   javax/crypto/Cipher.doFinal:([B)[B
        //   331: invokestatic    com/crashlytics/android/internal/bd.a:([B)Ljava/lang/String;
        //   334: astore          14
        //   336: aload           14
        //   338: areturn        
        //   339: astore          11
        //   341: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   344: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   347: ldc             "Crashlytics"
        //   349: ldc             "Could not write OS version to JSON"
        //   351: aload           11
        //   353: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   358: goto            293
        //   361: astore          12
        //   363: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   366: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   369: ldc             "Crashlytics"
        //   371: ldc             "Could not write model to JSON"
        //   373: aload           12
        //   375: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   380: goto            306
        //   383: astore          13
        //   385: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   388: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   391: ldc             "Crashlytics"
        //   393: ldc             "Could not encrypt IDs"
        //   395: aload           13
        //   397: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   402: aload           4
        //   404: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  0      74     234    255    Ljava/security/GeneralSecurityException;
        //  93     112    258    280    Ljava/lang/Exception;
        //  151    183    186    234    Ljava/lang/Exception;
        //  280    293    339    361    Ljava/lang/Exception;
        //  293    306    361    383    Ljava/lang/Exception;
        //  318    336    383    405    Ljava/security/GeneralSecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 166, Size: 166
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
    
    public final at a(final Context context, final bu bu, final String s, final String s2, final String s3) {
        synchronized (this) {
            if (!this.c) {
                if (this.b == null) {
                    final String a = cj.a(context, false);
                    final String packageName = context.getPackageName();
                    this.b = new ay(new bb(a, a(a, packageName, context), bd.a(new String[] { bd.i(context) }), s2, s, ai.a(context.getPackageManager().getInstallerPackageName(packageName)).a(), bd.g(context)), new bi(), new ba(), new an(), new ao(s3, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", packageName), bu));
                }
                this.c = true;
            }
            return this;
        }
    }
    
    public final Object a(final aw aw, final Object o) {
        final az az = this.a.get();
        if (az == null) {
            return o;
        }
        return aw.a(az);
    }
    
    public final az b() {
        return this.a.get();
    }
    
    public final boolean c() {
        synchronized (this) {
            final az a = this.b.a();
            this.a.set(a);
            return a != null;
        }
    }
    
    public final boolean d() {
        synchronized (this) {
            final az a = this.b.a(aV.b);
            this.a.set(a);
            if (a == null) {
                cl.a().b().a("Crashlytics", "Failed to force reload of settings from Crashlytics.", null);
            }
            return a != null;
        }
    }
}
