// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.File;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import android.support.annotation.NonNull;
import java.io.InputStream;

public final class h
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[12];
        String s = "y\u000e\u0019kxj\u0013\u001cb&0\u0013\u0007{;|\u0006\u0001kxy\u0015\u001acxz\t\u0011.6p\n\u0005|0l\u0014\u0010j\u0013v\u000b\u00104";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'U';
                        break;
                    }
                    case 0: {
                        c2 = '\u001f';
                        break;
                    }
                    case 1: {
                        c2 = 'g';
                        break;
                    }
                    case 2: {
                        c2 = 'u';
                        break;
                    }
                    case 3: {
                        c2 = '\u000e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "j\t\u0016a8o\u0015\u0010}&z\u0003Xm'~\u0014\u001db:x";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "6G\u0016o;q\b\u0001.7zG\u0019k&lG\u0001f4qG\u0017{3y\u0002\u0007]<e\u0002]";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "y\u000e\u0019kxj\u0013\u001cb&0\u0013\u0007{;|\u0006\u0001kxy\u0015\u001acxz\t\u0011!!p\bX}8~\u000b\u0019#;pJ\u0001| q\u0004\u0014z<p\tX|0n\u0012\u001c|0{";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "|\u0015\u0014}=s\b\u0012";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "?\u000b\u0010`2k\u000fO";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "y\u000e\u0019kxj\u0013\u001cb&0\u0013\u0007{;|\u0006\u0001kxy\u0015\u001acxz\t\u0011.";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "m\u0010";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "?\n\u0014v\u0017f\u0013\u0010}o";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "y\u000e\u0019kxj\u0013\u001cb&0\u0013\u0007{;|\u0006\u0001kxy\u0015\u001acxz\t\u0011";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "r\u0006\rL,k\u0002\u0006&";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "?\u0005\u0000h3z\u0015&g/z]U";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private static int a(@NonNull final InputStream inputStream, @NonNull final RandomAccessFile randomAccessFile, final int n, @NonNull final byte[] array) {
        final boolean l = Log.l;
        int i = 0;
        while (i < n) {
            final int read = inputStream.read(array, 0, Math.min(array.length, n - i));
            if (read <= 0 && !l) {
                break;
            }
            randomAccessFile.write(array, 0, read);
            i += read;
            if (l) {
                break;
            }
        }
        return i;
    }
    
    private static int a(@NonNull final OutputStream outputStream, @NonNull final RandomAccessFile randomAccessFile, final int n, @NonNull final byte[] array) {
        final boolean l = Log.l;
        int i = 0;
        while (i < n) {
            final int read = randomAccessFile.read(array, 0, Math.min(array.length, n - i));
            if (read <= 0 && !l) {
                break;
            }
            outputStream.write(array, 0, read);
            i += read;
            if (l) {
                break;
            }
        }
        return i;
    }
    
    public static File a(@NonNull final File p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_3       
        //     2: new             Ljava/lang/StringBuilder;
        //     5: dup            
        //     6: invokespecial   java/lang/StringBuilder.<init>:()V
        //     9: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //    12: iconst_0       
        //    13: aaload         
        //    14: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    17: aload_0        
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    21: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //    24: bipush          8
        //    26: aaload         
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: iload_1        
        //    31: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    34: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //    37: bipush          11
        //    39: aaload         
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: iload_2        
        //    44: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    47: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    50: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    53: aload_0        
        //    54: invokevirtual   java/io/File.length:()J
        //    57: iload_1        
        //    58: i2l            
        //    59: lcmp           
        //    60: ifgt            78
        //    63: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //    66: iconst_3       
        //    67: aaload         
        //    68: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    71: aload_0        
        //    72: areturn        
        //    73: astore          4
        //    75: aload           4
        //    77: athrow         
        //    78: iload_2        
        //    79: ifgt            86
        //    82: sipush          16384
        //    85: istore_2       
        //    86: iload_1        
        //    87: ifne            132
        //    90: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //    93: iconst_4       
        //    94: aaload         
        //    95: aconst_null    
        //    96: invokestatic    java/io/File.createTempFile:(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //    99: astore          26
        //   101: aload           26
        //   103: astore_0       
        //   104: aconst_null    
        //   105: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   108: aconst_null    
        //   109: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   112: aconst_null    
        //   113: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   116: iconst_0       
        //   117: ifeq            71
        //   120: aconst_null    
        //   121: invokevirtual   java/io/File.delete:()Z
        //   124: pop            
        //   125: aload_0        
        //   126: areturn        
        //   127: astore          27
        //   129: aload           27
        //   131: athrow         
        //   132: iload_1        
        //   133: iload_2        
        //   134: if_icmpge       243
        //   137: new             Ljava/lang/IllegalArgumentException;
        //   140: dup            
        //   141: new             Ljava/lang/StringBuilder;
        //   144: dup            
        //   145: invokespecial   java/lang/StringBuilder.<init>:()V
        //   148: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //   151: bipush          10
        //   153: aaload         
        //   154: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   157: iload_1        
        //   158: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   161: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //   164: iconst_2       
        //   165: aaload         
        //   166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   169: iload_2        
        //   170: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   173: ldc             ")"
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   181: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   184: athrow         
        //   185: astore          25
        //   187: aload           25
        //   189: athrow         
        //   190: astore          12
        //   192: aconst_null    
        //   193: astore          6
        //   195: aconst_null    
        //   196: astore          13
        //   198: aconst_null    
        //   199: astore          7
        //   201: aconst_null    
        //   202: astore          8
        //   204: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //   207: bipush          9
        //   209: aaload         
        //   210: aload           12
        //   212: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   215: aload           7
        //   217: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   220: aload           13
        //   222: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   225: aload           6
        //   227: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   230: aload           8
        //   232: ifnull          241
        //   235: aload           8
        //   237: invokevirtual   java/io/File.delete:()Z
        //   240: pop            
        //   241: aconst_null    
        //   242: areturn        
        //   243: iload_2        
        //   244: newarray        B
        //   246: astore          11
        //   248: new             Ljava/util/zip/GZIPInputStream;
        //   251: dup            
        //   252: new             Ljava/io/FileInputStream;
        //   255: dup            
        //   256: aload_0        
        //   257: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   260: iload_2        
        //   261: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;I)V
        //   264: astore          7
        //   266: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //   269: iconst_1       
        //   270: aaload         
        //   271: aconst_null    
        //   272: invokestatic    java/io/File.createTempFile:(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //   275: astore          16
        //   277: aload           16
        //   279: astore          8
        //   281: new             Ljava/io/RandomAccessFile;
        //   284: dup            
        //   285: aload           8
        //   287: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //   290: bipush          7
        //   292: aaload         
        //   293: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   296: astore          6
        //   298: aload           7
        //   300: aload           6
        //   302: iload_1        
        //   303: aload           11
        //   305: invokestatic    com/whatsapp/util/h.a:(Ljava/io/InputStream;Ljava/io/RandomAccessFile;I[B)I
        //   308: istore          17
        //   310: aload           6
        //   312: lconst_0       
        //   313: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   316: iload           17
        //   318: iload_1        
        //   319: if_icmpeq       298
        //   322: aload           7
        //   324: invokevirtual   java/util/zip/GZIPInputStream.close:()V
        //   327: aload           6
        //   329: invokevirtual   java/io/RandomAccessFile.getFD:()Ljava/io/FileDescriptor;
        //   332: invokevirtual   java/io/FileDescriptor.sync:()V
        //   335: new             Ljava/io/File;
        //   338: dup            
        //   339: getstatic       com/whatsapp/App.T:Lcom/whatsapp/util/p;
        //   342: invokevirtual   com/whatsapp/util/p.a:()Ljava/io/File;
        //   345: aload_0        
        //   346: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   349: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   352: astore          18
        //   354: new             Ljava/util/zip/GZIPOutputStream;
        //   357: dup            
        //   358: new             Ljava/io/FileOutputStream;
        //   361: dup            
        //   362: aload           18
        //   364: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   367: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   370: astore          13
        //   372: iload           17
        //   374: i2l            
        //   375: lstore          19
        //   377: aload           6
        //   379: lload           19
        //   381: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   384: aload           13
        //   386: aload           6
        //   388: iload_1        
        //   389: iload           17
        //   391: isub           
        //   392: aload           11
        //   394: invokestatic    com/whatsapp/util/h.a:(Ljava/io/OutputStream;Ljava/io/RandomAccessFile;I[B)I
        //   397: pop            
        //   398: aload           6
        //   400: lconst_0       
        //   401: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   404: aload           13
        //   406: aload           6
        //   408: iload           17
        //   410: aload           11
        //   412: invokestatic    com/whatsapp/util/h.a:(Ljava/io/OutputStream;Ljava/io/RandomAccessFile;I[B)I
        //   415: pop            
        //   416: aload           13
        //   418: invokevirtual   java/util/zip/GZIPOutputStream.close:()V
        //   421: new             Ljava/lang/StringBuilder;
        //   424: dup            
        //   425: invokespecial   java/lang/StringBuilder.<init>:()V
        //   428: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //   431: bipush          6
        //   433: aaload         
        //   434: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   437: aload           18
        //   439: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   442: getstatic       com/whatsapp/util/h.z:[Ljava/lang/String;
        //   445: iconst_5       
        //   446: aaload         
        //   447: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   450: aload           18
        //   452: invokevirtual   java/io/File.length:()J
        //   455: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   458: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   461: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   464: aload           7
        //   466: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   469: aload           13
        //   471: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   474: aload           6
        //   476: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   479: aload           8
        //   481: ifnull          490
        //   484: aload           8
        //   486: invokevirtual   java/io/File.delete:()Z
        //   489: pop            
        //   490: aload           18
        //   492: areturn        
        //   493: astore          23
        //   495: aload           23
        //   497: athrow         
        //   498: astore          14
        //   500: aload           14
        //   502: athrow         
        //   503: astore          5
        //   505: aconst_null    
        //   506: astore          6
        //   508: aconst_null    
        //   509: astore          7
        //   511: aconst_null    
        //   512: astore          8
        //   514: aload           7
        //   516: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   519: aload_3        
        //   520: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   523: aload           6
        //   525: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   528: aload           8
        //   530: ifnull          539
        //   533: aload           8
        //   535: invokevirtual   java/io/File.delete:()Z
        //   538: pop            
        //   539: aload           5
        //   541: athrow         
        //   542: astore          9
        //   544: aload           9
        //   546: athrow         
        //   547: astore          5
        //   549: aconst_null    
        //   550: astore_3       
        //   551: aconst_null    
        //   552: astore          6
        //   554: aconst_null    
        //   555: astore          8
        //   557: goto            514
        //   560: astore          5
        //   562: aconst_null    
        //   563: astore_3       
        //   564: aconst_null    
        //   565: astore          6
        //   567: goto            514
        //   570: astore          5
        //   572: aconst_null    
        //   573: astore_3       
        //   574: goto            514
        //   577: astore          5
        //   579: aload           13
        //   581: astore_3       
        //   582: goto            514
        //   585: astore          12
        //   587: aconst_null    
        //   588: astore          6
        //   590: aconst_null    
        //   591: astore          13
        //   593: aconst_null    
        //   594: astore          8
        //   596: goto            204
        //   599: astore          12
        //   601: aconst_null    
        //   602: astore          6
        //   604: aconst_null    
        //   605: astore          13
        //   607: goto            204
        //   610: astore          12
        //   612: aconst_null    
        //   613: astore          13
        //   615: goto            204
        //   618: astore          12
        //   620: goto            204
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      71     73     78     Ljava/io/IOException;
        //  90     101    190    204    Ljava/io/IOException;
        //  90     101    503    514    Any
        //  104    116    127    132    Ljava/io/IOException;
        //  120    125    127    132    Ljava/io/IOException;
        //  137    185    185    190    Ljava/io/IOException;
        //  137    185    503    514    Any
        //  187    190    190    204    Ljava/io/IOException;
        //  187    190    503    514    Any
        //  204    215    577    585    Any
        //  215    230    498    503    Ljava/io/IOException;
        //  235    241    498    503    Ljava/io/IOException;
        //  243    266    190    204    Ljava/io/IOException;
        //  243    266    503    514    Any
        //  266    277    585    599    Ljava/io/IOException;
        //  266    277    547    560    Any
        //  281    298    599    610    Ljava/io/IOException;
        //  281    298    560    570    Any
        //  298    316    610    618    Ljava/io/IOException;
        //  298    316    570    577    Any
        //  322    372    610    618    Ljava/io/IOException;
        //  322    372    570    577    Any
        //  377    464    618    623    Ljava/io/IOException;
        //  377    464    577    585    Any
        //  464    479    493    498    Ljava/io/IOException;
        //  484    490    493    498    Ljava/io/IOException;
        //  514    528    542    547    Ljava/io/IOException;
        //  533    539    542    547    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 313, Size: 313
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
}
