// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.widget.SearchView$OnQueryTextListener;

class a91 implements SearchView$OnQueryTextListener
{
    final WebImagePicker a;
    
    a91(final WebImagePicker a) {
        this.a = a;
    }
    
    @Override
    public boolean onQueryTextChange(final String s) {
        return false;
    }
    
    @Override
    public boolean onQueryTextSubmit(final String s) {
        WebImagePicker.h(this.a);
        return true;
    }
}
