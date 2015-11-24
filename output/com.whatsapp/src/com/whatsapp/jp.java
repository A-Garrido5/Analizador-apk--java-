// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.backport.util.Base64;
import java.util.Arrays;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.Cipher;
import com.whatsapp.util.Log;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import com.whatsapp.protocol.bg;

public class jp implements bg
{
    private static final String[] z;
    SecureRandom a;
    
    static {
        final String[] z2 = new String[14];
        String s = "]0u\u0015\u001eO0,\u0000\u0004\f#0\u0003PJ#<\u001c";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0382:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = ',';
                        break;
                    }
                    case 1: {
                        c2 = 'B';
                        break;
                    }
                    case 2: {
                        c2 = 'U';
                        break;
                    }
                    case 3: {
                        c2 = 'p';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "]0u\u0015\u001eO0,\u0000\u0004\f/4\u0013PJ#<\u001c";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "]0u\u0015\u001eO0,\u0000\u0004\f$4\u0019\u001c\f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "]0u\u0014\u0015O0,\u0000\u0004\f*8\u0011\u0013\f/<\u0003\u001dM66\u0018P\t1uU\u0003";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "m\u0007\u0006_3n\u0001z ;o\u0011b \u0011H&<\u001e\u0017";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "]0u\u0014\u0015O0,\u0000\u0004\f$4\u0019\u001c\f";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "]0u\u0014\u0015O0,\u0000\u0004\f/4\u0013PJ#<\u001c";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "m\u0007\u0006";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "d/4\u0013#d\u0003gEF";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "]0u\u0018\u001dM!u\u0016\u0011E.u";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "d/4\u0013#d\u0003gEF";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "m\u0007\u0006_3n\u0001z ;o\u0011b \u0011H&<\u001e\u0017";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "m\u0007\u0006";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "]0u\u0011\u0015_b3\u0011\u0019@b";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    break Label_0382;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public jp() {
        this.a = new SecureRandom();
    }
    
    public static byte[] a(final byte[] array, final byte[] array2) {
        if (array == null) {
            return null;
        }
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(array, jp.z[10]);
            final Mac instance = Mac.getInstance(jp.z[8]);
            instance.init(secretKeySpec);
            return instance.doFinal(array2);
        }
        catch (Exception ex) {
            Log.e(jp.z[9] + ex);
            return null;
        }
    }
    
    public static byte[] a(final byte[] array, final byte[] array2, final byte[] array3) {
        if (array == null || array2 == null || array3 == null) {
            return null;
        }
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec(array, jp.z[12]);
            final Cipher instance = Cipher.getInstance(jp.z[11]);
            instance.init(1, secretKeySpec, new IvParameterSpec(array2));
            return instance.doFinal(array3);
        }
        catch (Exception ex) {
            Log.e(jp.z[13] + ex);
            return null;
        }
    }
    
    public static byte[] b(final byte[] array, final byte[] array2) {
        final byte[] array3 = new byte[array.length + array2.length];
        System.arraycopy(array, 0, array3, 0, array.length);
        System.arraycopy(array2, 0, array3, array.length, array2.length);
        return array3;
    }
    
    @Override
    public byte[] a(final byte[] array) {
        final byte[] n = l7.n;
        final byte[] x = l7.x;
        if (n == null || x == null || array == null) {
            return null;
        }
        byte[] array2;
        byte[] array3;
        byte[] a;
        try {
            array2 = new byte[32];
            array3 = new byte[-32 + array.length];
            System.arraycopy(array, 0, array2, 0, array2.length);
            System.arraycopy(array, array2.length, array3, 0, array3.length);
            a = a(x, array3);
            if (a == null) {
                Log.e(jp.z[6]);
                return null;
            }
        }
        catch (Exception ex) {
            Log.e(jp.z[5] + ex);
            return null;
        }
        if (!Arrays.equals(array2, a)) {
            Log.b(jp.z[3], null, new Object[] { Base64.encodeToString(array2, 2), Base64.encodeToString(a, 2) });
            return null;
        }
        final byte[] array4 = new byte[16];
        final byte[] array5 = new byte[-16 + array3.length];
        System.arraycopy(array3, 0, array4, 0, array4.length);
        System.arraycopy(array3, array4.length, array5, 0, array5.length);
        final SecretKeySpec secretKeySpec = new SecretKeySpec(n, jp.z[7]);
        final Cipher instance = Cipher.getInstance(jp.z[4]);
        instance.init(2, secretKeySpec, new IvParameterSpec(array4));
        return instance.doFinal(array5);
    }
    
    @Override
    public byte[] b(final byte[] array) {
        final byte[] n = l7.n;
        final byte[] x = l7.x;
        if (n == null || x == null || array == null) {
            return null;
        }
        byte[] array2;
        byte[] a;
        try {
            array2 = new byte[16];
            this.a.nextBytes(array2);
            a = a(n, array2, array);
            if (a == null) {
                Log.e(jp.z[0]);
                return null;
            }
        }
        catch (Exception ex) {
            Log.e(jp.z[2] + ex);
            return null;
        }
        final byte[] b = b(array2, a);
        final byte[] a2 = a(x, b);
        if (a2 == null) {
            Log.e(jp.z[1]);
            return null;
        }
        return b(a2, b);
    }
}
