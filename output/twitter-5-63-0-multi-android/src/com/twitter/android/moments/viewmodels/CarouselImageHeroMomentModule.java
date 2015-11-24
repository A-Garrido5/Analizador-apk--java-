// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import java.io.Serializable;
import com.twitter.util.e;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.library.api.moments.Moment;
import android.os.Parcel;
import com.twitter.library.api.moments.CropData;
import com.twitter.library.api.MediaEntity;
import android.os.Parcelable$Creator;

public class CarouselImageHeroMomentModule extends MomentModule
{
    public static final Parcelable$Creator CREATOR;
    private final MediaEntity a;
    private final CropData b;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    public CarouselImageHeroMomentModule(final Parcel parcel) {
        super(parcel);
        this.a = (MediaEntity)parcel.readSerializable();
        this.b = (CropData)parcel.readSerializable();
    }
    
    public CarouselImageHeroMomentModule(final Moment moment, final MediaEntity a, final CropData b) {
        super(moment);
        this.a = a;
        e.b(a.type == MediaEntity$Type.b);
        this.b = b;
    }
    
    public MediaEntity a() {
        return this.a;
    }
    
    public CropData b() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeSerializable((Serializable)this.a);
        parcel.writeSerializable((Serializable)this.b);
    }
}
