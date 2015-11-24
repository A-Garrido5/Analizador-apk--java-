// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.Xfermode;
import com.twitter.library.media.util.m;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.Paint;
import android.view.ViewGroup;

public class RoundedGroupedRowView extends ViewGroup
{
    private static final Paint a;
    private static final Paint b;
    private float[] A;
    private boolean B;
    private boolean C;
    private final float c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final float j;
    private final int k;
    private final int l;
    private int m;
    private int n;
    private RectShape o;
    private RectShape p;
    private RectF q;
    private RectF r;
    private RectF s;
    private RectF t;
    private RectShape u;
    private RoundRectShape v;
    private RoundRectShape w;
    private RoundRectShape x;
    private float[] y;
    private float[] z;
    
    static {
        a = new Paint(1);
        b = new Paint(3);
    }
    
    public RoundedGroupedRowView(final Context context) {
        this(context, null);
    }
    
    public RoundedGroupedRowView(final Context context, final AttributeSet set) {
        this(context, set, kv.groupedRowViewStyle);
    }
    
    public RoundedGroupedRowView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.q = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectShape();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.RoundedGroupedRowView, n, 0);
        this.m = obtainStyledAttributes.getInt(li.RoundedGroupedRowView_cardStyle, 0);
        this.n = obtainStyledAttributes.getInt(li.RoundedGroupedRowView_groupStyle, 0);
        this.c = obtainStyledAttributes.getDimension(li.RoundedGroupedRowView_cornerRadius, 0.0f);
        if (this.c > 0.0f) {
            this.y = new float[] { this.c, this.c, this.c, this.c, this.c, this.c, this.c, this.c };
            this.v = new RoundRectShape(this.y, (RectF)null, (float[])null);
            this.z = new float[] { this.c, this.c, this.c, this.c, 0.0f, 0.0f, 0.0f, 0.0f };
            this.w = new RoundRectShape(this.z, (RectF)null, (float[])null);
            this.A = new float[] { 0.0f, 0.0f, 0.0f, 0.0f, this.c, this.c, this.c, this.c };
            this.x = new RoundRectShape(this.A, (RectF)null, (float[])null);
        }
        this.h = obtainStyledAttributes.getDimensionPixelSize(li.RoundedGroupedRowView_dividerHeight, 0);
        this.i = obtainStyledAttributes.getColor(li.RoundedGroupedRowView_dividerColor, -3355444);
        this.l = obtainStyledAttributes.getColor(li.RoundedGroupedRowView_insetBottomFillColor, 0);
        this.j = obtainStyledAttributes.getDimension(li.RoundedGroupedRowView_strokeWidth, 0.0f);
        final Paint a = RoundedGroupedRowView.a;
        final float dimension = obtainStyledAttributes.getDimension(li.RoundedGroupedRowView_shadowRadius, 0.0f);
        if (dimension > 0.0f) {
            final int color = obtainStyledAttributes.getColor(li.RoundedGroupedRowView_shadowColor, -12303292);
            a.setShadowLayer(dimension, obtainStyledAttributes.getDimension(li.RoundedGroupedRowView_shadowDx, 0.0f), obtainStyledAttributes.getDimension(li.RoundedGroupedRowView_shadowDy, 0.0f), color);
            if (this.j <= 0.0f) {
                this.k = color;
            }
            else {
                this.k = obtainStyledAttributes.getColor(li.RoundedGroupedRowView_strokeColor, color);
            }
        }
        else {
            this.k = obtainStyledAttributes.getColor(li.RoundedGroupedRowView_strokeColor, -12303292);
        }
        final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(li.RoundedGroupedRowView_inset, 0);
        this.d = obtainStyledAttributes.getDimensionPixelOffset(li.RoundedGroupedRowView_insetLeft, dimensionPixelOffset);
        this.e = obtainStyledAttributes.getDimensionPixelOffset(li.RoundedGroupedRowView_insetTop, dimensionPixelOffset);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(li.RoundedGroupedRowView_insetRight, dimensionPixelOffset);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(li.RoundedGroupedRowView_insetBottom, dimensionPixelOffset);
        if (this.getBackground() == null) {
            this.setBackgroundColor(this.getResources().getColor(17170445));
        }
        this.B = obtainStyledAttributes.getBoolean(li.RoundedGroupedRowView_single, false);
        super.setPadding(0, 0, 0, 0);
        obtainStyledAttributes.recycle();
    }
    
    private static void a(final RectF rectF, final float n, final float n2) {
        rectF.set(rectF.left - n, rectF.top - n2, n + rectF.right, n2 + rectF.bottom);
    }
    
    private void a(final float[] array, final RectF rectF) {
        if (array != null) {
            final RoundRectShape p2 = new RoundRectShape(array, (RectF)null, (float[])null);
            p2.resize(rectF.width(), rectF.height());
            this.p = (RectShape)p2;
        }
    }
    
    public void addView(final View view) {
        this.addView(view, this.getChildCount());
    }
    
    public void addView(final View view, final int n) {
        this.addView(view, n, view.getLayoutParams());
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (this.getChildCount() > 0) {
            throw new IllegalStateException("RoundedGroupedRowView can only hold a single child view.");
        }
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.addView(view, this.getChildCount(), viewGroup$LayoutParams);
    }
    
    public void draw(final Canvas canvas) {
        final RectF r = this.r;
        final int m = this.m;
        final boolean b = this.B;
        final Drawable background = this.getBackground();
        if (background != null) {
            background.setBounds(0, 0, this.getRight(), this.getBottom());
            background.draw(canvas);
        }
        if ((m == 0 && !b) || r == null) {
            super.draw(canvas);
            return;
        }
        final Paint a = RoundedGroupedRowView.a;
        a.setColor(this.l);
        canvas.drawRect(this.t, a);
        final int save = canvas.save(1);
        canvas.translate(this.q.left, this.q.top);
        a.setColor(this.k);
        this.o.draw(canvas, a);
        canvas.restoreToCount(save);
        if (!this.C && !b && (m == 1 || m == 2)) {
            a.setColor(this.i);
            canvas.drawRect(r.left, r.bottom, r.right, r.bottom + this.h, a);
        }
        if (this.p != null) {
            final Paint b2 = RoundedGroupedRowView.b;
            final int saveLayer = canvas.saveLayer(r, b2, 20);
            canvas.save(1);
            canvas.translate(r.left, r.top);
            this.p.draw(canvas, b2);
            canvas.restore();
            b2.setXfermode((Xfermode)com.twitter.library.media.util.m.b);
            final int saveLayer2 = canvas.saveLayer(r, b2, 16);
            super.draw(canvas);
            canvas.restoreToCount(saveLayer2);
            canvas.restoreToCount(saveLayer);
            b2.setXfermode((Xfermode)null);
            return;
        }
        final int save2 = canvas.save();
        canvas.clipRect(r);
        super.draw(canvas);
        canvas.restoreToCount(save2);
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-2, -1);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(viewGroup$LayoutParams);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final View child = this.getChildAt(0);
        if (child == null || child.getVisibility() == 8) {
            return;
        }
        if (child.getVisibility() == 0) {
            final RectF r = this.r;
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)child.getLayoutParams();
            child.layout((int)r.left + viewGroup$MarginLayoutParams.leftMargin, (int)r.top + viewGroup$MarginLayoutParams.topMargin, (int)r.right - viewGroup$MarginLayoutParams.rightMargin, (int)r.bottom - viewGroup$MarginLayoutParams.bottomMargin);
        }
        final int m = this.m;
        final boolean b2 = this.B;
        final float c = this.c;
        if (b2) {
            final RectF r2 = this.r;
            final RectF q = this.q;
            float[] y;
            Object o;
            if (c > 0.0f) {
                y = this.y;
                o = this.v;
            }
            else {
                o = this.u;
                y = null;
            }
            ((RectShape)o).resize(q.width(), q.height());
            this.o = (RectShape)o;
            this.a(y, r2);
            return;
        }
        switch (m) {
            default: {}
            case 1: {
                final RectF r3 = this.r;
                final RectF q2 = this.q;
                float[] z;
                Object o2;
                if (c > 0.0f) {
                    z = this.z;
                    o2 = this.w;
                }
                else {
                    o2 = this.u;
                    z = null;
                }
                ((RectShape)o2).resize(q2.width(), q2.height());
                r3.set(r3.left, r3.top, r3.right, r3.bottom);
                this.o = (RectShape)o2;
                this.a(z, r3);
            }
            case 2: {
                final RectF q3 = this.q;
                final RectShape u = this.u;
                u.resize(q3.width(), q3.height());
                this.o = u;
                this.p = null;
            }
            case 3: {
                final RectF r4 = this.r;
                float[] a;
                Object o3;
                if (c > 0.0f) {
                    a = this.A;
                    o3 = this.x;
                }
                else {
                    o3 = this.u;
                    a = null;
                }
                final RectF q4 = this.q;
                ((RectShape)o3).resize(q4.width(), q4.height());
                r4.set(r4.left, r4.top, r4.right, r4.bottom);
                this.o = (RectShape)o3;
                this.a(a, r4);
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final View child = this.getChildAt(0);
        if (child == null || child.getVisibility() == 8) {
            this.setMeasuredDimension(0, 0);
            return;
        }
        final int m = this.m;
        final boolean b = this.B;
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)child.getLayoutParams();
        if (m == 0 && !b) {
            this.measureChildWithMargins(child, n, 0, n2, 0);
            final int n3 = child.getMeasuredWidth() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin;
            final int n4 = child.getMeasuredHeight() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
            this.r.set(0.0f, 0.0f, (float)n3, (float)n4);
            this.setMeasuredDimension(n3, n4);
            return;
        }
        int n5 = this.e;
        final int g = this.g;
        final int d = this.d;
        final int f = this.f;
        int h;
        if (this.C) {
            h = 0;
        }
        else {
            h = this.h;
        }
        final int n6 = d + f;
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        int min;
        if (mode == 1073741824) {
            min = size;
        }
        else {
            final int suggestedMinimumWidth = this.getSuggestedMinimumWidth();
            if (mode == Integer.MIN_VALUE) {
                min = Math.min(suggestedMinimumWidth, size);
            }
            else {
                min = suggestedMinimumWidth;
            }
        }
        this.measureChildWithMargins(child, getChildMeasureSpec(n, n6 + this.getPaddingLeft() + this.getPaddingRight(), child.getLayoutParams().width), 0, n2, 0);
        final int n7 = child.getMeasuredHeight() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
        final int n8 = min - f;
        final float j = this.j;
        final int n9 = this.n;
        int n13 = 0;
        if (b) {
            int n10 = 0;
            Label_0304: {
                switch (m) {
                    case 0: {
                        if (n9 == 2 || n9 == 3) {
                            n5 = Math.max(0, (int)Math.ceil(j));
                            n10 = g;
                            break Label_0304;
                        }
                        break;
                    }
                    case 1: {
                        int max;
                        if (n9 == 2 || n9 == 3) {
                            max = Math.max(0, (int)Math.ceil(j));
                        }
                        else {
                            max = n5;
                        }
                        final int n11 = g / 2;
                        n5 = max;
                        n10 = n11;
                        break Label_0304;
                    }
                    case 2: {
                        n5 /= 2;
                        n10 = g / 2;
                        break Label_0304;
                    }
                    case 3: {
                        n5 /= 2;
                        n10 = g;
                        break Label_0304;
                    }
                }
                n10 = g;
            }
            final int n12 = n7 + (n5 + n10);
            this.s.set((float)d, (float)n5, (float)n8, (float)(n12 - n10));
            this.q.set(this.s);
            a(this.q, j, j);
            this.r = this.s;
            n13 = n12;
        }
        else {
            if (n9 == 2 || n9 == 3) {
                n5 = Math.max(0, (int)Math.ceil(j));
            }
            switch (m) {
                default: {
                    n13 = n7;
                    break;
                }
                case 1: {
                    final int n14 = n7 + n5;
                    this.s.set((float)d, (float)n5, (float)n8, (float)n14);
                    this.q.set(this.s.left, this.s.top, this.s.right, 8.0f + this.s.bottom);
                    a(this.q, j, j);
                    this.r = this.s;
                    n13 = n14 + h;
                    break;
                }
                case 2: {
                    this.s.set((float)d, 0.0f, (float)n8, (float)n7);
                    this.q.set(this.s.left, this.s.top - 8.0f, this.s.right, 8.0f + this.s.bottom);
                    a(this.q, j, j);
                    this.r = this.s;
                    n13 = n7 + h;
                    break;
                }
                case 3: {
                    this.s.set((float)d, 0.0f, (float)n8, (float)n7);
                    this.q.set(this.s.left, this.s.top - 8.0f, this.s.right, this.s.bottom);
                    a(this.q, j, j);
                    this.r = this.s;
                    n13 = n7 + g;
                    break;
                }
            }
        }
        this.t.set(0.0f, this.r.bottom, (float)n8, (float)n13);
        this.setMeasuredDimension(min, n13);
    }
    
    public void setGroupStyle(final int n) {
        if (n != this.n) {
            this.n = n;
            this.requestLayout();
            return;
        }
        this.invalidate();
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void setSingle(final boolean b) {
        if (b != this.B) {
            this.B = b;
            if (b) {
                this.m = 0;
            }
            this.requestLayout();
            return;
        }
        this.invalidate();
    }
    
    public void setStyle(final int m) {
        if (m != this.m) {
            this.m = m;
            this.requestLayout();
        }
        else {
            this.invalidate();
        }
        this.C = false;
    }
}
