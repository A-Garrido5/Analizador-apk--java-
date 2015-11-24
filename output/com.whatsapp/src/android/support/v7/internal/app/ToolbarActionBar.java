// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.view.ViewGroup$LayoutParams;
import android.support.v7.app.ActionBar$LayoutParams;
import android.support.annotation.Nullable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.content.res.Configuration;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar$OnMenuVisibilityListener;
import android.support.v7.internal.view.menu.MenuBuilder$Callback;
import android.content.res.Resources$Theme;
import android.support.v7.internal.view.menu.MenuPresenter;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;
import android.content.Context;
import android.support.v7.appcompat.R$layout;
import android.view.ContextThemeWrapper;
import android.support.v7.appcompat.R$style;
import android.support.v7.appcompat.R$attr;
import android.util.TypedValue;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.view.View;
import android.view.Menu;
import android.support.v7.internal.widget.ToolbarWidgetWrapper;
import android.support.v7.widget.Toolbar;
import android.view.Window$Callback;
import android.view.Window;
import java.util.ArrayList;
import android.support.v7.widget.Toolbar$OnMenuItemClickListener;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.app.ActionBar;

public class ToolbarActionBar extends ActionBar
{
    public static int b;
    private DecorToolbar mDecorToolbar;
    private boolean mLastMenuVisibility;
    private ListMenuPresenter mListMenuPresenter;
    private boolean mMenuCallbackSet;
    private final Toolbar$OnMenuItemClickListener mMenuClicker;
    private final Runnable mMenuInvalidator;
    private ArrayList mMenuVisibilityListeners;
    private boolean mToolbarMenuPrepared;
    private Window mWindow;
    private Window$Callback mWindowCallback;
    
    public ToolbarActionBar(final Toolbar toolbar, final CharSequence windowTitle, final Window mWindow) {
        this.mMenuVisibilityListeners = new ArrayList();
        this.mMenuInvalidator = new ToolbarActionBar$1(this);
        this.mMenuClicker = new ToolbarActionBar$2(this);
        this.mDecorToolbar = new ToolbarWidgetWrapper(toolbar, false);
        this.mWindowCallback = (Window$Callback)new ToolbarActionBar$ToolbarCallbackWrapper(this, mWindow.getCallback());
        this.mDecorToolbar.setWindowCallback(this.mWindowCallback);
        toolbar.setOnMenuItemClickListener(this.mMenuClicker);
        this.mDecorToolbar.setWindowTitle(windowTitle);
        this.mWindow = mWindow;
    }
    
    static Window$Callback access$000(final ToolbarActionBar toolbarActionBar) {
        return toolbarActionBar.mWindowCallback;
    }
    
    static boolean access$200(final ToolbarActionBar toolbarActionBar) {
        return toolbarActionBar.mToolbarMenuPrepared;
    }
    
    static boolean access$202(final ToolbarActionBar toolbarActionBar, final boolean mToolbarMenuPrepared) {
        return toolbarActionBar.mToolbarMenuPrepared = mToolbarMenuPrepared;
    }
    
    static DecorToolbar access$300(final ToolbarActionBar toolbarActionBar) {
        return toolbarActionBar.mDecorToolbar;
    }
    
    static View access$400(final ToolbarActionBar toolbarActionBar, final Menu menu) {
        return toolbarActionBar.getListMenuView(menu);
    }
    
    private void ensureListMenuPresenter(final Menu menu) {
        if (this.mListMenuPresenter == null && menu instanceof MenuBuilder) {
            final MenuBuilder menuBuilder = (MenuBuilder)menu;
            final Context context = this.mDecorToolbar.getContext();
            final TypedValue typedValue = new TypedValue();
            final Resources$Theme theme = context.getResources().newTheme();
            theme.setTo(context.getTheme());
            theme.resolveAttribute(R$attr.panelMenuListTheme, typedValue, true);
            Label_0102: {
                if (typedValue.resourceId != 0) {
                    theme.applyStyle(typedValue.resourceId, true);
                    if (ToolbarActionBar.b == 0) {
                        break Label_0102;
                    }
                }
                theme.applyStyle(R$style.Theme_AppCompat_CompactMenu, true);
            }
            final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
            ((Context)contextThemeWrapper).getTheme().setTo(theme);
            (this.mListMenuPresenter = new ListMenuPresenter((Context)contextThemeWrapper, R$layout.abc_list_menu_item_layout)).setCallback(new ToolbarActionBar$PanelMenuPresenterCallback(this, null));
            menuBuilder.addMenuPresenter(this.mListMenuPresenter);
        }
    }
    
    private View getListMenuView(final Menu menu) {
        this.ensureListMenuPresenter(menu);
        if (menu != null && this.mListMenuPresenter != null && this.mListMenuPresenter.getAdapter().getCount() > 0) {
            return (View)this.mListMenuPresenter.getMenuView(this.mDecorToolbar.getViewGroup());
        }
        return null;
    }
    
    private Menu getMenu() {
        if (!this.mMenuCallbackSet) {
            this.mDecorToolbar.setMenuCallbacks(new ToolbarActionBar$ActionMenuPresenterCallback(this, null), new ToolbarActionBar$MenuBuilderCallback(this, null));
            this.mMenuCallbackSet = true;
        }
        return this.mDecorToolbar.getMenu();
    }
    
    @Override
    public boolean collapseActionView() {
        if (this.mDecorToolbar.hasExpandedActionView()) {
            this.mDecorToolbar.collapseActionView();
            return true;
        }
        return false;
    }
    
    @Override
    public void dispatchMenuVisibilityChanged(final boolean mLastMenuVisibility) {
        final int b = ToolbarActionBar.b;
        if (mLastMenuVisibility != this.mLastMenuVisibility) {
            this.mLastMenuVisibility = mLastMenuVisibility;
            int n;
            for (int size = this.mMenuVisibilityListeners.size(), i = 0; i < size; i = n) {
                ((ActionBar$OnMenuVisibilityListener)this.mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(mLastMenuVisibility);
                n = i + 1;
                if (b != 0) {
                    break;
                }
            }
        }
    }
    
    @Override
    public int getDisplayOptions() {
        return this.mDecorToolbar.getDisplayOptions();
    }
    
    @Override
    public Context getThemedContext() {
        return this.mDecorToolbar.getContext();
    }
    
    public Window$Callback getWrappedWindowCallback() {
        return this.mWindowCallback;
    }
    
    @Override
    public void hide() {
        this.mDecorToolbar.setVisibility(8);
    }
    
    @Override
    public boolean invalidateOptionsMenu() {
        this.mDecorToolbar.getViewGroup().removeCallbacks(this.mMenuInvalidator);
        ViewCompat.postOnAnimation((View)this.mDecorToolbar.getViewGroup(), this.mMenuInvalidator);
        return true;
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
    
    @Override
    public boolean onKeyShortcut(final int n, final KeyEvent keyEvent) {
        final Menu menu = this.getMenu();
        boolean performShortcut = false;
        if (menu != null) {
            performShortcut = menu.performShortcut(n, keyEvent, 0);
        }
        return performShortcut;
    }
    
    void populateOptionsMenu() {
        final Menu menu = this.getMenu();
        Label_0075: {
            if (!(menu instanceof MenuBuilder)) {
                break Label_0075;
            }
            MenuBuilder menuBuilder = (MenuBuilder)menu;
            while (true) {
                if (menuBuilder != null) {
                    menuBuilder.stopDispatchingItemsChanged();
                }
                try {
                    menu.clear();
                    if (!this.mWindowCallback.onCreatePanelMenu(0, menu) || !this.mWindowCallback.onPreparePanel(0, (View)null, menu)) {
                        menu.clear();
                    }
                    return;
                    menuBuilder = null;
                    continue;
                }
                finally {
                    if (menuBuilder != null) {
                        menuBuilder.startDispatchingItemsChanged();
                    }
                }
                break;
            }
        }
    }
    
    @Override
    public void setBackgroundDrawable(@Nullable final Drawable backgroundDrawable) {
        this.mDecorToolbar.setBackgroundDrawable(backgroundDrawable);
    }
    
    @Override
    public void setCustomView(final View view) {
        this.setCustomView(view, new ActionBar$LayoutParams(-2, -2));
    }
    
    @Override
    public void setCustomView(final View customView, final ActionBar$LayoutParams layoutParams) {
        customView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.mDecorToolbar.setCustomView(customView);
    }
    
    @Override
    public void setDefaultDisplayHomeAsUpEnabled(final boolean b) {
    }
    
    @Override
    public void setDisplayHomeAsUpEnabled(final boolean b) {
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.setDisplayOptions(n, 4);
    }
    
    public void setDisplayOptions(final int n, final int n2) {
        this.mDecorToolbar.setDisplayOptions((n & n2) | (this.mDecorToolbar.getDisplayOptions() & ~n2));
    }
    
    @Override
    public void setDisplayShowCustomEnabled(final boolean b) {
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.setDisplayOptions(n, 16);
    }
    
    @Override
    public void setDisplayShowHomeEnabled(final boolean b) {
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.setDisplayOptions(n, 2);
    }
    
    @Override
    public void setDisplayShowTitleEnabled(final boolean b) {
        int n;
        if (b) {
            n = 8;
        }
        else {
            n = 0;
        }
        this.setDisplayOptions(n, 8);
    }
    
    @Override
    public void setElevation(final float n) {
        ViewCompat.setElevation((View)this.mDecorToolbar.getViewGroup(), n);
    }
    
    @Override
    public void setHomeAsUpIndicator(final Drawable navigationIcon) {
        this.mDecorToolbar.setNavigationIcon(navigationIcon);
    }
    
    @Override
    public void setIcon(final Drawable icon) {
        this.mDecorToolbar.setIcon(icon);
    }
    
    @Override
    public void setShowHideAnimationEnabled(final boolean b) {
    }
    
    @Override
    public void setSubtitle(final CharSequence subtitle) {
        this.mDecorToolbar.setSubtitle(subtitle);
    }
    
    @Override
    public void setTitle(final int n) {
        final DecorToolbar mDecorToolbar = this.mDecorToolbar;
        CharSequence text;
        if (n != 0) {
            text = this.mDecorToolbar.getContext().getText(n);
        }
        else {
            text = null;
        }
        mDecorToolbar.setTitle(text);
    }
    
    @Override
    public void setTitle(final CharSequence title) {
        this.mDecorToolbar.setTitle(title);
    }
    
    @Override
    public void setWindowTitle(final CharSequence windowTitle) {
        this.mDecorToolbar.setWindowTitle(windowTitle);
    }
    
    @Override
    public void show() {
        this.mDecorToolbar.setVisibility(0);
    }
}
