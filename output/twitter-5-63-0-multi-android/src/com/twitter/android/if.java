// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View$OnSystemUiVisibilityChangeListener;

class if implements View$OnSystemUiVisibilityChangeListener
{
    final /* synthetic */ GalleryActivity a;
    
    if(final GalleryActivity a) {
        this.a = a;
    }
    
    public void onSystemUiVisibilityChange(final int n) {
        if (n == 0) {
            this.a.c(true);
        }
    }
}
