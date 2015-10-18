// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.content.Context;

public class WhatsAppLibLoader
{
    private static String a;
    private static Boolean b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[39];
        String s = "8N\u001a$9i\u000e]ce";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1007:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\\';
                        break;
                    }
                    case 0: {
                        c2 = '[';
                        break;
                    }
                    case 1: {
                        c2 = ';';
                        break;
                    }
                    case 2: {
                        c2 = 'h';
                        break;
                    }
                    case 3: {
                        c2 = 'R';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "2U\u001b&=7W\t&54UH;/{X\u0007 ..K\u001ci|5Z\u001c;*>\u001b\u0004;>)Z\u001a;9(\u001b\t 9{V\u0001!/2U\u000f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "2U\u001b&=7WH65)^\u000b&|=I\u0007?|:K\u0003r+4I\u000378`\u001b\u001a7(>H\u001c;2<\u001b\u0004;>)Z\u001a+|.H\t057R\u001c+";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ")^\u001b31+W\r";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ".U\t00>\u001b\u001c=|.H\rr04Z\f78{W\u00010.:I\u00017/`\u001b\u001c %2U\u000fr55H\u001c307\u001b\f;.>X\u001cr:)T\u0005r=+P";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ".U\t00>\u001b\u001c=|.H\rr02Y\u001a3.2^\u001br8>H\u0018;(>\u001b\u001b'?8^\u001b!:.WH;2(O\t>0{_\u0001 98O\u0004+|=I\u0007?|:K\u0003";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "-W\u000b";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = ",S\t&/:K\u0018";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "7R\n =)BH'/:Y\u0001>5/BH!(2W\u0004r>)T\u000372`\u001b\u001c:.4L\u0001<;{O\u0007r?4I\u001a',/\u001b\u0001<//Z\u0004>=/R\u0007<|:X\u001c;*2O\u0011";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "i\u0015Y`rj\f^";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = ">I\u001a=.{L\u0000;0>\u001b\u001c7//R\u00065|7R\n =)BH'/:Y\u0001>5/BH59/q&\u001b\u001f4_\r\u00049)H\u0001=2";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = ">I\u001a=.{L\u0000;0>\u001b\u001c7//R\u00065|7R\n =)BH'/:Y\u0001>5/BH59/x\t>0\u0012U\u000e=";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = ">I\u001a=.{L\u0000;0>\u001b\u001c7//R\u00065|7R\n =)BH'/:Y\u0001>5/BH&9(O$;>)Z\u001a+\t(Z\n>9";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = ">I\u001a=.a\u001b\u001c7//\u001b\t .:BH63>H\u0006u({U\u0007&|6Z\u001c14";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "1U\u0001\u00049)H\u0001=2a\u001b";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = ">I\u001a=.a\u001b\u001e7.(R\u0007<|?T\r!|5T\u001cr1:O\u000b:r{q)\u0004\u001d{M\r /2T\u0006h|i\u0015Y`rj\f^~|\u0011u!r*>I\u001b;35";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "2H$;>)Z\u001a+\t(Z\n>9a\u001b< )>";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = ",S\t&/:K\u0018>59W\u000738>IG>3:_\r .4I";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "uH\u0007";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "uH\u0007r55\u001b\u001c:9{K\t17:\\\r";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = ":I\u00057=9RE$k:";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "uH\u0007";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "tW\u00010";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "#\u0003^";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "tW\u00010";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = ":I\u00057=9R";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "8Z\u0006r24OH455_H>59\u0014";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = ",S\t&/:K\u0018>59W\u000738>IG104H\r(:";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0012t-*?>K\u001c;35\u001b\u001f:95\u001b\u0001<//Z\u0004>|5Z\u001c;*>\u001b\u0004;>)Z\u001a+";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "7R\n}";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "6R\u0018!";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = ",S\t&/:K\u0018>59W\u000738>IG104H\r(:";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = ":I\u00057=9R";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "7R\n";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = ":I\u00057=9RE$k";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "6R\u0018!";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "#\u0003^";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = ",S\t&/:K\u0018>59W\u000738>IG;3>I\u001a=.";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "8Z\u0006r24OH455_H>59\u001b\u000e=0?^\u001ar:4IH\u0013\u001e\u0012\u001b";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    break Label_1007;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        final char[] charArray2 = "\u000eu#\u001c\u0013\fu7\u0004\u0019\th!\u001d\u0012".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = '\\';
                    break;
                }
                case 0: {
                    c4 = '[';
                    break;
                }
                case 1: {
                    c4 = ';';
                    break;
                }
                case 2: {
                    c4 = 'h';
                    break;
                }
                case 3: {
                    c4 = 'R';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        WhatsAppLibLoader.a = new String(charArray2).intern();
        WhatsAppLibLoader.b = null;
    }
    
    private static void a(final Context p0, final String[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_2       
        //     4: getstatic       android/os/Build.CPU_ABI:Ljava/lang/String;
        //     7: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    10: bipush          34
        //    12: aaload         
        //    13: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    16: ifeq            31
        //    19: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    22: bipush          20
        //    24: aaload         
        //    25: astore          10
        //    27: iload_2        
        //    28: ifeq            175
        //    31: getstatic       android/os/Build.CPU_ABI:Ljava/lang/String;
        //    34: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    37: bipush          32
        //    39: aaload         
        //    40: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    43: istore          4
        //    45: iload           4
        //    47: ifeq            62
        //    50: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    53: bipush          25
        //    55: aaload         
        //    56: astore          10
        //    58: iload_2        
        //    59: ifeq            175
        //    62: getstatic       android/os/Build.CPU_ABI:Ljava/lang/String;
        //    65: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    68: bipush          36
        //    70: aaload         
        //    71: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    74: istore          6
        //    76: iload           6
        //    78: ifeq            93
        //    81: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    84: bipush          23
        //    86: aaload         
        //    87: astore          10
        //    89: iload_2        
        //    90: ifeq            175
        //    93: getstatic       android/os/Build.CPU_ABI:Ljava/lang/String;
        //    96: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    99: bipush          30
        //   101: aaload         
        //   102: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   105: istore          8
        //   107: iload           8
        //   109: ifeq            124
        //   112: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   115: bipush          35
        //   117: aaload         
        //   118: astore          10
        //   120: iload_2        
        //   121: ifeq            175
        //   124: new             Ljava/lang/UnsatisfiedLinkError;
        //   127: dup            
        //   128: new             Ljava/lang/StringBuilder;
        //   131: dup            
        //   132: invokespecial   java/lang/StringBuilder.<init>:()V
        //   135: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   138: bipush          38
        //   140: aaload         
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: getstatic       android/os/Build.CPU_ABI:Ljava/lang/String;
        //   147: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   150: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   153: invokespecial   java/lang/UnsatisfiedLinkError.<init>:(Ljava/lang/String;)V
        //   156: athrow         
        //   157: astore          9
        //   159: aload           9
        //   161: athrow         
        //   162: astore_3       
        //   163: aload_3        
        //   164: athrow         
        //   165: astore          5
        //   167: aload           5
        //   169: athrow         
        //   170: astore          7
        //   172: aload           7
        //   174: athrow         
        //   175: new             Ljava/util/zip/ZipFile;
        //   178: dup            
        //   179: new             Landroid/content/ContextWrapper;
        //   182: dup            
        //   183: aload_0        
        //   184: invokespecial   android/content/ContextWrapper.<init>:(Landroid/content/Context;)V
        //   187: invokevirtual   android/content/ContextWrapper.getPackageCodePath:()Ljava/lang/String;
        //   190: invokespecial   java/util/zip/ZipFile.<init>:(Ljava/lang/String;)V
        //   193: astore          11
        //   195: aload_1        
        //   196: arraylength    
        //   197: istore          15
        //   199: iconst_0       
        //   200: istore          16
        //   202: iload           16
        //   204: iload           15
        //   206: if_icmpge       512
        //   209: aload_1        
        //   210: iload           16
        //   212: aaload         
        //   213: astore          17
        //   215: new             Ljava/io/File;
        //   218: dup            
        //   219: aload_0        
        //   220: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //   223: new             Ljava/lang/StringBuilder;
        //   226: dup            
        //   227: invokespecial   java/lang/StringBuilder.<init>:()V
        //   230: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   233: bipush          33
        //   235: aaload         
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: aload           17
        //   241: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   244: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   247: bipush          18
        //   249: aaload         
        //   250: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   253: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   256: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   259: astore          18
        //   261: aload           11
        //   263: new             Ljava/lang/StringBuilder;
        //   266: dup            
        //   267: invokespecial   java/lang/StringBuilder.<init>:()V
        //   270: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   273: bipush          29
        //   275: aaload         
        //   276: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   279: aload           10
        //   281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   284: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   287: bipush          24
        //   289: aaload         
        //   290: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   293: aload           17
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   301: bipush          21
        //   303: aaload         
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   310: invokevirtual   java/util/zip/ZipFile.getEntry:(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
        //   313: astore          19
        //   315: aload           19
        //   317: ifnonnull       422
        //   320: new             Ljava/lang/UnsatisfiedLinkError;
        //   323: dup            
        //   324: new             Ljava/lang/StringBuilder;
        //   327: dup            
        //   328: invokespecial   java/lang/StringBuilder.<init>:()V
        //   331: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   334: bipush          26
        //   336: aaload         
        //   337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   340: aload           10
        //   342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   345: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   348: bipush          22
        //   350: aaload         
        //   351: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   354: aload           17
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   362: bipush          19
        //   364: aaload         
        //   365: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   368: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   371: invokespecial   java/lang/UnsatisfiedLinkError.<init>:(Ljava/lang/String;)V
        //   374: athrow         
        //   375: astore          30
        //   377: aload           30
        //   379: athrow         
        //   380: astore          14
        //   382: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   385: bipush          37
        //   387: aaload         
        //   388: aload           14
        //   390: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   393: new             Ljava/lang/UnsatisfiedLinkError;
        //   396: dup            
        //   397: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   400: bipush          28
        //   402: aaload         
        //   403: invokespecial   java/lang/UnsatisfiedLinkError.<init>:(Ljava/lang/String;)V
        //   406: athrow         
        //   407: astore          12
        //   409: aload           11
        //   411: ifnull          419
        //   414: aload           11
        //   416: invokevirtual   java/util/zip/ZipFile.close:()V
        //   419: aload           12
        //   421: athrow         
        //   422: aload           11
        //   424: aload           19
        //   426: invokevirtual   java/util/zip/ZipFile.getInputStream:(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
        //   429: astore          20
        //   431: new             Ljava/io/FileOutputStream;
        //   434: dup            
        //   435: aload           18
        //   437: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   440: astore          21
        //   442: sipush          1024
        //   445: newarray        B
        //   447: astore          22
        //   449: aload           20
        //   451: aload           22
        //   453: invokevirtual   java/io/InputStream.read:([B)I
        //   456: istore          26
        //   458: iload           26
        //   460: ifle            477
        //   463: aload           21
        //   465: aload           22
        //   467: iconst_0       
        //   468: iload           26
        //   470: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //   473: iload_2        
        //   474: ifeq            449
        //   477: aload           20
        //   479: ifnull          487
        //   482: aload           20
        //   484: invokevirtual   java/io/InputStream.close:()V
        //   487: aload           21
        //   489: ifnull          497
        //   492: aload           21
        //   494: invokevirtual   java/io/FileOutputStream.close:()V
        //   497: aload           18
        //   499: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   502: invokestatic    java/lang/System.load:(Ljava/lang/String;)V
        //   505: iinc            16, 1
        //   508: iload_2        
        //   509: ifeq            202
        //   512: aload           11
        //   514: ifnull          522
        //   517: aload           11
        //   519: invokevirtual   java/util/zip/ZipFile.close:()V
        //   522: return         
        //   523: astore          29
        //   525: aload           29
        //   527: athrow         
        //   528: astore          28
        //   530: aload           28
        //   532: athrow         
        //   533: astore          23
        //   535: aload           20
        //   537: ifnull          545
        //   540: aload           20
        //   542: invokevirtual   java/io/InputStream.close:()V
        //   545: aload           21
        //   547: ifnull          555
        //   550: aload           21
        //   552: invokevirtual   java/io/FileOutputStream.close:()V
        //   555: aload           23
        //   557: athrow         
        //   558: astore          25
        //   560: aload           25
        //   562: athrow         
        //   563: astore          24
        //   565: aload           24
        //   567: athrow         
        //   568: astore          27
        //   570: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   573: bipush          31
        //   575: aaload         
        //   576: aload           27
        //   578: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   581: return         
        //   582: astore          13
        //   584: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   587: bipush          27
        //   589: aaload         
        //   590: aload           13
        //   592: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   595: goto            419
        //   598: astore          12
        //   600: aconst_null    
        //   601: astore          11
        //   603: goto            409
        //   606: astore          14
        //   608: aconst_null    
        //   609: astore          11
        //   611: goto            382
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  31     45     162    165    Ljava/io/IOException;
        //  62     76     165    170    Ljava/io/IOException;
        //  93     107    170    175    Ljava/io/IOException;
        //  124    157    157    162    Ljava/io/IOException;
        //  175    195    606    614    Ljava/io/IOException;
        //  175    195    598    606    Any
        //  195    199    380    382    Ljava/io/IOException;
        //  195    199    407    409    Any
        //  209    315    380    382    Ljava/io/IOException;
        //  209    315    407    409    Any
        //  320    375    375    380    Ljava/io/IOException;
        //  320    375    407    409    Any
        //  377    380    380    382    Ljava/io/IOException;
        //  377    380    407    409    Any
        //  382    407    407    409    Any
        //  414    419    582    598    Ljava/io/IOException;
        //  422    449    380    382    Ljava/io/IOException;
        //  422    449    407    409    Any
        //  449    458    533    568    Any
        //  463    473    533    568    Any
        //  482    487    523    528    Ljava/io/IOException;
        //  482    487    407    409    Any
        //  492    497    528    533    Ljava/io/IOException;
        //  492    497    407    409    Any
        //  497    505    380    382    Ljava/io/IOException;
        //  497    505    407    409    Any
        //  517    522    568    582    Ljava/io/IOException;
        //  525    528    380    382    Ljava/io/IOException;
        //  525    528    407    409    Any
        //  530    533    380    382    Ljava/io/IOException;
        //  530    533    407    409    Any
        //  540    545    558    563    Ljava/io/IOException;
        //  540    545    407    409    Any
        //  550    555    563    568    Ljava/io/IOException;
        //  550    555    407    409    Any
        //  555    558    380    382    Ljava/io/IOException;
        //  555    558    407    409    Any
        //  560    563    380    382    Ljava/io/IOException;
        //  560    563    407    409    Any
        //  565    568    380    382    Ljava/io/IOException;
        //  565    568    407    409    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 284, Size: 284
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    private static boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_3       
        //     1: newarray        B
        //     3: astore_0       
        //     4: aload_0        
        //     5: invokestatic    com/whatsapp/util/WhatsAppLibLoader.testLibraryUsable:([B)V
        //     8: iconst_3       
        //     9: newarray        B
        //    11: dup            
        //    12: iconst_0       
        //    13: ldc             31
        //    15: bastore        
        //    16: dup            
        //    17: iconst_1       
        //    18: ldc             41
        //    20: bastore        
        //    21: dup            
        //    22: iconst_2       
        //    23: ldc             59
        //    25: bastore        
        //    26: aload_0        
        //    27: invokestatic    java/util/Arrays.equals:([B[B)Z
        //    30: ifne            60
        //    33: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    36: bipush          13
        //    38: aaload         
        //    39: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    42: iconst_0       
        //    43: ireturn        
        //    44: astore_1       
        //    45: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    48: bipush          12
        //    50: aaload         
        //    51: aload_1        
        //    52: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    55: iconst_0       
        //    56: ireturn        
        //    57: astore_2       
        //    58: aload_2        
        //    59: athrow         
        //    60: invokestatic    com/whatsapp/util/WhatsAppLibLoader.getJNICodeVersion:()Ljava/lang/String;
        //    63: astore          4
        //    65: new             Ljava/lang/StringBuilder;
        //    68: dup            
        //    69: invokespecial   java/lang/StringBuilder.<init>:()V
        //    72: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    75: bipush          14
        //    77: aaload         
        //    78: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    81: aload           4
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    89: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    92: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    95: bipush          9
        //    97: aaload         
        //    98: aload           4
        //   100: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   103: ifne            200
        //   106: getstatic       com/whatsapp/App.aV:I
        //   109: istore          10
        //   111: iload           10
        //   113: iconst_3       
        //   114: if_icmpeq       128
        //   117: getstatic       com/whatsapp/App.aS:I
        //   120: istore          12
        //   122: iload           12
        //   124: iconst_3       
        //   125: if_icmpne       143
        //   128: getstatic       com/whatsapp/util/WhatsAppLibLoader.a:Ljava/lang/String;
        //   131: aload           4
        //   133: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   136: istore          11
        //   138: iload           11
        //   140: ifne            200
        //   143: new             Ljava/lang/StringBuilder;
        //   146: dup            
        //   147: invokespecial   java/lang/StringBuilder.<init>:()V
        //   150: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   153: bipush          15
        //   155: aaload         
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: aload           4
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   167: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   170: iconst_0       
        //   171: ireturn        
        //   172: astore_3       
        //   173: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   176: bipush          10
        //   178: aaload         
        //   179: aload_3        
        //   180: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   183: iconst_0       
        //   184: ireturn        
        //   185: astore          5
        //   187: aload           5
        //   189: athrow         
        //   190: astore          6
        //   192: aload           6
        //   194: athrow         
        //   195: astore          7
        //   197: aload           7
        //   199: athrow         
        //   200: invokestatic    com/whatsapp/Voip.getCallInfo:()Lcom/whatsapp/Voip$CallInfo;
        //   203: pop            
        //   204: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   207: bipush          16
        //   209: aaload         
        //   210: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   213: iconst_1       
        //   214: ireturn        
        //   215: astore          8
        //   217: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   220: bipush          11
        //   222: aaload         
        //   223: aload           8
        //   225: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   228: iconst_0       
        //   229: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      8      44     57     Ljava/lang/UnsatisfiedLinkError;
        //  8      42     57     60     Ljava/lang/UnsatisfiedLinkError;
        //  60     65     172    185    Ljava/lang/UnsatisfiedLinkError;
        //  65     111    185    190    Ljava/lang/UnsatisfiedLinkError;
        //  117    122    190    195    Ljava/lang/UnsatisfiedLinkError;
        //  128    138    195    200    Ljava/lang/UnsatisfiedLinkError;
        //  143    170    172    185    Ljava/lang/UnsatisfiedLinkError;
        //  187    190    190    195    Ljava/lang/UnsatisfiedLinkError;
        //  192    195    195    200    Ljava/lang/UnsatisfiedLinkError;
        //  197    200    172    185    Ljava/lang/UnsatisfiedLinkError;
        //  200    204    215    230    Ljava/lang/UnsatisfiedLinkError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 120, Size: 120
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
    
    public static boolean a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: ldc             Lcom/whatsapp/util/WhatsAppLibLoader;.class
        //     4: monitorenter   
        //     5: getstatic       com/whatsapp/util/WhatsAppLibLoader.b:Ljava/lang/Boolean;
        //     8: ifnonnull       195
        //    11: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //    14: putstatic       com/whatsapp/util/WhatsAppLibLoader.b:Ljava/lang/Boolean;
        //    17: iconst_4       
        //    18: anewarray       Ljava/lang/String;
        //    21: astore          9
        //    23: aload           9
        //    25: iconst_0       
        //    26: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    29: bipush          6
        //    31: aaload         
        //    32: aastore        
        //    33: aload           9
        //    35: iconst_1       
        //    36: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    39: iconst_3       
        //    40: aaload         
        //    41: aastore        
        //    42: aload           9
        //    44: iconst_2       
        //    45: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    48: bipush          7
        //    50: aaload         
        //    51: aastore        
        //    52: aload           9
        //    54: iconst_3       
        //    55: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    58: iconst_0       
        //    59: aaload         
        //    60: aastore        
        //    61: aload_0        
        //    62: aload           9
        //    64: invokestatic    com/whatsapp/util/WhatsAppLibLoader.b:(Landroid/content/Context;[Ljava/lang/String;)V
        //    67: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //    70: putstatic       com/whatsapp/util/WhatsAppLibLoader.b:Ljava/lang/Boolean;
        //    73: invokestatic    com/whatsapp/util/WhatsAppLibLoader.a:()Z
        //    76: ifne            189
        //    79: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    82: iconst_4       
        //    83: aaload         
        //    84: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    87: aload_0        
        //    88: aload           9
        //    90: invokestatic    com/whatsapp/util/WhatsAppLibLoader.a:(Landroid/content/Context;[Ljava/lang/String;)V
        //    93: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //    96: iconst_2       
        //    97: aaload         
        //    98: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   101: invokestatic    com/whatsapp/util/WhatsAppLibLoader.a:()Z
        //   104: istore          12
        //   106: iload           12
        //   108: ifne            189
        //   111: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   114: bipush          8
        //   116: aaload         
        //   117: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   120: new             Ljava/lang/UnsatisfiedLinkError;
        //   123: dup            
        //   124: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   127: iconst_5       
        //   128: aaload         
        //   129: invokespecial   java/lang/UnsatisfiedLinkError.<init>:(Ljava/lang/String;)V
        //   132: athrow         
        //   133: astore          11
        //   135: aload           11
        //   137: athrow         
        //   138: astore_3       
        //   139: getstatic       com/whatsapp/util/WhatsAppLibLoader.z:[Ljava/lang/String;
        //   142: iconst_1       
        //   143: aaload         
        //   144: aload_3        
        //   145: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   148: aload_0        
        //   149: ifnull          171
        //   152: new             Landroid/os/Handler;
        //   155: dup            
        //   156: invokespecial   android/os/Handler.<init>:()V
        //   159: new             Lcom/whatsapp/util/cl;
        //   162: dup            
        //   163: aload_0        
        //   164: invokespecial   com/whatsapp/util/cl.<init>:(Landroid/content/Context;)V
        //   167: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   170: pop            
        //   171: iconst_0       
        //   172: istore_1       
        //   173: ldc             Lcom/whatsapp/util/WhatsAppLibLoader;.class
        //   175: monitorexit    
        //   176: iload_1        
        //   177: ireturn        
        //   178: astore          10
        //   180: aload           10
        //   182: athrow         
        //   183: astore_2       
        //   184: ldc             Lcom/whatsapp/util/WhatsAppLibLoader;.class
        //   186: monitorexit    
        //   187: aload_2        
        //   188: athrow         
        //   189: getstatic       com/whatsapp/util/Log.l:Z
        //   192: ifeq            173
        //   195: getstatic       com/whatsapp/util/WhatsAppLibLoader.b:Ljava/lang/Boolean;
        //   198: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   201: istore          8
        //   203: iload           8
        //   205: ifne            173
        //   208: new             Ljava/lang/UnsatisfiedLinkError;
        //   211: dup            
        //   212: invokespecial   java/lang/UnsatisfiedLinkError.<init>:()V
        //   215: athrow         
        //   216: astore          7
        //   218: aload           7
        //   220: athrow         
        //   221: astore          6
        //   223: aload           6
        //   225: athrow         
        //   226: astore          4
        //   228: aload           4
        //   230: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  5      61     138    231    Ljava/lang/UnsatisfiedLinkError;
        //  5      61     183    189    Any
        //  61     106    178    183    Ljava/lang/UnsatisfiedLinkError;
        //  61     106    183    189    Any
        //  111    133    133    138    Ljava/lang/UnsatisfiedLinkError;
        //  111    133    183    189    Any
        //  135    138    138    231    Ljava/lang/UnsatisfiedLinkError;
        //  135    138    183    189    Any
        //  139    148    226    231    Ljava/lang/UnsatisfiedLinkError;
        //  139    148    183    189    Any
        //  152    171    226    231    Ljava/lang/UnsatisfiedLinkError;
        //  152    171    183    189    Any
        //  180    183    133    138    Ljava/lang/UnsatisfiedLinkError;
        //  180    183    183    189    Any
        //  189    195    221    226    Ljava/lang/UnsatisfiedLinkError;
        //  189    195    183    189    Any
        //  195    203    221    226    Ljava/lang/UnsatisfiedLinkError;
        //  195    203    183    189    Any
        //  208    216    216    221    Ljava/lang/UnsatisfiedLinkError;
        //  208    216    183    189    Any
        //  218    221    138    231    Ljava/lang/UnsatisfiedLinkError;
        //  218    221    183    189    Any
        //  223    226    216    221    Ljava/lang/UnsatisfiedLinkError;
        //  223    226    183    189    Any
        //  228    231    183    189    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0171:
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
    
    private static void b(final Context context, final String[] array) {
        final boolean l = Log.l;
        try {
            final int length = array.length;
            int i = 0;
            while (i < length) {
                System.loadLibrary(array[i]);
                ++i;
                if (l) {
                    break;
                }
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            Log.c(WhatsAppLibLoader.z[17], unsatisfiedLinkError);
            a(context, array);
        }
    }
    
    private static native String getJNICodeVersion();
    
    private static native void testLibraryUsable(final byte[] p0);
}
