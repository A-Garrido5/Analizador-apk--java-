// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

public enum DraggableHeaderLayout$AnchorMode
{
    a("FROM_TOP", 0, 0), 
    b("FROM_BOTTOM", 1, 1);
    
    final int mNativeInt;
    
    private DraggableHeaderLayout$AnchorMode(final String s, final int n, final int mNativeInt) {
        this.mNativeInt = mNativeInt;
    }
}
