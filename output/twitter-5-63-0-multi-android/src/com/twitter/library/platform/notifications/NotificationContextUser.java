// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class NotificationContextUser implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
    }
    
    public NotificationContextUser(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
    
    public NotificationContextUser(final String a, final String b) {
        this.a = a;
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
