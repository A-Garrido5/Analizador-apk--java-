// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.text;

class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal extends TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl
{
    private final boolean mDefaultIsRtl;
    
    private TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(final TextDirectionHeuristicsCompat$TextDirectionAlgorithm textDirectionHeuristicsCompat$TextDirectionAlgorithm, final boolean mDefaultIsRtl) {
        super(textDirectionHeuristicsCompat$TextDirectionAlgorithm);
        this.mDefaultIsRtl = mDefaultIsRtl;
    }
    
    TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(final TextDirectionHeuristicsCompat$TextDirectionAlgorithm textDirectionHeuristicsCompat$TextDirectionAlgorithm, final boolean b, final TextDirectionHeuristicsCompat$1 textDirectionHeuristicsCompat$1) {
        this(textDirectionHeuristicsCompat$TextDirectionAlgorithm, b);
    }
    
    @Override
    protected boolean defaultIsRtl() {
        return this.mDefaultIsRtl;
    }
}
