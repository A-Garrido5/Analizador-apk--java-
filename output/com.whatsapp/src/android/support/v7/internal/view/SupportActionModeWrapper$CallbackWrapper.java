// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view;

import android.support.v4.internal.view.SupportMenuItem;
import android.view.MenuItem;
import android.support.v7.internal.view.menu.MenuWrapperFactory;
import android.support.v4.internal.view.SupportMenu;
import android.view.Menu;
import android.support.v7.view.ActionMode;
import android.content.Context;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.view.ActionMode$Callback;

public class SupportActionModeWrapper$CallbackWrapper implements ActionMode$Callback
{
    final SimpleArrayMap mActionModes;
    final Context mContext;
    final SimpleArrayMap mMenus;
    final android.view.ActionMode$Callback mWrappedCallback;
    
    public SupportActionModeWrapper$CallbackWrapper(final Context mContext, final android.view.ActionMode$Callback mWrappedCallback) {
        this.mContext = mContext;
        this.mWrappedCallback = mWrappedCallback;
        this.mActionModes = new SimpleArrayMap();
        this.mMenus = new SimpleArrayMap();
    }
    
    private android.view.ActionMode getActionModeWrapper(final ActionMode actionMode) {
        final SupportActionModeWrapper supportActionModeWrapper = (SupportActionModeWrapper)this.mActionModes.get(actionMode);
        if (supportActionModeWrapper != null) {
            return supportActionModeWrapper;
        }
        final SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.mContext, actionMode);
        this.mActionModes.put(actionMode, supportActionModeWrapper2);
        return supportActionModeWrapper2;
    }
    
    private Menu getMenuWrapper(final Menu menu) {
        Menu wrapSupportMenu = (Menu)this.mMenus.get(menu);
        if (wrapSupportMenu == null) {
            wrapSupportMenu = MenuWrapperFactory.wrapSupportMenu(this.mContext, (SupportMenu)menu);
            this.mMenus.put(menu, wrapSupportMenu);
        }
        return wrapSupportMenu;
    }
    
    @Override
    public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        return this.mWrappedCallback.onActionItemClicked(this.getActionModeWrapper(actionMode), MenuWrapperFactory.wrapSupportMenuItem(this.mContext, (SupportMenuItem)menuItem));
    }
    
    @Override
    public boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        return this.mWrappedCallback.onCreateActionMode(this.getActionModeWrapper(actionMode), this.getMenuWrapper(menu));
    }
    
    @Override
    public void onDestroyActionMode(final ActionMode actionMode) {
        this.mWrappedCallback.onDestroyActionMode(this.getActionModeWrapper(actionMode));
    }
    
    @Override
    public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        return this.mWrappedCallback.onPrepareActionMode(this.getActionModeWrapper(actionMode), this.getMenuWrapper(menu));
    }
}
