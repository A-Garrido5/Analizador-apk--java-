// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AbsListView$LayoutParams;

public class ExtendableListView$LayoutParams extends AbsListView$LayoutParams
{
    boolean a;
    int b;
    long c;
    int d;
    
    public ExtendableListView$LayoutParams(final int n, final int n2) {
        super(n, n2);
        this.c = -1L;
    }
    
    public ExtendableListView$LayoutParams(final int n, final int n2, final int d) {
        super(n, n2);
        this.c = -1L;
        this.d = d;
    }
    
    public ExtendableListView$LayoutParams(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = -1L;
    }
    
    public ExtendableListView$LayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.c = -1L;
    }
}
