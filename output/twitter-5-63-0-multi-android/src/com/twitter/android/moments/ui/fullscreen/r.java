// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import android.view.View;
import android.animation.Animator;
import android.view.LayoutInflater;
import android.content.Context;
import android.animation.TypeEvaluator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import com.twitter.library.provider.Tweet;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.twitter.android.moments.viewmodels.MomentTweetTextPage;
import android.animation.AnimatorSet;
import com.twitter.util.n;
import com.twitter.library.api.moments.ThemeData;
import com.twitter.util.m;
import android.view.ViewGroup;
import com.twitter.android.moments.ui.sectionpager.a;

public class r implements a
{
    private final ViewGroup a;
    private final g b;
    private final m c;
    private final ThemeData d;
    private final n e;
    private AnimatorSet f;
    
    r(final MomentTweetTextPage momentTweetTextPage, final ViewGroup a, final g b, final m c) {
        this.e = new s(this);
        this.a = a;
        this.b = b;
        this.c = c;
        final Tweet e = momentTweetTextPage.e();
        final TextView a2 = b.a();
        final TextView b2 = b.b();
        final TextView c2 = b.c();
        a2.setText((CharSequence)e.y);
        b2.setText((CharSequence)e.M);
        c2.setText((CharSequence)a.getResources().getString(2131298173, new Object[] { e.F }));
        final ThemeData f = momentTweetTextPage.f();
        final int foregroundColor = f.foregroundColor;
        a2.setTextColor(foregroundColor);
        b2.setTextColor(foregroundColor);
        c2.setTextColor(foregroundColor);
        a.setBackgroundColor(f.backgroundColor);
        this.d = f;
        final TransitionDrawable backgroundDrawable = new TransitionDrawable(new Drawable[] { new ColorDrawable(f.backgroundColor), new ColorDrawable(-16777216) });
        backgroundDrawable.setCrossFadeEnabled(true);
        a.setBackgroundDrawable((Drawable)backgroundDrawable);
    }
    
    private ObjectAnimator a(final TextView textView, final int n) {
        return ObjectAnimator.ofObject((Object)textView, "textColor", (TypeEvaluator)new ArgbEvaluator(), new Object[] { textView.getCurrentTextColor(), n }).setDuration(200L);
    }
    
    public static r a(final Context context, final MomentTweetTextPage momentTweetTextPage, final m m) {
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(context).inflate(2130968891, (ViewGroup)null, false);
        return new r(momentTweetTextPage, viewGroup, new g(viewGroup), m);
    }
    
    private void a(final int n) {
        if (this.f != null) {
            this.f.cancel();
        }
        (this.f = new AnimatorSet()).playTogether(new Animator[] { this.a(this.b.a(), n), this.a(this.b.b(), n), this.a(this.b.c(), n) });
        this.f.start();
    }
    
    @Override
    public View a() {
        return (View)this.a;
    }
    
    @Override
    public void a(final float n) {
    }
    
    @Override
    public void b() {
        this.c.a(this.e);
    }
    
    @Override
    public void c() {
        this.c.b(this.e);
    }
    
    @Override
    public void d() {
        this.c.b(this.e);
    }
}
