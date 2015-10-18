import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public class yi extends InputStream
{
    private boolean a;
    private final InputStream b;
    
    public yi(final InputStream b) {
        this.b = b;
    }
    
    public boolean a() {
        return this.a;
    }
    
    @Override
    public int available() {
        return this.b.available();
    }
    
    @Override
    public void close() {
        this.b.close();
        this.a = true;
    }
    
    @Override
    public void mark(final int n) {
        this.b.mark(n);
    }
    
    @Override
    public boolean markSupported() {
        return this.b.markSupported();
    }
    
    @Override
    public int read() {
        return this.b.read();
    }
    
    @Override
    public int read(final byte[] array) {
        return this.b.read(array);
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        return this.b.read(array, n, n2);
    }
    
    @Override
    public void reset() {
        synchronized (this) {
            this.b.reset();
        }
    }
    
    @Override
    public long skip(final long n) {
        return this.b.skip(n);
    }
}
