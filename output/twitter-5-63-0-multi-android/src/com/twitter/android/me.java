// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.autocomplete.ListViewSuggestionEditText;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.android.widget.DraggableHeaderLayout;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class me implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ DraggableHeaderLayout a;
    final /* synthetic */ MediaImageView b;
    final /* synthetic */ ListViewSuggestionEditText c;
    final /* synthetic */ MediaTagFragment d;
    
    me(final MediaTagFragment d, final DraggableHeaderLayout a, final MediaImageView b, final ListViewSuggestionEditText c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onGlobalLayout() {
        final int dimensionPixelSize = this.d.getResources().getDimensionPixelSize(2131558772);
        this.a.setAnchorOffset(this.b.getMeasuredHeight() - dimensionPixelSize);
        this.a.setMinVisibleHeaderHeight(dimensionPixelSize + this.c.getMeasuredHeight());
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
}
