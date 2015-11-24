// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class k implements Parcelable$Creator
{
    public GenericNotif a(final Parcel parcel) {
        return new GenericNotif(parcel);
    }
    
    public GenericNotif[] a(final int n) {
        return new GenericNotif[n];
    }
}
