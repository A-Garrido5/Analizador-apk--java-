// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class FlowData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private String a;
    private String b;
    
    static {
        CREATOR = (Parcelable$Creator)new hs();
    }
    
    public FlowData() {
    }
    
    public FlowData(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
    
    public String a() {
        return this.a;
    }
    
    public void a(final String a) {
        this.a = a;
    }
    
    public String b() {
        return this.b;
    }
    
    public void b(final String b) {
        this.b = b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
