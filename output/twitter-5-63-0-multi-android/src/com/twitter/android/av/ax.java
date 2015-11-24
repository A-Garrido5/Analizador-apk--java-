// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.model.VideoCta;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.av.model.Video;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.av.model.a;
import com.twitter.library.av.model.c;
import com.twitter.library.av.w;
import com.twitter.library.av.model.b;
import com.twitter.library.scribe.TwitterScribeItem;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ax implements f
{
    static final Set a;
    
    static {
        final HashSet<String> set = new HashSet<String>();
        set.add("show");
        set.add("open");
        set.add("view_more_videos:impression");
        set.add("cta_app_open_impression");
        set.add("cta_app_install_impression");
        set.add("cta_url_impression");
        set.add("cta_watch_impression");
        set.add("cta_app_open_click");
        set.add("cta_app_install_click");
        set.add("cta_url_click");
        set.add("cta_watch_click");
        set.add("buffer");
        set.add("view_threshold");
        set.add("play_from_tap");
        set.add("video_view");
        a = Collections.unmodifiableSet((Set<?>)set);
    }
    
    public static void a(final TwitterScribeItem twitterScribeItem, final b b) {
        if (!w.a()) {
            return;
        }
        final a a = c.a(b);
        if (a != null) {
            twitterScribeItem.ah = a.c();
            twitterScribeItem.ai = a.e();
        }
        mc i;
        if (b != null) {
            i = b.i();
        }
        else {
            i = null;
        }
        int b2;
        if (i != null) {
            b2 = i.b;
        }
        else {
            b2 = -1;
        }
        twitterScribeItem.ag = b2;
    }
    
    @Override
    public TwitterScribeItem a(final com.twitter.android.av.a a) {
        TwitterScribeItem a3;
        if (a.g != null) {
            final TwitterScribeItem a2 = TwitterScribeItem.a(a.a, a.b, null, null, a.e, a.g.c(), a.g.b(), a.g.e(), a.j, a.l, a.n);
            if (a.g instanceof Video) {
                final VideoCta f = ((Video)a.g).f();
                if (f != null) {
                    a2.aa = f.a();
                    a2.ab = f.b();
                    a2.ac = f.c();
                }
                a3 = a2;
            }
            else {
                a3 = a2;
            }
        }
        else {
            if (a.b != null) {
                a3 = TwitterScribeItem.a(a.a, a.b, a.c, null);
            }
            else {
                a3 = new TwitterScribeItem();
            }
            TwitterScribeLog.a(a.b, a3);
        }
        int ae;
        if (a.o != null && a.o == PlaybackMode.d) {
            ae = 1;
        }
        else {
            ae = 2;
        }
        a3.ae = ae;
        if (a.p != null) {
            a3.af = a.p;
        }
        a(a3, a.f);
        return a3;
    }
    
    @Override
    public String a() {
        return "platform_amplify_card";
    }
    
    @Override
    public boolean a(final String s) {
        return ax.a.contains(s);
    }
    
    @Override
    public boolean b(final String s) {
        return this.a(s);
    }
}
