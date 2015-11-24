// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class e implements Parcelable$Creator
{
    public VideoMuxTask a(final Parcel parcel) {
        return new VideoMuxTask(parcel, null);
    }
    
    public VideoMuxTask[] a(final int n) {
        return new VideoMuxTask[n];
    }
}
