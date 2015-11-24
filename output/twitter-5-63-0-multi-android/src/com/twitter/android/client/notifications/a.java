// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public DMNotif a(final Parcel parcel) {
        return new DMNotif(parcel);
    }
    
    public DMNotif[] a(final int n) {
        return new DMNotif[n];
    }
}
