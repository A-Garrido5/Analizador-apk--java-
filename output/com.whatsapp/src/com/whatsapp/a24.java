// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.support.v4.view.MenuItemCompat$OnActionExpandListener;

class a24 implements MenuItemCompat$OnActionExpandListener
{
    final Conversations a;
    
    a24(final Conversations a) {
        this.a = a;
    }
    
    @Override
    public boolean onMenuItemActionCollapse(final MenuItem menuItem) {
        Conversations.a(this.a).a("");
        return true;
    }
    
    @Override
    public boolean onMenuItemActionExpand(final MenuItem menuItem) {
        return true;
    }
}
