// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;

public class J
{
    private static final byte[] c;
    private static final byte[] d;
    public static int f;
    private static final String[] z;
    private final byte[] a;
    private final int b;
    private final B e;
    
    static {
        final String[] z2 = new String[3];
        String s = "CR}\u0003\u001dqHY\u0015\u001eg[s\u0015&qCg";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = 'm';
                        break;
                    }
                    case 0: {
                        c3 = '\u0014';
                        break;
                    }
                    case 1: {
                        c3 = ':';
                        break;
                    }
                    case 2: {
                        c3 = '\u0014';
                        break;
                    }
                    case 3: {
                        c3 = 'p';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\\Wu\u0013>\\{&E[";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\\Wu\u0013>\\{&E[";
                    n2 = 2;
                    array = z2;
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
        c = new byte[] { 1 };
        d = new byte[] { 2 };
    }
    
    public J(final B e, final byte[] a, final int b) {
        this.e = e;
        this.a = a;
        this.b = b;
    }
    
    private byte[] a(final byte[] array) {
        try {
            final Mac instance = Mac.getInstance(J.z[1]);
            instance.init(new SecretKeySpec(this.a, J.z[2]));
            return instance.doFinal(array);
        }
        catch (NoSuchAlgorithmException ex) {}
        catch (InvalidKeyException ex2) {
            goto Label_0040;
        }
    }
    
    public J a() {
        return new J(this.e, this.a(J.d), 1 + this.b);
    }
    
    public byte[] b() {
        return this.a;
    }
    
    public int c() {
        return this.b;
    }
    
    public O d() {
        final q q = new q(this.e.a(this.a(J.c), J.z[0].getBytes(), 80));
        return new O(q.a(), q.c(), q.b(), this.b);
    }
}
