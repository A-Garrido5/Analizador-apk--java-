// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class w implements Parcelable$Creator
{
    public TwitterScribeItem a(final Parcel parcel) {
        return new TwitterScribeItem(parcel);
    }
    
    public TwitterScribeItem[] a(final int n) {
        return new TwitterScribeItem[n];
    }
}
