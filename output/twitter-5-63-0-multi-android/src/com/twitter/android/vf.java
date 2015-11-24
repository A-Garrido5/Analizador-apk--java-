// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.TweetView;
import com.twitter.library.provider.Tweet;
import com.twitter.util.a;
import com.twitter.android.widget.EngagementActionBar;
import android.view.ViewGroup;
import com.twitter.library.view.TweetActionType;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.content.Context;
import com.twitter.library.client.az;
import android.view.View$OnClickListener;

public class vf implements View$OnClickListener
{
    private final az a;
    private final Context b;
    private final vh c;
    private vg d;
    private vg e;
    private long f;
    private xb g;
    private boolean h;
    
    public vf(final Context b, final vh c) {
        this.f = Long.MIN_VALUE;
        if (c == null) {
            throw new IllegalStateException("You must set an OnActionClickListener");
        }
        this.b = b;
        this.a = az.a(b);
        this.c = c;
        this.e = new vg(AnimationUtils.loadAnimation(b, 2131034143), true);
        this.d = new vg(AnimationUtils.loadAnimation(b, 2131034141), false);
    }
    
    private static TweetActionType a(final View view) {
        final int id = view.getId();
        if (id == 2131886230) {
            return TweetActionType.b;
        }
        if (id == 2131886229) {
            return TweetActionType.c;
        }
        if (id == 2131886228) {
            return TweetActionType.d;
        }
        if (id == 2131886232) {
            return TweetActionType.f;
        }
        if (id == 2131886231) {
            return TweetActionType.g;
        }
        if (id == 2131886108) {
            return TweetActionType.h;
        }
        return TweetActionType.a;
    }
    
    private void a(final View view, final ViewGroup viewGroup, final vg vg) {
        viewGroup.setMinimumHeight(0);
        this.c.b();
        this.a(view, true);
        vg.a(view, viewGroup);
    }
    
    private void a(final View view, final EngagementActionBar engagementActionBar, final vg vg) {
        engagementActionBar.setMinimumHeight(view.getHeight());
        engagementActionBar.setTweet(this.g.f.getTweet());
        engagementActionBar.setOnClickListener((View$OnClickListener)this);
        engagementActionBar.setVisibility(0);
        if (this.h && !com.twitter.util.a.a()) {
            this.c.a();
            vg.a(view, (ViewGroup)engagementActionBar);
        }
        else {
            this.a(view, false);
            if (engagementActionBar.getChildCount() > 0) {
                engagementActionBar.getChildAt(0).sendAccessibilityEvent(8);
            }
        }
    }
    
    private void a(final View view, final boolean b) {
        if (b) {
            view.setVisibility(0);
            view.setEnabled(true);
            return;
        }
        view.setVisibility(4);
        view.setEnabled(false);
    }
    
    public long a() {
        return this.f;
    }
    
    public void a(final long f) {
        this.h = false;
        this.f = f;
    }
    
    public void a(final xb g, final long f) {
        this.h = true;
        if (this.f != f) {
            this.b();
            this.f = f;
            this.g = g;
            if (g.d == null) {
                g.d = (EngagementActionBar)g.c.inflate();
            }
            this.a((View)g.f, g.d, this.e);
        }
    }
    
    public boolean a(final Tweet tweet, final TweetView tweetView, final TweetActionType tweetActionType) {
        if (tweetView != null) {
            return this.c.a(tweetActionType, tweet, tweetView.getFriendshipCache());
        }
        return this.c.a(tweetActionType, tweet, null);
    }
    
    public void b() {
        if (this.f != Long.MIN_VALUE) {
            final xb g = this.g;
            if (g != null) {
                this.a((View)g.f, (ViewGroup)g.d, this.d);
            }
            this.f = Long.MIN_VALUE;
            this.g = null;
        }
    }
    
    public void b(final xb g, final long n) {
        if (n == this.f) {
            this.g = g;
            final EngagementActionBar d = g.d;
            boolean b = false;
            if (d == null) {
                g.d = (EngagementActionBar)g.c.inflate();
                b = true;
            }
            if (b || g.d.getVisibility() != 0) {
                this.a((View)g.f, g.d, this.e);
            }
        }
        else if (g.d != null && g.d.getVisibility() == 0) {
            this.a((View)g.f, true);
            g.d.setVisibility(4);
        }
    }
    
    public void onClick(final View view) {
        if (this.g != null && this.a(this.g.f.getTweet(), this.g.f, a(view))) {
            this.b();
        }
    }
}
