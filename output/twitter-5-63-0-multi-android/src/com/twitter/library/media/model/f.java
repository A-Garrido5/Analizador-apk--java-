// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class f implements Parcelable$Creator
{
    public EditableVideo a(final Parcel parcel) {
        return new EditableVideo(parcel);
    }
    
    public EditableVideo[] a(final int n) {
        return new EditableVideo[n];
    }
}
