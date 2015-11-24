// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class x implements Parcelable$Creator
{
    public TwitterScribeLog a(final Parcel parcel) {
        return new TwitterScribeLog(parcel);
    }
    
    public TwitterScribeLog[] a(final int n) {
        return new TwitterScribeLog[n];
    }
}
