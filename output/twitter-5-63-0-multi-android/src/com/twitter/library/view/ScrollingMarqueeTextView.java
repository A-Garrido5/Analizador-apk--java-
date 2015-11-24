// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.os.Parcelable;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import com.twitter.library.util.bk;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.view.animation.Animation;
import com.twitter.internal.android.widget.TypefacesTextView;

public class ScrollingMarqueeTextView extends TypefacesTextView
{
    private int a;
    private boolean b;
    private Animation c;
    private Animation d;
    private List e;
    private long f;
    private long g;
    private boolean h;
    private Runnable i;
    
    public ScrollingMarqueeTextView(final Context context) {
        this(context, null);
    }
    
    public ScrollingMarqueeTextView(final Context context, final AttributeSet set) {
        super(context, set);
        this.i = new p(this);
        this.e();
        this.f();
    }
    
    private void a() {
        if (this.d()) {
            this.b = false;
            this.a = 0;
            this.startAnimation(this.d);
            this.removeCallbacks(this.i);
            this.postDelayed(this.i, this.g);
        }
    }
    
    private void b() {
        if (this.d()) {
            final long a = bk.a();
            this.removeCallbacks(this.i);
            final long n = a - this.f;
            if (Math.abs(n) < 10L) {
                this.a();
            }
            else {
                if (n <= 0L) {
                    this.postDelayed(this.i, -n);
                    return;
                }
                this.postDelayed(this.i, this.f + (n + this.g) / this.g * this.g - a);
            }
        }
    }
    
    private void b(final int a) {
        final int size = this.e.size();
        if (a < size && size > 1) {
            this.a(this.a = a);
        }
        else {
            this.a(this.a = 0);
            this.b = true;
        }
        this.setVisibility(0);
        this.startAnimation(this.c);
    }
    
    private void c() {
        this.clearAnimation();
        this.removeCallbacks(this.i);
    }
    
    private boolean d() {
        return this.h && this.e != null && this.e.size() > 1 && this.g > 0L;
    }
    
    private void e() {
        (this.c = AnimationUtils.loadAnimation(this.getContext(), kt.status_bar_fade_in)).setAnimationListener((Animation$AnimationListener)new q(this));
        this.c.setFillAfter(true);
    }
    
    private void f() {
        (this.d = AnimationUtils.loadAnimation(this.getContext(), kt.status_bar_fade_out)).setFillAfter(true);
        this.d.setAnimationListener((Animation$AnimationListener)new r(this));
    }
    
    void a(final int n) {
        this.setText((CharSequence)this.e.get(n).a());
    }
    
    public void a(final List e, final long n, final long g) {
        this.e = e;
        this.f = n + bk.a();
        this.g = g;
        this.h = true;
        this.a(0);
        this.b();
    }
    
    protected void onDetachedFromWindow() {
        this.c();
        super.onDetachedFromWindow();
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final ScrollingMarqueeTextView$SavedState scrollingMarqueeTextView$SavedState = (ScrollingMarqueeTextView$SavedState)parcelable;
        super.onRestoreInstanceState(scrollingMarqueeTextView$SavedState.getSuperState());
        this.b = scrollingMarqueeTextView$SavedState.a;
    }
    
    public Parcelable onSaveInstanceState() {
        return (Parcelable)new ScrollingMarqueeTextView$SavedState(super.onSaveInstanceState(), this.b);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        if (b && this.d()) {
            this.b();
        }
        else if (!b) {
            this.c();
        }
    }
}
