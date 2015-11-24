// 
// Decompiled by Procyon v0.5.30
// 

public class af
{
    public static String a(final String s) {
        final int index = s.indexOf(47);
        if (index == -1) {
            throw new IllegalArgumentException("Invalid mime type: " + s);
        }
        return s.substring(0, index);
    }
    
    public static boolean b(final String s) {
        return a(s).equals("audio");
    }
    
    public static boolean c(final String s) {
        return a(s).equals("video");
    }
}
