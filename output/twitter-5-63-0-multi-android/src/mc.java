// 
// Decompiled by Procyon v0.5.30
// 

public class mc
{
    public final String a;
    public final int b;
    
    public mc(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final mc mc = (mc)o;
            if (this.b != mc.b) {
                return false;
            }
            if (this.a != null) {
                if (this.a.equals(mc.a)) {
                    return true;
                }
            }
            else if (mc.a == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * 31 + this.b;
    }
}
