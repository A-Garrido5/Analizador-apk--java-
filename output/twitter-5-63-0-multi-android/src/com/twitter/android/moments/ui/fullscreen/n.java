// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import com.twitter.android.moments.viewmodels.HydratableMomentPage;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.library.provider.Tweet;
import android.widget.FrameLayout;
import com.twitter.android.moments.viewmodels.MomentTweetPage;
import android.view.LayoutInflater;
import android.content.Context;
import com.twitter.android.moments.ui.sectionpager.d;

class n implements d, com.twitter.util.n
{
    static final /* synthetic */ boolean a;
    private final Context b;
    private final LayoutInflater c;
    private final MomentTweetPage d;
    private FrameLayout e;
    
    static {
        a = !j.class.desiredAssertionStatus();
    }
    
    private n(final Context b, final LayoutInflater c, final MomentTweetPage d) {
        this.b = b;
        this.c = c;
        (this.d = d).a(this);
    }
    
    private View a(final Tweet tweet) {
        final ViewGroup viewGroup = (ViewGroup)this.c.inflate(2130968892, (ViewGroup)this.e, false);
        final g g = new g(viewGroup);
        g.a().setText((CharSequence)tweet.y);
        g.b().setText((CharSequence)tweet.M);
        g.c().setText((CharSequence)this.b.getResources().getString(2131298173, new Object[] { tweet.F }));
        return (View)viewGroup;
    }
    
    public View a() {
        if (this.e == null) {
            this.e = new FrameLayout(this.b);
            if (this.d.a()) {
                final Tweet e = this.d.e();
                if (!n.a && e == null) {
                    throw new AssertionError();
                }
                this.e.addView(this.a(e));
            }
        }
        return (View)this.e;
    }
    
    public void a(final HydratableMomentPage hydratableMomentPage) {
        final Tweet e = this.d.e();
        if (!n.a && e == null) {
            throw new AssertionError();
        }
        if (this.e != null) {
            this.e.addView(this.a(e));
        }
    }
    
    @Override
    public void c() {
        this.d.b(this);
    }
}
