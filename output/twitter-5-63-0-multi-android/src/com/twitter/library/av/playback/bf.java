// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.util.bk;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.card.property.Vector2F;
import com.twitter.library.card.property.ImageSpec;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.MediaVideoInfo;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.api.MediaVideoVariant;
import com.twitter.library.av.model.factory.VideoPlaylistFactory;
import com.twitter.library.av.model.factory.c;
import com.twitter.library.media.util.q;
import com.twitter.library.av.model.factory.a;
import com.twitter.library.provider.Tweet;

public class bf
{
    public static int a(final Tweet tweet) {
        if (d(tweet) != null) {
            return 0;
        }
        if (e(tweet) != null) {
            return 1;
        }
        return -1;
    }
    
    public static a b(final Tweet tweet) {
        if (tweet != null) {
            switch (a(tweet)) {
                case 0: {
                    return new c(q.c(tweet.R()));
                }
                case 1: {
                    return new VideoPlaylistFactory();
                }
            }
        }
        return null;
    }
    
    public static String c(final Tweet tweet) {
        if (tweet != null) {
            switch (a(tweet)) {
                case 0: {
                    return d(tweet);
                }
                case 1: {
                    return e(tweet);
                }
            }
        }
        return null;
    }
    
    static String d(final Tweet tweet) {
        MediaEntity c;
        if (tweet.R() != null) {
            c = q.c(tweet.R());
        }
        else {
            c = null;
        }
        String url = null;
        if (c != null) {
            final MediaVideoInfo videoInfo = c.videoInfo;
            url = null;
            if (videoInfo != null) {
                final int size = c.videoInfo.variants.size();
                url = null;
                if (size > 0) {
                    url = c.videoInfo.variants.get(0).url;
                }
            }
        }
        return url;
    }
    
    static String e(final Tweet tweet) {
        final CardInstanceData w = tweet.W();
        if (w != null) {
            return w.g();
        }
        return null;
    }
    
    public static ImageSpec f(final Tweet tweet) {
        final CardInstanceData w = tweet.W();
        ImageSpec j;
        if (w != null) {
            j = w.j();
        }
        else {
            MediaEntity c;
            if (tweet.R() != null) {
                c = q.c(tweet.R());
            }
            else {
                c = null;
            }
            j = null;
            if (c != null) {
                final ImageSpec imageSpec = new ImageSpec();
                imageSpec.url = c.mediaUrl;
                imageSpec.size = new Vector2F(c.size.a(), c.size.b());
                return imageSpec;
            }
        }
        return j;
    }
    
    public static String g(final Tweet tweet) {
        float durationSeconds = -1.0f;
        MediaEntity c;
        if (tweet.R() != null) {
            c = q.c(tweet.R());
        }
        else {
            c = null;
        }
        final CardInstanceData w = tweet.W();
        Label_0042: {
            if (c != null && c.videoInfo != null) {
                durationSeconds = c.videoInfo.durationSeconds;
            }
            else if (w != null) {
                final String a = w.a("content_duration_seconds");
                Label_0110: {
                    if (a == null) {
                        break Label_0110;
                    }
                    try {
                        float floatValue = Float.valueOf(a);
                        while (true) {
                            durationSeconds = floatValue;
                            break Label_0042;
                            floatValue = durationSeconds;
                            continue;
                        }
                    }
                    catch (NumberFormatException ex) {
                        ErrorReporter.a(ex);
                    }
                }
            }
        }
        final float n = fcmpl(durationSeconds, 0.0f);
        String a2 = null;
        if (n > 0) {
            a2 = bk.a((long)(1000.0f * durationSeconds));
        }
        return a2;
    }
}
