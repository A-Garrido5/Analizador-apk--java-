// 
// Decompiled by Procyon v0.5.30
// 

public final class dt
{
    public final String a;
    public final int b;
    
    public dt(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final dt dt = (dt)o;
            if (this.b != dt.b || !this.a.equals(dt.a)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * this.a.hashCode() + this.b;
    }
}
