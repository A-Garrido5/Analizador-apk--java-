// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.text.TextUtils$TruncateAt;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.support.v4.view.MenuItemCompat;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.support.v7.internal.widget.DecorToolbar;
import android.view.Menu;
import android.support.v7.app.ActionBar$LayoutParams;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.view.View$MeasureSpec;
import android.os.Build$VERSION;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.view.ViewGroup$MarginLayoutParams;
import android.support.v7.internal.view.menu.MenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import java.util.List;
import android.text.TextUtils;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.appcompat.R$styleable;
import android.support.v7.internal.widget.ViewUtils;
import android.support.v7.appcompat.R$attr;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.support.v7.internal.widget.ToolbarWidgetWrapper;
import android.support.v7.internal.widget.TintManager;
import java.util.ArrayList;
import android.widget.TextView;
import android.content.Context;
import android.support.v7.internal.view.menu.MenuBuilder$Callback;
import android.widget.ImageView;
import android.view.View;
import android.support.v7.internal.widget.RtlSpacingHelper;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;
import android.view.ViewGroup;

public class Toolbar extends ViewGroup
{
    private MenuPresenter$Callback mActionMenuPresenterCallback;
    private int mButtonGravity;
    private ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private final RtlSpacingHelper mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private MenuBuilder$Callback mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final ActionMenuView$OnMenuItemClickListener mMenuViewItemClickListener;
    private int mMinHeight;
    private ImageButton mNavButtonView;
    private Toolbar$OnMenuItemClickListener mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList mTempViews;
    private final TintManager mTintManager;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;
    private ToolbarWidgetWrapper mWrapper;
    
    public Toolbar(final Context context) {
        this(context, null);
    }
    
    public Toolbar(final Context context, @Nullable final AttributeSet set) {
        this(context, set, R$attr.toolbarStyle);
    }
    
    public Toolbar(final Context context, @Nullable final AttributeSet set, final int n) {
        super(ViewUtils.themifyContext(context, set, false, true), set, n);
        this.mContentInsets = new RtlSpacingHelper();
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new Toolbar$1(this);
        this.mShowOverflowMenuRunnable = new Toolbar$2(this);
        final TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.getContext(), set, R$styleable.Toolbar, n, 0);
        this.mTitleTextAppearance = obtainStyledAttributes.getResourceId(R$styleable.Toolbar_titleTextAppearance, 0);
        this.mSubtitleTextAppearance = obtainStyledAttributes.getResourceId(R$styleable.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = obtainStyledAttributes.getInteger(R$styleable.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = 48;
        final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.Toolbar_titleMargins, 0);
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        final int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        final int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        final int dimensionPixelOffset4 = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        final int dimensionPixelOffset5 = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = obtainStyledAttributes.getDimensionPixelSize(R$styleable.Toolbar_maxButtonHeight, -1);
        final int dimensionPixelOffset6 = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        final int dimensionPixelOffset7 = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        this.mContentInsets.setAbsolute(obtainStyledAttributes.getDimensionPixelSize(R$styleable.Toolbar_contentInsetLeft, 0), obtainStyledAttributes.getDimensionPixelSize(R$styleable.Toolbar_contentInsetRight, 0));
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            this.mContentInsets.setRelative(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mCollapseIcon = obtainStyledAttributes.getDrawable(R$styleable.Toolbar_collapseIcon);
        this.mCollapseDescription = obtainStyledAttributes.getText(R$styleable.Toolbar_collapseContentDescription);
        final CharSequence text = obtainStyledAttributes.getText(R$styleable.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            this.setTitle(text);
        }
        final CharSequence text2 = obtainStyledAttributes.getText(R$styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            this.setSubtitle(text2);
        }
        this.mPopupContext = this.getContext();
        this.setPopupTheme(obtainStyledAttributes.getResourceId(R$styleable.Toolbar_popupTheme, 0));
        final Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.Toolbar_navigationIcon);
        if (drawable != null) {
            this.setNavigationIcon(drawable);
        }
        final CharSequence text3 = obtainStyledAttributes.getText(R$styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            this.setNavigationContentDescription(text3);
        }
        this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(R$styleable.Toolbar_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        this.mTintManager = obtainStyledAttributes.getTintManager();
    }
    
    static Toolbar$OnMenuItemClickListener access$000(final Toolbar toolbar) {
        return toolbar.mOnMenuItemClickListener;
    }
    
    static void access$200(final Toolbar toolbar) {
        toolbar.ensureCollapseButtonView();
    }
    
    static ImageButton access$300(final Toolbar toolbar) {
        return toolbar.mCollapseButtonView;
    }
    
    static int access$400(final Toolbar toolbar) {
        return toolbar.mButtonGravity;
    }
    
    static void access$500(final Toolbar toolbar, final boolean childVisibilityForExpandedActionView) {
        toolbar.setChildVisibilityForExpandedActionView(childVisibilityForExpandedActionView);
    }
    
    private void addCustomViewsWithGravity(final List list, final int n) {
        int n2 = 1;
        final boolean a = LinearLayoutCompat.a;
        if (ViewCompat.getLayoutDirection((View)this) != n2) {
            n2 = 0;
        }
        final int childCount = this.getChildCount();
        final int absoluteGravity = GravityCompat.getAbsoluteGravity(n, ViewCompat.getLayoutDirection((View)this));
        list.clear();
        int i = 0;
        if (n2 != 0) {
            int n3;
            for (int j = childCount - 1; j >= 0; j = n3) {
                final View child = this.getChildAt(j);
                final Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)child.getLayoutParams();
                if (toolbar$LayoutParams.mViewType == 0 && this.shouldLayout(child) && this.getChildHorizontalGravity(toolbar$LayoutParams.gravity) == absoluteGravity) {
                    list.add(child);
                }
                n3 = j - 1;
                if (a) {
                    break;
                }
            }
            i = 0;
            if (!a) {
                return;
            }
        }
        while (i < childCount) {
            final View child2 = this.getChildAt(i);
            final Toolbar$LayoutParams toolbar$LayoutParams2 = (Toolbar$LayoutParams)child2.getLayoutParams();
            if (toolbar$LayoutParams2.mViewType == 0 && this.shouldLayout(child2) && this.getChildHorizontalGravity(toolbar$LayoutParams2.gravity) == absoluteGravity) {
                list.add(child2);
            }
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    private void addSystemView(final View view) {
        final boolean a = LinearLayoutCompat.a;
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        while (true) {
            Toolbar$LayoutParams toolbar$LayoutParams = null;
            Label_0062: {
                if (layoutParams == null) {
                    toolbar$LayoutParams = this.generateDefaultLayoutParams();
                    if (!a) {
                        break Label_0062;
                    }
                }
                if (!this.checkLayoutParams(layoutParams)) {
                    toolbar$LayoutParams = this.generateLayoutParams(layoutParams);
                    if (!a) {
                        break Label_0062;
                    }
                }
                final Toolbar$LayoutParams toolbar$LayoutParams2 = (Toolbar$LayoutParams)layoutParams;
                toolbar$LayoutParams2.mViewType = 1;
                this.addView(view, (ViewGroup$LayoutParams)toolbar$LayoutParams2);
                return;
            }
            final Toolbar$LayoutParams toolbar$LayoutParams2 = toolbar$LayoutParams;
            continue;
        }
    }
    
    private void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            (this.mCollapseButtonView = new ImageButton(this.getContext(), (AttributeSet)null, R$attr.toolbarNavigationButtonStyle)).setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            final Toolbar$LayoutParams generateDefaultLayoutParams = this.generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (0x800003 | (0x70 & this.mButtonGravity));
            generateDefaultLayoutParams.mViewType = 2;
            this.mCollapseButtonView.setLayoutParams((ViewGroup$LayoutParams)generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener((View$OnClickListener)new Toolbar$3(this));
        }
    }
    
    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new ImageView(this.getContext());
        }
    }
    
    private void ensureMenu() {
        this.ensureMenuView();
        if (this.mMenuView.peekMenu() == null) {
            final MenuBuilder menuBuilder = (MenuBuilder)this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new Toolbar$ExpandedActionViewMenuPresenter(this, null);
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }
    
    private void ensureMenuView() {
        if (this.mMenuView == null) {
            (this.mMenuView = new ActionMenuView(this.getContext())).setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            final Toolbar$LayoutParams generateDefaultLayoutParams = this.generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (0x800005 | (0x70 & this.mButtonGravity));
            this.mMenuView.setLayoutParams((ViewGroup$LayoutParams)generateDefaultLayoutParams);
            this.addSystemView((View)this.mMenuView);
        }
    }
    
    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new ImageButton(this.getContext(), (AttributeSet)null, R$attr.toolbarNavigationButtonStyle);
            final Toolbar$LayoutParams generateDefaultLayoutParams = this.generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (0x800003 | (0x70 & this.mButtonGravity));
            this.mNavButtonView.setLayoutParams((ViewGroup$LayoutParams)generateDefaultLayoutParams);
        }
    }
    
    private int getChildHorizontalGravity(final int n) {
        final int layoutDirection = ViewCompat.getLayoutDirection((View)this);
        int n2 = 0x7 & GravityCompat.getAbsoluteGravity(n, layoutDirection);
        switch (n2) {
            default: {
                if (layoutDirection == 1) {
                    n2 = 5;
                    return n2;
                }
                return 3;
            }
            case 1:
            case 3:
            case 5: {
                return n2;
            }
        }
    }
    
    private int getChildTop(final View view, final int n) {
        final Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)view.getLayoutParams();
        final int measuredHeight = view.getMeasuredHeight();
        int n2;
        if (n > 0) {
            n2 = (measuredHeight - n) / 2;
        }
        else {
            n2 = 0;
        }
        switch (this.getChildVerticalGravity(toolbar$LayoutParams.gravity)) {
            default: {
                final int paddingTop = this.getPaddingTop();
                final int paddingBottom = this.getPaddingBottom();
                final int height = this.getHeight();
                int n3 = (height - paddingTop - paddingBottom - measuredHeight) / 2;
                if (n3 < toolbar$LayoutParams.topMargin) {
                    n3 = toolbar$LayoutParams.topMargin;
                    if (!LinearLayoutCompat.a) {
                        return paddingTop + n3;
                    }
                }
                final int n4 = height - paddingBottom - measuredHeight - n3 - paddingTop;
                if (n4 < toolbar$LayoutParams.bottomMargin) {
                    n3 = Math.max(0, n3 - (toolbar$LayoutParams.bottomMargin - n4));
                }
                return paddingTop + n3;
            }
            case 48: {
                return this.getPaddingTop() - n2;
            }
            case 80: {
                return this.getHeight() - this.getPaddingBottom() - measuredHeight - toolbar$LayoutParams.bottomMargin - n2;
            }
        }
    }
    
    private int getChildVerticalGravity(final int n) {
        int n2 = n & 0x70;
        switch (n2) {
            default: {
                n2 = (0x70 & this.mGravity);
                return n2;
            }
            case 16:
            case 48:
            case 80: {
                return n2;
            }
        }
    }
    
    private int getHorizontalMargins(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return MarginLayoutParamsCompat.getMarginStart(viewGroup$MarginLayoutParams) + MarginLayoutParamsCompat.getMarginEnd(viewGroup$MarginLayoutParams);
    }
    
    private int getMinimumHeightCompat() {
        if (Build$VERSION.SDK_INT >= 16) {
            return ViewCompat.getMinimumHeight((View)this);
        }
        return this.mMinHeight;
    }
    
    private int getVerticalMargins(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
    }
    
    private int getViewListMeasuredWidth(final List list, final int[] array) {
        final boolean a = LinearLayoutCompat.a;
        final int n = array[0];
        final int n2 = array[1];
        final int size = list.size();
        int i = 0;
        int n3 = 0;
        int max = n2;
        int max2 = n;
        while (i < size) {
            final View view = list.get(i);
            final Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)view.getLayoutParams();
            final int n4 = toolbar$LayoutParams.leftMargin - max2;
            final int n5 = toolbar$LayoutParams.rightMargin - max;
            final int max3 = Math.max(0, n4);
            final int max4 = Math.max(0, n5);
            max2 = Math.max(0, -n4);
            max = Math.max(0, -n5);
            final int n6 = n3 + (max4 + (max3 + view.getMeasuredWidth()));
            final int n7 = i + 1;
            if (a) {
                return n6;
            }
            i = n7;
            n3 = n6;
        }
        return n3;
    }
    
    private int layoutChildLeft(final View view, final int n, final int[] array, final int n2) {
        final Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)view.getLayoutParams();
        final int n3 = toolbar$LayoutParams.leftMargin - array[0];
        final int n4 = n + Math.max(0, n3);
        array[0] = Math.max(0, -n3);
        final int childTop = this.getChildTop(view, n2);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n4, childTop, n4 + measuredWidth, childTop + view.getMeasuredHeight());
        return n4 + (measuredWidth + toolbar$LayoutParams.rightMargin);
    }
    
    private int layoutChildRight(final View view, final int n, final int[] array, final int n2) {
        final Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)view.getLayoutParams();
        final int n3 = toolbar$LayoutParams.rightMargin - array[1];
        final int n4 = n - Math.max(0, n3);
        array[1] = Math.max(0, -n3);
        final int childTop = this.getChildTop(view, n2);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n4 - measuredWidth, childTop, n4, childTop + view.getMeasuredHeight());
        return n4 - (measuredWidth + toolbar$LayoutParams.leftMargin);
    }
    
    private int measureChildCollapseMargins(final View view, final int n, final int n2, final int n3, final int n4, final int[] array) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int n5 = viewGroup$MarginLayoutParams.leftMargin - array[0];
        final int n6 = viewGroup$MarginLayoutParams.rightMargin - array[1];
        final int n7 = Math.max(0, n5) + Math.max(0, n6);
        array[0] = Math.max(0, -n5);
        array[1] = Math.max(0, -n6);
        view.measure(getChildMeasureSpec(n, n2 + (n7 + (this.getPaddingLeft() + this.getPaddingRight())), viewGroup$MarginLayoutParams.width), getChildMeasureSpec(n3, n4 + (this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin), viewGroup$MarginLayoutParams.height));
        return n7 + view.getMeasuredWidth();
    }
    
    private void measureChildConstrained(final View view, final int n, final int n2, final int n3, final int n4, int min) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int childMeasureSpec = getChildMeasureSpec(n, n2 + (this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin), viewGroup$MarginLayoutParams.width);
        int n5 = getChildMeasureSpec(n3, n4 + (this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin), viewGroup$MarginLayoutParams.height);
        final int mode = View$MeasureSpec.getMode(n5);
        if (mode != 1073741824 && min >= 0) {
            if (mode != 0) {
                min = Math.min(View$MeasureSpec.getSize(n5), min);
            }
            n5 = View$MeasureSpec.makeMeasureSpec(min, 1073741824);
        }
        view.measure(childMeasureSpec, n5);
    }
    
    private void postShowOverflowMenu() {
        this.removeCallbacks(this.mShowOverflowMenuRunnable);
        this.post(this.mShowOverflowMenuRunnable);
    }
    
    private void setChildVisibilityForExpandedActionView(final boolean b) {
        final boolean a = LinearLayoutCompat.a;
        int n;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; i = n) {
            final View child = this.getChildAt(i);
            if (((Toolbar$LayoutParams)child.getLayoutParams()).mViewType != 2 && child != this.mMenuView) {
                int visibility;
                if (b) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                child.setVisibility(visibility);
            }
            n = i + 1;
            if (a) {
                break;
            }
        }
    }
    
    private boolean shouldCollapse() {
        final boolean a = LinearLayoutCompat.a;
        if (this.mCollapsible) {
            final int childCount = this.getChildCount();
            int i = 0;
            while (i < childCount) {
                final View child = this.getChildAt(i);
                if (this.shouldLayout(child) && child.getMeasuredWidth() > 0 && child.getMeasuredHeight() > 0) {
                    return false;
                }
                ++i;
                if (a) {
                    break;
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean shouldLayout(final View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }
    
    private void updateChildVisibilityForExpandedActionView(final View view) {
        if (((Toolbar$LayoutParams)view.getLayoutParams()).mViewType != 2 && view != this.mMenuView) {
            int visibility;
            if (this.mExpandedActionView != null) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            view.setVisibility(visibility);
        }
    }
    
    public boolean canShowOverflowMenu() {
        return this.getVisibility() == 0 && this.mMenuView != null && this.mMenuView.isOverflowReserved();
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof Toolbar$LayoutParams;
    }
    
    public void collapseActionView() {
        MenuItemImpl mCurrentExpandedItem;
        if (this.mExpandedMenuPresenter == null) {
            mCurrentExpandedItem = null;
        }
        else {
            mCurrentExpandedItem = this.mExpandedMenuPresenter.mCurrentExpandedItem;
        }
        if (mCurrentExpandedItem != null) {
            mCurrentExpandedItem.collapseActionView();
        }
    }
    
    public void dismissPopupMenus() {
        if (this.mMenuView != null) {
            this.mMenuView.dismissPopupMenus();
        }
    }
    
    protected Toolbar$LayoutParams generateDefaultLayoutParams() {
        return new Toolbar$LayoutParams(-2, -2);
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)this.generateDefaultLayoutParams();
    }
    
    public Toolbar$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new Toolbar$LayoutParams(this.getContext(), set);
    }
    
    protected Toolbar$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof Toolbar$LayoutParams) {
            return new Toolbar$LayoutParams((Toolbar$LayoutParams)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ActionBar$LayoutParams) {
            return new Toolbar$LayoutParams((ActionBar$LayoutParams)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new Toolbar$LayoutParams((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new Toolbar$LayoutParams(viewGroup$LayoutParams);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)this.generateLayoutParams(set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)this.generateLayoutParams(viewGroup$LayoutParams);
    }
    
    public int getContentInsetEnd() {
        return this.mContentInsets.getEnd();
    }
    
    public int getContentInsetLeft() {
        return this.mContentInsets.getLeft();
    }
    
    public int getContentInsetRight() {
        return this.mContentInsets.getRight();
    }
    
    public int getContentInsetStart() {
        return this.mContentInsets.getStart();
    }
    
    public Menu getMenu() {
        this.ensureMenu();
        return this.mMenuView.getMenu();
    }
    
    @Nullable
    public CharSequence getNavigationContentDescription() {
        if (this.mNavButtonView != null) {
            return this.mNavButtonView.getContentDescription();
        }
        return null;
    }
    
    @Nullable
    public Drawable getNavigationIcon() {
        if (this.mNavButtonView != null) {
            return this.mNavButtonView.getDrawable();
        }
        return null;
    }
    
    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }
    
    public CharSequence getTitle() {
        return this.mTitleText;
    }
    
    public DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return this.mWrapper;
    }
    
    public boolean hasExpandedActionView() {
        return this.mExpandedMenuPresenter != null && this.mExpandedMenuPresenter.mCurrentExpandedItem != null;
    }
    
    public boolean hideOverflowMenu() {
        return this.mMenuView != null && this.mMenuView.hideOverflowMenu();
    }
    
    public boolean isOverflowMenuShowPending() {
        return this.mMenuView != null && this.mMenuView.isOverflowMenuShowPending();
    }
    
    public boolean isOverflowMenuShowing() {
        return this.mMenuView != null && this.mMenuView.isOverflowMenuShowing();
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.mShowOverflowMenuRunnable);
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final boolean a = LinearLayoutCompat.a;
        boolean b2;
        if (ViewCompat.getLayoutDirection((View)this) == 1) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        int n5 = width - paddingRight;
        final int[] mTempMargins = this.mTempMargins;
        mTempMargins[mTempMargins[1] = 0] = 0;
        final int minimumHeightCompat = this.getMinimumHeightCompat();
        while (true) {
            Label_1711: {
                if (!this.shouldLayout((View)this.mNavButtonView)) {
                    break Label_1711;
                }
                if (b2) {
                    n5 = this.layoutChildRight((View)this.mNavButtonView, n5, mTempMargins, minimumHeightCompat);
                    if (!a) {
                        break Label_1711;
                    }
                }
                int n6 = this.layoutChildLeft((View)this.mNavButtonView, paddingLeft, mTempMargins, minimumHeightCompat);
                Label_0187: {
                    if (this.shouldLayout((View)this.mCollapseButtonView)) {
                        if (b2) {
                            n5 = this.layoutChildRight((View)this.mCollapseButtonView, n5, mTempMargins, minimumHeightCompat);
                            if (!a) {
                                break Label_0187;
                            }
                        }
                        n6 = this.layoutChildLeft((View)this.mCollapseButtonView, n6, mTempMargins, minimumHeightCompat);
                    }
                }
                Label_0240: {
                    if (this.shouldLayout((View)this.mMenuView)) {
                        if (b2) {
                            n6 = this.layoutChildLeft((View)this.mMenuView, n6, mTempMargins, minimumHeightCompat);
                            if (!a) {
                                break Label_0240;
                            }
                        }
                        n5 = this.layoutChildRight((View)this.mMenuView, n5, mTempMargins, minimumHeightCompat);
                    }
                }
                mTempMargins[0] = Math.max(0, this.getContentInsetLeft() - n6);
                mTempMargins[1] = Math.max(0, this.getContentInsetRight() - (width - paddingRight - n5));
                int n7 = Math.max(n6, this.getContentInsetLeft());
                int n8 = Math.min(n5, width - paddingRight - this.getContentInsetRight());
                Label_0357: {
                    if (this.shouldLayout(this.mExpandedActionView)) {
                        if (b2) {
                            n8 = this.layoutChildRight(this.mExpandedActionView, n8, mTempMargins, minimumHeightCompat);
                            if (!a) {
                                break Label_0357;
                            }
                        }
                        n7 = this.layoutChildLeft(this.mExpandedActionView, n7, mTempMargins, minimumHeightCompat);
                    }
                }
            Label_1376_Outer:
                while (true) {
                    Label_1700: {
                        if (!this.shouldLayout((View)this.mLogoView)) {
                            break Label_1700;
                        }
                        if (b2) {
                            n8 = this.layoutChildRight((View)this.mLogoView, n8, mTempMargins, minimumHeightCompat);
                            if (!a) {
                                break Label_1700;
                            }
                        }
                        final int layoutChildLeft = this.layoutChildLeft((View)this.mLogoView, n7, mTempMargins, minimumHeightCompat);
                        int min = n8;
                        int max = layoutChildLeft;
                        final boolean shouldLayout = this.shouldLayout((View)this.mTitleTextView);
                        final boolean shouldLayout2 = this.shouldLayout((View)this.mSubtitleTextView);
                        int n9 = 0;
                        if (shouldLayout) {
                            final Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)this.mTitleTextView.getLayoutParams();
                            n9 = 0 + (toolbar$LayoutParams.topMargin + this.mTitleTextView.getMeasuredHeight() + toolbar$LayoutParams.bottomMargin);
                        }
                        int n10;
                        if (shouldLayout2) {
                            final Toolbar$LayoutParams toolbar$LayoutParams2 = (Toolbar$LayoutParams)this.mSubtitleTextView.getLayoutParams();
                            n10 = n9 + (toolbar$LayoutParams2.topMargin + this.mSubtitleTextView.getMeasuredHeight() + toolbar$LayoutParams2.bottomMargin);
                        }
                        else {
                            n10 = n9;
                        }
                        Label_1238: {
                            if (shouldLayout || shouldLayout2) {
                                TextView textView;
                                if (shouldLayout) {
                                    textView = this.mTitleTextView;
                                }
                                else {
                                    textView = this.mSubtitleTextView;
                                }
                                TextView textView2;
                                if (shouldLayout2) {
                                    textView2 = this.mSubtitleTextView;
                                }
                                else {
                                    textView2 = this.mTitleTextView;
                                }
                                final Toolbar$LayoutParams toolbar$LayoutParams3 = (Toolbar$LayoutParams)((View)textView).getLayoutParams();
                                final Toolbar$LayoutParams toolbar$LayoutParams4 = (Toolbar$LayoutParams)((View)textView2).getLayoutParams();
                                boolean b3;
                                if ((shouldLayout && this.mTitleTextView.getMeasuredWidth() > 0) || (shouldLayout2 && this.mSubtitleTextView.getMeasuredWidth() > 0)) {
                                    b3 = true;
                                }
                                else {
                                    b3 = false;
                                }
                                int n11 = 0;
                                Label_0773: {
                                    int n14;
                                    while (true) {
                                        switch (0x70 & this.mGravity) {
                                            case 80: {
                                                n11 = height - paddingBottom - toolbar$LayoutParams4.bottomMargin - this.mTitleMarginBottom - n10;
                                                break Label_0773;
                                            }
                                            case 48: {
                                                final int n12 = this.getPaddingTop() + toolbar$LayoutParams3.topMargin + this.mTitleMarginTop;
                                                if (!a) {
                                                    n11 = n12;
                                                    break Label_0773;
                                                }
                                                break;
                                            }
                                        }
                                        int max2 = (height - paddingTop - paddingBottom - n10) / 2;
                                        Label_0740: {
                                            if (max2 < toolbar$LayoutParams3.topMargin + this.mTitleMarginTop) {
                                                max2 = toolbar$LayoutParams3.topMargin + this.mTitleMarginTop;
                                                if (!a) {
                                                    break Label_0740;
                                                }
                                            }
                                            final int n13 = height - paddingBottom - n10 - max2 - paddingTop;
                                            if (n13 < toolbar$LayoutParams3.bottomMargin + this.mTitleMarginBottom) {
                                                max2 = Math.max(0, max2 - (toolbar$LayoutParams4.bottomMargin + this.mTitleMarginBottom - n13));
                                            }
                                        }
                                        n14 = paddingTop + max2;
                                        if (a) {
                                            continue Label_1376_Outer;
                                        }
                                        break;
                                    }
                                    n11 = n14;
                                }
                                if (b2) {
                                    int mTitleMarginStart;
                                    if (b3) {
                                        mTitleMarginStart = this.mTitleMarginStart;
                                    }
                                    else {
                                        mTitleMarginStart = 0;
                                    }
                                    final int n15 = mTitleMarginStart - mTempMargins[1];
                                    min -= Math.max(0, n15);
                                    mTempMargins[1] = Math.max(0, -n15);
                                    int n20;
                                    if (shouldLayout) {
                                        final Toolbar$LayoutParams toolbar$LayoutParams5 = (Toolbar$LayoutParams)this.mTitleTextView.getLayoutParams();
                                        final int n16 = min - this.mTitleTextView.getMeasuredWidth();
                                        final int n17 = n11 + this.mTitleTextView.getMeasuredHeight();
                                        this.mTitleTextView.layout(n16, n11, min, n17);
                                        final int n18 = n16 - this.mTitleMarginEnd;
                                        final int n19 = n17 + toolbar$LayoutParams5.bottomMargin;
                                        n20 = n18;
                                        n11 = n19;
                                    }
                                    else {
                                        n20 = min;
                                    }
                                    int n25;
                                    if (shouldLayout2) {
                                        final Toolbar$LayoutParams toolbar$LayoutParams6 = (Toolbar$LayoutParams)this.mSubtitleTextView.getLayoutParams();
                                        final int n21 = n11 + toolbar$LayoutParams6.topMargin;
                                        final int n22 = min - this.mSubtitleTextView.getMeasuredWidth();
                                        final int n23 = n21 + this.mSubtitleTextView.getMeasuredHeight();
                                        this.mSubtitleTextView.layout(n22, n21, min, n23);
                                        final int n24 = min - this.mTitleMarginEnd;
                                        n11 = n23 + toolbar$LayoutParams6.bottomMargin;
                                        n25 = n24;
                                    }
                                    else {
                                        n25 = min;
                                    }
                                    if (b3) {
                                        min = Math.min(n20, n25);
                                    }
                                    if (!a) {
                                        break Label_1238;
                                    }
                                }
                                int mTitleMarginStart2;
                                if (b3) {
                                    mTitleMarginStart2 = this.mTitleMarginStart;
                                }
                                else {
                                    mTitleMarginStart2 = 0;
                                }
                                final int n26 = mTitleMarginStart2 - mTempMargins[0];
                                max += Math.max(0, n26);
                                mTempMargins[0] = Math.max(0, -n26);
                                int n31;
                                if (shouldLayout) {
                                    final Toolbar$LayoutParams toolbar$LayoutParams7 = (Toolbar$LayoutParams)this.mTitleTextView.getLayoutParams();
                                    final int n27 = max + this.mTitleTextView.getMeasuredWidth();
                                    final int n28 = n11 + this.mTitleTextView.getMeasuredHeight();
                                    this.mTitleTextView.layout(max, n11, n27, n28);
                                    final int n29 = n27 + this.mTitleMarginEnd;
                                    final int n30 = n28 + toolbar$LayoutParams7.bottomMargin;
                                    n31 = n29;
                                    n11 = n30;
                                }
                                else {
                                    n31 = max;
                                }
                                int n37;
                                if (shouldLayout2) {
                                    final Toolbar$LayoutParams toolbar$LayoutParams8 = (Toolbar$LayoutParams)this.mSubtitleTextView.getLayoutParams();
                                    final int n32 = n11 + toolbar$LayoutParams8.topMargin;
                                    final int n33 = max + this.mSubtitleTextView.getMeasuredWidth();
                                    final int n34 = n32 + this.mSubtitleTextView.getMeasuredHeight();
                                    this.mSubtitleTextView.layout(max, n32, n33, n34);
                                    final int n35 = n33 + this.mTitleMarginEnd;
                                    final int n36 = n34 + toolbar$LayoutParams8.bottomMargin;
                                    n37 = n35;
                                }
                                else {
                                    n37 = max;
                                }
                                if (b3) {
                                    max = Math.max(n31, n37);
                                }
                            }
                        }
                        this.addCustomViewsWithGravity(this.mTempViews, 3);
                        final int size = this.mTempViews.size();
                        int i = 0;
                        int n38 = max;
                        while (i < size) {
                            final int layoutChildLeft2 = this.layoutChildLeft(this.mTempViews.get(i), n38, mTempMargins, minimumHeightCompat);
                            final int n39 = i + 1;
                            if (a) {
                                n38 = layoutChildLeft2;
                                break;
                            }
                            i = n39;
                            n38 = layoutChildLeft2;
                        }
                        this.addCustomViewsWithGravity(this.mTempViews, 5);
                        final int size2 = this.mTempViews.size();
                        int n40 = min;
                        while (true) {
                            int layoutChildRight;
                            int n41;
                            for (int j = 0; j < size2; j = n41, n40 = layoutChildRight) {
                                layoutChildRight = this.layoutChildRight(this.mTempViews.get(j), n40, mTempMargins, minimumHeightCompat);
                                n41 = j + 1;
                                if (a) {
                                    this.addCustomViewsWithGravity(this.mTempViews, 1);
                                    final int viewListMeasuredWidth = this.getViewListMeasuredWidth(this.mTempViews, mTempMargins);
                                    final int n42 = paddingLeft + (width - paddingLeft - paddingRight) / 2 - viewListMeasuredWidth / 2;
                                    final int n43 = n42 + viewListMeasuredWidth;
                                    Label_1453: {
                                        if (n42 < n38) {
                                            if (!a) {
                                                break Label_1453;
                                            }
                                        }
                                        else {
                                            n38 = n42;
                                        }
                                        if (n43 > layoutChildRight) {
                                            n38 -= n43 - layoutChildRight;
                                        }
                                    }
                                    final int size3 = this.mTempViews.size();
                                    int layoutChildLeft3 = n38;
                                    int n44;
                                    for (int k = 0; k < size3; k = n44) {
                                        layoutChildLeft3 = this.layoutChildLeft((View)this.mTempViews.get(k), layoutChildLeft3, mTempMargins, minimumHeightCompat);
                                        n44 = k + 1;
                                        if (a) {
                                            break;
                                        }
                                    }
                                    this.mTempViews.clear();
                                    if (AppCompatActivity.b) {
                                        LinearLayoutCompat.a = !a;
                                    }
                                    return;
                                }
                            }
                            layoutChildRight = n40;
                            continue;
                        }
                    }
                    int min = n8;
                    int max = n7;
                    continue;
                }
            }
            int n6 = paddingLeft;
            continue;
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final boolean a = LinearLayoutCompat.a;
        final int[] mTempMargins = this.mTempMargins;
        int n3;
        int n4;
        if (!ViewUtils.isLayoutRtl((View)this) || a) {
            n3 = 1;
            n4 = 0;
        }
        else {
            n4 = 1;
            n3 = 0;
        }
        final boolean shouldLayout = this.shouldLayout((View)this.mNavButtonView);
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        if (shouldLayout) {
            this.measureChildConstrained((View)this.mNavButtonView, n, 0, n2, 0, this.mMaxButtonHeight);
            n5 = this.mNavButtonView.getMeasuredWidth() + this.getHorizontalMargins((View)this.mNavButtonView);
            final int max = Math.max(0, this.mNavButtonView.getMeasuredHeight() + this.getVerticalMargins((View)this.mNavButtonView));
            n6 = ViewUtils.combineMeasuredStates(0, ViewCompat.getMeasuredState((View)this.mNavButtonView));
            n7 = max;
        }
        if (this.shouldLayout((View)this.mCollapseButtonView)) {
            this.measureChildConstrained((View)this.mCollapseButtonView, n, 0, n2, 0, this.mMaxButtonHeight);
            n5 = this.mCollapseButtonView.getMeasuredWidth() + this.getHorizontalMargins((View)this.mCollapseButtonView);
            n7 = Math.max(n7, this.mCollapseButtonView.getMeasuredHeight() + this.getVerticalMargins((View)this.mCollapseButtonView));
            n6 = ViewUtils.combineMeasuredStates(n6, ViewCompat.getMeasuredState((View)this.mCollapseButtonView));
        }
        final int contentInsetStart = this.getContentInsetStart();
        final int n8 = 0 + Math.max(contentInsetStart, n5);
        mTempMargins[n4] = Math.max(0, contentInsetStart - n5);
        final boolean shouldLayout2 = this.shouldLayout((View)this.mMenuView);
        int n9 = 0;
        if (shouldLayout2) {
            this.measureChildConstrained((View)this.mMenuView, n, n8, n2, 0, this.mMaxButtonHeight);
            n9 = this.mMenuView.getMeasuredWidth() + this.getHorizontalMargins((View)this.mMenuView);
            n7 = Math.max(n7, this.mMenuView.getMeasuredHeight() + this.getVerticalMargins((View)this.mMenuView));
            n6 = ViewUtils.combineMeasuredStates(n6, ViewCompat.getMeasuredState((View)this.mMenuView));
        }
        final int contentInsetEnd = this.getContentInsetEnd();
        int n10 = n8 + Math.max(contentInsetEnd, n9);
        mTempMargins[n3] = Math.max(0, contentInsetEnd - n9);
        if (this.shouldLayout(this.mExpandedActionView)) {
            n10 += this.measureChildCollapseMargins(this.mExpandedActionView, n, n10, n2, 0, mTempMargins);
            n7 = Math.max(n7, this.mExpandedActionView.getMeasuredHeight() + this.getVerticalMargins(this.mExpandedActionView));
            n6 = ViewUtils.combineMeasuredStates(n6, ViewCompat.getMeasuredState(this.mExpandedActionView));
        }
        if (this.shouldLayout((View)this.mLogoView)) {
            n10 += this.measureChildCollapseMargins((View)this.mLogoView, n, n10, n2, 0, mTempMargins);
            n7 = Math.max(n7, this.mLogoView.getMeasuredHeight() + this.getVerticalMargins((View)this.mLogoView));
            n6 = ViewUtils.combineMeasuredStates(n6, ViewCompat.getMeasuredState((View)this.mLogoView));
        }
        final int childCount = this.getChildCount();
        int n11 = n6;
        int n12 = n7;
        while (true) {
            int combineMeasuredStates;
            int n13;
            int n14;
            for (int i = 0; i < childCount; i = n14, n11 = combineMeasuredStates, n12 = n13) {
                final View child = this.getChildAt(i);
                if (((Toolbar$LayoutParams)child.getLayoutParams()).mViewType == 0 && (this.shouldLayout(child) || a)) {
                    n10 += this.measureChildCollapseMargins(child, n, n10, n2, 0, mTempMargins);
                    final int max2 = Math.max(n12, child.getMeasuredHeight() + this.getVerticalMargins(child));
                    combineMeasuredStates = ViewUtils.combineMeasuredStates(n11, ViewCompat.getMeasuredState(child));
                    n13 = max2;
                }
                else {
                    combineMeasuredStates = n11;
                    n13 = n12;
                }
                n14 = i + 1;
                if (a) {
                    n11 = combineMeasuredStates;
                    n12 = n13;
                    final int n15 = n10;
                    final int n16 = this.mTitleMarginTop + this.mTitleMarginBottom;
                    final int n17 = this.mTitleMarginStart + this.mTitleMarginEnd;
                    int max3;
                    int combineMeasuredStates3;
                    int n20;
                    if (this.shouldLayout((View)this.mTitleTextView)) {
                        this.measureChildCollapseMargins((View)this.mTitleTextView, n, n15 + n17, n2, n16, mTempMargins);
                        final int n18 = this.mTitleTextView.getMeasuredWidth() + this.getHorizontalMargins((View)this.mTitleTextView);
                        final int n19 = this.mTitleTextView.getMeasuredHeight() + this.getVerticalMargins((View)this.mTitleTextView);
                        final int combineMeasuredStates2 = ViewUtils.combineMeasuredStates(n11, ViewCompat.getMeasuredState((View)this.mTitleTextView));
                        max3 = n18;
                        combineMeasuredStates3 = combineMeasuredStates2;
                        n20 = n19;
                    }
                    else {
                        combineMeasuredStates3 = n11;
                        n20 = 0;
                        max3 = 0;
                    }
                    if (this.shouldLayout((View)this.mSubtitleTextView)) {
                        max3 = Math.max(max3, this.measureChildCollapseMargins((View)this.mSubtitleTextView, n, n15 + n17, n2, n16 + n20, mTempMargins));
                        n20 += this.mSubtitleTextView.getMeasuredHeight() + this.getVerticalMargins((View)this.mSubtitleTextView);
                        combineMeasuredStates3 = ViewUtils.combineMeasuredStates(combineMeasuredStates3, ViewCompat.getMeasuredState((View)this.mSubtitleTextView));
                    }
                    final int n21 = n15 + max3;
                    final int max4 = Math.max(n12, n20);
                    final int n22 = n21 + (this.getPaddingLeft() + this.getPaddingRight());
                    final int n23 = max4 + (this.getPaddingTop() + this.getPaddingBottom());
                    final int resolveSizeAndState = ViewCompat.resolveSizeAndState(Math.max(n22, this.getSuggestedMinimumWidth()), n, 0xFF000000 & combineMeasuredStates3);
                    int resolveSizeAndState2 = ViewCompat.resolveSizeAndState(Math.max(n23, this.getSuggestedMinimumHeight()), n2, combineMeasuredStates3 << 16);
                    if (this.shouldCollapse()) {
                        resolveSizeAndState2 = 0;
                    }
                    this.setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
                    return;
                }
            }
            final int n15 = n10;
            continue;
        }
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final Toolbar$SavedState toolbar$SavedState = (Toolbar$SavedState)parcelable;
        super.onRestoreInstanceState(toolbar$SavedState.getSuperState());
        Object peekMenu;
        if (this.mMenuView != null) {
            peekMenu = this.mMenuView.peekMenu();
        }
        else {
            peekMenu = null;
        }
        if (toolbar$SavedState.expandedMenuItemId != 0 && this.mExpandedMenuPresenter != null && peekMenu != null) {
            final MenuItem item = ((Menu)peekMenu).findItem(toolbar$SavedState.expandedMenuItemId);
            if (item != null) {
                MenuItemCompat.expandActionView(item);
            }
        }
        if (toolbar$SavedState.isOverflowOpen) {
            this.postShowOverflowMenu();
        }
    }
    
    public void onRtlPropertiesChanged(final int n) {
        boolean direction = true;
        if (Build$VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(n);
        }
        final RtlSpacingHelper mContentInsets = this.mContentInsets;
        if (n != (direction ? 1 : 0)) {
            direction = false;
        }
        mContentInsets.setDirection(direction);
    }
    
    protected Parcelable onSaveInstanceState() {
        final Toolbar$SavedState toolbar$SavedState = new Toolbar$SavedState(super.onSaveInstanceState());
        if (this.mExpandedMenuPresenter != null && this.mExpandedMenuPresenter.mCurrentExpandedItem != null) {
            toolbar$SavedState.expandedMenuItemId = this.mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
        }
        toolbar$SavedState.isOverflowOpen = this.isOverflowMenuShowing();
        return (Parcelable)toolbar$SavedState;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }
    
    public void setCollapsible(final boolean mCollapsible) {
        this.mCollapsible = mCollapsible;
        this.requestLayout();
    }
    
    public void setContentInsetsAbsolute(final int n, final int n2) {
        this.mContentInsets.setAbsolute(n, n2);
    }
    
    public void setContentInsetsRelative(final int n, final int n2) {
        this.mContentInsets.setRelative(n, n2);
    }
    
    public void setLogo(final Drawable imageDrawable) {
        Label_0065: {
            if (imageDrawable != null) {
                this.ensureLogoView();
                if (this.mLogoView.getParent() != null) {
                    break Label_0065;
                }
                this.addSystemView((View)this.mLogoView);
                this.updateChildVisibilityForExpandedActionView((View)this.mLogoView);
                if (!LinearLayoutCompat.a) {
                    break Label_0065;
                }
            }
            if (this.mLogoView != null && this.mLogoView.getParent() != null) {
                this.removeView((View)this.mLogoView);
            }
        }
        if (this.mLogoView != null) {
            this.mLogoView.setImageDrawable(imageDrawable);
        }
    }
    
    public void setMenu(final MenuBuilder menuBuilder, final ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder != null || this.mMenuView != null) {
            this.ensureMenuView();
            final MenuBuilder peekMenu = this.mMenuView.peekMenu();
            if (peekMenu != menuBuilder) {
                if (peekMenu != null) {
                    peekMenu.removeMenuPresenter(this.mOuterActionMenuPresenter);
                    peekMenu.removeMenuPresenter(this.mExpandedMenuPresenter);
                }
                if (this.mExpandedMenuPresenter == null) {
                    this.mExpandedMenuPresenter = new Toolbar$ExpandedActionViewMenuPresenter(this, null);
                }
                actionMenuPresenter.setExpandedActionViewsExclusive(true);
                Label_0139: {
                    if (menuBuilder != null) {
                        menuBuilder.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
                        menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
                        if (!LinearLayoutCompat.a) {
                            break Label_0139;
                        }
                    }
                    actionMenuPresenter.initForMenu(this.mPopupContext, null);
                    this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
                    actionMenuPresenter.updateMenuView(true);
                    this.mExpandedMenuPresenter.updateMenuView(true);
                }
                this.mMenuView.setPopupTheme(this.mPopupTheme);
                this.mMenuView.setPresenter(actionMenuPresenter);
                this.mOuterActionMenuPresenter = actionMenuPresenter;
            }
        }
    }
    
    public void setMenuCallbacks(final MenuPresenter$Callback mActionMenuPresenterCallback, final MenuBuilder$Callback mMenuBuilderCallback) {
        this.mActionMenuPresenterCallback = mActionMenuPresenterCallback;
        this.mMenuBuilderCallback = mMenuBuilderCallback;
    }
    
    public void setMinimumHeight(final int mMinHeight) {
        super.setMinimumHeight(this.mMinHeight = mMinHeight);
    }
    
    public void setNavigationContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = this.getContext().getText(n);
        }
        else {
            text = null;
        }
        this.setNavigationContentDescription(text);
    }
    
    public void setNavigationContentDescription(@Nullable final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.ensureNavButtonView();
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setContentDescription(contentDescription);
        }
    }
    
    public void setNavigationIcon(final int n) {
        this.setNavigationIcon(this.mTintManager.getDrawable(n));
    }
    
    public void setNavigationIcon(@Nullable final Drawable imageDrawable) {
        Label_0065: {
            if (imageDrawable != null) {
                this.ensureNavButtonView();
                if (this.mNavButtonView.getParent() != null) {
                    break Label_0065;
                }
                this.addSystemView((View)this.mNavButtonView);
                this.updateChildVisibilityForExpandedActionView((View)this.mNavButtonView);
                if (!LinearLayoutCompat.a) {
                    break Label_0065;
                }
            }
            if (this.mNavButtonView != null && this.mNavButtonView.getParent() != null) {
                this.removeView((View)this.mNavButtonView);
            }
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setImageDrawable(imageDrawable);
        }
    }
    
    public void setNavigationOnClickListener(final View$OnClickListener onClickListener) {
        this.ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }
    
    public void setOnMenuItemClickListener(final Toolbar$OnMenuItemClickListener mOnMenuItemClickListener) {
        this.mOnMenuItemClickListener = mOnMenuItemClickListener;
    }
    
    public void setPopupTheme(final int mPopupTheme) {
        if (this.mPopupTheme != mPopupTheme) {
            if ((this.mPopupTheme = mPopupTheme) == 0) {
                this.mPopupContext = this.getContext();
                if (!LinearLayoutCompat.a) {
                    return;
                }
            }
            this.mPopupContext = (Context)new ContextThemeWrapper(this.getContext(), mPopupTheme);
        }
    }
    
    public void setSubtitle(final CharSequence charSequence) {
        Label_0142: {
            if (!TextUtils.isEmpty(charSequence)) {
                if (this.mSubtitleTextView == null) {
                    final Context context = this.getContext();
                    (this.mSubtitleTextView = new TextView(context)).setSingleLine();
                    this.mSubtitleTextView.setEllipsize(TextUtils$TruncateAt.END);
                    if (this.mSubtitleTextAppearance != 0) {
                        this.mSubtitleTextView.setTextAppearance(context, this.mSubtitleTextAppearance);
                    }
                    if (this.mSubtitleTextColor != 0) {
                        this.mSubtitleTextView.setTextColor(this.mSubtitleTextColor);
                    }
                }
                if (this.mSubtitleTextView.getParent() != null) {
                    break Label_0142;
                }
                this.addSystemView((View)this.mSubtitleTextView);
                this.updateChildVisibilityForExpandedActionView((View)this.mSubtitleTextView);
                if (!LinearLayoutCompat.a) {
                    break Label_0142;
                }
            }
            if (this.mSubtitleTextView != null && this.mSubtitleTextView.getParent() != null) {
                this.removeView((View)this.mSubtitleTextView);
            }
        }
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }
    
    public void setSubtitleTextAppearance(final Context context, final int mSubtitleTextAppearance) {
        this.mSubtitleTextAppearance = mSubtitleTextAppearance;
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setTextAppearance(context, mSubtitleTextAppearance);
        }
    }
    
    public void setTitle(final CharSequence charSequence) {
        Label_0142: {
            if (!TextUtils.isEmpty(charSequence)) {
                if (this.mTitleTextView == null) {
                    final Context context = this.getContext();
                    (this.mTitleTextView = new TextView(context)).setSingleLine();
                    this.mTitleTextView.setEllipsize(TextUtils$TruncateAt.END);
                    if (this.mTitleTextAppearance != 0) {
                        this.mTitleTextView.setTextAppearance(context, this.mTitleTextAppearance);
                    }
                    if (this.mTitleTextColor != 0) {
                        this.mTitleTextView.setTextColor(this.mTitleTextColor);
                    }
                }
                if (this.mTitleTextView.getParent() != null) {
                    break Label_0142;
                }
                this.addSystemView((View)this.mTitleTextView);
                this.updateChildVisibilityForExpandedActionView((View)this.mTitleTextView);
                if (!LinearLayoutCompat.a) {
                    break Label_0142;
                }
            }
            if (this.mTitleTextView != null && this.mTitleTextView.getParent() != null) {
                this.removeView((View)this.mTitleTextView);
            }
        }
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }
    
    public void setTitleTextAppearance(final Context context, final int mTitleTextAppearance) {
        this.mTitleTextAppearance = mTitleTextAppearance;
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setTextAppearance(context, mTitleTextAppearance);
        }
    }
    
    public boolean showOverflowMenu() {
        return this.mMenuView != null && this.mMenuView.showOverflowMenu();
    }
}
