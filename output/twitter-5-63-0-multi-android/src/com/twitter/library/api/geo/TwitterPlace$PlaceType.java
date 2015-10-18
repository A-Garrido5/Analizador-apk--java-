// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

public enum TwitterPlace$PlaceType
{
    a("POI", 0, "poi", 1), 
    b("NEIGHBORHOOD", 1, "neighborhood", 2), 
    c("CITY", 2, "city", 3), 
    d("ADMIN", 3, "admin", 4), 
    e("COUNTRY", 4, "country", 5), 
    f("UNKNOWN", 5, "unknown", -1);
    
    private final String mName;
    private final int mType;
    
    private TwitterPlace$PlaceType(final String s, final int n, final String mName, final int mType) {
        this.mName = mName;
        this.mType = mType;
    }
    
    public static TwitterPlace$PlaceType a(final int n) {
        for (final TwitterPlace$PlaceType twitterPlace$PlaceType : values()) {
            if (twitterPlace$PlaceType.a() == n) {
                return twitterPlace$PlaceType;
            }
        }
        return TwitterPlace$PlaceType.f;
    }
    
    public int a() {
        return this.mType;
    }
    
    @Override
    public String toString() {
        return this.mName;
    }
}
