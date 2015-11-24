// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class b implements Parcelable$Creator
{
    public EditableAnimatedGif a(final Parcel parcel) {
        return new EditableAnimatedGif(parcel);
    }
    
    public EditableAnimatedGif[] a(final int n) {
        return new EditableAnimatedGif[n];
    }
}
