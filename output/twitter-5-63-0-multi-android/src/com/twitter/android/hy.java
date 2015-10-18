// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class hy implements Parcelable$Creator
{
    public FollowFlowController a(final Parcel parcel) {
        return new FollowFlowController(parcel, null);
    }
    
    public FollowFlowController[] a(final int n) {
        return new FollowFlowController[n];
    }
}
