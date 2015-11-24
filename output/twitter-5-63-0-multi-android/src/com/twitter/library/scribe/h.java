// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class h implements Parcelable$Creator
{
    public ScribeSectionImportedVideo a(final Parcel parcel) {
        return new ScribeSectionImportedVideo(parcel);
    }
    
    public ScribeSectionImportedVideo[] a(final int n) {
        return new ScribeSectionImportedVideo[n];
    }
}
