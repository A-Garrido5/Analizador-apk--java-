// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class q implements X509TrustManager
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "/(5#";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'X';
                        break;
                    }
                    case 0: {
                        c2 = '\u007f';
                        break;
                    }
                    case 1: {
                        c2 = 'c';
                        break;
                    }
                    case 2: {
                        c2 = '|';
                        break;
                    }
                    case 3: {
                        c2 = '{';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "'MIKa";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "1\f\\\u00184\u0016\u0006\u0012\u000fx\u001c\u0006\u000e\u000f1\u0019\n\u001f\u001a,\u001aC\n\u001e*\u0016\u0005\u0015\u00189\u000b\n\u0013\u0015x\u000f\u0011\u0013\r1\u001b\u0006\u0018";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public void checkClientTrusted(final X509Certificate[] array, final String s) {
        throw new CertificateException(q.z[2]);
    }
    
    @Override
    public void checkServerTrusted(final X509Certificate[] p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/messaging/e.a:Z
        //     3: istore_3       
        //     4: new             Ljava/util/Date;
        //     7: dup            
        //     8: invokespecial   java/util/Date.<init>:()V
        //    11: astore          4
        //    13: aload_1        
        //    14: arraylength    
        //    15: istore          5
        //    17: iconst_0       
        //    18: istore          6
        //    20: iload           6
        //    22: iload           5
        //    24: if_icmpge       43
        //    27: aload_1        
        //    28: iload           6
        //    30: aaload         
        //    31: aload           4
        //    33: invokevirtual   java/security/cert/X509Certificate.checkValidity:(Ljava/util/Date;)V
        //    36: iinc            6, 1
        //    39: iload_3        
        //    40: ifeq            20
        //    43: getstatic       com/whatsapp/messaging/q.z:[Ljava/lang/String;
        //    46: iconst_0       
        //    47: aaload         
        //    48: invokestatic    java/security/cert/CertPathValidator.getInstance:(Ljava/lang/String;)Ljava/security/cert/CertPathValidator;
        //    51: astore          8
        //    53: getstatic       com/whatsapp/messaging/q.z:[Ljava/lang/String;
        //    56: iconst_1       
        //    57: aaload         
        //    58: invokestatic    java/security/cert/CertificateFactory.getInstance:(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
        //    61: aload_1        
        //    62: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //    65: invokevirtual   java/security/cert/CertificateFactory.generateCertPath:(Ljava/util/List;)Ljava/security/cert/CertPath;
        //    68: astore          9
        //    70: aload_0        
        //    71: invokevirtual   com/whatsapp/messaging/q.getAcceptedIssuers:()[Ljava/security/cert/X509Certificate;
        //    74: astore          10
        //    76: new             Ljava/util/HashSet;
        //    79: dup            
        //    80: aload           10
        //    82: arraylength    
        //    83: invokespecial   java/util/HashSet.<init>:(I)V
        //    86: astore          11
        //    88: aload           10
        //    90: arraylength    
        //    91: istore          12
        //    93: iconst_0       
        //    94: istore          13
        //    96: iload           13
        //    98: iload           12
        //   100: if_icmpge       131
        //   103: aload           11
        //   105: new             Ljava/security/cert/TrustAnchor;
        //   108: dup            
        //   109: aload           10
        //   111: iload           13
        //   113: aaload         
        //   114: aconst_null    
        //   115: invokespecial   java/security/cert/TrustAnchor.<init>:(Ljava/security/cert/X509Certificate;[B)V
        //   118: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   123: pop            
        //   124: iinc            13, 1
        //   127: iload_3        
        //   128: ifeq            96
        //   131: new             Ljava/security/cert/PKIXParameters;
        //   134: dup            
        //   135: aload           11
        //   137: invokespecial   java/security/cert/PKIXParameters.<init>:(Ljava/util/Set;)V
        //   140: astore          14
        //   142: aload           14
        //   144: aload           4
        //   146: invokevirtual   java/security/cert/PKIXParameters.setDate:(Ljava/util/Date;)V
        //   149: aload           14
        //   151: iconst_0       
        //   152: invokevirtual   java/security/cert/PKIXParameters.setRevocationEnabled:(Z)V
        //   155: aload           8
        //   157: aload           9
        //   159: aload           14
        //   161: invokevirtual   java/security/cert/CertPathValidator.validate:(Ljava/security/cert/CertPath;Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathValidatorResult;
        //   164: pop            
        //   165: return         
        //   166: astore          7
        //   168: new             Ljava/security/cert/CertificateException;
        //   171: dup            
        //   172: aload           7
        //   174: invokespecial   java/security/cert/CertificateException.<init>:(Ljava/lang/Throwable;)V
        //   177: athrow         
        //   178: astore          17
        //   180: new             Ljava/security/cert/CertificateException;
        //   183: dup            
        //   184: aload           17
        //   186: invokespecial   java/security/cert/CertificateException.<init>:(Ljava/lang/Throwable;)V
        //   189: athrow         
        //   190: astore          15
        //   192: new             Ljava/security/cert/CertificateException;
        //   195: dup            
        //   196: aload           15
        //   198: invokespecial   java/security/cert/CertificateException.<init>:(Ljava/lang/Throwable;)V
        //   201: athrow         
        //   202: astore          15
        //   204: goto            192
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  43     53     166    178    Ljava/security/NoSuchAlgorithmException;
        //  131    142    178    190    Ljava/security/InvalidAlgorithmParameterException;
        //  155    165    190    192    Ljava/security/cert/CertPathValidatorException;
        //  155    165    202    207    Ljava/security/InvalidAlgorithmParameterException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 102, Size: 102
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
    public X509Certificate[] getAcceptedIssuers() {
        return a6.a();
    }
}
