// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Arrays;
import android.content.Context;
import android.backport.util.Base64;

public final class vk
{
    public static boolean a;
    private static final byte[] d;
    private static final String[] z;
    private boolean b;
    private int c;
    private final byte[] e;
    
    static {
        final String[] z2 = new String[6];
        String s = "lj\f16";
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
                        c2 = '\u000e';
                        break;
                    }
                    case 0: {
                        c2 = '9';
                        break;
                    }
                    case 1: {
                        c2 = '>';
                        break;
                    }
                    case 2: {
                        c2 = 'J';
                        break;
                    }
                    case 3: {
                        c2 = '\u001c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "qs\u000b_]q\u007f{";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "ZQ'2yQ_>ooIN";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0016L/o!]L+ko[R/1f]N#3o[Q?hQUQ-s IP-";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "lj\f16";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0016L/o!]L+ko[R/1f]N#1x\r\u0011+~aLJ\u0015pa^Qdl`^";
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
        final char[] charArray2 = "iU\u001ekEjd;Ihxk3N>Kn\u001b$f`tzk@Jo\u001b/jn\u000fa/]zP3HVpX\u000f]vAm})HNU\u000ez:\u000eI\u0004j!Z\u0006:L=I\u000e\rDEk\b\u0005S_TV3Y\\NF}(hN\u000f\u0018E]l\u000fzU:K\u000f-eLoz(ND\r\u000e:ujSs~-I\bw{s@".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = '\u000e';
                    break;
                }
                case 0: {
                    c4 = '9';
                    break;
                }
                case 1: {
                    c4 = '>';
                    break;
                }
                case 2: {
                    c4 = 'J';
                    break;
                }
                case 3: {
                    c4 = '\u001c';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        d = Base64.decode(new String(charArray2).intern(), 0);
    }
    
    private vk(final byte[] e) {
        this.e = e;
    }
    
    public static vk a(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/vk.a:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/App.aS:I
        //     7: iconst_3       
        //     8: if_icmpne       30
        //    11: new             Lcom/whatsapp/vk;
        //    14: dup            
        //    15: bipush          20
        //    17: newarray        B
        //    19: invokespecial   com/whatsapp/vk.<init>:([B)V
        //    22: astore          4
        //    24: aload           4
        //    26: areturn        
        //    27: astore_3       
        //    28: aload_3        
        //    29: athrow         
        //    30: new             Ljava/io/ByteArrayOutputStream;
        //    33: dup            
        //    34: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    37: astore          5
        //    39: aload_0        
        //    40: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    43: astore          6
        //    45: aconst_null    
        //    46: astore          4
        //    48: aload           6
        //    50: ifnull          24
        //    53: getstatic       com/whatsapp/vk.z:[Ljava/lang/String;
        //    56: iconst_2       
        //    57: aaload         
        //    58: aload           6
        //    60: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    63: istore          9
        //    65: aconst_null    
        //    66: astore          4
        //    68: iload           9
        //    70: ifeq            24
        //    73: aload           5
        //    75: aload           6
        //    77: getstatic       com/whatsapp/vk.z:[Ljava/lang/String;
        //    80: iconst_4       
        //    81: aaload         
        //    82: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //    85: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //    88: ldc             Lcom/whatsapp/vk;.class
        //    90: getstatic       com/whatsapp/vk.z:[Ljava/lang/String;
        //    93: iconst_3       
        //    94: aaload         
        //    95: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //    98: astore          11
        //   100: aload           11
        //   102: ifnonnull       438
        //   105: ldc             Lcom/whatsapp/vk;.class
        //   107: getstatic       com/whatsapp/vk.z:[Ljava/lang/String;
        //   110: iconst_5       
        //   111: aaload         
        //   112: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //   115: astore          12
        //   117: aconst_null    
        //   118: astore          4
        //   120: aload           12
        //   122: ifnull          24
        //   125: sipush          8192
        //   128: newarray        B
        //   130: astore          13
        //   132: aload           12
        //   134: aload           13
        //   136: invokevirtual   java/io/InputStream.read:([B)I
        //   139: istore          18
        //   141: iload           18
        //   143: iconst_m1      
        //   144: if_icmpeq       174
        //   147: aload           5
        //   149: aload           13
        //   151: iconst_0       
        //   152: iload           18
        //   154: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //   157: aload           12
        //   159: aload           13
        //   161: invokevirtual   java/io/InputStream.read:([B)I
        //   164: istore          19
        //   166: iload           19
        //   168: istore          18
        //   170: iload_2        
        //   171: ifeq            141
        //   174: aload           12
        //   176: invokevirtual   java/io/InputStream.close:()V
        //   179: aload           5
        //   181: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   184: getstatic       com/whatsapp/vk.d:[B
        //   187: sipush          128
        //   190: sipush          512
        //   193: invokestatic    com/whatsapp/al5.a:([B[BII)Ljavax/crypto/SecretKey;
        //   196: astore          21
        //   198: getstatic       com/whatsapp/vk.z:[Ljava/lang/String;
        //   201: iconst_1       
        //   202: aaload         
        //   203: invokestatic    javax/crypto/Mac.getInstance:(Ljava/lang/String;)Ljavax/crypto/Mac;
        //   206: astore          23
        //   208: aload           23
        //   210: aload           21
        //   212: invokevirtual   javax/crypto/Mac.init:(Ljava/security/Key;)V
        //   215: aload_0        
        //   216: invokestatic    com/whatsapp/util/ac.a:(Landroid/content/Context;)[Landroid/content/pm/Signature;
        //   219: astore          25
        //   221: aconst_null    
        //   222: astore          4
        //   224: aload           25
        //   226: ifnull          24
        //   229: aload           25
        //   231: arraylength    
        //   232: istore          28
        //   234: aconst_null    
        //   235: astore          4
        //   237: iload           28
        //   239: ifeq            24
        //   242: aload           25
        //   244: arraylength    
        //   245: istore          29
        //   247: iconst_0       
        //   248: istore          30
        //   250: iload           30
        //   252: iload           29
        //   254: if_icmpge       277
        //   257: aload           23
        //   259: aload           25
        //   261: iload           30
        //   263: aaload         
        //   264: invokevirtual   android/content/pm/Signature.toByteArray:()[B
        //   267: invokevirtual   javax/crypto/Mac.update:([B)V
        //   270: iinc            30, 1
        //   273: iload_2        
        //   274: ifeq            250
        //   277: iconst_3       
        //   278: getstatic       com/whatsapp/App.aV:I
        //   281: if_icmpne       407
        //   284: bipush          16
        //   286: newarray        B
        //   288: astore          31
        //   290: aload           23
        //   292: aload           31
        //   294: invokevirtual   javax/crypto/Mac.update:([B)V
        //   297: aload_1        
        //   298: getstatic       com/whatsapp/vk.z:[Ljava/lang/String;
        //   301: iconst_0       
        //   302: aaload         
        //   303: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //   306: astore          33
        //   308: aload           23
        //   310: aload           33
        //   312: invokevirtual   javax/crypto/Mac.update:([B)V
        //   315: new             Lcom/whatsapp/vk;
        //   318: dup            
        //   319: aload           23
        //   321: invokevirtual   javax/crypto/Mac.doFinal:()[B
        //   324: invokespecial   com/whatsapp/vk.<init>:([B)V
        //   327: areturn        
        //   328: astore          7
        //   330: aload           7
        //   332: athrow         
        //   333: astore          8
        //   335: aload           8
        //   337: athrow         
        //   338: astore          10
        //   340: new             Ljava/lang/Error;
        //   343: dup            
        //   344: aload           10
        //   346: invokespecial   java/lang/Error.<init>:(Ljava/lang/Throwable;)V
        //   349: athrow         
        //   350: astore          16
        //   352: aload           12
        //   354: invokevirtual   java/io/InputStream.close:()V
        //   357: aconst_null    
        //   358: areturn        
        //   359: astore          17
        //   361: aconst_null    
        //   362: areturn        
        //   363: astore          14
        //   365: aload           12
        //   367: invokevirtual   java/io/InputStream.close:()V
        //   370: aload           14
        //   372: athrow         
        //   373: astore          22
        //   375: new             Ljava/lang/AssertionError;
        //   378: dup            
        //   379: aload           22
        //   381: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   384: athrow         
        //   385: astore          24
        //   387: new             Ljava/lang/AssertionError;
        //   390: dup            
        //   391: aload           24
        //   393: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   396: athrow         
        //   397: astore          26
        //   399: aload           26
        //   401: athrow         
        //   402: astore          27
        //   404: aload           27
        //   406: athrow         
        //   407: aload_0        
        //   408: invokestatic    com/whatsapp/al5.b:(Landroid/content/Context;)[B
        //   411: astore          31
        //   413: goto            290
        //   416: astore          32
        //   418: new             Ljava/lang/Error;
        //   421: dup            
        //   422: aload           32
        //   424: invokespecial   java/lang/Error.<init>:(Ljava/lang/Throwable;)V
        //   427: athrow         
        //   428: astore          20
        //   430: goto            179
        //   433: astore          15
        //   435: goto            370
        //   438: aload           11
        //   440: astore          12
        //   442: goto            117
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  4      24     27     30     Ljava/io/IOException;
        //  53     65     328    338    Ljava/io/IOException;
        //  73     88     338    350    Ljava/io/IOException;
        //  132    141    350    363    Ljava/io/IOException;
        //  132    141    363    373    Any
        //  147    166    350    363    Ljava/io/IOException;
        //  147    166    363    373    Any
        //  174    179    428    433    Ljava/io/IOException;
        //  198    208    373    385    Ljava/security/NoSuchAlgorithmException;
        //  208    215    385    397    Ljava/security/InvalidKeyException;
        //  229    234    397    407    Ljava/io/IOException;
        //  297    308    416    428    Ljava/io/UnsupportedEncodingException;
        //  330    333    333    338    Ljava/io/IOException;
        //  352    357    359    363    Ljava/io/IOException;
        //  365    370    433    438    Ljava/io/IOException;
        //  399    402    402    407    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 217, Size: 217
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
    public boolean equals(final Object o) {
        final boolean a = vk.a;
        final boolean b = this == o || (o != null && this.getClass().equals(o.getClass()) && Arrays.equals(this.e, ((vk)o).e));
        if (a) {
            final boolean h = DialogToastActivity.h;
            boolean h2 = false;
            if (!h) {
                h2 = true;
            }
            DialogToastActivity.h = h2;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        if (this.b) {
            return this.c;
        }
        this.c = Arrays.hashCode(this.e);
        this.b = true;
        return this.c;
    }
    
    @Override
    public String toString() {
        return Base64.encodeToString(this.e, 2);
    }
}
