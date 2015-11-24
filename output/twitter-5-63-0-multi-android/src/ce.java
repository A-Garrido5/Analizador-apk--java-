// 
// Decompiled by Procyon v0.5.30
// 

final class ce
{
    public static int a(final int n) {
        return (0xFF000000 & n) >>> 24 | (0xFF0000 & n) >>> 8 | (0xFF00 & n) << 8 | (n & 0xFF) << 24;
    }
    
    public static int a(final short n) {
        final int n2 = 0xFFFF & n;
        return (0xFF00 & n2) >>> 8 | (n2 & 0xFF) << 8;
    }
    
    public static void a(final long n, final long n2, final long n3) {
        if ((n2 | n3) < 0L || n2 > n || n - n2 < n3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    public static void a(final Throwable t) {
        b(t);
    }
    
    private static void b(final Throwable t) {
        throw t;
    }
}
