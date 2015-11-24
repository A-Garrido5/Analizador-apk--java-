// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.os.Build$VERSION;
import android.util.DisplayMetrics;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

public class CircleImageView extends ImageView implements t
{
    private final AccelerateInterpolator a;
    private final DecelerateInterpolator b;
    private final d c;
    private final b d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private f m;
    
    public CircleImageView(final Context context) {
        super(context);
        this.a = new AccelerateInterpolator(2.0f);
        this.b = new DecelerateInterpolator(2.0f);
        this.c = new d(this, null);
        this.d = new b(this, null);
        this.f = 0;
        this.h = false;
        this.j = false;
        this.a();
    }
    
    public CircleImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CircleImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new AccelerateInterpolator(2.0f);
        this.b = new DecelerateInterpolator(2.0f);
        this.c = new d(this, null);
        this.d = new b(this, null);
        this.f = 0;
        this.h = false;
        this.j = false;
        this.a();
    }
    
    private void a() {
        final float density = this.getContext().getResources().getDisplayMetrics().density;
        final int n = (int)(2.0f * (20.0f * density));
        final int n2 = (int)(1.75f * density);
        final int n3 = (int)(0.0f * density);
        this.i = (int)(3.5f * density);
        ShapeDrawable backgroundDrawable;
        if (this.b()) {
            backgroundDrawable = new ShapeDrawable((Shape)new OvalShape());
            ViewCompat.setElevation((View)this, density * 4.0f);
        }
        else {
            backgroundDrawable = new ShapeDrawable((Shape)new c(this, this.i, n));
            ViewCompat.setLayerType((View)this, 1, backgroundDrawable.getPaint());
            backgroundDrawable.getPaint().setShadowLayer((float)this.i, (float)n3, (float)n2, 503316480);
            final int i = this.i;
            this.setPadding(i, i, i, i);
        }
        backgroundDrawable.getPaint().setColor(-328966);
        this.setBackgroundDrawable((Drawable)backgroundDrawable);
        (this.m = new f(this.getContext(), (View)this)).b(-328966);
        this.setImageDrawable((Drawable)this.m);
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.k = (int)(40.0f * displayMetrics.density);
        this.l = (int)(40.0f * displayMetrics.density);
        this.g = 64.0f * displayMetrics.density;
        this.e = this.getTop();
    }
    
    private void a(final int n, final int n2, final float n3) {
        this.a(n + (int)(n3 * (n2 - n)) - this.getTop(), false);
    }
    
    private void a(final int n, final boolean b) {
        this.offsetTopAndBottom(n);
        this.e = this.getTop();
        if (b && Build$VERSION.SDK_INT < 11) {
            this.invalidate();
        }
    }
    
    private boolean b() {
        return Build$VERSION.SDK_INT >= 21;
    }
    
    private void c() {
        this.setAnimationProgress(1.0f);
        this.c.a = this.e;
        this.c.b = (int)this.g;
        this.c.reset();
        this.c.setDuration(200L);
        this.c.setInterpolator((Interpolator)this.b);
        this.clearAnimation();
        this.startAnimation((Animation)this.c);
    }
    
    private void d() {
        this.m.a(false);
        this.m.a(0.0f, 0.0f);
        this.d.a = this.e;
        this.d.b = this.f;
        this.d.c = ViewCompat.getScaleX((View)this);
        this.d.reset();
        this.d.setDuration(150L);
        this.m.stop();
        this.clearAnimation();
        this.startAnimation((Animation)this.d);
    }
    
    private void setAnimationProgress(final float n) {
        ViewCompat.setScaleX((View)this, n);
        ViewCompat.setScaleY((View)this, n);
    }
    
    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.h) {
            this.m.setAlpha(255);
            this.m.start();
        }
        else {
            this.m.stop();
            this.setVisibility(8);
            this.setAnimationProgress(0.0f);
        }
        this.e = this.getTop();
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (!this.j) {
            this.j = true;
            this.f = n2;
            this.e = n2;
            return;
        }
        this.offsetTopAndBottom(this.e - n2);
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(this.k, 1073741824), View$MeasureSpec.makeMeasureSpec(this.l, 1073741824));
        if (!this.b()) {
            this.setMeasuredDimension(this.getMeasuredWidth() + 2 * this.i, this.getMeasuredHeight() + 2 * this.i);
        }
    }
    
    public void setBackgroundColor(final int n) {
        if (this.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)this.getBackground()).getPaint().setColor(this.getResources().getColor(n));
        }
    }
    
    public void setColorSchemeColors(final int... array) {
        this.m.a(array);
    }
    
    public void setColorSchemeResources(final int... array) {
        final Resources resources = this.getResources();
        final int[] colorSchemeColors = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            colorSchemeColors[i] = resources.getColor(array[i]);
        }
        this.setColorSchemeColors(colorSchemeColors);
    }
    
    public void setProgress(final float n) {
        final float min = Math.min(1.0f, Math.abs(n));
        this.m.a(true);
        final float n2 = 5.0f * (float)Math.max(min - 0.4, 0.0) / 3.0f;
        final float n3 = this.g - this.f;
        final float max = Math.max(0.0f, Math.min(n - 1.0f, 2.0f));
        final float n4 = 2.0f * (float)(max / 4.0f - Math.pow(max / 4.0f, 2.0));
        final int n5 = this.f + (int)(2.0f * (n3 * n4) + min * n3);
        if (this.getVisibility() != 0) {
            this.setVisibility(0);
        }
        this.setAnimationProgress(1.0f);
        this.m.setAlpha(76 + (int)(179.0f * this.a.getInterpolation(n2)));
        this.m.a(0.0f, Math.min(0.8f, n2 * 0.8f));
        this.m.a(Math.min(1.0f, n2));
        this.m.b(0.5f * (-0.25f + n2 * 0.4f + n4 * 2.0f));
        this.a(n5 - this.e, true);
    }
    
    public void setProgressBackgroundColor(final int backgroundColor) {
        this.setBackgroundColor(backgroundColor);
        this.m.b(this.getResources().getColor(backgroundColor));
    }
    
    public void setRefreshing(final boolean h) {
        if (h && !this.h) {
            this.c();
        }
        else {
            this.d();
        }
        this.h = h;
    }
    
    public void setSize(final int n) {
        if (n != 0 && n != 1) {
            return;
        }
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        if (n == 0) {
            final int n2 = (int)(56.0f * displayMetrics.density);
            this.k = n2;
            this.l = n2;
        }
        else {
            final int n3 = (int)(40.0f * displayMetrics.density);
            this.k = n3;
            this.l = n3;
        }
        this.setImageDrawable((Drawable)null);
        this.m.a(n);
        this.setImageDrawable((Drawable)this.m);
    }
    
    public void setSpinnerFinalOffset(final int n) {
        this.g = n;
    }
}
