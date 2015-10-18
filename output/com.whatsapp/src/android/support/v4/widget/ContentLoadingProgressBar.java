// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    private boolean mDismissed;
    private boolean mPostedHide;
    private boolean mPostedShow;
    private long mStartTime;
    
    public ContentLoadingProgressBar(final Context context) {
        this(context, null);
    }
    
    public ContentLoadingProgressBar(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new ContentLoadingProgressBar$1(this);
        this.mDelayedShow = new ContentLoadingProgressBar$2(this);
    }
    
    static boolean access$002(final ContentLoadingProgressBar contentLoadingProgressBar, final boolean mPostedHide) {
        return contentLoadingProgressBar.mPostedHide = mPostedHide;
    }
    
    static long access$102(final ContentLoadingProgressBar contentLoadingProgressBar, final long mStartTime) {
        return contentLoadingProgressBar.mStartTime = mStartTime;
    }
    
    static boolean access$202(final ContentLoadingProgressBar contentLoadingProgressBar, final boolean mPostedShow) {
        return contentLoadingProgressBar.mPostedShow = mPostedShow;
    }
    
    static boolean access$300(final ContentLoadingProgressBar contentLoadingProgressBar) {
        return contentLoadingProgressBar.mDismissed;
    }
    
    private void removeCallbacks() {
        this.removeCallbacks(this.mDelayedHide);
        this.removeCallbacks(this.mDelayedShow);
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.removeCallbacks();
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks();
    }
}
