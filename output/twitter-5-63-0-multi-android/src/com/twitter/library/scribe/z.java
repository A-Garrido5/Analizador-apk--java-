// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class z implements Parcelable$Creator
{
    public WebsiteAssetsLog$WebsiteAsset a(final Parcel parcel) {
        return new WebsiteAssetsLog$WebsiteAsset(parcel);
    }
    
    public WebsiteAssetsLog$WebsiteAsset[] a(final int n) {
        return new WebsiteAssetsLog$WebsiteAsset[n];
    }
}
