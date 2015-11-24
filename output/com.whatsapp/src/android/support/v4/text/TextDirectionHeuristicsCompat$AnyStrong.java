// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.text;

import android.support.v4.app.FragmentActivity;

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
        final boolean a = TextDirectionHeuristicsCompat.a;
        final int n2 = i + n;
        int n3 = 0;
        while (i < n2) {
            Label_0100: {
                switch (TextDirectionHeuristicsCompat.access$200(Character.getDirectionality(charSequence.charAt(i)))) {
                    case 0: {
                        if (this.mLookForRtl) {
                            return 0;
                        }
                        if (a) {
                            ++FragmentActivity.a;
                            break Label_0100;
                        }
                        n3 = 1;
                        break;
                    }
                    case 1: {
                        if (this.mLookForRtl) {
                            n3 = 1;
                            break;
                        }
                        return 1;
                    }
                }
            }
            ++i;
            if (a) {
                break;
            }
        }
        if (n3 == 0) {
            return 2;
        }
        if (this.mLookForRtl) {
            return 1;
        }
        return 0;
    }
}
