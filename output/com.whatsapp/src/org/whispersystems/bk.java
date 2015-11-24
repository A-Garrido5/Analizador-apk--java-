// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.Arrays;

public class bk
{
    private static final String z;
    
    static {
        final char[] charArray = "=+\u0012HH\u000f1/^@\u001e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '8';
                    break;
                }
                case 0: {
                    c2 = 'j';
                    break;
                }
                case 1: {
                    c2 = 'C';
                    break;
                }
                case 2: {
                    c2 = '{';
                    break;
                }
                case 3: {
                    c2 = ';';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private static br a(final int n, final byte[] array) {
        final B a = B.a(n);
        final byte[][] b = m.b(a.a(array, bk.z.getBytes(), 64), 32, 32);
        return new br(new ao(a, b[0]), new J(a, b[1], 0), null);
    }
    
    public static void a(final aL p0, final int p1, final E p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/J.f:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: iload_1        
        //     6: invokevirtual   org/whispersystems/aL.c:(I)V
        //     9: aload_0        
        //    10: aload_2        
        //    11: invokevirtual   org/whispersystems/E.b:()Lorg/whispersystems/o;
        //    14: invokevirtual   org/whispersystems/aL.a:(Lorg/whispersystems/o;)V
        //    17: aload_0        
        //    18: aload_2        
        //    19: invokevirtual   org/whispersystems/E.c:()Lorg/whispersystems/aY;
        //    22: invokevirtual   org/whispersystems/aY.a:()Lorg/whispersystems/o;
        //    25: invokevirtual   org/whispersystems/aL.b:(Lorg/whispersystems/o;)V
        //    28: new             Ljava/io/ByteArrayOutputStream;
        //    31: dup            
        //    32: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    35: astore          5
        //    37: iload_1        
        //    38: iconst_3       
        //    39: if_icmplt       50
        //    42: aload           5
        //    44: invokestatic    org/whispersystems/bk.a:()[B
        //    47: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //    50: aload           5
        //    52: aload_2        
        //    53: invokevirtual   org/whispersystems/E.b:()Lorg/whispersystems/o;
        //    56: invokevirtual   org/whispersystems/o.a:()Lorg/whispersystems/ak;
        //    59: aload_2        
        //    60: invokevirtual   org/whispersystems/E.g:()Lorg/whispersystems/w;
        //    63: invokevirtual   org/whispersystems/w.a:()Lorg/whispersystems/P;
        //    66: invokestatic    org/whispersystems/s.a:(Lorg/whispersystems/ak;Lorg/whispersystems/P;)[B
        //    69: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //    72: aload           5
        //    74: aload_2        
        //    75: invokevirtual   org/whispersystems/E.d:()Lorg/whispersystems/ak;
        //    78: aload_2        
        //    79: invokevirtual   org/whispersystems/E.c:()Lorg/whispersystems/aY;
        //    82: invokevirtual   org/whispersystems/aY.b:()Lorg/whispersystems/P;
        //    85: invokestatic    org/whispersystems/s.a:(Lorg/whispersystems/ak;Lorg/whispersystems/P;)[B
        //    88: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //    91: aload           5
        //    93: aload_2        
        //    94: invokevirtual   org/whispersystems/E.d:()Lorg/whispersystems/ak;
        //    97: aload_2        
        //    98: invokevirtual   org/whispersystems/E.g:()Lorg/whispersystems/w;
        //   101: invokevirtual   org/whispersystems/w.a:()Lorg/whispersystems/P;
        //   104: invokestatic    org/whispersystems/s.a:(Lorg/whispersystems/ak;Lorg/whispersystems/P;)[B
        //   107: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //   110: iload_1        
        //   111: iconst_3       
        //   112: if_icmplt       154
        //   115: aload_2        
        //   116: invokevirtual   org/whispersystems/E.e:()Lorg/whispersystems/R;
        //   119: invokevirtual   org/whispersystems/R.c:()Z
        //   122: istore          8
        //   124: iload           8
        //   126: ifeq            154
        //   129: aload           5
        //   131: aload_2        
        //   132: invokevirtual   org/whispersystems/E.d:()Lorg/whispersystems/ak;
        //   135: aload_2        
        //   136: invokevirtual   org/whispersystems/E.e:()Lorg/whispersystems/R;
        //   139: invokevirtual   org/whispersystems/R.d:()Ljava/lang/Object;
        //   142: checkcast       Lorg/whispersystems/w;
        //   145: invokevirtual   org/whispersystems/w.a:()Lorg/whispersystems/P;
        //   148: invokestatic    org/whispersystems/s.a:(Lorg/whispersystems/ak;Lorg/whispersystems/P;)[B
        //   151: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //   154: iload_1        
        //   155: aload           5
        //   157: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   160: invokestatic    org/whispersystems/bk.a:(I[B)Lorg/whispersystems/br;
        //   163: astore          9
        //   165: aload_0        
        //   166: aload_2        
        //   167: invokevirtual   org/whispersystems/E.a:()Lorg/whispersystems/w;
        //   170: aload           9
        //   172: invokevirtual   org/whispersystems/br.b:()Lorg/whispersystems/J;
        //   175: invokevirtual   org/whispersystems/aL.a:(Lorg/whispersystems/w;Lorg/whispersystems/J;)V
        //   178: aload_0        
        //   179: aload           9
        //   181: invokevirtual   org/whispersystems/br.a:()Lorg/whispersystems/ao;
        //   184: invokevirtual   org/whispersystems/aL.a:(Lorg/whispersystems/ao;)V
        //   187: getstatic       org/whispersystems/bO.s:I
        //   190: ifeq            199
        //   193: iload_3        
        //   194: iconst_1       
        //   195: iadd           
        //   196: putstatic       org/whispersystems/J.f:I
        //   199: return         
        //   200: astore          11
        //   202: aload           11
        //   204: athrow         
        //   205: astore          4
        //   207: new             Ljava/lang/AssertionError;
        //   210: dup            
        //   211: aload           4
        //   213: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   216: athrow         
        //   217: astore          6
        //   219: aload           6
        //   221: athrow         
        //   222: astore          7
        //   224: aload           7
        //   226: athrow         
        //   227: astore          10
        //   229: aload           10
        //   231: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      37     205    217    Ljava/io/IOException;
        //  42     50     200    205    Ljava/io/IOException;
        //  50     110    217    222    Ljava/io/IOException;
        //  115    124    217    222    Ljava/io/IOException;
        //  129    154    222    227    Ljava/io/IOException;
        //  154    187    205    217    Ljava/io/IOException;
        //  187    199    227    232    Ljava/io/IOException;
        //  202    205    205    217    Ljava/io/IOException;
        //  219    222    222    227    Ljava/io/IOException;
        //  224    227    205    217    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 108, Size: 108
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
    
    public static void a(final aL p0, final int p1, final Z p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/J.f:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: iload_1        
        //     6: invokevirtual   org/whispersystems/aL.c:(I)V
        //     9: aload_0        
        //    10: aload_2        
        //    11: invokevirtual   org/whispersystems/Z.a:()Lorg/whispersystems/o;
        //    14: invokevirtual   org/whispersystems/aL.a:(Lorg/whispersystems/o;)V
        //    17: aload_0        
        //    18: aload_2        
        //    19: invokevirtual   org/whispersystems/Z.e:()Lorg/whispersystems/aY;
        //    22: invokevirtual   org/whispersystems/aY.a:()Lorg/whispersystems/o;
        //    25: invokevirtual   org/whispersystems/aL.b:(Lorg/whispersystems/o;)V
        //    28: invokestatic    org/whispersystems/s.a:()Lorg/whispersystems/w;
        //    31: astore          5
        //    33: new             Ljava/io/ByteArrayOutputStream;
        //    36: dup            
        //    37: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    40: astore          6
        //    42: iload_1        
        //    43: iconst_3       
        //    44: if_icmplt       55
        //    47: aload           6
        //    49: invokestatic    org/whispersystems/bk.a:()[B
        //    52: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //    55: aload           6
        //    57: aload_2        
        //    58: invokevirtual   org/whispersystems/Z.f:()Lorg/whispersystems/ak;
        //    61: aload_2        
        //    62: invokevirtual   org/whispersystems/Z.e:()Lorg/whispersystems/aY;
        //    65: invokevirtual   org/whispersystems/aY.b:()Lorg/whispersystems/P;
        //    68: invokestatic    org/whispersystems/s.a:(Lorg/whispersystems/ak;Lorg/whispersystems/P;)[B
        //    71: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //    74: aload           6
        //    76: aload_2        
        //    77: invokevirtual   org/whispersystems/Z.a:()Lorg/whispersystems/o;
        //    80: invokevirtual   org/whispersystems/o.a:()Lorg/whispersystems/ak;
        //    83: aload_2        
        //    84: invokevirtual   org/whispersystems/Z.d:()Lorg/whispersystems/w;
        //    87: invokevirtual   org/whispersystems/w.a:()Lorg/whispersystems/P;
        //    90: invokestatic    org/whispersystems/s.a:(Lorg/whispersystems/ak;Lorg/whispersystems/P;)[B
        //    93: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //    96: aload           6
        //    98: aload_2        
        //    99: invokevirtual   org/whispersystems/Z.f:()Lorg/whispersystems/ak;
        //   102: aload_2        
        //   103: invokevirtual   org/whispersystems/Z.d:()Lorg/whispersystems/w;
        //   106: invokevirtual   org/whispersystems/w.a:()Lorg/whispersystems/P;
        //   109: invokestatic    org/whispersystems/s.a:(Lorg/whispersystems/ak;Lorg/whispersystems/P;)[B
        //   112: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //   115: iload_1        
        //   116: iconst_3       
        //   117: if_icmplt       159
        //   120: aload_2        
        //   121: invokevirtual   org/whispersystems/Z.c:()Lorg/whispersystems/R;
        //   124: invokevirtual   org/whispersystems/R.c:()Z
        //   127: istore          9
        //   129: iload           9
        //   131: ifeq            159
        //   134: aload           6
        //   136: aload_2        
        //   137: invokevirtual   org/whispersystems/Z.c:()Lorg/whispersystems/R;
        //   140: invokevirtual   org/whispersystems/R.d:()Ljava/lang/Object;
        //   143: checkcast       Lorg/whispersystems/ak;
        //   146: aload_2        
        //   147: invokevirtual   org/whispersystems/Z.d:()Lorg/whispersystems/w;
        //   150: invokevirtual   org/whispersystems/w.a:()Lorg/whispersystems/P;
        //   153: invokestatic    org/whispersystems/s.a:(Lorg/whispersystems/ak;Lorg/whispersystems/P;)[B
        //   156: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //   159: iload_1        
        //   160: aload           6
        //   162: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   165: invokestatic    org/whispersystems/bk.a:(I[B)Lorg/whispersystems/br;
        //   168: astore          10
        //   170: aload           10
        //   172: invokevirtual   org/whispersystems/br.a:()Lorg/whispersystems/ao;
        //   175: aload_2        
        //   176: invokevirtual   org/whispersystems/Z.b:()Lorg/whispersystems/ak;
        //   179: aload           5
        //   181: invokevirtual   org/whispersystems/ao.a:(Lorg/whispersystems/ak;Lorg/whispersystems/w;)Lorg/whispersystems/g;
        //   184: astore          11
        //   186: aload_0        
        //   187: aload_2        
        //   188: invokevirtual   org/whispersystems/Z.b:()Lorg/whispersystems/ak;
        //   191: aload           10
        //   193: invokevirtual   org/whispersystems/br.b:()Lorg/whispersystems/J;
        //   196: invokevirtual   org/whispersystems/aL.b:(Lorg/whispersystems/ak;Lorg/whispersystems/J;)V
        //   199: aload_0        
        //   200: aload           5
        //   202: aload           11
        //   204: invokevirtual   org/whispersystems/g.b:()Ljava/lang/Object;
        //   207: checkcast       Lorg/whispersystems/J;
        //   210: invokevirtual   org/whispersystems/aL.a:(Lorg/whispersystems/w;Lorg/whispersystems/J;)V
        //   213: aload_0        
        //   214: aload           11
        //   216: invokevirtual   org/whispersystems/g.a:()Ljava/lang/Object;
        //   219: checkcast       Lorg/whispersystems/ao;
        //   222: invokevirtual   org/whispersystems/aL.a:(Lorg/whispersystems/ao;)V
        //   225: iload_3        
        //   226: ifeq            237
        //   229: iconst_1       
        //   230: getstatic       org/whispersystems/bO.s:I
        //   233: iadd           
        //   234: putstatic       org/whispersystems/bO.s:I
        //   237: return         
        //   238: astore          12
        //   240: aload           12
        //   242: athrow         
        //   243: astore          4
        //   245: new             Ljava/lang/AssertionError;
        //   248: dup            
        //   249: aload           4
        //   251: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   254: athrow         
        //   255: astore          7
        //   257: aload           7
        //   259: athrow         
        //   260: astore          8
        //   262: aload           8
        //   264: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      42     243    255    Ljava/io/IOException;
        //  47     55     238    243    Ljava/io/IOException;
        //  55     115    255    260    Ljava/io/IOException;
        //  120    129    255    260    Ljava/io/IOException;
        //  134    159    260    265    Ljava/io/IOException;
        //  159    225    243    255    Ljava/io/IOException;
        //  240    243    243    255    Ljava/io/IOException;
        //  257    260    260    265    Ljava/io/IOException;
        //  262    265    243    255    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 121, Size: 121
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
    
    private static byte[] a() {
        final byte[] array = new byte[32];
        Arrays.fill(array, (byte)(-1));
        return array;
    }
}
