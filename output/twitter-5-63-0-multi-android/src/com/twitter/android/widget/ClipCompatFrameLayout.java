// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.util.l;
import android.os.Build$VERSION;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class ClipCompatFrameLayout extends FrameLayout
{
    private Rect a;
    
    public ClipCompatFrameLayout(final Context context) {
        this(context, null);
    }
    
    public ClipCompatFrameLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ClipCompatFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @TargetApi(18)
    public void draw(final Canvas canvas) {
        if (this.a != null) {
            canvas.clipRect(this.a);
        }
        super.draw(canvas);
    }
    
    @TargetApi(18)
    public Rect getClipBounds() {
        if (Build$VERSION.SDK_INT >= 18) {
            return super.getClipBounds();
        }
        if (this.a != null) {
            return new Rect(this.a);
        }
        return null;
    }
    
    @TargetApi(18)
    public void setClipBounds(final Rect clipBounds) {
        if (Build$VERSION.SDK_INT >= 18) {
            super.setClipBounds(clipBounds);
        }
        else if (!l.a(clipBounds, this.a)) {
            if (clipBounds == null) {
                this.invalidate();
                this.a = null;
                return;
            }
            if (this.a == null) {
                this.invalidate();
                this.a = new Rect(clipBounds);
                return;
            }
            final Rect rect = new Rect(this.a);
            rect.union(clipBounds);
            this.invalidate(rect);
            this.a.set(clipBounds);
        }
    }
}
