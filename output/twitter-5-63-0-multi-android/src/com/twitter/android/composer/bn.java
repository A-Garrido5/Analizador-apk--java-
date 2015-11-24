// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bn implements Parcelable$Creator
{
    public TweetBox$SavedState a(final Parcel parcel) {
        return new TweetBox$SavedState(parcel);
    }
    
    public TweetBox$SavedState[] a(final int n) {
        return new TweetBox$SavedState[n];
    }
}
