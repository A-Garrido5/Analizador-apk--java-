// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import java.io.UnsupportedEncodingException;

public class f
{
    static final boolean a;
    public static boolean b;
    private static final String[] z;
    
    static {
        int a2 = 1;
        final String[] z2 = new String[2];
        String s = "CmQ\u0005\u0003@\u007fP\bW\u0015";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0018:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
                while (true) {
                    Label_0121: {
                        if (length > n3) {
                            break Label_0121;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "t_\u0018d2bE|";
                                n2 = a2;
                                array = z2;
                                n = 0;
                                continue Label_0018;
                            }
                            case 0: {
                                break;
                            }
                        }
                        while (true) {
                            array[n2] = intern;
                            z = z2;
                            while (true) {
                                Label_0218: {
                                    try {
                                        if (!f.class.desiredAssertionStatus()) {
                                            a = (a2 != 0);
                                            return;
                                        }
                                        break Label_0218;
                                        char c = '\0';
                                        Label_0185: {
                                            c = '!';
                                        }
                                        while (true) {
                                            final char c2;
                                            charArray[n3] = (char)(c ^ c2);
                                            ++n3;
                                            break;
                                            c2 = charArray[n3];
                                            Label_0199:
                                            c = '5';
                                            continue;
                                            Label_0192:
                                            c = '\f';
                                            continue;
                                            Label_0164:
                                            c = 'a';
                                            continue;
                                            Label_0206:
                                            c = '%';
                                            continue;
                                        }
                                    }
                                    // switch([Lcom.strobel.decompiler.ast.Label;@454be972, n3 % 5)
                                    catch (IllegalArgumentException ex) {
                                        throw ex;
                                    }
                                }
                                a2 = 0;
                                continue;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    public static String a(final byte[] array, final int n) {
        try {
            return new String(b(array, n), f.z[1]);
        }
        catch (UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static byte[] a(final String s, final int n) {
        return c(s.getBytes(), n);
    }
    
    public static byte[] a(final byte[] array, final int n, final int n2, final int n3) {
        final l l = new l(n3, new byte[n2 * 3 / 4]);
        try {
            if (!l.a(array, n, n2, true)) {
                throw new IllegalArgumentException(f.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (l.a == l.b.length) {
                return l.b;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        final byte[] array2 = new byte[l.a];
        System.arraycopy(l.b, 0, array2, 0, l.a);
        return array2;
    }
    
    public static byte[] b(final byte[] array, final int n) {
        return b(array, 0, array.length, n);
    }
    
    public static byte[] b(final byte[] p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/jobqueue/f.b:Z
        //     3: istore          4
        //     5: new             Lorg/whispersystems/jobqueue/m;
        //     8: dup            
        //     9: iload_3        
        //    10: aconst_null    
        //    11: invokespecial   org/whispersystems/jobqueue/m.<init>:(I[B)V
        //    14: astore          5
        //    16: iconst_4       
        //    17: iload_2        
        //    18: iconst_3       
        //    19: idiv           
        //    20: imul           
        //    21: istore          6
        //    23: aload           5
        //    25: getfield        org/whispersystems/jobqueue/m.i:Z
        //    28: istore          13
        //    30: iload           13
        //    32: ifeq            49
        //    35: iload_2        
        //    36: iconst_3       
        //    37: irem           
        //    38: ifle            80
        //    41: iinc            6, 4
        //    44: iload           4
        //    46: ifeq            80
        //    49: iload_2        
        //    50: iconst_3       
        //    51: irem           
        //    52: tableswitch {
        //                0: 221
        //                1: 226
        //                2: 234
        //          default: 80
        //        }
        //    80: iload           6
        //    82: istore          14
        //    84: aload           5
        //    86: getfield        org/whispersystems/jobqueue/m.g:Z
        //    89: istore          18
        //    91: iload           18
        //    93: ifeq            275
        //    96: iload_2        
        //    97: ifle            275
        //   100: iload_2        
        //   101: iconst_1       
        //   102: isub           
        //   103: istore          24
        //   105: iconst_1       
        //   106: iload           24
        //   108: bipush          57
        //   110: idiv           
        //   111: iadd           
        //   112: istore          25
        //   114: aload           5
        //   116: getfield        org/whispersystems/jobqueue/m.h:Z
        //   119: istore          26
        //   121: iload           26
        //   123: ifeq            258
        //   126: iconst_2       
        //   127: istore          27
        //   129: iload           14
        //   131: iload           27
        //   133: iload           25
        //   135: imul           
        //   136: iadd           
        //   137: istore          19
        //   139: aload           5
        //   141: iload           19
        //   143: newarray        B
        //   145: putfield        org/whispersystems/jobqueue/m.b:[B
        //   148: aload           5
        //   150: aload_0        
        //   151: iload_1        
        //   152: iload_2        
        //   153: iconst_1       
        //   154: invokevirtual   org/whispersystems/jobqueue/m.a:([BIIZ)Z
        //   157: pop            
        //   158: getstatic       org/whispersystems/jobqueue/f.a:Z
        //   161: istore          23
        //   163: iload           23
        //   165: ifne            269
        //   168: aload           5
        //   170: getfield        org/whispersystems/jobqueue/m.a:I
        //   173: iload           19
        //   175: if_icmpeq       269
        //   178: new             Ljava/lang/AssertionError;
        //   181: dup            
        //   182: invokespecial   java/lang/AssertionError.<init>:()V
        //   185: athrow         
        //   186: astore          21
        //   188: aload           21
        //   190: athrow         
        //   191: astore          7
        //   193: aload           7
        //   195: athrow         
        //   196: astore          8
        //   198: aload           8
        //   200: athrow         
        //   201: astore          9
        //   203: aload           9
        //   205: athrow         
        //   206: astore          10
        //   208: aload           10
        //   210: athrow         
        //   211: astore          11
        //   213: aload           11
        //   215: athrow         
        //   216: astore          12
        //   218: aload           12
        //   220: athrow         
        //   221: iload           4
        //   223: ifeq            80
        //   226: iinc            6, 2
        //   229: iload           4
        //   231: ifeq            80
        //   234: iload           6
        //   236: iconst_3       
        //   237: iadd           
        //   238: istore          14
        //   240: goto            84
        //   243: astore          15
        //   245: aload           15
        //   247: athrow         
        //   248: astore          16
        //   250: aload           16
        //   252: athrow         
        //   253: astore          17
        //   255: aload           17
        //   257: athrow         
        //   258: iconst_1       
        //   259: istore          27
        //   261: goto            129
        //   264: astore          20
        //   266: aload           20
        //   268: athrow         
        //   269: aload           5
        //   271: getfield        org/whispersystems/jobqueue/m.b:[B
        //   274: areturn        
        //   275: iload           14
        //   277: istore          19
        //   279: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  23     30     191    221    Ljava/lang/IllegalArgumentException;
        //  84     91     243    253    Ljava/lang/IllegalArgumentException;
        //  105    121    253    258    Ljava/lang/IllegalArgumentException;
        //  139    163    264    269    Ljava/lang/IllegalArgumentException;
        //  168    186    186    191    Ljava/lang/IllegalArgumentException;
        //  193    196    196    221    Ljava/lang/IllegalArgumentException;
        //  198    201    201    221    Ljava/lang/IllegalArgumentException;
        //  203    206    206    221    Ljava/lang/IllegalArgumentException;
        //  208    211    211    221    Ljava/lang/IllegalArgumentException;
        //  213    216    216    221    Ljava/lang/IllegalArgumentException;
        //  245    248    248    253    Ljava/lang/IllegalArgumentException;
        //  250    253    253    258    Ljava/lang/IllegalArgumentException;
        //  266    269    186    191    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 137, Size: 137
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
    
    public static byte[] c(final byte[] array, final int n) {
        return a(array, 0, array.length, n);
    }
}
