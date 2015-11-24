// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.content.Context;
import android.accounts.Account;
import android.view.View;
import android.view.animation.Animation;
import com.twitter.library.util.f;

public class i extends f
{
    private final Animation a;
    private final Animation b;
    private final View c;
    private final j d;
    private Account e;
    
    public i(final Context context, final View c, final j d) {
        this.a = AnimationUtils.loadAnimation(context, 2131034166);
        (this.b = AnimationUtils.loadAnimation(context, 2131034167)).setAnimationListener((Animation$AnimationListener)this);
        this.c = c;
        this.d = d;
    }
    
    public void a(final Account e) {
        this.e = e;
        this.c.startAnimation(this.b);
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        if (this.d != null) {
            this.d.a(this.e.name);
        }
        this.c.startAnimation(this.a);
        this.e = null;
    }
}
