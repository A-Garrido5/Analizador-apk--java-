// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class s implements Parcelable$Creator
{
    public MagicRecTweetNotif a(final Parcel parcel) {
        return new MagicRecTweetNotif(parcel);
    }
    
    public MagicRecTweetNotif[] a(final int n) {
        return new MagicRecTweetNotif[n];
    }
}
