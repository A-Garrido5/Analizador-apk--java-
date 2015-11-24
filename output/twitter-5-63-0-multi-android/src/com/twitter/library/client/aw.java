// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class aw implements Parcelable$Creator
{
    public Session a(final Parcel parcel) {
        return new Session(parcel);
    }
    
    public Session[] a(final int n) {
        return new Session[n];
    }
}
