// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.model.VideoCta;
import com.twitter.library.av.model.b;
import com.twitter.library.av.w;
import com.twitter.library.av.model.Video;
import com.twitter.library.av.model.a;
import android.os.Bundle;
import com.twitter.library.util.d;
import com.twitter.library.util.bq;
import android.os.Build$VERSION;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.c;
import java.util.Collections;
import com.twitter.library.api.PromotedEvent;
import java.util.HashMap;
import java.util.Map;

public class p implements n
{
    static final String a;
    static final Map b;
    static final Map c;
    private final q d;
    
    static {
        a = p.class.getName() + ".KEY_PLAYER_STATE_VIDEO_PLAY_SENT";
        final HashMap<String, PromotedEvent> hashMap = new HashMap<String, PromotedEvent>();
        hashMap.put("playback_0", PromotedEvent.D);
        hashMap.put("playback_start", PromotedEvent.E);
        hashMap.put("playback_25", PromotedEvent.F);
        hashMap.put("playback_50", PromotedEvent.G);
        hashMap.put("playback_75", PromotedEvent.H);
        hashMap.put("playback_95", PromotedEvent.I);
        hashMap.put("playback_100", PromotedEvent.J);
        hashMap.put("playback_complete", PromotedEvent.K);
        hashMap.put("replay", PromotedEvent.Z);
        hashMap.put("cta_app_install_click", PromotedEvent.ab);
        hashMap.put("cta_app_open_click", PromotedEvent.aa);
        hashMap.put("cta_watch_click", PromotedEvent.ad);
        hashMap.put("cta_url_click", PromotedEvent.ac);
        hashMap.put("video_view", PromotedEvent.L);
        hashMap.put("view_threshold", PromotedEvent.M);
        hashMap.put("play_from_tap", PromotedEvent.N);
        b = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final HashMap<String, PromotedEvent> hashMap2 = new HashMap<String, PromotedEvent>();
        hashMap2.put("playback_0", PromotedEvent.O);
        hashMap2.put("playback_start", PromotedEvent.P);
        hashMap2.put("playback_25", PromotedEvent.Q);
        hashMap2.put("playback_50", PromotedEvent.R);
        hashMap2.put("playback_75", PromotedEvent.S);
        hashMap2.put("playback_95", PromotedEvent.T);
        hashMap2.put("playback_100", PromotedEvent.U);
        hashMap2.put("playback_complete", PromotedEvent.V);
        hashMap2.put("cta_app_install_click", PromotedEvent.ab);
        hashMap2.put("cta_app_open_click", PromotedEvent.aa);
        hashMap2.put("cta_watch_click", PromotedEvent.ad);
        hashMap2.put("cta_url_click", PromotedEvent.ac);
        hashMap2.put("video_view", PromotedEvent.W);
        hashMap2.put("view_threshold", PromotedEvent.X);
        hashMap2.put("play_from_tap", PromotedEvent.Y);
        c = Collections.unmodifiableMap((Map<?, ?>)hashMap2);
    }
    
    protected p(final q d) {
        this.d = d;
    }
    
    public p(final c c) {
        this(new q(c));
    }
    
    public static boolean a(final Tweet tweet) {
        return a(tweet, Build$VERSION.SDK_INT);
    }
    
    static boolean a(final Tweet tweet, final int n) {
        return !tweet.H() || !bq.a(n);
    }
    
    @Override
    public void a(final d d) {
        final Tweet d2 = d.d(0);
        final String c = d.c(3);
        final String c2 = d.c(5);
        final Bundle bundle = (Bundle)d.get(4);
        final a a = (a)d.get(9);
        if (d2 == null || d2.j == null) {
            return;
        }
        String c3;
        String b;
        if (a != null) {
            c3 = a.c();
            b = a.b();
        }
        else {
            c3 = null;
            b = null;
        }
        while (true) {
            Label_0199: {
                if (!(a instanceof Video)) {
                    break Label_0199;
                }
                final VideoCta f = ((Video)a).f();
                if (f == null) {
                    break Label_0199;
                }
                final String a2 = f.a();
                final String b2 = f.b();
                final String c4 = f.c();
                final String s = a2;
                if (w.a()) {
                    this.d.a(d2, c, c2, c3, b, s, b2, c4, bundle, (b)d.get(18));
                    return;
                }
                this.d.a(d2, c, c2, c3, b, s, b2, c4, bundle);
                return;
            }
            final String s = null;
            final String b2 = null;
            final String c4 = null;
            continue;
        }
    }
}
