// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.ViewGroup;

public class GroupedRowView extends ViewGroup
{
    private static final Paint a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private int f;
    private int g;
    private RectF h;
    private RectF i;
    private RectF j;
    private RectF k;
    private boolean l;
    private boolean m;
    private boolean n;
    
    static {
        a = new Paint(1);
    }
    
    public GroupedRowView(final Context context) {
        this(context, null);
    }
    
    public GroupedRowView(final Context context, final AttributeSet set) {
        this(context, set, kv.groupedRowViewStyle);
    }
    
    public GroupedRowView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.GroupedRowView, n, 0);
        this.f = obtainStyledAttributes.getInt(li.GroupedRowView_cardStyle, 0);
        this.g = obtainStyledAttributes.getInt(li.GroupedRowView_groupStyle, 0);
        this.l = obtainStyledAttributes.getBoolean(li.GroupedRowView_single, false);
        this.d = obtainStyledAttributes.getColor(li.GroupedRowView_fillColor, -1);
        this.e = obtainStyledAttributes.getColor(li.GroupedRowView_borderColor, -7829368);
        this.c = obtainStyledAttributes.getDimensionPixelSize(li.GroupedRowView_borderHeight, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(li.GroupedRowView_gapSize, this.getResources().getDimensionPixelSize(ky.grouped_row_view_gap_size));
        this.m = obtainStyledAttributes.getBoolean(li.GroupedRowView_hideDivider, false);
        this.n = obtainStyledAttributes.getBoolean(li.GroupedRowView_hideBorder, false);
        super.setPadding(0, 0, 0, 0);
        obtainStyledAttributes.recycle();
    }
    
    private void b(final int n, final int n2) {
        if (n2 <= 1) {
            this.setStyle(0);
            return;
        }
        if (n == 0) {
            this.setStyle(1);
            return;
        }
        if (n == n2 - 1) {
            this.setStyle(3);
            return;
        }
        this.setStyle(2);
    }
    
    public void a() {
        this.m = true;
    }
    
    public void a(final int n, final int n2) {
        int l = 1;
        if (n2 > l) {
            l = 0;
        }
        this.l = (l != 0);
        this.b(n, n2);
    }
    
    public void a(final int n, final int n2, final boolean b) {
        if (n2 <= 0) {
            this.setGroupStyle(0);
            return;
        }
        if (n == 0) {
            if (b) {
                this.setGroupStyle(4);
                return;
            }
            this.setGroupStyle(1);
        }
        else if (n == n2 - 1) {
            if (b) {
                this.setGroupStyle(6);
                return;
            }
            this.setGroupStyle(3);
        }
        else {
            if (b) {
                this.setGroupStyle(5);
                return;
            }
            this.setGroupStyle(2);
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
            throw new IllegalStateException("GroupedRowView can only hold a single child view.");
        }
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.addView(view, this.getChildCount(), viewGroup$LayoutParams);
    }
    
    public void dispatchDraw(final Canvas canvas) {
        final RectF h = this.h;
        final int f = this.f;
        final boolean l = this.l;
        if ((f == 0 && !l) || h == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.n) {
            final Paint a = GroupedRowView.a;
            a.setColor(this.d);
            canvas.drawRect(this.i, a);
            a.setColor(this.e);
            canvas.drawRect(this.j, a);
            canvas.drawRect(this.k, a);
        }
        final int save = canvas.save();
        canvas.clipRect(h);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
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
        if (child != null && child.getVisibility() == 0) {
            final RectF h = this.h;
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)child.getLayoutParams();
            child.layout((int)h.left + viewGroup$MarginLayoutParams.leftMargin, (int)h.top + viewGroup$MarginLayoutParams.topMargin, (int)h.right - viewGroup$MarginLayoutParams.rightMargin, (int)h.bottom - viewGroup$MarginLayoutParams.bottomMargin);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final View child = this.getChildAt(0);
        if (child == null || child.getVisibility() == 8) {
            this.setMeasuredDimension(0, 0);
            return;
        }
        final int f = this.f;
        final boolean l = this.l;
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)child.getLayoutParams();
        if (f == 0 && !l) {
            this.measureChildWithMargins(child, n, 0, n2, 0);
            final int n3 = child.getMeasuredWidth() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin;
            final int n4 = child.getMeasuredHeight() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
            this.h.set(0.0f, 0.0f, (float)n3, (float)n4);
            this.setMeasuredDimension(n3, n4);
            return;
        }
        final int c = this.c;
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
        this.measureChildWithMargins(child, getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight(), child.getLayoutParams().width), 0, n2, 0);
        final int n5 = child.getMeasuredHeight() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
        int n6;
        int n7;
        int n8;
        int n9;
        if (l) {
            n6 = this.b;
            n7 = c + (0 + n6);
            n8 = 0 + c;
            n9 = c;
        }
        else {
            n8 = 0;
            n7 = 0;
            n6 = 0;
            n9 = 0;
        }
        while (true) {
            Label_0437: {
                if (f != 1) {
                    break Label_0437;
                }
                n6 = this.b;
                n7 = c + (n7 + n6);
                if (this.m) {
                    break Label_0437;
                }
                n8 += c;
                final int n10 = n6;
                final int n11 = n7;
                int n12 = c;
                if (f == 2 || f == 3) {
                    n8 += c;
                    n12 = c;
                }
                this.h.set(0.0f, (float)n11, (float)min, (float)(n5 + n11));
                final int n13 = n5 + (n8 + n11);
                this.i.set(0.0f, 0.0f, (float)min, (float)n10);
                this.j.set(0.0f, (float)n10, (float)min, this.h.top);
                this.k.set(0.0f, this.h.bottom, (float)min, this.h.bottom + n12);
                this.setMeasuredDimension(min, n13);
                return;
            }
            final int n14 = n7;
            int n12 = n9;
            final int n10 = n6;
            final int n11 = n14;
            continue;
        }
    }
    
    public void setGroupStyle(final int g) {
        if (g != this.g) {
            this.g = g;
            this.requestLayout();
            return;
        }
        this.invalidate();
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void setSingle(final boolean l) {
        if (l != this.l) {
            this.l = l;
            if (l) {
                this.f = 0;
            }
            this.requestLayout();
            return;
        }
        this.invalidate();
    }
    
    public void setStyle(final int f) {
        if (f != this.f) {
            this.f = f;
            this.requestLayout();
        }
        else {
            this.invalidate();
        }
        this.m = false;
    }
}
