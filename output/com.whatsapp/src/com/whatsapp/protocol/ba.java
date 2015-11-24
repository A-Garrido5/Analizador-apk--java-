// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import javax.crypto.ShortBufferException;
import java.io.IOException;
import android.os.Build$VERSION;
import java.util.zip.DeflaterOutputStream;
import java.io.OutputStream;
import java.util.zip.InflaterInputStream;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class ba implements b4
{
    private static final String[] z;
    private final Mac a;
    private final byte[] b;
    private final Cipher c;
    private final Mac d;
    private final byte[] e;
    private int f;
    private int g;
    private final Cipher h;
    
    static {
        final String[] z2 = new String[6];
        String s = "n\f\u0019V\u001en\u0000i";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
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
                        c2 = '&';
                        break;
                    }
                    case 1: {
                        c2 = 'A';
                        break;
                    }
                    case 2: {
                        c2 = 'X';
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
                    s = "g\u0013\u001b!";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "n\f\u0019V\u001en\u0000i";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "g\u0013\u001b!";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "u)7g9d4>s(T\u0004 v(V51z#\u0006%-g$H&xp#E3!e9O.6/m";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "u)7g9d4>s(T\u0004 v(V51z#\u0006%-g$H&xq(E3!e9O.6/m";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ba(final byte[] p0, final byte[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/protocol/bi.O:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: iconst_4       
        //    10: newarray        B
        //    12: putfield        com/whatsapp/protocol/ba.b:[B
        //    15: aload_0        
        //    16: iconst_4       
        //    17: newarray        B
        //    19: putfield        com/whatsapp/protocol/ba.e:[B
        //    22: iconst_1       
        //    23: aload_2        
        //    24: arraylength    
        //    25: iadd           
        //    26: newarray        B
        //    28: astore          4
        //    30: aload_2        
        //    31: iconst_0       
        //    32: aload           4
        //    34: iconst_0       
        //    35: aload_2        
        //    36: arraylength    
        //    37: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    40: aload           4
        //    42: aload_2        
        //    43: arraylength    
        //    44: iconst_1       
        //    45: bastore        
        //    46: aload_1        
        //    47: aload           4
        //    49: iconst_2       
        //    50: sipush          160
        //    53: invokestatic    com/whatsapp/al5.a:([B[BII)Ljavax/crypto/SecretKey;
        //    56: astore          5
        //    58: aload           4
        //    60: aload_2        
        //    61: arraylength    
        //    62: iconst_2       
        //    63: bastore        
        //    64: aload_1        
        //    65: aload           4
        //    67: iconst_2       
        //    68: sipush          160
        //    71: invokestatic    com/whatsapp/al5.a:([B[BII)Ljavax/crypto/SecretKey;
        //    74: astore          6
        //    76: aload           4
        //    78: aload_2        
        //    79: arraylength    
        //    80: iconst_3       
        //    81: bastore        
        //    82: aload_1        
        //    83: aload           4
        //    85: iconst_2       
        //    86: sipush          160
        //    89: invokestatic    com/whatsapp/al5.a:([B[BII)Ljavax/crypto/SecretKey;
        //    92: astore          7
        //    94: aload           4
        //    96: aload_2        
        //    97: arraylength    
        //    98: iconst_4       
        //    99: bastore        
        //   100: aload_1        
        //   101: aload           4
        //   103: iconst_2       
        //   104: sipush          160
        //   107: invokestatic    com/whatsapp/al5.a:([B[BII)Ljavax/crypto/SecretKey;
        //   110: astore          8
        //   112: aload_0        
        //   113: getstatic       com/whatsapp/protocol/ba.z:[Ljava/lang/String;
        //   116: iconst_3       
        //   117: aaload         
        //   118: invokestatic    javax/crypto/Cipher.getInstance:(Ljava/lang/String;)Ljavax/crypto/Cipher;
        //   121: putfield        com/whatsapp/protocol/ba.h:Ljavax/crypto/Cipher;
        //   124: aload_0        
        //   125: getfield        com/whatsapp/protocol/ba.h:Ljavax/crypto/Cipher;
        //   128: iconst_2       
        //   129: aload           7
        //   131: invokevirtual   javax/crypto/Cipher.init:(ILjava/security/Key;)V
        //   134: sipush          768
        //   137: newarray        B
        //   139: astore          11
        //   141: aload_0        
        //   142: getfield        com/whatsapp/protocol/ba.h:Ljavax/crypto/Cipher;
        //   145: aload           11
        //   147: iconst_0       
        //   148: aload           11
        //   150: arraylength    
        //   151: aload           11
        //   153: iconst_0       
        //   154: invokevirtual   javax/crypto/Cipher.update:([BII[BI)I
        //   157: pop            
        //   158: aload_0        
        //   159: getstatic       com/whatsapp/protocol/ba.z:[Ljava/lang/String;
        //   162: iconst_0       
        //   163: aaload         
        //   164: invokestatic    javax/crypto/Mac.getInstance:(Ljava/lang/String;)Ljavax/crypto/Mac;
        //   167: putfield        com/whatsapp/protocol/ba.a:Ljavax/crypto/Mac;
        //   170: aload_0        
        //   171: getfield        com/whatsapp/protocol/ba.a:Ljavax/crypto/Mac;
        //   174: aload           8
        //   176: invokevirtual   javax/crypto/Mac.init:(Ljava/security/Key;)V
        //   179: aload_0        
        //   180: getstatic       com/whatsapp/protocol/ba.z:[Ljava/lang/String;
        //   183: iconst_1       
        //   184: aaload         
        //   185: invokestatic    javax/crypto/Cipher.getInstance:(Ljava/lang/String;)Ljavax/crypto/Cipher;
        //   188: putfield        com/whatsapp/protocol/ba.c:Ljavax/crypto/Cipher;
        //   191: aload_0        
        //   192: getfield        com/whatsapp/protocol/ba.c:Ljavax/crypto/Cipher;
        //   195: iconst_1       
        //   196: aload           5
        //   198: invokevirtual   javax/crypto/Cipher.init:(ILjava/security/Key;)V
        //   201: sipush          768
        //   204: newarray        B
        //   206: astore          18
        //   208: aload_0        
        //   209: getfield        com/whatsapp/protocol/ba.c:Ljavax/crypto/Cipher;
        //   212: aload           18
        //   214: iconst_0       
        //   215: aload           18
        //   217: arraylength    
        //   218: aload           18
        //   220: iconst_0       
        //   221: invokevirtual   javax/crypto/Cipher.update:([BII[BI)I
        //   224: pop            
        //   225: aload_0        
        //   226: getstatic       com/whatsapp/protocol/ba.z:[Ljava/lang/String;
        //   229: iconst_2       
        //   230: aaload         
        //   231: invokestatic    javax/crypto/Mac.getInstance:(Ljava/lang/String;)Ljavax/crypto/Mac;
        //   234: putfield        com/whatsapp/protocol/ba.d:Ljavax/crypto/Mac;
        //   237: aload_0        
        //   238: getfield        com/whatsapp/protocol/ba.d:Ljavax/crypto/Mac;
        //   241: aload           6
        //   243: invokevirtual   javax/crypto/Mac.init:(Ljava/security/Key;)V
        //   246: iload_3        
        //   247: ifeq            268
        //   250: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   253: istore          24
        //   255: iload           24
        //   257: ifeq            394
        //   260: iconst_0       
        //   261: istore          25
        //   263: iload           25
        //   265: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //   268: return         
        //   269: astore          9
        //   271: new             Ljava/lang/AssertionError;
        //   274: dup            
        //   275: aload           9
        //   277: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   280: athrow         
        //   281: astore          10
        //   283: new             Ljava/lang/AssertionError;
        //   286: dup            
        //   287: aload           10
        //   289: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   292: athrow         
        //   293: astore          12
        //   295: new             Ljava/lang/AssertionError;
        //   298: dup            
        //   299: aload           12
        //   301: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   304: athrow         
        //   305: astore          14
        //   307: new             Ljava/lang/AssertionError;
        //   310: dup            
        //   311: aload           14
        //   313: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   316: athrow         
        //   317: astore          15
        //   319: new             Ljava/lang/AssertionError;
        //   322: dup            
        //   323: aload           15
        //   325: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   328: athrow         
        //   329: astore          16
        //   331: new             Ljava/lang/AssertionError;
        //   334: dup            
        //   335: aload           16
        //   337: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   340: athrow         
        //   341: astore          17
        //   343: new             Ljava/lang/AssertionError;
        //   346: dup            
        //   347: aload           17
        //   349: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   352: athrow         
        //   353: astore          19
        //   355: new             Ljava/lang/AssertionError;
        //   358: dup            
        //   359: aload           19
        //   361: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   364: athrow         
        //   365: astore          21
        //   367: new             Ljava/lang/AssertionError;
        //   370: dup            
        //   371: aload           21
        //   373: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   376: athrow         
        //   377: astore          22
        //   379: new             Ljava/lang/AssertionError;
        //   382: dup            
        //   383: aload           22
        //   385: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   388: athrow         
        //   389: astore          23
        //   391: aload           23
        //   393: athrow         
        //   394: iconst_1       
        //   395: istore          25
        //   397: goto            263
        //   400: astore          16
        //   402: goto            331
        //   405: astore          9
        //   407: goto            271
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  112    124    269    271    Ljava/security/NoSuchAlgorithmException;
        //  112    124    405    410    Ljavax/crypto/NoSuchPaddingException;
        //  124    134    281    293    Ljava/security/InvalidKeyException;
        //  141    158    293    305    Ljavax/crypto/ShortBufferException;
        //  158    170    305    317    Ljava/security/NoSuchAlgorithmException;
        //  170    179    317    329    Ljava/security/InvalidKeyException;
        //  179    191    329    331    Ljava/security/NoSuchAlgorithmException;
        //  179    191    400    405    Ljavax/crypto/NoSuchPaddingException;
        //  191    201    341    353    Ljava/security/InvalidKeyException;
        //  208    225    353    365    Ljavax/crypto/ShortBufferException;
        //  225    237    365    377    Ljava/security/NoSuchAlgorithmException;
        //  237    246    377    389    Ljava/security/InvalidKeyException;
        //  250    255    389    394    Ljava/security/NoSuchAlgorithmException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 218, Size: 218
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    private static void a(final int n, final byte[] array) {
        array[0] = (byte)(n >>> 24);
        array[1] = (byte)(n >>> 16);
        array[2] = (byte)(n >>> 8);
        array[3] = (byte)n;
    }
    
    @Override
    public InputStream a(final InputStream inputStream) {
        return new InflaterInputStream(inputStream);
    }
    
    @Override
    public OutputStream a(final OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
    }
    
    @Override
    public void a(final byte[] array, final int n, final int n2) {
        this.a.update(array, n, n2);
        try {
            this.h.update(array, n, n2, array, n);
        }
        catch (ShortBufferException ex) {
            try {
                if (Build$VERSION.SDK_INT >= 9) {
                    throw new IOException(ex);
                }
            }
            catch (ShortBufferException ex2) {
                throw ex2;
            }
            throw new IOException(ba.z[5] + ex.getMessage());
        }
    }
    
    @Override
    public byte[] a() {
        a(this.g++, this.b);
        this.d.update(this.b, 0, this.b.length);
        return this.d.doFinal();
    }
    
    @Override
    public void b(final byte[] array, final int n, final int n2) {
        try {
            this.c.update(array, n, n2, array, n);
            this.d.update(array, n, n2);
        }
        catch (ShortBufferException ex) {
            try {
                if (Build$VERSION.SDK_INT >= 9) {
                    throw new IOException(ex);
                }
            }
            catch (ShortBufferException ex2) {
                throw ex2;
            }
            throw new IOException(ba.z[4] + ex.getMessage());
        }
    }
    
    @Override
    public byte[] b() {
        a(this.f++, this.e);
        this.a.update(this.e, 0, this.e.length);
        return this.a.doFinal();
    }
}
