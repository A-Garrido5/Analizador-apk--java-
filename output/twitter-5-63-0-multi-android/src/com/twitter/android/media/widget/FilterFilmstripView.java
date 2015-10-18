// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.MotionEvent;
import android.os.Parcelable;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet;
import com.twitter.library.media.manager.al;
import android.graphics.Bitmap$Config;
import com.twitter.library.media.decoder.c;
import com.twitter.media.filters.Filters;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.twitter.internal.android.widget.RichImageView;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View$OnTouchListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.util.SparseArray;
import android.widget.LinearLayout;
import android.widget.HorizontalScrollView;

public class FilterFilmstripView extends HorizontalScrollView
{
    private final int a;
    private final String[] b;
    private final int[] c;
    private final LinearLayout d;
    private SparseArray e;
    private int f;
    private t g;
    private int[] h;
    private View i;
    private boolean j;
    
    public FilterFilmstripView(final Context context) {
        this(context, null);
    }
    
    public FilterFilmstripView(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = 0;
        final Resources resources = this.getResources();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.FilterFilmstripView);
        this.a = obtainStyledAttributes.getResourceId(4, 2130968768);
        final int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        String[] stringArray;
        if (resourceId != 0) {
            stringArray = resources.getStringArray(resourceId);
        }
        else {
            stringArray = null;
        }
        this.b = stringArray;
        final int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        int[] intArray;
        if (resourceId2 != 0) {
            intArray = resources.getIntArray(resourceId2);
        }
        else {
            intArray = null;
        }
        this.c = intArray;
        final int resourceId3 = obtainStyledAttributes.getResourceId(3, 0);
        int[] intArray2;
        if (resourceId3 != 0) {
            intArray2 = resources.getIntArray(resourceId3);
        }
        else {
            intArray2 = null;
        }
        this.h = intArray2;
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.setHorizontalScrollBarEnabled(false);
        (this.d = new LinearLayout(context)).setOrientation(0);
        this.addView((View)this.d, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 17));
        this.d.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        if (this.b == null || this.c == null) {
            throw new IllegalStateException("Must declare filter names and ids in xml");
        }
        this.e = new SparseArray();
        for (int i = 0; i < this.c.length; ++i) {
            final int n = this.c[i];
            final LinearLayout linearLayout = (LinearLayout)LayoutInflater.from(this.getContext()).inflate(this.a, (ViewGroup)null);
            linearLayout.setContentDescription((CharSequence)this.b[i]);
            ((TextView)linearLayout.findViewById(2131886757)).setText((CharSequence)this.b[i]);
            final SeekBar seekBar = (SeekBar)linearLayout.findViewById(2131886758);
            seekBar.setEnabled(false);
            int progress;
            if (this.h != null) {
                progress = this.h[i];
            }
            else {
                progress = 80;
            }
            seekBar.setProgress(progress);
            seekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new i(this, n, seekBar));
            seekBar.setOnTouchListener((View$OnTouchListener)new l(this));
            final MediaImageView mediaImageView = (MediaImageView)linearLayout.findViewById(2131886756);
            ((RichImageView)mediaImageView.getImageView()).setOverlayVisible(false);
            mediaImageView.setTag((Object)new u(seekBar, n, linearLayout));
            mediaImageView.setOnClickListener((View$OnClickListener)new m(this, n));
            this.d.addView((View)linearLayout, new ViewGroup$LayoutParams(-2, -1));
            mediaImageView.setId(com.twitter.util.t.a());
            this.e.put(n, (Object)mediaImageView);
        }
    }
    
    private void a(final int n, final float n2) {
        final u u = (u)((MediaImageView)this.e.get(n)).getTag();
        u.a.setProgress(Math.round(n2 * u.a.getMax()));
        if (this.g != null && n == this.f) {
            this.g.a(this);
        }
    }
    
    private void a(View i, final boolean b) {
        final Resources resources = this.getResources();
        final int scrollX = this.getScrollX();
        final View view = (View)i.getParent();
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131558649);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131558648);
        final int n = resources.getDimensionPixelOffset(2131558648) - view.getPaddingRight();
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)i.getLayoutParams();
        int n2;
        if (b) {
            viewGroup$MarginLayoutParams.width = 0;
            viewGroup$MarginLayoutParams.leftMargin = 0;
            viewGroup$MarginLayoutParams.rightMargin = 0;
            i.setVisibility(4);
            n2 = view.getLeft() - resources.getDimensionPixelOffset(2131558646);
        }
        else {
            n2 = view.getLeft() - resources.getDimensionPixelOffset(2131558647);
        }
        final int n3 = n2 - scrollX;
        final LinearLayout d = this.d;
        final boolean b2 = this.getScrollX() == ((View)d).getMeasuredWidth() - this.getMeasuredWidth();
        Object o;
        if (b2) {
            o = new s(this, (View)d);
        }
        else {
            o = null;
        }
        if (o != null) {
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)o);
        }
        final j j = new j(this, b, viewGroup$MarginLayoutParams, dimensionPixelSize, dimensionPixelSize2, n, n2, b2, scrollX, n3, i);
        j.setAnimationListener((Animation$AnimationListener)new k(this, i, b, (ViewTreeObserver$OnPreDrawListener)o));
        j.setDuration(160L);
        i.startAnimation((Animation)j);
        if (!b) {
            i = null;
        }
        this.i = i;
    }
    
    public void a() {
        final ImageView imageView = new ImageView(this.getContext());
        imageView.setImageResource(2130839515);
        final Animation loadAnimation = AnimationUtils.loadAnimation(this.getContext(), 2131034178);
        final MediaImageView mediaImageView = (MediaImageView)this.e.get(this.f);
        loadAnimation.setAnimationListener((Animation$AnimationListener)new p(this, mediaImageView, imageView));
        loadAnimation.setInterpolator((Interpolator)new OvershootInterpolator());
        mediaImageView.addView((View)imageView);
        imageView.startAnimation(loadAnimation);
    }
    
    public void a(final Filters filters, final String s) {
        final SparseArray e = this.e;
        for (int i = 0; i < this.c.length; ++i) {
            final int n = this.c[i];
            final MediaImageView mediaImageView = (MediaImageView)e.get(n);
            final u u = (u)mediaImageView.getTag();
            final com.twitter.library.media.manager.k a = com.twitter.library.media.manager.j.a(s).a(new c(this.getContext(), u.b, false, 1.0f, filters)).a(Bitmap$Config.RGB_565);
            if (n == 0) {
                a.a(new n(this, e));
            }
            else {
                mediaImageView.setAlpha(0.3f);
                a.a(new o(this, mediaImageView));
            }
            if (!mediaImageView.a(a) && mediaImageView.a()) {
                mediaImageView.setAlpha(1.0f);
            }
            u.a.setEnabled(true);
            final SeekBar a2 = u.a;
            int progress;
            if (this.h != null) {
                progress = this.h[i];
            }
            else {
                progress = 80;
            }
            a2.setProgress(progress);
        }
        ((RichImageView)((MediaImageView)e.get(this.f)).getImageView()).setOverlayVisible(true);
    }
    
    public void a(final boolean b) {
        final int n = ((View)((u)((MediaImageView)this.e.get(this.getSelectedFilter())).getTag()).c).getLeft() - this.getResources().getDimensionPixelOffset(2131558647);
        if (b) {
            this.smoothScrollTo(n, 0);
            return;
        }
        this.scrollTo(n, 0);
    }
    
    public boolean a(final boolean b, final boolean b2) {
        boolean b3;
        if (!b2) {
            int visibility = 0;
            if (!b) {
                visibility = 8;
            }
            this.setVisibility(visibility);
            b3 = true;
        }
        else {
            final boolean j = this.j;
            b3 = false;
            if (!j) {
                final AnimatorSet set = new AnimatorSet();
                if (b) {
                    this.setVisibility(0);
                    set.playTogether(new Animator[] { ObjectAnimator.ofFloat((Object)this, View.TRANSLATION_Y, new float[] { this.getMeasuredHeight(), 0.0f }), ObjectAnimator.ofFloat((Object)this, View.ALPHA, new float[] { 0.0f, 1.0f }) });
                }
                else {
                    set.playTogether(new Animator[] { ObjectAnimator.ofFloat((Object)this, View.TRANSLATION_Y, new float[] { 0.0f, this.getMeasuredHeight() }), ObjectAnimator.ofFloat((Object)this, View.ALPHA, new float[] { 1.0f, 0.0f }) });
                    set.addListener((Animator$AnimatorListener)new q(this));
                }
                set.addListener((Animator$AnimatorListener)new r(this));
                set.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
                set.setDuration(300L);
                set.start();
                return this.j = true;
            }
        }
        return b3;
    }
    
    protected void dispatchRestoreInstanceState(final SparseArray sparseArray) {
        if (this.getId() != -1) {
            final Parcelable parcelable = (Parcelable)sparseArray.get(this.getId());
            if (parcelable != null) {
                this.onRestoreInstanceState(parcelable);
            }
        }
    }
    
    protected void dispatchSaveInstanceState(final SparseArray sparseArray) {
        final int id = this.getId();
        if (id != -1) {
            final Parcelable onSaveInstanceState = this.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                sparseArray.put(id, (Object)onSaveInstanceState);
            }
        }
    }
    
    public MediaImageView getActivePreview() {
        return (MediaImageView)this.e.get(this.f);
    }
    
    public float getIntensity() {
        final u u = (u)((MediaImageView)this.e.get(this.f)).getTag();
        return u.a.getProgress() / u.a.getMax();
    }
    
    public int getSelectedFilter() {
        return this.f;
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.d.getMeasuredWidth() >= this.getMeasuredWidth()) {
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)this.d.getLayoutParams();
            frameLayout$LayoutParams.gravity &= 0xFFFFFFFE;
            return;
        }
        ((FrameLayout$LayoutParams)this.d.getLayoutParams()).gravity = 1;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final FilterFilmstripView$SavedState filterFilmstripView$SavedState = (FilterFilmstripView$SavedState)parcelable;
        super.onRestoreInstanceState(filterFilmstripView$SavedState.getSuperState());
        for (int i = 0; i < this.c.length; ++i) {
            this.a(this.c[i], filterFilmstripView$SavedState.b[i]);
        }
        this.f = filterFilmstripView$SavedState.a;
    }
    
    public Parcelable onSaveInstanceState() {
        final float[] array = new float[this.c.length];
        for (int i = 0; i < this.c.length; ++i) {
            final u u = (u)((View)this.e.get(this.c[i])).getTag();
            array[i] = u.a.getProgress() / u.a.getMax();
        }
        return (Parcelable)new FilterFilmstripView$SavedState(super.onSaveInstanceState(), array, this.f);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.i == null) {
            return super.onTouchEvent(motionEvent);
        }
        final View view = (View)this.e.get(this.getSelectedFilter());
        final LinearLayout c = ((u)view.getTag()).c;
        final int n = (int)motionEvent.getX() - (com.twitter.util.t.a((View)c, (View)this) - this.getScrollX());
        if (n < view.getMeasuredWidth() || n > ((View)c).getMeasuredWidth()) {
            this.a(this.i, false);
        }
        return false;
    }
    
    public void setFilterListener(final t g) {
        this.g = g;
    }
    
    public void setIntensity(final float n) {
        this.a(this.getSelectedFilter(), n);
    }
    
    public void setSelectedFilter(final int f) {
        if (f != this.f) {
            final MediaImageView mediaImageView = (MediaImageView)this.e.get(f);
            final MediaImageView mediaImageView2 = (MediaImageView)this.e.get(this.f);
            ((u)mediaImageView2.getTag()).a.setVisibility(8);
            ((RichImageView)mediaImageView2.getImageView()).setOverlayVisible(false);
            ((RichImageView)mediaImageView.getImageView()).setOverlayVisible(true);
            this.f = f;
            if (this.g != null) {
                this.g.a(this);
            }
        }
    }
}
