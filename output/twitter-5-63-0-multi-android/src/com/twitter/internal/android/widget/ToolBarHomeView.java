// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.Locale;
import android.graphics.Color;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import com.twitter.android.util.p;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import com.twitter.ui.widget.ag;
import com.twitter.util.t;
import android.content.res.TypedArray;
import com.twitter.util.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Point;
import android.text.StaticLayout;
import android.graphics.Typeface;
import android.content.res.ColorStateList;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;

class ToolBarHomeView extends View
{
    private static final TextPaint a;
    private static final int[] b;
    private Drawable A;
    private ValueAnimator B;
    private ValueAnimator C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private int O;
    private int P;
    private final int c;
    private final int d;
    private final int e;
    private float f;
    private float g;
    private ColorStateList h;
    private ColorStateList i;
    private Typeface j;
    private Typeface k;
    private StaticLayout l;
    private CharSequence m;
    private StaticLayout n;
    private CharSequence o;
    private int p;
    private int q;
    private int r;
    private int s;
    private Point t;
    private Point u;
    private Drawable v;
    private Drawable w;
    private CharSequence x;
    private CharSequence y;
    private ah z;
    
    static {
        a = new TextPaint(1);
        b = new int[] { kv.state_collapsed };
    }
    
    public ToolBarHomeView(final Context context) {
        this(context, null);
    }
    
    public ToolBarHomeView(final Context context, final AttributeSet set) {
        this(context, set, kv.toolBarHomeStyle);
    }
    
    public ToolBarHomeView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.t = new Point();
        this.u = new Point();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.ToolBarHomeView, n, 0);
        this.a(obtainStyledAttributes);
        this.d = obtainStyledAttributes.getResourceId(li.ToolBarHomeView_numberBackground, 0);
        this.e = obtainStyledAttributes.getColor(li.ToolBarHomeView_numberColor, -16777216);
        this.c = (int)Math.ceil(5.0f * context.getResources().getDisplayMetrics().density);
        this.D = true;
        this.E = true;
        this.F = true;
        this.y = obtainStyledAttributes.getString(li.ToolBarHomeView_upIndicatorDescription);
        if (this.y == null) {
            this.y = "";
        }
        com.twitter.util.a.a(this, 1);
        obtainStyledAttributes.recycle();
    }
    
    private int a(final Drawable drawable, final int n) {
        final int intrinsicHeight = drawable.getIntrinsicHeight();
        final int a = com.twitter.util.t.a(intrinsicHeight, this.getMeasuredHeight());
        final int intrinsicWidth = drawable.getIntrinsicWidth();
        drawable.setBounds(n, a, n + intrinsicWidth, intrinsicHeight + a);
        this.invalidateDrawable(drawable);
        return intrinsicWidth;
    }
    
    private void a(final int n, final int n2) {
        if (this.C == null || !this.C.isRunning()) {
            this.b(n, n2);
            this.C.start();
        }
    }
    
    private void a(final TypedArray typedArray) {
        this.f = typedArray.getDimension(li.ToolBarHomeView_textSize, 16.0f);
        this.g = typedArray.getDimension(li.ToolBarHomeView_subtitleTextSize, 30.0f);
        this.h = typedArray.getColorStateList(li.ToolBarHomeView_textColor);
        this.i = typedArray.getColorStateList(li.ToolBarHomeView_subtitleTextColor);
        final int int1 = typedArray.getInt(li.ToolBarHomeView_titleTextStyle, 1);
        final int int2 = typedArray.getInt(li.ToolBarHomeView_subtitleTextStyle, 0);
        this.H = typedArray.getBoolean(li.ToolBarHomeView_allCaps, false);
        if (this.h != null) {
            this.d();
        }
        else {
            this.p = -16777216;
            this.r = this.p;
        }
        if (this.i != null) {
            this.e();
        }
        else {
            this.q = -16777216;
            this.s = this.q;
        }
        final Context context = this.getContext();
        this.j = ag.a(context).b(int1);
        this.k = ag.a(context).b(int2);
    }
    
    private void a(final boolean i, final int n) {
        if (this.B == null) {
            (this.B = new ValueAnimator()).setDuration(350L);
            this.B.addListener((Animator$AnimatorListener)new au(this));
            this.B.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new av(this));
        }
        else if (this.B.isRunning()) {
            this.B.cancel();
        }
        this.J = true;
        if (i) {
            this.B.setIntValues(new int[] { n, 0 });
        }
        else {
            this.B.setIntValues(new int[] { n, this.h() });
        }
        this.r = com.twitter.android.util.p.a(this.p, n);
        this.s = com.twitter.android.util.p.a(this.q, n);
        this.I = i;
    }
    
    private void b(final int n, final int n2) {
        int n3 = 1;
        if (this.C == null) {
            (this.C = new ValueAnimator()).setDuration(250L);
            this.C.addListener((Animator$AnimatorListener)new aw(this));
            this.C.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ax(this));
        }
        else if (this.C.isRunning()) {
            this.C.cancel();
        }
        this.L = (n3 != 0);
        final ValueAnimator c = this.C;
        final int[] intValues = { n, 0 };
        intValues[n3] = n2;
        c.setIntValues(intValues);
        if (n2 <= n) {
            n3 = 0;
        }
        this.M = (n3 != 0);
    }
    
    private void c(final int n) {
        final int n2 = this.f() - n;
        final CharSequence m = this.m;
        final TextPaint a = ToolBarHomeView.a;
        a.setTextSize(this.f);
        a.setTypeface(this.j);
        this.l = new StaticLayout(m, 0, m.length(), a, com.twitter.util.t.a(m, a), Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils$TruncateAt.END, n2);
        if (this.K) {
            this.i();
            this.K = false;
        }
    }
    
    private void d() {
        final int colorForState = this.h.getColorForState(this.getDrawableState(), 0);
        if (colorForState != this.p) {
            this.p = colorForState;
            this.r = colorForState;
            this.invalidate();
        }
    }
    
    private void e() {
        final int colorForState = this.i.getColorForState(this.getDrawableState(), 0);
        if (colorForState != this.q) {
            this.q = colorForState;
            this.s = colorForState;
            this.invalidate();
        }
    }
    
    private int f() {
        return this.getContext().getResources().getDisplayMetrics().widthPixels - this.g() - this.v.getIntrinsicWidth();
    }
    
    private int g() {
        final boolean d = this.D;
        int n = 0;
        if (d) {
            final Drawable a = this.A;
            n = 0;
            if (a != null) {
                n = 0 + this.A.getIntrinsicWidth();
            }
        }
        if (this.F && this.v != null) {
            n += this.v.getIntrinsicWidth();
        }
        return n;
    }
    
    private int h() {
        return Color.alpha(this.p);
    }
    
    private void i() {
        if (!this.B.isRunning()) {
            this.B.start();
        }
    }
    
    private void j() {
        this.B.cancel();
    }
    
    private void k() {
        this.C.cancel();
    }
    
    public CharSequence a() {
        return this.o;
    }
    
    public void a(final int n) {
        if (this.l != null) {
            this.c(n);
        }
    }
    
    public void a(final Context context, final int n) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, li.ToolBarHomeView);
        this.a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    public void a(final Drawable drawable) {
        if (drawable != this.v) {
            this.w = drawable;
            this.v = drawable;
            this.O = 0;
            this.requestLayout();
        }
    }
    
    public void a(final CharSequence m) {
        int n = 1;
        if (this.J) {
            this.j();
        }
        if (m == null) {
            if (this.l == null) {
                n = 0;
            }
            this.l = null;
            this.m = null;
        }
        else if (this.l == null || !m.equals(this.l.getText())) {
            if (this.H) {
                this.m = m.toString().toUpperCase(Locale.ENGLISH);
            }
            else {
                this.m = m;
            }
            this.l = null;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.requestLayout();
        }
    }
    
    public void a(final CharSequence m, final boolean b) {
        if (!b) {
            this.a(m);
        }
        else {
            if (m == null && this.l != null) {
                this.a(true, Color.alpha(this.r));
                this.B.start();
                return;
            }
            if (m == null) {
                this.l = null;
                this.m = null;
                return;
            }
            if (this.l == null || !m.equals(this.l.getText())) {
                if (this.H) {
                    this.m = m.toString().toUpperCase(Locale.ENGLISH);
                }
                else {
                    this.m = m;
                }
                int alpha;
                if (this.J) {
                    alpha = Color.alpha(this.r);
                }
                else {
                    alpha = 0;
                }
                this.l = null;
                this.a(false, alpha);
                this.K = true;
                this.requestLayout();
            }
        }
    }
    
    public void a(final boolean d) {
        if (d == this.D) {
            return;
        }
        this.setClickable(this.D = d);
        this.requestLayout();
    }
    
    public CharSequence b() {
        return this.m;
    }
    
    public void b(final int o) {
        if (o != this.O) {
            if (o > 0) {
                final Context context = this.getContext();
                String value;
                if (o < 100) {
                    value = String.valueOf(o);
                }
                else {
                    value = "99+";
                }
                if (this.z == null) {
                    (this.z = new ah(context)).a(this.e);
                    if (this.d != 0) {
                        this.z.a(context.getResources().getDrawable(this.d));
                    }
                }
                this.z.a(context, value);
                this.v = this.z;
            }
            else {
                this.v = this.w;
            }
            this.O = o;
            this.requestLayout();
        }
    }
    
    public void b(final Drawable a) {
        if (a != this.A) {
            this.A = a;
            this.requestLayout();
        }
    }
    
    public void b(final CharSequence o) {
        int n = 1;
        if (this.L) {
            this.k();
        }
        if (o == null) {
            if (this.n == null) {
                n = 0;
            }
            this.n = null;
            this.o = null;
        }
        else if (this.n == null || !o.equals(this.n.getText())) {
            if (this.H) {
                this.o = o.toString().toUpperCase(Locale.ENGLISH);
            }
            else {
                this.o = o;
            }
            this.n = null;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.requestLayout();
        }
    }
    
    public void b(final CharSequence o, final boolean b) {
        boolean n = true;
        if (!b) {
            this.b(o);
        }
        else {
            if (o == null && this.n != null && this.l != null) {
                this.b(0, com.twitter.util.t.a(this.l.getHeight(), this.getBottom() - this.getTop()) - this.t.y);
                this.C.start();
                return;
            }
            if (o == null) {
                if (this.n == null) {
                    n = false;
                }
                this.n = null;
                this.o = null;
                if (n) {
                    this.requestLayout();
                }
            }
            else if (this.n == null || !o.equals(this.n.getText())) {
                if (this.o != null) {
                    n = false;
                }
                if (this.H) {
                    this.o = o.toString().toUpperCase(Locale.ENGLISH);
                }
                else {
                    this.o = o;
                }
                this.n = null;
                this.N = n;
                this.M = false;
                this.requestLayout();
            }
        }
    }
    
    public void b(final boolean e) {
        if (e == this.E) {
            return;
        }
        this.E = e;
        this.requestLayout();
    }
    
    public void c(final CharSequence x) {
        this.x = x;
    }
    
    public void c(final boolean f) {
        if (f == this.F) {
            return;
        }
        this.F = f;
        this.requestLayout();
    }
    
    public boolean c() {
        return this.G;
    }
    
    public void d(final boolean g) {
        if (this.G == g) {
            return;
        }
        this.G = g;
        this.refreshDrawableState();
        this.requestLayout();
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.h != null && this.h.isStateful()) {
            this.d();
        }
        if (this.i != null && this.i.isStateful()) {
            this.e();
        }
        final int[] drawableState = this.getDrawableState();
        if (this.v.isStateful()) {
            this.v.setState(drawableState);
        }
        if (this.A.isStateful()) {
            this.A.setState(drawableState);
        }
    }
    
    public CharSequence getContentDescription() {
        CharSequence charSequence = super.getContentDescription();
        if (TextUtils.isEmpty(charSequence)) {
            CharSequence charSequence2;
            if (!TextUtils.isEmpty(this.x)) {
                charSequence2 = this.x;
            }
            else {
                final boolean empty = TextUtils.isEmpty(this.m);
                charSequence2 = null;
                if (!empty) {
                    charSequence2 = this.m;
                }
            }
            CharSequence y;
            if (this.D) {
                y = this.y;
            }
            else {
                y = "";
            }
            if (!TextUtils.isEmpty(charSequence2)) {
                charSequence = "" + (Object)charSequence2;
            }
            else {
                charSequence = "";
            }
            if (!TextUtils.isEmpty(y)) {
                if (!TextUtils.isEmpty(charSequence)) {
                    charSequence = (String)charSequence + ". ";
                }
                return (String)charSequence + (Object)y;
            }
        }
        return charSequence;
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.G) {
            mergeDrawableStates(onCreateDrawableState, ToolBarHomeView.b);
        }
        return onCreateDrawableState;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final TextPaint a = ToolBarHomeView.a;
        if (this.D && this.A != null) {
            this.A.draw(canvas);
        }
        if (this.F && this.v != null) {
            this.v.draw(canvas);
        }
        if (!this.G && this.E && this.l != null) {
            a.setTextSize(this.f);
            int color;
            if (this.J) {
                color = this.r;
            }
            else {
                color = this.p;
            }
            a.setColor(color);
            a.setTypeface(this.j);
            final int save = canvas.save(1);
            int p;
            if (this.L) {
                p = this.P;
            }
            else {
                p = 0;
            }
            canvas.translate((float)this.t.x, (float)(p + this.t.y));
            this.l.draw(canvas);
            if (this.n != null) {
                a.setTextSize(this.g);
                int color2;
                if (this.J) {
                    color2 = this.s;
                }
                else {
                    color2 = this.q;
                }
                a.setColor(color2);
                a.setTypeface(this.k);
                canvas.translate((float)this.u.x, (float)(p + this.u.y));
                this.n.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n4 - n2;
        int paddingLeft = this.getPaddingLeft();
        if (this.D && this.A != null) {
            paddingLeft += this.a(this.A, paddingLeft);
        }
        if (this.F && this.v != null) {
            paddingLeft += this.a(this.v, paddingLeft);
        }
        if (!this.G && this.E && this.l != null) {
            if (this.n == null) {
                this.t.set(paddingLeft + this.c, com.twitter.util.t.a(this.l.getHeight(), n5));
                return;
            }
            final int n6 = paddingLeft + this.c;
            final int y = this.t.y;
            this.t.set(n6, com.twitter.util.t.a(this.l.getHeight() + this.n.getHeight(), n5));
            this.u.set(0, this.l.getHeight());
            if (this.N) {
                final int n7 = y - this.t.y;
                if (n7 > 0) {
                    this.a(n7, 0);
                }
                this.N = false;
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int defaultSize = getDefaultSize(this.getSuggestedMinimumHeight(), n2);
        final int g = this.g();
        final int f = this.f();
        if (this.E && (this.l == null || this.n == null)) {
            if (this.l == null && this.m != null) {
                this.c(0);
            }
            if (this.n == null && this.o != null) {
                final CharSequence o = this.o;
                final TextPaint a = ToolBarHomeView.a;
                a.setTextSize(this.g);
                a.setTypeface(this.k);
                this.n = new StaticLayout(o, 0, o.length(), a, com.twitter.util.t.a(o, a), Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils$TruncateAt.END, f);
            }
        }
        int n3;
        if (!this.G && this.E && this.l != null) {
            if (this.n != null) {
                n3 = g + (this.c + Math.max(this.l.getWidth(), this.n.getWidth()));
            }
            else {
                n3 = g + (this.c + this.l.getWidth());
            }
        }
        else {
            n3 = g;
        }
        if (n3 > 0) {
            n3 += this.getPaddingLeft() + this.getPaddingRight();
        }
        this.setMeasuredDimension(n3, defaultSize);
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return this.v == drawable || this.A == drawable || super.verifyDrawable(drawable);
    }
}
