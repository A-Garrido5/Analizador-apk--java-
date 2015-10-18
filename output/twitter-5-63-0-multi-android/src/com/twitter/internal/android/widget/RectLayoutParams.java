// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

public class RectLayoutParams extends ViewGroup$MarginLayoutParams
{
    public int a;
    public int b;
    public int c;
    public int d;
    
    public RectLayoutParams(final int n, final int n2) {
        super(n, n2);
    }
    
    public RectLayoutParams(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public RectLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
    }
    
    public void a(final int n, final int n2, final int n3, final int n4) {
        this.a = n + this.leftMargin;
        this.b = n2 + this.topMargin;
        this.c = n3 - this.rightMargin;
        this.d = n4 + this.bottomMargin;
    }
    
    public String toString() {
        return this.a + "," + this.b + "-" + this.c + "," + this.d;
    }
}
