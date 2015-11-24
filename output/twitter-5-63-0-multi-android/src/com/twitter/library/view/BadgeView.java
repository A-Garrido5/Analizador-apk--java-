// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import com.twitter.util.t;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.twitter.ui.widget.ag;
import android.content.res.TypedArray;
import com.twitter.library.util.bj;
import android.util.AttributeSet;
import android.content.Context;
import android.text.StaticLayout;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.graphics.Rect;
import android.view.View;

public class BadgeView extends View
{
    private static final Rect a;
    private final TextPaint b;
    private int c;
    private float d;
    private int e;
    private ColorStateList f;
    private Drawable g;
    private StaticLayout h;
    private String i;
    private boolean j;
    private boolean k;
    private boolean l;
    
    static {
        a = new Rect();
    }
    
    public BadgeView(final Context context) {
        this(context, null);
    }
    
    public BadgeView(final Context context, final int n) {
        super(context, (AttributeSet)null);
        this.b = new TextPaint(1);
        this.j = bj.e;
        this.k = false;
        this.l = true;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, li.BadgeView);
        this.a(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    public BadgeView(final Context context, final AttributeSet set) {
        this(context, set, kv.badgeViewStyle);
    }
    
    public BadgeView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new TextPaint(1);
        this.j = bj.e;
        this.k = false;
        this.l = true;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.BadgeView, n, 0);
        this.a(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    private void a(final Context context, final TypedArray typedArray) {
        this.d = typedArray.getFloat(li.BadgeView_android_lineSpacingMultiplier, 1.0f);
        this.c = typedArray.getDimensionPixelSize(li.BadgeView_android_lineSpacingExtra, 0);
        this.e = typedArray.getDimensionPixelOffset(li.BadgeView_badgeSpacing, 0);
        this.f = typedArray.getColorStateList(li.BadgeView_contentColor);
        this.l = typedArray.getBoolean(li.BadgeView_showBadge, true);
        final int dimensionPixelSize = typedArray.getDimensionPixelSize(li.BadgeView_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            this.setContentSize(dimensionPixelSize);
        }
        this.b.setTypeface(ag.a(context).a);
    }
    
    private boolean a() {
        if (this.j) {
            return this.k;
        }
        return !this.k;
    }
    
    public void a(final int n, final String i) {
        this.g = null;
        this.h = null;
        this.i = i;
        if (TextUtils.isEmpty((CharSequence)i)) {
            this.setVisibility(8);
            return;
        }
        if (n > 0) {
            this.g = this.getResources().getDrawable(n);
        }
        this.setVisibility(0);
        this.invalidate();
        this.requestLayout();
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f != null) {
            this.b.setColor(this.f.getColorForState(this.getDrawableState(), 0));
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.h != null && this.h.getLineCount() > 0) {
            canvas.save();
            boolean l;
            Rect rect;
            if (this.g != null) {
                l = this.l;
                rect = this.g.getBounds();
            }
            else {
                rect = BadgeView.a;
                l = false;
            }
            int n;
            int n2;
            if (this.a()) {
                if (l) {
                    n = rect.width() + this.e;
                }
                else {
                    n = 0;
                }
                n2 = 0;
            }
            else {
                n2 = this.getWidth() - rect.width();
                final int n3 = (int)this.h.getLineWidth(0);
                if (l) {
                    n = n2 - (n3 + this.e);
                }
                else {
                    n = this.getWidth() - n3;
                }
            }
            final int n4 = (this.getHeight() + this.getPaddingTop() + this.getPaddingBottom()) / 2;
            canvas.translate((float)n2, (float)(n4 - rect.height() / 2));
            if (l) {
                this.g.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            canvas.translate((float)n, n4 - this.h.getHeight() / 2.0f + Math.min(this.b.getTextSize() + this.h.getLineAscent(0), 0.0f));
            this.h.draw(canvas);
            canvas.restore();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.i != null) {
            int size = View$MeasureSpec.getSize(n);
            if (this.g != null) {
                this.g.setBounds(0, 0, this.g.getIntrinsicWidth(), this.g.getIntrinsicHeight());
            }
            if (this.h == null) {
                if (this.g != null) {
                    size = size - this.e - this.g.getIntrinsicWidth();
                }
                final TextPaint b = this.b;
                this.h = new StaticLayout((CharSequence)this.i, 0, this.i.length(), b, t.a(this.i, b), Layout$Alignment.ALIGN_NORMAL, this.d, (float)this.c, false, TextUtils$TruncateAt.END, size);
            }
            int n3;
            if (this.g != null) {
                n3 = Math.max(this.g.getBounds().height(), this.h.getHeight());
            }
            else {
                n3 = this.h.getHeight();
            }
            this.setMeasuredDimension(n, n3 + this.getPaddingTop() + this.getPaddingBottom());
            return;
        }
        super.onMeasure(n, n2);
    }
    
    public void setAlignEnd(final boolean k) {
        this.k = k;
    }
    
    public void setContentSize(final float textSize) {
        this.b.setTextSize(textSize);
    }
    
    public void setRenderRtl(final boolean j) {
        this.j = j;
    }
    
    public void setShowBadge(final boolean l) {
        this.l = l;
    }
}
