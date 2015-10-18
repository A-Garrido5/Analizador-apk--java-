// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ActivitySummary implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final long[] c;
    public final long[] d;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public ActivitySummary(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.createLongArray();
        this.d = parcel.createLongArray();
        parcel.readInt();
    }
    
    public ActivitySummary(final String a, final String b, final long[] c, final long[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static boolean a(final String s) {
        return s != null && !"0".equals(s);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLongArray(this.c);
        parcel.writeLongArray(this.d);
        parcel.writeInt(0);
    }
}
