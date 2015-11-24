// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.VoipOptions$Encode;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class bj implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final VoipOptions$Encode a;
    
    static {
        CREATOR = (Parcelable$Creator)new bn();
    }
    
    private bj(final Parcel parcel) {
        this.a = new VoipOptions$Encode((Short)parcel.readValue(Short.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()));
    }
    
    bj(final Parcel parcel, final bu bu) {
        this(parcel);
    }
    
    private bj(final VoipOptions$Encode a) {
        this.a = a;
    }
    
    bj(final VoipOptions$Encode voipOptions$Encode, final bu bu) {
        this(voipOptions$Encode);
    }
    
    public VoipOptions$Encode a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.a.complexity);
        parcel.writeValue((Object)this.a.enableConstantBitrate);
        parcel.writeValue((Object)this.a.enableDiscontinuousTransmission);
        parcel.writeValue((Object)this.a.targetBitrate);
        parcel.writeValue((Object)this.a.forwardErrorCorrection);
    }
}
