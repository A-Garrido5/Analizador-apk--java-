// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class bk implements bc, b1
{
    private static final String[] z;
    String[] a;
    int b;
    long c;
    b4 d;
    InputStream e;
    String[] f;
    InputStream g;
    byte[] h;
    boolean i;
    
    static {
        final String[] z2 = new String[16];
        String s = "J~*tVJt|aUHu2:VF~;aR\u0003y25]Fd\bzQF~";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0432:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ':';
                        break;
                    }
                    case 0: {
                        c2 = '#';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = '\\';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "J~*tVJt|aUHu2:VF~;aR\u0003y25_[d9{^Ft|r_WD3~_M";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Nq?5WJc1tN@x";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "f~?gCSd9q\u001aA|3vQ\u000f0>`N\u0003~35YJ`4pH\u0003q*tSOq>y_";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Py&p\u001a\u001e0";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Me0y";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000f0";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Fh,pYWy2r\u001apD\u000eP{nO\u000fA{qD||T\u0003c(g_B}\u000fa[Qd";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "J~*tVJt|ySPd|fSYu||T\u0003b9t^oy/aiJj9/\u001aW\u007f7pT\u0003";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Mu$anQu95IFu/5\n\u0003|5fN\u0003\u007f.5TV|05NBw";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "v~=vYF`(tXOu|`TF~?gCSd9q\u001aA|3vQ";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "Pu.c_Q0/a[Mj=5\\Qq;x_Md=aSL~|{UW05xJOu1pTWu8;\u001aSq.f_G-";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u000e!|aUHu25SM0.p[GC(gSMw";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "Qu=qiWb5{]\u0003s3`VG~{a\u001aQu?zTPd.`YW06|^";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "Qu=qiWb5{]\u0003s3`VG~{a\u001aNq(vR\u0003d3~_M";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "Aq85TJr>y_\u0003";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    break Label_0432;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public bk(final InputStream inputStream, final String[] a, final String[] f) {
        this.h = new byte[255];
        this.b = 0;
        this.c = 0L;
        this.i = true;
        cn e;
        if (inputStream != null) {
            e = new cn(inputStream);
        }
        else {
            e = null;
        }
        this.e = e;
        this.a = a;
        this.f = f;
        this.c = System.currentTimeMillis();
    }
    
    public bk(final String[] array, final String[] array2) {
        this(null, array, array2);
    }
    
    private static int a(final InputStream inputStream) {
        return inputStream.read() + (inputStream.read() << 8);
    }
    
    private c0 a() {
        final int h = this.h(this.g.read());
        final int read = this.g.read();
        if (read == 2) {
            return null;
        }
        final String c = this.c(read);
        if (h == 0 || c == null) {
            throw new cz(bk.z[9], this.b());
        }
        final bm[] f = this.f((h - 2 + h % 2) / 2);
        if (h % 2 == 1) {
            return new c0(c, f);
        }
        final int read2 = this.g.read();
        if (this.i(read2)) {
            return new c0(c, f, this.e(read2));
        }
        if (read2 == 252) {
            final byte[] array = new byte[c(this.g)];
            a(array, this.g);
            return new c0(c, f, array);
        }
        if (read2 == 253) {
            final byte[] array2 = new byte[e(this.g)];
            a(array2, this.g);
            return new c0(c, f, array2);
        }
        if (read2 == 254) {
            final byte[] array3 = new byte[b(this.g)];
            a(array3, this.g);
            return new c0(c, f, array3);
        }
        if (read2 == 255) {
            return new c0(c, f, d(this.g));
        }
        return new c0(c, f, this.c(read2));
    }
    
    private String a(final int n) {
        String s = null;
        Label_0028: {
            if (n >= 0 && n < this.a.length) {
                s = this.a[n];
                if (bi.O == 0) {
                    break Label_0028;
                }
            }
            s = null;
        }
        if (s == null) {
            throw new cz(bk.z[0], this.b());
        }
        return s;
    }
    
    private String a(final int n, final int n2) {
        final int n3 = n2 + n * 256;
        String s = null;
        Label_0038: {
            if (n3 >= 0 && n3 < this.f.length) {
                s = this.f[n3];
                if (bi.O == 0) {
                    break Label_0038;
                }
            }
            s = null;
        }
        if (s == null) {
            throw new cz(bk.z[1], this.b());
        }
        return s;
    }
    
    public static void a(final byte[] array, final int n, final InputStream inputStream) {
        final int o = bi.O;
        int i = 0;
        while (i < n) {
            i += inputStream.read(array, i, n - i);
            if (o != 0) {
                break;
            }
        }
    }
    
    public static void a(final byte[] array, final InputStream inputStream) {
        a(array, array.length, inputStream);
    }
    
    private static int b(final InputStream inputStream) {
        final int n = 0x7F & inputStream.read();
        final int read = inputStream.read();
        return inputStream.read() | (read << 24 | read << 16 | inputStream.read() << 8);
    }
    
    private void b(final int b) {
        if (this.h.length < b) {
            this.h = new byte[Math.max(3 * this.h.length / 2, b)];
        }
        this.b = b;
        a(this.h, b, this.e);
        this.g = new ByteArrayInputStream(this.h, 0, b);
    }
    
    private static int c(final InputStream inputStream) {
        return inputStream.read();
    }
    
    private String c() {
        return this.c(this.g.read());
    }
    
    private String c(final int n) {
        if (n == -1) {
            throw new cz(bk.z[12], this.b());
        }
        String s = null;
        if (n > 2 && n < 236) {
            s = this.a(n);
        }
        else {
            switch (n) {
                default: {
                    throw new cz(bk.z[14], this.b());
                }
                case 236:
                case 237:
                case 238:
                case 239: {
                    return this.a(n - 236, c(this.g));
                }
                case 0: {
                    return null;
                }
                case 252: {
                    final byte[] array = new byte[c(this.g)];
                    a(array, this.g);
                    return b7.a(array);
                }
                case 253: {
                    final byte[] array2 = new byte[e(this.g)];
                    a(array2, this.g);
                    return b7.a(array2);
                }
                case 254: {
                    final byte[] array3 = new byte[b(this.g)];
                    a(array3, this.g);
                    return b7.a(array3);
                }
                case 255: {
                    return b7.a(d(this.g));
                }
                case 250: {
                    final String c = this.c();
                    s = this.c();
                    if (c != null && s != null) {
                        return c + "@" + s;
                    }
                    if (s == null) {
                        throw new cz(bk.z[13], this.b());
                    }
                    break;
                }
            }
        }
        return s;
    }
    
    private void d(final int n) {
        final int o = bi.O;
        if (this.d == null) {
            throw new cz(bk.z[3]);
        }
        final int n2 = n - 4;
        final byte[] array = new byte[4];
        System.arraycopy(this.h, n - 4, array, 0, 4);
        this.d.a(this.h, 0, n2);
        final byte[] b = this.d.b();
        int i = 0;
        while (i < 4) {
            if (array[i] != b[i]) {
                throw new cz(bk.z[2]);
            }
            ++i;
            if (o != 0) {
                break;
            }
        }
        this.g.skip(0);
    }
    
    private static byte[] d(final InputStream inputStream) {
        int n = 1;
        int i = 0;
        final int o = bi.O;
        final int c = c(inputStream);
        int n2;
        if ((c & 0x80) != 0x0) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        final int n3 = c & 0x7F;
        final byte[] array = new byte[n3];
        a(array, inputStream);
        final int n4 = n3 * 2;
        if (n2 == 0) {
            n = 0;
        }
        final int n5 = n4 - n;
        final byte[] array2 = new byte[n5];
        while (i < n5) {
            final int n6 = 4 * (1 - i % 2);
            final int n7 = (array[i / 2] & 15 << n6) >> n6;
            Label_0221: {
                switch (n7) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9: {
                        array2[i] = (byte)(n7 + 48);
                        if (o != 0) {
                            break Label_0221;
                        }
                        break;
                    }
                    case 10:
                    case 11: {
                        array2[i] = (byte)(45 + (n7 - 10));
                        if (o == 0) {
                            break;
                        }
                        throw new cz(bk.z[15] + n7);
                    }
                }
            }
            ++i;
            if (o != 0) {
                break;
            }
        }
        return array2;
    }
    
    private static int e(final InputStream inputStream) {
        return inputStream.read() + (((0xF & inputStream.read()) << 16) + (inputStream.read() << 8));
    }
    
    private c0[] e(final int n) {
        final int o = bi.O;
        final int h = this.h(n);
        final c0[] array = new c0[h];
        int i = 0;
        while (i < h) {
            array[i] = this.a();
            ++i;
            if (o != 0) {
                break;
            }
        }
        return array;
    }
    
    private bm[] f(final int n) {
        final int o = bi.O;
        final bm[] array = new bm[n];
        int i = 0;
        while (i < n) {
            array[i] = new bm(this.c(), this.c());
            ++i;
            if (o != 0) {
                break;
            }
        }
        return array;
    }
    
    private void g(final int n) {
        final int i = bi.O;
        final InputStream a = this.d.a(this.g);
        final cd cd = new cd();
        final byte[] array = new byte[8192];
        do {
            final int read = a.read(array, 0, array.length);
            if (read == -1) {
                break;
            }
            cd.write(array, 0, read);
        } while (i == 0);
        this.h = cd.a();
        this.g = new ByteArrayInputStream(this.h, 0, cd.b());
    }
    
    private int h(final int n) {
        final int o = bi.O;
        if (n == 0) {
            final int n2 = 0;
            if (o == 0) {
                return n2;
            }
        }
        if (n == 248) {
            final int n2 = c(this.g);
            if (o == 0) {
                return n2;
            }
        }
        if (n == 249) {
            final int n2 = a(this.g);
            if (o == 0) {
                return n2;
            }
        }
        throw new cz(bk.z[8] + n, this.b());
    }
    
    private boolean i(final int n) {
        return n == 248 || n == 0 || n == 249;
    }
    
    @Override
    public c0 a(final byte[] array) {
        a(this.h = new byte[array.length], array.length, new ByteArrayInputStream(array, 0, array.length));
        this.g = new ByteArrayInputStream(array, 0, array.length);
        this.c = System.currentTimeMillis();
        return this.a();
    }
    
    @Override
    public void a() {
        this.b(bd.c(bd.a(this.e)));
        final int h = this.h(this.g.read());
        if (this.g.read() != 1) {
            throw new cz(bk.z[7], this.b());
        }
        this.f((h - 2 + h % 2) / 2);
    }
    
    @Override
    public void a(final b4 d) {
        this.d = d;
    }
    
    @Override
    public String b() {
        final int o = bi.O;
        if (this.h == null) {
            return bk.z[5];
        }
        final StringBuffer sb = new StringBuffer();
        sb.append(bk.z[4]).append(Integer.toString(this.b)).append('<');
        int i = 0;
        while (i < this.b) {
            if (i > 0) {
                sb.append(bk.z[6]);
            }
            sb.append(Integer.toString(0xFF & this.h[i]));
            ++i;
            if (o != 0) {
                break;
            }
        }
        sb.append('>');
        return sb.toString();
    }
    
    @Override
    public void c() {
        this.i = false;
    }
    
    @Override
    public c0 d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/protocol/bk.e:Ljava/io/InputStream;
        //     4: invokestatic    com/whatsapp/protocol/bd.a:(Ljava/io/InputStream;)I
        //     7: istore_1       
        //     8: iload_1        
        //     9: invokestatic    com/whatsapp/protocol/bd.d:(I)Z
        //    12: istore_2       
        //    13: iload_1        
        //    14: invokestatic    com/whatsapp/protocol/bd.b:(I)Z
        //    17: istore_3       
        //    18: iload_1        
        //    19: invokestatic    com/whatsapp/protocol/bd.a:(I)Z
        //    22: istore          4
        //    24: iload_1        
        //    25: invokestatic    com/whatsapp/protocol/bd.c:(I)I
        //    28: istore          5
        //    30: aload_0        
        //    31: iload           5
        //    33: invokespecial   com/whatsapp/protocol/bk.b:(I)V
        //    36: aload_0        
        //    37: invokestatic    java/lang/System.currentTimeMillis:()J
        //    40: putfield        com/whatsapp/protocol/bk.c:J
        //    43: iload_2        
        //    44: ifeq            68
        //    47: aload_0        
        //    48: iconst_0       
        //    49: putfield        com/whatsapp/protocol/bk.i:Z
        //    52: aload_0        
        //    53: iload           5
        //    55: invokespecial   com/whatsapp/protocol/bk.d:(I)V
        //    58: getstatic       com/whatsapp/protocol/bi.O:I
        //    61: istore          9
        //    63: iload           9
        //    65: ifeq            108
        //    68: aload_0        
        //    69: getfield        com/whatsapp/protocol/bk.i:Z
        //    72: istore          20
        //    74: iload           20
        //    76: ifne            108
        //    79: new             Lcom/whatsapp/protocol/cz;
        //    82: dup            
        //    83: getstatic       com/whatsapp/protocol/bk.z:[Ljava/lang/String;
        //    86: bipush          10
        //    88: aaload         
        //    89: invokespecial   com/whatsapp/protocol/cz.<init>:(Ljava/lang/String;)V
        //    92: athrow         
        //    93: astore          8
        //    95: aload           8
        //    97: athrow         
        //    98: astore          6
        //   100: aload           6
        //   102: athrow         
        //   103: astore          7
        //   105: aload           7
        //   107: athrow         
        //   108: iload_3        
        //   109: ifeq            118
        //   112: aload_0        
        //   113: iload           5
        //   115: invokespecial   com/whatsapp/protocol/bk.g:(I)V
        //   118: aload_0        
        //   119: invokespecial   com/whatsapp/protocol/bk.a:()Lcom/whatsapp/protocol/c0;
        //   122: astore          18
        //   124: aload           18
        //   126: astore          11
        //   128: iload           4
        //   130: ifeq            226
        //   133: new             Ljava/lang/StringBuilder;
        //   136: dup            
        //   137: invokespecial   java/lang/StringBuilder.<init>:()V
        //   140: getstatic       com/whatsapp/protocol/bk.z:[Ljava/lang/String;
        //   143: bipush          11
        //   145: aaload         
        //   146: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   149: astore          13
        //   151: iconst_0       
        //   152: istore          14
        //   154: aload           11
        //   156: ifnull          162
        //   159: iconst_1       
        //   160: istore          14
        //   162: new             Lcom/whatsapp/protocol/cz;
        //   165: dup            
        //   166: aload           13
        //   168: iload           14
        //   170: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   173: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   176: invokespecial   com/whatsapp/protocol/cz.<init>:(Ljava/lang/String;)V
        //   179: athrow         
        //   180: astore          19
        //   182: aload           19
        //   184: athrow         
        //   185: astore          16
        //   187: iload           4
        //   189: ifne            200
        //   192: aload           16
        //   194: athrow         
        //   195: astore          17
        //   197: aload           17
        //   199: athrow         
        //   200: aconst_null    
        //   201: astore          11
        //   203: goto            128
        //   206: astore          10
        //   208: iload           4
        //   210: ifne            229
        //   213: aload           10
        //   215: athrow         
        //   216: astore          15
        //   218: aload           15
        //   220: athrow         
        //   221: astore          12
        //   223: aload           12
        //   225: athrow         
        //   226: aload           11
        //   228: areturn        
        //   229: aconst_null    
        //   230: astore          11
        //   232: goto            128
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  30     43     98     103    Ljava/io/IOException;
        //  47     63     98     103    Ljava/io/IOException;
        //  68     74     103    108    Ljava/io/IOException;
        //  79     93     93     98     Ljava/io/IOException;
        //  100    103    103    108    Ljava/io/IOException;
        //  105    108    93     98     Ljava/io/IOException;
        //  112    118    180    185    Ljava/io/IOException;
        //  112    118    206    221    Lcom/whatsapp/protocol/cz;
        //  118    124    185    206    Ljava/io/IOException;
        //  118    124    206    221    Lcom/whatsapp/protocol/cz;
        //  133    151    221    226    Ljava/io/IOException;
        //  182    185    185    206    Ljava/io/IOException;
        //  182    185    206    221    Lcom/whatsapp/protocol/cz;
        //  192    195    195    200    Ljava/io/IOException;
        //  213    216    216    221    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
