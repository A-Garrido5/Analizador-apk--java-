// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;

public class StaggeredGridView$GridLayoutParams extends ExtendableListView$LayoutParams
{
    public int e;
    
    public StaggeredGridView$GridLayoutParams(final int n, final int n2) {
        super(n, n2);
        this.a();
    }
    
    public StaggeredGridView$GridLayoutParams(final Context context, final AttributeSet set) {
        super(context, set);
        this.a();
    }
    
    public StaggeredGridView$GridLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a();
    }
    
    private void a() {
        if (this.width != -1) {
            this.width = -1;
        }
        if (this.height == -1) {
            this.height = -2;
        }
    }
}
