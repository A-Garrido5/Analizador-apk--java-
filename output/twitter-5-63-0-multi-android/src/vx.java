// 
// Decompiled by Procyon v0.5.30
// 

public class vx implements ut
{
    private final vd a;
    private final uj b;
    private final long c;
    private final vy d;
    
    public vx(final vd a, final uj b, final long c, final vy d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int a(final String s, final ul ul) {
        return this.b.a(this.c, s, ul);
    }
    
    public void a() {
        this.a.a(this.c, this);
    }
    
    @Override
    public void a(final long n, final vc vc) {
        if (n == this.c) {
            this.d.a(vc);
            return;
        }
        throw new IllegalArgumentException(String.format("apiResponseKey %s does not match expected mApiResponseKey %s", n, this.c));
    }
    
    public void b() {
        this.a.b(this.c, this);
    }
    
    public void c() {
        this.b.a();
    }
}
