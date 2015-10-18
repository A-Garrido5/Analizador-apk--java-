import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.30
// 

class bz extends InputStream
{
    final /* synthetic */ by a;
    
    bz(final by a) {
        this.a = a;
    }
    
    private void a() {
        if (this.a.c) {
            throw new IOException("closed");
        }
    }
    
    @Override
    public int available() {
        this.a();
        return (int)Math.min(this.a.a.b, 2147483647L);
    }
    
    @Override
    public void close() {
        this.a.close();
    }
    
    @Override
    public int read() {
        this.a();
        if (this.a.a.b == 0L && this.a.b.b(this.a.a, 2048L) == -1L) {
            return -1;
        }
        return 0xFF & this.a.a.f();
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        this.a();
        ce.a(array.length, n, n2);
        if (this.a.a.b == 0L && this.a.b.b(this.a.a, 2048L) == -1L) {
            return -1;
        }
        return this.a.a.b(array, n, n2);
    }
    
    @Override
    public String toString() {
        return this.a + ".inputStream()";
    }
}
