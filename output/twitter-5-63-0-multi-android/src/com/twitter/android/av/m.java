// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.featureswitch.d;
import com.twitter.library.provider.Tweet;
import java.util.Collections;
import com.twitter.library.api.PromotedEvent;
import java.util.HashMap;
import com.twitter.android.client.c;
import java.util.Map;

public class m implements n
{
    static final Map a;
    static final Map b;
    private final c c;
    
    static {
        final HashMap<String, PromotedEvent> hashMap = new HashMap<String, PromotedEvent>();
        hashMap.put("playback_0", PromotedEvent.w);
        hashMap.put("playback_start", PromotedEvent.w);
        hashMap.put("playback_25", PromotedEvent.x);
        hashMap.put("playback_50", PromotedEvent.y);
        hashMap.put("playback_75", PromotedEvent.z);
        hashMap.put("playback_100", PromotedEvent.A);
        hashMap.put("playback_complete", PromotedEvent.A);
        hashMap.put("replay", PromotedEvent.B);
        hashMap.put("click", PromotedEvent.v);
        a = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final HashMap<String, PromotedEvent> hashMap2 = new HashMap<String, PromotedEvent>();
        hashMap2.put("replay", PromotedEvent.p);
        hashMap2.put("click", PromotedEvent.p);
        b = Collections.unmodifiableMap((Map<?, ?>)hashMap2);
    }
    
    public m(final c c) {
        this.c = c;
    }
    
    private void a(final Tweet tweet, final String s) {
        PromotedEvent promotedEvent;
        if (a()) {
            promotedEvent = m.a.get(s);
        }
        else {
            promotedEvent = m.b.get(s);
        }
        if (promotedEvent != null && tweet.j != null) {
            this.c.a(promotedEvent, tweet.j, null, null, null, "audio", null, null, null);
        }
    }
    
    private static boolean a() {
        return d.f("audio_configurations_custom_promoted_logging_enabled");
    }
    
    @Override
    public void a(final com.twitter.library.util.d d) {
        final Tweet d2 = d.d(0);
        final String c = d.c(3);
        if (d2 != null) {
            this.a(d2, c);
        }
    }
}
