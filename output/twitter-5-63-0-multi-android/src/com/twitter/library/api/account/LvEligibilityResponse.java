// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class LvEligibilityResponse implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final boolean a;
    private final boolean b;
    
    static {
        CREATOR = (Parcelable$Creator)new u();
    }
    
    public LvEligibilityResponse(final Parcel parcel) {
        boolean b = true;
        this.a = (parcel.readByte() == (b ? 1 : 0) && b);
        if (parcel.readByte() != (b ? 1 : 0)) {
            b = false;
        }
        this.b = b;
    }
    
    public LvEligibilityResponse(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        int n3;
        if (this.a) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeByte((byte)n3);
        if (!this.b) {
            n2 = 0;
        }
        parcel.writeByte((byte)n2);
    }
}
