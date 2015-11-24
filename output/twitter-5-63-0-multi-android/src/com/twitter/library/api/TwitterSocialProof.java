// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.util.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.io.Serializable;
import android.os.Parcelable;

public class TwitterSocialProof implements Parcelable, Serializable
{
    public static final Parcelable$Creator CREATOR;
    private static final long serialVersionUID = 1623924358053899366L;
    public final int favoriteCount;
    public final int followCount;
    public final int friendship;
    public final String name;
    public final int othersCount;
    public final int retweetCount;
    public final String secondName;
    public final int type;
    
    static {
        CREATOR = (Parcelable$Creator)new bn();
    }
    
    public TwitterSocialProof(final Parcel parcel) {
        this.type = parcel.readInt();
        this.name = parcel.readString();
        this.favoriteCount = parcel.readInt();
        this.retweetCount = parcel.readInt();
        this.followCount = parcel.readInt();
        this.friendship = parcel.readInt();
        this.secondName = parcel.readString();
        this.othersCount = parcel.readInt();
    }
    
    public TwitterSocialProof(final bo bo) {
        this.type = bo.a;
        this.name = bo.e;
        this.favoriteCount = bo.b;
        this.retweetCount = bo.c;
        this.followCount = bo.d;
        this.friendship = bo.f;
        this.secondName = bo.g;
        this.othersCount = bo.h;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new TwitterSocialProof$SerializationProxy(this);
    }
    
    public boolean a(final TwitterSocialProof twitterSocialProof) {
        return this == twitterSocialProof || (twitterSocialProof != null && this.type == twitterSocialProof.type && l.a(this.name, twitterSocialProof.name) && this.favoriteCount == twitterSocialProof.favoriteCount && this.followCount == twitterSocialProof.followCount && this.retweetCount == twitterSocialProof.retweetCount && this.friendship == twitterSocialProof.friendship && l.a(this.secondName, twitterSocialProof.secondName) && this.othersCount == twitterSocialProof.othersCount);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof TwitterSocialProof && this.a((TwitterSocialProof)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * this.type + l.a(this.name)) + this.favoriteCount) + this.retweetCount) + this.followCount) + this.friendship) + l.a(this.secondName)) + this.othersCount;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.type);
        parcel.writeString(this.name);
        parcel.writeInt(this.favoriteCount);
        parcel.writeInt(this.retweetCount);
        parcel.writeInt(this.followCount);
        parcel.writeInt(this.friendship);
        parcel.writeString(this.secondName);
        parcel.writeInt(this.othersCount);
    }
}
