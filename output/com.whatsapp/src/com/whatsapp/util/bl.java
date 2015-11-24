// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.ArrayList;
import java.io.File;

public class bl
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "`Il";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0005';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = '\u0016';
                        break;
                    }
                    case 3: {
                        c2 = '\u0011';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "`Il";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "`Il";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "`Z{a";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "`Il";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static File a(final File file) {
        return ba.b(file, bl.z[4]);
    }
    
    public static void a(final File file, final int n) {
        ba.a(file, n, bl.z[0]);
    }
    
    public static boolean a(final File file, final File file2) {
        return ba.c(file, file2);
    }
    
    public static File b(final File p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   java/io/File.exists:()Z
        //     8: ifeq            543
        //    11: aload_0        
        //    12: new             Ljava/util/Date;
        //    15: dup            
        //    16: invokespecial   java/util/Date.<init>:()V
        //    19: getstatic       com/whatsapp/util/bl.z:[Ljava/lang/String;
        //    22: iconst_2       
        //    23: aaload         
        //    24: invokestatic    com/whatsapp/util/ba.a:(Ljava/io/File;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;
        //    27: astore_3       
        //    28: new             Ljava/io/File;
        //    31: dup            
        //    32: aload_0        
        //    33: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    36: aload_3        
        //    37: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    40: astore          4
        //    42: new             Ljava/io/File;
        //    45: dup            
        //    46: aload_0        
        //    47: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    50: new             Ljava/lang/StringBuilder;
        //    53: dup            
        //    54: invokespecial   java/lang/StringBuilder.<init>:()V
        //    57: aload_3        
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: getstatic       com/whatsapp/util/bl.z:[Ljava/lang/String;
        //    64: iconst_3       
        //    65: aaload         
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    72: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    75: astore          5
        //    77: new             Ljava/util/zip/GZIPOutputStream;
        //    80: dup            
        //    81: new             Ljava/io/FileOutputStream;
        //    84: dup            
        //    85: aload           5
        //    87: iconst_0       
        //    88: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;Z)V
        //    91: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    94: astore          6
        //    96: ldc             32768
        //    98: newarray        B
        //   100: astore          25
        //   102: aload           4
        //   104: invokevirtual   java/io/File.length:()J
        //   107: lconst_0       
        //   108: lcmp           
        //   109: ifle            188
        //   112: new             Ljava/io/BufferedInputStream;
        //   115: dup            
        //   116: new             Ljava/util/zip/GZIPInputStream;
        //   119: dup            
        //   120: new             Ljava/io/FileInputStream;
        //   123: dup            
        //   124: aload           4
        //   126: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   129: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;)V
        //   132: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //   135: astore          26
        //   137: aload           26
        //   139: aload           25
        //   141: iconst_0       
        //   142: aload           25
        //   144: arraylength    
        //   145: invokevirtual   java/io/BufferedInputStream.read:([BII)I
        //   148: istore          27
        //   150: iload           27
        //   152: iconst_m1      
        //   153: if_icmpeq       183
        //   156: aload           6
        //   158: aload           25
        //   160: iconst_0       
        //   161: iload           27
        //   163: invokevirtual   java/util/zip/GZIPOutputStream.write:([BII)V
        //   166: aload           26
        //   168: aload           25
        //   170: iconst_0       
        //   171: aload           25
        //   173: arraylength    
        //   174: invokevirtual   java/io/BufferedInputStream.read:([BII)I
        //   177: istore          27
        //   179: iload_2        
        //   180: ifeq            150
        //   183: aload           26
        //   185: invokevirtual   java/io/BufferedInputStream.close:()V
        //   188: new             Ljava/io/BufferedInputStream;
        //   191: dup            
        //   192: new             Ljava/io/FileInputStream;
        //   195: dup            
        //   196: aload_1        
        //   197: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   200: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //   203: astore          28
        //   205: aload           28
        //   207: aload           25
        //   209: iconst_0       
        //   210: aload           25
        //   212: arraylength    
        //   213: invokevirtual   java/io/BufferedInputStream.read:([BII)I
        //   216: istore          29
        //   218: iload           29
        //   220: iconst_m1      
        //   221: if_icmpeq       251
        //   224: aload           6
        //   226: aload           25
        //   228: iconst_0       
        //   229: iload           29
        //   231: invokevirtual   java/util/zip/GZIPOutputStream.write:([BII)V
        //   234: aload           28
        //   236: aload           25
        //   238: iconst_0       
        //   239: aload           25
        //   241: arraylength    
        //   242: invokevirtual   java/io/BufferedInputStream.read:([BII)I
        //   245: istore          29
        //   247: iload_2        
        //   248: ifeq            218
        //   251: aload           28
        //   253: invokevirtual   java/io/BufferedInputStream.close:()V
        //   256: aload           6
        //   258: invokevirtual   java/util/zip/GZIPOutputStream.close:()V
        //   261: aload           5
        //   263: aload           4
        //   265: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   268: pop            
        //   269: iconst_0       
        //   270: ifeq            277
        //   273: aconst_null    
        //   274: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   277: aload           5
        //   279: ifnull          320
        //   282: aload           5
        //   284: invokevirtual   java/io/File.exists:()Z
        //   287: istore          35
        //   289: iload           35
        //   291: ifeq            320
        //   294: aload           5
        //   296: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   299: aload           4
        //   301: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   304: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   307: istore          36
        //   309: iload           36
        //   311: ifne            320
        //   314: aload           5
        //   316: invokevirtual   java/io/File.delete:()Z
        //   319: pop            
        //   320: iconst_0       
        //   321: ifeq            330
        //   324: aconst_null    
        //   325: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   330: aload           4
        //   332: invokevirtual   java/io/File.exists:()Z
        //   335: istore          17
        //   337: iload           17
        //   339: ifeq            543
        //   342: aload           4
        //   344: areturn        
        //   345: astore          32
        //   347: aload           32
        //   349: athrow         
        //   350: astore          33
        //   352: aload           33
        //   354: athrow         
        //   355: astore          34
        //   357: aload           34
        //   359: athrow         
        //   360: astore          31
        //   362: aload           31
        //   364: athrow         
        //   365: astore          14
        //   367: iconst_0       
        //   368: ifeq            375
        //   371: aconst_null    
        //   372: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   375: aload           5
        //   377: ifnull          418
        //   380: aload           5
        //   382: invokevirtual   java/io/File.exists:()Z
        //   385: istore          21
        //   387: iload           21
        //   389: ifeq            418
        //   392: aload           5
        //   394: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   397: aload           4
        //   399: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   402: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   405: istore          22
        //   407: iload           22
        //   409: ifne            418
        //   412: aload           5
        //   414: invokevirtual   java/io/File.delete:()Z
        //   417: pop            
        //   418: iconst_0       
        //   419: ifeq            330
        //   422: aconst_null    
        //   423: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   428: goto            330
        //   431: astore          15
        //   433: aload           15
        //   435: athrow         
        //   436: astore          24
        //   438: aload           24
        //   440: athrow         
        //   441: astore          18
        //   443: aload           18
        //   445: athrow         
        //   446: astore          19
        //   448: aload           19
        //   450: athrow         
        //   451: astore          20
        //   453: aload           20
        //   455: athrow         
        //   456: astore          7
        //   458: iconst_0       
        //   459: ifeq            466
        //   462: aconst_null    
        //   463: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   466: aload           5
        //   468: ifnull          505
        //   471: aload           5
        //   473: invokevirtual   java/io/File.exists:()Z
        //   476: istore          11
        //   478: iload           11
        //   480: ifeq            505
        //   483: aload           5
        //   485: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   488: aload           4
        //   490: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   493: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   496: ifne            505
        //   499: aload           5
        //   501: invokevirtual   java/io/File.delete:()Z
        //   504: pop            
        //   505: iconst_0       
        //   506: ifeq            515
        //   509: aconst_null    
        //   510: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   515: aload           7
        //   517: athrow         
        //   518: astore          13
        //   520: aload           13
        //   522: athrow         
        //   523: astore          9
        //   525: aload           9
        //   527: athrow         
        //   528: astore          10
        //   530: aload           10
        //   532: athrow         
        //   533: astore          8
        //   535: aload           8
        //   537: athrow         
        //   538: astore          16
        //   540: aload           16
        //   542: athrow         
        //   543: aconst_null    
        //   544: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  77     150    365    456    Ljava/io/FileNotFoundException;
        //  77     150    456    538    Any
        //  156    179    365    456    Ljava/io/FileNotFoundException;
        //  156    179    456    538    Any
        //  183    188    365    456    Ljava/io/FileNotFoundException;
        //  183    188    456    538    Any
        //  188    218    365    456    Ljava/io/FileNotFoundException;
        //  188    218    456    538    Any
        //  224    247    365    456    Ljava/io/FileNotFoundException;
        //  224    247    456    538    Any
        //  251    269    365    456    Ljava/io/FileNotFoundException;
        //  251    269    456    538    Any
        //  282    289    345    350    Ljava/io/FileNotFoundException;
        //  294    309    350    355    Ljava/io/FileNotFoundException;
        //  314    320    355    360    Ljava/io/FileNotFoundException;
        //  324    330    360    365    Ljava/io/FileNotFoundException;
        //  330    337    538    543    Ljava/io/FileNotFoundException;
        //  347    350    350    355    Ljava/io/FileNotFoundException;
        //  352    355    355    360    Ljava/io/FileNotFoundException;
        //  371    375    436    441    Ljava/io/FileNotFoundException;
        //  380    387    441    446    Ljava/io/FileNotFoundException;
        //  392    407    446    451    Ljava/io/FileNotFoundException;
        //  412    418    451    456    Ljava/io/FileNotFoundException;
        //  422    428    431    436    Ljava/io/FileNotFoundException;
        //  443    446    446    451    Ljava/io/FileNotFoundException;
        //  448    451    451    456    Ljava/io/FileNotFoundException;
        //  462    466    518    523    Ljava/io/FileNotFoundException;
        //  471    478    523    528    Ljava/io/FileNotFoundException;
        //  483    505    528    533    Ljava/io/FileNotFoundException;
        //  509    515    533    538    Ljava/io/FileNotFoundException;
        //  525    528    528    533    Ljava/io/FileNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 263, Size: 263
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    public static ArrayList b(final File file, final int n) {
        return ba.b(file, n, bl.z[1]);
    }
}
