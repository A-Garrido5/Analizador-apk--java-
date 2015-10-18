// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class HighlightedRelativeLayout extends RelativeLayout implements n
{
    private boolean b;
    
    public HighlightedRelativeLayout(final Context context) {
        super(context);
    }
    
    public HighlightedRelativeLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public HighlightedRelativeLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + HighlightedRelativeLayout.a.length);
        if (this.b) {
            mergeDrawableStates(onCreateDrawableState, HighlightedRelativeLayout.a);
        }
        return onCreateDrawableState;
    }
    
    public void setHighlighted(final boolean b) {
        if (b != this.b) {
            this.b = b;
            this.refreshDrawableState();
            this.invalidate();
        }
    }
}
