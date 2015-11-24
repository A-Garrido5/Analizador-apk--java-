// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.View$MeasureSpec;
import android.view.ViewParent;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.text.TextUtils$TruncateAt;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import java.lang.ref.WeakReference;
import android.widget.TextView;
import android.view.ViewGroup;
import android.database.DataSetObserver;

class PagerTitleStrip$PageListener extends DataSetObserver implements ViewPager$OnAdapterChangeListener, ViewPager$OnPageChangeListener
{
    private int mScrollState;
    final /* synthetic */ PagerTitleStrip this$0;
    
    private PagerTitleStrip$PageListener(final PagerTitleStrip this$0) {
        this.this$0 = this$0;
    }
    
    public void onAdapterChanged(final PagerAdapter pagerAdapter, final PagerAdapter pagerAdapter2) {
        this.this$0.updateAdapter(pagerAdapter, pagerAdapter2);
    }
    
    public void onChanged() {
        this.this$0.updateText(this.this$0.mPager.getCurrentItem(), this.this$0.mPager.getAdapter());
        final float n = fcmpl(this.this$0.mLastKnownPositionOffset, 0.0f);
        float access$100 = 0.0f;
        if (n >= 0) {
            access$100 = this.this$0.mLastKnownPositionOffset;
        }
        this.this$0.updateTextPositions(this.this$0.mPager.getCurrentItem(), access$100, true);
    }
    
    public void onPageScrollStateChanged(final int mScrollState) {
        this.mScrollState = mScrollState;
    }
    
    public void onPageScrolled(int n, final float n2, final int n3) {
        if (n2 > 0.5f) {
            ++n;
        }
        this.this$0.updateTextPositions(n, n2, false);
    }
    
    public void onPageSelected(final int n) {
        if (this.mScrollState == 0) {
            this.this$0.updateText(this.this$0.mPager.getCurrentItem(), this.this$0.mPager.getAdapter());
            final float n2 = fcmpl(this.this$0.mLastKnownPositionOffset, 0.0f);
            float access$100 = 0.0f;
            if (n2 >= 0) {
                access$100 = this.this$0.mLastKnownPositionOffset;
            }
            this.this$0.updateTextPositions(this.this$0.mPager.getCurrentItem(), access$100, true);
        }
    }
}
