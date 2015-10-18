// 
// Decompiled by Procyon v0.5.30
// 

public class fm
{
    public final boolean a;
    public final int b;
    
    fm(final fn fn) {
        this.a = fn.a;
        this.b = fn.b;
    }
    
    public static fn a() {
        return new fn().a(true);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final fm fm = (fm)o;
            if (this.b != fm.b) {
                return false;
            }
            if (this.a != fm.a) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n;
        if (this.a) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n * 31 + this.b;
    }
}
