// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class Y
{
    private static final String[] z;
    private final at a;
    
    static {
        final String[] z2 = new String[9];
        String s = "Al_j";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'J';
                        break;
                    }
                    case 0: {
                        c2 = '#';
                        break;
                    }
                    case 1: {
                        c2 = '\t';
                        break;
                    }
                    case 2: {
                        c2 = ',';
                        break;
                    }
                    case 3: {
                        c2 = '\u001e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "MhXw<F";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "I;A{";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "IhZ\u007f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "ihZ\u007f\tV{Z{x\u0016<\u001d'\u001aQfZw.F{";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "ly\\q8W|Bw9W`O]?Q\u007fI,\u007f\u00168\u0015N8L\u007fEz/Q";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "mhXw<FJYl<F;\u0019+{\u001aY^q<JmIl";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "L{K0=K`_n/QzUm>Fd_0)V{Z{x\u0016<\u001d'd";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "i;A{\tV{Z{x\u0016<\u001d'\u001aQfZw.F{";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private Y(final at a) {
        this.a = a;
    }
    
    public static Y a(final String s) {
        return a(s, null);
    }
    
    public static Y a(final String s, final e e) {
        try {
            if (Y.z[1].equals(s)) {
                return new Y(a(e));
            }
        }
        catch (ai ai) {
            throw ai;
        }
        try {
            if (Y.z[3].equals(s)) {
                return new Y(d(e));
            }
        }
        catch (ai ai2) {
            throw ai2;
        }
        try {
            if (Y.z[2].equals(s)) {
                return new Y(c(e));
            }
        }
        catch (ai ai3) {
            throw ai3;
        }
        try {
            if (Y.z[0].equals(s)) {
                return new Y(b(e));
            }
        }
        catch (ai ai4) {
            throw ai4;
        }
        throw new ai(s);
    }
    
    private static at a(final e e) {
        return b(Y.z[6], e);
    }
    
    private static at b(final String s, final e e) {
        try {
            final at at = (at)Class.forName(Y.z[7] + s).newInstance();
            if (e == null) {
                return at;
            }
            try {
                at.a(e);
                return at;
            }
            catch (InstantiationException ex) {
                throw ex;
            }
        }
        catch (InstantiationException ex2) {
            throw new ai(ex2);
        }
        catch (IllegalAccessException ex3) {
            throw new ai(ex3);
        }
        catch (ClassNotFoundException ex4) {
            throw new ai(ex4);
        }
    }
    
    private static at b(final e e) {
        return b(Y.z[5], e);
    }
    
    private static at c(final e e) {
        return b(Y.z[8], e);
    }
    
    private static at d(final e e) {
        return b(Y.z[4], e);
    }
    
    public Z a() {
        final byte[] a = this.a.a();
        return new Z(this.a.generatePublicKey(a), a);
    }
    
    public boolean a(final byte[] array, final byte[] array2, final byte[] array3) {
        return this.a.verifySignature(array, array2, array3);
    }
    
    public byte[] a(final byte[] array, final byte[] array2) {
        return this.a.calculateAgreement(array2, array);
    }
    
    public byte[] b(final byte[] array, final byte[] array2) {
        return this.a.calculateSignature(this.a.a(64), array, array2);
    }
}
