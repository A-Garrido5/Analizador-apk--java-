// 
// Decompiled by Procyon v0.5.30
// 

public final class ae
{
    public static Object a(final Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        return o;
    }
    
    public static void a(final boolean b) {
        if (!b) {
            throw new IllegalArgumentException();
        }
    }
    
    public static void b(final boolean b) {
        if (!b) {
            throw new IllegalStateException();
        }
    }
}
