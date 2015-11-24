// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.VoipOptions$RateControl;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class u implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final VoipOptions$RateControl a;
    
    static {
        CREATOR = (Parcelable$Creator)new k();
    }
    
    private u(final Parcel parcel) {
        this.a = new VoipOptions$RateControl((Boolean)parcel.readValue(Boolean.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()));
    }
    
    u(final Parcel parcel, final bu bu) {
        this(parcel);
    }
    
    private u(final VoipOptions$RateControl a) {
        this.a = a;
    }
    
    u(final VoipOptions$RateControl voipOptions$RateControl, final bu bu) {
        this(voipOptions$RateControl);
    }
    
    public VoipOptions$RateControl a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.a.disableRateControl);
        parcel.writeValue((Object)this.a.framesPerPacket);
        parcel.writeValue((Object)this.a.minRTT);
        parcel.writeValue((Object)this.a.maxRTT);
        parcel.writeValue((Object)this.a.initBitrate);
        parcel.writeValue((Object)this.a.minFramesPerPacket);
        parcel.writeValue((Object)this.a.cellularBitrate);
        parcel.writeValue((Object)this.a.pktSizeThresholdBitrate);
    }
}
