// 
// Decompiled by Procyon v0.5.30
// 

public class wq
{
    public static int a(final int n) {
        return n & 0x3;
    }
    
    public static int a(final int n, final int n2, final int n3, final int n4) {
        return n | n2 << 3 | n3 << 4 | n4 << 6;
    }
    
    public static boolean b(final int n) {
        return (n & 0x8) >> 3 == 1;
    }
    
    public static int c(final int n) {
        return (n & 0x30) >> 4;
    }
    
    public static boolean d(final int n) {
        return (n & 0x40) >> 6 == 1;
    }
}
