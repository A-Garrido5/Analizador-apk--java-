// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.support.v4.view.MenuItemCompat$OnActionExpandListener;
import android.view.MenuItem$OnActionExpandListener;
import android.support.v4.content.ContextCompat;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ActionProvider;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.view.MenuItem$OnMenuItemClickListener;
import android.support.v4.internal.view.SupportMenuItem;

public class ActionMenuItem implements SupportMenuItem
{
    private final int mCategoryOrder;
    private MenuItem$OnMenuItemClickListener mClickListener;
    private Context mContext;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private int mIconResId;
    private final int mId;
    private Intent mIntent;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;
    
    public ActionMenuItem(final Context mContext, final int mGroup, final int mId, final int mCategoryOrder, final int mOrdering, final CharSequence mTitle) {
        this.mIconResId = 0;
        this.mFlags = 16;
        this.mContext = mContext;
        this.mId = mId;
        this.mGroup = mGroup;
        this.mCategoryOrder = mCategoryOrder;
        this.mOrdering = mOrdering;
        this.mTitle = mTitle;
    }
    
    @Override
    public boolean collapseActionView() {
        return false;
    }
    
    @Override
    public boolean expandActionView() {
        return false;
    }
    
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public View getActionView() {
        return null;
    }
    
    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }
    
    public int getGroupId() {
        return this.mGroup;
    }
    
    public Drawable getIcon() {
        return this.mIconDrawable;
    }
    
    public Intent getIntent() {
        return this.mIntent;
    }
    
    public int getItemId() {
        return this.mId;
    }
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    public char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }
    
    public int getOrder() {
        return this.mOrdering;
    }
    
    public SubMenu getSubMenu() {
        return null;
    }
    
    @Override
    public android.support.v4.view.ActionProvider getSupportActionProvider() {
        return null;
    }
    
    public CharSequence getTitle() {
        return this.mTitle;
    }
    
    public CharSequence getTitleCondensed() {
        try {
            if (this.mTitleCondensed != null) {
                return this.mTitleCondensed;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return this.mTitle;
    }
    
    public boolean hasSubMenu() {
        return false;
    }
    
    @Override
    public boolean isActionViewExpanded() {
        return false;
    }
    
    public boolean isCheckable() {
        try {
            if ((this.mFlags & 0x1) != 0x0) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean isChecked() {
        try {
            if ((this.mFlags & 0x2) != 0x0) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean isEnabled() {
        try {
            if ((this.mFlags & 0x10) != 0x0) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean isVisible() {
        try {
            if ((this.mFlags & 0x8) == 0x0) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
    }
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    public SupportMenuItem setActionView(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public SupportMenuItem setActionView(final View view) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public MenuItem setActionView(final int actionView) {
        return (MenuItem)this.setActionView(actionView);
    }
    
    @Override
    public MenuItem setActionView(final View actionView) {
        return (MenuItem)this.setActionView(actionView);
    }
    
    public MenuItem setAlphabeticShortcut(final char mShortcutAlphabeticChar) {
        this.mShortcutAlphabeticChar = mShortcutAlphabeticChar;
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean b) {
        while (true) {
            while (true) {
                try {
                    final int n = this.mFlags & 0xFFFFFFFE;
                    if (b) {
                        final int n2 = 1;
                        this.mFlags = (n2 | n);
                        return (MenuItem)this;
                    }
                }
                catch (UnsupportedOperationException ex) {
                    throw ex;
                }
                final int n2 = 0;
                continue;
            }
        }
    }
    
    public MenuItem setChecked(final boolean b) {
        while (true) {
            while (true) {
                try {
                    final int n = this.mFlags & 0xFFFFFFFD;
                    if (b) {
                        final int n2 = 2;
                        this.mFlags = (n2 | n);
                        return (MenuItem)this;
                    }
                }
                catch (UnsupportedOperationException ex) {
                    throw ex;
                }
                final int n2 = 0;
                continue;
            }
        }
    }
    
    public MenuItem setEnabled(final boolean b) {
        while (true) {
            while (true) {
                try {
                    final int n = this.mFlags & 0xFFFFFFEF;
                    if (b) {
                        final int n2 = 16;
                        this.mFlags = (n2 | n);
                        return (MenuItem)this;
                    }
                }
                catch (UnsupportedOperationException ex) {
                    throw ex;
                }
                final int n2 = 0;
                continue;
            }
        }
    }
    
    public MenuItem setIcon(final int mIconResId) {
        this.mIconResId = mIconResId;
        this.mIconDrawable = ContextCompat.getDrawable(this.mContext, mIconResId);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable mIconDrawable) {
        this.mIconDrawable = mIconDrawable;
        this.mIconResId = 0;
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent mIntent) {
        this.mIntent = mIntent;
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char mShortcutNumericChar) {
        this.mShortcutNumericChar = mShortcutNumericChar;
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        throw new UnsupportedOperationException();
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener mClickListener) {
        this.mClickListener = mClickListener;
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char mShortcutNumericChar, final char mShortcutAlphabeticChar) {
        this.mShortcutNumericChar = mShortcutNumericChar;
        this.mShortcutAlphabeticChar = mShortcutAlphabeticChar;
        return (MenuItem)this;
    }
    
    @Override
    public void setShowAsAction(final int n) {
    }
    
    public SupportMenuItem setShowAsActionFlags(final int showAsAction) {
        this.setShowAsAction(showAsAction);
        return this;
    }
    
    @Override
    public MenuItem setShowAsActionFlags(final int showAsActionFlags) {
        return (MenuItem)this.setShowAsActionFlags(showAsActionFlags);
    }
    
    @Override
    public SupportMenuItem setSupportActionProvider(final android.support.v4.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public SupportMenuItem setSupportOnActionExpandListener(final MenuItemCompat$OnActionExpandListener menuItemCompat$OnActionExpandListener) {
        return this;
    }
    
    public MenuItem setTitle(final int n) {
        this.mTitle = this.mContext.getResources().getString(n);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final CharSequence mTitle) {
        this.mTitle = mTitle;
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(final CharSequence mTitleCondensed) {
        this.mTitleCondensed = mTitleCondensed;
        return (MenuItem)this;
    }
    
    public MenuItem setVisible(final boolean b) {
        while (true) {
            while (true) {
                try {
                    final int n = this.mFlags & 0x8;
                    if (b) {
                        final int n2 = 0;
                        this.mFlags = (n2 | n);
                        return (MenuItem)this;
                    }
                }
                catch (UnsupportedOperationException ex) {
                    throw ex;
                }
                final int n2 = 8;
                continue;
            }
        }
    }
}
