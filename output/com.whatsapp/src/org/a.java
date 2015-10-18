// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.net.DatagramPacket;

public class a implements j
{
    private static final String[] z;
    private final byte[] a;
    private volatile DatagramPacket b;
    
    static {
        final String[] z2 = new String[9];
        final char[] charArray = "V\u0010|I0\u0016\n".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\\';
                    break;
                }
                case 0: {
                    c2 = 'z';
                    break;
                }
                case 1: {
                    c2 = '0';
                    break;
                }
                case 2: {
                    c2 = '\f';
                    break;
                }
                case 3: {
                    c2 = '&';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "V\u0010|T9\u0019Y\u007fO3\u0014\n".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\\';
                    break;
                }
                case 0: {
                    c4 = 'z';
                    break;
                }
                case 1: {
                    c4 = '0';
                    break;
                }
                case 2: {
                    c4 = '\f';
                    break;
                }
                case 3: {
                    c4 = '&';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "!FiT/\u0013_b\u001c".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\\';
                    break;
                }
                case 0: {
                    c6 = 'z';
                    break;
                }
                case 1: {
                    c6 = '0';
                    break;
                }
                case 2: {
                    c6 = '\f';
                    break;
                }
                case 3: {
                    c6 = '&';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "V\u0010hO/\nU~U5\u0015^$K/S\n".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\\';
                    break;
                }
                case 0: {
                    c8 = 'z';
                    break;
                }
                case 1: {
                    c8 = '0';
                    break;
                }
                case 2: {
                    c8 = '\f';
                    break;
                }
                case 3: {
                    c8 = '&';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "V\u0010eBf".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\\';
                    break;
                }
                case 0: {
                    c10 = 'z';
                    break;
                }
                case 1: {
                    c10 = '0';
                    break;
                }
                case 2: {
                    c10 = '\f';
                    break;
                }
                case 3: {
                    c10 = '&';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "Zm".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\\';
                    break;
                }
                case 0: {
                    c12 = 'z';
                    break;
                }
                case 1: {
                    c12 = '0';
                    break;
                }
                case 2: {
                    c12 = '\f';
                    break;
                }
                case 3: {
                    c12 = '&';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "V\u0010tK5\u000edeK9@".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\\';
                    break;
                }
                case 0: {
                    c14 = 'z';
                    break;
                }
                case 1: {
                    c14 = '0';
                    break;
                }
                case 2: {
                    c14 = '\f';
                    break;
                }
                case 3: {
                    c14 = '&';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "V\u0010aI8\u001f\n".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '\\';
                    break;
                }
                case 0: {
                    c16 = 'z';
                    break;
                }
                case 1: {
                    c16 = '0';
                    break;
                }
                case 2: {
                    c16 = '\f';
                    break;
                }
                case 3: {
                    c16 = '&';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "V\u0010hC0\u001bI6".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '\\';
                    break;
                }
                case 0: {
                    c18 = 'z';
                    break;
                }
                case 1: {
                    c18 = '0';
                    break;
                }
                case 2: {
                    c18 = '\f';
                    break;
                }
                case 3: {
                    c18 = '&';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        z = z2;
    }
    
    public a() {
        this.a = new byte[48];
    }
    
    protected static final int a(final byte b) {
        return b & 0xFF;
    }
    
    private int a(final int n) {
        return a(this.a[n]) << 24 | a(this.a[n + 1]) << 16 | a(this.a[n + 2]) << 8 | a(this.a[n + 3]);
    }
    
    private void a(final int n, final b b) {
        final int f = b.f;
        long h;
        if (b == null) {
            h = 0L;
        }
        else {
            h = b.h();
        }
        long n2 = h;
        int i = 7;
        while (i >= 0) {
            this.a[n + i] = (byte)(0xFFL & n2);
            n2 >>>= 8;
            --i;
            if (f != 0) {
                break;
            }
        }
    }
    
    protected static final long b(final byte b) {
        return b & 0xFF;
    }
    
    private long b(final int n) {
        return b(this.a[n]) << 56 | b(this.a[n + 1]) << 48 | b(this.a[n + 2]) << 40 | b(this.a[n + 3]) << 32 | b(this.a[n + 4]) << 24 | b(this.a[n + 5]) << 16 | b(this.a[n + 6]) << 8 | b(this.a[n + 7]);
    }
    
    private String c() {
        return a(this.a[12]) + "." + a(this.a[13]) + "." + a(this.a[14]) + "." + a(this.a[15]);
    }
    
    private b c(final int n) {
        return new b(this.b(n));
    }
    
    private String f() {
        return Integer.toHexString(this.k());
    }
    
    private String h() {
        final int f = org.b.f;
        final StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i <= 3) {
            final char c = (char)this.a[i + 12];
            if (c == '\0' && f == 0) {
                break;
            }
            sb.append(c);
            ++i;
            if (f != 0) {
                break;
            }
        }
        return sb.toString();
    }
    
    public int a() {
        return this.a(4);
    }
    
    @Override
    public b a() {
        return this.c(32);
    }
    
    @Override
    public void a(final int n) {
        this.a[0] = (byte)((0xC7 & this.a[0]) | (n & 0x7) << 3);
    }
    
    @Override
    public void a(final b b) {
        this.a(40, b);
    }
    
    public int b() {
        return 0x7 & a(this.a[0]) >> 0;
    }
    
    @Override
    public b b() {
        return this.c(40);
    }
    
    @Override
    public void b(final int n) {
        this.a[0] = (byte)((0xF8 & this.a[0]) | (n & 0x7));
    }
    
    @Override
    public b c() {
        return this.c(24);
    }
    
    public int d() {
        return a(this.a[1]);
    }
    
    @Override
    public DatagramPacket d() {
        synchronized (this) {
            if (this.b == null) {
                (this.b = new DatagramPacket(this.a, this.a.length)).setPort(123);
            }
            return this.b;
        }
    }
    
    public String e() {
        final int j = this.j();
        final int d = this.d();
        if (j == 3 || j == 4) {
            if (d == 0 || d == 1) {
                return this.h();
            }
            if (j == 4) {
                return this.f();
            }
        }
        if (d >= 2) {
            return this.c();
        }
        return this.f();
    }
    
    public int g() {
        return this.a(8);
    }
    
    public double i() {
        return this.g() / 65.536;
    }
    
    public int j() {
        return 0x7 & a(this.a[0]) >> 3;
    }
    
    public int k() {
        return this.a(12);
    }
    
    public int l() {
        return this.a[3];
    }
    
    public int m() {
        return this.a[2];
    }
    
    @Override
    public String toString() {
        final int f = org.b.f;
        final String string = org.a.z[2] + this.j() + org.a.z[7] + this.b() + org.a.z[0] + this.m() + org.a.z[1] + this.l() + org.a.z[8] + this.a() + org.a.z[3] + this.i() + org.a.z[4] + this.e() + org.a.z[6] + this.b().c() + org.a.z[5];
        if (l.a != 0) {
            org.b.f = f + 1;
        }
        return string;
    }
}
