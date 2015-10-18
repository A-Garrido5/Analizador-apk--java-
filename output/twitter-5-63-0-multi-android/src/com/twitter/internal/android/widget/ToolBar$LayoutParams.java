// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

public class ToolBar$LayoutParams extends ViewGroup$MarginLayoutParams
{
    public final int a;
    
    public ToolBar$LayoutParams(final int n) {
        this(-2, -1, n);
    }
    
    public ToolBar$LayoutParams(final int n, final int n2) {
        super(n, n2);
        this.a = 19;
    }
    
    public ToolBar$LayoutParams(final int n, final int n2, final int a) {
        super(n, n2);
        this.a = a;
    }
    
    public ToolBar$LayoutParams(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.ToolBarLayout);
        this.a = obtainStyledAttributes.getInt(li.ToolBarLayout_android_layout_gravity, -1);
        obtainStyledAttributes.recycle();
    }
    
    public ToolBar$LayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this(viewGroup$LayoutParams, -1);
    }
    
    public ToolBar$LayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams, final int a) {
        super(viewGroup$LayoutParams);
        this.a = a;
    }
}
