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

public class ProfileHeaderSocialProofCaret extends View
{
    private final Paint a;
    private final Paint b;
    private final Path c;
    private final Path d;
    private final int e;
    private final int f;
    private int g;
    private int h;
    private float i;
    private float j;
    private float k;
    
    public ProfileHeaderSocialProofCaret(final Context context) {
        this(context, null);
    }
    
    public ProfileHeaderSocialProofCaret(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ProfileHeaderSocialProofCaret(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f = this.getResources().getDimensionPixelSize(2131558883);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.ProfileHeaderSocialProofCaret, n, 0);
        final int color = obtainStyledAttributes.getColor(0, 0);
        final int color2 = obtainStyledAttributes.getColor(1, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(2, 1);
        (this.a = new Paint(1)).setStyle(Paint$Style.STROKE);
        this.a.setColor(color2);
        this.a.setStrokeWidth((float)this.e);
        (this.b = new Paint(1)).setStyle(Paint$Style.FILL);
        this.b.setColor(color);
        this.c = new Path();
        this.d = new Path();
        obtainStyledAttributes.recycle();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(0.0f, (float)this.h);
        this.c.lineTo((float)this.f, 0.0f);
        this.c.lineTo(this.j, this.k);
        this.c.lineTo(this.i, 0.0f);
        this.c.lineTo((float)this.g, 0.0f);
        this.c.moveTo(0.0f, 0.0f);
        this.c.close();
        canvas.drawPath(this.c, this.a);
        canvas.restore();
        canvas.save();
        canvas.translate((float)this.f, (float)this.h);
        this.d.lineTo(this.j - this.f, this.k);
        this.d.lineTo(this.i - this.f, 0.0f);
        this.d.close();
        canvas.drawPath(this.d, this.b);
        canvas.restore();
    }
    
    protected void onSizeChanged(final int g, final int h, final int n, final int n2) {
        super.onSizeChanged(g, h, n, n2);
        this.g = g;
        this.h = h;
        final float n3 = 2.1666667f * this.h;
        this.i = n3 + this.f;
        this.j = this.f + n3 / 2.0f;
        this.k = 0.0f - this.h + this.e / 2.0f;
    }
}
