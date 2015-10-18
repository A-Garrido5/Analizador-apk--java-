// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.MenuItem;
import android.os.Build$VERSION;

public class MenuItemCompat
{
    static final MenuItemCompat$MenuVersionImpl IMPL;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "zF\\V\u001aCF_`<ZSSW";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'S';
                        break;
                    }
                    case 0: {
                        c2 = '7';
                        break;
                    }
                    case 1: {
                        c2 = '#';
                        break;
                    }
                    case 2: {
                        c2 = '2';
                        break;
                    }
                    case 3: {
                        c2 = '#';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "DFFb0CJ]M\u0003ELDJ7RQ\b\u0003:CF_\u00037XFA\u0003=XW\u0012J>GOWN6YW\u0012p&GS]Q'zF\\V\u001aCF_\u0018s^D\\L!^MU";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 14) {
            IMPL = new MenuItemCompat$IcsMenuVersionImpl();
            return;
        }
        if (sdk_INT >= 11) {
            IMPL = new MenuItemCompat$HoneycombMenuVersionImpl();
            return;
        }
        IMPL = new MenuItemCompat$BaseMenuVersionImpl();
    }
    
    public static boolean expandActionView(final MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem).expandActionView();
        }
        return MenuItemCompat.IMPL.expandActionView(menuItem);
    }
    
    public static View getActionView(final MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem).getActionView();
        }
        return MenuItemCompat.IMPL.getActionView(menuItem);
    }
    
    public static boolean isActionViewExpanded(final MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem).isActionViewExpanded();
        }
        return MenuItemCompat.IMPL.isActionViewExpanded(menuItem);
    }
    
    public static MenuItem setActionProvider(final MenuItem menuItem, final ActionProvider supportActionProvider) {
        if (menuItem instanceof SupportMenuItem) {
            return (MenuItem)((SupportMenuItem)menuItem).setSupportActionProvider(supportActionProvider);
        }
        Log.w(MenuItemCompat.z[0], MenuItemCompat.z[1]);
        return menuItem;
    }
    
    public static MenuItem setActionView(final MenuItem menuItem, final int actionView) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem).setActionView(actionView);
        }
        return MenuItemCompat.IMPL.setActionView(menuItem, actionView);
    }
    
    public static MenuItem setActionView(final MenuItem menuItem, final View actionView) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem).setActionView(actionView);
        }
        return MenuItemCompat.IMPL.setActionView(menuItem, actionView);
    }
    
    public static MenuItem setOnActionExpandListener(final MenuItem menuItem, final MenuItemCompat$OnActionExpandListener supportOnActionExpandListener) {
        if (menuItem instanceof SupportMenuItem) {
            return (MenuItem)((SupportMenuItem)menuItem).setSupportOnActionExpandListener(supportOnActionExpandListener);
        }
        return MenuItemCompat.IMPL.setOnActionExpandListener(menuItem, supportOnActionExpandListener);
    }
    
    public static void setShowAsAction(final MenuItem menuItem, final int showAsAction) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem).setShowAsAction(showAsAction);
            if (ViewPager.a == 0) {
                return;
            }
        }
        MenuItemCompat.IMPL.setShowAsAction(menuItem, showAsAction);
    }
}
