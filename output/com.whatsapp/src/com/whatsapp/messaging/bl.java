// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.cr;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class bl implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final cr a;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    private bl(final Parcel parcel) {
        this.a = new cr();
        this.a.a = parcel.readString();
        this.a.e = parcel.readString();
        this.a.c = parcel.readString();
        this.a.b = parcel.readString();
        this.a.d = parcel.readString();
    }
    
    bl(final Parcel parcel, final h h) {
        this(parcel);
    }
    
    public bl(final cr a) {
        this.a = a;
    }
    
    public cr a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a.a);
        parcel.writeString(this.a.e);
        parcel.writeString(this.a.c);
        parcel.writeString(this.a.b);
        parcel.writeString(this.a.d);
    }
}
