// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.graphics.Paint$Style;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Paint;
import android.view.View;

public class Divot extends View
{
    private static final Divot$Direction[] a;
    private final Divot$Direction b;
    private final Paint c;
    private final Path d;
    
    static {
        a = new Divot$Direction[] { Divot$Direction.a, Divot$Direction.b, Divot$Direction.c, Divot$Direction.d };
    }
    
    public Divot(final Context context) {
        this(context, null);
    }
    
    public Divot(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public Divot(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.Divot, n, 0);
        (this.c = new Paint(1)).setStyle(Paint$Style.FILL_AND_STROKE);
        this.c.setColor(obtainStyledAttributes.getColor(0, -16777216));
        this.b = Divot.a[obtainStyledAttributes.getInt(1, 0)];
        obtainStyledAttributes.recycle();
        this.d = new Path();
        this.a(this.getWidth(), this.getHeight());
    }
    
    protected void a(final int n, final int n2) {
        this.d.reset();
        switch (ao.a[this.b.ordinal()]) {
            default: {
                this.d.moveTo(0.0f, (float)n2);
                this.d.lineTo((float)(n / 2), 0.0f);
                this.d.lineTo((float)n, (float)n2);
                break;
            }
            case 1: {
                this.d.moveTo((float)n, (float)(n2 / 2));
                this.d.lineTo(0.0f, (float)n2);
                this.d.lineTo(0.0f, 0.0f);
                break;
            }
            case 2: {
                this.d.moveTo((float)(n / 2), (float)n2);
                this.d.lineTo((float)n, 0.0f);
                this.d.lineTo(0.0f, 0.0f);
                break;
            }
            case 3: {
                this.d.moveTo(0.0f, (float)(n2 / 2));
                this.d.lineTo((float)n, (float)n2);
                this.d.lineTo((float)n, 0.0f);
                break;
            }
        }
        this.d.close();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.d, this.c);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.a(n, n2);
    }
}
