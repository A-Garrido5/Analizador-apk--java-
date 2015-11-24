// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.text.TextUtils;
import android.view.View$MeasureSpec;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.util.List;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.card.instance.CardInstanceData;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.Collections;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.util.q;
import com.twitter.library.provider.j;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import com.twitter.library.util.t;
import android.graphics.Paint;
import android.text.Layout;
import android.content.res.TypedArray;
import android.widget.ImageView$ScaleType;
import android.view.View;
import com.twitter.library.util.bo;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.widget.AdaptiveTweetMediaView;
import android.text.StaticLayout;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.ui.widget.ag;
import android.graphics.RectF;
import android.graphics.Rect;
import android.widget.ImageView;
import android.text.TextPaint;
import com.twitter.library.media.util.r;
import android.view.ViewGroup;

public class QuoteView extends ViewGroup implements r
{
    private static final TextPaint a;
    private ImageView A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private final Rect b;
    private final RectF c;
    private final ag d;
    private final float e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private float p;
    private final int q;
    private final int r;
    private QuotedTweetData s;
    private String t;
    private boolean u;
    private StaticLayout v;
    private StaticLayout w;
    private StaticLayout x;
    private StaticLayout y;
    private AdaptiveTweetMediaView z;
    
    static {
        a = new TextPaint(1);
    }
    
    public QuoteView(final Context context) {
        this(context, null);
    }
    
    public QuoteView(final Context context, final AttributeSet set) {
        this(context, set, kv.quoteViewStyle);
    }
    
    public QuoteView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new Rect();
        this.c = new RectF();
        this.C = true;
        this.R = 0;
        this.setWillNotDraw(false);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.QuoteView, n, 0);
        this.p = obtainStyledAttributes.getDimension(li.QuoteView_bylineSize, bo.b());
        this.j = obtainStyledAttributes.getColor(li.QuoteView_borderColor, 0);
        this.k = obtainStyledAttributes.getDimensionPixelSize(li.QuoteView_borderCornerRadius, 0);
        this.h = obtainStyledAttributes.getColor(li.QuoteView_contentColor, 0);
        this.i = obtainStyledAttributes.getColor(li.QuoteView_bylineColor, 0);
        this.d = ag.a(context);
        (this.z = new AdaptiveTweetMediaView(context)).c(true);
        this.z.setShowPlayerOverlay(false);
        this.z.setMediaPlaceholder(obtainStyledAttributes.getResourceId(li.QuoteView_mediaPlaceholder, 0));
        this.z.setBackgroundResource(0);
        this.z.setMediaDividerSize(obtainStyledAttributes.getDimensionPixelSize(li.QuoteView_mediaDividerSize, 0));
        this.addView((View)this.z);
        (this.A = new ImageView(context)).setScaleType(ImageView$ScaleType.CENTER);
        this.A.setBackgroundColor(obtainStyledAttributes.getColor(li.QuoteView_mediaPlaceholder, 0));
        this.addView((View)this.A);
        this.q = obtainStyledAttributes.getResourceId(li.QuoteView_sensitiveMediaCoverDrawable, 0);
        this.r = obtainStyledAttributes.getResourceId(li.QuoteView_sensitiveMediaCoverSmallDrawable, 0);
        this.l = obtainStyledAttributes.getDimensionPixelSize(li.QuoteView_borderWidth, 0);
        this.m = obtainStyledAttributes.getDimensionPixelSize(li.QuoteView_mediaTextGap, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(li.QuoteView_paddingTiny, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(li.QuoteView_compactMediaWidth, 0);
        this.e = obtainStyledAttributes.getDimension(li.QuoteView_interstitialTextSize, bo.a());
        this.f = obtainStyledAttributes.getColor(li.QuoteView_interstitialTextColor, 0);
        this.g = obtainStyledAttributes.getColor(li.QuoteView_interstitialBackgroundColor, 0);
        obtainStyledAttributes.recycle();
        this.b();
    }
    
    private int a(final Layout layout, final String s, final Paint paint) {
        paint.getTextBounds(s, 0, s.length(), this.b);
        if (this.b.height() == 0) {
            return 0;
        }
        return this.b.top - layout.getLineAscent(0);
    }
    
    private int a(final StaticLayout staticLayout) {
        return Math.min(staticLayout.getWidth(), staticLayout.getEllipsizedWidth());
    }
    
    private StaticLayout a(final String s, final int n, final TextPaint textPaint, final int n2) {
        Object o;
        if (this.getParent() != null) {
            o = this.getParent();
        }
        else {
            o = this;
        }
        final CharSequence a = com.twitter.library.util.t.a(this.getContext()).a((View)o, s, textPaint.getFontMetrics());
        StaticLayout a2 = com.twitter.util.t.a(a, 0, s.length(), textPaint, n, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils$TruncateAt.END, n, n2);
        if (a2 == null) {
            a2 = new StaticLayout(a, 0, s.length(), textPaint, n, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return a2;
    }
    
    private void b() {
        final boolean showMediaBadge = this.R == 0;
        this.z.a(showMediaBadge);
        this.z.setShowMediaBadge(showMediaBadge);
        int n;
        if (showMediaBadge) {
            n = this.q;
        }
        else {
            n = this.r;
        }
        if (n > 0) {
            this.A.setImageDrawable(this.getResources().getDrawable(n));
        }
    }
    
    private boolean c() {
        return this.s.possiblySensitive && !this.Q;
    }
    
    public void a() {
        this.z.b();
    }
    
    public void a(final QuotedTweetData s, final boolean fromMemoryOnly) {
        this.a(false);
        this.s = s;
        if (s != null) {
            if (this.C) {
                this.t = new j(this.s).a(true).b(true).c(true).e(false).a().a;
            }
            else {
                this.t = s.renderedText.trim();
            }
            this.z.setFromMemoryOnly(fromMemoryOnly);
            if (this.c()) {
                this.A.setVisibility(0);
                this.z.setVisibility(8);
            }
            else {
                this.A.setVisibility(8);
                final CardInstanceData cardInstanceData = s.cardInstanceData;
                final MediaEntity c = com.twitter.library.media.util.q.c(s.entities.media);
                final List d = com.twitter.library.media.util.q.d(s.entities.media, Size.a);
                if (c != null && this.C) {
                    this.z.setMediaEntities(Collections.singletonList(c));
                    this.z.setVisibility(0);
                }
                else if (!CollectionUtils.a((Collection)d) && this.C) {
                    if (this.R == 0) {
                        this.z.setMediaEntities(d);
                    }
                    else {
                        this.z.setMediaEntities(Collections.singletonList((Object)d.get(0)));
                    }
                    this.z.setVisibility(0);
                }
                else if (cardInstanceData != null && cardInstanceData.j() != null && this.C) {
                    this.z.setCard(cardInstanceData);
                    this.z.setVisibility(0);
                }
                else {
                    this.z.setVisibility(8);
                }
            }
        }
        else {
            this.A.setVisibility(8);
            this.z.setVisibility(8);
        }
        this.u = true;
        this.invalidate();
        this.requestLayout();
    }
    
    public void a(final boolean b) {
        if (b && this.s != null) {
            this.u = true;
            this.invalidate();
            this.requestLayout();
        }
        this.s = null;
        this.v = null;
        this.w = null;
        this.y = null;
        this.x = null;
        this.F = 0;
        this.G = 0;
        this.z.b();
        this.z.setVisibility(8);
    }
    
    public void e() {
        this.z.e();
    }
    
    public void f() {
        this.z.f();
    }
    
    protected void onDraw(final Canvas canvas) {
        final TextPaint a = QuoteView.a;
        final float n = this.getWidth();
        final float n2 = this.getHeight();
        if (this.s == null) {
            a.setColor(this.g);
            this.c.set(0.0f, 0.0f, n, n2);
            canvas.drawRoundRect(this.c, (float)this.k, (float)this.k, (Paint)a);
            if (this.y != null) {
                canvas.save();
                canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
                a.setTextSize(this.e);
                a.setTypeface(this.d.a);
                a.setColor(this.f);
                this.y.draw(canvas);
                canvas.restore();
            }
            return;
        }
        final float strokeWidth = this.l;
        final float n3 = strokeWidth / 2.0f;
        canvas.save();
        if (this.l > 0) {
            a.setColor(this.j);
            a.setStrokeWidth(strokeWidth);
            this.c.set(n3, n3, n - n3, n2 - n3);
            a.setStyle(Paint$Style.STROKE);
            canvas.drawRoundRect(this.c, (float)this.k, (float)this.k, (Paint)a);
            a.setStyle(Paint$Style.FILL);
        }
        canvas.translate(strokeWidth, strokeWidth);
        if (this.v != null) {
            canvas.save();
            canvas.translate((float)this.J, (float)(this.K - this.L));
            a.setTextSize(this.p);
            a.setTypeface(this.d.c);
            a.setColor(this.h);
            this.v.draw(canvas);
            canvas.restore();
        }
        if (this.w != null) {
            canvas.save();
            canvas.translate((float)this.M, (float)(this.N - this.O));
            a.setTextSize(this.p);
            a.setTypeface(this.d.a);
            a.setColor(this.i);
            this.w.draw(canvas);
            canvas.restore();
        }
        if (this.x != null) {
            canvas.save();
            canvas.translate((float)this.H, (float)(this.I - this.L));
            if (this.x.getLineCount() > this.P) {
                canvas.clipRect(0, 0, this.x.getWidth(), this.x.getLineTop(this.P));
            }
            a.setTextSize(this.p);
            a.setTypeface(this.d.a);
            a.setColor(this.h);
            this.x.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (b || this.u) {
            this.u = false;
            if (this.F != 0 && this.G != 0) {
                Object o;
                if (this.c()) {
                    o = this.A;
                }
                else {
                    o = this.z;
                }
                ((View)o).layout(this.D, this.E, this.D + this.F, this.E + this.G);
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final TextPaint a = QuoteView.a;
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int size2 = View$MeasureSpec.getSize(n2);
        int measuredWidth;
        if (mode == 1073741824) {
            measuredWidth = size;
        }
        else {
            measuredWidth = this.getMeasuredWidth();
        }
        int min;
        if (this.s == null) {
            final int n3 = measuredWidth - this.getPaddingLeft() - this.getPaddingRight();
            if (this.y == null && n3 > 0) {
                a.setTextSize(this.e);
                a.setTypeface(this.d.a);
                this.y = new StaticLayout((CharSequence)this.getContext().getResources().getString(lg.quote_tweet_interstitial_text), a, n3, Layout$Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            }
            min = this.getPaddingTop() + this.getPaddingBottom();
            if (this.y != null) {
                min += this.y.getHeight();
            }
        }
        else {
            this.J = this.l + this.getPaddingLeft();
            this.M = this.J;
            this.D = this.J;
            this.K = this.l + this.getPaddingTop();
            this.N = this.K;
            this.E = this.K;
            final String userName = this.s.userName;
            final String string = "@" + this.s.userHandle;
            final String t = this.t;
            final boolean b = !TextUtils.isEmpty((CharSequence)t);
            final int max = Math.max(0, measuredWidth - 2 * this.l - this.getPaddingLeft() - this.getPaddingRight());
            int f;
            if (this.R == 1 && (this.z.c() || this.c())) {
                f = Math.max(0, max - this.o - this.m);
            }
            else {
                f = max;
            }
            a.setTextSize(this.p);
            a.setTypeface(this.d.c);
            if (this.v == null && userName != null && f > 0) {
                this.v = new StaticLayout((CharSequence)userName, 0, userName.length(), a, com.twitter.util.t.a(userName, a), Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils$TruncateAt.END, f);
            }
            int n5;
            if (this.v != null) {
                final int n4 = this.v.getWidth() + this.n;
                this.L = this.a((Layout)this.v, userName, (Paint)a);
                this.M = n4 + this.J;
                this.E = this.K + this.v.getHeight();
                n5 = f - n4;
            }
            else {
                n5 = f;
            }
            a.setTypeface(this.d.a);
            if (this.w == null && string != null && n5 > 0) {
                this.w = new StaticLayout((CharSequence)string, 0, string.length(), a, com.twitter.util.t.a(string, a), Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils$TruncateAt.END, n5);
            }
            if (this.w != null) {
                if (this.v == null) {
                    this.O = this.a((Layout)this.w, string, (Paint)a);
                    this.E = this.N + this.w.getHeight();
                    this.L = this.O;
                }
                else {
                    this.O = this.w.getLineBaseline(0) - this.v.getLineBaseline(0) + this.L;
                }
            }
            this.I = this.E;
            if (this.z.c() || this.c()) {
                if (this.R == 1) {
                    this.F = this.o;
                    this.G = this.F;
                    this.H = this.J;
                    this.D = measuredWidth - this.getPaddingRight() - this.F;
                    this.E = this.K;
                    Object o;
                    if (this.c()) {
                        o = this.A;
                    }
                    else {
                        o = this.z;
                    }
                    ((View)o).measure(View$MeasureSpec.makeMeasureSpec(this.F, 1073741824), View$MeasureSpec.makeMeasureSpec(this.G, 1073741824));
                }
                else {
                    f = Math.max(0, (max - this.m) / 2);
                    this.F = f;
                    if (this.c()) {
                        this.G = (int)Math.rint(3.0 * this.F / 4.0);
                        this.A.measure(View$MeasureSpec.makeMeasureSpec(this.F, 1073741824), View$MeasureSpec.makeMeasureSpec(this.G, 1073741824));
                    }
                    else if (this.z.c()) {
                        this.z.measure(View$MeasureSpec.makeMeasureSpec(this.F, 1073741824), 0);
                        this.G = this.z.getMeasuredHeight();
                    }
                    if (b) {
                        this.H = this.D + this.F + this.m;
                    }
                }
                if (this.B) {
                    this.D = measuredWidth - this.D - this.F;
                }
            }
            else {
                this.z.b();
                this.F = 0;
                this.G = 0;
                this.H = this.J;
                f = max;
            }
            if (this.x == null && !TextUtils.isEmpty((CharSequence)t) && f > 0) {
                final float fontSpacing = a.getFontSpacing();
                if (this.R == 0 && Float.compare(fontSpacing, 1.0f) >= 0 && (this.z.c() || this.c())) {
                    this.P = Math.max(1, (int)Math.floor(this.G / fontSpacing));
                }
                else {
                    int p2;
                    if (this.R == 1) {
                        p2 = 1;
                    }
                    else {
                        p2 = 5;
                    }
                    this.P = p2;
                }
                this.x = this.a(t, f, a, this.P);
            }
            if (this.v == null && this.w == null && this.x != null) {
                this.L = this.a((Layout)this.x, t, (Paint)a);
            }
            int e;
            if (this.c()) {
                e = this.E + this.A.getMeasuredHeight();
            }
            else if (this.z.c()) {
                e = this.E + this.z.getMeasuredHeight();
            }
            else {
                e = this.E;
            }
            int i;
            if (this.x == null) {
                i = this.I;
            }
            else {
                i = this.I + this.x.getHeight() - this.L;
            }
            min = Math.max(e, i) + this.getPaddingBottom();
            if (this.B) {
                if (this.v != null && this.w != null) {
                    final int j = this.J;
                    final int a2 = this.a(this.w);
                    this.J = measuredWidth - this.M - a2;
                    this.M = measuredWidth - j - a2;
                }
                else if (this.v != null) {
                    this.J = measuredWidth - this.J - this.a(this.v);
                }
                else if (this.w != null) {
                    this.M = measuredWidth - this.M - this.a(this.w);
                }
                if (this.x != null) {
                    this.H = measuredWidth - this.H - this.x.getWidth();
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            min = Math.min(min, size2);
        }
        else if (mode2 == 1073741824) {
            min = size2;
        }
        this.setMeasuredDimension(measuredWidth, min);
    }
    
    public void setAlwaysExpandMedia(final boolean c) {
        if (this.C != c) {
            this.C = c;
            this.requestLayout();
        }
    }
    
    public void setContentSize(final float p) {
        this.p = p;
    }
    
    public void setDisplayMode(final int r) {
        if (this.R != r) {
            this.R = r;
            this.b();
        }
    }
    
    public void setDisplaySensitiveMedia(final boolean q) {
        this.Q = q;
    }
    
    public void setMediaFromMemoryOnly(final boolean fromMemoryOnly) {
        this.z.setFromMemoryOnly(fromMemoryOnly);
    }
    
    public void setOnImageLoadedListener(final com.twitter.library.media.widget.r onImageLoadedListener) {
        this.z.setOnImageLoadedListener(onImageLoadedListener);
    }
    
    public void setQuoteData(final QuotedTweetData quotedTweetData) {
        this.a(quotedTweetData, false);
    }
    
    public void setRenderRtl(final boolean b) {
        this.B = b;
    }
}
