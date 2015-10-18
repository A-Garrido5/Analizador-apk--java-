// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class v implements Parcelable$Creator
{
    public TwitterScribeAssociation a(final Parcel parcel) {
        return new TwitterScribeAssociation(parcel, null);
    }
    
    public TwitterScribeAssociation[] a(final int n) {
        return new TwitterScribeAssociation[n];
    }
}
