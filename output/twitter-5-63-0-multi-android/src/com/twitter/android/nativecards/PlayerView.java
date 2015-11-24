// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class PlayerView extends ViewGroup
{
    private float a;
    private final v b;
    private final w c;
    private final u d;
    private Drawable e;
    private int f;
    private int g;
    
    public PlayerView(final Context context) {
        this(context, null);
    }
    
    public PlayerView(final Context context, final AttributeSet set) {
        this(context, set, 2130771979);
    }
    
    public PlayerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = 1.0f;
        this.b = new v(null);
        this.c = new w(null);
        this.d = new u(null);
        this.setWillNotDraw(false);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, pa.NativeCardPlayerView, n, 0);
        try {
            this.f = obtainStyledAttributes.getResourceId(1, 2130839478);
            this.g = 16842874;
            this.e = obtainStyledAttributes.getDrawable(0);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public void a() {
        this.c.a();
    }
    
    public void a(final Context context) {
        this.b.a(this, context, null, this.g);
        this.d();
    }
    
    public void a(final Context context, final String s) {
        this.c.a(this, context, s, new ViewGroup$LayoutParams(-1, -2), this.e);
        this.d();
    }
    
    protected void b() {
        this.b.a(this);
    }
    
    public void b(final Context context) {
        this.d.a(context, this.f);
        this.d();
    }
    
    protected void c() {
        this.c.a(this);
    }
    
    protected void d() {
        this.b.a();
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        super.dispatchDraw(canvas);
        this.d.a(canvas);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.d.a(this.getDrawableState());
        this.postInvalidate();
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.c.a(b, n, n2, n3, n4);
        this.b.a(b, n, n2, n3, n4);
        this.d.a(b, n, n2, n3, n4);
    }
    
    public void onMeasure(final int n, final int n2) {
        final int defaultSize = getDefaultSize(this.getSuggestedMinimumWidth(), n);
        int n3;
        if (this.a > 0.0f) {
            n3 = (int)(defaultSize / this.a);
        }
        else {
            n3 = defaultSize;
        }
        this.setMeasuredDimension(defaultSize, n3);
        this.measureChildren(n, n2);
    }
    
    public void setAspectRatio(final float a) {
        this.a = a;
        this.c.a(a);
        this.requestLayout();
    }
}
