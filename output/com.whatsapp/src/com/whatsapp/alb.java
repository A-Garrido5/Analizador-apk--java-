// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.support.v7.widget.Toolbar$OnMenuItemClickListener;

class alb implements Toolbar$OnMenuItemClickListener
{
    final LocationPicker a;
    
    alb(final LocationPicker a) {
        this.a = a;
    }
    
    @Override
    public boolean onMenuItemClick(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return false;
            }
            case 0: {
                this.a.onSearchRequested();
                return true;
            }
            case 1: {
                LocationPicker.a(this.a, false);
                LocationPicker.a(this.a, LocationPicker.g(this.a).c(), LocationPicker.g(this.a).b(), null, false);
                return true;
            }
        }
    }
}
