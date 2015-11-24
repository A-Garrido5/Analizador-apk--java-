// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.support.v7.widget.Toolbar$OnMenuItemClickListener;

class a6a implements Toolbar$OnMenuItemClickListener
{
    final GroupChatRecentLocationsActivity a;
    
    a6a(final GroupChatRecentLocationsActivity a) {
        this.a = a;
    }
    
    @Override
    public boolean onMenuItemClick(final MenuItem menuItem) {
        return this.a.onOptionsItemSelected(menuItem);
    }
}
