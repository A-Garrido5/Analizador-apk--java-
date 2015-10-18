import java.util.concurrent.atomic.AtomicBoolean;
import java.io.IOException;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

class bx extends OutputStream
{
    final /* synthetic */ bw a;
    
    bx(final bw a) {
        this.a = a;
    }
    
    private void a() {
        if (this.a.c.get()) {
            throw new IOException("closed");
        }
    }
    
    @Override
    public void close() {
        this.a.close();
    }
    
    @Override
    public void flush() {
        if (!this.a.c.get()) {
            this.a.a();
        }
    }
    
    @Override
    public String toString() {
        return this.a + ".outputStream()";
    }
    
    @Override
    public void write(final int n) {
        this.a();
        this.a.a.c((byte)n);
        this.a.c();
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        this.a();
        this.a.a.c(array, n, n2);
        this.a.c();
    }
}
