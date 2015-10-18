// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.List;

public final class bP
{
    private static final String[] b;
    private static final String[] c;
    private static final String[] d;
    public static boolean e;
    private static final String[] f;
    private static final String[] g;
    private static final String[] z;
    private fi a;
    
    static {
        final String[] array = new String[2];
        String s = "t\u000b4|sW\b<9";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_1688:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\u0007';
                        break;
                    }
                    case 0: {
                        c3 = '6';
                        break;
                    }
                    case 1: {
                        c3 = 'j';
                        break;
                    }
                    case 2: {
                        c3 = 'P';
                        break;
                    }
                    case 3: {
                        c3 = '\\';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "u>\u0002\u0010X";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    z = array3;
                    array2 = (array3 = new String[32]);
                    s = "u>\u0002\u0010Xf9";
                    n = 1;
                    n2 = 0;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    array3[1] = " ";
                    array3[2] = "A";
                    array3[3] = "B";
                    array3[4] = "C";
                    array3[5] = "D";
                    array3[6] = "E";
                    array3[7] = "F";
                    array3[8] = "G";
                    array3[9] = "H";
                    array3[10] = "I";
                    array3[11] = "J";
                    array3[12] = "K";
                    array3[13] = "L";
                    array3[14] = "M";
                    array3[15] = "N";
                    array3[16] = "O";
                    array3[17] = "P";
                    array3[18] = "Q";
                    array3[19] = "R";
                    array3[20] = "S";
                    array3[21] = "T";
                    array3[22] = "U";
                    array3[23] = "V";
                    array3[24] = "W";
                    array3[25] = "X";
                    array3[26] = "Y";
                    array3[27] = "Z";
                    n2 = 28;
                    array2 = array3;
                    s = "u>\u0002\u0010Xz&";
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    n2 = 29;
                    array2 = array3;
                    s = "u>\u0002\u0010X{&";
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 30;
                    s = "u>\u0002\u0010Xr&";
                    n = 4;
                    array2 = array3;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    n2 = 31;
                    s = "u>\u0002\u0010Xt9";
                    n = 5;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    g = array3;
                    final String[] array4 = new String[32];
                    s = "u>\u0002\u0010Xf9";
                    n = 6;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    array3[1] = " ";
                    array3[2] = "a";
                    array3[3] = "b";
                    array3[4] = "c";
                    array3[5] = "d";
                    array3[6] = "e";
                    array3[7] = "f";
                    array3[8] = "g";
                    array3[9] = "h";
                    array3[10] = "i";
                    array3[11] = "j";
                    array3[12] = "k";
                    array3[13] = "l";
                    array3[14] = "m";
                    array3[15] = "n";
                    array3[16] = "o";
                    array3[17] = "p";
                    array3[18] = "q";
                    array3[19] = "r";
                    array3[20] = "s";
                    array3[21] = "t";
                    array3[22] = "u";
                    array3[23] = "v";
                    array3[24] = "w";
                    array3[25] = "x";
                    array3[26] = "y";
                    array3[27] = "z";
                    n2 = 28;
                    array2 = array3;
                    s = "u>\u0002\u0010Xc9";
                    n = 7;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    n2 = 29;
                    s = "u>\u0002\u0010X{&";
                    n = 8;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    n2 = 30;
                    s = "u>\u0002\u0010Xr&";
                    n = 9;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    n2 = 31;
                    s = "u>\u0002\u0010Xt9";
                    n = 10;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    d = array3;
                    final String[] array5 = new String[32];
                    s = "u>\u0002\u0010Xf9";
                    n = 11;
                    array2 = array5;
                    array3 = array5;
                    n2 = 0;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    array3[1] = " ";
                    array3[2] = "\u0001";
                    array3[3] = "\u0002";
                    array3[4] = "\u0003";
                    array3[5] = "\u0004";
                    array3[6] = "\u0005";
                    array3[7] = "\u0006";
                    array3[8] = "\u0007";
                    array3[9] = "\b";
                    array3[10] = "\t";
                    array3[11] = "\n";
                    array3[12] = "\u000b";
                    array3[13] = "\f";
                    array3[14] = "\r";
                    array3[15] = "\u001b";
                    array3[16] = "\u001c";
                    array3[17] = "\u001d";
                    array3[18] = "\u001e";
                    array3[19] = "\u001f";
                    array3[20] = "@";
                    array3[21] = "\\";
                    array3[22] = "^";
                    array3[23] = "_";
                    array3[24] = "`";
                    array3[25] = "|";
                    array3[26] = "~";
                    array3[27] = "\u007f";
                    n2 = 28;
                    s = "u>\u0002\u0010Xz&";
                    n = 12;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 29;
                    s = "u>\u0002\u0010Xc&";
                    n = 13;
                    array2 = array3;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 30;
                    s = "u>\u0002\u0010Xf&";
                    n = 14;
                    array2 = array3;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 31;
                    s = "u>\u0002\u0010Xt9";
                    n = 15;
                    array2 = array3;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    b = array3;
                    final String[] array6 = new String[32];
                    array6[0] = "";
                    array6[1] = "\r";
                    s = ";`";
                    n = 16;
                    array2 = array6;
                    array3 = array6;
                    n2 = 2;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    s = "\u0018J";
                    n = 17;
                    n2 = 3;
                    array2 = array3;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    n2 = 4;
                    s = "\u001aJ";
                    n = 18;
                    array2 = array3;
                    continue;
                }
                case 18: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "\fJ";
                    n = 19;
                    array2 = array3;
                    continue;
                }
                case 19: {
                    array2[n2] = intern;
                    array3[6] = "!";
                    array3[7] = "\"";
                    array3[8] = "#";
                    array3[9] = "$";
                    array3[10] = "%";
                    array3[11] = "&";
                    array3[12] = "'";
                    array3[13] = "(";
                    array3[14] = ")";
                    array3[15] = "*";
                    array3[16] = "+";
                    array3[17] = ",";
                    array3[18] = "-";
                    array3[19] = ".";
                    array3[20] = "/";
                    array3[21] = ":";
                    array3[22] = ";";
                    array3[23] = "<";
                    array3[24] = "=";
                    array3[25] = ">";
                    array3[26] = "?";
                    array3[27] = "[";
                    array3[28] = "]";
                    array3[29] = "{";
                    array3[30] = "}";
                    n2 = 31;
                    s = "u>\u0002\u0010Xc&";
                    n = 20;
                    array2 = array3;
                    continue;
                }
                case 20: {
                    array2[n2] = intern;
                    c = array3;
                    final String[] array7 = new String[16];
                    s = "u>\u0002\u0010Xf9";
                    n = 21;
                    array2 = array7;
                    array3 = array7;
                    n2 = 0;
                    continue;
                }
                case 21: {
                    array2[n2] = intern;
                    array3[1] = " ";
                    array3[2] = "0";
                    array3[3] = "1";
                    array3[4] = "2";
                    array3[5] = "3";
                    array3[6] = "4";
                    array3[7] = "5";
                    array3[8] = "6";
                    array3[9] = "7";
                    array3[10] = "8";
                    array3[11] = "9";
                    array3[12] = ",";
                    array3[13] = ".";
                    n2 = 14;
                    s = "u>\u0002\u0010Xc&";
                    n = 22;
                    array2 = array3;
                    continue;
                }
                case 22: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "u>\u0002\u0010Xc9";
                    n = 23;
                    array2 = array3;
                    continue;
                }
                case 23: {
                    break Label_1688;
                }
            }
        }
        array2[n2] = intern;
        f = array3;
    }
    
    private static int a(final int n, final boolean b) {
        int n2;
        if (b) {
            n2 = 88;
        }
        else {
            n2 = 112;
        }
        return n * (n2 + n * 16);
    }
    
    private static int a(final boolean[] array, final int n, final int n2) {
        final boolean e = bP.e;
        int n3 = 0;
        int i = n;
        while (i < n + n2) {
            n3 <<= 1;
            if (array[i]) {
                n3 |= 0x1;
            }
            ++i;
            if (e) {
                break;
            }
        }
        return n3;
    }
    
    private static l a(final char c) {
        switch (c) {
            default: {
                return l.UPPER;
            }
            case 'L': {
                try {
                    return l.LOWER;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            case 'P': {
                return l.PUNCT;
            }
            case 'M': {
                return l.MIXED;
            }
            case 'D': {
                return l.DIGIT;
            }
            case 'B': {
                return l.BINARY;
            }
        }
    }
    
    private static String a(final l l, final int n) {
        try {
            switch (D.a[l.ordinal()]) {
                default: {
                    throw new IllegalStateException(bP.z[0]);
                }
                case 1: {
                    return bP.g[n];
                }
                case 2: {
                    break;
                }
                case 3: {
                    return bP.b[n];
                }
                case 4: {
                    return bP.c[n];
                }
                case 5: {
                    return bP.f[n];
                }
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return bP.d[n];
    }
    
    private static String a(final boolean[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/bP.e:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: arraylength    
        //     6: istore_2       
        //     7: getstatic       com/google/l.UPPER:Lcom/google/l;
        //    10: astore_3       
        //    11: getstatic       com/google/l.UPPER:Lcom/google/l;
        //    14: astore          4
        //    16: new             Ljava/lang/StringBuilder;
        //    19: dup            
        //    20: bipush          20
        //    22: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    25: astore          5
        //    27: iconst_0       
        //    28: istore          6
        //    30: iload           6
        //    32: iload_2        
        //    33: if_icmpge       284
        //    36: getstatic       com/google/l.BINARY:Lcom/google/l;
        //    39: astore          9
        //    41: aload           4
        //    43: aload           9
        //    45: if_acmpne       339
        //    48: iload_2        
        //    49: iload           6
        //    51: isub           
        //    52: iconst_5       
        //    53: if_icmpge       60
        //    56: iload_1        
        //    57: ifeq            284
        //    60: aload_0        
        //    61: iload           6
        //    63: iconst_5       
        //    64: invokestatic    com/google/bP.a:([ZII)I
        //    67: istore          17
        //    69: iload           6
        //    71: iconst_5       
        //    72: iadd           
        //    73: istore          18
        //    75: iload           17
        //    77: ifne            109
        //    80: iload_2        
        //    81: iload           18
        //    83: isub           
        //    84: bipush          11
        //    86: if_icmpge       93
        //    89: iload_1        
        //    90: ifeq            284
        //    93: bipush          31
        //    95: aload_0        
        //    96: iload           18
        //    98: bipush          11
        //   100: invokestatic    com/google/bP.a:([ZII)I
        //   103: iadd           
        //   104: istore          17
        //   106: iinc            18, 11
        //   109: iconst_0       
        //   110: istore          19
        //   112: iload           19
        //   114: iload           17
        //   116: if_icmpge       160
        //   119: iload_2        
        //   120: iload           18
        //   122: isub           
        //   123: bipush          8
        //   125: if_icmpge       135
        //   128: iload_1        
        //   129: ifeq            333
        //   132: iload_2        
        //   133: istore          18
        //   135: aload           5
        //   137: aload_0        
        //   138: iload           18
        //   140: bipush          8
        //   142: invokestatic    com/google/bP.a:([ZII)I
        //   145: i2c            
        //   146: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   149: pop            
        //   150: iinc            18, 8
        //   153: iinc            19, 1
        //   156: iload_1        
        //   157: ifeq            112
        //   160: iload           18
        //   162: istore          20
        //   164: iload_1        
        //   165: ifeq            323
        //   168: iload           20
        //   170: istore          6
        //   172: aload_3        
        //   173: astore          10
        //   175: getstatic       com/google/l.DIGIT:Lcom/google/l;
        //   178: astore          12
        //   180: aload           10
        //   182: aload           12
        //   184: if_acmpne       305
        //   187: iconst_4       
        //   188: istore          13
        //   190: iload_2        
        //   191: iload           6
        //   193: isub           
        //   194: iload           13
        //   196: if_icmpge       203
        //   199: iload_1        
        //   200: ifeq            284
        //   203: aload_0        
        //   204: iload           6
        //   206: iload           13
        //   208: invokestatic    com/google/bP.a:([ZII)I
        //   211: istore          14
        //   213: iload           6
        //   215: iload           13
        //   217: iadd           
        //   218: istore          6
        //   220: aload           10
        //   222: iload           14
        //   224: invokestatic    com/google/bP.a:(Lcom/google/l;I)Ljava/lang/String;
        //   227: astore          15
        //   229: aload           15
        //   231: getstatic       com/google/bP.z:[Ljava/lang/String;
        //   234: iconst_1       
        //   235: aaload         
        //   236: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   239: ifeq            317
        //   242: aload           15
        //   244: iconst_5       
        //   245: invokevirtual   java/lang/String.charAt:(I)C
        //   248: invokestatic    com/google/bP.a:(C)Lcom/google/l;
        //   251: astore          4
        //   253: aload           15
        //   255: bipush          6
        //   257: invokevirtual   java/lang/String.charAt:(I)C
        //   260: bipush          76
        //   262: if_icmpne       280
        //   265: iload_1        
        //   266: ifeq            311
        //   269: aload           5
        //   271: aload           15
        //   273: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   276: pop            
        //   277: aload           4
        //   279: astore_3       
        //   280: iload_1        
        //   281: ifeq            30
        //   284: aload           5
        //   286: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   289: areturn        
        //   290: astore          7
        //   292: aload           7
        //   294: athrow         
        //   295: astore          8
        //   297: aload           8
        //   299: athrow         
        //   300: astore          11
        //   302: aload           11
        //   304: athrow         
        //   305: iconst_5       
        //   306: istore          13
        //   308: goto            190
        //   311: aload           4
        //   313: astore_3       
        //   314: goto            280
        //   317: aload_3        
        //   318: astore          4
        //   320: goto            269
        //   323: iload           20
        //   325: istore          6
        //   327: aload_3        
        //   328: astore          4
        //   330: goto            30
        //   333: iload_2        
        //   334: istore          20
        //   336: goto            164
        //   339: aload           4
        //   341: astore          10
        //   343: goto            175
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  36     41     290    300    Ljava/lang/IllegalStateException;
        //  175    180    300    305    Ljava/lang/IllegalStateException;
        //  292    295    295    300    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0175:
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
    
    private boolean[] b(final boolean[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/bP.e:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/google/bP.a:Lcom/google/fi;
        //     8: invokevirtual   com/google/fi.a:()I
        //    11: iconst_2       
        //    12: if_icmpgt       28
        //    15: bipush          6
        //    17: istore          7
        //    19: getstatic       com/google/gN.g:Lcom/google/gN;
        //    22: astore          8
        //    24: iload_2        
        //    25: ifeq            95
        //    28: aload_0        
        //    29: getfield        com/google/bP.a:Lcom/google/fi;
        //    32: invokevirtual   com/google/fi.a:()I
        //    35: istore          4
        //    37: iload           4
        //    39: bipush          8
        //    41: if_icmpgt       57
        //    44: bipush          8
        //    46: istore          7
        //    48: getstatic       com/google/gN.m:Lcom/google/gN;
        //    51: astore          8
        //    53: iload_2        
        //    54: ifeq            95
        //    57: aload_0        
        //    58: getfield        com/google/bP.a:Lcom/google/fi;
        //    61: invokevirtual   com/google/fi.a:()I
        //    64: istore          6
        //    66: iload           6
        //    68: bipush          22
        //    70: if_icmpgt       86
        //    73: bipush          10
        //    75: istore          7
        //    77: getstatic       com/google/gN.a:Lcom/google/gN;
        //    80: astore          8
        //    82: iload_2        
        //    83: ifeq            95
        //    86: bipush          12
        //    88: istore          7
        //    90: getstatic       com/google/gN.c:Lcom/google/gN;
        //    93: astore          8
        //    95: aload_0        
        //    96: getfield        com/google/bP.a:Lcom/google/fi;
        //    99: invokevirtual   com/google/fi.c:()I
        //   102: istore          9
        //   104: aload_1        
        //   105: arraylength    
        //   106: iload           7
        //   108: idiv           
        //   109: istore          10
        //   111: iload           10
        //   113: iload           9
        //   115: if_icmpge       135
        //   118: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   121: athrow         
        //   122: astore          34
        //   124: aload           34
        //   126: athrow         
        //   127: astore_3       
        //   128: aload_3        
        //   129: athrow         
        //   130: astore          5
        //   132: aload           5
        //   134: athrow         
        //   135: aload_1        
        //   136: arraylength    
        //   137: iload           7
        //   139: irem           
        //   140: istore          11
        //   142: iload           10
        //   144: iload           9
        //   146: isub           
        //   147: istore          12
        //   149: iload           10
        //   151: newarray        I
        //   153: astore          13
        //   155: iconst_0       
        //   156: istore          14
        //   158: iload           14
        //   160: iload           10
        //   162: if_icmpge       192
        //   165: aload           13
        //   167: iload           14
        //   169: aload_1        
        //   170: iload           11
        //   172: iload           7
        //   174: invokestatic    com/google/bP.a:([ZII)I
        //   177: iastore        
        //   178: iinc            14, 1
        //   181: iload           11
        //   183: iload           7
        //   185: iadd           
        //   186: istore          11
        //   188: iload_2        
        //   189: ifeq            158
        //   192: new             Lcom/google/cO;
        //   195: dup            
        //   196: aload           8
        //   198: invokespecial   com/google/cO.<init>:(Lcom/google/gN;)V
        //   201: aload           13
        //   203: iload           12
        //   205: invokevirtual   com/google/cO.a:([II)V
        //   208: iconst_m1      
        //   209: iconst_1       
        //   210: iload           7
        //   212: ishl           
        //   213: iadd           
        //   214: istore          16
        //   216: iconst_0       
        //   217: istore          17
        //   219: iconst_0       
        //   220: istore          18
        //   222: iload           18
        //   224: iload           9
        //   226: if_icmpge       288
        //   229: aload           13
        //   231: iload           18
        //   233: iaload         
        //   234: istore          32
        //   236: iload           32
        //   238: ifeq            248
        //   241: iload           32
        //   243: iload           16
        //   245: if_icmpne       263
        //   248: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   251: athrow         
        //   252: astore          33
        //   254: aload           33
        //   256: athrow         
        //   257: astore          15
        //   259: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   262: athrow         
        //   263: iload           32
        //   265: iconst_1       
        //   266: if_icmpeq       278
        //   269: iload           32
        //   271: iload           16
        //   273: iconst_1       
        //   274: isub           
        //   275: if_icmpne       281
        //   278: iinc            17, 1
        //   281: iinc            18, 1
        //   284: iload_2        
        //   285: ifeq            222
        //   288: iload           9
        //   290: iload           7
        //   292: imul           
        //   293: iload           17
        //   295: isub           
        //   296: newarray        Z
        //   298: astore          19
        //   300: iconst_0       
        //   301: istore          20
        //   303: iconst_0       
        //   304: istore          21
        //   306: iload           21
        //   308: iload           9
        //   310: if_icmpge       442
        //   313: aload           13
        //   315: iload           21
        //   317: iaload         
        //   318: istore          22
        //   320: iload           22
        //   322: iconst_1       
        //   323: if_icmpeq       335
        //   326: iload           22
        //   328: iload           16
        //   330: iconst_1       
        //   331: isub           
        //   332: if_icmpne       486
        //   335: iconst_m1      
        //   336: iload           20
        //   338: iload           7
        //   340: iadd           
        //   341: iadd           
        //   342: istore          23
        //   344: iload           22
        //   346: iconst_1       
        //   347: if_icmple       445
        //   350: iconst_1       
        //   351: istore          24
        //   353: aload           19
        //   355: iload           20
        //   357: iload           23
        //   359: iload           24
        //   361: invokestatic    java/util/Arrays.fill:([ZIIZ)V
        //   364: iload           20
        //   366: iload           7
        //   368: iconst_1       
        //   369: isub           
        //   370: iadd           
        //   371: istore          25
        //   373: iload_2        
        //   374: ifeq            432
        //   377: iload           7
        //   379: iconst_1       
        //   380: isub           
        //   381: istore          27
        //   383: iload           25
        //   385: istore          28
        //   387: iload           27
        //   389: iflt            479
        //   392: iload           28
        //   394: iconst_1       
        //   395: iadd           
        //   396: istore          29
        //   398: iload           22
        //   400: iconst_1       
        //   401: iload           27
        //   403: ishl           
        //   404: iand           
        //   405: ifeq            451
        //   408: iconst_1       
        //   409: istore          30
        //   411: aload           19
        //   413: iload           28
        //   415: iload           30
        //   417: bastore        
        //   418: iload           27
        //   420: iconst_1       
        //   421: isub           
        //   422: istore          31
        //   424: iload_2        
        //   425: ifeq            468
        //   428: iload           29
        //   430: istore          25
        //   432: iload           21
        //   434: iconst_1       
        //   435: iadd           
        //   436: istore          26
        //   438: iload_2        
        //   439: ifeq            457
        //   442: aload           19
        //   444: areturn        
        //   445: iconst_0       
        //   446: istore          24
        //   448: goto            353
        //   451: iconst_0       
        //   452: istore          30
        //   454: goto            411
        //   457: iload           26
        //   459: istore          21
        //   461: iload           25
        //   463: istore          20
        //   465: goto            306
        //   468: iload           31
        //   470: istore          27
        //   472: iload           29
        //   474: istore          28
        //   476: goto            387
        //   479: iload           28
        //   481: istore          25
        //   483: goto            432
        //   486: iload           20
        //   488: istore          25
        //   490: goto            377
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  28     37     127    130    Lcom/google/dA;
        //  57     66     130    135    Lcom/google/dA;
        //  118    122    122    127    Lcom/google/dA;
        //  192    208    257    263    Lcom/google/dA;
        //  248    252    252    257    Lcom/google/dA;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    
    public aS a(final fi a) {
        while (true) {
            final boolean e = bP.e;
            this.a = a;
            final String a2 = a(this.b(this.a(a.b())));
            while (true) {
                Label_0073: {
                    try {
                        final aS as = new aS(null, a2, null, null);
                        if (fN.a != 0) {
                            if (!e) {
                                break Label_0073;
                            }
                            final boolean e2 = false;
                            bP.e = e2;
                        }
                        return as;
                    }
                    catch (IllegalStateException ex) {
                        try {
                            throw ex;
                        }
                        catch (IllegalStateException ex2) {
                            throw ex2;
                        }
                    }
                }
                final boolean e2 = true;
                continue;
            }
        }
    }
    
    boolean[] a(final L l) {
        final boolean e = bP.e;
        final boolean b = this.a.b();
        final int a = this.a.a();
        int n;
        if (b) {
            n = 11 + a * 4;
        }
        else {
            n = 14 + a * 4;
        }
        final int[] array = new int[n];
        final boolean[] array2 = new boolean[a(a, b)];
        Label_0180: {
            if (b) {
                int i = 0;
                while (i < array.length) {
                    array[i] = i;
                    ++i;
                    if (e) {
                        ++fN.a;
                        break;
                    }
                }
                if (!e) {
                    break Label_0180;
                }
            }
            final int n2 = n + 1 + 2 * ((-1 + n / 2) / 15);
            final int n3 = n / 2;
            final int n4 = n2 / 2;
            int j = 0;
            while (j < n3) {
                final int n5 = j + j / 15;
                array[-1 + (n3 - j)] = -1 + (n4 - n5);
                array[n3 + j] = 1 + (n5 + n4);
                ++j;
                if (e) {
                    break;
                }
            }
        }
        int n6 = 0;
        int n15;
        for (int k = 0; k < a; k = n15) {
            int n7;
            if (b) {
                n7 = 9 + 4 * (a - k);
            }
            else {
                n7 = 12 + 4 * (a - k);
            }
            final int n8 = k * 2;
            final int n9 = n - 1 - n8;
            int n13;
            for (int n10 = 0; n10 < n7; n10 = n13) {
                final int n11 = n10 * 2;
                int n12 = 0;
                while (n12 < 2) {
                    array2[n12 + (n6 + n11)] = l.a(array[n8 + n12], array[n8 + n10]);
                    array2[n12 + (n11 + (n6 + n7 * 2))] = l.a(array[n8 + n10], array[n9 - n12]);
                    array2[n12 + (n11 + (n6 + n7 * 4))] = l.a(array[n9 - n12], array[n9 - n10]);
                    array2[n12 + (n11 + (n6 + n7 * 6))] = l.a(array[n9 - n10], array[n8 + n12]);
                    ++n12;
                    if (e) {
                        break;
                    }
                }
                n13 = n10 + 1;
                if (e) {
                    break;
                }
            }
            final int n14 = n6 + n7 * 8;
            n15 = k + 1;
            if (e) {
                break;
            }
            n6 = n14;
        }
        return array2;
    }
}
