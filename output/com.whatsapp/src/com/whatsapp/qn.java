// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.widget.SearchView$OnQueryTextListener;

class qn implements SearchView$OnQueryTextListener
{
    final HomeActivity a;
    
    qn(final HomeActivity a) {
        this.a = a;
    }
    
    @Override
    public boolean onQueryTextChange(final String s) {
        final ga b = HomeActivity.b(this.a, HomeActivity.h(this.a));
        if (b != null) {
            b.a(s);
        }
        return false;
    }
    
    @Override
    public boolean onQueryTextSubmit(final String s) {
        return false;
    }
}
