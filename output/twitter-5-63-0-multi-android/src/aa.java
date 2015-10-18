// 
// Decompiled by Procyon v0.5.30
// 

public final class aa extends y
{
    private final int c;
    private final int d;
    
    aa(final String s, final int n, final int c, final int d) {
        super(s, n);
        this.c = c;
        this.d = d;
    }
    
    @Override
    public boolean a(final int n) {
        return false;
    }
    
    @Override
    public boolean a(final int n, final int n2) {
        return n == this.c && n2 == this.d;
    }
    
    @Override
    public boolean a(final int[] array, final int n) {
        return n == 2 && array[0] == this.c && array[1] == this.d;
    }
}
