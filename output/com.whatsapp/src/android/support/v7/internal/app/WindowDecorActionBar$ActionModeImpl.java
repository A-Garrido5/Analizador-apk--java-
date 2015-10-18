// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.view.MenuItem;
import android.support.v7.internal.view.SupportMenuInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.support.v7.internal.view.menu.MenuBuilder;
import java.lang.ref.WeakReference;
import android.support.v7.view.ActionMode$Callback;
import android.content.Context;
import android.support.v7.internal.view.menu.MenuBuilder$Callback;
import android.support.v7.view.ActionMode;

public class WindowDecorActionBar$ActionModeImpl extends ActionMode implements MenuBuilder$Callback
{
    private final Context mActionModeContext;
    private ActionMode$Callback mCallback;
    private WeakReference mCustomView;
    private final MenuBuilder mMenu;
    final WindowDecorActionBar this$0;
    
    public WindowDecorActionBar$ActionModeImpl(final WindowDecorActionBar this$0, final Context mActionModeContext, final ActionMode$Callback mCallback) {
        this.this$0 = this$0;
        this.mActionModeContext = mActionModeContext;
        this.mCallback = mCallback;
        (this.mMenu = new MenuBuilder(mActionModeContext).setDefaultShowAsAction(1)).setCallback(this);
    }
    
    public boolean dispatchOnCreate() {
        this.mMenu.stopDispatchingItemsChanged();
        try {
            return this.mCallback.onCreateActionMode(this, (Menu)this.mMenu);
        }
        finally {
            this.mMenu.startDispatchingItemsChanged();
        }
    }
    
    @Override
    public void finish() {
        if (this.this$0.mActionMode != this) {
            return;
        }
        Label_0068: {
            if (!WindowDecorActionBar.access$900(WindowDecorActionBar.access$700(this.this$0), WindowDecorActionBar.access$800(this.this$0), false)) {
                this.this$0.mDeferredDestroyActionMode = this;
                this.this$0.mDeferredModeDestroyCallback = this.mCallback;
                if (ToolbarActionBar.b == 0) {
                    break Label_0068;
                }
            }
            this.mCallback.onDestroyActionMode(this);
        }
        this.mCallback = null;
        this.this$0.animateToMode(false);
        WindowDecorActionBar.access$1000(this.this$0).closeMode();
        WindowDecorActionBar.access$1100(this.this$0).getViewGroup().sendAccessibilityEvent(32);
        WindowDecorActionBar.access$600(this.this$0).setHideOnContentScrollEnabled(this.this$0.mHideOnContentScroll);
        this.this$0.mActionMode = null;
    }
    
    @Override
    public View getCustomView() {
        if (this.mCustomView != null) {
            return (View)this.mCustomView.get();
        }
        return null;
    }
    
    @Override
    public Menu getMenu() {
        return (Menu)this.mMenu;
    }
    
    @Override
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.mActionModeContext);
    }
    
    @Override
    public CharSequence getSubtitle() {
        return WindowDecorActionBar.access$1000(this.this$0).getSubtitle();
    }
    
    @Override
    public CharSequence getTitle() {
        return WindowDecorActionBar.access$1000(this.this$0).getTitle();
    }
    
    @Override
    public void invalidate() {
        if (this.this$0.mActionMode != this) {
            return;
        }
        this.mMenu.stopDispatchingItemsChanged();
        try {
            this.mCallback.onPrepareActionMode(this, (Menu)this.mMenu);
        }
        finally {
            this.mMenu.startDispatchingItemsChanged();
        }
    }
    
    @Override
    public boolean isTitleOptional() {
        return WindowDecorActionBar.access$1000(this.this$0).isTitleOptional();
    }
    
    @Override
    public boolean onMenuItemSelected(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        return this.mCallback != null && this.mCallback.onActionItemClicked(this, menuItem);
    }
    
    @Override
    public void onMenuModeChange(final MenuBuilder menuBuilder) {
        if (this.mCallback == null) {
            return;
        }
        this.invalidate();
        WindowDecorActionBar.access$1000(this.this$0).showOverflowMenu();
    }
    
    @Override
    public void setCustomView(final View customView) {
        WindowDecorActionBar.access$1000(this.this$0).setCustomView(customView);
        this.mCustomView = new WeakReference((T)customView);
    }
    
    @Override
    public void setSubtitle(final int n) {
        this.setSubtitle(WindowDecorActionBar.access$1200(this.this$0).getResources().getString(n));
    }
    
    @Override
    public void setSubtitle(final CharSequence subtitle) {
        WindowDecorActionBar.access$1000(this.this$0).setSubtitle(subtitle);
    }
    
    @Override
    public void setTitle(final int n) {
        this.setTitle(WindowDecorActionBar.access$1200(this.this$0).getResources().getString(n));
    }
    
    @Override
    public void setTitle(final CharSequence title) {
        WindowDecorActionBar.access$1000(this.this$0).setTitle(title);
    }
    
    @Override
    public void setTitleOptionalHint(final boolean b) {
        super.setTitleOptionalHint(b);
        WindowDecorActionBar.access$1000(this.this$0).setTitleOptional(b);
    }
}
