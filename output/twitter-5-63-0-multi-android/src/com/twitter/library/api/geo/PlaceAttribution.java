// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

public enum PlaceAttribution
{
    a("FOURSQUARE", 0, "foursquare");
    
    private final String mName;
    
    private PlaceAttribution(final String s, final int n, final String mName) {
        this.mName = mName;
    }
    
    public static PlaceAttribution a(final String s) {
        if (s.equals(PlaceAttribution.a.toString())) {
            return PlaceAttribution.a;
        }
        return null;
    }
    
    @Override
    public String toString() {
        return this.mName;
    }
}
