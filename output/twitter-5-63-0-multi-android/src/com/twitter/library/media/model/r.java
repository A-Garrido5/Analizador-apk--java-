// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class r implements Parcelable$Creator
{
    public VideoFile a(final Parcel parcel) {
        return new VideoFile(parcel);
    }
    
    public VideoFile[] a(final int n) {
        return new VideoFile[n];
    }
}
