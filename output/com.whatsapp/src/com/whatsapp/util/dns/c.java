// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.dns;

import java.io.OutputStream;

class c
{
    private static final String[] z;
    private final boolean a;
    private final short b;
    private final boolean c;
    private final short d;
    private final short e;
    private final short f;
    private final boolean g;
    private final boolean h;
    private final byte i;
    private final short j;
    private final short k;
    private final boolean l;
    
    static {
        final String[] z2 = new String[4];
        String s = "3w\u001akFqj\u0001kFq`\u0001z\u00152a\u0000zT8`Nk[>{\tf\u00155o\u001ao";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = 'Q';
                        break;
                    }
                    case 1: {
                        c2 = '\u000e';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
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
                    s = "3w\u001akFqc\u000fw\u0015?a\u001a.W4.\u0000{Y=";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "3w\u001akFqc\u000fw\u0015?a\u001a.W4.\u0000{Y=";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "3w\u001akFqj\u0001kFq`\u0001z\u00152a\u0000zT8`Nk[>{\tf\u0015\"~\u000fmP";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    c(final short j, final boolean c, final byte i, final boolean g, final boolean a, final boolean h, final boolean l, final short k, final short f, final short d, final short e, final short b) {
        this.j = j;
        this.c = c;
        this.i = i;
        this.g = g;
        this.a = a;
        this.h = h;
        this.l = l;
        this.k = k;
        this.f = f;
        this.d = d;
        this.e = e;
        this.b = b;
    }
    
    static c a(final byte[] p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/dns/b.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: ifnonnull       26
        //     8: new             Ljava/lang/NullPointerException;
        //    11: dup            
        //    12: getstatic       com/whatsapp/util/dns/c.z:[Ljava/lang/String;
        //    15: iconst_1       
        //    16: aaload         
        //    17: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    20: athrow         
        //    21: astore          36
        //    23: aload           36
        //    25: athrow         
        //    26: aload_0        
        //    27: arraylength    
        //    28: iload_1        
        //    29: bipush          12
        //    31: iadd           
        //    32: if_icmpge       51
        //    35: new             Ljava/lang/IllegalArgumentException;
        //    38: dup            
        //    39: getstatic       com/whatsapp/util/dns/c.z:[Ljava/lang/String;
        //    42: iconst_0       
        //    43: aaload         
        //    44: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    47: athrow         
        //    48: astore_3       
        //    49: aload_3        
        //    50: athrow         
        //    51: aload_0        
        //    52: iload_1        
        //    53: invokestatic    com/whatsapp/util/dns/i.b:([BI)S
        //    56: istore          4
        //    58: iload_1        
        //    59: iconst_2       
        //    60: iadd           
        //    61: istore          5
        //    63: aload_0        
        //    64: iload           5
        //    66: baload         
        //    67: istore          7
        //    69: iload           7
        //    71: sipush          128
        //    74: iand           
        //    75: ifeq            294
        //    78: iconst_1       
        //    79: istore          8
        //    81: bipush          15
        //    83: aload_0        
        //    84: iload_1        
        //    85: iconst_2       
        //    86: iadd           
        //    87: baload         
        //    88: iconst_3       
        //    89: ishr           
        //    90: iand           
        //    91: i2b            
        //    92: istore          9
        //    94: iload_1        
        //    95: iconst_2       
        //    96: iadd           
        //    97: istore          10
        //    99: aload_0        
        //   100: iload           10
        //   102: baload         
        //   103: istore          12
        //   105: iload           12
        //   107: iconst_4       
        //   108: iand           
        //   109: ifeq            305
        //   112: iconst_1       
        //   113: istore          13
        //   115: iload_1        
        //   116: iconst_2       
        //   117: iadd           
        //   118: istore          14
        //   120: aload_0        
        //   121: iload           14
        //   123: baload         
        //   124: istore          16
        //   126: iload           16
        //   128: iconst_2       
        //   129: iand           
        //   130: ifeq            316
        //   133: iconst_1       
        //   134: istore          17
        //   136: iload_1        
        //   137: iconst_2       
        //   138: iadd           
        //   139: istore          18
        //   141: aload_0        
        //   142: iload           18
        //   144: baload         
        //   145: istore          20
        //   147: iload           20
        //   149: iconst_1       
        //   150: iand           
        //   151: ifeq            327
        //   154: iconst_1       
        //   155: istore          21
        //   157: iload_1        
        //   158: iconst_3       
        //   159: iadd           
        //   160: istore          22
        //   162: aload_0        
        //   163: iload           22
        //   165: baload         
        //   166: istore          24
        //   168: iload           24
        //   170: sipush          128
        //   173: iand           
        //   174: ifeq            338
        //   177: iconst_1       
        //   178: istore          25
        //   180: bipush          15
        //   182: aload_0        
        //   183: iload_1        
        //   184: iconst_3       
        //   185: iadd           
        //   186: baload         
        //   187: iand           
        //   188: i2b            
        //   189: istore          26
        //   191: aload_0        
        //   192: iload_1        
        //   193: iconst_4       
        //   194: iadd           
        //   195: invokestatic    com/whatsapp/util/dns/i.b:([BI)S
        //   198: istore          27
        //   200: aload_0        
        //   201: iload_1        
        //   202: bipush          6
        //   204: iadd           
        //   205: invokestatic    com/whatsapp/util/dns/i.b:([BI)S
        //   208: istore          28
        //   210: aload_0        
        //   211: iload_1        
        //   212: bipush          8
        //   214: iadd           
        //   215: invokestatic    com/whatsapp/util/dns/i.b:([BI)S
        //   218: istore          29
        //   220: aload_0        
        //   221: iload_1        
        //   222: bipush          10
        //   224: iadd           
        //   225: invokestatic    com/whatsapp/util/dns/i.b:([BI)S
        //   228: istore          30
        //   230: new             Lcom/whatsapp/util/dns/c;
        //   233: dup            
        //   234: iload           4
        //   236: iload           8
        //   238: iload           9
        //   240: iload           13
        //   242: iload           17
        //   244: iload           21
        //   246: iload           25
        //   248: iload           26
        //   250: i2s            
        //   251: iload           27
        //   253: iload           28
        //   255: iload           29
        //   257: iload           30
        //   259: invokespecial   com/whatsapp/util/dns/c.<init>:(SZBZZZZSSSSS)V
        //   262: astore          31
        //   264: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   267: istore          34
        //   269: iload           34
        //   271: ifeq            286
        //   274: iload_2        
        //   275: ifeq            354
        //   278: iconst_0       
        //   279: istore          35
        //   281: iload           35
        //   283: putstatic       com/whatsapp/util/dns/b.a:Z
        //   286: aload           31
        //   288: areturn        
        //   289: astore          6
        //   291: aload           6
        //   293: athrow         
        //   294: iconst_0       
        //   295: istore          8
        //   297: goto            81
        //   300: astore          11
        //   302: aload           11
        //   304: athrow         
        //   305: iconst_0       
        //   306: istore          13
        //   308: goto            115
        //   311: astore          15
        //   313: aload           15
        //   315: athrow         
        //   316: iconst_0       
        //   317: istore          17
        //   319: goto            136
        //   322: astore          19
        //   324: aload           19
        //   326: athrow         
        //   327: iconst_0       
        //   328: istore          21
        //   330: goto            157
        //   333: astore          23
        //   335: aload           23
        //   337: athrow         
        //   338: iconst_0       
        //   339: istore          25
        //   341: goto            180
        //   344: astore          32
        //   346: aload           32
        //   348: athrow         
        //   349: astore          33
        //   351: aload           33
        //   353: athrow         
        //   354: iconst_1       
        //   355: istore          35
        //   357: goto            281
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  8      21     21     26     Ljava/lang/NullPointerException;
        //  26     48     48     51     Ljava/lang/NullPointerException;
        //  63     69     289    294    Ljava/lang/NullPointerException;
        //  99     105    300    305    Ljava/lang/NullPointerException;
        //  120    126    311    316    Ljava/lang/NullPointerException;
        //  141    147    322    327    Ljava/lang/NullPointerException;
        //  162    168    333    338    Ljava/lang/NullPointerException;
        //  230    269    344    354    Ljava/lang/NullPointerException;
        //  346    349    349    354    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 216, Size: 216
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
    
    void a(final OutputStream outputStream) {
        outputStream.write(this.a());
    }
    
    byte[] a() {
        final byte[] array = new byte[12];
        this.b(array, 0);
        return array;
    }
    
    public int b() {
        return 12;
    }
    
    void b(final byte[] p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: iconst_2       
        //     5: istore          4
        //     7: getstatic       com/whatsapp/util/dns/b.a:Z
        //    10: istore          5
        //    12: aload_1        
        //    13: ifnonnull       34
        //    16: new             Ljava/lang/NullPointerException;
        //    19: dup            
        //    20: getstatic       com/whatsapp/util/dns/c.z:[Ljava/lang/String;
        //    23: iconst_2       
        //    24: aaload         
        //    25: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    28: athrow         
        //    29: astore          41
        //    31: aload           41
        //    33: athrow         
        //    34: aload_1        
        //    35: arraylength    
        //    36: iload_2        
        //    37: bipush          12
        //    39: iadd           
        //    40: if_icmpge       61
        //    43: new             Ljava/lang/IllegalArgumentException;
        //    46: dup            
        //    47: getstatic       com/whatsapp/util/dns/c.z:[Ljava/lang/String;
        //    50: iconst_3       
        //    51: aaload         
        //    52: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    55: athrow         
        //    56: astore          6
        //    58: aload           6
        //    60: athrow         
        //    61: aload_0        
        //    62: getfield        com/whatsapp/util/dns/c.j:S
        //    65: aload_1        
        //    66: iload_2        
        //    67: invokestatic    com/whatsapp/util/dns/i.a:(S[BI)V
        //    70: aload_1        
        //    71: iload_2        
        //    72: iconst_2       
        //    73: iadd           
        //    74: iconst_0       
        //    75: bastore        
        //    76: iload_2        
        //    77: iconst_2       
        //    78: iadd           
        //    79: istore          8
        //    81: aload_1        
        //    82: iload           8
        //    84: baload         
        //    85: istore          9
        //    87: aload_0        
        //    88: getfield        com/whatsapp/util/dns/c.c:Z
        //    91: istore          10
        //    93: iload           10
        //    95: ifeq            394
        //    98: iload_3        
        //    99: istore          11
        //   101: iload           11
        //   103: iload           9
        //   105: ior            
        //   106: i2b            
        //   107: istore          12
        //   109: aload_1        
        //   110: iload           8
        //   112: iload           12
        //   114: bastore        
        //   115: iload_2        
        //   116: iconst_2       
        //   117: iadd           
        //   118: istore          14
        //   120: aload_1        
        //   121: iload           14
        //   123: aload_1        
        //   124: iload           14
        //   126: baload         
        //   127: bipush          15
        //   129: aload_0        
        //   130: getfield        com/whatsapp/util/dns/c.i:B
        //   133: iand           
        //   134: iconst_3       
        //   135: ishl           
        //   136: i2b            
        //   137: ior            
        //   138: i2b            
        //   139: bastore        
        //   140: iload_2        
        //   141: iconst_2       
        //   142: iadd           
        //   143: istore          15
        //   145: aload_1        
        //   146: iload           15
        //   148: baload         
        //   149: istore          16
        //   151: aload_0        
        //   152: getfield        com/whatsapp/util/dns/c.g:Z
        //   155: istore          17
        //   157: iload           17
        //   159: ifeq            405
        //   162: iconst_4       
        //   163: istore          18
        //   165: iload           18
        //   167: iload           16
        //   169: ior            
        //   170: i2b            
        //   171: istore          19
        //   173: aload_1        
        //   174: iload           15
        //   176: iload           19
        //   178: bastore        
        //   179: iload_2        
        //   180: iconst_2       
        //   181: iadd           
        //   182: istore          21
        //   184: aload_1        
        //   185: iload           21
        //   187: baload         
        //   188: istore          22
        //   190: aload_0        
        //   191: getfield        com/whatsapp/util/dns/c.a:Z
        //   194: istore          23
        //   196: iload           23
        //   198: ifeq            416
        //   201: iload           4
        //   203: iload           22
        //   205: ior            
        //   206: i2b            
        //   207: istore          24
        //   209: aload_1        
        //   210: iload           21
        //   212: iload           24
        //   214: bastore        
        //   215: iload_2        
        //   216: iconst_2       
        //   217: iadd           
        //   218: istore          26
        //   220: aload_1        
        //   221: iload           26
        //   223: baload         
        //   224: istore          27
        //   226: aload_0        
        //   227: getfield        com/whatsapp/util/dns/c.h:Z
        //   230: istore          28
        //   232: iload           28
        //   234: ifeq            427
        //   237: iconst_1       
        //   238: istore          29
        //   240: iload           29
        //   242: iload           27
        //   244: ior            
        //   245: i2b            
        //   246: istore          30
        //   248: aload_1        
        //   249: iload           26
        //   251: iload           30
        //   253: bastore        
        //   254: aload_1        
        //   255: iload_2        
        //   256: iconst_3       
        //   257: iadd           
        //   258: iconst_0       
        //   259: bastore        
        //   260: iload_2        
        //   261: iconst_3       
        //   262: iadd           
        //   263: istore          32
        //   265: aload_1        
        //   266: iload           32
        //   268: baload         
        //   269: istore          33
        //   271: aload_0        
        //   272: getfield        com/whatsapp/util/dns/c.l:Z
        //   275: istore          34
        //   277: iload           34
        //   279: ifeq            438
        //   282: iload_3        
        //   283: iload           33
        //   285: ior            
        //   286: i2b            
        //   287: istore          35
        //   289: aload_1        
        //   290: iload           32
        //   292: iload           35
        //   294: bastore        
        //   295: iload_2        
        //   296: iconst_3       
        //   297: iadd           
        //   298: istore          38
        //   300: aload_1        
        //   301: iload           38
        //   303: aload_1        
        //   304: iload           38
        //   306: baload         
        //   307: bipush          15
        //   309: aload_0        
        //   310: getfield        com/whatsapp/util/dns/c.k:S
        //   313: iand           
        //   314: i2b            
        //   315: ior            
        //   316: i2b            
        //   317: bastore        
        //   318: aload_0        
        //   319: getfield        com/whatsapp/util/dns/c.f:S
        //   322: aload_1        
        //   323: iload_2        
        //   324: iconst_4       
        //   325: iadd           
        //   326: invokestatic    com/whatsapp/util/dns/i.a:(S[BI)V
        //   329: aload_0        
        //   330: getfield        com/whatsapp/util/dns/c.d:S
        //   333: aload_1        
        //   334: iload_2        
        //   335: bipush          6
        //   337: iadd           
        //   338: invokestatic    com/whatsapp/util/dns/i.a:(S[BI)V
        //   341: aload_0        
        //   342: getfield        com/whatsapp/util/dns/c.e:S
        //   345: aload_1        
        //   346: iload_2        
        //   347: bipush          8
        //   349: iadd           
        //   350: invokestatic    com/whatsapp/util/dns/i.a:(S[BI)V
        //   353: aload_0        
        //   354: getfield        com/whatsapp/util/dns/c.b:S
        //   357: aload_1        
        //   358: iload_2        
        //   359: bipush          10
        //   361: iadd           
        //   362: invokestatic    com/whatsapp/util/dns/i.a:(S[BI)V
        //   365: iload           5
        //   367: ifeq            388
        //   370: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   373: istore          39
        //   375: iconst_0       
        //   376: istore          40
        //   378: iload           39
        //   380: ifeq            453
        //   383: iload           40
        //   385: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //   388: return         
        //   389: astore          7
        //   391: aload           7
        //   393: athrow         
        //   394: iconst_0       
        //   395: istore          11
        //   397: goto            101
        //   400: astore          13
        //   402: aload           13
        //   404: athrow         
        //   405: iconst_0       
        //   406: istore          18
        //   408: goto            165
        //   411: astore          20
        //   413: aload           20
        //   415: athrow         
        //   416: iconst_0       
        //   417: istore          4
        //   419: goto            201
        //   422: astore          25
        //   424: aload           25
        //   426: athrow         
        //   427: iconst_0       
        //   428: istore          29
        //   430: goto            240
        //   433: astore          31
        //   435: aload           31
        //   437: athrow         
        //   438: iconst_0       
        //   439: istore_3       
        //   440: goto            282
        //   443: astore          36
        //   445: aload           36
        //   447: athrow         
        //   448: astore          37
        //   450: aload           37
        //   452: athrow         
        //   453: iconst_1       
        //   454: istore          40
        //   456: goto            383
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  16     29     29     34     Ljava/lang/NullPointerException;
        //  34     56     56     61     Ljava/lang/NullPointerException;
        //  61     76     389    394    Ljava/lang/NullPointerException;
        //  81     93     389    394    Ljava/lang/NullPointerException;
        //  109    115    400    405    Ljava/lang/NullPointerException;
        //  120    140    400    405    Ljava/lang/NullPointerException;
        //  145    157    400    405    Ljava/lang/NullPointerException;
        //  173    179    411    416    Ljava/lang/NullPointerException;
        //  184    196    411    416    Ljava/lang/NullPointerException;
        //  209    215    422    427    Ljava/lang/NullPointerException;
        //  220    232    422    427    Ljava/lang/NullPointerException;
        //  248    260    433    438    Ljava/lang/NullPointerException;
        //  265    277    433    438    Ljava/lang/NullPointerException;
        //  289    295    443    448    Ljava/lang/NullPointerException;
        //  300    365    443    448    Ljava/lang/NullPointerException;
        //  370    375    448    453    Ljava/lang/NullPointerException;
        //  445    448    448    453    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 281, Size: 281
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
    
    short c() {
        return this.d;
    }
    
    boolean d() {
        return this.a;
    }
    
    boolean e() {
        return this.c;
    }
    
    short f() {
        return this.f;
    }
    
    short g() {
        return this.j;
    }
    
    short h() {
        return this.k;
    }
}
