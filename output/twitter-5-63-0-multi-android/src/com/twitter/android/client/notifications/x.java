// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class x implements Parcelable$Creator
{
    public RetweetNotif a(final Parcel parcel) {
        return new RetweetNotif(parcel);
    }
    
    public RetweetNotif[] a(final int n) {
        return new RetweetNotif[n];
    }
}
