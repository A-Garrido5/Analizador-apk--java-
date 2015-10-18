// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.File;
import java.util.List;

public class al
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[9];
        String s = "/b\u0016\f\u001a9j\u0019\u0001\u00138 \r\f\u0006e`\u0002\u0011V";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'v';
                        break;
                    }
                    case 0: {
                        c2 = 'J';
                        break;
                    }
                    case 1: {
                        c2 = '\u000f';
                        break;
                    }
                    case 2: {
                        c2 = 'w';
                        break;
                    }
                    case 3: {
                        c2 = 'e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "/b\u0016\f\u001a9j\u0019\u0001\u00138 \r\f\u0006e`\u0002\u0011V";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "&`\u0010\u0016X0f\u0007";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "/b\u0016\f\u001a9j\u0019\u0001\u00138 \r\f\u0006j";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "&`\u0010\u0016X0f\u0007";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "/b\u0016\f\u001a9j\u0019\u0001\u00138 \r\f\u0006ef\u0019E";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "/b\u0016\f\u001a9j\u0019\u0001\u00138 \r\f\u0006e`\u0002\u0011V";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "/b\u0016\f\u001a9j\u0019\u0001\u00138 \r\f\u0006ef\u0019E";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "/b\u0016\f\u001a9j\u0019\u0001\u00138 \r\f\u0006ef\u0019E";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static File a(final List p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: getstatic       com/whatsapp/util/Log.l:Z
        //     5: istore_3       
        //     6: aload_0        
        //     7: ifnull          579
        //    10: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //    13: astore          8
        //    15: aload           8
        //    17: ifnull          579
        //    20: aload_0        
        //    21: invokeinterface java/util/List.size:()I
        //    26: ifne            47
        //    29: goto            579
        //    32: astore          5
        //    34: aload           5
        //    36: athrow         
        //    37: astore          6
        //    39: aload           6
        //    41: athrow         
        //    42: astore          7
        //    44: aload           7
        //    46: athrow         
        //    47: iload_1        
        //    48: ifeq            269
        //    51: new             Ljava/io/File;
        //    54: dup            
        //    55: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //    58: getstatic       com/whatsapp/util/al.z:[Ljava/lang/String;
        //    61: iconst_4       
        //    62: aaload         
        //    63: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    66: astore          9
        //    68: new             Ljava/util/zip/ZipOutputStream;
        //    71: dup            
        //    72: new             Ljava/io/BufferedOutputStream;
        //    75: dup            
        //    76: new             Ljava/io/FileOutputStream;
        //    79: dup            
        //    80: aload           9
        //    82: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    85: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    88: invokespecial   java/util/zip/ZipOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    91: astore          10
        //    93: sipush          16384
        //    96: newarray        B
        //    98: astore          18
        //   100: aload_0        
        //   101: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   106: astore          19
        //   108: aload           19
        //   110: invokeinterface java/util/Iterator.hasNext:()Z
        //   115: ifeq            210
        //   118: aload           19
        //   120: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   125: checkcast       Ljava/io/File;
        //   128: astore          22
        //   130: new             Ljava/io/BufferedInputStream;
        //   133: dup            
        //   134: new             Ljava/io/FileInputStream;
        //   137: dup            
        //   138: aload           22
        //   140: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   143: sipush          16384
        //   146: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;I)V
        //   149: astore          12
        //   151: aload           10
        //   153: new             Ljava/util/zip/ZipEntry;
        //   156: dup            
        //   157: aload           22
        //   159: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   162: invokespecial   java/util/zip/ZipEntry.<init>:(Ljava/lang/String;)V
        //   165: invokevirtual   java/util/zip/ZipOutputStream.putNextEntry:(Ljava/util/zip/ZipEntry;)V
        //   168: aload           12
        //   170: aload           18
        //   172: iconst_0       
        //   173: sipush          16384
        //   176: invokevirtual   java/io/BufferedInputStream.read:([BII)I
        //   179: istore          23
        //   181: iload           23
        //   183: iconst_m1      
        //   184: if_icmpeq       201
        //   187: aload           10
        //   189: aload           18
        //   191: iconst_0       
        //   192: iload           23
        //   194: invokevirtual   java/util/zip/ZipOutputStream.write:([BII)V
        //   197: iload_3        
        //   198: ifeq            168
        //   201: aload           12
        //   203: invokevirtual   java/io/BufferedInputStream.close:()V
        //   206: iload_3        
        //   207: ifeq            108
        //   210: iconst_0       
        //   211: ifeq            218
        //   214: aconst_null    
        //   215: invokevirtual   java/io/BufferedInputStream.close:()V
        //   218: aload           9
        //   220: astore          4
        //   222: aload           10
        //   224: ifnull          582
        //   227: aload           10
        //   229: invokevirtual   java/util/zip/ZipOutputStream.close:()V
        //   232: aload           4
        //   234: areturn        
        //   235: astore          20
        //   237: new             Ljava/lang/StringBuilder;
        //   240: dup            
        //   241: invokespecial   java/lang/StringBuilder.<init>:()V
        //   244: getstatic       com/whatsapp/util/al.z:[Ljava/lang/String;
        //   247: bipush          6
        //   249: aaload         
        //   250: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   253: aload           20
        //   255: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   258: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   261: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   264: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   267: aconst_null    
        //   268: areturn        
        //   269: new             Ljava/io/File;
        //   272: dup            
        //   273: getstatic       com/whatsapp/App.T:Lcom/whatsapp/util/p;
        //   276: invokevirtual   com/whatsapp/util/p.a:()Ljava/io/File;
        //   279: getstatic       com/whatsapp/util/al.z:[Ljava/lang/String;
        //   282: iconst_2       
        //   283: aaload         
        //   284: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   287: astore          9
        //   289: goto            68
        //   292: astore          11
        //   294: aconst_null    
        //   295: astore          10
        //   297: aconst_null    
        //   298: astore          12
        //   300: new             Ljava/lang/StringBuilder;
        //   303: dup            
        //   304: invokespecial   java/lang/StringBuilder.<init>:()V
        //   307: getstatic       com/whatsapp/util/al.z:[Ljava/lang/String;
        //   310: iconst_3       
        //   311: aaload         
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: aload           11
        //   317: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   320: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   323: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   326: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   329: aload           12
        //   331: ifnull          339
        //   334: aload           12
        //   336: invokevirtual   java/io/BufferedInputStream.close:()V
        //   339: aload           10
        //   341: ifnull          349
        //   344: aload           10
        //   346: invokevirtual   java/util/zip/ZipOutputStream.close:()V
        //   349: aconst_null    
        //   350: areturn        
        //   351: astore          21
        //   353: new             Ljava/lang/StringBuilder;
        //   356: dup            
        //   357: invokespecial   java/lang/StringBuilder.<init>:()V
        //   360: getstatic       com/whatsapp/util/al.z:[Ljava/lang/String;
        //   363: iconst_5       
        //   364: aaload         
        //   365: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   368: aload           21
        //   370: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   373: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   376: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   379: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   382: aconst_null    
        //   383: astore          4
        //   385: goto            222
        //   388: astore          17
        //   390: new             Ljava/lang/StringBuilder;
        //   393: dup            
        //   394: invokespecial   java/lang/StringBuilder.<init>:()V
        //   397: getstatic       com/whatsapp/util/al.z:[Ljava/lang/String;
        //   400: bipush          7
        //   402: aaload         
        //   403: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   406: aload           17
        //   408: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   411: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   414: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   417: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   420: goto            339
        //   423: astore          16
        //   425: new             Ljava/lang/StringBuilder;
        //   428: dup            
        //   429: invokespecial   java/lang/StringBuilder.<init>:()V
        //   432: getstatic       com/whatsapp/util/al.z:[Ljava/lang/String;
        //   435: iconst_0       
        //   436: aaload         
        //   437: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   440: aload           16
        //   442: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   445: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   448: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   451: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   454: aconst_null    
        //   455: areturn        
        //   456: astore          13
        //   458: aconst_null    
        //   459: astore          10
        //   461: aload_2        
        //   462: ifnull          469
        //   465: aload_2        
        //   466: invokevirtual   java/io/BufferedInputStream.close:()V
        //   469: aload           10
        //   471: ifnull          479
        //   474: aload           10
        //   476: invokevirtual   java/util/zip/ZipOutputStream.close:()V
        //   479: aload           13
        //   481: athrow         
        //   482: astore          15
        //   484: new             Ljava/lang/StringBuilder;
        //   487: dup            
        //   488: invokespecial   java/lang/StringBuilder.<init>:()V
        //   491: getstatic       com/whatsapp/util/al.z:[Ljava/lang/String;
        //   494: bipush          8
        //   496: aaload         
        //   497: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   500: aload           15
        //   502: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   505: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   508: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   511: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   514: goto            469
        //   517: astore          14
        //   519: new             Ljava/lang/StringBuilder;
        //   522: dup            
        //   523: invokespecial   java/lang/StringBuilder.<init>:()V
        //   526: getstatic       com/whatsapp/util/al.z:[Ljava/lang/String;
        //   529: iconst_1       
        //   530: aaload         
        //   531: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   534: aload           14
        //   536: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   539: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   542: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   545: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   548: goto            479
        //   551: astore          13
        //   553: aconst_null    
        //   554: astore_2       
        //   555: goto            461
        //   558: astore          13
        //   560: aload           12
        //   562: astore_2       
        //   563: goto            461
        //   566: astore          11
        //   568: aconst_null    
        //   569: astore          12
        //   571: goto            300
        //   574: astore          11
        //   576: goto            300
        //   579: aconst_null    
        //   580: astore          4
        //   582: aload           4
        //   584: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     15     32     37     Ljava/io/IOException;
        //  20     29     37     47     Ljava/io/IOException;
        //  34     37     37     47     Ljava/io/IOException;
        //  39     42     42     47     Ljava/io/IOException;
        //  51     68     292    300    Ljava/io/IOException;
        //  51     68     456    461    Any
        //  68     93     292    300    Ljava/io/IOException;
        //  68     93     456    461    Any
        //  93     108    566    574    Ljava/io/IOException;
        //  93     108    551    558    Any
        //  108    151    566    574    Ljava/io/IOException;
        //  108    151    551    558    Any
        //  151    168    574    579    Ljava/io/IOException;
        //  151    168    558    566    Any
        //  168    181    574    579    Ljava/io/IOException;
        //  168    181    558    566    Any
        //  187    197    574    579    Ljava/io/IOException;
        //  187    197    558    566    Any
        //  201    206    574    579    Ljava/io/IOException;
        //  201    206    558    566    Any
        //  214    218    351    388    Ljava/io/IOException;
        //  227    232    235    269    Ljava/io/IOException;
        //  269    289    292    300    Ljava/io/IOException;
        //  269    289    456    461    Any
        //  300    329    558    566    Any
        //  334    339    388    423    Ljava/io/IOException;
        //  344    349    423    456    Ljava/io/IOException;
        //  465    469    482    517    Ljava/io/IOException;
        //  474    479    517    551    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 261, Size: 261
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
