// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeGeoDetails$ScribeGeoPlace;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.geo.places.d;
import android.text.TextUtils;
import android.view.View;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import com.twitter.library.view.c;

class fy extends c
{
    private final Tweet a;
    private final long b;
    private final Context c;
    
    public fy(final Context c, final Tweet a, final long b) {
        super(c.getResources().getColor(2131689601));
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        final Context c = this.c;
        final TwitterPlace w = this.a.W;
        if (w != null && !TextUtils.isEmpty((CharSequence)w.placeId)) {
            c.startActivity(com.twitter.android.geo.places.d.a(c, w));
            final com.twitter.android.client.c a = com.twitter.android.client.c.a(c);
            final TwitterScribeItem b = TwitterScribeItem.b();
            b.a = this.a.Q;
            final ScribeGeoDetails$ScribeGeoPlace scribeGeoDetails$ScribeGeoPlace = new ScribeGeoDetails$ScribeGeoPlace();
            scribeGeoDetails$ScribeGeoPlace.a = w.placeId;
            scribeGeoDetails$ScribeGeoPlace.b = w.placeType.toString();
            b.ak.c.add(scribeGeoDetails$ScribeGeoPlace);
            if (this.b != 0L) {
                a.a(((TwitterScribeLog)new TwitterScribeLog(this.b).b(new String[] { "tweet::tweet_footer:place_tag:click" })).a(b));
            }
        }
    }
}
