// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class FullScreenFrameLayout extends FrameLayout
{
    private e a;
    
    public FullScreenFrameLayout(final Context context) {
        super(context);
    }
    
    public FullScreenFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public FullScreenFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected boolean fitSystemWindows(final Rect rect) {
        final boolean fitSystemWindows = super.fitSystemWindows(rect);
        if (this.a != null) {
            this.a.a(rect.left, rect.top, rect.right, rect.bottom);
        }
        return fitSystemWindows;
    }
    
    public void setFitSystemWindowListener(final e a) {
        this.a = a;
    }
}
