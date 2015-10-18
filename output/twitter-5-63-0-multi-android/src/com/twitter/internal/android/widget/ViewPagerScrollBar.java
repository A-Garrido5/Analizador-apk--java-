// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.os.Parcelable;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

public class ViewPagerScrollBar extends View
{
    private final int a;
    private final Drawable b;
    private int c;
    private int d;
    private int e;
    
    public ViewPagerScrollBar(final Context context) {
        this(context, null, kv.viewPagerScrollBarStyle);
    }
    
    public ViewPagerScrollBar(final Context context, final AttributeSet set) {
        this(context, set, kv.viewPagerScrollBarStyle);
    }
    
    public ViewPagerScrollBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.ViewPagerScrollBar, n, 0);
        final Drawable drawable = obtainStyledAttributes.getDrawable(li.ViewPagerScrollBar_tabDrawable);
        if (drawable == null) {
            this.b = (Drawable)new ColorDrawable(-1);
        }
        else {
            this.b = drawable;
        }
        this.a = obtainStyledAttributes.getDimensionPixelSize(li.ViewPagerScrollBar_tabMaxHeight, 0);
        obtainStyledAttributes.recycle();
    }
    
    public void a() {
        final int n = (int)Math.ceil(this.getWidth() / this.d);
        final int n2 = this.e + (int)Math.ceil(n * this.c);
        int n3;
        if (this.a > 0) {
            n3 = Math.min(this.a, this.getHeight());
        }
        else {
            n3 = this.getHeight();
        }
        this.b.setBounds(n2, 0, n + n2, n3);
    }
    
    public void a(final int c, final int n) {
        this.c = c;
        this.e = n / this.d;
        this.a();
        this.invalidate();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.b.draw(canvas);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.a();
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final ViewPagerScrollBar$SavedState viewPagerScrollBar$SavedState = (ViewPagerScrollBar$SavedState)parcelable;
        super.onRestoreInstanceState(viewPagerScrollBar$SavedState.getSuperState());
        this.c = viewPagerScrollBar$SavedState.a;
        this.d = viewPagerScrollBar$SavedState.b;
        this.e = 0;
        this.a();
        this.requestLayout();
        this.invalidate();
    }
    
    protected Parcelable onSaveInstanceState() {
        final ViewPagerScrollBar$SavedState viewPagerScrollBar$SavedState = new ViewPagerScrollBar$SavedState(super.onSaveInstanceState());
        viewPagerScrollBar$SavedState.a = this.c;
        viewPagerScrollBar$SavedState.b = this.d;
        return (Parcelable)viewPagerScrollBar$SavedState;
    }
    
    public void setPosition(final int c) {
        this.c = c;
        this.e = 0;
        this.a();
        this.invalidate();
    }
    
    public void setRange(final int d) {
        this.d = d;
        this.requestLayout();
        this.invalidate();
    }
}
