// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound.ui;

import android.widget.FrameLayout$LayoutParams;
import android.util.TypedValue;
import android.content.res.Resources;

public abstract class g
{
    public static final int a(final float n, final Resources resources) {
        return (int)TypedValue.applyDimension(1, n, resources.getDisplayMetrics());
    }
    
    public static final FrameLayout$LayoutParams a() {
        return a(-1, -1);
    }
    
    public static final FrameLayout$LayoutParams a(final int n, final int n2) {
        return new FrameLayout$LayoutParams(n, n2);
    }
    
    public static final FrameLayout$LayoutParams b() {
        return a(-1, -2);
    }
}
