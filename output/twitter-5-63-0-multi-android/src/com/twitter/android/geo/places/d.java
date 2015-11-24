// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo.places;

import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import com.twitter.android.SearchActivity;
import android.text.TextUtils;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.library.api.geo.TwitterPlace;
import android.content.Context;

public class d
{
    public static Intent a(final Context context, final TwitterPlace twitterPlace) {
        if (com.twitter.library.featureswitch.d.f("place_page_redesign_enabled")) {
            return new Intent(context, (Class)PlaceLandingActivity.class).putExtra("extra_place", (Parcelable)twitterPlace);
        }
        String s;
        if (TextUtils.isEmpty((CharSequence)twitterPlace.fullName)) {
            s = twitterPlace.placeInfo.name;
        }
        else {
            s = twitterPlace.fullName;
        }
        return new Intent(context, (Class)SearchActivity.class).putExtra("query", "place:" + twitterPlace.placeId).putExtra("query_name", s).putExtra("recent", twitterPlace.placeType == TwitterPlace$PlaceType.a).putExtra("search_button", true).putExtra("terminal", true).putExtra("search_type", 9);
    }
}
