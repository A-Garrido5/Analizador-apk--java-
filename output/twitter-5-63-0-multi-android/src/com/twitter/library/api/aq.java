// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class aq implements Parcelable$Creator
{
    public ReferralCampaign a(final Parcel parcel) {
        return new ReferralCampaign(parcel);
    }
    
    public ReferralCampaign[] a(final int n) {
        return new ReferralCampaign[n];
    }
}
