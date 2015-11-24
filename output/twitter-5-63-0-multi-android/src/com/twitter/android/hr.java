// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class hr implements Parcelable$Creator
{
    public Flow$Step a(final Parcel parcel) {
        return new Flow$Step(parcel, null);
    }
    
    public Flow$Step[] a(final int n) {
        return new Flow$Step[n];
    }
}
