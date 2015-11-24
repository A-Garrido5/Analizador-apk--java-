// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import com.twitter.util.t;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import com.twitter.util.k;
import android.content.res.Resources;
import com.twitter.library.util.bi;
import android.content.res.TypedArray;
import com.twitter.ui.widget.ag;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.StaticLayout;
import android.graphics.drawable.Drawable;
import android.view.View;

public class SocialProofView extends View
{
    private Drawable A;
    private StaticLayout B;
    private final TextPaint a;
    private final int b;
    private final float c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final Rect i;
    private final ColorStateList j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private String y;
    private String z;
    
    public SocialProofView(final Context context) {
        this(context, null);
    }
    
    public SocialProofView(final Context context, final AttributeSet set) {
        this(context, set, kv.socialProofViewStyle);
    }
    
    public SocialProofView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new TextPaint(1);
        this.i = new Rect();
        this.setVisibility(8);
        final ag a = ag.a(context);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.SocialProofView, n, 0);
        this.c = obtainStyledAttributes.getFloat(li.SocialProofView_android_lineSpacingMultiplier, 1.0f);
        this.b = obtainStyledAttributes.getDimensionPixelSize(li.SocialProofView_android_lineSpacingExtra, 0);
        this.d = obtainStyledAttributes.getDimensionPixelOffset(li.SocialProofView_badgeSpacing, 0);
        this.e = obtainStyledAttributes.getDimensionPixelOffset(li.SocialProofView_badgeSpacingTop, 0);
        this.j = obtainStyledAttributes.getColorStateList(li.SocialProofView_socialProofTextColor);
        this.f = obtainStyledAttributes.getDimensionPixelSize(li.SocialProofView_socialProofIconSpacing, 4);
        this.u = obtainStyledAttributes.getResourceId(li.SocialProofView_topPillDrawable, 0);
        this.k = obtainStyledAttributes.getResourceId(li.SocialProofView_retweetDrawable, 0);
        this.l = obtainStyledAttributes.getResourceId(li.SocialProofView_favDrawable, 0);
        this.m = obtainStyledAttributes.getResourceId(li.SocialProofView_followDrawable, 0);
        this.n = obtainStyledAttributes.getResourceId(li.SocialProofView_replyDrawable, 0);
        this.x = true;
        this.o = obtainStyledAttributes.getResourceId(li.SocialProofView_convoReplyDrawable, 0);
        this.p = obtainStyledAttributes.getResourceId(li.SocialProofView_nearbyDrawable, 0);
        this.q = obtainStyledAttributes.getResourceId(li.SocialProofView_popularDrawable, 0);
        this.r = obtainStyledAttributes.getResourceId(li.SocialProofView_recommendationDrawable, 0);
        this.s = obtainStyledAttributes.getResourceId(li.SocialProofView_collectionDrawable, 0);
        this.t = obtainStyledAttributes.getResourceId(li.SocialProofView_trendingDrawable, 0);
        this.h = obtainStyledAttributes.getDimensionPixelOffset(li.SocialProofView_badgeTextSpacingLtr, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(li.SocialProofView_badgeTextSpacingRtl, 0);
        obtainStyledAttributes.recycle();
        this.a.setTypeface(a.a);
    }
    
    public void a(final int n, final String s, final int n2, final int n3, final String s2, final int n4, final long n5) {
        final Resources resources = this.getResources();
        this.y = bi.a(resources, n, s, s2, n2, n3, n4, n5);
        this.z = bi.b(resources, n, s, s2, n2, n3, n4, n5);
        int n6 = 0;
        switch (n) {
            default: {
                n6 = 0;
                break;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 25:
            case 26:
            case 29:
            case 35: {
                n6 = this.m;
                break;
            }
            case 5:
            case 6:
            case 13:
            case 15:
            case 18:
            case 19: {
                n6 = this.k;
                break;
            }
            case 7:
            case 8:
            case 11:
            case 12: {
                n6 = this.n;
                break;
            }
            case 24: {
                n6 = this.o;
                break;
            }
            case 9:
            case 10:
            case 14:
            case 16:
            case 17:
            case 33:
            case 36: {
                n6 = this.l;
                break;
            }
            case 20:
            case 22:
            case 23: {
                n6 = this.u;
                break;
            }
            case 27: {
                n6 = this.p;
                break;
            }
            case 28: {
                n6 = this.q;
                break;
            }
            case 30:
            case 32:
            case 37: {
                n6 = this.r;
                break;
            }
            case 38: {
                n6 = this.t;
                break;
            }
            case 34: {
                n6 = this.s;
                break;
            }
        }
        this.a(this.y, n6);
    }
    
    public void a(final String y, final int n) {
        this.A = null;
        this.B = null;
        this.y = y;
        if (y == null) {
            this.v = false;
            this.z = null;
            this.setVisibility(8);
            return;
        }
        if (n > 0) {
            this.A = this.getResources().getDrawable(n);
        }
        this.v = true;
        this.setVisibility(0);
        this.invalidate();
        this.requestLayout();
    }
    
    public boolean a() {
        return this.x;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        this.a.setColor(this.j.getColorForState(drawableState, 0));
        if (this.A != null && this.A.isStateful()) {
            this.A.setState(drawableState);
        }
    }
    
    public int getBadgeWidth() {
        if (this.A == null) {
            return 0;
        }
        return this.A.getIntrinsicWidth();
    }
    
    public String getSocialProofString() {
        String s;
        if (this.v && this.z != null) {
            s = this.z;
        }
        else {
            s = this.y;
        }
        return com.twitter.util.k.a(s);
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.B != null) {
            canvas.save();
            int n2;
            int e;
            if (this.A != null) {
                final Rect bounds = this.A.getBounds();
                final int width = bounds.width();
                final int height = bounds.height();
                int n;
                if (this.w) {
                    n = this.getWidth() - width;
                    n2 = -(this.B.getWidth() + this.g);
                }
                else {
                    n2 = width + this.h;
                    n = 0;
                }
                canvas.translate((float)n, (float)this.e);
                this.A.draw(canvas);
                if (this.B.getLineCount() > 1) {
                    final String string = this.B.getText().toString();
                    this.a.getTextBounds(string, 0, string.length(), this.i);
                    e = -Math.abs(this.i.top) / 2;
                }
                else {
                    e = (height - this.B.getHeight()) / 2;
                }
            }
            else {
                final boolean w = this.w;
                int n3 = 0;
                if (w) {
                    n3 = this.getWidth() - this.B.getWidth() - this.f;
                }
                e = this.e;
                n2 = n3;
            }
            canvas.translate((float)n2, (float)e);
            this.B.draw(canvas);
            canvas.restore();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final TextPaint a = this.a;
        final int size = View$MeasureSpec.getSize(n);
        if (this.y != null) {
            if (this.A != null) {
                if (this.B == null) {
                    this.B = new StaticLayout((CharSequence)this.y, 0, this.y.length(), a, Math.min(com.twitter.util.t.a(this.y, a), size), Layout$Alignment.ALIGN_NORMAL, this.c, (float)this.b, false, (TextUtils$TruncateAt)null, size);
                }
                this.A.setBounds(0, 0, this.A.getIntrinsicWidth(), this.A.getIntrinsicHeight());
            }
            else if (this.B == null) {
                this.B = new StaticLayout((CharSequence)this.y, 0, this.y.length(), a, Math.min(com.twitter.util.t.a(this.y, a), size), Layout$Alignment.ALIGN_NORMAL, this.c, (float)this.b, false, TextUtils$TruncateAt.END, size);
            }
            int n3;
            if (this.A == null || this.B.getLineCount() > 1) {
                n3 = this.B.getHeight();
            }
            else {
                n3 = this.A.getBounds().height();
            }
            this.setMeasuredDimension(n, n3 + this.d);
            return;
        }
        super.onMeasure(n, n2);
    }
    
    public void setContentSize(final float textSize) {
        this.a.setTextSize(textSize);
    }
    
    public void setRenderRTL(final boolean w) {
        this.w = w;
    }
    
    public void setShowSocialBadge(final boolean x) {
        this.x = x;
    }
}
