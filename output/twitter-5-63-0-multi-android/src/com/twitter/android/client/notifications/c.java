// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class c implements Parcelable$Creator
{
    public DeviceTweetNotif a(final Parcel parcel) {
        return new DeviceTweetNotif(parcel);
    }
    
    public DeviceTweetNotif[] a(final int n) {
        return new DeviceTweetNotif[n];
    }
}
