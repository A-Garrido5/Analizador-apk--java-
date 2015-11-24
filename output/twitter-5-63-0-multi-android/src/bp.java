import java.util.zip.DataFormatException;
import java.io.IOException;
import java.io.EOFException;
import java.util.zip.Inflater;

// 
// Decompiled by Procyon v0.5.30
// 

public final class bp implements cd
{
    private final bj a;
    private final Inflater b;
    private int c;
    private boolean d;
    
    bp(final bj a, final Inflater b) {
        if (a == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (b == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.a = a;
        this.b = b;
    }
    
    public bp(final cd cd, final Inflater inflater) {
        this(bt.a(cd), inflater);
    }
    
    private void b() {
        if (this.c == 0) {
            return;
        }
        final int n = this.c - this.b.getRemaining();
        this.c -= n;
        this.a.b(n);
    }
    
    public boolean a() {
        if (!this.b.needsInput()) {
            return false;
        }
        this.b();
        if (this.b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.a.e()) {
            return true;
        }
        final ca a = this.a.b().a;
        this.c = a.c - a.b;
        this.b.setInput(a.a, a.b, this.c);
        return false;
    }
    
    @Override
    public long b(final bq bq, final long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (n == 0L) {
            return 0L;
        }
        while (true) {
            final boolean a = this.a();
            try {
                final ca f = bq.f(1);
                final int inflate = this.b.inflate(f.a, f.c, 2048 - f.c);
                if (inflate > 0) {
                    f.c += inflate;
                    bq.b += inflate;
                    return inflate;
                }
                if (this.b.finished() || this.b.needsDictionary()) {
                    this.b();
                    return -1L;
                }
                if (a) {
                    throw new EOFException("source exhausted prematurely");
                }
                continue;
            }
            catch (DataFormatException ex2) {
                final IOException ex = new IOException();
                ex.initCause(ex2);
                throw ex;
            }
        }
    }
    
    @Override
    public void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
