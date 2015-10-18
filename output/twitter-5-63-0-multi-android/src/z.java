// 
// Decompiled by Procyon v0.5.30
// 

public final class z extends y
{
    private static final z c;
    private final int d;
    
    static {
        c = new z("", 0, 0);
    }
    
    z(final String s, final int n, final int d) {
        super(s, n);
        this.d = d;
    }
    
    public static z b() {
        return z.c;
    }
    
    @Override
    public boolean a(final int n) {
        return n == this.d;
    }
    
    @Override
    public boolean a(final int n, final int n2) {
        return n == this.d && n2 == 0;
    }
    
    @Override
    public boolean a(final int[] array, final int n) {
        return n == 1 && array[0] == this.d;
    }
}
