// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

public enum Divot$Direction
{
    a("TOP", 0, 0), 
    b("RIGHT", 1, 1), 
    c("BOTTOM", 2, 2), 
    d("LEFT", 3, 3);
    
    final int mNativeInt;
    
    private Divot$Direction(final String s, final int n, final int mNativeInt) {
        this.mNativeInt = mNativeInt;
    }
}
