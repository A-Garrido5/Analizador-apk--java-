// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;

final class MessengerCompat$1 implements Parcelable$Creator
{
    public Object createFromParcel(final Parcel parcel) {
        return this.zzeb(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzgo(n);
    }
    
    public MessengerCompat zzeb(final Parcel parcel) {
        final IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder != null) {
            return new MessengerCompat(strongBinder);
        }
        return null;
    }
    
    public MessengerCompat[] zzgo(final int n) {
        return new MessengerCompat[n];
    }
}
