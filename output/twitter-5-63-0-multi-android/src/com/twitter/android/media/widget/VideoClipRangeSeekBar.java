// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import com.twitter.library.view.x;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.view.TickMarksView;
import android.view.View;
import com.twitter.library.widget.am;
import android.widget.ProgressBar;
import android.view.animation.Animation;
import android.widget.FrameLayout;

public class VideoClipRangeSeekBar extends FrameLayout
{
    private int A;
    private boolean B;
    private long C;
    private boolean D;
    private final int a;
    private final Animation b;
    private float c;
    private float d;
    private float e;
    private float f;
    private int g;
    private int h;
    private ProgressBar i;
    private am j;
    private am k;
    private View l;
    private TickMarksView m;
    private int n;
    private ap o;
    private ap p;
    private ap q;
    private ap r;
    private aq s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private float x;
    private float y;
    private int z;
    
    public VideoClipRangeSeekBar(final Context context) {
        this(context, null, 0);
    }
    
    public VideoClipRangeSeekBar(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public VideoClipRangeSeekBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.v = false;
        this.x = 0.0f;
        this.y = 1.0f;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        (this.b = AnimationUtils.loadAnimation(context, 2131034153)).setAnimationListener((Animation$AnimationListener)new ak(this));
    }
    
    private void a(final boolean b) {
        if (this.s != null) {
            this.s.a(this.c, this.d, b);
        }
    }
    
    private ap b(final int n, final int n2) {
        if (this.o.a(n, n2)) {
            return this.o;
        }
        if (this.p.a(n, n2)) {
            return this.p;
        }
        if (this.q.a(n, n2)) {
            return this.q;
        }
        return null;
    }
    
    private void b(final boolean b) {
        if (this.s != null) {
            this.s.b(this.c, this.d, b);
        }
    }
    
    private void j() {
        if (this.s != null) {
            this.s.a();
        }
    }
    
    public void a(final float f, final float e) {
        this.f = f;
        this.e = e;
    }
    
    public void a(final int n) {
        this.i.setProgress(Math.max(this.i.getProgress(), n - this.n));
    }
    
    void a(final int n, final int n2) {
        final ProgressBar i = this.i;
        final int measuredWidth = i.getMeasuredWidth();
        final boolean b = this.v || measuredWidth > this.g;
        this.j.a(3, b);
        final am j = this.j;
        boolean b2 = false;
        Label_0075: {
            if (b) {
                final int n3 = this.g + this.h;
                b2 = false;
                if (measuredWidth < n3) {
                    break Label_0075;
                }
            }
            b2 = true;
        }
        j.a(4, b2);
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        int min = Math.min(paddingLeft + (int)((n2 - n - paddingLeft - paddingRight) / (this.y - this.x) * (this.c - this.x)), n2 - paddingRight - measuredWidth);
        final int n4 = min + measuredWidth;
        i.layout(min, i.getTop(), n4, i.getBottom());
        final View l = this.l;
        if (l.getVisibility() == 0) {
            final int width = l.getWidth();
            if (this.r != this.p) {
                min = n4 - width;
            }
            l.layout(min, l.getTop(), min + width, l.getBottom());
        }
    }
    
    public void a(final int n, final int n2, final int n3) {
        this.n = n;
        this.i.setMax(n2 - n);
        this.i.setProgress(n3 - n);
        this.f();
    }
    
    public void a(final int w, final x[] tickMarks, final boolean b) {
        this.w = w;
        this.u = (this.w > 60000);
        this.m.setTickMarks(tickMarks);
        this.m.a(0, w);
        final TickMarksView m = this.m;
        int n;
        if (b) {
            n = 3;
        }
        else {
            n = 2;
        }
        m.a(n);
    }
    
    public boolean a() {
        return this.u;
    }
    
    public void b() {
        this.d();
    }
    
    public void b(final float c, final float d) {
        this.c = c;
        this.d = d;
        this.requestLayout();
    }
    
    void c() {
        final int max = Math.max((int)((this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight()) * (this.d - this.c) / (this.y - this.x)), this.g);
        this.t = (this.v || !this.u || max > this.g);
        this.i.measure(View$MeasureSpec.makeMeasureSpec(max, 1073741824), View$MeasureSpec.makeMeasureSpec(this.i.getMeasuredHeight(), 1073741824));
    }
    
    void d() {
        this.j.a(0, true);
        this.j.a(1, false);
        this.j.a(2, false);
    }
    
    void e() {
        this.j.a(0, false);
        this.j.a(1, true);
        this.j.a(2, false);
    }
    
    void f() {
        this.j.a(0, true);
        this.j.a(1, false);
        this.j.a(2, true);
    }
    
    void g() {
        this.D = true;
        this.l.setVisibility(0);
        this.l.startAnimation(this.b);
    }
    
    public void h() {
        if (this.v) {
            this.v = false;
            this.D = true;
            this.startAnimation((Animation)new ar(this, this.x, this.y, 0.0f, 1.0f));
        }
        else if (this.w > 60000) {
            this.v = true;
            final float n = this.d + this.c;
            float n2 = (n - 60000.0f / this.w) / 2.0f;
            float n3 = n - n2;
            if (n2 < 0.0f) {
                n3 -= n2;
                n2 = 0.0f;
            }
            else if (n3 > 1.0f) {
                n2 -= n3 - 1.0f;
                n3 = 1.0f;
            }
            this.D = true;
            this.startAnimation((Animation)new ar(this, 0.0f, 1.0f, n2, n3));
        }
    }
    
    boolean i() {
        if (this.v && this.B) {
            final long currentTimeMillis = System.currentTimeMillis();
            final float n = 30.0f * (currentTimeMillis - this.C) / this.w;
            this.C = currentTimeMillis;
            float min;
            if (this.c == this.x && this.x > 0.0f) {
                min = -Math.min(this.x, n);
            }
            else {
                if (this.d != this.y || this.y >= 1.0f) {
                    return false;
                }
                min = Math.min(1.0f - this.y, n);
            }
            this.x += min;
            this.y += min;
            this.c += min;
            this.d += min;
            this.m.a((int)(this.x * this.w), (int)(this.y * this.w));
            this.a(true);
            return true;
        }
        return false;
    }
    
    protected void onFinishInflate() {
        this.z = this.getPaddingLeft();
        this.A = this.getPaddingRight();
        final am am = new am(this.getContext(), 2130837574);
        (this.j = am).a(1, false);
        am.a(2, false);
        this.h = am.getDrawable(4).getIntrinsicWidth();
        final ProgressBar i = (ProgressBar)this.findViewById(2131886770);
        (this.i = i).setProgressDrawable((Drawable)am);
        final View viewById = this.findViewById(2131886771);
        this.l = viewById;
        final int width = viewById.getLayoutParams().width;
        final int n = (int)(0.75f * width);
        this.g = width * 2;
        final am am2 = new am(this.getContext(), 2130837575);
        am2.a(1, false);
        this.k = am2;
        final TickMarksView m = (TickMarksView)this.findViewById(2131886769);
        m.setBackgroundDrawable((Drawable)am2);
        this.m = m;
        this.o = new al(this, i, width);
        this.p = new an(this, i, width, n);
        this.q = new ao(this, i, width, n);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.a(n, n3);
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.c();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int n = (int)motionEvent.getX();
        final int n2 = (int)motionEvent.getY();
        switch (motionEvent.getActionMasked()) {
            case 0: {
                final boolean enabled = this.isEnabled();
                final boolean b = false;
                if (!enabled) {
                    return b;
                }
                if (this.D) {
                    break;
                }
                this.B = true;
                this.r = this.b(n, n2);
                if (this.r != null) {
                    this.r.b(n, n2);
                    this.j();
                    break;
                }
                break;
            }
            case 2: {
                if (!this.D && this.r != null && this.r.c(n, n2)) {
                    final boolean d = this.r.d();
                    boolean b2 = false;
                    if (!d) {
                        b2 = true;
                    }
                    this.a(b2);
                    break;
                }
                break;
            }
            case 1:
            case 3: {
                this.B = false;
                if (this.r != null) {
                    this.r.c();
                    final boolean d2 = this.r.d();
                    boolean b3 = false;
                    if (!d2) {
                        b3 = true;
                    }
                    this.r = null;
                    this.b(b3);
                    break;
                }
                break;
            }
        }
        return true;
    }
    
    public void setVideoTrimBarListener(final aq s) {
        this.s = s;
    }
}
