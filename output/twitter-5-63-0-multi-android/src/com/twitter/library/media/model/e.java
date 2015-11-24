// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class e implements Parcelable$Creator
{
    public EditableSegmentedVideo a(final Parcel parcel) {
        return new EditableSegmentedVideo(parcel);
    }
    
    public EditableSegmentedVideo[] a(final int n) {
        return new EditableSegmentedVideo[n];
    }
}
