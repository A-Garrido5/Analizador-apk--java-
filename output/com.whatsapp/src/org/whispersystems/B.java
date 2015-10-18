// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;

public abstract class B
{
    public static int a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "^\u001aG\tG^6\u0014_\"";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0014';
                        break;
                    }
                    case 0: {
                        c2 = '\u0016';
                        break;
                    }
                    case 1: {
                        c2 = 'w';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "^\u001aG\tG^6\u0014_\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "C\u0019M\u0004{a\u0019\u0006\u001cqd\u0004O\u0005z,W";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "^\u001aG\tG^6\u0014_\"";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "^\u001aG\tG^6\u0014_\"";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static B a(final int n) {
        switch (n) {
            default: {
                throw new AssertionError((Object)(B.z[2] + n));
            }
            case 2: {
                return new C();
            }
            case 3: {
                return new D();
            }
        }
    }
    
    private byte[] a(final byte[] array, final byte[] array2) {
        try {
            final Mac instance = Mac.getInstance(B.z[3]);
            instance.init(new SecretKeySpec(array, B.z[4]));
            return instance.doFinal(array2);
        }
        catch (NoSuchAlgorithmException ex) {}
        catch (InvalidKeyException ex2) {
            goto Label_0040;
        }
    }
    
    private byte[] b(final byte[] array, final byte[] array2, int n) {
        final int a = B.a;
        final double n2 = n / 32.0;
        try {
            final int n3 = (int)Math.ceil(n2);
            byte[] doFinal = new byte[0];
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int a2 = this.a();
            while (true) {
                Label_0149: {
                    if (a2 >= n3 + this.a()) {
                        break Label_0149;
                    }
                    final Mac instance = Mac.getInstance(B.z[0]);
                    try {
                        instance.init(new SecretKeySpec(array, B.z[1]));
                        instance.update(doFinal);
                        if (array2 != null) {
                            instance.update(array2);
                        }
                        instance.update((byte)a2);
                        doFinal = instance.doFinal();
                        final int min = Math.min(n, doFinal.length);
                        byteArrayOutputStream.write(doFinal, 0, min);
                        n -= min;
                        ++a2;
                        if (a != 0) {
                            return byteArrayOutputStream.toByteArray();
                        }
                        continue;
                    }
                    catch (NoSuchAlgorithmException ex) {
                        try {
                            throw ex;
                        }
                        catch (NoSuchAlgorithmException ex2) {}
                        catch (InvalidKeyException ex3) {}
                    }
                }
            }
        }
        catch (NoSuchAlgorithmException ex4) {}
        catch (InvalidKeyException ex5) {}
    }
    
    protected abstract int a();
    
    public byte[] a(final byte[] array, final byte[] array2, final int n) {
        return this.a(array, new byte[32], array2, n);
    }
    
    public byte[] a(final byte[] array, final byte[] array2, final byte[] array3, final int n) {
        return this.b(this.a(array2, array), array3, n);
    }
}
