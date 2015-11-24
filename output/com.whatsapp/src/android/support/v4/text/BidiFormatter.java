// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.text;

import java.util.Locale;

public final class BidiFormatter
{
    private static final BidiFormatter DEFAULT_LTR_INSTANCE;
    private static final BidiFormatter DEFAULT_RTL_INSTANCE;
    private static TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final String LRM_STRING;
    private static final String RLM_STRING;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;
    
    static {
        BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        LRM_STRING = Character.toString('\u200e');
        RLM_STRING = Character.toString('\u200f');
        DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC);
        DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC);
    }
    
    private BidiFormatter(final boolean mIsRtlContext, final int mFlags, final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat) {
        this.mIsRtlContext = mIsRtlContext;
        this.mFlags = mFlags;
        this.mDefaultTextDirectionHeuristicCompat = mDefaultTextDirectionHeuristicCompat;
    }
    
    BidiFormatter(final boolean b, final int n, final TextDirectionHeuristicCompat textDirectionHeuristicCompat, final BidiFormatter$1 bidiFormatter$1) {
        this(b, n, textDirectionHeuristicCompat);
    }
    
    static boolean access$000(final Locale locale) {
        return isRtlLocale(locale);
    }
    
    static TextDirectionHeuristicCompat access$100() {
        return BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }
    
    static BidiFormatter access$200() {
        return BidiFormatter.DEFAULT_RTL_INSTANCE;
    }
    
    static BidiFormatter access$300() {
        return BidiFormatter.DEFAULT_LTR_INSTANCE;
    }
    
    private static boolean isRtlLocale(final Locale locale) {
        return TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
    }
    
    public boolean isRtl(final String s) {
        return this.mDefaultTextDirectionHeuristicCompat.isRtl(s, 0, s.length());
    }
}
