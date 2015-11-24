// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.MotionEvent;
import android.graphics.Color;
import com.twitter.library.util.b;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.content.Context;
import com.twitter.android.av.ae;
import android.view.View;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.View$OnTouchListener;
import android.widget.RelativeLayout;

public class ExpandableViewHost extends RelativeLayout implements View$OnTouchListener
{
    final Interpolator a;
    final Interpolator b;
    final Interpolator c;
    final Interpolator d;
    int e;
    private final PointF f;
    private bw g;
    private View h;
    private View i;
    private int j;
    private int k;
    private int l;
    private by m;
    private ae n;
    
    public ExpandableViewHost(final Context context) {
        super(context);
        this.a = (Interpolator)new xo(1.5f);
        this.b = (Interpolator)new xo(1.125f);
        this.c = (Interpolator)new DecelerateInterpolator();
        this.d = this.c;
        this.f = new PointF();
        this.a(context, null, 0);
    }
    
    public ExpandableViewHost(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = (Interpolator)new xo(1.5f);
        this.b = (Interpolator)new xo(1.125f);
        this.c = (Interpolator)new DecelerateInterpolator();
        this.d = this.c;
        this.f = new PointF();
        this.a(context, set, 0);
    }
    
    public ExpandableViewHost(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = (Interpolator)new xo(1.5f);
        this.b = (Interpolator)new xo(1.125f);
        this.c = (Interpolator)new DecelerateInterpolator();
        this.d = this.c;
        this.f = new PointF();
        this.a(context, set, n);
    }
    
    private void a(final Context context, final AttributeSet set, final int n) {
        Label_0084: {
            if (set == null) {
                break Label_0084;
            }
            TypedArray obtainStyledAttributes = null;
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, pa.ExpandableViewHost, n, 0);
                this.j = obtainStyledAttributes.getResourceId(2, 0);
                this.k = obtainStyledAttributes.getResourceId(0, 0);
                this.l = obtainStyledAttributes.getResourceId(1, 0);
                this.e = obtainStyledAttributes.getColor(3, this.getResources().getColor(2131689555));
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                this.n = new ae(this.a, this.b, 699, 499);
            }
            finally {
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
            }
        }
    }
    
    public void a() {
        this.setBackgroundColor(this.e);
    }
    
    public void a(final PointF pointF, final PointF pointF2, final Runnable runnable) {
        if (pointF == null || pointF2 == null) {
            if (runnable != null) {
                runnable.run();
            }
        }
        else {
            final View contentView = this.g.getContentView();
            this.n.b(this.g, pointF);
            final PointF pointF3 = new PointF();
            pointF3.x = pointF2.x - contentView.getLeft();
            pointF3.y = pointF2.y - contentView.getTop();
            com.twitter.library.util.b.b(contentView, pointF3.x, pointF3.y, 499, this.b);
            if (this.i != null) {
                com.twitter.library.util.b.b(this.i, 0.0f, this.i.getHeight(), 266, this.c);
            }
            com.twitter.library.util.b.a((View)this, this.e, 0, 266, this.d);
            if (runnable != null) {
                this.postDelayed(runnable, (long)(66 + Math.max(266, 499)));
            }
        }
    }
    
    public void a(final Runnable runnable) {
        final View contentView = this.g.getContentView();
        com.twitter.library.util.b.b(contentView, 0.0f, 1.3f * -contentView.getHeight(), 399, this.c);
        com.twitter.library.util.b.a(contentView, -5.0f, 399, this.c);
        if (this.i != null) {
            com.twitter.library.util.b.b(this.i, 0.0f, this.i.getHeight(), 266, this.c);
        }
        this.postDelayed((Runnable)new bx(this, runnable), 399L);
    }
    
    public void b(final PointF pointF, final PointF pointF2, final Runnable runnable) {
        if (runnable != null) {
            this.post(runnable);
        }
        if (pointF == null || pointF2 == null) {
            return;
        }
        this.n.c(this.g, pointF);
        final View contentView = this.g.getContentView();
        final PointF pointF3 = new PointF();
        pointF3.x = pointF2.x - contentView.getLeft();
        pointF3.y = pointF2.y - contentView.getTop();
        com.twitter.library.util.b.b(contentView, pointF3.x, pointF3.y, 699, this.a);
        if (this.i != null) {
            com.twitter.library.util.b.b(this.i, 0.0f, 0.0f, 266, this.c);
        }
        final int backgroundColor = 0xFFFFFF & this.e;
        this.setBackgroundColor(backgroundColor);
        com.twitter.library.util.b.a((View)this, backgroundColor, Color.alpha(this.e), 266, 199, this.d);
    }
    
    public void b(final Runnable runnable) {
        final View contentView = this.g.getContentView();
        this.b(new PointF((float)contentView.getWidth(), (float)contentView.getHeight()), new PointF((float)contentView.getLeft(), (float)contentView.getTop()), runnable);
    }
    
    public void c(final PointF pointF, final PointF pointF2, final Runnable runnable) {
        if (pointF == null || pointF2 == null) {
            if (runnable != null) {
                this.post(runnable);
            }
            return;
        }
        if (this.i != null) {
            this.i.setTranslationY((float)this.i.getHeight());
        }
        final View contentView = this.g.getContentView();
        final float translationX = pointF.x - contentView.getLeft();
        final float translationY = pointF.y - contentView.getTop();
        contentView.setTranslationX(translationX);
        contentView.setTranslationY(translationY);
        this.n.a(this.g, pointF2);
        this.b(runnable);
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.j != 0) {
            this.h = this.findViewById(this.j);
            if (this.h != null) {
                this.h.setOnTouchListener((View$OnTouchListener)this);
            }
        }
        if (this.l != 0) {
            this.i = this.findViewById(this.l);
        }
        if (this.k != 0) {
            this.g = (bw)this.findViewById(this.k);
        }
        if (this.g == null) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " requires an " + "expandableView child. Its id can be specified in the expandableViewId attr.");
        }
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final float translationY = motionEvent.getRawY() - this.f.y;
        switch (motionEvent.getAction()) {
            case 0: {
                this.f.set(motionEvent.getRawX(), motionEvent.getRawY());
                break;
            }
            case 2: {
                this.g.getContentView().setTranslationY(translationY);
                this.i.setTranslationY(Math.max(0.0f, translationY));
                break;
            }
            case 1:
            case 3: {
                final float n = 0.225f * this.getHeight();
                if (this.m == null || Math.abs(translationY) < n) {
                    com.twitter.library.util.b.b(this.g.getContentView(), 0.0f, 0.0f, 699, this.a);
                    com.twitter.library.util.b.b(this.i, 0.0f, 0.0f, 699, this.a);
                    break;
                }
                if (translationY < 0.0f) {
                    this.m.a(this);
                    break;
                }
                this.m.b(this);
                break;
            }
        }
        return true;
    }
    
    public void setListener(final by m) {
        this.m = m;
    }
}
