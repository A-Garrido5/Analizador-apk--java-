// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

public class ba extends q
{
    private static l[][] c;
    String a;
    private byte[] b;
    
    static {
        ba.c = new l[255][];
    }
    
    public ba(final String a) {
        if (!b(a)) {
            throw new IllegalArgumentException("string " + a + " not an OID");
        }
        this.a = a;
    }
    
    ba(final byte[] array) {
        final StringBuffer sb = new StringBuffer();
        int n = 1;
        BigInteger bigInteger = null;
        long n2 = 0L;
        int i = 0;
    Label_0149_Outer:
        while (i != array.length) {
            final int n3 = 0xFF & array[i];
            while (true) {
                Label_0271: {
                    BigInteger bigInteger2;
                    int n5;
                    if (n2 < 36028797018963968L) {
                        n2 = n2 * 128L + (n3 & 0x7F);
                        if ((n3 & 0x80) != 0x0) {
                            break Label_0271;
                        }
                        if (n != 0) {
                            switch ((int)n2 / 40) {
                                default: {
                                    sb.append('2');
                                    n2 -= 80L;
                                    break;
                                }
                                case 0: {
                                    sb.append('0');
                                    break;
                                }
                                case 1: {
                                    sb.append('1');
                                    n2 -= 40L;
                                    break;
                                }
                            }
                            n = 0;
                        }
                        sb.append('.');
                        sb.append(n2);
                        n2 = 0L;
                        final int n4 = n;
                        bigInteger2 = bigInteger;
                        n5 = n4;
                    }
                    else {
                        if (bigInteger == null) {
                            bigInteger = BigInteger.valueOf(n2);
                        }
                        bigInteger = bigInteger.shiftLeft(7).or(BigInteger.valueOf(n3 & 0x7F));
                        if ((n3 & 0x80) != 0x0) {
                            break Label_0271;
                        }
                        sb.append('.');
                        sb.append(bigInteger);
                        n2 = 0L;
                        n5 = n;
                        bigInteger2 = null;
                    }
                    ++i;
                    final int n6 = n5;
                    bigInteger = bigInteger2;
                    n = n6;
                    continue Label_0149_Outer;
                }
                final int n7 = n;
                BigInteger bigInteger2 = bigInteger;
                int n5 = n7;
                continue;
            }
        }
        this.a = sb.toString();
    }
    
    public static l a(final Object o) {
        if (o == null || o instanceof l) {
            return (l)o;
        }
        if (o instanceof ba) {
            return new l(((ba)o).c());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + o.getClass().getName());
    }
    
    private void a(final ByteArrayOutputStream byteArrayOutputStream) {
        final bz bz = new bz(this.a);
        this.a(byteArrayOutputStream, 40 * Integer.parseInt(bz.b()) + Integer.parseInt(bz.b()));
        while (bz.a()) {
            final String b = bz.b();
            if (b.length() < 18) {
                this.a(byteArrayOutputStream, Long.parseLong(b));
            }
            else {
                this.a(byteArrayOutputStream, new BigInteger(b));
            }
        }
    }
    
    private void a(final ByteArrayOutputStream byteArrayOutputStream, long n) {
        final byte[] array = new byte[9];
        int n2 = 8;
        array[n2] = (byte)(0x7F & (int)n);
        while (n >= 128L) {
            n >>= 7;
            --n2;
            array[n2] = (byte)(0x80 | (0x7F & (int)n));
        }
        byteArrayOutputStream.write(array, n2, 9 - n2);
    }
    
    private void a(final ByteArrayOutputStream byteArrayOutputStream, BigInteger shiftRight) {
        final int n = (6 + shiftRight.bitLength()) / 7;
        if (n == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        final byte[] array = new byte[n];
        for (int i = n - 1; i >= 0; --i) {
            array[i] = (byte)(0x80 | (0x7F & shiftRight.intValue()));
            shiftRight = shiftRight.shiftRight(7);
        }
        final int n2 = n - 1;
        array[n2] &= 0x7F;
        byteArrayOutputStream.write(array, 0, array.length);
    }
    
    static l b(final byte[] array) {
        if (array.length < 3) {
            return new l(array);
        }
        final int n = 0xFF & array[-2 + array.length];
        l[] array2 = ba.c[n];
        if (array2 == null) {
            final l[][] c = ba.c;
            array2 = new l[255];
            c[n] = array2;
        }
        final int n2 = 0xFF & array[-1 + array.length];
        final l l = array2[n2];
        if (l == null) {
            return array2[n2] = new l(array);
        }
        if (aag.a(array, l.d())) {
            return l;
        }
        final int n3 = (n + 1) % 256;
        l[] array3 = ba.c[n3];
        if (array3 == null) {
            final l[][] c2 = ba.c;
            array3 = new l[255];
            c2[n3] = array3;
        }
        final l i = array3[n2];
        if (i == null) {
            return array3[n2] = new l(array);
        }
        if (aag.a(array, i.d())) {
            return i;
        }
        final int n4 = (n2 + 1) % 256;
        final l j = array3[n4];
        if (j == null) {
            return array3[n4] = new l(array);
        }
        if (aag.a(array, j.d())) {
            return j;
        }
        return new l(array);
    }
    
    private static boolean b(final String s) {
        if (s.length() >= 3 && s.charAt(1) == '.') {
            final char char1 = s.charAt(0);
            if (char1 >= '0' && char1 <= '2') {
                int i = -1 + s.length();
                boolean b = false;
                while (i >= 2) {
                    final char char2 = s.charAt(i);
                    if ('0' <= char2 && char2 <= '9') {
                        b = true;
                    }
                    else {
                        if (char2 != '.' || !b) {
                            return false;
                        }
                        b = false;
                    }
                    --i;
                }
                return b;
            }
        }
        return false;
    }
    
    @Override
    void a(final o o) {
        final byte[] d = this.d();
        o.b(6);
        o.a(d.length);
        o.a(d);
    }
    
    @Override
    boolean a(final q q) {
        return q instanceof ba && this.a.equals(((ba)q).a);
    }
    
    public String c() {
        return this.a;
    }
    
    protected byte[] d() {
        if (this.b == null) {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.a(byteArrayOutputStream);
            this.b = byteArrayOutputStream.toByteArray();
        }
        return this.b;
    }
    
    @Override
    boolean h() {
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    int i() {
        final int length = this.d().length;
        return length + (1 + ca.a(length));
    }
    
    @Override
    public String toString() {
        return this.a;
    }
}
