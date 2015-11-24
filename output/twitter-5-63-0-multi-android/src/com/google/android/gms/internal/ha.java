// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ha implements Parcelable
{
    @Deprecated
    public static final Parcelable$Creator CREATOR;
    private String a;
    private String b;
    private String c;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public ha() {
    }
    
    ha(final Parcel parcel) {
        this.a(parcel);
    }
    
    @Deprecated
    private void a(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
    
    @Deprecated
    public int describeContents() {
        return 0;
    }
    
    @Deprecated
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
