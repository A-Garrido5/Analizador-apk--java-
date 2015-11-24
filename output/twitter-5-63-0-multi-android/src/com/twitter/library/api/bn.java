// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bn implements Parcelable$Creator
{
    public TwitterSocialProof a(final Parcel parcel) {
        return new TwitterSocialProof(parcel);
    }
    
    public TwitterSocialProof[] a(final int n) {
        return new TwitterSocialProof[n];
    }
}
