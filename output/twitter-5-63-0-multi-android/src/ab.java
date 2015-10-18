// 
// Decompiled by Procyon v0.5.30
// 

public final class ab extends y
{
    private final int c;
    private final int d;
    private final int e;
    
    ab(final String s, final int n, final int c, final int d, final int e) {
        super(s, n);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public boolean a(final int n) {
        return false;
    }
    
    @Override
    public boolean a(final int n, final int n2) {
        return false;
    }
    
    @Override
    public boolean a(final int[] array, final int n) {
        return n == 3 && array[0] == this.c && array[1] == this.d && array[2] == this.e;
    }
}
