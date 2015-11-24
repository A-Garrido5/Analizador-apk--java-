// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class g implements Parcelable$Creator
{
    public VideoTranscodeTask a(final Parcel parcel) {
        return new VideoTranscodeTask(parcel, null);
    }
    
    public VideoTranscodeTask[] a(final int n) {
        return new VideoTranscodeTask[n];
    }
}
