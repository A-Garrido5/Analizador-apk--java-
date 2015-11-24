// 
// Decompiled by Procyon v0.5.30
// 

public class vm
{
    public static Integer a(final String s, final vc vc) {
        try {
            final String s2 = (String)vc.a(s, String.class);
            if (s2 != null) {
                return Integer.valueOf(s2, 10);
            }
            return null;
        }
        catch (NumberFormatException ex) {}
        catch (ClassCastException ex2) {
            goto Label_0032;
        }
    }
}
