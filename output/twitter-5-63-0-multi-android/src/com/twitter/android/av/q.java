// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.av.model.b;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.av.w;
import com.twitter.library.av.e;
import android.os.Bundle;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.c;

public class q
{
    private final c a;
    
    protected q(final c a) {
        this.a = a;
    }
    
    private void a(final Tweet tweet, final String s, final String s2, final Bundle bundle, final e e) {
        if ("playback_0".equals(s) && !bundle.getBoolean(p.a)) {
            bundle.putBoolean(p.a, true);
            String a = null;
            if (e != null) {
                final boolean a2 = w.a();
                a = null;
                if (a2) {
                    a = e.a();
                }
            }
            this.a.a(PromotedEvent.C, tweet.j, s2, a);
        }
    }
    
    PromotedEvent a(final String s, final String s2) {
        if (!t.a() || !"replay".equals(s)) {
            if ("video".equals(s2)) {
                return p.b.get(s);
            }
            if ("ad".equals(s2)) {
                return p.c.get(s);
            }
        }
        return null;
    }
    
    public void a(final Tweet tweet, final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final Bundle bundle) {
        final PromotedEvent a = this.a(s, s4);
        this.a(tweet, s, s2, bundle, null);
        if (a != null) {
            String s8;
            String s9;
            String s10;
            if (PromotedEvent.ac.equals(a) || PromotedEvent.ad.equals(a)) {
                s8 = null;
                s9 = null;
                s10 = s5;
            }
            else if (PromotedEvent.ab.equals(a) || PromotedEvent.aa.equals(a)) {
                s9 = s7;
                s8 = s6;
                s10 = null;
            }
            else {
                s10 = null;
                s8 = null;
                s9 = null;
            }
            this.a.a(a, tweet.j, null, s2, s3, s4, s10, s8, s9);
        }
    }
    
    protected void a(final Tweet tweet, final String s, final String h, final String a, final String b, String c, String d, String e, final Bundle bundle, final b b2) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        ax.a(twitterScribeItem, b2);
        TwitterScribeLog.a(tweet, twitterScribeItem);
        final e e2 = new e();
        e2.a = a;
        e2.b = b;
        e2.j = twitterScribeItem.ag;
        e2.f = twitterScribeItem.ah;
        e2.i = twitterScribeItem.ai;
        e2.g = twitterScribeItem.M;
        this.a(tweet, s, e2.h = h, bundle, e2);
        final PromotedEvent a2 = this.a(s, b);
        if (a2 != null) {
            if (PromotedEvent.ac.equals(a2) || PromotedEvent.ad.equals(a2)) {
                d = null;
                e = null;
            }
            else if (PromotedEvent.ab.equals(a2) || PromotedEvent.aa.equals(a2)) {
                c = null;
            }
            else {
                c = null;
                d = null;
                e = null;
            }
            e2.d = d;
            e2.e = e;
            e2.c = c;
            this.a.a(a2, tweet.j, h, e2.a());
        }
    }
}
