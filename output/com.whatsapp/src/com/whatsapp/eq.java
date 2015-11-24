// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.widget.SearchView$OnCloseListener;

class eq implements SearchView$OnCloseListener
{
    final WebImagePicker a;
    
    eq(final WebImagePicker a) {
        this.a = a;
    }
    
    @Override
    public boolean onClose() {
        return true;
    }
}
