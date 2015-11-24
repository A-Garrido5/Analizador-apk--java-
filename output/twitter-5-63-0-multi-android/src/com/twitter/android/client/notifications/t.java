// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class t implements Parcelable$Creator
{
    public MediaTagNotif a(final Parcel parcel) {
        return new MediaTagNotif(parcel);
    }
    
    public MediaTagNotif[] a(final int n) {
        return new MediaTagNotif[n];
    }
}
