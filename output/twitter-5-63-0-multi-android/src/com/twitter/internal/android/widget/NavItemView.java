// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import android.view.View$MeasureSpec;
import android.graphics.Paint$FontMetricsInt;
import com.twitter.util.t;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import com.twitter.ui.widget.ag;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Point;
import android.text.TextPaint;
import android.view.View;

public class NavItemView extends View
{
    private static final TextPaint a;
    private final float b;
    private final Point c;
    private final Rect d;
    private final ColorStateList e;
    private final ag f;
    private final int g;
    private final int h;
    private final int i;
    private a j;
    private StaticLayout k;
    private CharSequence l;
    private int m;
    private int n;
    private int o;
    private Drawable p;
    
    static {
        a = new TextPaint(1);
    }
    
    public NavItemView(final Context context) {
        this(context, null, kv.navItemStyle);
    }
    
    public NavItemView(final Context context, final AttributeSet set) {
        this(context, set, kv.navItemStyle);
    }
    
    public NavItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = new Point();
        this.d = new Rect();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.NavItemView, n, 0);
        this.e = obtainStyledAttributes.getColorStateList(li.NavItemView_textColor);
        if (this.e != null) {
            this.a();
        }
        this.b = obtainStyledAttributes.getDimension(li.NavItemView_textSize, 18.0f);
        this.f = ag.a(context);
        this.i = obtainStyledAttributes.getInt(li.NavItemView_displayMode, 1);
        this.g = obtainStyledAttributes.getInt(li.NavItemView_textStyle, 0);
        this.h = obtainStyledAttributes.getInt(li.NavItemView_selectedTextStyle, 1);
        this.j = new a(this, context, obtainStyledAttributes.getResourceId(li.NavItemView_badgeIndicatorStyle, 0));
        obtainStyledAttributes.recycle();
    }
    
    private void a() {
        final int colorForState = this.e.getColorForState(this.getDrawableState(), 0);
        if (colorForState != this.m) {
            this.m = colorForState;
        }
    }
    
    private TextPaint b() {
        final TextPaint a = NavItemView.a;
        if (this.isSelected()) {
            a.setTypeface(this.f.a(this.h));
        }
        else {
            a.setTypeface(this.f.a(this.g));
        }
        a.setTextSize(this.b);
        a.setColor(this.m);
        return a;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a();
        this.j.b();
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.p != null && this.i == 2) {
            this.p.draw(canvas);
        }
        else if (this.k != null) {
            this.b();
            final int save = canvas.save(1);
            canvas.translate((float)this.c.x, (float)this.c.y);
            this.k.draw(canvas);
            canvas.restoreToCount(save);
        }
        this.j.a(canvas);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        int paddingTop;
        Rect rect;
        if (this.p != null && this.i == 2) {
            final int intrinsicHeight = this.p.getIntrinsicHeight();
            final int intrinsicWidth = this.p.getIntrinsicWidth();
            final int a = t.a(n3 - n, intrinsicWidth);
            final int a2 = t.a(n4 - n2, intrinsicHeight);
            paddingTop = a2 + intrinsicHeight;
            this.p.setBounds(a, a2, intrinsicWidth + a, paddingTop);
            rect = this.p.getBounds();
        }
        else {
            final StaticLayout k = this.k;
            if (k != null) {
                final TextPaint b2 = this.b();
                final int paddingLeft = this.getPaddingLeft();
                final int n5 = paddingLeft + t.a(n3 - n - paddingLeft - this.getPaddingRight(), k.getWidth());
                final int paddingTop2 = this.getPaddingTop();
                final int height = k.getHeight();
                final int n6 = paddingTop2 + t.a(n4 - n2 - paddingTop2 - this.getPaddingBottom(), height);
                this.c.set(n5, n6);
                final Paint$FontMetricsInt fontMetricsInt = b2.getFontMetricsInt();
                paddingTop = n6 + (fontMetricsInt.bottom - fontMetricsInt.top - fontMetricsInt.descent);
                this.d.set(n5, n6 - paddingTop2, paddingLeft + (n5 + k.getWidth()), n6 + height);
                rect = this.d;
            }
            else {
                paddingTop = this.getPaddingTop();
                rect = null;
            }
        }
        this.j.a(b, n, n2, n3, n4, rect, paddingTop);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final StaticLayout k = this.k;
        final Drawable p2 = this.p;
        if (p2 != null && this.i == 2) {
            this.setMeasuredDimension(getDefaultSize(p2.getIntrinsicWidth(), n), getDefaultSize(p2.getIntrinsicHeight(), n2));
        }
        else if (k != null) {
            this.setMeasuredDimension(getDefaultSize(this.getPaddingLeft() + this.getPaddingRight() + k.getWidth(), n), getDefaultSize(this.getPaddingTop() + this.getPaddingBottom() + k.getHeight(), n2));
        }
        else {
            super.onMeasure(n, n2);
        }
        this.n = n;
    }
    
    public void setBadgeMode(final int n) {
        this.j.a(n);
    }
    
    public void setIconResource(final int o) {
        if (this.i != 2 || o == this.o) {
            return;
        }
        this.o = o;
        this.p = this.getContext().getResources().getDrawable(o);
        this.requestLayout();
        this.invalidate();
    }
    
    public void setIndicatorCount(final int n) {
        this.j.b(n);
    }
    
    public void setText(final CharSequence l) {
        int n = 1;
        if (l == null) {
            if (this.l == null) {
                n = 0;
            }
            this.l = null;
        }
        else if (!l.equals(this.l)) {
            this.l = l;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            if (l != null) {
                final TextPaint b = this.b();
                final int a = t.a(l, b);
                int n2;
                if (View$MeasureSpec.getMode(this.n) == 0) {
                    n2 = a + (this.getPaddingLeft() + this.getPaddingRight());
                }
                else {
                    n2 = View$MeasureSpec.getSize(this.n) - this.getPaddingLeft() - this.getPaddingRight();
                }
                this.k = new StaticLayout(l, 0, l.length(), b, a, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils$TruncateAt.END, n2);
            }
            else {
                this.k = null;
            }
            this.requestLayout();
            this.invalidate();
        }
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return this.j.a(drawable) || super.verifyDrawable(drawable);
    }
}
