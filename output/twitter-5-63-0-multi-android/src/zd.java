import java.io.OutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public class zd
{
    protected final byte[] a;
    protected final byte b;
    protected final byte[] c;
    
    public zd() {
        this.a = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        this.b = 61;
        this.c = new byte[128];
        this.a();
    }
    
    private int a(final OutputStream outputStream, final char c, final char c2, final char c3, final char c4) {
        if (c3 == '=') {
            outputStream.write(this.c[c] << 2 | this.c[c2] >> 4);
            return 1;
        }
        if (c4 == '=') {
            final byte b = this.c[c];
            final byte b2 = this.c[c2];
            final byte b3 = this.c[c3];
            outputStream.write(b << 2 | b2 >> 4);
            outputStream.write(b2 << 4 | b3 >> 2);
            return 2;
        }
        final byte b4 = this.c[c];
        final byte b5 = this.c[c2];
        final byte b6 = this.c[c3];
        final byte b7 = this.c[c4];
        outputStream.write(b4 << 2 | b5 >> 4);
        outputStream.write(b5 << 4 | b6 >> 2);
        outputStream.write(b7 | b6 << 6);
        return 3;
    }
    
    private int a(final String s, int n, final int n2) {
        while (n < n2 && this.a(s.charAt(n))) {
            ++n;
        }
        return n;
    }
    
    private boolean a(final char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }
    
    public int a(final String s, final OutputStream outputStream) {
        int length;
        for (length = s.length(); length > 0 && this.a(s.charAt(length - 1)); --length) {}
        final int n = length - 4;
        int i = this.a(s, 0, n);
        int n2 = 0;
        while (i < n) {
            final byte[] c = this.c;
            final int n3 = i + 1;
            final byte b = c[s.charAt(i)];
            final int a = this.a(s, n3, n);
            final byte[] c2 = this.c;
            final int n4 = a + 1;
            final byte b2 = c2[s.charAt(a)];
            final int a2 = this.a(s, n4, n);
            final byte[] c3 = this.c;
            final int n5 = a2 + 1;
            final byte b3 = c3[s.charAt(a2)];
            final int a3 = this.a(s, n5, n);
            final byte[] c4 = this.c;
            final int n6 = a3 + 1;
            final byte b4 = c4[s.charAt(a3)];
            outputStream.write(b << 2 | b2 >> 4);
            outputStream.write(b2 << 4 | b3 >> 2);
            outputStream.write(b4 | b3 << 6);
            final int n7 = n2 + 3;
            i = this.a(s, n6, n);
            n2 = n7;
        }
        return n2 + this.a(outputStream, s.charAt(length - 4), s.charAt(length - 3), s.charAt(length - 2), s.charAt(length - 1));
    }
    
    public int a(final byte[] array, final int n, final int n2, final OutputStream outputStream) {
        final int n3 = n2 % 3;
        final int n4 = n2 - n3;
        for (int i = n; i < n + n4; i += 3) {
            final int n5 = 0xFF & array[i];
            final int n6 = 0xFF & array[i + 1];
            final int n7 = 0xFF & array[i + 2];
            outputStream.write(this.a[0x3F & n5 >>> 2]);
            outputStream.write(this.a[0x3F & (n5 << 4 | n6 >>> 4)]);
            outputStream.write(this.a[0x3F & (n6 << 2 | n7 >>> 6)]);
            outputStream.write(this.a[n7 & 0x3F]);
        }
        switch (n3) {
            case 1: {
                final int n8 = 0xFF & array[n + n4];
                final int n9 = 0x3F & n8 >>> 2;
                final int n10 = 0x3F & n8 << 4;
                outputStream.write(this.a[n9]);
                outputStream.write(this.a[n10]);
                outputStream.write(61);
                outputStream.write(61);
                break;
            }
            case 2: {
                final int n11 = 0xFF & array[n + n4];
                final int n12 = 0xFF & array[1 + (n + n4)];
                final int n13 = 0x3F & n11 >>> 2;
                final int n14 = 0x3F & (n11 << 4 | n12 >>> 4);
                final int n15 = 0x3F & n12 << 2;
                outputStream.write(this.a[n13]);
                outputStream.write(this.a[n14]);
                outputStream.write(this.a[n15]);
                outputStream.write(61);
                break;
            }
        }
        final int n16 = 4 * (n4 / 3);
        int n17;
        if (n3 == 0) {
            n17 = 0;
        }
        else {
            n17 = 4;
        }
        return n17 + n16;
    }
    
    protected void a() {
        for (int i = 0; i < this.a.length; ++i) {
            this.c[this.a[i]] = (byte)i;
        }
    }
}
