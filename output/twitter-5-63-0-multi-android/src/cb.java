// 
// Decompiled by Procyon v0.5.30
// 

final class cb
{
    static final cb a;
    long b;
    private ca c;
    
    static {
        a = new cb();
    }
    
    ca a() {
        synchronized (this) {
            if (this.c != null) {
                final ca c = this.c;
                this.c = c.d;
                c.d = null;
                this.b -= 2048L;
                return c;
            }
            // monitorexit(this)
            return new ca();
        }
    }
    
    void a(final ca c) {
        if (c.d != null || c.e != null) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (2048L + this.b > 65536L) {
                return;
            }
            this.b += 2048L;
            c.d = this.c;
            c.c = 0;
            c.b = 0;
            this.c = c;
        }
    }
}
