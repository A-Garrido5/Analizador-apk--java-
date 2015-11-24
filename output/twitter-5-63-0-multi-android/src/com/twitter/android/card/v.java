// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.api.PromotedContent;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bq;
import com.twitter.internal.network.l;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.api.b;
import com.twitter.library.client.u;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.NativeCardEvent;
import android.text.TextUtils;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.NativeCardUserAction;
import com.twitter.library.client.az;
import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Context;
import com.twitter.android.client.c;

public class v implements t
{
    private final c a;
    private final Context b;
    private final long c;
    private TwitterScribeAssociation d;
    private TwitterScribeAssociation e;
    private String f;
    private String g;
    private Tweet h;
    private vc i;
    
    public v(final Context context) {
        this(context, com.twitter.android.client.c.a(context), az.a(context).b().g());
    }
    
    v(final Context b, final c a, final long c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    private TwitterScribeLog a(final String s, final NativeCardUserAction nativeCardUserAction) {
        return (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.c).b("profile", null, "spotlight", "platform_card", s)).a(this.b, "app", this.i).a(this.f, nativeCardUserAction, this.g).i(this.d());
    }
    
    private String a(final NativeCardUserAction nativeCardUserAction) {
        if (nativeCardUserAction == null && TextUtils.isEmpty((CharSequence)this.f)) {
            return null;
        }
        final NativeCardEvent nativeCardEvent = new NativeCardEvent(this.f);
        nativeCardEvent.a(this.g);
        if (nativeCardUserAction != null) {
            nativeCardEvent.a(nativeCardUserAction);
        }
        return nativeCardEvent.toString();
    }
    
    private TwitterScribeLog d(final String s, final String s2, final NativeCardUserAction nativeCardUserAction) {
        if (this.i != null) {
            return this.a(s, nativeCardUserAction);
        }
        return this.e(s, s2, nativeCardUserAction);
    }
    
    private TwitterScribeLog e(final String s, final String s2, final NativeCardUserAction nativeCardUserAction) {
        String a;
        if (this.d != null) {
            a = this.d.a();
        }
        else {
            a = "tweet";
        }
        return (TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.c).a(this.b, this.h, this.d, null).b(a, null, Tweet.b(this.h), s2, s)).a(this.d)).a(this.f, nativeCardUserAction, this.g).i(this.d());
    }
    
    private TwitterScribeLog f(final String s, final String s2, final NativeCardUserAction nativeCardUserAction) {
        return (TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.c).a(this.b, this.h, this.d, null).b(new String[] { ScribeLog.a("tweet::tweet", s2, s) })).c(new String[] { "tweet::tweet::impression" })).a(this.e)).a(this.f, nativeCardUserAction, this.g).i(this.d());
    }
    
    private TwitterScribeLog h(final String s, final String s2) {
        return this.d(s, s2, null);
    }
    
    private TwitterScribeLog i(final String s, final String s2) {
        return this.f(s, s2, null);
    }
    
    @Override
    public TwitterScribeAssociation a() {
        return this.d;
    }
    
    TwitterScribeLog a(final String s, final String s2, final String s3) {
        final String a = bj.a();
        final b a2 = u.a.a();
        final String g = this.g(s, a);
        final TwitterScribeLog h = this.h(s2, s3);
        h.f("app_download_client_event");
        if (a != null) {
            h.a("4", a);
        }
        if (g != null) {
            h.a("3", g);
        }
        if (a2 != null) {
            h.a("6", a2.a());
            h.a(a2.b());
        }
        return h;
    }
    
    @Override
    public void a(final long n, final String s, final NativeCardUserAction nativeCardUserAction) {
        String a;
        if (this.d != null) {
            a = this.d.a();
        }
        else {
            a = "tweet";
        }
        this.a.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.c).a(this.b, this.h, this.d, null).a(TwitterScribeItem.a(n))).b(new String[] { a + "::tweet:" + s + ":" + "open_commerce_collection" })).a(this.f, nativeCardUserAction, this.g).a(this.d));
    }
    
    @Override
    public void a(final long n, final String s, final String s2) {
        this.a.a(this.d(s, s2, null));
    }
    
    @Override
    public void a(final PromotedEvent promotedEvent) {
        this.a(promotedEvent, null);
    }
    
    @Override
    public void a(final PromotedEvent promotedEvent, final NativeCardUserAction nativeCardUserAction) {
        if (this.h != null && this.h.j != null) {
            this.a.a(promotedEvent, this.h.j, this.a(nativeCardUserAction));
        }
    }
    
    @Override
    public void a(final Tweet h) {
        this.h = h;
    }
    
    @Override
    public void a(final TwitterScribeAssociation d) {
        this.d = d;
    }
    
    @Override
    public void a(final String f) {
        this.f = f;
    }
    
    @Override
    public void a(final String s, final l l) {
        if (l == null) {
            return;
        }
        this.a.a(((TwitterScribeLog)new TwitterScribeLog(this.c).b(new String[] { "api::::card_request" })).a(s, l));
    }
    
    @Override
    public void a(final String s, final String s2) {
        this.b(s, s2, null);
    }
    
    @Override
    public void a(final String s, final String s2, final NativeCardUserAction nativeCardUserAction) {
        this.a.a(this.d(s, s2, nativeCardUserAction));
    }
    
    @Override
    public void a(final vc i) {
        this.i = i;
    }
    
    @Override
    public Tweet b() {
        return this.h;
    }
    
    @Override
    public void b(final TwitterScribeAssociation e) {
        this.e = e;
    }
    
    @Override
    public void b(final String s) {
        this.a.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.c).a(this.b, this.h, this.d, null).b(new String[] { "tweet:::platform_promotion_card:open_link" })).a(this.d)).b(s, null)).e(null)).i(this.d()));
    }
    
    @Override
    public void b(final String s, final String s2) {
        this.c(s, s2, null);
    }
    
    @Override
    public void b(final String s, final String s2, final NativeCardUserAction nativeCardUserAction) {
        final TwitterScribeLog d = this.d(s, s2, nativeCardUserAction);
        final TwitterScribeItem twitterScribeItem = (TwitterScribeItem)d.c();
        if (twitterScribeItem == null) {
            return;
        }
        final String n = twitterScribeItem.n;
        final String a = bj.a();
        final b a2 = u.a.a();
        final String g = this.g(n, a);
        if (g != null) {
            d.a("3", g);
        }
        this.a.a(d);
        final TwitterScribeLog d2 = this.d(s, s2, nativeCardUserAction);
        d2.f("app_download_client_event");
        if (a != null) {
            d2.a("4", a);
        }
        if (g != null) {
            d2.a("3", g);
        }
        if (a2 != null) {
            d2.a("6", a2.a());
            d2.a(a2.b());
        }
        this.a.b(d2);
    }
    
    @Override
    public void c() {
        this.a.a(this.h("tweet", "click"));
    }
    
    @Override
    public void c(final String g) {
        this.g = g;
    }
    
    @Override
    public void c(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.a.a(this.h(s2, s));
        }
    }
    
    @Override
    public void c(final String s, final String s2, final NativeCardUserAction nativeCardUserAction) {
        this.a.a(this.d(s, s2, nativeCardUserAction));
    }
    
    String d() {
        if (com.twitter.util.c.g(this.b)) {
            return "2";
        }
        return "1";
    }
    
    @Override
    public void d(final String s, final String s2) {
        final TwitterScribeLog i = this.i(s, s2);
        this.a.a(i);
        final TwitterScribeItem twitterScribeItem = (TwitterScribeItem)i.c();
        if (twitterScribeItem != null) {
            final String n = twitterScribeItem.n;
            final String a = bj.a();
            final b a2 = u.a.a();
            if (!TextUtils.isEmpty((CharSequence)n) && !TextUtils.isEmpty((CharSequence)a)) {
                final TwitterScribeLog j = this.i(s, s2);
                j.f("app_download_client_event");
                j.a("4", a);
                j.a("3", bq.a(n, a));
                if (a2 != null) {
                    j.a("6", a2.a());
                    j.a(a2.b());
                }
                this.a.a(j);
            }
        }
    }
    
    @Override
    public void e(final String s, final String s2) {
        final TwitterScribeLog f = this.f("installed_app", s2);
        final TwitterScribeLog a = this.a(s, "installed_app", s2);
        final long n = com.twitter.library.featureswitch.d.a("post_installed_logging_timeframe", 1800000);
        final long n2 = com.twitter.library.featureswitch.d.a("post_installed_logging_polling_interval", 600000);
        final c a2 = this.a;
        final Context b = this.b;
        PromotedContent j;
        if (this.h != null) {
            j = this.h.j;
        }
        else {
            j = null;
        }
        a2.b(b, s, f, a, j, System.currentTimeMillis(), n, n2);
    }
    
    TwitterScribeLog f(final String s, final String s2) {
        final TwitterScribeLog h = this.h(s, s2);
        final TwitterScribeItem twitterScribeItem = (TwitterScribeItem)h.c();
        if (twitterScribeItem == null) {
            return null;
        }
        final String g = this.g(twitterScribeItem.n, bj.a());
        if (g != null) {
            h.a("3", g);
        }
        return h;
    }
    
    String g(final String s, final String s2) {
        if (TextUtils.isEmpty((CharSequence)s) || TextUtils.isEmpty((CharSequence)s2)) {
            return null;
        }
        return bq.a(s, s2);
    }
}
