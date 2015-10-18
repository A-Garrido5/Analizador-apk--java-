// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class fh implements Parcelable$Creator
{
    public TopicView$TopicData a(final Parcel parcel) {
        return new TopicView$TopicData(parcel);
    }
    
    public TopicView$TopicData[] a(final int n) {
        return new TopicView$TopicData[n];
    }
}
