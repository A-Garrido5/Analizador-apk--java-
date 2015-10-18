import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FilterOutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

class za extends FilterOutputStream
{
    final /* synthetic */ yz a;
    
    private za(final yz a, final OutputStream outputStream) {
        this.a = a;
        super(outputStream);
    }
    
    @Override
    public void close() {
        try {
            this.out.close();
        }
        catch (IOException ex) {
            this.a.c = true;
            throw ex;
        }
    }
    
    @Override
    public void flush() {
        try {
            this.out.flush();
        }
        catch (IOException ex) {
            this.a.c = true;
            throw ex;
        }
    }
    
    @Override
    public void write(final int n) {
        try {
            this.out.write(n);
        }
        catch (IOException ex) {
            this.a.c = true;
            throw ex;
        }
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        try {
            this.out.write(array, n, n2);
        }
        catch (IOException ex) {
            this.a.c = true;
            throw ex;
        }
    }
}
