// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Parcel;
import com.whatsapp.protocol.c6;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class d6 implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    c6 a;
    
    static {
        CREATOR = (Parcelable$Creator)new q8();
    }
    
    public d6(final Parcel parcel) {
        boolean b = true;
        final String string = parcel.readString();
        if (parcel.readByte() != (b ? 1 : 0)) {
            b = false;
        }
        this.a = new c6(string, b, parcel.readString());
    }
    
    public d6(final c6 a) {
        this.a = a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a.a);
        boolean b;
        if (this.a.b) {
            b = true;
        }
        else {
            b = false;
        }
        parcel.writeByte((byte)(byte)(b ? 1 : 0));
        parcel.writeString(this.a.c);
    }
}
