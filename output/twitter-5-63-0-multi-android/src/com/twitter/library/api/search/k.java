// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class k implements Parcelable$Creator
{
    public TwitterSearchQuery a(final Parcel parcel) {
        return new TwitterSearchQuery(parcel);
    }
    
    public TwitterSearchQuery[] a(final int n) {
        return new TwitterSearchQuery[n];
    }
}
