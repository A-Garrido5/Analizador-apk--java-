// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bu implements Parcelable$Creator
{
    public TwitterTopic a(final Parcel parcel) {
        return new TwitterTopic(parcel);
    }
    
    public TwitterTopic[] a(final int n) {
        return new TwitterTopic[n];
    }
}
