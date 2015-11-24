// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class c implements Parcelable$Creator
{
    public ResizeTask a(final Parcel parcel) {
        return new ResizeTask(parcel, null);
    }
    
    public ResizeTask[] a(final int n) {
        return new ResizeTask[n];
    }
}
