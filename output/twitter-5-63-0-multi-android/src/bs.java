import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.30
// 

class bs extends InputStream
{
    final /* synthetic */ bq a;
    
    bs(final bq a) {
        this.a = a;
    }
    
    @Override
    public int available() {
        return (int)Math.min(this.a.b, 2147483647L);
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public int read() {
        return 0xFF & this.a.f();
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        return this.a.b(array, n, n2);
    }
    
    @Override
    public String toString() {
        return this.a + ".inputStream()";
    }
}
