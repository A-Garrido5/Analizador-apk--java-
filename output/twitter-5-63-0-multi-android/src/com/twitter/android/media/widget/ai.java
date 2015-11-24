// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class ai implements Parcelable$Creator
{
    public MediaAttachmentsView$SavedState a(final Parcel parcel) {
        return new MediaAttachmentsView$SavedState(parcel);
    }
    
    public MediaAttachmentsView$SavedState[] a(final int n) {
        return new MediaAttachmentsView$SavedState[n];
    }
}
