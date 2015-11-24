// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class w implements Parcelable$Creator
{
    public TwitterTypeAhead a(final Parcel parcel) {
        return new TwitterTypeAhead(parcel);
    }
    
    public TwitterTypeAhead[] a(final int n) {
        return new TwitterTypeAhead[n];
    }
}
