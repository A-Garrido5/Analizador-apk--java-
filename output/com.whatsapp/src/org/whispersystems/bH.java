// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import javax.crypto.IllegalBlockSizeException;
import java.security.InvalidKeyException;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.BadPaddingException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

public class bH
{
    static final Object b;
    private static final String[] z;
    private final aq a;
    private final d c;
    
    static {
        final String[] z2 = new String[8];
        String s = "V\u000f\u0017\u001a\"v\u0004R\u001bgs\u0005NI!w\u0012\rI";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'G';
                        break;
                    }
                    case 0: {
                        c2 = '\u0018';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = '7';
                        break;
                    }
                    case 3: {
                        c2 = 'i';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "W\u0016R\u001bg*P\u0007Ygu\u0005D\u001a&\u007f\u0005DI.v\u0014XI3p\u0005\u0017\u000f2l\u0015E\ff";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "J\u0005T\f.n\u0005SI*}\u0013D\b }@@\u00003p@X\u0005#8\u0003X\u001c)l\u0005ESg";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "8L\u0017";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Y%d";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Y%dF\u0004Z#\u00189\f[3\u00029&|\u0004^\u0007 ";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Y%d";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Y%dF\u0004Z#\u00189\f[3\u00029&|\u0004^\u0007 ";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        b = new Object();
    }
    
    public bH(final d c, final aq a) {
        this.c = c;
        this.a = a;
    }
    
    private ar a(final X x, final int n) {
        final int b = aq.b;
        a9 a9 = x.d();
        if (a9.a() > n) {
            if (x.b(n)) {
                return x.a(n);
            }
            throw new b(bH.z[2] + a9.a() + bH.z[3] + n);
        }
        else {
            if (a9.a() - n > 2000) {
                throw new I(bH.z[1]);
            }
            while (a9.a() < n) {
                x.a(a9.b());
                a9 = a9.d();
                if (b != 0) {
                    break;
                }
            }
            x.a(a9.d());
            return a9.b();
        }
    }
    
    private byte[] a(final byte[] array, final byte[] array2, final byte[] array3) {
        try {
            final IvParameterSpec ivParameterSpec = new IvParameterSpec(array);
            final Cipher instance = Cipher.getInstance(bH.z[5]);
            instance.init(1, new SecretKeySpec(array2, bH.z[4]), ivParameterSpec);
            return instance.doFinal(array3);
        }
        catch (BadPaddingException ex) {}
        catch (InvalidAlgorithmParameterException ex2) {
            goto Label_0054;
        }
        catch (NoSuchAlgorithmException ex2) {
            goto Label_0054;
        }
        catch (NoSuchPaddingException ex2) {
            goto Label_0054;
        }
        catch (InvalidKeyException ex2) {
            goto Label_0054;
        }
        catch (IllegalBlockSizeException ex2) {
            goto Label_0054;
        }
    }
    
    private byte[] b(final byte[] array, final byte[] array2, final byte[] array3) {
        try {
            final IvParameterSpec ivParameterSpec = new IvParameterSpec(array);
            final Cipher instance = Cipher.getInstance(bH.z[7]);
            instance.init(2, new SecretKeySpec(array2, bH.z[6]), ivParameterSpec);
            return instance.doFinal(array3);
        }
        catch (InvalidAlgorithmParameterException ex) {}
        catch (BadPaddingException ex2) {}
        catch (IllegalBlockSizeException ex3) {
            goto Label_0068;
        }
        catch (NoSuchAlgorithmException ex4) {
            goto Label_0056;
        }
        catch (NoSuchPaddingException ex4) {
            goto Label_0056;
        }
        catch (InvalidKeyException ex4) {
            goto Label_0056;
        }
    }
    
    public byte[] a(final byte[] array) {
        final int b = aq.b;
        final Object b2 = bH.b;
        // monitorenter(b2)
        try {
            final aT a = this.c.a(this.a);
            final X b3 = a.b();
            final ar b4 = b3.d().b();
            final G g = new G(b3.b(), b4.c(), this.a(b4.a(), b4.b(), array), b3.a());
            b3.a(b3.d().d());
            this.c.a(this.a, a);
            final byte[] a2 = g.a();
            // monitorexit(b2)
            if (bO.s != 0) {
                aq.b = b + 1;
            }
            return a2;
        }
        catch (aW aw) {
            throw new y(aw);
            try {}
            finally {
            }
            // monitorexit(b2)
        }
    }
    
    public byte[] a(final byte[] p0, final F p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aq.b:I
        //     3: istore_3       
        //     4: getstatic       org/whispersystems/bH.b:Ljava/lang/Object;
        //     7: astore          4
        //     9: aload           4
        //    11: monitorenter   
        //    12: aload_0        
        //    13: getfield        org/whispersystems/bH.c:Lorg/whispersystems/d;
        //    16: aload_0        
        //    17: getfield        org/whispersystems/bH.a:Lorg/whispersystems/aq;
        //    20: invokeinterface org/whispersystems/d.a:(Lorg/whispersystems/aq;)Lorg/whispersystems/aT;
        //    25: astore          7
        //    27: aload           7
        //    29: invokevirtual   org/whispersystems/aT.a:()Z
        //    32: ifeq            93
        //    35: new             Lorg/whispersystems/y;
        //    38: dup            
        //    39: new             Ljava/lang/StringBuilder;
        //    42: dup            
        //    43: invokespecial   java/lang/StringBuilder.<init>:()V
        //    46: getstatic       org/whispersystems/bH.z:[Ljava/lang/String;
        //    49: iconst_0       
        //    50: aaload         
        //    51: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    54: aload_0        
        //    55: getfield        org/whispersystems/bH.a:Lorg/whispersystems/aq;
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    61: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    64: invokespecial   org/whispersystems/y.<init>:(Ljava/lang/String;)V
        //    67: athrow         
        //    68: astore          8
        //    70: aload           8
        //    72: athrow         
        //    73: astore          5
        //    75: new             Lorg/whispersystems/I;
        //    78: dup            
        //    79: aload           5
        //    81: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/Throwable;)V
        //    84: athrow         
        //    85: astore          6
        //    87: aload           4
        //    89: monitorexit    
        //    90: aload           6
        //    92: athrow         
        //    93: new             Lorg/whispersystems/G;
        //    96: dup            
        //    97: aload_1        
        //    98: invokespecial   org/whispersystems/G.<init>:([B)V
        //   101: astore          9
        //   103: aload           7
        //   105: aload           9
        //   107: invokevirtual   org/whispersystems/G.a:()I
        //   110: invokevirtual   org/whispersystems/aT.a:(I)Lorg/whispersystems/X;
        //   113: astore          10
        //   115: aload           9
        //   117: aload           10
        //   119: invokevirtual   org/whispersystems/X.e:()Lorg/whispersystems/ak;
        //   122: invokevirtual   org/whispersystems/G.a:(Lorg/whispersystems/ak;)V
        //   125: aload_0        
        //   126: aload           10
        //   128: aload           9
        //   130: invokevirtual   org/whispersystems/G.c:()I
        //   133: invokespecial   org/whispersystems/bH.a:(Lorg/whispersystems/X;I)Lorg/whispersystems/ar;
        //   136: astore          11
        //   138: aload_0        
        //   139: aload           11
        //   141: invokevirtual   org/whispersystems/ar.a:()[B
        //   144: aload           11
        //   146: invokevirtual   org/whispersystems/ar.b:()[B
        //   149: aload           9
        //   151: invokevirtual   org/whispersystems/G.b:()[B
        //   154: invokespecial   org/whispersystems/bH.b:([B[B[B)[B
        //   157: astore          12
        //   159: aload_2        
        //   160: aload           12
        //   162: invokeinterface org/whispersystems/F.a:([B)V
        //   167: aload_0        
        //   168: getfield        org/whispersystems/bH.c:Lorg/whispersystems/d;
        //   171: aload_0        
        //   172: getfield        org/whispersystems/bH.a:Lorg/whispersystems/aq;
        //   175: aload           7
        //   177: invokeinterface org/whispersystems/d.a:(Lorg/whispersystems/aq;Lorg/whispersystems/aT;)V
        //   182: aload           4
        //   184: monitorexit    
        //   185: iload_3        
        //   186: ifeq            197
        //   189: iconst_1       
        //   190: getstatic       org/whispersystems/bO.s:I
        //   193: iadd           
        //   194: putstatic       org/whispersystems/bO.s:I
        //   197: aload           12
        //   199: areturn        
        //   200: astore          5
        //   202: goto            75
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  12     27     73     75     Lorg/whispersystems/aA;
        //  12     27     200    205    Lorg/whispersystems/aW;
        //  12     27     85     93     Any
        //  27     68     68     73     Lorg/whispersystems/aA;
        //  27     68     200    205    Lorg/whispersystems/aW;
        //  27     68     85     93     Any
        //  70     73     73     75     Lorg/whispersystems/aA;
        //  70     73     200    205    Lorg/whispersystems/aW;
        //  70     73     85     93     Any
        //  75     85     85     93     Any
        //  87     90     85     93     Any
        //  93     182    73     75     Lorg/whispersystems/aA;
        //  93     182    200    205    Lorg/whispersystems/aW;
        //  93     182    85     93     Any
        //  182    185    85     93     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0075:
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
}
