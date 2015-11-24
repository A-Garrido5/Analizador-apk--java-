// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.content.res.TypedArray;
import android.support.v7.appcompat.R$styleable;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.view.View$MeasureSpec;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.view.ContextThemeWrapper;
import android.support.v7.appcompat.R$attr;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.ActionMenuPresenter;
import android.view.animation.Interpolator;
import android.view.ViewGroup;

abstract class AbsActionBarView extends ViewGroup
{
    private static final Interpolator sAlphaInterpolator;
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected boolean mSplitActionBar;
    protected ViewGroup mSplitView;
    protected final AbsActionBarView$VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;
    
    static {
        sAlphaInterpolator = (Interpolator)new DecelerateInterpolator();
    }
    
    AbsActionBarView(final Context context) {
        this(context, null);
    }
    
    AbsActionBarView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    AbsActionBarView(final Context mPopupContext, final AttributeSet set, final int n) {
        super(mPopupContext, set, n);
        this.mVisAnimListener = new AbsActionBarView$VisibilityAnimListener(this);
        final TypedValue typedValue = new TypedValue();
        if (mPopupContext.getTheme().resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.mPopupContext = (Context)new ContextThemeWrapper(mPopupContext, typedValue.resourceId);
            if (AdapterViewCompat.a == 0) {
                return;
            }
        }
        this.mPopupContext = mPopupContext;
    }
    
    protected static int next(final int n, final int n2, final boolean b) {
        if (b) {
            return n - n2;
        }
        return n + n2;
    }
    
    public void animateToVisibility(final int n) {
        final int a = AdapterViewCompat.a;
        if (this.mVisibilityAnim != null) {
            this.mVisibilityAnim.cancel();
        }
        if (n == 0) {
            if (this.getVisibility() != 0) {
                ViewCompat.setAlpha((View)this, 0.0f);
                if (this.mSplitView != null && this.mMenuView != null) {
                    ViewCompat.setAlpha((View)this.mMenuView, 0.0f);
                }
            }
            final ViewPropertyAnimatorCompat alpha = ViewCompat.animate((View)this).alpha(1.0f);
            alpha.setDuration(200L);
            alpha.setInterpolator(AbsActionBarView.sAlphaInterpolator);
            Label_0188: {
                if (this.mSplitView != null && this.mMenuView != null) {
                    final ViewPropertyAnimatorCompatSet set = new ViewPropertyAnimatorCompatSet();
                    final ViewPropertyAnimatorCompat alpha2 = ViewCompat.animate((View)this.mMenuView).alpha(1.0f);
                    alpha2.setDuration(200L);
                    set.setListener(this.mVisAnimListener.withFinalVisibility(alpha, n));
                    set.play(alpha).play(alpha2);
                    set.start();
                    if (a == 0) {
                        break Label_0188;
                    }
                }
                alpha.setListener(this.mVisAnimListener.withFinalVisibility(alpha, n));
                alpha.start();
            }
            if (a == 0) {
                return;
            }
        }
        final ViewPropertyAnimatorCompat alpha3 = ViewCompat.animate((View)this).alpha(0.0f);
        alpha3.setDuration(200L);
        alpha3.setInterpolator(AbsActionBarView.sAlphaInterpolator);
        if (this.mSplitView != null && this.mMenuView != null) {
            final ViewPropertyAnimatorCompatSet set2 = new ViewPropertyAnimatorCompatSet();
            final ViewPropertyAnimatorCompat alpha4 = ViewCompat.animate((View)this.mMenuView).alpha(0.0f);
            alpha4.setDuration(200L);
            set2.setListener(this.mVisAnimListener.withFinalVisibility(alpha3, n));
            set2.play(alpha3).play(alpha4);
            set2.start();
            if (a == 0) {
                return;
            }
        }
        alpha3.setListener(this.mVisAnimListener.withFinalVisibility(alpha3, n));
        alpha3.start();
    }
    
    protected int measureChildView(final View view, final int n, final int n2, final int n3) {
        view.measure(View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), n2);
        return Math.max(0, n - view.getMeasuredWidth() - n3);
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes((AttributeSet)null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        this.setContentHeight(obtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.onConfigurationChanged(configuration);
        }
    }
    
    protected int positionChild(final View view, final int n, final int n2, final int n3, final boolean b) {
        int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        final int n4 = n2 + (n3 - measuredHeight) / 2;
        Label_0066: {
            if (b) {
                view.layout(n - measuredWidth, n4, n, n4 + measuredHeight);
                if (AdapterViewCompat.a == 0) {
                    break Label_0066;
                }
            }
            view.layout(n, n4, n + measuredWidth, measuredHeight + n4);
        }
        if (b) {
            measuredWidth = -measuredWidth;
        }
        return measuredWidth;
    }
    
    public void setContentHeight(final int mContentHeight) {
        this.mContentHeight = mContentHeight;
        this.requestLayout();
    }
}
