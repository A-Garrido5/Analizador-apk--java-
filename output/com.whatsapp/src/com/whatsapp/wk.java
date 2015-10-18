// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import android.view.MenuItem;
import android.support.v4.view.MenuItemCompat$OnActionExpandListener;

class wk implements MenuItemCompat$OnActionExpandListener
{
    final ContactPicker a;
    
    wk(final ContactPicker a) {
        this.a = a;
    }
    
    @Override
    public boolean onMenuItemActionCollapse(final MenuItem menuItem) {
        ContactPicker.b(this.a, null);
        ContactPicker.r(this.a);
        ContactPicker.w(this.a);
        return true;
    }
    
    @Override
    public boolean onMenuItemActionExpand(final MenuItem menuItem) {
        return true;
    }
}
