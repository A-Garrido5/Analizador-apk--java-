// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class u implements Parcelable$Creator
{
    public MentionNotif a(final Parcel parcel) {
        return new MentionNotif(parcel);
    }
    
    public MentionNotif[] a(final int n) {
        return new MentionNotif[n];
    }
}
