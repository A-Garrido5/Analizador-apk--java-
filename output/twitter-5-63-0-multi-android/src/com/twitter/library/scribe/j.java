// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class j implements Parcelable$Creator
{
    public ScribeSectionSegmentedVideo a(final Parcel parcel) {
        return new ScribeSectionSegmentedVideo(parcel);
    }
    
    public ScribeSectionSegmentedVideo[] a(final int n) {
        return new ScribeSectionSegmentedVideo[n];
    }
}
