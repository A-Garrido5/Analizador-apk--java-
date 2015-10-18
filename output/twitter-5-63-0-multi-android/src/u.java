// 
// Decompiled by Procyon v0.5.30
// 

final class u
{
    public final y a;
    public final u b;
    public final int c;
    public final int d;
    
    u(final y a, final u b) {
        this.a = a;
        this.b = b;
        int d;
        if (b == null) {
            d = 1;
        }
        else {
            d = 1 + b.d;
        }
        this.d = d;
        this.c = a.hashCode();
    }
    
    public y a(final int n, final int n2, final int n3) {
        if (this.c != n || !this.a.a(n2, n3)) {
            for (u u = this.b; u != null; u = u.b) {
                if (u.c == n) {
                    final y y = u.a;
                    if (y.a(n2, n3)) {
                        return y;
                    }
                }
            }
            return null;
        }
        return this.a;
    }
    
    public y a(final int n, final int[] array, final int n2) {
        if (this.c != n || !this.a.a(array, n2)) {
            for (u u = this.b; u != null; u = u.b) {
                if (u.c == n) {
                    final y y = u.a;
                    if (y.a(array, n2)) {
                        return y;
                    }
                }
            }
            return null;
        }
        return this.a;
    }
}
