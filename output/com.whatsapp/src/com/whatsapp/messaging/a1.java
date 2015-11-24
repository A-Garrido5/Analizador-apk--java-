// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.VoipOptions$Agc;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class a1 implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final VoipOptions$Agc a;
    
    static {
        CREATOR = (Parcelable$Creator)new bm();
    }
    
    private a1(final Parcel parcel) {
        this.a = new VoipOptions$Agc((Short)parcel.readValue(Short.class.getClassLoader()), (Short)parcel.readValue(Short.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()), (Short)parcel.readValue(Short.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()));
    }
    
    a1(final Parcel parcel, final bu bu) {
        this(parcel);
    }
    
    private a1(final VoipOptions$Agc a) {
        this.a = a;
    }
    
    a1(final VoipOptions$Agc voipOptions$Agc, final bu bu) {
        this(voipOptions$Agc);
    }
    
    public VoipOptions$Agc a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.a.targetLevel);
        parcel.writeValue((Object)this.a.compressionGain);
        parcel.writeValue((Object)this.a.enableLimiter);
        parcel.writeValue((Object)this.a.mode);
        parcel.writeValue((Object)this.a.builtinEnabled);
    }
}
