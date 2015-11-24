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
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.twitter.android.moments.viewmodels.MomentTweetTextPage;
import android.animation.AnimatorSet;
import com.twitter.library.api.moments.ThemeData;
import com.twitter.util.m;
import android.view.ViewGroup;
import com.twitter.android.moments.ui.sectionpager.a;
import android.graphics.drawable.TransitionDrawable;
import com.twitter.util.n;

class s implements n
{
    final /* synthetic */ r a;
    
    s(final r a) {
        this.a = a;
    }
    
    public void a(final Event event) {
        final TransitionDrawable transitionDrawable = (TransitionDrawable)this.a.a.getBackground();
        switch (t.a[event.ordinal()]) {
            default: {}
            case 1: {
                transitionDrawable.startTransition(200);
                this.a.a(-1);
            }
            case 2: {
                transitionDrawable.reverseTransition(200);
                this.a.a(this.a.d.foregroundColor);
            }
        }
    }
}
