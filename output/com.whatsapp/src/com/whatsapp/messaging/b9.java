// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.VoipOptions$NoiseSuppression;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class b9 implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final VoipOptions$NoiseSuppression a;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    private b9(final Parcel parcel) {
        this.a = new VoipOptions$NoiseSuppression((Short)parcel.readValue(Short.class.getClassLoader()), (Boolean)parcel.readValue(Boolean.class.getClassLoader()));
    }
    
    b9(final Parcel parcel, final bu bu) {
        this(parcel);
    }
    
    private b9(final VoipOptions$NoiseSuppression a) {
        this.a = a;
    }
    
    b9(final VoipOptions$NoiseSuppression voipOptions$NoiseSuppression, final bu bu) {
        this(voipOptions$NoiseSuppression);
    }
    
    public VoipOptions$NoiseSuppression a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.a.mode);
        parcel.writeValue((Object)this.a.builtinEnabled);
    }
}
