// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.ContextThemeWrapper;
import android.support.v7.internal.widget.ViewUtils;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.view.MenuItem;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuPresenter;
import android.view.Menu;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.view.View$MeasureSpec;
import android.view.View;
import android.util.AttributeSet;
import android.support.v7.internal.view.menu.MenuBuilder$Callback;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.content.Context;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.view.menu.MenuBuilder$ItemInvoker;

public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder$ItemInvoker, MenuView
{
    private MenuPresenter$Callback mActionMenuPresenterCallback;
    private Context mContext;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    private MenuBuilder$Callback mMenuBuilderCallback;
    private int mMinCellSize;
    private ActionMenuView$OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;
    
    public ActionMenuView(final Context context) {
        this(context, null);
    }
    
    public ActionMenuView(final Context context, final AttributeSet set) {
        super(context, set);
        this.mContext = context;
        this.setBaselineAligned(false);
        final float density = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int)(56.0f * density);
        this.mGeneratedItemPadding = (int)(density * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }
    
    static ActionMenuView$OnMenuItemClickListener access$200(final ActionMenuView actionMenuView) {
        return actionMenuView.mOnMenuItemClickListener;
    }
    
    static MenuBuilder$Callback access$300(final ActionMenuView actionMenuView) {
        return actionMenuView.mMenuBuilderCallback;
    }
    
    static int measureChildForCells(final View view, final int n, final int n2, final int n3, final int n4) {
        final ActionMenuView$LayoutParams actionMenuView$LayoutParams = (ActionMenuView$LayoutParams)view.getLayoutParams();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n3) - n4, View$MeasureSpec.getMode(n3));
        ActionMenuItemView actionMenuItemView;
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView)view;
        }
        else {
            actionMenuItemView = null;
        }
        boolean b;
        if (actionMenuItemView != null && actionMenuItemView.hasText()) {
            b = true;
        }
        else {
            b = false;
        }
        int cellsUsed;
        if (n2 > 0 && (!b || n2 >= 2)) {
            view.measure(View$MeasureSpec.makeMeasureSpec(n * n2, Integer.MIN_VALUE), measureSpec);
            final int measuredWidth = view.getMeasuredWidth();
            cellsUsed = measuredWidth / n;
            if (measuredWidth % n != 0) {
                ++cellsUsed;
            }
            if (b && cellsUsed < 2) {
                cellsUsed = 2;
            }
        }
        else {
            cellsUsed = 0;
        }
        final boolean isOverflowButton = actionMenuView$LayoutParams.isOverflowButton;
        boolean expandable = false;
        if (!isOverflowButton) {
            expandable = false;
            if (b) {
                expandable = true;
            }
        }
        actionMenuView$LayoutParams.expandable = expandable;
        actionMenuView$LayoutParams.cellsUsed = cellsUsed;
        view.measure(View$MeasureSpec.makeMeasureSpec(cellsUsed * n, 1073741824), measureSpec);
        return cellsUsed;
    }
    
    private void onMeasureExactFormat(final int n, final int n2) {
        final boolean a = LinearLayoutCompat.a;
        final int mode = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        final int n3 = this.getPaddingLeft() + this.getPaddingRight();
        final int n4 = this.getPaddingTop() + this.getPaddingBottom();
        final int childMeasureSpec = getChildMeasureSpec(n2, n4, -2);
        final int n5 = size - n3;
        int n6 = n5 / this.mMinCellSize;
        final int n7 = n5 % this.mMinCellSize;
        if (n6 == 0) {
            this.setMeasuredDimension(n5, 0);
            return;
        }
        final int n8 = this.mMinCellSize + n7 / n6;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        long n13 = 0L;
        final int childCount = this.getChildCount();
        int i = 0;
        int n14 = 0;
        while (true) {
        Label_0311_Outer:
            while (i < childCount) {
                final View child = this.getChildAt(i);
                int n15;
                int n16;
                int n17;
                if (child.getVisibility() == 8) {
                    n15 = n10;
                    n16 = n6;
                    n17 = n9;
                }
                else {
                    final boolean b = child instanceof ActionMenuItemView;
                    final int n18 = n14 + 1;
                    if (b) {
                        child.setPadding(this.mGeneratedItemPadding, 0, this.mGeneratedItemPadding, 0);
                    }
                    final ActionMenuView$LayoutParams actionMenuView$LayoutParams = (ActionMenuView$LayoutParams)child.getLayoutParams();
                    actionMenuView$LayoutParams.expanded = false;
                    actionMenuView$LayoutParams.extraPixels = 0;
                    actionMenuView$LayoutParams.cellsUsed = 0;
                    actionMenuView$LayoutParams.expandable = false;
                    actionMenuView$LayoutParams.leftMargin = 0;
                    actionMenuView$LayoutParams.rightMargin = 0;
                    actionMenuView$LayoutParams.preventEdgeOffset = (b && ((ActionMenuItemView)child).hasText());
                    int n19;
                    if (actionMenuView$LayoutParams.isOverflowButton) {
                        n19 = 1;
                    }
                    else {
                        n19 = n6;
                    }
                    final int measureChildForCells = measureChildForCells(child, n8, n19, childMeasureSpec, n4);
                    final int max = Math.max(n10, measureChildForCells);
                    int n20;
                    if (actionMenuView$LayoutParams.expandable) {
                        n20 = n11 + 1;
                    }
                    else {
                        n20 = n11;
                    }
                    int n21;
                    if (actionMenuView$LayoutParams.isOverflowButton) {
                        n21 = 1;
                    }
                    else {
                        n21 = n12;
                    }
                    final int n22 = n6 - measureChildForCells;
                    final int max2 = Math.max(n9, child.getMeasuredHeight());
                    if (measureChildForCells == 1) {
                        n13 |= 1 << i;
                        n12 = n21;
                        n11 = n20;
                        n14 = n18;
                        n15 = max;
                        n17 = max2;
                        n16 = n22;
                    }
                    else {
                        n12 = n21;
                        n11 = n20;
                        n14 = n18;
                        n15 = max;
                        n17 = max2;
                        n16 = n22;
                    }
                }
                final int n23 = i + 1;
                if (a) {
                    final int n24 = n12;
                    final int n25 = n14;
                    final int n26 = n11;
                    final int n27 = n15;
                    final boolean b2 = n24 != 0 && n25 == 2;
                    int n28 = 0;
                Label_0311:
                    while (true) {
                        while (n26 > 0 && n16 > 0) {
                            int cellsUsed = Integer.MAX_VALUE;
                            long n29 = 0L;
                            int n30 = 0;
                            int n31;
                            for (int j = 0; j < childCount; j = n31) {
                                final ActionMenuView$LayoutParams actionMenuView$LayoutParams2 = (ActionMenuView$LayoutParams)this.getChildAt(j).getLayoutParams();
                                Label_0263: {
                                    if (actionMenuView$LayoutParams2.expandable) {
                                        if (actionMenuView$LayoutParams2.cellsUsed < cellsUsed) {
                                            cellsUsed = actionMenuView$LayoutParams2.cellsUsed;
                                            n29 = 1 << j;
                                            n30 = 1;
                                            if (!a) {
                                                break Label_0263;
                                            }
                                        }
                                        if (actionMenuView$LayoutParams2.cellsUsed == cellsUsed) {
                                            n29 |= 1 << j;
                                            ++n30;
                                        }
                                    }
                                }
                                n31 = j + 1;
                                if (a) {
                                    break;
                                }
                            }
                            final int n32 = n30;
                            final long n33 = n29;
                            final int n34 = cellsUsed;
                            final long n35 = n13 | n33;
                            if (n32 <= n16) {
                                final int n36 = n34 + 1;
                                long n37 = n35;
                                int k = 0;
                                int n38 = n16;
                                while (true) {
                                    while (k < childCount) {
                                        final View child2 = this.getChildAt(k);
                                        final ActionMenuView$LayoutParams actionMenuView$LayoutParams3 = (ActionMenuView$LayoutParams)child2.getLayoutParams();
                                        int n39 = 0;
                                        Label_1011: {
                                            Label_0950: {
                                                if ((n33 & 1 << k) == 0x0L) {
                                                    if (actionMenuView$LayoutParams3.cellsUsed == n36) {
                                                        n37 |= 1 << k;
                                                        if (a) {
                                                            break Label_0950;
                                                        }
                                                    }
                                                    n39 = n38;
                                                    break Label_1011;
                                                }
                                            }
                                            if (b2 && actionMenuView$LayoutParams3.preventEdgeOffset && n38 == 1) {
                                                child2.setPadding(n8 + this.mGeneratedItemPadding, 0, this.mGeneratedItemPadding, 0);
                                            }
                                            ++actionMenuView$LayoutParams3.cellsUsed;
                                            actionMenuView$LayoutParams3.expanded = true;
                                            n39 = n38 - 1;
                                        }
                                        final int n40 = k + 1;
                                        if (a) {
                                            final int n41 = 1;
                                            if (a) {
                                                final int n42 = n39;
                                                break Label_0311;
                                            }
                                            n28 = n41;
                                            n13 = n37;
                                            n16 = n39;
                                            continue Label_0311;
                                        }
                                        else {
                                            k = n40;
                                            n38 = n39;
                                        }
                                    }
                                    int n39 = n38;
                                    continue Label_0311_Outer;
                                }
                            }
                            long n37 = n35;
                            int n41 = n28;
                            final int n42 = n16;
                            boolean b3;
                            if (n24 == 0 && n25 == 1) {
                                b3 = true;
                            }
                            else {
                                b3 = false;
                            }
                            Label_0497: {
                                if (n42 > 0 && n37 != 0L && (n42 < n25 - 1 || b3 || n27 > 1)) {
                                    float n43 = Long.bitCount(n37);
                                    while (true) {
                                        Label_1239: {
                                            if (b3) {
                                                break Label_1239;
                                            }
                                            if ((0x1L & n37) != 0x0L && !((ActionMenuView$LayoutParams)this.getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                                                n43 -= 0.5f;
                                            }
                                            if ((n37 & 1 << childCount - 1) == 0x0L || ((ActionMenuView$LayoutParams)this.getChildAt(childCount - 1).getLayoutParams()).preventEdgeOffset) {
                                                break Label_1239;
                                            }
                                            final float n44 = n43 - 0.5f;
                                            int n45;
                                            if (n44 > 0.0f) {
                                                n45 = (int)(n42 * n8 / n44);
                                            }
                                            else {
                                                n45 = 0;
                                            }
                                            int n46;
                                            for (int l = 0; l < childCount; l = n46) {
                                                Label_0487: {
                                                    if ((n37 & 1 << l) != 0x0L) {
                                                        final View child3 = this.getChildAt(l);
                                                        final ActionMenuView$LayoutParams actionMenuView$LayoutParams4 = (ActionMenuView$LayoutParams)child3.getLayoutParams();
                                                        if (child3 instanceof ActionMenuItemView) {
                                                            actionMenuView$LayoutParams4.extraPixels = n45;
                                                            actionMenuView$LayoutParams4.expanded = true;
                                                            if (l == 0 && !actionMenuView$LayoutParams4.preventEdgeOffset) {
                                                                actionMenuView$LayoutParams4.leftMargin = -n45 / 2;
                                                            }
                                                            n41 = 1;
                                                            if (!a) {
                                                                break Label_0487;
                                                            }
                                                        }
                                                        if (actionMenuView$LayoutParams4.isOverflowButton) {
                                                            actionMenuView$LayoutParams4.extraPixels = n45;
                                                            actionMenuView$LayoutParams4.expanded = true;
                                                            actionMenuView$LayoutParams4.rightMargin = -n45 / 2;
                                                            n41 = 1;
                                                            if (!a) {
                                                                break Label_0487;
                                                            }
                                                        }
                                                        if (l != 0) {
                                                            actionMenuView$LayoutParams4.leftMargin = n45 / 2;
                                                        }
                                                        if (l != childCount - 1) {
                                                            actionMenuView$LayoutParams4.rightMargin = n45 / 2;
                                                        }
                                                    }
                                                }
                                                n46 = l + 1;
                                                if (a) {
                                                    break;
                                                }
                                            }
                                            break Label_0497;
                                        }
                                        final float n44 = n43;
                                        continue;
                                    }
                                }
                            }
                            if (n41 != 0) {
                                int n48;
                                for (int n47 = 0; n47 < childCount; n47 = n48) {
                                    final View child4 = this.getChildAt(n47);
                                    final ActionMenuView$LayoutParams actionMenuView$LayoutParams5 = (ActionMenuView$LayoutParams)child4.getLayoutParams();
                                    if (actionMenuView$LayoutParams5.expanded) {
                                        child4.measure(View$MeasureSpec.makeMeasureSpec(n8 * actionMenuView$LayoutParams5.cellsUsed + actionMenuView$LayoutParams5.extraPixels, 1073741824), childMeasureSpec);
                                    }
                                    n48 = n47 + 1;
                                    if (a) {
                                        break;
                                    }
                                }
                            }
                            int n49;
                            if (mode != 1073741824) {
                                n49 = n17;
                            }
                            else {
                                n49 = size2;
                            }
                            this.setMeasuredDimension(n5, n49);
                            return;
                        }
                        int n41 = n28;
                        long n37 = n13;
                        final int n42 = n16;
                        continue Label_0311;
                    }
                }
                i = n23;
                n9 = n17;
                n6 = n16;
                n10 = n15;
            }
            final int n24 = n12;
            final int n25 = n14;
            final int n26 = n11;
            final int n27 = n10;
            int n16 = n6;
            int n17 = n9;
            continue;
        }
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams != null && viewGroup$LayoutParams instanceof ActionMenuView$LayoutParams;
    }
    
    public void dismissPopupMenus() {
        if (this.mPresenter != null) {
            this.mPresenter.dismissPopupMenus();
        }
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return false;
    }
    
    @Override
    protected ActionMenuView$LayoutParams generateDefaultLayoutParams() {
        final ActionMenuView$LayoutParams actionMenuView$LayoutParams = new ActionMenuView$LayoutParams(-2, -2);
        actionMenuView$LayoutParams.gravity = 16;
        return actionMenuView$LayoutParams;
    }
    
    @Override
    protected LinearLayoutCompat$LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }
    
    @Override
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)this.generateDefaultLayoutParams();
    }
    
    @Override
    public ActionMenuView$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new ActionMenuView$LayoutParams(this.getContext(), set);
    }
    
    @Override
    protected ActionMenuView$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams != null) {
            ActionMenuView$LayoutParams actionMenuView$LayoutParams;
            if (viewGroup$LayoutParams instanceof ActionMenuView$LayoutParams) {
                actionMenuView$LayoutParams = new ActionMenuView$LayoutParams((ActionMenuView$LayoutParams)viewGroup$LayoutParams);
            }
            else {
                actionMenuView$LayoutParams = new ActionMenuView$LayoutParams(viewGroup$LayoutParams);
            }
            if (actionMenuView$LayoutParams.gravity <= 0) {
                actionMenuView$LayoutParams.gravity = 16;
            }
            return actionMenuView$LayoutParams;
        }
        return this.generateDefaultLayoutParams();
    }
    
    @Override
    public LinearLayoutCompat$LayoutParams generateLayoutParams(final AttributeSet set) {
        return this.generateLayoutParams(set);
    }
    
    @Override
    protected LinearLayoutCompat$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return this.generateLayoutParams(viewGroup$LayoutParams);
    }
    
    @Override
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)this.generateLayoutParams(set);
    }
    
    @Override
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)this.generateLayoutParams(viewGroup$LayoutParams);
    }
    
    public ActionMenuView$LayoutParams generateOverflowButtonLayoutParams() {
        final ActionMenuView$LayoutParams generateDefaultLayoutParams = this.generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }
    
    public Menu getMenu() {
        if (this.mMenu == null) {
            final Context context = this.getContext();
            (this.mMenu = new MenuBuilder(context)).setCallback(new ActionMenuView$MenuBuilderCallback(this, null));
            (this.mPresenter = new ActionMenuPresenter(context)).setReserveOverflow(true);
            final ActionMenuPresenter mPresenter = this.mPresenter;
            MenuPresenter$Callback mActionMenuPresenterCallback;
            if (this.mActionMenuPresenterCallback != null) {
                mActionMenuPresenterCallback = this.mActionMenuPresenterCallback;
            }
            else {
                mActionMenuPresenterCallback = new ActionMenuView$ActionMenuPresenterCallback(this, null);
            }
            mPresenter.setCallback(mActionMenuPresenterCallback);
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return (Menu)this.mMenu;
    }
    
    protected boolean hasSupportDividerBeforeChildAt(final int n) {
        if (n == 0) {
            return false;
        }
        final View child = this.getChildAt(n - 1);
        final View child2 = this.getChildAt(n);
        final int childCount = this.getChildCount();
        boolean b = false;
        if (n < childCount) {
            final boolean b2 = child instanceof ActionMenuView$ActionMenuChildView;
            b = false;
            if (b2) {
                b = (false | ((ActionMenuView$ActionMenuChildView)child).needsDividerAfter());
            }
        }
        if (n > 0 && child2 instanceof ActionMenuView$ActionMenuChildView) {
            return b | ((ActionMenuView$ActionMenuChildView)child2).needsDividerBefore();
        }
        return b;
    }
    
    public boolean hideOverflowMenu() {
        return this.mPresenter != null && this.mPresenter.hideOverflowMenu();
    }
    
    @Override
    public void initialize(final MenuBuilder mMenu) {
        this.mMenu = mMenu;
    }
    
    @Override
    public boolean invokeItem(final MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction((MenuItem)menuItemImpl, 0);
    }
    
    public boolean isOverflowMenuShowPending() {
        return this.mPresenter != null && this.mPresenter.isOverflowMenuShowPending();
    }
    
    public boolean isOverflowMenuShowing() {
        return this.mPresenter != null && this.mPresenter.isOverflowMenuShowing();
    }
    
    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        if (this.mPresenter != null) {
            this.mPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.dismissPopupMenus();
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final boolean a = LinearLayoutCompat.a;
        if (this.mFormatItems) {
            final int childCount = this.getChildCount();
            final int n5 = (n4 - n2) / 2;
            final int dividerWidth = this.getDividerWidth();
            int n6 = 0;
            int n7 = 0;
            int n8 = n3 - n - this.getPaddingRight() - this.getPaddingLeft();
            boolean b2 = false;
            final boolean layoutRtl = ViewUtils.isLayoutRtl((View)this);
            int i = 0;
            while (true) {
                while (i < childCount) {
                    final View child = this.getChildAt(i);
                    int n13 = 0;
                    int n14 = 0;
                    Label_0312: {
                        if (child.getVisibility() != 8 || a) {
                            final ActionMenuView$LayoutParams actionMenuView$LayoutParams = (ActionMenuView$LayoutParams)child.getLayoutParams();
                            int n12;
                            if (actionMenuView$LayoutParams.isOverflowButton) {
                                int measuredWidth = child.getMeasuredWidth();
                                if (this.hasSupportDividerBeforeChildAt(i)) {
                                    measuredWidth += dividerWidth;
                                }
                                final int measuredHeight = child.getMeasuredHeight();
                                int n9 = 0;
                                int n10 = 0;
                                Label_0209: {
                                    if (layoutRtl) {
                                        n9 = this.getPaddingLeft() + actionMenuView$LayoutParams.leftMargin;
                                        n10 = n9 + measuredWidth;
                                        if (!a) {
                                            break Label_0209;
                                        }
                                    }
                                    n10 = this.getWidth() - this.getPaddingRight() - actionMenuView$LayoutParams.rightMargin;
                                    n9 = n10 - measuredWidth;
                                }
                                final int n11 = n5 - measuredHeight / 2;
                                child.layout(n9, n11, n10, measuredHeight + n11);
                                n12 = n8 - measuredWidth;
                                b2 = true;
                                if (!a) {
                                    n8 = n12;
                                    n13 = n7;
                                    n14 = n6;
                                    break Label_0312;
                                }
                            }
                            else {
                                n12 = n8;
                            }
                            final int n15 = child.getMeasuredWidth() + actionMenuView$LayoutParams.leftMargin + actionMenuView$LayoutParams.rightMargin;
                            int n16 = n6 + n15;
                            n8 = n12 - n15;
                            if (this.hasSupportDividerBeforeChildAt(i)) {
                                n16 += dividerWidth;
                            }
                            final int n17 = n7 + 1;
                            n14 = n16;
                            n13 = n17;
                        }
                        else {
                            n13 = n7;
                            n14 = n6;
                        }
                    }
                    final int n18 = i + 1;
                    if (a) {
                        final int n19 = n13;
                        if (childCount == 1 && !b2) {
                            final View child2 = this.getChildAt(0);
                            final int measuredWidth2 = child2.getMeasuredWidth();
                            final int measuredHeight2 = child2.getMeasuredHeight();
                            final int n20 = (n3 - n) / 2 - measuredWidth2 / 2;
                            final int n21 = n5 - measuredHeight2 / 2;
                            child2.layout(n20, n21, measuredWidth2 + n20, measuredHeight2 + n21);
                            return;
                        }
                        int n22;
                        if (b2) {
                            n22 = 0;
                        }
                        else {
                            n22 = 1;
                        }
                        final int n23 = n19 - n22;
                        int n24;
                        if (n23 > 0) {
                            n24 = n8 / n23;
                        }
                        else {
                            n24 = 0;
                        }
                        final int max = Math.max(0, n24);
                        if (layoutRtl) {
                            int n25 = this.getWidth() - this.getPaddingRight();
                            int n28;
                            int n29;
                            for (int j = 0; j < childCount; j = n29, n25 = n28) {
                                final View child3 = this.getChildAt(j);
                                final ActionMenuView$LayoutParams actionMenuView$LayoutParams2 = (ActionMenuView$LayoutParams)child3.getLayoutParams();
                                if (child3.getVisibility() != 8 && (!actionMenuView$LayoutParams2.isOverflowButton || a)) {
                                    final int n26 = n25 - actionMenuView$LayoutParams2.rightMargin;
                                    final int measuredWidth3 = child3.getMeasuredWidth();
                                    final int measuredHeight3 = child3.getMeasuredHeight();
                                    final int n27 = n5 - measuredHeight3 / 2;
                                    child3.layout(n26 - measuredWidth3, n27, n26, measuredHeight3 + n27);
                                    n28 = n26 - (max + (measuredWidth3 + actionMenuView$LayoutParams2.leftMargin));
                                }
                                else {
                                    n28 = n25;
                                }
                                n29 = j + 1;
                                if (a) {
                                    break;
                                }
                            }
                            if (!a) {
                                return;
                            }
                        }
                        int paddingLeft = this.getPaddingLeft();
                        int n32;
                        int n33;
                        for (int k = 0; k < childCount; k = n33, paddingLeft = n32) {
                            final View child4 = this.getChildAt(k);
                            final ActionMenuView$LayoutParams actionMenuView$LayoutParams3 = (ActionMenuView$LayoutParams)child4.getLayoutParams();
                            if (child4.getVisibility() != 8 && (!actionMenuView$LayoutParams3.isOverflowButton || a)) {
                                final int n30 = paddingLeft + actionMenuView$LayoutParams3.leftMargin;
                                final int measuredWidth4 = child4.getMeasuredWidth();
                                final int measuredHeight4 = child4.getMeasuredHeight();
                                final int n31 = n5 - measuredHeight4 / 2;
                                child4.layout(n30, n31, n30 + measuredWidth4, measuredHeight4 + n31);
                                n32 = n30 + (max + (measuredWidth4 + actionMenuView$LayoutParams3.rightMargin));
                            }
                            else {
                                n32 = paddingLeft;
                            }
                            n33 = k + 1;
                            if (a) {
                                break;
                            }
                        }
                        return;
                    }
                    else {
                        i = n18;
                        n7 = n13;
                        n6 = n14;
                    }
                }
                final int n19 = n7;
                continue;
            }
        }
        super.onLayout(b, n, n2, n3, n4);
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        final boolean a = LinearLayoutCompat.a;
        final boolean mFormatItems = this.mFormatItems;
        this.mFormatItems = (View$MeasureSpec.getMode(n) == 1073741824);
        if (mFormatItems != this.mFormatItems) {
            this.mFormatItemsWidth = 0;
        }
        final int size = View$MeasureSpec.getSize(n);
        if (this.mFormatItems && this.mMenu != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            this.mMenu.onItemsChanged(true);
        }
        final int childCount = this.getChildCount();
        if (this.mFormatItems && childCount > 0) {
            this.onMeasureExactFormat(n, n2);
            if (!a) {
                return;
            }
        }
        int n3;
        for (int i = 0; i < childCount; i = n3) {
            final ActionMenuView$LayoutParams actionMenuView$LayoutParams = (ActionMenuView$LayoutParams)this.getChildAt(i).getLayoutParams();
            actionMenuView$LayoutParams.rightMargin = 0;
            actionMenuView$LayoutParams.leftMargin = 0;
            n3 = i + 1;
            if (a) {
                break;
            }
        }
        super.onMeasure(n, n2);
    }
    
    public MenuBuilder peekMenu() {
        return this.mMenu;
    }
    
    public void setExpandedActionViewsExclusive(final boolean expandedActionViewsExclusive) {
        this.mPresenter.setExpandedActionViewsExclusive(expandedActionViewsExclusive);
    }
    
    public void setMenuCallbacks(final MenuPresenter$Callback mActionMenuPresenterCallback, final MenuBuilder$Callback mMenuBuilderCallback) {
        this.mActionMenuPresenterCallback = mActionMenuPresenterCallback;
        this.mMenuBuilderCallback = mMenuBuilderCallback;
    }
    
    public void setOnMenuItemClickListener(final ActionMenuView$OnMenuItemClickListener mOnMenuItemClickListener) {
        this.mOnMenuItemClickListener = mOnMenuItemClickListener;
    }
    
    public void setOverflowReserved(final boolean mReserveOverflow) {
        this.mReserveOverflow = mReserveOverflow;
    }
    
    public void setPopupTheme(final int mPopupTheme) {
        if (this.mPopupTheme != mPopupTheme) {
            if ((this.mPopupTheme = mPopupTheme) == 0) {
                this.mPopupContext = this.mContext;
                if (!LinearLayoutCompat.a) {
                    return;
                }
            }
            this.mPopupContext = (Context)new ContextThemeWrapper(this.mContext, mPopupTheme);
        }
    }
    
    public void setPresenter(final ActionMenuPresenter mPresenter) {
        (this.mPresenter = mPresenter).setMenuView(this);
    }
    
    public boolean showOverflowMenu() {
        return this.mPresenter != null && this.mPresenter.showOverflowMenu();
    }
}
