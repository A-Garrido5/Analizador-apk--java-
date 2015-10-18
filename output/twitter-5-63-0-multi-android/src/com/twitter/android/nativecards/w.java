// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import com.twitter.library.media.manager.j;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.media.widget.MediaImageView;

class w
{
    private MediaImageView a;
    private float b;
    
    public void a() {
        if (this.a != null) {
            this.a.setFromMemoryOnly(false);
        }
    }
    
    public void a(final float b) {
        this.b = b;
    }
    
    protected void a(final ViewGroup viewGroup) {
        if (this.a != null) {
            viewGroup.removeView((View)this.a);
            this.a = null;
        }
    }
    
    public void a(final ViewGroup viewGroup, final Context context, final String s, final ViewGroup$LayoutParams viewGroup$LayoutParams, final Drawable defaultDrawable) {
        if (this.a == null) {
            (this.a = new MediaImageView(context)).setDefaultDrawable(defaultDrawable);
            viewGroup.addView((View)this.a, viewGroup$LayoutParams);
            this.a.setAspectRatio(this.b);
            this.a.a(j.a(s));
            this.a.setFromMemoryOnly(true);
            this.a.setVisibility(0);
            viewGroup.requestLayout();
        }
    }
    
    public void a(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.a != null) {
            this.a.layout(n, n2, n3, n4);
        }
    }
}
