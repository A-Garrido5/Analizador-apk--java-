// 
// Decompiled by Procyon v0.5.30
// 

public class nz
{
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    
    private nz(final String a, final int b, final int c, final boolean e, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.f = (!e && !d);
    }
    
    public static nz a(final String s, final int n) {
        return new nz(s, n, 10000, false, true);
    }
    
    public static nz a(final String s, final int n, final int n2) {
        return new nz(s, n, n2, false, false);
    }
    
    public static nz b(final String s, final int n) {
        return new nz(s, n, 10000, true, false);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("<ProgressUpdatedEvent jobId='").append(this.a).append("' type='").append(this.b).append("' progress='").append(this.c).append("' />");
        return sb.toString();
    }
}
