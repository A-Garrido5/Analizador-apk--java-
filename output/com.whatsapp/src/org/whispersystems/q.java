// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.text.ParseException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class q
{
    private static final String[] z;
    private final SecretKeySpec a;
    private final IvParameterSpec b;
    private final SecretKeySpec c;
    
    static {
        final String[] z2 = new String[2];
        String s = "}dn";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'D';
                        break;
                    }
                    case 0: {
                        c2 = '<';
                        break;
                    }
                    case 1: {
                        c2 = '!';
                        break;
                    }
                    case 2: {
                        c2 = '=';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "tL\\s\u0017t`\u000f%r";
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
    }
    
    public q(final byte[] array) {
        final int a = B.a;
        try {
            final byte[][] a2 = m.a(array, 32, 32, 16);
            this.c = new SecretKeySpec(a2[0], q.z[0]);
            this.a = new SecretKeySpec(a2[1], q.z[1]);
            this.b = new IvParameterSpec(a2[2]);
            if (a != 0) {
                ++bO.s;
            }
        }
        catch (ParseException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public SecretKeySpec a() {
        return this.c;
    }
    
    public IvParameterSpec b() {
        return this.b;
    }
    
    public SecretKeySpec c() {
        return this.a;
    }
}
