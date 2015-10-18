// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.content.SharedPreferences;
import com.twitter.library.service.ab;
import com.twitter.internal.network.j;
import com.twitter.library.network.t;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.g;
import android.text.TextUtils;
import org.apache.http.message.BasicNameValuePair;
import com.twitter.library.client.App;
import com.twitter.library.provider.b;
import com.twitter.internal.network.HttpOperation;
import java.util.HashSet;
import com.twitter.library.network.ae;
import com.twitter.internal.android.service.a;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.api.ar;
import com.twitter.internal.android.service.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import com.twitter.library.media.model.MediaFile;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.List;
import com.twitter.library.service.aa;
import com.twitter.library.api.upload.q;
import com.twitter.library.api.upload.k;
import com.twitter.library.api.upload.s;
import android.util.Pair;
import com.twitter.library.api.upload.d;
import com.twitter.library.service.u;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.m;
import com.twitter.library.service.l;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import com.twitter.library.media.model.EditableMedia;
import java.util.Set;
import com.twitter.library.api.upload.ag;

public abstract class bd extends ag
{
    private static final int e;
    private static final int f;
    private static final int g;
    public aw a;
    private boolean h;
    private String i;
    private Set n;
    private DMLocalMessageEntry r;
    private EditableMedia s;
    
    static {
        e = (int)TimeUnit.SECONDS.toMillis(1L);
        f = (int)TimeUnit.SECONDS.toMillis(30L);
        g = (int)TimeUnit.MINUTES.toMillis(5L);
    }
    
    public bd(final Context context, final String s, final Session session) {
        super(context, s, session);
        final l a = new l().a(new m(context));
        a.a(new u(bd.e, bd.f, bd.g));
        this.a(a);
    }
    
    private Pair a(final EditableMedia editableMedia, final d d) {
        final q a = com.twitter.library.api.upload.s.a(this.p, editableMedia, false);
        final k k = new k(this.p, this.P());
        k.a(a).b(d).g(6);
        final aa a2 = this.a(k);
        long g;
        if (a2.a()) {
            g = k.g();
        }
        else {
            g = 0L;
        }
        return new Pair((Object)g, (Object)a2);
    }
    
    private Pair a(final EditableMedia editableMedia, final List list, final boolean b) {
        final long c = this.P().c;
        final d a = new d(this.p).b(this.h).a(b);
        Pair pair;
        if (editableMedia != null) {
            pair = this.a(editableMedia, a);
        }
        else if (list != null) {
            pair = this.a(list, a);
        }
        else {
            pair = null;
        }
        if (pair != null && !((aa)pair.second).a()) {
            final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(c);
            final String[] array = { "app:twitter_service:direct_messages", null, null };
            String s;
            if (b) {
                s = "retry_dm";
            }
            else {
                s = "send_dm";
            }
            array[1] = s;
            array[2] = "failure";
            final TwitterScribeLog twitterScribeLog2 = (TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)twitterScribeLog.b(array)).g("has_media")).b(6);
            if (this.h) {
                twitterScribeLog2.c(2);
            }
            twitterScribeLog2.c("Upload Media Failed");
            String s2;
            if (TelephonyUtil.c(this.p)) {
                s2 = "connected";
            }
            else {
                s2 = "disconnected";
            }
            twitterScribeLog2.d(s2);
            ScribeService.a(this.p, twitterScribeLog2);
        }
        return pair;
    }
    
    private Pair a(final List list, final d d) {
        final com.twitter.library.api.upload.u u = new com.twitter.library.api.upload.u(this.p, this.P(), 1, list);
        u.a(d).g(6);
        final aa a = this.a(u);
        final LinkedHashMap az_ = u.az_();
        long longValue;
        if (a.a() && az_ != null) {
            longValue = (long)CollectionUtils.a((Iterable)az_.keySet());
        }
        else {
            longValue = 0L;
        }
        if (az_ != null) {
            final Iterator<MediaFile> iterator = az_.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
            }
        }
        return new Pair((Object)longValue, (Object)a);
    }
    
    private void a(final x x, final boolean b) {
        final aa aa = (aa)x.b();
        boolean a = aa.a();
        if (!a) {
            a = (aa.c() == 403);
        }
        ar.a(this.p, "app:twitter_service:direct_messages:create", this.P().c, a, x, b);
    }
    
    private void a(final TwitterScribeLog twitterScribeLog, final com.twitter.internal.network.l l, final boolean b) {
        if (l == null) {
            return;
        }
        if (this.h) {
            twitterScribeLog.c(2);
        }
        String s;
        if (b) {
            s = "has_media";
        }
        else {
            s = "no_media";
        }
        twitterScribeLog.g(s);
        twitterScribeLog.b(TwitterScribeLog.b(l));
        TwitterScribeLog.a(this.p, twitterScribeLog, l);
        ScribeService.a(this.p, twitterScribeLog);
    }
    
    @Override
    public void a(final x x) {
        this.a(x, false);
        final HttpOperation e = ((aa)x.b()).e();
        final com.twitter.library.provider.bg v = this.V();
        final b w = this.W();
        if (e != null && e.k()) {
            this.a = (aw)((bg)e.q()).a();
            final DMMessageEntry g = this.a.g();
            long sortId;
            if (this.b()) {
                sortId = g.id;
            }
            else {
                sortId = this.r.id;
            }
            g.sortId = sortId;
            v.a(this.r, g, this.a, w);
            w.a();
            this.i = g.conversationId;
            if (this.s != null) {
                this.s.f();
            }
            final List a = this.a.a;
            if (!a.isEmpty()) {
                final ArrayList list = new ArrayList<Long>(a.size());
                final Iterator<com.twitter.library.api.conversations.k> iterator = a.iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().a);
                }
                v.a(this.i, CollectionUtils.c(list), w);
            }
            this.b(new ai(this.p, this.P()));
        }
        else {
            if (this.r != null) {
                v.a(this.r, 2, w);
                w.a();
            }
            List list2;
            if (e == null) {
                list2 = null;
            }
            else {
                list2 = (ArrayList)((bg)e.q()).a();
            }
            final int[] a2 = ae.a(list2);
            this.n = new HashSet(a2.length);
            for (int length = a2.length, i = 0; i < length; ++i) {
                this.n.add(a2[i]);
            }
            if ((this.n.contains(150) || this.n.contains(349)) && this.r != null && this.r.e()) {
                v.d(this.r.conversationId, true, w);
                w.a();
            }
        }
    }
    
    protected void a(final DMLocalMessageEntry r, final EditableMedia s, final aa aa, final DMTweet dmTweet) {
        this.r = r;
        this.s = s;
        final ab p4 = this.P();
        String s2 = this.q.d;
        if (App.f()) {
            final SharedPreferences sharedPreferences = this.p.getSharedPreferences("debug_prefs", 0);
            if (sharedPreferences.getBoolean("dm_staging_enabled", false)) {
                s2 = sharedPreferences.getString("dm_staging_host", (String)null);
            }
        }
        final StringBuilder append = ae.a(s2, "1.1", "dm", "new").append(".json");
        final ArrayList<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
        final com.twitter.library.provider.bg v = this.V();
        if (r.e()) {
            list.add(new BasicNameValuePair("conversation_id", String.valueOf(r.conversationId)));
        }
        else {
            final List b = v.b(r.conversationId);
            if (b.size() > 1) {
                b.remove(p4.c);
            }
            list.add(new BasicNameValuePair("recipient_ids", TextUtils.join((CharSequence)",", (Iterable)b)));
        }
        list.add(new BasicNameValuePair("text", r.text));
        list.add(new BasicNameValuePair("request_id", r.requestId));
        final boolean b2 = s != null;
        if (b2) {
            final Pair a = this.a(s, null, this.b());
            final long longValue = (long)a.first;
            final aa aa2 = (aa)a.second;
            if (!aa2.a()) {
                aa.a(aa2);
                return;
            }
            list.add(new BasicNameValuePair("media_id", String.valueOf(longValue)));
        }
        if (dmTweet != null && dmTweet.tweetId != -1L) {
            list.add(new BasicNameValuePair("tweet_id", String.valueOf(dmTweet.tweetId)));
            if (dmTweet.quotedTweetData.promotedContent != null) {
                list.add(new BasicNameValuePair("impression_id", dmTweet.quotedTweetData.promotedContent.impressionId));
            }
        }
        list.add(new BasicNameValuePair("include_cards", String.valueOf(true)));
        list.add(new BasicNameValuePair("cards_platform", "Android-12"));
        list.add(new BasicNameValuePair("dm_users", String.valueOf(true)));
        final HttpOperation c = new g(this.p, append.toString()).a(HttpOperation$RequestMethod.b).a(new t(p4.d)).a(list).a(bg.a(73)).a(this.k).a(false).a().c();
        final com.twitter.internal.network.l l = c.l();
        if (l != null) {
            final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(p4.c);
            final String[] array = { "app:twitter_service:direct_messages", null, null };
            String s3;
            if (this.b()) {
                s3 = "retry_dm";
            }
            else {
                s3 = "send_dm";
            }
            array[1] = s3;
            String s4;
            if (l.a == 200) {
                s4 = "success";
            }
            else {
                s4 = "failure";
            }
            array[2] = s4;
            this.a((TwitterScribeLog)twitterScribeLog.b(array), l, b2);
            aa.a(c);
            return;
        }
        aa.a(false);
    }
    
    protected void a(final boolean h) {
        this.h = h;
    }
    
    @Override
    public void b(final x x) {
        this.a(x, this.h = true);
    }
    
    public abstract boolean b();
    
    public String e() {
        return this.i;
    }
    
    public Set f() {
        return this.n;
    }
    
    public long g() {
        if (this.r == null) {
            return -1L;
        }
        return this.r.id;
    }
}
