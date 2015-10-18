// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class o implements Parcelable$Creator
{
    public RichNotificationScribeDetails a(final Parcel parcel) {
        return new RichNotificationScribeDetails(parcel);
    }
    
    public RichNotificationScribeDetails[] a(final int n) {
        return new RichNotificationScribeDetails[n];
    }
}
