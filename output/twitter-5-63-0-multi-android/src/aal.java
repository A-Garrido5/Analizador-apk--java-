import java.io.OutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public class aal implements aaj
{
    protected final byte[] a;
    protected final byte[] b;
    
    public aal() {
        this.a = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
        this.b = new byte[128];
        this.a();
    }
    
    @Override
    public int a(final byte[] array, final int n, final int n2, final OutputStream outputStream) {
        for (int i = n; i < n + n2; ++i) {
            final int n3 = 0xFF & array[i];
            outputStream.write(this.a[n3 >>> 4]);
            outputStream.write(this.a[n3 & 0xF]);
        }
        return n2 * 2;
    }
    
    protected void a() {
        for (int i = 0; i < this.a.length; ++i) {
            this.b[this.a[i]] = (byte)i;
        }
        this.b[65] = this.b[97];
        this.b[66] = this.b[98];
        this.b[67] = this.b[99];
        this.b[68] = this.b[100];
        this.b[69] = this.b[101];
        this.b[70] = this.b[102];
    }
}
