// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.VoipOptions$ABTest;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class b8 implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final VoipOptions$ABTest a;
    
    static {
        CREATOR = (Parcelable$Creator)new ap();
    }
    
    private b8(final Parcel parcel) {
        this.a = new VoipOptions$ABTest(parcel.readString());
    }
    
    b8(final Parcel parcel, final bu bu) {
        this(parcel);
    }
    
    private b8(final VoipOptions$ABTest a) {
        this.a = a;
    }
    
    b8(final VoipOptions$ABTest voipOptions$ABTest, final bu bu) {
        this(voipOptions$ABTest);
    }
    
    public VoipOptions$ABTest a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a.name);
    }
}
