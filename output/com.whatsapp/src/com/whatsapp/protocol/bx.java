// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;

public class bx implements co, bp
{
    public static boolean c;
    private static final String[] z;
    Hashtable a;
    boolean b;
    byte[][] d;
    int e;
    OutputStream f;
    b4 g;
    int h;
    c5 i;
    private boolean j;
    ca k;
    int l;
    int m;
    
    static {
        final String[] z2 = new String[13];
        String s = "_\u001dWw n\u001dFvmj\u0006\u0003e?w\u001dF2,>\u0007Lv(>\u001eJf%>\bM2$p\u001fB~$zIi[\t";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'M';
                        break;
                    }
                    case 0: {
                        c2 = '\u001e';
                        break;
                    }
                    case 1: {
                        c2 = 'i';
                        break;
                    }
                    case 2: {
                        c2 = '#';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "w\u0007Us!w\r\u0003f\"u\fM";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "l\fP}8l\nF";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "j\u0006";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "k\u0007Fj={\nWw)>\fLtmi\u001bJf$p\u000e\u0003t?q\u0004\u0003a9l\fB\u007f";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\\\u001cEt(lIW}\">\u0005B`*{S\u0003";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Z\u0006Vp!{IAk9{IG{.j\u0000L|,l\u0010\u0003f\"u\fM2\"k\u001d\u0003}+>\u001bB|*{";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "t\u0000G";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "j\u0006";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "^\u0007L|(0\u001cP";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "^\u0007L|(0\u001cP";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "^\u0000Md,r\u0000G";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "^\u0000Md,r\u0000G";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        bx.c = false;
    }
    
    public bx(final OutputStream p0, final String[] p1, final String[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/protocol/bi.O:I
        //     3: istore          4
        //     5: aload_0        
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: aload_0        
        //    10: aconst_null    
        //    11: checkcast       [[B
        //    14: putfield        com/whatsapp/protocol/bx.d:[[B
        //    17: aload_0        
        //    18: aload_1        
        //    19: putfield        com/whatsapp/protocol/bx.f:Ljava/io/OutputStream;
        //    22: aload_0        
        //    23: new             Lcom/whatsapp/protocol/ca;
        //    26: dup            
        //    27: aload_0        
        //    28: getfield        com/whatsapp/protocol/bx.g:Lcom/whatsapp/protocol/b4;
        //    31: invokespecial   com/whatsapp/protocol/ca.<init>:(Lcom/whatsapp/protocol/b4;)V
        //    34: putfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    37: aload_0        
        //    38: invokespecial   com/whatsapp/protocol/bx.c:()V
        //    41: aload_0        
        //    42: new             Ljava/util/Hashtable;
        //    45: dup            
        //    46: iconst_1       
        //    47: iconst_4       
        //    48: aload_2        
        //    49: arraylength    
        //    50: aload_3        
        //    51: arraylength    
        //    52: iadd           
        //    53: imul           
        //    54: iconst_3       
        //    55: idiv           
        //    56: iadd           
        //    57: invokespecial   java/util/Hashtable.<init>:(I)V
        //    60: putfield        com/whatsapp/protocol/bx.a:Ljava/util/Hashtable;
        //    63: iconst_0       
        //    64: istore          5
        //    66: aload_2        
        //    67: arraylength    
        //    68: istore          6
        //    70: iconst_0       
        //    71: istore          7
        //    73: iload           5
        //    75: iload           6
        //    77: if_icmpge       102
        //    80: aload_2        
        //    81: iload           5
        //    83: aaload         
        //    84: astore          12
        //    86: aload           12
        //    88: ifnonnull       134
        //    91: iinc            5, 1
        //    94: iconst_0       
        //    95: istore          7
        //    97: iload           4
        //    99: ifeq            66
        //   102: iload           7
        //   104: aload_3        
        //   105: arraylength    
        //   106: if_icmpge       128
        //   109: aload_3        
        //   110: iload           7
        //   112: aaload         
        //   113: astore          9
        //   115: aload           9
        //   117: ifnonnull       163
        //   120: iinc            7, 1
        //   123: iload           4
        //   125: ifeq            102
        //   128: return         
        //   129: astore          11
        //   131: aload           11
        //   133: athrow         
        //   134: aload_0        
        //   135: getfield        com/whatsapp/protocol/bx.a:Ljava/util/Hashtable;
        //   138: aload_2        
        //   139: iload           5
        //   141: aaload         
        //   142: new             Ljava/lang/Integer;
        //   145: dup            
        //   146: iload           5
        //   148: invokespecial   java/lang/Integer.<init>:(I)V
        //   151: invokevirtual   java/util/Hashtable.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   154: pop            
        //   155: goto            91
        //   158: astore          8
        //   160: aload           8
        //   162: athrow         
        //   163: aload_0        
        //   164: getfield        com/whatsapp/protocol/bx.a:Ljava/util/Hashtable;
        //   167: aload_3        
        //   168: iload           7
        //   170: aaload         
        //   171: new             Ljava/lang/Integer;
        //   174: dup            
        //   175: iload           7
        //   177: sipush          256
        //   180: iadd           
        //   181: invokespecial   java/lang/Integer.<init>:(I)V
        //   184: invokevirtual   java/util/Hashtable.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   187: pop            
        //   188: goto            120
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  80     86     129    134    Ljava/lang/IllegalArgumentException;
        //  109    115    158    163    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0120:
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
    
    public bx(final OutputStream outputStream, final String[] array, final String[] array2, final int e, final c5 i) {
        this(outputStream, array, array2);
        this.e = e;
        this.i = i;
    }
    
    public bx(final String[] array, final String[] array2) {
        this(null, array, array2);
    }
    
    private void a(final int n) {
        b(this.k, n);
    }
    
    private void a(final InputStream p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/protocol/bi.O:I
        //     3: istore_3       
        //     4: iload_2        
        //     5: ldc             1048576
        //     7: if_icmplt       29
        //    10: aload_0        
        //    11: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    14: sipush          254
        //    17: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //    20: aload_0        
        //    21: iload_2        
        //    22: invokespecial   com/whatsapp/protocol/bx.a:(I)V
        //    25: iload_3        
        //    26: ifeq            70
        //    29: iload_2        
        //    30: sipush          256
        //    33: if_icmplt       55
        //    36: aload_0        
        //    37: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    40: sipush          253
        //    43: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //    46: aload_0        
        //    47: iload_2        
        //    48: invokespecial   com/whatsapp/protocol/bx.d:(I)V
        //    51: iload_3        
        //    52: ifeq            70
        //    55: aload_0        
        //    56: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    59: sipush          252
        //    62: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //    65: aload_0        
        //    66: iload_2        
        //    67: invokespecial   com/whatsapp/protocol/bx.b:(I)V
        //    70: aload_0        
        //    71: getfield        com/whatsapp/protocol/bx.e:I
        //    74: ifle            176
        //    77: aload_0        
        //    78: getfield        com/whatsapp/protocol/bx.e:I
        //    81: istore          6
        //    83: iconst_1       
        //    84: istore          7
        //    86: iload_2        
        //    87: ifle            209
        //    90: aload_0        
        //    91: getfield        com/whatsapp/protocol/bx.e:I
        //    94: istore          10
        //    96: iload           10
        //    98: ifle            116
        //   101: iload           7
        //   103: ifne            194
        //   106: iconst_1       
        //   107: istore          13
        //   109: aload_0        
        //   110: iload           13
        //   112: iconst_0       
        //   113: invokespecial   com/whatsapp/protocol/bx.a:(ZZ)V
        //   116: aload_0        
        //   117: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   120: aload_1        
        //   121: iload_2        
        //   122: iload           6
        //   124: invokestatic    java/lang/Math.min:(II)I
        //   127: invokevirtual   com/whatsapp/protocol/ca.a:(Ljava/io/InputStream;I)I
        //   130: istore          11
        //   132: iload           11
        //   134: iconst_m1      
        //   135: if_icmpne       200
        //   138: new             Ljava/io/IOException;
        //   141: dup            
        //   142: getstatic       com/whatsapp/protocol/bx.z:[Ljava/lang/String;
        //   145: iconst_4       
        //   146: aaload         
        //   147: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   150: athrow         
        //   151: astore          12
        //   153: aload           12
        //   155: athrow         
        //   156: astore          14
        //   158: aload           14
        //   160: athrow         
        //   161: astore          15
        //   163: aload           15
        //   165: athrow         
        //   166: astore          4
        //   168: aload           4
        //   170: athrow         
        //   171: astore          5
        //   173: aload           5
        //   175: athrow         
        //   176: sipush          4096
        //   179: istore          6
        //   181: goto            83
        //   184: astore          8
        //   186: aload           8
        //   188: athrow         
        //   189: astore          9
        //   191: aload           9
        //   193: athrow         
        //   194: iconst_0       
        //   195: istore          13
        //   197: goto            109
        //   200: iload_2        
        //   201: iload           11
        //   203: isub           
        //   204: istore_2       
        //   205: iload_3        
        //   206: ifeq            210
        //   209: return         
        //   210: iconst_0       
        //   211: istore          7
        //   213: goto            86
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  10     25     156    166    Ljava/lang/IllegalArgumentException;
        //  36     51     166    171    Ljava/lang/IllegalArgumentException;
        //  55     70     166    171    Ljava/lang/IllegalArgumentException;
        //  70     83     171    176    Ljava/lang/IllegalArgumentException;
        //  90     96     184    194    Ljava/lang/IllegalArgumentException;
        //  138    151    151    156    Ljava/lang/IllegalArgumentException;
        //  158    161    161    166    Ljava/lang/IllegalArgumentException;
        //  163    166    166    171    Ljava/lang/IllegalArgumentException;
        //  186    189    189    194    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 111, Size: 111
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
    
    private static void a(final OutputStream outputStream, final int n) {
        outputStream.write((0xF0000 & n) >> 16);
        outputStream.write((0xFF00 & n) >> 8);
        outputStream.write((n & 0xFF) >> 0);
    }
    
    private void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/protocol/bi.O:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/protocol/bx.a:Ljava/util/Hashtable;
        //     8: aload_1        
        //     9: invokevirtual   java/util/Hashtable.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    12: checkcast       Ljava/lang/Integer;
        //    15: astore          4
        //    17: aload           4
        //    19: ifnonnull       78
        //    22: aload_1        
        //    23: bipush          64
        //    25: invokevirtual   java/lang/String.indexOf:(I)I
        //    28: istore          5
        //    30: iload           5
        //    32: iconst_1       
        //    33: if_icmpge       48
        //    36: aload_0        
        //    37: aload_1        
        //    38: invokestatic    com/whatsapp/protocol/b7.a:(Ljava/lang/String;)[B
        //    41: invokespecial   com/whatsapp/protocol/bx.a:([B)V
        //    44: iload_2        
        //    45: ifeq            215
        //    48: iload           5
        //    50: iconst_1       
        //    51: iadd           
        //    52: istore          6
        //    54: aload_1        
        //    55: iload           6
        //    57: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    60: astore          7
        //    62: aload_0        
        //    63: aload_1        
        //    64: iconst_0       
        //    65: iload           5
        //    67: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    70: aload           7
        //    72: invokespecial   com/whatsapp/protocol/bx.b:(Ljava/lang/String;Ljava/lang/String;)V
        //    75: goto            215
        //    78: aload           4
        //    80: invokevirtual   java/lang/Integer.intValue:()I
        //    83: istore          8
        //    85: iload           8
        //    87: sipush          256
        //    90: if_icmpge       103
        //    93: aload_0        
        //    94: iload           8
        //    96: invokespecial   com/whatsapp/protocol/bx.e:(I)V
        //    99: iload_2        
        //   100: ifeq            214
        //   103: iload           8
        //   105: sipush          256
        //   108: isub           
        //   109: istore          9
        //   111: iload           9
        //   113: sipush          256
        //   116: idiv           
        //   117: istore          10
        //   119: iload           9
        //   121: sipush          256
        //   124: irem           
        //   125: istore          11
        //   127: iload           10
        //   129: tableswitch {
        //                0: 222
        //                1: 231
        //                2: 240
        //                3: 249
        //          default: 160
        //        }
        //   160: new             Ljava/lang/IllegalArgumentException;
        //   163: dup            
        //   164: getstatic       com/whatsapp/protocol/bx.z:[Ljava/lang/String;
        //   167: bipush          6
        //   169: aaload         
        //   170: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   173: athrow         
        //   174: astore          13
        //   176: aload           13
        //   178: athrow         
        //   179: astore_3       
        //   180: new             Ljava/lang/RuntimeException;
        //   183: dup            
        //   184: aload_3        
        //   185: invokevirtual   java/io/UnsupportedEncodingException.getMessage:()Ljava/lang/String;
        //   188: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   191: athrow         
        //   192: astore          15
        //   194: aload           15
        //   196: athrow         
        //   197: astore          14
        //   199: aload           14
        //   201: athrow         
        //   202: aload_0        
        //   203: iload           12
        //   205: invokespecial   com/whatsapp/protocol/bx.e:(I)V
        //   208: aload_0        
        //   209: iload           11
        //   211: invokespecial   com/whatsapp/protocol/bx.e:(I)V
        //   214: return         
        //   215: iload_2        
        //   216: ifeq            214
        //   219: goto            78
        //   222: sipush          236
        //   225: istore          12
        //   227: iload_2        
        //   228: ifeq            202
        //   231: sipush          237
        //   234: istore          12
        //   236: iload_2        
        //   237: ifeq            202
        //   240: sipush          238
        //   243: istore          12
        //   245: iload_2        
        //   246: ifeq            202
        //   249: sipush          239
        //   252: istore          12
        //   254: iload_2        
        //   255: ifne            160
        //   258: goto            202
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  4      17     179    192    Ljava/io/UnsupportedEncodingException;
        //  22     30     179    192    Ljava/io/UnsupportedEncodingException;
        //  36     44     192    197    Ljava/io/UnsupportedEncodingException;
        //  54     75     179    192    Ljava/io/UnsupportedEncodingException;
        //  78     85     179    192    Ljava/io/UnsupportedEncodingException;
        //  93     99     197    202    Ljava/io/UnsupportedEncodingException;
        //  111    119    179    192    Ljava/io/UnsupportedEncodingException;
        //  160    174    174    179    Ljava/io/UnsupportedEncodingException;
        //  176    179    179    192    Ljava/io/UnsupportedEncodingException;
        //  194    197    179    192    Ljava/io/UnsupportedEncodingException;
        //  199    202    179    192    Ljava/io/UnsupportedEncodingException;
        //  202    214    179    192    Ljava/io/UnsupportedEncodingException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 114, Size: 114
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
    
    private void a(final boolean b) {
        synchronized (this) {
            this.a(b, this.e());
        }
    }
    
    private void a(final boolean p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: iconst_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/protocol/bx.m:I
        //     8: iadd           
        //     9: putfield        com/whatsapp/protocol/bx.m:I
        //    12: aload_0        
        //    13: getfield        com/whatsapp/protocol/bx.d:[[B
        //    16: ifnull          23
        //    19: aload_0        
        //    20: invokespecial   com/whatsapp/protocol/bx.b:()V
        //    23: aload_0        
        //    24: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    27: invokevirtual   com/whatsapp/protocol/ca.b:()V
        //    30: aload_0        
        //    31: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    34: invokevirtual   com/whatsapp/protocol/ca.c:()I
        //    37: istore          5
        //    39: aload_0        
        //    40: getfield        com/whatsapp/protocol/bx.l:I
        //    43: istore          6
        //    45: aload_0        
        //    46: getfield        com/whatsapp/protocol/bx.h:I
        //    49: istore          7
        //    51: iload           5
        //    53: iload           6
        //    55: iload           7
        //    57: iadd           
        //    58: isub           
        //    59: istore          8
        //    61: iload_2        
        //    62: bipush          8
        //    64: iand           
        //    65: bipush          8
        //    67: if_icmpne       358
        //    70: iload_2        
        //    71: iconst_1       
        //    72: iand           
        //    73: ifeq            81
        //    76: iload           8
        //    78: ifeq            358
        //    81: iconst_1       
        //    82: istore          9
        //    84: iload           9
        //    86: ifeq            351
        //    89: iload           8
        //    91: iconst_4       
        //    92: iadd           
        //    93: istore          10
        //    95: ldc             1048575
        //    97: iload           10
        //    99: iand           
        //   100: iload           10
        //   102: if_icmpeq       151
        //   105: new             Lcom/whatsapp/protocol/bu;
        //   108: dup            
        //   109: new             Ljava/lang/StringBuilder;
        //   112: dup            
        //   113: invokespecial   java/lang/StringBuilder.<init>:()V
        //   116: getstatic       com/whatsapp/protocol/bx.z:[Ljava/lang/String;
        //   119: iconst_5       
        //   120: aaload         
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: iload           10
        //   126: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   129: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   132: invokespecial   com/whatsapp/protocol/bu.<init>:(Ljava/lang/String;)V
        //   135: athrow         
        //   136: astore          21
        //   138: aload           21
        //   140: athrow         
        //   141: astore          4
        //   143: aload_0        
        //   144: monitorexit    
        //   145: aload           4
        //   147: athrow         
        //   148: astore_3       
        //   149: aload_3        
        //   150: athrow         
        //   151: iload           9
        //   153: ifeq            205
        //   156: aload_0        
        //   157: getfield        com/whatsapp/protocol/bx.g:Lcom/whatsapp/protocol/b4;
        //   160: aload_0        
        //   161: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   164: invokevirtual   com/whatsapp/protocol/ca.a:()[B
        //   167: aload_0        
        //   168: getfield        com/whatsapp/protocol/bx.l:I
        //   171: aload_0        
        //   172: getfield        com/whatsapp/protocol/bx.h:I
        //   175: iadd           
        //   176: iload           8
        //   178: invokeinterface com/whatsapp/protocol/b4.b:([BII)V
        //   183: aload_0        
        //   184: getfield        com/whatsapp/protocol/bx.g:Lcom/whatsapp/protocol/b4;
        //   187: invokeinterface com/whatsapp/protocol/b4.a:()[B
        //   192: astore          11
        //   194: aload_0        
        //   195: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   198: aload           11
        //   200: iconst_0       
        //   201: iconst_4       
        //   202: invokevirtual   com/whatsapp/protocol/ca.write:([BII)V
        //   205: aload_0        
        //   206: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   209: invokevirtual   com/whatsapp/protocol/ca.a:()[B
        //   212: astore          12
        //   214: aload_0        
        //   215: getfield        com/whatsapp/protocol/bx.d:[[B
        //   218: ifnull          344
        //   221: aload_0        
        //   222: aload           12
        //   224: bipush          -2
        //   226: aload_0        
        //   227: getfield        com/whatsapp/protocol/bx.l:I
        //   230: aload_0        
        //   231: getfield        com/whatsapp/protocol/bx.h:I
        //   234: iadd           
        //   235: iadd           
        //   236: invokevirtual   com/whatsapp/protocol/bx.a:([BI)V
        //   239: iload           10
        //   241: iconst_2       
        //   242: iadd           
        //   243: istore          13
        //   245: iload_2        
        //   246: iconst_2       
        //   247: ior            
        //   248: istore_2       
        //   249: aload           12
        //   251: aload_0        
        //   252: getfield        com/whatsapp/protocol/bx.l:I
        //   255: iload_2        
        //   256: iload           13
        //   258: invokestatic    com/whatsapp/protocol/bd.a:([BIII)V
        //   261: aload_0        
        //   262: getfield        com/whatsapp/protocol/bx.i:Lcom/whatsapp/protocol/c5;
        //   265: astore          17
        //   267: aload           17
        //   269: ifnull          338
        //   272: iload_1        
        //   273: ifne            303
        //   276: aload_0        
        //   277: getfield        com/whatsapp/protocol/bx.i:Lcom/whatsapp/protocol/c5;
        //   280: aload_0        
        //   281: aload_0        
        //   282: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   285: invokevirtual   com/whatsapp/protocol/ca.c:()I
        //   288: invokeinterface com/whatsapp/protocol/c5.a:(Lcom/whatsapp/protocol/bx;I)Z
        //   293: istore          20
        //   295: iconst_0       
        //   296: istore          18
        //   298: iload           20
        //   300: ifeq            306
        //   303: iconst_1       
        //   304: istore          18
        //   306: iload           18
        //   308: ifeq            315
        //   311: aload_0        
        //   312: invokevirtual   com/whatsapp/protocol/bx.f:()V
        //   315: aload_0        
        //   316: monitorexit    
        //   317: return         
        //   318: astore          14
        //   320: aload           14
        //   322: athrow         
        //   323: astore          15
        //   325: aload           15
        //   327: athrow         
        //   328: astore          16
        //   330: aload           16
        //   332: athrow         
        //   333: astore          19
        //   335: aload           19
        //   337: athrow         
        //   338: iload_1        
        //   339: istore          18
        //   341: goto            306
        //   344: iload           10
        //   346: istore          13
        //   348: goto            249
        //   351: iload           8
        //   353: istore          10
        //   355: goto            95
        //   358: iconst_0       
        //   359: istore          9
        //   361: goto            84
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  2      23     148    151    Ljava/lang/IllegalArgumentException;
        //  2      23     141    148    Any
        //  23     51     141    148    Any
        //  105    136    136    141    Ljava/lang/IllegalArgumentException;
        //  105    136    141    148    Any
        //  138    141    141    148    Any
        //  149    151    141    148    Any
        //  156    205    141    148    Any
        //  205    239    141    148    Any
        //  249    267    318    328    Ljava/lang/IllegalArgumentException;
        //  249    267    141    148    Any
        //  276    295    328    333    Ljava/lang/IllegalArgumentException;
        //  276    295    141    148    Any
        //  311    315    333    338    Ljava/lang/IllegalArgumentException;
        //  311    315    141    148    Any
        //  320    323    323    328    Ljava/lang/IllegalArgumentException;
        //  320    323    141    148    Any
        //  325    328    328    333    Ljava/lang/IllegalArgumentException;
        //  325    328    141    148    Any
        //  330    333    141    148    Any
        //  335    338    141    148    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 188, Size: 188
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
    
    private void a(final boolean p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_3       
        //     2: aload_0        
        //     3: monitorenter   
        //     4: aload_0        
        //     5: invokespecial   com/whatsapp/protocol/bx.e:()I
        //     8: istore          5
        //    10: iload           5
        //    12: iconst_1       
        //    13: ior            
        //    14: istore          6
        //    16: aload_0        
        //    17: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    20: invokevirtual   com/whatsapp/protocol/ca.c:()I
        //    23: aload_0        
        //    24: getfield        com/whatsapp/protocol/bx.l:I
        //    27: isub           
        //    28: istore          10
        //    30: aload_0        
        //    31: getfield        com/whatsapp/protocol/bx.h:I
        //    34: istore          11
        //    36: iload           10
        //    38: iload           11
        //    40: isub           
        //    41: ifeq            68
        //    44: aload_0        
        //    45: iconst_1       
        //    46: putfield        com/whatsapp/protocol/bx.b:Z
        //    49: iload_1        
        //    50: ifeq            144
        //    53: iload_2        
        //    54: ifne            144
        //    57: aload_0        
        //    58: iload_3        
        //    59: iload           6
        //    61: invokespecial   com/whatsapp/protocol/bx.a:(ZI)V
        //    64: aload_0        
        //    65: invokespecial   com/whatsapp/protocol/bx.c:()V
        //    68: aload_0        
        //    69: getfield        com/whatsapp/protocol/bx.b:Z
        //    72: istore          16
        //    74: iload           16
        //    76: ifeq            119
        //    79: iload_2        
        //    80: ifeq            105
        //    83: aload_0        
        //    84: iload_1        
        //    85: iload           6
        //    87: invokespecial   com/whatsapp/protocol/bx.a:(ZI)V
        //    90: aload_0        
        //    91: iconst_0       
        //    92: putfield        com/whatsapp/protocol/bx.b:Z
        //    95: getstatic       com/whatsapp/protocol/bi.O:I
        //    98: istore          17
        //   100: iload           17
        //   102: ifeq            119
        //   105: iload           6
        //   107: iconst_4       
        //   108: iand           
        //   109: ifeq            119
        //   112: aload_0        
        //   113: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   116: invokevirtual   com/whatsapp/protocol/ca.f:()V
        //   119: aload_0        
        //   120: monitorexit    
        //   121: return         
        //   122: astore          7
        //   124: aload           7
        //   126: athrow         
        //   127: astore          8
        //   129: aload           8
        //   131: athrow         
        //   132: astore          9
        //   134: aload           9
        //   136: athrow         
        //   137: astore          4
        //   139: aload_0        
        //   140: monitorexit    
        //   141: aload           4
        //   143: athrow         
        //   144: iconst_0       
        //   145: istore_3       
        //   146: goto            57
        //   149: astore          12
        //   151: aload           12
        //   153: athrow         
        //   154: astore          13
        //   156: aload           13
        //   158: athrow         
        //   159: astore          14
        //   161: aload           14
        //   163: athrow         
        //   164: astore          15
        //   166: aload           15
        //   168: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      10     137    144    Any
        //  16     36     122    127    Ljava/lang/IllegalArgumentException;
        //  16     36     137    144    Any
        //  44     49     127    137    Ljava/lang/IllegalArgumentException;
        //  44     49     137    144    Any
        //  57     68     137    144    Any
        //  68     74     149    159    Ljava/lang/IllegalArgumentException;
        //  68     74     137    144    Any
        //  83     100    159    164    Ljava/lang/IllegalArgumentException;
        //  83     100    137    144    Any
        //  112    119    164    169    Ljava/lang/IllegalArgumentException;
        //  112    119    137    144    Any
        //  124    127    127    137    Ljava/lang/IllegalArgumentException;
        //  124    127    137    144    Any
        //  129    132    132    137    Ljava/lang/IllegalArgumentException;
        //  129    132    137    144    Any
        //  134    137    137    144    Any
        //  151    154    154    159    Ljava/lang/IllegalArgumentException;
        //  151    154    137    144    Any
        //  156    159    159    164    Ljava/lang/IllegalArgumentException;
        //  156    159    137    144    Any
        //  161    164    164    169    Ljava/lang/IllegalArgumentException;
        //  161    164    137    144    Any
        //  166    169    137    144    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 95, Size: 95
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
    
    private void a(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/protocol/bi.O:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: arraylength    
        //     6: istore_3       
        //     7: iload_3        
        //     8: ldc             1048576
        //    10: if_icmplt       32
        //    13: aload_0        
        //    14: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    17: sipush          254
        //    20: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //    23: aload_0        
        //    24: iload_3        
        //    25: invokespecial   com/whatsapp/protocol/bx.a:(I)V
        //    28: iload_2        
        //    29: ifeq            242
        //    32: iload_3        
        //    33: sipush          256
        //    36: if_icmplt       58
        //    39: aload_0        
        //    40: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    43: sipush          253
        //    46: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //    49: aload_0        
        //    50: iload_3        
        //    51: invokespecial   com/whatsapp/protocol/bx.d:(I)V
        //    54: iload_2        
        //    55: ifeq            242
        //    58: iload_3        
        //    59: sipush          128
        //    62: if_icmpge       469
        //    65: iload_3        
        //    66: iconst_1       
        //    67: iadd           
        //    68: iconst_2       
        //    69: idiv           
        //    70: newarray        B
        //    72: astore          15
        //    74: iconst_0       
        //    75: istore          16
        //    77: iload           16
        //    79: iload_3        
        //    80: if_icmpge       412
        //    83: aload_1        
        //    84: iload           16
        //    86: baload         
        //    87: istore          17
        //    89: iload           17
        //    91: tableswitch {
        //               90: 358
        //               91: 358
        //               92: 156
        //               93: 347
        //               94: 347
        //               95: 347
        //               96: 347
        //               97: 347
        //               98: 347
        //               99: 347
        //              100: 347
        //              101: 347
        //              102: 347
        //          default: 156
        //        }
        //   156: aconst_null    
        //   157: astore          4
        //   159: aload           4
        //   161: ifnull          227
        //   164: iload_3        
        //   165: iconst_2       
        //   166: irem           
        //   167: iconst_1       
        //   168: if_icmpne       192
        //   171: iconst_m1      
        //   172: aload           4
        //   174: arraylength    
        //   175: iadd           
        //   176: istore          13
        //   178: aload           4
        //   180: iload           13
        //   182: bipush          15
        //   184: aload           4
        //   186: iload           13
        //   188: baload         
        //   189: ior            
        //   190: i2b            
        //   191: bastore        
        //   192: aload_0        
        //   193: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   196: sipush          255
        //   199: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //   202: iload_3        
        //   203: iconst_2       
        //   204: irem           
        //   205: bipush          7
        //   207: ishl           
        //   208: aload           4
        //   210: arraylength    
        //   211: ior            
        //   212: istore          14
        //   214: aload_0        
        //   215: iload           14
        //   217: invokespecial   com/whatsapp/protocol/bx.b:(I)V
        //   220: iload_2        
        //   221: ifeq            456
        //   224: aload           4
        //   226: astore_1       
        //   227: aload_0        
        //   228: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   231: sipush          252
        //   234: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //   237: aload_0        
        //   238: iload_3        
        //   239: invokespecial   com/whatsapp/protocol/bx.b:(I)V
        //   242: aload_0        
        //   243: getfield        com/whatsapp/protocol/bx.e:I
        //   246: ifle            440
        //   249: iload_3        
        //   250: aload_0        
        //   251: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   254: invokevirtual   com/whatsapp/protocol/ca.c:()I
        //   257: aload_0        
        //   258: getfield        com/whatsapp/protocol/bx.l:I
        //   261: isub           
        //   262: iadd           
        //   263: istore          7
        //   265: aload_0        
        //   266: getfield        com/whatsapp/protocol/bx.e:I
        //   269: istore          8
        //   271: iload           7
        //   273: iload           8
        //   275: if_icmplt       440
        //   278: iconst_0       
        //   279: istore          9
        //   281: iload           9
        //   283: iload_3        
        //   284: if_icmpge       336
        //   287: iload           9
        //   289: ifeq            434
        //   292: iconst_1       
        //   293: istore          10
        //   295: aload_0        
        //   296: iload           10
        //   298: iconst_0       
        //   299: invokespecial   com/whatsapp/protocol/bx.a:(ZZ)V
        //   302: aload_0        
        //   303: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   306: aload_1        
        //   307: iload           9
        //   309: iload_3        
        //   310: iload           9
        //   312: isub           
        //   313: aload_0        
        //   314: getfield        com/whatsapp/protocol/bx.e:I
        //   317: invokestatic    java/lang/Math.min:(II)I
        //   320: invokevirtual   com/whatsapp/protocol/ca.write:([BII)V
        //   323: iload           9
        //   325: aload_0        
        //   326: getfield        com/whatsapp/protocol/bx.e:I
        //   329: iadd           
        //   330: istore          11
        //   332: iload_2        
        //   333: ifeq            449
        //   336: return         
        //   337: astore          22
        //   339: aload           22
        //   341: athrow         
        //   342: astore          21
        //   344: aload           21
        //   346: athrow         
        //   347: iload           17
        //   349: bipush          48
        //   351: isub           
        //   352: istore          18
        //   354: iload_2        
        //   355: ifeq            372
        //   358: bipush          10
        //   360: iload           17
        //   362: bipush          45
        //   364: isub           
        //   365: iadd           
        //   366: istore          18
        //   368: iload_2        
        //   369: ifne            156
        //   372: iload           16
        //   374: iconst_2       
        //   375: idiv           
        //   376: istore          19
        //   378: aload           15
        //   380: iload           19
        //   382: aload           15
        //   384: iload           19
        //   386: baload         
        //   387: iload           18
        //   389: iconst_4       
        //   390: iconst_1       
        //   391: iload           16
        //   393: iconst_2       
        //   394: irem           
        //   395: isub           
        //   396: imul           
        //   397: ishl           
        //   398: i2b            
        //   399: ior            
        //   400: i2b            
        //   401: bastore        
        //   402: iload           16
        //   404: iconst_1       
        //   405: iadd           
        //   406: istore          20
        //   408: iload_2        
        //   409: ifeq            462
        //   412: aload           15
        //   414: astore          4
        //   416: goto            159
        //   419: astore          12
        //   421: aload           12
        //   423: athrow         
        //   424: astore          5
        //   426: aload           5
        //   428: athrow         
        //   429: astore          6
        //   431: aload           6
        //   433: athrow         
        //   434: iconst_0       
        //   435: istore          10
        //   437: goto            295
        //   440: aload_0        
        //   441: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   444: aload_1        
        //   445: invokevirtual   com/whatsapp/protocol/ca.write:([B)V
        //   448: return         
        //   449: iload           11
        //   451: istore          9
        //   453: goto            281
        //   456: aload           4
        //   458: astore_1       
        //   459: goto            242
        //   462: iload           20
        //   464: istore          16
        //   466: goto            77
        //   469: aconst_null    
        //   470: astore          4
        //   472: goto            159
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  13     28     337    342    Ljava/lang/IllegalArgumentException;
        //  39     54     342    347    Ljava/lang/IllegalArgumentException;
        //  171    192    419    424    Ljava/lang/IllegalArgumentException;
        //  214    220    424    429    Ljava/lang/IllegalArgumentException;
        //  227    242    424    429    Ljava/lang/IllegalArgumentException;
        //  242    271    429    434    Ljava/lang/IllegalArgumentException;
        //  339    342    342    347    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 230, Size: 230
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
    
    private void a(final bm[] array) {
        final int o = bi.O;
        if (array != null) {
            int i = 0;
            while (i < array.length) {
                this.a(array[i].a);
                this.a(array[i].b);
                ++i;
                if (o != 0) {
                    break;
                }
            }
        }
    }
    
    private void b() {
        final int n = this.k.c() - (this.l + this.h);
        final int n2 = this.m % this.d.length;
        final byte[] array = new byte[n + 5];
        bd.a(array, 0, 2, n + 2);
        this.a(array, 3);
        System.arraycopy(this.k.a(), this.l + this.h, array, 5, n);
        this.d[n2] = array;
    }
    
    private void b(final int n) {
        this.k.write(n & 0xFF);
    }
    
    private void b(final c0 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: iconst_0       
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/protocol/bi.O:I
        //     7: istore          4
        //     9: aload_1        
        //    10: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //    13: astore          6
        //    15: aload           6
        //    17: ifnonnull       194
        //    20: iconst_0       
        //    21: istore          7
        //    23: iload           7
        //    25: iconst_1       
        //    26: iadd           
        //    27: istore          8
        //    29: aload_1        
        //    30: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //    33: astore          10
        //    35: aload           10
        //    37: ifnonnull       211
        //    40: iconst_0       
        //    41: istore          11
        //    43: iload           11
        //    45: iload           8
        //    47: iadd           
        //    48: istore          12
        //    50: aload_1        
        //    51: getfield        com/whatsapp/protocol/c0.a:[B
        //    54: astore          15
        //    56: aload           15
        //    58: ifnonnull       74
        //    61: aload_1        
        //    62: getfield        com/whatsapp/protocol/c0.e:Ljava/io/InputStream;
        //    65: astore          21
        //    67: aload           21
        //    69: ifnonnull       74
        //    72: iconst_0       
        //    73: istore_2       
        //    74: iload_2        
        //    75: iload           12
        //    77: iadd           
        //    78: istore          16
        //    80: aload_0        
        //    81: iload           16
        //    83: invokespecial   com/whatsapp/protocol/bx.f:(I)V
        //    86: aload_0        
        //    87: aload_1        
        //    88: getfield        com/whatsapp/protocol/c0.f:Ljava/lang/String;
        //    91: invokespecial   com/whatsapp/protocol/bx.a:(Ljava/lang/String;)V
        //    94: aload_0        
        //    95: aload_1        
        //    96: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //    99: invokespecial   com/whatsapp/protocol/bx.a:([Lcom/whatsapp/protocol/bm;)V
        //   102: aload_1        
        //   103: getfield        com/whatsapp/protocol/c0.a:[B
        //   106: astore          20
        //   108: aload           20
        //   110: ifnull          126
        //   113: aload_0        
        //   114: aload_1        
        //   115: getfield        com/whatsapp/protocol/c0.a:[B
        //   118: invokespecial   com/whatsapp/protocol/bx.a:([B)V
        //   121: iload           4
        //   123: ifeq            145
        //   126: aload_1        
        //   127: getfield        com/whatsapp/protocol/c0.e:Ljava/io/InputStream;
        //   130: ifnull          145
        //   133: aload_0        
        //   134: aload_1        
        //   135: getfield        com/whatsapp/protocol/c0.e:Ljava/io/InputStream;
        //   138: aload_1        
        //   139: getfield        com/whatsapp/protocol/c0.b:I
        //   142: invokespecial   com/whatsapp/protocol/bx.a:(Ljava/io/InputStream;I)V
        //   145: aload_1        
        //   146: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //   149: ifnull          188
        //   152: aload_0        
        //   153: aload_1        
        //   154: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //   157: arraylength    
        //   158: invokespecial   com/whatsapp/protocol/bx.f:(I)V
        //   161: iload_3        
        //   162: aload_1        
        //   163: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //   166: arraylength    
        //   167: if_icmpge       188
        //   170: aload_0        
        //   171: aload_1        
        //   172: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //   175: iload_3        
        //   176: aaload         
        //   177: invokespecial   com/whatsapp/protocol/bx.b:(Lcom/whatsapp/protocol/c0;)V
        //   180: iinc            3, 1
        //   183: iload           4
        //   185: ifeq            161
        //   188: return         
        //   189: astore          5
        //   191: aload           5
        //   193: athrow         
        //   194: iconst_2       
        //   195: aload_1        
        //   196: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   199: arraylength    
        //   200: imul           
        //   201: istore          7
        //   203: goto            23
        //   206: astore          9
        //   208: aload           9
        //   210: athrow         
        //   211: iload_2        
        //   212: istore          11
        //   214: goto            43
        //   217: astore          13
        //   219: aload           13
        //   221: athrow         
        //   222: astore          14
        //   224: aload           14
        //   226: athrow         
        //   227: astore          17
        //   229: aload           17
        //   231: athrow         
        //   232: astore          18
        //   234: aload           18
        //   236: athrow         
        //   237: astore          19
        //   239: aload           19
        //   241: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      15     189    194    Ljava/lang/IllegalArgumentException;
        //  29     35     206    211    Ljava/lang/IllegalArgumentException;
        //  50     56     217    222    Ljava/lang/IllegalArgumentException;
        //  61     67     222    227    Ljava/lang/IllegalArgumentException;
        //  80     108    227    232    Ljava/lang/IllegalArgumentException;
        //  113    121    232    237    Ljava/lang/IllegalArgumentException;
        //  126    145    237    242    Ljava/lang/IllegalArgumentException;
        //  219    222    222    227    Ljava/lang/IllegalArgumentException;
        //  229    232    232    237    Ljava/lang/IllegalArgumentException;
        //  234    237    237    242    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 129, Size: 129
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
    
    private static void b(final OutputStream outputStream, final int n) {
        outputStream.write((0x7F000000 & n) >> 24);
        outputStream.write((0xFF0000 & n) >> 16);
        outputStream.write((0xFF00 & n) >> 8);
        outputStream.write((n & 0xFF) >> 0);
    }
    
    private void b(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //     4: sipush          250
        //     7: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //    10: aload_1        
        //    11: ifnull          25
        //    14: aload_0        
        //    15: aload_1        
        //    16: invokespecial   com/whatsapp/protocol/bx.a:(Ljava/lang/String;)V
        //    19: getstatic       com/whatsapp/protocol/bi.O:I
        //    22: ifeq            30
        //    25: aload_0        
        //    26: iconst_0       
        //    27: invokespecial   com/whatsapp/protocol/bx.e:(I)V
        //    30: aload_0        
        //    31: aload_2        
        //    32: invokespecial   com/whatsapp/protocol/bx.a:(Ljava/lang/String;)V
        //    35: return         
        //    36: astore_3       
        //    37: aload_3        
        //    38: athrow         
        //    39: astore          4
        //    41: aload           4
        //    43: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      10     36     39     Ljava/lang/IllegalArgumentException;
        //  14     25     39     44     Ljava/lang/IllegalArgumentException;
        //  25     30     39     44     Ljava/lang/IllegalArgumentException;
        //  37     39     39     44     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    private boolean b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ldc_w           "@"
        //     4: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //     7: istore          5
        //     9: iload           5
        //    11: iconst_m1      
        //    12: if_icmpeq       64
        //    15: aload_1        
        //    16: getstatic       com/whatsapp/protocol/bx.z:[Ljava/lang/String;
        //    19: bipush          12
        //    21: aaload         
        //    22: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    25: istore          9
        //    27: iload           9
        //    29: iconst_m1      
        //    30: if_icmpne       117
        //    33: aload_1        
        //    34: getstatic       com/whatsapp/protocol/bx.z:[Ljava/lang/String;
        //    37: bipush          10
        //    39: aaload         
        //    40: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    43: istore          10
        //    45: iload           10
        //    47: iconst_m1      
        //    48: if_icmpne       117
        //    51: iconst_1       
        //    52: ireturn        
        //    53: astore_2       
        //    54: aload_2        
        //    55: athrow         
        //    56: astore_3       
        //    57: aload_3        
        //    58: athrow         
        //    59: astore          4
        //    61: aload           4
        //    63: athrow         
        //    64: aload_1        
        //    65: getstatic       com/whatsapp/protocol/bx.z:[Ljava/lang/String;
        //    68: bipush          11
        //    70: aaload         
        //    71: iconst_1       
        //    72: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    75: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    78: istore          8
        //    80: iload           8
        //    82: iconst_m1      
        //    83: if_icmpne       117
        //    86: aload_1        
        //    87: getstatic       com/whatsapp/protocol/bx.z:[Ljava/lang/String;
        //    90: bipush          9
        //    92: aaload         
        //    93: iconst_1       
        //    94: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    97: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   100: iconst_m1      
        //   101: if_icmpeq       51
        //   104: goto            117
        //   107: astore          6
        //   109: aload           6
        //   111: athrow         
        //   112: astore          7
        //   114: aload           7
        //   116: athrow         
        //   117: iconst_0       
        //   118: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      9      53     56     Ljava/lang/IllegalArgumentException;
        //  15     27     56     59     Ljava/lang/IllegalArgumentException;
        //  33     45     59     64     Ljava/lang/IllegalArgumentException;
        //  54     56     56     59     Ljava/lang/IllegalArgumentException;
        //  57     59     59     64     Ljava/lang/IllegalArgumentException;
        //  64     80     107    112    Ljava/lang/IllegalArgumentException;
        //  86     104    112    117    Ljava/lang/IllegalArgumentException;
        //  109    112    112    117    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 65, Size: 65
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
    
    private void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: aload_0        
        //     3: monitorenter   
        //     4: getstatic       com/whatsapp/protocol/bi.O:I
        //     7: istore_3       
        //     8: aload_0        
        //     9: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    12: invokevirtual   com/whatsapp/protocol/ca.b:()V
        //    15: aload_0        
        //    16: aload_0        
        //    17: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    20: invokevirtual   com/whatsapp/protocol/ca.c:()I
        //    23: putfield        com/whatsapp/protocol/bx.l:I
        //    26: aload_0        
        //    27: getfield        com/whatsapp/protocol/bx.d:[[B
        //    30: astore          6
        //    32: aload           6
        //    34: ifnull          92
        //    37: iconst_2       
        //    38: istore          7
        //    40: iload           7
        //    42: iconst_3       
        //    43: iadd           
        //    44: istore          8
        //    46: aload_0        
        //    47: iload           8
        //    49: putfield        com/whatsapp/protocol/bx.h:I
        //    52: aload_0        
        //    53: getfield        com/whatsapp/protocol/bx.h:I
        //    56: istore          9
        //    58: iload_1        
        //    59: iload           9
        //    61: if_icmpge       79
        //    64: aload_0        
        //    65: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    68: iconst_0       
        //    69: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //    72: iinc            1, 1
        //    75: iload_3        
        //    76: ifeq            52
        //    79: aload_0        
        //    80: monitorexit    
        //    81: return         
        //    82: astore          5
        //    84: aload           5
        //    86: athrow         
        //    87: astore_2       
        //    88: aload_0        
        //    89: monitorexit    
        //    90: aload_2        
        //    91: athrow         
        //    92: iconst_0       
        //    93: istore          7
        //    95: goto            40
        //    98: astore          10
        //   100: goto            72
        //   103: astore          4
        //   105: goto            26
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      8      87     92     Any
        //  8      26     103    108    Ljava/io/IOException;
        //  8      26     87     92     Any
        //  26     32     82     87     Ljava/io/IOException;
        //  26     32     87     92     Any
        //  46     52     87     92     Any
        //  52     58     87     92     Any
        //  64     72     98     103    Ljava/io/IOException;
        //  64     72     87     92     Any
        //  84     87     87     92     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    private void c(final int n) {
        c(this.k, n);
    }
    
    private static void c(final OutputStream outputStream, final int n) {
        outputStream.write((0xFF00 & n) >> 8);
        outputStream.write((n & 0xFF) >> 0);
    }
    
    private boolean c(final c0 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/protocol/bi.O:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnull          189
        //     8: aload_1        
        //     9: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //    12: astore          4
        //    14: aload           4
        //    16: ifnull          126
        //    19: iconst_0       
        //    20: istore          10
        //    22: iload           10
        //    24: aload_1        
        //    25: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //    28: arraylength    
        //    29: if_icmpge       126
        //    32: aload_1        
        //    33: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //    36: iload           10
        //    38: aaload         
        //    39: astore          11
        //    41: aload           11
        //    43: getfield        com/whatsapp/protocol/bm.a:Ljava/lang/String;
        //    46: getstatic       com/whatsapp/protocol/bx.z:[Ljava/lang/String;
        //    49: bipush          7
        //    51: aaload         
        //    52: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    55: istore          15
        //    57: iload           15
        //    59: ifne            83
        //    62: aload           11
        //    64: getfield        com/whatsapp/protocol/bm.a:Ljava/lang/String;
        //    67: getstatic       com/whatsapp/protocol/bx.z:[Ljava/lang/String;
        //    70: bipush          8
        //    72: aaload         
        //    73: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    76: istore          17
        //    78: iload           17
        //    80: ifeq            119
        //    83: aload_0        
        //    84: aload           11
        //    86: getfield        com/whatsapp/protocol/bm.b:Ljava/lang/String;
        //    89: invokespecial   com/whatsapp/protocol/bx.b:(Ljava/lang/String;)Z
        //    92: istore          16
        //    94: iload           16
        //    96: ifne            119
        //    99: iconst_0       
        //   100: ireturn        
        //   101: astore_3       
        //   102: aload_3        
        //   103: athrow         
        //   104: astore          12
        //   106: aload           12
        //   108: athrow         
        //   109: astore          13
        //   111: aload           13
        //   113: athrow         
        //   114: astore          14
        //   116: aload           14
        //   118: athrow         
        //   119: iinc            10, 1
        //   122: iload_2        
        //   123: ifeq            22
        //   126: aload_1        
        //   127: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //   130: astore          6
        //   132: aload           6
        //   134: ifnonnull       144
        //   137: iconst_1       
        //   138: ireturn        
        //   139: astore          5
        //   141: aload           5
        //   143: athrow         
        //   144: iconst_0       
        //   145: istore          7
        //   147: iload           7
        //   149: aload_1        
        //   150: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //   153: arraylength    
        //   154: if_icmpge       182
        //   157: aload_0        
        //   158: aload_1        
        //   159: getfield        com/whatsapp/protocol/c0.d:[Lcom/whatsapp/protocol/c0;
        //   162: iload           7
        //   164: aaload         
        //   165: invokespecial   com/whatsapp/protocol/bx.c:(Lcom/whatsapp/protocol/c0;)Z
        //   168: istore          9
        //   170: iload           9
        //   172: ifeq            99
        //   175: iinc            7, 1
        //   178: iload_2        
        //   179: ifeq            147
        //   182: iconst_1       
        //   183: ireturn        
        //   184: astore          8
        //   186: aload           8
        //   188: athrow         
        //   189: iconst_1       
        //   190: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      14     101    104    Ljava/lang/IllegalArgumentException;
        //  41     57     104    109    Ljava/lang/IllegalArgumentException;
        //  62     78     109    114    Ljava/lang/IllegalArgumentException;
        //  83     94     114    119    Ljava/lang/IllegalArgumentException;
        //  106    109    109    114    Ljava/lang/IllegalArgumentException;
        //  111    114    114    119    Ljava/lang/IllegalArgumentException;
        //  126    132    139    144    Ljava/lang/IllegalArgumentException;
        //  157    170    184    189    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 99, Size: 99
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
    
    private void d() {
        synchronized (this) {
            this.k.e();
            this.h = 0;
            this.l = 0;
        }
    }
    
    private void d(final int n) {
        a(this.k, n);
    }
    
    private int e() {
        while (true) {
            while (true) {
                synchronized (this) {
                    if (this.g != null) {
                        int n = 8;
                        if (bi.O == 0) {
                            if (this.k.d()) {
                                n |= 0x4;
                            }
                            return n;
                        }
                    }
                }
                int n = 0;
                continue;
            }
        }
    }
    
    private void e(final int n) {
        while (true) {
            if (n < 245) {
                try {
                    this.k.write((byte)n);
                    if (bi.O != 0) {
                        if (n <= 500) {
                            try {
                                throw new IOException(bx.z[1]);
                            }
                            catch (IllegalArgumentException ex) {
                                throw ex;
                            }
                        }
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                return;
            }
            continue;
        }
    }
    
    private void f(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/protocol/bi.O:I
        //     3: istore_2       
        //     4: iload_1        
        //     5: ifne            20
        //     8: aload_0        
        //     9: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    12: iconst_0       
        //    13: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //    16: iload_2        
        //    17: ifeq            61
        //    20: iload_1        
        //    21: sipush          256
        //    24: if_icmpge       46
        //    27: aload_0        
        //    28: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    31: sipush          248
        //    34: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //    37: aload_0        
        //    38: iload_1        
        //    39: invokespecial   com/whatsapp/protocol/bx.b:(I)V
        //    42: iload_2        
        //    43: ifeq            61
        //    46: aload_0        
        //    47: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //    50: sipush          249
        //    53: invokevirtual   com/whatsapp/protocol/ca.write:(I)V
        //    56: aload_0        
        //    57: iload_1        
        //    58: invokespecial   com/whatsapp/protocol/bx.c:(I)V
        //    61: return         
        //    62: astore          4
        //    64: aload           4
        //    66: athrow         
        //    67: astore          5
        //    69: aload           5
        //    71: athrow         
        //    72: astore_3       
        //    73: aload_3        
        //    74: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      16     62     72     Ljava/lang/IllegalArgumentException;
        //  27     42     72     75     Ljava/lang/IllegalArgumentException;
        //  46     61     72     75     Ljava/lang/IllegalArgumentException;
        //  64     67     67     72     Ljava/lang/IllegalArgumentException;
        //  69     72     72     75     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    @Override
    public void a() {
        synchronized (this) {
            this.c();
            this.f(1);
            this.k.write(2);
            this.a(true);
        }
    }
    
    @Override
    public void a(final b4 g) {
        synchronized (this) {
            try {
                this.g = g;
                if (this.k != null) {
                    this.k.a(this.g);
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public void a(final c0 c0) {
        synchronized (this) {
            this.a(c0, 1);
        }
    }
    
    @Override
    public void a(final c0 p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_3       
        //     2: aload_0        
        //     3: monitorenter   
        //     4: getstatic       com/whatsapp/protocol/bi.O:I
        //     7: istore          5
        //     9: iload_2        
        //    10: iconst_1       
        //    11: iand           
        //    12: ifeq            68
        //    15: iload_3        
        //    16: istore          6
        //    18: iload_2        
        //    19: iconst_2       
        //    20: iand           
        //    21: ifeq            74
        //    24: aload_0        
        //    25: getfield        com/whatsapp/protocol/bx.j:Z
        //    28: istore          9
        //    30: iload           9
        //    32: ifeq            84
        //    35: aload_0        
        //    36: aload_1        
        //    37: invokespecial   com/whatsapp/protocol/bx.c:(Lcom/whatsapp/protocol/c0;)Z
        //    40: ifne            84
        //    43: new             Ljava/lang/IllegalArgumentException;
        //    46: dup            
        //    47: getstatic       com/whatsapp/protocol/bx.z:[Ljava/lang/String;
        //    50: iconst_0       
        //    51: aaload         
        //    52: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    55: athrow         
        //    56: astore          8
        //    58: aload           8
        //    60: athrow         
        //    61: astore          4
        //    63: aload_0        
        //    64: monitorexit    
        //    65: aload           4
        //    67: athrow         
        //    68: iconst_0       
        //    69: istore          6
        //    71: goto            18
        //    74: iconst_0       
        //    75: istore_3       
        //    76: goto            24
        //    79: astore          7
        //    81: aload           7
        //    83: athrow         
        //    84: aload_0        
        //    85: invokespecial   com/whatsapp/protocol/bx.c:()V
        //    88: aload_1        
        //    89: ifnonnull       104
        //    92: aload_0        
        //    93: iload           6
        //    95: iconst_0       
        //    96: invokespecial   com/whatsapp/protocol/bx.a:(ZI)V
        //    99: iload           5
        //   101: ifeq            159
        //   104: getstatic       com/whatsapp/protocol/bx.c:Z
        //   107: istore          14
        //   109: iload           14
        //   111: ifne            118
        //   114: iload_3        
        //   115: ifeq            125
        //   118: aload_0        
        //   119: getfield        com/whatsapp/protocol/bx.k:Lcom/whatsapp/protocol/ca;
        //   122: invokevirtual   com/whatsapp/protocol/ca.f:()V
        //   125: aload_0        
        //   126: aload_1        
        //   127: invokespecial   com/whatsapp/protocol/bx.b:(Lcom/whatsapp/protocol/c0;)V
        //   130: aload_0        
        //   131: getfield        com/whatsapp/protocol/bx.b:Z
        //   134: istore          17
        //   136: iload           17
        //   138: ifeq            153
        //   141: aload_0        
        //   142: iload           6
        //   144: iconst_1       
        //   145: invokespecial   com/whatsapp/protocol/bx.a:(ZZ)V
        //   148: iload           5
        //   150: ifeq            159
        //   153: aload_0        
        //   154: iload           6
        //   156: invokespecial   com/whatsapp/protocol/bx.a:(Z)V
        //   159: aload_0        
        //   160: monitorexit    
        //   161: return         
        //   162: astore          10
        //   164: aload           10
        //   166: athrow         
        //   167: astore          11
        //   169: aload           11
        //   171: athrow         
        //   172: astore          12
        //   174: aload           12
        //   176: athrow         
        //   177: astore          13
        //   179: aload           13
        //   181: athrow         
        //   182: astore          15
        //   184: aload           15
        //   186: athrow         
        //   187: astore          16
        //   189: aload           16
        //   191: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      9      61     68     Any
        //  24     30     79     84     Ljava/lang/IllegalArgumentException;
        //  24     30     61     68     Any
        //  35     56     56     61     Ljava/lang/IllegalArgumentException;
        //  35     56     61     68     Any
        //  58     61     61     68     Any
        //  81     84     56     61     Ljava/lang/IllegalArgumentException;
        //  81     84     61     68     Any
        //  84     88     162    167    Ljava/lang/IllegalArgumentException;
        //  84     88     61     68     Any
        //  92     99     167    172    Ljava/lang/IllegalArgumentException;
        //  92     99     61     68     Any
        //  104    109    172    177    Ljava/lang/IllegalArgumentException;
        //  104    109    61     68     Any
        //  118    125    177    182    Ljava/lang/IllegalArgumentException;
        //  118    125    61     68     Any
        //  125    136    182    187    Ljava/lang/IllegalArgumentException;
        //  125    136    61     68     Any
        //  141    148    187    192    Ljava/lang/IllegalArgumentException;
        //  141    148    61     68     Any
        //  153    159    187    192    Ljava/lang/IllegalArgumentException;
        //  153    159    61     68     Any
        //  164    167    167    172    Ljava/lang/IllegalArgumentException;
        //  164    167    61     68     Any
        //  169    172    172    177    Ljava/lang/IllegalArgumentException;
        //  169    172    61     68     Any
        //  174    177    177    182    Ljava/lang/IllegalArgumentException;
        //  174    177    61     68     Any
        //  179    182    61     68     Any
        //  184    187    187    192    Ljava/lang/IllegalArgumentException;
        //  184    187    61     68     Any
        //  189    192    61     68     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 106, Size: 106
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
    
    @Override
    public void a(final c0 c0, final boolean b) {
        // monitorenter(this)
        Label_0017: {
            if (!b) {
                break Label_0017;
            }
            int n = 1;
            try {
                while (true) {
                    this.a(c0, n);
                    return;
                    n = 0;
                    continue;
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    @Override
    public void a(final String s, final String s2) {
        synchronized (this) {
            this.d();
            this.k.write(new byte[] { 87, 65, 1, 5 });
            this.c();
            final bm[] array = { new bm(bx.z[3], s), new bm(bx.z[2], s2) };
            this.f(1 + 2 * array.length);
            this.k.write(1);
            this.a(array);
            this.a(false);
        }
    }
    
    public void a(final byte[] array, final int n) {
        array[n] = (byte)((0xFF00 & this.m) >> 8);
        array[n + 1] = (byte)((0xFF & this.m) >> 0);
    }
    
    @Override
    public byte[] a(final c0 c0) {
        synchronized (this) {
            this.d();
            this.b(c0);
            final int c2 = this.k.c();
            final byte[] array = new byte[c2];
            System.arraycopy(this.k.a(), 0, array, 0, c2);
            return array;
        }
    }
    
    public void f() {
        synchronized (this) {
            try {
                if (this.k.c() > 0) {
                    this.f.write(this.k.a(), 0, this.k.c());
                    this.f.flush();
                    this.d();
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
}
