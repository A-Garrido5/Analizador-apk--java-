// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import java.nio.ByteBuffer;

public final class bo
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        String s = "tg[,1@3E 1@gAe6T3E,2NgL!\u007fS|\tto\u0015'\t\u0010\u000ba>\u0011e=^gL6";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '_';
                        break;
                    }
                    case 0: {
                        c2 = '\'';
                        break;
                    }
                    case 1: {
                        c2 = '\u0013';
                        break;
                    }
                    case 2: {
                        c2 = ')';
                        break;
                    }
                    case 3: {
                        c2 = 'E';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "QrE0:\u0007pH+1Hg\t':\u0007}\\)3";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "rGohg";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "tg[,1@3H+;\u0007WF0=Kv\t$-B3]-:\u0007|G)&\u0007`\\5/Ha] ;\u0007eH)*B3]</B`";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "SzD \u0012N\u007fE,,\u0007|\\1\u007fHu\t7>ItL";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "rGohg";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Nw\t**S3F#\u007fUrG\":";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static ByteBuffer a() {
        return ByteBuffer.allocate(16);
    }
    
    public static void a(final byte b, final int n, final long n2, final Double n3, final ByteBuffer byteBuffer) {
        a(b, n, n2, (Object)n3, byteBuffer);
    }
    
    private static void a(final byte p0, final int p1, final long p2, final Object p3, final ByteBuffer p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload           4
        //     2: ifnonnull       23
        //     5: new             Ljava/lang/NullPointerException;
        //     8: dup            
        //     9: getstatic       com/whatsapp/fieldstats/bo.z:[Ljava/lang/String;
        //    12: iconst_1       
        //    13: aaload         
        //    14: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    17: athrow         
        //    18: astore          44
        //    20: aload           44
        //    22: athrow         
        //    23: aload           4
        //    25: instanceof      Ljava/lang/Double;
        //    28: ifne            66
        //    31: aload           4
        //    33: instanceof      Ljava/lang/String;
        //    36: istore          43
        //    38: iload           43
        //    40: ifne            66
        //    43: new             Ljava/lang/IllegalArgumentException;
        //    46: dup            
        //    47: getstatic       com/whatsapp/fieldstats/bo.z:[Ljava/lang/String;
        //    50: iconst_3       
        //    51: aaload         
        //    52: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    55: athrow         
        //    56: astore          7
        //    58: aload           7
        //    60: athrow         
        //    61: astore          6
        //    63: aload           6
        //    65: athrow         
        //    66: aload           4
        //    68: instanceof      Ljava/lang/String;
        //    71: ifeq            128
        //    74: aload           4
        //    76: checkcast       Ljava/lang/String;
        //    79: astore          40
        //    81: aload           40
        //    83: getstatic       com/whatsapp/fieldstats/bo.z:[Ljava/lang/String;
        //    86: iconst_5       
        //    87: aaload         
        //    88: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //    91: arraylength    
        //    92: sipush          1024
        //    95: if_icmple       128
        //    98: new             Ljava/lang/IllegalArgumentException;
        //   101: dup            
        //   102: getstatic       com/whatsapp/fieldstats/bo.z:[Ljava/lang/String;
        //   105: iconst_0       
        //   106: aaload         
        //   107: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   110: athrow         
        //   111: astore          42
        //   113: aload           42
        //   115: athrow         
        //   116: astore          41
        //   118: new             Ljava/lang/Error;
        //   121: dup            
        //   122: aload           41
        //   124: invokespecial   java/lang/Error.<init>:(Ljava/lang/Throwable;)V
        //   127: athrow         
        //   128: iload_1        
        //   129: iflt            138
        //   132: iload_1        
        //   133: ldc             16777216
        //   135: if_icmplt       157
        //   138: new             Ljava/lang/IllegalArgumentException;
        //   141: dup            
        //   142: getstatic       com/whatsapp/fieldstats/bo.z:[Ljava/lang/String;
        //   145: bipush          6
        //   147: aaload         
        //   148: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   151: athrow         
        //   152: astore          8
        //   154: aload           8
        //   156: athrow         
        //   157: lload_2        
        //   158: ldc2_w          1000
        //   161: ldiv           
        //   162: lconst_0       
        //   163: lcmp           
        //   164: iflt            183
        //   167: lload_2        
        //   168: ldc2_w          1000
        //   171: ldiv           
        //   172: lstore          11
        //   174: lload           11
        //   176: ldc2_w          4294967296
        //   179: lcmp           
        //   180: iflt            206
        //   183: new             Ljava/lang/IllegalArgumentException;
        //   186: dup            
        //   187: getstatic       com/whatsapp/fieldstats/bo.z:[Ljava/lang/String;
        //   190: iconst_4       
        //   191: aaload         
        //   192: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   195: athrow         
        //   196: astore          10
        //   198: aload           10
        //   200: athrow         
        //   201: astore          9
        //   203: aload           9
        //   205: athrow         
        //   206: aload           5
        //   208: iload_0        
        //   209: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   212: pop            
        //   213: aload           5
        //   215: iload_1        
        //   216: i2b            
        //   217: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   220: pop            
        //   221: aload           5
        //   223: iload_1        
        //   224: bipush          8
        //   226: ishr           
        //   227: i2b            
        //   228: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   231: pop            
        //   232: aload           5
        //   234: iload_1        
        //   235: bipush          16
        //   237: ishr           
        //   238: i2b            
        //   239: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   242: pop            
        //   243: lload_2        
        //   244: ldc2_w          1000
        //   247: ldiv           
        //   248: l2i            
        //   249: istore          17
        //   251: aload           5
        //   253: iload           17
        //   255: i2b            
        //   256: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   259: pop            
        //   260: aload           5
        //   262: iload           17
        //   264: bipush          8
        //   266: ishr           
        //   267: i2b            
        //   268: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   271: pop            
        //   272: aload           5
        //   274: iload           17
        //   276: bipush          16
        //   278: ishr           
        //   279: i2b            
        //   280: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   283: pop            
        //   284: aload           5
        //   286: iload           17
        //   288: bipush          24
        //   290: ishr           
        //   291: i2b            
        //   292: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   295: pop            
        //   296: aload           4
        //   298: instanceof      Ljava/lang/String;
        //   301: ifeq            360
        //   304: aload           4
        //   306: checkcast       Ljava/lang/String;
        //   309: astore          34
        //   311: aload           34
        //   313: getstatic       com/whatsapp/fieldstats/bo.z:[Ljava/lang/String;
        //   316: iconst_2       
        //   317: aaload         
        //   318: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //   321: astore          36
        //   323: aload           5
        //   325: aload           36
        //   327: arraylength    
        //   328: i2b            
        //   329: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   332: pop            
        //   333: aload           5
        //   335: aload           36
        //   337: arraylength    
        //   338: bipush          8
        //   340: ishr           
        //   341: i2b            
        //   342: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   345: pop            
        //   346: aload           5
        //   348: aload           36
        //   350: invokevirtual   java/nio/ByteBuffer.put:([B)Ljava/nio/ByteBuffer;
        //   353: pop            
        //   354: getstatic       com/whatsapp/fieldstats/aj.a:I
        //   357: ifeq            486
        //   360: aload           4
        //   362: instanceof      Ljava/lang/Double;
        //   365: istore          23
        //   367: iload           23
        //   369: ifeq            486
        //   372: aload           4
        //   374: checkcast       Ljava/lang/Double;
        //   377: invokevirtual   java/lang/Double.doubleValue:()D
        //   380: invokestatic    java/lang/Double.doubleToRawLongBits:(D)J
        //   383: lstore          24
        //   385: aload           5
        //   387: lload           24
        //   389: l2i            
        //   390: i2b            
        //   391: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   394: pop            
        //   395: aload           5
        //   397: lload           24
        //   399: bipush          8
        //   401: lshr           
        //   402: l2i            
        //   403: i2b            
        //   404: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   407: pop            
        //   408: aload           5
        //   410: lload           24
        //   412: bipush          16
        //   414: lshr           
        //   415: l2i            
        //   416: i2b            
        //   417: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   420: pop            
        //   421: aload           5
        //   423: lload           24
        //   425: bipush          24
        //   427: lshr           
        //   428: l2i            
        //   429: i2b            
        //   430: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   433: pop            
        //   434: aload           5
        //   436: lload           24
        //   438: bipush          32
        //   440: lshr           
        //   441: l2i            
        //   442: i2b            
        //   443: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   446: pop            
        //   447: aload           5
        //   449: lload           24
        //   451: bipush          40
        //   453: lshr           
        //   454: l2i            
        //   455: i2b            
        //   456: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   459: pop            
        //   460: aload           5
        //   462: lload           24
        //   464: bipush          48
        //   466: lshr           
        //   467: l2i            
        //   468: i2b            
        //   469: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   472: pop            
        //   473: aload           5
        //   475: lload           24
        //   477: bipush          56
        //   479: lshr           
        //   480: l2i            
        //   481: i2b            
        //   482: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   485: pop            
        //   486: return         
        //   487: astore          35
        //   489: new             Ljava/lang/Error;
        //   492: dup            
        //   493: aload           35
        //   495: invokespecial   java/lang/Error.<init>:(Ljava/lang/Throwable;)V
        //   498: athrow         
        //   499: astore          22
        //   501: aload           22
        //   503: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  5      18     18     23     Ljava/io/UnsupportedEncodingException;
        //  23     38     61     66     Ljava/io/UnsupportedEncodingException;
        //  43     56     56     61     Ljava/io/UnsupportedEncodingException;
        //  63     66     56     61     Ljava/io/UnsupportedEncodingException;
        //  81     111    111    116    Ljava/lang/NullPointerException;
        //  81     111    116    128    Ljava/io/UnsupportedEncodingException;
        //  113    116    116    128    Ljava/io/UnsupportedEncodingException;
        //  138    152    152    157    Ljava/io/UnsupportedEncodingException;
        //  157    174    201    206    Ljava/io/UnsupportedEncodingException;
        //  183    196    196    201    Ljava/io/UnsupportedEncodingException;
        //  203    206    196    201    Ljava/io/UnsupportedEncodingException;
        //  311    323    487    499    Ljava/io/UnsupportedEncodingException;
        //  323    360    499    504    Ljava/io/UnsupportedEncodingException;
        //  360    367    499    504    Ljava/io/UnsupportedEncodingException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0360:
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
    
    public static void a(final byte b, final int n, final long n2, final String s, final ByteBuffer byteBuffer) {
        a(b, n, n2, (Object)s, byteBuffer);
    }
    
    public static ByteBuffer b() {
        return ByteBuffer.allocate(1034);
    }
}
