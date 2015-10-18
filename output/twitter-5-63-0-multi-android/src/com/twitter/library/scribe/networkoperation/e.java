// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class e implements Parcelable$Creator
{
    public MediaUploadDetails a(final Parcel parcel) {
        return new MediaUploadDetails(parcel);
    }
    
    public MediaUploadDetails[] a(final int n) {
        return new MediaUploadDetails[n];
    }
}
