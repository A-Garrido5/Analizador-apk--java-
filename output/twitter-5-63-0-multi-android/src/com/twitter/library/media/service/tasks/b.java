// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class b implements Parcelable$Creator
{
    public PixelFormatProbeMediaTask a(final Parcel parcel) {
        return new PixelFormatProbeMediaTask(parcel, null);
    }
    
    public PixelFormatProbeMediaTask[] a(final int n) {
        return new PixelFormatProbeMediaTask[n];
    }
}
