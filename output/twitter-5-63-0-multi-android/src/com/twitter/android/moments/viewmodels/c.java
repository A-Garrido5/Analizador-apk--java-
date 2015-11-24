// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class c implements Parcelable$Creator
{
    public CarouselImageHeroMomentModule a(final Parcel parcel) {
        return new CarouselImageHeroMomentModule(parcel);
    }
    
    public CarouselImageHeroMomentModule[] a(final int n) {
        return new CarouselImageHeroMomentModule[n];
    }
}
