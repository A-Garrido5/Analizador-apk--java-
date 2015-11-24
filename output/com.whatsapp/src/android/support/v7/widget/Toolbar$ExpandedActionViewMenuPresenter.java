// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.support.v7.view.CollapsibleActionView;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuPresenter;

class Toolbar$ExpandedActionViewMenuPresenter implements MenuPresenter
{
    MenuItemImpl mCurrentExpandedItem;
    MenuBuilder mMenu;
    final Toolbar this$0;
    
    private Toolbar$ExpandedActionViewMenuPresenter(final Toolbar this$0) {
        this.this$0 = this$0;
    }
    
    Toolbar$ExpandedActionViewMenuPresenter(final Toolbar toolbar, final Toolbar$1 toolbar$1) {
        this(toolbar);
    }
    
    @Override
    public boolean collapseItemActionView(final MenuBuilder menuBuilder, final MenuItemImpl menuItemImpl) {
        if (this.this$0.mExpandedActionView instanceof CollapsibleActionView) {
            ((CollapsibleActionView)this.this$0.mExpandedActionView).onActionViewCollapsed();
        }
        this.this$0.removeView(this.this$0.mExpandedActionView);
        this.this$0.removeView((View)Toolbar.access$300(this.this$0));
        this.this$0.mExpandedActionView = null;
        Toolbar.access$500(this.this$0, false);
        this.mCurrentExpandedItem = null;
        this.this$0.requestLayout();
        menuItemImpl.setActionViewExpanded(false);
        return true;
    }
    
    @Override
    public boolean expandItemActionView(final MenuBuilder menuBuilder, final MenuItemImpl mCurrentExpandedItem) {
        Toolbar.access$200(this.this$0);
        if (Toolbar.access$300(this.this$0).getParent() != this.this$0) {
            this.this$0.addView((View)Toolbar.access$300(this.this$0));
        }
        this.this$0.mExpandedActionView = mCurrentExpandedItem.getActionView();
        this.mCurrentExpandedItem = mCurrentExpandedItem;
        if (this.this$0.mExpandedActionView.getParent() != this.this$0) {
            final Toolbar$LayoutParams generateDefaultLayoutParams = this.this$0.generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (0x800003 | (0x70 & Toolbar.access$400(this.this$0)));
            generateDefaultLayoutParams.mViewType = 2;
            this.this$0.mExpandedActionView.setLayoutParams((ViewGroup$LayoutParams)generateDefaultLayoutParams);
            this.this$0.addView(this.this$0.mExpandedActionView);
        }
        Toolbar.access$500(this.this$0, true);
        this.this$0.requestLayout();
        mCurrentExpandedItem.setActionViewExpanded(true);
        if (this.this$0.mExpandedActionView instanceof CollapsibleActionView) {
            ((CollapsibleActionView)this.this$0.mExpandedActionView).onActionViewExpanded();
        }
        return true;
    }
    
    @Override
    public boolean flagActionItems() {
        return false;
    }
    
    @Override
    public void initForMenu(final Context context, final MenuBuilder mMenu) {
        if (this.mMenu != null && this.mCurrentExpandedItem != null) {
            this.mMenu.collapseItemActionView(this.mCurrentExpandedItem);
        }
        this.mMenu = mMenu;
    }
    
    @Override
    public void onCloseMenu(final MenuBuilder menuBuilder, final boolean b) {
    }
    
    @Override
    public boolean onSubMenuSelected(final SubMenuBuilder subMenuBuilder) {
        return false;
    }
    
    @Override
    public void updateMenuView(final boolean b) {
        final boolean a = LinearLayoutCompat.a;
        if (this.mCurrentExpandedItem != null) {
            final MenuBuilder mMenu = this.mMenu;
            boolean b2 = false;
            if (mMenu != null) {
                final int size = this.mMenu.size();
                int i = 0;
                while (i < size) {
                    if (this.mMenu.getItem(i) == this.mCurrentExpandedItem) {
                        b2 = true;
                        if (!a) {
                            break;
                        }
                    }
                    ++i;
                    if (a) {
                        break;
                    }
                }
            }
            if (!b2) {
                this.collapseItemActionView(this.mMenu, this.mCurrentExpandedItem);
            }
        }
    }
}
