// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Parcel;
import com.whatsapp.protocol.VoipOptions$AudioRestrict;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class ai implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final VoipOptions$AudioRestrict a;
    
    static {
        CREATOR = (Parcelable$Creator)new b3();
    }
    
    private ai(final Parcel parcel) {
        this.a = new VoipOptions$AudioRestrict(parcel.readString(), (Integer)parcel.readValue(Integer.class.getClassLoader()));
    }
    
    ai(final Parcel parcel, final bu bu) {
        this(parcel);
    }
    
    private ai(final VoipOptions$AudioRestrict a) {
        this.a = a;
    }
    
    ai(final VoipOptions$AudioRestrict voipOptions$AudioRestrict, final bu bu) {
        this(voipOptions$AudioRestrict);
    }
    
    public VoipOptions$AudioRestrict a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a.encoding);
        parcel.writeValue((Object)this.a.rate);
    }
}
