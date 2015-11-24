// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.f;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;

public class ae extends RichTimeline
{
    private boolean h;
    
    public ae(final Context context, final Session session, final long n) {
        super(context, ae.class.getName(), new ab(session), n);
    }
    
    public ae a(final boolean h) {
        this.h = h;
        return this;
    }
    
    @Override
    protected f g() {
        final f g = super.g();
        g.a(new Object[] { "timeline", "user" }).a("id", this.F()).a("include_my_retweet", true).a("earned", true).a("include_tweet_replies", true).a("exclude_pinned_tweets", true);
        if (this.h) {
            g.a("pc", true);
        }
        return g;
    }
    
    @Override
    protected int z() {
        return 1;
    }
}
