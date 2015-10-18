// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.Window$Callback;
import android.support.v7.internal.view.menu.MenuBuilder$Callback;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.Menu;
import android.content.Context;

public interface DecorToolbar
{
    void animateToVisibility(final int p0);
    
    boolean canShowOverflowMenu();
    
    void collapseActionView();
    
    void dismissPopupMenus();
    
    Context getContext();
    
    int getDisplayOptions();
    
    Menu getMenu();
    
    int getNavigationMode();
    
    ViewGroup getViewGroup();
    
    boolean hasExpandedActionView();
    
    boolean hideOverflowMenu();
    
    void initIndeterminateProgress();
    
    void initProgress();
    
    boolean isOverflowMenuShowPending();
    
    boolean isOverflowMenuShowing();
    
    boolean isSplit();
    
    void setBackgroundDrawable(final Drawable p0);
    
    void setCollapsible(final boolean p0);
    
    void setCustomView(final View p0);
    
    void setDisplayOptions(final int p0);
    
    void setEmbeddedTabView(final ScrollingTabContainerView p0);
    
    void setHomeButtonEnabled(final boolean p0);
    
    void setIcon(final Drawable p0);
    
    void setMenu(final Menu p0, final MenuPresenter$Callback p1);
    
    void setMenuCallbacks(final MenuPresenter$Callback p0, final MenuBuilder$Callback p1);
    
    void setMenuPrepared();
    
    void setNavigationIcon(final Drawable p0);
    
    void setSubtitle(final CharSequence p0);
    
    void setTitle(final CharSequence p0);
    
    void setVisibility(final int p0);
    
    void setWindowCallback(final Window$Callback p0);
    
    void setWindowTitle(final CharSequence p0);
    
    boolean showOverflowMenu();
}
