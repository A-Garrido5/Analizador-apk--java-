// 
// Decompiled by Procyon v0.5.30
// 

public abstract class yw
{
    private static final boolean a;
    private static final boolean b;
    
    static {
        a = a("org.junit.runners.ParentRunner");
        b = a("org.robolectric.RobolectricTestRunner");
    }
    
    public static boolean a() {
        return yw.a;
    }
    
    static boolean a(final String s) {
        try {
            Class.forName(s);
            return true;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    public static boolean b() {
        return yw.b;
    }
}
