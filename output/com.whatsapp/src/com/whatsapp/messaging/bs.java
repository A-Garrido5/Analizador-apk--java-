// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.VoipOptions$Aec;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class bs implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final VoipOptions$Aec a;
    
    static {
        CREATOR = (Parcelable$Creator)new j();
    }
    
    private bs(final Parcel parcel) {
        this.a = new VoipOptions$Aec(parcel.readString(), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Short)parcel.readValue(Short.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Integer)parcel.readValue(Integer.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()));
    }
    
    bs(final Parcel parcel, final bu bu) {
        this(parcel);
    }
    
    private bs(final VoipOptions$Aec a) {
        this.a = a;
    }
    
    bs(final VoipOptions$Aec voipOptions$Aec, final bu bu) {
        this(voipOptions$Aec);
    }
    
    public VoipOptions$Aec a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a.algorithm);
        parcel.writeValue((Object)this.a.offset);
        parcel.writeValue((Object)this.a.length);
        parcel.writeValue((Object)this.a.mode);
        parcel.writeValue((Object)this.a.ecThreshold);
        parcel.writeValue((Object)this.a.histEcThreshold);
        parcel.writeValue((Object)this.a.builtinEnabled);
        parcel.writeValue((Object)this.a.disableSwEcWhenBuiltinAvailable);
        parcel.writeValue((Object)this.a.toneDetectorEnabled);
    }
}
