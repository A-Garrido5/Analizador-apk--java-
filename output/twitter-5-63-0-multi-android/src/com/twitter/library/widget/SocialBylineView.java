// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.text.Layout$Alignment;
import com.twitter.util.t;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Paint;
import android.content.res.TypedArray;
import com.twitter.library.util.bo;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.ui.widget.ag;
import android.text.StaticLayout;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.view.View;

public class SocialBylineView extends View
{
    private static final TextPaint a;
    private final int b;
    private final int c;
    private final ColorStateList d;
    private int e;
    private int f;
    private CharSequence g;
    private float h;
    private Drawable i;
    private int j;
    private StaticLayout k;
    private boolean l;
    private final ag m;
    
    static {
        a = new TextPaint(1);
    }
    
    public SocialBylineView(final Context context) {
        this(context, null);
    }
    
    public SocialBylineView(final Context context, final AttributeSet set) {
        this(context, set, kv.socialBylineViewStyle);
    }
    
    public SocialBylineView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.SocialBylineView, n, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(li.SocialBylineView_minIconWidth, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(li.SocialBylineView_iconMargin, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(li.SocialBylineView_socialContextPadding, 0);
        this.h = obtainStyledAttributes.getDimension(li.SocialBylineView_labelSize, bo.b());
        this.d = obtainStyledAttributes.getColorStateList(li.SocialBylineView_labelColor);
        this.f = this.d.getColorForState(this.getDrawableState(), 0);
        obtainStyledAttributes.recycle();
        this.m = ag.a(context);
    }
    
    private int a(final String s, final Paint paint) {
        final Rect rect = new Rect();
        paint.getTextBounds(s, 0, s.length(), rect);
        return Math.abs(rect.top);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.d.isStateful()) {
            final int colorForState = this.d.getColorForState(this.getDrawableState(), 0);
            if (this.f != colorForState) {
                this.f = colorForState;
                this.invalidate();
            }
        }
        if (this.i != null && this.i.isStateful()) {
            this.i.setState(this.getDrawableState());
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        final TextPaint a = SocialBylineView.a;
        final Drawable i = this.i;
        final StaticLayout k = this.k;
        boolean b;
        if (i != null) {
            b = true;
        }
        else {
            b = false;
        }
        canvas.save();
        canvas.translate(0.0f, (float)this.c);
        Rect bounds;
        int height;
        if (b) {
            i.draw(canvas);
            bounds = i.getBounds();
            height = bounds.height();
        }
        else {
            bounds = null;
            height = 0;
        }
        if (k != null) {
            int n;
            if (this.l) {
                if (b) {
                    n = bounds.left - k.getWidth() - this.b;
                }
                else {
                    n = this.getWidth() - k.getWidth() - this.b;
                }
            }
            else {
                n = 0;
                if (b) {
                    n = bounds.right + this.b;
                }
            }
            if (this.k.getLineCount() > 1) {
                canvas.translate((float)n, (float)(this.getPaddingTop() - this.a(k.getText().toString(), (Paint)a) / 2));
            }
            else {
                final int height2 = k.getHeight();
                canvas.translate((float)n, (float)(this.getPaddingTop() + (Math.max(height, height2) - height2) / 2));
            }
            a.setTypeface(this.m.a);
            a.setTextSize(this.h);
            a.setColor(this.f);
            k.draw(canvas);
            canvas.restore();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final TextPaint a = SocialBylineView.a;
        final Drawable i = this.i;
        final CharSequence g = this.g;
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        final int paddingRight = this.getPaddingRight();
        int intrinsicHeight;
        int e;
        if (i != null) {
            final int max = Math.max(this.e, i.getIntrinsicWidth());
            intrinsicHeight = i.getIntrinsicHeight();
            e = max;
        }
        else {
            e = this.e;
            intrinsicHeight = 0;
        }
        int a2 = 0;
        int n3 = 0;
        switch (mode) {
            default: {
                final int suggestedMinimumWidth = this.getSuggestedMinimumWidth();
                a2 = suggestedMinimumWidth - paddingLeft - paddingRight - this.b - e;
                n3 = suggestedMinimumWidth;
                break;
            }
            case Integer.MIN_VALUE:
            case 0: {
                a2 = t.a(this.g, a);
                n3 = a2 + (e + (paddingLeft + paddingRight) + this.b);
                break;
            }
            case 1073741824: {
                a2 = size - paddingLeft - paddingRight - this.b - e;
                n3 = size;
                break;
            }
        }
        this.j = a2;
        StaticLayout k;
        int height;
        if (g != null) {
            a.setTypeface(this.m.a);
            a.setTextSize(this.h);
            if (mode == 0) {
                k = new StaticLayout(g, a, this.j, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            else {
                k = new StaticLayout(g, 0, g.length(), SocialBylineView.a, Math.min(t.a(this.g, a), this.j), Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            height = k.getHeight();
        }
        else {
            k = null;
            height = 0;
        }
        final int max2 = Math.max(height, intrinsicHeight);
        if (i != null) {
            final int intrinsicWidth = i.getIntrinsicWidth();
            int n4;
            if (this.l) {
                n4 = n3 - paddingRight - e;
            }
            else {
                n4 = paddingLeft + e - intrinsicWidth;
            }
            i.setBounds(n4, paddingTop, intrinsicWidth + n4, paddingTop + intrinsicHeight);
        }
        this.k = k;
        int n5;
        if (View$MeasureSpec.getMode(n2) == 1073741824) {
            n5 = View$MeasureSpec.getSize(n2);
        }
        else {
            n5 = Math.max(this.getSuggestedMinimumHeight(), max2 + paddingTop + this.getPaddingBottom());
        }
        this.setMeasuredDimension(n3, n5);
    }
    
    public void setIcon(final int n) {
        this.setIconDrawable(this.getResources().getDrawable(n));
    }
    
    public void setIconDrawable(final Drawable i) {
        if (this.i != i && (this.i = i) != null) {
            this.requestLayout();
        }
    }
    
    public void setLabel(final CharSequence g) {
        if ((g == null && this.g == null) || (g != null && g.equals(this.g))) {
            return;
        }
        this.g = g;
        this.requestLayout();
    }
    
    public void setLabelSize(final float h) {
        this.h = h;
    }
    
    public void setMinIconWidth(final int e) {
        this.e = e;
    }
    
    public void setRenderRTL(final boolean l) {
        this.l = l;
    }
}
