// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

public class HorizontalListView$LayoutParams extends ViewGroup$MarginLayoutParams
{
    public boolean a;
    public int b;
    public int c;
    public boolean d;
    
    public HorizontalListView$LayoutParams(final int n, final int n2) {
        super(n, n2);
        this.c = -1;
    }
    
    public HorizontalListView$LayoutParams(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = -1;
    }
    
    public HorizontalListView$LayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.c = -1;
    }
}
