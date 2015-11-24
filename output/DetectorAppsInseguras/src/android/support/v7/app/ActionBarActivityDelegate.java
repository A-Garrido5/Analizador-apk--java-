// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R;
import android.content.res.Configuration;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v4.app.ActionBarDrawerToggle;
import android.util.AttributeSet;
import android.support.annotation.NonNull;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.os.Build$VERSION;
import android.support.v7.view.ActionMode;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.MenuInflater;
import android.support.v7.internal.app.WindowCallback;

abstract class ActionBarActivityDelegate
{
    static final String METADATA_UI_OPTIONS = "android.support.UI_OPTIONS";
    private static final String TAG = "ActionBarActivityDelegate";
    private ActionBar mActionBar;
    final ActionBarActivity mActivity;
    final WindowCallback mDefaultWindowCallback;
    boolean mHasActionBar;
    private boolean mIsDestroyed;
    boolean mIsFloating;
    private MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private WindowCallback mWindowCallback;
    
    ActionBarActivityDelegate(final ActionBarActivity mActivity) {
        this.mDefaultWindowCallback = new WindowCallback() {
            @Override
            public boolean onCreatePanelMenu(final int n, final Menu menu) {
                return ActionBarActivityDelegate.this.mActivity.superOnCreatePanelMenu(n, menu);
            }
            
            @Override
            public View onCreatePanelView(final int n) {
                return null;
            }
            
            @Override
            public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
                return ActionBarActivityDelegate.this.mActivity.onMenuItemSelected(n, menuItem);
            }
            
            @Override
            public boolean onMenuOpened(final int n, final Menu menu) {
                return ActionBarActivityDelegate.this.mActivity.onMenuOpened(n, menu);
            }
            
            @Override
            public void onPanelClosed(final int n, final Menu menu) {
                ActionBarActivityDelegate.this.mActivity.onPanelClosed(n, menu);
            }
            
            @Override
            public boolean onPreparePanel(final int n, final View view, final Menu menu) {
                return ActionBarActivityDelegate.this.mActivity.superOnPreparePanel(n, view, menu);
            }
            
            @Override
            public ActionMode startActionMode(final ActionMode.Callback callback) {
                return ActionBarActivityDelegate.this.startSupportActionModeFromWindow(callback);
            }
        };
        this.mActivity = mActivity;
        this.mWindowCallback = this.mDefaultWindowCallback;
    }
    
    static ActionBarActivityDelegate createDelegate(final ActionBarActivity actionBarActivity) {
        if (Build$VERSION.SDK_INT >= 11) {
            return new ActionBarActivityDelegateHC(actionBarActivity);
        }
        return new ActionBarActivityDelegateBase(actionBarActivity);
    }
    
    abstract void addContentView(final View p0, final ViewGroup$LayoutParams p1);
    
    abstract ActionBar createSupportActionBar();
    
    abstract View createView(final String p0, @NonNull final Context p1, @NonNull final AttributeSet p2);
    
    final void destroy() {
        this.mIsDestroyed = true;
    }
    
    protected final Context getActionBarThemedContext() {
        final ActionBar supportActionBar = this.getSupportActionBar();
        Object o = null;
        if (supportActionBar != null) {
            o = supportActionBar.getThemedContext();
        }
        if (o == null) {
            o = this.mActivity;
        }
        return (Context)o;
    }
    
    final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new ActionBarDrawableToggleImpl();
    }
    
    abstract int getHomeAsUpIndicatorAttrId();
    
    MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            this.mMenuInflater = new SupportMenuInflater(this.getActionBarThemedContext());
        }
        return this.mMenuInflater;
    }
    
    final ActionBar getSupportActionBar() {
        if (this.mHasActionBar && this.mActionBar == null) {
            this.mActionBar = this.createSupportActionBar();
        }
        return this.mActionBar;
    }
    
    final String getUiOptionsFromMetadata() {
        try {
            final ActivityInfo activityInfo = this.mActivity.getPackageManager().getActivityInfo(this.mActivity.getComponentName(), 128);
            final Bundle metaData = activityInfo.metaData;
            String string = null;
            if (metaData != null) {
                string = activityInfo.metaData.getString("android.support.UI_OPTIONS");
            }
            return string;
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.e("ActionBarActivityDelegate", "getUiOptionsFromMetadata: Activity '" + this.mActivity.getClass().getSimpleName() + "' not in manifest");
            return null;
        }
    }
    
    final android.support.v7.app.ActionBarDrawerToggle.Delegate getV7DrawerToggleDelegate() {
        return new ActionBarDrawableToggleImpl();
    }
    
    final WindowCallback getWindowCallback() {
        return this.mWindowCallback;
    }
    
    final boolean isDestroyed() {
        return this.mIsDestroyed;
    }
    
    abstract boolean onBackPressed();
    
    abstract void onConfigurationChanged(final Configuration p0);
    
    abstract void onContentChanged();
    
    void onCreate(final Bundle bundle) {
        final TypedArray obtainStyledAttributes = this.mActivity.obtainStyledAttributes(R.styleable.Theme);
        if (!obtainStyledAttributes.hasValue(R.styleable.Theme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.Theme_windowActionBar, false)) {
            this.mHasActionBar = true;
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.Theme_windowActionBarOverlay, false)) {
            this.mOverlayActionBar = true;
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.Theme_windowActionModeOverlay, false)) {
            this.mOverlayActionMode = true;
        }
        this.mIsFloating = obtainStyledAttributes.getBoolean(R.styleable.Theme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
    }
    
    abstract boolean onCreatePanelMenu(final int p0, final Menu p1);
    
    abstract View onCreatePanelView(final int p0);
    
    boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    abstract boolean onKeyShortcut(final int p0, final KeyEvent p1);
    
    abstract boolean onMenuOpened(final int p0, final Menu p1);
    
    abstract void onPanelClosed(final int p0, final Menu p1);
    
    abstract void onPostResume();
    
    boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        if (Build$VERSION.SDK_INT < 16) {
            return this.mActivity.onPrepareOptionsMenu(menu);
        }
        return this.mActivity.superOnPrepareOptionsPanel(view, menu);
    }
    
    abstract boolean onPreparePanel(final int p0, final View p1, final Menu p2);
    
    abstract void onStop();
    
    abstract void onTitleChanged(final CharSequence p0);
    
    final ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }
    
    abstract void setContentView(final int p0);
    
    abstract void setContentView(final View p0);
    
    abstract void setContentView(final View p0, final ViewGroup$LayoutParams p1);
    
    protected final void setSupportActionBar(final ActionBar mActionBar) {
        this.mActionBar = mActionBar;
    }
    
    abstract void setSupportActionBar(final Toolbar p0);
    
    abstract void setSupportProgress(final int p0);
    
    abstract void setSupportProgressBarIndeterminate(final boolean p0);
    
    abstract void setSupportProgressBarIndeterminateVisibility(final boolean p0);
    
    abstract void setSupportProgressBarVisibility(final boolean p0);
    
    final void setWindowCallback(final WindowCallback mWindowCallback) {
        if (mWindowCallback == null) {
            throw new IllegalArgumentException("callback can not be null");
        }
        this.mWindowCallback = mWindowCallback;
    }
    
    abstract ActionMode startSupportActionMode(final ActionMode.Callback p0);
    
    abstract ActionMode startSupportActionModeFromWindow(final ActionMode.Callback p0);
    
    abstract void supportInvalidateOptionsMenu();
    
    abstract boolean supportRequestWindowFeature(final int p0);
    
    private class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate, ActionBarDrawerToggle.Delegate
    {
        @Override
        public Context getActionBarThemedContext() {
            return ActionBarActivityDelegate.this.getActionBarThemedContext();
        }
        
        @Override
        public Drawable getThemeUpIndicator() {
            final TypedArray obtainStyledAttributes = ActionBarActivityDelegate.this.getActionBarThemedContext().obtainStyledAttributes(new int[] { ActionBarActivityDelegate.this.getHomeAsUpIndicatorAttrId() });
            final Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }
        
        @Override
        public void setActionBarDescription(final int homeActionContentDescription) {
            final ActionBar supportActionBar = ActionBarActivityDelegate.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeActionContentDescription(homeActionContentDescription);
            }
        }
        
        @Override
        public void setActionBarUpIndicator(final Drawable homeAsUpIndicator, final int homeActionContentDescription) {
            final ActionBar supportActionBar = ActionBarActivityDelegate.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeAsUpIndicator(homeAsUpIndicator);
                supportActionBar.setHomeActionContentDescription(homeActionContentDescription);
            }
        }
    }
}
