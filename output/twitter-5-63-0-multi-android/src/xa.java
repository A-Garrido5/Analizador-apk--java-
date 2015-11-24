import com.twitter.library.api.ab;

// 
// Decompiled by Procyon v0.5.30
// 

public class xa implements ab
{
    public long a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    
    public xa(final String b, final int c, final String d, final String e, final long f, final long g) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public long a() {
        return this.a;
    }
    
    @Override
    public String b() {
        return this.b;
    }
    
    public String c() {
        return this.b;
    }
    
    public boolean d() {
        return this.d != null || this.e != null;
    }
}
