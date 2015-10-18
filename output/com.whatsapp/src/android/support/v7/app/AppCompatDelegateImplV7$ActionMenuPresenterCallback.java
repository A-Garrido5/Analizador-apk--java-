// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.view.Window$Callback;
import android.view.Menu;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;

final class AppCompatDelegateImplV7$ActionMenuPresenterCallback implements MenuPresenter$Callback
{
    final AppCompatDelegateImplV7 this$0;
    
    private AppCompatDelegateImplV7$ActionMenuPresenterCallback(final AppCompatDelegateImplV7 this$0) {
        this.this$0 = this$0;
    }
    
    AppCompatDelegateImplV7$ActionMenuPresenterCallback(final AppCompatDelegateImplV7 appCompatDelegateImplV7, final AppCompatDelegateImplV7$1 appCompatDelegateImplV7$1) {
        this(appCompatDelegateImplV7);
    }
    
    @Override
    public void onCloseMenu(final MenuBuilder menuBuilder, final boolean b) {
        AppCompatDelegateImplV7.access$900(this.this$0, menuBuilder);
    }
    
    @Override
    public boolean onOpenSubMenu(final MenuBuilder menuBuilder) {
        final Window$Callback windowCallback = this.this$0.getWindowCallback();
        if (windowCallback != null) {
            windowCallback.onMenuOpened(8, (Menu)menuBuilder);
        }
        return true;
    }
}
