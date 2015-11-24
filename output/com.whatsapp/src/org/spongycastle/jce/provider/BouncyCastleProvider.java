// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jce.provider;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import java.security.PrivilegedAction;
import java.security.AccessController;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import java.security.Provider;

public final class BouncyCastleProvider extends Provider implements ConfigurableProvider
{
    private static final String[] DIGESTS;
    private static final String DIGEST_PACKAGE;
    public static final String PROVIDER_NAME;
    private static final String[] SYMMETRIC_CIPHERS;
    private static final String SYMMETRIC_PACKAGE;
    public static int a;
    private static String info;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[10];
        final char[] charArray = "8\u0010S\fM'\rZEG4\u0003GVR2L^A_=\u0001Q\fN%\rBKZ2\u0010\u001aQG:\u000fQVL>\u0001\u001a".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '>';
                    break;
                }
                case 0: {
                    c2 = 'W';
                    break;
                }
                case 1: {
                    c2 = 'b';
                    break;
                }
                case 2: {
                    c2 = '4';
                    break;
                }
                case 3: {
                    c2 = '\"';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        SYMMETRIC_PACKAGE = new String(charArray).intern();
        final char[] charArray2 = "\u0004!".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '>';
                    break;
                }
                case 0: {
                    c4 = 'W';
                    break;
                }
                case 1: {
                    c4 = 'b';
                    break;
                }
                case 2: {
                    c4 = '4';
                    break;
                }
                case 3: {
                    c4 = '\"';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        PROVIDER_NAME = new String(charArray2).intern();
        final char[] charArray3 = "8\u0010S\fM'\rZEG4\u0003GVR2L^A_=\u0001Q\fN%\rBKZ2\u0010\u001aFW0\u0007GV\u0010".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '>';
                    break;
                }
                case 0: {
                    c6 = 'W';
                    break;
                }
                case 1: {
                    c6 = 'b';
                    break;
                }
                case 2: {
                    c6 = '4';
                    break;
                }
                case 3: {
                    c6 = '\"';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        DIGEST_PACKAGE = new String(charArray3).intern();
        final char[] charArray4 = "3\u0017DNW4\u0003@G\u001e'\u0010[TW3\u0007F\u0002U2\u001b\u0014\n".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '>';
                    break;
                }
                case 0: {
                    c8 = 'W';
                    break;
                }
                case 1: {
                    c8 = 'b';
                    break;
                }
                case 2: {
                    c8 = '4';
                    break;
                }
                case 3: {
                    c8 = '\"';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[0] = new String(charArray4).intern();
        final char[] charArray5 = "~BRMK9\u0006".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '>';
                    break;
                }
                case 0: {
                    c10 = 'W';
                    break;
                }
                case 1: {
                    c10 = 'b';
                    break;
                }
                case 2: {
                    c10 = '4';
                    break;
                }
                case 3: {
                    c10 = '\"';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[1] = new String(charArray5).intern();
        final char[] charArray6 = "8\u0010S\fM'\rZEG4\u0003GVR2L^A_=\u0001Q\fN%\rBKZ2\u0010\u001aQG:\u000fQVL>\u0001\u001a".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '>';
                    break;
                }
                case 0: {
                    c12 = 'W';
                    break;
                }
                case 1: {
                    c12 = 'b';
                    break;
                }
                case 2: {
                    c12 = '4';
                    break;
                }
                case 3: {
                    c12 = '\"';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[2] = new String(charArray6).intern();
        final char[] charArray7 = "8\u0010S\fM'\rZEG4\u0003GVR2L^A_=\u0001Q\fN%\rBKZ2\u0010\u001aFW0\u0007GV\u0010".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '>';
                    break;
                }
                case 0: {
                    c14 = 'W';
                    break;
                }
                case 1: {
                    c14 = 'b';
                    break;
                }
                case 2: {
                    c14 = '4';
                    break;
                }
                case 3: {
                    c14 = '\"';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[3] = new String(charArray7).intern();
        final char[] charArray8 = "\u0004!".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '>';
                    break;
                }
                case 0: {
                    c16 = 'W';
                    break;
                }
                case 1: {
                    c16 = 'b';
                    break;
                }
                case 2: {
                    c16 = '4';
                    break;
                }
                case 3: {
                    c16 = '\"';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[4] = new String(charArray8).intern();
        final char[] charArray9 = "s/URN>\fSQ".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '>';
                    break;
                }
                case 0: {
                    c18 = 'W';
                    break;
                }
                case 1: {
                    c18 = 'b';
                    break;
                }
                case 2: {
                    c18 = '4';
                    break;
                }
                case 3: {
                    c18 = '\"';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[5] = new String(charArray9).intern();
        final char[] charArray10 = "s/URN>\fSQ\u001emB".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '>';
                    break;
                }
                case 0: {
                    c20 = 'W';
                    break;
                }
                case 1: {
                    c20 = 'b';
                    break;
                }
                case 2: {
                    c20 = '4';
                    break;
                }
                case 3: {
                    c20 = '\"';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[6] = new String(charArray10).intern();
        final char[] charArray11 = "s/URN>\fSQ".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '>';
                    break;
                }
                case 0: {
                    c22 = 'W';
                    break;
                }
                case 1: {
                    c22 = 'b';
                    break;
                }
                case 2: {
                    c22 = '4';
                    break;
                }
                case 3: {
                    c22 = '\"';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[7] = new String(charArray11).intern();
        final char[] charArray12 = "4\u0003ZLQ#BWP[6\u0016Q\u0002W9\u0011@CP4\u0007\u0014MXw".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '>';
                    break;
                }
                case 0: {
                    c24 = 'W';
                    break;
                }
                case 1: {
                    c24 = 'b';
                    break;
                }
                case 2: {
                    c24 = '4';
                    break;
                }
                case 3: {
                    c24 = '\"';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[8] = new String(charArray12).intern();
        final char[] charArray13 = "\u0016\u000eS\f\u007f;\u000bUQ\u0010".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '>';
                    break;
                }
                case 0: {
                    c26 = 'W';
                    break;
                }
                case 1: {
                    c26 = 'b';
                    break;
                }
                case 2: {
                    c26 = '4';
                    break;
                }
                case 3: {
                    c26 = '\"';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[9] = new String(charArray13).intern();
        z = z2;
        final char[] charArray14 = "\u0015\rAL].!UQJ;\u0007\u0014q[4\u0017FKJ.BdPQ!\u000bPGLw\u0014\u0005\f\u000bf".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '>';
                    break;
                }
                case 0: {
                    c28 = 'W';
                    break;
                }
                case 1: {
                    c28 = 'b';
                    break;
                }
                case 2: {
                    c28 = '4';
                    break;
                }
                case 3: {
                    c28 = '\"';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        BouncyCastleProvider.info = new String(charArray14).intern();
        final String[] symmetric_CIPHERS = new String[2];
        final char[] charArray15 = "\u0016'g".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '>';
                    break;
                }
                case 0: {
                    c30 = 'W';
                    break;
                }
                case 1: {
                    c30 = 'b';
                    break;
                }
                case 2: {
                    c30 = '4';
                    break;
                }
                case 3: {
                    c30 = '\"';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        symmetric_CIPHERS[0] = new String(charArray15).intern();
        final char[] charArray16 = "\u00160w\u0016".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = '>';
                    break;
                }
                case 0: {
                    c32 = 'W';
                    break;
                }
                case 1: {
                    c32 = 'b';
                    break;
                }
                case 2: {
                    c32 = '4';
                    break;
                }
                case 3: {
                    c32 = '\"';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        symmetric_CIPHERS[1] = new String(charArray16).intern();
        SYMMETRIC_CIPHERS = symmetric_CIPHERS;
        final String[] digests = new String[4];
        final char[] charArray17 = "\u001a&\u0001".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = '>';
                    break;
                }
                case 0: {
                    c34 = 'W';
                    break;
                }
                case 1: {
                    c34 = 'b';
                    break;
                }
                case 2: {
                    c34 = '4';
                    break;
                }
                case 3: {
                    c34 = '\"';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        digests[0] = new String(charArray17).intern();
        final char[] charArray18 = "\u0004*u\u0013".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = '>';
                    break;
                }
                case 0: {
                    c36 = 'W';
                    break;
                }
                case 1: {
                    c36 = 'b';
                    break;
                }
                case 2: {
                    c36 = '4';
                    break;
                }
                case 3: {
                    c36 = '\"';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        digests[1] = new String(charArray18).intern();
        final char[] charArray19 = "\u0004*u\u0010\u000ba".toCharArray();
        for (int length15 = charArray19.length, n19 = 0; length15 > n19; ++n19) {
            final char c37 = charArray19[n19];
            char c38 = '\0';
            switch (n19 % 5) {
                default: {
                    c38 = '>';
                    break;
                }
                case 0: {
                    c38 = 'W';
                    break;
                }
                case 1: {
                    c38 = 'b';
                    break;
                }
                case 2: {
                    c38 = '4';
                    break;
                }
                case 3: {
                    c38 = '\"';
                    break;
                }
            }
            charArray19[n19] = (char)(c38 ^ c37);
        }
        digests[2] = new String(charArray19).intern();
        final char[] charArray20 = "\u0004*u\u0017\u000fe".toCharArray();
        for (int length16 = charArray20.length, n20 = 0; length16 > n20; ++n20) {
            final char c39 = charArray20[n20];
            char c40 = '\0';
            switch (n20 % 5) {
                default: {
                    c40 = '>';
                    break;
                }
                case 0: {
                    c40 = 'W';
                    break;
                }
                case 1: {
                    c40 = 'b';
                    break;
                }
                case 2: {
                    c40 = '4';
                    break;
                }
                case 3: {
                    c40 = '\"';
                    break;
                }
            }
            charArray20[n20] = (char)(c40 ^ c39);
        }
        digests[3] = new String(charArray20).intern();
        DIGESTS = digests;
    }
    
    public BouncyCastleProvider() {
        super(BouncyCastleProvider.z[4], 1.51, BouncyCastleProvider.info);
        AccessController.doPrivileged((PrivilegedAction<Object>)new BouncyCastleProvider$1(this));
    }
    
    static void access$000(final BouncyCastleProvider bouncyCastleProvider) {
        bouncyCastleProvider.setup();
    }
    
    private void loadAlgorithms(final String s, final String[] array) {
        final int a = BouncyCastleProvider.a;
        int n = 0;
        while (true) {
            if (n == array.length) {
                return;
            }
            int n2 = 0;
        Label_0200:
            while (true) {
                try {
                    final ClassLoader classLoader = this.getClass().getClassLoader();
                    Label_0097: {
                        if (classLoader == null) {
                            break Label_0097;
                        }
                        Class<?> clazz = classLoader.loadClass(s + array[n] + BouncyCastleProvider.z[7]);
                        Label_0086: {
                            if (clazz == null) {
                                break Label_0086;
                            }
                            try {
                                ((AlgorithmProvider)clazz.newInstance()).configure(this);
                                n2 = n + 1;
                                if (a != 0) {
                                    return;
                                }
                                break Label_0200;
                                clazz = Class.forName(s + array[n] + BouncyCastleProvider.z[5]);
                            }
                            catch (Exception ex) {
                                throw new InternalError(BouncyCastleProvider.z[8] + s + array[n] + BouncyCastleProvider.z[6] + ex);
                            }
                        }
                    }
                }
                catch (ClassNotFoundException ex2) {
                    final Class<?> clazz = null;
                    continue;
                }
                break;
            }
            n = n2;
        }
    }
    
    private void setup() {
        this.loadAlgorithms(BouncyCastleProvider.z[3], BouncyCastleProvider.DIGESTS);
        this.loadAlgorithms(BouncyCastleProvider.z[2], BouncyCastleProvider.SYMMETRIC_CIPHERS);
    }
    
    @Override
    public void addAlgorithm(final String s, final String s2) {
        final int a = BouncyCastleProvider.a;
        try {
            if (this.containsKey(s)) {
                throw new IllegalStateException(BouncyCastleProvider.z[0] + s + BouncyCastleProvider.z[1]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            this.put(s, s2);
            if (BaseKeyGenerator.a) {
                BouncyCastleProvider.a = a + 1;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
    }
    
    @Override
    public boolean hasAlgorithm(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/jce/provider/BouncyCastleProvider.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: aload_1        
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: ldc             "."
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_2        
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    25: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    28: invokevirtual   org/spongycastle/jce/provider/BouncyCastleProvider.containsKey:(Ljava/lang/Object;)Z
        //    31: istore          6
        //    33: iload           6
        //    35: ifne            81
        //    38: aload_0        
        //    39: new             Ljava/lang/StringBuilder;
        //    42: dup            
        //    43: invokespecial   java/lang/StringBuilder.<init>:()V
        //    46: getstatic       org/spongycastle/jce/provider/BouncyCastleProvider.z:[Ljava/lang/String;
        //    49: bipush          9
        //    51: aaload         
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: aload_1        
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: ldc             "."
        //    61: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    64: aload_2        
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    68: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    71: invokevirtual   org/spongycastle/jce/provider/BouncyCastleProvider.containsKey:(Ljava/lang/Object;)Z
        //    74: istore          11
        //    76: iload           11
        //    78: ifeq            119
        //    81: iconst_1       
        //    82: istore          7
        //    84: iload_3        
        //    85: ifeq            106
        //    88: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //    91: istore          9
        //    93: iconst_0       
        //    94: istore          10
        //    96: iload           9
        //    98: ifeq            130
        //   101: iload           10
        //   103: putstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //   106: iload           7
        //   108: ireturn        
        //   109: astore          4
        //   111: aload           4
        //   113: athrow         
        //   114: astore          5
        //   116: aload           5
        //   118: athrow         
        //   119: iconst_0       
        //   120: istore          7
        //   122: goto            84
        //   125: astore          8
        //   127: aload           8
        //   129: athrow         
        //   130: iconst_1       
        //   131: istore          10
        //   133: goto            101
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      33     109    114    Ljava/lang/IllegalStateException;
        //  38     76     114    119    Ljava/lang/IllegalStateException;
        //  88     93     125    130    Ljava/lang/IllegalStateException;
        //  111    114    114    119    Ljava/lang/IllegalStateException;
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
}
