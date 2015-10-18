// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;

public class RevealClipFrameLayout extends ClipCompatFrameLayout
{
    public RevealClipFrameLayout(final Context context) {
        this(context, null);
    }
    
    public RevealClipFrameLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public RevealClipFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @TargetApi(18)
    public void setClipX(final int n) {
        final int measuredWidth = this.getMeasuredWidth();
        Rect clipBounds = this.getClipBounds();
        if (clipBounds == null) {
            clipBounds = new Rect(0, 0, measuredWidth, this.getMeasuredHeight());
        }
        this.setClipBounds(new Rect(n / 2, clipBounds.top, measuredWidth - n / 2, clipBounds.bottom));
    }
    
    @TargetApi(18)
    public void setClipY(final int n) {
        final int measuredHeight = this.getMeasuredHeight();
        Rect clipBounds = this.getClipBounds();
        if (clipBounds == null) {
            clipBounds = new Rect(0, 0, this.getMeasuredWidth(), measuredHeight);
        }
        this.setClipBounds(new Rect(clipBounds.left, n / 2, clipBounds.right, measuredHeight - n / 2));
    }
}
