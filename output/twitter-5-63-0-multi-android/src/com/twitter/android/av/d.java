// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeItem;
import android.text.TextUtils;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.av.playback.PlaybackMode;
import java.util.Map;
import com.twitter.library.av.model.b;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import com.twitter.library.client.az;
import com.twitter.library.av.c;
import com.twitter.android.av.audio.a;
import java.util.Set;

public class d
{
    static final Set a;
    private final a b;
    private final dv c;
    private final c d;
    private final az e;
    
    static {
        final HashSet<String> set = new HashSet<String>();
        set.add("playback_0");
        set.add("playback_start");
        set.add("playback_25");
        set.add("playback_50");
        set.add("playback_75");
        set.add("playback_95");
        set.add("playback_100");
        set.add("playback_complete");
        set.add("replay");
        set.add("play");
        set.add("resume");
        set.add("rewind");
        set.add("pause");
        set.add("error");
        set.add("dock");
        set.add("undock");
        set.add("reply");
        set.add("unfavorite");
        set.add("favorite");
        set.add("share");
        set.add("unretweet");
        set.add("retweet");
        set.add("quote");
        set.add("playback_lapse");
        a = Collections.unmodifiableSet((Set<?>)set);
    }
    
    public d(final Context context) {
        this(new a(), new dv(context), new g(null), az.a(context));
    }
    
    d(final a b, final dv c, final c d, final az e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    static String a(final TwitterScribeAssociation twitterScribeAssociation) {
        if (twitterScribeAssociation != null) {
            return twitterScribeAssociation.a();
        }
        return "tweet";
    }
    
    public void a(final Context context, final TwitterScribeAssociation twitterScribeAssociation, final Object o) {
        final com.twitter.library.util.d d = (com.twitter.library.util.d)o;
        this.a(new com.twitter.android.av.c().a(context).a(d.d(0)).a(twitterScribeAssociation).a(d.c(7)).a((int)d.b(8)).a((b)d.get(18)).a((com.twitter.library.av.model.a)d.get(9)).a((Map)d.get(22)).b(d.b(11)).a((boolean)d.a(12)).b(d.c(13)).a((Boolean)d.get(15, (Object)null)).c(d.c(16)).a((Long)d.get(17, (Object)null)).a((PlaybackMode)d.get(23, (Object)null)).a((Integer)d.get(24, (Object)null)).b((Long)d.get(2, (Object)null)).a());
    }
    
    protected void a(final com.twitter.android.av.a a) {
        final f a2 = this.b.a(a.b);
        final String a3 = a(a.c);
        if (this.a(a.d, a2)) {
            String s;
            if (a.i == 2) {
                s = "2";
            }
            else {
                s = "1";
            }
            final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.e.b().g()).b(a3, "", this.c(a.d, a2), a.d);
            final TwitterScribeItem a4 = a2.a(a);
            if (a.k != null) {
                String k;
                if (TextUtils.isEmpty((CharSequence)a.k)) {
                    k = null;
                }
                else {
                    k = a.k;
                }
                a4.L = k;
            }
            if (a.n != null) {
                a4.R = a.n;
            }
            if (a.q != null) {
                a4.O = a.q;
            }
            a4.Q = a.m;
            twitterScribeLog.a(a4);
            twitterScribeLog.i(s);
            this.d.a(a.a, twitterScribeLog);
        }
        if (this.b(a.d, a2)) {
            this.c.a(a.a, a.d, a.f, a.g, a3);
        }
    }
    
    protected boolean a(final String s, final f f) {
        return com.twitter.android.av.d.a.contains(s) || f.a(s);
    }
    
    protected boolean b(final String s, final f f) {
        return com.twitter.android.av.d.a.contains(s) || f.b(s);
    }
    
    String c(final String s, final f f) {
        if (!s.contains(":")) {
            return String.format("tweet:%s", f.a());
        }
        return "tweet";
    }
}
