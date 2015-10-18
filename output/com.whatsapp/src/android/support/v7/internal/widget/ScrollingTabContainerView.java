// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.View$MeasureSpec;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.widget.SpinnerAdapter;
import android.view.View$OnClickListener;
import android.widget.AbsListView$LayoutParams;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutCompat$LayoutParams;
import android.util.AttributeSet;
import android.support.v7.appcompat.R$attr;
import android.support.v7.app.ActionBar$Tab;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.internal.view.ActionBarPolicy;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.animation.Interpolator;
import android.widget.HorizontalScrollView;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterViewCompat$OnItemClickListener
{
    private static final Interpolator sAlphaInterpolator;
    private boolean mAllowCollapse;
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private ScrollingTabContainerView$TabClickListener mTabClickListener;
    private LinearLayoutCompat mTabLayout;
    Runnable mTabSelector;
    private SpinnerCompat mTabSpinner;
    protected final ScrollingTabContainerView$VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;
    
    static {
        sAlphaInterpolator = (Interpolator)new DecelerateInterpolator();
    }
    
    public ScrollingTabContainerView(final Context context) {
        super(context);
        this.mVisAnimListener = new ScrollingTabContainerView$VisibilityAnimListener(this);
        this.setHorizontalScrollBarEnabled(false);
        final ActionBarPolicy value = ActionBarPolicy.get(context);
        this.setContentHeight(value.getTabContainerHeight());
        this.mStackedTabMaxWidth = value.getStackedTabMaxWidth();
        this.addView((View)(this.mTabLayout = this.createTabLayout()), new ViewGroup$LayoutParams(-2, -1));
    }
    
    static LinearLayoutCompat access$200(final ScrollingTabContainerView scrollingTabContainerView) {
        return scrollingTabContainerView.mTabLayout;
    }
    
    static ScrollingTabContainerView$TabView access$300(final ScrollingTabContainerView scrollingTabContainerView, final ActionBar$Tab actionBar$Tab, final boolean b) {
        return scrollingTabContainerView.createTabView(actionBar$Tab, b);
    }
    
    private SpinnerCompat createSpinner() {
        final SpinnerCompat spinnerCompat = new SpinnerCompat(this.getContext(), null, R$attr.actionDropDownStyle);
        spinnerCompat.setLayoutParams((ViewGroup$LayoutParams)new LinearLayoutCompat$LayoutParams(-2, -1));
        spinnerCompat.setOnItemClickListenerInt(this);
        return spinnerCompat;
    }
    
    private LinearLayoutCompat createTabLayout() {
        final LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(this.getContext(), null, R$attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams((ViewGroup$LayoutParams)new LinearLayoutCompat$LayoutParams(-2, -1));
        return linearLayoutCompat;
    }
    
    private ScrollingTabContainerView$TabView createTabView(final ActionBar$Tab actionBar$Tab, final boolean b) {
        final ScrollingTabContainerView$TabView scrollingTabContainerView$TabView = new ScrollingTabContainerView$TabView(this, this.getContext(), actionBar$Tab, b);
        if (b) {
            scrollingTabContainerView$TabView.setBackgroundDrawable((Drawable)null);
            scrollingTabContainerView$TabView.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, this.mContentHeight));
            if (AdapterViewCompat.a == 0) {
                return scrollingTabContainerView$TabView;
            }
        }
        scrollingTabContainerView$TabView.setFocusable(true);
        if (this.mTabClickListener == null) {
            this.mTabClickListener = new ScrollingTabContainerView$TabClickListener(this, null);
        }
        scrollingTabContainerView$TabView.setOnClickListener((View$OnClickListener)this.mTabClickListener);
        return scrollingTabContainerView$TabView;
    }
    
    private boolean isCollapsed() {
        return this.mTabSpinner != null && this.mTabSpinner.getParent() == this;
    }
    
    private void performCollapse() {
        if (this.isCollapsed()) {
            return;
        }
        if (this.mTabSpinner == null) {
            this.mTabSpinner = this.createSpinner();
        }
        this.removeView((View)this.mTabLayout);
        this.addView((View)this.mTabSpinner, new ViewGroup$LayoutParams(-2, -1));
        if (this.mTabSpinner.getAdapter() == null) {
            this.mTabSpinner.setAdapter((SpinnerAdapter)new ScrollingTabContainerView$TabAdapter(this, null));
        }
        if (this.mTabSelector != null) {
            this.removeCallbacks(this.mTabSelector);
            this.mTabSelector = null;
        }
        this.mTabSpinner.setSelection(this.mSelectedTabIndex);
    }
    
    private boolean performExpand() {
        if (!this.isCollapsed()) {
            return false;
        }
        this.removeView((View)this.mTabSpinner);
        this.addView((View)this.mTabLayout, new ViewGroup$LayoutParams(-2, -1));
        this.setTabSelected(this.mTabSpinner.getSelectedItemPosition());
        return false;
    }
    
    public void animateToTab(final int n) {
        final View child = this.mTabLayout.getChildAt(n);
        if (this.mTabSelector != null) {
            this.removeCallbacks(this.mTabSelector);
        }
        this.post(this.mTabSelector = new ScrollingTabContainerView$1(this, child));
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mTabSelector != null) {
            this.post(this.mTabSelector);
        }
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        final ActionBarPolicy value = ActionBarPolicy.get(this.getContext());
        this.setContentHeight(value.getTabContainerHeight());
        this.mStackedTabMaxWidth = value.getStackedTabMaxWidth();
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mTabSelector != null) {
            this.removeCallbacks(this.mTabSelector);
        }
    }
    
    public void onItemClick(final AdapterViewCompat adapterViewCompat, final View view, final int n, final long n2) {
        ((ScrollingTabContainerView$TabView)view).getTab().select();
    }
    
    public void onMeasure(final int n, final int n2) {
        int n3 = 1;
        final int a = AdapterViewCompat.a;
        final int mode = View$MeasureSpec.getMode(n);
        int fillViewport;
        if (mode == 1073741824) {
            fillViewport = n3;
        }
        else {
            fillViewport = 0;
        }
        this.setFillViewport((boolean)(fillViewport != 0));
        final int childCount = this.mTabLayout.getChildCount();
        Label_0121: {
            if (childCount > n3 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
                Label_0096: {
                    if (childCount > 2) {
                        this.mMaxTabWidth = (int)(0.4f * View$MeasureSpec.getSize(n));
                        if (a == 0) {
                            break Label_0096;
                        }
                    }
                    this.mMaxTabWidth = View$MeasureSpec.getSize(n) / 2;
                }
                this.mMaxTabWidth = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
                if (a == 0) {
                    break Label_0121;
                }
            }
            this.mMaxTabWidth = -1;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
        if (fillViewport || !this.mAllowCollapse) {
            n3 = 0;
        }
        Label_0197: {
            if (n3 != 0) {
                this.mTabLayout.measure(0, measureSpec);
                if (this.mTabLayout.getMeasuredWidth() > View$MeasureSpec.getSize(n)) {
                    this.performCollapse();
                    if (a == 0) {
                        break Label_0197;
                    }
                }
                this.performExpand();
                if (a == 0) {
                    break Label_0197;
                }
            }
            this.performExpand();
        }
        final int measuredWidth = this.getMeasuredWidth();
        super.onMeasure(n, measureSpec);
        final int measuredWidth2 = this.getMeasuredWidth();
        if (fillViewport && measuredWidth != measuredWidth2) {
            this.setTabSelected(this.mSelectedTabIndex);
        }
    }
    
    public void setAllowCollapse(final boolean mAllowCollapse) {
        this.mAllowCollapse = mAllowCollapse;
    }
    
    public void setContentHeight(final int mContentHeight) {
        this.mContentHeight = mContentHeight;
        this.requestLayout();
    }
    
    public void setTabSelected(final int n) {
        final int a = AdapterViewCompat.a;
        this.mSelectedTabIndex = n;
        int n2;
        for (int childCount = this.mTabLayout.getChildCount(), i = 0; i < childCount; i = n2) {
            final View child = this.mTabLayout.getChildAt(i);
            final boolean selected = i == n;
            child.setSelected(selected);
            if (selected) {
                this.animateToTab(n);
            }
            n2 = i + 1;
            if (a != 0) {
                break;
            }
        }
        if (this.mTabSpinner != null && n >= 0) {
            this.mTabSpinner.setSelection(n);
        }
    }
}
