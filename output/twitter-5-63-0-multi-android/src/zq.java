import org.spongycastle.crypto.e;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class zq implements e
{
    private byte[] a;
    private int b;
    private long c;
    
    protected zq() {
        this.a = new byte[4];
        this.b = 0;
    }
    
    @Override
    public void a(final byte b) {
        this.a[this.b++] = b;
        if (this.b == this.a.length) {
            this.b(this.a, 0);
            this.b = 0;
        }
        ++this.c;
    }
    
    protected abstract void a(final long p0);
    
    @Override
    public void a(final byte[] array, int n, int i) {
        while (this.b != 0 && i > 0) {
            this.a(array[n]);
            ++n;
            --i;
        }
        while (i > this.a.length) {
            this.b(array, n);
            n += this.a.length;
            i -= this.a.length;
            this.c += this.a.length;
        }
        while (i > 0) {
            this.a(array[n]);
            ++n;
            --i;
        }
    }
    
    @Override
    public void b() {
        this.c = 0L;
        this.b = 0;
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = 0;
        }
    }
    
    protected abstract void b(final byte[] p0, final int p1);
    
    public void c() {
        final long n = this.c << 3;
        this.a((byte)(-128));
        while (this.b != 0) {
            this.a((byte)0);
        }
        this.a(n);
        this.d();
    }
    
    protected abstract void d();
}
