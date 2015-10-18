// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.zip.GZIPInputStream;
import javax.crypto.CipherInputStream;
import com.whatsapp.awf;
import java.io.OutputStream;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import com.whatsapp.al5;
import android.backport.util.Base64;
import javax.crypto.spec.SecretKeySpec;
import com.whatsapp.a6c;
import javax.crypto.Cipher;

public class ae
{
    private static ae l;
    private static final String[] z;
    byte[] a;
    private Cipher b;
    private Cipher c;
    private Cipher d;
    private Cipher e;
    private Cipher f;
    private Cipher g;
    private Cipher h;
    private Cipher i;
    private Cipher j;
    private Cipher k;
    private boolean m;
    private Cipher n;
    private Cipher o;
    private Cipher p;
    private Cipher q;
    private Cipher r;
    private Cipher s;
    
    static {
        final String[] z2 = new String[46];
        String s = "X6\ncqM,\fc'X6\n>aRx";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1182:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\b';
                        break;
                    }
                    case 0: {
                        c2 = '=';
                        break;
                    }
                    case 1: {
                        c2 = 'X';
                        break;
                    }
                    case 2: {
                        c2 = 'i';
                        break;
                    }
                    case 3: {
                        c2 = '\u0011';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "|\u001d:";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "X6\ncqM,\fc'X6\ncqM,FxfK9\u0005xl\\4\u000eaiO9\u0004";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "|\u001d:";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "X6\ncqM,\fc'X6\n>gH,Fxg\u001d";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "X6\ncqM,\u0000~f\u001d6\u0006e(\\.\bxd\\:\u0005t";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "X6\ncqM,\fc'X6\ncqM,FxfK9\u0005xlV=\u0010";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "X6\ncqM,\fc'X6\n>gH,Fxg\u001d";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "X6\ncqM,\fc'X6\n>gH,Fxg\u001d";
                    n = 7;
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "X6\ncqM,\fc'X6\ncqM,FxfK9\u0005xl\\4\u000eaiO9\u0004";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "X6\ncqM,\fc'X6\ncqM,FxfK9\u0005xlV=\u0010";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "X6\ncqM,\fc'Y=\ncqM,FxfK9\u0005xl\\4\u000eaiO9\u0004";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "X6\ncqM,\fc'Y=\ncqM,FxfK9\u0005xlV=\u0010";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "|\u001d:";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "X6\ncqM,\fc'Y=\ncqM,FxfK9\u0005xlV=\u0010";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "|\u001d:";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "Y=\ncqM,\u0000~f\u001d6\u0006e(\\.\bxd\\:\u0005t";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    s = "X6\ncqM,\fc'Y=\ncqM,FxfK9\u0005xl\\4\u000eaiO9\u0004";
                    n = 16;
                    n2 = 17;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    array = z2;
                    s = "|\u001d:>K\u007f\u001bFAC~\u000b\\AiY<\u0000\u007fo";
                    n = 17;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "X6\ncqM,\fc'S7\u001adkU9\u0005v";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "|\u001d:";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "|\u001d:>K\u007f\u001bFAC~\u000b\\AiY<\u0000\u007fo";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "X6\ncqM,\fc'T6\u001fpdT<\b}oM9\u001bpe";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "w(9C^m\u0012_}Px\u000b/S`\f\u0011\u000ew~y4&h{K(<CNr\u0014";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "|\u001d:>K\u007f\u001bFAC~\u000b\\AiY<\u0000\u007fo";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "|\u001d:>K\u007f\u001bFAC~\u000b\\AiY<\u0000\u007fo";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "|\u001d:";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "|\u000b*XA";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "|\u001d:";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "|\u001d:";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "|\u001d:";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "|\u001d:>K\u007f\u001bFAC~\u000b\\AiY<\u0000\u007fo";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "X6\ncqM,\fc'H6\u001adxM7\u001bemY=\u0007rgY1\u0007v";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "|\u001d:>K\u007f\u001bFAC~\u000b\\AiY<\u0000\u007fo";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "|\u001d:>K\u007f\u001bFAC~\u000b\\AiY<\u0000\u007fo";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "|\u001d:";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "X6\ncqM,\fc'S7\u001adkU(\bulT6\u000e";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "X6\ncqM,\fc'T6\u001fpdT<\u0002tq";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "|\u001d:>Ki\nF_gm9\ruaS?";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "|\u001d:";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "W\r\u001aGPp6Fvme\u0014Pgx\t\u001f=Kym+0yxQ\u0002+sFX\f";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "u2\u0007kiX3'brL6&!YO-^p\u007fH\tT,";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "|\u001d:";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "|\u001d:>K\u007f\u001bFAC~\u000b\\AiY<\u0000\u007fo";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "|\u001d:>Ki\nF_gm9\ruaS?";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "|\u001d:";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    break Label_1182;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        ae.l = null;
    }
    
    private ae() {
        this.a = new byte[131072];
        this.m = false;
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(a6c.p.getBytes(ae.z[27]), ae.z[26]);
            final SecretKeySpec secretKeySpec2 = new SecretKeySpec(Base64.decode(ae.z[23], 0), ae.z[29]);
            final SecretKeySpec secretKeySpec3 = new SecretKeySpec(al5.c(Base64.decode(ae.z[40], 0)), ae.z[30]);
            final IvParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode(ae.z[41], 0));
            this.s = Cipher.getInstance(ae.z[28]);
            this.q = Cipher.getInstance(ae.z[39]);
            this.k = Cipher.getInstance(ae.z[35]);
            this.d = Cipher.getInstance(ae.z[38]);
            this.j = Cipher.getInstance(ae.z[18]);
            this.r = Cipher.getInstance(ae.z[21]);
            this.h = Cipher.getInstance(ae.z[33]);
            this.g = Cipher.getInstance(ae.z[24]);
            this.e = Cipher.getInstance(ae.z[42]);
            this.o = Cipher.getInstance(ae.z[20]);
            this.b = Cipher.getInstance(ae.z[45]);
            this.c = Cipher.getInstance(ae.z[44]);
            this.n = Cipher.getInstance(ae.z[34]);
            this.p = Cipher.getInstance(ae.z[25]);
            this.f = Cipher.getInstance(ae.z[43]);
            this.i = Cipher.getInstance(ae.z[31]);
            this.s.init(1, secretKeySpec);
            this.q.init(1, secretKeySpec2);
            this.k.init(1, secretKeySpec3);
            this.d.init(1, secretKeySpec3, ivParameterSpec);
            this.j.init(1, secretKeySpec3, ivParameterSpec);
            this.e.init(2, secretKeySpec);
            this.o.init(2, secretKeySpec2);
            this.b.init(2, secretKeySpec3);
            this.c.init(2, secretKeySpec3, ivParameterSpec);
            this.n.init(2, secretKeySpec3, ivParameterSpec);
            this.m = true;
        }
        catch (UnsupportedEncodingException ex) {
            Log.c(ae.z[32], ex);
        }
        catch (NoSuchPaddingException ex2) {
            Log.c(ae.z[36], ex2);
        }
        catch (NoSuchAlgorithmException ex3) {
            Log.c(ae.z[19], ex3);
        }
        catch (InvalidKeyException ex4) {
            Log.c(ae.z[37], ex4);
        }
        catch (InvalidAlgorithmParameterException ex5) {
            Log.c(ae.z[22], ex5);
        }
    }
    
    public static ae b() {
        try {
            if (ae.l == null) {
                ae.l = new ae();
            }
            return ae.l;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void a(InputStream inputStream, final OutputStream outputStream, final int n, final int n2, final long n3, final awf awf, final c6 c6, final byte[] array, final byte[] array2) {
        final boolean l = Log.l;
        try {
            if (!this.m) {
                throw new IllegalStateException(ae.z[16]);
            }
        }
        catch (InvalidKeyException ex) {
            throw ex;
        }
        InputStream inputStream2 = null;
        Label_0382: {
            switch (ai.a[c6.ordinal()]) {
                default: {
                    inputStream2 = inputStream;
                    break;
                }
                case 1: {
                    inputStream2 = new CipherInputStream(inputStream, this.e);
                    if (l) {
                        inputStream = inputStream2;
                        break Label_0382;
                    }
                    break;
                }
                case 2: {
                    inputStream2 = new CipherInputStream(inputStream, this.o);
                    if (l) {
                        inputStream = inputStream2;
                        break Label_0382;
                    }
                    break;
                }
                case 3: {
                    inputStream2 = new CipherInputStream(inputStream, this.b);
                    if (l) {
                        inputStream = inputStream2;
                        break Label_0382;
                    }
                    break;
                }
                case 4: {
                    inputStream2 = new CipherInputStream(inputStream, this.c);
                    if (l) {
                        inputStream = inputStream2;
                        break Label_0382;
                    }
                    break;
                }
                case 5: {
                    inputStream2 = new CipherInputStream(inputStream, this.n);
                    if (l) {
                        inputStream = inputStream2;
                        break Label_0382;
                    }
                    break;
                }
                case 6:
                case 7: {
                    final SecretKeySpec secretKeySpec = new SecretKeySpec(array, ae.z[13]);
                    final IvParameterSpec ivParameterSpec = new IvParameterSpec(array2);
                    Label_0499: {
                        try {
                            try {
                                if (c6 == c6.CRYPT6) {
                                    final Cipher p9 = this.p;
                                    try {
                                        p9.init(2, secretKeySpec, ivParameterSpec);
                                        inputStream2 = new CipherInputStream(inputStream, p9);
                                    }
                                    catch (InvalidKeyException ex2) {
                                        Log.c(ae.z[14], ex2);
                                        inputStream2 = inputStream;
                                    }
                                    break;
                                }
                                goto Label_0467;
                            }
                            catch (InvalidKeyException ex3) {
                                throw ex3;
                            }
                        }
                        catch (InvalidAlgorithmParameterException ex4) {
                            Log.c(ae.z[11], ex4);
                            if (!l) {
                                break Label_0499;
                            }
                        }
                        break Label_0382;
                    }
                    inputStream2 = inputStream;
                    break;
                }
                case 8: {
                    final SecretKeySpec secretKeySpec2 = new SecretKeySpec(array, ae.z[15]);
                    final IvParameterSpec ivParameterSpec2 = new IvParameterSpec(array2);
                    try {
                        final Cipher i = this.i;
                        i.init(2, secretKeySpec2, ivParameterSpec2);
                        inputStream2 = new GZIPInputStream(new CipherInputStream(inputStream, i));
                    }
                    catch (InvalidKeyException ex5) {
                        Log.c(ae.z[12], ex5);
                        inputStream2 = inputStream;
                    }
                    catch (InvalidAlgorithmParameterException ex6) {
                        Log.c(ae.z[17], ex6);
                        inputStream2 = inputStream;
                    }
                    break;
                }
            }
        }
        long n4 = 0L;
        while (true) {
            final int read = inputStream2.read(this.a);
            if (read < 0) {
                break;
            }
            outputStream.write(this.a, 0, read);
            n4 += read;
            if (awf == null || n2 <= 0) {
                continue;
            }
            awf.a(n4, n3, n, n2);
            if (l) {
                break;
            }
        }
    }
    
    public void a(final InputStream p0, final OutputStream p1, final c6 p2, final byte[] p3, final byte[] p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore          6
        //     5: aload_0        
        //     6: getfield        com/whatsapp/util/ae.m:Z
        //     9: ifeq            108
        //    12: getstatic       com/whatsapp/util/ai.a:[I
        //    15: aload_3        
        //    16: invokevirtual   com/whatsapp/util/c6.ordinal:()I
        //    19: iaload         
        //    20: tableswitch {
        //                2: 126
        //                3: 148
        //                4: 170
        //                5: 192
        //                6: 214
        //                7: 236
        //                8: 236
        //                9: 310
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: aload_0        
        //    70: getfield        com/whatsapp/util/ae.a:[B
        //    73: invokevirtual   java/io/InputStream.read:([B)I
        //    76: istore          15
        //    78: iload           15
        //    80: iflt            99
        //    83: aload_2        
        //    84: aload_0        
        //    85: getfield        com/whatsapp/util/ae.a:[B
        //    88: iconst_0       
        //    89: iload           15
        //    91: invokevirtual   java/io/OutputStream.write:([BII)V
        //    94: iload           6
        //    96: ifeq            68
        //    99: aload_2        
        //   100: invokevirtual   java/io/OutputStream.close:()V
        //   103: iload           6
        //   105: ifeq            610
        //   108: new             Ljava/lang/IllegalStateException;
        //   111: dup            
        //   112: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   115: iconst_5       
        //   116: aaload         
        //   117: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   120: athrow         
        //   121: astore          7
        //   123: aload           7
        //   125: athrow         
        //   126: new             Ljavax/crypto/CipherOutputStream;
        //   129: dup            
        //   130: aload_2        
        //   131: aload_0        
        //   132: getfield        com/whatsapp/util/ae.s:Ljavax/crypto/Cipher;
        //   135: invokespecial   javax/crypto/CipherOutputStream.<init>:(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
        //   138: astore          33
        //   140: iload           6
        //   142: ifeq            635
        //   145: aload           33
        //   147: astore_2       
        //   148: new             Ljavax/crypto/CipherOutputStream;
        //   151: dup            
        //   152: aload_2        
        //   153: aload_0        
        //   154: getfield        com/whatsapp/util/ae.q:Ljavax/crypto/Cipher;
        //   157: invokespecial   javax/crypto/CipherOutputStream.<init>:(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
        //   160: astore          32
        //   162: iload           6
        //   164: ifeq            629
        //   167: aload           32
        //   169: astore_2       
        //   170: new             Ljavax/crypto/CipherOutputStream;
        //   173: dup            
        //   174: aload_2        
        //   175: aload_0        
        //   176: getfield        com/whatsapp/util/ae.k:Ljavax/crypto/Cipher;
        //   179: invokespecial   javax/crypto/CipherOutputStream.<init>:(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
        //   182: astore          31
        //   184: iload           6
        //   186: ifeq            623
        //   189: aload           31
        //   191: astore_2       
        //   192: new             Ljavax/crypto/CipherOutputStream;
        //   195: dup            
        //   196: aload_2        
        //   197: aload_0        
        //   198: getfield        com/whatsapp/util/ae.d:Ljavax/crypto/Cipher;
        //   201: invokespecial   javax/crypto/CipherOutputStream.<init>:(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
        //   204: astore          30
        //   206: iload           6
        //   208: ifeq            617
        //   211: aload           30
        //   213: astore_2       
        //   214: new             Ljavax/crypto/CipherOutputStream;
        //   217: dup            
        //   218: aload_2        
        //   219: aload_0        
        //   220: getfield        com/whatsapp/util/ae.j:Ljavax/crypto/Cipher;
        //   223: invokespecial   javax/crypto/CipherOutputStream.<init>:(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
        //   226: astore          29
        //   228: iload           6
        //   230: ifeq            611
        //   233: aload           29
        //   235: astore_2       
        //   236: new             Ljavax/crypto/spec/IvParameterSpec;
        //   239: dup            
        //   240: aload           5
        //   242: invokespecial   javax/crypto/spec/IvParameterSpec.<init>:([B)V
        //   245: astore          20
        //   247: new             Ljavax/crypto/spec/SecretKeySpec;
        //   250: dup            
        //   251: aload           4
        //   253: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   256: iconst_1       
        //   257: aaload         
        //   258: invokespecial   javax/crypto/spec/SecretKeySpec.<init>:([BLjava/lang/String;)V
        //   261: astore          21
        //   263: aload_3        
        //   264: getstatic       com/whatsapp/util/c6.CRYPT6:Lcom/whatsapp/util/c6;
        //   267: if_acmpne       472
        //   270: aload_0        
        //   271: getfield        com/whatsapp/util/ae.r:Ljavax/crypto/Cipher;
        //   274: astore          28
        //   276: aload           28
        //   278: astore          26
        //   280: aload           26
        //   282: iconst_1       
        //   283: aload           21
        //   285: aload           20
        //   287: invokevirtual   javax/crypto/Cipher.init:(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
        //   290: new             Ljavax/crypto/CipherOutputStream;
        //   293: dup            
        //   294: aload_2        
        //   295: aload           26
        //   297: invokespecial   javax/crypto/CipherOutputStream.<init>:(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
        //   300: astore          27
        //   302: aload           27
        //   304: astore_2       
        //   305: iload           6
        //   307: ifeq            68
        //   310: new             Ljavax/crypto/spec/IvParameterSpec;
        //   313: dup            
        //   314: aload           5
        //   316: invokespecial   javax/crypto/spec/IvParameterSpec.<init>:([B)V
        //   319: astore          12
        //   321: new             Ljavax/crypto/spec/SecretKeySpec;
        //   324: dup            
        //   325: aload           4
        //   327: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   330: iconst_3       
        //   331: aaload         
        //   332: invokespecial   javax/crypto/spec/SecretKeySpec.<init>:([BLjava/lang/String;)V
        //   335: astore          13
        //   337: aload_0        
        //   338: getfield        com/whatsapp/util/ae.g:Ljavax/crypto/Cipher;
        //   341: astore          18
        //   343: aload           18
        //   345: iconst_1       
        //   346: aload           13
        //   348: aload           12
        //   350: invokevirtual   javax/crypto/Cipher.init:(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
        //   353: new             Ljava/util/zip/GZIPOutputStream;
        //   356: dup            
        //   357: new             Ljavax/crypto/CipherOutputStream;
        //   360: dup            
        //   361: aload_2        
        //   362: aload           18
        //   364: invokespecial   javax/crypto/CipherOutputStream.<init>:(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
        //   367: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   370: astore          19
        //   372: aload           19
        //   374: astore_2       
        //   375: goto            68
        //   378: astore          23
        //   380: aload           23
        //   382: athrow         
        //   383: astore          24
        //   385: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   388: bipush          10
        //   390: aaload         
        //   391: aload           24
        //   393: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   396: goto            305
        //   399: astore          10
        //   401: new             Ljava/lang/StringBuilder;
        //   404: dup            
        //   405: invokespecial   java/lang/StringBuilder.<init>:()V
        //   408: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   411: iconst_0       
        //   412: aaload         
        //   413: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   416: aload           10
        //   418: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   421: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   424: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   427: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   430: aload_2        
        //   431: invokevirtual   java/io/OutputStream.close:()V
        //   434: goto            103
        //   437: astore          11
        //   439: new             Ljava/lang/StringBuilder;
        //   442: dup            
        //   443: invokespecial   java/lang/StringBuilder.<init>:()V
        //   446: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   449: bipush          7
        //   451: aaload         
        //   452: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   455: aload           11
        //   457: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   460: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   463: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   466: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   469: goto            103
        //   472: aload_0        
        //   473: getfield        com/whatsapp/util/ae.h:Ljavax/crypto/Cipher;
        //   476: astore          25
        //   478: aload           25
        //   480: astore          26
        //   482: goto            280
        //   485: astore          22
        //   487: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   490: iconst_2       
        //   491: aaload         
        //   492: aload           22
        //   494: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   497: goto            305
        //   500: astore          8
        //   502: aload_2        
        //   503: invokevirtual   java/io/OutputStream.close:()V
        //   506: aload           8
        //   508: athrow         
        //   509: astore          17
        //   511: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   514: bipush          6
        //   516: aaload         
        //   517: aload           17
        //   519: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   522: goto            68
        //   525: astore          14
        //   527: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   530: bipush          9
        //   532: aaload         
        //   533: aload           14
        //   535: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   538: goto            68
        //   541: astore          16
        //   543: new             Ljava/lang/StringBuilder;
        //   546: dup            
        //   547: invokespecial   java/lang/StringBuilder.<init>:()V
        //   550: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   553: iconst_4       
        //   554: aaload         
        //   555: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   558: aload           16
        //   560: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   563: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   566: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   569: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   572: goto            103
        //   575: astore          9
        //   577: new             Ljava/lang/StringBuilder;
        //   580: dup            
        //   581: invokespecial   java/lang/StringBuilder.<init>:()V
        //   584: getstatic       com/whatsapp/util/ae.z:[Ljava/lang/String;
        //   587: bipush          8
        //   589: aaload         
        //   590: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   593: aload           9
        //   595: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   598: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   601: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   604: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   607: goto            506
        //   610: return         
        //   611: aload           29
        //   613: astore_2       
        //   614: goto            68
        //   617: aload           30
        //   619: astore_2       
        //   620: goto            68
        //   623: aload           31
        //   625: astore_2       
        //   626: goto            68
        //   629: aload           32
        //   631: astore_2       
        //   632: goto            68
        //   635: aload           33
        //   637: astore_2       
        //   638: goto            68
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  12     68     399    472    Ljava/io/IOException;
        //  12     68     500    509    Any
        //  68     78     399    472    Ljava/io/IOException;
        //  68     78     500    509    Any
        //  83     94     399    472    Ljava/io/IOException;
        //  83     94     500    509    Any
        //  99     103    541    575    Ljava/io/IOException;
        //  108    121    121    126    Ljava/security/InvalidKeyException;
        //  126    140    399    472    Ljava/io/IOException;
        //  126    140    500    509    Any
        //  148    162    399    472    Ljava/io/IOException;
        //  148    162    500    509    Any
        //  170    184    399    472    Ljava/io/IOException;
        //  170    184    500    509    Any
        //  192    206    399    472    Ljava/io/IOException;
        //  192    206    500    509    Any
        //  214    228    399    472    Ljava/io/IOException;
        //  214    228    500    509    Any
        //  236    263    399    472    Ljava/io/IOException;
        //  236    263    500    509    Any
        //  263    276    378    383    Ljava/security/InvalidKeyException;
        //  263    276    485    500    Ljava/security/InvalidAlgorithmParameterException;
        //  263    276    399    472    Ljava/io/IOException;
        //  263    276    500    509    Any
        //  280    302    383    399    Ljava/security/InvalidKeyException;
        //  280    302    485    500    Ljava/security/InvalidAlgorithmParameterException;
        //  280    302    399    472    Ljava/io/IOException;
        //  280    302    500    509    Any
        //  310    337    399    472    Ljava/io/IOException;
        //  310    337    500    509    Any
        //  337    372    509    525    Ljava/security/InvalidKeyException;
        //  337    372    525    541    Ljava/security/InvalidAlgorithmParameterException;
        //  337    372    399    472    Ljava/io/IOException;
        //  337    372    500    509    Any
        //  380    383    383    399    Ljava/security/InvalidKeyException;
        //  380    383    485    500    Ljava/security/InvalidAlgorithmParameterException;
        //  380    383    399    472    Ljava/io/IOException;
        //  380    383    500    509    Any
        //  385    396    399    472    Ljava/io/IOException;
        //  385    396    500    509    Any
        //  401    430    500    509    Any
        //  430    434    437    472    Ljava/io/IOException;
        //  472    478    383    399    Ljava/security/InvalidKeyException;
        //  472    478    485    500    Ljava/security/InvalidAlgorithmParameterException;
        //  472    478    399    472    Ljava/io/IOException;
        //  472    478    500    509    Any
        //  487    497    399    472    Ljava/io/IOException;
        //  487    497    500    509    Any
        //  502    506    575    610    Ljava/io/IOException;
        //  511    522    399    472    Ljava/io/IOException;
        //  511    522    500    509    Any
        //  527    538    399    472    Ljava/io/IOException;
        //  527    538    500    509    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 279, Size: 279
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    public boolean a() {
        return this.m;
    }
}
