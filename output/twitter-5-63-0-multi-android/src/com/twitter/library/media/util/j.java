// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import java.util.Iterator;
import com.twitter.library.api.TweetMediaFace;
import android.graphics.RectF;
import java.util.List;
import com.twitter.util.g;

public class j
{
    private static float a(final float n, final float n2, final float n3) {
        final float n4 = n2 / 3.0f;
        float max;
        if (n < n4) {
            max = 0.0f;
        }
        else if (n > 1.0f - n4) {
            max = 1.0f - n2;
        }
        else if (n > n3) {
            max = n - n4 * 2.0f;
            if (max < 0.0f) {
                max = 1.0f - n2;
            }
        }
        else {
            max = Math.max(0.0f, n - n4);
        }
        return g.a(max, 0.0f, 1.0f - n2);
    }
    
    public static RectF a(final float n, final float n2, final List list) {
        final float min = Math.min(n / n2, 1.0f);
        final float min2 = Math.min(n2 / n, 1.0f);
        float a = (1.0f - min) / 2.0f;
        float a2 = (1.0f - min2) / 2.0f;
        if (!list.isEmpty() && (a != 0.0f || a2 != 0.0f)) {
            final TweetMediaFace a3 = a(list);
            if (a2 != 0.0f) {
                a2 = a(a3.y + 0.38f * a3.h, min2, 1.0f - 2.0f * min2 / 3.0f);
            }
            else {
                a = a(a3.x + 0.5f * a3.w, min, 0.5f);
            }
        }
        return new RectF(a, a2, min + a, min2 + a2);
    }
    
    private static TweetMediaFace a(final List list) {
        final TweetMediaFace tweetMediaFace = list.get(0);
        float n = tweetMediaFace.w * tweetMediaFace.h;
        final Iterator<TweetMediaFace> iterator = list.iterator();
        TweetMediaFace tweetMediaFace2 = tweetMediaFace;
        while (iterator.hasNext()) {
            final TweetMediaFace tweetMediaFace3 = iterator.next();
            final float n2 = tweetMediaFace3.w * tweetMediaFace3.h;
            TweetMediaFace tweetMediaFace4;
            float n3;
            if (n2 > n) {
                tweetMediaFace4 = tweetMediaFace3;
                n3 = n2;
            }
            else {
                n3 = n;
                tweetMediaFace4 = tweetMediaFace2;
            }
            tweetMediaFace2 = tweetMediaFace4;
            n = n3;
        }
        return tweetMediaFace2;
    }
}
