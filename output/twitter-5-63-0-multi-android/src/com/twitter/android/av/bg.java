// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.os.Bundle;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.util.q;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.search.g;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.library.av.playback.AVPlayer;

public class bg
{
    static final String a;
    static final String b;
    static final String c;
    final long d;
    private final AVPlayer e;
    private final az f;
    private final com.twitter.library.provider.bg g;
    
    static {
        a = bg.class.getName() + ".PREFETCHED_VIDEOS";
        b = bg.class.getName() + ".SEARCH_ID";
        c = bg.class.getName() + "SCRIBED_BUTTON_IMPRESSION";
    }
    
    public bg(final Context context, final AVPlayer e) {
        this.e = e;
        this.f = az.a(context);
        this.g = com.twitter.library.provider.bg.a(context, this.f.b().g());
        long d = this.e.h().getLong(bg.b);
        if (d == 0L) {
            d = this.a();
        }
        this.d = d;
    }
    
    public static g a(final Context context, final Session session, final long n, final Tweet tweet, final int n2) {
        final String a = a(tweet);
        g g = null;
        if (a != null) {
            g = new g(context, session, n, a, 1, "unknown", a, n2, null, false);
        }
        return g;
    }
    
    static String a(final Tweet tweet) {
        String replace = null;
        if (tweet != null) {
            final CardInstanceData w = tweet.W();
            String d;
            if (w != null) {
                d = w.d();
            }
            else {
                d = null;
            }
            replace = null;
            if (d != null) {
                replace = "(card_name:amplify OR card_name:video) AND from:%@".replace("%@", d);
            }
        }
        return replace;
    }
    
    long a() {
        return q.a.nextLong();
    }
    
    public void a(final Context context) {
        if (context != null) {
            final Intent intent = new Intent(context, (Class)ViewMoreVideoActivity.class);
            intent.putExtra("tw", (Parcelable)this.e.q());
            intent.putExtra("search_id", this.d);
            intent.addFlags(67108864);
            context.startActivity(intent);
        }
    }
    
    public void a(final Context context, final bj bj) {
        final int b = this.b();
        if (b == -1) {
            this.b(context, bj);
            return;
        }
        bj.a(b, this.d);
    }
    
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        if (avPlayer$PlayerStartType == AVPlayer$PlayerStartType.a) {
            this.e.h().remove(bg.c);
        }
    }
    
    int b() {
        return this.e.h().getInt(bg.a, -1);
    }
    
    void b(final Context context, final bj bj) {
        final g a = a(context, this.f.b(), this.d, this.e.q(), 0);
        if (a != null) {
            this.g.i(this.d);
            as.a(context).a(a, new bi(this, bj, null));
        }
    }
    
    public void c() {
        final Bundle h = this.e.h();
        if (!h.getBoolean(bg.c, false)) {
            this.e.a("view_more_videos:impression");
            h.putBoolean(bg.c, true);
        }
    }
}
