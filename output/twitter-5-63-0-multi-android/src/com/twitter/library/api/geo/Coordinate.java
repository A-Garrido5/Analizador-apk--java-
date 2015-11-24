// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import android.location.Location;
import java.io.Serializable;

public class Coordinate implements Serializable
{
    private final double mLatitude;
    private final double mLongitude;
    
    public Coordinate(final double mLatitude, final double mLongitude) {
        if (Double.isNaN(mLatitude) || Double.isInfinite(mLatitude) || Double.isNaN(mLongitude) || Double.isInfinite(mLongitude)) {
            throw new IllegalArgumentException(mLatitude + ", " + mLongitude + " is not a valid coordinate");
        }
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
    }
    
    public static Coordinate a(final Location location) {
        return new Coordinate(location.getLatitude(), location.getLongitude());
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new Coordinate$SerializableProxy(this);
    }
    
    public double a() {
        return this.mLatitude;
    }
    
    public double b() {
        return this.mLongitude;
    }
    
    @Override
    public String toString() {
        return "Coordinate{latitude=" + this.mLatitude + ", longitude=" + this.mLongitude + '}';
    }
}
