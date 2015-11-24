// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class o implements Parcelable$Creator
{
    public LifelineTweetNotif a(final Parcel parcel) {
        return new LifelineTweetNotif(parcel);
    }
    
    public LifelineTweetNotif[] a(final int n) {
        return new LifelineTweetNotif[n];
    }
}
