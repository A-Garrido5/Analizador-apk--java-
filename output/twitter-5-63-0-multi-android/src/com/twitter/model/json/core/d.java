// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.util.collection.h;
import java.util.Map;
import com.twitter.library.api.geo.TwitterPlace$PlaceType;

public class d extends wz
{
    public d() {
        super(TwitterPlace$PlaceType.f, a());
    }
    
    public static Map a() {
        final h a = h.a();
        for (final TwitterPlace$PlaceType twitterPlace$PlaceType : TwitterPlace$PlaceType.values()) {
            if (twitterPlace$PlaceType != TwitterPlace$PlaceType.f) {
                a.a(twitterPlace$PlaceType.toString(), twitterPlace$PlaceType);
            }
        }
        return a.c();
    }
}
