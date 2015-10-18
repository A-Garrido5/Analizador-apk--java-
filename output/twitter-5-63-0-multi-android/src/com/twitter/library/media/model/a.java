// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public AnimatedGifFile a(final Parcel parcel) {
        return new AnimatedGifFile(parcel);
    }
    
    public AnimatedGifFile[] a(final int n) {
        return new AnimatedGifFile[n];
    }
}
