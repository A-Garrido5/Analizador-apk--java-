// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class g implements Parcelable$Creator
{
    public ImageFile a(final Parcel parcel) {
        return new ImageFile(parcel);
    }
    
    public ImageFile[] a(final int n) {
        return new ImageFile[n];
    }
}
