// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class p implements Parcelable$Creator
{
    public RichNotificationStoryScribeDetails a(final Parcel parcel) {
        return new RichNotificationStoryScribeDetails(parcel);
    }
    
    public RichNotificationStoryScribeDetails[] a(final int n) {
        return new RichNotificationStoryScribeDetails[n];
    }
}
