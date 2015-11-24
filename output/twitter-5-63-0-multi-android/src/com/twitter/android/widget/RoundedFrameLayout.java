// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Region$Op;
import android.graphics.Path$Direction;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class RoundedFrameLayout extends FrameLayout
{
    private float a;
    
    public RoundedFrameLayout(final Context context) {
        super(context);
        this.a = 5.0f;
        this.a(context, null, 0);
    }
    
    public RoundedFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 5.0f;
        this.a(context, set, 0);
    }
    
    public RoundedFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = 5.0f;
        this.a(context, set, n);
    }
    
    private void a(final Context context, final AttributeSet set, final int n) {
        TypedArray obtainStyledAttributes = null;
        this.setLayerType(1, (Paint)null);
        if (set == null) {
            return;
        }
        try {
            obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, pa.RoundedLayout, n, 0);
            this.a = obtainStyledAttributes.getDimension(0, 5.0f);
        }
        finally {
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
        }
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        final Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, (float)canvas.getWidth(), (float)canvas.getHeight()), this.a, this.a, Path$Direction.CW);
        canvas.clipPath(path, Region$Op.REPLACE);
        super.dispatchDraw(canvas);
    }
    
    public float getCornerRadius() {
        return this.a;
    }
    
    public void setCornerRadius(final float a) {
        this.a = a;
    }
}
