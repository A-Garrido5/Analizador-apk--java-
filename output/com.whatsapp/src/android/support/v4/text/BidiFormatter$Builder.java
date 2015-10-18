// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.text;

import java.util.Locale;

public final class BidiFormatter$Builder
{
    private int mFlags;
    private boolean mIsRtlContext;
    private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;
    
    public BidiFormatter$Builder() {
        this.initialize(BidiFormatter.access$000(Locale.getDefault()));
    }
    
    private static BidiFormatter getDefaultInstanceFromContext(final boolean b) {
        if (b) {
            return BidiFormatter.access$200();
        }
        return BidiFormatter.access$300();
    }
    
    private void initialize(final boolean mIsRtlContext) {
        this.mIsRtlContext = mIsRtlContext;
        this.mTextDirectionHeuristicCompat = BidiFormatter.access$100();
        this.mFlags = 2;
    }
    
    public BidiFormatter build() {
        if (this.mFlags == 2 && this.mTextDirectionHeuristicCompat == BidiFormatter.access$100()) {
            return getDefaultInstanceFromContext(this.mIsRtlContext);
        }
        return new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat, null);
    }
    
    public BidiFormatter$Builder setTextDirectionHeuristic(final TextDirectionHeuristicCompat mTextDirectionHeuristicCompat) {
        this.mTextDirectionHeuristicCompat = mTextDirectionHeuristicCompat;
        return this;
    }
}
