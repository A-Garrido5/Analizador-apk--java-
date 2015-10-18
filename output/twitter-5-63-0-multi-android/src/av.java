// 
// Decompiled by Procyon v0.5.30
// 

public final class av implements at
{
    long a;
    
    public av() {
        this.a = 0L;
    }
    
    private static int e(final int n) {
        if (n < 0 || n > 63) {
            throw new IllegalArgumentException(String.format("input must be between 0 and 63: %s", n));
        }
        return n;
    }
    
    @Override
    public void a() {
        this.a = 0L;
    }
    
    @Override
    public void a(final int n) {
        this.a |= 1L << e(n);
    }
    
    public at b() {
        return new aw(this, null);
    }
    
    @Override
    public void b(final int n) {
        this.a ^= 1L << e(n);
    }
    
    @Override
    public boolean c(final int n) {
        return (0x1L & this.a >> e(n)) == 0x1L;
    }
    
    @Override
    public void d(final int n) {
        this.a <<= e(n);
    }
    
    @Override
    public String toString() {
        return Long.toBinaryString(this.a);
    }
}
