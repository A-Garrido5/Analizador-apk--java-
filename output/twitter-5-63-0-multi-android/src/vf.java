// 
// Decompiled by Procyon v0.5.30
// 

public class vf
{
    public static Double a(final String s, final vc vc) {
        try {
            final String s2 = (String)vc.a(s, String.class);
            if (s2 != null) {
                return Double.valueOf(s2);
            }
            return null;
        }
        catch (NumberFormatException ex) {}
        catch (ClassCastException ex2) {
            goto Label_0030;
        }
    }
}
