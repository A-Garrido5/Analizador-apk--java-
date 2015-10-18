// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class GeoTag implements Serializable
{
    private final Coordinate mCoordinate;
    private final TwitterPlace mPlace;
    private final String mSearchId;
    
    public GeoTag(final TwitterPlace mPlace, final Coordinate mCoordinate, final String mSearchId) {
        if (mPlace == null) {
            throw new IllegalArgumentException("Cannot create geotag with null place");
        }
        this.mPlace = mPlace;
        this.mCoordinate = mCoordinate;
        this.mSearchId = mSearchId;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new GeoTag$SerializationProxy(this);
    }
    
    public TwitterPlace a() {
        return this.mPlace;
    }
    
    public Coordinate b() {
        return this.mCoordinate;
    }
    
    public String c() {
        return this.mSearchId;
    }
    
    @Override
    public String toString() {
        return "GeoTag{place=" + this.mPlace + ", coordinate=" + this.mCoordinate + ", searchId='" + this.mSearchId + '\'' + '}';
    }
}
