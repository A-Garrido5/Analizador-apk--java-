// 
// Decompiled by Procyon v0.5.30
// 

public class zr extends zq
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int[] f;
    private int g;
    
    public zr() {
        this.f = new int[80];
        this.b();
    }
    
    private int a(final int n, final int n2, final int n3) {
        return (n & n2) | (n3 & ~n);
    }
    
    private int b(final int n, final int n2, final int n3) {
        return n3 ^ (n ^ n2);
    }
    
    private int c(final int n, final int n2, final int n3) {
        return (n & n2) | (n & n3) | (n2 & n3);
    }
    
    @Override
    public int a() {
        return 20;
    }
    
    @Override
    public int a(final byte[] array, final int n) {
        this.c();
        aac.a(this.a, array, n);
        aac.a(this.b, array, n + 4);
        aac.a(this.c, array, n + 8);
        aac.a(this.d, array, n + 12);
        aac.a(this.e, array, n + 16);
        this.b();
        return 20;
    }
    
    @Override
    protected void a(final long n) {
        if (this.g > 14) {
            this.d();
        }
        this.f[14] = (int)(n >>> 32);
        this.f[15] = (int)(-1L & n);
    }
    
    @Override
    public void b() {
        super.b();
        this.a = 1732584193;
        this.b = -271733879;
        this.c = -1732584194;
        this.d = 271733878;
        this.e = -1009589776;
        this.g = 0;
        for (int i = 0; i != this.f.length; ++i) {
            this.f[i] = 0;
        }
    }
    
    @Override
    protected void b(final byte[] array, final int n) {
        final int n2 = array[n] << 24;
        final int n3 = n + 1;
        final int n4 = n2 | (0xFF & array[n3]) << 16;
        final int n5 = n3 + 1;
        this.f[this.g] = (n4 | (0xFF & array[n5]) << 8 | (0xFF & array[n5 + 1]));
        final int g = 1 + this.g;
        this.g = g;
        if (g == 16) {
            this.d();
        }
    }
    
    @Override
    protected void d() {
        for (int i = 16; i < 80; ++i) {
            final int n = this.f[i - 3] ^ this.f[i - 8] ^ this.f[i - 14] ^ this.f[i - 16];
            this.f[i] = (n << 1 | n >>> 31);
        }
        int a = this.a;
        int b = this.b;
        int c = this.c;
        int d = this.d;
        int e = this.e;
        int n2 = 0;
        for (int j = 0; j < 4; ++j) {
            final int n3 = (a << 5 | a >>> 27) + this.a(b, c, d);
            final int[] f = this.f;
            final int n4 = n2 + 1;
            final int n5 = e + (1518500249 + (n3 + f[n2]));
            final int n6 = b << 30 | b >>> 2;
            final int n7 = (n5 << 5 | n5 >>> 27) + this.a(a, n6, c);
            final int[] f2 = this.f;
            final int n8 = n4 + 1;
            final int n9 = d + (1518500249 + (n7 + f2[n4]));
            final int n10 = a << 30 | a >>> 2;
            final int n11 = (n9 << 5 | n9 >>> 27) + this.a(n5, n10, n6);
            final int[] f3 = this.f;
            final int n12 = n8 + 1;
            final int n13 = c + (1518500249 + (n11 + f3[n8]));
            e = (n5 << 30 | n5 >>> 2);
            final int n14 = (n13 << 5 | n13 >>> 27) + this.a(n9, e, n10);
            final int[] f4 = this.f;
            final int n15 = n12 + 1;
            b = n6 + (1518500249 + (n14 + f4[n12]));
            d = (n9 << 30 | n9 >>> 2);
            final int n16 = (b << 5 | b >>> 27) + this.a(n13, d, e);
            final int[] f5 = this.f;
            n2 = n15 + 1;
            a = n10 + (1518500249 + (n16 + f5[n15]));
            c = (n13 << 30 | n13 >>> 2);
        }
        for (int k = 0; k < 4; ++k) {
            final int n17 = (a << 5 | a >>> 27) + this.b(b, c, d);
            final int[] f6 = this.f;
            final int n18 = n2 + 1;
            final int n19 = e + (1859775393 + (n17 + f6[n2]));
            final int n20 = b << 30 | b >>> 2;
            final int n21 = (n19 << 5 | n19 >>> 27) + this.b(a, n20, c);
            final int[] f7 = this.f;
            final int n22 = n18 + 1;
            final int n23 = d + (1859775393 + (n21 + f7[n18]));
            final int n24 = a << 30 | a >>> 2;
            final int n25 = (n23 << 5 | n23 >>> 27) + this.b(n19, n24, n20);
            final int[] f8 = this.f;
            final int n26 = n22 + 1;
            final int n27 = c + (1859775393 + (n25 + f8[n22]));
            e = (n19 << 30 | n19 >>> 2);
            final int n28 = (n27 << 5 | n27 >>> 27) + this.b(n23, e, n24);
            final int[] f9 = this.f;
            final int n29 = n26 + 1;
            b = n20 + (1859775393 + (n28 + f9[n26]));
            d = (n23 << 30 | n23 >>> 2);
            final int n30 = (b << 5 | b >>> 27) + this.b(n27, d, e);
            final int[] f10 = this.f;
            n2 = n29 + 1;
            a = n24 + (1859775393 + (n30 + f10[n29]));
            c = (n27 << 30 | n27 >>> 2);
        }
        for (int l = 0; l < 4; ++l) {
            final int n31 = (a << 5 | a >>> 27) + this.c(b, c, d);
            final int[] f11 = this.f;
            final int n32 = n2 + 1;
            final int n33 = e + (-1894007588 + (n31 + f11[n2]));
            final int n34 = b << 30 | b >>> 2;
            final int n35 = (n33 << 5 | n33 >>> 27) + this.c(a, n34, c);
            final int[] f12 = this.f;
            final int n36 = n32 + 1;
            final int n37 = d + (-1894007588 + (n35 + f12[n32]));
            final int n38 = a << 30 | a >>> 2;
            final int n39 = (n37 << 5 | n37 >>> 27) + this.c(n33, n38, n34);
            final int[] f13 = this.f;
            final int n40 = n36 + 1;
            final int n41 = c + (-1894007588 + (n39 + f13[n36]));
            e = (n33 << 30 | n33 >>> 2);
            final int n42 = (n41 << 5 | n41 >>> 27) + this.c(n37, e, n38);
            final int[] f14 = this.f;
            final int n43 = n40 + 1;
            b = n34 + (-1894007588 + (n42 + f14[n40]));
            d = (n37 << 30 | n37 >>> 2);
            final int n44 = (b << 5 | b >>> 27) + this.c(n41, d, e);
            final int[] f15 = this.f;
            n2 = n43 + 1;
            a = n38 + (-1894007588 + (n44 + f15[n43]));
            c = (n41 << 30 | n41 >>> 2);
        }
        for (int n45 = 0; n45 <= 3; ++n45) {
            final int n46 = (a << 5 | a >>> 27) + this.b(b, c, d);
            final int[] f16 = this.f;
            final int n47 = n2 + 1;
            final int n48 = e + (-899497514 + (n46 + f16[n2]));
            final int n49 = b << 30 | b >>> 2;
            final int n50 = (n48 << 5 | n48 >>> 27) + this.b(a, n49, c);
            final int[] f17 = this.f;
            final int n51 = n47 + 1;
            final int n52 = d + (-899497514 + (n50 + f17[n47]));
            final int n53 = a << 30 | a >>> 2;
            final int n54 = (n52 << 5 | n52 >>> 27) + this.b(n48, n53, n49);
            final int[] f18 = this.f;
            final int n55 = n51 + 1;
            final int n56 = c + (-899497514 + (n54 + f18[n51]));
            e = (n48 << 30 | n48 >>> 2);
            final int n57 = (n56 << 5 | n56 >>> 27) + this.b(n52, e, n53);
            final int[] f19 = this.f;
            final int n58 = n55 + 1;
            b = n49 + (-899497514 + (n57 + f19[n55]));
            d = (n52 << 30 | n52 >>> 2);
            final int n59 = (b << 5 | b >>> 27) + this.b(n56, d, e);
            final int[] f20 = this.f;
            n2 = n58 + 1;
            a = n53 + (-899497514 + (n59 + f20[n58]));
            c = (n56 << 30 | n56 >>> 2);
        }
        this.a += a;
        this.b += b;
        this.c += c;
        this.d += d;
        this.e += e;
        this.g = 0;
        for (int n60 = 0; n60 < 16; ++n60) {
            this.f[n60] = 0;
        }
    }
}
