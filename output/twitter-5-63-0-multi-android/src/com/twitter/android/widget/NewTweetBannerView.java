// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.text.TextUtils;
import android.support.annotation.StringRes;
import android.view.View$OnClickListener;
import com.twitter.library.util.bk;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Animation;
import android.widget.TextView;
import android.view.View;
import android.widget.LinearLayout;

public class NewTweetBannerView extends LinearLayout
{
    private Runnable a;
    private long b;
    private long c;
    private View d;
    private TextView e;
    private Animation f;
    private Animation g;
    private long h;
    
    public NewTweetBannerView(final Context context) {
        this(context, null);
    }
    
    public NewTweetBannerView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 3000L;
        this.a(context);
    }
    
    public NewTweetBannerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = 3000L;
        this.a(context);
    }
    
    private void a(final Context context) {
        (this.f = AnimationUtils.loadAnimation(context, 2131034173)).setAnimationListener((Animation$AnimationListener)new dt(this, false));
        (this.g = AnimationUtils.loadAnimation(context, 2131034171)).setAnimationListener((Animation$AnimationListener)new dt(this, true));
        this.g.setInterpolator((Interpolator)new OvershootInterpolator(3.0f));
    }
    
    public void a(final int n, final int n2, final int n3, final int n4) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.getLayoutParams();
        if (n != viewGroup$MarginLayoutParams.leftMargin || n2 != viewGroup$MarginLayoutParams.topMargin || n3 != viewGroup$MarginLayoutParams.rightMargin || n4 != viewGroup$MarginLayoutParams.bottomMargin) {
            viewGroup$MarginLayoutParams.setMargins(n, n2, n3, n4);
            this.requestLayout();
        }
    }
    
    public boolean a(final boolean b) {
        if (this.getVisibility() == 0 != b) {
            if (b) {
                final long a = bk.a();
                if (this.h + this.b > a) {
                    return false;
                }
                this.h = a;
                this.d.setVisibility(0);
                this.requestLayout();
            }
            this.removeCallbacks(this.a);
            this.clearAnimation();
            Animation animation;
            if (b) {
                animation = this.g;
            }
            else {
                animation = this.f;
            }
            this.startAnimation(animation);
            return true;
        }
        return false;
    }
    
    protected void onFinishInflate() {
        this.d = this.findViewById(2131887056);
        this.e = (TextView)this.d.findViewById(2131887057);
    }
    
    public void setMinDelaySinceLastDisplayed(final long b) {
        this.b = b;
    }
    
    public void setOnClickListener(final View$OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }
    
    public void setText(@StringRes final int n) {
        final String string = this.getResources().getString(n);
        if (!TextUtils.equals((CharSequence)string, this.e.getText())) {
            this.e.setText((CharSequence)string);
            this.requestLayout();
        }
    }
}
