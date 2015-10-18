// 
// Decompiled by Procyon v0.5.30
// 

public class sk
{
    private static boolean a;
    private static sl b;
    
    public static sl a() {
        synchronized (sk.class) {
            if (!sk.a) {
                throw new IllegalStateException("GeoModule.initialize() must be called first. (Alternatively, for tests, setGeoPermissionsForTest(..) can be called.)");
            }
        }
        // monitorexit(sk.class)
        return sk.b;
    }
    
    public static void a(final sl b) {
        synchronized (sk.class) {
            if (sk.a) {
                throw new IllegalStateException("GeoModule.initialize(..) should only be invoked once.");
            }
        }
        sk.b = b;
        sk.a = true;
    }
    // monitorexit(sk.class)
}
