// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class h implements Parcelable$Creator
{
    public VideoTrimTask a(final Parcel parcel) {
        return new VideoTrimTask(parcel, null);
    }
    
    public VideoTrimTask[] a(final int n) {
        return new VideoTrimTask[n];
    }
}
