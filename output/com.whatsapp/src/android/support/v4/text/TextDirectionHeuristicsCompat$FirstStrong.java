// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.text;

class TextDirectionHeuristicsCompat$FirstStrong implements TextDirectionHeuristicsCompat$TextDirectionAlgorithm
{
    public static final TextDirectionHeuristicsCompat$FirstStrong INSTANCE;
    
    static {
        INSTANCE = new TextDirectionHeuristicsCompat$FirstStrong();
    }
    
    @Override
    public int checkRtl(final CharSequence charSequence, int n, final int n2) {
        final boolean a = TextDirectionHeuristicsCompat.a;
        final int n3 = n + n2;
        int access$100 = 2;
        while (n < n3 && access$100 == 2) {
            access$100 = TextDirectionHeuristicsCompat.access$100(Character.getDirectionality(charSequence.charAt(n)));
            ++n;
            if (a) {
                break;
            }
        }
        return access$100;
    }
}
