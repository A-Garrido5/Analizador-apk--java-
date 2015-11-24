// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class f implements Parcelable$Creator
{
    public MomentTweetTextPage a(final Parcel parcel) {
        return new MomentTweetTextPage(parcel);
    }
    
    public MomentTweetTextPage[] a(final int n) {
        return new MomentTweetTextPage[n];
    }
}
