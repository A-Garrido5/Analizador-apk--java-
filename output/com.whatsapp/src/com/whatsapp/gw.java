// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.AnimationSet;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.content.Context;
import android.app.Activity;
import android.widget.PopupWindow;

public class gw extends PopupWindow
{
    private int a;
    
    public gw(final Activity activity) {
        super((Context)activity);
        final FrameLayout contentView = new FrameLayout((Context)activity);
        contentView.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        alm.a(activity.getLayoutInflater(), 2130903078, (ViewGroup)contentView, true);
        contentView.getChildAt(0).setVisibility(0);
        this.setContentView((View)contentView);
        this.setBackgroundDrawable((Drawable)new BitmapDrawable());
        this.setWidth(-1);
        this.setHeight(-2);
        this.setAnimationStyle(0);
        this.setTouchable(true);
        this.setFocusable(true);
        this.setOutsideTouchable(true);
        this.setInputMethodMode(2);
        this.setTouchInterceptor((View$OnTouchListener)new c0(this, contentView, activity));
    }
    
    static int a(final gw gw) {
        return gw.a;
    }
    
    private void a(final View view, final int n, final int n2, final int n3) {
        final AnimationSet set = new AnimationSet(true);
        set.addAnimation((Animation)new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.0f));
        set.setInterpolator((Interpolator)new OvershootInterpolator(1.0f));
        set.setDuration(300L);
        set.setStartOffset((long)n);
        view.startAnimation((Animation)set);
    }
    
    static void b(final gw gw) {
        gw.dismiss();
    }
    
    public void a(final View view) {
        final boolean i = App.I;
        int hasPermanentMenuKey = 0;
        Label_0041: {
            if (Build$VERSION.SDK_INT >= 14) {
                hasPermanentMenuKey = (ViewConfiguration.get(view.getContext()).hasPermanentMenuKey() ? 1 : 0);
                if (!i) {
                    break Label_0041;
                }
            }
            if (Build$VERSION.SDK_INT < 11 || i) {
                hasPermanentMenuKey = 1;
            }
            else {
                hasPermanentMenuKey = 0;
            }
        }
        this.a = view.getContext().getResources().getDimensionPixelSize(2131361822) / 2;
        if (hasPermanentMenuKey == 0) {
            this.a += view.getContext().getResources().getDimensionPixelSize(2131361823);
        }
        Label_0112: {
            if (Build$VERSION.SDK_INT >= 19) {
                this.showAsDropDown(view, 0, 0, 8388661);
                if (!i) {
                    break Label_0112;
                }
            }
            this.showAsDropDown(view, 0, 0);
        }
        final CircularRevealView circularRevealView = (CircularRevealView)this.getContentView().findViewById(2131755261);
        circularRevealView.setDuration(300);
        circularRevealView.setColor(circularRevealView.getResources().getColor(2131623949));
        circularRevealView.setVisibility(0);
        circularRevealView.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new a84(this, circularRevealView));
        this.a(this.getContentView().findViewById(2131755263), 100, 2, 1);
        this.a(this.getContentView().findViewById(2131755265), 50, 1, 1);
        this.a(this.getContentView().findViewById(2131755267), 0, 0, 1);
        this.a(this.getContentView().findViewById(2131755269), 150, 2, 2);
        this.a(this.getContentView().findViewById(2131755271), 100, 1, 2);
        this.a(this.getContentView().findViewById(2131755273), 50, 0, 2);
    }
    
    public void dismiss() {
        if (this.isShowing()) {
            ((CircularRevealView)this.getContentView().findViewById(2131755261)).a();
            if (Build$VERSION.SDK_INT < 21) {
                final View viewById = this.getContentView().findViewById(2131755262);
                int n;
                if (App.ak()) {
                    n = viewById.getWidth() - this.a / 2;
                }
                else {
                    n = this.a / 2;
                }
                final ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, (float)n, 1, 0.0f);
                final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                final AnimationSet set = new AnimationSet(true);
                set.addAnimation((Animation)scaleAnimation);
                set.addAnimation((Animation)alphaAnimation);
                set.setDuration(300L);
                viewById.startAnimation((Animation)set);
            }
        }
        App.aq.a5().postDelayed((Runnable)new j2(this), 300L);
    }
}
