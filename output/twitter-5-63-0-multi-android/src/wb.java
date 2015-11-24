// 
// Decompiled by Procyon v0.5.30
// 

public class wb
{
    public static String a(final String s, final vc vc) {
        try {
            return (String)vc.a(s, String.class);
        }
        catch (ClassCastException ex) {
            return null;
        }
    }
}
