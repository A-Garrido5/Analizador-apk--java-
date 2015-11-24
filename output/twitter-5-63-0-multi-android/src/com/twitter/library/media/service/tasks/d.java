// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class d implements Parcelable$Creator
{
    public VideoCheckTask a(final Parcel parcel) {
        return new VideoCheckTask(parcel, null);
    }
    
    public VideoCheckTask[] a(final int n) {
        return new VideoCheckTask[n];
    }
}
