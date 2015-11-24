// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class PendingCallback$1 implements Parcelable$Creator
{
    public Object createFromParcel(final Parcel parcel) {
        return this.zzdW(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzgi(n);
    }
    
    public PendingCallback zzdW(final Parcel parcel) {
        return new PendingCallback(parcel);
    }
    
    public PendingCallback[] zzgi(final int n) {
        return new PendingCallback[n];
    }
}
