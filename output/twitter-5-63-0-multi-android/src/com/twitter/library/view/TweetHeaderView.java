// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.graphics.PorterDuff$Mode;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import com.twitter.util.t;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.graphics.ColorFilter;
import android.text.Layout;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.widget.ap;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import com.twitter.ui.widget.ag;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.graphics.Rect;
import android.view.View$OnClickListener;
import com.twitter.library.widget.TouchableView;

public class TweetHeaderView extends TouchableView
{
    private static final int[] b;
    private float A;
    private float B;
    private float C;
    private String D;
    private String E;
    private String F;
    private boolean G;
    private boolean H;
    private boolean I;
    View$OnClickListener a;
    private final Rect c;
    private final TextPaint d;
    private final Rect e;
    private float f;
    private int g;
    private int h;
    private ColorStateList i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private ag m;
    private StaticLayout n;
    private int o;
    private StaticLayout p;
    private int q;
    private StaticLayout r;
    private int s;
    private Drawable t;
    private Drawable u;
    private ap v;
    private int w;
    private int x;
    private int y;
    private boolean z;
    
    static {
        b = new int[] { kv.state_name_username_pressed };
    }
    
    public TweetHeaderView(final Context context) {
        this(context, null);
    }
    
    public TweetHeaderView(final Context context, final int n) {
        super(context, null);
        this.c = new Rect();
        this.d = new TextPaint(1);
        this.e = new Rect();
        this.G = true;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, li.TweetHeaderView);
        this.a(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    public TweetHeaderView(final Context context, final AttributeSet set) {
        this(context, set, kv.tweetHeaderViewStyle);
    }
    
    public TweetHeaderView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = new Rect();
        this.d = new TextPaint(1);
        this.e = new Rect();
        this.G = true;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.TweetHeaderView, n, 0);
        this.a(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    private static int a(final Rect rect) {
        if (rect.height() == 0) {
            return 0;
        }
        return -rect.top;
    }
    
    private static int a(final Layout layout, final Rect rect) {
        if (rect.height() == 0) {
            return 0;
        }
        return Math.max(0, layout.getLineDescent(0) - rect.bottom);
    }
    
    private void a(final Context context, final TypedArray typedArray) {
        this.m = ag.a(context);
        this.i = typedArray.getColorStateList(li.TweetHeaderView_nameColor);
        this.k = typedArray.getColorStateList(li.TweetHeaderView_timestampColor);
        this.j = this.k;
        this.l = typedArray.getColorStateList(li.TweetHeaderView_usernameColor);
        this.f = typedArray.getFloat(li.TweetHeaderView_android_lineSpacingMultiplier, 1.0f);
        this.g = typedArray.getDimensionPixelSize(li.TweetHeaderView_android_lineSpacingExtra, 0);
        this.h = typedArray.getDimensionPixelSize(li.TweetHeaderView_headerIconSpacing, 4);
        this.drawableStateChanged();
    }
    
    private static int b(final Layout layout, final Rect rect) {
        if (rect.height() == 0) {
            return 0;
        }
        return rect.top - layout.getLineAscent(0);
    }
    
    public void a() {
        if (this.u != null) {
            this.u.setColorFilter((ColorFilter)null);
        }
    }
    
    public void a(final float a, final float b, final float c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }
    
    public void a(String d, final String s, final String f, final int n, final int n2) {
        this.p = null;
        this.n = null;
        this.r = null;
        this.t = null;
        this.u = null;
        this.c.setEmpty();
        if (TextUtils.isEmpty((CharSequence)d)) {
            d = null;
        }
        this.D = d;
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        String string = null;
        if (!empty) {
            string = "@" + s;
        }
        this.E = string;
        this.F = f;
        this.d();
        if (n > 0) {
            (this.t = this.getResources().getDrawable(n)).setBounds(0, 0, this.t.getIntrinsicWidth(), this.t.getIntrinsicHeight());
        }
        if (n2 > 0) {
            (this.u = this.getResources().getDrawable(n2)).setBounds(0, 0, this.u.getIntrinsicWidth(), this.u.getIntrinsicHeight());
        }
        this.invalidate();
        this.requestLayout();
    }
    
    public void a(final boolean i) {
        this.I = i;
    }
    
    public void b() {
        this.setTimestampColor(this.k);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        if (this.i != null) {
            this.w = this.i.getColorForState(drawableState, 0);
        }
        if (this.j != null) {
            this.y = this.j.getColorForState(drawableState, 0);
        }
        if (this.l != null) {
            this.x = this.l.getColorForState(drawableState, 0);
        }
        if (this.t != null && this.t.isStateful()) {
            this.t.setState(drawableState);
        }
        if (this.u != null && this.u.isStateful()) {
            this.u.setState(drawableState);
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        int n = -1;
        int width = this.getWidth();
        int n2 = 0;
        int n3;
        int n6;
        int n7;
        if (this.z) {
            if (this.n != null) {
                n3 = width - this.n.getEllipsizedWidth();
                if (!this.I) {
                    width = n3 - this.h;
                }
            }
            else {
                n3 = n;
            }
            int n4;
            if (this.p != null) {
                n4 = width - this.p.getWidth();
            }
            else {
                n4 = n;
            }
            if (this.r != null) {
                if (this.t != null) {
                    final int n5 = this.r.getWidth() + this.h;
                    if (this.u != null) {
                        n = this.u.getBounds().width() + this.h;
                    }
                    n6 = n4;
                    n7 = n5;
                }
                else {
                    int n8;
                    if (this.u != null) {
                        n8 = this.r.getWidth() + this.h;
                    }
                    else {
                        n8 = n;
                    }
                    final int n9 = n8;
                    n6 = n4;
                    n7 = n;
                    n = n9;
                    n2 = 0;
                }
            }
            else {
                n2 = n;
                n6 = n4;
                n7 = n;
            }
        }
        else {
            if (this.p != null && !this.I) {
                n3 = 0 + (this.p.getWidth() + this.h);
            }
            else {
                n3 = 0;
            }
            if (this.r != null) {
                final int n10 = width - this.r.getWidth();
                if (this.t != null) {
                    n7 = -(this.h + this.t.getBounds().width());
                }
                else {
                    n7 = n;
                }
                if (this.u != null) {
                    n = -(this.h + this.u.getBounds().width());
                    n2 = n10;
                    n6 = 0;
                }
                else {
                    n2 = n10;
                    n6 = 0;
                }
            }
            else {
                n7 = n;
                n2 = n;
                n6 = 0;
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate((float)n6, (float)this.q);
            this.d.setTextSize(this.A);
            this.d.setTypeface(this.m.c);
            this.d.setColor(this.w);
            this.p.draw(canvas);
            canvas.restore();
            this.c.set(n6, this.q, n6 + this.p.getWidth(), this.q + this.p.getHeight());
        }
        this.d.setTypeface(this.m.a);
        if (this.n != null) {
            canvas.save();
            canvas.translate((float)n3, (float)this.o);
            this.d.setTextSize(this.B);
            if (this.H) {
                this.d.setColor(this.y);
            }
            else {
                this.d.setColor(this.x);
            }
            this.n.draw(canvas);
            canvas.restore();
            this.c.union(n3, this.o, n3 + this.n.getWidth(), this.o + this.n.getHeight());
        }
        if (this.r != null) {
            canvas.save();
            canvas.translate((float)n2, (float)this.s);
            this.d.setTextSize(this.C);
            this.d.setColor(this.y);
            this.r.draw(canvas);
            if (this.t != null) {
                canvas.translate((float)n7, (float)((this.r.getHeight() - this.t.getIntrinsicHeight()) / 2));
                this.t.draw(canvas);
            }
            if (this.u != null) {
                if (this.t != null) {
                    canvas.translate((float)n, (float)((this.t.getBounds().height() - this.u.getBounds().height()) / 2));
                }
                else {
                    canvas.translate((float)n, (float)((this.r.getHeight() - this.u.getBounds().height()) / 2));
                }
                this.u.draw(canvas);
            }
            canvas.restore();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        int n4;
        if (this.F != null && this.G) {
            if (this.r == null) {
                this.d.setTextSize(this.C);
                this.d.setTypeface(this.m.a);
                this.r = new StaticLayout((CharSequence)this.F, this.d, com.twitter.util.t.a(this.F, this.d), Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            int n3 = size - (this.r.getWidth() + this.h);
            this.d.getTextBounds(this.F, 0, this.F.length(), this.e);
            this.s = -b((Layout)this.r, this.e);
            if (this.t != null) {
                n3 -= this.t.getIntrinsicWidth() + this.h;
            }
            if (this.u != null) {
                n4 = n3 - (this.u.getIntrinsicWidth() + this.h);
            }
            else {
                n4 = n3;
            }
        }
        else {
            n4 = size;
        }
        int n5;
        int n6;
        if (this.D != null) {
            this.d.setTextSize(this.A);
            this.d.setTypeface(this.m.c);
            if (this.p == null) {
                this.p = new StaticLayout((CharSequence)this.D, 0, this.D.length(), this.d, com.twitter.util.t.a(this.D, this.d), Layout$Alignment.ALIGN_NORMAL, this.f, (float)this.g, false, TextUtils$TruncateAt.END, n4);
            }
            this.d.getTextBounds(this.D, 0, this.D.length(), this.e);
            n4 -= this.p.getWidth() + this.h;
            final int a = a(this.e);
            final int a2 = a((Layout)this.p, this.e);
            this.q = -b((Layout)this.p, this.e);
            n5 = a2;
            n6 = a;
        }
        else {
            this.q = 0;
            n5 = 0;
            n6 = 0;
        }
        if (this.I) {
            n4 = size;
        }
        int a4;
        if (this.E != null && n4 > 0) {
            this.d.setTextSize(this.B);
            this.d.setTypeface(this.m.a);
            if (this.n == null) {
                final int a3 = com.twitter.util.t.a(this.E, this.d);
                final String e = this.E;
                final int length = this.E.length();
                final TextPaint d = this.d;
                final Layout$Alignment align_NORMAL = Layout$Alignment.ALIGN_NORMAL;
                final TextUtils$TruncateAt end = TextUtils$TruncateAt.END;
                if (a3 <= n4) {
                    n4 = a3;
                }
                this.n = new StaticLayout((CharSequence)e, 0, length, d, a3, align_NORMAL, 1.0f, 0.0f, false, end, n4);
            }
            this.d.getTextBounds(this.E, 0, this.E.length(), this.e);
            a4 = a((Layout)this.n, this.e);
            final int b = b((Layout)this.n, this.e);
            final int a5 = a(this.e);
            if (this.I) {
                if (this.p != null) {
                    this.o = this.q + this.p.getHeight() - n5;
                }
                else {
                    this.o = -b;
                }
            }
            else {
                final int n7 = n6 - a5;
                this.o = -b;
                if (this.p != null) {
                    if (n7 > 0) {
                        this.o += n7;
                    }
                    else {
                        this.q -= n7;
                    }
                }
            }
        }
        else {
            this.o = 0;
            a4 = 0;
        }
        int n8;
        if (this.p == null) {
            n8 = 0;
        }
        else {
            n8 = this.q + this.p.getHeight() - n5;
        }
        int n9;
        if (this.n == null) {
            n9 = 0;
        }
        else {
            n9 = this.o + this.n.getHeight() - a4;
        }
        this.setMeasuredDimension(size, Math.max(Math.max(n8, n9), 0));
    }
    
    public void setOnAuthorClick(final View$OnClickListener a) {
        this.a = a;
        if (this.a == null) {
            this.b(this.v);
            return;
        }
        if (this.v == null) {
            (this.v = new ap(this, 2L, 1L, new y(this), TweetHeaderView.b)).a(this.c);
        }
        this.a(this.v);
    }
    
    public void setRenderRTL(final boolean z) {
        this.z = z;
    }
    
    public void setShowTimestamp(final boolean g) {
        this.G = g;
    }
    
    public void setTimestampBadgeColor(final int n) {
        if (this.u != null) {
            this.u.setColorFilter(n, PorterDuff$Mode.SRC_IN);
        }
    }
    
    public void setTimestampColor(final ColorStateList j) {
        this.j = j;
        this.refreshDrawableState();
    }
    
    public void setUseTimestampColorForUsername(final boolean h) {
        this.H = h;
    }
}
