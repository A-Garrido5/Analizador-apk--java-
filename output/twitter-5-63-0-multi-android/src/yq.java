import com.twitter.util.platform.k;
import java.io.IOException;
import com.twitter.util.platform.p;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public class yq extends InputStream
{
    private static final p a;
    private final InputStream b;
    private long c;
    private long d;
    private long e;
    private long f;
    private IOException g;
    
    static {
        a = k.f().c();
    }
    
    public yq(final InputStream b) {
        this.g = null;
        this.b = b;
    }
    
    private void a(final long n) {
        final long n2 = yq.a.c() - this.e;
        if (n2 > 1000000L) {
            this.d = yq.a.b();
        }
        this.c += n2;
        if (n != -1L) {
            this.f += n;
        }
    }
    
    private void f() {
        this.e = yq.a.c();
    }
    
    public long a() {
        return this.c / 1000000L;
    }
    
    @Override
    public int available() {
        try {
            return this.b.available();
        }
        catch (IOException g) {
            throw this.g = g;
        }
    }
    
    public long b() {
        return this.d;
    }
    
    public long c() {
        return this.f;
    }
    
    @Override
    public void close() {
        try {
            this.b.close();
        }
        catch (IOException g) {
            throw this.g = g;
        }
    }
    
    public boolean d() {
        return this.g != null;
    }
    
    public IOException e() {
        return this.g;
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
        try {
            this.f();
            final int read = this.b.read();
            this.a(read);
            return read;
        }
        catch (IOException g) {
            throw this.g = g;
        }
        finally {
            this.a(-1);
        }
    }
    
    @Override
    public int read(final byte[] array) {
        try {
            this.f();
            final int read = this.b.read(array);
            this.a(read);
            return read;
        }
        catch (IOException g) {
            throw this.g = g;
        }
        finally {
            this.a(-1);
        }
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        try {
            this.f();
            final int read = this.b.read(array, n, n2);
            this.a(read);
            return read;
        }
        catch (IOException g) {
            throw this.g = g;
        }
        finally {
            this.a(-1);
        }
    }
    
    @Override
    public void reset() {
        synchronized (this) {
            try {
                this.b.reset();
            }
            catch (IOException g) {
                throw this.g = g;
            }
        }
    }
    
    @Override
    public long skip(final long n) {
        try {
            this.f();
            final long skip = this.b.skip(n);
            this.a(skip);
            return skip;
        }
        catch (IOException g) {
            throw this.g = g;
        }
        finally {
            this.a(-1L);
        }
    }
}
