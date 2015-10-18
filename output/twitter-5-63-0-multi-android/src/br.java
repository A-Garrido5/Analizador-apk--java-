import java.io.OutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

class br extends OutputStream
{
    final /* synthetic */ bq a;
    
    br(final bq a) {
        this.a = a;
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public String toString() {
        return this + ".outputStream()";
    }
    
    @Override
    public void write(final int n) {
        this.a.c((byte)n);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        this.a.c(array, n, n2);
    }
}
