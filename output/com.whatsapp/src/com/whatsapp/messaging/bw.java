// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.VoipOptions$Decode;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class bw implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final VoipOptions$Decode a;
    
    static {
        CREATOR = (Parcelable$Creator)new a0();
    }
    
    private bw(final Parcel parcel) {
        this.a = new VoipOptions$Decode((Short)parcel.readValue(Short.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()), (Short)parcel.readValue(Short.class.getClassLoader()));
    }
    
    bw(final Parcel parcel, final bu bu) {
        this(parcel);
    }
    
    private bw(final VoipOptions$Decode a) {
        this.a = a;
    }
    
    bw(final VoipOptions$Decode voipOptions$Decode, final bu bu) {
        this(voipOptions$Decode);
    }
    
    public VoipOptions$Decode a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.a.gain);
        parcel.writeValue((Object)this.a.forwardErrorCorrection);
        parcel.writeValue((Object)this.a.plc);
    }
}
