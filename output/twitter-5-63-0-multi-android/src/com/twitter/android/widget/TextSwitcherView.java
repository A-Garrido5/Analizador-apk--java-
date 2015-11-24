// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextSwitcher;

public class TextSwitcherView extends TextSwitcher
{
    private Runnable a;
    
    public TextSwitcherView(final Context context) {
        super(context);
    }
    
    public TextSwitcherView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public void a() {
        if (this.a != null) {
            this.removeCallbacks(this.a);
        }
        this.a = null;
    }
    
    public void a(final Runnable a, final long n) {
        this.a();
        this.postDelayed(this.a = a, n);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a();
    }
}
