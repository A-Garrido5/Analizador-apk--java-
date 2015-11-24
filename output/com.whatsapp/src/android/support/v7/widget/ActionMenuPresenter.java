// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v4.view.ActionProvider;
import android.support.v7.internal.transition.ActionBarTransition;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.support.v7.appcompat.R$integer;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.internal.view.ActionBarPolicy;
import android.view.ViewGroup$LayoutParams;
import java.util.ArrayList;
import android.view.View$MeasureSpec;
import android.support.v7.internal.view.menu.ActionMenuItemView$PopupCallback;
import android.support.v7.internal.view.menu.MenuBuilder$ItemInvoker;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuView$ItemView;
import android.view.ViewGroup;
import android.view.MenuItem;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.appcompat.R$layout;
import android.content.Context;
import android.view.View;
import android.util.SparseBooleanArray;
import android.support.v4.view.ActionProvider$SubUiVisibilityListener;
import android.support.v7.internal.view.menu.BaseMenuPresenter;

public class ActionMenuPresenter extends BaseMenuPresenter implements ActionProvider$SubUiVisibilityListener
{
    private final SparseBooleanArray mActionButtonGroups;
    private ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    private View mOverflowButton;
    private ActionMenuPresenter$OverflowPopup mOverflowPopup;
    private ActionMenuPresenter$ActionMenuPopupCallback mPopupCallback;
    final ActionMenuPresenter$PopupPresenterCallback mPopupPresenterCallback;
    private ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private View mScrapActionButtonView;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;
    
    public ActionMenuPresenter(final Context context) {
        super(context, R$layout.abc_action_menu_layout, R$layout.abc_action_menu_item_layout);
        this.mActionButtonGroups = new SparseBooleanArray();
        this.mPopupPresenterCallback = new ActionMenuPresenter$PopupPresenterCallback(this, null);
    }
    
    static ActionMenuPresenter$OverflowPopup access$200(final ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mOverflowPopup;
    }
    
    static ActionMenuPresenter$OverflowPopup access$202(final ActionMenuPresenter actionMenuPresenter, final ActionMenuPresenter$OverflowPopup mOverflowPopup) {
        return actionMenuPresenter.mOverflowPopup = mOverflowPopup;
    }
    
    static ActionMenuPresenter$OpenOverflowRunnable access$300(final ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mPostedOpenRunnable;
    }
    
    static ActionMenuPresenter$OpenOverflowRunnable access$302(final ActionMenuPresenter actionMenuPresenter, final ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable) {
        return actionMenuPresenter.mPostedOpenRunnable = mPostedOpenRunnable;
    }
    
    static MenuBuilder access$400(final ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mMenu;
    }
    
    static View access$500(final ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mOverflowButton;
    }
    
    static MenuView access$600(final ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mMenuView;
    }
    
    static ActionMenuPresenter$ActionButtonSubmenu access$700(final ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mActionButtonPopup;
    }
    
    static ActionMenuPresenter$ActionButtonSubmenu access$702(final ActionMenuPresenter actionMenuPresenter, final ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup) {
        return actionMenuPresenter.mActionButtonPopup = mActionButtonPopup;
    }
    
    static MenuBuilder access$800(final ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mMenu;
    }
    
    static MenuView access$900(final ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mMenuView;
    }
    
    private View findViewForItem(final MenuItem menuItem) {
        final boolean a = LinearLayoutCompat.a;
        final ViewGroup viewGroup = (ViewGroup)this.mMenuView;
        if (viewGroup != null) {
            int n;
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; i = n) {
                final Object child = viewGroup.getChildAt(i);
                if (child instanceof MenuView$ItemView && ((MenuView$ItemView)child).getItemData() == menuItem) {
                    return (View)child;
                }
                n = i + 1;
                if (a) {
                    break;
                }
            }
            return null;
        }
        final Object child = null;
        return (View)child;
    }
    
    @Override
    public void bindItemView(final MenuItemImpl menuItemImpl, final MenuView$ItemView menuView$ItemView) {
        menuView$ItemView.initialize(menuItemImpl, 0);
        final ActionMenuView itemInvoker = (ActionMenuView)this.mMenuView;
        final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)menuView$ItemView;
        actionMenuItemView.setItemInvoker(itemInvoker);
        if (this.mPopupCallback == null) {
            this.mPopupCallback = new ActionMenuPresenter$ActionMenuPopupCallback(this, null);
        }
        actionMenuItemView.setPopupCallback(this.mPopupCallback);
    }
    
    public boolean dismissPopupMenus() {
        return this.hideOverflowMenu() | this.hideSubMenus();
    }
    
    public boolean filterLeftoverView(final ViewGroup viewGroup, final int n) {
        return viewGroup.getChildAt(n) != this.mOverflowButton && super.filterLeftoverView(viewGroup, n);
    }
    
    @Override
    public boolean flagActionItems() {
        final boolean a = LinearLayoutCompat.a;
        final ArrayList visibleItems = this.mMenu.getVisibleItems();
        final int size = visibleItems.size();
        int mMaxItems = this.mMaxItems;
        final int mActionItemWidthLimit = this.mActionItemWidthLimit;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final ViewGroup viewGroup = (ViewGroup)this.mMenuView;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int i = 0;
        while (true) {
        Label_0111_Outer:
            while (i < size) {
                final MenuItemImpl menuItemImpl = visibleItems.get(i);
                while (true) {
                    Label_0968: {
                        if (menuItemImpl.requiresActionButton()) {
                            ++n;
                            if (!a) {
                                break Label_0968;
                            }
                        }
                        if (menuItemImpl.requestsActionButton()) {
                            ++n2;
                            if (!a) {
                                break Label_0968;
                            }
                        }
                        final int n4 = n;
                        final int n5 = 1;
                        int n6;
                        if (this.mExpandedActionViewsExclusive && menuItemImpl.isActionViewExpanded()) {
                            n6 = 0;
                        }
                        else {
                            n6 = mMaxItems;
                        }
                        final int n7 = i + 1;
                        if (a) {
                            if (this.mReserveOverflow && (n5 != 0 || n4 + n2 > n6)) {
                                --n6;
                            }
                            int n8 = n6 - n4;
                            final SparseBooleanArray mActionButtonGroups = this.mActionButtonGroups;
                            mActionButtonGroups.clear();
                            int n9;
                            int n10;
                            if (this.mStrictWidthLimit) {
                                n9 = mActionItemWidthLimit / this.mMinCellSize;
                                n10 = this.mMinCellSize + mActionItemWidthLimit % this.mMinCellSize / n9;
                            }
                            else {
                                n9 = 0;
                                n10 = 0;
                            }
                            int j = 0;
                            int n11 = 0;
                            int n12 = n9;
                            int n13 = mActionItemWidthLimit;
                            while (j < size) {
                                final MenuItemImpl menuItemImpl2 = visibleItems.get(j);
                                int measuredWidth = 0;
                                Label_0755: {
                                    int n14;
                                    if (menuItemImpl2.requiresActionButton()) {
                                        final View itemView = this.getItemView(menuItemImpl2, this.mScrapActionButtonView, viewGroup);
                                        if (this.mScrapActionButtonView == null) {
                                            this.mScrapActionButtonView = itemView;
                                        }
                                        Label_0322: {
                                            if (this.mStrictWidthLimit) {
                                                n12 -= ActionMenuView.measureChildForCells(itemView, n10, n12, measureSpec, 0);
                                                if (!a) {
                                                    break Label_0322;
                                                }
                                            }
                                            itemView.measure(measureSpec, measureSpec);
                                        }
                                        measuredWidth = itemView.getMeasuredWidth();
                                        n13 -= measuredWidth;
                                        if (n11 != 0) {
                                            measuredWidth = n11;
                                        }
                                        final int groupId = menuItemImpl2.getGroupId();
                                        if (groupId != 0) {
                                            mActionButtonGroups.put(groupId, true);
                                        }
                                        menuItemImpl2.setIsActionButton(true);
                                        if (!a) {
                                            break Label_0755;
                                        }
                                        n14 = n13;
                                    }
                                    else {
                                        measuredWidth = n11;
                                        n14 = n13;
                                    }
                                    int n26;
                                    if (menuItemImpl2.requestsActionButton()) {
                                        final int groupId2 = menuItemImpl2.getGroupId();
                                        final boolean value = mActionButtonGroups.get(groupId2);
                                        final boolean b = (n8 > 0 || value) && n14 > 0 && (!this.mStrictWidthLimit || n12 > 0);
                                        boolean isActionButton = false;
                                        int n18 = 0;
                                        int n20 = 0;
                                        int n21 = 0;
                                        Label_0601: {
                                            if (b) {
                                                final View itemView2 = this.getItemView(menuItemImpl2, this.mScrapActionButtonView, viewGroup);
                                                if (this.mScrapActionButtonView == null) {
                                                    this.mScrapActionButtonView = itemView2;
                                                }
                                                int n15 = 0;
                                                boolean b2 = false;
                                                Label_0518: {
                                                    int n16;
                                                    if (this.mStrictWidthLimit) {
                                                        final int measureChildForCells = ActionMenuView.measureChildForCells(itemView2, n10, n12, measureSpec, 0);
                                                        n15 = n12 - measureChildForCells;
                                                        b2 = (measureChildForCells != 0 && b);
                                                        if (!a) {
                                                            break Label_0518;
                                                        }
                                                        n16 = n15;
                                                    }
                                                    else {
                                                        final boolean b3 = b;
                                                        n16 = n12;
                                                        b2 = b3;
                                                    }
                                                    itemView2.measure(measureSpec, measureSpec);
                                                    n15 = n16;
                                                }
                                                final int measuredWidth2 = itemView2.getMeasuredWidth();
                                                final int n17 = n14 - measuredWidth2;
                                                if (measuredWidth == 0) {
                                                    measuredWidth = measuredWidth2;
                                                }
                                                boolean b4;
                                                if (this.mStrictWidthLimit) {
                                                    b4 = (n17 >= 0 & b2);
                                                    if (!a) {
                                                        isActionButton = b4;
                                                        n18 = measuredWidth;
                                                        final int n19 = n15;
                                                        n20 = n17;
                                                        n21 = n19;
                                                        break Label_0601;
                                                    }
                                                }
                                                else {
                                                    b4 = b2;
                                                }
                                                isActionButton = (b4 & n17 + measuredWidth > 0);
                                                n18 = measuredWidth;
                                                final int n22 = n15;
                                                n20 = n17;
                                                n21 = n22;
                                            }
                                            else {
                                                isActionButton = b;
                                                n20 = n14;
                                                n18 = measuredWidth;
                                                n21 = n12;
                                            }
                                        }
                                        int n25 = 0;
                                        Label_0706: {
                                            Label_0702: {
                                                if (isActionButton && groupId2 != 0) {
                                                    mActionButtonGroups.put(groupId2, true);
                                                    if (!a) {
                                                        break Label_0702;
                                                    }
                                                }
                                                if (value) {
                                                    mActionButtonGroups.put(groupId2, false);
                                                    int k = 0;
                                                    int n23 = n8;
                                                    while (k < j) {
                                                        final MenuItemImpl menuItemImpl3 = visibleItems.get(k);
                                                        if (menuItemImpl3.getGroupId() == groupId2) {
                                                            if (menuItemImpl3.isActionButton()) {
                                                                ++n23;
                                                            }
                                                            menuItemImpl3.setIsActionButton(false);
                                                        }
                                                        n8 = n23;
                                                        final int n24 = k + 1;
                                                        if (a) {
                                                            break Label_0702;
                                                        }
                                                        k = n24;
                                                        n23 = n8;
                                                    }
                                                    n25 = n23;
                                                    break Label_0706;
                                                }
                                            }
                                            n25 = n8;
                                        }
                                        if (isActionButton) {
                                            --n25;
                                        }
                                        menuItemImpl2.setIsActionButton(isActionButton);
                                        if (!a) {
                                            measuredWidth = n18;
                                            n8 = n25;
                                            n13 = n20;
                                            n12 = n21;
                                            break Label_0755;
                                        }
                                        measuredWidth = n18;
                                        n26 = n25;
                                        n12 = n21;
                                        n14 = n20;
                                    }
                                    else {
                                        n26 = n8;
                                    }
                                    menuItemImpl2.setIsActionButton(false);
                                    n8 = n26;
                                    n13 = n14;
                                }
                                final int n27 = j + 1;
                                if (a) {
                                    break;
                                }
                                j = n27;
                                n11 = measuredWidth;
                            }
                            return true;
                        }
                        i = n7;
                        mMaxItems = n6;
                        final int n28 = n4;
                        n3 = n5;
                        n = n28;
                        continue Label_0111_Outer;
                    }
                    final int n29 = n3;
                    final int n4 = n;
                    final int n5 = n29;
                    continue;
                }
            }
            int n6 = mMaxItems;
            final int n30 = n;
            final int n5 = n3;
            final int n4 = n30;
            continue;
        }
    }
    
    @Override
    public View getItemView(final MenuItemImpl menuItemImpl, final View view, final ViewGroup viewGroup) {
        View view2 = menuItemImpl.getActionView();
        if (view2 == null || menuItemImpl.hasCollapsibleActionView()) {
            view2 = super.getItemView(menuItemImpl, view, viewGroup);
        }
        int visibility;
        if (menuItemImpl.isActionViewExpanded()) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        view2.setVisibility(visibility);
        final ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            view2.setLayoutParams((ViewGroup$LayoutParams)actionMenuView.generateLayoutParams(layoutParams));
        }
        return view2;
    }
    
    @Override
    public MenuView getMenuView(final ViewGroup viewGroup) {
        final MenuView menuView = super.getMenuView(viewGroup);
        ((ActionMenuView)menuView).setPresenter(this);
        return menuView;
    }
    
    public boolean hideOverflowMenu() {
        if (this.mPostedOpenRunnable != null && this.mMenuView != null) {
            ((View)this.mMenuView).removeCallbacks((Runnable)this.mPostedOpenRunnable);
            this.mPostedOpenRunnable = null;
            return true;
        }
        final ActionMenuPresenter$OverflowPopup mOverflowPopup = this.mOverflowPopup;
        if (mOverflowPopup != null) {
            mOverflowPopup.dismiss();
            return true;
        }
        return false;
    }
    
    public boolean hideSubMenus() {
        if (this.mActionButtonPopup != null) {
            this.mActionButtonPopup.dismiss();
            return true;
        }
        return false;
    }
    
    @Override
    public void initForMenu(final Context context, final MenuBuilder menuBuilder) {
        super.initForMenu(context, menuBuilder);
        final Resources resources = context.getResources();
        final ActionBarPolicy value = ActionBarPolicy.get(context);
        if (!this.mReserveOverflowSet) {
            this.mReserveOverflow = value.showsOverflowMenuButton();
        }
        if (!this.mWidthLimitSet) {
            this.mWidthLimit = value.getEmbeddedMenuWidthLimit();
        }
        if (!this.mMaxItemsSet) {
            this.mMaxItems = value.getMaxActionButtons();
        }
        int mWidthLimit = this.mWidthLimit;
        Label_0142: {
            if (this.mReserveOverflow) {
                if (this.mOverflowButton == null) {
                    this.mOverflowButton = (View)new ActionMenuPresenter$OverflowMenuButton(this, this.mSystemContext);
                    final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                    this.mOverflowButton.measure(measureSpec, measureSpec);
                }
                mWidthLimit -= this.mOverflowButton.getMeasuredWidth();
                if (!LinearLayoutCompat.a) {
                    break Label_0142;
                }
            }
            this.mOverflowButton = null;
        }
        this.mActionItemWidthLimit = mWidthLimit;
        this.mMinCellSize = (int)(56.0f * resources.getDisplayMetrics().density);
        this.mScrapActionButtonView = null;
    }
    
    public boolean isOverflowMenuShowPending() {
        return this.mPostedOpenRunnable != null || this.isOverflowMenuShowing();
    }
    
    public boolean isOverflowMenuShowing() {
        return this.mOverflowPopup != null && this.mOverflowPopup.isShowing();
    }
    
    @Override
    public void onCloseMenu(final MenuBuilder menuBuilder, final boolean b) {
        this.dismissPopupMenus();
        super.onCloseMenu(menuBuilder, b);
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        if (!this.mMaxItemsSet) {
            this.mMaxItems = this.mContext.getResources().getInteger(R$integer.abc_max_action_buttons);
        }
        if (this.mMenu != null) {
            this.mMenu.onItemsChanged(true);
        }
    }
    
    @Override
    public boolean onSubMenuSelected(final SubMenuBuilder subMenuBuilder) {
        final boolean a = LinearLayoutCompat.a;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.getParentMenu() != this.mMenu) {
            subMenuBuilder2 = (SubMenuBuilder)subMenuBuilder2.getParentMenu();
            if (a) {
                break;
            }
        }
        View anchorView = this.findViewForItem(subMenuBuilder2.getItem());
        if (anchorView == null) {
            if (this.mOverflowButton == null) {
                return false;
            }
            anchorView = this.mOverflowButton;
        }
        this.mOpenSubMenuId = subMenuBuilder.getItem().getItemId();
        (this.mActionButtonPopup = new ActionMenuPresenter$ActionButtonSubmenu(this, this.mContext, subMenuBuilder)).setAnchorView(anchorView);
        this.mActionButtonPopup.show();
        super.onSubMenuSelected(subMenuBuilder);
        return true;
    }
    
    @Override
    public void onSubUiVisibilityChanged(final boolean b) {
        if (b) {
            super.onSubMenuSelected(null);
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        this.mMenu.close(false);
    }
    
    public void setExpandedActionViewsExclusive(final boolean mExpandedActionViewsExclusive) {
        this.mExpandedActionViewsExclusive = mExpandedActionViewsExclusive;
    }
    
    public void setItemLimit(final int mMaxItems) {
        this.mMaxItems = mMaxItems;
        this.mMaxItemsSet = true;
    }
    
    public void setMenuView(final ActionMenuView mMenuView) {
        ((ActionMenuView)(this.mMenuView = mMenuView)).initialize(this.mMenu);
    }
    
    public void setReserveOverflow(final boolean mReserveOverflow) {
        this.mReserveOverflow = mReserveOverflow;
        this.mReserveOverflowSet = true;
    }
    
    public void setWidthLimit(final int mWidthLimit, final boolean mStrictWidthLimit) {
        this.mWidthLimit = mWidthLimit;
        this.mStrictWidthLimit = mStrictWidthLimit;
        this.mWidthLimitSet = true;
    }
    
    @Override
    public boolean shouldIncludeItem(final int n, final MenuItemImpl menuItemImpl) {
        return menuItemImpl.isActionButton();
    }
    
    public boolean showOverflowMenu() {
        if (this.mReserveOverflow && !this.isOverflowMenuShowing() && this.mMenu != null && this.mMenuView != null && this.mPostedOpenRunnable == null && !this.mMenu.getNonActionItems().isEmpty()) {
            this.mPostedOpenRunnable = new ActionMenuPresenter$OpenOverflowRunnable(this, new ActionMenuPresenter$OverflowPopup(this, this.mContext, this.mMenu, this.mOverflowButton, true));
            ((View)this.mMenuView).post((Runnable)this.mPostedOpenRunnable);
            super.onSubMenuSelected(null);
            return true;
        }
        return false;
    }
    
    @Override
    public void updateMenuView(final boolean b) {
        final boolean a = LinearLayoutCompat.a;
        final ViewGroup viewGroup = (ViewGroup)((View)this.mMenuView).getParent();
        if (viewGroup != null) {
            ActionBarTransition.beginDelayedTransition(viewGroup);
        }
        super.updateMenuView(b);
        ((View)this.mMenuView).requestLayout();
        if (this.mMenu != null) {
            final ArrayList actionItems = this.mMenu.getActionItems();
            int n;
            for (int size = actionItems.size(), i = 0; i < size; i = n) {
                final ActionProvider supportActionProvider = actionItems.get(i).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
                n = i + 1;
                if (a) {
                    break;
                }
            }
        }
        ArrayList<MenuItemImpl> nonActionItems;
        if (this.mMenu != null) {
            nonActionItems = (ArrayList<MenuItemImpl>)this.mMenu.getNonActionItems();
        }
        else {
            nonActionItems = null;
        }
        final boolean mReserveOverflow = this.mReserveOverflow;
        int n2 = 0;
        Label_0195: {
            if (mReserveOverflow) {
                n2 = 0;
                if (nonActionItems != null) {
                    final int size2 = nonActionItems.size();
                    if (size2 == 1) {
                        final boolean b2 = !nonActionItems.get(0).isActionViewExpanded();
                        if (!a) {
                            n2 = (b2 ? 1 : 0);
                            break Label_0195;
                        }
                    }
                    int n3;
                    if (size2 > 0) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    n2 = n3;
                }
            }
        }
        Label_0320: {
            if (n2 != 0) {
                if (this.mOverflowButton == null) {
                    this.mOverflowButton = (View)new ActionMenuPresenter$OverflowMenuButton(this, this.mSystemContext);
                }
                final ViewGroup viewGroup2 = (ViewGroup)this.mOverflowButton.getParent();
                if (viewGroup2 != this.mMenuView) {
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(this.mOverflowButton);
                    }
                    final ActionMenuView actionMenuView = (ActionMenuView)this.mMenuView;
                    actionMenuView.addView(this.mOverflowButton, (ViewGroup$LayoutParams)actionMenuView.generateOverflowButtonLayoutParams());
                }
                if (!a) {
                    break Label_0320;
                }
            }
            if (this.mOverflowButton != null && this.mOverflowButton.getParent() == this.mMenuView) {
                ((ViewGroup)this.mMenuView).removeView(this.mOverflowButton);
            }
        }
        ((ActionMenuView)this.mMenuView).setOverflowReserved(this.mReserveOverflow);
    }
}
