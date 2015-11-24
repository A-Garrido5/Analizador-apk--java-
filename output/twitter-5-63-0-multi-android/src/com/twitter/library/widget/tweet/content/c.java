// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget.tweet.content;

import java.util.List;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.TweetClassicCard;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.media.util.q;
import com.twitter.android.av.t;
import com.twitter.library.experiments.b;
import android.view.View;
import com.twitter.util.a;
import com.twitter.library.provider.Tweet;
import com.twitter.library.media.widget.r;
import com.twitter.library.media.widget.AdaptiveTweetMediaView;

public class c
{
    public static void a(final boolean b, final AdaptiveTweetMediaView adaptiveTweetMediaView, final r onImageLoadedListener, final Tweet tweet, final int mediaDividerSize, final int mediaPlaceholder) {
        boolean clickable = true;
        if (onImageLoadedListener != null) {
            adaptiveTweetMediaView.setOnImageLoadedListener(onImageLoadedListener);
        }
        a.a((View)adaptiveTweetMediaView, 4);
        final TweetClassicCard s = tweet.S();
        final CardInstanceData w = tweet.W();
        adaptiveTweetMediaView.setMediaDividerSize(mediaDividerSize);
        adaptiveTweetMediaView.setMediaPlaceholder(mediaPlaceholder);
        final boolean a = b.a();
        adaptiveTweetMediaView.c(a);
        adaptiveTweetMediaView.a((a || t.a(tweet)) && clickable);
        adaptiveTweetMediaView.b(b.i());
        adaptiveTweetMediaView.setSingleImageMinAspectRatio(b.e());
        final List a2 = q.a(tweet.R(), b.h());
        if (b) {
            final List ag = tweet.ag;
            if (!ag.isEmpty()) {
                adaptiveTweetMediaView.setEditableMedia(ag);
            }
        }
        else if (s != null) {
            adaptiveTweetMediaView.setCard(w);
        }
        else if (!CollectionUtils.a((Collection)a2)) {
            adaptiveTweetMediaView.setMediaEntities(a2);
        }
        else {
            adaptiveTweetMediaView.b();
        }
        if (adaptiveTweetMediaView.c()) {
            adaptiveTweetMediaView.setVisibility(0);
        }
        else {
            adaptiveTweetMediaView.setVisibility(8);
        }
        if (tweet.Y() || tweet.Z()) {
            clickable = false;
        }
        adaptiveTweetMediaView.setClickable(clickable);
    }
}
