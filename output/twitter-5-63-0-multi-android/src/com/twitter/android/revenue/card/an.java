// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import com.twitter.android.nativecards.j;
import android.view.View;
import com.twitter.android.av.videoapp.VideoCardData;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.android.card.h;
import android.content.Context;
import com.twitter.android.card.v;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;

public class an extends ac
{
    an(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity));
    }
    
    an(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        ap.a(this.g);
    }
    
    @Override
    public void a(final long n, final TwitterUser twitterUser) {
    }
    
    @Override
    public void a(final long n, final vc vc) {
        super.a(n, vc);
        final String a = wb.a("app_category", vc);
        final vj a2 = vj.a("app_icon", vc);
        final String a3 = wb.a("player_stream_url", vc);
        final com.twitter.android.av.videoapp.g c = VideoCardData.a().b(this.s).d(wb.a("app_star_rating", vc)).e(wb.a("app_num_ratings", vc)).f(this.p).c(a);
        String a4;
        if (a2 != null) {
            a4 = a2.a;
        }
        else {
            a4 = null;
        }
        final com.twitter.android.av.videoapp.g h = c.h(a4);
        final um o = this.o;
        String b = null;
        if (o != null) {
            b = this.o.b();
        }
        ap.a(a3, (View)this.c, this, this.B, this.g, this.E, h.g(b).a(this.t).i(this.q).a());
    }
    
    @Override
    protected String e() {
        return "player_image";
    }
}
