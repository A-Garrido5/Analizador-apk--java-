// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.view.Window$Callback;
import android.view.Menu;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;

final class AppCompatDelegateImplV7$PanelMenuPresenterCallback implements MenuPresenter$Callback
{
    final AppCompatDelegateImplV7 this$0;
    
    private AppCompatDelegateImplV7$PanelMenuPresenterCallback(final AppCompatDelegateImplV7 this$0) {
        this.this$0 = this$0;
    }
    
    AppCompatDelegateImplV7$PanelMenuPresenterCallback(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final AppCompatDelegateImplV7$1 appCompatDelegateImplV7$1) {
        this(appCompatDelegateImplV7);
    }
    
    @Override
    public void onCloseMenu(MenuBuilder menuBuilder, final boolean b) {
        final Object rootMenu = menuBuilder.getRootMenu();
        boolean b2;
        if (rootMenu != menuBuilder) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        final AppCompatDelegateImplV7 this$0 = this.this$0;
        if (b2) {
            menuBuilder = (MenuBuilder)rootMenu;
        }
        final AppCompatDelegateImplV7$PanelFeatureState access$600 = AppCompatDelegateImplV7.access$600(this$0, (Menu)menuBuilder);
        if (access$600 != null) {
            if (b2) {
                AppCompatDelegateImplV7.access$700(this.this$0, access$600.featureId, access$600, (Menu)rootMenu);
                AppCompatDelegateImplV7.access$800(this.this$0, access$600, true);
                if (!ActionBar.a) {
                    return;
                }
            }
            AppCompatDelegateImplV7.access$800(this.this$0, access$600, b);
        }
    }
    
    @Override
    public boolean onOpenSubMenu(final MenuBuilder menuBuilder) {
        if (menuBuilder == null && this.this$0.mHasActionBar) {
            final Window$Callback windowCallback = this.this$0.getWindowCallback();
            if (windowCallback != null && !this.this$0.isDestroyed()) {
                windowCallback.onMenuOpened(8, (Menu)menuBuilder);
            }
        }
        return true;
    }
}
