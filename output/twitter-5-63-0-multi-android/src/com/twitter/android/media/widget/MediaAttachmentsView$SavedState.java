// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.os.Parcelable;
import android.os.Parcel;
import com.twitter.library.media.model.EditableImage;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class MediaAttachmentsView$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public EditableImage a;
    
    static {
        CREATOR = (Parcelable$Creator)new ai();
    }
    
    MediaAttachmentsView$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = (EditableImage)parcel.readParcelable(EditableImage.class.getClassLoader());
    }
    
    MediaAttachmentsView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeParcelable((Parcelable)this.a, n);
    }
}
