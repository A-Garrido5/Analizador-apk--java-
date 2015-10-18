// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.view.MotionEvent;
import android.text.Layout;
import com.twitter.library.util.aj;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.Layout$Alignment;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.text.StaticLayout;
import android.content.res.ColorStateList;
import com.twitter.ui.widget.ag;
import android.text.TextPaint;
import android.view.View;

public class TweetContentView extends View
{
    private static final TextPaint a;
    private final ag b;
    private final float c;
    private final int d;
    private final ColorStateList e;
    private final ColorStateList f;
    private int g;
    private int h;
    private int i;
    private int j;
    private StaticLayout k;
    private float l;
    private CharSequence m;
    private boolean n;
    private CharSequence o;
    private u p;
    
    static {
        a = new TextPaint(1);
    }
    
    public TweetContentView(final Context context) {
        this(context, null);
    }
    
    public TweetContentView(final Context context, final AttributeSet set) {
        this(context, set, kv.tweetContentViewStyle);
    }
    
    public TweetContentView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.i = -1;
        this.j = -1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.TweetContentView, n, 0);
        this.b = ag.a(context);
        this.c = obtainStyledAttributes.getFloat(li.TweetContentView_android_lineSpacingMultiplier, 1.0f);
        this.d = obtainStyledAttributes.getDimensionPixelSize(li.TweetContentView_android_lineSpacingExtra, 0);
        this.e = obtainStyledAttributes.getColorStateList(li.TweetContentView_contentColor);
        this.f = obtainStyledAttributes.getColorStateList(li.TweetContentView_linkColor);
        this.j = obtainStyledAttributes.getInt(li.TweetContentView_android_maxLines, -1);
        this.i = obtainStyledAttributes.getInt(li.TweetContentView_android_minLines, -1);
        this.a();
        obtainStyledAttributes.recycle();
    }
    
    static StaticLayout a(final CharSequence charSequence, final TextPaint textPaint, final int n, final Layout$Alignment layout$Alignment, final float n2, final float n3, final boolean b, final int n4, final CharSequence charSequence2) {
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, n, layout$Alignment, n2, n3, b);
        if (n4 > 0 && staticLayout.getLineCount() > n4) {
            final int lineEnd = staticLayout.getLineEnd(n4 - 1);
            int length;
            if (charSequence2 != null) {
                length = charSequence2.length();
            }
            else {
                length = 0;
            }
            final int lineStart = staticLayout.getLineStart(n4 - 1);
            int lastIndex = TextUtils.lastIndexOf(charSequence, ' ', lineStart, Math.max(lineStart, -2 + (lineEnd - length)));
            if (lastIndex <= lineStart) {
                lastIndex = lineStart;
            }
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.subSequence(0, lastIndex));
            if (charSequence2 != null) {
                spannableStringBuilder.append(charSequence2);
            }
            staticLayout = new StaticLayout((CharSequence)spannableStringBuilder, textPaint, n, layout$Alignment, n2, n3, b);
        }
        return staticLayout;
    }
    
    private void a() {
        final int[] drawableState = this.getDrawableState();
        if (this.e != null) {
            this.g = this.e.getColorForState(drawableState, 0);
        }
        if (this.f != null) {
            this.h = this.f.getColorForState(drawableState, 0);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a();
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.k == null) {
            return;
        }
        final TextPaint a = TweetContentView.a;
        a.setTypeface(this.b.a);
        a.setTextSize(this.l);
        a.setColor(this.g);
        a.linkColor = this.h;
        try {
            this.k.draw(canvas);
        }
        catch (Exception ex) {}
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        if (this.k == null && !TextUtils.isEmpty(this.m)) {
            final TextPaint a = TweetContentView.a;
            final CharSequence m = this.m;
            final int n3 = size - paddingLeft - paddingRight;
            a.setTypeface(this.b.a);
            a.setTextSize(this.l);
            a.setColor(this.g);
            Layout$Alignment layout$Alignment;
            if (aj.a && this.n) {
                layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
            }
            else {
                layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
            }
            this.k = a(m, a, n3, layout$Alignment, this.c, this.d, false, this.j, this.o);
            this.p = new u(this, (Layout)this.k);
        }
        int n4;
        if ((this.k == null) ? (this.i > 0) : (this.k.getLineCount() > 0 && this.k.getLineCount() < this.i && this.i > 0)) {
            n4 = this.k.getHeight() / this.k.getLineCount() * (this.i - this.k.getLineCount());
        }
        else {
            n4 = 0;
        }
        final StaticLayout k = this.k;
        int height = 0;
        if (k != null) {
            height = this.k.getHeight();
        }
        this.setMeasuredDimension(size, n4 + (height + this.getPaddingTop() + this.getPaddingBottom()));
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return (this.p != null && this.p.a(motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public void setContent(final CharSequence m) {
        this.k = null;
        this.p = null;
        this.m = null;
        this.m = m;
        this.invalidate();
    }
    
    public void setFontSize(final float l) {
        this.l = l;
    }
    
    public void setRenderRTL(final boolean n) {
        this.n = n;
    }
    
    public void setTruncateText(final CharSequence o) {
        this.o = o;
    }
}
