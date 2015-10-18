// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class PendingRequest implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final int b;
    public final long c;
    
    static {
        CREATOR = (Parcelable$Creator)new as();
    }
    
    public PendingRequest(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readLong();
    }
    
    public PendingRequest(final String a) {
        this.a = a;
        this.b = 0;
        this.c = 0L;
    }
    
    public PendingRequest(final String a, final int b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final PendingRequest pendingRequest = (PendingRequest)o;
            if (this.a != null) {
                if (this.a.equals(pendingRequest.a)) {
                    return true;
                }
            }
            else if (pendingRequest.a == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.a != null) {
            return this.a.hashCode();
        }
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
    }
}
