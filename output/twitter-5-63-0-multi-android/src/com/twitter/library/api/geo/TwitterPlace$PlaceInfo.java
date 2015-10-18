// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import java.io.Serializable;
import java.util.List;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Arrays;
import com.twitter.util.f;
import java.io.ObjectInput;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import android.os.Parcelable$Creator;
import java.io.Externalizable;
import android.os.Parcelable;

public class TwitterPlace$PlaceInfo implements Parcelable, Externalizable
{
    public static final Parcelable$Creator CREATOR;
    public HashMap attributes;
    public ArrayList boundingCoordinates;
    public Coordinate centroid;
    public String country;
    public String countryCode;
    public String name;
    public TwitterPlace parent;
    public String polyline;
    
    static {
        CREATOR = (Parcelable$Creator)new n();
    }
    
    public TwitterPlace$PlaceInfo() {
    }
    
    public TwitterPlace$PlaceInfo(final Parcel parcel) {
        this.name = parcel.readString();
        this.boundingCoordinates = parcel.readArrayList(Coordinate.class.getClassLoader());
        this.centroid = (Coordinate)parcel.readSerializable();
        this.country = parcel.readString();
        this.countryCode = parcel.readString();
        this.polyline = parcel.readString();
        this.parent = (TwitterPlace)parcel.readParcelable(TwitterPlace.class.getClassLoader());
        this.attributes = (HashMap)parcel.readSerializable();
    }
    
    public TwitterPlace$PlaceInfo(final String name, final ArrayList boundingCoordinates, final Coordinate centroid, final String country, final String countryCode, final String polyline, final TwitterPlace parent, final HashMap attributes) {
        this.name = name;
        this.boundingCoordinates = boundingCoordinates;
        this.centroid = centroid;
        this.country = country;
        this.countryCode = countryCode;
        this.polyline = polyline;
        this.parent = parent;
        this.attributes = attributes;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void readExternal(final ObjectInput objectInput) {
        this.name = (String)objectInput.readObject();
        final Coordinate[] array = (Coordinate[])f.a(Coordinate[].class, objectInput);
        ArrayList boundingCoordinates;
        if (array == null) {
            boundingCoordinates = null;
        }
        else {
            boundingCoordinates = new ArrayList((Collection<? extends E>)Arrays.asList(array));
        }
        this.boundingCoordinates = boundingCoordinates;
        this.centroid = (Coordinate)objectInput.readObject();
        this.country = (String)objectInput.readObject();
        this.countryCode = (String)objectInput.readObject();
        this.polyline = (String)objectInput.readObject();
        this.parent = (TwitterPlace)objectInput.readObject();
        this.attributes = f.a(String.class, String.class, objectInput);
    }
    
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.name);
        Object[] array;
        if (this.boundingCoordinates == null) {
            array = null;
        }
        else {
            array = this.boundingCoordinates.toArray();
        }
        f.a(array, objectOutput);
        objectOutput.writeObject(this.centroid);
        objectOutput.writeObject(this.country);
        objectOutput.writeObject(this.countryCode);
        objectOutput.writeObject(this.polyline);
        objectOutput.writeObject(this.parent);
        f.a(this.attributes, objectOutput);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.name);
        parcel.writeList((List)this.boundingCoordinates);
        parcel.writeSerializable((Serializable)this.centroid);
        parcel.writeString(this.country);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.polyline);
        parcel.writeParcelable((Parcelable)this.parent, n);
        parcel.writeSerializable((Serializable)this.attributes);
    }
}
