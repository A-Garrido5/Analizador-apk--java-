// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

class Coordinate$SerializableProxy implements Externalizable
{
    private static final long serialVersionUID = 1362045895578432L;
    private double mLatitude;
    private double mLongitude;
    
    public Coordinate$SerializableProxy() {
    }
    
    public Coordinate$SerializableProxy(final Coordinate coordinate) {
        this.mLatitude = coordinate.a();
        this.mLongitude = coordinate.b();
    }
    
    private Object readResolve() {
        return new Coordinate(this.mLatitude, this.mLongitude);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.mLatitude = objectInput.readDouble();
        this.mLongitude = objectInput.readDouble();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeDouble(this.mLatitude);
        objectOutput.writeDouble(this.mLongitude);
    }
}
