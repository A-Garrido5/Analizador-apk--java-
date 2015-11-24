// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import com.twitter.library.media.widget.EditableMediaView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class z implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ int a;
    final /* synthetic */ EditableMediaView b;
    final /* synthetic */ int c;
    final /* synthetic */ MediaAttachmentsView d;
    
    z(final MediaAttachmentsView d, final int a, final EditableMediaView b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onGlobalLayout() {
        this.b.setMaxAspectRatio((this.d.getMeasuredWidth() - 2 * this.a) / this.c);
        this.b.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
}
