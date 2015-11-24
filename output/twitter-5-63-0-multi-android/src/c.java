import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.30
// 

public class c
{
    static String a;
    public static int b;
    private static final Map c;
    private static final Set d;
    
    static {
        c.a = "v21_generic";
        c.b = -1073741824;
        (c = new HashMap()).put(c.a, -1073741824);
        c.c.put("v30_generic", -1073741823);
        c.c.put("v21_europe", -1073741820);
        c.c.put("v30_europe", -1073741819);
        c.c.put("v21_japanese_utf8", -1073741816);
        c.c.put("v30_japanese_utf8", -1073741815);
        c.c.put("v21_japanese_mobile", 402653192);
        c.c.put("docomo", 939524104);
        (d = new HashSet()).add(-1073741816);
        c.d.add(-1073741815);
        c.d.add(402653192);
        c.d.add(939524104);
    }
    
    public static boolean a(final int n) {
        return (n & 0x3) == 0x0;
    }
    
    public static boolean b(final int n) {
        return (n & 0x3) == 0x1;
    }
    
    public static boolean c(final int n) {
        return (n & 0x3) == 0x2;
    }
    
    public static boolean d(final int n) {
        return !b(n);
    }
    
    public static int e(final int n) {
        return n & 0xC;
    }
    
    public static boolean f(final int n) {
        return (Integer.MIN_VALUE & n) != 0x0;
    }
    
    public static boolean g(final int n) {
        return (0x40000000 & n) != 0x0;
    }
    
    public static boolean h(final int n) {
        return !d(n) || (0x10000000 & n) != 0x0;
    }
    
    public static boolean i(final int n) {
        return b(n) || (0x4000000 & n) != 0x0;
    }
    
    public static boolean j(final int n) {
        return c.d.contains(n);
    }
    
    static boolean k(final int n) {
        return (0x2000000 & n) != 0x0;
    }
    
    public static boolean l(final int n) {
        return (0x8000000 & n) != 0x0;
    }
    
    public static boolean m(final int n) {
        return n == 939524104;
    }
    
    public static boolean n(final int n) {
        return (0x20000000 & n) != 0x0;
    }
}
