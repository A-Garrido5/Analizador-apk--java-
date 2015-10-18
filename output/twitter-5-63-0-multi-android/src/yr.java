// 
// Decompiled by Procyon v0.5.30
// 

public final class yr
{
    public static boolean a(final String s) {
        return s != null && (s.startsWith("application/json") || s.startsWith("text/html") || s.startsWith("text/plain") || s.startsWith("text/xml") || s.startsWith("application/xml") || s.startsWith("application/javascript"));
    }
}
