// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.database.DataSetObserver;
import android.content.res.Resources$NotFoundException;
import android.view.View$MeasureSpec;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.os.SystemClock;
import android.view.SoundEffectConstants;
import android.view.FocusFinder;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import java.util.List;
import java.util.Collections;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.graphics.Paint;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.Rect;
import java.lang.reflect.Method;
import android.widget.Scroller;
import android.os.Parcelable;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.EdgeEffectCompat;
import java.util.ArrayList;
import android.view.animation.Interpolator;
import java.util.Comparator;
import android.view.ViewGroup;

public class ViewPager extends ViewGroup
{
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator COMPARATOR;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int[] LAYOUT_ATTRS;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE;
    private static final Interpolator sInterpolator;
    private static final ViewPager$ViewPositionComparator sPositionComparator;
    private int mActivePointerId;
    private PagerAdapter mAdapter;
    private ViewPager$OnAdapterChangeListener mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    private int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mIgnoreGutter;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private ViewPager$OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffectCompat mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private ViewPager$PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private ViewPager$OnPageChangeListener mOnPageChangeListener;
    private int mPageMargin;
    private ViewPager$PageTransformer mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffectCompat mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final ViewPager$ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    
    static {
        LAYOUT_ATTRS = new int[] { 16842931 };
        COMPARATOR = new ViewPager$1();
        sInterpolator = (Interpolator)new ViewPager$2();
        sPositionComparator = new ViewPager$ViewPositionComparator();
    }
    
    public ViewPager(final Context context) {
        super(context);
        this.mItems = new ArrayList();
        this.mTempItem = new ViewPager$ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new ViewPager$3(this);
        this.mScrollState = 0;
        this.initViewPager();
    }
    
    public ViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.mItems = new ArrayList();
        this.mTempItem = new ViewPager$ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new ViewPager$3(this);
        this.mScrollState = 0;
        this.initViewPager();
    }
    
    private void calculatePageOffsets(final ViewPager$ItemInfo viewPager$ItemInfo, final int n, final ViewPager$ItemInfo viewPager$ItemInfo2) {
        final int count = this.mAdapter.getCount();
        final int clientWidth = this.getClientWidth();
        float n2;
        if (clientWidth > 0) {
            n2 = this.mPageMargin / clientWidth;
        }
        else {
            n2 = 0.0f;
        }
        if (viewPager$ItemInfo2 != null) {
            final int position = viewPager$ItemInfo2.position;
            if (position < viewPager$ItemInfo.position) {
                float offset = n2 + (viewPager$ItemInfo2.offset + viewPager$ItemInfo2.widthFactor);
                for (int i = position + 1, n3 = 0; i <= viewPager$ItemInfo.position && n3 < this.mItems.size(); ++i) {
                    ViewPager$ItemInfo viewPager$ItemInfo3;
                    for (viewPager$ItemInfo3 = this.mItems.get(n3); i > viewPager$ItemInfo3.position && n3 < -1 + this.mItems.size(); ++n3, viewPager$ItemInfo3 = this.mItems.get(n3)) {}
                    while (i < viewPager$ItemInfo3.position) {
                        offset += n2 + this.mAdapter.getPageWidth(i);
                        ++i;
                    }
                    viewPager$ItemInfo3.offset = offset;
                    offset += n2 + viewPager$ItemInfo3.widthFactor;
                }
            }
            else if (position > viewPager$ItemInfo.position) {
                int n4 = -1 + this.mItems.size();
                float offset2 = viewPager$ItemInfo2.offset;
                for (int j = position - 1; j >= viewPager$ItemInfo.position && n4 >= 0; --j) {
                    ViewPager$ItemInfo viewPager$ItemInfo4;
                    for (viewPager$ItemInfo4 = this.mItems.get(n4); j < viewPager$ItemInfo4.position && n4 > 0; --n4, viewPager$ItemInfo4 = this.mItems.get(n4)) {}
                    while (j > viewPager$ItemInfo4.position) {
                        offset2 -= n2 + this.mAdapter.getPageWidth(j);
                        --j;
                    }
                    offset2 -= n2 + viewPager$ItemInfo4.widthFactor;
                    viewPager$ItemInfo4.offset = offset2;
                }
            }
        }
        final int size = this.mItems.size();
        float offset3 = viewPager$ItemInfo.offset;
        int k = -1 + viewPager$ItemInfo.position;
        float offset4;
        if (viewPager$ItemInfo.position == 0) {
            offset4 = viewPager$ItemInfo.offset;
        }
        else {
            offset4 = -3.4028235E38f;
        }
        this.mFirstOffset = offset4;
        float mLastOffset;
        if (viewPager$ItemInfo.position == count - 1) {
            mLastOffset = viewPager$ItemInfo.offset + viewPager$ItemInfo.widthFactor - 1.0f;
        }
        else {
            mLastOffset = Float.MAX_VALUE;
        }
        this.mLastOffset = mLastOffset;
        int n7;
        for (int l = n - 1; l >= 0; l = n7) {
            final ViewPager$ItemInfo viewPager$ItemInfo5 = this.mItems.get(l);
            float n5 = offset3;
            while (k > viewPager$ItemInfo5.position) {
                final PagerAdapter mAdapter = this.mAdapter;
                final int n6 = k - 1;
                n5 -= n2 + mAdapter.getPageWidth(k);
                k = n6;
            }
            offset3 = n5 - (n2 + viewPager$ItemInfo5.widthFactor);
            viewPager$ItemInfo5.offset = offset3;
            if (viewPager$ItemInfo5.position == 0) {
                this.mFirstOffset = offset3;
            }
            n7 = l - 1;
            --k;
        }
        float n8 = n2 + (viewPager$ItemInfo.offset + viewPager$ItemInfo.widthFactor);
        int n9 = 1 + viewPager$ItemInfo.position;
        int n12;
        for (int n10 = n + 1; n10 < size; n10 = n12) {
            final ViewPager$ItemInfo viewPager$ItemInfo6 = this.mItems.get(n10);
            float offset5 = n8;
            while (n9 < viewPager$ItemInfo6.position) {
                final PagerAdapter mAdapter2 = this.mAdapter;
                final int n11 = n9 + 1;
                offset5 += n2 + mAdapter2.getPageWidth(n9);
                n9 = n11;
            }
            if (viewPager$ItemInfo6.position == count - 1) {
                this.mLastOffset = offset5 + viewPager$ItemInfo6.widthFactor - 1.0f;
            }
            viewPager$ItemInfo6.offset = offset5;
            n8 = offset5 + (n2 + viewPager$ItemInfo6.widthFactor);
            n12 = n10 + 1;
            ++n9;
        }
        this.mNeedCalculatePageOffsets = false;
    }
    
    private void completeScroll(final boolean b) {
        boolean b2;
        if (this.mScrollState == 2) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (b2) {
            this.setScrollingCacheEnabled(false);
            this.mScroller.abortAnimation();
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.mScroller.getCurrX();
            final int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
            }
        }
        this.mPopulatePending = false;
        int i = 0;
        int n = b2 ? 1 : 0;
        while (i < this.mItems.size()) {
            final ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(i);
            if (viewPager$ItemInfo.scrolling) {
                viewPager$ItemInfo.scrolling = false;
                n = 1;
            }
            ++i;
        }
        if (n != 0) {
            if (!b) {
                this.mEndScrollRunnable.run();
                return;
            }
            ViewCompat.postOnAnimation((View)this, this.mEndScrollRunnable);
        }
    }
    
    private int determineTargetPage(int max, final float n, final int n2, final int n3) {
        if (Math.abs(n3) > this.mFlingDistance && Math.abs(n2) > this.mMinimumVelocity) {
            if (n2 <= 0) {
                ++max;
            }
        }
        else {
            float n4;
            if (max >= this.mCurItem) {
                n4 = 0.4f;
            }
            else {
                n4 = 0.6f;
            }
            max = (int)(n4 + (n + max));
        }
        if (this.mItems.size() > 0) {
            max = Math.max(this.mItems.get(0).position, Math.min(max, this.mItems.get(-1 + this.mItems.size()).position));
        }
        return max;
    }
    
    private void enableLayers(final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            int n;
            if (b) {
                n = 2;
            }
            else {
                n = 0;
            }
            ViewCompat.setLayerType(this.getChildAt(i), n, null);
        }
    }
    
    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }
    
    private Rect getChildRectInPagerCoordinates(final Rect rect, final View view) {
        Rect rect2;
        if (rect == null) {
            rect2 = new Rect();
        }
        else {
            rect2 = rect;
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager viewPager;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof ViewGroup && viewParent != this; viewParent = viewPager.getParent()) {
            viewPager = (ViewPager)viewParent;
            rect2.left += viewPager.getLeft();
            rect2.right += viewPager.getRight();
            rect2.top += viewPager.getTop();
            rect2.bottom += viewPager.getBottom();
        }
        return rect2;
    }
    
    private int getClientWidth() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }
    
    private ViewPager$ItemInfo infoForCurrentScrollPosition() {
        final int clientWidth = this.getClientWidth();
        float n;
        if (clientWidth > 0) {
            n = this.getScrollX() / clientWidth;
        }
        else {
            n = 0.0f;
        }
        float n2;
        if (clientWidth > 0) {
            n2 = this.mPageMargin / clientWidth;
        }
        else {
            n2 = 0.0f;
        }
        float n3 = 0.0f;
        float n4 = 0.0f;
        int n5 = -1;
        int i = 0;
        int n6 = 1;
        ViewPager$ItemInfo viewPager$ItemInfo = null;
        while (i < this.mItems.size()) {
            final ViewPager$ItemInfo viewPager$ItemInfo2 = this.mItems.get(i);
            int n7;
            ViewPager$ItemInfo viewPager$ItemInfo3;
            if (n6 == 0 && viewPager$ItemInfo2.position != n5 + 1) {
                final ViewPager$ItemInfo mTempItem = this.mTempItem;
                mTempItem.offset = n2 + (n3 + n4);
                mTempItem.position = n5 + 1;
                mTempItem.widthFactor = this.mAdapter.getPageWidth(mTempItem.position);
                n7 = i - 1;
                viewPager$ItemInfo3 = mTempItem;
            }
            else {
                n7 = i;
                viewPager$ItemInfo3 = viewPager$ItemInfo2;
            }
            final float offset = viewPager$ItemInfo3.offset;
            final float n8 = n2 + (offset + viewPager$ItemInfo3.widthFactor);
            if (n6 == 0 && n < offset) {
                break;
            }
            if (n < n8 || n7 == -1 + this.mItems.size()) {
                viewPager$ItemInfo = viewPager$ItemInfo3;
                break;
            }
            final int position = viewPager$ItemInfo3.position;
            final float widthFactor = viewPager$ItemInfo3.widthFactor;
            final int n9 = n7 + 1;
            n4 = offset;
            n5 = position;
            n3 = widthFactor;
            viewPager$ItemInfo = viewPager$ItemInfo3;
            i = n9;
            n6 = 0;
        }
        return viewPager$ItemInfo;
    }
    
    private boolean isGutterDrag(final float n, final float n2) {
        return (n < this.mGutterSize && n2 > 0.0f) || (n > this.getWidth() - this.mGutterSize && n2 < 0.0f);
    }
    
    private void onSecondaryPointerUp(final MotionEvent motionEvent) {
        final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.mLastMotionX = MotionEventCompat.getX(motionEvent, n);
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, n);
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.clear();
            }
        }
    }
    
    private boolean pageScrolled(final int n) {
        boolean b;
        if (this.mItems.size() == 0) {
            this.mCalledSuper = false;
            this.onPageScrolled(0, 0.0f, 0);
            final boolean mCalledSuper = this.mCalledSuper;
            b = false;
            if (!mCalledSuper) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        }
        else {
            final ViewPager$ItemInfo infoForCurrentScrollPosition = this.infoForCurrentScrollPosition();
            final int clientWidth = this.getClientWidth();
            final int n2 = clientWidth + this.mPageMargin;
            final float n3 = this.mPageMargin / clientWidth;
            final int position = infoForCurrentScrollPosition.position;
            final float n4 = (n / clientWidth - infoForCurrentScrollPosition.offset) / (n3 + infoForCurrentScrollPosition.widthFactor);
            final int n5 = (int)(n4 * n2);
            this.mCalledSuper = false;
            this.onPageScrolled(position, n4, n5);
            if (!this.mCalledSuper) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            b = true;
        }
        return b;
    }
    
    private boolean performDrag(final float mLastMotionX) {
        boolean b = true;
        final float n = this.mLastMotionX - mLastMotionX;
        this.mLastMotionX = mLastMotionX;
        final float n2 = n + this.getScrollX();
        final int clientWidth = this.getClientWidth();
        float n3 = clientWidth * this.mFirstOffset;
        final float n4 = clientWidth * this.mLastOffset;
        final ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(0);
        final ViewPager$ItemInfo viewPager$ItemInfo2 = this.mItems.get(-1 + this.mItems.size());
        boolean b2;
        if (viewPager$ItemInfo.position != 0) {
            n3 = viewPager$ItemInfo.offset * clientWidth;
            b2 = false;
        }
        else {
            b2 = b;
        }
        float n5;
        if (viewPager$ItemInfo2.position != -1 + this.mAdapter.getCount()) {
            n5 = viewPager$ItemInfo2.offset * clientWidth;
            b = false;
        }
        else {
            n5 = n4;
        }
        boolean b3;
        if (n2 < n3) {
            b3 = false;
            if (b2) {
                b3 = this.mLeftEdge.onPull(Math.abs(n3 - n2) / clientWidth);
            }
        }
        else if (n2 > n5) {
            b3 = false;
            if (b) {
                b3 = this.mRightEdge.onPull(Math.abs(n2 - n5) / clientWidth);
            }
            n3 = n5;
        }
        else {
            n3 = n2;
            b3 = false;
        }
        this.mLastMotionX += n3 - (int)n3;
        this.scrollTo((int)n3, this.getScrollY());
        this.pageScrolled((int)n3);
        return b3;
    }
    
    private void recomputeScrollPosition(final int n, final int n2, final int n3, final int n4) {
        if (n2 > 0 && !this.mItems.isEmpty()) {
            final int n5 = this.getScrollX() / (n4 + (n2 - this.getPaddingLeft() - this.getPaddingRight())) * (n3 + (n - this.getPaddingLeft() - this.getPaddingRight()));
            this.scrollTo(n5, this.getScrollY());
            if (!this.mScroller.isFinished()) {
                this.mScroller.startScroll(n5, 0, (int)(this.infoForPosition(this.mCurItem).offset * n), 0, this.mScroller.getDuration() - this.mScroller.timePassed());
            }
        }
        else {
            final ViewPager$ItemInfo infoForPosition = this.infoForPosition(this.mCurItem);
            float min;
            if (infoForPosition != null) {
                min = Math.min(infoForPosition.offset, this.mLastOffset);
            }
            else {
                min = 0.0f;
            }
            final int n6 = (int)(min * (n - this.getPaddingLeft() - this.getPaddingRight()));
            if (n6 != this.getScrollX()) {
                this.completeScroll(false);
                this.scrollTo(n6, this.getScrollY());
            }
        }
    }
    
    private void removeNonDecorViews() {
        for (int i = 0; i < this.getChildCount(); ++i) {
            if (!((ViewPager$LayoutParams)this.getChildAt(i).getLayoutParams()).isDecor) {
                this.removeViewAt(i);
                --i;
            }
        }
    }
    
    private void requestParentDisallowInterceptTouchEvent(final boolean b) {
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(b);
        }
    }
    
    private void scrollToItem(final int n, final boolean b, final int n2, final boolean b2) {
        final ViewPager$ItemInfo infoForPosition = this.infoForPosition(n);
        int n3;
        if (infoForPosition != null) {
            n3 = (int)(this.getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.offset, this.mLastOffset)));
        }
        else {
            n3 = 0;
        }
        if (b) {
            this.smoothScrollTo(n3, 0, n2);
            if (b2 && this.mOnPageChangeListener != null) {
                this.mOnPageChangeListener.onPageSelected(n);
            }
            if (b2 && this.mInternalPageChangeListener != null) {
                this.mInternalPageChangeListener.onPageSelected(n);
            }
            return;
        }
        if (b2 && this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageSelected(n);
        }
        if (b2 && this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageSelected(n);
        }
        this.completeScroll(false);
        this.scrollTo(n3, 0);
        this.pageScrolled(n3);
    }
    
    private void setScrollState(final int mScrollState) {
        if (this.mScrollState != mScrollState) {
            this.mScrollState = mScrollState;
            if (this.mPageTransformer != null) {
                this.enableLayers(mScrollState != 0);
            }
            if (this.mOnPageChangeListener != null) {
                this.mOnPageChangeListener.onPageScrollStateChanged(mScrollState);
            }
        }
    }
    
    private void setScrollingCacheEnabled(final boolean mScrollingCacheEnabled) {
        if (this.mScrollingCacheEnabled != mScrollingCacheEnabled) {
            this.mScrollingCacheEnabled = mScrollingCacheEnabled;
        }
    }
    
    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            if (this.mDrawingOrderedChildren == null) {
                this.mDrawingOrderedChildren = new ArrayList();
            }
            else {
                this.mDrawingOrderedChildren.clear();
            }
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.mDrawingOrderedChildren.add(this.getChildAt(i));
            }
            Collections.sort((List<Object>)this.mDrawingOrderedChildren, ViewPager.sPositionComparator);
        }
    }
    
    public void addFocusables(final ArrayList list, final int n, final int n2) {
        final int size = list.size();
        final int descendantFocusability = this.getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (child.getVisibility() == 0) {
                    final ViewPager$ItemInfo infoForChild = this.infoForChild(child);
                    if (infoForChild != null && infoForChild.position == this.mCurItem) {
                        child.addFocusables(list, n, n2);
                    }
                }
            }
        }
        if ((descendantFocusability != 262144 || size == list.size()) && this.isFocusable() && ((n2 & 0x1) != 0x1 || !this.isInTouchMode() || this.isFocusableInTouchMode()) && list != null) {
            list.add(this);
        }
    }
    
    ViewPager$ItemInfo addNewItem(final int position, final int n) {
        final ViewPager$ItemInfo viewPager$ItemInfo = new ViewPager$ItemInfo();
        viewPager$ItemInfo.position = position;
        viewPager$ItemInfo.object = this.mAdapter.instantiateItem(this, position);
        viewPager$ItemInfo.widthFactor = this.mAdapter.getPageWidth(position);
        if (n < 0 || n >= this.mItems.size()) {
            this.mItems.add(viewPager$ItemInfo);
            return viewPager$ItemInfo;
        }
        this.mItems.add(n, viewPager$ItemInfo);
        return viewPager$ItemInfo;
    }
    
    public void addTouchables(final ArrayList list) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final ViewPager$ItemInfo infoForChild = this.infoForChild(child);
                if (infoForChild != null && infoForChild.position == this.mCurItem) {
                    child.addTouchables(list);
                }
            }
        }
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        ViewGroup$LayoutParams generateLayoutParams;
        if (!this.checkLayoutParams(viewGroup$LayoutParams)) {
            generateLayoutParams = this.generateLayoutParams(viewGroup$LayoutParams);
        }
        else {
            generateLayoutParams = viewGroup$LayoutParams;
        }
        final ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)generateLayoutParams;
        viewPager$LayoutParams.isDecor |= (view instanceof ViewPager$Decor);
        if (!this.mInLayout) {
            super.addView(view, n, generateLayoutParams);
            return;
        }
        if (viewPager$LayoutParams != null && viewPager$LayoutParams.isDecor) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        viewPager$LayoutParams.needsMeasure = true;
        this.addViewInLayout(view, n, generateLayoutParams);
    }
    
    public boolean arrowScroll(final int n) {
        final View focus = this.findFocus();
        View view = null;
        Label_0012: {
            if (focus == this) {
                view = null;
            }
            else {
                Label_0370: {
                    if (focus != null) {
                        ViewParent viewParent = focus.getParent();
                        while (true) {
                            while (viewParent instanceof ViewGroup) {
                                if (viewParent == this) {
                                    final int n2 = 1;
                                    if (n2 == 0) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(focus.getClass().getSimpleName());
                                        for (ViewParent viewParent2 = focus.getParent(); viewParent2 instanceof ViewGroup; viewParent2 = viewParent2.getParent()) {
                                            sb.append(" => ").append(viewParent2.getClass().getSimpleName());
                                        }
                                        Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                                        view = null;
                                        break Label_0012;
                                    }
                                    break Label_0370;
                                }
                                else {
                                    viewParent = viewParent.getParent();
                                }
                            }
                            final int n2 = 0;
                            continue;
                        }
                    }
                }
                view = focus;
            }
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, n);
        while (true) {
            Label_0364: {
                boolean b;
                if (nextFocus != null && nextFocus != view) {
                    if (n == 17) {
                        final int left = this.getChildRectInPagerCoordinates(this.mTempRect, nextFocus).left;
                        final int left2 = this.getChildRectInPagerCoordinates(this.mTempRect, view).left;
                        if (view != null && left >= left2) {
                            b = this.pageLeft();
                        }
                        else {
                            b = nextFocus.requestFocus();
                        }
                    }
                    else {
                        if (n != 66) {
                            break Label_0364;
                        }
                        final int left3 = this.getChildRectInPagerCoordinates(this.mTempRect, nextFocus).left;
                        final int left4 = this.getChildRectInPagerCoordinates(this.mTempRect, view).left;
                        if (view != null && left3 <= left4) {
                            b = this.pageRight();
                        }
                        else {
                            b = nextFocus.requestFocus();
                        }
                    }
                }
                else if (n == 17 || n == 1) {
                    b = this.pageLeft();
                }
                else {
                    if (n != 66 && n != 2) {
                        break Label_0364;
                    }
                    b = this.pageRight();
                }
                if (b) {
                    this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(n));
                }
                return b;
            }
            boolean b = false;
            continue;
        }
    }
    
    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        this.setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        else {
            this.mVelocityTracker.clear();
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }
    
    protected boolean canScroll(final View view, final boolean b, final int n, final int n2, final int n3) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = -1 + viewGroup.getChildCount(); i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                if (n2 + scrollX >= child.getLeft() && n2 + scrollX < child.getRight() && n3 + scrollY >= child.getTop() && n3 + scrollY < child.getBottom() && this.canScroll(child, true, n, n2 + scrollX - child.getLeft(), n3 + scrollY - child.getTop())) {
                    return true;
                }
            }
        }
        Label_0141: {
            break Label_0141;
        }
        if (!b || !ViewCompat.canScrollHorizontally(view, -n)) {
            return false;
        }
        return true;
    }
    
    public boolean canScrollHorizontally(final int n) {
        boolean b = true;
        if (this.mAdapter != null) {
            final int clientWidth = this.getClientWidth();
            final int scrollX = this.getScrollX();
            if (n < 0) {
                if (scrollX <= (int)(clientWidth * this.mFirstOffset)) {
                    b = false;
                }
                return b;
            }
            if (n > 0) {
                if (scrollX >= (int)(clientWidth * this.mLastOffset)) {
                    b = false;
                }
                return b;
            }
        }
        return false;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof ViewPager$LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void computeScroll() {
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.mScroller.getCurrX();
            final int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
                if (!this.pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    this.scrollTo(0, currY);
                }
            }
            ViewCompat.postInvalidateOnAnimation((View)this);
            return;
        }
        this.completeScroll(true);
    }
    
    void dataSetChanged() {
        final int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        int n;
        if (this.mItems.size() < 1 + 2 * this.mOffscreenPageLimit && this.mItems.size() < count) {
            n = 1;
        }
        else {
            n = 0;
        }
        final int mCurItem = this.mCurItem;
        int n2 = 0;
        int n3 = mCurItem;
        int n4 = n;
        int n10;
        for (int i = 0; i < this.mItems.size(); i = n10) {
            final ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(i);
            final int itemPosition = this.mAdapter.getItemPosition(viewPager$ItemInfo.object);
            int n5;
            int n6;
            int n7;
            int n8;
            if (itemPosition == -1) {
                n5 = i;
                n6 = n2;
                n7 = n3;
                n8 = n4;
            }
            else if (itemPosition == -2) {
                this.mItems.remove(i);
                final int n9 = i - 1;
                if (n2 == 0) {
                    this.mAdapter.startUpdate(this);
                    n2 = 1;
                }
                this.mAdapter.destroyItem(this, viewPager$ItemInfo.position, viewPager$ItemInfo.object);
                if (this.mCurItem == viewPager$ItemInfo.position) {
                    final int max = Math.max(0, Math.min(this.mCurItem, count - 1));
                    n5 = n9;
                    n6 = n2;
                    n7 = max;
                    n8 = 1;
                }
                else {
                    n5 = n9;
                    n6 = n2;
                    n7 = n3;
                    n8 = 1;
                }
            }
            else if (viewPager$ItemInfo.position != itemPosition) {
                if (viewPager$ItemInfo.position == this.mCurItem) {
                    n3 = itemPosition;
                }
                viewPager$ItemInfo.position = itemPosition;
                n5 = i;
                n6 = n2;
                n7 = n3;
                n8 = 1;
            }
            else {
                n5 = i;
                n6 = n2;
                n7 = n3;
                n8 = n4;
            }
            n10 = n5 + 1;
            n4 = n8;
            n3 = n7;
            n2 = n6;
        }
        if (n2 != 0) {
            this.mAdapter.finishUpdate(this);
        }
        Collections.sort((List<Object>)this.mItems, ViewPager.COMPARATOR);
        if (n4 != 0) {
            for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
                final ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)this.getChildAt(j).getLayoutParams();
                if (!viewPager$LayoutParams.isDecor) {
                    viewPager$LayoutParams.widthFactor = 0.0f;
                }
            }
            this.setCurrentItemInternal(n3, false, true);
            this.requestLayout();
        }
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.executeKeyEvent(keyEvent);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 4096) {
            final int childCount = this.getChildCount();
            int n = 0;
            while (true) {
                final boolean dispatchPopulateAccessibilityEvent = false;
                if (n >= childCount) {
                    return dispatchPopulateAccessibilityEvent;
                }
                final View child = this.getChildAt(n);
                if (child.getVisibility() == 0) {
                    final ViewPager$ItemInfo infoForChild = this.infoForChild(child);
                    if (infoForChild != null && infoForChild.position == this.mCurItem && child.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                        break;
                    }
                }
                ++n;
            }
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    float distanceInfluenceForSnapDuration(final float n) {
        return (float)Math.sin((float)(0.4712389167638204 * (n - 0.5f)));
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        final int overScrollMode = ViewCompat.getOverScrollMode((View)this);
        boolean b;
        if (overScrollMode == 0 || (overScrollMode == 1 && this.mAdapter != null && this.mAdapter.getCount() > 1)) {
            final boolean finished = this.mLeftEdge.isFinished();
            b = false;
            if (!finished) {
                final int save = canvas.save();
                final int n = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                final int width = this.getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float)(-n + this.getPaddingTop()), this.mFirstOffset * width);
                this.mLeftEdge.setSize(n, width);
                b = (false | this.mLeftEdge.draw(canvas));
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                final int save2 = canvas.save();
                final int width2 = this.getWidth();
                final int n2 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float)(-this.getPaddingTop()), -(1.0f + this.mLastOffset) * width2);
                this.mRightEdge.setSize(n2, width2);
                b |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
            b = false;
        }
        if (b) {
            ViewCompat.postInvalidateOnAnimation((View)this);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable mMarginDrawable = this.mMarginDrawable;
        if (mMarginDrawable != null && mMarginDrawable.isStateful()) {
            mMarginDrawable.setState(this.getDrawableState());
        }
    }
    
    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        final VelocityTracker mVelocityTracker = this.mVelocityTracker;
        mVelocityTracker.computeCurrentVelocity(1000, (float)this.mMaximumVelocity);
        final int n = (int)VelocityTrackerCompat.getXVelocity(mVelocityTracker, this.mActivePointerId);
        this.mPopulatePending = true;
        final int clientWidth = this.getClientWidth();
        final int scrollX = this.getScrollX();
        final ViewPager$ItemInfo infoForCurrentScrollPosition = this.infoForCurrentScrollPosition();
        this.setCurrentItemInternal(this.determineTargetPage(infoForCurrentScrollPosition.position, (scrollX / clientWidth - infoForCurrentScrollPosition.offset) / infoForCurrentScrollPosition.widthFactor, n, (int)(this.mLastMotionX - this.mInitialMotionX)), true, true, n);
        this.endDrag();
        this.mFakeDragging = false;
    }
    
    public boolean executeKeyEvent(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 21: {
                    return this.arrowScroll(17);
                }
                case 22: {
                    return this.arrowScroll(66);
                }
                case 61: {
                    if (Build$VERSION.SDK_INT < 11) {
                        break;
                    }
                    if (KeyEventCompat.hasNoModifiers(keyEvent)) {
                        return this.arrowScroll(2);
                    }
                    if (KeyEventCompat.hasModifiers(keyEvent, 1)) {
                        return this.arrowScroll(1);
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    public void fakeDragBy(final float n) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        this.mLastMotionX += n;
        final float n2 = this.getScrollX() - n;
        final int clientWidth = this.getClientWidth();
        final float n3 = clientWidth * this.mFirstOffset;
        final float n4 = clientWidth * this.mLastOffset;
        final ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(0);
        final ViewPager$ItemInfo viewPager$ItemInfo2 = this.mItems.get(-1 + this.mItems.size());
        float n5;
        if (viewPager$ItemInfo.position != 0) {
            n5 = viewPager$ItemInfo.offset * clientWidth;
        }
        else {
            n5 = n3;
        }
        float n6;
        if (viewPager$ItemInfo2.position != -1 + this.mAdapter.getCount()) {
            n6 = viewPager$ItemInfo2.offset * clientWidth;
        }
        else {
            n6 = n4;
        }
        if (n2 >= n5) {
            if (n2 > n6) {
                n5 = n6;
            }
            else {
                n5 = n2;
            }
        }
        this.mLastMotionX += n5 - (int)n5;
        this.scrollTo((int)n5, this.getScrollY());
        this.pageScrolled((int)n5);
        final MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new ViewPager$LayoutParams();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new ViewPager$LayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return this.generateDefaultLayoutParams();
    }
    
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }
    
    protected int getChildDrawingOrder(final int n, int n2) {
        if (this.mDrawingOrder == 2) {
            n2 = n - 1 - n2;
        }
        return ((ViewPager$LayoutParams)this.mDrawingOrderedChildren.get(n2).getLayoutParams()).childIndex;
    }
    
    public int getCurrentItem() {
        return this.mCurItem;
    }
    
    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }
    
    public int getPageMargin() {
        return this.mPageMargin;
    }
    
    ViewPager$ItemInfo infoForAnyChild(View view) {
        while (true) {
            final ViewParent parent = view.getParent();
            if (parent == this) {
                return this.infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View)parent;
        }
    }
    
    ViewPager$ItemInfo infoForChild(final View view) {
        for (int i = 0; i < this.mItems.size(); ++i) {
            final ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, viewPager$ItemInfo.object)) {
                return viewPager$ItemInfo;
            }
        }
        return null;
    }
    
    ViewPager$ItemInfo infoForPosition(final int n) {
        for (int i = 0; i < this.mItems.size(); ++i) {
            final ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(i);
            if (viewPager$ItemInfo.position == n) {
                return viewPager$ItemInfo;
            }
        }
        return null;
    }
    
    void initViewPager() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        final Context context = this.getContext();
        this.mScroller = new Scroller(context, ViewPager.sInterpolator);
        final ViewConfiguration value = ViewConfiguration.get(context);
        final float density = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(value);
        this.mMinimumVelocity = (int)(400.0f * density);
        this.mMaximumVelocity = value.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffectCompat(context);
        this.mRightEdge = new EdgeEffectCompat(context);
        this.mFlingDistance = (int)(25.0f * density);
        this.mCloseEnough = (int)(2.0f * density);
        this.mDefaultGutterSize = (int)(16.0f * density);
        ViewCompat.setAccessibilityDelegate((View)this, new ViewPager$MyAccessibilityDelegate(this));
        if (ViewCompat.getImportantForAccessibility((View)this) == 0) {
            ViewCompat.setImportantForAccessibility((View)this, 1);
        }
    }
    
    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }
    
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.mEndScrollRunnable);
        super.onDetachedFromWindow();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            final int scrollX = this.getScrollX();
            final int width = this.getWidth();
            final float n = this.mPageMargin / width;
            ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(0);
            float offset = viewPager$ItemInfo.offset;
            final int size = this.mItems.size();
            final int position = viewPager$ItemInfo.position;
            final int position2 = this.mItems.get(size - 1).position;
            int n2 = 0;
            for (int i = position; i < position2; ++i) {
                while (i > viewPager$ItemInfo.position && n2 < size) {
                    final ArrayList mItems = this.mItems;
                    ++n2;
                    viewPager$ItemInfo = mItems.get(n2);
                }
                float n3;
                if (i == viewPager$ItemInfo.position) {
                    n3 = (viewPager$ItemInfo.offset + viewPager$ItemInfo.widthFactor) * width;
                    offset = n + (viewPager$ItemInfo.offset + viewPager$ItemInfo.widthFactor);
                }
                else {
                    final float pageWidth = this.mAdapter.getPageWidth(i);
                    n3 = (offset + pageWidth) * width;
                    offset += pageWidth + n;
                }
                if (n3 + this.mPageMargin > scrollX) {
                    this.mMarginDrawable.setBounds((int)n3, this.mTopPageBounds, (int)(0.5f + (n3 + this.mPageMargin)), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                }
                if (n3 > scrollX + width) {
                    break;
                }
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int n = 0xFF & motionEvent.getAction();
        if (n != 3 && n != 1) {
            if (n != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            switch (n) {
                case 2: {
                    final int mActivePointerId = this.mActivePointerId;
                    if (mActivePointerId == -1) {
                        break;
                    }
                    final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, mActivePointerId);
                    final float x = MotionEventCompat.getX(motionEvent, pointerIndex);
                    final float n2 = x - this.mLastMotionX;
                    final float abs = Math.abs(n2);
                    final float y = MotionEventCompat.getY(motionEvent, pointerIndex);
                    final float abs2 = Math.abs(y - this.mInitialMotionY);
                    if (n2 != 0.0f && !this.isGutterDrag(this.mLastMotionX, n2) && this.canScroll((View)this, false, (int)n2, (int)x, (int)y)) {
                        this.mLastMotionX = x;
                        this.mLastMotionY = y;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                    if (abs > this.mTouchSlop && 0.5f * abs > abs2) {
                        this.requestParentDisallowInterceptTouchEvent(this.mIsBeingDragged = true);
                        this.setScrollState(1);
                        float mLastMotionX;
                        if (n2 > 0.0f) {
                            mLastMotionX = this.mInitialMotionX + this.mTouchSlop;
                        }
                        else {
                            mLastMotionX = this.mInitialMotionX - this.mTouchSlop;
                        }
                        this.mLastMotionX = mLastMotionX;
                        this.mLastMotionY = y;
                        this.setScrollingCacheEnabled(true);
                    }
                    else if (abs2 > this.mTouchSlop) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && this.performDrag(x)) {
                        ViewCompat.postInvalidateOnAnimation((View)this);
                        break;
                    }
                    break;
                }
                case 0: {
                    final float x2 = motionEvent.getX();
                    this.mInitialMotionX = x2;
                    this.mLastMotionX = x2;
                    final float y2 = motionEvent.getY();
                    this.mInitialMotionY = y2;
                    this.mLastMotionY = y2;
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                    this.mIsUnableToDrag = false;
                    this.mScroller.computeScrollOffset();
                    if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                        this.mScroller.abortAnimation();
                        this.mPopulatePending = false;
                        this.populate();
                        this.requestParentDisallowInterceptTouchEvent(this.mIsBeingDragged = true);
                        this.setScrollState(1);
                        break;
                    }
                    this.completeScroll(false);
                    this.mIsBeingDragged = false;
                    break;
                }
                case 6: {
                    this.onSecondaryPointerUp(motionEvent);
                    break;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        this.mActivePointerId = -1;
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        return false;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int childCount = this.getChildCount();
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        int paddingLeft = this.getPaddingLeft();
        int paddingTop = this.getPaddingTop();
        int paddingRight = this.getPaddingRight();
        int paddingBottom = this.getPaddingBottom();
        final int scrollX = this.getScrollX();
        int mDecorChildCount = 0;
        int i = 0;
    Label_0262_Outer:
        while (i < childCount) {
            final View child = this.getChildAt(i);
            while (true) {
                Label_0659: {
                    if (child.getVisibility() == 8) {
                        break Label_0659;
                    }
                    final ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)child.getLayoutParams();
                    if (!viewPager$LayoutParams.isDecor) {
                        break Label_0659;
                    }
                    final int n7 = 0x7 & viewPager$LayoutParams.gravity;
                    final int n8 = 0x70 & viewPager$LayoutParams.gravity;
                    int max = 0;
                    switch (n7) {
                        default: {
                            max = paddingLeft;
                            break;
                        }
                        case 3: {
                            final int n9 = paddingLeft + child.getMeasuredWidth();
                            max = paddingLeft;
                            paddingLeft = n9;
                            break;
                        }
                        case 1: {
                            max = Math.max((n5 - child.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        }
                        case 5: {
                            final int n10 = n5 - paddingRight - child.getMeasuredWidth();
                            paddingRight += child.getMeasuredWidth();
                            max = n10;
                            break;
                        }
                    }
                    int max2 = 0;
                    int n12 = 0;
                    int n13 = 0;
                    switch (n8) {
                        default: {
                            max2 = paddingTop;
                            final int n11 = paddingBottom;
                            n12 = paddingTop;
                            n13 = n11;
                            break;
                        }
                        case 48: {
                            final int n14 = paddingTop + child.getMeasuredHeight();
                            final int n15 = paddingTop;
                            n13 = paddingBottom;
                            n12 = n14;
                            max2 = n15;
                            break;
                        }
                        case 16: {
                            max2 = Math.max((n6 - child.getMeasuredHeight()) / 2, paddingTop);
                            final int n16 = paddingBottom;
                            n12 = paddingTop;
                            n13 = n16;
                            break;
                        }
                        case 80: {
                            max2 = n6 - paddingBottom - child.getMeasuredHeight();
                            final int n17 = paddingBottom + child.getMeasuredHeight();
                            n12 = paddingTop;
                            n13 = n17;
                            break;
                        }
                    }
                    final int n18 = max + scrollX;
                    child.layout(n18, max2, n18 + child.getMeasuredWidth(), max2 + child.getMeasuredHeight());
                    final int n19 = mDecorChildCount + 1;
                    final int n20 = n12;
                    paddingBottom = n13;
                    final int n21 = paddingRight;
                    final int n22 = paddingLeft;
                    ++i;
                    paddingLeft = n22;
                    paddingRight = n21;
                    paddingTop = n20;
                    mDecorChildCount = n19;
                    continue Label_0262_Outer;
                }
                final int n19 = mDecorChildCount;
                final int n20 = paddingTop;
                final int n21 = paddingRight;
                final int n22 = paddingLeft;
                continue;
            }
        }
        final int n23 = n5 - paddingLeft - paddingRight;
        for (int j = 0; j < childCount; ++j) {
            final View child2 = this.getChildAt(j);
            if (child2.getVisibility() != 8) {
                final ViewPager$LayoutParams viewPager$LayoutParams2 = (ViewPager$LayoutParams)child2.getLayoutParams();
                if (!viewPager$LayoutParams2.isDecor) {
                    final ViewPager$ItemInfo infoForChild = this.infoForChild(child2);
                    if (infoForChild != null) {
                        final int n24 = paddingLeft + (int)(n23 * infoForChild.offset);
                        if (viewPager$LayoutParams2.needsMeasure) {
                            viewPager$LayoutParams2.needsMeasure = false;
                            child2.measure(View$MeasureSpec.makeMeasureSpec((int)(n23 * viewPager$LayoutParams2.widthFactor), 1073741824), View$MeasureSpec.makeMeasureSpec(n6 - paddingTop - paddingBottom, 1073741824));
                        }
                        child2.layout(n24, paddingTop, n24 + child2.getMeasuredWidth(), paddingTop + child2.getMeasuredHeight());
                    }
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = n6 - paddingBottom;
        this.mDecorChildCount = mDecorChildCount;
        if (this.mFirstLayout) {
            this.scrollToItem(this.mCurItem, false, 0, false);
        }
        this.mFirstLayout = false;
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(getDefaultSize(0, n), getDefaultSize(0, n2));
        final int measuredWidth = this.getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int n3 = measuredWidth - this.getPaddingLeft() - this.getPaddingRight();
        int n4 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
    Label_0288:
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)child.getLayoutParams();
                if (viewPager$LayoutParams != null && viewPager$LayoutParams.isDecor) {
                    final int n5 = 0x7 & viewPager$LayoutParams.gravity;
                    final int n6 = 0x70 & viewPager$LayoutParams.gravity;
                    int n7 = Integer.MIN_VALUE;
                    int n8 = Integer.MIN_VALUE;
                    boolean b;
                    if (n6 == 48 || n6 == 80) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    final boolean b2 = n5 == 3 || n5 == 5;
                    if (b) {
                        n7 = 1073741824;
                    }
                    else if (b2) {
                        n8 = 1073741824;
                    }
                    int n9;
                    int width;
                    if (viewPager$LayoutParams.width != -2) {
                        n9 = 1073741824;
                        if (viewPager$LayoutParams.width != -1) {
                            width = viewPager$LayoutParams.width;
                        }
                        else {
                            width = n3;
                        }
                    }
                    else {
                        n9 = n7;
                        width = n3;
                    }
                    while (true) {
                        Label_0464: {
                            if (viewPager$LayoutParams.height == -2) {
                                break Label_0464;
                            }
                            n8 = 1073741824;
                            if (viewPager$LayoutParams.height == -1) {
                                break Label_0464;
                            }
                            final int height = viewPager$LayoutParams.height;
                            child.measure(View$MeasureSpec.makeMeasureSpec(width, n9), View$MeasureSpec.makeMeasureSpec(height, n8));
                            if (b) {
                                n4 -= child.getMeasuredHeight();
                                continue Label_0288;
                            }
                            if (b2) {
                                n3 -= child.getMeasuredWidth();
                            }
                            continue Label_0288;
                        }
                        final int height = n4;
                        continue;
                    }
                }
            }
        }
        this.mChildWidthMeasureSpec = View$MeasureSpec.makeMeasureSpec(n3, 1073741824);
        this.mChildHeightMeasureSpec = View$MeasureSpec.makeMeasureSpec(n4, 1073741824);
        this.mInLayout = true;
        this.populate();
        this.mInLayout = false;
        for (int childCount2 = this.getChildCount(), j = 0; j < childCount2; ++j) {
            final View child2 = this.getChildAt(j);
            if (child2.getVisibility() != 8) {
                final ViewPager$LayoutParams viewPager$LayoutParams2 = (ViewPager$LayoutParams)child2.getLayoutParams();
                if (viewPager$LayoutParams2 == null || !viewPager$LayoutParams2.isDecor) {
                    child2.measure(View$MeasureSpec.makeMeasureSpec((int)(n3 * viewPager$LayoutParams2.widthFactor), 1073741824), this.mChildHeightMeasureSpec);
                }
            }
        }
    }
    
    protected void onPageScrolled(final int n, final float n2, final int n3) {
        if (this.mDecorChildCount > 0) {
            final int scrollX = this.getScrollX();
            int paddingLeft = this.getPaddingLeft();
            int paddingRight = this.getPaddingRight();
            final int width = this.getWidth();
            int n5 = 0;
            int n6 = 0;
            int n13;
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i, n13 = n6, paddingLeft = n5, paddingRight = n13) {
                final View child = this.getChildAt(i);
                final ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)child.getLayoutParams();
                if (!viewPager$LayoutParams.isDecor) {
                    final int n4 = paddingRight;
                    n5 = paddingLeft;
                    n6 = n4;
                }
                else {
                    int max = 0;
                    switch (0x7 & viewPager$LayoutParams.gravity) {
                        default: {
                            max = paddingLeft;
                            final int n7 = paddingRight;
                            n5 = paddingLeft;
                            n6 = n7;
                            break;
                        }
                        case 3: {
                            final int n8 = paddingLeft + child.getWidth();
                            final int n9 = paddingLeft;
                            n6 = paddingRight;
                            n5 = n8;
                            max = n9;
                            break;
                        }
                        case 1: {
                            max = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                            final int n10 = paddingRight;
                            n5 = paddingLeft;
                            n6 = n10;
                            break;
                        }
                        case 5: {
                            max = width - paddingRight - child.getMeasuredWidth();
                            final int n11 = paddingRight + child.getMeasuredWidth();
                            n5 = paddingLeft;
                            n6 = n11;
                            break;
                        }
                    }
                    final int n12 = max + scrollX - child.getLeft();
                    if (n12 != 0) {
                        child.offsetLeftAndRight(n12);
                    }
                }
            }
        }
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageScrolled(n, n2, n3);
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageScrolled(n, n2, n3);
        }
        if (this.mPageTransformer != null) {
            final int scrollX2 = this.getScrollX();
            for (int childCount2 = this.getChildCount(), j = 0; j < childCount2; ++j) {
                final View child2 = this.getChildAt(j);
                if (!((ViewPager$LayoutParams)child2.getLayoutParams()).isDecor) {
                    this.mPageTransformer.transformPage(child2, (child2.getLeft() - scrollX2) / this.getClientWidth());
                }
            }
        }
        this.mCalledSuper = true;
    }
    
    protected boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int n2 = -1;
        int childCount = this.getChildCount();
        int i;
        if ((n & 0x2) != 0x0) {
            n2 = 1;
            i = 0;
        }
        else {
            i = childCount - 1;
            childCount = n2;
        }
        while (i != childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final ViewPager$ItemInfo infoForChild = this.infoForChild(child);
                if (infoForChild != null && infoForChild.position == this.mCurItem && child.requestFocus(n, rect)) {
                    return true;
                }
            }
            i += n2;
        }
        return false;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState)parcelable;
        super.onRestoreInstanceState(viewPager$SavedState.getSuperState());
        if (this.mAdapter != null) {
            this.mAdapter.restoreState(viewPager$SavedState.adapterState, viewPager$SavedState.loader);
            this.setCurrentItemInternal(viewPager$SavedState.position, false, true);
            return;
        }
        this.mRestoredCurItem = viewPager$SavedState.position;
        this.mRestoredAdapterState = viewPager$SavedState.adapterState;
        this.mRestoredClassLoader = viewPager$SavedState.loader;
    }
    
    public Parcelable onSaveInstanceState() {
        final ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.position = this.mCurItem;
        if (this.mAdapter != null) {
            viewPager$SavedState.adapterState = this.mAdapter.saveState();
        }
        return (Parcelable)viewPager$SavedState;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != n3) {
            this.recomputeScrollPosition(n, n3, this.mPageMargin, this.mPageMargin);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.mFakeDragging) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.mAdapter == null || this.mAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        final int n = 0xFF & motionEvent.getAction();
        int n2 = 0;
        switch (n) {
            case 0: {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                this.populate();
                final float x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                final float y = motionEvent.getY();
                this.mInitialMotionY = y;
                this.mLastMotionY = y;
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                n2 = 0;
                break;
            }
            case 2: {
                if (!this.mIsBeingDragged) {
                    final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                    final float x2 = MotionEventCompat.getX(motionEvent, pointerIndex);
                    final float abs = Math.abs(x2 - this.mLastMotionX);
                    final float y2 = MotionEventCompat.getY(motionEvent, pointerIndex);
                    final float abs2 = Math.abs(y2 - this.mLastMotionY);
                    if (abs > this.mTouchSlop && abs > abs2) {
                        this.requestParentDisallowInterceptTouchEvent(this.mIsBeingDragged = true);
                        float mLastMotionX;
                        if (x2 - this.mInitialMotionX > 0.0f) {
                            mLastMotionX = this.mInitialMotionX + this.mTouchSlop;
                        }
                        else {
                            mLastMotionX = this.mInitialMotionX - this.mTouchSlop;
                        }
                        this.mLastMotionX = mLastMotionX;
                        this.mLastMotionY = y2;
                        this.setScrollState(1);
                        this.setScrollingCacheEnabled(true);
                        final ViewParent parent = this.getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                final boolean mIsBeingDragged = this.mIsBeingDragged;
                n2 = 0;
                if (mIsBeingDragged) {
                    n2 = ((false | this.performDrag(MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId)))) ? 1 : 0);
                    break;
                }
                break;
            }
            case 1: {
                final boolean mIsBeingDragged2 = this.mIsBeingDragged;
                n2 = 0;
                if (mIsBeingDragged2) {
                    final VelocityTracker mVelocityTracker = this.mVelocityTracker;
                    mVelocityTracker.computeCurrentVelocity(1000, (float)this.mMaximumVelocity);
                    final int n3 = (int)VelocityTrackerCompat.getXVelocity(mVelocityTracker, this.mActivePointerId);
                    this.mPopulatePending = true;
                    final int clientWidth = this.getClientWidth();
                    final int scrollX = this.getScrollX();
                    final ViewPager$ItemInfo infoForCurrentScrollPosition = this.infoForCurrentScrollPosition();
                    this.setCurrentItemInternal(this.determineTargetPage(infoForCurrentScrollPosition.position, (scrollX / clientWidth - infoForCurrentScrollPosition.offset) / infoForCurrentScrollPosition.widthFactor, n3, (int)(MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId)) - this.mInitialMotionX)), true, true, n3);
                    this.mActivePointerId = -1;
                    this.endDrag();
                    n2 = ((this.mLeftEdge.onRelease() | this.mRightEdge.onRelease()) ? 1 : 0);
                    break;
                }
                break;
            }
            case 3: {
                final boolean mIsBeingDragged3 = this.mIsBeingDragged;
                n2 = 0;
                if (mIsBeingDragged3) {
                    this.scrollToItem(this.mCurItem, true, 0, false);
                    this.mActivePointerId = -1;
                    this.endDrag();
                    n2 = ((this.mLeftEdge.onRelease() | this.mRightEdge.onRelease()) ? 1 : 0);
                    break;
                }
                break;
            }
            case 5: {
                final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                this.mLastMotionX = MotionEventCompat.getX(motionEvent, actionIndex);
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                n2 = 0;
                break;
            }
            case 6: {
                this.onSecondaryPointerUp(motionEvent);
                this.mLastMotionX = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                n2 = 0;
                break;
            }
        }
        if (n2 != 0) {
            ViewCompat.postInvalidateOnAnimation((View)this);
        }
        return true;
    }
    
    boolean pageLeft() {
        if (this.mCurItem > 0) {
            this.setCurrentItem(-1 + this.mCurItem, true);
            return true;
        }
        return false;
    }
    
    boolean pageRight() {
        if (this.mAdapter != null && this.mCurItem < -1 + this.mAdapter.getCount()) {
            this.setCurrentItem(1 + this.mCurItem, true);
            return true;
        }
        return false;
    }
    
    void populate() {
        this.populate(this.mCurItem);
    }
    
    void populate(final int mCurItem) {
        ViewPager$ItemInfo viewPager$ItemInfo;
        int n2;
        if (this.mCurItem != mCurItem) {
            int n;
            if (this.mCurItem < mCurItem) {
                n = 66;
            }
            else {
                n = 17;
            }
            final ViewPager$ItemInfo infoForPosition = this.infoForPosition(this.mCurItem);
            this.mCurItem = mCurItem;
            viewPager$ItemInfo = infoForPosition;
            n2 = n;
        }
        else {
            n2 = 2;
            viewPager$ItemInfo = null;
        }
        if (this.mAdapter == null) {
            this.sortChildDrawingOrder();
        }
        else {
            if (this.mPopulatePending) {
                this.sortChildDrawingOrder();
                return;
            }
            if (this.getWindowToken() != null) {
                this.mAdapter.startUpdate(this);
                final int mOffscreenPageLimit = this.mOffscreenPageLimit;
                final int max = Math.max(0, this.mCurItem - mOffscreenPageLimit);
                final int count = this.mAdapter.getCount();
                final int min = Math.min(count - 1, mOffscreenPageLimit + this.mCurItem);
                if (count != this.mExpectedAdapterCount) {
                    try {
                        final String s = this.getResources().getResourceName(this.getId());
                        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + count + " Pager id: " + s + " Pager class: " + this.getClass() + " Problematic adapter: " + this.mAdapter.getClass());
                    }
                    catch (Resources$NotFoundException ex) {
                        final String s = Integer.toHexString(this.getId());
                        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + count + " Pager id: " + s + " Pager class: " + this.getClass() + " Problematic adapter: " + this.mAdapter.getClass());
                    }
                }
                int i = 0;
                while (true) {
                    while (i < this.mItems.size()) {
                        final ViewPager$ItemInfo viewPager$ItemInfo2 = this.mItems.get(i);
                        if (viewPager$ItemInfo2.position >= this.mCurItem) {
                            if (viewPager$ItemInfo2.position != this.mCurItem) {
                                break;
                            }
                            ViewPager$ItemInfo addNewItem;
                            if (viewPager$ItemInfo2 == null && count > 0) {
                                addNewItem = this.addNewItem(this.mCurItem, i);
                            }
                            else {
                                addNewItem = viewPager$ItemInfo2;
                            }
                            if (addNewItem != null) {
                                final int n3 = i - 1;
                                ViewPager$ItemInfo viewPager$ItemInfo3;
                                if (n3 >= 0) {
                                    viewPager$ItemInfo3 = this.mItems.get(n3);
                                }
                                else {
                                    viewPager$ItemInfo3 = null;
                                }
                                final int clientWidth = this.getClientWidth();
                                float n4;
                                if (clientWidth <= 0) {
                                    n4 = 0.0f;
                                }
                                else {
                                    n4 = 2.0f - addNewItem.widthFactor + this.getPaddingLeft() / clientWidth;
                                }
                                final int n5 = -1 + this.mCurItem;
                                float n6 = 0.0f;
                                int j = n5;
                                int n7 = i;
                                int n8 = n3;
                                while (j >= 0) {
                                    if (n6 >= n4 && j < max) {
                                        if (viewPager$ItemInfo3 == null) {
                                            break;
                                        }
                                        if (j == viewPager$ItemInfo3.position && !viewPager$ItemInfo3.scrolling) {
                                            this.mItems.remove(n8);
                                            this.mAdapter.destroyItem(this, j, viewPager$ItemInfo3.object);
                                            --n8;
                                            --n7;
                                            if (n8 >= 0) {
                                                viewPager$ItemInfo3 = (ViewPager$ItemInfo)this.mItems.get(n8);
                                            }
                                            else {
                                                viewPager$ItemInfo3 = null;
                                            }
                                        }
                                    }
                                    else if (viewPager$ItemInfo3 != null && j == viewPager$ItemInfo3.position) {
                                        n6 += viewPager$ItemInfo3.widthFactor;
                                        if (--n8 >= 0) {
                                            viewPager$ItemInfo3 = (ViewPager$ItemInfo)this.mItems.get(n8);
                                        }
                                        else {
                                            viewPager$ItemInfo3 = null;
                                        }
                                    }
                                    else {
                                        n6 += this.addNewItem(j, n8 + 1).widthFactor;
                                        ++n7;
                                        if (n8 >= 0) {
                                            viewPager$ItemInfo3 = (ViewPager$ItemInfo)this.mItems.get(n8);
                                        }
                                        else {
                                            viewPager$ItemInfo3 = null;
                                        }
                                    }
                                    --j;
                                }
                                float widthFactor = addNewItem.widthFactor;
                                final int n9 = n7 + 1;
                                if (widthFactor < 2.0f) {
                                    ViewPager$ItemInfo viewPager$ItemInfo4;
                                    if (n9 < this.mItems.size()) {
                                        viewPager$ItemInfo4 = this.mItems.get(n9);
                                    }
                                    else {
                                        viewPager$ItemInfo4 = null;
                                    }
                                    float n10;
                                    if (clientWidth <= 0) {
                                        n10 = 0.0f;
                                    }
                                    else {
                                        n10 = 2.0f + this.getPaddingRight() / clientWidth;
                                    }
                                    final int n11 = 1 + this.mCurItem;
                                    ViewPager$ItemInfo viewPager$ItemInfo5 = viewPager$ItemInfo4;
                                    int n12 = n9;
                                    ViewPager$ItemInfo viewPager$ItemInfo7;
                                    float n14;
                                    float n18;
                                    for (int k = n11; k < count; ++k, n18 = n14, viewPager$ItemInfo5 = viewPager$ItemInfo7, widthFactor = n18) {
                                        if (widthFactor >= n10 && k > min) {
                                            if (viewPager$ItemInfo5 == null) {
                                                break;
                                            }
                                            if (k == viewPager$ItemInfo5.position && !viewPager$ItemInfo5.scrolling) {
                                                this.mItems.remove(n12);
                                                this.mAdapter.destroyItem(this, k, viewPager$ItemInfo5.object);
                                                ViewPager$ItemInfo viewPager$ItemInfo6;
                                                if (n12 < this.mItems.size()) {
                                                    viewPager$ItemInfo6 = this.mItems.get(n12);
                                                }
                                                else {
                                                    viewPager$ItemInfo6 = null;
                                                }
                                                final float n13 = widthFactor;
                                                viewPager$ItemInfo7 = viewPager$ItemInfo6;
                                                n14 = n13;
                                            }
                                            else {
                                                final float n15 = widthFactor;
                                                viewPager$ItemInfo7 = viewPager$ItemInfo5;
                                                n14 = n15;
                                            }
                                        }
                                        else if (viewPager$ItemInfo5 != null && k == viewPager$ItemInfo5.position) {
                                            final float n16 = widthFactor + viewPager$ItemInfo5.widthFactor;
                                            ViewPager$ItemInfo viewPager$ItemInfo8;
                                            if (++n12 < this.mItems.size()) {
                                                viewPager$ItemInfo8 = this.mItems.get(n12);
                                            }
                                            else {
                                                viewPager$ItemInfo8 = null;
                                            }
                                            viewPager$ItemInfo7 = viewPager$ItemInfo8;
                                            n14 = n16;
                                        }
                                        else {
                                            final ViewPager$ItemInfo addNewItem2 = this.addNewItem(k, n12);
                                            ++n12;
                                            final float n17 = widthFactor + addNewItem2.widthFactor;
                                            ViewPager$ItemInfo viewPager$ItemInfo9;
                                            if (n12 < this.mItems.size()) {
                                                viewPager$ItemInfo9 = this.mItems.get(n12);
                                            }
                                            else {
                                                viewPager$ItemInfo9 = null;
                                            }
                                            viewPager$ItemInfo7 = viewPager$ItemInfo9;
                                            n14 = n17;
                                        }
                                    }
                                }
                                this.calculatePageOffsets(addNewItem, n7, viewPager$ItemInfo);
                            }
                            final PagerAdapter mAdapter = this.mAdapter;
                            final int mCurItem2 = this.mCurItem;
                            Object object;
                            if (addNewItem != null) {
                                object = addNewItem.object;
                            }
                            else {
                                object = null;
                            }
                            mAdapter.setPrimaryItem(this, mCurItem2, object);
                            this.mAdapter.finishUpdate(this);
                            for (int childCount = this.getChildCount(), l = 0; l < childCount; ++l) {
                                final View child = this.getChildAt(l);
                                final ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)child.getLayoutParams();
                                viewPager$LayoutParams.childIndex = l;
                                if (!viewPager$LayoutParams.isDecor && viewPager$LayoutParams.widthFactor == 0.0f) {
                                    final ViewPager$ItemInfo infoForChild = this.infoForChild(child);
                                    if (infoForChild != null) {
                                        viewPager$LayoutParams.widthFactor = infoForChild.widthFactor;
                                        viewPager$LayoutParams.position = infoForChild.position;
                                    }
                                }
                            }
                            this.sortChildDrawingOrder();
                            if (!this.hasFocus()) {
                                return;
                            }
                            final View focus = this.findFocus();
                            ViewPager$ItemInfo infoForAnyChild;
                            if (focus != null) {
                                infoForAnyChild = this.infoForAnyChild(focus);
                            }
                            else {
                                infoForAnyChild = null;
                            }
                            if (infoForAnyChild == null || infoForAnyChild.position != this.mCurItem) {
                                for (int n19 = 0; n19 < this.getChildCount(); ++n19) {
                                    final View child2 = this.getChildAt(n19);
                                    final ViewPager$ItemInfo infoForChild2 = this.infoForChild(child2);
                                    if (infoForChild2 != null && infoForChild2.position == this.mCurItem && child2.requestFocus(n2)) {
                                        break;
                                    }
                                }
                            }
                            return;
                        }
                        else {
                            ++i;
                        }
                    }
                    final ViewPager$ItemInfo viewPager$ItemInfo2 = null;
                    continue;
                }
            }
        }
    }
    
    public void removeView(final View view) {
        if (this.mInLayout) {
            this.removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }
    
    public void setAdapter(final PagerAdapter mAdapter) {
        if (this.mAdapter != null) {
            this.mAdapter.unregisterDataSetObserver(this.mObserver);
            this.mAdapter.startUpdate(this);
            for (int i = 0; i < this.mItems.size(); ++i) {
                final ViewPager$ItemInfo viewPager$ItemInfo = this.mItems.get(i);
                this.mAdapter.destroyItem(this, viewPager$ItemInfo.position, viewPager$ItemInfo.object);
            }
            this.mAdapter.finishUpdate(this);
            this.mItems.clear();
            this.removeNonDecorViews();
            this.scrollTo(this.mCurItem = 0, 0);
        }
        final PagerAdapter mAdapter2 = this.mAdapter;
        this.mAdapter = mAdapter;
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new ViewPager$PagerObserver(this, null);
            }
            this.mAdapter.registerDataSetObserver(this.mObserver);
            this.mPopulatePending = false;
            final boolean mFirstLayout = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                this.setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            }
            else if (!mFirstLayout) {
                this.populate();
            }
            else {
                this.requestLayout();
            }
        }
        if (this.mAdapterChangeListener != null && mAdapter2 != mAdapter) {
            this.mAdapterChangeListener.onAdapterChanged(mAdapter2, mAdapter);
        }
    }
    
    void setChildrenDrawingOrderEnabledCompat(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          7
        //     5: if_icmplt       71
        //     8: aload_0        
        //     9: getfield        android/support/v4/view/ViewPager.mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
        //    12: ifnonnull       42
        //    15: iconst_1       
        //    16: anewarray       Ljava/lang/Class;
        //    19: astore          9
        //    21: aload           9
        //    23: iconst_0       
        //    24: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    27: aastore        
        //    28: aload_0        
        //    29: ldc             Landroid/view/ViewGroup;.class
        //    31: ldc_w           "setChildrenDrawingOrderEnabled"
        //    34: aload           9
        //    36: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    39: putfield        android/support/v4/view/ViewPager.mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
        //    42: aload_0        
        //    43: getfield        android/support/v4/view/ViewPager.mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
        //    46: astore          4
        //    48: iconst_1       
        //    49: anewarray       Ljava/lang/Object;
        //    52: astore          5
        //    54: aload           5
        //    56: iconst_0       
        //    57: iload_1        
        //    58: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    61: aastore        
        //    62: aload           4
        //    64: aload_0        
        //    65: aload           5
        //    67: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    70: pop            
        //    71: return         
        //    72: astore          7
        //    74: ldc             "ViewPager"
        //    76: ldc_w           "Can't find setChildrenDrawingOrderEnabled"
        //    79: aload           7
        //    81: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    84: pop            
        //    85: goto            42
        //    88: astore_2       
        //    89: ldc             "ViewPager"
        //    91: ldc_w           "Error changing children drawing order"
        //    94: aload_2        
        //    95: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    98: pop            
        //    99: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  15     42     72     88     Ljava/lang/NoSuchMethodException;
        //  42     71     88     100    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setCurrentItem(final int n) {
        this.mPopulatePending = false;
        this.setCurrentItemInternal(n, !this.mFirstLayout, false);
    }
    
    public void setCurrentItem(final int n, final boolean b) {
        this.setCurrentItemInternal(n, b, this.mPopulatePending = false);
    }
    
    void setCurrentItemInternal(final int n, final boolean b, final boolean b2) {
        this.setCurrentItemInternal(n, b, b2, 0);
    }
    
    void setCurrentItemInternal(int mCurItem, final boolean b, final boolean b2, final int n) {
        if (this.mAdapter == null || this.mAdapter.getCount() <= 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if (!b2 && this.mCurItem == mCurItem && this.mItems.size() != 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if (mCurItem < 0) {
            mCurItem = 0;
        }
        else if (mCurItem >= this.mAdapter.getCount()) {
            mCurItem = -1 + this.mAdapter.getCount();
        }
        final int mOffscreenPageLimit = this.mOffscreenPageLimit;
        if (mCurItem > mOffscreenPageLimit + this.mCurItem || mCurItem < this.mCurItem - mOffscreenPageLimit) {
            for (int i = 0; i < this.mItems.size(); ++i) {
                ((ViewPager$ItemInfo)this.mItems.get(i)).scrolling = true;
            }
        }
        final int mCurItem2 = this.mCurItem;
        boolean b3 = false;
        if (mCurItem2 != mCurItem) {
            b3 = true;
        }
        if (this.mFirstLayout) {
            this.mCurItem = mCurItem;
            if (b3 && this.mOnPageChangeListener != null) {
                this.mOnPageChangeListener.onPageSelected(mCurItem);
            }
            if (b3 && this.mInternalPageChangeListener != null) {
                this.mInternalPageChangeListener.onPageSelected(mCurItem);
            }
            this.requestLayout();
            return;
        }
        this.populate(mCurItem);
        this.scrollToItem(mCurItem, b, n, b3);
    }
    
    ViewPager$OnPageChangeListener setInternalPageChangeListener(final ViewPager$OnPageChangeListener mInternalPageChangeListener) {
        final ViewPager$OnPageChangeListener mInternalPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = mInternalPageChangeListener;
        return mInternalPageChangeListener2;
    }
    
    public void setOffscreenPageLimit(int mOffscreenPageLimit) {
        if (mOffscreenPageLimit < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + mOffscreenPageLimit + " too small; defaulting to " + 1);
            mOffscreenPageLimit = 1;
        }
        if (mOffscreenPageLimit != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = mOffscreenPageLimit;
            this.populate();
        }
    }
    
    void setOnAdapterChangeListener(final ViewPager$OnAdapterChangeListener mAdapterChangeListener) {
        this.mAdapterChangeListener = mAdapterChangeListener;
    }
    
    public void setOnPageChangeListener(final ViewPager$OnPageChangeListener mOnPageChangeListener) {
        this.mOnPageChangeListener = mOnPageChangeListener;
    }
    
    public void setPageMargin(final int mPageMargin) {
        final int mPageMargin2 = this.mPageMargin;
        this.mPageMargin = mPageMargin;
        final int width = this.getWidth();
        this.recomputeScrollPosition(width, width, mPageMargin, mPageMargin2);
        this.requestLayout();
    }
    
    public void setPageMarginDrawable(final int n) {
        this.setPageMarginDrawable(this.getContext().getResources().getDrawable(n));
    }
    
    public void setPageMarginDrawable(final Drawable mMarginDrawable) {
        this.mMarginDrawable = mMarginDrawable;
        if (mMarginDrawable != null) {
            this.refreshDrawableState();
        }
        this.setWillNotDraw(mMarginDrawable == null);
        this.invalidate();
    }
    
    public void setPageTransformer(final boolean b, final ViewPager$PageTransformer mPageTransformer) {
        int mDrawingOrder = 1;
        if (Build$VERSION.SDK_INT >= 11) {
            int childrenDrawingOrderEnabledCompat;
            if (mPageTransformer != null) {
                childrenDrawingOrderEnabledCompat = mDrawingOrder;
            }
            else {
                childrenDrawingOrderEnabledCompat = 0;
            }
            boolean b2;
            if (this.mPageTransformer != null) {
                b2 = (mDrawingOrder != 0);
            }
            else {
                b2 = false;
            }
            int n;
            if (childrenDrawingOrderEnabledCompat != (b2 ? 1 : 0)) {
                n = mDrawingOrder;
            }
            else {
                n = 0;
            }
            this.mPageTransformer = mPageTransformer;
            this.setChildrenDrawingOrderEnabledCompat(childrenDrawingOrderEnabledCompat != 0);
            if (childrenDrawingOrderEnabledCompat != 0) {
                if (b) {
                    mDrawingOrder = 2;
                }
                this.mDrawingOrder = mDrawingOrder;
            }
            else {
                this.mDrawingOrder = 0;
            }
            if (n != 0) {
                this.populate();
            }
        }
    }
    
    void smoothScrollTo(final int n, final int n2) {
        this.smoothScrollTo(n, n2, 0);
    }
    
    void smoothScrollTo(final int n, final int n2, final int n3) {
        if (this.getChildCount() == 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        final int scrollX = this.getScrollX();
        final int scrollY = this.getScrollY();
        final int n4 = n - scrollX;
        final int n5 = n2 - scrollY;
        if (n4 == 0 && n5 == 0) {
            this.completeScroll(false);
            this.populate();
            this.setScrollState(0);
            return;
        }
        this.setScrollingCacheEnabled(true);
        this.setScrollState(2);
        final int clientWidth = this.getClientWidth();
        final int n6 = clientWidth / 2;
        final float n7 = n6 + n6 * this.distanceInfluenceForSnapDuration(Math.min(1.0f, 1.0f * Math.abs(n4) / clientWidth));
        final int abs = Math.abs(n3);
        int n8;
        if (abs > 0) {
            n8 = 4 * Math.round(1000.0f * Math.abs(n7 / abs));
        }
        else {
            n8 = (int)(100.0f * (1.0f + Math.abs(n4) / (clientWidth * this.mAdapter.getPageWidth(this.mCurItem) + this.mPageMargin)));
        }
        this.mScroller.startScroll(scrollX, scrollY, n4, n5, Math.min(n8, 600));
        ViewCompat.postInvalidateOnAnimation((View)this);
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }
}
