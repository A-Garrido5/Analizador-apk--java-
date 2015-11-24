// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public CropTask a(final Parcel parcel) {
        return new CropTask(parcel, null);
    }
    
    public CropTask[] a(final int n) {
        return new CropTask[n];
    }
}
