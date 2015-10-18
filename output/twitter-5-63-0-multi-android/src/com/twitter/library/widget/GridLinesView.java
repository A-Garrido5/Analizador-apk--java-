// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class GridLinesView extends View
{
    private final int a;
    private final int b;
    private final float c;
    private final int d;
    private final int e;
    private final int f;
    private final Paint g;
    private final Paint h;
    
    public GridLinesView(final Context context) {
        this(context, null, 0);
    }
    
    public GridLinesView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public GridLinesView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.GridLinesView, n, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(li.GridLinesView_grid_line_width, 0);
        this.a = obtainStyledAttributes.getInt(li.GridLinesView_number_of_vertical_lines, 0);
        this.b = obtainStyledAttributes.getInt(li.GridLinesView_number_of_horizontal_lines, 0);
        this.d = obtainStyledAttributes.getColor(li.GridLinesView_grid_line_color, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(li.GridLinesView_line_stroke_width, 0);
        this.f = obtainStyledAttributes.getColor(li.GridLinesView_line_stroke_color, 0);
        obtainStyledAttributes.recycle();
        (this.g = new Paint()).setColor(this.d);
        this.g.setStrokeWidth(this.c);
        (this.h = new Paint()).setColor(this.f);
        this.h.setStrokeWidth((float)this.e);
    }
    
    protected void onDraw(final Canvas canvas) {
        final float n = this.getHeight();
        final float n2 = this.getWidth();
        final float n3 = n / (1 + this.b);
        final float n4 = n2 / (1 + this.a);
        for (int i = 1; i <= this.b; ++i) {
            final float n5 = n3 * i;
            final float c = this.c;
            canvas.drawLine(0.0f, n5, n2, n5, this.g);
            canvas.drawLine(0.0f, n5 - c, n2, n5 - c, this.h);
            canvas.drawLine(0.0f, n5 + c, n2, n5 + c, this.h);
        }
        for (int j = 1; j <= this.a; ++j) {
            final float n6 = n4 * j;
            final float c2 = this.c;
            canvas.drawLine(n6, 0.0f, n6, n, this.g);
            canvas.drawLine(n6 - c2, 0.0f, n6 - c2, n, this.h);
            canvas.drawLine(n6 + c2, 0.0f, n6 + c2, n, this.h);
        }
    }
}
