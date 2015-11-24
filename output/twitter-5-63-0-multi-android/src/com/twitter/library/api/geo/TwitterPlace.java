// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.io.Externalizable;
import android.os.Parcelable;

public class TwitterPlace implements Parcelable, Externalizable
{
    public static final Parcelable$Creator CREATOR;
    private static final long serialVersionUID = -2128865871515702377L;
    public String fullName;
    public String placeId;
    public TwitterPlace$PlaceInfo placeInfo;
    public TwitterPlace$PlaceType placeType;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    public TwitterPlace() {
    }
    
    public TwitterPlace(final Parcel parcel) {
        this.placeId = parcel.readString();
        this.placeType = TwitterPlace$PlaceType.a(parcel.readInt());
        this.fullName = parcel.readString();
        this.placeInfo = (TwitterPlace$PlaceInfo)parcel.readParcelable(TwitterPlace$PlaceInfo.class.getClassLoader());
    }
    
    public TwitterPlace(final String placeId, final TwitterPlace$PlaceType placeType, final String fullName, final String s, final List list, final Coordinate coordinate, final String s2, final String s3, final String s4, final TwitterPlace twitterPlace, final HashMap hashMap) {
        this.placeId = placeId;
        this.placeType = placeType;
        this.fullName = fullName;
        ArrayList list2;
        if (list == null) {
            list2 = null;
        }
        else {
            list2 = new ArrayList(list);
        }
        this.placeInfo = new TwitterPlace$PlaceInfo(s, list2, coordinate, s2, s3, s4, twitterPlace, hashMap);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof TwitterPlace && TextUtils.equals((CharSequence)this.placeId, (CharSequence)((TwitterPlace)o).placeId));
    }
    
    @Override
    public int hashCode() {
        return this.placeId.hashCode();
    }
    
    public void readExternal(final ObjectInput objectInput) {
        this.placeId = (String)objectInput.readObject();
        this.placeType = TwitterPlace$PlaceType.a(objectInput.readInt());
        this.fullName = (String)objectInput.readObject();
        this.placeInfo = (TwitterPlace$PlaceInfo)objectInput.readObject();
    }
    
    @Override
    public String toString() {
        return "TwitterPlace { id: " + this.placeId + ", fullname: " + this.fullName + " }";
    }
    
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.placeId);
        objectOutput.writeInt(this.placeType.a());
        objectOutput.writeObject(this.fullName);
        objectOutput.writeObject(this.placeInfo);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.placeId);
        parcel.writeInt(this.placeType.a());
        parcel.writeString(this.fullName);
        parcel.writeParcelable((Parcelable)this.placeInfo, n);
    }
}
