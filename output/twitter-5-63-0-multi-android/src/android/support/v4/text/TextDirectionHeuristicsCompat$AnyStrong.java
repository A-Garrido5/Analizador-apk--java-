// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.text;

class TextDirectionHeuristicsCompat$AnyStrong implements TextDirectionHeuristicsCompat$TextDirectionAlgorithm
{
    public static final TextDirectionHeuristicsCompat$AnyStrong INSTANCE_LTR;
    public static final TextDirectionHeuristicsCompat$AnyStrong INSTANCE_RTL;
    private final boolean mLookForRtl;
    
    static {
        INSTANCE_RTL = new TextDirectionHeuristicsCompat$AnyStrong(true);
        INSTANCE_LTR = new TextDirectionHeuristicsCompat$AnyStrong(false);
    }
    
    private TextDirectionHeuristicsCompat$AnyStrong(final boolean mLookForRtl) {
        this.mLookForRtl = mLookForRtl;
    }
    
    @Override
    public int checkRtl(final CharSequence charSequence, int i, final int n) {
        boolean b = true;
        final int n2 = i + n;
        boolean b2 = false;
        while (i < n2) {
            switch (isRtlText(Character.getDirectionality(charSequence.charAt(i)))) {
                case 0: {
                    if (this.mLookForRtl) {
                        b = false;
                        return b ? 1 : 0;
                    }
                    b2 = b;
                    break;
                }
                case 1: {
                    if (this.mLookForRtl) {
                        b2 = b;
                        break;
                    }
                    return b ? 1 : 0;
                }
            }
            ++i;
        }
        if (!b2) {
            return 2;
        }
        if (!this.mLookForRtl) {
            return 0;
        }
        return b ? 1 : 0;
    }
}
