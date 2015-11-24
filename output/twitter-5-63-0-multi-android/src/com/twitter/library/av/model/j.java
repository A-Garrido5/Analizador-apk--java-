// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class j implements Parcelable$Creator
{
    public VideoPlaylist a(final Parcel parcel) {
        final Video[] array = new Video[parcel.readInt()];
        parcel.readTypedArray((Object[])array, Video.CREATOR);
        return new VideoPlaylist(array, parcel.readInt(), wv.a(parcel), parcel.readString(), null);
    }
    
    public VideoPlaylist[] a(final int n) {
        return new VideoPlaylist[n];
    }
}
