// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.content.Context;
import android.widget.LinearLayout;

public class HighlightedLinearLayout extends LinearLayout implements n
{
    private boolean b;
    
    public HighlightedLinearLayout(final Context context) {
        super(context);
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + HighlightedLinearLayout.a.length);
        if (this.b) {
            mergeDrawableStates(onCreateDrawableState, HighlightedLinearLayout.a);
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
