// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public class NestedScrollingChildHelper
{
    private boolean mIsNestedScrollingEnabled;
    private ViewParent mNestedScrollingParent;
    private int[] mTempNestedScrollConsumed;
    private final View mView;
    
    public NestedScrollingChildHelper(final View mView) {
        this.mView = mView;
    }
    
    public boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.isNestedScrollingEnabled() && this.mNestedScrollingParent != null && ViewParentCompat.onNestedFling(this.mNestedScrollingParent, this.mView, n, n2, b);
    }
    
    public boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.isNestedScrollingEnabled() && this.mNestedScrollingParent != null && ViewParentCompat.onNestedPreFling(this.mNestedScrollingParent, this.mView, n, n2);
    }
    
    public boolean dispatchNestedPreScroll(final int n, final int n2, int[] mTempNestedScrollConsumed, final int[] array) {
        final boolean nestedScrollingEnabled = this.isNestedScrollingEnabled();
        boolean b = false;
        if (nestedScrollingEnabled) {
            final ViewParent mNestedScrollingParent = this.mNestedScrollingParent;
            b = false;
            if (mNestedScrollingParent != null) {
                if (n != 0 || n2 != 0) {
                    int n3;
                    int n4;
                    if (array != null) {
                        this.mView.getLocationInWindow(array);
                        n3 = array[0];
                        n4 = array[1];
                    }
                    else {
                        n4 = 0;
                        n3 = 0;
                    }
                    if (mTempNestedScrollConsumed == null) {
                        if (this.mTempNestedScrollConsumed == null) {
                            this.mTempNestedScrollConsumed = new int[2];
                        }
                        mTempNestedScrollConsumed = this.mTempNestedScrollConsumed;
                    }
                    mTempNestedScrollConsumed[1] = (mTempNestedScrollConsumed[0] = 0);
                    ViewParentCompat.onNestedPreScroll(this.mNestedScrollingParent, this.mView, n, n2, mTempNestedScrollConsumed);
                    if (array != null) {
                        this.mView.getLocationInWindow(array);
                        array[0] -= n3;
                        array[1] -= n4;
                    }
                    if (mTempNestedScrollConsumed[0] == 0) {
                        final int n5 = mTempNestedScrollConsumed[1];
                        b = false;
                        if (n5 == 0) {
                            return b;
                        }
                    }
                    b = true;
                }
                else {
                    b = false;
                    if (array != null) {
                        array[1] = (array[0] = 0);
                        return false;
                    }
                }
            }
        }
        return b;
    }
    
    public boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        final boolean nestedScrollingEnabled = this.isNestedScrollingEnabled();
        boolean b = false;
        if (nestedScrollingEnabled) {
            final ViewParent mNestedScrollingParent = this.mNestedScrollingParent;
            b = false;
            if (mNestedScrollingParent != null) {
                if (n != 0 || n2 != 0 || n3 != 0 || n4 != 0) {
                    int n6;
                    int n7;
                    if (array != null) {
                        this.mView.getLocationInWindow(array);
                        final int n5 = array[0];
                        n6 = array[1];
                        n7 = n5;
                    }
                    else {
                        n6 = 0;
                        n7 = 0;
                    }
                    ViewParentCompat.onNestedScroll(this.mNestedScrollingParent, this.mView, n, n2, n3, n4);
                    if (array != null) {
                        this.mView.getLocationInWindow(array);
                        array[0] -= n7;
                        array[1] -= n6;
                    }
                    b = true;
                }
                else {
                    b = false;
                    if (array != null) {
                        array[1] = (array[0] = 0);
                        return false;
                    }
                }
            }
        }
        return b;
    }
    
    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingParent != null;
    }
    
    public boolean isNestedScrollingEnabled() {
        return this.mIsNestedScrollingEnabled;
    }
    
    public void setNestedScrollingEnabled(final boolean mIsNestedScrollingEnabled) {
        if (this.mIsNestedScrollingEnabled) {
            ViewCompat.stopNestedScroll(this.mView);
        }
        this.mIsNestedScrollingEnabled = mIsNestedScrollingEnabled;
    }
    
    public boolean startNestedScroll(final int n) {
        final int a = ViewPager.a;
        if (this.hasNestedScrollingParent()) {
            return true;
        }
        if (this.isNestedScrollingEnabled()) {
            ViewParent mNestedScrollingParent = this.mView.getParent();
            View mView = this.mView;
            while (mNestedScrollingParent != null) {
                if (ViewParentCompat.onStartNestedScroll(mNestedScrollingParent, mView, this.mView, n)) {
                    ViewParentCompat.onNestedScrollAccepted(this.mNestedScrollingParent = mNestedScrollingParent, mView, this.mView, n);
                    return true;
                }
                if (mNestedScrollingParent instanceof View) {
                    mView = (View)mNestedScrollingParent;
                }
                mNestedScrollingParent = mNestedScrollingParent.getParent();
                if (a != 0) {
                    break;
                }
            }
        }
        return false;
    }
    
    public void stopNestedScroll() {
        if (this.mNestedScrollingParent != null) {
            ViewParentCompat.onStopNestedScroll(this.mNestedScrollingParent, this.mView);
            this.mNestedScrollingParent = null;
        }
    }
}
