// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.MenuItem;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.view.View;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.appcompat.R$attr;
import android.content.Context;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.support.v7.internal.view.menu.MenuPopupHelper;

class ActionMenuPresenter$ActionButtonSubmenu extends MenuPopupHelper
{
    private SubMenuBuilder mSubMenu;
    final ActionMenuPresenter this$0;
    
    public ActionMenuPresenter$ActionButtonSubmenu(final ActionMenuPresenter this$0, final Context context, final SubMenuBuilder mSubMenu) {
        int i = 0;
        final boolean a = LinearLayoutCompat.a;
        this.this$0 = this$0;
        super(context, mSubMenu, null, false, R$attr.actionOverflowMenuStyle);
        this.mSubMenu = mSubMenu;
        if (!((MenuItemImpl)mSubMenu.getItem()).isActionButton()) {
            View access$500;
            if (ActionMenuPresenter.access$500(this$0) == null) {
                access$500 = (View)ActionMenuPresenter.access$600(this$0);
            }
            else {
                access$500 = ActionMenuPresenter.access$500(this$0);
            }
            this.setAnchorView(access$500);
        }
        this.setCallback(this$0.mPopupPresenterCallback);
        final int size = mSubMenu.size();
        boolean forceShowIcon = false;
        while (i < size) {
            final MenuItem item = mSubMenu.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                forceShowIcon = true;
                if (!a) {
                    break;
                }
            }
            ++i;
            if (a) {
                break;
            }
        }
        this.setForceShowIcon(forceShowIcon);
    }
    
    @Override
    public void onDismiss() {
        super.onDismiss();
        ActionMenuPresenter.access$702(this.this$0, null);
        this.this$0.mOpenSubMenuId = 0;
    }
}
