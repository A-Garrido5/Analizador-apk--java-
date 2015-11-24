// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.support.v7.widget.Toolbar$OnMenuItemClickListener;

class m implements Toolbar$OnMenuItemClickListener
{
    final GroupChatLiveLocationsActivity a;
    
    m(final GroupChatLiveLocationsActivity a) {
        this.a = a;
    }
    
    @Override
    public boolean onMenuItemClick(final MenuItem menuItem) {
        return this.a.onOptionsItemSelected(menuItem);
    }
}
