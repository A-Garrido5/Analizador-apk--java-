// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.View;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class ClippingLayout extends FrameLayout
{
    private Rect a;
    
    public ClippingLayout(final Context context) {
        super(context);
        this.a = null;
    }
    
    public ClippingLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = null;
    }
    
    public ClippingLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = null;
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        if (this.a != null) {
            canvas.clipRect(this.a);
        }
        return super.drawChild(canvas, view, n);
    }
    
    public void setClipBounds(final Rect rect) {
        final boolean l = Log.l;
        if (rect == this.a || (rect != null && rect.equals((Object)this.a))) {
            return;
        }
        Label_0072: {
            if (rect != null) {
                if (this.a == null) {
                    this.a = new Rect(rect);
                    if (!l) {
                        break Label_0072;
                    }
                }
                this.a.set(rect);
                if (!l) {
                    break Label_0072;
                }
            }
            this.a = null;
        }
        this.invalidate();
    }
}
