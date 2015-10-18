// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import java.util.Map;
import com.twitter.library.av.model.Audio;
import com.twitter.library.av.model.AudioPlaylist;
import com.twitter.library.scribe.TwitterScribeItem;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class r implements f
{
    static final Set a;
    static final Set b;
    
    static {
        final HashSet<String> set = new HashSet<String>();
        set.add("playlist_start");
        set.add("click");
        set.add("cta_impression_signup");
        set.add("cta_impression_open");
        set.add("cta_click_signup");
        set.add("cta_click_open");
        a = Collections.unmodifiableSet((Set<?>)set);
        final HashSet<String> set2 = new HashSet<String>();
        set2.add("close");
        set2.add("checkpoint");
        b = Collections.unmodifiableSet((Set<?>)set2);
    }
    
    @Override
    public TwitterScribeItem a(final a a) {
        final TwitterScribeItem a2 = TwitterScribeItem.a(a.a, a.b, a.c, null);
        if (a.f instanceof AudioPlaylist) {
            this.a(((AudioPlaylist)a.f).k(), a2);
            if (a.g instanceof Audio) {
                final Audio audio = (Audio)a.g;
                a2.W = audio.i();
                a2.Y = audio.c();
            }
            a2.X = ((AudioPlaylist)a.f).j();
            a2.Z = a.e;
            return a2;
        }
        this.a(a.h, a2);
        return a2;
    }
    
    @Override
    public String a() {
        return "platform_audio_card";
    }
    
    protected void a(final Map map, final TwitterScribeItem twitterScribeItem) {
        if (map != null) {
            twitterScribeItem.N = map.get("playlist_url");
            twitterScribeItem.S = map.get("artist_name");
            twitterScribeItem.T = map.get("integration_partner");
            twitterScribeItem.V = map.get("image_url");
            twitterScribeItem.U = map.get("card_title");
        }
    }
    
    @Override
    public boolean a(final String s) {
        return r.a.contains(s);
    }
    
    @Override
    public boolean b(final String s) {
        return this.a(s) || r.b.contains(s);
    }
}
