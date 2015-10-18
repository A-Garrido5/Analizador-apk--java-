// 
// Decompiled by Procyon v0.5.30
// 

public class iq
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    
    public iq(final int a, final int b, final int c, final int d, final int e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            final iq iq = (iq)o;
            if (this.a == iq.a && this.b == iq.b && this.c == iq.c && this.d == iq.d && this.e == iq.e && this.f == iq.f) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * this.a + this.b) + this.c) + this.d) + this.e) + this.f;
    }
}
