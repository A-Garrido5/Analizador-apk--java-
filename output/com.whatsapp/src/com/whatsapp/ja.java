// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.security.SignatureException;
import java.security.InvalidKeyException;
import java.security.Signature;
import android.text.TextUtils;
import java.security.spec.InvalidKeySpecException;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import android.backport.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;

public class ja
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[11];
        String s = "\"w\u0002_\u001d.yA@\u0011#k\u001cZ\u000091\u0018V\u0006)x\u0017\u001c\u00118}\u000bC\u0000)q\u0000";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 't';
                        break;
                    }
                    case 0: {
                        c2 = '@';
                        break;
                    }
                    case 1: {
                        c2 = '\u001e';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
                        break;
                    }
                    case 3: {
                        c2 = '3';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\"w\u0002_\u001d.yA@\u0011#k\u001cZ\u000091\u0018V\u0006)x\u0017\u001c\u00118}\u000bC\u0000)q\u0000";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\"w\u0002_\u001d.yA@\u0011#k\u001cZ\u000091\u0018V\u0006)x\u0017\u001c\u00118}\u000bC\u0000)q\u0000";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\"w\u0002_\u001d.yA@\u0011#k\u001cZ\u000091\u0018V\u0006)x\u0017\u001c\u0012!w\u0002";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0013V/\u0002\u0003)j\u0006a'\u0001";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\"w\u0002_\u001d.yA@\u0011#k\u001cZ\u000091\tV\u001a%l\u000fG\u0011mn\u001bQ\u0018)}CX\u001191\u0007]\u0002!r\u0007WY+{\u0017\u001e\u00070{\rZ\u0012)}\u000fG\u001d/p";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0012M/";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\"w\u0002_\u001d.yAE\u00112w\bJY0k\u001cP\u001c!m\u000b\u001c\u0002%l\u0007U\u001d%zN";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\"w\u0002_\u001d.yAE\u00112w\bJY0k\u001cP\u001c!m\u000b\u001c\u0007)y\u0000R\u00005l\u000b\u0013\u0011-n\u001aJ";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\"w\u0002_\u001d.yAE\u00112w\bJY0k\u001cP\u001c!m\u000b\u001c\u0010!j\u000f\u0013\u0011-n\u001aJ";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\"w\u0002_\u001d.yAE\u00112w\bJY0k\u001cP\u001c!m\u000b\u001c\u001f%gNV\u00190j\u0017";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private static PublicKey a(final String s) {
        try {
            return KeyFactory.getInstance(ja.z[6]).generatePublic(new X509EncodedKeySpec(Base64.decode(s.getBytes(), 0)));
        }
        catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
        catch (InvalidKeySpecException ex2) {
            Log.e(ja.z[5]);
            throw new IllegalArgumentException(ex2);
        }
    }
    
    public static boolean a(final String s, final String s2, final String s3) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                Log.e(ja.z[10]);
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            if (TextUtils.isEmpty((CharSequence)s2)) {
                Log.e(ja.z[9]);
                return false;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        try {
            if (TextUtils.isEmpty((CharSequence)s3)) {
                Log.e(ja.z[8]);
                return false;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        final boolean a = a(a(s), s2, s3);
        Log.i(ja.z[7] + a);
        return a;
    }
    
    private static boolean a(final PublicKey publicKey, final String s, final String s2) {
        try {
            final Signature instance = Signature.getInstance(ja.z[4]);
            instance.initVerify(publicKey);
            instance.update(s.getBytes());
            if (!instance.verify(Base64.decode(s2, 0))) {
                Log.e(ja.z[3]);
                return false;
            }
            return true;
        }
        catch (NoSuchAlgorithmException ex) {
            Log.b(ja.z[1], ex);
            return false;
        }
        catch (InvalidKeyException ex2) {
            Log.b(ja.z[2], ex2);
            return false;
        }
        catch (SignatureException ex3) {
            Log.b(ja.z[0], ex3);
            return false;
        }
    }
}
