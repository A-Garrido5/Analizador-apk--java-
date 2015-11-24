// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class b implements Parcelable$Creator
{
    public DataSyncResult a(final Parcel parcel) {
        return new DataSyncResult(parcel);
    }
    
    public DataSyncResult[] a(final int n) {
        return new DataSyncResult[n];
    }
}
