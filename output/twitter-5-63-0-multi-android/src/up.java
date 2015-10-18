// 
// Decompiled by Procyon v0.5.30
// 

public class up
{
    public static Boolean a(final String s, final vc vc) {
        try {
            final Boolean b = (Boolean)vc.a(s, Boolean.class);
            if (b != null) {
                return b;
            }
        }
        catch (ClassCastException ex) {}
        final String a = wb.a(s, vc);
        if (a != null) {
            return a.toLowerCase().equals("true");
        }
        return null;
    }
}
