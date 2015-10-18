// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.support.v7.widget.SearchView;

class WebImagePicker$2 extends SearchView
{
    final WebImagePicker b;
    
    WebImagePicker$2(final WebImagePicker b, final Context context) {
        this.b = b;
        super(context);
    }
    
    @Override
    public boolean isIconified() {
        return false;
    }
}
