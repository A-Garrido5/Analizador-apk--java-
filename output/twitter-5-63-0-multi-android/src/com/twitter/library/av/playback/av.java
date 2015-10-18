// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.card.Card;
import java.util.Map;
import com.twitter.library.av.model.Partner;
import java.util.Collections;
import com.twitter.library.client.App;
import com.twitter.library.av.model.factory.b;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.av.model.factory.a;
import com.twitter.library.provider.Tweet;

public class av
{
    public au a(final Tweet tweet, final String s, final a a, final TwitterScribeAssociation twitterScribeAssociation) {
        return this.a(tweet, null, s, a, twitterScribeAssociation);
    }
    
    public au a(final Tweet tweet, final String s, final TwitterScribeAssociation twitterScribeAssociation) {
        a b;
        String c;
        if ("audio".equals(s)) {
            b = new b();
            final boolean a = App.a();
            c = null;
            if (a) {
                throw new IllegalArgumentException("playlists of the audio type need to specify their playlist url.");
            }
        }
        else {
            b = bf.b(tweet);
            c = bf.c(tweet);
        }
        return this.a(tweet, s, c, b, twitterScribeAssociation);
    }
    
    public au a(final Tweet tweet, final String s, final String s2, final a a, final TwitterScribeAssociation twitterScribeAssociation) {
        return this.a(tweet, s, s2, a, Collections.emptyMap(), Partner.a, twitterScribeAssociation, null);
    }
    
    public au a(final Tweet tweet, final String s, final String s2, final a a, final Map map, final Partner partner, final TwitterScribeAssociation twitterScribeAssociation, final Card card) {
        return new au(tweet, s, s2, a, map, partner, twitterScribeAssociation, card);
    }
}
