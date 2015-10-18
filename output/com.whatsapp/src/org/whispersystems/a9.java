// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;

public class a9
{
    private static final byte[] b;
    private static final byte[] c;
    private static final String[] z;
    private final byte[] a;
    private final int d;
    
    static {
        final String[] z2 = new String[2];
        String s = ":;%G):\u0017v\u0011L";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = 'z';
                        break;
                    }
                    case 0: {
                        c3 = 'r';
                        break;
                    }
                    case 1: {
                        c3 = 'V';
                        break;
                    }
                    case 2: {
                        c3 = 'D';
                        break;
                    }
                    case 3: {
                        c3 = '$';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ":;%G):\u0017v\u0011L";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        b = new byte[] { 1 };
        c = new byte[] { 2 };
    }
    
    public a9(final int d, final byte[] a) {
        this.d = d;
        this.a = a;
    }
    
    private byte[] a(final byte[] array, final byte[] array2) {
        try {
            final Mac instance = Mac.getInstance(a9.z[1]);
            instance.init(new SecretKeySpec(array2, a9.z[0]));
            return instance.doFinal(array);
        }
        catch (NoSuchAlgorithmException ex) {}
        catch (InvalidKeyException ex2) {
            goto Label_0040;
        }
    }
    
    public int a() {
        return this.d;
    }
    
    public ar b() {
        return new ar(this.d, this.a(a9.b, this.a));
    }
    
    public byte[] c() {
        return this.a;
    }
    
    public a9 d() {
        final int d = ar.d;
        final a9 a9 = new a9(1 + this.d, this.a(org.whispersystems.a9.c, this.a));
        if (bO.s != 0) {
            ar.d = d + 1;
        }
        return a9;
    }
}
