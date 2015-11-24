// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.os.Parcelable;
import java.util.Arrays;
import android.animation.AnimatorSet;
import com.twitter.util.t;
import android.view.LayoutInflater;
import com.twitter.eventreporter.b;
import com.twitter.eventreporter.EventReporter;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.graphics.Paint;
import java.util.Iterator;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.Animator;
import java.util.List;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.View$OnClickListener;
import android.view.ViewGroup;

public class FloatingActionButtonLayout extends ViewGroup implements View$OnClickListener
{
    private static final Interpolator a;
    private static final Interpolator b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;
    private List o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private be t;
    private Animator u;
    
    static {
        a = (Interpolator)new DecelerateInterpolator(2.0f);
        b = (Interpolator)new LinearInterpolator();
    }
    
    public FloatingActionButtonLayout(final Context context) {
        this(context, null);
    }
    
    public FloatingActionButtonLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public FloatingActionButtonLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.p = true;
        this.q = true;
        final Resources resources = this.getResources();
        this.c = resources.getDimensionPixelSize(2131558593);
        this.d = resources.getDimensionPixelSize(2131558598);
        this.e = resources.getDimensionPixelSize(2131558591);
        this.f = (resources.getDimensionPixelOffset(2131558592) - this.d) / 2;
    }
    
    private static Animator a(final View view, final long duration, final long startDelay) {
        final ObjectAnimator setDuration = ObjectAnimator.ofFloat((Object)view, "translationY", new float[] { 0.0f, 1.0f }).setDuration(duration);
        ((Animator)setDuration).setStartDelay(startDelay);
        ((Animator)setDuration).setInterpolator((TimeInterpolator)FloatingActionButtonLayout.a);
        return (Animator)setDuration;
    }
    
    private void a(final View view, final View view2, final int n) {
        view.setOnClickListener((View$OnClickListener)this);
        view.setTag(2131886116, (Object)n);
        view2.setOnClickListener((View$OnClickListener)this);
        view2.setTag(2131886116, (Object)n);
    }
    
    private static Animator b(final View view, final long duration, final long startDelay) {
        final ObjectAnimator setDuration = ObjectAnimator.ofFloat((Object)view, "alpha", new float[] { 0.0f, 1.0f }).setDuration(duration);
        ((Animator)setDuration).setStartDelay(startDelay);
        ((Animator)setDuration).setInterpolator((TimeInterpolator)FloatingActionButtonLayout.b);
        return (Animator)setDuration;
    }
    
    public void a(final boolean p) {
        if (this.p != p) {
            this.p = p;
            this.b();
            final View j = this.j;
            int visibility;
            if (p) {
                visibility = 0;
            }
            else {
                visibility = 4;
            }
            j.setVisibility(visibility);
            final View k = this.k;
            int id = 0;
            if (p) {
                id = 2131886755;
            }
            k.setId(id);
        }
    }
    
    void a(final boolean clickable, final boolean b) {
        float alpha = 1.0f;
        int visibility;
        if (clickable) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        float alpha2;
        if (b) {
            alpha2 = alpha;
        }
        else {
            alpha2 = 0.0f;
        }
        for (final View view : this.o) {
            view.setVisibility(visibility);
            view.setAlpha(alpha2);
            if (!b) {
                view.setTranslationY(0.0f);
            }
        }
        final View g = this.g;
        if (b) {
            alpha = 0.04f;
        }
        g.setAlpha(alpha);
        this.h.setClickable(clickable);
    }
    
    public boolean a() {
        return this.s;
    }
    
    public void b() {
        this.s = false;
        this.requestLayout();
        this.u.cancel();
        this.a(false, false);
        this.g.setLayerType(0, (Paint)null);
    }
    
    public void b(final boolean b) {
        if (this.p && !this.s) {
            this.s = true;
            this.requestLayout();
            final Animator u = this.u;
            u.cancel();
            if (!b) {
                this.a(true, true);
                return;
            }
            this.g.setLayerType(2, (Paint)null);
            this.g.buildLayer();
            u.setupStartValues();
            this.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new bd(this, u));
        }
    }
    
    public void onClick(final View view) {
        final long g = az.a((Context)null).b().g();
        if (this.r && !this.s && view.getId() == 2131886755) {
            EventReporter.a(new TwitterScribeLog(g).b("", "", "fab", "", "expand"));
            this.b(true);
            return;
        }
        while (true) {
            Label_0180: {
                if (this.t == null) {
                    break Label_0180;
                }
                final Object tag = view.getTag(2131886116);
                if (!(tag instanceof Integer)) {
                    break Label_0180;
                }
                this.t.a((int)tag);
                final int n = 1;
                if (n == 0) {
                    EventReporter.a(new TwitterScribeLog(g).b("", "", "fab", "", "cancel"));
                }
                this.b();
                return;
            }
            final int n = 0;
            continue;
        }
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.getChildCount() != 1) {
            throw new IllegalStateException("A FloatingActionButtonLayout can only contain one child.");
        }
        this.g = this.getChildAt(0);
        LayoutInflater.from(this.getContext()).inflate(2130968767, (ViewGroup)this);
        (this.h = this.findViewById(2131886743)).setOnClickListener((View$OnClickListener)this);
        com.twitter.util.t.c(this.i = this.findViewById(2131886742));
        this.addView(this.i, 0);
        this.j = this.h.findViewById(2131886753);
        this.k = this.j.findViewById(2131886755);
        this.a(this.j, this.k, 1);
        this.l = this.h.findViewById(2131886750);
        final View viewById = this.l.findViewById(2131886752);
        this.a(this.l, viewById, 2);
        this.m = this.h.findViewById(2131886747);
        final View viewById2 = this.m.findViewById(2131886749);
        this.a(this.m, viewById2, 3);
        this.n = this.h.findViewById(2131886744);
        final View viewById3 = this.n.findViewById(2131886746);
        this.a(this.n, viewById3, 4);
        final Animator a = a(this.n, 330L, 0L);
        final Animator a2 = a(this.m, 330L, 50L);
        final Animator a3 = a(this.l, 330L, 100L);
        final Animator b = b(viewById3, 80L, 10L);
        final View viewById4 = this.n.findViewById(2131886745);
        final Animator b2 = b(viewById4, 80L, 20L);
        final Animator b3 = b(viewById2, 80L, 80L);
        final View viewById5 = this.m.findViewById(2131886748);
        final Animator b4 = b(viewById5, 80L, 110L);
        final Animator b5 = b(viewById, 80L, 150L);
        final View viewById6 = this.l.findViewById(2131886751);
        final Animator b6 = b(viewById6, 80L, 200L);
        final View viewById7 = this.j.findViewById(2131886754);
        final Animator b7 = b(viewById7, 20L, 0L);
        final Animator b8 = b(this.g, 80L, 0L);
        final Animator b9 = b(this.i, 80L, 0L);
        final AnimatorSet u = new AnimatorSet();
        u.playTogether(new Animator[] { a, b, b2, a2, b3, b4, a3, b5, b6, b7, b8, b9 });
        this.u = (Animator)u;
        this.o = Arrays.asList(viewById3, viewById4, viewById2, viewById5, viewById, viewById6, viewById7, this.i);
        this.b();
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        this.g.layout(0, 0, measuredWidth, measuredHeight);
        this.h.layout(0, 0, measuredWidth, measuredHeight);
        this.i.layout(0, 0, measuredWidth, measuredHeight);
        final int n5 = measuredWidth - this.e;
        final int n6 = measuredHeight - this.e;
        this.j.layout(n5 - this.j.getMeasuredWidth(), n6 - this.j.getMeasuredHeight(), n5, n6);
        final int n7 = n5 - this.f;
        final int n8 = n6 - this.f;
        this.l.layout(n7 - this.l.getMeasuredWidth(), n8 - this.l.getMeasuredHeight(), n7, n8);
        this.m.layout(n7 - this.m.getMeasuredWidth(), n8 - this.l.getMeasuredHeight(), n7, n8);
        this.n.layout(n7 - this.n.getMeasuredWidth(), n8 - this.l.getMeasuredHeight(), n7, n8);
        final int n9 = this.c + this.d;
        final View l = this.l;
        float translationY;
        if (this.s) {
            translationY = -(this.f + n9 * 1);
        }
        else {
            translationY = 0.0f;
        }
        l.setTranslationY(translationY);
        final View m = this.m;
        float translationY2;
        if (this.s) {
            translationY2 = -(this.f + n9 * 2);
        }
        else {
            translationY2 = 0.0f;
        }
        m.setTranslationY(translationY2);
        final View n10 = this.n;
        final boolean s = this.s;
        float translationY3 = 0.0f;
        if (s) {
            translationY3 = -(this.f + n9 * 3);
        }
        n10.setTranslationY(translationY3);
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.measureChildren(n, n2);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final FloatingActionButtonLayout$SavedState floatingActionButtonLayout$SavedState = (FloatingActionButtonLayout$SavedState)parcelable;
        super.onRestoreInstanceState(floatingActionButtonLayout$SavedState.getSuperState());
        if (floatingActionButtonLayout$SavedState.a) {
            this.b(false);
        }
    }
    
    protected Parcelable onSaveInstanceState() {
        return (Parcelable)new FloatingActionButtonLayout$SavedState(super.onSaveInstanceState(), this.s);
    }
    
    public void setFabListener(final be t) {
        this.t = t;
    }
    
    public void setShowDraftsFab(final boolean q) {
        if (this.q != q) {
            this.q = q;
            final View n = this.n;
            int visibility;
            if (this.p && this.s && q) {
                visibility = 0;
            }
            else {
                visibility = 4;
            }
            n.setVisibility(visibility);
        }
    }
    
    public void setSplitMode(final boolean r) {
        this.r = r;
    }
}
