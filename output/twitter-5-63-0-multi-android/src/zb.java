import java.io.File;

// 
// Decompiled by Procyon v0.5.30
// 

public final class zb
{
    public final String a;
    public final long[] b;
    boolean c;
    yz d;
    final /* synthetic */ yx e;
    
    public zb(final yx e, final String a, final int n) {
        this.e = e;
        this.a = a;
        this.b = new long[n];
    }
    
    public File a(final int n) {
        return this.e.a(this.a, n, false);
    }
    
    public boolean a() {
        return this.c;
    }
    
    public File b(final int n) {
        return this.e.a(this.a, n, true);
    }
    
    public yz b() {
        return this.d;
    }
}
