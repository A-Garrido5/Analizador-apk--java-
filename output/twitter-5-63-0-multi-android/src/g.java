// 
// Decompiled by Procyon v0.5.30
// 

public class g
{
    public static boolean a(final char c) {
        return (' ' <= c && c <= '~') || c == '\r' || c == '\n';
    }
    
    public static boolean a(final CharSequence charSequence) {
        for (int length = charSequence.length(), i = 0; i < length; ++i) {
            if (!a(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
