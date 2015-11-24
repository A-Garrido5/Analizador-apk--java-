// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.content.Context;

public interface MenuPresenter
{
    boolean collapseItemActionView(final MenuBuilder p0, final MenuItemImpl p1);
    
    boolean expandItemActionView(final MenuBuilder p0, final MenuItemImpl p1);
    
    boolean flagActionItems();
    
    void initForMenu(final Context p0, final MenuBuilder p1);
    
    void onCloseMenu(final MenuBuilder p0, final boolean p1);
    
    boolean onSubMenuSelected(final SubMenuBuilder p0);
    
    void updateMenuView(final boolean p0);
}
