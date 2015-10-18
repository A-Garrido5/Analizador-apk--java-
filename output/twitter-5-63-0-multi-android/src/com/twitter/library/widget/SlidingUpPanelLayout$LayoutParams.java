// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

public class SlidingUpPanelLayout$LayoutParams extends ViewGroup$MarginLayoutParams
{
    private static final int[] c;
    boolean a;
    boolean b;
    
    static {
        c = new int[] { 16843137 };
    }
    
    public SlidingUpPanelLayout$LayoutParams() {
        super(-1, -1);
    }
    
    public SlidingUpPanelLayout$LayoutParams(final Context context, final AttributeSet set) {
        super(context, set);
        context.obtainStyledAttributes(set, SlidingUpPanelLayout$LayoutParams.c).recycle();
    }
    
    public SlidingUpPanelLayout$LayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
    }
    
    public SlidingUpPanelLayout$LayoutParams(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        super(viewGroup$MarginLayoutParams);
    }
}
