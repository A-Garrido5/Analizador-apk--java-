// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

class GeoTag$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = 38762966542321L;
    private Coordinate mCoordinate;
    private TwitterPlace mPlace;
    private String mSearchId;
    
    public GeoTag$SerializationProxy() {
    }
    
    public GeoTag$SerializationProxy(final GeoTag geoTag) {
        this.mPlace = geoTag.a();
        this.mCoordinate = geoTag.b();
        this.mSearchId = geoTag.c();
    }
    
    private Object readResolve() {
        return new GeoTag(this.mPlace, this.mCoordinate, this.mSearchId);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mPlace = (TwitterPlace)objectInput.readObject();
        this.mCoordinate = (Coordinate)objectInput.readObject();
        this.mSearchId = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.mPlace);
        objectOutput.writeObject(this.mCoordinate);
        objectOutput.writeObject(this.mSearchId);
    }
}
