// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.graphics.Canvas;
import com.twitter.library.client.az;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import com.twitter.library.util.aj;
import java.util.Iterator;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.View;
import java.util.Collections;
import com.twitter.library.util.bj;
import com.twitter.library.util.bo;
import java.util.ArrayList;
import android.util.AttributeSet;
import com.twitter.library.util.FriendshipCache;
import java.util.List;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.content.Context;
import com.twitter.ui.widget.ag;
import com.twitter.library.provider.Tweet;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.widget.ImageView;
import com.twitter.library.view.TweetActionType;

abstract class z
{
    public final TweetActionType b;
    public final ImageView c;
    protected TypefacesTextView d;
    protected int e;
    final /* synthetic */ InlineActionsView f;
    
    private z(final InlineActionsView inlineActionsView, final TweetActionType b) {
        this.f = inlineActionsView;
        this.b = b;
        (this.c = this.a()).setTag((Object)this);
        this.c.setOnClickListener((View$OnClickListener)inlineActionsView);
    }
    
    protected ImageView a() {
        final ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-2, -2);
        final ImageView imageView = new ImageView(this.f.getContext());
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView$ScaleType.CENTER);
        imageView.setClickable(true);
        imageView.setPadding(this.f.f, this.f.f, this.f.f, this.f.f);
        return imageView;
    }
    
    public abstract boolean a(final Tweet p0);
    
    protected TypefacesTextView b() {
        final Context context = this.f.getContext();
        final TypefacesTextView typefacesTextView = new TypefacesTextView(context);
        typefacesTextView.setTextSize(0, this.f.g);
        typefacesTextView.setTextColor(this.f.h);
        typefacesTextView.setTypeface(ag.a(context).a);
        return typefacesTextView;
    }
    
    public final TypefacesTextView c() {
        return this.d;
    }
}
