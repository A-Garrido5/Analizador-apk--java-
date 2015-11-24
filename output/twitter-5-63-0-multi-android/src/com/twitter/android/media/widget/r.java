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
import android.animation.Animator;
import com.twitter.library.util.g;

class r extends g
{
    final /* synthetic */ FilterFilmstripView a;
    
    r(final FilterFilmstripView a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animator animator) {
        this.a.j = false;
    }
}
