// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

public class BottomSheetDrawerLayout$LayoutParams extends ViewGroup$MarginLayoutParams
{
    public boolean a;
    public boolean b;
    
    public BottomSheetDrawerLayout$LayoutParams(final int n, final int n2) {
        super(n, n2);
    }
    
    public BottomSheetDrawerLayout$LayoutParams(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.BottomSheetDrawerLayout_LayoutParams);
        this.a = obtainStyledAttributes.getBoolean(li.BottomSheetDrawerLayout_LayoutParams_layout_alwaysShow, false);
        this.b = obtainStyledAttributes.getBoolean(li.BottomSheetDrawerLayout_LayoutParams_layout_ignoreOffset, false);
        obtainStyledAttributes.recycle();
    }
    
    public BottomSheetDrawerLayout$LayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
    }
    
    public BottomSheetDrawerLayout$LayoutParams(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        super(viewGroup$MarginLayoutParams);
    }
    
    public BottomSheetDrawerLayout$LayoutParams(final BottomSheetDrawerLayout$LayoutParams bottomSheetDrawerLayout$LayoutParams) {
        super((ViewGroup$MarginLayoutParams)bottomSheetDrawerLayout$LayoutParams);
        this.a = bottomSheetDrawerLayout$LayoutParams.a;
        this.b = bottomSheetDrawerLayout$LayoutParams.b;
    }
}
