// 
// Decompiled by Procyon v0.5.30
// 

public class xp implements xm
{
    private float b;
    private final float c;
    private float d;
    private final xq e;
    private final xq f;
    
    public xp() {
        this(new xq(), new xq());
    }
    
    public xp(final xq e, final xq f) {
        this.b = 0.5f;
        this.c = 2.0f;
        this.d = 0.0f;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public void a() {
        this.d = 0.0f;
    }
    
    @Override
    public void a(final float n, final xl xl) {
        this.d += n;
        this.e.a(xl.f().x, xl.c().x, xl.e().x);
        this.f.a(xl.f().y, xl.c().y, xl.e().y);
        xl.b().x = this.e.a(this.d);
        xl.b().y = this.f.a(this.d);
        xl.d().x = this.e.b(this.d);
        xl.d().y = this.f.b(this.d);
        if (this.a(xl)) {
            xl.a(xl.f());
        }
    }
    
    @Override
    public boolean a(final xl xl) {
        return Math.abs(xl.b().x - xl.f().x) <= this.b && Math.abs(xl.d().x) < 2.0f && Math.abs(xl.b().y - xl.f().y) <= this.b && Math.abs(xl.d().y) < 2.0f;
    }
}
