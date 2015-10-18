// 
// Decompiled by Procyon v0.5.30
// 

package com;

import android.os.Build$VERSION;
import java.io.IOException;
import android.os.Process;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import android.os.Build;

public final class b
{
    public static int a;
    private static final byte[] b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[16];
        String s = "Z\r]:kE\u001eY|o\u001b\u0017[fgZ\u0011C:r[\u001aN:zG\u0010L}nP\r\u0014~yF\u001a\u0014ZkA\u0016LqIG\u0006J`e";
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
                        c2 = '\n';
                        break;
                    }
                    case 0: {
                        c2 = '5';
                        break;
                    }
                    case 1: {
                        c2 = '\u007f';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = '\u0014';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "s\u001eSxoQ_N{*F\u001a_p*z\u000f_zYf3\u001aDX{8";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Z\r]:kE\u001eY|o\u001b\u0017[fgZ\u0011C:r[\u001aN:zG\u0010L}nP\r\u0014~yF\u001a\u0014ZkA\u0016LqIG\u0006J`e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "`\u0011_lzP\u001cNqn\u0015\u0011OyhP\r\u001a{l\u0015\u001dC`oF_HqkQ_\\feX_v}d@\u0007\u001aDX{8\u00004";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "g>tPUF\u001a_p";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u001a\u001b_b%@\r[znZ\u0012";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "g>tPUY\u0010[pUS\u0016Vq";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "[\u001aM4YP\u001cOfog\u001eTpeXW\u00134hT\u001cQqn\u0015\u001dC4}G\u0010Ts*e\rUbcQ\u001aH.*";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "f7{%Zg1}";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "f\u001aYaxP-[znZ\u0012\u0014soA6Tg~T\u0011Yq\"\u0017,rU;e-tS(\u001c_Xui^\u001a^4hL_Mfe[\u0018\u001aDxZ\tSpoGE\u001a";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    s = "f\u001aYaxP-[znZ\u0012\u0014GBtNjFDr";
                    n = 9;
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    array = z2;
                    s = "f7{%Zg1}4dZ\u000b\u001au|T\u0016VuhY\u001a";
                    n = 10;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "s\u001eSxoQ_N{*R\u001aTqxT\u000b_4yP\u001a^";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "`+|92";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "`+|92\u0015\u001aTweQ\u0016Ts*[\u0010N4y@\u000fJ{xA\u001a^";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "f:h]Ky";
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
        b = b();
    }
    
    private static String a() {
        try {
            return (String)Build.class.getField(com.b.z[15]).get(null);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    private static byte[] b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: astore_0       
        //     8: getstatic       android/os/Build.FINGERPRINT:Ljava/lang/String;
        //    11: astore_1       
        //    12: aload_1        
        //    13: ifnull          22
        //    16: aload_0        
        //    17: aload_1        
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: pop            
        //    22: invokestatic    com/b.a:()Ljava/lang/String;
        //    25: astore_2       
        //    26: aload_2        
        //    27: ifnull          36
        //    30: aload_0        
        //    31: aload_2        
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    35: pop            
        //    36: aload_0        
        //    37: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    40: getstatic       com/b.z:[Ljava/lang/String;
        //    43: bipush          13
        //    45: aaload         
        //    46: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //    49: astore          4
        //    51: aload           4
        //    53: areturn        
        //    54: astore          7
        //    56: aload           7
        //    58: athrow         
        //    59: astore          5
        //    61: aload           5
        //    63: athrow         
        //    64: astore_3       
        //    65: new             Ljava/lang/RuntimeException;
        //    68: dup            
        //    69: getstatic       com/b.z:[Ljava/lang/String;
        //    72: bipush          14
        //    74: aaload         
        //    75: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    78: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  16     22     54     59     Ljava/io/UnsupportedEncodingException;
        //  30     36     59     64     Ljava/io/UnsupportedEncodingException;
        //  36     51     64     79     Ljava/io/UnsupportedEncodingException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 43, Size: 43
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
    
    private static byte[] c() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(com.b.b);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            throw new SecurityException(com.b.z[12], ex);
        }
    }
    
    static byte[] d() {
        return c();
    }
    
    public static void e() {
        f();
        g();
    }
    
    private static void f() {
        while (true) {
            try {
                if (Build$VERSION.SDK_INT < 16 || Build$VERSION.SDK_INT > 18) {
                    return;
                }
            }
            catch (Exception ex) {
                try {
                    throw ex;
                }
                catch (Exception ex2) {
                    throw ex2;
                }
            }
            try {
                Class.forName(com.b.z[2]).getMethod(com.b.z[4], byte[].class).invoke(null, c());
                final int intValue = (int)Class.forName(com.b.z[0]).getMethod(com.b.z[6], String.class, Long.TYPE).invoke(null, com.b.z[5], 1024);
                if (intValue == 1024) {
                    return;
                }
                try {
                    throw new IOException(com.b.z[3] + intValue);
                }
                catch (Exception ex3) {
                    throw ex3;
                }
            }
            catch (Exception ex4) {
                throw new SecurityException(com.b.z[1], ex4);
            }
        }
    }
    
    private static void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     3: istore_1       
        //     4: iload_1        
        //     5: bipush          18
        //     7: if_icmple       14
        //    10: return         
        //    11: astore_0       
        //    12: aload_0        
        //    13: athrow         
        //    14: getstatic       com/b.z:[Ljava/lang/String;
        //    17: bipush          10
        //    19: aaload         
        //    20: invokestatic    java/security/Security.getProviders:(Ljava/lang/String;)[Ljava/security/Provider;
        //    23: astore_2       
        //    24: aload_2        
        //    25: ifnull          56
        //    28: aload_2        
        //    29: arraylength    
        //    30: istore          12
        //    32: iload           12
        //    34: iconst_1       
        //    35: if_icmplt       56
        //    38: ldc             Lcom/a;.class
        //    40: aload_2        
        //    41: iconst_0       
        //    42: aaload         
        //    43: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    46: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    49: istore          13
        //    51: iload           13
        //    53: ifne            68
        //    56: new             Lcom/a;
        //    59: dup            
        //    60: invokespecial   com/a.<init>:()V
        //    63: iconst_1       
        //    64: invokestatic    java/security/Security.insertProviderAt:(Ljava/security/Provider;I)I
        //    67: pop            
        //    68: new             Ljava/security/SecureRandom;
        //    71: dup            
        //    72: invokespecial   java/security/SecureRandom.<init>:()V
        //    75: astore          5
        //    77: ldc             Lcom/a;.class
        //    79: aload           5
        //    81: invokevirtual   java/security/SecureRandom.getProvider:()Ljava/security/Provider;
        //    84: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    87: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    90: ifne            149
        //    93: new             Ljava/lang/SecurityException;
        //    96: dup            
        //    97: new             Ljava/lang/StringBuilder;
        //   100: dup            
        //   101: invokespecial   java/lang/StringBuilder.<init>:()V
        //   104: getstatic       com/b.z:[Ljava/lang/String;
        //   107: bipush          7
        //   109: aaload         
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: aload           5
        //   115: invokevirtual   java/security/SecureRandom.getProvider:()Ljava/security/Provider;
        //   118: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   127: invokespecial   java/lang/SecurityException.<init>:(Ljava/lang/String;)V
        //   130: athrow         
        //   131: astore          6
        //   133: aload           6
        //   135: athrow         
        //   136: astore          10
        //   138: aload           10
        //   140: athrow         
        //   141: astore          11
        //   143: aload           11
        //   145: athrow         
        //   146: astore_3       
        //   147: aload_3        
        //   148: athrow         
        //   149: getstatic       com/b.z:[Ljava/lang/String;
        //   152: bipush          8
        //   154: aaload         
        //   155: invokestatic    java/security/SecureRandom.getInstance:(Ljava/lang/String;)Ljava/security/SecureRandom;
        //   158: astore          8
        //   160: ldc             Lcom/a;.class
        //   162: aload           8
        //   164: invokevirtual   java/security/SecureRandom.getProvider:()Ljava/security/Provider;
        //   167: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   170: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   173: ifne            10
        //   176: new             Ljava/lang/SecurityException;
        //   179: dup            
        //   180: new             Ljava/lang/StringBuilder;
        //   183: dup            
        //   184: invokespecial   java/lang/StringBuilder.<init>:()V
        //   187: getstatic       com/b.z:[Ljava/lang/String;
        //   190: bipush          9
        //   192: aaload         
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: aload           8
        //   198: invokevirtual   java/security/SecureRandom.getProvider:()Ljava/security/Provider;
        //   201: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   204: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   207: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   210: invokespecial   java/lang/SecurityException.<init>:(Ljava/lang/String;)V
        //   213: athrow         
        //   214: astore          9
        //   216: aload           9
        //   218: athrow         
        //   219: astore          7
        //   221: new             Ljava/lang/SecurityException;
        //   224: dup            
        //   225: getstatic       com/b.z:[Ljava/lang/String;
        //   228: bipush          11
        //   230: aaload         
        //   231: aload           7
        //   233: invokespecial   java/lang/SecurityException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   236: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  0      4      11     14     Ljava/security/NoSuchAlgorithmException;
        //  28     32     136    141    Ljava/security/NoSuchAlgorithmException;
        //  38     51     141    146    Ljava/security/NoSuchAlgorithmException;
        //  56     68     146    149    Ljava/security/NoSuchAlgorithmException;
        //  77     131    131    136    Ljava/security/NoSuchAlgorithmException;
        //  138    141    141    146    Ljava/security/NoSuchAlgorithmException;
        //  143    146    146    149    Ljava/security/NoSuchAlgorithmException;
        //  149    160    219    237    Ljava/security/NoSuchAlgorithmException;
        //  160    214    214    219    Ljava/security/NoSuchAlgorithmException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 114, Size: 114
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
