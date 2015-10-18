// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class f implements Parcelable$Creator
{
    public VideoStitchTask a(final Parcel parcel) {
        return new VideoStitchTask(parcel, null);
    }
    
    public VideoStitchTask[] a(final int n) {
        return new VideoStitchTask[n];
    }
}
