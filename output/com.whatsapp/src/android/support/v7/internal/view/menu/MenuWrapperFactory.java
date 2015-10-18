// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.view.SubMenu;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.MenuItem;
import android.support.v4.internal.view.SupportMenuItem;
import android.os.Build$VERSION;
import android.view.Menu;
import android.support.v4.internal.view.SupportMenu;
import android.content.Context;

public final class MenuWrapperFactory
{
    public static Menu wrapSupportMenu(final Context context, final SupportMenu supportMenu) {
        try {
            if (Build$VERSION.SDK_INT >= 14) {
                return (Menu)new MenuWrapperICS(context, supportMenu);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        throw new UnsupportedOperationException();
    }
    
    public static MenuItem wrapSupportMenuItem(final Context context, final SupportMenuItem supportMenuItem) {
        try {
            if (Build$VERSION.SDK_INT >= 16) {
                return (MenuItem)new MenuItemWrapperJB(context, supportMenuItem);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        try {
            if (Build$VERSION.SDK_INT >= 14) {
                return (MenuItem)new MenuItemWrapperICS(context, supportMenuItem);
            }
        }
        catch (UnsupportedOperationException ex2) {
            throw ex2;
        }
        throw new UnsupportedOperationException();
    }
    
    public static SubMenu wrapSupportSubMenu(final Context context, final SupportSubMenu supportSubMenu) {
        try {
            if (Build$VERSION.SDK_INT >= 14) {
                return (SubMenu)new SubMenuWrapperICS(context, supportSubMenu);
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        throw new UnsupportedOperationException();
    }
}
