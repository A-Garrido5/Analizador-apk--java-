// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class e implements Parcelable$Creator
{
    public AudioPlaylist a(final Parcel parcel) {
        return new AudioPlaylist(parcel);
    }
    
    public AudioPlaylist[] a(final int n) {
        return new AudioPlaylist[n];
    }
}
