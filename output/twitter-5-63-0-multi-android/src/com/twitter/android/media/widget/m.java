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
import com.twitter.internal.android.widget.RichImageView;
import android.view.View$OnTouchListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.util.SparseArray;
import android.widget.LinearLayout;
import android.widget.HorizontalScrollView;
import android.widget.SeekBar;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View;
import android.view.View$OnClickListener;

class m implements View$OnClickListener
{
    final /* synthetic */ int a;
    final /* synthetic */ FilterFilmstripView b;
    
    m(final FilterFilmstripView b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        final SeekBar a = ((u)((MediaImageView)this.b.e.get(this.b.f)).getTag()).a;
        if (this.b.f == this.a && ((View)a).getVisibility() == 8 && this.a != 0) {
            this.b.a((View)a, true);
        }
        else {
            if (((View)a).getVisibility() == 0) {
                this.b.a((View)a, false);
                return;
            }
            if (this.b.f != this.a) {
                this.b.setSelectedFilter(this.a);
                this.b.a(true);
            }
        }
    }
}
