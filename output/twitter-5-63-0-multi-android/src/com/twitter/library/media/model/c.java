// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class c implements Parcelable$Creator
{
    public EditableImage a(final Parcel parcel) {
        return new EditableImage(parcel);
    }
    
    public EditableImage[] a(final int n) {
        return new EditableImage[n];
    }
}
