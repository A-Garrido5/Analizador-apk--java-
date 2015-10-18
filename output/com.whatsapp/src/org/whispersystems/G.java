// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.hv;

public class G implements ai
{
    private static final String[] z;
    private final int a;
    private final int b;
    private final int c;
    private final byte[] d;
    private final byte[] e;
    
    static {
        final String[] z2 = new String[4];
        String s = "oCaZ=OI7H8ACvO$TH6";
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
                        c2 = 'Q';
                        break;
                    }
                    case 0: {
                        c2 = '&';
                        break;
                    }
                    case 1: {
                        c2 = '-';
                        break;
                    }
                    case 2: {
                        c2 = '\u0017';
                        break;
                    }
                    case 3: {
                        c2 = ';';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "jHpZ2_\rz^\"ULp^k\u0006";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "sC|U>QC7M4T^~T?\u001c\r";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "oCtT<VArO4\u0006@rH\"GJr\u0015";
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
    
    public G(final int a, final int c, final byte[] e, final P p4) {
        final byte[] array = { m.a(3, 3) };
        final byte[] a2 = ac.d().a(a).b(c).a(hv.a(e)).d().a();
        this.d = m.a(new byte[][] { array, a2, this.a(p4, m.a(new byte[][] { array, a2 })) });
        this.b = 3;
        this.a = a;
        this.c = c;
        this.e = e;
    }
    
    public G(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_1        
        //     5: iconst_1       
        //     6: bipush          -64
        //     8: iconst_m1      
        //     9: aload_1        
        //    10: arraylength    
        //    11: iadd           
        //    12: iadd           
        //    13: bipush          64
        //    15: invokestatic    org/whispersystems/m.a:([BIII)[[B
        //    18: astore_3       
        //    19: aload_3        
        //    20: iconst_0       
        //    21: aaload         
        //    22: iconst_0       
        //    23: baload         
        //    24: istore          4
        //    26: aload_3        
        //    27: iconst_1       
        //    28: aaload         
        //    29: astore          5
        //    31: aload_3        
        //    32: iconst_2       
        //    33: aaload         
        //    34: pop            
        //    35: iload           4
        //    37: invokestatic    org/whispersystems/m.a:(B)I
        //    40: iconst_3       
        //    41: if_icmpge       93
        //    44: new             Lorg/whispersystems/bW;
        //    47: dup            
        //    48: new             Ljava/lang/StringBuilder;
        //    51: dup            
        //    52: invokespecial   java/lang/StringBuilder.<init>:()V
        //    55: getstatic       org/whispersystems/G.z:[Ljava/lang/String;
        //    58: iconst_1       
        //    59: aaload         
        //    60: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    63: iload           4
        //    65: invokestatic    org/whispersystems/m.a:(B)I
        //    68: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    71: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    74: invokespecial   org/whispersystems/bW.<init>:(Ljava/lang/String;)V
        //    77: athrow         
        //    78: astore          7
        //    80: aload           7
        //    82: athrow         
        //    83: astore_2       
        //    84: new             Lorg/whispersystems/I;
        //    87: dup            
        //    88: aload_2        
        //    89: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/Throwable;)V
        //    92: athrow         
        //    93: iload           4
        //    95: invokestatic    org/whispersystems/m.a:(B)I
        //    98: iconst_3       
        //    99: if_icmple       141
        //   102: new             Lorg/whispersystems/I;
        //   105: dup            
        //   106: new             Ljava/lang/StringBuilder;
        //   109: dup            
        //   110: invokespecial   java/lang/StringBuilder.<init>:()V
        //   113: getstatic       org/whispersystems/G.z:[Ljava/lang/String;
        //   116: iconst_2       
        //   117: aaload         
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   121: iload           4
        //   123: invokestatic    org/whispersystems/m.a:(B)I
        //   126: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   129: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   132: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/String;)V
        //   135: athrow         
        //   136: astore          8
        //   138: aload           8
        //   140: athrow         
        //   141: aload           5
        //   143: invokestatic    org/whispersystems/ac.a:([B)Lorg/whispersystems/ac;
        //   146: astore          9
        //   148: aload           9
        //   150: invokevirtual   org/whispersystems/ac.b:()Z
        //   153: ifeq            180
        //   156: aload           9
        //   158: invokevirtual   org/whispersystems/ac.n:()Z
        //   161: istore          13
        //   163: iload           13
        //   165: ifeq            180
        //   168: aload           9
        //   170: invokevirtual   org/whispersystems/ac.h:()Z
        //   173: istore          14
        //   175: iload           14
        //   177: ifne            208
        //   180: new             Lorg/whispersystems/I;
        //   183: dup            
        //   184: getstatic       org/whispersystems/G.z:[Ljava/lang/String;
        //   187: iconst_3       
        //   188: aaload         
        //   189: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/String;)V
        //   192: athrow         
        //   193: astore          12
        //   195: aload           12
        //   197: athrow         
        //   198: astore          10
        //   200: aload           10
        //   202: athrow         
        //   203: astore          11
        //   205: aload           11
        //   207: athrow         
        //   208: aload_0        
        //   209: aload_1        
        //   210: putfield        org/whispersystems/G.d:[B
        //   213: aload_0        
        //   214: iload           4
        //   216: invokestatic    org/whispersystems/m.a:(B)I
        //   219: putfield        org/whispersystems/G.b:I
        //   222: aload_0        
        //   223: aload           9
        //   225: invokevirtual   org/whispersystems/ac.i:()I
        //   228: putfield        org/whispersystems/G.a:I
        //   231: aload_0        
        //   232: aload           9
        //   234: invokevirtual   org/whispersystems/ac.k:()I
        //   237: putfield        org/whispersystems/G.c:I
        //   240: aload_0        
        //   241: aload           9
        //   243: invokevirtual   org/whispersystems/ac.g:()Lcom/google/hv;
        //   246: invokevirtual   com/google/hv.a:()[B
        //   249: putfield        org/whispersystems/G.e:[B
        //   252: return         
        //   253: astore_2       
        //   254: goto            84
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  4      35     83     84     Lcom/google/bg;
        //  4      35     253    257    Ljava/text/ParseException;
        //  35     78     78     83     Lcom/google/bg;
        //  35     78     253    257    Ljava/text/ParseException;
        //  80     83     83     84     Lcom/google/bg;
        //  80     83     253    257    Ljava/text/ParseException;
        //  93     136    136    141    Lcom/google/bg;
        //  93     136    253    257    Ljava/text/ParseException;
        //  138    141    83     84     Lcom/google/bg;
        //  138    141    253    257    Ljava/text/ParseException;
        //  141    148    83     84     Lcom/google/bg;
        //  141    148    253    257    Ljava/text/ParseException;
        //  148    163    198    203    Lcom/google/bg;
        //  148    163    253    257    Ljava/text/ParseException;
        //  168    175    203    208    Lcom/google/bg;
        //  168    175    253    257    Ljava/text/ParseException;
        //  180    193    193    198    Lcom/google/bg;
        //  180    193    253    257    Ljava/text/ParseException;
        //  195    198    83     84     Lcom/google/bg;
        //  195    198    253    257    Ljava/text/ParseException;
        //  200    203    203    208    Lcom/google/bg;
        //  200    203    253    257    Ljava/text/ParseException;
        //  205    208    193    198    Lcom/google/bg;
        //  205    208    253    257    Ljava/text/ParseException;
        //  208    252    83     84     Lcom/google/bg;
        //  208    252    253    257    Ljava/text/ParseException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 132, Size: 132
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    private byte[] a(final P p2, final byte[] array) {
        try {
            return s.a(p2, array);
        }
        catch (aA aa) {
            throw new AssertionError((Object)aa);
        }
    }
    
    public int a() {
        return this.a;
    }
    
    public void a(final ak ak) {
        try {
            final byte[][] b = m.b(this.d, -64 + this.d.length, 64);
            try {
                if (!s.a(ak, b[0], b[1])) {
                    throw new I(G.z[0]);
                }
            }
            catch (aA aa) {
                throw aa;
            }
        }
        catch (aA aa2) {
            throw new I(aa2);
        }
    }
    
    @Override
    public byte[] a() {
        return this.d;
    }
    
    @Override
    public int b() {
        return 4;
    }
    
    public byte[] b() {
        return this.e;
    }
    
    public int c() {
        return this.c;
    }
}
