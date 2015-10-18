// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import com.twitter.library.telephony.TelephonyUtil;
import android.content.pm.PackageInfo;
import android.content.Context;

public class ag
{
    private final String a;
    
    public ag(final Context p0, final PackageInfo p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: ldc             "TwitterAndroid"
        //    10: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    13: astore          4
        //    15: aload_2        
        //    16: ifnull          379
        //    19: aload           4
        //    21: bipush          47
        //    23: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    26: aload_3        
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: ldc             " ("
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    35: aload_2        
        //    36: getfield        android/content/pm/PackageInfo.versionCode:I
        //    39: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    42: bipush          45
        //    44: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    47: pop            
        //    48: invokestatic    com/twitter/library/client/App.b:()Z
        //    51: ifeq            322
        //    54: aload           4
        //    56: invokestatic    com/twitter/library/client/App.j:()Ljava/lang/String;
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    62: bipush          45
        //    64: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    67: pop            
        //    68: aload           4
        //    70: invokestatic    com/twitter/library/client/App.k:()I
        //    73: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    76: bipush          41
        //    78: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    81: pop            
        //    82: new             Ljava/io/File;
        //    85: dup            
        //    86: ldc             "/system/vendor/twitter/preload"
        //    88: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    91: astore          13
        //    93: aload           13
        //    95: invokevirtual   java/io/File.exists:()Z
        //    98: istore          14
        //   100: iconst_0       
        //   101: istore          6
        //   103: aconst_null    
        //   104: astore          7
        //   106: iload           14
        //   108: ifeq            148
        //   111: new             Ljava/io/BufferedReader;
        //   114: dup            
        //   115: new             Ljava/io/FileReader;
        //   118: dup            
        //   119: aload           13
        //   121: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //   124: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   127: astore          16
        //   129: aload           16
        //   131: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   134: astore          19
        //   136: aload           19
        //   138: astore          7
        //   140: iconst_2       
        //   141: istore          6
        //   143: aload           16
        //   145: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   148: aload_1        
        //   149: invokestatic    com/twitter/library/util/an.b:(Landroid/content/Context;)Z
        //   152: ifeq            166
        //   155: iload           6
        //   157: bipush          8
        //   159: ior            
        //   160: istore          6
        //   162: aload_1        
        //   163: invokestatic    com/twitter/library/util/an.c:(Landroid/content/Context;)V
        //   166: aload_2        
        //   167: getfield        android/content/pm/PackageInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //   170: astore          15
        //   172: aload           15
        //   174: ifnull          205
        //   177: iconst_1       
        //   178: aload           15
        //   180: getfield        android/content/pm/ApplicationInfo.flags:I
        //   183: iand           
        //   184: ifne            199
        //   187: sipush          128
        //   190: aload           15
        //   192: getfield        android/content/pm/ApplicationInfo.flags:I
        //   195: iand           
        //   196: ifeq            205
        //   199: iload           6
        //   201: iconst_1       
        //   202: ior            
        //   203: istore          6
        //   205: aload           4
        //   207: bipush          32
        //   209: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   212: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   215: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   218: bipush          47
        //   220: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   223: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //   226: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   229: ldc             " ("
        //   231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   234: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //   237: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   240: bipush          59
        //   242: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   245: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   251: bipush          59
        //   253: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   256: getstatic       android/os/Build.BRAND:Ljava/lang/String;
        //   259: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   262: bipush          59
        //   264: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   267: getstatic       android/os/Build.PRODUCT:Ljava/lang/String;
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: bipush          59
        //   275: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   278: iload           6
        //   280: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   283: bipush          59
        //   285: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   288: pop            
        //   289: aload           7
        //   291: ifnull          312
        //   294: aload           7
        //   296: ldc             "[a-zA-Z0-9-]{10,30}"
        //   298: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //   301: ifeq            312
        //   304: aload           4
        //   306: aload           7
        //   308: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   311: pop            
        //   312: aload_0        
        //   313: aload           4
        //   315: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   318: putfield        com/twitter/library/network/ag.a:Ljava/lang/String;
        //   321: return         
        //   322: invokestatic    com/twitter/library/client/App.a:()Z
        //   325: ifeq            339
        //   328: aload           4
        //   330: ldc             "d-"
        //   332: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   335: pop            
        //   336: goto            68
        //   339: aload           4
        //   341: ldc             "r-"
        //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   346: pop            
        //   347: goto            68
        //   350: astore          20
        //   352: aconst_null    
        //   353: astore          16
        //   355: aload           16
        //   357: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   360: iconst_0       
        //   361: istore          6
        //   363: aconst_null    
        //   364: astore          7
        //   366: goto            148
        //   369: astore          18
        //   371: aload           7
        //   373: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   376: aload           18
        //   378: athrow         
        //   379: aload           4
        //   381: ldc             "/3.0.0 (^_^)"
        //   383: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   386: pop            
        //   387: iconst_0       
        //   388: istore          6
        //   390: aconst_null    
        //   391: astore          7
        //   393: goto            205
        //   396: astore          18
        //   398: aload           16
        //   400: astore          7
        //   402: goto            371
        //   405: astore          17
        //   407: goto            355
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  111    129    350    355    Ljava/io/IOException;
        //  111    129    369    371    Any
        //  129    136    405    410    Ljava/io/IOException;
        //  129    136    396    405    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0148:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.a);
        int n;
        if (TelephonyUtil.a() != null && TelephonyUtil.a().equals("wifi")) {
            n = 1;
        }
        else {
            n = 0;
        }
        final StringBuilder append = sb.append(";");
        String s;
        if (n != 0) {
            s = "1";
        }
        else {
            s = "0";
        }
        append.append(s).append(")");
        return sb.toString();
    }
}
