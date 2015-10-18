// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.content.Context;
import com.twitter.library.av.playback.c;
import com.twitter.library.av.playback.a;

public class au implements a
{
    public static final c a;
    private final Context c;
    private final o d;
    private final d e;
    private final Tweet f;
    
    static {
        a = new av();
    }
    
    public au(final Context context, final Tweet tweet) {
        this(context, tweet, new o(com.twitter.android.client.c.a(context)), new d(context));
    }
    
    au(final Context context, final Tweet f, final o d, final d e) {
        this.c = context.getApplicationContext();
        this.f = f;
        this.e = e;
        this.d = d;
    }
    
    @Override
    public boolean a(final String s, final com.twitter.library.util.d d, final TwitterScribeAssociation twitterScribeAssociation) {
        switch (s) {
            default: {
                return false;
            }
            case "AVPlayer.EVENT_PROMOTED_LOGGING_EVENT": {
                this.d.a(this.f).a(d);
                break;
            }
            case "AVPlayer.EVENT_LOG_ANALYTICS_EVENT": {
                this.e.a(this.c, twitterScribeAssociation, d);
                break;
            }
        }
        return true;
    }
}
