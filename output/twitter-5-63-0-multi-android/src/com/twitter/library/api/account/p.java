// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import android.text.TextUtils;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import android.util.Log;
import java.security.KeyPairGenerator;
import com.twitter.library.client.k;
import java.security.SecureRandom;
import android.content.Context;
import java.security.Provider;
import java.security.Security;
import org.spongycastle.jce.provider.BouncyCastleProvider;

public class p
{
    static {
        Security.addProvider(new BouncyCastleProvider());
    }
    
    public static q a(final Context context, final String s, final String s2, final String s3) {
        final byte[] a = a(context, s, s3);
        if (a != null) {
            return new q(s2, e(a));
        }
        return null;
    }
    
    public static r a(final Context context, final String s) {
        final byte[] array = new byte[8];
        new SecureRandom().nextBytes(array);
        final String e = e(array);
        final k k = new k(context, s, "login_verification");
        try {
            final KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "SC");
            instance.initialize(2048);
            final KeyPair genKeyPair = instance.genKeyPair();
            final String e2 = e(genKeyPair.getPublic().getEncoded());
            k.a().a("login_verification", true).a("lv_private_key", e(genKeyPair.getPrivate().getEncoded())).a("lv_public_key", e2).a("lv_secret", e).a("lv_times_to_hash", 1000).apply();
            final r r = new r(1000, e2, c(context, s));
            d(context, s);
            return r;
        }
        catch (NoSuchProviderException ex) {
            Log.w("LoginVerification", "No such provider for KeyPairGenerator (SC): " + ex.getMessage());
            return null;
        }
        catch (NoSuchAlgorithmException ex2) {
            Log.w("LoginVerification", "No such algorithm for KeyPairGenerator (RSA): " + ex2.getMessage());
            return null;
        }
    }
    
    public static String a(final String s, final int n) {
        return d(a(zc.a(s), n));
    }
    
    public static byte[] a(final Context context, final String s, final String s2) {
        final k k = new k(context, s, "login_verification");
        final String string = k.getString("lv_private_key", "");
        final String string2 = k.getString("lv_public_key", "");
        if (!TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)string2) && !TextUtils.isEmpty((CharSequence)s2)) {
            return a(string, string2, s2);
        }
        return null;
    }
    
    public static byte[] a(final String p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokestatic    zc.a:(Ljava/lang/String;)[B
        //     4: astore_3       
        //     5: aload_1        
        //     6: invokestatic    zc.a:(Ljava/lang/String;)[B
        //     9: astore          4
        //    11: aload_2        
        //    12: invokestatic    zc.a:(Ljava/lang/String;)[B
        //    15: astore          5
        //    17: new             Ljava/security/spec/X509EncodedKeySpec;
        //    20: dup            
        //    21: aload           4
        //    23: invokespecial   java/security/spec/X509EncodedKeySpec.<init>:([B)V
        //    26: astore          6
        //    28: new             Ljava/security/spec/PKCS8EncodedKeySpec;
        //    31: dup            
        //    32: aload_3        
        //    33: invokespecial   java/security/spec/PKCS8EncodedKeySpec.<init>:([B)V
        //    36: astore          7
        //    38: ldc             "RSA"
        //    40: ldc             "SC"
        //    42: invokestatic    java/security/KeyFactory.getInstance:(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;
        //    45: astore          12
        //    47: aload           12
        //    49: aload           7
        //    51: invokevirtual   java/security/KeyFactory.generatePrivate:(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
        //    54: astore          14
        //    56: aload           12
        //    58: aload           6
        //    60: invokevirtual   java/security/KeyFactory.generatePublic:(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
        //    63: pop            
        //    64: ldc             "SHA1WithRSA"
        //    66: ldc             "SC"
        //    68: invokestatic    java/security/Signature.getInstance:(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;
        //    71: astore          20
        //    73: aload           20
        //    75: aload           14
        //    77: invokevirtual   java/security/Signature.initSign:(Ljava/security/PrivateKey;)V
        //    80: aload           20
        //    82: aload           5
        //    84: invokevirtual   java/security/Signature.update:([B)V
        //    87: aload           20
        //    89: invokevirtual   java/security/Signature.sign:()[B
        //    92: astore          25
        //    94: aload           25
        //    96: areturn        
        //    97: astore          10
        //    99: ldc             "LoginVerification"
        //   101: new             Ljava/lang/StringBuilder;
        //   104: dup            
        //   105: invokespecial   java/lang/StringBuilder.<init>:()V
        //   108: ldc             "No such provider for KeyFactory (SC): "
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: aload           10
        //   115: invokevirtual   java/security/NoSuchProviderException.getMessage:()Ljava/lang/String;
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   121: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   124: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   127: pop            
        //   128: aconst_null    
        //   129: areturn        
        //   130: astore          8
        //   132: ldc             "LoginVerification"
        //   134: new             Ljava/lang/StringBuilder;
        //   137: dup            
        //   138: invokespecial   java/lang/StringBuilder.<init>:()V
        //   141: ldc             "No such algorithm for KeyFactory (RSA): "
        //   143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   146: aload           8
        //   148: invokevirtual   java/security/NoSuchAlgorithmException.getMessage:()Ljava/lang/String;
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   157: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   160: pop            
        //   161: aconst_null    
        //   162: areturn        
        //   163: astore          18
        //   165: ldc             "LoginVerification"
        //   167: new             Ljava/lang/StringBuilder;
        //   170: dup            
        //   171: invokespecial   java/lang/StringBuilder.<init>:()V
        //   174: ldc             "No such provider for Signature (SC): "
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: aload           18
        //   181: invokevirtual   java/security/NoSuchProviderException.getMessage:()Ljava/lang/String;
        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   187: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   190: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   193: pop            
        //   194: aconst_null    
        //   195: areturn        
        //   196: astore          16
        //   198: ldc             "LoginVerification"
        //   200: new             Ljava/lang/StringBuilder;
        //   203: dup            
        //   204: invokespecial   java/lang/StringBuilder.<init>:()V
        //   207: ldc             "No such algorithm for Signature (SHA1WithRSA): "
        //   209: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   212: aload           16
        //   214: invokevirtual   java/security/NoSuchAlgorithmException.getMessage:()Ljava/lang/String;
        //   217: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   220: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   223: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   226: pop            
        //   227: aconst_null    
        //   228: areturn        
        //   229: astore          21
        //   231: ldc             "LoginVerification"
        //   233: new             Ljava/lang/StringBuilder;
        //   236: dup            
        //   237: invokespecial   java/lang/StringBuilder.<init>:()V
        //   240: ldc             "Invalid key exception while initializing signature: "
        //   242: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   245: aload           21
        //   247: invokevirtual   java/security/InvalidKeyException.getMessage:()Ljava/lang/String;
        //   250: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   253: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   256: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   259: pop            
        //   260: aconst_null    
        //   261: areturn        
        //   262: astore          23
        //   264: ldc             "LoginVerification"
        //   266: new             Ljava/lang/StringBuilder;
        //   269: dup            
        //   270: invokespecial   java/lang/StringBuilder.<init>:()V
        //   273: ldc             "Security exception while singing challenge: "
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   278: aload           23
        //   280: invokevirtual   java/security/SignatureException.getMessage:()Ljava/lang/String;
        //   283: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   286: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   289: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   292: pop            
        //   293: aconst_null    
        //   294: areturn        
        //   295: astore          13
        //   297: aconst_null    
        //   298: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  38     47     97     130    Ljava/security/NoSuchProviderException;
        //  38     47     130    163    Ljava/security/NoSuchAlgorithmException;
        //  47     64     295    299    Ljava/security/spec/InvalidKeySpecException;
        //  64     73     163    196    Ljava/security/NoSuchProviderException;
        //  64     73     196    229    Ljava/security/NoSuchAlgorithmException;
        //  73     80     229    262    Ljava/security/InvalidKeyException;
        //  80     94     262    295    Ljava/security/SignatureException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 139, Size: 139
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    private static byte[] a(final byte[] array) {
        final byte[] array2 = { 0, 0, 0, 0, 0, 0, 0, (byte)(0xF0 & array[7]) };
        System.arraycopy(array, 0, array2, 0, 7);
        return array2;
    }
    
    private static byte[] a(byte[] b, final int n) {
        for (int i = 0; i < n; ++i) {
            b = b(b);
        }
        return b;
    }
    
    public static boolean b(final Context context, final String s) {
        new k(context, s, "login_verification").a().a("login_verification", false).a("lv_private_key").a("lv_public_key").a("lv_secret").a("lv_times_to_hash").apply();
        return true;
    }
    
    private static byte[] b(final byte[] array) {
        return a(c(array));
    }
    
    public static String c(final Context context, final String s) {
        final k k = new k(context, s, "login_verification");
        final String string = k.getString("lv_secret", "");
        final int int1 = k.getInt("lv_times_to_hash", 0);
        if (int1 <= 0 || TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        return a(string, int1);
    }
    
    private static byte[] c(final byte[] array) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(array);
        }
        catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }
    
    private static String d(final byte[] array) {
        return f(array).substring(0, 12).toLowerCase();
    }
    
    public static void d(final Context context, final String s) {
        final k k = new k(context, s, "login_verification");
        k.a().a("lv_times_to_hash", k.getInt("lv_times_to_hash", 0) - 1).apply();
    }
    
    public static String e(final Context context, final String s) {
        return new k(context, s, "login_verification").getString("lv_public_key", "");
    }
    
    private static String e(final byte[] array) {
        try {
            return new String(zc.a(array), "UTF8");
        }
        catch (UnsupportedEncodingException ex) {
            return "";
        }
    }
    
    private static String f(final byte[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i += 5) {
            int n;
            if (i + 5 < array.length) {
                n = 5;
            }
            else {
                n = array.length - i;
            }
            final int n2 = (int)Math.ceil(8.0 * n / 5.0);
            int n3;
            if (n2 < 8) {
                n3 = 5 - n * 8 % 5;
            }
            else {
                n3 = 0;
            }
            long n4 = 0L;
            for (int n5 = 0; n5 + i < array.length && n5 < 5; ++n5) {
                final long n6 = (n4 << 8) + array[i + n5];
                int n7;
                if (array[i + n5] >= 0) {
                    n7 = 0;
                }
                else {
                    n7 = 256;
                }
                n4 = n6 + n7;
            }
            final long n8 = n4 << n3;
            for (int j = 0; j < n2; ++j) {
                sb.append("abcdefghijkmnpqrstuvwxyz23456789".charAt(0x1F & (int)(n8 >> 5 * (-1 + (n2 - j)))));
            }
            for (int k = 0; k < 8 - n2; ++k) {
                sb.append("=");
            }
        }
        return sb.toString();
    }
    
    public static boolean f(final Context context, final String s) {
        return new k(context, s, "login_verification").getBoolean("login_verification", false);
    }
    
    public static boolean g(final Context context, final String s) {
        final k k = new k(context, s, "login_verification");
        final String string = k.getString("lv_private_key", "");
        final String string2 = k.getString("lv_public_key", "");
        return !TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)string2);
    }
}
