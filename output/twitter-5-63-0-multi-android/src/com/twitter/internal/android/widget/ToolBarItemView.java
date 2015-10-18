// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.text.Layout$Alignment;
import android.graphics.Paint;
import java.util.Locale;
import android.graphics.Rect;
import android.graphics.Paint$FontMetricsInt;
import com.twitter.util.t;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.text.StaticLayout;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.Point;
import android.text.TextPaint;
import android.view.View;

public class ToolBarItemView extends View
{
    private static final int[] a;
    private static final TextPaint b;
    private final int c;
    private final Point d;
    private final int e;
    private float f;
    private Typeface g;
    private ColorStateList h;
    private Drawable i;
    private StaticLayout j;
    private int k;
    private boolean l;
    private int m;
    private String n;
    private a o;
    
    static {
        a = new int[] { kv.state_numbered };
        b = new TextPaint(1);
    }
    
    public ToolBarItemView(final Context context) {
        this(context, null, kv.toolBarItemStyle);
    }
    
    public ToolBarItemView(final Context context, final AttributeSet set) {
        this(context, set, kv.toolBarItemStyle);
    }
    
    public ToolBarItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = new Point();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.ToolBarItemView, n, 0);
        this.c = (int)Math.ceil(10.0f * context.getResources().getDisplayMetrics().density);
        this.o = new a(this, context, obtainStyledAttributes.getResourceId(li.ToolBarItemView_badgeIndicatorStyle, 0));
        this.setTextAppearance(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        this.e = lk.a(context);
    }
    
    private void a() {
        final int colorForState = this.h.getColorForState(this.getDrawableState(), 0);
        if (colorForState != this.m) {
            this.setTextColor(colorForState);
        }
    }
    
    private boolean b() {
        return this.j != null && (this.l || this.i == null);
    }
    
    private void setTextAppearance(final TypedArray typedArray) {
        this.f = typedArray.getDimension(li.ToolBarItemView_textSize, 14.0f);
        this.h = typedArray.getColorStateList(li.ToolBarItemView_textColor);
        this.g = Typeface.DEFAULT_BOLD;
        if (this.h != null) {
            this.a();
            return;
        }
        this.m = -16777216;
    }
    
    public void a(final Context context, final int n) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, li.ToolBarItemView);
        this.setTextAppearance(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.i != null && this.i.isStateful()) {
            this.i.setState(this.getDrawableState());
        }
        this.a();
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + ToolBarItemView.a.length);
        if (this.o.a()) {
            mergeDrawableStates(onCreateDrawableState, ToolBarItemView.a);
        }
        return onCreateDrawableState;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o.c();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.i != null) {
            this.i.draw(canvas);
        }
        if (this.b()) {
            final int save = canvas.save(1);
            final TextPaint b = ToolBarItemView.b;
            b.setTextSize(this.f);
            b.setColor(this.m);
            b.setTypeface(this.g);
            canvas.translate((float)this.d.x, (float)this.d.y);
            this.j.draw(canvas);
            canvas.restoreToCount(save);
        }
        this.o.a(canvas);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n3 - n - (this.getPaddingLeft() + this.getPaddingRight());
        final int n6 = n4 - n2;
        int n7 = t.a(n5, this.k) + this.getPaddingLeft();
        if (this.b()) {
            final Paint$FontMetricsInt fontMetricsInt = ToolBarItemView.b.getFontMetricsInt();
            this.d.set(n7, t.a(fontMetricsInt.bottom - fontMetricsInt.top - fontMetricsInt.descent, n6));
            n7 += this.j.getWidth() + this.c;
        }
        final Drawable i = this.i;
        int n8 = 0;
        if (i != null) {
            final int intrinsicHeight = this.i.getIntrinsicHeight();
            final int intrinsicWidth = this.i.getIntrinsicWidth();
            final int a = t.a(n6, intrinsicHeight);
            this.i.setBounds(n7, a, intrinsicWidth + n7, a + intrinsicHeight);
            n8 = a + intrinsicHeight;
        }
        final a o = this.o;
        Rect bounds;
        if (this.i != null) {
            bounds = this.i.getBounds();
        }
        else {
            bounds = null;
        }
        o.a(b, n, n2, n3, n4, bounds, n8);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final Drawable i = this.i;
        int intrinsicWidth = 0;
        if (i != null) {
            intrinsicWidth = this.i.getIntrinsicWidth();
        }
        if (this.b()) {
            if (this.i != null) {
                intrinsicWidth += this.c;
            }
            intrinsicWidth += this.j.getWidth();
        }
        this.k = intrinsicWidth;
        this.setMeasuredDimension(getDefaultSize(Math.max(intrinsicWidth + this.getPaddingLeft() + this.getPaddingRight(), this.getSuggestedMinimumWidth()), n), getDefaultSize(this.getSuggestedMinimumHeight(), n2));
    }
    
    public void setBadgeMode(final int n) {
        this.o.a(n);
    }
    
    public void setImageDrawable(final Drawable drawable) {
        if (this.i == drawable) {
            return;
        }
        this.i = lk.a(drawable, this.e);
        this.requestLayout();
        this.invalidateDrawable(this.i);
    }
    
    public void setImageResource(final int n) {
        if (n == 0) {
            return;
        }
        this.setImageDrawable(this.getResources().getDrawable(n));
    }
    
    public void setLabel(final CharSequence charSequence) {
        int n = 0;
        Label_0031: {
            if (charSequence == null) {
                final StaticLayout j = this.j;
                n = 0;
                if (j != null) {
                    n = 1;
                }
                this.j = null;
                this.n = null;
            }
            else {
                final String upperCase = charSequence.toString().toUpperCase(Locale.ENGLISH);
                if (this.j != null) {
                    final boolean equals = upperCase.equals(this.n);
                    n = 0;
                    if (equals) {
                        break Label_0031;
                    }
                }
                ToolBarItemView.b.setTextSize(this.f);
                ToolBarItemView.b.setTypeface(this.g);
                final TextPaint textPaint = new TextPaint((Paint)ToolBarItemView.b);
                textPaint.setColor(this.e);
                this.j = new StaticLayout((CharSequence)upperCase, textPaint, t.a(upperCase, textPaint), Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.n = upperCase;
                n = 1;
            }
        }
        if (n != 0) {
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public void setLabelResource(final int n) {
        if (n == 0) {
            return;
        }
        this.setLabel(this.getResources().getString(n));
    }
    
    public void setNumber(final int n) {
        this.o.b(n);
    }
    
    public void setTextColor(final int m) {
        int n;
        if (m != this.m) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.m = m;
        if (n != 0) {
            this.invalidate();
        }
    }
    
    public void setWithText(final boolean l) {
        int n;
        if (l != this.l) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.l = l;
        if (n != 0) {
            this.requestLayout();
            this.invalidate();
        }
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return this.o.a(drawable) || drawable == this.i || super.verifyDrawable(drawable);
    }
}
