// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.util;

import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class Strings
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        final char[] charArray = "\u0006\u001bt\u0001Z\u0006\u0011\"5b)X3V\u0016\f\u001af\u0005F\u0000\u001cl\u0014".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '6';
                    break;
                }
                case 0: {
                    c2 = 'o';
                    break;
                }
                case 1: {
                    c2 = 'u';
                    break;
                }
                case 2: {
                    c2 = '\u0002';
                    break;
                }
                case 3: {
                    c2 = '`';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0006\u001bt\u0001Z\u0006\u0011\"5b)X3V\u0016\f\u001af\u0005F\u0000\u001cl\u0014".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '6';
                    break;
                }
                case 0: {
                    c4 = 'o';
                    break;
                }
                case 1: {
                    c4 = 'u';
                    break;
                }
                case 2: {
                    c4 = '\u0002';
                    break;
                }
                case 3: {
                    c4 = '`';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\f\u0014l\u000eY\u001bUg\u000eU\u0000\u0011g@E\u001b\u0007k\u000eQO\u0001m@T\u0016\u0001g@W\u001d\u0007c\u0019\u0017".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '6';
                    break;
                }
                case 0: {
                    c6 = 'o';
                    break;
                }
                case 1: {
                    c6 = 'u';
                    break;
                }
                case 2: {
                    c6 = '\u0002';
                    break;
                }
                case 3: {
                    c6 = '`';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        z = z2;
    }
    
    public static void toUTF8ByteArray(final char[] p0, final OutputStream p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       org/spongycastle/util/Pack.a:Z
        //     5: istore_3       
        //     6: iload_2        
        //     7: aload_0        
        //     8: arraylength    
        //     9: if_icmpge       315
        //    12: aload_0        
        //    13: iload_2        
        //    14: caload         
        //    15: istore          4
        //    17: iload           4
        //    19: sipush          128
        //    22: if_icmpge       35
        //    25: aload_1        
        //    26: iload           4
        //    28: invokevirtual   java/io/OutputStream.write:(I)V
        //    31: iload_3        
        //    32: ifeq            308
        //    35: iload           4
        //    37: sipush          2048
        //    40: if_icmpge       77
        //    43: sipush          192
        //    46: iload           4
        //    48: bipush          6
        //    50: ishr           
        //    51: ior            
        //    52: istore          12
        //    54: aload_1        
        //    55: iload           12
        //    57: invokevirtual   java/io/OutputStream.write:(I)V
        //    60: aload_1        
        //    61: sipush          128
        //    64: iload           4
        //    66: bipush          63
        //    68: iand           
        //    69: ior            
        //    70: invokevirtual   java/io/OutputStream.write:(I)V
        //    73: iload_3        
        //    74: ifeq            308
        //    77: iload           4
        //    79: ldc             55296
        //    81: if_icmplt       321
        //    84: iload           4
        //    86: ldc             57343
        //    88: if_icmpgt       321
        //    91: iload_2        
        //    92: iconst_1       
        //    93: iadd           
        //    94: istore          7
        //    96: iload           7
        //    98: aload_0        
        //    99: arraylength    
        //   100: if_icmplt       146
        //   103: new             Ljava/lang/IllegalStateException;
        //   106: dup            
        //   107: getstatic       org/spongycastle/util/Strings.z:[Ljava/lang/String;
        //   110: iconst_1       
        //   111: aaload         
        //   112: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   115: athrow         
        //   116: astore          8
        //   118: aload           8
        //   120: athrow         
        //   121: astore          16
        //   123: aload           16
        //   125: athrow         
        //   126: astore          17
        //   128: aload           17
        //   130: athrow         
        //   131: astore          13
        //   133: aload           13
        //   135: athrow         
        //   136: astore          14
        //   138: aload           14
        //   140: athrow         
        //   141: astore          15
        //   143: aload           15
        //   145: athrow         
        //   146: iinc            2, 1
        //   149: aload_0        
        //   150: iload_2        
        //   151: caload         
        //   152: istore          5
        //   154: iload           4
        //   156: ldc             56319
        //   158: if_icmple       179
        //   161: new             Ljava/lang/IllegalStateException;
        //   164: dup            
        //   165: getstatic       org/spongycastle/util/Strings.z:[Ljava/lang/String;
        //   168: iconst_0       
        //   169: aaload         
        //   170: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   173: athrow         
        //   174: astore          11
        //   176: aload           11
        //   178: athrow         
        //   179: ldc             65536
        //   181: iload           4
        //   183: sipush          1023
        //   186: iand           
        //   187: bipush          10
        //   189: ishl           
        //   190: iload           5
        //   192: sipush          1023
        //   195: iand           
        //   196: ior            
        //   197: iadd           
        //   198: istore          9
        //   200: sipush          240
        //   203: iload           9
        //   205: bipush          18
        //   207: ishr           
        //   208: ior            
        //   209: istore          10
        //   211: aload_1        
        //   212: iload           10
        //   214: invokevirtual   java/io/OutputStream.write:(I)V
        //   217: aload_1        
        //   218: sipush          128
        //   221: bipush          63
        //   223: iload           9
        //   225: bipush          12
        //   227: ishr           
        //   228: iand           
        //   229: ior            
        //   230: invokevirtual   java/io/OutputStream.write:(I)V
        //   233: aload_1        
        //   234: sipush          128
        //   237: bipush          63
        //   239: iload           9
        //   241: bipush          6
        //   243: ishr           
        //   244: iand           
        //   245: ior            
        //   246: invokevirtual   java/io/OutputStream.write:(I)V
        //   249: aload_1        
        //   250: sipush          128
        //   253: iload           9
        //   255: bipush          63
        //   257: iand           
        //   258: ior            
        //   259: invokevirtual   java/io/OutputStream.write:(I)V
        //   262: iload_3        
        //   263: ifeq            308
        //   266: aload_1        
        //   267: sipush          224
        //   270: iload           5
        //   272: bipush          12
        //   274: ishr           
        //   275: ior            
        //   276: invokevirtual   java/io/OutputStream.write:(I)V
        //   279: aload_1        
        //   280: sipush          128
        //   283: bipush          63
        //   285: iload           5
        //   287: bipush          6
        //   289: ishr           
        //   290: iand           
        //   291: ior            
        //   292: invokevirtual   java/io/OutputStream.write:(I)V
        //   295: aload_1        
        //   296: sipush          128
        //   299: iload           5
        //   301: bipush          63
        //   303: iand           
        //   304: ior            
        //   305: invokevirtual   java/io/OutputStream.write:(I)V
        //   308: iinc            2, 1
        //   311: iload_3        
        //   312: ifeq            6
        //   315: return         
        //   316: astore          6
        //   318: aload           6
        //   320: athrow         
        //   321: iload           4
        //   323: istore          5
        //   325: goto            266
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  25     31     121    131    Ljava/lang/IllegalStateException;
        //  54     73     131    146    Ljava/lang/IllegalStateException;
        //  96     116    116    121    Ljava/lang/IllegalStateException;
        //  123    126    126    131    Ljava/lang/IllegalStateException;
        //  128    131    131    146    Ljava/lang/IllegalStateException;
        //  133    136    136    146    Ljava/lang/IllegalStateException;
        //  138    141    141    146    Ljava/lang/IllegalStateException;
        //  143    146    116    121    Ljava/lang/IllegalStateException;
        //  161    174    174    179    Ljava/lang/IllegalStateException;
        //  211    262    316    321    Ljava/lang/IllegalStateException;
        //  266    308    316    321    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0077:
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
    
    public static byte[] toUTF8ByteArray(final char[] array) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(array, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            throw new IllegalStateException(Strings.z[2]);
        }
    }
    
    public static String toUpperCase(String s) {
        int i = 0;
        final boolean a = Pack.a;
        final char[] charArray = s.toCharArray();
        boolean b = false;
        while (i != charArray.length) {
            final char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                b = true;
                charArray[i] = (char)('A' + (c - 'a'));
            }
            ++i;
            if (a) {
                break;
            }
        }
        if (!b) {
            return s;
        }
        try {
            s = new String(charArray);
            return s;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
}
