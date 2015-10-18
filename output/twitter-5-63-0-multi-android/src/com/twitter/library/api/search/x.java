// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class x implements Parcelable$Creator
{
    public TwitterTypeAheadGroup a(final Parcel parcel) {
        return new TwitterTypeAheadGroup(parcel);
    }
    
    public TwitterTypeAheadGroup[] a(final int n) {
        return new TwitterTypeAheadGroup[n];
    }
}
