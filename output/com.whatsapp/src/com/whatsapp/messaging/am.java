// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.VoipOptions$Miscellaneous;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class am implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final VoipOptions$Miscellaneous a;
    
    static {
        CREATOR = (Parcelable$Creator)new s();
    }
    
    private am(final Parcel parcel) {
        this.a = new VoipOptions$Miscellaneous((Boolean)parcel.readValue(Boolean.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()));
    }
    
    am(final Parcel parcel, final bu bu) {
        this(parcel);
    }
    
    private am(final VoipOptions$Miscellaneous a) {
        this.a = a;
    }
    
    am(final VoipOptions$Miscellaneous voipOptions$Miscellaneous, final bu bu) {
        this(voipOptions$Miscellaneous);
    }
    
    public VoipOptions$Miscellaneous a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.a.enableComfortNoiseGeneration);
        parcel.writeValue((Object)this.a.enableHighPassFiltering);
        parcel.writeValue((Object)this.a.enableSilenceDetection);
        parcel.writeValue((Object)this.a.callerTimeout);
        parcel.writeValue((Object)this.a.jitterBufferAlgo);
        parcel.writeValue((Object)this.a.audioCallbackThreshold);
        parcel.writeValue((Object)this.a.ringbackMode);
        parcel.writeValue((Object)this.a.ringbackTone);
        parcel.writeValue((Object)this.a.androidAudioEngine);
        parcel.writeValue((Object)this.a.androidAudioModeInCall);
        parcel.writeValue((Object)this.a.androidAudioSource);
        parcel.writeValue((Object)this.a.androidRecordPreset);
        parcel.writeValue((Object)this.a.androidAudioRecordBufferSize);
        parcel.writeValue((Object)this.a.androidAudioPlaybackBufferSize);
        parcel.writeValue((Object)this.a.udpReceiveSocketBufferSize);
    }
}
