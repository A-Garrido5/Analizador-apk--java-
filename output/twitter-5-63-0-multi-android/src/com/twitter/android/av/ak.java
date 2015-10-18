// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.featureswitch.d;
import com.twitter.library.provider.Tweet;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.kg;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.android.widget.EngagementActionBar;

public class ak implements ab
{
    private EngagementActionBar a;
    private z b;
    private AVPlayer c;
    
    public EngagementActionBar a(final Context context, final ViewGroup viewGroup, final AVPlayer c) {
        this.a = (EngagementActionBar)LayoutInflater.from(context).inflate(2130968871, viewGroup, false);
        this.c = c;
        this.b = new z(this.c.q(), this.a, this);
        if (kg.a(context) && context instanceof FragmentActivity) {
            this.b.a((FragmentActivity)context);
        }
        this.a();
        return this.a;
    }
    
    public void a() {
        Tweet q;
        if (this.c != null) {
            q = this.c.q();
        }
        else {
            q = null;
        }
        if (q != null) {
            this.b.a(q);
        }
    }
    
    @Override
    public void a(final String s) {
        if (this.c != null) {
            this.c.a(s);
        }
    }
    
    public boolean a(final Context context) {
        final int orientation = context.getResources().getConfiguration().orientation;
        return d.f("amplify_fullscreen_engagement_enabled") && orientation != 2;
    }
}
