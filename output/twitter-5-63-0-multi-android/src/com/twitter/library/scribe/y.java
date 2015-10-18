// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class y implements Parcelable$Creator
{
    public WebsiteAssetsLog a(final Parcel parcel) {
        return new WebsiteAssetsLog(parcel);
    }
    
    public WebsiteAssetsLog[] a(final int n) {
        return new WebsiteAssetsLog[n];
    }
}
