// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.widget.SearchView$OnQueryTextListener;

class ati implements SearchView$OnQueryTextListener
{
    final Conversations a;
    
    ati(final Conversations a) {
        this.a = a;
    }
    
    @Override
    public boolean onQueryTextChange(final String s) {
        Conversations.a(this.a).a(s);
        return false;
    }
    
    @Override
    public boolean onQueryTextSubmit(final String s) {
        return false;
    }
}
